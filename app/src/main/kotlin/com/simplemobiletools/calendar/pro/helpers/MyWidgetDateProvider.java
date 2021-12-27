package com.simplemobiletools.calendar.pro.helpers;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.simplemobiletools.calendar.pro.activities.SplashActivity;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.commons.extensions.RemoteViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/MyWidgetDateProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "OPEN_APP_INTENT_ID", "", "getComponentName", "Landroid/content/ComponentName;", "context", "Landroid/content/Context;", "onUpdate", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "setupAppOpenIntent", "views", "Landroid/widget/RemoteViews;", "Simple-Calendar.app"}
)
public final class MyWidgetDateProvider extends AppWidgetProvider {
    private final int OPEN_APP_INTENT_ID = 1;

    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        int[] var10000 = appWidgetManager.getAppWidgetIds(this.getComponentName(context));
        Intrinsics.checkNotNullExpressionValue(var10000, "appWidgetManager.getAppW…etComponentName(context))");
        int[] $this$forEach$iv = var10000;
        int $i$f$forEach = false;
        int[] var6 = $this$forEach$iv;
        int var7 = $this$forEach$iv.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            int element$iv = var6[var8];
            int var11 = false;
            RemoteViews var12 = new RemoteViews(context.getPackageName(), 1300029);
            int var14 = false;
            RemoteViewsKt.applyColorFilter(var12, 1000610, ContextKt.getConfig(context).getWidgetBgColor());
            String var10002 = Formatter.INSTANCE.getTodayDayNumber();
            Intrinsics.checkNotNullExpressionValue(var10002, "Formatter.getTodayDayNumber()");
            RemoteViewsKt.setText(var12, 1001246, var10002);
            var10002 = Formatter.INSTANCE.getCurrentMonthShort();
            Intrinsics.checkNotNullExpressionValue(var10002, "Formatter.getCurrentMonthShort()");
            RemoteViewsKt.setText(var12, 1000677, var10002);
            var12.setTextColor(1001246, ContextKt.getConfig(context).getWidgetTextColor());
            var12.setTextColor(1000677, ContextKt.getConfig(context).getWidgetTextColor());
            this.setupAppOpenIntent(context, var12);
            appWidgetManager.updateAppWidget(element$iv, var12);
            appWidgetManager.notifyAppWidgetViewDataChanged(element$iv, 1000686);
        }

    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, MyWidgetDateProvider.class);
    }

    private final void setupAppOpenIntent(Context context, RemoteViews views) {
        Intent var10000 = com.simplemobiletools.commons.extensions.ContextKt.getLaunchIntent(context);
        if (var10000 == null) {
            var10000 = new Intent(context, SplashActivity.class);
        }

        Intent var3 = var10000;
        int var5 = false;
        PendingIntent pendingIntent = PendingIntent.getActivity(context, this.OPEN_APP_INTENT_ID, var3, 134217728);
        views.setOnClickPendingIntent(1000686, pendingIntent);
    }
}
