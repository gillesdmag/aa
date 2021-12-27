package com.simplemobiletools.calendar.pro.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0017R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/MonthViewEvent;", "", "id", "", "title", "", "startTS", "endTS", "color", "", "startDayIndex", "daysCnt", "originalStartDayIndex", "isAllDay", "", "isPastEvent", "(JLjava/lang/String;JJIIIIZZ)V", "getColor", "()I", "getDaysCnt", "getEndTS", "()J", "getId", "()Z", "getOriginalStartDayIndex", "getStartDayIndex", "getStartTS", "getTitle", "()Ljava/lang/String;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "calendar_debug"}
)
public final class MonthViewEvent {
    private final long id;
    @NotNull
    private final String title;
    private final long startTS;
    private final long endTS;
    private final int color;
    private final int startDayIndex;
    private final int daysCnt;
    private final int originalStartDayIndex;
    private final boolean isAllDay;
    private final boolean isPastEvent;

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getStartTS() {
        return this.startTS;
    }

    public final long getEndTS() {
        return this.endTS;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getStartDayIndex() {
        return this.startDayIndex;
    }

    public final int getDaysCnt() {
        return this.daysCnt;
    }

    public final int getOriginalStartDayIndex() {
        return this.originalStartDayIndex;
    }

    public final boolean isAllDay() {
        return this.isAllDay;
    }

    public final boolean isPastEvent() {
        return this.isPastEvent;
    }

    public MonthViewEvent(long id, @NotNull String title, long startTS, long endTS, int color, int startDayIndex, int daysCnt, int originalStartDayIndex, boolean isAllDay, boolean isPastEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        super();
        this.id = id;
        this.title = title;
        this.startTS = startTS;
        this.endTS = endTS;
        this.color = color;
        this.startDayIndex = startDayIndex;
        this.daysCnt = daysCnt;
        this.originalStartDayIndex = originalStartDayIndex;
        this.isAllDay = isAllDay;
        this.isPastEvent = isPastEvent;
    }

    public final long component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.startTS;
    }

    public final long component4() {
        return this.endTS;
    }

    public final int component5() {
        return this.color;
    }

    public final int component6() {
        return this.startDayIndex;
    }

    public final int component7() {
        return this.daysCnt;
    }

    public final int component8() {
        return this.originalStartDayIndex;
    }

    public final boolean component9() {
        return this.isAllDay;
    }

    public final boolean component10() {
        return this.isPastEvent;
    }

    @NotNull
    public final MonthViewEvent copy(long id, @NotNull String title, long startTS, long endTS, int color, int startDayIndex, int daysCnt, int originalStartDayIndex, boolean isAllDay, boolean isPastEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new MonthViewEvent(id, title, startTS, endTS, color, startDayIndex, daysCnt, originalStartDayIndex, isAllDay, isPastEvent);
    }

    // $FF: synthetic method
    public static MonthViewEvent copy$default(MonthViewEvent var0, long var1, String var3, long var4, long var6, int var8, int var9, int var10, int var11, boolean var12, boolean var13, int var14, Object var15) {
        if ((var14 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var14 & 2) != 0) {
            var3 = var0.title;
        }

        if ((var14 & 4) != 0) {
            var4 = var0.startTS;
        }

        if ((var14 & 8) != 0) {
            var6 = var0.endTS;
        }

        if ((var14 & 16) != 0) {
            var8 = var0.color;
        }

        if ((var14 & 32) != 0) {
            var9 = var0.startDayIndex;
        }

        if ((var14 & 64) != 0) {
            var10 = var0.daysCnt;
        }

        if ((var14 & 128) != 0) {
            var11 = var0.originalStartDayIndex;
        }

        if ((var14 & 256) != 0) {
            var12 = var0.isAllDay;
        }

        if ((var14 & 512) != 0) {
            var13 = var0.isPastEvent;
        }

        return var0.copy(var1, var3, var4, var6, var8, var9, var10, var11, var12, var13);
    }

    @NotNull
    public String toString() {
        return "MonthViewEvent(id=" + this.id + ", title=" + this.title + ", startTS=" + this.startTS + ", endTS=" + this.endTS + ", color=" + this.color + ", startDayIndex=" + this.startDayIndex + ", daysCnt=" + this.daysCnt + ", originalStartDayIndex=" + this.originalStartDayIndex + ", isAllDay=" + this.isAllDay + ", isPastEvent=" + this.isPastEvent + ")";
    }

    public int hashCode() {
        int var10000 = Long.hashCode(this.id) * 31;
        String var10001 = this.title;
        var10000 = (((((((var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Long.hashCode(this.startTS)) * 31 + Long.hashCode(this.endTS)) * 31 + Integer.hashCode(this.color)) * 31 + Integer.hashCode(this.startDayIndex)) * 31 + Integer.hashCode(this.daysCnt)) * 31 + Integer.hashCode(this.originalStartDayIndex)) * 31;
        byte var1 = this.isAllDay;
        if (var1 != 0) {
            var1 = 1;
        }

        var10000 = (var10000 + var1) * 31;
        var1 = this.isPastEvent;
        if (var1 != 0) {
            var1 = 1;
        }

        return var10000 + var1;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof MonthViewEvent) {
                MonthViewEvent var2 = (MonthViewEvent)var1;
                if (this.id == var2.id && Intrinsics.areEqual(this.title, var2.title) && this.startTS == var2.startTS && this.endTS == var2.endTS && this.color == var2.color && this.startDayIndex == var2.startDayIndex && this.daysCnt == var2.daysCnt && this.originalStartDayIndex == var2.originalStartDayIndex && this.isAllDay == var2.isAllDay && this.isPastEvent == var2.isPastEvent) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
