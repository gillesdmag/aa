package com.simplemobiletools.calendar.pro.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.calendar.pro.models.Reminder;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/receivers/NotificationReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "handleIntent", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onReceive", "calendar_debug"}
)
public final class NotificationReceiver extends BroadcastReceiver {
    public void onReceive(@NotNull final Context context, @NotNull final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Object var10000 = context.getSystemService("power");
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
        } else {
            PowerManager powerManager = (PowerManager)var10000;
            WakeLock wakelock = powerManager.newWakeLock(1, "simplecalendar:notificationreceiver");
            wakelock.acquire(3000L);
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    NotificationReceiver.this.handleIntent(context, intent);
                }
            }));
        }
    }

    private final void handleIntent(Context context, Intent intent) {
        long id = intent.getLongExtra("event_id", -1L);
        if (id != -1L) {
            ContextKt.updateListWidget(context);
            Event event = ContextKt.getEventsDB(context).getEventWithId(id);
            if (event != null) {
                Iterable $this$none$iv = (Iterable)event.getReminders();
                int $i$f$none = false;
                boolean var10000;
                if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
                    var10000 = true;
                } else {
                    label52: {
                        Iterator var8 = $this$none$iv.iterator();

                        while(var8.hasNext()) {
                            Object element$iv = var8.next();
                            Reminder it = (Reminder)element$iv;
                            int var11 = false;
                            if (it.getType() == 0) {
                                var10000 = false;
                                break label52;
                            }
                        }

                        var10000 = true;
                    }
                }

                if (!var10000 && !event.getRepetitionExceptions().contains(Formatter.INSTANCE.getTodayCode())) {
                    if (!event.getRepetitionExceptions().contains(Formatter.INSTANCE.getDayCodeFromTS(event.getStartTS()))) {
                        ContextKt.notifyEvent(context, event);
                    }

                    ContextKt.scheduleNextEventReminder(context, event, false);
                    return;
                }
            }

        }
    }
}
