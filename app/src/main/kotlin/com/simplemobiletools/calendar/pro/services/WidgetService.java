package com.simplemobiletools.calendar.pro.services;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import com.simplemobiletools.calendar.pro.adapters.EventListWidgetAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/services/WidgetService;", "Landroid/widget/RemoteViewsService;", "()V", "onGetViewFactory", "Lcom/simplemobiletools/calendar/pro/adapters/EventListWidgetAdapter;", "intent", "Landroid/content/Intent;", "calendar_debug"}
)
public final class WidgetService extends RemoteViewsService {
    @NotNull
    public EventListWidgetAdapter onGetViewFactory(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context var10002 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(var10002, "applicationContext");
        return new EventListWidgetAdapter(var10002);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public RemoteViewsFactory onGetViewFactory(Intent var1) {
        return (RemoteViewsFactory)this.onGetViewFactory(var1);
    }
}
