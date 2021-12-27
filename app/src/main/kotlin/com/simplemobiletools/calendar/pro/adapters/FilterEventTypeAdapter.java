// FilterEventTypeAdapter.java
package com.simplemobiletools.calendar.pro.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016J \u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0016H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/FilterEventTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/simplemobiletools/calendar/pro/adapters/FilterEventTypeAdapter$ViewHolder;", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "eventTypes", "", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "displayEventTypes", "", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/util/List;Ljava/util/Set;)V", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getDisplayEventTypes", "()Ljava/util/Set;", "getEventTypes", "()Ljava/util/List;", "selectedKeys", "Ljava/util/HashSet;", "", "getItemCount", "", "getSelectedItemsList", "Ljava/util/ArrayList;", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toggleItemSelection", "select", "", "eventType", "pos", "ViewHolder", "calendar_debug"}
)
public final class FilterEventTypeAdapter extends Adapter {
    private final HashSet selectedKeys;
    @NotNull
    private final SimpleActivity activity;
    @NotNull
    private final List eventTypes;
    @NotNull
    private final Set displayEventTypes;

    private final void toggleItemSelection(boolean select, EventType eventType, int pos) {
        if (select) {
            HashSet var10000 = this.selectedKeys;
            Long var10001 = eventType.getId();
            Intrinsics.checkNotNull(var10001);
            var10000.add(var10001);
        } else {
            Collection var4 = (Collection)this.selectedKeys;
            Long var5 = eventType.getId();
            if (var4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }

            TypeIntrinsics.asMutableCollection(var4).remove(var5);
        }

        this.notifyItemChanged(pos);
    }

    @NotNull
    public final ArrayList getSelectedItemsList() {
        List var10000 = SequencesKt.toMutableList(SequencesKt.map(CollectionsKt.asSequence((Iterable)this.selectedKeys), (Function1)null.INSTANCE));
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
        } else {
            return (ArrayList)var10000;
        }
    }

    @NotNull
    public FilterEventTypeAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = this.activity.getLayoutInflater().inflate(1300124, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new FilterEventTypeAdapter.ViewHolder(view);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull FilterEventTypeAdapter.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        EventType eventType = (EventType)this.eventTypes.get(position);
        holder.bindView(eventType);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((FilterEventTypeAdapter.ViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.eventTypes.size();
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final List getEventTypes() {
        return this.eventTypes;
    }

    @NotNull
    public final Set getDisplayEventTypes() {
        return this.displayEventTypes;
    }

    public FilterEventTypeAdapter(@NotNull SimpleActivity activity, @NotNull List eventTypes, @NotNull Set displayEventTypes) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventTypes, "eventTypes");
        Intrinsics.checkNotNullParameter(displayEventTypes, "displayEventTypes");
        super();
        this.activity = activity;
        this.eventTypes = eventTypes;
        this.displayEventTypes = displayEventTypes;
        this.selectedKeys = new HashSet();
        Iterable $this$forEachIndexed$iv = (Iterable)this.eventTypes;
        int $i$f$forEachIndexed = false;
        int index$iv = 0;
        Iterator var7 = $this$forEachIndexed$iv.iterator();

        while(var7.hasNext()) {
            Object item$iv = var7.next();
            int var9 = index$iv++;
            boolean var10 = false;
            if (var9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }

            EventType eventType = (EventType)item$iv;
            int var13 = false;
            if (this.displayEventTypes.contains(String.valueOf(eventType.getId()))) {
                HashSet var14 = this.selectedKeys;
                Long var10001 = eventType.getId();
                Intrinsics.checkNotNull(var10001);
                var14.add(var10001);
            }
        }

    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/FilterEventTypeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/simplemobiletools/calendar/pro/adapters/FilterEventTypeAdapter;Landroid/view/View;)V", "bindView", "eventType", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "viewClicked", "", "select", "", "calendar_debug"}
    )
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @NotNull
        public final View bindView(@NotNull EventType eventType) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            boolean isSelected = CollectionsKt.contains((Iterable)FilterEventTypeAdapter.this.selectedKeys, eventType.getId());
            View var3 = this.itemView;
            int var5 = false;
            MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)var3.findViewById(id.filter_event_type_checkbox);
            Intrinsics.checkNotNullExpressionValue(var10000, "filter_event_type_checkbox");
            var10000.setChecked(isSelected);
            ((MyAppCompatCheckbox)var3.findViewById(id.filter_event_type_checkbox)).setColors(ContextKt.getConfig((Context)FilterEventTypeAdapter.this.getActivity()).getTextColor(), com.simplemobiletools.commons.extensions.ContextKt.getAdjustedPrimaryColor((Context)FilterEventTypeAdapter.this.getActivity()), ContextKt.getConfig((Context)FilterEventTypeAdapter.this.getActivity()).getBackgroundColor());
            var10000 = (MyAppCompatCheckbox)var3.findViewById(id.filter_event_type_checkbox);
            Intrinsics.checkNotNullExpressionValue(var10000, "filter_event_type_checkbox");
            var10000.setText((CharSequence)eventType.getDisplayTitle());
            ImageView var6 = (ImageView)var3.findViewById(id.filter_event_type_color);
            Intrinsics.checkNotNullExpressionValue(var6, "filter_event_type_color");
            ImageViewKt.setFillWithStroke$default(var6, eventType.getColor(), ContextKt.getConfig((Context)FilterEventTypeAdapter.this.getActivity()).getBackgroundColor(), false, 4, (Object)null);
            ((RelativeLayout)var3.findViewById(id.filter_event_type_holder)).setOnClickListener((OnClickListener)(new FilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1(this, isSelected, eventType)));
            View var7 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(var7, "itemView");
            return var7;
        }

        private final void viewClicked(boolean select, EventType eventType) {
            FilterEventTypeAdapter.this.toggleItemSelection(select, eventType, this.getAdapterPosition());
        }

        public ViewHolder(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            super(view);
        }

        // $FF: synthetic method
        public static final void access$viewClicked(FilterEventTypeAdapter.ViewHolder $this, boolean select, EventType eventType) {
            $this.viewClicked(select, eventType);
        }
    }
}
// FilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.adapters;

    import android.view.View;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/adapters/FilterEventTypeAdapter$ViewHolder$bindView$1$1"}
)
final class FilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final FilterEventTypeAdapter.ViewHolder this$0;
    // $FF: synthetic field
    final boolean $isSelected$inlined;
    // $FF: synthetic field
    final EventType $eventType$inlined;

    FilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1(FilterEventTypeAdapter.ViewHolder var1, boolean var2, EventType var3) {
        this.this$0 = var1;
        this.$isSelected$inlined = var2;
        this.$eventType$inlined = var3;
    }

    public final void onClick(View it) {
        FilterEventTypeAdapter.ViewHolder.access$viewClicked(this.this$0, !this.$isSelected$inlined, this.$eventType$inlined);
    }
}
