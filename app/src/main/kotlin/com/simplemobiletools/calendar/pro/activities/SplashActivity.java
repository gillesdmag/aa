package com.simplemobiletools.calendar.pro.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.commons.activities.BaseSplashActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/SplashActivity;", "Lcom/simplemobiletools/commons/activities/BaseSplashActivity;", "()V", "initActivity", "", "calendar_debug"}
)
public final class SplashActivity extends BaseSplashActivity {
    private HashMap _$_findViewCache;

    public void initActivity() {
        label28: {
            Intent var10000 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(var10000, "intent");
            Bundle var6 = var10000.getExtras();
            Intent var1;
            boolean var3;
            if (var6 != null) {
                if (var6.containsKey("day_code")) {
                    var1 = new Intent((Context)this, MainActivity.class);
                    var3 = false;
                    var1.putExtra("day_code", this.getIntent().getStringExtra("day_code"));
                    var1.putExtra("view_to_open", this.getIntent().getIntExtra("view_to_open", 6));
                    this.startActivity(var1);
                    break label28;
                }
            }

            var10000 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(var10000, "intent");
            var6 = var10000.getExtras();
            if (var6 != null) {
                if (var6.containsKey("event_id")) {
                    var1 = new Intent((Context)this, MainActivity.class);
                    var3 = false;
                    var1.putExtra("event_id", this.getIntent().getLongExtra("event_id", 0L));
                    var1.putExtra("event_occurrence_ts", this.getIntent().getLongExtra("event_occurrence_ts", 0L));
                    this.startActivity(var1);
                    break label28;
                }
            }

            var10000 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(var10000, "intent");
            if (Intrinsics.areEqual(var10000.getAction(), "shortcut_new_event")) {
                String dayCode = Formatter.INSTANCE.getDayCodeFromDateTime(new DateTime());
                Intent var2 = new Intent((Context)this, EventActivity.class);
                int var4 = false;
                Intrinsics.checkNotNullExpressionValue(dayCode, "dayCode");
                var2.putExtra("new_event_start_ts", ContextKt.getNewEventTimestampFromCode$default(this, dayCode, false, 2, (Object)null));
                this.startActivity(var2);
            } else {
                this.startActivity(new Intent((Context)this, MainActivity.class));
            }
        }

        this.finish();
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
