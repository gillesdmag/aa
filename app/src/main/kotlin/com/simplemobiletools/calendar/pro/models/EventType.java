package com.simplemobiletools.calendar.pro.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010*\u001a\u00020\u0005J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\u0006\u0010,\u001a\u00020(J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013¨\u0006."},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/EventType;", "", "id", "", "title", "", "color", "", "caldavCalendarId", "caldavDisplayName", "caldavEmail", "(Ljava/lang/Long;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getCaldavCalendarId", "()I", "setCaldavCalendarId", "(I)V", "getCaldavDisplayName", "()Ljava/lang/String;", "setCaldavDisplayName", "(Ljava/lang/String;)V", "getCaldavEmail", "setCaldavEmail", "getColor", "setColor", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/simplemobiletools/calendar/pro/models/EventType;", "equals", "", "other", "getDisplayTitle", "hashCode", "isSyncedEventType", "toString", "calendar_debug"}
)
@Entity(
    tableName = "event_types",
    indices = {@Index(
        unique = true,
        value = {"id"}
    )}
)
public final class EventType {
    @PrimaryKey(
        autoGenerate = true
    )
    @Nullable
    private Long id;
    @ColumnInfo(
        name = "title"
    )
    @NotNull
    private String title;
    @ColumnInfo(
        name = "color"
    )
    private int color;
    @ColumnInfo(
        name = "caldav_calendar_id"
    )
    private int caldavCalendarId;
    @ColumnInfo(
        name = "caldav_display_name"
    )
    @NotNull
    private String caldavDisplayName;
    @ColumnInfo(
        name = "caldav_email"
    )
    @NotNull
    private String caldavEmail;

    @NotNull
    public final String getDisplayTitle() {
        return this.caldavCalendarId == 0 ? this.title : this.caldavDisplayName + " (" + this.caldavEmail + ')';
    }

    public final boolean isSyncedEventType() {
        return this.caldavCalendarId != 0;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    public final void setId(@Nullable Long var1) {
        this.id = var1;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.title = var1;
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int var1) {
        this.color = var1;
    }

    public final int getCaldavCalendarId() {
        return this.caldavCalendarId;
    }

    public final void setCaldavCalendarId(int var1) {
        this.caldavCalendarId = var1;
    }

    @NotNull
    public final String getCaldavDisplayName() {
        return this.caldavDisplayName;
    }

    public final void setCaldavDisplayName(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.caldavDisplayName = var1;
    }

    @NotNull
    public final String getCaldavEmail() {
        return this.caldavEmail;
    }

    public final void setCaldavEmail(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.caldavEmail = var1;
    }

    public EventType(@Nullable Long id, @NotNull String title, int color, int caldavCalendarId, @NotNull String caldavDisplayName, @NotNull String caldavEmail) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caldavDisplayName, "caldavDisplayName");
        Intrinsics.checkNotNullParameter(caldavEmail, "caldavEmail");
        super();
        this.id = id;
        this.title = title;
        this.color = color;
        this.caldavCalendarId = caldavCalendarId;
        this.caldavDisplayName = caldavDisplayName;
        this.caldavEmail = caldavEmail;
    }

    // $FF: synthetic method
    public EventType(Long var1, String var2, int var3, int var4, String var5, String var6, int var7, DefaultConstructorMarker var8) {
        if ((var7 & 8) != 0) {
            var4 = 0;
        }

        if ((var7 & 16) != 0) {
            var5 = "";
        }

        if ((var7 & 32) != 0) {
            var6 = "";
        }

        this(var1, var2, var3, var4, var5, var6);
    }

    @Nullable
    public final Long component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.color;
    }

    public final int component4() {
        return this.caldavCalendarId;
    }

    @NotNull
    public final String component5() {
        return this.caldavDisplayName;
    }

    @NotNull
    public final String component6() {
        return this.caldavEmail;
    }

    @NotNull
    public final EventType copy(@Nullable Long id, @NotNull String title, int color, int caldavCalendarId, @NotNull String caldavDisplayName, @NotNull String caldavEmail) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caldavDisplayName, "caldavDisplayName");
        Intrinsics.checkNotNullParameter(caldavEmail, "caldavEmail");
        return new EventType(id, title, color, caldavCalendarId, caldavDisplayName, caldavEmail);
    }

    // $FF: synthetic method
    public static EventType copy$default(EventType var0, Long var1, String var2, int var3, int var4, String var5, String var6, int var7, Object var8) {
        if ((var7 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var7 & 2) != 0) {
            var2 = var0.title;
        }

        if ((var7 & 4) != 0) {
            var3 = var0.color;
        }

        if ((var7 & 8) != 0) {
            var4 = var0.caldavCalendarId;
        }

        if ((var7 & 16) != 0) {
            var5 = var0.caldavDisplayName;
        }

        if ((var7 & 32) != 0) {
            var6 = var0.caldavEmail;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6);
    }

    @NotNull
    public String toString() {
        return "EventType(id=" + this.id + ", title=" + this.title + ", color=" + this.color + ", caldavCalendarId=" + this.caldavCalendarId + ", caldavDisplayName=" + this.caldavDisplayName + ", caldavEmail=" + this.caldavEmail + ")";
    }

    public int hashCode() {
        Long var10000 = this.id;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.title;
        var1 = (((var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Integer.hashCode(this.color)) * 31 + Integer.hashCode(this.caldavCalendarId)) * 31;
        var10001 = this.caldavDisplayName;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.caldavEmail;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof EventType) {
                EventType var2 = (EventType)var1;
                if (Intrinsics.areEqual(this.id, var2.id) && Intrinsics.areEqual(this.title, var2.title) && this.color == var2.color && this.caldavCalendarId == var2.caldavCalendarId && Intrinsics.areEqual(this.caldavDisplayName, var2.caldavDisplayName) && Intrinsics.areEqual(this.caldavEmail, var2.caldavEmail)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
