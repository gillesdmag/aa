package com.simplemobiletools.calendar.pro.interfaces;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/interfaces/MonthlyCalendar;", "", "updateMonthlyCalendar", "", "context", "Landroid/content/Context;", "month", "", "days", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/DayMonthly;", "Lkotlin/collections/ArrayList;", "checkedEvents", "", "currTargetDate", "Lorg/joda/time/DateTime;", "calendar_debug"}
)
public interface MonthlyCalendar {
    void updateMonthlyCalendar(@NotNull Context var1, @NotNull String var2, @NotNull ArrayList var3, boolean var4, @NotNull DateTime var5);
}
