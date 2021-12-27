package com.simplemobiletools.calendar.pro.dialogs;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\u0010\fJ\b\u0010\u001c\u001a\u00020\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/RepeatRuleWeeklyDialog;", "", "activity", "Landroid/app/Activity;", "curRepeatRule", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "repeatRule", "", "(Landroid/app/Activity;ILkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getCurRepeatRule", "()I", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getView", "()Landroid/view/View;", "getRepeatRuleSum", "calendar_debug"}
)
public final class RepeatRuleWeeklyDialog {
    @NotNull
    private final AlertDialog dialog;
    private final View view;
    @NotNull
    private final Activity activity;
    private final int curRepeatRule;
    @NotNull
    private final Function1 callback;

    @NotNull
    public final AlertDialog getDialog() {
        return this.dialog;
    }

    public final View getView() {
        return this.view;
    }

    private final int getRepeatRuleSum() {
        int sum = 0;
        View var10000 = this.view;
        Intrinsics.checkNotNullExpressionValue(var10000, "view");
        LinearLayout var6 = (LinearLayout)var10000.findViewById(id.dialog_vertical_linear_layout);
        Intrinsics.checkNotNullExpressionValue(var6, "view.dialog_vertical_linear_layout");
        int cnt = var6.getChildCount();
        int i = 0;

        for(int var4 = cnt; i < var4; ++i) {
            var10000 = this.view;
            Intrinsics.checkNotNullExpressionValue(var10000, "view");
            View child = ((LinearLayout)var10000.findViewById(id.dialog_vertical_linear_layout)).getChildAt(i);
            if (child instanceof MyAppCompatCheckbox && ((MyAppCompatCheckbox)child).isChecked()) {
                sum += ((MyAppCompatCheckbox)child).getId();
            }
        }

        return sum;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final int getCurRepeatRule() {
        return this.curRepeatRule;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public RepeatRuleWeeklyDialog(@NotNull Activity activity, int curRepeatRule, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.curRepeatRule = curRepeatRule;
        this.callback = callback;
        this.view = this.activity.getLayoutInflater().inflate(1300037, (ViewGroup)null);
        String[] var10000 = this.activity.getResources().getStringArray(200026);
        Intrinsics.checkNotNullExpressionValue(var10000, "activity.resources.getSt…gArray(R.array.week_days)");
        String[] days = var10000;
        ArrayList checkboxes = new ArrayList(7);
        int i = 0;

        boolean var11;
        View var20;
        for(byte var7 = 6; i <= var7; ++i) {
            int pow = (int)Math.pow(2.0D, (double)i);
            var20 = this.activity.getLayoutInflater().inflate(1300214, (ViewGroup)null);
            if (var20 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.commons.views.MyAppCompatCheckbox");
            }

            MyAppCompatCheckbox var9 = (MyAppCompatCheckbox)var20;
            var11 = false;
            var9.setChecked((this.curRepeatRule & pow) != 0);
            var9.setText((CharSequence)days[i]);
            var9.setId(pow);
            checkboxes.add(var9);
        }

        if (ContextKt.getConfig((Context)this.activity).isSundayFirst()) {
            checkboxes.add(0, checkboxes.remove(6));
        }

        Iterable $this$forEach$iv = (Iterable)checkboxes;
        int $i$f$forEach = false;
        Iterator var17 = $this$forEach$iv.iterator();

        while(var17.hasNext()) {
            Object element$iv = var17.next();
            MyAppCompatCheckbox it = (MyAppCompatCheckbox)element$iv;
            var11 = false;
            var20 = this.view;
            Intrinsics.checkNotNullExpressionValue(var20, "view");
            ((LinearLayout)var20.findViewById(id.dialog_vertical_linear_layout)).addView((View)it);
        }

        AlertDialog var10001 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (OnClickListener)(new OnClickListener() {
            public final void onClick(DialogInterface dialog, int which) {
                RepeatRuleWeeklyDialog.this.getCallback().invoke(RepeatRuleWeeklyDialog.this.getRepeatRuleSum());
            }
        })).setNegativeButton(1900000, (OnClickListener)null).create();
        Intrinsics.checkNotNullExpressionValue(var10001, "AlertDialog.Builder(acti…                .create()");
        AlertDialog var15 = var10001;
        int var18 = false;
        Activity var21 = this.activity;
        View var22 = this.view;
        Intrinsics.checkNotNullExpressionValue(var22, "view");
        ActivityKt.setupDialogStuff$default(var21, var22, var15, 0, (String)null, false, (Function0)null, 60, (Object)null);
        Unit var13 = Unit.INSTANCE;
        this.dialog = var15;
    }
}
