package com.simplemobiletools.calendar.pro.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.extensions.String;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/receivers/CalDAVSyncReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "calendar_debug"}
)
public final class CalDAVSyncReceiver extends BroadcastReceiver {
    public void onReceive(@NotNull final Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (ContextKt.getConfig(context).getCaldavSync()) {
            ContextKt.refreshCalDAVCalendars(context, (String)ContextKt.getConfig(context).getCaldavSyncedCalendarIds(), false);
        }

        ContextKt.recheckCalDAVCalendars(context, (Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ContextKt.updateWidgets(context);
            }
        }));
    }
}
