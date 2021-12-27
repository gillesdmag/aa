package com.simplemobiletools.calendar.pro.objects;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/objects/States;", "", "()V", "isUpdatingCalDAV", "", "()Z", "setUpdatingCalDAV", "(Z)V", "calendar_debug"}
)
public final class States {
    private static boolean isUpdatingCalDAV;
    @NotNull
    public static final States INSTANCE;

    public final boolean isUpdatingCalDAV() {
        return isUpdatingCalDAV;
    }

    public final void setUpdatingCalDAV(boolean var1) {
        isUpdatingCalDAV = var1;
    }

    private States() {
    }

    static {
        States var0 = new States();
        INSTANCE = var0;
    }
}
