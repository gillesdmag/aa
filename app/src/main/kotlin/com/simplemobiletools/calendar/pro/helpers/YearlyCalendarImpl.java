package com.simplemobiletools.calendar.pro.helpers;

import android.content.Context;
import android.util.SparseArray;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
import com.simplemobiletools.calendar.pro.interfaces.YearlyCalendar;
import com.simplemobiletools.calendar.pro.models.DayYearly;
import com.simplemobiletools.calendar.pro.models.Event;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J,\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/YearlyCalendarImpl;", "", "callback", "Lcom/simplemobiletools/calendar/pro/interfaces/YearlyCalendar;", "context", "Landroid/content/Context;", "year", "", "(Lcom/simplemobiletools/calendar/pro/interfaces/YearlyCalendar;Landroid/content/Context;I)V", "getCallback", "()Lcom/simplemobiletools/calendar/pro/interfaces/YearlyCalendar;", "getContext", "()Landroid/content/Context;", "getYear", "()I", "getEvents", "", "gotEvents", "events", "", "Lcom/simplemobiletools/calendar/pro/models/Event;", "markDay", "arr", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/DayYearly;", "dateTime", "Lorg/joda/time/DateTime;", "event", "Simple-Calendar.app"}
)
public final class YearlyCalendarImpl {
    @NotNull
    private final YearlyCalendar callback;
    @NotNull
    private final Context context;
    private final int year;

    public final void getEvents(int year) {
        DateTime startDateTime = (new DateTime()).withTime(0, 0, 0, 0).withDate(year, 1, 1);
        Intrinsics.checkNotNullExpressionValue(startDateTime, "startDateTime");
        long startTS = DateTimeKt.seconds(startDateTime);
        DateTime var10000 = startDateTime.plusYears(1).minusSeconds(1);
        Intrinsics.checkNotNullExpressionValue(var10000, "startDateTime.plusYears(1).minusSeconds(1)");
        long endTS = DateTimeKt.seconds(var10000);
        EventsHelper.getEvents$default(ContextKt.getEventsHelper(this.context), startTS, endTS, 0L, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                YearlyCalendarImpl.this.gotEvents((List)it);
            }
        }), 12, (Object)null);
    }

    private final void gotEvents(List events) {
        SparseArray arr = new SparseArray(12);
        Iterable $this$forEach$iv = (Iterable)events;
        int $i$f$forEach = false;
        Iterator var5 = $this$forEach$iv.iterator();

        while(var5.hasNext()) {
            Object element$iv = var5.next();
            Event it = (Event)element$iv;
            int var8 = false;
            DateTime startDateTime = Formatter.INSTANCE.getDateTimeFromTS(it.getStartTS());
            this.markDay(arr, startDateTime, it);
            String startCode = Formatter.INSTANCE.getDayCodeFromDateTime(startDateTime);
            DateTime endDateTime = Formatter.INSTANCE.getDateTimeFromTS(it.getEndTS());
            String endCode = Formatter.INSTANCE.getDayCodeFromDateTime(endDateTime);
            if (Intrinsics.areEqual(startCode, endCode) ^ true) {
                DateTime currDateTime = startDateTime;

                while(Intrinsics.areEqual(Formatter.INSTANCE.getDayCodeFromDateTime(currDateTime), endCode) ^ true) {
                    DateTime var10000 = currDateTime.plusDays(1);
                    Intrinsics.checkNotNullExpressionValue(var10000, "currDateTime.plusDays(1)");
                    currDateTime = var10000;
                    this.markDay(arr, currDateTime, it);
                }
            }
        }

        this.callback.updateYearlyCalendar(arr, events.hashCode());
    }

    private final void markDay(SparseArray arr, DateTime dateTime, Event event) {
        int month = dateTime.getMonthOfYear();
        int day = dateTime.getDayOfMonth();
        if (arr.get(month) == null) {
            arr.put(month, new ArrayList());
            int var6 = 1;

            for(byte var7 = 32; var6 <= var7; ++var6) {
                ((ArrayList)arr.get(month)).add(new DayYearly((HashSet)null, 1, (DefaultConstructorMarker)null));
            }
        }

        if (dateTime.getYear() == this.year) {
            ((DayYearly)((ArrayList)arr.get(month)).get(day)).addColor(event.getColor());
        }

    }

    @NotNull
    public final YearlyCalendar getCallback() {
        return this.callback;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final int getYear() {
        return this.year;
    }

    public YearlyCalendarImpl(@NotNull YearlyCalendar callback, @NotNull Context context, int year) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(context, "context");
        super();
        this.callback = callback;
        this.context = context;
        this.year = year;
    }
}
