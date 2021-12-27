package com.simplemobiletools.calendar.pro.helpers;

import android.content.Context;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.interfaces.WeeklyCalendar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/WeeklyCalendarImpl;", "", "callback", "Lcom/simplemobiletools/calendar/pro/interfaces/WeeklyCalendar;", "context", "Landroid/content/Context;", "(Lcom/simplemobiletools/calendar/pro/interfaces/WeeklyCalendar;Landroid/content/Context;)V", "getCallback", "()Lcom/simplemobiletools/calendar/pro/interfaces/WeeklyCalendar;", "getContext", "()Landroid/content/Context;", "mEvents", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/Event;", "getMEvents", "()Ljava/util/ArrayList;", "setMEvents", "(Ljava/util/ArrayList;)V", "updateWeeklyCalendar", "", "weekStartTS", "", "Simple-Calendar.app"}
)
public final class WeeklyCalendarImpl {
    @NotNull
    private ArrayList mEvents;
    @NotNull
    private final WeeklyCalendar callback;
    @NotNull
    private final Context context;

    @NotNull
    public final ArrayList getMEvents() {
        return this.mEvents;
    }

    public final void setMEvents(@NotNull ArrayList var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.mEvents = var1;
    }

    public final void updateWeeklyCalendar(long weekStartTS) {
        long endTS = weekStartTS + (long)1209600;
        EventsHelper.getEvents$default(ContextKt.getEventsHelper(this.context), weekStartTS - (long)86400, endTS, 0L, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WeeklyCalendarImpl.this.setMEvents(it);
                WeeklyCalendarImpl.this.getCallback().updateWeeklyCalendar(it);
            }
        }), 12, (Object)null);
    }

    @NotNull
    public final WeeklyCalendar getCallback() {
        return this.callback;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public WeeklyCalendarImpl(@NotNull WeeklyCalendar callback, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(context, "context");
        super();
        this.callback = callback;
        this.context = context;
        this.mEvents = new ArrayList();
    }
}
