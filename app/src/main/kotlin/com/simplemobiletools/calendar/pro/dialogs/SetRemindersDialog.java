// SetRemindersDialog$$special$$inlined$apply$lambda$5.java
package com.simplemobiletools.calendar.pro.dialogs;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"},
    d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$view$1$4$1", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$$special$$inlined$apply$lambda$1"}
)
final class SetRemindersDialog$$special$$inlined$apply$lambda$5 implements OnCheckedChangeListener {
    // $FF: synthetic field
    final SetRemindersDialog this$0;

    SetRemindersDialog$$special$$inlined$apply$lambda$5(SetRemindersDialog var1) {
        this.this$0 = var1;
    }

    public final void onCheckedChanged(CompoundButton $noName_0, boolean isChecked) {
        SetRemindersDialog.access$setAutomatic$p(this.this$0, isChecked);
    }
}
// SetRemindersDialog$$special$$inlined$apply$lambda$2.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$view$1$1"}
)
final class SetRemindersDialog$$special$$inlined$apply$lambda$2 implements OnClickListener {
    // $FF: synthetic field
    final View $this_apply;
    // $FF: synthetic field
    final SetRemindersDialog this$0;

    SetRemindersDialog$$special$$inlined$apply$lambda$2(View var1, SetRemindersDialog var2) {
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    public final void onClick(View it) {
        ActivityKt.showPickSecondsDialogHelper$default(this.this$0.getActivity(), SetRemindersDialog.access$getMReminder1Minutes$p(this.this$0), false, false, true, (Function0)null, (Function1)(new SetRemindersDialog$$special$$inlined$apply$lambda$2$1(this)), 22, (Object)null);
    }
}
// SetRemindersDialog$$special$$inlined$apply$lambda$4$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.content.Context;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.extensions.ContextKt;
    import com.simplemobiletools.commons.views.MyTextView;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$view$1$3$1"}
)
final class SetRemindersDialog$$special$$inlined$apply$lambda$4$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final SetRemindersDialog$$special$$inlined$apply$lambda$4 this$0;

    SetRemindersDialog$$special$$inlined$apply$lambda$4$1(SetRemindersDialog$$special$$inlined$apply$lambda$4 var1) {
        super(1);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke(((Number)var1).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int it) {
        SetRemindersDialog.access$setMReminder3Minutes$p(this.this$0.this$0, it != -1 && it != 0 ? it / 60 : it);
        MyTextView var10000 = (MyTextView)this.this$0.$this_apply.findViewById(id.set_reminders_3);
        Intrinsics.checkNotNullExpressionValue(var10000, "set_reminders_3");
        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default((Context)this.this$0.this$0.getActivity(), SetRemindersDialog.access$getMReminder3Minutes$p(this.this$0.this$0), false, 2, (Object)null));
    }
}
// SetRemindersDialog$$special$$inlined$apply$lambda$3.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$view$1$2"}
)
final class SetRemindersDialog$$special$$inlined$apply$lambda$3 implements OnClickListener {
    // $FF: synthetic field
    final View $this_apply;
    // $FF: synthetic field
    final SetRemindersDialog this$0;

    SetRemindersDialog$$special$$inlined$apply$lambda$3(View var1, SetRemindersDialog var2) {
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    public final void onClick(View it) {
        ActivityKt.showPickSecondsDialogHelper$default(this.this$0.getActivity(), SetRemindersDialog.access$getMReminder2Minutes$p(this.this$0), false, false, true, (Function0)null, (Function1)(new SetRemindersDialog$$special$$inlined$apply$lambda$3$1(this)), 22, (Object)null);
    }
}
// SetRemindersDialog$$special$$inlined$apply$lambda$3$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.content.Context;
    import android.view.View;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.extensions.ContextKt;
    import com.simplemobiletools.commons.extensions.ViewKt;
    import com.simplemobiletools.commons.views.MyTextView;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$view$1$2$1"}
)
final class SetRemindersDialog$$special$$inlined$apply$lambda$3$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final SetRemindersDialog$$special$$inlined$apply$lambda$3 this$0;

    SetRemindersDialog$$special$$inlined$apply$lambda$3$1(SetRemindersDialog$$special$$inlined$apply$lambda$3 var1) {
        super(1);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke(((Number)var1).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int it) {
        SetRemindersDialog.access$setMReminder2Minutes$p(this.this$0.this$0, it != -1 && it != 0 ? it / 60 : it);
        MyTextView var10000 = (MyTextView)this.this$0.$this_apply.findViewById(id.set_reminders_2);
        Intrinsics.checkNotNullExpressionValue(var10000, "set_reminders_2");
        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default((Context)this.this$0.this$0.getActivity(), SetRemindersDialog.access$getMReminder2Minutes$p(this.this$0.this$0), false, 2, (Object)null));
        if (SetRemindersDialog.access$getMReminder2Minutes$p(this.this$0.this$0) != -1) {
            var10000 = (MyTextView)this.this$0.$this_apply.findViewById(id.set_reminders_3);
            Intrinsics.checkNotNullExpressionValue(var10000, "set_reminders_3");
            ViewKt.beVisible((View)var10000);
        }

    }
}
// SetRemindersDialog$$special$$inlined$apply$lambda$4.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$view$1$3"}
)
final class SetRemindersDialog$$special$$inlined$apply$lambda$4 implements OnClickListener {
    // $FF: synthetic field
    final View $this_apply;
    // $FF: synthetic field
    final SetRemindersDialog this$0;

    SetRemindersDialog$$special$$inlined$apply$lambda$4(View var1, SetRemindersDialog var2) {
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    public final void onClick(View it) {
        ActivityKt.showPickSecondsDialogHelper$default(this.this$0.getActivity(), SetRemindersDialog.access$getMReminder3Minutes$p(this.this$0), false, false, true, (Function0)null, (Function1)(new SetRemindersDialog$$special$$inlined$apply$lambda$4$1(this)), 22, (Object)null);
    }
}
// SetRemindersDialog.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.content.Context;
    import android.content.DialogInterface;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.ImageView;
    import android.widget.CompoundButton.OnCheckedChangeListener;
    import androidx.appcompat.app.AlertDialog;
    import androidx.appcompat.app.AlertDialog.Builder;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.ImageViewKt;
    import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
    import com.simplemobiletools.commons.views.MyTextView;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.Iterator;
    import java.util.List;
    import kotlin.Metadata;
    import kotlin.collections.CollectionsKt;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00121\u0010\u0006\u001a-\u0012#\u0012!\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010\u001a\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R<\u0010\u0006\u001a-\u0012#\u0012!\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog;", "", "activity", "Landroid/app/Activity;", "eventType", "", "callback", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/ParameterName;", "name", "reminders", "", "(Landroid/app/Activity;ILkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getEventType", "()I", "isAutomatic", "", "mReminder1Minutes", "mReminder2Minutes", "mReminder3Minutes", "dialogConfirmed", "calendar_debug"}
)
public final class SetRemindersDialog {
    private int mReminder1Minutes;
    private int mReminder2Minutes;
    private int mReminder3Minutes;
    private boolean isAutomatic;
    @NotNull
    private final Activity activity;
    private final int eventType;
    @NotNull
    private final Function1 callback;

    private final void dialogConfirmed() {
        Iterable $this$filter$iv = (Iterable)CollectionsKt.arrayListOf(new Integer[]{this.mReminder1Minutes, this.mReminder2Minutes, this.mReminder3Minutes});
        int $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var7 = $this$filter$iv.iterator();

        while(var7.hasNext()) {
            Object element$iv$iv = var7.next();
            int it = ((Number)element$iv$iv).intValue();
            int var10 = false;
            if (it != -1) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        List tempReminders = CollectionsKt.sorted((Iterable)((List)destination$iv$iv));
        Integer[] var10000 = new Integer[3];
        Integer var10003 = (Integer)CollectionsKt.getOrNull(tempReminders, 0);
        var10000[0] = var10003 != null ? var10003 : -1;
        var10003 = (Integer)CollectionsKt.getOrNull(tempReminders, 1);
        var10000[1] = var10003 != null ? var10003 : -1;
        var10003 = (Integer)CollectionsKt.getOrNull(tempReminders, 2);
        var10000[2] = var10003 != null ? var10003 : -1;
        ArrayList reminders = CollectionsKt.arrayListOf(var10000);
        if (this.eventType == 1) {
            ContextKt.getConfig((Context)this.activity).setAddBirthdaysAutomatically(this.isAutomatic);
            ContextKt.getConfig((Context)this.activity).setBirthdayReminders(reminders);
        }

        if (this.eventType == 2) {
            ContextKt.getConfig((Context)this.activity).setAddAnniversariesAutomatically(this.isAutomatic);
            ContextKt.getConfig((Context)this.activity).setAnniversaryReminders(reminders);
        }

        this.callback.invoke(reminders);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final int getEventType() {
        return this.eventType;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public SetRemindersDialog(@NotNull Activity activity, int eventType, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.eventType = eventType;
        this.callback = callback;
        this.mReminder1Minutes = -1;
        this.mReminder2Minutes = -1;
        this.mReminder3Minutes = -1;
        View var5 = this.activity.getLayoutInflater().inflate(1300183, (ViewGroup)null);
        int var7 = false;
        ImageView var10000 = (ImageView)var5.findViewById(id.set_reminders_image);
        Intrinsics.checkNotNullExpressionValue(var10000, "set_reminders_image");
        Context var10001 = var5.getContext();
        Intrinsics.checkNotNullExpressionValue(var10001, "context");
        ImageViewKt.applyColorFilter(var10000, ContextKt.getConfig(var10001).getTextColor());
        MyTextView var12 = (MyTextView)var5.findViewById(id.set_reminders_1);
        Intrinsics.checkNotNullExpressionValue(var12, "set_reminders_1");
        var12.setText((CharSequence)com.simplemobiletools.commons.extensions.ContextKt.getFormattedMinutes$default((Context)this.activity, this.mReminder1Minutes, false, 2, (Object)null));
        var12 = (MyTextView)var5.findViewById(id.set_reminders_2);
        Intrinsics.checkNotNullExpressionValue(var12, "set_reminders_2");
        var12.setText((CharSequence)com.simplemobiletools.commons.extensions.ContextKt.getFormattedMinutes$default((Context)this.activity, this.mReminder1Minutes, false, 2, (Object)null));
        var12 = (MyTextView)var5.findViewById(id.set_reminders_3);
        Intrinsics.checkNotNullExpressionValue(var12, "set_reminders_3");
        var12.setText((CharSequence)com.simplemobiletools.commons.extensions.ContextKt.getFormattedMinutes$default((Context)this.activity, this.mReminder1Minutes, false, 2, (Object)null));
        ((MyTextView)var5.findViewById(id.set_reminders_1)).setOnClickListener((OnClickListener)(new SetRemindersDialog$$special$$inlined$apply$lambda$2(var5, this)));
        ((MyTextView)var5.findViewById(id.set_reminders_2)).setOnClickListener((OnClickListener)(new SetRemindersDialog$$special$$inlined$apply$lambda$3(var5, this)));
        ((MyTextView)var5.findViewById(id.set_reminders_3)).setOnClickListener((OnClickListener)(new SetRemindersDialog$$special$$inlined$apply$lambda$4(var5, this)));
        MyAppCompatCheckbox var8 = (MyAppCompatCheckbox)var5.findViewById(id.add_event_automatically_checkbox);
        int var10 = false;
        var8.setVisibility(this.eventType == 0 ? 8 : 0);
        CharSequence var13;
        switch(this.eventType) {
            case 1:
                var13 = (CharSequence)this.activity.getString(1900789);
                break;
            case 2:
                var13 = (CharSequence)this.activity.getString(1900775);
                break;
            default:
                var13 = (CharSequence)"";
        }

        var8.setText(var13);
        boolean var15;
        switch(this.eventType) {
            case 1:
                var15 = ContextKt.getConfig((Context)this.activity).getAddBirthdaysAutomatically();
                break;
            case 2:
                var15 = ContextKt.getConfig((Context)this.activity).getAddAnniversariesAutomatically();
                break;
            default:
                var15 = false;
        }

        var8.setChecked(var15);
        this.isAutomatic = var8.isChecked();
        var8.setOnCheckedChangeListener((OnCheckedChangeListener)(new SetRemindersDialog$$special$$inlined$apply$lambda$5(this)));
        View view = var5;
        AlertDialog var11 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (android.content.DialogInterface.OnClickListener)(new android.content.DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialog, int which) {
                SetRemindersDialog.this.dialogConfirmed();
            }
        })).setNegativeButton(1900000, (android.content.DialogInterface.OnClickListener)null).create();
        var7 = false;
        Activity var14 = this.activity;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        Intrinsics.checkNotNullExpressionValue(var11, "this");
        ActivityKt.setupDialogStuff$default(var14, view, var11, 1900366, (String)null, false, (Function0)null, 56, (Object)null);
    }

    // $FF: synthetic method
    public static final int access$getMReminder1Minutes$p(SetRemindersDialog $this) {
        return $this.mReminder1Minutes;
    }

    // $FF: synthetic method
    public static final void access$setMReminder1Minutes$p(SetRemindersDialog $this, int var1) {
        $this.mReminder1Minutes = var1;
    }

    // $FF: synthetic method
    public static final int access$getMReminder2Minutes$p(SetRemindersDialog $this) {
        return $this.mReminder2Minutes;
    }

    // $FF: synthetic method
    public static final void access$setMReminder2Minutes$p(SetRemindersDialog $this, int var1) {
        $this.mReminder2Minutes = var1;
    }

    // $FF: synthetic method
    public static final int access$getMReminder3Minutes$p(SetRemindersDialog $this) {
        return $this.mReminder3Minutes;
    }

    // $FF: synthetic method
    public static final void access$setMReminder3Minutes$p(SetRemindersDialog $this, int var1) {
        $this.mReminder3Minutes = var1;
    }

    // $FF: synthetic method
    public static final boolean access$isAutomatic$p(SetRemindersDialog $this) {
        return $this.isAutomatic;
    }

    // $FF: synthetic method
    public static final void access$setAutomatic$p(SetRemindersDialog $this, boolean var1) {
        $this.isAutomatic = var1;
    }
}
// SetRemindersDialog$$special$$inlined$apply$lambda$2$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.content.Context;
    import android.view.View;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.extensions.ContextKt;
    import com.simplemobiletools.commons.extensions.ViewKt;
    import com.simplemobiletools.commons.views.MyTextView;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/SetRemindersDialog$view$1$1$1"}
)
final class SetRemindersDialog$$special$$inlined$apply$lambda$2$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final SetRemindersDialog$$special$$inlined$apply$lambda$2 this$0;

    SetRemindersDialog$$special$$inlined$apply$lambda$2$1(SetRemindersDialog$$special$$inlined$apply$lambda$2 var1) {
        super(1);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke(((Number)var1).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int it) {
        SetRemindersDialog.access$setMReminder1Minutes$p(this.this$0.this$0, it != -1 && it != 0 ? it / 60 : it);
        MyTextView var10000 = (MyTextView)this.this$0.$this_apply.findViewById(id.set_reminders_1);
        Intrinsics.checkNotNullExpressionValue(var10000, "set_reminders_1");
        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default((Context)this.this$0.this$0.getActivity(), SetRemindersDialog.access$getMReminder1Minutes$p(this.this$0.this$0), false, 2, (Object)null));
        if (SetRemindersDialog.access$getMReminder1Minutes$p(this.this$0.this$0) != -1) {
            var10000 = (MyTextView)this.this$0.$this_apply.findViewById(id.set_reminders_2);
            Intrinsics.checkNotNullExpressionValue(var10000, "set_reminders_2");
            ViewKt.beVisible((View)var10000);
        }

    }
}
