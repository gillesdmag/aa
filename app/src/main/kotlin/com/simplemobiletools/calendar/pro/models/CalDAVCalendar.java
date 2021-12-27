package com.simplemobiletools.calendar.pro.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010#\u001a\u00020\u0005J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006&"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/CalDAVCalendar;", "", "id", "", "displayName", "", "accountName", "accountType", "ownerName", "color", "accessLevel", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getAccessLevel", "()I", "getAccountName", "()Ljava/lang/String;", "getAccountType", "getColor", "setColor", "(I)V", "getDisplayName", "getId", "getOwnerName", "canWrite", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "getFullTitle", "hashCode", "toString", "calendar_debug"}
)
public final class CalDAVCalendar {
    private final int id;
    @NotNull
    private final String displayName;
    @NotNull
    private final String accountName;
    @NotNull
    private final String accountType;
    @NotNull
    private final String ownerName;
    private int color;
    private final int accessLevel;

    public final boolean canWrite() {
        return this.accessLevel >= 500;
    }

    @NotNull
    public final String getFullTitle() {
        return this.displayName + " (" + this.accountName + ')';
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    public final String getAccountType() {
        return this.accountType;
    }

    @NotNull
    public final String getOwnerName() {
        return this.ownerName;
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int var1) {
        this.color = var1;
    }

    public final int getAccessLevel() {
        return this.accessLevel;
    }

    public CalDAVCalendar(int id, @NotNull String displayName, @NotNull String accountName, @NotNull String accountType, @NotNull String ownerName, int color, int accessLevel) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        super();
        this.id = id;
        this.displayName = displayName;
        this.accountName = accountName;
        this.accountType = accountType;
        this.ownerName = ownerName;
        this.color = color;
        this.accessLevel = accessLevel;
    }

    public final int component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.displayName;
    }

    @NotNull
    public final String component3() {
        return this.accountName;
    }

    @NotNull
    public final String component4() {
        return this.accountType;
    }

    @NotNull
    public final String component5() {
        return this.ownerName;
    }

    public final int component6() {
        return this.color;
    }

    public final int component7() {
        return this.accessLevel;
    }

    @NotNull
    public final CalDAVCalendar copy(int id, @NotNull String displayName, @NotNull String accountName, @NotNull String accountType, @NotNull String ownerName, int color, int accessLevel) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        return new CalDAVCalendar(id, displayName, accountName, accountType, ownerName, color, accessLevel);
    }

    // $FF: synthetic method
    public static CalDAVCalendar copy$default(CalDAVCalendar var0, int var1, String var2, String var3, String var4, String var5, int var6, int var7, int var8, Object var9) {
        if ((var8 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var8 & 2) != 0) {
            var2 = var0.displayName;
        }

        if ((var8 & 4) != 0) {
            var3 = var0.accountName;
        }

        if ((var8 & 8) != 0) {
            var4 = var0.accountType;
        }

        if ((var8 & 16) != 0) {
            var5 = var0.ownerName;
        }

        if ((var8 & 32) != 0) {
            var6 = var0.color;
        }

        if ((var8 & 64) != 0) {
            var7 = var0.accessLevel;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7);
    }

    @NotNull
    public String toString() {
        return "CalDAVCalendar(id=" + this.id + ", displayName=" + this.displayName + ", accountName=" + this.accountName + ", accountType=" + this.accountType + ", ownerName=" + this.ownerName + ", color=" + this.color + ", accessLevel=" + this.accessLevel + ")";
    }

    public int hashCode() {
        int var10000 = Integer.hashCode(this.id) * 31;
        String var10001 = this.displayName;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.accountName;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.accountType;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.ownerName;
        return ((var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Integer.hashCode(this.color)) * 31 + Integer.hashCode(this.accessLevel);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof CalDAVCalendar) {
                CalDAVCalendar var2 = (CalDAVCalendar)var1;
                if (this.id == var2.id && Intrinsics.areEqual(this.displayName, var2.displayName) && Intrinsics.areEqual(this.accountName, var2.accountName) && Intrinsics.areEqual(this.accountType, var2.accountType) && Intrinsics.areEqual(this.ownerName, var2.ownerName) && this.color == var2.color && this.accessLevel == var2.accessLevel) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
