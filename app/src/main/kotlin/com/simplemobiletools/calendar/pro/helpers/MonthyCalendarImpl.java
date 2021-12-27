package com.simplemobiletools.calendar.pro.helpers;

import android.content.Context;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
import com.simplemobiletools.calendar.pro.interfaces.MonthlyCalendar;
import com.simplemobiletools.calendar.pro.models.DayMonthly;
import com.simplemobiletools.calendar.pro.models.Event;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTime.Property;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0014J \u0010#\u001a\u00020\u001e2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0002J\u0018\u0010%\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\bH\u0002J \u0010\u001f\u001a\u00020\u001e2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020(0\u0010j\b\u0012\u0004\u0012\u00020(`\u0012H\u0002J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/MonthlyCalendarImpl;", "", "callback", "Lcom/simplemobiletools/calendar/pro/interfaces/MonthlyCalendar;", "context", "Landroid/content/Context;", "(Lcom/simplemobiletools/calendar/pro/interfaces/MonthlyCalendar;Landroid/content/Context;)V", "DAYS_CNT", "", "YEAR_PATTERN", "", "getCallback", "()Lcom/simplemobiletools/calendar/pro/interfaces/MonthlyCalendar;", "getContext", "()Landroid/content/Context;", "mEvents", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/Event;", "Lkotlin/collections/ArrayList;", "mTargetDate", "Lorg/joda/time/DateTime;", "getMTargetDate", "()Lorg/joda/time/DateTime;", "setMTargetDate", "(Lorg/joda/time/DateTime;)V", "mToday", "monthName", "getMonthName", "()Ljava/lang/String;", "getDays", "", "markDaysWithEvents", "", "getMonth", "targetDate", "gotEvents", "events", "isToday", "curDayInMonth", "days", "Lcom/simplemobiletools/calendar/pro/models/DayMonthly;", "updateMonthlyCalendar", "Simple-Calendar.app"}
)
public final class MonthlyCalendarImpl {
    private final int DAYS_CNT;
    private final String YEAR_PATTERN;
    private final String mToday;
    private ArrayList mEvents;
    public DateTime mTargetDate;
    @NotNull
    private final MonthlyCalendar callback;
    @NotNull
    private final Context context;

    @NotNull
    public final DateTime getMTargetDate() {
        DateTime var10000 = this.mTargetDate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        return var10000;
    }

    public final void setMTargetDate(@NotNull DateTime var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.mTargetDate = var1;
    }

    public final void updateMonthlyCalendar(@NotNull DateTime targetDate) {
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        this.mTargetDate = targetDate;
        DateTime var10000 = this.mTargetDate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        var10000 = var10000.minusDays(7);
        Intrinsics.checkNotNullExpressionValue(var10000, "mTargetDate.minusDays(7)");
        long startTS = DateTimeKt.seconds(var10000);
        var10000 = this.mTargetDate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        var10000 = var10000.plusDays(43);
        Intrinsics.checkNotNullExpressionValue(var10000, "mTargetDate.plusDays(43)");
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
                MonthlyCalendarImpl.this.gotEvents(it);
            }
        }), 12, (Object)null);
    }

    public final void getMonth(@NotNull DateTime targetDate) {
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        this.updateMonthlyCalendar(targetDate);
    }

    public final void getDays(boolean markDaysWithEvents) {
        ArrayList days = new ArrayList(this.DAYS_CNT);
        DateTime var10000 = this.mTargetDate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        Property var16 = var10000.dayOfMonth();
        Intrinsics.checkNotNullExpressionValue(var16, "mTargetDate.dayOfMonth()");
        int currMonthDays = var16.getMaximumValue();
        var10000 = this.mTargetDate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        var10000 = var10000.withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(var10000, "mTargetDate.withDayOfMonth(1)");
        int firstDayIndex = var10000.getDayOfWeek();
        boolean isSundayFirst = ContextKt.getConfig(this.context).isSundayFirst();
        if (!isSundayFirst) {
            --firstDayIndex;
        }

        var10000 = this.mTargetDate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        var16 = var10000.minusMonths(1).dayOfMonth();
        Intrinsics.checkNotNullExpressionValue(var16, "mTargetDate.minusMonths(1).dayOfMonth()");
        int prevMonthDays = var16.getMaximumValue();
        boolean isThisMonth = false;
        boolean isToday = false;
        int value = prevMonthDays - firstDayIndex + 1;
        var10000 = this.mTargetDate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        DateTime curDay = var10000;
        int i = 0;

        for(int var12 = this.DAYS_CNT; i < var12; ++i) {
            if (i < firstDayIndex) {
                isThisMonth = false;
                var10000 = this.mTargetDate;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
                }

                var10000 = var10000.withDayOfMonth(1).minusMonths(1);
                Intrinsics.checkNotNullExpressionValue(var10000, "mTargetDate.withDayOfMonth(1).minusMonths(1)");
                curDay = var10000;
            } else if (i == firstDayIndex) {
                value = 1;
                isThisMonth = true;
                var10000 = this.mTargetDate;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
                }

                curDay = var10000;
            } else if (value == currMonthDays + 1) {
                value = 1;
                isThisMonth = false;
                var10000 = this.mTargetDate;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
                }

                var10000 = var10000.withDayOfMonth(1).plusMonths(1);
                Intrinsics.checkNotNullExpressionValue(var10000, "mTargetDate.withDayOfMonth(1).plusMonths(1)");
                curDay = var10000;
            }

            isToday = this.isToday(curDay, value);
            DateTime newDay = curDay.withDayOfMonth(value);
            Formatter var17 = Formatter.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(newDay, "newDay");
            String dayCode = var17.getDayCodeFromDateTime(newDay);
            Intrinsics.checkNotNullExpressionValue(dayCode, "dayCode");
            DayMonthly day = new DayMonthly(value, isThisMonth, isToday, dayCode, newDay.getWeekOfWeekyear(), new ArrayList(), i, ConstantsKt.isWeekend(i % 7, isSundayFirst));
            days.add(day);
            ++value;
        }

        if (markDaysWithEvents) {
            this.markDaysWithEvents(days);
        } else {
            MonthlyCalendar var18 = this.callback;
            Context var10001 = this.context;
            String var10002 = this.getMonthName();
            DateTime var10005 = this.mTargetDate;
            if (var10005 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
            }

            var18.updateMonthlyCalendar(var10001, var10002, days, false, var10005);
        }

    }

    private final void markDaysWithEvents(ArrayList days) {
        HashMap dayEvents = new HashMap();
        Iterable $this$forEach$iv = (Iterable)this.mEvents;
        int $i$f$forEach = false;
        Iterator var5 = $this$forEach$iv.iterator();

        Object element$iv;
        boolean var8;
        while(var5.hasNext()) {
            element$iv = var5.next();
            Event it = (Event)element$iv;
            var8 = false;
            DateTime startDateTime = Formatter.INSTANCE.getDateTimeFromTS(it.getStartTS());
            DateTime endDateTime = Formatter.INSTANCE.getDateTimeFromTS(it.getEndTS());
            String endCode = Formatter.INSTANCE.getDayCodeFromDateTime(endDateTime);
            DateTime currDay = startDateTime;
            String dayCode = Formatter.INSTANCE.getDayCodeFromDateTime(startDateTime);
            ArrayList var10000 = (ArrayList)dayEvents.get(dayCode);
            if (var10000 == null) {
                var10000 = new ArrayList();
            }

            ArrayList currDayEvents = var10000;
            currDayEvents.add(it);
            Map var22 = (Map)dayEvents;
            Intrinsics.checkNotNullExpressionValue(dayCode, "dayCode");
            var22.put(dayCode, currDayEvents);

            while(Intrinsics.areEqual(Formatter.INSTANCE.getDayCodeFromDateTime(currDay), endCode) ^ true) {
                DateTime var23 = currDay.plusDays(1);
                Intrinsics.checkNotNullExpressionValue(var23, "currDay.plusDays(1)");
                currDay = var23;
                dayCode = Formatter.INSTANCE.getDayCodeFromDateTime(currDay);
                var10000 = (ArrayList)dayEvents.get(dayCode);
                if (var10000 == null) {
                    var10000 = new ArrayList();
                }

                currDayEvents = var10000;
                currDayEvents.add(it);
                var22 = (Map)dayEvents;
                Intrinsics.checkNotNullExpressionValue(dayCode, "dayCode");
                var22.put(dayCode, currDayEvents);
            }
        }

        $this$forEach$iv = (Iterable)days;
        $i$f$forEach = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var18 = $this$forEach$iv.iterator();

        while(var18.hasNext()) {
            Object element$iv$iv = var18.next();
            DayMonthly it = (DayMonthly)element$iv$iv;
            int var21 = false;
            if (dayEvents.keySet().contains(it.getCode())) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        $this$forEach$iv = (Iterable)((List)destination$iv$iv);
        $i$f$forEach = false;
        var5 = $this$forEach$iv.iterator();

        while(var5.hasNext()) {
            element$iv = var5.next();
            DayMonthly it = (DayMonthly)element$iv;
            var8 = false;
            Object var10001 = dayEvents.get(it.getCode());
            Intrinsics.checkNotNull(var10001);
            it.setDayEvents((ArrayList)var10001);
        }

        MonthlyCalendar var25 = this.callback;
        Context var24 = this.context;
        String var10002 = this.getMonthName();
        DateTime var10005 = this.mTargetDate;
        if (var10005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        var25.updateMonthlyCalendar(var24, var10002, days, true, var10005);
    }

    private final boolean isToday(DateTime targetDate, int curDayInMonth) {
        Property var10000 = targetDate.dayOfMonth();
        Intrinsics.checkNotNullExpressionValue(var10000, "targetDate.dayOfMonth()");
        int targetMonthDays = var10000.getMaximumValue();
        return Intrinsics.areEqual(targetDate.withDayOfMonth(Math.min(curDayInMonth, targetMonthDays)).toString("YYYYMMdd"), this.mToday);
    }

    private final String getMonthName() {
        Formatter var10000 = Formatter.INSTANCE;
        Context var10001 = this.context;
        DateTime var10002 = this.mTargetDate;
        if (var10002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        String month = var10000.getMonthName(var10001, var10002.getMonthOfYear());
        DateTime var3 = this.mTargetDate;
        if (var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTargetDate");
        }

        String targetYear = var3.toString(this.YEAR_PATTERN);
        if (Intrinsics.areEqual(targetYear, (new DateTime()).toString(this.YEAR_PATTERN)) ^ true) {
            month = month + ' ' + targetYear;
        }

        Intrinsics.checkNotNullExpressionValue(month, "month");
        return month;
    }

    private final void gotEvents(ArrayList events) {
        this.mEvents = events;
        this.getDays(true);
    }

    @NotNull
    public final MonthlyCalendar getCallback() {
        return this.callback;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public MonthlyCalendarImpl(@NotNull MonthlyCalendar callback, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(context, "context");
        super();
        this.callback = callback;
        this.context = context;
        this.DAYS_CNT = 42;
        this.YEAR_PATTERN = "YYYY";
        String var10001 = (new DateTime()).toString("YYYYMMdd");
        Intrinsics.checkNotNullExpressionValue(var10001, "DateTime().toString(Formatter.DAYCODE_PATTERN)");
        this.mToday = var10001;
        this.mEvents = new ArrayList();
    }
}
