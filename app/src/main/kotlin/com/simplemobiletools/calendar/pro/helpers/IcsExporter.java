package com.simplemobiletools.calendar.pro.helpers;

import android.content.Context;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.models.CalDAVCalendar;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.calendar.pro.models.Reminder;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.extensions.BufferedWriterKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J[\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0006j\b\u0012\u0004\u0012\u00020\u0012`\b2\u0006\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\f0\u0016J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/IcsExporter;", "", "()V", "MAX_LINE_LENGTH", "", "calendars", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/CalDAVCalendar;", "Lkotlin/collections/ArrayList;", "eventsExported", "eventsFailed", "exportEvents", "", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "outputStream", "Ljava/io/OutputStream;", "events", "Lcom/simplemobiletools/calendar/pro/models/Event;", "showExportingToast", "", "callback", "Lkotlin/Function1;", "Lcom/simplemobiletools/calendar/pro/helpers/IcsExporter$ExportResult;", "Lkotlin/ParameterName;", "name", "result", "fillDescription", "description", "", "out", "Ljava/io/BufferedWriter;", "fillIgnoredOccurrences", "event", "fillReminders", "reminderLabel", "ExportResult", "Simple-Calendar.app"}
)
public final class IcsExporter {
    private final int MAX_LINE_LENGTH = 75;
    private int eventsExported;
    private int eventsFailed;
    private ArrayList calendars = new ArrayList();

    public final void exportEvents(@NotNull final BaseSimpleActivity activity, @Nullable final OutputStream outputStream, @NotNull final ArrayList events, final boolean showExportingToast, @NotNull final Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (outputStream == null) {
            callback.invoke(IcsExporter.ExportResult.EXPORT_FAIL);
        } else {
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    String var10000 = activity.getString(1900198);
                    Intrinsics.checkNotNullExpressionValue(var10000, "activity.getString(R.string.reminder)");
                    String reminderLabel = var10000;
                    String exportTime = Formatter.INSTANCE.getExportedTime(System.currentTimeMillis());
                    IcsExporter.this.calendars = ContextKt.getCalDAVHelper((Context)activity).getCalDAVCalendars("", false);
                    if (showExportingToast) {
                        com.simplemobiletools.commons.extensions.ContextKt.toast$default((Context)activity, 1900917, 0, 2, (Object)null);
                    }

                    OutputStream var3 = outputStream;
                    Charset var4 = Charsets.UTF_8;
                    boolean var7 = false;
                    Writer var6 = (Writer)(new OutputStreamWriter(var3, var4));
                    short var24 = 8192;
                    boolean var8 = false;
                    Closeable var20 = (Closeable)(var6 instanceof BufferedWriter ? (BufferedWriter)var6 : new BufferedWriter(var6, var24));
                    Throwable var21 = null;

                    try {
                        BufferedWriter out = (BufferedWriter)var20;
                        int var23 = false;
                        BufferedWriterKt.writeLn(out, "BEGIN:VCALENDAR");
                        BufferedWriterKt.writeLn(out, "PRODID:-//Simple Mobile Tools//NONSGML Event Calendar//EN");
                        BufferedWriterKt.writeLn(out, "VERSION:2.0");
                        Iterator var25 = events.iterator();

                        while(var25.hasNext()) {
                            Event event = (Event)var25.next();
                            BufferedWriterKt.writeLn(out, "BEGIN:VEVENT");
                            String var9 = StringsKt.replace$default(event.getTitle(), "\n", "\\n", false, 4, (Object)null);
                            int var12 = false;
                            CharSequence var13 = (CharSequence)var9;
                            if (var13.length() > 0) {
                                BufferedWriterKt.writeLn(out, "SUMMARY:" + var9);
                            }

                            var9 = event.getImportId();
                            var12 = false;
                            var13 = (CharSequence)var9;
                            if (var13.length() > 0) {
                                BufferedWriterKt.writeLn(out, "UID:" + var9);
                            }

                            long var27 = event.getEventType();
                            int var30 = false;
                            StringBuilder var10001 = (new StringBuilder()).append("X-SMT-CATEGORY-COLOR:");
                            EventType var10002 = ContextKt.getEventTypesDB((Context)activity).getEventTypeWithId(var27);
                            BufferedWriterKt.writeLn(out, var10001.append(var10002 != null ? var10002.getColor() : null).toString());
                            var27 = event.getEventType();
                            var30 = false;
                            var10001 = (new StringBuilder()).append("CATEGORIES:");
                            var10002 = ContextKt.getEventTypesDB((Context)activity).getEventTypeWithId(var27);
                            BufferedWriterKt.writeLn(out, var10001.append(var10002 != null ? var10002.getTitle() : null).toString());
                            var27 = event.getLastUpdated();
                            var30 = false;
                            BufferedWriterKt.writeLn(out, "LAST-MODIFIED:" + Formatter.INSTANCE.getExportedTime(var27));
                            var9 = event.getLocation();
                            var12 = false;
                            BufferedWriterKt.writeLn(out, "LOCATION:" + var9);
                            int var28 = event.getAvailability();
                            var12 = false;
                            BufferedWriterKt.writeLn(out, "TRANSP:" + (var28 == 1 ? "TRANSPARENT" : "OPAQUE"));
                            if (event.getIsAllDay()) {
                                BufferedWriterKt.writeLn(out, "DTSTART;VALUE=DATE:" + Formatter.INSTANCE.getDayCodeFromTS(event.getStartTS()));
                                BufferedWriterKt.writeLn(out, "DTEND;VALUE=DATE:" + Formatter.INSTANCE.getDayCodeFromTS(event.getEndTS() + (long)86400));
                            } else {
                                var27 = event.getStartTS();
                                var30 = false;
                                BufferedWriterKt.writeLn(out, "DTSTART:" + Formatter.INSTANCE.getExportedTime(var27 * 1000L));
                                var27 = event.getEndTS();
                                var30 = false;
                                BufferedWriterKt.writeLn(out, "DTEND:" + Formatter.INSTANCE.getExportedTime(var27 * 1000L));
                            }

                            boolean var29 = event.hasMissingYear();
                            var12 = false;
                            BufferedWriterKt.writeLn(out, "X-SMT-MISSING-YEAR:" + (var29 ? 1 : 0));
                            BufferedWriterKt.writeLn(out, "DTSTAMP:" + exportTime);
                            BufferedWriterKt.writeLn(out, "STATUS:CONFIRMED");
                            Parser var31 = new Parser();
                            Intrinsics.checkNotNullExpressionValue(event, "event");
                            var9 = var31.getRepeatCode(event);
                            var12 = false;
                            var13 = (CharSequence)var9;
                            if (var13.length() > 0) {
                                BufferedWriterKt.writeLn(out, "RRULE:" + var9);
                            }

                            IcsExporter.this.fillDescription(StringsKt.replace$default(event.getDescription(), "\n", "\\n", false, 4, (Object)null), out);
                            IcsExporter.this.fillReminders(event, out, reminderLabel);
                            IcsExporter.this.fillIgnoredOccurrences(event, out);
                            IcsExporter var32 = IcsExporter.this;
                            var32.eventsExported = var32.eventsExported + 1;
                            BufferedWriterKt.writeLn(out, "END:VEVENT");
                        }

                        BufferedWriterKt.writeLn(out, "END:VCALENDAR");
                        Unit var22 = Unit.INSTANCE;
                    } catch (Throwable var18) {
                        var21 = var18;
                        throw var18;
                    } finally {
                        CloseableKt.closeFinally(var20, var21);
                    }

                    callback.invoke(IcsExporter.this.eventsExported == 0 ? IcsExporter.ExportResult.EXPORT_FAIL : (IcsExporter.this.eventsFailed > 0 ? IcsExporter.ExportResult.EXPORT_PARTIAL : IcsExporter.ExportResult.EXPORT_OK));
                }
            }));
        }
    }

    private final void fillReminders(Event event, BufferedWriter out, String reminderLabel) {
        Iterable $this$forEach$iv = (Iterable)event.getReminders();
        int $i$f$forEach = false;
        Iterator var6 = $this$forEach$iv.iterator();

        while(var6.hasNext()) {
            Object element$iv = var6.next();
            Reminder it = (Reminder)element$iv;
            int var9 = false;
            int var13 = false;
            BufferedWriterKt.writeLn(out, "BEGIN:VALARM");
            BufferedWriterKt.writeLn(out, "DESCRIPTION:" + reminderLabel);
            String attendee;
            if (it.getType() == 0) {
                BufferedWriterKt.writeLn(out, "ACTION:DISPLAY");
            } else {
                BufferedWriterKt.writeLn(out, "ACTION:EMAIL");
                Iterable $this$firstOrNull$iv = (Iterable)this.calendars;
                int $i$f$firstOrNull = false;
                Iterator var16 = $this$firstOrNull$iv.iterator();

                Object var10000;
                while(true) {
                    if (var16.hasNext()) {
                        Object element$iv = var16.next();
                        CalDAVCalendar it = (CalDAVCalendar)element$iv;
                        int var19 = false;
                        if (it.getId() != event.getCalDAVCalendarId()) {
                            continue;
                        }

                        var10000 = element$iv;
                        break;
                    }

                    var10000 = null;
                    break;
                }

                attendee = (CalDAVCalendar)var10000 != null ? ((CalDAVCalendar)var10000).getAccountName() : null;
                if (attendee != null) {
                    BufferedWriterKt.writeLn(out, "ATTENDEE:mailto:" + attendee);
                }
            }

            attendee = it.getMinutes() < -1 ? "" : "-";
            BufferedWriterKt.writeLn(out, "TRIGGER:" + attendee + (new Parser()).getDurationCode(Math.abs((long)it.getMinutes())));
            BufferedWriterKt.writeLn(out, "END:VALARM");
        }

    }

    private final void fillIgnoredOccurrences(Event event, BufferedWriter out) {
        Iterable $this$forEach$iv = (Iterable)event.getRepetitionExceptions();
        int $i$f$forEach = false;
        Iterator var5 = $this$forEach$iv.iterator();

        while(var5.hasNext()) {
            Object element$iv = var5.next();
            String it = (String)element$iv;
            int var8 = false;
            BufferedWriterKt.writeLn(out, "EXDATE:" + it);
        }

    }

    private final void fillDescription(String description, BufferedWriter out) {
        int index = 0;

        boolean isFirstLine;
        for(isFirstLine = true; index < description.length(); index += this.MAX_LINE_LENGTH) {
            int var7 = Math.min(index + this.MAX_LINE_LENGTH, description.length());
            if (description == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            String var10000 = description.substring(index, var7);
            Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring = var10000;
            if (isFirstLine) {
                BufferedWriterKt.writeLn(out, "DESCRIPTION:" + substring);
            } else {
                BufferedWriterKt.writeLn(out, '\t' + substring);
            }

            isFirstLine = false;
        }

        if (isFirstLine) {
            BufferedWriterKt.writeLn(out, "DESCRIPTION:" + description);
        }

    }

    // $FF: synthetic method
    public static final ArrayList access$getCalendars$p(IcsExporter $this) {
        return $this.calendars;
    }

    // $FF: synthetic method
    public static final void access$setEventsFailed$p(IcsExporter $this, int var1) {
        $this.eventsFailed = var1;
    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/IcsExporter$ExportResult;", "", "(Ljava/lang/String;I)V", "EXPORT_FAIL", "EXPORT_OK", "EXPORT_PARTIAL", "Simple-Calendar.app"}
    )
    public static enum ExportResult {
        EXPORT_FAIL,
        EXPORT_OK,
        EXPORT_PARTIAL;
    }
}
