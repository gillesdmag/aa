package com.simplemobiletools.calendar.pro.models;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0019\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u0006-"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/DayMonthly;", "", "value", "", "isThisMonth", "", "isToday", "code", "", "weekOfYear", "dayEvents", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/Event;", "Lkotlin/collections/ArrayList;", "indexOnMonthView", "isWeekend", "(IZZLjava/lang/String;ILjava/util/ArrayList;IZ)V", "getCode", "()Ljava/lang/String;", "getDayEvents", "()Ljava/util/ArrayList;", "setDayEvents", "(Ljava/util/ArrayList;)V", "getIndexOnMonthView", "()I", "setIndexOnMonthView", "(I)V", "()Z", "setWeekend", "(Z)V", "getValue", "getWeekOfYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "calendar_debug"}
)
public final class DayMonthly {
    private final int value;
    private final boolean isThisMonth;
    private final boolean isToday;
    @NotNull
    private final String code;
    private final int weekOfYear;
    @NotNull
    private ArrayList dayEvents;
    private int indexOnMonthView;
    private boolean isWeekend;

    public final int getValue() {
        return this.value;
    }

    public final boolean isThisMonth() {
        return this.isThisMonth;
    }

    public final boolean isToday() {
        return this.isToday;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getWeekOfYear() {
        return this.weekOfYear;
    }

    @NotNull
    public final ArrayList getDayEvents() {
        return this.dayEvents;
    }

    public final void setDayEvents(@NotNull ArrayList var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.dayEvents = var1;
    }

    public final int getIndexOnMonthView() {
        return this.indexOnMonthView;
    }

    public final void setIndexOnMonthView(int var1) {
        this.indexOnMonthView = var1;
    }

    public final boolean isWeekend() {
        return this.isWeekend;
    }

    public final void setWeekend(boolean var1) {
        this.isWeekend = var1;
    }

    public DayMonthly(int value, boolean isThisMonth, boolean isToday, @NotNull String code, int weekOfYear, @NotNull ArrayList dayEvents, int indexOnMonthView, boolean isWeekend) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(dayEvents, "dayEvents");
        super();
        this.value = value;
        this.isThisMonth = isThisMonth;
        this.isToday = isToday;
        this.code = code;
        this.weekOfYear = weekOfYear;
        this.dayEvents = dayEvents;
        this.indexOnMonthView = indexOnMonthView;
        this.isWeekend = isWeekend;
    }

    public final int component1() {
        return this.value;
    }

    public final boolean component2() {
        return this.isThisMonth;
    }

    public final boolean component3() {
        return this.isToday;
    }

    @NotNull
    public final String component4() {
        return this.code;
    }

    public final int component5() {
        return this.weekOfYear;
    }

    @NotNull
    public final ArrayList component6() {
        return this.dayEvents;
    }

    public final int component7() {
        return this.indexOnMonthView;
    }

    public final boolean component8() {
        return this.isWeekend;
    }

    @NotNull
    public final DayMonthly copy(int value, boolean isThisMonth, boolean isToday, @NotNull String code, int weekOfYear, @NotNull ArrayList dayEvents, int indexOnMonthView, boolean isWeekend) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(dayEvents, "dayEvents");
        return new DayMonthly(value, isThisMonth, isToday, code, weekOfYear, dayEvents, indexOnMonthView, isWeekend);
    }

    // $FF: synthetic method
    public static DayMonthly copy$default(DayMonthly var0, int var1, boolean var2, boolean var3, String var4, int var5, ArrayList var6, int var7, boolean var8, int var9, Object var10) {
        if ((var9 & 1) != 0) {
            var1 = var0.value;
        }

        if ((var9 & 2) != 0) {
            var2 = var0.isThisMonth;
        }

        if ((var9 & 4) != 0) {
            var3 = var0.isToday;
        }

        if ((var9 & 8) != 0) {
            var4 = var0.code;
        }

        if ((var9 & 16) != 0) {
            var5 = var0.weekOfYear;
        }

        if ((var9 & 32) != 0) {
            var6 = var0.dayEvents;
        }

        if ((var9 & 64) != 0) {
            var7 = var0.indexOnMonthView;
        }

        if ((var9 & 128) != 0) {
            var8 = var0.isWeekend;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7, var8);
    }

    @NotNull
    public String toString() {
        return "DayMonthly(value=" + this.value + ", isThisMonth=" + this.isThisMonth + ", isToday=" + this.isToday + ", code=" + this.code + ", weekOfYear=" + this.weekOfYear + ", dayEvents=" + this.dayEvents + ", indexOnMonthView=" + this.indexOnMonthView + ", isWeekend=" + this.isWeekend + ")";
    }

    public int hashCode() {
        int var10000 = Integer.hashCode(this.value) * 31;
        byte var10001 = this.isThisMonth;
        if (var10001 != 0) {
            var10001 = 1;
        }

        var10000 = (var10000 + var10001) * 31;
        var10001 = this.isToday;
        if (var10001 != 0) {
            var10001 = 1;
        }

        var10000 = (var10000 + var10001) * 31;
        String var1 = this.code;
        var10000 = ((var10000 + (var1 != null ? var1.hashCode() : 0)) * 31 + Integer.hashCode(this.weekOfYear)) * 31;
        ArrayList var2 = this.dayEvents;
        var10000 = ((var10000 + (var2 != null ? var2.hashCode() : 0)) * 31 + Integer.hashCode(this.indexOnMonthView)) * 31;
        var10001 = this.isWeekend;
        if (var10001 != 0) {
            var10001 = 1;
        }

        return var10000 + var10001;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof DayMonthly) {
                DayMonthly var2 = (DayMonthly)var1;
                if (this.value == var2.value && this.isThisMonth == var2.isThisMonth && this.isToday == var2.isToday && Intrinsics.areEqual(this.code, var2.code) && this.weekOfYear == var2.weekOfYear && Intrinsics.areEqual(this.dayEvents, var2.dayEvents) && this.indexOnMonthView == var2.indexOnMonthView && this.isWeekend == var2.isWeekend) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
