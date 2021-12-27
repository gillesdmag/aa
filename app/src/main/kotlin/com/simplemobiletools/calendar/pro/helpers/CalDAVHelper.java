// CalDAVHelper.java
package com.simplemobiletools.calendar.pro.helpers;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract.Attendees;
import android.provider.CalendarContract.Calendars;
import android.provider.CalendarContract.Colors;
import android.provider.CalendarContract.Events;
import android.provider.CalendarContract.Reminders;
import android.util.SparseIntArray;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.interfaces.EventsDao;
import com.simplemobiletools.calendar.pro.models.Attendee;
import com.simplemobiletools.calendar.pro.models.CalDAVCalendar;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.calendar.pro.models.EventRepetition;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.calendar.pro.models.Reminder;
import com.simplemobiletools.calendar.pro.objects.States;
import com.simplemobiletools.commons.extensions.CursorKt;
import com.simplemobiletools.commons.extensions.StringKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001cj\b\u0012\u0004\u0012\u00020\u0013`\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J(\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0018\u0010)\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020+0&2\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0010\u0010,\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010-\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010.\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0010J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u00100\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\f\u00101\u001a\b\u0012\u0004\u0012\u00020\n02J\u0010\u00103\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u00105\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u00106\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u00107\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/CalDAVHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "eventsHelper", "Lcom/simplemobiletools/calendar/pro/helpers/EventsHelper;", "clearEventAttendees", "", "event", "Lcom/simplemobiletools/calendar/pro/models/Event;", "clearEventReminders", "deleteCalDAVCalendarEvents", "calendarId", "", "deleteCalDAVEvent", "fetchCalDAVCalendarEvents", "", "eventTypeId", "showToasts", "", "fillEventContentValues", "Landroid/content/ContentValues;", "fillEventRepeatExceptionValues", "occurrenceTS", "getAvailableCalDAVCalendarColors", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eventType", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "getCalDAVCalendars", "Lcom/simplemobiletools/calendar/pro/models/CalDAVCalendar;", "ids", "", "getCalDAVColorKey", "getCalDAVEventAttendees", "", "Lcom/simplemobiletools/calendar/pro/models/Attendee;", "eventId", "getCalDAVEventImportId", "getCalDAVEventReminders", "Lcom/simplemobiletools/calendar/pro/models/Reminder;", "getDurationCode", "insertCalDAVEvent", "insertEventRepeatException", "refreshCalDAVCalendar", "refreshCalendars", "callback", "Lkotlin/Function0;", "setupCalDAVEventAttendees", "setupCalDAVEventImportId", "setupCalDAVEventReminders", "updateCalDAVCalendar", "updateCalDAVEvent", "Simple-Calendar.app"}
)
@SuppressLint({"MissingPermission"})
public final class CalDAVHelper {
    private final EventsHelper eventsHelper;
    @NotNull
    private final Context context;

    public final void refreshCalendars(boolean showToasts, @NotNull Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!States.INSTANCE.isUpdatingCalDAV()) {
            States.INSTANCE.setUpdatingCalDAV(true);

            try {
                ArrayList calDAVCalendars = this.getCalDAVCalendars(ContextKt.getConfig(this.context).getCaldavSyncedCalendarIds(), showToasts);
                Iterator var5 = calDAVCalendars.iterator();

                while(var5.hasNext()) {
                    CalDAVCalendar calendar = (CalDAVCalendar)var5.next();
                    EventType var10000 = this.eventsHelper.getEventTypeWithCalDAVCalendarId(calendar.getId());
                    if (var10000 != null) {
                        EventType localEventType = var10000;
                        int var9 = false;
                        localEventType.setTitle(calendar.getDisplayName());
                        localEventType.setCaldavDisplayName(calendar.getDisplayName());
                        localEventType.setCaldavEmail(calendar.getAccountName());
                        localEventType.setColor(calendar.getColor());
                        this.eventsHelper.insertOrUpdateEventTypeSync(localEventType);
                        int var10001 = calendar.getId();
                        Long var10002 = localEventType.getId();
                        Intrinsics.checkNotNull(var10002);
                        this.fetchCalDAVCalendarEvents(var10001, var10002, showToasts);
                    }
                }

                ContextKt.scheduleCalDAVSync(this.context, true);
                callback.invoke();
            } finally {
                States.INSTANCE.setUpdatingCalDAV(false);
            }

        }
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final ArrayList getCalDAVCalendars(@NotNull String ids, boolean showToasts) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        final ArrayList calendars = new ArrayList();
        if (com.simplemobiletools.commons.extensions.ContextKt.hasPermission(this.context, 8) && com.simplemobiletools.commons.extensions.ContextKt.hasPermission(this.context, 7)) {
            Uri uri = Calendars.CONTENT_URI;
            String[] projection = new String[]{"_id", "calendar_displayName", "account_name", "account_type", "ownerAccount", "calendar_color", "calendar_access_level"};
            CharSequence var7 = (CharSequence)StringsKt.trim((CharSequence)ids).toString();
            String selection = var7.length() > 0 ? "_id IN (" + ids + ')' : null;
            Context var10000 = this.context;
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            com.simplemobiletools.commons.extensions.ContextKt.queryCursor$default(var10000, uri, projection, selection, (String[])null, (String)null, showToasts, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((Cursor)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Cursor cursor) {
                    Intrinsics.checkNotNullParameter(cursor, "cursor");
                    int id = CursorKt.getIntValue(cursor, "_id");
                    String displayName = CursorKt.getStringValue(cursor, "calendar_displayName");
                    String accountName = CursorKt.getStringValue(cursor, "account_name");
                    String accountType = CursorKt.getStringValue(cursor, "account_type");
                    String var10000 = CursorKt.getStringValue(cursor, "ownerAccount");
                    if (var10000 == null) {
                        var10000 = "";
                    }

                    String ownerName = var10000;
                    int color = CursorKt.getIntValue(cursor, "calendar_color");
                    int accessLevel = CursorKt.getIntValue(cursor, "calendar_access_level");
                    Intrinsics.checkNotNullExpressionValue(displayName, "displayName");
                    Intrinsics.checkNotNullExpressionValue(accountName, "accountName");
                    Intrinsics.checkNotNullExpressionValue(accountType, "accountType");
                    CalDAVCalendar calendar = new CalDAVCalendar(id, displayName, accountName, accountType, ownerName, color, accessLevel);
                    calendars.add(calendar);
                }
            }), 24, (Object)null);
            return calendars;
        } else {
            return calendars;
        }
    }

    public final void updateCalDAVCalendar(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Uri var10000 = ContentUris.withAppendedId(Calendars.CONTENT_URI, (long)eventType.getCaldavCalendarId());
        Intrinsics.checkNotNullExpressionValue(var10000, "ContentUris.withAppended…aldavCalendarId.toLong())");
        Uri uri = var10000;
        ContentValues var4 = new ContentValues();
        int var6 = false;
        String colorKey = this.getCalDAVColorKey(eventType);
        if (colorKey != null) {
            var4.put("calendar_color_index", this.getCalDAVColorKey(eventType));
        } else {
            var4.put("calendar_color", eventType.getColor());
            var4.put("calendar_color_index", "");
        }

        var4.put("calendar_displayName", eventType.getTitle());
        ContentValues values = var4;

        try {
            this.context.getContentResolver().update(uri, values, (String)null, (String[])null);
            ContextKt.getEventTypesDB(this.context).insertOrUpdate(eventType);
        } catch (IllegalArgumentException var8) {
            var8.printStackTrace();
        }

    }

    private final String getCalDAVColorKey(EventType eventType) {
        ArrayList colors = this.getAvailableCalDAVCalendarColors(eventType);
        int colorKey = colors.indexOf(eventType.getColor());
        return colorKey > 0 ? String.valueOf(colorKey) : null;
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final ArrayList getAvailableCalDAVCalendarColors(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        final SparseIntArray colors = new SparseIntArray();
        Uri uri = Colors.CONTENT_URI;
        String[] projection = new String[]{"color", "color_index"};
        String selection = "color_type = ? AND account_name = ?";
        String[] selectionArgs = new String[]{String.valueOf(0), eventType.getCaldavEmail()};
        Context var10000 = this.context;
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        com.simplemobiletools.commons.extensions.ContextKt.queryCursor$default(var10000, uri, projection, selection, selectionArgs, (String)null, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Cursor)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                int colorKey = CursorKt.getIntValue(cursor, "color_index");
                int color = CursorKt.getIntValue(cursor, "color");
                colors.put(colorKey, color);
            }
        }), 48, (Object)null);
        ArrayList sortedColors = new ArrayList(colors.size());
        Iterable $this$mapTo$iv = (Iterable)RangesKt.until(0, colors.size());
        int $i$f$mapTo = false;
        Iterator var10 = $this$mapTo$iv.iterator();

        while(var10.hasNext()) {
            int item$iv = ((IntIterator)var10).nextInt();
            Collection var14 = (Collection)sortedColors;
            int var13 = false;
            Integer var15 = colors.get(item$iv);
            var14.add(var15);
        }

        Collection var16 = (Collection)sortedColors;
        if (!var16.isEmpty()) {
            List var17 = CollectionsKt.distinct((Iterable)sortedColors);
            if (var17 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Int> /* = java.util.ArrayList<kotlin.Int> */");
            }

            sortedColors = (ArrayList)var17;
        }

        return sortedColors;
    }

    @SuppressLint({"MissingPermission"})
    private final void fetchCalDAVCalendarEvents(final int calendarId, final long eventTypeId, boolean showToasts) {
        final HashMap importIdsMap = new HashMap();
        final ArrayList fetchedEventIds = new ArrayList();

        List var8;
        try {
            var8 = ContextKt.getEventsDB(this.context).getEventsFromCalDAVCalendar("Caldav-" + calendarId);
        } catch (Exception var25) {
            var8 = (List)(new ArrayList());
        }

        List existingEvents = var8;
        Iterable $this$forEach$iv = (Iterable)var8;
        int $i$f$forEach = false;
        Iterator var10 = $this$forEach$iv.iterator();

        boolean $i$f$forEach;
        while(var10.hasNext()) {
            Object element$iv = var10.next();
            Event it = (Event)element$iv;
            $i$f$forEach = false;
            ((Map)importIdsMap).put(it.getImportId(), it);
        }

        Uri uri = Events.CONTENT_URI;
        String[] projection = new String[]{"_id", "title", "description", "dtstart", "dtend", "duration", "exdate", "allDay", "rrule", "original_id", "originalInstanceTime", "eventLocation", "eventTimezone", "calendar_timezone", "deleted", "availability"};
        String selection = "calendar_id = " + calendarId;
        Context var10000 = this.context;
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        com.simplemobiletools.commons.extensions.ContextKt.queryCursor$default(var10000, uri, projection, selection, (String[])null, (String)null, showToasts, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Cursor)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                int deleted = CursorKt.getIntValue(cursor, "deleted");
                if (deleted != 1) {
                    long id = CursorKt.getLongValue(cursor, "_id");
                    String var10000 = CursorKt.getStringValue(cursor, "title");
                    if (var10000 == null) {
                        var10000 = "";
                    }

                    String title = var10000;
                    var10000 = CursorKt.getStringValue(cursor, "description");
                    if (var10000 == null) {
                        var10000 = "";
                    }

                    String description = var10000;
                    long startTS = CursorKt.getLongValue(cursor, "dtstart") / 1000L;
                    long endTS = CursorKt.getLongValue(cursor, "dtend") / 1000L;
                    int allDay = CursorKt.getIntValue(cursor, "allDay");
                    var10000 = CursorKt.getStringValue(cursor, "rrule");
                    if (var10000 == null) {
                        var10000 = "";
                    }

                    String rrule = var10000;
                    var10000 = CursorKt.getStringValue(cursor, "eventLocation");
                    if (var10000 == null) {
                        var10000 = "";
                    }

                    String location = var10000;
                    String originalId = CursorKt.getStringValue(cursor, "original_id");
                    long originalInstanceTime = CursorKt.getLongValue(cursor, "originalInstanceTime");
                    List reminders = CalDAVHelper.this.getCalDAVEventReminders(id);
                    String attendees = (new Gson()).toJson(CalDAVHelper.this.getCalDAVEventAttendees(id));
                    int availability = CursorKt.getIntValue(cursor, "availability");
                    if (endTS == 0L) {
                        var10000 = CursorKt.getStringValue(cursor, "duration");
                        if (var10000 == null) {
                            var10000 = "";
                        }

                        String duration = var10000;
                        endTS = startTS + (long)(new Parser()).parseDurationSeconds(duration);
                    }

                    Reminder reminder1 = (Reminder)CollectionsKt.getOrNull(reminders, 0);
                    Reminder reminder2 = (Reminder)CollectionsKt.getOrNull(reminders, 1);
                    Reminder reminder3 = (Reminder)CollectionsKt.getOrNull(reminders, 2);
                    String importId = CalDAVHelper.this.getCalDAVEventImportId(calendarId, id);
                    var10000 = CursorKt.getStringValue(cursor, "eventTimezone");
                    if (var10000 == null) {
                        var10000 = CursorKt.getStringValue(cursor, "calendar_timezone");
                    }

                    if (var10000 == null) {
                        DateTimeZone var44 = DateTimeZone.getDefault();
                        Intrinsics.checkNotNullExpressionValue(var44, "DateTimeZone.getDefault()");
                        var10000 = var44.getID();
                    }

                    String eventTimeZone = var10000;
                    String source = "Caldav-" + calendarId;
                    EventRepetition repeatRule = (new Parser()).parseRepeatInterval(rrule, startTS);
                    int var10008 = reminder1 != null ? reminder1.getMinutes() : -1;
                    int var10009 = reminder2 != null ? reminder2.getMinutes() : -1;
                    int var10010 = reminder3 != null ? reminder3.getMinutes() : -1;
                    int var10011 = reminder1 != null ? reminder1.getType() : 0;
                    int var10012 = reminder2 != null ? reminder2.getType() : 0;
                    int var10013 = reminder3 != null ? reminder3.getType() : 0;
                    int var10014 = repeatRule.getRepeatInterval();
                    int var10015 = repeatRule.getRepeatRule();
                    long var10016 = repeatRule.getRepeatLimit();
                    ArrayList var10017 = new ArrayList();
                    Intrinsics.checkNotNullExpressionValue(attendees, "attendees");
                    Intrinsics.checkNotNullExpressionValue(eventTimeZone, "eventTimeZone");
                    Event event = new Event((Long)null, startTS, endTS, title, location, description, var10008, var10009, var10010, var10011, var10012, var10013, var10014, var10015, var10016, var10017, attendees, importId, eventTimeZone, allDay, eventTypeId, 0L, 0L, source, availability, 0, 39845888, (DefaultConstructorMarker)null);
                    if (event.getIsAllDay()) {
                        event.setStartTS(Formatter.INSTANCE.getShiftedImportTimestamp(event.getStartTS()));
                        event.setEndTS(Formatter.INSTANCE.getShiftedImportTimestamp(event.getEndTS()));
                        if (event.getEndTS() > event.getStartTS()) {
                            event.setEndTS(event.getEndTS() - (long)86400);
                        }
                    }

                    fetchedEventIds.add(importId);
                    String exdate;
                    Event existingEvent;
                    String line;
                    if (originalInstanceTime != 0L) {
                        exdate = source + '-' + originalId;
                        existingEvent = ContextKt.getEventsDB(CalDAVHelper.this.getContext()).getEventWithImportId(exdate);
                        line = Formatter.INSTANCE.getDayCodeFromTS(originalInstanceTime / 1000L);
                        if (existingEvent != null && !existingEvent.getRepetitionExceptions().contains(line)) {
                            Long var10001 = existingEvent.getId();
                            Intrinsics.checkNotNull(var10001);
                            event.setParentId(var10001);
                            existingEvent.addRepetitionException(line);
                            EventsHelper.insertEvent$default(CalDAVHelper.this.eventsHelper, existingEvent, false, false, (Function1)null, 8, (Object)null);
                            var10001 = existingEvent.getId();
                            Intrinsics.checkNotNull(var10001);
                            event.setParentId(var10001);
                            event.addRepetitionException(line);
                            EventsHelper.insertEvent$default(CalDAVHelper.this.eventsHelper, event, false, false, (Function1)null, 8, (Object)null);
                            return;
                        }
                    }

                    var10000 = CursorKt.getStringValue(cursor, "exdate");
                    if (var10000 == null) {
                        var10000 = "";
                    }

                    exdate = var10000;
                    if (exdate.length() > 8) {
                        List lines = StringsKt.split$default((CharSequence)exdate, new String[]{"\n"}, false, 0, 6, (Object)null);
                        Iterator var31 = lines.iterator();

                        while(var31.hasNext()) {
                            line = (String)var31.next();
                            List dates = StringsKt.split$default((CharSequence)line, new String[]{",", ";"}, false, 0, 6, (Object)null);
                            Iterable $this$forEach$iv = (Iterable)dates;
                            int $i$f$forEach = false;
                            Collection destination$iv$iv = (Collection)(new ArrayList());
                            int $i$f$filterTo = false;
                            Iterator var38 = $this$forEach$iv.iterator();

                            while(var38.hasNext()) {
                                Object element$iv$iv;
                                boolean var45;
                                label142: {
                                    element$iv$iv = var38.next();
                                    String itx = (String)element$iv$iv;
                                    int var41 = false;
                                    CharSequence var42 = (CharSequence)itx;
                                    if (var42.length() > 0) {
                                        char var61 = itx.charAt(0);
                                        if (Character.isDigit(var61)) {
                                            var45 = true;
                                            break label142;
                                        }
                                    }

                                    var45 = false;
                                }

                                if (var45) {
                                    destination$iv$iv.add(element$iv$iv);
                                }
                            }

                            $this$forEach$iv = (Iterable)((List)destination$iv$iv);
                            $i$f$forEach = false;
                            Iterator var35 = $this$forEach$iv.iterator();

                            while(var35.hasNext()) {
                                Object element$iv = var35.next();
                                String it = (String)element$iv;
                                int var55 = false;
                                if (StringsKt.endsWith$default(it, "Z", false, 2, (Object)null)) {
                                    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyyMMdd'T'HHmmss'Z'");
                                    int offset = DateTimeZone.getDefault().getOffset(System.currentTimeMillis());
                                    DateTime dt = formatter.parseDateTime(it).plusMillis(offset);
                                    Formatter var46 = Formatter.INSTANCE;
                                    Intrinsics.checkNotNullExpressionValue(dt, "dt");
                                    String daycode = var46.getDayCodeFromDateTime(dt);
                                    event.getRepetitionExceptions().add(daycode);
                                } else {
                                    byte var60 = 0;
                                    byte var63 = 8;
                                    if (it == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }

                                    var10000 = it.substring(var60, var63);
                                    Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    String potentialTS = var10000;
                                    if (StringKt.areDigitsOnly(potentialTS)) {
                                        event.getRepetitionExceptions().add(potentialTS);
                                    }
                                }
                            }
                        }
                    }

                    if (importIdsMap.containsKey(event.getImportId())) {
                        existingEvent = (Event)importIdsMap.get(importId);
                        Intrinsics.checkNotNull(existingEvent);
                        Long originalEventId = existingEvent.getId();
                        int var52 = false;
                        existingEvent.setId((Long)null);
                        existingEvent.setColor(0);
                        existingEvent.setLastUpdated(0L);
                        existingEvent.setRepetitionExceptions(new ArrayList());
                        Unit var47 = Unit.INSTANCE;
                        if (existingEvent.hashCode() != event.hashCode()) {
                            CharSequence var51 = (CharSequence)title;
                            if (var51.length() > 0) {
                                event.setId(originalEventId);
                                EventsHelper.updateEvent$default(CalDAVHelper.this.eventsHelper, event, false, false, (Function0)null, 8, (Object)null);
                            }
                        }
                    } else {
                        CharSequence var49 = (CharSequence)title;
                        if (var49.length() > 0) {
                            ((Map)importIdsMap).put(event.getImportId(), event);
                            EventsHelper.insertEvent$default(CalDAVHelper.this.eventsHelper, event, false, false, (Function1)null, 8, (Object)null);
                        }
                    }

                }
            }
        }), 24, (Object)null);
        ArrayList eventIdsToDelete = new ArrayList();
        Set var33 = importIdsMap.keySet();
        Intrinsics.checkNotNullExpressionValue(var33, "importIdsMap.keys");
        Iterable $this$forEach$iv = (Iterable)var33;
        $i$f$forEach = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var17 = $this$forEach$iv.iterator();

        boolean $i$f$forEach;
        while(var17.hasNext()) {
            Object element$iv$iv = var17.next();
            String it = (String)element$iv$iv;
            $i$f$forEach = false;
            if (!fetchedEventIds.contains(it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        $this$forEach$iv = (Iterable)((List)destination$iv$iv);
        $i$f$forEach = false;
        Iterator var14 = $this$forEach$iv.iterator();

        while(var14.hasNext()) {
            Object element$iv = var14.next();
            String it = (String)element$iv;
            int var35 = false;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String caldavEventId = it;
            Iterable $this$forEach$iv = (Iterable)existingEvents;
            $i$f$forEach = false;
            Iterator var21 = $this$forEach$iv.iterator();

            while(var21.hasNext()) {
                Object element$iv = var21.next();
                Event it = (Event)element$iv;
                int var24 = false;
                if (Intrinsics.areEqual(it.getImportId(), caldavEventId)) {
                    Long var10001 = it.getId();
                    Intrinsics.checkNotNull(var10001);
                    eventIdsToDelete.add(var10001);
                }
            }
        }

        this.eventsHelper.deleteEvents(CollectionsKt.toMutableList((Collection)eventIdsToDelete), false);
    }

    @SuppressLint({"MissingPermission"})
    public final void insertCalDAVEvent(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Uri uri = Events.CONTENT_URI;
        ContentValues values = this.fillEventContentValues(event);
        Uri newUri = this.context.getContentResolver().insert(uri, values);
        int calendarId = event.getCalDAVCalendarId();
        Intrinsics.checkNotNull(newUri);
        String var10000 = newUri.getLastPathSegment();
        Intrinsics.checkNotNull(var10000);
        long eventRemoteID = Long.parseLong(var10000);
        event.setImportId(this.getCalDAVEventImportId(calendarId, eventRemoteID));
        this.setupCalDAVEventReminders(event);
        this.setupCalDAVEventAttendees(event);
        this.setupCalDAVEventImportId(event);
        this.refreshCalDAVCalendar(event);
    }

    public final void updateCalDAVEvent(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Uri uri = Events.CONTENT_URI;
        ContentValues values = this.fillEventContentValues(event);
        long eventRemoteID = event.getCalDAVEventId();
        event.setImportId(this.getCalDAVEventImportId(event.getCalDAVCalendarId(), eventRemoteID));
        Uri var10000 = ContentUris.withAppendedId(uri, eventRemoteID);
        Intrinsics.checkNotNullExpressionValue(var10000, "ContentUris.withAppendedId(uri, eventRemoteID)");
        Uri newUri = var10000;
        this.context.getContentResolver().update(newUri, values, (String)null, (String[])null);
        this.setupCalDAVEventReminders(event);
        this.setupCalDAVEventAttendees(event);
        this.setupCalDAVEventImportId(event);
        this.refreshCalDAVCalendar(event);
    }

    private final void setupCalDAVEventReminders(Event event) {
        this.clearEventReminders(event);
        Iterable $this$forEach$iv = (Iterable)event.getReminders();
        int $i$f$forEach = false;
        Iterator var4 = $this$forEach$iv.iterator();

        while(var4.hasNext()) {
            Object element$iv = var4.next();
            Reminder it = (Reminder)element$iv;
            int var7 = false;
            ContentValues var8 = new ContentValues();
            int var10 = false;
            var8.put("minutes", it.getMinutes());
            var8.put("method", it.getType() == 1 ? 2 : 1);
            var8.put("event_id", event.getCalDAVEventId());
            ContentValues contentValues = var8;

            try {
                this.context.getContentResolver().insert(Reminders.CONTENT_URI, contentValues);
            } catch (Exception var12) {
                com.simplemobiletools.commons.extensions.ContextKt.toast$default(this.context, 1900338, 0, 2, (Object)null);
            }
        }

    }

    private final void setupCalDAVEventAttendees(Event event) {
        this.clearEventAttendees(event);
        ArrayList var10000 = (ArrayList)(new Gson()).fromJson(event.getAttendees(), (new TypeToken() {
        }).getType());
        if (var10000 == null) {
            var10000 = new ArrayList();
        }

        ArrayList attendees = var10000;
        Iterable $this$forEach$iv = (Iterable)attendees;
        int $i$f$forEach = false;
        Iterator var5 = $this$forEach$iv.iterator();

        while(var5.hasNext()) {
            Object element$iv = var5.next();
            Attendee it = (Attendee)element$iv;
            int var8 = false;
            ContentValues var9 = new ContentValues();
            int var11 = false;
            var9.put("attendeeName", it.getName());
            var9.put("attendeeEmail", it.getEmail());
            var9.put("attendeeStatus", it.getStatus());
            var9.put("attendeeRelationship", it.getRelationship());
            var9.put("event_id", event.getCalDAVEventId());
            ContentValues contentValues = var9;

            try {
                this.context.getContentResolver().insert(Attendees.CONTENT_URI, contentValues);
            } catch (Exception var13) {
                com.simplemobiletools.commons.extensions.ContextKt.toast$default(this.context, 1900338, 0, 2, (Object)null);
            }
        }

    }

    private final void setupCalDAVEventImportId(Event event) {
        EventsDao var10000 = ContextKt.getEventsDB(this.context);
        String var10001 = event.getImportId();
        String var10002 = "Caldav-" + event.getCalDAVCalendarId();
        Long var10003 = event.getId();
        Intrinsics.checkNotNull(var10003);
        var10000.updateEventImportIdAndSource(var10001, var10002, var10003);
    }

    private final ContentValues fillEventContentValues(Event event) {
        ContentValues var2 = new ContentValues();
        int var4 = false;
        var2.put("calendar_id", event.getCalDAVCalendarId());
        var2.put("title", event.getTitle());
        var2.put("description", event.getDescription());
        var2.put("dtstart", event.getStartTS() * 1000L);
        var2.put("allDay", event.getIsAllDay() ? 1 : 0);
        var2.put("eventTimezone", event.getTimeZoneString());
        var2.put("eventLocation", event.getLocation());
        var2.put("eventStatus", 1);
        var2.put("availability", event.getAvailability());
        String repeatRule = (new Parser()).getRepeatCode(event);
        CharSequence var6 = (CharSequence)repeatRule;
        if (var6.length() == 0) {
            var2.putNull("rrule");
        } else {
            var2.put("rrule", repeatRule);
        }

        if (event.getIsAllDay() && event.getEndTS() >= event.getStartTS()) {
            event.setEndTS(event.getEndTS() + (long)86400);
        }

        if (event.getRepeatInterval() > 0) {
            var2.put("duration", this.getDurationCode(event));
            var2.putNull("dtend");
        } else {
            var2.put("dtend", event.getEndTS() * 1000L);
            var2.putNull("duration");
        }

        return var2;
    }

    private final void clearEventReminders(Event event) {
        String selection = "event_id = ?";
        String[] selectionArgs = new String[]{String.valueOf(event.getCalDAVEventId())};
        this.context.getContentResolver().delete(Reminders.CONTENT_URI, selection, selectionArgs);
    }

    private final void clearEventAttendees(Event event) {
        String selection = "event_id = ?";
        String[] selectionArgs = new String[]{String.valueOf(event.getCalDAVEventId())};
        this.context.getContentResolver().delete(Attendees.CONTENT_URI, selection, selectionArgs);
    }

    private final String getDurationCode(Event event) {
        String var10000;
        if (event.getIsAllDay()) {
            long dur = Math.max(1L, (event.getEndTS() - event.getStartTS()) / (long)86400);
            var10000 = "" + 'P' + dur + 'D';
        } else {
            var10000 = (new Parser()).getDurationCode((event.getEndTS() - event.getStartTS()) / 60L);
        }

        return var10000;
    }

    public final void deleteCalDAVCalendarEvents(long calendarId) {
        List eventIds = CollectionsKt.toMutableList((Collection)ContextKt.getEventsDB(this.context).getCalDAVCalendarEvents("Caldav-" + calendarId));
        this.eventsHelper.deleteEvents(eventIds, false);
    }

    public final void deleteCalDAVEvent(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Uri uri = Events.CONTENT_URI;
        Uri var10000 = ContentUris.withAppendedId(uri, event.getCalDAVEventId());
        Intrinsics.checkNotNullExpressionValue(var10000, "ContentUris.withAppended…event.getCalDAVEventId())");
        Uri contentUri = var10000;

        try {
            this.context.getContentResolver().delete(contentUri, (String)null, (String[])null);
        } catch (Exception var5) {
        }

        this.refreshCalDAVCalendar(event);
    }

    public final void insertEventRepeatException(@NotNull Event event, long occurrenceTS) {
        Intrinsics.checkNotNullParameter(event, "event");
        Uri uri = Events.CONTENT_URI;
        ContentValues values = this.fillEventRepeatExceptionValues(event, occurrenceTS);

        try {
            this.context.getContentResolver().insert(uri, values);
            this.refreshCalDAVCalendar(event);
        } catch (Exception var7) {
            com.simplemobiletools.commons.extensions.ContextKt.showErrorToast$default(this.context, var7, 0, 2, (Object)null);
        }

    }

    private final ContentValues fillEventRepeatExceptionValues(Event event, long occurrenceTS) {
        ContentValues var4 = new ContentValues();
        int var6 = false;
        var4.put("calendar_id", event.getCalDAVCalendarId());
        var4.put("dtstart", occurrenceTS);
        var4.put("dtend", occurrenceTS + (event.getEndTS() - event.getStartTS()));
        var4.put("original_id", event.getCalDAVEventId());
        TimeZone var10002 = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(var10002, "TimeZone.getDefault()");
        var4.put("eventTimezone", var10002.getID().toString());
        var4.put("originalInstanceTime", occurrenceTS * 1000L);
        var4.put("exdate", Formatter.INSTANCE.getDayCodeFromTS(occurrenceTS));
        return var4;
    }

    private final List getCalDAVEventReminders(long eventId) {
        final ArrayList reminders = new ArrayList();
        Uri uri = Reminders.CONTENT_URI;
        String[] projection = new String[]{"minutes", "method"};
        String selection = "event_id = " + eventId;
        Context var10000 = this.context;
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        com.simplemobiletools.commons.extensions.ContextKt.queryCursor$default(var10000, uri, projection, selection, (String[])null, (String)null, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Cursor)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                int minutes = CursorKt.getIntValue(cursor, "minutes");
                int method = CursorKt.getIntValue(cursor, "method");
                if (method == 1 || method == 2) {
                    int type = method == 2 ? 1 : 0;
                    Reminder reminder = new Reminder(minutes, type);
                    reminders.add(reminder);
                }

            }
        }), 56, (Object)null);
        Iterable $this$sortedBy$iv = (Iterable)reminders;
        int $i$f$sortedBy = false;
        boolean var9 = false;
        return CollectionsKt.sortedWith($this$sortedBy$iv, (Comparator)(new CalDAVHelper$getCalDAVEventReminders$$inlined$sortedBy$1()));
    }

    private final List getCalDAVEventAttendees(long eventId) {
        final ArrayList attendees = new ArrayList();
        Uri uri = Attendees.CONTENT_URI;
        String[] projection = new String[]{"attendeeName", "attendeeEmail", "attendeeStatus", "attendeeRelationship"};
        String selection = "event_id = " + eventId;
        Context var10000 = this.context;
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        com.simplemobiletools.commons.extensions.ContextKt.queryCursor$default(var10000, uri, projection, selection, (String[])null, (String)null, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Cursor)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                String var10000 = CursorKt.getStringValue(cursor, "attendeeName");
                if (var10000 == null) {
                    var10000 = "";
                }

                String name = var10000;
                var10000 = CursorKt.getStringValue(cursor, "attendeeEmail");
                if (var10000 == null) {
                    var10000 = "";
                }

                String email = var10000;
                int status = CursorKt.getIntValue(cursor, "attendeeStatus");
                int relationship = CursorKt.getIntValue(cursor, "attendeeRelationship");
                Attendee attendee = new Attendee(0, name, email, status, "", false, relationship);
                attendees.add(attendee);
            }
        }), 56, (Object)null);
        return (List)attendees;
    }

    private final String getCalDAVEventImportId(int calendarId, long eventId) {
        return "Caldav-" + calendarId + '-' + eventId;
    }

    private final void refreshCalDAVCalendar(Event event) {
        ContextKt.refreshCalDAVCalendars(this.context, (com.simplemobiletools.calendar.pro.extensions.String)String.valueOf(event.getCalDAVCalendarId()), false);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public CalDAVHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super();
        this.context = context;
        this.eventsHelper = ContextKt.getEventsHelper(this.context);
    }
}
// CalDAVHelper$getCalDAVEventReminders$$inlined$sortedBy$1.java
package com.simplemobiletools.calendar.pro.helpers;

    import com.simplemobiletools.calendar.pro.models.Reminder;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}
)
public final class CalDAVHelper$getCalDAVEventReminders$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object a, Object b) {
        boolean var3 = false;
        Reminder it = (Reminder)a;
        int var5 = false;
        Comparable var10000 = (Comparable)it.getMinutes();
        it = (Reminder)b;
        Comparable var6 = var10000;
        var5 = false;
        Integer var7 = it.getMinutes();
        return ComparisonsKt.compareValues(var6, (Comparable)var7);
    }
}
