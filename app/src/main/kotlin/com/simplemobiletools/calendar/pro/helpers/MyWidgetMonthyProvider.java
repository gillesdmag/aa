package com.simplemobiletools.calendar.pro.helpers;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.simplemobiletools.calendar.pro.activities.SplashActivity;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.interfaces.MonthlyCalendar;
import com.simplemobiletools.calendar.pro.models.DayMonthly;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.commons.extensions.IntKt;
import com.simplemobiletools.commons.extensions.RemoteViewsKt;
import com.simplemobiletools.commons.extensions.ResourcesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002*\u0001\t\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0004H\u0002J(\u0010&\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0004H\u0002J(\u0010'\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J(\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J&\u0010,\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u00060"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/MyWidgetMonthlyProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "GO_TO_TODAY", "", "NEW_EVENT", "NEXT", "PREV", "monthlyCalendar", "com/simplemobiletools/calendar/pro/helpers/MyWidgetMonthlyProvider$monthlyCalendar$1", "Lcom/simplemobiletools/calendar/pro/helpers/MyWidgetMonthlyProvider$monthlyCalendar$1;", "addDayNumber", "", "context", "Landroid/content/Context;", "views", "Landroid/widget/RemoteViews;", "day", "Lcom/simplemobiletools/calendar/pro/models/DayMonthly;", "textColor", "", "id", "getComponentName", "Landroid/content/ComponentName;", "getNextMonth", "getPrevMonth", "goToToday", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "performUpdate", "setupAppOpenIntent", "dayCode", "setupDayOpenIntent", "setupIntent", "action", "updateDayLabels", "resources", "Landroid/content/res/Resources;", "updateDays", "days", "", "Companion", "Simple-Calendar.app"}
)
public final class MyWidgetMonthlyProvider extends AppWidgetProvider {
    private final String PREV = "prev";
    private final String NEXT = "next";
    private final String GO_TO_TODAY = "go_to_today";
    private final String NEW_EVENT = "new_event";
    private final <undefinedtype> monthlyCalendar = new MonthlyCalendar() {
        public void updateMonthlyCalendar(@NotNull Context context, @NotNull String month, @NotNull ArrayList days, boolean checkedEvents, @NotNull DateTime currTargetDate) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(days, "days");
            Intrinsics.checkNotNullParameter(currTargetDate, "currTargetDate");
            float largerFontSize = ContextKt.getWidgetFontSize(context) + 3.0F;
            int textColor = ContextKt.getConfig(context).getWidgetTextColor();
            Resources resources = context.getResources();
            AppWidgetManager var10000 = AppWidgetManager.getInstance(context);
            if (var10000 != null) {
                AppWidgetManager appWidgetManager = var10000;
                int[] var31 = appWidgetManager.getAppWidgetIds(MyWidgetMonthlyProvider.this.getComponentName(context));
                Intrinsics.checkNotNullExpressionValue(var31, "appWidgetManager.getAppW…etComponentName(context))");
                int[] $this$forEach$iv = var31;
                int $i$f$forEach = false;
                int[] var12 = $this$forEach$iv;
                int var13 = $this$forEach$iv.length;

                for(int var14 = 0; var14 < var13; ++var14) {
                    int element$ivx = var12[var14];
                    int itx = element$ivx;
                    int var17 = false;
                    RemoteViews views = new RemoteViews(context.getPackageName(), 1300192);
                    RemoteViewsKt.setText(views, 1000884, month);
                    RemoteViewsKt.applyColorFilter(views, 1000039, ContextKt.getConfig(context).getWidgetBgColor());
                    views.setTextColor(1000884, textColor);
                    RemoteViewsKt.setTextSize(views, 1000884, largerFontSize);
                    Intrinsics.checkNotNullExpressionValue(resources, "resources");
                    Bitmap bmp = ResourcesKt.getColoredBitmap(resources, 700183, textColor);
                    views.setImageViewBitmap(1000221, bmp);
                    bmp = ResourcesKt.getColoredBitmap(resources, 700195, textColor);
                    views.setImageViewBitmap(1000344, bmp);
                    bmp = ResourcesKt.getColoredBitmap(resources, 700293, textColor);
                    views.setImageViewBitmap(1000811, bmp);
                    bmp = ResourcesKt.getColoredBitmap(resources, 700251, textColor);
                    views.setImageViewBitmap(1000006, bmp);
                    boolean shouldGoToTodayBeVisible = Intrinsics.areEqual(currTargetDate.withTime(0, 0, 0, 0), DateTime.now().withDayOfMonth(1).withTime(0, 0, 0, 0)) ^ true;
                    RemoteViewsKt.setVisibleIf(views, 1000811, shouldGoToTodayBeVisible);
                    MyWidgetMonthlyProvider.this.updateDayLabels(context, views, resources, textColor);
                    MyWidgetMonthlyProvider.this.updateDays(context, views, (List)days);
                    MyWidgetMonthlyProvider.this.setupIntent(context, views, MyWidgetMonthlyProvider.this.PREV, 1000221);
                    MyWidgetMonthlyProvider.this.setupIntent(context, views, MyWidgetMonthlyProvider.this.NEXT, 1000344);
                    MyWidgetMonthlyProvider.this.setupIntent(context, views, MyWidgetMonthlyProvider.this.GO_TO_TODAY, 1000811);
                    MyWidgetMonthlyProvider.this.setupIntent(context, views, MyWidgetMonthlyProvider.this.NEW_EVENT, 1000006);
                    Iterable $this$firstOrNull$iv = (Iterable)days;
                    int $i$f$firstOrNull = false;
                    Iterator var23 = $this$firstOrNull$iv.iterator();

                    String var32;
                    Object var33;
                    label43: {
                        while(var23.hasNext()) {
                            Object element$iv = var23.next();
                            DayMonthly it = (DayMonthly)element$iv;
                            int var26 = false;
                            String var27 = it.getCode();
                            byte var28 = 6;
                            if (var27 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }

                            var32 = var27.substring(var28);
                            Intrinsics.checkNotNullExpressionValue(var32, "(this as java.lang.String).substring(startIndex)");
                            if (Intrinsics.areEqual(var32, "01")) {
                                var33 = element$iv;
                                break label43;
                            }
                        }

                        var33 = null;
                    }

                    label48: {
                        DayMonthly var34 = (DayMonthly)var33;
                        if ((DayMonthly)var33 != null) {
                            var32 = var34.getCode();
                            if (var32 != null) {
                                break label48;
                            }
                        }

                        var32 = Formatter.INSTANCE.getTodayCode();
                    }

                    String monthCode = var32;
                    MyWidgetMonthlyProvider.this.setupAppOpenIntent(context, views, 1000884, monthCode);

                    try {
                        appWidgetManager.updateAppWidget(itx, views);
                    } catch (RuntimeException var30) {
                    }
                }

            }
        }
    };
    private static DateTime targetDate = DateTime.now().withDayOfMonth(1);
    @NotNull
    public static final MyWidgetMonthlyProvider.Companion Companion = new MyWidgetMonthlyProvider.Companion((DefaultConstructorMarker)null);

    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        this.performUpdate(context);
    }

    private final void performUpdate(Context context) {
        MonthlyCalendarImpl var10000 = new MonthlyCalendarImpl((MonthlyCalendar)this.monthlyCalendar, context);
        DateTime var10001 = targetDate;
        Intrinsics.checkNotNullExpressionValue(var10001, "targetDate");
        var10000.getMonth(var10001);
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, MyWidgetMonthlyProvider.class);
    }

    private final void setupIntent(Context context, RemoteViews views, String action, int id) {
        Intent var5 = new Intent(context, MyWidgetMonthlyProvider.class);
        int var7 = false;
        var5.setAction(action);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, var5, 0);
        views.setOnClickPendingIntent(id, pendingIntent);
    }

    private final void setupAppOpenIntent(Context context, RemoteViews views, int id, String dayCode) {
        Intent var10000 = com.simplemobiletools.commons.extensions.ContextKt.getLaunchIntent(context);
        if (var10000 == null) {
            var10000 = new Intent(context, SplashActivity.class);
        }

        Intent var5 = var10000;
        int var7 = false;
        var5.putExtra("day_code", dayCode);
        var5.putExtra("view_to_open", 1);
        byte var9 = 0;
        byte var10 = 6;
        if (dayCode == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else {
            String var10001 = dayCode.substring(var9, var10);
            Intrinsics.checkNotNullExpressionValue(var10001, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            PendingIntent pendingIntent = PendingIntent.getActivity(context, Integer.parseInt(var10001), var5, 0);
            views.setOnClickPendingIntent(id, pendingIntent);
        }
    }

    private final void setupDayOpenIntent(Context context, RemoteViews views, int id, String dayCode) {
        Intent var10000 = com.simplemobiletools.commons.extensions.ContextKt.getLaunchIntent(context);
        if (var10000 == null) {
            var10000 = new Intent(context, SplashActivity.class);
        }

        Intent var5 = var10000;
        int var7 = false;
        var5.putExtra("day_code", dayCode);
        var5.putExtra("view_to_open", 5);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, Integer.parseInt(dayCode), var5, 0);
        views.setOnClickPendingIntent(id, pendingIntent);
    }

    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String var3 = intent.getAction();
        if (Intrinsics.areEqual(var3, this.PREV)) {
            this.getPrevMonth(context);
        } else if (Intrinsics.areEqual(var3, this.NEXT)) {
            this.getNextMonth(context);
        } else if (Intrinsics.areEqual(var3, this.GO_TO_TODAY)) {
            this.goToToday(context);
        } else if (Intrinsics.areEqual(var3, this.NEW_EVENT)) {
            ContextKt.launchNewEventIntent$default(context, (com.simplemobiletools.calendar.pro.extensions.String)null, false, 3, (Object)null);
        } else {
            super.onReceive(context, intent);
        }

    }

    private final void getPrevMonth(Context context) {
        DateTime var10000 = targetDate;
        Intrinsics.checkNotNull(var10000);
        targetDate = var10000.minusMonths(1);
        MonthlyCalendarImpl var2 = new MonthlyCalendarImpl((MonthlyCalendar)this.monthlyCalendar, context);
        DateTime var10001 = targetDate;
        Intrinsics.checkNotNull(var10001);
        var2.getMonth(var10001);
    }

    private final void getNextMonth(Context context) {
        DateTime var10000 = targetDate;
        Intrinsics.checkNotNull(var10000);
        targetDate = var10000.plusMonths(1);
        MonthlyCalendarImpl var2 = new MonthlyCalendarImpl((MonthlyCalendar)this.monthlyCalendar, context);
        DateTime var10001 = targetDate;
        Intrinsics.checkNotNull(var10001);
        var2.getMonth(var10001);
    }

    private final void goToToday(Context context) {
        targetDate = DateTime.now().withDayOfMonth(1);
        MonthlyCalendarImpl var10000 = new MonthlyCalendarImpl((MonthlyCalendar)this.monthlyCalendar, context);
        DateTime var10001 = targetDate;
        Intrinsics.checkNotNull(var10001);
        var10000.getMonth(var10001);
    }

    private final void updateDays(Context context, RemoteViews views, List days) {
        boolean displayWeekNumbers = ContextKt.getConfig(context).getShowWeekNumbers();
        int textColor = ContextKt.getConfig(context).getWidgetTextColor();
        boolean dimPastEvents = ContextKt.getConfig(context).getDimPastEvents();
        float smallerFontSize = ContextKt.getWidgetFontSize(context) - 3.0F;
        Resources res = context.getResources();
        int len = days.size();
        String packageName = context.getPackageName();
        int var13 = false;
        views.setTextColor(1000401, textColor);
        RemoteViewsKt.setTextSize(views, 1000401, smallerFontSize);
        views.setViewVisibility(1000401, displayWeekNumbers ? 0 : 8);
        int i = 0;

        for(byte var12 = 5; i <= var12; ++i) {
            int id = res.getIdentifier("week_num_" + i, "id", packageName);
            int var16 = false;
            RemoteViewsKt.setText(views, id, "" + ((DayMonthly)days.get(i * 7 + 3)).getWeekOfYear() + ':');
            views.setTextColor(id, textColor);
            RemoteViewsKt.setTextSize(views, id, smallerFontSize);
            views.setViewVisibility(id, displayWeekNumbers ? 0 : 8);
        }

        i = 0;

        for(int var30 = len; i < var30; ++i) {
            DayMonthly day = (DayMonthly)days.get(i);
            int dayTextColor = ContextKt.getConfig(context).getHighlightWeekends() && day.isWeekend() ? ContextKt.getConfig(context).getHighlightWeekendsColor() : textColor;
            int weakTextColor = IntKt.adjustAlpha(dayTextColor, 0.5F);
            int currTextColor = day.isThisMonth() ? dayTextColor : weakTextColor;
            int id = res.getIdentifier("day_" + i, "id", packageName);
            views.removeAllViews(id);
            this.addDayNumber(context, views, day, currTextColor, id);
            this.setupDayOpenIntent(context, views, id, day.getCode());
            List var10001 = SequencesKt.toMutableList(SequencesKt.sortedWith(CollectionsKt.asSequence((Iterable)day.getDayEvents()), ComparisonsKt.compareBy(new Function1[]{(Function1)null.INSTANCE, (Function1)null.INSTANCE, (Function1)null.INSTANCE})));
            if (var10001 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.simplemobiletools.calendar.pro.models.Event> /* = java.util.ArrayList<com.simplemobiletools.calendar.pro.models.Event> */");
            }

            day.setDayEvents((ArrayList)var10001);
            Iterable $this$forEach$iv = (Iterable)day.getDayEvents();
            int $i$f$forEach = false;
            Iterator var20 = $this$forEach$iv.iterator();

            while(var20.hasNext()) {
                Object element$iv = var20.next();
                Event it = (Event)element$iv;
                int var23 = false;
                int backgroundColor = it.getColor();
                int eventTextColor = IntKt.getContrastColor(backgroundColor);
                if (!day.isThisMonth() || dimPastEvents && it.isPastEvent()) {
                    eventTextColor = IntKt.adjustAlpha(eventTextColor, 0.5F);
                    backgroundColor = IntKt.adjustAlpha(backgroundColor, 0.5F);
                }

                RemoteViews var26 = new RemoteViews(packageName, 1300196);
                int var28 = false;
                RemoteViewsKt.setText(var26, 1000529, StringsKt.replace$default(it.getTitle(), " ", " ", false, 4, (Object)null));
                var26.setTextColor(1000529, eventTextColor);
                RemoteViewsKt.setTextSize(var26, 1000529, smallerFontSize - 3.0F);
                RemoteViewsKt.setBackgroundColor(var26, 1000529, backgroundColor);
                views.addView(id, var26);
            }
        }

    }

    private final void addDayNumber(Context context, RemoteViews views, DayMonthly day, int textColor, int id) {
        RemoteViews var7 = new RemoteViews(context.getPackageName(), 1300152);
        int var9 = false;
        RemoteViewsKt.setText(var7, 1000486, String.valueOf(day.getValue()));
        RemoteViewsKt.setTextSize(var7, 1000486, ContextKt.getWidgetFontSize(context) - 3.0F);
        if (day.isToday()) {
            RemoteViewsKt.setBackgroundColor(var7, 1000486, textColor);
            var7.setTextColor(1000486, IntKt.getContrastColor(textColor));
        } else {
            var7.setTextColor(1000486, textColor);
        }

        views.addView(id, var7);
    }

    private final void updateDayLabels(Context context, RemoteViews views, Resources resources, int textColor) {
        Config config = ContextKt.getConfig(context);
        boolean sundayFirst = config.isSundayFirst();
        float smallerFontSize = ContextKt.getWidgetFontSize(context);
        String packageName = context.getPackageName();
        String[] var10000 = context.getResources().getStringArray(200017);
        Intrinsics.checkNotNullExpressionValue(var10000, "context.resources.getStr…R.array.week_day_letters)");
        String[] letters = var10000;
        int i = 0;

        for(byte var11 = 6; i <= var11; ++i) {
            int id = resources.getIdentifier("label_" + i, "id", packageName);
            int dayTextColor = ContextKt.getConfig(context).getHighlightWeekends() && ConstantsKt.isWeekend(i, sundayFirst) ? ContextKt.getConfig(context).getHighlightWeekendsColor() : textColor;
            views.setTextColor(id, dayTextColor);
            RemoteViewsKt.setTextSize(views, id, smallerFontSize);
            int index = i;
            if (sundayFirst) {
                index = (i + 6) % letters.length;
            }

            String var10002 = letters[index];
            Intrinsics.checkNotNullExpressionValue(letters[index], "letters[index]");
            RemoteViewsKt.setText(views, id, var10002);
        }

    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/MyWidgetMonthlyProvider$Companion;", "", "()V", "targetDate", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "Simple-Calendar.app"}
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
