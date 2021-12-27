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
import com.simplemobiletools.calendar.pro.models.ListEvent;
import com.simplemobiletools.calendar.pro.models.ListItem;
import com.simplemobiletools.calendar.pro.models.ListSectionDay;
import com.simplemobiletools.calendar.pro.models.ListSectionMonth;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter;
import com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder;
import com.simplemobiletools.commons.extensions.DrawableKt;
import com.simplemobiletools.commons.extensions.IntKt;
import com.simplemobiletools.commons.extensions.ViewKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\u0010\u0011J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020\u0017H\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0017H\u0016J\b\u0010+\u001a\u00020\u0017H\u0016J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017H\u0016J\u0017\u0010.\u001a\u0004\u0018\u00010\u00172\u0006\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0016J\b\u00101\u001a\u00020\u0017H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\"0\u0005H\u0002J\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\u001c\u00105\u001a\u00020\u00102\n\u00106\u001a\u000607R\u00020\u00012\u0006\u0010*\u001a\u00020\u0017H\u0016J\u001c\u00108\u001a\u000607R\u00020\u00012\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0017H\u0016J\u0010\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010D\u001a\u00020\u00102\u0006\u0010@\u001a\u00020A2\u0006\u0010E\u001a\u00020FH\u0002J\u0018\u0010G\u001a\u00020\u00102\u0006\u0010@\u001a\u00020A2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020\u0010H\u0002J\u000e\u0010K\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\bJ\u0006\u0010L\u001a\u00020\u0010J\u0014\u0010M\u001a\u00020\u00102\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/EventListAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "listItems", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/ListItem;", "allowLongClick", "", "listener", "Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/util/ArrayList;ZLcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "allDayString", "", "getAllowLongClick", "()Z", "currentItemsHash", "", "dimPastEvents", "displayDescription", "isPrintVersion", "getListItems", "()Ljava/util/ArrayList;", "setListItems", "(Ljava/util/ArrayList;)V", "getListener", "()Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;", "now", "", "replaceDescription", "use24HourFormat", "actionItemPressed", "id", "askConfirmDelete", "getActionMenuId", "getIsItemSelectable", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getItemViewType", "getSelectableItemCount", "getSelectedEventIds", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "setupListEvent", "view", "Landroid/view/View;", "listEvent", "Lcom/simplemobiletools/calendar/pro/models/ListEvent;", "setupListSectionDay", "listSectionDay", "Lcom/simplemobiletools/calendar/pro/models/ListSectionDay;", "setupListSectionMonth", "listSectionMonth", "Lcom/simplemobiletools/calendar/pro/models/ListSectionMonth;", "shareEvents", "toggle24HourFormat", "togglePrintMode", "updateListItems", "newListItems", "calendar_debug"}
)
public final class EventListAdapter extends MyRecyclerViewAdapter {
    private final String allDayString;
    private final boolean displayDescription;
    private final boolean replaceDescription;
    private final boolean dimPastEvents;
    private final long now;
    private boolean use24HourFormat;
    private int currentItemsHash;
    private boolean isPrintVersion;
    @NotNull
    private ArrayList listItems;
    private final boolean allowLongClick;
    @Nullable
    private final RefreshRecyclerViewListener listener;

    public int getActionMenuId() {
        return 1400007;
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
        Iterable $this$filter$iv = (Iterable)this.listItems;
        int $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var6 = $this$filter$iv.iterator();

        while(var6.hasNext()) {
            Object element$iv$iv = var6.next();
            ListItem it = (ListItem)element$iv$iv;
            int var9 = false;
            if (it instanceof ListEvent) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        return ((List)destination$iv$iv).size();
    }

    public boolean getIsItemSelectable(int position) {
        return this.listItems.get(position) instanceof ListEvent;
    }

    @Nullable
    public Integer getItemSelectionKey(int position) {
        Object var10000 = CollectionsKt.getOrNull((List)this.listItems, position);
        if (!(var10000 instanceof ListEvent)) {
            var10000 = null;
        }

        return (ListEvent)var10000 != null ? ((ListEvent)var10000).hashCode() : null;
    }

    public int getItemKeyPosition(int key) {
        List $this$indexOfFirst$iv = (List)this.listItems;
        int $i$f$indexOfFirst = false;
        int index$iv = 0;
        Iterator var5 = $this$indexOfFirst$iv.iterator();

        int var11;
        while(true) {
            if (!var5.hasNext()) {
                var11 = -1;
                break;
            }

            Object item$iv = var5.next();
            ListItem it = (ListItem)item$iv;
            int var8 = false;
            ListItem var10000 = it;
            if (!(it instanceof ListEvent)) {
                var10000 = null;
            }

            boolean var10;
            label25: {
                ListEvent var9 = (ListEvent)var10000;
                if ((ListEvent)var10000 != null) {
                    if (var9.hashCode() == key) {
                        var10 = true;
                        break label25;
                    }
                }

                var10 = false;
            }

            if (var10) {
                var11 = index$iv;
                break;
            }

            ++index$iv;
        }

        return var11;
    }

    public void onActionModeCreated() {
    }

    public void onActionModeDestroyed() {
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int var10000;
        switch(viewType) {
            case 1:
                var10000 = 1300012;
                break;
            case 2:
                var10000 = 1300114;
                break;
            default:
                var10000 = 1300117;
        }

        int layoutId = var10000;
        return this.createViewHolder(layoutId, parent);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10000 = this.listItems.get(position);
        Intrinsics.checkNotNullExpressionValue(var10000, "listItems[position]");
        final ListItem listItem = (ListItem)var10000;
        holder.bindView(listItem, true, this.allowLongClick && listItem instanceof ListEvent, (Function2)(new Function2() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1, Object var2) {
                this.invoke((View)var1, ((Number)var2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View itemView, int layoutPosition) {
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                ListItem var3 = listItem;
                if (var3 instanceof ListSectionDay) {
                    EventListAdapter.this.setupListSectionDay(itemView, (ListSectionDay)listItem);
                } else if (var3 instanceof ListEvent) {
                    EventListAdapter.this.setupListEvent(itemView, (ListEvent)listItem);
                } else if (var3 instanceof ListSectionMonth) {
                    EventListAdapter.this.setupListSectionMonth(itemView, (ListSectionMonth)listItem);
                }

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
        return this.listItems.size();
    }

    public int getItemViewType(int position) {
        return this.listItems.get(position) instanceof ListEvent ? 0 : (this.listItems.get(position) instanceof ListSectionDay ? 1 : 2);
    }

    public final void toggle24HourFormat(boolean use24HourFormat) {
        this.use24HourFormat = use24HourFormat;
        this.notifyDataSetChanged();
    }

    public final void updateListItems(@NotNull ArrayList newListItems) {
        Intrinsics.checkNotNullParameter(newListItems, "newListItems");
        if (newListItems.hashCode() != this.currentItemsHash) {
            this.currentItemsHash = newListItems.hashCode();
            Object var10001 = newListItems.clone();
            if (var10001 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<com.simplemobiletools.calendar.pro.models.ListItem>");
            }

            this.listItems = (ArrayList)var10001;
            this.getRecyclerView().resetItemCount();
            this.notifyDataSetChanged();
            this.finishActMode();
        }

    }

    public final void togglePrintMode() {
        this.isPrintVersion = !this.isPrintVersion;
        this.setTextColor(this.isPrintVersion ? this.getResources().getColor(500098) : this.getBaseConfig().getTextColor());
        this.notifyDataSetChanged();
    }

    private final void setupListEvent(View view, ListEvent listEvent) {
        int var5 = false;
        ConstraintLayout var10000 = (ConstraintLayout)view.findViewById(id.event_item_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_item_holder");
        var10000.setSelected(this.getSelectedKeys().contains(listEvent.hashCode()));
        var10000 = (ConstraintLayout)view.findViewById(id.event_item_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_item_holder");
        Drawable var10 = var10000.getBackground();
        Intrinsics.checkNotNullExpressionValue(var10, "event_item_holder.background");
        DrawableKt.applyColorFilter(var10, this.getTextColor());
        TextView var11 = (TextView)view.findViewById(id.event_item_title);
        Intrinsics.checkNotNullExpressionValue(var11, "event_item_title");
        var11.setText((CharSequence)listEvent.getTitle());
        var11 = (TextView)view.findViewById(id.event_item_time);
        Intrinsics.checkNotNullExpressionValue(var11, "event_item_time");
        CharSequence var10001;
        if (listEvent.isAllDay()) {
            var10001 = (CharSequence)this.allDayString;
        } else {
            Formatter var12 = Formatter.INSTANCE;
            Context var10002 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(var10002, "context");
            var10001 = (CharSequence)var12.getTimeFromTS(var10002, listEvent.getStartTS());
        }

        var11.setText(var10001);
        if (listEvent.getStartTS() != listEvent.getEndTS()) {
            StringBuilder var13;
            TextView var14;
            if (!listEvent.isAllDay()) {
                var11 = (TextView)view.findViewById(id.event_item_time);
                Intrinsics.checkNotNullExpressionValue(var11, "event_item_time");
                var13 = new StringBuilder();
                var14 = (TextView)view.findViewById(id.event_item_time);
                Intrinsics.checkNotNullExpressionValue(var14, "event_item_time");
                var13 = var13.append(var14.getText()).append(" - ");
                Formatter var15 = Formatter.INSTANCE;
                Context var10003 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(var10003, "context");
                var11.setText((CharSequence)var13.append(var15.getTimeFromTS(var10003, listEvent.getEndTS())).toString());
            }

            String startCode = Formatter.INSTANCE.getDayCodeFromTS(listEvent.getStartTS());
            String endCode = Formatter.INSTANCE.getDayCodeFromTS(listEvent.getEndTS());
            if (Intrinsics.areEqual(startCode, endCode) ^ true) {
                var11 = (TextView)view.findViewById(id.event_item_time);
                Intrinsics.checkNotNullExpressionValue(var11, "event_item_time");
                var13 = new StringBuilder();
                var14 = (TextView)view.findViewById(id.event_item_time);
                Intrinsics.checkNotNullExpressionValue(var14, "event_item_time");
                var11.setText((CharSequence)var13.append(var14.getText()).append(" (").append(Formatter.INSTANCE.getDateDayTitle(endCode)).append(')').toString());
            }
        }

        View var16;
        boolean var19;
        label67: {
            var11 = (TextView)view.findViewById(id.event_item_description);
            Intrinsics.checkNotNullExpressionValue(var11, "event_item_description");
            var11.setText(this.replaceDescription ? (CharSequence)listEvent.getLocation() : (CharSequence)listEvent.getDescription());
            var11 = (TextView)view.findViewById(id.event_item_description);
            Intrinsics.checkNotNullExpressionValue(var11, "event_item_description");
            var16 = (View)var11;
            if (this.displayDescription) {
                TextView var17 = (TextView)view.findViewById(id.event_item_description);
                Intrinsics.checkNotNullExpressionValue(var17, "event_item_description");
                var10001 = var17.getText();
                Intrinsics.checkNotNullExpressionValue(var10001, "event_item_description.text");
                CharSequence var8 = var10001;
                if (var8.length() > 0) {
                    var19 = true;
                    break label67;
                }
            }

            var19 = false;
        }

        ViewKt.beVisibleIf(var16, var19);
        ImageView var18 = (ImageView)view.findViewById(id.event_item_color_bar);
        Intrinsics.checkNotNullExpressionValue(var18, "event_item_color_bar");
        var10 = var18.getBackground();
        Intrinsics.checkNotNullExpressionValue(var10, "event_item_color_bar.background");
        DrawableKt.applyColorFilter(var10, listEvent.getColor());
        int newTextColor = this.getTextColor();
        if (listEvent.isAllDay() || listEvent.getStartTS() <= this.now && listEvent.getEndTS() <= this.now) {
            if (listEvent.isAllDay() && Intrinsics.areEqual(Formatter.INSTANCE.getDayCodeFromTS(listEvent.getStartTS()), Formatter.INSTANCE.getDayCodeFromTS(this.now)) && !this.isPrintVersion) {
                newTextColor = this.getAdjustedPrimaryColor();
            }

            if (this.dimPastEvents && listEvent.isPastEvent() && !this.isPrintVersion) {
                newTextColor = IntKt.adjustAlpha(newTextColor, 0.5F);
            }
        } else if (listEvent.getStartTS() <= this.now && listEvent.getEndTS() >= this.now && !this.isPrintVersion) {
            newTextColor = this.getAdjustedPrimaryColor();
        }

        ((TextView)view.findViewById(id.event_item_time)).setTextColor(newTextColor);
        ((TextView)view.findViewById(id.event_item_title)).setTextColor(newTextColor);
        ((TextView)view.findViewById(id.event_item_description)).setTextColor(newTextColor);
    }

    private final void setupListSectionDay(View view, ListSectionDay listSectionDay) {
        TextView var3 = (TextView)view.findViewById(id.event_section_title);
        int var5 = false;
        var3.setText((CharSequence)listSectionDay.getTitle());
        int dayColor = listSectionDay.isToday() ? this.getAdjustedPrimaryColor() : this.getTextColor();
        var3.setTextColor(dayColor);
    }

    private final void setupListSectionMonth(View view, ListSectionMonth listSectionMonth) {
        TextView var3 = (TextView)view.findViewById(id.event_section_title);
        int var5 = false;
        var3.setText((CharSequence)listSectionMonth.getTitle());
        var3.setTextColor(this.getAdjustedPrimaryColor());
    }

    private final void shareEvents() {
        ActivityKt.shareEvents(this.getActivity(), (List)this.getSelectedEventIds());
    }

    private final ArrayList getSelectedEventIds() {
        Iterable $this$map$iv = (Iterable)this.listItems;
        int $i$f$map = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$mapTo = false;
        Iterator var6 = $this$map$iv.iterator();

        Object item$iv$iv;
        ListItem it;
        boolean var9;
        while(var6.hasNext()) {
            item$iv$iv = var6.next();
            it = (ListItem)item$iv$iv;
            var9 = false;
            if (it instanceof ListEvent && this.getSelectedKeys().contains(it.hashCode())) {
                destination$iv$iv.add(item$iv$iv);
            }
        }

        $this$map$iv = (Iterable)((List)destination$iv$iv);
        $i$f$map = false;
        destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
        $i$f$mapTo = false;
        var6 = $this$map$iv.iterator();

        while(var6.hasNext()) {
            item$iv$iv = var6.next();
            it = (ListItem)item$iv$iv;
            var9 = false;
            if (it == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.calendar.pro.models.ListEvent");
            }

            Long var11 = ((ListEvent)it).getId();
            destination$iv$iv.add(var11);
        }

        List var10000 = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
        } else {
            return (ArrayList)var10000;
        }
    }

    private final void askConfirmDelete() {
        ArrayList eventIds = this.getSelectedEventIds();
        Iterable $this$filter$iv = (Iterable)this.listItems;
        int hasRepeatableEvent = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var8 = $this$filter$iv.iterator();

        while(var8.hasNext()) {
            Object element$iv$iv = var8.next();
            ListItem it = (ListItem)element$iv$iv;
            int var11 = false;
            Iterable var10000 = (Iterable)this.getSelectedKeys();
            ListItem var10001 = it;
            if (!(it instanceof ListEvent)) {
                var10001 = null;
            }

            if (CollectionsKt.contains(var10000, (ListEvent)var10001 != null ? ((ListEvent)var10001).hashCode() : null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        final List eventsToDelete = (List)destination$iv$iv;
        Iterable $this$mapNotNull$iv = (Iterable)eventsToDelete;
        int $i$f$mapNotNull = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$mapNotNullTo = false;
        int $i$f$forEach = false;
        Iterator var32 = $this$mapNotNull$iv.iterator();

        while(var32.hasNext()) {
            Object element$iv$iv$iv = var32.next();
            int var14 = false;
            ListEvent it = (ListEvent)element$iv$iv$iv;
            int var16 = false;
            ListEvent var33 = it;
            if (!(it instanceof ListEvent)) {
                var33 = null;
            }

            Long var34 = var33 != null ? var33.getStartTS() : null;
            if (var34 != null) {
                Long var17 = var34;
                boolean var18 = false;
                boolean var19 = false;
                int var21 = false;
                destination$iv$iv.add(var17);
            }
        }

        final List timestamps = (List)destination$iv$iv;
        Iterable $this$any$iv = (Iterable)eventsToDelete;
        int $i$f$any = false;
        boolean var35;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            var35 = false;
        } else {
            Iterator var27 = $this$any$iv.iterator();

            while(true) {
                if (!var27.hasNext()) {
                    var35 = false;
                    break;
                }

                Object element$iv = var27.next();
                ListEvent it = (ListEvent)element$iv;
                $i$f$forEach = false;
                if (it.isRepeatable()) {
                    var35 = true;
                    break;
                }
            }
        }

        hasRepeatableEvent = var35;
        new DeleteEventDialog((Activity)this.getActivity(), (List)eventIds, hasRepeatableEvent, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final int it) {
                EventListAdapter.this.getListItems().removeAll((Collection)eventsToDelete);
                ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        Iterable $this$mapNotNull$iv = (Iterable)eventsToDelete;
                        int $i$f$mapNotNull = false;
                        Collection destination$iv$ivx = (Collection)(new ArrayList());
                        int $i$f$mapNotNullTo = false;
                        Iterator var7 = $this$mapNotNull$iv.iterator();

                        while(var7.hasNext()) {
                            Object element$iv$iv = var7.next();
                            ListEvent itx = (ListEvent)element$iv$iv;
                            int var10 = false;
                            if (!itx.isRepeatable()) {
                                destination$iv$ivx.add(element$iv$iv);
                            }
                        }

                        $this$mapNotNull$iv = (Iterable)((List)destination$iv$ivx);
                        $i$f$mapNotNull = false;
                        destination$iv$ivx = (Collection)(new ArrayList());
                        $i$f$mapNotNullTo = false;
                        int $i$f$forEach = false;
                        Iterator var28 = $this$mapNotNull$iv.iterator();

                        while(var28.hasNext()) {
                            Object element$iv$iv$iv = var28.next();
                            int var12 = false;
                            ListEvent itxxx = (ListEvent)element$iv$iv$iv;
                            int var14 = false;
                            Long var15 = itxxx.getId();
                            boolean var16 = false;
                            boolean var17 = false;
                            int var19 = false;
                            destination$iv$ivx.add(var15);
                        }

                        List nonRepeatingEventIDs = CollectionsKt.toMutableList((Collection)((List)destination$iv$ivx));
                        ContextKt.getEventsHelper((Context)EventListAdapter.this.getActivity()).deleteEvents(nonRepeatingEventIDs, true);
                        Iterable $this$map$iv = (Iterable)eventsToDelete;
                        int $i$f$map = false;
                        Collection destination$iv$iv = (Collection)(new ArrayList());
                        int $i$f$mapTo = false;
                        Iterator var27 = $this$map$iv.iterator();

                        boolean var11;
                        Object item$iv$iv;
                        ListEvent itxx;
                        while(var27.hasNext()) {
                            item$iv$iv = var27.next();
                            itxx = (ListEvent)item$iv$iv;
                            var11 = false;
                            if (itxx.isRepeatable()) {
                                destination$iv$iv.add(item$iv$iv);
                            }
                        }

                        $this$map$iv = (Iterable)((List)destination$iv$iv);
                        $i$f$map = false;
                        destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
                        $i$f$mapTo = false;
                        var27 = $this$map$iv.iterator();

                        while(var27.hasNext()) {
                            item$iv$iv = var27.next();
                            itxx = (ListEvent)item$iv$iv;
                            var11 = false;
                            Long var21 = itxx.getId();
                            destination$iv$iv.add(var21);
                        }

                        List repeatingEventIDs = (List)destination$iv$iv;
                        ContextKt.handleEventDeleting((Context)EventListAdapter.this.getActivity(), repeatingEventIDs, timestamps, it);
                        EventListAdapter.this.getActivity().runOnUiThread((Runnable)(new Runnable() {
                            public final void run() {
                                RefreshRecyclerViewListener var10000 = EventListAdapter.this.getListener();
                                if (var10000 != null) {
                                    var10000.refreshItems();
                                }

                                EventListAdapter.this.finishActMode();
                            }
                        }));
                    }
                }));
            }
        }));
    }

    @NotNull
    public final ArrayList getListItems() {
        return this.listItems;
    }

    public final void setListItems(@NotNull ArrayList var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.listItems = var1;
    }

    public final boolean getAllowLongClick() {
        return this.allowLongClick;
    }

    @Nullable
    public final RefreshRecyclerViewListener getListener() {
        return this.listener;
    }

    public EventListAdapter(@NotNull SimpleActivity activity, @NotNull ArrayList listItems, boolean allowLongClick, @Nullable RefreshRecyclerViewListener listener, @NotNull final MyRecyclerView recyclerView, @NotNull Function1 itemClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        super((BaseSimpleActivity)activity, recyclerView, itemClick);
        this.listItems = listItems;
        this.allowLongClick = allowLongClick;
        this.listener = listener;
        String var10001 = this.getResources().getString(1900325);
        Intrinsics.checkNotNullExpressionValue(var10001, "resources.getString(R.string.all_day)");
        this.allDayString = var10001;
        this.displayDescription = ContextKt.getConfig((Context)activity).getDisplayDescription();
        this.replaceDescription = ContextKt.getConfig((Context)activity).getReplaceDescription();
        this.dimPastEvents = ContextKt.getConfig((Context)activity).getDimPastEvents();
        this.now = com.simplemobiletools.calendar.pro.helpers.ConstantsKt.getNowSeconds();
        this.use24HourFormat = ContextKt.getConfig((Context)activity).getUse24HourFormat();
        this.currentItemsHash = this.listItems.hashCode();
        this.setupDragListener(true);
        List $this$indexOfFirst$iv = (List)this.listItems;
        int $i$f$indexOfFirst = false;
        int index$iv = 0;
        Iterator var11 = $this$indexOfFirst$iv.iterator();

        int var10000;
        while(true) {
            if (!var11.hasNext()) {
                var10000 = -1;
                break;
            }

            Object item$iv = var11.next();
            ListItem it = (ListItem)item$iv;
            int var14 = false;
            if (it instanceof ListSectionDay && !((ListSectionDay)it).isPastSection()) {
                var10000 = index$iv;
                break;
            }

            ++index$iv;
        }

        final int firstNonPastSectionIndex = var10000;
        if (firstNonPastSectionIndex != -1) {
            activity.runOnUiThread((Runnable)(new Runnable() {
                public final void run() {
                    recyclerView.scrollToPosition(firstNonPastSectionIndex);
                }
            }));
        }

    }
}
