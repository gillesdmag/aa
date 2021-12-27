package com.simplemobiletools.calendar.pro.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
import com.simplemobiletools.calendar.pro.dialogs.DeleteEventDialog;
import com.simplemobiletools.calendar.pro.extensions.ActivityKt;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter;
import com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder;
import com.simplemobiletools.commons.extensions.DrawableKt;
import com.simplemobiletools.commons.extensions.IntKt;
import com.simplemobiletools.commons.extensions.ViewKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import com.simplemobiletools.commons.views.MyRecyclerView;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0017\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\rH\u0016J\u001c\u0010'\u001a\u00020\r2\n\u0010(\u001a\u00060)R\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010*\u001a\u00060)R\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0010\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020\r2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006H\u0002J\b\u00105\u001a\u00020\rH\u0002J\u0006\u00106\u001a\u00020\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/DayEventsAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "events", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/Event;", "Lkotlin/collections/ArrayList;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "allDayString", "", "dimPastEvents", "", "displayDescription", "getEvents", "()Ljava/util/ArrayList;", "isPrintVersion", "replaceDescriptionWithLocation", "actionItemPressed", "id", "", "askConfirmDelete", "getActionMenuId", "getIsItemSelectable", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getSelectableItemCount", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "setupView", "view", "Landroid/view/View;", "event", "shareEvents", "togglePrintMode", "calendar_debug"}
)
public final class DayEventsAdapter extends MyRecyclerViewAdapter {
    private final String allDayString;
    private final boolean displayDescription;
    private final boolean replaceDescriptionWithLocation;
    private final boolean dimPastEvents;
    private boolean isPrintVersion;
    @NotNull
    private final ArrayList events;

    public int getActionMenuId() {
        return 1400001;
    }

    public void prepareActionMode(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
    }

    public void actionItemPressed(int id) {
        switch(id) {
            case 1000497:
                this.askConfirmDelete();
                break;
            case 1000695:
                this.shareEvents();
        }

    }

    public int getSelectableItemCount() {
        return this.events.size();
    }

    public boolean getIsItemSelectable(int position) {
        return true;
    }

    @Nullable
    public Integer getItemSelectionKey(int position) {
        Event var10000 = (Event)CollectionsKt.getOrNull((List)this.events, position);
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
        List $this$indexOfFirst$iv = (List)this.events;
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
                Event it = (Event)item$iv;
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
        return this.createViewHolder(1300117, parent);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10000 = this.events.get(position);
        Intrinsics.checkNotNullExpressionValue(var10000, "events[position]");
        final Event event = (Event)var10000;
        holder.bindView(event, true, true, (Function2)(new Function2() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1, Object var2) {
                this.invoke((View)var1, ((Number)var2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View itemView, int layoutPosition) {
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                DayEventsAdapter.this.setupView(itemView, event);
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
        return this.events.size();
    }

    public final void togglePrintMode() {
        this.isPrintVersion = !this.isPrintVersion;
        this.setTextColor(this.isPrintVersion ? this.getResources().getColor(500098) : this.getBaseConfig().getTextColor());
        this.notifyDataSetChanged();
    }

    private final void setupView(View view, Event event) {
        int var5 = false;
        ConstraintLayout var10000 = (ConstraintLayout)view.findViewById(id.event_item_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_item_holder");
        Iterable var10001 = (Iterable)this.getSelectedKeys();
        Long var10002 = event.getId();
        var10000.setSelected(CollectionsKt.contains(var10001, var10002 != null ? (int)var10002 : null));
        var10000 = (ConstraintLayout)view.findViewById(id.event_item_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_item_holder");
        Drawable var8 = var10000.getBackground();
        Intrinsics.checkNotNullExpressionValue(var8, "event_item_holder.background");
        DrawableKt.applyColorFilter(var8, this.getTextColor());
        TextView var9 = (TextView)view.findViewById(id.event_item_title);
        Intrinsics.checkNotNullExpressionValue(var9, "event_item_title");
        var9.setText((CharSequence)event.getTitle());
        var9 = (TextView)view.findViewById(id.event_item_time);
        Intrinsics.checkNotNullExpressionValue(var9, "event_item_time");
        CharSequence var10;
        if (event.getIsAllDay()) {
            var10 = (CharSequence)this.allDayString;
        } else {
            Formatter var11 = Formatter.INSTANCE;
            Context var12 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(var12, "context");
            var10 = (CharSequence)var11.getTimeFromTS(var12, event.getStartTS());
        }

        var9.setText(var10);
        if (event.getStartTS() != event.getEndTS() && !event.getIsAllDay()) {
            var9 = (TextView)view.findViewById(id.event_item_time);
            Intrinsics.checkNotNullExpressionValue(var9, "event_item_time");
            StringBuilder var13 = new StringBuilder();
            TextView var14 = (TextView)view.findViewById(id.event_item_time);
            Intrinsics.checkNotNullExpressionValue(var14, "event_item_time");
            var13 = var13.append(var14.getText()).append(" - ");
            Formatter var16 = Formatter.INSTANCE;
            Context var10003 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(var10003, "context");
            var9.setText((CharSequence)var13.append(var16.getTimeFromTS(var10003, event.getEndTS())).toString());
        }

        View var15;
        boolean var19;
        label47: {
            var9 = (TextView)view.findViewById(id.event_item_description);
            Intrinsics.checkNotNullExpressionValue(var9, "event_item_description");
            var9.setText(this.replaceDescriptionWithLocation ? (CharSequence)event.getLocation() : (CharSequence)event.getDescription());
            var9 = (TextView)view.findViewById(id.event_item_description);
            Intrinsics.checkNotNullExpressionValue(var9, "event_item_description");
            var15 = (View)var9;
            if (this.displayDescription) {
                TextView var18 = (TextView)view.findViewById(id.event_item_description);
                Intrinsics.checkNotNullExpressionValue(var18, "event_item_description");
                var10 = var18.getText();
                Intrinsics.checkNotNullExpressionValue(var10, "event_item_description.text");
                CharSequence var6 = var10;
                if (var6.length() > 0) {
                    var19 = true;
                    break label47;
                }
            }

            var19 = false;
        }

        ViewKt.beVisibleIf(var15, var19);
        ImageView var17 = (ImageView)view.findViewById(id.event_item_color_bar);
        Intrinsics.checkNotNullExpressionValue(var17, "event_item_color_bar");
        var8 = var17.getBackground();
        Intrinsics.checkNotNullExpressionValue(var8, "event_item_color_bar.background");
        DrawableKt.applyColorFilter(var8, event.getColor());
        int newTextColor = this.getTextColor();
        if (this.dimPastEvents && event.isPastEvent() && !this.isPrintVersion) {
            newTextColor = IntKt.adjustAlpha(newTextColor, 0.5F);
        }

        ((TextView)view.findViewById(id.event_item_time)).setTextColor(newTextColor);
        ((TextView)view.findViewById(id.event_item_title)).setTextColor(newTextColor);
        var9 = (TextView)view.findViewById(id.event_item_description);
        if (var9 != null) {
            var9.setTextColor(newTextColor);
        }

    }

    private final void shareEvents() {
        BaseSimpleActivity var10000 = this.getActivity();
        Iterable $this$map$iv = (Iterable)CollectionsKt.distinct((Iterable)this.getSelectedKeys());
        BaseSimpleActivity var10 = var10000;
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        int $i$f$mapTo = false;
        Iterator var6 = $this$map$iv.iterator();

        while(var6.hasNext()) {
            Object item$iv$iv = var6.next();
            int it = ((Number)item$iv$iv).intValue();
            int var9 = false;
            Long var12 = (long)it;
            destination$iv$iv.add(var12);
        }

        List var11 = (List)destination$iv$iv;
        ActivityKt.shareEvents(var10, var11);
    }

    private final void askConfirmDelete() {
        Iterable $this$map$iv = (Iterable)this.getSelectedKeys();
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        int $i$f$mapTo = false;
        Iterator var7 = $this$map$iv.iterator();

        Long var14;
        while(var7.hasNext()) {
            Object item$iv$iv = var7.next();
            int it = ((Number)item$iv$iv).intValue();
            int var10 = false;
            var14 = (long)it;
            destination$iv$iv.add(var14);
        }

        List eventIds = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        Iterable $this$filter$iv = (Iterable)this.events;
        int $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$any = false;
        Iterator var25 = $this$filter$iv.iterator();

        boolean var11;
        Object element$iv;
        Event it;
        while(var25.hasNext()) {
            element$iv = var25.next();
            it = (Event)element$iv;
            var11 = false;
            Iterable var10000 = (Iterable)this.getSelectedKeys();
            Long var10001 = it.getId();
            if (CollectionsKt.contains(var10000, var10001 != null ? (int)var10001 : null)) {
                destination$iv$iv.add(element$iv);
            }
        }

        final List eventsToDelete = (List)destination$iv$iv;
        Iterable $this$map$iv = (Iterable)eventsToDelete;
        int hasRepeatableEvent = false;
        Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        int $i$f$mapTo = false;
        Iterator var28 = $this$map$iv.iterator();

        while(var28.hasNext()) {
            Object item$iv$iv = var28.next();
            Event it = (Event)item$iv$iv;
            int var12 = false;
            var14 = it.getStartTS();
            destination$iv$iv.add(var14);
        }

        final List timestamps = (List)destination$iv$iv;
        final ArrayList positions = MyRecyclerViewAdapter.getSelectedItemPositions$default(this, false, 1, (Object)null);
        Iterable $this$any$iv = (Iterable)eventsToDelete;
        $i$f$any = false;
        boolean var32;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            var32 = false;
        } else {
            label73: {
                var25 = $this$any$iv.iterator();

                while(var25.hasNext()) {
                    element$iv = var25.next();
                    it = (Event)element$iv;
                    var11 = false;
                    if (it.getRepeatInterval() > 0) {
                        var32 = true;
                        break label73;
                    }
                }

                var32 = false;
            }
        }

        hasRepeatableEvent = var32;
        new DeleteEventDialog((Activity)this.getActivity(), eventIds, hasRepeatableEvent, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final int it) {
                DayEventsAdapter.this.getEvents().removeAll((Collection)eventsToDelete);
                ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        List nonRepeatingEventIDs = SequencesKt.toMutableList(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence((Iterable)eventsToDelete), (Function1)null.INSTANCE), (Function1)null.INSTANCE));
                        ContextKt.getEventsHelper((Context)DayEventsAdapter.this.getActivity()).deleteEvents(nonRepeatingEventIDs, true);
                        List repeatingEventIDs = SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence((Iterable)eventsToDelete), (Function1)null.INSTANCE), (Function1)null.INSTANCE));
                        ContextKt.handleEventDeleting((Context)DayEventsAdapter.this.getActivity(), repeatingEventIDs, timestamps, it);
                        DayEventsAdapter.this.getActivity().runOnUiThread((Runnable)(new Runnable() {
                            public final void run() {
                                DayEventsAdapter.this.removeSelectedItems(positions);
                            }
                        }));
                    }
                }));
            }
        }));
    }

    @NotNull
    public final ArrayList getEvents() {
        return this.events;
    }

    public DayEventsAdapter(@NotNull SimpleActivity activity, @NotNull ArrayList events, @NotNull MyRecyclerView recyclerView, @NotNull Function1 itemClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        super((BaseSimpleActivity)activity, recyclerView, itemClick);
        this.events = events;
        String var10001 = this.getResources().getString(1900325);
        Intrinsics.checkNotNullExpressionValue(var10001, "resources.getString(R.string.all_day)");
        this.allDayString = var10001;
        this.displayDescription = ContextKt.getConfig((Context)activity).getDisplayDescription();
        this.replaceDescriptionWithLocation = ContextKt.getConfig((Context)activity).getReplaceDescription();
        this.dimPastEvents = ContextKt.getConfig((Context)activity).getDimPastEvents();
        this.setupDragListener(true);
    }
}
