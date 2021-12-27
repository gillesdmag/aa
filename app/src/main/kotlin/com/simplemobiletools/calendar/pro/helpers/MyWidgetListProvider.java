package com.simplemobiletools.calendar.pro.helpers;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.RemoteViews;
import com.simplemobiletools.calendar.pro.activities.SplashActivity;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.services.WidgetService;
import com.simplemobiletools.calendar.pro.services.WidgetServiceEmpty;
import com.simplemobiletools.commons.extensions.RemoteViewsKt;
import com.simplemobiletools.commons.extensions.ResourcesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001d"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/MyWidgetListProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "GO_TO_TODAY", "", "LAUNCH_CAL", "NEW_EVENT", "getComponentName", "Landroid/content/ComponentName;", "context", "Landroid/content/Context;", "goToToday", "", "launchCalenderInDefaultView", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "performUpdate", "setupIntent", "views", "Landroid/widget/RemoteViews;", "action", "id", "", "Simple-Calendar.app"}
)
public final class MyWidgetListProvider extends AppWidgetProvider {
    private final String NEW_EVENT = "new_event";
    private final String LAUNCH_CAL = "launch_cal";
    private final String GO_TO_TODAY = "go_to_today";

    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        this.performUpdate(context);
    }

    private final void performUpdate(Context context) {
        float fontSize = ContextKt.getWidgetFontSize(context);
        int textColor = ContextKt.getConfig(context).getWidgetTextColor();
        AppWidgetManager var10000 = AppWidgetManager.getInstance(context);
        if (var10000 != null) {
            AppWidgetManager appWidgetManager = var10000;
            int[] var20 = appWidgetManager.getAppWidgetIds(this.getComponentName(context));
            Intrinsics.checkNotNullExpressionValue(var20, "appWidgetManager.getAppW…etComponentName(context))");
            int[] $this$forEach$iv = var20;
            int $i$f$forEach = false;
            int[] var7 = $this$forEach$iv;
            int var8 = $this$forEach$iv.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                int element$iv = var7[var9];
                int var12 = false;
                RemoteViews var13 = new RemoteViews(context.getPackageName(), 1300063);
                int var15 = false;
                RemoteViewsKt.applyColorFilter(var13, 1000641, ContextKt.getConfig(context).getWidgetBgColor());
                var13.setTextColor(1001293, textColor);
                RemoteViewsKt.setTextSize(var13, 1001293, fontSize);
                var13.setTextColor(1000857, textColor);
                RemoteViewsKt.setTextSize(var13, 1000857, fontSize);
                String todayText = Formatter.INSTANCE.getLongestDate(ConstantsKt.getNowSeconds());
                Intrinsics.checkNotNullExpressionValue(todayText, "todayText");
                RemoteViewsKt.setText(var13, 1000857, todayText);
                Resources var10002 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(var10002, "context.resources");
                var13.setImageViewBitmap(1001331, ResourcesKt.getColoredBitmap(var10002, 700251, textColor));
                this.setupIntent(context, var13, this.NEW_EVENT, 1001331);
                this.setupIntent(context, var13, this.LAUNCH_CAL, 1000857);
                var10002 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(var10002, "context.resources");
                var13.setImageViewBitmap(1000139, ResourcesKt.getColoredBitmap(var10002, 700293, textColor));
                this.setupIntent(context, var13, this.GO_TO_TODAY, 1000139);
                Intent startActivityIntent = new Intent(context, WidgetService.class);
                int var17 = false;
                startActivityIntent.setData(Uri.parse(startActivityIntent.toUri(1)));
                var13.setRemoteAdapter(1000082, startActivityIntent);
                Intent var21 = com.simplemobiletools.commons.extensions.ContextKt.getLaunchIntent(context);
                if (var21 == null) {
                    var21 = new Intent(context, SplashActivity.class);
                }

                startActivityIntent = var21;
                PendingIntent startActivityPendingIntent = PendingIntent.getActivity(context, 0, startActivityIntent, 134217728);
                var13.setPendingIntentTemplate(1000082, startActivityPendingIntent);
                var13.setEmptyView(1000082, 1001293);
                appWidgetManager.updateAppWidget(element$iv, var13);
                appWidgetManager.notifyAppWidgetViewDataChanged(element$iv, 1000082);
            }

        }
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, MyWidgetListProvider.class);
    }

    private final void setupIntent(Context context, RemoteViews views, String action, int id) {
        Intent var5 = new Intent(context, MyWidgetListProvider.class);
        int var7 = false;
        var5.setAction(action);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, var5, 0);
        views.setOnClickPendingIntent(id, pendingIntent);
    }

    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String var3 = intent.getAction();
        if (Intrinsics.areEqual(var3, this.NEW_EVENT)) {
            ContextKt.launchNewEventIntent$default(context, (com.simplemobiletools.calendar.pro.extensions.String)null, false, 3, (Object)null);
        } else if (Intrinsics.areEqual(var3, this.LAUNCH_CAL)) {
            this.launchCalenderInDefaultView(context);
        } else if (Intrinsics.areEqual(var3, this.GO_TO_TODAY)) {
            this.goToToday(context);
        } else {
            super.onReceive(context, intent);
        }

    }

    private final void launchCalenderInDefaultView(Context context) {
        Intent var10000 = com.simplemobiletools.commons.extensions.ContextKt.getLaunchIntent(context);
        if (var10000 == null) {
            var10000 = new Intent(context, SplashActivity.class);
        }

        Intent var2 = var10000;
        int var4 = false;
        var2.putExtra("day_code", Formatter.INSTANCE.getDayCodeFromDateTime(new DateTime()));
        var2.putExtra("view_to_open", ContextKt.getConfig(context).getListWidgetViewToOpen());
        var2.addFlags(268435456);
        context.startActivity(var2);
    }

    private final void goToToday(Context context) {
        AppWidgetManager var10000 = AppWidgetManager.getInstance(context);
        if (var10000 != null) {
            AppWidgetManager appWidgetManager = var10000;
            int[] var15 = appWidgetManager.getAppWidgetIds(this.getComponentName(context));
            Intrinsics.checkNotNullExpressionValue(var15, "appWidgetManager.getAppW…etComponentName(context))");
            int[] $this$forEach$iv = var15;
            int $i$f$forEach = false;
            int[] var5 = $this$forEach$iv;
            int var6 = $this$forEach$iv.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                int element$iv = var5[var7];
                int var10 = false;
                RemoteViews views = new RemoteViews(context.getPackageName(), 1300063);
                Intent var12 = new Intent(context, WidgetServiceEmpty.class);
                int var14 = false;
                var12.setData(Uri.parse(var12.toUri(1)));
                views.setRemoteAdapter(1000082, var12);
                appWidgetManager.updateAppWidget(element$iv, views);
            }

            this.performUpdate(context);
        }
    }
}
