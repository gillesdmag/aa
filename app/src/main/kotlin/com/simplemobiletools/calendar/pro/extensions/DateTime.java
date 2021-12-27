package com.simplemobiletools.calendar.pro.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 2,
    d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"},
    d2 = {"seconds", "", "Lorg/joda/time/DateTime;", "calendar_debug"}
)
public final class DateTimeKt {
    public static final long seconds(@NotNull DateTime $this$seconds) {
        Intrinsics.checkNotNullParameter($this$seconds, "$this$seconds");
        return $this$seconds.getMillis() / 1000L;
    }
}
