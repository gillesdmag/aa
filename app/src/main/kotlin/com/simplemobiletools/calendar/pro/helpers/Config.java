package com.simplemobiletools.calendar.pro.helpers;

import android.content.Context;
import android.media.RingtoneManager;
import com.simplemobiletools.commons.extensions.ContextKt;
import com.simplemobiletools.commons.helpers.BaseConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\be\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 »\u00012\u00020\u0001:\u0002»\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010²\u0001\u001a\u00030³\u00012\u0007\u0010´\u0001\u001a\u00020#J\u0019\u0010µ\u0001\u001a\u00030³\u00012\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020#0GH\u0002J\u0011\u0010·\u0001\u001a\u00030³\u00012\u0007\u0010´\u0001\u001a\u00020#J\r\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020/0\u0016J\r\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0017\u0010º\u0001\u001a\u00030³\u00012\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020#0GR$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020/2\u0006\u0010.\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R$\u00107\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R$\u0010:\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R$\u0010=\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R$\u0010@\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\b\"\u0004\bB\u0010\nR$\u0010C\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\b\"\u0004\bE\u0010\nR0\u0010F\u001a\b\u0012\u0004\u0012\u00020#0G2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020#0G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010L\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R$\u0010O\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010\b\"\u0004\bQ\u0010\nR$\u0010R\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\b\"\u0004\bT\u0010\nR$\u0010U\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010+\"\u0004\bW\u0010-R$\u0010Y\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010+\"\u0004\b[\u0010-R$\u0010\\\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010+\"\u0004\b^\u0010-R$\u0010_\u001a\u00020\u00172\u0006\u0010_\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010+\"\u0004\ba\u0010-R$\u0010b\u001a\u00020#2\u0006\u0010b\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010&\"\u0004\bd\u0010(R$\u0010e\u001a\u00020/2\u0006\u0010e\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u00101\"\u0004\bg\u00103R$\u0010h\u001a\u00020#2\u0006\u0010h\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010&\"\u0004\bj\u0010(R$\u0010l\u001a\u00020\u00172\u0006\u0010k\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010+\"\u0004\bn\u0010-R$\u0010o\u001a\u00020/2\u0006\u0010o\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u00101\"\u0004\bq\u00103R$\u0010r\u001a\u00020\u00062\u0006\u0010r\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010\b\"\u0004\bt\u0010\nR$\u0010v\u001a\u00020\u00172\u0006\u0010u\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010+\"\u0004\bx\u0010-R$\u0010y\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010\b\"\u0004\b{\u0010\nR$\u0010|\u001a\u00020\u00062\u0006\u0010|\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010\b\"\u0004\b~\u0010\nR2\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020#0G2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020#0G8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010I\"\u0005\b\u0081\u0001\u0010KR(\u0010\u0082\u0001\u001a\u00020\u00172\u0007\u0010\u0082\u0001\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010+\"\u0005\b\u0084\u0001\u0010-R(\u0010\u0085\u0001\u001a\u00020#2\u0007\u0010\u0085\u0001\u001a\u00020#8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010&\"\u0005\b\u0087\u0001\u0010(R(\u0010\u0088\u0001\u001a\u00020#2\u0007\u0010\u0088\u0001\u001a\u00020#8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010&\"\u0005\b\u008a\u0001\u0010(R(\u0010\u008b\u0001\u001a\u00020\u00062\u0007\u0010\u008b\u0001\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010\b\"\u0005\b\u008d\u0001\u0010\nR(\u0010\u008e\u0001\u001a\u00020\u00062\u0007\u0010\u008e\u0001\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010\b\"\u0005\b\u0090\u0001\u0010\nR(\u0010\u0092\u0001\u001a\u00020\u00062\u0007\u0010\u0091\u0001\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0093\u0001\u0010\b\"\u0005\b\u0094\u0001\u0010\nR(\u0010\u0095\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010\b\"\u0005\b\u0097\u0001\u0010\nR(\u0010\u0098\u0001\u001a\u00020\u00062\u0007\u0010\u0098\u0001\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010\b\"\u0005\b\u009a\u0001\u0010\nR(\u0010\u009b\u0001\u001a\u00020\u00172\u0007\u0010\u009b\u0001\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010+\"\u0005\b\u009d\u0001\u0010-R(\u0010\u009f\u0001\u001a\u00020\u00172\u0007\u0010\u009e\u0001\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b \u0001\u0010+\"\u0005\b¡\u0001\u0010-R(\u0010¢\u0001\u001a\u00020\u00062\u0007\u0010¢\u0001\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b£\u0001\u0010\b\"\u0005\b¤\u0001\u0010\nR(\u0010¦\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b§\u0001\u0010\b\"\u0005\b¨\u0001\u0010\nR(\u0010©\u0001\u001a\u00020\u00172\u0007\u0010©\u0001\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bª\u0001\u0010+\"\u0005\b«\u0001\u0010-R,\u0010¬\u0001\u001a\u00030\u00ad\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001¨\u0006¼\u0001"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/Config;", "Lcom/simplemobiletools/commons/helpers/BaseConfig;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addAnniversariesAutomatically", "", "getAddAnniversariesAutomatically", "()Z", "setAddAnniversariesAutomatically", "(Z)V", "addBirthdaysAutomatically", "getAddBirthdaysAutomatically", "setAddBirthdaysAutomatically", "allowChangingTimeZones", "getAllowChangingTimeZones", "setAllowChangingTimeZones", "allow", "allowCustomizeDayCount", "getAllowCustomizeDayCount", "setAllowCustomizeDayCount", "anniversaryReminders", "Ljava/util/ArrayList;", "", "getAnniversaryReminders", "()Ljava/util/ArrayList;", "setAnniversaryReminders", "(Ljava/util/ArrayList;)V", "birthdayReminders", "getBirthdayReminders", "setBirthdayReminders", "caldavSync", "getCaldavSync", "setCaldavSync", "calendarIDs", "", "caldavSyncedCalendarIds", "getCaldavSyncedCalendarIds", "()Ljava/lang/String;", "setCaldavSyncedCalendarIds", "(Ljava/lang/String;)V", "defaultDuration", "getDefaultDuration", "()I", "setDefaultDuration", "(I)V", "defaultEventTypeId", "", "getDefaultEventTypeId", "()J", "setDefaultEventTypeId", "(J)V", "defaultReminder1", "getDefaultReminder1", "setDefaultReminder1", "defaultReminder2", "getDefaultReminder2", "setDefaultReminder2", "defaultReminder3", "getDefaultReminder3", "setDefaultReminder3", "defaultStartTime", "getDefaultStartTime", "setDefaultStartTime", "dimPastEvents", "getDimPastEvents", "setDimPastEvents", "displayDescription", "getDisplayDescription", "setDisplayDescription", "displayEventTypes", "", "getDisplayEventTypes", "()Ljava/util/Set;", "setDisplayEventTypes", "(Ljava/util/Set;)V", "displayPastEvents", "getDisplayPastEvents", "setDisplayPastEvents", "exportPastEvents", "getExportPastEvents", "setExportPastEvents", "highlightWeekends", "getHighlightWeekends", "setHighlightWeekends", "highlightWeekendsColor", "getHighlightWeekendsColor", "setHighlightWeekendsColor", "lastEventReminderMinutes", "lastEventReminderMinutes1", "getLastEventReminderMinutes1", "setLastEventReminderMinutes1", "lastEventReminderMinutes2", "getLastEventReminderMinutes2", "setLastEventReminderMinutes2", "lastEventReminderMinutes3", "getLastEventReminderMinutes3", "setLastEventReminderMinutes3", "lastExportPath", "getLastExportPath", "setLastExportPath", "lastReminderChannel", "getLastReminderChannel", "setLastReminderChannel", "lastSoundUri", "getLastSoundUri", "setLastSoundUri", "calendarId", "lastUsedCaldavCalendarId", "getLastUsedCaldavCalendarId", "setLastUsedCaldavCalendarId", "lastUsedLocalEventTypeId", "getLastUsedLocalEventTypeId", "setLastUsedLocalEventTypeId", "lastVibrateOnReminder", "getLastVibrateOnReminder", "setLastVibrateOnReminder", "viewToOpenFromListWidget", "listWidgetViewToOpen", "getListWidgetViewToOpen", "setListWidgetViewToOpen", "loopReminders", "getLoopReminders", "setLoopReminders", "pullToRefresh", "getPullToRefresh", "setPullToRefresh", "quickFilterEventTypes", "getQuickFilterEventTypes", "setQuickFilterEventTypes", "reminderAudioStream", "getReminderAudioStream", "setReminderAudioStream", "reminderSoundTitle", "getReminderSoundTitle", "setReminderSoundTitle", "reminderSoundUri", "getReminderSoundUri", "setReminderSoundUri", "replaceDescription", "getReplaceDescription", "setReplaceDescription", "showGrid", "getShowGrid", "setShowGrid", "midnightSpanning", "showMidnightSpanningEventsAtTop", "getShowMidnightSpanningEventsAtTop", "setShowMidnightSpanningEventsAtTop", "showWeekNumbers", "getShowWeekNumbers", "setShowWeekNumbers", "startWeekWithCurrentDay", "getStartWeekWithCurrentDay", "setStartWeekWithCurrentDay", "startWeeklyAt", "getStartWeeklyAt", "setStartWeeklyAt", "view", "storedView", "getStoredView", "setStoredView", "usePreviousEventReminders", "getUsePreviousEventReminders", "setUsePreviousEventReminders", "vibrate", "vibrateOnReminder", "getVibrateOnReminder", "setVibrateOnReminder", "weeklyViewDays", "getWeeklyViewDays", "setWeeklyViewDays", "weeklyViewItemHeightMultiplier", "", "getWeeklyViewItemHeightMultiplier", "()F", "setWeeklyViewItemHeightMultiplier", "(F)V", "addDisplayEventType", "", "type", "addDisplayEventTypes", "types", "addQuickFilterEventType", "getDisplayEventTypessAsList", "getSyncedCalendarIdsAsList", "removeDisplayEventTypes", "Companion", "Simple-Calendar.app"}
)
public final class Config extends BaseConfig {
    @NotNull
    public static final Config.Companion Companion = new Config.Companion((DefaultConstructorMarker)null);

    public final boolean getShowWeekNumbers() {
        return this.getPrefs().getBoolean("week_numbers", false);
    }

    public final void setShowWeekNumbers(boolean showWeekNumbers) {
        this.getPrefs().edit().putBoolean("week_numbers", showWeekNumbers).apply();
    }

    public final int getStartWeeklyAt() {
        return this.getPrefs().getInt("start_weekly_at", 7);
    }

    public final void setStartWeeklyAt(int startWeeklyAt) {
        this.getPrefs().edit().putInt("start_weekly_at", startWeeklyAt).apply();
    }

    public final boolean getStartWeekWithCurrentDay() {
        return this.getPrefs().getBoolean("start_week_with_current_day", false);
    }

    public final void setStartWeekWithCurrentDay(boolean startWeekWithCurrentDay) {
        this.getPrefs().edit().putBoolean("start_week_with_current_day", startWeekWithCurrentDay).apply();
    }

    public final boolean getShowMidnightSpanningEventsAtTop() {
        return this.getPrefs().getBoolean("show_midnight_spanning_events_at_top", true);
    }

    public final void setShowMidnightSpanningEventsAtTop(boolean midnightSpanning) {
        this.getPrefs().edit().putBoolean("show_midnight_spanning_events_at_top", midnightSpanning).apply();
    }

    public final boolean getAllowCustomizeDayCount() {
        return this.getPrefs().getBoolean("allow_customise_day_count", true);
    }

    public final void setAllowCustomizeDayCount(boolean allow) {
        this.getPrefs().edit().putBoolean("allow_customise_day_count", allow).apply();
    }

    public final boolean getVibrateOnReminder() {
        return this.getPrefs().getBoolean("vibrate", false);
    }

    public final void setVibrateOnReminder(boolean vibrate) {
        this.getPrefs().edit().putBoolean("vibrate", vibrate).apply();
    }

    @NotNull
    public final String getReminderSoundUri() {
        String var10000 = this.getPrefs().getString("reminder_sound_uri", RingtoneManager.getDefaultUri(2).toString());
        Intrinsics.checkNotNull(var10000);
        return var10000;
    }

    public final void setReminderSoundUri(@NotNull String reminderSoundUri) {
        Intrinsics.checkNotNullParameter(reminderSoundUri, "reminderSoundUri");
        this.getPrefs().edit().putString("reminder_sound_uri", reminderSoundUri).apply();
    }

    @NotNull
    public final String getReminderSoundTitle() {
        String var10000 = this.getPrefs().getString("reminder_sound_title", ContextKt.getDefaultAlarmTitle(this.getContext(), 2));
        Intrinsics.checkNotNull(var10000);
        return var10000;
    }

    public final void setReminderSoundTitle(@NotNull String reminderSoundTitle) {
        Intrinsics.checkNotNullParameter(reminderSoundTitle, "reminderSoundTitle");
        this.getPrefs().edit().putString("reminder_sound_title", reminderSoundTitle).apply();
    }

    @NotNull
    public final String getLastSoundUri() {
        String var10000 = this.getPrefs().getString("last_sound_uri", "");
        Intrinsics.checkNotNull(var10000);
        return var10000;
    }

    public final void setLastSoundUri(@NotNull String lastSoundUri) {
        Intrinsics.checkNotNullParameter(lastSoundUri, "lastSoundUri");
        this.getPrefs().edit().putString("last_sound_uri", lastSoundUri).apply();
    }

    public final long getLastReminderChannel() {
        return this.getPrefs().getLong("last_reminder_channel_ID", 0L);
    }

    public final void setLastReminderChannel(long lastReminderChannel) {
        this.getPrefs().edit().putLong("last_reminder_channel_ID", lastReminderChannel).apply();
    }

    public final int getStoredView() {
        return this.getPrefs().getInt("view", 1);
    }

    public final void setStoredView(int view) {
        this.getPrefs().edit().putInt("view", view).apply();
    }

    public final int getLastEventReminderMinutes1() {
        return this.getPrefs().getInt("reminder_minutes", 10);
    }

    public final void setLastEventReminderMinutes1(int lastEventReminderMinutes) {
        this.getPrefs().edit().putInt("reminder_minutes", lastEventReminderMinutes).apply();
    }

    public final int getLastEventReminderMinutes2() {
        return this.getPrefs().getInt("reminder_minutes_2", -1);
    }

    public final void setLastEventReminderMinutes2(int lastEventReminderMinutes2) {
        this.getPrefs().edit().putInt("reminder_minutes_2", lastEventReminderMinutes2).apply();
    }

    public final int getLastEventReminderMinutes3() {
        return this.getPrefs().getInt("reminder_minutes_3", -1);
    }

    public final void setLastEventReminderMinutes3(int lastEventReminderMinutes3) {
        this.getPrefs().edit().putInt("reminder_minutes_3", lastEventReminderMinutes3).apply();
    }

    public final int getDisplayPastEvents() {
        return this.getPrefs().getInt("display_past_events", 1440);
    }

    public final void setDisplayPastEvents(int displayPastEvents) {
        this.getPrefs().edit().putInt("display_past_events", displayPastEvents).apply();
    }

    @NotNull
    public final Set getDisplayEventTypes() {
        Set var10000 = this.getPrefs().getStringSet("display_event_types", (Set)(new HashSet()));
        Intrinsics.checkNotNull(var10000);
        return var10000;
    }

    public final void setDisplayEventTypes(@NotNull Set displayEventTypes) {
        Intrinsics.checkNotNullParameter(displayEventTypes, "displayEventTypes");
        this.getPrefs().edit().remove("display_event_types").putStringSet("display_event_types", displayEventTypes).apply();
    }

    @NotNull
    public final Set getQuickFilterEventTypes() {
        Set var10000 = this.getPrefs().getStringSet("quick_filter_event_types", (Set)(new HashSet()));
        Intrinsics.checkNotNull(var10000);
        return var10000;
    }

    public final void setQuickFilterEventTypes(@NotNull Set quickFilterEventTypes) {
        Intrinsics.checkNotNullParameter(quickFilterEventTypes, "quickFilterEventTypes");
        this.getPrefs().edit().remove("quick_filter_event_types").putStringSet("quick_filter_event_types", quickFilterEventTypes).apply();
    }

    public final void addQuickFilterEventType(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        HashSet currQuickFilterEventTypes = new HashSet((Collection)this.getQuickFilterEventTypes());
        currQuickFilterEventTypes.add(type);
        this.setQuickFilterEventTypes((Set)currQuickFilterEventTypes);
    }

    public final int getListWidgetViewToOpen() {
        return this.getPrefs().getInt("list_widget_view_to_open", 5);
    }

    public final void setListWidgetViewToOpen(int viewToOpenFromListWidget) {
        this.getPrefs().edit().putInt("list_widget_view_to_open", viewToOpenFromListWidget).apply();
    }

    public final boolean getCaldavSync() {
        return this.getPrefs().getBoolean("caldav_sync", false);
    }

    public final void setCaldavSync(boolean caldavSync) {
        com.simplemobiletools.calendar.pro.extensions.ContextKt.scheduleCalDAVSync(this.getContext(), caldavSync);
        this.getPrefs().edit().putBoolean("caldav_sync", caldavSync).apply();
    }

    @NotNull
    public final String getCaldavSyncedCalendarIds() {
        String var10000 = this.getPrefs().getString("caldav_synced_calendar_ids", "");
        Intrinsics.checkNotNull(var10000);
        return var10000;
    }

    public final void setCaldavSyncedCalendarIds(@NotNull String calendarIDs) {
        Intrinsics.checkNotNullParameter(calendarIDs, "calendarIDs");
        this.getPrefs().edit().putString("caldav_synced_calendar_ids", calendarIDs).apply();
    }

    public final int getLastUsedCaldavCalendarId() {
        return this.getPrefs().getInt("last_used_caldav_calendar", ((Number)CollectionsKt.first((List)this.getSyncedCalendarIdsAsList())).intValue());
    }

    public final void setLastUsedCaldavCalendarId(int calendarId) {
        this.getPrefs().edit().putInt("last_used_caldav_calendar", calendarId).apply();
    }

    public final long getLastUsedLocalEventTypeId() {
        return this.getPrefs().getLong("last_used_local_event_type_id", 1L);
    }

    public final void setLastUsedLocalEventTypeId(long lastUsedLocalEventTypeId) {
        this.getPrefs().edit().putLong("last_used_local_event_type_id", lastUsedLocalEventTypeId).apply();
    }

    public final int getReminderAudioStream() {
        return this.getPrefs().getInt("reminder_audio_stream", 4);
    }

    public final void setReminderAudioStream(int reminderAudioStream) {
        this.getPrefs().edit().putInt("reminder_audio_stream", reminderAudioStream).apply();
    }

    public final boolean getReplaceDescription() {
        return this.getPrefs().getBoolean("replace_description", false);
    }

    public final void setReplaceDescription(boolean replaceDescription) {
        this.getPrefs().edit().putBoolean("replace_description", replaceDescription).apply();
    }

    public final boolean getDisplayDescription() {
        return this.getPrefs().getBoolean("display_description", true);
    }

    public final void setDisplayDescription(boolean displayDescription) {
        this.getPrefs().edit().putBoolean("display_description", displayDescription).apply();
    }

    public final boolean getShowGrid() {
        return this.getPrefs().getBoolean("show_grid", false);
    }

    public final void setShowGrid(boolean showGrid) {
        this.getPrefs().edit().putBoolean("show_grid", showGrid).apply();
    }

    public final boolean getLoopReminders() {
        return this.getPrefs().getBoolean("loop_reminders", false);
    }

    public final void setLoopReminders(boolean loopReminders) {
        this.getPrefs().edit().putBoolean("loop_reminders", loopReminders).apply();
    }

    public final boolean getDimPastEvents() {
        return this.getPrefs().getBoolean("dim_past_events", true);
    }

    public final void setDimPastEvents(boolean dimPastEvents) {
        this.getPrefs().edit().putBoolean("dim_past_events", dimPastEvents).apply();
    }

    @NotNull
    public final ArrayList getSyncedCalendarIdsAsList() {
        Iterable $this$map$iv = (Iterable)StringsKt.split$default((CharSequence)this.getCaldavSyncedCalendarIds(), new String[]{","}, false, 0, 6, (Object)null);
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$mapTo = false;
        Iterator var6 = $this$map$iv.iterator();

        Object item$iv$iv;
        String it;
        boolean var9;
        while(var6.hasNext()) {
            item$iv$iv = var6.next();
            it = (String)item$iv$iv;
            var9 = false;
            CharSequence var10 = (CharSequence)StringsKt.trim((CharSequence)it).toString();
            if (var10.length() > 0) {
                destination$iv$iv.add(item$iv$iv);
            }
        }

        $this$map$iv = (Iterable)((List)destination$iv$iv);
        $i$f$map = false;
        destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        $i$f$mapTo = false;
        var6 = $this$map$iv.iterator();

        while(var6.hasNext()) {
            item$iv$iv = var6.next();
            it = (String)item$iv$iv;
            var9 = false;
            Integer var12 = Integer.parseInt(it);
            destination$iv$iv.add(var12);
        }

        List var10000 = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
        } else {
            return (ArrayList)var10000;
        }
    }

    @NotNull
    public final ArrayList getDisplayEventTypessAsList() {
        Iterable $this$map$iv = (Iterable)this.getDisplayEventTypes();
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        int $i$f$mapTo = false;
        Iterator var6 = $this$map$iv.iterator();

        while(var6.hasNext()) {
            Object item$iv$iv = var6.next();
            String it = (String)item$iv$iv;
            int var9 = false;
            Long var12 = Long.parseLong(it);
            destination$iv$iv.add(var12);
        }

        List var10000 = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
        } else {
            return (ArrayList)var10000;
        }
    }

    public final void addDisplayEventType(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.addDisplayEventTypes((Set)(new HashSet((Collection)Arrays.asList(type))));
    }

    private final void addDisplayEventTypes(Set types) {
        HashSet currDisplayEventTypes = new HashSet((Collection)this.getDisplayEventTypes());
        currDisplayEventTypes.addAll((Collection)types);
        this.setDisplayEventTypes((Set)currDisplayEventTypes);
    }

    public final void removeDisplayEventTypes(@NotNull Set types) {
        Intrinsics.checkNotNullParameter(types, "types");
        HashSet currDisplayEventTypes = new HashSet((Collection)this.getDisplayEventTypes());
        currDisplayEventTypes.removeAll((Collection)types);
        this.setDisplayEventTypes((Set)currDisplayEventTypes);
    }

    public final boolean getUsePreviousEventReminders() {
        return this.getPrefs().getBoolean("use_previous_event_reminders", true);
    }

    public final void setUsePreviousEventReminders(boolean usePreviousEventReminders) {
        this.getPrefs().edit().putBoolean("use_previous_event_reminders", usePreviousEventReminders).apply();
    }

    public final int getDefaultReminder1() {
        return this.getPrefs().getInt("default_reminder_1", 10);
    }

    public final void setDefaultReminder1(int defaultReminder1) {
        this.getPrefs().edit().putInt("default_reminder_1", defaultReminder1).apply();
    }

    public final int getDefaultReminder2() {
        return this.getPrefs().getInt("default_reminder_2", -1);
    }

    public final void setDefaultReminder2(int defaultReminder2) {
        this.getPrefs().edit().putInt("default_reminder_2", defaultReminder2).apply();
    }

    public final int getDefaultReminder3() {
        return this.getPrefs().getInt("default_reminder_3", -1);
    }

    public final void setDefaultReminder3(int defaultReminder3) {
        this.getPrefs().edit().putInt("default_reminder_3", defaultReminder3).apply();
    }

    public final boolean getPullToRefresh() {
        return this.getPrefs().getBoolean("pull_to_refresh", false);
    }

    public final void setPullToRefresh(boolean pullToRefresh) {
        this.getPrefs().edit().putBoolean("pull_to_refresh", pullToRefresh).apply();
    }

    public final boolean getLastVibrateOnReminder() {
        return this.getPrefs().getBoolean("last_vibrate_on_reminder", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this.getContext()).getVibrateOnReminder());
    }

    public final void setLastVibrateOnReminder(boolean lastVibrateOnReminder) {
        this.getPrefs().edit().putBoolean("last_vibrate_on_reminder", lastVibrateOnReminder).apply();
    }

    public final int getDefaultStartTime() {
        return this.getPrefs().getInt("default_start_time", -1);
    }

    public final void setDefaultStartTime(int defaultStartTime) {
        this.getPrefs().edit().putInt("default_start_time", defaultStartTime).apply();
    }

    public final int getDefaultDuration() {
        return this.getPrefs().getInt("default_duration", 0);
    }

    public final void setDefaultDuration(int defaultDuration) {
        this.getPrefs().edit().putInt("default_duration", defaultDuration).apply();
    }

    public final long getDefaultEventTypeId() {
        return this.getPrefs().getLong("default_event_type_id", -1L);
    }

    public final void setDefaultEventTypeId(long defaultEventTypeId) {
        this.getPrefs().edit().putLong("default_event_type_id", defaultEventTypeId).apply();
    }

    public final boolean getAllowChangingTimeZones() {
        return this.getPrefs().getBoolean("allow_changing_time_zones", false);
    }

    public final void setAllowChangingTimeZones(boolean allowChangingTimeZones) {
        this.getPrefs().edit().putBoolean("allow_changing_time_zones", allowChangingTimeZones).apply();
    }

    public final boolean getAddBirthdaysAutomatically() {
        return this.getPrefs().getBoolean("add_birthdays_automatically", false);
    }

    public final void setAddBirthdaysAutomatically(boolean addBirthdaysAutomatically) {
        this.getPrefs().edit().putBoolean("add_birthdays_automatically", addBirthdaysAutomatically).apply();
    }

    public final boolean getAddAnniversariesAutomatically() {
        return this.getPrefs().getBoolean("add_anniversaries_automatically", false);
    }

    public final void setAddAnniversariesAutomatically(boolean addAnniversariesAutomatically) {
        this.getPrefs().edit().putBoolean("add_anniversaries_automatically", addAnniversariesAutomatically).apply();
    }

    @NotNull
    public final ArrayList getBirthdayReminders() {
        String var10000 = this.getPrefs().getString("birthday_reminders", "-1,-1,-1");
        Intrinsics.checkNotNull(var10000);
        Intrinsics.checkNotNullExpressionValue(var10000, "prefs.getString(BIRTHDAY…REMINDER_DEFAULT_VALUE)!!");
        Iterable $this$map$iv = (Iterable)StringsKt.split$default((CharSequence)var10000, new String[]{","}, false, 0, 6, (Object)null);
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        int $i$f$mapTo = false;
        Iterator var6 = $this$map$iv.iterator();

        while(var6.hasNext()) {
            Object item$iv$iv = var6.next();
            String it = (String)item$iv$iv;
            int var9 = false;
            Integer var12 = Integer.parseInt(it);
            destination$iv$iv.add(var12);
        }

        List var13 = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        if (var13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
        } else {
            return (ArrayList)var13;
        }
    }

    public final void setBirthdayReminders(@NotNull ArrayList birthdayReminders) {
        Intrinsics.checkNotNullParameter(birthdayReminders, "birthdayReminders");
        this.getPrefs().edit().putString("birthday_reminders", CollectionsKt.joinToString$default((Iterable)birthdayReminders, (CharSequence)",", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null)).apply();
    }

    @NotNull
    public final ArrayList getAnniversaryReminders() {
        String var10000 = this.getPrefs().getString("anniversary_reminders", "-1,-1,-1");
        Intrinsics.checkNotNull(var10000);
        Intrinsics.checkNotNullExpressionValue(var10000, "prefs.getString(ANNIVERS…REMINDER_DEFAULT_VALUE)!!");
        Iterable $this$map$iv = (Iterable)StringsKt.split$default((CharSequence)var10000, new String[]{","}, false, 0, 6, (Object)null);
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        int $i$f$mapTo = false;
        Iterator var6 = $this$map$iv.iterator();

        while(var6.hasNext()) {
            Object item$iv$iv = var6.next();
            String it = (String)item$iv$iv;
            int var9 = false;
            Integer var12 = Integer.parseInt(it);
            destination$iv$iv.add(var12);
        }

        List var13 = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        if (var13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
        } else {
            return (ArrayList)var13;
        }
    }

    public final void setAnniversaryReminders(@NotNull ArrayList anniversaryReminders) {
        Intrinsics.checkNotNullParameter(anniversaryReminders, "anniversaryReminders");
        this.getPrefs().edit().putString("anniversary_reminders", CollectionsKt.joinToString$default((Iterable)anniversaryReminders, (CharSequence)",", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null)).apply();
    }

    @NotNull
    public final String getLastExportPath() {
        String var10000 = this.getPrefs().getString("last_export_path", "");
        Intrinsics.checkNotNull(var10000);
        return var10000;
    }

    public final void setLastExportPath(@NotNull String lastExportPath) {
        Intrinsics.checkNotNullParameter(lastExportPath, "lastExportPath");
        this.getPrefs().edit().putString("last_export_path", lastExportPath).apply();
    }

    public final boolean getExportPastEvents() {
        return this.getPrefs().getBoolean("export_past_events", false);
    }

    public final void setExportPastEvents(boolean exportPastEvents) {
        this.getPrefs().edit().putBoolean("export_past_events", exportPastEvents).apply();
    }

    public final float getWeeklyViewItemHeightMultiplier() {
        return this.getPrefs().getFloat("weekly_view_item_height_multiplier", 1.0F);
    }

    public final void setWeeklyViewItemHeightMultiplier(float weeklyViewItemHeightMultiplier) {
        this.getPrefs().edit().putFloat("weekly_view_item_height_multiplier", weeklyViewItemHeightMultiplier).apply();
    }

    public final int getWeeklyViewDays() {
        return this.getPrefs().getInt("weekly_view_days", 7);
    }

    public final void setWeeklyViewDays(int weeklyViewDays) {
        this.getPrefs().edit().putInt("weekly_view_days", weeklyViewDays).apply();
    }

    public final boolean getHighlightWeekends() {
        return this.getPrefs().getBoolean("highlight_weekends", false);
    }

    public final void setHighlightWeekends(boolean highlightWeekends) {
        this.getPrefs().edit().putBoolean("highlight_weekends", highlightWeekends).apply();
    }

    public final int getHighlightWeekendsColor() {
        return this.getPrefs().getInt("highlight_weekends_color", this.getContext().getResources().getColor(500172));
    }

    public final void setHighlightWeekendsColor(int highlightWeekendsColor) {
        this.getPrefs().edit().putInt("highlight_weekends_color", highlightWeekendsColor).apply();
    }

    public Config(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/Config$Companion;", "", "()V", "newInstance", "Lcom/simplemobiletools/calendar/pro/helpers/Config;", "context", "Landroid/content/Context;", "Simple-Calendar.app"}
    )
    public static final class Companion {
        @NotNull
        public final Config newInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Config(context);
        }

        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
