package com.simplemobiletools.calendar.pro.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.simplemobiletools.calendar.pro.models.EventType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H'J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH'¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\tH'J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u000bH'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H'¨\u0006\u0016"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/interfaces/EventTypesDao;", "", "deleteEventTypes", "", "eventTypes", "", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "deleteEventTypesWithCalendarId", "ids", "", "getEventTypeIdWithTitle", "", "title", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getEventTypeWithCalDAVCalendarId", "calendarId", "getEventTypeWithId", "id", "getEventTypes", "insertOrUpdate", "eventType", "calendar_debug"}
)
@Dao
public interface EventTypesDao {
    @Query("SELECT * FROM event_types ORDER BY title ASC")
    @NotNull
    List getEventTypes();

    @Query("SELECT * FROM event_types WHERE id = :id")
    @Nullable
    EventType getEventTypeWithId(long var1);

    @Query("SELECT id FROM event_types WHERE title = :title COLLATE NOCASE")
    @Nullable
    Long getEventTypeIdWithTitle(@NotNull String var1);

    @Query("SELECT * FROM event_types WHERE caldav_calendar_id = :calendarId")
    @Nullable
    EventType getEventTypeWithCalDAVCalendarId(int var1);

    @Query("DELETE FROM event_types WHERE caldav_calendar_id IN (:ids)")
    void deleteEventTypesWithCalendarId(@NotNull List var1);

    @Insert(
        onConflict = 1
    )
    long insertOrUpdate(@NotNull EventType var1);

    @Delete
    void deleteEventTypes(@NotNull List var1);
}
