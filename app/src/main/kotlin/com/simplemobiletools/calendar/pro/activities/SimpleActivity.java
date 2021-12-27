package com.simplemobiletools.calendar.pro.activities;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.CalendarContract.Calendars;
import android.view.View;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0013\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0002J\u0018\u0010\u001c\u001a\u00020\t*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u001f"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "()V", "CALDAV_REFRESH_DELAY", "", "getCALDAV_REFRESH_DELAY", "()J", "calDAVRefreshCallback", "Lkotlin/Function0;", "", "getCalDAVRefreshCallback", "()Lkotlin/jvm/functions/Function0;", "setCalDAVRefreshCallback", "(Lkotlin/jvm/functions/Function0;)V", "calDAVRefreshHandler", "Landroid/os/Handler;", "getCalDAVRefreshHandler", "()Landroid/os/Handler;", "calDAVSyncObserver", "com/simplemobiletools/calendar/pro/activities/SimpleActivity$calDAVSyncObserver$1", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity$calDAVSyncObserver$1;", "getAppIconIDs", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAppLauncherName", "", "unregisterObserver", "syncCalDAVCalendars", "Landroid/content/Context;", "callback", "calendar_debug"}
)
public class SimpleActivity extends BaseSimpleActivity {
    private final long CALDAV_REFRESH_DELAY = 3000L;
    @NotNull
    private final Handler calDAVRefreshHandler = new Handler();
    @Nullable
    private Function0 calDAVRefreshCallback;
    private final <undefinedtype> calDAVSyncObserver = new ContentObserver(new Handler()) {
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            if (!selfChange) {
                SimpleActivity.this.getCalDAVRefreshHandler().removeCallbacksAndMessages((Object)null);
                SimpleActivity.this.getCalDAVRefreshHandler().postDelayed((Runnable)(new Runnable() {
                    public final void run() {
                        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke() {
                                this.invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                SimpleActivity.this.unregisterObserver();
                                Function0 var10000 = SimpleActivity.this.getCalDAVRefreshCallback();
                                if (var10000 != null) {
                                    Unit var1 = (Unit)var10000.invoke();
                                }

                                SimpleActivity.this.setCalDAVRefreshCallback((Function0)null);
                            }
                        }));
                    }
                }), SimpleActivity.this.getCALDAV_REFRESH_DELAY());
            }

        }
    };
    private HashMap _$_findViewCache;

    public final long getCALDAV_REFRESH_DELAY() {
        return this.CALDAV_REFRESH_DELAY;
    }

    @NotNull
    public final Handler getCalDAVRefreshHandler() {
        return this.calDAVRefreshHandler;
    }

    @Nullable
    public final Function0 getCalDAVRefreshCallback() {
        return this.calDAVRefreshCallback;
    }

    public final void setCalDAVRefreshCallback(@Nullable Function0 var1) {
        this.calDAVRefreshCallback = var1;
    }

    @NotNull
    public ArrayList getAppIconIDs() {
        return CollectionsKt.arrayListOf(new Integer[]{1500025, 1500031, 1500027, 1500035, 1500001, 1500026, 1500009, 1500018, 1500007, 1500010, 1500008, 1500002, 1500034, 1500028, 1500012, 1500000, 1500024, 1500006, 1500029});
    }

    @NotNull
    public String getAppLauncherName() {
        String var10000 = this.getString(1900264);
        Intrinsics.checkNotNullExpressionValue(var10000, "getString(R.string.app_launcher_name)");
        return var10000;
    }

    public final void syncCalDAVCalendars(@NotNull final Context $this$syncCalDAVCalendars, @NotNull Function0 callback) {
        Intrinsics.checkNotNullParameter($this$syncCalDAVCalendars, "$this$syncCalDAVCalendars");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.calDAVRefreshCallback = callback;
        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Uri uri = Calendars.CONTENT_URI;
                $this$syncCalDAVCalendars.getContentResolver().unregisterContentObserver((ContentObserver)SimpleActivity.this.calDAVSyncObserver);
                $this$syncCalDAVCalendars.getContentResolver().registerContentObserver(uri, false, (ContentObserver)SimpleActivity.this.calDAVSyncObserver);
                ContextKt.refreshCalDAVCalendars($this$syncCalDAVCalendars, ContextKt.getConfig($this$syncCalDAVCalendars).getCaldavSyncedCalendarIds(), true);
            }
        }));
    }

    private final void unregisterObserver() {
        this.getContentResolver().unregisterContentObserver((ContentObserver)this.calDAVSyncObserver);
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
