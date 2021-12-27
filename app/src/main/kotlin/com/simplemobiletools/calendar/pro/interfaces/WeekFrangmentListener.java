package com.simplemobiletools.calendar.pro.interfaces;

import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/interfaces/WeekFragmentListener;", "", "getCurrScrollY", "", "getFullFragmentHeight", "scrollTo", "", "y", "updateHoursTopMargin", "margin", "updateRowHeight", "rowHeight", "calendar_debug"}
)
public interface WeekFragmentListener {
    void scrollTo(int var1);

    void updateHoursTopMargin(int var1);

    int getCurrScrollY();

    void updateRowHeight(int var1);

    int getFullFragmentHeight();
}
