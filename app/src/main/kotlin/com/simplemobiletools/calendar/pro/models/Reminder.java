package com.simplemobiletools.calendar.pro.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/Reminder;", "", "minutes", "", "type", "(II)V", "getMinutes", "()I", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar_debug"}
)
public final class Reminder {
    private final int minutes;
    private final int type;

    public final int getMinutes() {
        return this.minutes;
    }

    public final int getType() {
        return this.type;
    }

    public Reminder(int minutes, int type) {
        this.minutes = minutes;
        this.type = type;
    }

    public final int component1() {
        return this.minutes;
    }

    public final int component2() {
        return this.type;
    }

    @NotNull
    public final Reminder copy(int minutes, int type) {
        return new Reminder(minutes, type);
    }

    // $FF: synthetic method
    public static Reminder copy$default(Reminder var0, int var1, int var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.minutes;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.type;
        }

        return var0.copy(var1, var2);
    }

    @NotNull
    public String toString() {
        return "Reminder(minutes=" + this.minutes + ", type=" + this.type + ")";
    }

    public int hashCode() {
        return Integer.hashCode(this.minutes) * 31 + Integer.hashCode(this.type);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Reminder) {
                Reminder var2 = (Reminder)var1;
                if (this.minutes == var2.minutes && this.type == var2.type) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
