// SelectTimeZoneAdapter$ViewHolder$bindView$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.simplemobiletools.calendar.pro.models.MyTimeZone;
import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/adapters/SelectTimeZoneAdapter$ViewHolder$bindView$1$1"}
)
final class SelectTimeZoneAdapter$ViewHolder$bindView$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final SelectTimeZoneAdapter.ViewHolder this$0;
    // $FF: synthetic field
    final MyTimeZone $timeZone$inlined;

    SelectTimeZoneAdapter$ViewHolder$bindView$$inlined$apply$lambda$1(SelectTimeZoneAdapter.ViewHolder var1, MyTimeZone var2) {
        this.this$0 = var1;
        this.$timeZone$inlined = var2;
    }

    public final void onClick(View it) {
        this.this$0.this$0.getItemClick().invoke(this.$timeZone$inlined);
    }
}
// SelectTimeZoneAdapter.java
package com.simplemobiletools.calendar.pro.adapters;

    import android.content.Context;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.RelativeLayout;
    import android.widget.TextView;
    import androidx.recyclerview.widget.RecyclerView.Adapter;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.calendar.pro.models.MyTimeZone;
    import java.util.ArrayList;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u001c\u0010\u001a\u001a\u00020\u000b2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012H\u0016J\u0014\u0010!\u001a\u00020\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/SelectTimeZoneAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/simplemobiletools/calendar/pro/adapters/SelectTimeZoneAdapter$ViewHolder;", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "timeZones", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/MyTimeZone;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "textColor", "", "getTextColor", "()I", "getTimeZones", "()Ljava/util/ArrayList;", "setTimeZones", "(Ljava/util/ArrayList;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateTimeZones", "newTimeZones", "ViewHolder", "calendar_debug"}
)
public final class SelectTimeZoneAdapter extends Adapter {
    private final int textColor;
    @NotNull
    private final SimpleActivity activity;
    @NotNull
    private ArrayList timeZones;
    @NotNull
    private final Function1 itemClick;

    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public SelectTimeZoneAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = this.activity.getLayoutInflater().inflate(1300181, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new SelectTimeZoneAdapter.ViewHolder(view);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull SelectTimeZoneAdapter.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10000 = this.timeZones.get(position);
        Intrinsics.checkNotNullExpressionValue(var10000, "timeZones[position]");
        MyTimeZone timeZone = (MyTimeZone)var10000;
        holder.bindView(timeZone);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((SelectTimeZoneAdapter.ViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.timeZones.size();
    }

    public final void updateTimeZones(@NotNull ArrayList newTimeZones) {
        Intrinsics.checkNotNullParameter(newTimeZones, "newTimeZones");
        Object var10001 = newTimeZones.clone();
        if (var10001 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<com.simplemobiletools.calendar.pro.models.MyTimeZone>");
        } else {
            this.timeZones = (ArrayList)var10001;
            this.notifyDataSetChanged();
        }
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final ArrayList getTimeZones() {
        return this.timeZones;
    }

    public final void setTimeZones(@NotNull ArrayList var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.timeZones = var1;
    }

    @NotNull
    public final Function1 getItemClick() {
        return this.itemClick;
    }

    public SelectTimeZoneAdapter(@NotNull SimpleActivity activity, @NotNull ArrayList timeZones, @NotNull Function1 itemClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(timeZones, "timeZones");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        super();
        this.activity = activity;
        this.timeZones = timeZones;
        this.itemClick = itemClick;
        this.textColor = ContextKt.getConfig((Context)this.activity).getTextColor();
    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/SelectTimeZoneAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/simplemobiletools/calendar/pro/adapters/SelectTimeZoneAdapter;Landroid/view/View;)V", "bindView", "timeZone", "Lcom/simplemobiletools/calendar/pro/models/MyTimeZone;", "calendar_debug"}
    )
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @NotNull
        public final View bindView(@NotNull MyTimeZone timeZone) {
            Intrinsics.checkNotNullParameter(timeZone, "timeZone");
            View var2 = this.itemView;
            int var4 = false;
            TextView var10000 = (TextView)var2.findViewById(id.item_time_zone_title);
            Intrinsics.checkNotNullExpressionValue(var10000, "item_time_zone_title");
            var10000.setText((CharSequence)timeZone.getZoneName());
            var10000 = (TextView)var2.findViewById(id.item_time_zone_shift);
            Intrinsics.checkNotNullExpressionValue(var10000, "item_time_zone_shift");
            var10000.setText((CharSequence)timeZone.getTitle());
            ((TextView)var2.findViewById(id.item_time_zone_title)).setTextColor(SelectTimeZoneAdapter.this.getTextColor());
            ((TextView)var2.findViewById(id.item_time_zone_shift)).setTextColor(SelectTimeZoneAdapter.this.getTextColor());
            ((RelativeLayout)var2.findViewById(id.item_select_time_zone_holder)).setOnClickListener((OnClickListener)(new SelectTimeZoneAdapter$ViewHolder$bindView$$inlined$apply$lambda$1(this, timeZone)));
            View var5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(var5, "itemView");
            return var5;
        }

        public ViewHolder(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            super(view);
        }
    }
}
