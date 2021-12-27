package com.simplemobiletools.calendar.pro.interfaces;

import android.util.SparseArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/interfaces/YearlyCalendar;", "", "updateYearlyCalendar", "", "events", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/DayYearly;", "hashCode", "", "calendar_debug"}
)
public interface YearlyCalendar {
    void updateYearlyCalendar(@NotNull SparseArray var1, int var2);
}
