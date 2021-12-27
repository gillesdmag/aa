package com.simplemobiletools.calendar.pro.models;

import android.util.Range;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/EventWeeklyView;", "", "id", "", "range", "Landroid/util/Range;", "", "(JLandroid/util/Range;)V", "getId", "()J", "getRange", "()Landroid/util/Range;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar_debug"}
)
public final class EventWeeklyView {
    private final long id;
    @NotNull
    private final Range range;

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final Range getRange() {
        return this.range;
    }

    public EventWeeklyView(long id, @NotNull Range range) {
        Intrinsics.checkNotNullParameter(range, "range");
        super();
        this.id = id;
        this.range = range;
    }

    public final long component1() {
        return this.id;
    }

    @NotNull
    public final Range component2() {
        return this.range;
    }

    @NotNull
    public final EventWeeklyView copy(long id, @NotNull Range range) {
        Intrinsics.checkNotNullParameter(range, "range");
        return new EventWeeklyView(id, range);
    }

    // $FF: synthetic method
    public static EventWeeklyView copy$default(EventWeeklyView var0, long var1, Range var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var4 & 2) != 0) {
            var3 = var0.range;
        }

        return var0.copy(var1, var3);
    }

    @NotNull
    public String toString() {
        return "EventWeeklyView(id=" + this.id + ", range=" + this.range + ")";
    }

    public int hashCode() {
        int var10000 = Long.hashCode(this.id) * 31;
        Range var10001 = this.range;
        return var10000 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof EventWeeklyView) {
                EventWeeklyView var2 = (EventWeeklyView)var1;
                if (this.id == var2.id && Intrinsics.areEqual(this.range, var2.range)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
