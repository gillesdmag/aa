package com.simplemobiletools.calendar.pro.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.interfaces.DeleteEventTypesListener;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter;
import com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder;
import com.simplemobiletools.commons.dialogs.ConfirmationDialog;
import com.simplemobiletools.commons.dialogs.RadioGroupDialog;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.models.RadioItem;
import com.simplemobiletools.commons.views.MyRecyclerView;
import com.simplemobiletools.commons.views.MyTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010&\u001a\u00020\u000eH\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J\u001c\u0010(\u001a\u00020\u000e2\n\u0010)\u001a\u00060*R\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u001c\u0010+\u001a\u00060*R\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0016H\u0016J\u0010\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u000201H\u0016J\u0018\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0006H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00066"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/ManageEventTypesAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "eventTypes", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "listener", "Lcom/simplemobiletools/calendar/pro/interfaces/DeleteEventTypesListener;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/calendar/pro/interfaces/DeleteEventTypesListener;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "getEventTypes", "()Ljava/util/ArrayList;", "getListener", "()Lcom/simplemobiletools/calendar/pro/interfaces/DeleteEventTypesListener;", "actionItemPressed", "id", "", "askConfirmDelete", "deleteEventTypes", "deleteEvents", "", "getActionMenuId", "getIsItemSelectable", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getItemWithKey", "getSelectableItemCount", "getSelectedItems", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "setupView", "view", "Landroid/view/View;", "eventType", "calendar_debug"}
)
public final class ManageEventTypesAdapter extends MyRecyclerViewAdapter {
    @NotNull
    private final ArrayList eventTypes;
    @Nullable
    private final DeleteEventTypesListener listener;

    public int getActionMenuId() {
        return 1400008;
    }

    public void prepareActionMode(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
    }

    public void actionItemPressed(int id) {
        switch(id) {
            case 1000497:
                this.askConfirmDelete();
            default:
        }
    }

    public int getSelectableItemCount() {
        return this.eventTypes.size();
    }

    public boolean getIsItemSelectable(int position) {
        return true;
    }

    @Nullable
    public Integer getItemSelectionKey(int position) {
        EventType var10000 = (EventType)CollectionsKt.getOrNull((List)this.eventTypes, position);
        Integer var3;
        if (var10000 != null) {
            Long var2 = var10000.getId();
            if (var2 != null) {
                var3 = (int)var2;
                return var3;
            }
        }

        var3 = null;
        return var3;
    }

    public int getItemKeyPosition(int key) {
        List $this$indexOfFirst$iv = (List)this.eventTypes;
        int $i$f$indexOfFirst = false;
        int index$iv = 0;
        Iterator var5 = $this$indexOfFirst$iv.iterator();

        int var10;
        while(true) {
            if (!var5.hasNext()) {
                var10 = -1;
                break;
            }

            boolean var9;
            label23: {
                Object item$iv = var5.next();
                EventType it = (EventType)item$iv;
                int var8 = false;
                Long var10000 = it.getId();
                if (var10000 != null) {
                    if ((int)var10000 == key) {
                        var9 = true;
                        break label23;
                    }
                }

                var9 = false;
            }

            if (var9) {
                var10 = index$iv;
                break;
            }

            ++index$iv;
        }

        return var10;
    }

    public void onActionModeCreated() {
    }

    public void onActionModeDestroyed() {
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.createViewHolder(1300139, parent);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10000 = this.eventTypes.get(position);
        Intrinsics.checkNotNullExpressionValue(var10000, "eventTypes[position]");
        final EventType eventType = (EventType)var10000;
        holder.bindView(eventType, true, true, (Function2)(new Function2() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1, Object var2) {
                this.invoke((View)var1, ((Number)var2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View itemView, int layoutPosition) {
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                ManageEventTypesAdapter.this.setupView(itemView, eventType);
            }
        }));
        this.bindViewHolder(holder);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((ViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.eventTypes.size();
    }

    private final EventType getItemWithKey(int key) {
        Iterable $this$firstOrNull$iv = (Iterable)this.eventTypes;
        int $i$f$firstOrNull = false;
        Iterator var4 = $this$firstOrNull$iv.iterator();

        Object var9;
        while(true) {
            if (!var4.hasNext()) {
                var9 = null;
                break;
            }

            Object element$iv;
            boolean var8;
            label22: {
                element$iv = var4.next();
                EventType it = (EventType)element$iv;
                int var7 = false;
                Long var10000 = it.getId();
                if (var10000 != null) {
                    if ((int)var10000 == key) {
                        var8 = true;
                        break label22;
                    }
                }

                var8 = false;
            }

            if (var8) {
                var9 = element$iv;
                break;
            }
        }

        return (EventType)var9;
    }

    private final ArrayList getSelectedItems() {
        Iterable $this$filter$iv = (Iterable)this.eventTypes;
        int $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var6 = $this$filter$iv.iterator();

        while(var6.hasNext()) {
            Object element$iv$iv = var6.next();
            EventType it = (EventType)element$iv$iv;
            int var9 = false;
            Iterable var10000 = (Iterable)this.getSelectedKeys();
            Long var10001 = it.getId();
            if (CollectionsKt.contains(var10000, var10001 != null ? (int)var10001 : null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        return (ArrayList)((List)destination$iv$iv);
    }

    private final void setupView(View view, EventType eventType) {
        int var5 = false;
        FrameLayout var10000 = (FrameLayout)view.findViewById(id.event_item_frame);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_item_frame");
        Iterable var10001 = (Iterable)this.getSelectedKeys();
        Long var10002 = eventType.getId();
        var10000.setSelected(CollectionsKt.contains(var10001, var10002 != null ? (int)var10002 : null));
        MyTextView var6 = (MyTextView)view.findViewById(id.event_type_title);
        Intrinsics.checkNotNullExpressionValue(var6, "event_type_title");
        var6.setText((CharSequence)eventType.getDisplayTitle());
        ImageView var7 = (ImageView)view.findViewById(id.event_type_color);
        Intrinsics.checkNotNullExpressionValue(var7, "event_type_color");
        ImageViewKt.setFillWithStroke$default(var7, eventType.getColor(), ContextKt.getConfig((Context)this.getActivity()).getBackgroundColor(), false, 4, (Object)null);
        ((MyTextView)view.findViewById(id.event_type_title)).setTextColor(this.getTextColor());
    }

    private final void askConfirmDelete() {
        Iterable $this$map$iv = (Iterable)this.eventTypes;
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$mapTo = false;
        Iterator var7 = $this$map$iv.iterator();

        Object item$iv$iv;
        EventType it;
        boolean var10;
        while(var7.hasNext()) {
            item$iv$iv = var7.next();
            it = (EventType)item$iv$iv;
            var10 = false;
            Iterable var10000 = (Iterable)this.getSelectedKeys();
            Long var10001 = it.getId();
            if (CollectionsKt.contains(var10000, var10001 != null ? (int)var10001 : null)) {
                destination$iv$iv.add(item$iv$iv);
            }
        }

        $this$map$iv = (Iterable)((List)destination$iv$iv);
        $i$f$map = false;
        destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        $i$f$mapTo = false;
        var7 = $this$map$iv.iterator();

        while(var7.hasNext()) {
            item$iv$iv = var7.next();
            it = (EventType)item$iv$iv;
            var10 = false;
            Long var12 = it.getId();
            destination$iv$iv.add(var12);
        }

        ArrayList eventTypes = (ArrayList)((List)destination$iv$iv);
        ContextKt.getEventsHelper((Context)this.getActivity()).doEventTypesContainEvents(eventTypes, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Boolean)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(final boolean it) {
                ManageEventTypesAdapter.this.getActivity().runOnUiThread((Runnable)(new Runnable() {
                    public final void run() {
                        if (it) {
                            int MOVE_EVENTS = 0;
                            final int DELETE_EVENTS = 1;
                            Resources res = ManageEventTypesAdapter.this.getActivity().getResources();
                            ArrayList var5 = new ArrayList();
                            int var7 = false;
                            String var10004 = res.getString(1901066);
                            Intrinsics.checkNotNullExpressionValue(var10004, "res.getString(R.string.move_events_into_default)");
                            var5.add(new RadioItem(MOVE_EVENTS, var10004, (Object)null, 4, (DefaultConstructorMarker)null));
                            var10004 = res.getString(1900924);
                            Intrinsics.checkNotNullExpressionValue(var10004, "res.getString(R.string.remove_affected_events)");
                            var5.add(new RadioItem(DELETE_EVENTS, var10004, (Object)null, 4, (DefaultConstructorMarker)null));
                            new RadioGroupDialog((Activity)ManageEventTypesAdapter.this.getActivity(), var5, 0, 0, false, (Function0)null, (Function1)(new Function1() {
                                // $FF: synthetic method
                                // $FF: bridge method
                                public Object invoke(Object var1) {
                                    this.invoke(var1);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull Object itx) {
                                    Intrinsics.checkNotNullParameter(itx, "it");
                                    ManageEventTypesAdapter.this.deleteEventTypes(Intrinsics.areEqual(itx, Integer.valueOf(DELETE_EVENTS)));
                                }
                            }), 60, (DefaultConstructorMarker)null);
                        } else {
                            new ConfirmationDialog((Activity)ManageEventTypesAdapter.this.getActivity(), (String)null, 0, 0, 0, false, (Function0)(new Function0() {
                                // $FF: synthetic method
                                // $FF: bridge method
                                public Object invoke() {
                                    this.invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    ManageEventTypesAdapter.this.deleteEventTypes(true);
                                }
                            }), 62, (DefaultConstructorMarker)null);
                        }

                    }
                }));
            }
        }));
    }

    private final void deleteEventTypes(boolean deleteEvents) {
        ArrayList eventTypesToDelete = this.getSelectedItems();
        Iterator var4 = this.getSelectedKeys().iterator();

        while(var4.hasNext()) {
            Integer key = (Integer)var4.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            EventType var10000 = this.getItemWithKey(key);
            if (var10000 != null) {
                EventType type = var10000;
                Long var9 = type.getId();
                long var6 = 1L;
                if (var9 != null) {
                    if (var9 == var6) {
                        com.simplemobiletools.commons.extensions.ContextKt.toast$default((Context)this.getActivity(), 1900666, 0, 2, (Object)null);
                        eventTypesToDelete.remove(type);
                        Long var10003 = type.getId();
                        Intrinsics.checkNotNull(var10003);
                        MyRecyclerViewAdapter.toggleItemSelection$default(this, false, this.getItemKeyPosition((int)var10003), false, 4, (Object)null);
                        break;
                    }
                }
            }
        }

        DeleteEventTypesListener var10 = this.listener;
        if (var10 != null) {
            if (var10.deleteEventTypes(eventTypesToDelete, deleteEvents)) {
                ArrayList positions = MyRecyclerViewAdapter.getSelectedItemPositions$default(this, false, 1, (Object)null);
                this.eventTypes.removeAll((Collection)eventTypesToDelete);
                this.removeSelectedItems(positions);
            }
        }

    }

    @NotNull
    public final ArrayList getEventTypes() {
        return this.eventTypes;
    }

    @Nullable
    public final DeleteEventTypesListener getListener() {
        return this.listener;
    }

    public ManageEventTypesAdapter(@NotNull SimpleActivity activity, @NotNull ArrayList eventTypes, @Nullable DeleteEventTypesListener listener, @NotNull MyRecyclerView recyclerView, @NotNull Function1 itemClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventTypes, "eventTypes");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        super((BaseSimpleActivity)activity, recyclerView, itemClick);
        this.eventTypes = eventTypes;
        this.listener = listener;
        this.setupDragListener(true);
    }
}
