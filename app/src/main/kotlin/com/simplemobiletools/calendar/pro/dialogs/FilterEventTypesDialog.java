package com.simplemobiletools.calendar.pro.dialogs;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
import com.simplemobiletools.calendar.pro.adapters.FilterEventTypeAdapter;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.views.MyRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/FilterEventTypesDialog;", "", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "callback", "Lkotlin/Function0;", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "confirmEventTypes", "calendar_debug"}
)
public final class FilterEventTypesDialog {
    private AlertDialog dialog;
    private final View view;
    @NotNull
    private final SimpleActivity activity;
    @NotNull
    private final Function0 callback;

    private final void confirmEventTypes() {
        View var10000 = this.view;
        Intrinsics.checkNotNullExpressionValue(var10000, "view");
        MyRecyclerView var14 = (MyRecyclerView)var10000.findViewById(id.filter_event_types_list);
        Intrinsics.checkNotNullExpressionValue(var14, "view.filter_event_types_list");
        Adapter var15 = var14.getAdapter();
        if (var15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.calendar.pro.adapters.FilterEventTypeAdapter");
        } else {
            Iterable $this$map$iv = (Iterable)((FilterEventTypeAdapter)var15).getSelectedItemsList();
            int $i$f$map = false;
            Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
            int $i$f$mapTo = false;
            Iterator var7 = $this$map$iv.iterator();

            while(var7.hasNext()) {
                Object item$iv$iv = var7.next();
                long it = ((Number)item$iv$iv).longValue();
                int var11 = false;
                String var13 = String.valueOf(it);
                destination$iv$iv.add(var13);
            }

            HashSet selectedItems = CollectionsKt.toHashSet((Iterable)((List)destination$iv$iv));
            if (Intrinsics.areEqual(ContextKt.getConfig((Context)this.activity).getDisplayEventTypes(), selectedItems) ^ true) {
                ContextKt.getConfig((Context)this.activity).setDisplayEventTypes((Set)selectedItems);
                this.callback.invoke();
            }

            AlertDialog var16 = this.dialog;
            if (var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }

            var16.dismiss();
        }
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Function0 getCallback() {
        return this.callback;
    }

    public FilterEventTypesDialog(@NotNull SimpleActivity activity, @NotNull Function0 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.callback = callback;
        this.view = this.activity.getLayoutInflater().inflate(1300052, (ViewGroup)null);
        ContextKt.getEventsHelper((Context)this.activity).getEventTypes((Activity)this.activity, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Set displayEventTypes = ContextKt.getConfig((Context)FilterEventTypesDialog.this.getActivity()).getDisplayEventTypes();
                View var10000 = FilterEventTypesDialog.this.view;
                Intrinsics.checkNotNullExpressionValue(var10000, "view");
                MyRecyclerView var8 = (MyRecyclerView)var10000.findViewById(id.filter_event_types_list);
                Intrinsics.checkNotNullExpressionValue(var8, "view.filter_event_types_list");
                var8.setAdapter((Adapter)(new FilterEventTypeAdapter(FilterEventTypesDialog.this.getActivity(), (List)it, displayEventTypes)));
                FilterEventTypesDialog var9 = FilterEventTypesDialog.this;
                AlertDialog var10001 = (new Builder((Context)FilterEventTypesDialog.this.getActivity())).setPositiveButton(1900829, (OnClickListener)(new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FilterEventTypesDialog.this.confirmEventTypes();
                    }
                })).setNegativeButton(1900000, (OnClickListener)null).create();
                Intrinsics.checkNotNullExpressionValue(var10001, "AlertDialog.Builder(acti…                .create()");
                AlertDialog var3 = var10001;
                FilterEventTypesDialog var6 = var9;
                int var5 = false;
                Activity var10 = (Activity)FilterEventTypesDialog.this.getActivity();
                View var11 = FilterEventTypesDialog.this.view;
                Intrinsics.checkNotNullExpressionValue(var11, "view");
                ActivityKt.setupDialogStuff$default(var10, var11, var3, 0, (String)null, false, (Function0)null, 60, (Object)null);
                Unit var7 = Unit.INSTANCE;
                var6.dialog = var3;
            }
        }));
    }

    // $FF: synthetic method
    public static final AlertDialog access$getDialog$p(FilterEventTypesDialog $this) {
        AlertDialog var10000 = $this.dialog;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }

        return var10000;
    }
}
