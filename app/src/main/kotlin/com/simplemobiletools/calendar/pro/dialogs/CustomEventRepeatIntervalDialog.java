// CustomEventRepeatIntervalDialog$$special$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.dialogs;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.commons.extensions.AlertDialogKt;
import com.simplemobiletools.commons.views.MyEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"},
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/CustomEventRepeatIntervalDialog$2$1"}
)
final class CustomEventRepeatIntervalDialog$$special$$inlined$apply$lambda$1 extends Lambda implements Function0 {
    // $FF: synthetic field
    final AlertDialog $this_apply;
    // $FF: synthetic field
    final CustomEventRepeatIntervalDialog this$0;

    CustomEventRepeatIntervalDialog$$special$$inlined$apply$lambda$1(AlertDialog var1, CustomEventRepeatIntervalDialog var2) {
        super(0);
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        AlertDialog var10000 = this.$this_apply;
        MyEditText var10001 = (MyEditText)((View)this.this$0.getView()).findViewById(id.dialog_custom_repeat_interval_value);
        Intrinsics.checkNotNullExpressionValue(var10001, "view.dialog_custom_repeat_interval_value");
        AlertDialogKt.showKeyboard(var10000, (EditText)var10001);
    }
}
// CustomEventRepeatIntervalDialog.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.content.Context;
    import android.content.DialogInterface;
    import android.content.DialogInterface.OnClickListener;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.EditText;
    import android.widget.RadioGroup;
    import androidx.appcompat.app.AlertDialog;
    import androidx.appcompat.app.AlertDialog.Builder;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.EditTextKt;
    import com.simplemobiletools.commons.views.MyEditText;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\u001c\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/CustomEventRepeatIntervalDialog;", "", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "seconds", "", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "view", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "setView", "(Landroid/view/ViewGroup;)V", "confirmRepeatInterval", "getMultiplier", "id", "calendar_debug"}
)
public final class CustomEventRepeatIntervalDialog {
    @NotNull
    private AlertDialog dialog;
    @NotNull
    private ViewGroup view;
    @NotNull
    private final Activity activity;
    @NotNull
    private final Function1 callback;

    @NotNull
    public final AlertDialog getDialog() {
        return this.dialog;
    }

    public final void setDialog(@NotNull AlertDialog var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.dialog = var1;
    }

    @NotNull
    public final ViewGroup getView() {
        return this.view;
    }

    public final void setView(@NotNull ViewGroup var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.view = var1;
    }

    private final void confirmRepeatInterval() {
        MyEditText var10000 = (MyEditText)((View)this.view).findViewById(id.dialog_custom_repeat_interval_value);
        Intrinsics.checkNotNullExpressionValue(var10000, "view.dialog_custom_repeat_interval_value");
        String value = EditTextKt.getValue((EditText)var10000);
        RadioGroup var10001 = (RadioGroup)((View)this.view).findViewById(id.dialog_radio_view);
        Intrinsics.checkNotNullExpressionValue(var10001, "view.dialog_radio_view");
        int multiplier = this.getMultiplier(var10001.getCheckedRadioButtonId());
        CharSequence var4 = (CharSequence)value;
        Integer days = Integer.valueOf(var4.length() == 0 ? "0" : value);
        this.callback.invoke(days * multiplier);
        ActivityKt.hideKeyboard(this.activity);
        this.dialog.dismiss();
    }

    private final int getMultiplier(int id) {
        int var10000;
        switch(id) {
            case 1000352:
                var10000 = 604800;
                break;
            case 1000445:
                var10000 = 2592001;
                break;
            case 1000488:
                var10000 = 31536000;
                break;
            default:
                var10000 = 86400;
        }

        return var10000;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public CustomEventRepeatIntervalDialog(@NotNull Activity activity, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.callback = callback;
        View var10001 = this.activity.getLayoutInflater().inflate(1300123, (ViewGroup)null);
        if (var10001 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } else {
            this.view = (ViewGroup)var10001;
            ((RadioGroup)((View)this.view).findViewById(id.dialog_radio_view)).check(1000951);
            AlertDialog var8 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (OnClickListener)(new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CustomEventRepeatIntervalDialog.this.confirmRepeatInterval();
                }
            })).setNegativeButton(1900000, (OnClickListener)null).create();
            Intrinsics.checkNotNullExpressionValue(var8, "AlertDialog.Builder(acti…                .create()");
            AlertDialog var3 = var8;
            int var5 = false;
            ActivityKt.setupDialogStuff$default(this.activity, (View)this.view, var3, 0, (String)null, false, (Function0)(new CustomEventRepeatIntervalDialog$$special$$inlined$apply$lambda$1(var3, this)), 28, (Object)null);
            Unit var7 = Unit.INSTANCE;
            this.dialog = var3;
        }
    }
}
