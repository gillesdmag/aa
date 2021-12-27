package com.simplemobiletools.calendar.pro.adapters;

import android.content.Context;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/EventListWidgetAdapterEmpty;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getCount", "", "getItemId", "", "position", "getLoadingView", "", "getViewAt", "Landroid/widget/RemoteViews;", "getViewTypeCount", "hasStableIds", "", "onCreate", "", "onDataSetChanged", "onDestroy", "calendar_debug"}
)
public final class EventListWidgetAdapterEmpty implements RemoteViewsFactory {
    @NotNull
    private final Context context;

    @NotNull
    public RemoteViews getViewAt(int position) {
        return new RemoteViews(this.context.getPackageName(), 1300216);
    }

    @Nullable
    public Void getLoadingView() {
        return null;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public RemoteViews getLoadingView() {
        return (RemoteViews)this.getLoadingView();
    }

    public int getViewTypeCount() {
        return 1;
    }

    public void onCreate() {
    }

    public long getItemId(int position) {
        return 0L;
    }

    public void onDataSetChanged() {
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return 0;
    }

    public void onDestroy() {
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public EventListWidgetAdapterEmpty(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super();
        this.context = context;
    }
}
