package com.simplemobiletools.calendar.pro.activities;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/SnoozeReminderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "dialogCancelled", "", "finishActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "calendar_debug"}
)
public final class SnoozeReminderActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityKt.showPickSecondsDialogHelper$default(this, ContextKt.getConfig(this).getSnoozeTime(), true, false, false, (Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                SnoozeReminderActivity.this.dialogCancelled();
            }
        }), (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final int it) {
                ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        long eventId = SnoozeReminderActivity.this.getIntent().getLongExtra("event_id", 0L);
                        Event event = ContextKt.getEventsDB(SnoozeReminderActivity.this).getEventWithId(eventId);
                        ContextKt.getConfig(SnoozeReminderActivity.this).setSnoozeTime(it / 60);
                        ContextKt.rescheduleReminder(SnoozeReminderActivity.this, event, it / 60);
                        SnoozeReminderActivity.this.runOnUiThread((Runnable)(new Runnable() {
                            public final void run() {
                                SnoozeReminderActivity.this.finishActivity();
                            }
                        }));
                    }
                }));
            }
        }), 12, (Object)null);
    }

    private final void dialogCancelled() {
        this.finishActivity();
    }

    private final void finishActivity() {
        this.finish();
        this.overridePendingTransition(0, 0);
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
