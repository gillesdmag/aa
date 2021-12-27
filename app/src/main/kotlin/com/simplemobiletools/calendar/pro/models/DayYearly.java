package com.simplemobiletools.calendar.pro.models;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/DayYearly;", "", "eventColors", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "(Ljava/util/HashSet;)V", "getEventColors", "()Ljava/util/HashSet;", "setEventColors", "addColor", "", "color", "component1", "copy", "equals", "other", "hashCode", "toString", "", "calendar_debug"}
)
public final class DayYearly {
    @NotNull
    private HashSet eventColors;

    public final boolean addColor(int color) {
        return this.eventColors.add(color);
    }

    @NotNull
    public final HashSet getEventColors() {
        return this.eventColors;
    }

    public final void setEventColors(@NotNull HashSet var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.eventColors = var1;
    }

    public DayYearly(@NotNull HashSet eventColors) {
        Intrinsics.checkNotNullParameter(eventColors, "eventColors");
        super();
        this.eventColors = eventColors;
    }

    // $FF: synthetic method
    public DayYearly(HashSet var1, int var2, DefaultConstructorMarker var3) {
        if ((var2 & 1) != 0) {
            var1 = new HashSet();
        }

        this(var1);
    }

    public DayYearly() {
        this((HashSet)null, 1, (DefaultConstructorMarker)null);
    }

    @NotNull
    public final HashSet component1() {
        return this.eventColors;
    }

    @NotNull
    public final DayYearly copy(@NotNull HashSet eventColors) {
        Intrinsics.checkNotNullParameter(eventColors, "eventColors");
        return new DayYearly(eventColors);
    }

    // $FF: synthetic method
    public static DayYearly copy$default(DayYearly var0, HashSet var1, int var2, Object var3) {
        if ((var2 & 1) != 0) {
            var1 = var0.eventColors;
        }

        return var0.copy(var1);
    }

    @NotNull
    public String toString() {
        return "DayYearly(eventColors=" + this.eventColors + ")";
    }

    public int hashCode() {
        HashSet var10000 = this.eventColors;
        return var10000 != null ? var10000.hashCode() : 0;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof DayYearly) {
                DayYearly var2 = (DayYearly)var1;
                if (Intrinsics.areEqual(this.eventColors, var2.eventColors)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
