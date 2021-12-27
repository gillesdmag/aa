package com.simplemobiletools.calendar.pro.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.adapters.ManageEventTypesAdapter;
import com.simplemobiletools.calendar.pro.dialogs.EditEventTypeDialog;
import com.simplemobiletools.calendar.pro.interfaces.DeleteEventTypesListener;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.extensions.ContextKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import com.simplemobiletools.commons.views.MyRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u0017"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/ManageEventTypesActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "Lcom/simplemobiletools/calendar/pro/interfaces/DeleteEventTypesListener;", "()V", "deleteEventTypes", "", "eventTypes", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "deleteEvents", "getEventTypes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showEventTypeDialog", "eventType", "calendar_debug"}
)
public final class ManageEventTypesActivity extends SimpleActivity implements DeleteEventTypesListener {
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300099);
        this.getEventTypes();
        MyRecyclerView var10001 = (MyRecyclerView)this._$_findCachedViewById(id.manage_event_types_list);
        Intrinsics.checkNotNullExpressionValue(var10001, "manage_event_types_list");
        ContextKt.updateTextColors$default(this, (ViewGroup)var10001, 0, 0, 6, (Object)null);
    }

    private final void showEventTypeDialog(EventType eventType) {
        new EditEventTypeDialog((Activity)this, eventType != null ? EventType.copy$default(eventType, (Long)null, (String)null, 0, 0, (String)null, (String)null, 63, (Object)null) : null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((EventType)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull EventType it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ManageEventTypesActivity.this.getEventTypes();
            }
        }));
    }

    // $FF: synthetic method
    static void showEventTypeDialog$default(ManageEventTypesActivity var0, EventType var1, int var2, Object var3) {
        if ((var2 & 1) != 0) {
            var1 = (EventType)null;
        }

        var0.showEventTypeDialog(var1);
    }

    private final void getEventTypes() {
        com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(this).getEventTypes((Activity)this, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SimpleActivity var10002 = (SimpleActivity)ManageEventTypesActivity.this;
                DeleteEventTypesListener var10004 = (DeleteEventTypesListener)ManageEventTypesActivity.this;
                MyRecyclerView var10005 = (MyRecyclerView)ManageEventTypesActivity.this._$_findCachedViewById(id.manage_event_types_list);
                Intrinsics.checkNotNullExpressionValue(var10005, "manage_event_types_list");
                ManageEventTypesAdapter adapter = new ManageEventTypesAdapter(var10002, it, var10004, var10005, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ManageEventTypesActivity.this.showEventTypeDialog((EventType)it);
                    }
                }));
                MyRecyclerView var10000 = (MyRecyclerView)ManageEventTypesActivity.this._$_findCachedViewById(id.manage_event_types_list);
                Intrinsics.checkNotNullExpressionValue(var10000, "manage_event_types_list");
                var10000.setAdapter((Adapter)adapter);
            }
        }));
    }

    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        this.getMenuInflater().inflate(1400002, menu);
        BaseSimpleActivity.updateMenuItemColors$default(this, menu, false, 0, 6, (Object)null);
        return true;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        switch(item.getItemId()) {
            case 1000187:
                showEventTypeDialog$default(this, (EventType)null, 1, (Object)null);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public boolean deleteEventTypes(@NotNull final ArrayList eventTypes, final boolean deleteEvents) {
        Intrinsics.checkNotNullParameter(eventTypes, "eventTypes");
        Iterable $this$any$iv = (Iterable)eventTypes;
        int $i$f$any = false;
        boolean var10000;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            var10000 = false;
        } else {
            label42: {
                Iterator var5 = $this$any$iv.iterator();

                while(var5.hasNext()) {
                    Object element$iv = var5.next();
                    EventType it = (EventType)element$iv;
                    int var8 = false;
                    if (it.getCaldavCalendarId() != 0) {
                        var10000 = true;
                        break label42;
                    }
                }

                var10000 = false;
            }
        }

        if (var10000) {
            ContextKt.toast$default(this, 1900007, 0, 2, (Object)null);
            if (eventTypes.size() == 1) {
                return false;
            }
        }

        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(ManageEventTypesActivity.this).deleteEventTypes(eventTypes, deleteEvents);
            }
        }));
        return true;
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
