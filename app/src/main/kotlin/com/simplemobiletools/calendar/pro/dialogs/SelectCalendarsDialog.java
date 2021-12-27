// SelectCalendarsDialog$addCalendarItem$1$1.java
package com.simplemobiletools.calendar.pro.dialogs;

import android.view.View;
import android.view.View.OnClickListener;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}
)
final class SelectCalendarsDialog$addCalendarItem$1$1 implements OnClickListener {
    // $FF: synthetic field
    final MyAppCompatCheckbox $this_apply;

    public final void onClick(View it) {
        this.$this_apply.toggle();
    }

    SelectCalendarsDialog$addCalendarItem$1$1(MyAppCompatCheckbox var1) {
        this.$this_apply = var1;
    }
}
// SelectCalendarsDialog.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.content.Context;
    import android.content.DialogInterface;
    import android.text.TextUtils;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.LinearLayout;
    import android.widget.RelativeLayout;
    import androidx.appcompat.app.AlertDialog;
    import androidx.appcompat.app.AlertDialog.Builder;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.calendar.pro.helpers.Config;
    import com.simplemobiletools.calendar.pro.models.CalDAVCalendar;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.ViewKt;
    import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
    import com.simplemobiletools.commons.views.MyTextView;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.Iterator;
    import java.util.List;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.collections.CollectionsKt;
    import kotlin.comparisons.ComparisonsKt;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J,\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/SelectCalendarsDialog;", "", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "callback", "Lkotlin/Function0;", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "prevAccount", "", "view", "Landroid/view/ViewGroup;", "addCalendarItem", "isEvent", "", "text", "tag", "", "shouldCheck", "confirmSelection", "calendar_debug"}
)
public final class SelectCalendarsDialog {
    private String prevAccount;
    private AlertDialog dialog;
    private ViewGroup view;
    @NotNull
    private final SimpleActivity activity;
    @NotNull
    private final Function0 callback;

    private final void addCalendarItem(boolean isEvent, String text, int tag, boolean shouldCheck) {
        int layout = isEvent ? 1300151 : 1300005;
        View calendarItem = this.activity.getLayoutInflater().inflate(layout, (LinearLayout)((View)this.view).findViewById(id.dialog_select_calendars_holder), false);
        if (isEvent) {
            Intrinsics.checkNotNullExpressionValue(calendarItem, "calendarItem");
            MyAppCompatCheckbox var7 = (MyAppCompatCheckbox)calendarItem.findViewById(id.calendar_item_calendar_switch);
            int var9 = false;
            Intrinsics.checkNotNullExpressionValue(var7, "this");
            var7.setTag(tag);
            var7.setText((CharSequence)text);
            var7.setChecked(shouldCheck);
            calendarItem.setOnClickListener((OnClickListener)(new SelectCalendarsDialog$addCalendarItem$1$1(var7)));
        } else {
            Intrinsics.checkNotNullExpressionValue(calendarItem, "calendarItem");
            MyTextView var10000 = (MyTextView)calendarItem.findViewById(id.calendar_item_account);
            Intrinsics.checkNotNullExpressionValue(var10000, "calendarItem.calendar_item_account");
            var10000.setText((CharSequence)text);
        }

        ((LinearLayout)((View)this.view).findViewById(id.dialog_select_calendars_holder)).addView(calendarItem);
    }

    // $FF: synthetic method
    static void addCalendarItem$default(SelectCalendarsDialog var0, boolean var1, String var2, int var3, boolean var4, int var5, Object var6) {
        if ((var5 & 4) != 0) {
            var3 = 0;
        }

        if ((var5 & 8) != 0) {
            var4 = false;
        }

        var0.addCalendarItem(var1, var2, var3, var4);
    }

    private final void confirmSelection() {
        ArrayList calendarIds = new ArrayList();
        LinearLayout var10000 = (LinearLayout)((View)this.view).findViewById(id.dialog_select_calendars_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "view.dialog_select_calendars_holder");
        int childCnt = var10000.getChildCount();
        int i = 0;
        int var4 = childCnt;
        if (i <= childCnt) {
            while(true) {
                View child = ((LinearLayout)((View)this.view).findViewById(id.dialog_select_calendars_holder)).getChildAt(i);
                if (child instanceof RelativeLayout) {
                    View check = ((RelativeLayout)child).getChildAt(0);
                    if (check instanceof MyAppCompatCheckbox && ((MyAppCompatCheckbox)check).isChecked()) {
                        Object var10001 = ((MyAppCompatCheckbox)check).getTag();
                        if (var10001 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }

                        calendarIds.add((Integer)var10001);
                    }
                }

                if (i == var4) {
                    break;
                }

                ++i;
            }
        }

        Config var7 = ContextKt.getConfig((Context)this.activity);
        String var8 = TextUtils.join((CharSequence)",", (Iterable)calendarIds);
        Intrinsics.checkNotNullExpressionValue(var8, "TextUtils.join(\",\", calendarIds)");
        var7.setCaldavSyncedCalendarIds(var8);
        this.callback.invoke();
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Function0 getCallback() {
        return this.callback;
    }

    public SelectCalendarsDialog(@NotNull SimpleActivity activity, @NotNull Function0 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.callback = callback;
        this.prevAccount = "";
        View var10001 = this.activity.getLayoutInflater().inflate(1300006, (ViewGroup)null);
        if (var10001 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } else {
            this.view = (ViewGroup)var10001;
            ArrayList ids = ContextKt.getConfig((Context)this.activity).getSyncedCalendarIdsAsList();
            ArrayList calendars = ContextKt.getCalDAVHelper((Context)this.activity).getCalDAVCalendars("", true);
            ViewGroup var5 = this.view;
            int $i$f$forEach = false;
            MyTextView var10000 = (MyTextView)((View)var5).findViewById(id.dialog_select_calendars_placeholder);
            Intrinsics.checkNotNullExpressionValue(var10000, "dialog_select_calendars_placeholder");
            ViewKt.beVisibleIf((View)var10000, calendars.isEmpty());
            LinearLayout var18 = (LinearLayout)((View)var5).findViewById(id.dialog_select_calendars_holder);
            Intrinsics.checkNotNullExpressionValue(var18, "dialog_select_calendars_holder");
            View var19 = (View)var18;
            Collection var8 = (Collection)calendars;
            ViewKt.beVisibleIf(var19, !var8.isEmpty());
            List sorted = CollectionsKt.sortedWith((Iterable)calendars, ComparisonsKt.compareBy(new Function1[]{(Function1)null.INSTANCE, (Function1)null.INSTANCE}));
            Iterable $this$forEach$iv = (Iterable)sorted;
            $i$f$forEach = false;

            CalDAVCalendar it;
            for(Iterator var16 = $this$forEach$iv.iterator(); var16.hasNext(); this.addCalendarItem(true, it.getDisplayName(), it.getId(), ids.contains(it.getId()))) {
                Object element$iv = var16.next();
                it = (CalDAVCalendar)element$iv;
                int var11 = false;
                if (Intrinsics.areEqual(this.prevAccount, it.getAccountName()) ^ true) {
                    this.prevAccount = it.getAccountName();
                    addCalendarItem$default(this, false, it.getAccountName(), 0, false, 12, (Object)null);
                }
            }

            AlertDialog var20 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (android.content.DialogInterface.OnClickListener)(new android.content.DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SelectCalendarsDialog.this.confirmSelection();
                }
            })).setNegativeButton(1900000, (android.content.DialogInterface.OnClickListener)null).create();
            Intrinsics.checkNotNullExpressionValue(var20, "AlertDialog.Builder(acti…ll)\n            .create()");
            AlertDialog var15 = var20;
            int var17 = false;
            ActivityKt.setupDialogStuff$default((Activity)this.activity, (View)this.view, var15, 1900229, (String)null, false, (Function0)null, 56, (Object)null);
            Unit var13 = Unit.INSTANCE;
            this.dialog = var15;
        }
    }
}
