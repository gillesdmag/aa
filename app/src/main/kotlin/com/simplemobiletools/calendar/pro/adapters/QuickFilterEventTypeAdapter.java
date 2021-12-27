// QuickFilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.simplemobiletools.calendar.pro.models.EventType;
import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/adapters/QuickFilterEventTypeAdapter$ViewHolder$bindView$1$1"}
)
final class QuickFilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final QuickFilterEventTypeAdapter.ViewHolder this$0;
    // $FF: synthetic field
    final EventType $eventType$inlined;
    // $FF: synthetic field
    final boolean $isSelected$inlined;

    QuickFilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1(QuickFilterEventTypeAdapter.ViewHolder var1, EventType var2, boolean var3) {
        this.this$0 = var1;
        this.$eventType$inlined = var2;
        this.$isSelected$inlined = var3;
    }

    public final void onClick(View it) {
        if (System.currentTimeMillis() - QuickFilterEventTypeAdapter.access$getLastClickTS$p(this.this$0.this$0) > (long)200) {
            QuickFilterEventTypeAdapter.access$setLastClickTS$p(this.this$0.this$0, System.currentTimeMillis());
            QuickFilterEventTypeAdapter.ViewHolder.access$viewClicked(this.this$0, !this.$isSelected$inlined, this.$eventType$inlined);
            this.this$0.this$0.getCallback().invoke();
        }

    }
}
// QuickFilterEventTypeAdapter.java
package com.simplemobiletools.calendar.pro.adapters;

    import android.content.Context;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.Button;
    import android.widget.ImageView;
    import androidx.recyclerview.widget.RecyclerView.Adapter;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import com.simplemobiletools.commons.extensions.IntKt;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.HashSet;
    import java.util.Iterator;
    import java.util.List;
    import java.util.Set;
    import kotlin.Metadata;
    import kotlin.collections.CollectionsKt;
    import kotlin.collections.SetsKt;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.TypeIntrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001+B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u001c\u0010\u001f\u001a\u00020\r2\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u0019H\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0016J \u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0019H\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/QuickFilterEventTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/simplemobiletools/calendar/pro/adapters/QuickFilterEventTypeAdapter$ViewHolder;", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "allEventTypes", "", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "quickFilterEventTypeIds", "", "", "callback", "Lkotlin/Function0;", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function0;)V", "activeKeys", "Ljava/util/HashSet;", "", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "displayEventTypes", "lastClickTS", "minItemWidth", "", "quickFilterEventTypes", "Ljava/util/ArrayList;", "textColorActive", "textColorInactive", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toggleItemSelection", "select", "", "eventType", "pos", "ViewHolder", "calendar_debug"}
)
public final class QuickFilterEventTypeAdapter extends Adapter {
    private final HashSet activeKeys;
    private final ArrayList quickFilterEventTypes;
    private final Set displayEventTypes;
    private final int textColorActive;
    private final int textColorInactive;
    private final int minItemWidth;
    private long lastClickTS;
    @NotNull
    private final SimpleActivity activity;
    private final List allEventTypes;
    private final Set quickFilterEventTypeIds;
    @NotNull
    private final Function0 callback;

    private final void toggleItemSelection(boolean select, EventType eventType, int pos) {
        if (select) {
            HashSet var10000 = this.activeKeys;
            Long var10001 = eventType.getId();
            Intrinsics.checkNotNull(var10001);
            var10000.add(var10001);
        } else {
            Collection var4 = (Collection)this.activeKeys;
            Long var5 = eventType.getId();
            if (var4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }

            TypeIntrinsics.asMutableCollection(var4).remove(var5);
        }

        this.notifyItemChanged(pos);
    }

    @NotNull
    public QuickFilterEventTypeAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int parentWidth = parent.getMeasuredWidth();
        int nrOfItems = this.quickFilterEventTypes.size();
        View view = this.activity.getLayoutInflater().inflate(1300158, parent, false);
        if (nrOfItems * this.minItemWidth > parentWidth) {
            Intrinsics.checkNotNullExpressionValue(view, "view");
            view.getLayoutParams().width = this.minItemWidth;
        } else {
            Intrinsics.checkNotNullExpressionValue(view, "view");
            view.getLayoutParams().width = parentWidth / nrOfItems;
        }

        return new QuickFilterEventTypeAdapter.ViewHolder(view);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull QuickFilterEventTypeAdapter.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10000 = this.quickFilterEventTypes.get(position);
        Intrinsics.checkNotNullExpressionValue(var10000, "quickFilterEventTypes[position]");
        EventType eventType = (EventType)var10000;
        holder.bindView(eventType);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((QuickFilterEventTypeAdapter.ViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.quickFilterEventTypes.size();
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Function0 getCallback() {
        return this.callback;
    }

    public QuickFilterEventTypeAdapter(@NotNull SimpleActivity activity, @NotNull List allEventTypes, @NotNull Set quickFilterEventTypeIds, @NotNull Function0 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(allEventTypes, "allEventTypes");
        Intrinsics.checkNotNullParameter(quickFilterEventTypeIds, "quickFilterEventTypeIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.allEventTypes = allEventTypes;
        this.quickFilterEventTypeIds = quickFilterEventTypeIds;
        this.callback = callback;
        this.activeKeys = new HashSet();
        this.quickFilterEventTypes = new ArrayList();
        this.displayEventTypes = ContextKt.getConfig((Context)this.activity).getDisplayEventTypes();
        this.textColorActive = ContextKt.getConfig((Context)this.activity).getTextColor();
        this.textColorInactive = IntKt.adjustAlpha(this.textColorActive, 0.25F);
        this.minItemWidth = this.activity.getResources().getDimensionPixelSize(600266);
        Iterable $this$forEach$iv = (Iterable)this.quickFilterEventTypeIds;
        int $i$f$forEach = false;
        Iterator var7 = $this$forEach$iv.iterator();

        while(var7.hasNext()) {
            Object element$iv = var7.next();
            String quickFilterEventType = (String)element$iv;
            int var10 = false;
            Iterable $this$firstOrNull$iv = (Iterable)this.allEventTypes;
            int $i$f$firstOrNull = false;
            Iterator var13 = $this$firstOrNull$iv.iterator();

            Object var10000;
            while(true) {
                if (!var13.hasNext()) {
                    var10000 = null;
                    break;
                }

                Object element$iv = var13.next();
                EventType eventType = (EventType)element$iv;
                int var16 = false;
                if (Intrinsics.areEqual(String.valueOf(eventType.getId()), quickFilterEventType)) {
                    var10000 = element$iv;
                    break;
                }
            }

            EventType var18 = (EventType)var10000;
            if (var18 != null) {
                EventType eventType = var18;
                this.quickFilterEventTypes.add(eventType);
                if (this.displayEventTypes.contains(String.valueOf(eventType.getId()))) {
                    HashSet var19 = this.activeKeys;
                    Long var10001 = eventType.getId();
                    Intrinsics.checkNotNull(var10001);
                    var19.add(var10001);
                }
            }
        }

    }

    // $FF: synthetic method
    public static final long access$getLastClickTS$p(QuickFilterEventTypeAdapter $this) {
        return $this.lastClickTS;
    }

    // $FF: synthetic method
    public static final void access$setLastClickTS$p(QuickFilterEventTypeAdapter $this, long var1) {
        $this.lastClickTS = var1;
    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/QuickFilterEventTypeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/simplemobiletools/calendar/pro/adapters/QuickFilterEventTypeAdapter;Landroid/view/View;)V", "bindView", "eventType", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "viewClicked", "", "select", "", "calendar_debug"}
    )
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @NotNull
        public final View bindView(@NotNull EventType eventType) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            boolean isSelected = CollectionsKt.contains((Iterable)QuickFilterEventTypeAdapter.this.activeKeys, eventType.getId());
            View var3 = this.itemView;
            int var5 = false;
            Button var10000 = (Button)var3.findViewById(id.quick_filter_event_type);
            Intrinsics.checkNotNullExpressionValue(var10000, "quick_filter_event_type");
            var10000.setText((CharSequence)eventType.getTitle());
            int textColor = isSelected ? QuickFilterEventTypeAdapter.this.textColorActive : QuickFilterEventTypeAdapter.this.textColorInactive;
            ((Button)var3.findViewById(id.quick_filter_event_type)).setTextColor(textColor);
            int indicatorHeightRes = isSelected ? 600280 : 600081;
            ImageView var8 = (ImageView)var3.findViewById(id.quick_filter_event_type_color);
            Intrinsics.checkNotNullExpressionValue(var8, "quick_filter_event_type_color");
            var8.getLayoutParams().height = var3.getResources().getDimensionPixelSize(indicatorHeightRes);
            ((ImageView)var3.findViewById(id.quick_filter_event_type_color)).setBackgroundColor(eventType.getColor());
            ((Button)var3.findViewById(id.quick_filter_event_type)).setOnClickListener((OnClickListener)(new QuickFilterEventTypeAdapter$ViewHolder$bindView$$inlined$apply$lambda$1(this, eventType, isSelected)));
            View var9 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(var9, "itemView");
            return var9;
        }

        private final void viewClicked(boolean select, EventType eventType) {
            ContextKt.getConfig((Context)QuickFilterEventTypeAdapter.this.getActivity()).setDisplayEventTypes(select ? SetsKt.plus(ContextKt.getConfig((Context)QuickFilterEventTypeAdapter.this.getActivity()).getDisplayEventTypes(), String.valueOf(eventType.getId())) : SetsKt.minus(ContextKt.getConfig((Context)QuickFilterEventTypeAdapter.this.getActivity()).getDisplayEventTypes(), String.valueOf(eventType.getId())));
            QuickFilterEventTypeAdapter.this.toggleItemSelection(select, eventType, this.getAdapterPosition());
        }

        public ViewHolder(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            super(view);
        }

        // $FF: synthetic method
        public static final void access$viewClicked(QuickFilterEventTypeAdapter.ViewHolder $this, boolean select, EventType eventType) {
            $this.viewClicked(select, eventType);
        }
    }
}
