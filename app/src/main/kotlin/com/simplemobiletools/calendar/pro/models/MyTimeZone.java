package com.simplemobiletools.calendar.pro.models;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0016"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/MyTimeZone;", "Ljava/io/Serializable;", "title", "", "zoneName", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getZoneName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "calendar_debug"}
)
public final class MyTimeZone implements Serializable {
    @NotNull
    private String title;
    @NotNull
    private final String zoneName;
    private static final long serialVersionUID = -32456354132688616L;
    @NotNull
    public static final MyTimeZone.Companion Companion = new MyTimeZone.Companion((DefaultConstructorMarker)null);

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.title = var1;
    }

    @NotNull
    public final String getZoneName() {
        return this.zoneName;
    }

    public MyTimeZone(@NotNull String title, @NotNull String zoneName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(zoneName, "zoneName");
        super();
        this.title = title;
        this.zoneName = zoneName;
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.zoneName;
    }

    @NotNull
    public final MyTimeZone copy(@NotNull String title, @NotNull String zoneName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(zoneName, "zoneName");
        return new MyTimeZone(title, zoneName);
    }

    // $FF: synthetic method
    public static MyTimeZone copy$default(MyTimeZone var0, String var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.title;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.zoneName;
        }

        return var0.copy(var1, var2);
    }

    @NotNull
    public String toString() {
        return "MyTimeZone(title=" + this.title + ", zoneName=" + this.zoneName + ")";
    }

    public int hashCode() {
        String var10000 = this.title;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.zoneName;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof MyTimeZone) {
                MyTimeZone var2 = (MyTimeZone)var1;
                if (Intrinsics.areEqual(this.title, var2.title) && Intrinsics.areEqual(this.zoneName, var2.zoneName)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/models/MyTimeZone$Companion;", "", "()V", "serialVersionUID", "", "calendar_debug"}
    )
    public static final class Companion {
        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
