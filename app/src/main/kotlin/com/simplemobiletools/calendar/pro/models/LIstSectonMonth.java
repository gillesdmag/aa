package com.simplemobiletools.calendar.pro.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/ListSectionMonth;", "Lcom/simplemobiletools/calendar/pro/models/ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar_debug"}
)
public final class ListSectionMonth extends ListItem {
    @NotNull
    private final String title;

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public ListSectionMonth(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        super();
        this.title = title;
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final ListSectionMonth copy(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ListSectionMonth(title);
    }

    // $FF: synthetic method
    public static ListSectionMonth copy$default(ListSectionMonth var0, String var1, int var2, Object var3) {
        if ((var2 & 1) != 0) {
            var1 = var0.title;
        }

        return var0.copy(var1);
    }

    @NotNull
    public String toString() {
        return "ListSectionMonth(title=" + this.title + ")";
    }

    public int hashCode() {
        String var10000 = this.title;
        return var10000 != null ? var10000.hashCode() : 0;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof ListSectionMonth) {
                ListSectionMonth var2 = (ListSectionMonth)var1;
                if (Intrinsics.areEqual(this.title, var2.title)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
