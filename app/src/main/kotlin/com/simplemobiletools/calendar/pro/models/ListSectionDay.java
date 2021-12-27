package com.simplemobiletools.calendar.pro.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/ListSectionDay;", "Lcom/simplemobiletools/calendar/pro/models/ListItem;", "title", "", "code", "isToday", "", "isPastSection", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCode", "()Ljava/lang/String;", "()Z", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "calendar_debug"}
)
public final class ListSectionDay extends ListItem {
    @NotNull
    private final String title;
    @NotNull
    private final String code;
    private final boolean isToday;
    private final boolean isPastSection;

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final boolean isToday() {
        return this.isToday;
    }

    public final boolean isPastSection() {
        return this.isPastSection;
    }

    public ListSectionDay(@NotNull String title, @NotNull String code, boolean isToday, boolean isPastSection) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(code, "code");
        super();
        this.title = title;
        this.code = code;
        this.isToday = isToday;
        this.isPastSection = isPastSection;
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    public final boolean component3() {
        return this.isToday;
    }

    public final boolean component4() {
        return this.isPastSection;
    }

    @NotNull
    public final ListSectionDay copy(@NotNull String title, @NotNull String code, boolean isToday, boolean isPastSection) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(code, "code");
        return new ListSectionDay(title, code, isToday, isPastSection);
    }

    // $FF: synthetic method
    public static ListSectionDay copy$default(ListSectionDay var0, String var1, String var2, boolean var3, boolean var4, int var5, Object var6) {
        if ((var5 & 1) != 0) {
            var1 = var0.title;
        }

        if ((var5 & 2) != 0) {
            var2 = var0.code;
        }

        if ((var5 & 4) != 0) {
            var3 = var0.isToday;
        }

        if ((var5 & 8) != 0) {
            var4 = var0.isPastSection;
        }

        return var0.copy(var1, var2, var3, var4);
    }

    @NotNull
    public String toString() {
        return "ListSectionDay(title=" + this.title + ", code=" + this.code + ", isToday=" + this.isToday + ", isPastSection=" + this.isPastSection + ")";
    }

    public int hashCode() {
        String var10000 = this.title;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.code;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        byte var2 = this.isToday;
        if (var2 != 0) {
            var2 = 1;
        }

        var1 = (var1 + var2) * 31;
        var2 = this.isPastSection;
        if (var2 != 0) {
            var2 = 1;
        }

        return var1 + var2;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof ListSectionDay) {
                ListSectionDay var2 = (ListSectionDay)var1;
                if (Intrinsics.areEqual(this.title, var2.title) && Intrinsics.areEqual(this.code, var2.code) && this.isToday == var2.isToday && this.isPastSection == var2.isPastSection) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
