package com.simplemobiletools.calendar.pro.extensions;

import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.calendar.pro.models.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 2,
    d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"},
    d2 = {"isTsOnProperDay", "", "Lcom/simplemobiletools/calendar/pro/extensions/Long;", "event", "Lcom/simplemobiletools/calendar/pro/models/Event;", "calendar_debug"}
)
public final class LongKt {
    public static final boolean isTsOnProperDay(@NotNull Long $this$isTsOnProperDay, @NotNull Event event) {
        Intrinsics.checkNotNullParameter($this$isTsOnProperDay, "$this$isTsOnProperDay");
        Intrinsics.checkNotNullParameter(event, "event");
        DateTime dateTime = Formatter.INSTANCE.getDateTimeFromTS(((Number)$this$isTsOnProperDay).longValue());
        int power = (int)Math.pow(2.0D, (double)(dateTime.getDayOfWeek() - 1));
        return (event.getRepeatRule() & power) != 0;
    }
}
