package com.simplemobiletools.calendar.pro.services;

import android.app.IntentService;
import android.content.Intent;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.extensions.Int;
import com.simplemobiletools.calendar.pro.models.Event;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/services/SnoozeService;", "Landroid/app/IntentService;", "()V", "onHandleIntent", "", "intent", "Landroid/content/Intent;", "calendar_debug"}
)
public final class SnoozeService extends IntentService {
    protected void onHandleIntent(@Nullable Intent intent) {
        if (intent != null) {
            long eventId = intent.getLongExtra("event_id", 0L);
            Event event = ContextKt.getEventsDB(this).getEventWithId(eventId);
            ContextKt.rescheduleReminder(this, event, (Int)ContextKt.getConfig(this).getSnoozeTime());
        }

    }

    public SnoozeService() {
        super("Snooze");
    }
}
