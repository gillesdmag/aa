package com.simplemobiletools.calendar.pro.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/EventRepetition;", "", "repeatInterval", "", "repeatRule", "repeatLimit", "", "(IIJ)V", "getRepeatInterval", "()I", "getRepeatLimit", "()J", "getRepeatRule", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar_debug"}
)
public final class EventRepetition {
    private final int repeatInterval;
    private final int repeatRule;
    private final long repeatLimit;

    public final int getRepeatInterval() {
        return this.repeatInterval;
    }

    public final int getRepeatRule() {
        return this.repeatRule;
    }

    public final long getRepeatLimit() {
        return this.repeatLimit;
    }

    public EventRepetition(int repeatInterval, int repeatRule, long repeatLimit) {
        this.repeatInterval = repeatInterval;
        this.repeatRule = repeatRule;
        this.repeatLimit = repeatLimit;
    }

    public final int component1() {
        return this.repeatInterval;
    }

    public final int component2() {
        return this.repeatRule;
    }

    public final long component3() {
        return this.repeatLimit;
    }

    @NotNull
    public final EventRepetition copy(int repeatInterval, int repeatRule, long repeatLimit) {
        return new EventRepetition(repeatInterval, repeatRule, repeatLimit);
    }

    // $FF: synthetic method
    public static EventRepetition copy$default(EventRepetition var0, int var1, int var2, long var3, int var5, Object var6) {
        if ((var5 & 1) != 0) {
            var1 = var0.repeatInterval;
        }

        if ((var5 & 2) != 0) {
            var2 = var0.repeatRule;
        }

        if ((var5 & 4) != 0) {
            var3 = var0.repeatLimit;
        }

        return var0.copy(var1, var2, var3);
    }

    @NotNull
    public String toString() {
        return "EventRepetition(repeatInterval=" + this.repeatInterval + ", repeatRule=" + this.repeatRule + ", repeatLimit=" + this.repeatLimit + ")";
    }

    public int hashCode() {
        return (Integer.hashCode(this.repeatInterval) * 31 + Integer.hashCode(this.repeatRule)) * 31 + Long.hashCode(this.repeatLimit);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof EventRepetition) {
                EventRepetition var2 = (EventRepetition)var1;
                if (this.repeatInterval == var2.repeatInterval && this.repeatRule == var2.repeatRule && this.repeatLimit == var2.repeatLimit) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
