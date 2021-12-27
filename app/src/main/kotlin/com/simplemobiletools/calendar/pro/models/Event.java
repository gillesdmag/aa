package com.simplemobiletools.calendar.pro.models;

import androidx.collection.LongSparseArray;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
import com.simplemobiletools.calendar.pro.helpers.ConstantsKt;
import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.calendar.pro.helpers.MyTimeZonesKt;
import com.simplemobiletools.commons.extensions.IntKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DateTime.Property;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002\u009f\u0001B\u0099\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b¢\u0006\u0002\u0010!J\u000e\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u0000J\u0018\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020j2\u0006\u0010h\u001a\u00020\u0000H\u0002J\u000e\u0010l\u001a\u00020g2\u0006\u0010m\u001a\u00020\u0007J \u0010n\u001a\u00020j2\u0006\u0010k\u001a\u00020j2\u0006\u0010h\u001a\u00020\u00002\u0006\u0010o\u001a\u00020>H\u0002J\u0010\u0010p\u001a\u00020j2\u0006\u0010k\u001a\u00020jH\u0002J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00107J\t\u0010r\u001a\u00020\u000bHÆ\u0003J\t\u0010s\u001a\u00020\u000bHÆ\u0003J\t\u0010t\u001a\u00020\u000bHÆ\u0003J\t\u0010u\u001a\u00020\u000bHÆ\u0003J\t\u0010v\u001a\u00020\u000bHÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\u0019\u0010x\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u0016HÆ\u0003J\t\u0010y\u001a\u00020\u0007HÆ\u0003J\t\u0010z\u001a\u00020\u0007HÆ\u0003J\t\u0010{\u001a\u00020\u0007HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u000bHÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u000bHÆ\u0003J¦\u0002\u0010\u008b\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000bHÆ\u0001¢\u0006\u0003\u0010\u008c\u0001J\u0016\u0010\u008d\u0001\u001a\u00020>2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001HÖ\u0003J\u0007\u0010\u0090\u0001\u001a\u00020\u000bJ\u0007\u0010\u0091\u0001\u001a\u00020\u0003J\u0007\u0010\u0092\u0001\u001a\u00020\u0003J\u0007\u0010\u0093\u0001\u001a\u00020>J\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u0001J\u0007\u0010\u0097\u0001\u001a\u00020\u0007J\u0007\u0010\u0098\u0001\u001a\u00020>J\n\u0010\u0099\u0001\u001a\u00020\u000bHÖ\u0001J\u0017\u0010\u009a\u0001\u001a\u00020>2\u000e\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u009c\u0001J\n\u0010\u009d\u0001\u001a\u00020\u0007HÖ\u0001J\u0007\u0010\u009e\u0001\u001a\u00020gR\u001e\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010 \u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001e\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010#\"\u0004\b<\u0010%R$\u0010=\u001a\u00020>2\u0006\u0010=\u001a\u00020>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010/\"\u0004\bC\u00101R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010#\"\u0004\bE\u0010%R\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010/\"\u0004\bG\u00101R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010'\"\u0004\bI\u0010)R\u001e\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010'\"\u0004\bK\u0010)R\u001e\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010'\"\u0004\bM\u0010)R\u001e\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010'\"\u0004\bO\u0010)R\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010)R\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010'\"\u0004\bS\u0010)R\u001e\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010'\"\u0004\bU\u0010)R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010/\"\u0004\bW\u00101R\u001e\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010'\"\u0004\bY\u0010)R.\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010#\"\u0004\b_\u0010%R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010/\"\u0004\ba\u00101R\u001e\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010#\"\u0004\bc\u0010%R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010#\"\u0004\be\u0010%¨\u0006 \u0001"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/Event;", "Ljava/io/Serializable;", "id", "", "startTS", "endTS", "title", "", "location", "description", "reminder1Minutes", "", "reminder2Minutes", "reminder3Minutes", "reminder1Type", "reminder2Type", "reminder3Type", "repeatInterval", "repeatRule", "repeatLimit", "repetitionExceptions", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "attendees", "importId", "timeZone", "flags", "eventType", "parentId", "lastUpdated", "source", "availability", "color", "(Ljava/lang/Long;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIJLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJLjava/lang/String;II)V", "getAttendees", "()Ljava/lang/String;", "setAttendees", "(Ljava/lang/String;)V", "getAvailability", "()I", "setAvailability", "(I)V", "getColor", "setColor", "getDescription", "setDescription", "getEndTS", "()J", "setEndTS", "(J)V", "getEventType", "setEventType", "getFlags", "setFlags", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImportId", "setImportId", "isPastEvent", "", "()Z", "setPastEvent", "(Z)V", "getLastUpdated", "setLastUpdated", "getLocation", "setLocation", "getParentId", "setParentId", "getReminder1Minutes", "setReminder1Minutes", "getReminder1Type", "setReminder1Type", "getReminder2Minutes", "setReminder2Minutes", "getReminder2Type", "setReminder2Type", "getReminder3Minutes", "setReminder3Minutes", "getReminder3Type", "setReminder3Type", "getRepeatInterval", "setRepeatInterval", "getRepeatLimit", "setRepeatLimit", "getRepeatRule", "setRepeatRule", "getRepetitionExceptions", "()Ljava/util/ArrayList;", "setRepetitionExceptions", "(Ljava/util/ArrayList;)V", "getSource", "setSource", "getStartTS", "setStartTS", "getTimeZone", "setTimeZone", "getTitle", "setTitle", "addIntervalTime", "", "original", "addMonthsWithSameDay", "Lorg/joda/time/DateTime;", "currStart", "addRepetitionException", "daycode", "addXthDayInterval", "forceLastWeekday", "addYearsWithSameDay", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIJLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJLjava/lang/String;II)Lcom/simplemobiletools/calendar/pro/models/Event;", "equals", "other", "", "getCalDAVCalendarId", "getCalDAVEventId", "getEventStartTS", "getIsAllDay", "getReminders", "", "Lcom/simplemobiletools/calendar/pro/models/Reminder;", "getTimeZoneString", "hasMissingYear", "hashCode", "isOnProperWeek", "startTimes", "Landroidx/collection/LongSparseArray;", "toString", "updateIsPastEvent", "Companion", "calendar_debug"}
)
@Entity(
    tableName = "events",
    indices = {@Index(
        unique = true,
        value = {"id"}
    )}
)
public final class Event implements Serializable {
    @PrimaryKey(
        autoGenerate = true
    )
    @Nullable
    private Long id;
    @ColumnInfo(
        name = "start_ts"
    )
    private long startTS;
    @ColumnInfo(
        name = "end_ts"
    )
    private long endTS;
    @ColumnInfo(
        name = "title"
    )
    @NotNull
    private String title;
    @ColumnInfo(
        name = "location"
    )
    @NotNull
    private String location;
    @ColumnInfo(
        name = "description"
    )
    @NotNull
    private String description;
    @ColumnInfo(
        name = "reminder_1_minutes"
    )
    private int reminder1Minutes;
    @ColumnInfo(
        name = "reminder_2_minutes"
    )
    private int reminder2Minutes;
    @ColumnInfo(
        name = "reminder_3_minutes"
    )
    private int reminder3Minutes;
    @ColumnInfo(
        name = "reminder_1_type"
    )
    private int reminder1Type;
    @ColumnInfo(
        name = "reminder_2_type"
    )
    private int reminder2Type;
    @ColumnInfo(
        name = "reminder_3_type"
    )
    private int reminder3Type;
    @ColumnInfo(
        name = "repeat_interval"
    )
    private int repeatInterval;
    @ColumnInfo(
        name = "repeat_rule"
    )
    private int repeatRule;
    @ColumnInfo(
        name = "repeat_limit"
    )
    private long repeatLimit;
    @ColumnInfo(
        name = "repetition_exceptions"
    )
    @NotNull
    private ArrayList repetitionExceptions;
    @ColumnInfo(
        name = "attendees"
    )
    @NotNull
    private String attendees;
    @ColumnInfo(
        name = "import_id"
    )
    @NotNull
    private String importId;
    @ColumnInfo(
        name = "time_zone"
    )
    @NotNull
    private String timeZone;
    @ColumnInfo(
        name = "flags"
    )
    private int flags;
    @ColumnInfo(
        name = "event_type"
    )
    private long eventType;
    @ColumnInfo(
        name = "parent_id"
    )
    private long parentId;
    @ColumnInfo(
        name = "last_updated"
    )
    private long lastUpdated;
    @ColumnInfo(
        name = "source"
    )
    @NotNull
    private String source;
    @ColumnInfo(
        name = "availability"
    )
    private int availability;
    private int color;
    private static final long serialVersionUID = -32456795132345616L;
    @NotNull
    public static final Event.Companion Companion = new Event.Companion((DefaultConstructorMarker)null);

    public final void addIntervalTime(@NotNull Event original) {
        Intrinsics.checkNotNullParameter(original, "original");
        DateTime oldStart = Formatter.INSTANCE.getDateTimeFromTS(this.startTS);
        DateTime newStart = null;
        DateTime var10000;
        switch(this.repeatInterval) {
            case 86400:
                var10000 = oldStart.plusDays(1);
                Intrinsics.checkNotNullExpressionValue(var10000, "oldStart.plusDays(1)");
                break;
            default:
                if (this.repeatInterval % 31536000 == 0) {
                    switch(this.repeatRule) {
                        case 2:
                            var10000 = this.addXthDayInterval(oldStart, original, true);
                            break;
                        case 3:
                        default:
                            var10000 = this.addYearsWithSameDay(oldStart);
                            break;
                        case 4:
                            var10000 = this.addXthDayInterval(oldStart, original, false);
                    }
                } else if (this.repeatInterval % 2592001 == 0) {
                    switch(this.repeatRule) {
                        case 1:
                            var10000 = this.addMonthsWithSameDay(oldStart, original);
                            break;
                        case 2:
                            var10000 = this.addXthDayInterval(oldStart, original, true);
                            break;
                        case 3:
                        default:
                            var10000 = oldStart.plusMonths(this.repeatInterval / 2592001).dayOfMonth().withMaximumValue();
                            break;
                        case 4:
                            var10000 = this.addXthDayInterval(oldStart, original, false);
                    }
                } else {
                    var10000 = this.repeatInterval % 604800 == 0 ? oldStart.plusDays(1) : oldStart.plusSeconds(this.repeatInterval);
                }

                Intrinsics.checkNotNullExpressionValue(var10000, "when {\n                 …terval)\n                }");
        }

        newStart = var10000;
        long newStartTS = DateTimeKt.seconds(newStart);
        long newEndTS = newStartTS + (this.endTS - this.startTS);
        this.startTS = newStartTS;
        this.endTS = newEndTS;
    }

    private final DateTime addYearsWithSameDay(DateTime currStart) {
        DateTime newDateTime = currStart.plusYears(this.repeatInterval / 31536000);
        Intrinsics.checkNotNullExpressionValue(newDateTime, "newDateTime");
        if (newDateTime.getDayOfMonth() != currStart.getDayOfMonth()) {
            while(true) {
                Property var10000 = newDateTime.dayOfMonth();
                Intrinsics.checkNotNullExpressionValue(var10000, "newDateTime.dayOfMonth()");
                if (var10000.getMaximumValue() >= currStart.getDayOfMonth()) {
                    newDateTime = newDateTime.withDayOfMonth(currStart.getDayOfMonth());
                    break;
                }

                newDateTime = newDateTime.plusYears(this.repeatInterval / 31536000);
            }
        }

        Intrinsics.checkNotNullExpressionValue(newDateTime, "newDateTime");
        return newDateTime;
    }

    private final DateTime addMonthsWithSameDay(DateTime currStart, Event original) {
        DateTime newDateTime = currStart.plusMonths(this.repeatInterval / 2592001);
        Intrinsics.checkNotNullExpressionValue(newDateTime, "newDateTime");
        if (newDateTime.getDayOfMonth() == currStart.getDayOfMonth()) {
            return newDateTime;
        } else {
            while(true) {
                Property var10000 = newDateTime.dayOfMonth();
                Intrinsics.checkNotNullExpressionValue(var10000, "newDateTime.dayOfMonth()");
                int var7 = var10000.getMaximumValue();
                Property var10001 = Formatter.INSTANCE.getDateTimeFromTS(original.startTS).dayOfMonth();
                Intrinsics.checkNotNullExpressionValue(var10001, "Formatter.getDateTimeFro…nal.startTS).dayOfMonth()");
                if (var7 >= var10001.getMaximumValue()) {
                    Intrinsics.checkNotNullExpressionValue(newDateTime, "newDateTime");
                    return newDateTime;
                }

                newDateTime = newDateTime.plusMonths(this.repeatInterval / 2592001);

                DateTime var4;
                try {
                    var4 = newDateTime.withDayOfMonth(currStart.getDayOfMonth());
                } catch (Exception var6) {
                    var4 = newDateTime;
                }

                newDateTime = var4;
            }
        }
    }

    private final DateTime addXthDayInterval(DateTime currStart, Event original, boolean forceLastWeekday) {
        int day = currStart.getDayOfWeek();
        int order = (currStart.getDayOfMonth() - 1) / 7;
        DateTime properMonth = currStart.withDayOfMonth(7).plusMonths(this.repeatInterval / 2592001).withDayOfWeek(day);
        int wantedDay = false;
        int var10000;
        if (forceLastWeekday && (order == 3 || order == 4)) {
            DateTime originalDateTime = Formatter.INSTANCE.getDateTimeFromTS(original.startTS);
            var10000 = originalDateTime.getMonthOfYear();
            DateTime var10001 = originalDateTime.plusDays(7);
            Intrinsics.checkNotNullExpressionValue(var10001, "originalDateTime.plusDays(7)");
            boolean isLastWeekday = var10000 != var10001.getMonthOfYear();
            if (isLastWeekday) {
                order = -1;
            }
        }

        int wantedDay;
        if (order == -1) {
            Intrinsics.checkNotNullExpressionValue(properMonth, "properMonth");
            var10000 = properMonth.getDayOfMonth();
            Property var13 = properMonth.dayOfMonth();
            Intrinsics.checkNotNullExpressionValue(var13, "properMonth.dayOfMonth()");
            wantedDay = var10000 + (var13.getMaximumValue() - properMonth.getDayOfMonth()) / 7 * 7;
        } else {
            Intrinsics.checkNotNullExpressionValue(properMonth, "properMonth");
            wantedDay = properMonth.getDayOfMonth() + (order - (properMonth.getDayOfMonth() - 1) / 7) * 7;

            while(true) {
                Property var11 = properMonth.dayOfMonth();
                Intrinsics.checkNotNullExpressionValue(var11, "properMonth.dayOfMonth()");
                if (var11.getMaximumValue() >= wantedDay) {
                    break;
                }

                properMonth = properMonth.withDayOfMonth(7).plusMonths(this.repeatInterval / 2592001).withDayOfWeek(day);
                Intrinsics.checkNotNullExpressionValue(properMonth, "properMonth");
                wantedDay = properMonth.getDayOfMonth() + (order - (properMonth.getDayOfMonth() - 1) / 7) * 7;
            }
        }

        DateTime var12 = properMonth.withDayOfMonth(wantedDay);
        Intrinsics.checkNotNullExpressionValue(var12, "properMonth.withDayOfMonth(wantedDay)");
        return var12;
    }

    public final boolean getIsAllDay() {
        return (this.flags & 1) != 0;
    }

    public final boolean hasMissingYear() {
        return (this.flags & 4) != 0;
    }

    @NotNull
    public final List getReminders() {
        Iterable $this$filter$iv = (Iterable)SetsKt.setOf(new Reminder[]{new Reminder(this.reminder1Minutes, this.reminder1Type), new Reminder(this.reminder2Minutes, this.reminder2Type), new Reminder(this.reminder3Minutes, this.reminder3Type)});
        int $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var6 = $this$filter$iv.iterator();

        while(var6.hasNext()) {
            Object element$iv$iv = var6.next();
            Reminder it = (Reminder)element$iv$iv;
            int var9 = false;
            if (it.getMinutes() != -1) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        return (List)destination$iv$iv;
    }

    public final long getEventStartTS() {
        long var1;
        if (this.getIsAllDay()) {
            DateTime var10000 = Formatter.INSTANCE.getDateTimeFromTS(this.startTS).withTime(0, 0, 0, 0);
            Intrinsics.checkNotNullExpressionValue(var10000, "Formatter.getDateTimeFro…tTS).withTime(0, 0, 0, 0)");
            var1 = DateTimeKt.seconds(var10000);
        } else {
            var1 = this.startTS;
        }

        return var1;
    }

    public final long getCalDAVEventId() {
        long var1;
        try {
            String var10000 = (String)CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence)this.importId, new String[]{"-"}, false, 0, 6, (Object)null));
            if (var10000 == null) {
                var10000 = "0";
            }

            String var5 = var10000.toString();
            var1 = Long.parseLong(var5);
        } catch (NumberFormatException var4) {
            var1 = 0L;
        }

        return var1;
    }

    public final int getCalDAVCalendarId() {
        int var2;
        if (StringsKt.startsWith$default(this.source, "Caldav", false, 2, (Object)null)) {
            String var10000 = (String)CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence)this.source, new String[]{"-"}, false, 0, 6, (Object)null));
            if (var10000 == null) {
                var10000 = "0";
            }

            String var1 = var10000.toString();
            var2 = Integer.parseInt(var1);
        } else {
            var2 = 0;
        }

        return var2;
    }

    public final boolean isOnProperWeek(@NotNull LongSparseArray startTimes) {
        Intrinsics.checkNotNullParameter(startTimes, "startTimes");
        Formatter var10000 = Formatter.INSTANCE;
        Long var10002 = this.id;
        Intrinsics.checkNotNull(var10002);
        Object var10001 = startTimes.get(var10002);
        Intrinsics.checkNotNull(var10001);
        Intrinsics.checkNotNullExpressionValue(var10001, "startTimes[id!!]!!");
        DateTime var4 = var10000.getDateTimeFromTS(((Number)var10001).longValue()).withTimeAtStartOfDay();
        Intrinsics.checkNotNullExpressionValue(var4, "Formatter.getDateTimeFro…!).withTimeAtStartOfDay()");
        float initialWeekNumber = (float)var4.getMillis() / 6.048E8F;
        var4 = Formatter.INSTANCE.getDateTimeFromTS(this.startTS).withTimeAtStartOfDay();
        Intrinsics.checkNotNullExpressionValue(var4, "Formatter.getDateTimeFro…S).withTimeAtStartOfDay()");
        float currentWeekNumber = (float)var4.getMillis() / 6.048E8F;
        return (Math.round(initialWeekNumber) - Math.round(currentWeekNumber)) % (this.repeatInterval / 604800) == 0;
    }

    public final void updateIsPastEvent() {
        long endTSToCheck = this.startTS < ConstantsKt.getNowSeconds() && this.getIsAllDay() ? Formatter.INSTANCE.getDayEndTS(Formatter.INSTANCE.getDayCodeFromTS(this.endTS)) : this.endTS;
        this.setPastEvent(endTSToCheck < ConstantsKt.getNowSeconds());
    }

    public final void addRepetitionException(@NotNull String daycode) {
        Intrinsics.checkNotNullParameter(daycode, "daycode");
        ArrayList newRepetitionExceptions = this.repetitionExceptions;
        newRepetitionExceptions.add(daycode);
        List var10000 = CollectionsKt.toMutableList((Collection)CollectionsKt.distinct((Iterable)newRepetitionExceptions));
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        } else {
            newRepetitionExceptions = (ArrayList)var10000;
            this.repetitionExceptions = newRepetitionExceptions;
        }
    }

    public final boolean isPastEvent() {
        return (this.flags & 2) != 0;
    }

    public final void setPastEvent(boolean isPastEvent) {
        this.flags = IntKt.addBitIf(this.flags, isPastEvent, 2);
    }

    @NotNull
    public final String getTimeZoneString() {
        CharSequence var1 = (CharSequence)this.timeZone;
        String var13;
        if (var1.length() > 0) {
            Iterable $this$map$iv = (Iterable)MyTimeZonesKt.getAllTimeZones();
            int $i$f$map = false;
            Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
            int $i$f$mapTo = false;
            Iterator var6 = $this$map$iv.iterator();

            while(var6.hasNext()) {
                Object item$iv$iv = var6.next();
                MyTimeZone it = (MyTimeZone)item$iv$iv;
                int var9 = false;
                String var11 = it.getZoneName();
                destination$iv$iv.add(var11);
            }

            if (((List)destination$iv$iv).contains(this.timeZone)) {
                var13 = this.timeZone;
                return var13;
            }
        }

        DateTimeZone var10000 = DateTimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(var10000, "DateTimeZone.getDefault()");
        var13 = var10000.getID();
        Intrinsics.checkNotNullExpressionValue(var13, "DateTimeZone.getDefault().id");
        return var13;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    public final void setId(@Nullable Long var1) {
        this.id = var1;
    }

    public final long getStartTS() {
        return this.startTS;
    }

    public final void setStartTS(long var1) {
        this.startTS = var1;
    }

    public final long getEndTS() {
        return this.endTS;
    }

    public final void setEndTS(long var1) {
        this.endTS = var1;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.title = var1;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    public final void setLocation(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.location = var1;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.description = var1;
    }

    public final int getReminder1Minutes() {
        return this.reminder1Minutes;
    }

    public final void setReminder1Minutes(int var1) {
        this.reminder1Minutes = var1;
    }

    public final int getReminder2Minutes() {
        return this.reminder2Minutes;
    }

    public final void setReminder2Minutes(int var1) {
        this.reminder2Minutes = var1;
    }

    public final int getReminder3Minutes() {
        return this.reminder3Minutes;
    }

    public final void setReminder3Minutes(int var1) {
        this.reminder3Minutes = var1;
    }

    public final int getReminder1Type() {
        return this.reminder1Type;
    }

    public final void setReminder1Type(int var1) {
        this.reminder1Type = var1;
    }

    public final int getReminder2Type() {
        return this.reminder2Type;
    }

    public final void setReminder2Type(int var1) {
        this.reminder2Type = var1;
    }

    public final int getReminder3Type() {
        return this.reminder3Type;
    }

    public final void setReminder3Type(int var1) {
        this.reminder3Type = var1;
    }

    public final int getRepeatInterval() {
        return this.repeatInterval;
    }

    public final void setRepeatInterval(int var1) {
        this.repeatInterval = var1;
    }

    public final int getRepeatRule() {
        return this.repeatRule;
    }

    public final void setRepeatRule(int var1) {
        this.repeatRule = var1;
    }

    public final long getRepeatLimit() {
        return this.repeatLimit;
    }

    public final void setRepeatLimit(long var1) {
        this.repeatLimit = var1;
    }

    @NotNull
    public final ArrayList getRepetitionExceptions() {
        return this.repetitionExceptions;
    }

    public final void setRepetitionExceptions(@NotNull ArrayList var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.repetitionExceptions = var1;
    }

    @NotNull
    public final String getAttendees() {
        return this.attendees;
    }

    public final void setAttendees(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.attendees = var1;
    }

    @NotNull
    public final String getImportId() {
        return this.importId;
    }

    public final void setImportId(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.importId = var1;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final void setTimeZone(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.timeZone = var1;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final void setFlags(int var1) {
        this.flags = var1;
    }

    public final long getEventType() {
        return this.eventType;
    }

    public final void setEventType(long var1) {
        this.eventType = var1;
    }

    public final long getParentId() {
        return this.parentId;
    }

    public final void setParentId(long var1) {
        this.parentId = var1;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final void setLastUpdated(long var1) {
        this.lastUpdated = var1;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final void setSource(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.source = var1;
    }

    public final int getAvailability() {
        return this.availability;
    }

    public final void setAvailability(int var1) {
        this.availability = var1;
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int var1) {
        this.color = var1;
    }

    public Event(@Nullable Long id, long startTS, long endTS, @NotNull String title, @NotNull String location, @NotNull String description, int reminder1Minutes, int reminder2Minutes, int reminder3Minutes, int reminder1Type, int reminder2Type, int reminder3Type, int repeatInterval, int repeatRule, long repeatLimit, @NotNull ArrayList repetitionExceptions, @NotNull String attendees, @NotNull String importId, @NotNull String timeZone, int flags, long eventType, long parentId, long lastUpdated, @NotNull String source, int availability, int color) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(repetitionExceptions, "repetitionExceptions");
        Intrinsics.checkNotNullParameter(attendees, "attendees");
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(source, "source");
        super();
        this.id = id;
        this.startTS = startTS;
        this.endTS = endTS;
        this.title = title;
        this.location = location;
        this.description = description;
        this.reminder1Minutes = reminder1Minutes;
        this.reminder2Minutes = reminder2Minutes;
        this.reminder3Minutes = reminder3Minutes;
        this.reminder1Type = reminder1Type;
        this.reminder2Type = reminder2Type;
        this.reminder3Type = reminder3Type;
        this.repeatInterval = repeatInterval;
        this.repeatRule = repeatRule;
        this.repeatLimit = repeatLimit;
        this.repetitionExceptions = repetitionExceptions;
        this.attendees = attendees;
        this.importId = importId;
        this.timeZone = timeZone;
        this.flags = flags;
        this.eventType = eventType;
        this.parentId = parentId;
        this.lastUpdated = lastUpdated;
        this.source = source;
        this.availability = availability;
        this.color = color;
    }

    // $FF: synthetic method
    public Event(Long var1, long var2, long var4, String var6, String var7, String var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, long var17, ArrayList var19, String var20, String var21, String var22, int var23, long var24, long var26, long var28, String var30, int var31, int var32, int var33, DefaultConstructorMarker var34) {
        if ((var33 & 2) != 0) {
            var2 = 0L;
        }

        if ((var33 & 4) != 0) {
            var4 = 0L;
        }

        if ((var33 & 8) != 0) {
            var6 = "";
        }

        if ((var33 & 16) != 0) {
            var7 = "";
        }

        if ((var33 & 32) != 0) {
            var8 = "";
        }

        if ((var33 & 64) != 0) {
            var9 = -1;
        }

        if ((var33 & 128) != 0) {
            var10 = -1;
        }

        if ((var33 & 256) != 0) {
            var11 = -1;
        }

        if ((var33 & 512) != 0) {
            var12 = 0;
        }

        if ((var33 & 1024) != 0) {
            var13 = 0;
        }

        if ((var33 & 2048) != 0) {
            var14 = 0;
        }

        if ((var33 & 4096) != 0) {
            var15 = 0;
        }

        if ((var33 & 8192) != 0) {
            var16 = 0;
        }

        if ((var33 & 16384) != 0) {
            var17 = 0L;
        }

        if ((var33 & '耀') != 0) {
            var19 = new ArrayList();
        }

        if ((var33 & 65536) != 0) {
            var20 = "";
        }

        if ((var33 & 131072) != 0) {
            var21 = "";
        }

        if ((var33 & 262144) != 0) {
            var22 = "";
        }

        if ((var33 & 524288) != 0) {
            var23 = 0;
        }

        if ((var33 & 1048576) != 0) {
            var24 = 1L;
        }

        if ((var33 & 2097152) != 0) {
            var26 = 0L;
        }

        if ((var33 & 4194304) != 0) {
            var28 = 0L;
        }

        if ((var33 & 8388608) != 0) {
            var30 = "simple-calendar";
        }

        if ((var33 & 16777216) != 0) {
            var31 = 0;
        }

        if ((var33 & 33554432) != 0) {
            var32 = 0;
        }

        this(var1, var2, var4, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var19, var20, var21, var22, var23, var24, var26, var28, var30, var31, var32);
    }

    @Nullable
    public final Long component1() {
        return this.id;
    }

    public final long component2() {
        return this.startTS;
    }

    public final long component3() {
        return this.endTS;
    }

    @NotNull
    public final String component4() {
        return this.title;
    }

    @NotNull
    public final String component5() {
        return this.location;
    }

    @NotNull
    public final String component6() {
        return this.description;
    }

    public final int component7() {
        return this.reminder1Minutes;
    }

    public final int component8() {
        return this.reminder2Minutes;
    }

    public final int component9() {
        return this.reminder3Minutes;
    }

    public final int component10() {
        return this.reminder1Type;
    }

    public final int component11() {
        return this.reminder2Type;
    }

    public final int component12() {
        return this.reminder3Type;
    }

    public final int component13() {
        return this.repeatInterval;
    }

    public final int component14() {
        return this.repeatRule;
    }

    public final long component15() {
        return this.repeatLimit;
    }

    @NotNull
    public final ArrayList component16() {
        return this.repetitionExceptions;
    }

    @NotNull
    public final String component17() {
        return this.attendees;
    }

    @NotNull
    public final String component18() {
        return this.importId;
    }

    @NotNull
    public final String component19() {
        return this.timeZone;
    }

    public final int component20() {
        return this.flags;
    }

    public final long component21() {
        return this.eventType;
    }

    public final long component22() {
        return this.parentId;
    }

    public final long component23() {
        return this.lastUpdated;
    }

    @NotNull
    public final String component24() {
        return this.source;
    }

    public final int component25() {
        return this.availability;
    }

    public final int component26() {
        return this.color;
    }

    @NotNull
    public final Event copy(@Nullable Long id, long startTS, long endTS, @NotNull String title, @NotNull String location, @NotNull String description, int reminder1Minutes, int reminder2Minutes, int reminder3Minutes, int reminder1Type, int reminder2Type, int reminder3Type, int repeatInterval, int repeatRule, long repeatLimit, @NotNull ArrayList repetitionExceptions, @NotNull String attendees, @NotNull String importId, @NotNull String timeZone, int flags, long eventType, long parentId, long lastUpdated, @NotNull String source, int availability, int color) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(repetitionExceptions, "repetitionExceptions");
        Intrinsics.checkNotNullParameter(attendees, "attendees");
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(source, "source");
        return new Event(id, startTS, endTS, title, location, description, reminder1Minutes, reminder2Minutes, reminder3Minutes, reminder1Type, reminder2Type, reminder3Type, repeatInterval, repeatRule, repeatLimit, repetitionExceptions, attendees, importId, timeZone, flags, eventType, parentId, lastUpdated, source, availability, color);
    }

    // $FF: synthetic method
    public static Event copy$default(Event var0, Long var1, long var2, long var4, String var6, String var7, String var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, long var17, ArrayList var19, String var20, String var21, String var22, int var23, long var24, long var26, long var28, String var30, int var31, int var32, int var33, Object var34) {
        if ((var33 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var33 & 2) != 0) {
            var2 = var0.startTS;
        }

        if ((var33 & 4) != 0) {
            var4 = var0.endTS;
        }

        if ((var33 & 8) != 0) {
            var6 = var0.title;
        }

        if ((var33 & 16) != 0) {
            var7 = var0.location;
        }

        if ((var33 & 32) != 0) {
            var8 = var0.description;
        }

        if ((var33 & 64) != 0) {
            var9 = var0.reminder1Minutes;
        }

        if ((var33 & 128) != 0) {
            var10 = var0.reminder2Minutes;
        }

        if ((var33 & 256) != 0) {
            var11 = var0.reminder3Minutes;
        }

        if ((var33 & 512) != 0) {
            var12 = var0.reminder1Type;
        }

        if ((var33 & 1024) != 0) {
            var13 = var0.reminder2Type;
        }

        if ((var33 & 2048) != 0) {
            var14 = var0.reminder3Type;
        }

        if ((var33 & 4096) != 0) {
            var15 = var0.repeatInterval;
        }

        if ((var33 & 8192) != 0) {
            var16 = var0.repeatRule;
        }

        if ((var33 & 16384) != 0) {
            var17 = var0.repeatLimit;
        }

        if ((var33 & '耀') != 0) {
            var19 = var0.repetitionExceptions;
        }

        if ((var33 & 65536) != 0) {
            var20 = var0.attendees;
        }

        if ((var33 & 131072) != 0) {
            var21 = var0.importId;
        }

        if ((var33 & 262144) != 0) {
            var22 = var0.timeZone;
        }

        if ((var33 & 524288) != 0) {
            var23 = var0.flags;
        }

        if ((var33 & 1048576) != 0) {
            var24 = var0.eventType;
        }

        if ((var33 & 2097152) != 0) {
            var26 = var0.parentId;
        }

        if ((var33 & 4194304) != 0) {
            var28 = var0.lastUpdated;
        }

        if ((var33 & 8388608) != 0) {
            var30 = var0.source;
        }

        if ((var33 & 16777216) != 0) {
            var31 = var0.availability;
        }

        if ((var33 & 33554432) != 0) {
            var32 = var0.color;
        }

        return var0.copy(var1, var2, var4, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var19, var20, var21, var22, var23, var24, var26, var28, var30, var31, var32);
    }

    @NotNull
    public String toString() {
        return "Event(id=" + this.id + ", startTS=" + this.startTS + ", endTS=" + this.endTS + ", title=" + this.title + ", location=" + this.location + ", description=" + this.description + ", reminder1Minutes=" + this.reminder1Minutes + ", reminder2Minutes=" + this.reminder2Minutes + ", reminder3Minutes=" + this.reminder3Minutes + ", reminder1Type=" + this.reminder1Type + ", reminder2Type=" + this.reminder2Type + ", reminder3Type=" + this.reminder3Type + ", repeatInterval=" + this.repeatInterval + ", repeatRule=" + this.repeatRule + ", repeatLimit=" + this.repeatLimit + ", repetitionExceptions=" + this.repetitionExceptions + ", attendees=" + this.attendees + ", importId=" + this.importId + ", timeZone=" + this.timeZone + ", flags=" + this.flags + ", eventType=" + this.eventType + ", parentId=" + this.parentId + ", lastUpdated=" + this.lastUpdated + ", source=" + this.source + ", availability=" + this.availability + ", color=" + this.color + ")";
    }

    public int hashCode() {
        Long var10000 = this.id;
        int var1 = (((var10000 != null ? var10000.hashCode() : 0) * 31 + Long.hashCode(this.startTS)) * 31 + Long.hashCode(this.endTS)) * 31;
        String var10001 = this.title;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.location;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.description;
        var1 = ((((((((((var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Integer.hashCode(this.reminder1Minutes)) * 31 + Integer.hashCode(this.reminder2Minutes)) * 31 + Integer.hashCode(this.reminder3Minutes)) * 31 + Integer.hashCode(this.reminder1Type)) * 31 + Integer.hashCode(this.reminder2Type)) * 31 + Integer.hashCode(this.reminder3Type)) * 31 + Integer.hashCode(this.repeatInterval)) * 31 + Integer.hashCode(this.repeatRule)) * 31 + Long.hashCode(this.repeatLimit)) * 31;
        ArrayList var2 = this.repetitionExceptions;
        var1 = (var1 + (var2 != null ? var2.hashCode() : 0)) * 31;
        var10001 = this.attendees;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.importId;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.timeZone;
        var1 = (((((var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Integer.hashCode(this.flags)) * 31 + Long.hashCode(this.eventType)) * 31 + Long.hashCode(this.parentId)) * 31 + Long.hashCode(this.lastUpdated)) * 31;
        var10001 = this.source;
        return ((var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Integer.hashCode(this.availability)) * 31 + Integer.hashCode(this.color);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Event) {
                Event var2 = (Event)var1;
                if (Intrinsics.areEqual(this.id, var2.id) && this.startTS == var2.startTS && this.endTS == var2.endTS && Intrinsics.areEqual(this.title, var2.title) && Intrinsics.areEqual(this.location, var2.location) && Intrinsics.areEqual(this.description, var2.description) && this.reminder1Minutes == var2.reminder1Minutes && this.reminder2Minutes == var2.reminder2Minutes && this.reminder3Minutes == var2.reminder3Minutes && this.reminder1Type == var2.reminder1Type && this.reminder2Type == var2.reminder2Type && this.reminder3Type == var2.reminder3Type && this.repeatInterval == var2.repeatInterval && this.repeatRule == var2.repeatRule && this.repeatLimit == var2.repeatLimit && Intrinsics.areEqual(this.repetitionExceptions, var2.repetitionExceptions) && Intrinsics.areEqual(this.attendees, var2.attendees) && Intrinsics.areEqual(this.importId, var2.importId) && Intrinsics.areEqual(this.timeZone, var2.timeZone) && this.flags == var2.flags && this.eventType == var2.eventType && this.parentId == var2.parentId && this.lastUpdated == var2.lastUpdated && Intrinsics.areEqual(this.source, var2.source) && this.availability == var2.availability && this.color == var2.color) {
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
        d2 = {"Lcom/simplemobiletools/calendar/pro/models/Event$Companion;", "", "()V", "serialVersionUID", "", "calendar_debug"}
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
