package com.simplemobiletools.calendar.pro.interfaces;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.simplemobiletools.calendar.pro.models.Event;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH'J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\nH'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\nH'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0018\u001a\u00020\u000bH'J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u000bH'J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u001f\u001a\u00020\u000bH'J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\"\u001a\u00020\u0005H'J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\nH'J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH'J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH'J,\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J$\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010'\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH'J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010'\u001a\u00020\u000bH'J$\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010'\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J$\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010/\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0010\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\rH'J\u0010\u00102\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000bH'J \u00103\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000bH'J\u0018\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000bH'J\u0018\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH'¨\u00068"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/interfaces/EventsDao;", "", "deleteBirthdayAnniversary", "", "source", "", "importId", "deleteEvents", "", "ids", "", "", "getAllEvents", "Lcom/simplemobiletools/calendar/pro/models/Event;", "getAllEventsWithTypes", "eventTypeIds", "getAnniversaries", "getBirthdays", "getCalDAVCalendarEvents", "getEventIdWithImportId", "(Ljava/lang/String;)Ljava/lang/Long;", "getEventIdWithLastImportId", "getEventIds", "getEventIdsByEventType", "eventTypeId", "getEventIdsWithParentIds", "parentIds", "getEventWithId", "id", "getEventWithImportId", "getEventsAtReboot", "currentTS", "getEventsByIdsWithImportIds", "getEventsForSearch", "searchQuery", "getEventsFromCalDAVCalendar", "getEventsWithIds", "getEventsWithImportIds", "getOneTimeEventFromToWithId", "toTS", "fromTS", "getOneTimeEventsFromTo", "getOneTimeEventsFromToWithTypes", "getOneTimeFutureEventsWithTypes", "getRepeatableEventFromToWithId", "getRepeatableEventsFromToWithTypes", "getRepeatableFutureEventsWithTypes", "currTS", "insertOrUpdate", "event", "resetEventsWithType", "updateEventImportIdAndSource", "updateEventRepetitionExceptions", "repetitionExceptions", "updateEventRepetitionLimit", "repeatLimit", "calendar_debug"}
)
@Dao
public interface EventsDao {
    @Query("SELECT * FROM events")
    @NotNull
    List getAllEvents();

    @Query("SELECT * FROM events WHERE event_type IN (:eventTypeIds)")
    @NotNull
    List getAllEventsWithTypes(@NotNull List var1);

    @Query("SELECT * FROM events WHERE id = :id")
    @Nullable
    Event getEventWithId(long var1);

    @Query("SELECT * FROM events WHERE import_id = :importId")
    @Nullable
    Event getEventWithImportId(@NotNull String var1);

    @Query("SELECT * FROM events WHERE start_ts <= :toTS AND end_ts >= :fromTS AND repeat_interval = 0")
    @NotNull
    List getOneTimeEventsFromTo(long var1, long var3);

    @Query("SELECT * FROM events WHERE id = :id AND start_ts <= :toTS AND end_ts >= :fromTS AND repeat_interval = 0")
    @NotNull
    List getOneTimeEventFromToWithId(long var1, long var3, long var5);

    @Query("SELECT * FROM events WHERE start_ts <= :toTS AND end_ts >= :fromTS AND start_ts != 0 AND repeat_interval = 0 AND event_type IN (:eventTypeIds)")
    @NotNull
    List getOneTimeEventsFromToWithTypes(long var1, long var3, @NotNull List var5);

    @Query("SELECT * FROM events WHERE end_ts > :toTS AND repeat_interval = 0 AND event_type IN (:eventTypeIds)")
    @NotNull
    List getOneTimeFutureEventsWithTypes(long var1, @NotNull List var3);

    @Query("SELECT * FROM events WHERE start_ts <= :toTS AND repeat_interval != 0")
    @NotNull
    List getRepeatableEventsFromToWithTypes(long var1);

    @Query("SELECT * FROM events WHERE id = :id AND start_ts <= :toTS AND repeat_interval != 0")
    @NotNull
    List getRepeatableEventFromToWithId(long var1, long var3);

    @Query("SELECT * FROM events WHERE start_ts <= :toTS AND start_ts != 0 AND repeat_interval != 0 AND event_type IN (:eventTypeIds)")
    @NotNull
    List getRepeatableEventsFromToWithTypes(long var1, @NotNull List var3);

    @Query("SELECT * FROM events WHERE repeat_interval != 0 AND (repeat_limit == 0 OR repeat_limit > :currTS) AND event_type IN (:eventTypeIds)")
    @NotNull
    List getRepeatableFutureEventsWithTypes(long var1, @NotNull List var3);

    @Query("SELECT * FROM events WHERE id IN (:ids) AND import_id != \"\"")
    @NotNull
    List getEventsByIdsWithImportIds(@NotNull List var1);

    @Query("SELECT * FROM events WHERE title LIKE :searchQuery OR location LIKE :searchQuery OR description LIKE :searchQuery")
    @NotNull
    List getEventsForSearch(@NotNull String var1);

    @Query("SELECT * FROM events WHERE source = 'contact-birthday'")
    @NotNull
    List getBirthdays();

    @Query("SELECT * FROM events WHERE source = 'contact-anniversary'")
    @NotNull
    List getAnniversaries();

    @Query("SELECT * FROM events WHERE import_id != \"\"")
    @NotNull
    List getEventsWithImportIds();

    @Query("SELECT * FROM events WHERE source = :source")
    @NotNull
    List getEventsFromCalDAVCalendar(@NotNull String var1);

    @Query("SELECT * FROM events WHERE id IN (:ids)")
    @NotNull
    List getEventsWithIds(@NotNull List var1);

    @Query("SELECT * FROM events WHERE reminder_1_minutes != -1 AND (start_ts > :currentTS OR repeat_interval != 0) AND start_ts != 0")
    @NotNull
    List getEventsAtReboot(long var1);

    @Query("SELECT id FROM events")
    @NotNull
    List getEventIds();

    @Query("SELECT id FROM events WHERE import_id = :importId")
    @Nullable
    Long getEventIdWithImportId(@NotNull String var1);

    @Query("SELECT id FROM events WHERE import_id LIKE :importId")
    @Nullable
    Long getEventIdWithLastImportId(@NotNull String var1);

    @Query("SELECT id FROM events WHERE event_type = :eventTypeId")
    @NotNull
    List getEventIdsByEventType(long var1);

    @Query("SELECT id FROM events WHERE event_type IN (:eventTypeIds)")
    @NotNull
    List getEventIdsByEventType(@NotNull List var1);

    @Query("SELECT id FROM events WHERE parent_id IN (:parentIds)")
    @NotNull
    List getEventIdsWithParentIds(@NotNull List var1);

    @Query("SELECT id FROM events WHERE source = :source AND import_id != \"\"")
    @NotNull
    List getCalDAVCalendarEvents(@NotNull String var1);

    @Query("UPDATE events SET event_type = 1 WHERE event_type = :eventTypeId")
    void resetEventsWithType(long var1);

    @Query("UPDATE events SET import_id = :importId, source = :source WHERE id = :id")
    void updateEventImportIdAndSource(@NotNull String var1, @NotNull String var2, long var3);

    @Query("UPDATE events SET repeat_limit = :repeatLimit WHERE id = :id")
    void updateEventRepetitionLimit(long var1, long var3);

    @Query("UPDATE events SET repetition_exceptions = :repetitionExceptions WHERE id = :id")
    void updateEventRepetitionExceptions(@NotNull String var1, long var2);

    @Insert(
        onConflict = 1
    )
    long insertOrUpdate(@NotNull Event var1);

    @Query("DELETE FROM events WHERE id IN (:ids)")
    void deleteEvents(@NotNull List var1);

    @Query("DELETE FROM events WHERE source = :source AND import_id = :importId")
    int deleteBirthdayAnniversary(@NotNull String var1, @NotNull String var2);
}
