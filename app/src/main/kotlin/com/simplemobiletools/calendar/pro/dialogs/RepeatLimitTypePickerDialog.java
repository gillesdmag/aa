// RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.dialogs;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/RepeatLimitTypePickerDialog$1$1"}
)
final class RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final RepeatLimitTypePickerDialog this$0;

    RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$1(RepeatLimitTypePickerDialog var1) {
        this.this$0 = var1;
    }

    public final void onClick(View it) {
        RepeatLimitTypePickerDialog.access$showRepetitionLimitDialog(this.this$0);
    }
}
// RepeatLimitTypePickerDialog.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.app.DatePickerDialog;
    import android.app.DatePickerDialog.OnDateSetListener;
    import android.content.Context;
    import android.content.DialogInterface;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.DatePicker;
    import android.widget.EditText;
    import android.widget.RadioGroup;
    import androidx.appcompat.app.AlertDialog;
    import androidx.appcompat.app.AlertDialog.Builder;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
    import com.simplemobiletools.calendar.pro.helpers.ConstantsKt;
    import com.simplemobiletools.calendar.pro.helpers.Formatter;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.ContextKt;
    import com.simplemobiletools.commons.extensions.EditTextKt;
    import com.simplemobiletools.commons.views.MyCompatRadioButton;
    import com.simplemobiletools.commons.views.MyEditText;
    import com.simplemobiletools.commons.views.MyTextView;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;
    import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B@\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\u0010\fJ\b\u0010$\u001a\u00020\u000bH\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR,\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006)"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/RepeatLimitTypePickerDialog;", "", "activity", "Landroid/app/Activity;", "repeatLimit", "", "startTS", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "(Landroid/app/Activity;JJLkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "getRepeatLimit", "()J", "setRepeatLimit", "(J)V", "repetitionLimitDateSetListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "getStartTS", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "confirmRepetition", "getCheckedItem", "", "showRepetitionLimitDialog", "updateRepeatLimitText", "calendar_debug"}
)
public final class RepeatLimitTypePickerDialog {
    public AlertDialog dialog;
    @NotNull
    private View view;
    private final OnDateSetListener repetitionLimitDateSetListener;
    @NotNull
    private final Activity activity;
    private long repeatLimit;
    private final long startTS;
    @NotNull
    private final Function1 callback;

    @NotNull
    public final AlertDialog getDialog() {
        AlertDialog var10000 = this.dialog;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }

        return var10000;
    }

    public final void setDialog(@NotNull AlertDialog var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.dialog = var1;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final void setView(@NotNull View var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.view = var1;
    }

    private final int getCheckedItem() {
        int var10000;
        if (this.repeatLimit > 0L) {
            var10000 = 1000240;
        } else if (this.repeatLimit < 0L) {
            ((MyEditText)this.view.findViewById(id.repeat_type_count)).setText((CharSequence)String.valueOf(-this.repeatLimit));
            var10000 = 1000809;
        } else {
            var10000 = 1001154;
        }

        return var10000;
    }

    private final void updateRepeatLimitText() {
        if (this.repeatLimit <= 0L) {
            this.repeatLimit = ConstantsKt.getNowSeconds();
        }

        DateTime repeatLimitDateTime = Formatter.INSTANCE.getDateTimeFromTS(this.repeatLimit);
        MyTextView var10000 = (MyTextView)this.view.findViewById(id.repeat_type_date);
        Intrinsics.checkNotNullExpressionValue(var10000, "view.repeat_type_date");
        var10000.setText((CharSequence)Formatter.INSTANCE.getFullDate((Context)this.activity, repeatLimitDateTime));
    }

    private final void confirmRepetition() {
        RadioGroup var10000 = (RadioGroup)this.view.findViewById(id.dialog_radio_view);
        Intrinsics.checkNotNullExpressionValue(var10000, "view.dialog_radio_view");
        switch(var10000.getCheckedRadioButtonId()) {
            case 1000240:
                this.callback.invoke(this.repeatLimit);
                break;
            case 1001154:
                this.callback.invoke(0L);
                break;
            default:
                MyEditText var3 = (MyEditText)this.view.findViewById(id.repeat_type_count);
                Intrinsics.checkNotNullExpressionValue(var3, "view.repeat_type_count");
                String count = EditTextKt.getValue((EditText)var3);
                CharSequence var2 = (CharSequence)count;
                count = var2.length() == 0 ? "0" : '-' + count;
                this.callback.invoke(Long.parseLong(count));
        }

        AlertDialog var4 = this.dialog;
        if (var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }

        var4.dismiss();
    }

    private final void showRepetitionLimitDialog() {
        DateTime repeatLimitDateTime = Formatter.INSTANCE.getDateTimeFromTS(this.repeatLimit != 0L ? this.repeatLimit : ConstantsKt.getNowSeconds());
        DatePickerDialog datepicker = new DatePickerDialog((Context)this.activity, ContextKt.getDialogTheme((Context)this.activity), this.repetitionLimitDateSetListener, repeatLimitDateTime.getYear(), repeatLimitDateTime.getMonthOfYear() - 1, repeatLimitDateTime.getDayOfMonth());
        DatePicker var10000 = datepicker.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(var10000, "datepicker.datePicker");
        var10000.setFirstDayOfWeek(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig((Context)this.activity).isSundayFirst() ? 1 : 2);
        datepicker.show();
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final long getRepeatLimit() {
        return this.repeatLimit;
    }

    public final void setRepeatLimit(long var1) {
        this.repeatLimit = var1;
    }

    public final long getStartTS() {
        return this.startTS;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public RepeatLimitTypePickerDialog(@NotNull Activity activity, long repeatLimit, long startTS, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.repeatLimit = repeatLimit;
        this.startTS = startTS;
        this.callback = callback;
        View var7 = this.activity.getLayoutInflater().inflate(1300054, (ViewGroup)null);
        int var9 = false;
        ((MyTextView)var7.findViewById(id.repeat_type_date)).setOnClickListener((OnClickListener)(new RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$1(this)));
        ((MyEditText)var7.findViewById(id.repeat_type_count)).setOnClickListener((OnClickListener)(new RepeatLimitTypePickerDialog$1$2(var7)));
        ((MyCompatRadioButton)var7.findViewById(id.repeat_type_forever)).setOnClickListener((OnClickListener)(new RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$2(this)));
        Unit var11 = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(var7, "activity.layoutInflater.…)\n            }\n        }");
        this.view = var7;
        ((RadioGroup)this.view.findViewById(id.dialog_radio_view)).check(this.getCheckedItem());
        long var10000 = this.startTS;
        long var12 = this.repeatLimit;
        if (1L <= var12) {
            if (var10000 >= var12) {
                this.repeatLimit = this.startTS;
            }
        }

        this.updateRepeatLimitText();
        AlertDialog var10001 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (android.content.DialogInterface.OnClickListener)(new android.content.DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                RepeatLimitTypePickerDialog.this.confirmRepetition();
            }
        })).setNegativeButton(1900000, (android.content.DialogInterface.OnClickListener)null).create();
        Intrinsics.checkNotNullExpressionValue(var10001, "AlertDialog.Builder(acti…                .create()");
        AlertDialog var13 = var10001;
        var9 = false;
        ActivityKt.setupDialogStuff$default(this.activity, this.view, var13, 0, (String)null, false, (Function0)(new RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$3(this)), 28, (Object)null);
        var11 = Unit.INSTANCE;
        this.dialog = var13;
        this.repetitionLimitDateSetListener = (OnDateSetListener)(new OnDateSetListener() {
            public final void onDateSet(DatePicker v, int year, int monthOfYear, int dayOfMonth) {
                DateTime repeatLimitDateTime = (new DateTime()).withDate(year, monthOfYear + 1, dayOfMonth).withTime(23, 59, 59, 0);
                RepeatLimitTypePickerDialog var10000 = RepeatLimitTypePickerDialog.this;
                Intrinsics.checkNotNullExpressionValue(repeatLimitDateTime, "repeatLimitDateTime");
                var10000.setRepeatLimit(DateTimeKt.seconds(repeatLimitDateTime) < RepeatLimitTypePickerDialog.this.getStartTS() ? 0L : DateTimeKt.seconds(repeatLimitDateTime));
                RepeatLimitTypePickerDialog.this.getCallback().invoke(RepeatLimitTypePickerDialog.this.getRepeatLimit());
                RepeatLimitTypePickerDialog.this.getDialog().dismiss();
            }
        });
    }

    // $FF: synthetic method
    public static final void access$showRepetitionLimitDialog(RepeatLimitTypePickerDialog $this) {
        $this.showRepetitionLimitDialog();
    }
}
// RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$2.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.View.OnClickListener;
    import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/RepeatLimitTypePickerDialog$1$3"}
)
final class RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$2 implements OnClickListener {
    // $FF: synthetic field
    final RepeatLimitTypePickerDialog this$0;

    RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$2(RepeatLimitTypePickerDialog var1) {
        this.this$0 = var1;
    }

    public final void onClick(View it) {
        this.this$0.getCallback().invoke(0L);
        this.this$0.getDialog().dismiss();
    }
}
// RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$3.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"},
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/RepeatLimitTypePickerDialog$3$1"}
)
final class RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$3 extends Lambda implements Function0 {
    // $FF: synthetic field
    final RepeatLimitTypePickerDialog this$0;

    RepeatLimitTypePickerDialog$$special$$inlined$apply$lambda$3(RepeatLimitTypePickerDialog var1) {
        super(0);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        View var10000 = this.this$0.getActivity().getCurrentFocus();
        if (var10000 != null) {
            var10000.clearFocus();
        }

    }
}
// RepeatLimitTypePickerDialog$1$2.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.RadioGroup;
    import com.simplemobiletools.calendar.pro.R.id;
    import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}
)
final class RepeatLimitTypePickerDialog$1$2 implements OnClickListener {
    // $FF: synthetic field
    final View $this_apply;

    public final void onClick(View it) {
        ((RadioGroup)this.$this_apply.findViewById(id.dialog_radio_view)).check(1000809);
    }

    RepeatLimitTypePickerDialog$1$2(View var1) {
        this.$this_apply = var1;
    }
}
