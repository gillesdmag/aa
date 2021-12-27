package com.simplemobiletools.calendar.pro.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003Jm\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\fHÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001f\"\u0004\b\"\u0010!R\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018¨\u0006:"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/ListEvent;", "Lcom/simplemobiletools/calendar/pro/models/ListItem;", "id", "", "startTS", "endTS", "title", "", "description", "isAllDay", "", "color", "", "location", "isPastEvent", "isRepeatable", "(JJJLjava/lang/String;Ljava/lang/String;ZILjava/lang/String;ZZ)V", "getColor", "()I", "setColor", "(I)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getEndTS", "()J", "setEndTS", "(J)V", "getId", "setId", "()Z", "setAllDay", "(Z)V", "setPastEvent", "setRepeatable", "getLocation", "setLocation", "getStartTS", "setStartTS", "getTitle", "setTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "calendar_debug"}
)
public final class ListEvent extends ListItem {
    private long id;
    private long startTS;
    private long endTS;
    @NotNull
    private String title;
    @NotNull
    private String description;
    private boolean isAllDay;
    private int color;
    @NotNull
    private String location;
    private boolean isPastEvent;
    private boolean isRepeatable;

    public final long getId() {
        return this.id;
    }

    public final void setId(long var1) {
        this.id = var1;
    }

    public final long getStartTS() {
        return this.startTS;
    }

    public final void setStartTS(long var1) {
        this.startTS = var1;
    }

    public final long getEndTS() {
        return this.endTS;
    }

    public final void setEndTS(long var1) {
        this.endTS = var1;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.title = var1;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.description = var1;
    }

    public final boolean isAllDay() {
        return this.isAllDay;
    }

    public final void setAllDay(boolean var1) {
        this.isAllDay = var1;
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int var1) {
        this.color = var1;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    public final void setLocation(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.location = var1;
    }

    public final boolean isPastEvent() {
        return this.isPastEvent;
    }

    public final void setPastEvent(boolean var1) {
        this.isPastEvent = var1;
    }

    public final boolean isRepeatable() {
        return this.isRepeatable;
    }

    public final void setRepeatable(boolean var1) {
        this.isRepeatable = var1;
    }

    public ListEvent(long id, long startTS, long endTS, @NotNull String title, @NotNull String description, boolean isAllDay, int color, @NotNull String location, boolean isPastEvent, boolean isRepeatable) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(location, "location");
        super();
        this.id = id;
        this.startTS = startTS;
        this.endTS = endTS;
        this.title = title;
        this.description = description;
        this.isAllDay = isAllDay;
        this.color = color;
        this.location = location;
        this.isPastEvent = isPastEvent;
        this.isRepeatable = isRepeatable;
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.startTS;
    }

    public final long component3() {
        return this.endTS;
    }

    @NotNull
    public final String component4() {
        return this.title;
    }

    @NotNull
    public final String component5() {
        return this.description;
    }

    public final boolean component6() {
        return this.isAllDay;
    }

    public final int component7() {
        return this.color;
    }

    @NotNull
    public final String component8() {
        return this.location;
    }

    public final boolean component9() {
        return this.isPastEvent;
    }

    public final boolean component10() {
        return this.isRepeatable;
    }

    @NotNull
    public final ListEvent copy(long id, long startTS, long endTS, @NotNull String title, @NotNull String description, boolean isAllDay, int color, @NotNull String location, boolean isPastEvent, boolean isRepeatable) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(location, "location");
        return new ListEvent(id, startTS, endTS, title, description, isAllDay, color, location, isPastEvent, isRepeatable);
    }

    // $FF: synthetic method
    public static ListEvent copy$default(ListEvent var0, long var1, long var3, long var5, String var7, String var8, boolean var9, int var10, String var11, boolean var12, boolean var13, int var14, Object var15) {
        if ((var14 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var14 & 2) != 0) {
            var3 = var0.startTS;
        }

        if ((var14 & 4) != 0) {
            var5 = var0.endTS;
        }

        if ((var14 & 8) != 0) {
            var7 = var0.title;
        }

        if ((var14 & 16) != 0) {
            var8 = var0.description;
        }

        if ((var14 & 32) != 0) {
            var9 = var0.isAllDay;
        }

        if ((var14 & 64) != 0) {
            var10 = var0.color;
        }

        if ((var14 & 128) != 0) {
            var11 = var0.location;
        }

        if ((var14 & 256) != 0) {
            var12 = var0.isPastEvent;
        }

        if ((var14 & 512) != 0) {
            var13 = var0.isRepeatable;
        }

        return var0.copy(var1, var3, var5, var7, var8, var9, var10, var11, var12, var13);
    }

    @NotNull
    public String toString() {
        return "ListEvent(id=" + this.id + ", startTS=" + this.startTS + ", endTS=" + this.endTS + ", title=" + this.title + ", description=" + this.description + ", isAllDay=" + this.isAllDay + ", color=" + this.color + ", location=" + this.location + ", isPastEvent=" + this.isPastEvent + ", isRepeatable=" + this.isRepeatable + ")";
    }

    public int hashCode() {
        int var10000 = ((Long.hashCode(this.id) * 31 + Long.hashCode(this.startTS)) * 31 + Long.hashCode(this.endTS)) * 31;
        String var10001 = this.title;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.description;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        byte var1 = this.isAllDay;
        if (var1 != 0) {
            var1 = 1;
        }

        var10000 = ((var10000 + var1) * 31 + Integer.hashCode(this.color)) * 31;
        var10001 = this.location;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var1 = this.isPastEvent;
        if (var1 != 0) {
            var1 = 1;
        }

        var10000 = (var10000 + var1) * 31;
        var1 = this.isRepeatable;
        if (var1 != 0) {
            var1 = 1;
        }

        return var10000 + var1;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof ListEvent) {
                ListEvent var2 = (ListEvent)var1;
                if (this.id == var2.id && this.startTS == var2.startTS && this.endTS == var2.endTS && Intrinsics.areEqual(this.title, var2.title) && Intrinsics.areEqual(this.description, var2.description) && this.isAllDay == var2.isAllDay && this.color == var2.color && Intrinsics.areEqual(this.location, var2.location) && this.isPastEvent == var2.isPastEvent && this.isRepeatable == var2.isRepeatable) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
