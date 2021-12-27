package com.simplemobiletools.calendar.pro.interfaces;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/interfaces/NavigationListener;", "", "goLeft", "", "goRight", "goToDateTime", "dateTime", "Lorg/joda/time/DateTime;", "calendar_debug"}
)
public interface NavigationListener {
    void goLeft();

    void goRight();

    void goToDateTime(@NotNull DateTime var1);
}
