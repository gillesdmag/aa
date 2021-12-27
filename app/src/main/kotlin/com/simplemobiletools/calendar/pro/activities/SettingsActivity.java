package com.simplemobiletools.calendar.pro.activities;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.dialogs.SelectCalendarsDialog;
import com.simplemobiletools.calendar.pro.dialogs.SelectEventTypeDialog;
import com.simplemobiletools.calendar.pro.dialogs.SelectQuickFilterEventTypesDialog;
import com.simplemobiletools.calendar.pro.helpers.Config;
import com.simplemobiletools.calendar.pro.helpers.EventsHelper;
import com.simplemobiletools.calendar.pro.models.CalDAVCalendar;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.dialogs.ColorPickerDialog;
import com.simplemobiletools.commons.dialogs.ConfirmationDialog;
import com.simplemobiletools.commons.dialogs.CustomIntervalPickerDialog;
import com.simplemobiletools.commons.dialogs.FilePickerDialog;
import com.simplemobiletools.commons.dialogs.RadioGroupDialog;
import com.simplemobiletools.commons.dialogs.SelectAlarmSoundDialog;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.extensions.AnyKt;
import com.simplemobiletools.commons.extensions.ContextKt;
import com.simplemobiletools.commons.extensions.DrawableKt;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.extensions.IntKt;
import com.simplemobiletools.commons.extensions.ViewKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import com.simplemobiletools.commons.models.AlarmSound;
import com.simplemobiletools.commons.models.RadioItem;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import com.simplemobiletools.commons.views.MyTextView;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\"\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0014J\b\u0010\u001e\u001a\u00020\bH\u0014J\b\u0010\u001f\u001a\u00020\bH\u0014J\u0012\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010#\u001a\u00020\bH\u0002J\b\u0010$\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020\bH\u0002J\b\u0010&\u001a\u00020\bH\u0002J\b\u0010'\u001a\u00020\bH\u0002J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0002J\b\u0010*\u001a\u00020\bH\u0002J\b\u0010+\u001a\u00020\bH\u0002J\b\u0010,\u001a\u00020\bH\u0002J\b\u0010-\u001a\u00020\bH\u0002J\b\u0010.\u001a\u00020\bH\u0002J\b\u0010/\u001a\u00020\bH\u0002J\b\u00100\u001a\u00020\bH\u0002J\b\u00101\u001a\u00020\bH\u0002J\b\u00102\u001a\u00020\bH\u0002J\b\u00103\u001a\u00020\bH\u0002J\b\u00104\u001a\u00020\bH\u0002J\b\u00105\u001a\u00020\bH\u0002J\b\u00106\u001a\u00020\bH\u0002J\b\u00107\u001a\u00020\bH\u0002J\b\u00108\u001a\u00020\bH\u0002J\b\u00109\u001a\u00020\bH\u0002J\b\u0010:\u001a\u00020\bH\u0002J\b\u0010;\u001a\u00020\bH\u0002J\b\u0010<\u001a\u00020\bH\u0002J\b\u0010=\u001a\u00020\bH\u0002J\b\u0010>\u001a\u00020\bH\u0002J\b\u0010?\u001a\u00020\bH\u0002J\b\u0010@\u001a\u00020\bH\u0002J\b\u0010A\u001a\u00020\bH\u0002J\b\u0010B\u001a\u00020\bH\u0002J\b\u0010C\u001a\u00020\bH\u0002J\b\u0010D\u001a\u00020\bH\u0002J\b\u0010E\u001a\u00020\bH\u0002J\b\u0010F\u001a\u00020\bH\u0002J\b\u0010G\u001a\u00020\bH\u0002J\b\u0010H\u001a\u00020\bH\u0002J\b\u0010I\u001a\u00020\bH\u0002J\b\u0010J\u001a\u00020\bH\u0002J\b\u0010K\u001a\u00020\bH\u0002J\b\u0010L\u001a\u00020\bH\u0002J\b\u0010M\u001a\u00020\bH\u0002J\b\u0010N\u001a\u00020\bH\u0002J\b\u0010O\u001a\u00020\bH\u0002J\b\u0010P\u001a\u00020\bH\u0002J\b\u0010Q\u001a\u00020\bH\u0002J\b\u0010R\u001a\u00020\bH\u0002J\u0010\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u001aH\u0002J\u0010\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\u001aH\u0002J\b\u0010W\u001a\u00020\bH\u0002J\b\u0010X\u001a\u00020\bH\u0002J\b\u0010Y\u001a\u00020\bH\u0002J\u0010\u0010Z\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010[\u001a\u00020\b2\u0006\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006_"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/SettingsActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "()V", "GET_RINGTONE_URI", "", "PICK_IMPORT_SOURCE_INTENT", "mStoredAdjustedPrimaryColor", "checkCalDAVBackgrounds", "", "checkPrimaryColor", "getAudioStreamText", "", "getDefaultViewText", "getDisplayPastEventsText", "displayPastEvents", "getHoursString", "hours", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onPause", "onResume", "onStop", "parseFile", "inputStream", "Ljava/io/InputStream;", "setupAllowChangingTimeZones", "setupAllowCustomizeDayCount", "setupCaldavSync", "setupCustomizeColors", "setupCustomizeNotifications", "setupCustomizeWidgetColors", "setupDefaultDuration", "setupDefaultEventType", "setupDefaultReminder", "setupDefaultReminder1", "setupDefaultReminder2", "setupDefaultReminder3", "setupDefaultStartTime", "setupDeleteAllEvents", "setupDescriptionVisibility", "setupDimEvents", "setupDisplayDescription", "setupDisplayPastEvents", "setupExportSettings", "setupFontSize", "setupHighlightWeekendColorBackground", "setupHighlightWeekends", "setupHighlightWeekendsColor", "setupHourFormat", "setupImportSettings", "setupLoopReminders", "setupManageEventTypes", "setupManageQuickFilterEventTypes", "setupManageSyncedCalendars", "setupMidnightSpanEvents", "setupPullToRefresh", "setupReminderAudioStream", "setupReminderSound", "setupReplaceDescription", "setupSettingItems", "setupShowGrid", "setupSnoozeBackgrounds", "setupSnoozeTime", "setupStartWeekWithCurrentDay", "setupSundayFirst", "setupUseEnglish", "setupUseSameSnooze", "setupVibrate", "setupViewToOpenFromListWidget", "setupWeekNumbers", "setupWeeklyStart", "showCalendarPicker", "showQuickFilterPicker", "toggleCaldavSync", "enable", "toggleDefaultRemindersVisibility", "show", "updateDefaultDurationText", "updateDefaultEventTypeText", "updateDefaultStartTimeText", "updatePastEventsText", "updateReminderSound", "alarmSound", "Lcom/simplemobiletools/commons/models/AlarmSound;", "updateSnoozeTime", "calendar_debug"}
)
public final class SettingsActivity extends SimpleActivity {
    private final int GET_RINGTONE_URI = 1;
    private final int PICK_IMPORT_SOURCE_INTENT = 2;
    private int mStoredAdjustedPrimaryColor;
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300234);
        this.mStoredAdjustedPrimaryColor = ContextKt.getAdjustedPrimaryColor(this);
    }

    protected void onResume() {
        super.onResume();
        this.setupSettingItems();
    }

    private final void setupSettingItems() {
        this.setupCustomizeColors();
        this.setupCustomizeNotifications();
        this.setupUseEnglish();
        this.setupManageEventTypes();
        this.setupManageQuickFilterEventTypes();
        this.setupHourFormat();
        this.setupSundayFirst();
        this.setupHighlightWeekends();
        this.setupHighlightWeekendsColor();
        this.setupDeleteAllEvents();
        this.setupDisplayDescription();
        this.setupReplaceDescription();
        this.setupWeekNumbers();
        this.setupShowGrid();
        this.setupWeeklyStart();
        this.setupMidnightSpanEvents();
        this.setupAllowCustomizeDayCount();
        this.setupStartWeekWithCurrentDay();
        this.setupVibrate();
        this.setupReminderSound();
        this.setupReminderAudioStream();
        this.setupUseSameSnooze();
        this.setupLoopReminders();
        this.setupSnoozeTime();
        this.setupCaldavSync();
        this.setupManageSyncedCalendars();
        this.setupDefaultStartTime();
        this.setupDefaultDuration();
        this.setupDefaultEventType();
        this.setupPullToRefresh();
        this.setupDefaultReminder();
        this.setupDefaultReminder1();
        this.setupDefaultReminder2();
        this.setupDefaultReminder3();
        this.setupDisplayPastEvents();
        this.setupFontSize();
        this.setupCustomizeWidgetColors();
        this.setupViewToOpenFromListWidget();
        this.setupDimEvents();
        this.setupAllowChangingTimeZones();
        LinearLayout var10001 = (LinearLayout)this._$_findCachedViewById(id.settings_holder);
        Intrinsics.checkNotNullExpressionValue(var10001, "settings_holder");
        ContextKt.updateTextColors$default(this, (ViewGroup)var10001, 0, 0, 6, (Object)null);
        this.checkPrimaryColor();
        this.setupExportSettings();
        this.setupImportSettings();
        this.invalidateOptionsMenu();
        Object[] $this$forEach$iv = new TextView[]{(TextView)this._$_findCachedViewById(id.settings_color_customization_label), (TextView)this._$_findCachedViewById(id.settings_general_settings_label), (TextView)this._$_findCachedViewById(id.settings_reminders_label), (TextView)this._$_findCachedViewById(id.settings_caldav_label), (TextView)this._$_findCachedViewById(id.settings_new_events_label), (TextView)this._$_findCachedViewById(id.settings_weekly_view_label), (TextView)this._$_findCachedViewById(id.settings_monthly_view_label), (TextView)this._$_findCachedViewById(id.settings_event_lists_label), (TextView)this._$_findCachedViewById(id.settings_widgets_label), (TextView)this._$_findCachedViewById(id.settings_events_label), (TextView)this._$_findCachedViewById(id.settings_migrating_label)};
        int $i$f$forEach = false;
        TextView[] var3 = $this$forEach$iv;
        int var4 = $this$forEach$iv.length;

        int var5;
        boolean var8;
        for(var5 = 0; var5 < var4; ++var5) {
            Object element$iv = var3[var5];
            var8 = false;
            element$iv.setTextColor(ContextKt.getAdjustedPrimaryColor(this));
        }

        Object[] $this$forEach$iv = new LinearLayout[]{(LinearLayout)this._$_findCachedViewById(id.settings_color_customization_holder), (LinearLayout)this._$_findCachedViewById(id.settings_general_settings_holder), (LinearLayout)this._$_findCachedViewById(id.settings_reminders_holder), (LinearLayout)this._$_findCachedViewById(id.settings_caldav_holder), (LinearLayout)this._$_findCachedViewById(id.settings_new_events_holder), (LinearLayout)this._$_findCachedViewById(id.settings_weekly_view_holder), (LinearLayout)this._$_findCachedViewById(id.settings_monthly_view_holder), (LinearLayout)this._$_findCachedViewById(id.settings_event_lists_holder), (LinearLayout)this._$_findCachedViewById(id.settings_widgets_holder), (LinearLayout)this._$_findCachedViewById(id.settings_events_holder), (LinearLayout)this._$_findCachedViewById(id.settings_migrating_holder)};
        $i$f$forEach = false;
        LinearLayout[] var10 = $this$forEach$iv;
        var4 = $this$forEach$iv.length;

        for(var5 = 0; var5 < var4; ++var5) {
            Object element$iv = var10[var5];
            var8 = false;
            Intrinsics.checkNotNullExpressionValue(element$iv, "it");
            Drawable var10000 = element$iv.getBackground();
            Intrinsics.checkNotNullExpressionValue(var10000, "it.background");
            DrawableKt.applyColorFilter(var10000, IntKt.getContrastColor(ContextKt.getBaseConfig(this).getBackgroundColor()));
        }

    }

    protected void onPause() {
        super.onPause();
        this.mStoredAdjustedPrimaryColor = ContextKt.getAdjustedPrimaryColor(this);
    }

    protected void onStop() {
        super.onStop();
        Iterable $this$filter$iv = (Iterable)SetsKt.sortedSetOf(new Integer[]{com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultReminder1(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultReminder2(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultReminder3()});
        int $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var7 = $this$filter$iv.iterator();

        while(var7.hasNext()) {
            Object element$iv$iv = var7.next();
            int it = ((Number)element$iv$iv).intValue();
            int var10 = false;
            if (it != -1) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        List reminders = (List)destination$iv$iv;
        Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this);
        byte var13 = 0;
        Config var11;
        Integer var12;
        boolean var14;
        Object var10001;
        if (var13 <= CollectionsKt.getLastIndex(reminders)) {
            var10001 = reminders.get(var13);
        } else {
            var11 = var10000;
            var14 = false;
            var12 = -1;
            var10000 = var11;
            var10001 = var12;
        }

        var10000.setDefaultReminder1(((Number)var10001).intValue());
        var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this);
        var13 = 1;
        if (var13 <= CollectionsKt.getLastIndex(reminders)) {
            var10001 = reminders.get(var13);
        } else {
            var11 = var10000;
            var14 = false;
            var12 = -1;
            var10000 = var11;
            var10001 = var12;
        }

        var10000.setDefaultReminder2(((Number)var10001).intValue());
        var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this);
        var13 = 2;
        if (var13 <= CollectionsKt.getLastIndex(reminders)) {
            var10001 = reminders.get(var13);
        } else {
            var11 = var10000;
            var14 = false;
            var12 = -1;
            var10000 = var11;
            var10001 = var12;
        }

        var10000.setDefaultReminder3(((Number)var10001).intValue());
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        BaseSimpleActivity.updateMenuItemColors$default(this, menu, false, 0, 6, (Object)null);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent resultData) {
        super.onActivityResult(requestCode, resultCode, resultData);
        if (requestCode == this.GET_RINGTONE_URI && resultCode == -1 && resultData != null) {
            AlarmSound newAlarmSound = ContextKt.storeNewYourAlarmSound(this, resultData);
            this.updateReminderSound(newAlarmSound);
        } else if (requestCode == this.PICK_IMPORT_SOURCE_INTENT && resultCode == -1 && resultData != null && resultData.getData() != null) {
            ContentResolver var10000 = this.getContentResolver();
            Uri var10001 = resultData.getData();
            Intrinsics.checkNotNull(var10001);
            InputStream inputStream = var10000.openInputStream(var10001);
            this.parseFile(inputStream);
        }

    }

    private final void checkPrimaryColor() {
        if (ContextKt.getAdjustedPrimaryColor(this) != this.mStoredAdjustedPrimaryColor) {
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ArrayList eventTypes = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(SettingsActivity.this).getEventTypesSync();
                    Iterable $this$filter$iv = (Iterable)eventTypes;
                    int $i$f$filter = false;
                    Collection destination$iv$iv = (Collection)(new ArrayList());
                    int $i$f$filterTo = false;
                    Iterator var7 = $this$filter$iv.iterator();

                    while(var7.hasNext()) {
                        Object element$iv$iv = var7.next();
                        EventType itx = (EventType)element$iv$iv;
                        int var10 = false;
                        if (itx.getCaldavCalendarId() == 0) {
                            destination$iv$iv.add(element$iv$iv);
                        }
                    }

                    if (((List)destination$iv$iv).size() == 1) {
                        Iterable $this$first$iv = (Iterable)eventTypes;
                        int $i$f$first = false;
                        Iterator var13 = $this$first$iv.iterator();

                        while(true) {
                            if (!var13.hasNext()) {
                                throw (Throwable)(new NoSuchElementException("Collection contains no element matching the predicate."));
                            }

                            Object element$iv = var13.next();
                            EventType it = (EventType)element$iv;
                            int var16 = false;
                            if (it.getCaldavCalendarId() == 0) {
                                EventType eventType = (EventType)element$iv;
                                eventType.setColor(ContextKt.getAdjustedPrimaryColor(SettingsActivity.this));
                                com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(SettingsActivity.this).insertOrUpdateEventTypeSync(eventType);
                                break;
                            }
                        }
                    }

                }
            }));
        }

    }

    private final void setupCustomizeColors() {
        ((RelativeLayout)this._$_findCachedViewById(id.settings_customize_colors_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                SettingsActivity.this.startCustomizationActivity();
            }
        }));
    }

    private final void setupCustomizeNotifications() {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_customize_notifications_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_customize_notifications_holder");
        ViewKt.beVisibleIf((View)var10000, ConstantsKt.isOreoPlus());
        var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_customize_notifications_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_customize_notifications_holder");
        if (ViewKt.isGone((View)var10000)) {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_reminder_sound_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_reminder_sound_holder");
            var10000.setBackground(this.getResources().getDrawable(700310, this.getTheme()));
        }

        ((RelativeLayout)this._$_findCachedViewById(id.settings_customize_notifications_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                SettingsActivity.this.launchCustomizeNotificationsIntent();
            }
        }));
    }

    private final void setupUseEnglish() {
        RelativeLayout var10000;
        View var1;
        boolean var3;
        label16: {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_use_english_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_use_english_holder");
            var1 = (View)var10000;
            if (!com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getWasUseEnglishToggled()) {
                Locale var10001 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(var10001, "Locale.getDefault()");
                if (!(Intrinsics.areEqual(var10001.getLanguage(), "en") ^ true)) {
                    var3 = false;
                    break label16;
                }
            }

            var3 = true;
        }

        ViewKt.beVisibleIf(var1, var3);
        MyAppCompatCheckbox var2 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_use_english);
        Intrinsics.checkNotNullExpressionValue(var2, "settings_use_english");
        var2.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUseEnglish());
        var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_use_english_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_use_english_holder");
        if (ViewKt.isGone((View)var10000)) {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_manage_event_types_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_manage_event_types_holder");
            var10000.setBackground(this.getResources().getDrawable(700310, this.getTheme()));
        }

        ((RelativeLayout)this._$_findCachedViewById(id.settings_use_english_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_use_english)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_use_english);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_use_english");
                var10000.setUseEnglish(var10001.isChecked());
                System.exit(0);
            }
        }));
    }

    private final void setupManageEventTypes() {
        ((RelativeLayout)this._$_findCachedViewById(id.settings_manage_event_types_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                SettingsActivity.this.startActivity(new Intent((Context)SettingsActivity.this, ManageEventTypesActivity.class));
            }
        }));
    }

    private final void setupManageQuickFilterEventTypes() {
        ((RelativeLayout)this._$_findCachedViewById(id.settings_manage_quick_filter_event_types_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                SettingsActivity.this.showQuickFilterPicker();
            }
        }));
        com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(this).getEventTypes((Activity)this, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RelativeLayout var10000 = (RelativeLayout)SettingsActivity.this._$_findCachedViewById(id.settings_manage_quick_filter_event_types_holder);
                Intrinsics.checkNotNullExpressionValue(var10000, "settings_manage_quick_filter_event_types_holder");
                ViewKt.beGoneIf((View)var10000, it.size() < 2);
            }
        }));
    }

    private final void setupHourFormat() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_hour_format);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_hour_format");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUse24HourFormat());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_hour_format_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_hour_format)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_hour_format);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_hour_format");
                var10000.setUse24HourFormat(var10001.isChecked());
            }
        }));
    }

    private final void setupCaldavSync() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_caldav_sync);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_caldav_sync");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync());
        this.checkCalDAVBackgrounds();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_caldav_sync_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getCaldavSync()) {
                    SettingsActivity.this.toggleCaldavSync(false);
                } else {
                    SettingsActivity.this.handlePermission(8, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke((Boolean)var1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean it) {
                            if (it) {
                                SettingsActivity.this.handlePermission(7, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke((Boolean)var1);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean it) {
                                        if (it) {
                                            SettingsActivity.this.toggleCaldavSync(true);
                                        }

                                    }
                                }));
                            }

                        }
                    }));
                }

            }
        }));
    }

    private final void setupPullToRefresh() {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_caldav_pull_to_refresh_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_caldav_pull_to_refresh_holder");
        ViewKt.beVisibleIf((View)var10000, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync());
        MyAppCompatCheckbox var1 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_caldav_pull_to_refresh);
        Intrinsics.checkNotNullExpressionValue(var1, "settings_caldav_pull_to_refresh");
        var1.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getPullToRefresh());
        this.checkCalDAVBackgrounds();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_caldav_pull_to_refresh_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_caldav_pull_to_refresh)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_caldav_pull_to_refresh);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_caldav_pull_to_refresh");
                var10000.setPullToRefresh(var10001.isChecked());
            }
        }));
    }

    private final void checkCalDAVBackgrounds() {
        RelativeLayout var10000;
        if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync()) {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_caldav_sync_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_caldav_sync_holder");
            var10000.setBackground(this.getResources().getDrawable(700310, this.getTheme()));
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_manage_synced_calendars_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_manage_synced_calendars_holder");
            var10000.setBackground(this.getResources().getDrawable(700053, this.getTheme()));
        } else {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_caldav_sync_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_caldav_sync_holder");
            var10000.setBackground(this.getResources().getDrawable(700030, this.getTheme()));
        }

    }

    private final void setupManageSyncedCalendars() {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_manage_synced_calendars_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_manage_synced_calendars_holder");
        ViewKt.beVisibleIf((View)var10000, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_manage_synced_calendars_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                SettingsActivity.this.showCalendarPicker();
            }
        }));
    }

    private final void toggleCaldavSync(boolean enable) {
        if (enable) {
            this.showCalendarPicker();
        } else {
            MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_caldav_sync);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_caldav_sync");
            var10000.setChecked(false);
            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setCaldavSync(false);
            RelativeLayout var2 = (RelativeLayout)this._$_findCachedViewById(id.settings_manage_synced_calendars_holder);
            Intrinsics.checkNotNullExpressionValue(var2, "settings_manage_synced_calendars_holder");
            ViewKt.beGone((View)var2);
            var2 = (RelativeLayout)this._$_findCachedViewById(id.settings_caldav_pull_to_refresh_holder);
            Intrinsics.checkNotNullExpressionValue(var2, "settings_caldav_pull_to_refresh_holder");
            ViewKt.beGone((View)var2);
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    Iterable $this$forEach$iv = (Iterable)com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getSyncedCalendarIdsAsList();
                    int $i$f$forEach = false;
                    Iterator var3 = $this$forEach$iv.iterator();

                    while(var3.hasNext()) {
                        Object element$iv = var3.next();
                        int it = ((Number)element$iv).intValue();
                        int var6 = false;
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getCalDAVHelper(SettingsActivity.this).deleteCalDAVCalendarEvents((long)it);
                    }

                    com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventTypesDB(SettingsActivity.this).deleteEventTypesWithCalendarId((List)com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getSyncedCalendarIdsAsList());
                    SettingsActivity.this.updateDefaultEventTypeText();
                }
            }));
        }

        this.checkCalDAVBackgrounds();
    }

    private final void showCalendarPicker() {
        final ArrayList oldCalendarIds = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getSyncedCalendarIdsAsList();
        new SelectCalendarsDialog((SimpleActivity)this, (Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                final ArrayList newCalendarIds = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getSyncedCalendarIdsAsList();
                if (!newCalendarIds.isEmpty() || com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getCaldavSync()) {
                    RelativeLayout var10000 = (RelativeLayout)SettingsActivity.this._$_findCachedViewById(id.settings_manage_synced_calendars_holder);
                    Intrinsics.checkNotNullExpressionValue(var10000, "settings_manage_synced_calendars_holder");
                    View var3 = (View)var10000;
                    Collection var2 = (Collection)newCalendarIds;
                    ViewKt.beVisibleIf(var3, !var2.isEmpty());
                    var10000 = (RelativeLayout)SettingsActivity.this._$_findCachedViewById(id.settings_caldav_pull_to_refresh_holder);
                    Intrinsics.checkNotNullExpressionValue(var10000, "settings_caldav_pull_to_refresh_holder");
                    var3 = (View)var10000;
                    var2 = (Collection)newCalendarIds;
                    ViewKt.beVisibleIf(var3, !var2.isEmpty());
                    MyAppCompatCheckbox var4 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_caldav_sync);
                    Intrinsics.checkNotNullExpressionValue(var4, "settings_caldav_sync");
                    var2 = (Collection)newCalendarIds;
                    var4.setChecked(!var2.isEmpty());
                    Config var5 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                    var2 = (Collection)newCalendarIds;
                    var5.setCaldavSync(!var2.isEmpty());
                    var4 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_caldav_sync);
                    Intrinsics.checkNotNullExpressionValue(var4, "settings_caldav_sync");
                    if (var4.isChecked()) {
                        ContextKt.toast$default(SettingsActivity.this, 1900458, 0, 2, (Object)null);
                    }

                    ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            Collection var1 = (Collection)newCalendarIds;
                            Iterable $this$forEach$iv;
                            boolean $i$f$forEach;
                            Iterator var4;
                            Collection destination$iv$iv;
                            boolean $i$f$filterTo;
                            Iterator var7;
                            Object element$iv$iv;
                            boolean var10;
                            Object element$iv;
                            boolean var19;
                            if (!var1.isEmpty()) {
                                $this$forEach$iv = (Iterable)com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(SettingsActivity.this).getEventTypesSync();
                                $i$f$forEach = false;
                                destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$forEach$iv, 10)));
                                $i$f$filterTo = false;
                                var7 = $this$forEach$iv.iterator();

                                EventType eventType;
                                while(var7.hasNext()) {
                                    element$iv$iv = var7.next();
                                    eventType = (EventType)element$iv$iv;
                                    var10 = false;
                                    String var11 = eventType.getDisplayTitle();
                                    if (var11 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }

                                    String var10000 = var11.toLowerCase();
                                    Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.String).toLowerCase()");
                                    String var13 = var10000;
                                    destination$iv$iv.add(var13);
                                }

                                ArrayList existingEventTypeNames = (ArrayList)((List)destination$iv$iv);
                                $this$forEach$iv = (Iterable)com.simplemobiletools.calendar.pro.extensions.ContextKt.getSyncedCalDAVCalendars(SettingsActivity.this);
                                $i$f$forEach = false;
                                var4 = $this$forEach$iv.iterator();

                                while(var4.hasNext()) {
                                    element$iv = var4.next();
                                    CalDAVCalendar itx = (CalDAVCalendar)element$iv;
                                    var19 = false;
                                    String calendarTitle = itx.getFullTitle();
                                    if (calendarTitle == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }

                                    String var10001 = calendarTitle.toLowerCase();
                                    Intrinsics.checkNotNullExpressionValue(var10001, "(this as java.lang.String).toLowerCase()");
                                    if (!existingEventTypeNames.contains(var10001)) {
                                        eventType = new EventType((Long)null, itx.getDisplayName(), itx.getColor(), itx.getId(), itx.getDisplayName(), itx.getAccountName());
                                        if (calendarTitle == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                        }

                                        var10001 = calendarTitle.toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(var10001, "(this as java.lang.String).toLowerCase()");
                                        existingEventTypeNames.add(var10001);
                                        EventsHelper.insertOrUpdateEventType$default(com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(SettingsActivity.this), (Activity)SettingsActivity.this, eventType, (Function1)null, 4, (Object)null);
                                    }
                                }

                                SettingsActivity.this.syncCalDAVCalendars(SettingsActivity.this, (Function0)(new Function0() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke() {
                                        this.invoke();
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke() {
                                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getCalDAVHelper(SettingsActivity.this).refreshCalendars(true, (Function0)(new Function0() {
                                            // $FF: synthetic method
                                            // $FF: bridge method
                                            public Object invoke() {
                                                this.invoke();
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke() {
                                                MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_caldav_sync);
                                                Intrinsics.checkNotNullExpressionValue(var10000, "settings_caldav_sync");
                                                if (var10000.isChecked()) {
                                                    ContextKt.toast$default(SettingsActivity.this, 1900803, 0, 2, (Object)null);
                                                }

                                            }
                                        }));
                                    }
                                }));
                            }

                            $this$forEach$iv = (Iterable)oldCalendarIds;
                            $i$f$forEach = false;
                            destination$iv$iv = (Collection)(new ArrayList());
                            $i$f$filterTo = false;
                            var7 = $this$forEach$iv.iterator();

                            while(var7.hasNext()) {
                                element$iv$iv = var7.next();
                                int it = ((Number)element$iv$iv).intValue();
                                var10 = false;
                                if (!newCalendarIds.contains(it)) {
                                    destination$iv$iv.add(element$iv$iv);
                                }
                            }

                            List removedCalendarIds = (List)destination$iv$iv;
                            $this$forEach$iv = (Iterable)removedCalendarIds;
                            $i$f$forEach = false;
                            var4 = $this$forEach$iv.iterator();

                            while(var4.hasNext()) {
                                element$iv = var4.next();
                                int itxx = ((Number)element$iv).intValue();
                                var19 = false;
                                com.simplemobiletools.calendar.pro.extensions.ContextKt.getCalDAVHelper(SettingsActivity.this).deleteCalDAVCalendarEvents((long)itxx);
                                EventType var23 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(SettingsActivity.this).getEventTypeWithCalDAVCalendarId(itxx);
                                if (var23 != null) {
                                    EventType var21 = var23;
                                    var10 = false;
                                    com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(SettingsActivity.this).deleteEventTypes(CollectionsKt.arrayListOf(new EventType[]{var21}), true);
                                }
                            }

                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventTypesDB(SettingsActivity.this).deleteEventTypesWithCalendarId(removedCalendarIds);
                            SettingsActivity.this.updateDefaultEventTypeText();
                        }
                    }));
                }
            }
        }));
    }

    private final void showQuickFilterPicker() {
        new SelectQuickFilterEventTypesDialog((SimpleActivity)this);
    }

    private final void setupSundayFirst() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_sunday_first);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_sunday_first");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).isSundayFirst());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_sunday_first_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_sunday_first)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_sunday_first);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_sunday_first");
                var10000.setSundayFirst(var10001.isChecked());
            }
        }));
    }

    private final void setupHighlightWeekends() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_highlight_weekends);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_highlight_weekends");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getHighlightWeekends());
        RelativeLayout var1 = (RelativeLayout)this._$_findCachedViewById(id.settings_highlight_weekends_color_holder);
        Intrinsics.checkNotNullExpressionValue(var1, "settings_highlight_weekends_color_holder");
        ViewKt.beVisibleIf((View)var1, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getHighlightWeekends());
        this.setupHighlightWeekendColorBackground();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_highlight_weekends_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_highlight_weekends)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_highlight_weekends);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_highlight_weekends");
                var10000.setHighlightWeekends(var10001.isChecked());
                RelativeLayout var2 = (RelativeLayout)SettingsActivity.this._$_findCachedViewById(id.settings_highlight_weekends_color_holder);
                Intrinsics.checkNotNullExpressionValue(var2, "settings_highlight_weekends_color_holder");
                ViewKt.beVisibleIf((View)var2, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getHighlightWeekends());
                SettingsActivity.this.setupHighlightWeekendColorBackground();
            }
        }));
    }

    private final void setupHighlightWeekendsColor() {
        ImageView var10000 = (ImageView)this._$_findCachedViewById(id.settings_highlight_weekends_color);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_highlight_weekends_color");
        ImageViewKt.setFillWithStroke$default(var10000, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getHighlightWeekendsColor(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getBackgroundColor(), false, 4, (Object)null);
        ((RelativeLayout)this._$_findCachedViewById(id.settings_highlight_weekends_color_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                new ColorPickerDialog((Activity)SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getHighlightWeekendsColor(), false, false, (Function1)null, (Function2)(new Function2() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1, Object var2) {
                        this.invoke((Boolean)var1, ((Number)var2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean wasPositivePressed, int color) {
                        if (wasPositivePressed) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setHighlightWeekendsColor(color);
                            ImageView var10000 = (ImageView)SettingsActivity.this._$_findCachedViewById(id.settings_highlight_weekends_color);
                            Intrinsics.checkNotNullExpressionValue(var10000, "settings_highlight_weekends_color");
                            ImageViewKt.setFillWithStroke$default(var10000, color, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getBackgroundColor(), false, 4, (Object)null);
                        }

                    }
                }), 28, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final void setupHighlightWeekendColorBackground() {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_highlight_weekends_color_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_highlight_weekends_color_holder");
        if (ViewKt.isVisible((View)var10000)) {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_highlight_weekends_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_highlight_weekends_holder");
            var10000.setBackground(this.getResources().getDrawable(700323, this.getTheme()));
        } else {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_highlight_weekends_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_highlight_weekends_holder");
            var10000.setBackground(this.getResources().getDrawable(700053, this.getTheme()));
        }

    }

    private final void setupDeleteAllEvents() {
        ((RelativeLayout)this._$_findCachedViewById(id.settings_delete_all_events_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                new ConfirmationDialog((Activity)SettingsActivity.this, (String)null, 1900804, 0, 0, false, (Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(SettingsActivity.this).deleteAllEvents();
                    }
                }), 58, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final void setupDisplayDescription() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_display_description);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_display_description");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDisplayDescription());
        this.setupDescriptionVisibility();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_display_description_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_display_description)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_display_description);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_display_description");
                var10000.setDisplayDescription(var10001.isChecked());
                SettingsActivity.this.setupDescriptionVisibility();
            }
        }));
    }

    private final void setupDescriptionVisibility() {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_replace_description_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_replace_description_holder");
        ViewKt.beVisibleIf((View)var10000, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDisplayDescription());
        var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_replace_description_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_replace_description_holder");
        if (ViewKt.isVisible((View)var10000)) {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_display_description_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_display_description_holder");
            var10000.setBackground(this.getResources().getDrawable(700323, this.getTheme()));
        } else {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_display_description_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_display_description_holder");
            var10000.setBackground(this.getResources().getDrawable(700053, this.getTheme()));
        }

    }

    private final void setupReplaceDescription() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_replace_description);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_replace_description");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getReplaceDescription());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_replace_description_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_replace_description)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_replace_description);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_replace_description");
                var10000.setReplaceDescription(var10001.isChecked());
            }
        }));
    }

    private final void setupWeeklyStart() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_start_weekly_at);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_start_weekly_at");
        var10000.setText((CharSequence)this.getHoursString(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getStartWeeklyAt()));
        ((RelativeLayout)this._$_findCachedViewById(id.settings_start_weekly_at_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ArrayList items = new ArrayList();
                byte var3 = 0;
                Iterable $this$mapTo$iv = (Iterable)(new IntRange(var3, 16));
                int $i$f$mapTo = false;
                Iterator var5 = $this$mapTo$iv.iterator();

                while(var5.hasNext()) {
                    int item$iv = ((IntIterator)var5).nextInt();
                    Collection var9 = (Collection)items;
                    int var8 = false;
                    RadioItem var10 = new RadioItem(item$iv, SettingsActivity.this.getHoursString(item$iv), (Object)null, 4, (DefaultConstructorMarker)null);
                    var9.add(var10);
                }

                Collection var10000 = (Collection)items;
                new RadioGroupDialog((Activity)SettingsActivity.this, items, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getStartWeeklyAt(), 0, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setStartWeeklyAt((Integer)it);
                        MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_start_weekly_at);
                        Intrinsics.checkNotNullExpressionValue(var10000, "settings_start_weekly_at");
                        var10000.setText((CharSequence)SettingsActivity.this.getHoursString(((Number)it).intValue()));
                    }
                }), 56, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final void setupMidnightSpanEvents() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_midnight_span_event);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_midnight_span_event");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getShowMidnightSpanningEventsAtTop());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_midnight_span_events_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_midnight_span_event)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_midnight_span_event);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_midnight_span_event");
                var10000.setShowMidnightSpanningEventsAtTop(var10001.isChecked());
            }
        }));
    }

    private final void setupAllowCustomizeDayCount() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_allow_customize_day_count);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_allow_customize_day_count");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getAllowCustomizeDayCount());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_allow_customize_day_count_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_allow_customize_day_count)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_allow_customize_day_count);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_allow_customize_day_count");
                var10000.setAllowCustomizeDayCount(var10001.isChecked());
            }
        }));
    }

    private final void setupStartWeekWithCurrentDay() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_start_week_with_current_day);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_start_week_with_current_day");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getStartWeekWithCurrentDay());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_start_week_with_current_day_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_start_week_with_current_day)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_start_week_with_current_day);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_start_week_with_current_day");
                var10000.setStartWeekWithCurrentDay(var10001.isChecked());
            }
        }));
    }

    private final void setupWeekNumbers() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_week_numbers);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_week_numbers");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getShowWeekNumbers());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_week_numbers_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_week_numbers)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_week_numbers);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_week_numbers");
                var10000.setShowWeekNumbers(var10001.isChecked());
            }
        }));
    }

    private final void setupShowGrid() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_show_grid);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_show_grid");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getShowGrid());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_show_grid_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_show_grid)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_show_grid);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_show_grid");
                var10000.setShowGrid(var10001.isChecked());
            }
        }));
    }

    private final void setupReminderSound() {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_reminder_sound_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_reminder_sound_holder");
        ViewKt.beGoneIf((View)var10000, ConstantsKt.isOreoPlus());
        MyTextView var1 = (MyTextView)this._$_findCachedViewById(id.settings_reminder_sound);
        Intrinsics.checkNotNullExpressionValue(var1, "settings_reminder_sound");
        var1.setText((CharSequence)com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getReminderSoundTitle());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_reminder_sound_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                new SelectAlarmSoundDialog((BaseSimpleActivity)SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getReminderSoundUri(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getReminderAudioStream(), SettingsActivity.this.GET_RINGTONE_URI, 2, false, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke((AlarmSound)var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable AlarmSound it) {
                        if (it != null) {
                            SettingsActivity.this.updateReminderSound(it);
                        }

                    }
                }), (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke((AlarmSound)var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull AlarmSound it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (Intrinsics.areEqual(it.getUri(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getReminderSoundUri())) {
                            AlarmSound defaultAlarm = ContextKt.getDefaultAlarmSound(SettingsActivity.this, 2);
                            SettingsActivity.this.updateReminderSound(defaultAlarm);
                        }

                    }
                }));
            }
        }));
    }

    private final void updateReminderSound(AlarmSound alarmSound) {
        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setReminderSoundTitle(alarmSound.getTitle());
        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setReminderSoundUri(alarmSound.getUri());
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_reminder_sound);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_reminder_sound");
        var10000.setText((CharSequence)alarmSound.getTitle());
    }

    private final void setupReminderAudioStream() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_reminder_audio_stream);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_reminder_audio_stream");
        var10000.setText((CharSequence)this.getAudioStreamText());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_reminder_audio_stream_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                RadioItem[] var10000 = new RadioItem[4];
                String var10006 = SettingsActivity.this.getString(1900730);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.alarm_stream)");
                var10000[0] = new RadioItem(4, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900908);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.system_stream)");
                var10000[1] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900309);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.notification_stream)");
                var10000[2] = new RadioItem(5, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900186);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.ring_stream)");
                var10000[3] = new RadioItem(2, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                ArrayList items = CollectionsKt.arrayListOf(var10000);
                new RadioGroupDialog((Activity)SettingsActivity.this, items, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getReminderAudioStream(), 0, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setReminderAudioStream((Integer)it);
                        MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_reminder_audio_stream);
                        Intrinsics.checkNotNullExpressionValue(var10000, "settings_reminder_audio_stream");
                        var10000.setText((CharSequence)SettingsActivity.this.getAudioStreamText());
                    }
                }), 56, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final String getAudioStreamText() {
        int var10001;
        switch(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getReminderAudioStream()) {
            case 1:
                var10001 = 1900908;
                break;
            case 2:
            case 3:
            default:
                var10001 = 1900186;
                break;
            case 4:
                var10001 = 1900730;
                break;
            case 5:
                var10001 = 1900309;
        }

        String var10000 = this.getString(var10001);
        Intrinsics.checkNotNullExpressionValue(var10000, "getString(\n        when …ng_stream\n        }\n    )");
        return var10000;
    }

    private final void setupVibrate() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_vibrate);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_vibrate");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getVibrateOnReminder());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_vibrate_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_vibrate)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_vibrate);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_vibrate");
                var10000.setVibrateOnReminder(var10001.isChecked());
            }
        }));
    }

    private final void setupLoopReminders() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_loop_reminders);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_loop_reminders");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getLoopReminders());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_loop_reminders_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_loop_reminders)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_loop_reminders);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_loop_reminders");
                var10000.setLoopReminders(var10001.isChecked());
            }
        }));
    }

    private final void setupUseSameSnooze() {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_snooze_time_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_snooze_time_holder");
        ViewKt.beVisibleIf((View)var10000, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUseSameSnooze());
        MyAppCompatCheckbox var1 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_use_same_snooze);
        Intrinsics.checkNotNullExpressionValue(var1, "settings_use_same_snooze");
        var1.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUseSameSnooze());
        this.setupSnoozeBackgrounds();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_use_same_snooze_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_use_same_snooze)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_use_same_snooze);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_use_same_snooze");
                var10000.setUseSameSnooze(var10001.isChecked());
                RelativeLayout var2 = (RelativeLayout)SettingsActivity.this._$_findCachedViewById(id.settings_snooze_time_holder);
                Intrinsics.checkNotNullExpressionValue(var2, "settings_snooze_time_holder");
                ViewKt.beVisibleIf((View)var2, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getUseSameSnooze());
                SettingsActivity.this.setupSnoozeBackgrounds();
            }
        }));
    }

    private final void setupSnoozeBackgrounds() {
        RelativeLayout var10000;
        if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUseSameSnooze()) {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_use_same_snooze_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_use_same_snooze_holder");
            var10000.setBackground(this.getResources().getDrawable(700323, this.getTheme()));
        } else {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_use_same_snooze_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_use_same_snooze_holder");
            var10000.setBackground(this.getResources().getDrawable(700053, this.getTheme()));
        }

    }

    private final void setupSnoozeTime() {
        this.updateSnoozeTime();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_snooze_time_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ActivityKt.showPickSecondsDialogHelper$default(SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getSnoozeTime(), true, false, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setSnoozeTime(it / 60);
                        SettingsActivity.this.updateSnoozeTime();
                    }
                }), 28, (Object)null);
            }
        }));
    }

    private final void updateSnoozeTime() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_snooze_time);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_snooze_time");
        var10000.setText((CharSequence)ContextKt.formatMinutesToTimeString(this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getSnoozeTime()));
    }

    private final void setupDefaultReminder() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_use_last_event_reminders);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_use_last_event_reminders");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUsePreviousEventReminders());
        this.toggleDefaultRemindersVisibility(!com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUsePreviousEventReminders());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_use_last_event_reminders_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_use_last_event_reminders)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_use_last_event_reminders);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_use_last_event_reminders");
                var10000.setUsePreviousEventReminders(var10001.isChecked());
                SettingsActivity var2 = SettingsActivity.this;
                var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_use_last_event_reminders);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_use_last_event_reminders");
                var2.toggleDefaultRemindersVisibility(!var10001.isChecked());
            }
        }));
    }

    private final void setupDefaultReminder1() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_reminder_1);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_reminder_1");
        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default(this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultReminder1(), false, 2, (Object)null));
        ((RelativeLayout)this._$_findCachedViewById(id.settings_default_reminder_1_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ActivityKt.showPickSecondsDialogHelper$default(SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder1(), false, false, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDefaultReminder1(it != -1 && it != 0 ? it / 60 : it);
                        MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_default_reminder_1);
                        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_reminder_1");
                        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default(SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder1(), false, 2, (Object)null));
                    }
                }), 30, (Object)null);
            }
        }));
    }

    private final void setupDefaultReminder2() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_reminder_2);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_reminder_2");
        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default(this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultReminder2(), false, 2, (Object)null));
        ((RelativeLayout)this._$_findCachedViewById(id.settings_default_reminder_2_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ActivityKt.showPickSecondsDialogHelper$default(SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder2(), false, false, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDefaultReminder2(it != -1 && it != 0 ? it / 60 : it);
                        MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_default_reminder_2);
                        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_reminder_2");
                        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default(SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder2(), false, 2, (Object)null));
                    }
                }), 30, (Object)null);
            }
        }));
    }

    private final void setupDefaultReminder3() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_reminder_3);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_reminder_3");
        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default(this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultReminder3(), false, 2, (Object)null));
        ((RelativeLayout)this._$_findCachedViewById(id.settings_default_reminder_3_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ActivityKt.showPickSecondsDialogHelper$default(SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder3(), false, false, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDefaultReminder3(it != -1 && it != 0 ? it / 60 : it);
                        MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_default_reminder_3);
                        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_reminder_3");
                        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default(SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder3(), false, 2, (Object)null));
                    }
                }), 30, (Object)null);
            }
        }));
    }

    private final void toggleDefaultRemindersVisibility(boolean show) {
        Object[] $this$forEach$iv = new RelativeLayout[]{(RelativeLayout)this._$_findCachedViewById(id.settings_default_reminder_1_holder), (RelativeLayout)this._$_findCachedViewById(id.settings_default_reminder_2_holder), (RelativeLayout)this._$_findCachedViewById(id.settings_default_reminder_3_holder)};
        int $i$f$forEach = false;
        RelativeLayout[] var4 = $this$forEach$iv;
        int var5 = $this$forEach$iv.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Object element$iv = var4[var6];
            int var9 = false;
            Intrinsics.checkNotNullExpressionValue(element$iv, "it");
            ViewKt.beVisibleIf((View)element$iv, show);
        }

        RelativeLayout var10000;
        if (show) {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_use_last_event_reminders_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_use_last_event_reminders_holder");
            var10000.setBackground(this.getResources().getDrawable(700323, this.getTheme()));
        } else {
            var10000 = (RelativeLayout)this._$_findCachedViewById(id.settings_use_last_event_reminders_holder);
            Intrinsics.checkNotNullExpressionValue(var10000, "settings_use_last_event_reminders_holder");
            var10000.setBackground(this.getResources().getDrawable(700053, this.getTheme()));
        }

    }

    private final String getHoursString(int hours) {
        StringCompanionObject var2 = StringCompanionObject.INSTANCE;
        String var3 = "%02d:00";
        Object[] var4 = new Object[]{hours};
        String var10000 = String.format(var3, Arrays.copyOf(var4, var4.length));
        Intrinsics.checkNotNullExpressionValue(var10000, "java.lang.String.format(format, *args)");
        return var10000;
    }

    private final void setupDisplayPastEvents() {
        final IntRef displayPastEvents = new IntRef();
        displayPastEvents.element = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDisplayPastEvents();
        this.updatePastEventsText(displayPastEvents.element);
        ((RelativeLayout)this._$_findCachedViewById(id.settings_display_past_events_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                new CustomIntervalPickerDialog((Activity)SettingsActivity.this, displayPastEvents.element * 60, false, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        int result = it / 60;
                        displayPastEvents.element = result;
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDisplayPastEvents(result);
                        SettingsActivity.this.updatePastEventsText(result);
                    }
                }), 4, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final void updatePastEventsText(int displayPastEvents) {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_display_past_events);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_display_past_events");
        var10000.setText((CharSequence)this.getDisplayPastEventsText(displayPastEvents));
    }

    private final String getDisplayPastEventsText(int displayPastEvents) {
        String var10000;
        if (displayPastEvents == 0) {
            var10000 = this.getString(1900676);
            Intrinsics.checkNotNullExpressionValue(var10000, "getString(R.string.never)");
        } else {
            var10000 = ContextKt.getFormattedMinutes(this, displayPastEvents, false);
        }

        return var10000;
    }

    private final void setupFontSize() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_font_size);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_font_size");
        var10000.setText((CharSequence)ContextKt.getFontSizeText(this));
        ((RelativeLayout)this._$_findCachedViewById(id.settings_font_size_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                RadioItem[] var10000 = new RadioItem[4];
                String var10006 = SettingsActivity.this.getString(1900501);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.small)");
                var10000[0] = new RadioItem(0, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900111);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.medium)");
                var10000[1] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900741);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.large)");
                var10000[2] = new RadioItem(2, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900431);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.extra_large)");
                var10000[3] = new RadioItem(3, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                ArrayList items = CollectionsKt.arrayListOf(var10000);
                new RadioGroupDialog((Activity)SettingsActivity.this, items, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getFontSize(), 0, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setFontSize((Integer)it);
                        MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_font_size);
                        Intrinsics.checkNotNullExpressionValue(var10000, "settings_font_size");
                        var10000.setText((CharSequence)ContextKt.getFontSizeText(SettingsActivity.this));
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.updateWidgets(SettingsActivity.this);
                    }
                }), 56, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final void setupCustomizeWidgetColors() {
        ((RelativeLayout)this._$_findCachedViewById(id.settings_customize_widget_colors_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent var2 = new Intent((Context)SettingsActivity.this, WidgetListConfigureActivity.class);
                int var4 = false;
                var2.putExtra("is_customizing_colors", true);
                SettingsActivity.this.startActivity(var2);
            }
        }));
    }

    private final void setupViewToOpenFromListWidget() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_list_widget_view_to_open);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_list_widget_view_to_open");
        var10000.setText((CharSequence)this.getDefaultViewText());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_list_widget_view_to_open_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                RadioItem[] var10000 = new RadioItem[6];
                String var10006 = SettingsActivity.this.getString(1900848);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.daily_view)");
                var10000[0] = new RadioItem(5, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900824);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.weekly_view)");
                var10000[1] = new RadioItem(4, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1901033);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.monthly_view)");
                var10000[2] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900201);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.yearly_view)");
                var10000[3] = new RadioItem(2, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1901081);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.simple_event_list)");
                var10000[4] = new RadioItem(3, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                var10006 = SettingsActivity.this.getString(1900938);
                Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.last_view)");
                var10000[5] = new RadioItem(6, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
                ArrayList items = CollectionsKt.arrayListOf(var10000);
                new RadioGroupDialog((Activity)SettingsActivity.this, items, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getListWidgetViewToOpen(), 0, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setListWidgetViewToOpen((Integer)it);
                        MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_list_widget_view_to_open);
                        Intrinsics.checkNotNullExpressionValue(var10000, "settings_list_widget_view_to_open");
                        var10000.setText((CharSequence)SettingsActivity.this.getDefaultViewText());
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.updateWidgets(SettingsActivity.this);
                    }
                }), 56, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final String getDefaultViewText() {
        int var10001;
        switch(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getListWidgetViewToOpen()) {
            case 1:
                var10001 = 1901033;
                break;
            case 2:
                var10001 = 1900201;
                break;
            case 3:
                var10001 = 1901081;
                break;
            case 4:
                var10001 = 1900824;
                break;
            case 5:
                var10001 = 1900848;
                break;
            default:
                var10001 = 1900938;
        }

        String var10000 = this.getString(var10001);
        Intrinsics.checkNotNullExpressionValue(var10000, "getString(\n        when …last_view\n        }\n    )");
        return var10000;
    }

    private final void setupDimEvents() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_dim_past_events);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_dim_past_events");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDimPastEvents());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_dim_past_events_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_dim_past_events)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_dim_past_events);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_dim_past_events");
                var10000.setDimPastEvents(var10001.isChecked());
            }
        }));
    }

    private final void setupAllowChangingTimeZones() {
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.settings_allow_changing_time_zones);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_allow_changing_time_zones");
        var10000.setChecked(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getAllowChangingTimeZones());
        ((RelativeLayout)this._$_findCachedViewById(id.settings_allow_changing_time_zones_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_allow_changing_time_zones)).toggle();
                Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                MyAppCompatCheckbox var10001 = (MyAppCompatCheckbox)SettingsActivity.this._$_findCachedViewById(id.settings_allow_changing_time_zones);
                Intrinsics.checkNotNullExpressionValue(var10001, "settings_allow_changing_time_zones");
                var10000.setAllowChangingTimeZones(var10001.isChecked());
            }
        }));
    }

    private final void setupDefaultStartTime() {
        this.updateDefaultStartTimeText();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_default_start_time_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                byte var10000;
                switch(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultStartTime()) {
                    case -2:
                        var10000 = -2;
                        break;
                    case -1:
                        var10000 = -1;
                        break;
                    default:
                        var10000 = 0;
                }

                int currentDefaultTime = var10000;
                ArrayList items = new ArrayList();
                String var10004 = SettingsActivity.this.getString(1900904);
                Intrinsics.checkNotNullExpressionValue(var10004, "getString(R.string.current_time)");
                items.add(new RadioItem(-2, var10004, (Object)null, 4, (DefaultConstructorMarker)null));
                var10004 = SettingsActivity.this.getString(1900334);
                Intrinsics.checkNotNullExpressionValue(var10004, "getString(R.string.next_full_hour)");
                items.add(new RadioItem(-1, var10004, (Object)null, 4, (DefaultConstructorMarker)null));
                var10004 = SettingsActivity.this.getString(1900535);
                Intrinsics.checkNotNullExpressionValue(var10004, "getString(R.string.other_time)");
                items.add(new RadioItem(0, var10004, (Object)null, 4, (DefaultConstructorMarker)null));
                new RadioGroupDialog((Activity)SettingsActivity.this, items, currentDefaultTime, 0, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((Integer)it != -1 && !Intrinsics.areEqual(it, -2)) {
                            OnTimeSetListener timeListener = (OnTimeSetListener)(new OnTimeSetListener() {
                                public final void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                    com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDefaultStartTime(hourOfDay * 60 + minute);
                                    SettingsActivity.this.updateDefaultStartTimeText();
                                }
                            });
                            DateTime currentDateTime = DateTime.now();
                            Context var10002 = (Context)SettingsActivity.this;
                            int var10003 = ContextKt.getDialogTheme(SettingsActivity.this);
                            Intrinsics.checkNotNullExpressionValue(currentDateTime, "currentDateTime");
                            (new TimePickerDialog(var10002, var10003, timeListener, currentDateTime.getHourOfDay(), currentDateTime.getMinuteOfHour(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getUse24HourFormat())).show();
                        } else {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDefaultStartTime(((Number)it).intValue());
                            SettingsActivity.this.updateDefaultStartTimeText();
                        }

                    }
                }), 56, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final void updateDefaultStartTimeText() {
        MyTextView var10000;
        switch(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultStartTime()) {
            case -2:
                var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_start_time);
                Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_start_time");
                var10000.setText((CharSequence)this.getString(1900904));
                break;
            case -1:
                var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_start_time);
                Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_start_time");
                var10000.setText((CharSequence)this.getString(1900334));
                break;
            default:
                int hours = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultStartTime() / 60;
                int minutes = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultStartTime() % 60;
                var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_start_time);
                Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_start_time");
                StringCompanionObject var3 = StringCompanionObject.INSTANCE;
                String var4 = "%02d:%02d";
                Object[] var5 = new Object[]{hours, minutes};
                String var10001 = String.format(var4, Arrays.copyOf(var5, var5.length));
                Intrinsics.checkNotNullExpressionValue(var10001, "java.lang.String.format(format, *args)");
                var10000.setText((CharSequence)var10001);
        }

    }

    private final void setupDefaultDuration() {
        this.updateDefaultDurationText();
        ((RelativeLayout)this._$_findCachedViewById(id.settings_default_duration_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                new CustomIntervalPickerDialog((Activity)SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultDuration() * 60, false, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        int result = it / 60;
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDefaultDuration(result);
                        SettingsActivity.this.updateDefaultDurationText();
                    }
                }), 4, (DefaultConstructorMarker)null);
            }
        }));
    }

    private final void updateDefaultDurationText() {
        int duration = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultDuration();
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_duration);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_duration");
        var10000.setText(duration == 0 ? (CharSequence)("0 " + this.getString(1900751)) : (CharSequence)ContextKt.getFormattedMinutes(this, duration, false));
    }

    private final void setupDefaultEventType() {
        this.updateDefaultEventTypeText();
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.settings_default_event_type);
        Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_event_type");
        var10000.setText((CharSequence)this.getString(1900021));
        ((RelativeLayout)this._$_findCachedViewById(id.settings_default_event_type_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                new SelectEventTypeDialog((Activity)SettingsActivity.this, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultEventTypeId(), true, false, true, true, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke((EventType)var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull EventType it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this);
                        Long var10001 = it.getId();
                        Intrinsics.checkNotNull(var10001);
                        var10000.setDefaultEventTypeId(var10001);
                        SettingsActivity.this.updateDefaultEventTypeText();
                    }
                }));
            }
        }));
    }

    private final void updateDefaultEventTypeText() {
        if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultEventTypeId() == -1L) {
            this.runOnUiThread((Runnable)(new Runnable() {
                public final void run() {
                    MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_default_event_type);
                    Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_event_type");
                    var10000.setText((CharSequence)SettingsActivity.this.getString(1900021));
                }
            }));
        } else {
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    final EventType eventType = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventTypesDB(SettingsActivity.this).getEventTypeWithId(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultEventTypeId());
                    if (eventType != null) {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setLastUsedCaldavCalendarId(eventType.getCaldavCalendarId());
                        SettingsActivity.this.runOnUiThread((Runnable)(new Runnable() {
                            public final void run() {
                                MyTextView var10000 = (MyTextView)SettingsActivity.this._$_findCachedViewById(id.settings_default_event_type);
                                Intrinsics.checkNotNullExpressionValue(var10000, "settings_default_event_type");
                                var10000.setText((CharSequence)eventType.getTitle());
                            }
                        }));
                    } else {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).setDefaultEventTypeId(-1L);
                        SettingsActivity.this.updateDefaultEventTypeText();
                    }

                }
            }));
        }

    }

    private final void setupExportSettings() {
        ((RelativeLayout)this._$_findCachedViewById(id.settings_export_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                LinkedHashMap var3 = new LinkedHashMap();
                int var5 = false;
                var3.put("is_using_shared_theme", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).isUsingSharedTheme());
                var3.put("text_color", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getTextColor());
                var3.put("background_color", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getBackgroundColor());
                var3.put("primary_color_2", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getPrimaryColor());
                var3.put("accent_color", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getAccentColor());
                var3.put("app_icon_color", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getAppIconColor());
                var3.put("use_english", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getUseEnglish());
                var3.put("was_use_english_toggled", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getWasUseEnglishToggled());
                var3.put("widget_bg_color", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getWidgetBgColor());
                var3.put("widget_text_color", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getWidgetTextColor());
                var3.put("week_numbers", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getShowWeekNumbers());
                var3.put("start_weekly_at", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getStartWeeklyAt());
                var3.put("vibrate", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getVibrateOnReminder());
                var3.put("reminder_minutes", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getLastEventReminderMinutes1());
                var3.put("reminder_minutes_2", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getLastEventReminderMinutes2());
                var3.put("reminder_minutes_3", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getLastEventReminderMinutes3());
                var3.put("display_past_events", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDisplayPastEvents());
                var3.put("font_size", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getFontSize());
                var3.put("list_widget_view_to_open", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getListWidgetViewToOpen());
                var3.put("reminder_audio_stream", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getReminderAudioStream());
                var3.put("display_description", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDisplayDescription());
                var3.put("replace_description", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getReplaceDescription());
                var3.put("show_grid", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getShowGrid());
                var3.put("loop_reminders", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getLoopReminders());
                var3.put("dim_past_events", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDimPastEvents());
                var3.put("allow_changing_time_zones", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getAllowChangingTimeZones());
                var3.put("use_previous_event_reminders", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getUsePreviousEventReminders());
                var3.put("default_reminder_1", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder1());
                var3.put("default_reminder_2", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder2());
                var3.put("default_reminder_3", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultReminder3());
                var3.put("pull_to_refresh", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getPullToRefresh());
                var3.put("default_start_time", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultStartTime());
                var3.put("default_duration", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getDefaultDuration());
                var3.put("use_same_snooze", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getUseSameSnooze());
                var3.put("snooze_delay", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getSnoozeTime());
                var3.put("use_24_hour_format", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getUse24HourFormat());
                var3.put("sunday_first", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).isSundayFirst());
                var3.put("highlight_weekends", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getHighlightWeekends());
                var3.put("highlight_weekends_color", com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(SettingsActivity.this).getHighlightWeekendsColor());
                SettingsActivity.this.exportSettings(var3);
            }
        }));
    }

    private final void setupImportSettings() {
        ((RelativeLayout)this._$_findCachedViewById(id.settings_import_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                if (ConstantsKt.isQPlus()) {
                    Intent var2 = new Intent("android.intent.action.GET_CONTENT");
                    int var4 = false;
                    var2.addCategory("android.intent.category.OPENABLE");
                    var2.setType("text/plain");
                    SettingsActivity.this.startActivityForResult(var2, SettingsActivity.this.PICK_IMPORT_SOURCE_INTENT);
                } else {
                    SettingsActivity.this.handlePermission(1, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke((Boolean)var1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean it) {
                            if (it) {
                                new FilePickerDialog((BaseSimpleActivity)SettingsActivity.this, (String)null, false, false, false, false, false, false, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke((String)var1);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull final String it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                                            // $FF: synthetic method
                                            // $FF: bridge method
                                            public Object invoke() {
                                                this.invoke();
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke() {
                                                SettingsActivity var10000 = SettingsActivity.this;
                                                File var1 = new File(it);
                                                var10000.parseFile((InputStream)(new FileInputStream(var1)));
                                            }
                                        }));
                                    }
                                }), 254, (DefaultConstructorMarker)null);
                            }

                        }
                    }));
                }

            }
        }));
    }

    private final void parseFile(InputStream inputStream) {
        if (inputStream == null) {
            ContextKt.toast$default(this, 1900338, 0, 2, (Object)null);
        } else {
            int importedItems = 0;
            final LinkedHashMap configValues = new LinkedHashMap();
            Charset var5 = Charsets.UTF_8;
            boolean var8 = false;
            Reader var7 = (Reader)(new InputStreamReader(inputStream, var5));
            short var27 = 8192;
            boolean var9 = false;
            Closeable var4 = (Closeable)(var7 instanceof BufferedReader ? (BufferedReader)var7 : new BufferedReader(var7, var27));
            Throwable var20 = null;

            try {
                BufferedReader it = (BufferedReader)var4;
                boolean var25 = false;

                while(true) {
                    try {
                        String var10000 = it.readLine();
                        if (var10000 != null) {
                            String line = var10000;
                            CharSequence var29 = (CharSequence)line;
                            String var10 = "=";
                            Regex var30 = new Regex(var10);
                            byte var11 = 2;
                            List split = var30.split(var29, var11);
                            if (split.size() == 2) {
                                ((Map)configValues).put(split.get(0), split.get(1));
                            }

                            ++importedItems;
                            continue;
                        }
                    } catch (Exception var16) {
                        ContextKt.showErrorToast$default(this, var16, 0, 2, (Object)null);
                        continue;
                    }

                    Unit var22 = Unit.INSTANCE;
                    break;
                }
            } catch (Throwable var17) {
                var20 = var17;
                throw var17;
            } finally {
                CloseableKt.closeFinally(var4, var20);
            }

            Map var23 = (Map)configValues;
            Iterator var21 = var23.entrySet().iterator();

            while(var21.hasNext()) {
                Entry var19 = (Entry)var21.next();
                String key = (String)var19.getKey();
                Object value = var19.getValue();
                switch(key.hashCode()) {
                    case -2115337775:
                        if (key.equals("text_color")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setTextColor(AnyKt.toInt(value));
                        }
                        break;
                    case -2099462917:
                        if (key.equals("app_icon_color") && ContextKt.getAppIconColors(this).contains(AnyKt.toInt(value))) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setAppIconColor(AnyKt.toInt(value));
                            ContextKt.checkAppIconColor(this);
                        }
                        break;
                    case -2094259758:
                        if (key.equals("default_duration")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDefaultDuration(AnyKt.toInt(value));
                        }
                        break;
                    case -1979439375:
                        if (key.equals("replace_description")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setReplaceDescription(AnyKt.toBoolean(value));
                        }
                        break;
                    case -1903706296:
                        if (key.equals("show_grid")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setShowGrid(AnyKt.toBoolean(value));
                        }
                        break;
                    case -1876039681:
                        if (key.equals("display_description")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDisplayDescription(AnyKt.toBoolean(value));
                        }
                        break;
                    case -1864830446:
                        if (key.equals("reminder_minutes")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setLastEventReminderMinutes1(AnyKt.toInt(value));
                        }
                        break;
                    case -1729334803:
                        if (key.equals("use_24_hour_format")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setUse24HourFormat(AnyKt.toBoolean(value));
                        }
                        break;
                    case -1640831119:
                        if (key.equals("allow_changing_time_zones")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setAllowChangingTimeZones(AnyKt.toBoolean(value));
                        }
                        break;
                    case -1539906063:
                        if (key.equals("font_size")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setFontSize(AnyKt.toInt(value));
                        }
                        break;
                    case -1407678999:
                        if (key.equals("display_past_events")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDisplayPastEvents(AnyKt.toInt(value));
                        }
                        break;
                    case -1400363542:
                        if (key.equals("snooze_delay")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setSnoozeTime(AnyKt.toInt(value));
                        }
                        break;
                    case -1191245906:
                        if (key.equals("accent_color")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setAccentColor(AnyKt.toInt(value));
                        }
                        break;
                    case -1100693179:
                        if (key.equals("reminder_minutes_2")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setLastEventReminderMinutes2(AnyKt.toInt(value));
                        }
                        break;
                    case -1100693178:
                        if (key.equals("reminder_minutes_3")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setLastEventReminderMinutes3(AnyKt.toInt(value));
                        }
                        break;
                    case -1061904129:
                        if (key.equals("week_numbers")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setShowWeekNumbers(AnyKt.toBoolean(value));
                        }
                        break;
                    case -1048612536:
                        if (key.equals("default_start_time")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDefaultStartTime(AnyKt.toInt(value));
                        }
                        break;
                    case -702694780:
                        if (key.equals("widget_bg_color")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setWidgetBgColor(AnyKt.toInt(value));
                        }
                        break;
                    case -697781522:
                        if (key.equals("list_widget_view_to_open")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setListWidgetViewToOpen(AnyKt.toInt(value));
                        }
                        break;
                    case -612140881:
                        if (key.equals("dim_past_events")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDimPastEvents(AnyKt.toBoolean(value));
                        }
                        break;
                    case -246188109:
                        if (key.equals("was_use_english_toggled")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setWasUseEnglishToggled(AnyKt.toBoolean(value));
                        }
                        break;
                    case -132813185:
                        if (key.equals("is_using_shared_theme")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setUsingSharedTheme(AnyKt.toBoolean(value));
                        }
                        break;
                    case -62149317:
                        if (key.equals("highlight_weekends_color")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setHighlightWeekendsColor(AnyKt.toInt(value));
                        }
                        break;
                    case 201359641:
                        if (key.equals("primary_color_2")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setPrimaryColor(AnyKt.toInt(value));
                        }
                        break;
                    case 309938508:
                        if (key.equals("use_previous_event_reminders")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setUsePreviousEventReminders(AnyKt.toBoolean(value));
                        }
                        break;
                    case 363607138:
                        if (key.equals("default_reminder_1")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDefaultReminder1(AnyKt.toInt(value));
                        }
                        break;
                    case 363607139:
                        if (key.equals("default_reminder_2")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDefaultReminder2(AnyKt.toInt(value));
                        }
                        break;
                    case 363607140:
                        if (key.equals("default_reminder_3")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setDefaultReminder3(AnyKt.toInt(value));
                        }
                        break;
                    case 393744998:
                        if (key.equals("loop_reminders")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setLoopReminders(AnyKt.toBoolean(value));
                        }
                        break;
                    case 451310959:
                        if (key.equals("vibrate")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setVibrateOnReminder(AnyKt.toBoolean(value));
                        }
                        break;
                    case 619692308:
                        if (key.equals("start_weekly_at")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setStartWeeklyAt(AnyKt.toInt(value));
                        }
                        break;
                    case 734217910:
                        if (key.equals("reminder_audio_stream")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setReminderAudioStream(AnyKt.toInt(value));
                        }
                        break;
                    case 1454713516:
                        if (key.equals("widget_text_color")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setWidgetTextColor(AnyKt.toInt(value));
                        }
                        break;
                    case 1756113793:
                        if (key.equals("sunday_first")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setSundayFirst(AnyKt.toBoolean(value));
                        }
                        break;
                    case 1906841425:
                        if (key.equals("pull_to_refresh")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setPullToRefresh(AnyKt.toBoolean(value));
                        }
                        break;
                    case 1971031992:
                        if (key.equals("use_english")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setUseEnglish(AnyKt.toBoolean(value));
                        }
                        break;
                    case 2013314343:
                        if (key.equals("use_same_snooze")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setUseSameSnooze(AnyKt.toBoolean(value));
                        }
                        break;
                    case 2014234647:
                        if (key.equals("highlight_weekends")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setHighlightWeekends(AnyKt.toBoolean(value));
                        }
                        break;
                    case 2036780306:
                        if (key.equals("background_color")) {
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setBackgroundColor(AnyKt.toInt(value));
                        }
                }
            }

            this.runOnUiThread((Runnable)(new Runnable() {
                public final void run() {
                    int msg = configValues.size() > 0 ? 1900931 : 1900485;
                    ContextKt.toast$default(SettingsActivity.this, msg, 0, 2, (Object)null);
                    SettingsActivity.this.setupSettingItems();
                    com.simplemobiletools.calendar.pro.extensions.ContextKt.updateWidgets(SettingsActivity.this);
                }
            }));
        }
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}
