package com.simplemobiletools.calendar.pro.interfaces;

import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/interfaces/DeleteEventTypesListener;", "", "deleteEventTypes", "", "eventTypes", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "deleteEvents", "calendar_debug"}
)
public interface DeleteEventTypesListener {
    boolean deleteEventTypes(@NotNull ArrayList var1, boolean var2);
}
