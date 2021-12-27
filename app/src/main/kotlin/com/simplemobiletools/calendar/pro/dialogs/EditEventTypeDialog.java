// EditEventTypeDialog$$special$$inlined$apply$lambda$1$2.java
package com.simplemobiletools.calendar.pro.dialogs;

import android.widget.ImageView;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.models.EventType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/EditEventTypeDialog$view$1$1$2"}
)
final class EditEventTypeDialog$$special$$inlined$apply$lambda$1$2 extends Lambda implements Function1 {
    // $FF: synthetic field
    final EditEventTypeDialog$$special$$inlined$apply$lambda$1 this$0;

    EditEventTypeDialog$$special$$inlined$apply$lambda$1$2(EditEventTypeDialog$$special$$inlined$apply$lambda$1 var1) {
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
        EventType var10000 = this.this$0.this$0.getEventType();
        Intrinsics.checkNotNull(var10000);
        var10000.setColor(it);
        EditEventTypeDialog var2 = this.this$0.this$0;
        ImageView var10001 = (ImageView)this.this$0.$this_apply.findViewById(id.type_color);
        Intrinsics.checkNotNullExpressionValue(var10001, "type_color");
        EditEventTypeDialog.access$setupColor(var2, var10001);
    }
}
// EditEventTypeDialog$$special$$inlined$apply$lambda$2$1$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.widget.EditText;
    import androidx.appcompat.app.AlertDialog;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.extensions.EditTextKt;
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
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/EditEventTypeDialog$1$1$1$1"}
)
final class EditEventTypeDialog$$special$$inlined$apply$lambda$2$1$1 extends Lambda implements Function0 {
    // $FF: synthetic field
    final EditEventTypeDialog$$special$$inlined$apply$lambda$2$1 this$0;

    EditEventTypeDialog$$special$$inlined$apply$lambda$2$1$1(EditEventTypeDialog$$special$$inlined$apply$lambda$2$1 var1) {
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
        EditEventTypeDialog var10000 = this.this$0.this$0.this$0;
        View var10001 = this.this$0.this$0.$view$inlined;
        Intrinsics.checkNotNullExpressionValue(var10001, "view");
        MyEditText var1 = (MyEditText)var10001.findViewById(id.type_title);
        Intrinsics.checkNotNullExpressionValue(var1, "view.type_title");
        String var2 = EditTextKt.getValue((EditText)var1);
        AlertDialog var10002 = this.this$0.this$0.$this_apply;
        Intrinsics.checkNotNullExpressionValue(var10002, "this");
        EditEventTypeDialog.access$eventTypeConfirmed(var10000, var2, var10002);
    }
}
// EditEventTypeDialog$$special$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.view.View;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import com.simplemobiletools.commons.dialogs.ColorPickerDialog;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.functions.Function2;
    import kotlin.jvm.internal.DefaultConstructorMarker;
    import kotlin.jvm.internal.Intrinsics;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/EditEventTypeDialog$view$1$1"}
)
final class EditEventTypeDialog$$special$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final View $this_apply;
    // $FF: synthetic field
    final EditEventTypeDialog this$0;

    EditEventTypeDialog$$special$$inlined$apply$lambda$1(View var1, EditEventTypeDialog var2) {
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    public final void onClick(View it) {
        EventType var10000 = this.this$0.getEventType();
        Activity var10002;
        EventType var10003;
        if (var10000 != null) {
            if (var10000.getCaldavCalendarId() == 0) {
                var10002 = this.this$0.getActivity();
                var10003 = this.this$0.getEventType();
                Intrinsics.checkNotNull(var10003);
                new ColorPickerDialog(var10002, var10003.getColor(), false, false, (Function1)null, (Function2)(new EditEventTypeDialog$$special$$inlined$apply$lambda$1$1(this)), 28, (DefaultConstructorMarker)null);
                return;
            }
        }

        var10002 = this.this$0.getActivity();
        var10003 = this.this$0.getEventType();
        Intrinsics.checkNotNull(var10003);
        new SelectEventTypeColorDialog(var10002, var10003, (Function1)(new EditEventTypeDialog$$special$$inlined$apply$lambda$1$2(this)));
    }
}
// EditEventTypeDialog$$special$$inlined$apply$lambda$1$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.widget.ImageView;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function2;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"},
    d2 = {"<anonymous>", "", "wasPositivePressed", "", "color", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/EditEventTypeDialog$view$1$1$1"}
)
final class EditEventTypeDialog$$special$$inlined$apply$lambda$1$1 extends Lambda implements Function2 {
    // $FF: synthetic field
    final EditEventTypeDialog$$special$$inlined$apply$lambda$1 this$0;

    EditEventTypeDialog$$special$$inlined$apply$lambda$1$1(EditEventTypeDialog$$special$$inlined$apply$lambda$1 var1) {
        super(2);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1, Object var2) {
        this.invoke((Boolean)var1, ((Number)var2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean wasPositivePressed, int color) {
        if (wasPositivePressed) {
            EventType var10000 = this.this$0.this$0.getEventType();
            Intrinsics.checkNotNull(var10000);
            var10000.setColor(color);
            EditEventTypeDialog var3 = this.this$0.this$0;
            ImageView var10001 = (ImageView)this.this$0.$this_apply.findViewById(id.type_color);
            Intrinsics.checkNotNullExpressionValue(var10001, "type_color");
            EditEventTypeDialog.access$setupColor(var3, var10001);
        }

    }
}
// EditEventTypeDialog.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.content.Context;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.ImageView;
    import androidx.appcompat.app.AlertDialog;
    import androidx.appcompat.app.AlertDialog.Builder;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.calendar.pro.helpers.EventsHelper;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.ImageViewKt;
    import com.simplemobiletools.commons.views.MyEditText;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.DefaultConstructorMarker;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;
    import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/EditEventTypeDialog;", "", "activity", "Landroid/app/Activity;", "eventType", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "(Landroid/app/Activity;Lcom/simplemobiletools/calendar/pro/models/EventType;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getEventType", "()Lcom/simplemobiletools/calendar/pro/models/EventType;", "setEventType", "(Lcom/simplemobiletools/calendar/pro/models/EventType;)V", "isNewEvent", "", "()Z", "setNewEvent", "(Z)V", "eventTypeConfirmed", "title", "", "dialog", "Landroidx/appcompat/app/AlertDialog;", "setupColor", "view", "Landroid/widget/ImageView;", "calendar_debug"}
)
public final class EditEventTypeDialog {
    private boolean isNewEvent;
    @NotNull
    private final Activity activity;
    @Nullable
    private EventType eventType;
    @NotNull
    private final Function1 callback;

    public final boolean isNewEvent() {
        return this.isNewEvent;
    }

    public final void setNewEvent(boolean var1) {
        this.isNewEvent = var1;
    }

    private final void setupColor(ImageView view) {
        EventType var10001 = this.eventType;
        Intrinsics.checkNotNull(var10001);
        ImageViewKt.setFillWithStroke$default(view, var10001.getColor(), ContextKt.getConfig((Context)this.activity).getBackgroundColor(), false, 4, (Object)null);
    }

    private final void eventTypeConfirmed(String title, final AlertDialog dialog) {
        long eventIdWithTitle = ContextKt.getEventsHelper((Context)this.activity).getEventTypeIdWithTitle(title);
        boolean isEventTypeTitleTaken = this.isNewEvent && eventIdWithTitle != -1L;
        EventType var10000;
        Long var7;
        if (!isEventTypeTitleTaken) {
            boolean var8;
            label52: {
                if (!this.isNewEvent) {
                    label50: {
                        var10000 = this.eventType;
                        Intrinsics.checkNotNull(var10000);
                        var7 = var10000.getId();
                        if (var7 != null) {
                            if (var7 == eventIdWithTitle) {
                                break label50;
                            }
                        }

                        if (eventIdWithTitle != -1L) {
                            var8 = true;
                            break label52;
                        }
                    }
                }

                var8 = false;
            }

            isEventTypeTitleTaken = var8;
        }

        CharSequence var6 = (CharSequence)title;
        if (var6.length() == 0) {
            com.simplemobiletools.commons.extensions.ContextKt.toast$default((Context)this.activity, 1900387, 0, 2, (Object)null);
        } else if (isEventTypeTitleTaken) {
            com.simplemobiletools.commons.extensions.ContextKt.toast$default((Context)this.activity, 1900335, 0, 2, (Object)null);
        } else {
            var10000 = this.eventType;
            Intrinsics.checkNotNull(var10000);
            var10000.setTitle(title);
            var10000 = this.eventType;
            Intrinsics.checkNotNull(var10000);
            if (var10000.getCaldavCalendarId() != 0) {
                var10000 = this.eventType;
                Intrinsics.checkNotNull(var10000);
                var10000.setCaldavDisplayName(title);
            }

            var10000 = this.eventType;
            Intrinsics.checkNotNull(var10000);
            EventsHelper var10001 = ContextKt.getEventsHelper((Context)this.activity);
            EventType var10002 = this.eventType;
            Intrinsics.checkNotNull(var10002);
            var10000.setId(var10001.insertOrUpdateEventTypeSync(var10002));
            var10000 = this.eventType;
            Intrinsics.checkNotNull(var10000);
            var7 = var10000.getId();
            if (var7 != null) {
                if (var7 == -1L) {
                    com.simplemobiletools.commons.extensions.ContextKt.toast$default((Context)this.activity, 1900280, 0, 2, (Object)null);
                    return;
                }
            }

            this.activity.runOnUiThread((Runnable)(new Runnable() {
                public final void run() {
                    dialog.dismiss();
                    Function1 var10000 = EditEventTypeDialog.this.getCallback();
                    EventType var10001 = EditEventTypeDialog.this.getEventType();
                    Intrinsics.checkNotNull(var10001);
                    var10000.invoke(var10001);
                }
            }));
        }
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @Nullable
    public final EventType getEventType() {
        return this.eventType;
    }

    public final void setEventType(@Nullable EventType var1) {
        this.eventType = var1;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public EditEventTypeDialog(@NotNull Activity activity, @Nullable EventType eventType, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.eventType = eventType;
        this.callback = callback;
        this.isNewEvent = this.eventType == null;
        if (this.eventType == null) {
            this.eventType = new EventType((Long)null, "", ContextKt.getConfig((Context)this.activity).getPrimaryColor(), 0, (String)null, (String)null, 56, (DefaultConstructorMarker)null);
        }

        View var5 = this.activity.getLayoutInflater().inflate(1300070, (ViewGroup)null);
        int var7 = false;
        ImageView var10001 = (ImageView)var5.findViewById(id.type_color);
        Intrinsics.checkNotNullExpressionValue(var10001, "type_color");
        this.setupColor(var10001);
        MyEditText var10000 = (MyEditText)var5.findViewById(id.type_title);
        EventType var10 = this.eventType;
        Intrinsics.checkNotNull(var10);
        var10000.setText((CharSequence)var10.getTitle());
        ((ImageView)var5.findViewById(id.type_color)).setOnClickListener((OnClickListener)(new EditEventTypeDialog$$special$$inlined$apply$lambda$1(var5, this)));
        View view = var5;
        AlertDialog var8 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (android.content.DialogInterface.OnClickListener)null).setNegativeButton(1900000, (android.content.DialogInterface.OnClickListener)null).create();
        var7 = false;
        Activity var9 = this.activity;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        Intrinsics.checkNotNullExpressionValue(var8, "this");
        ActivityKt.setupDialogStuff$default(var9, view, var8, this.isNewEvent ? 1901048 : 1900074, (String)null, false, (Function0)(new EditEventTypeDialog$$special$$inlined$apply$lambda$2(var8, this, view)), 24, (Object)null);
    }

    // $FF: synthetic method
    public EditEventTypeDialog(Activity var1, EventType var2, Function1 var3, int var4, DefaultConstructorMarker var5) {
        if ((var4 & 2) != 0) {
            var2 = (EventType)null;
        }

        this(var1, var2, var3);
    }

    // $FF: synthetic method
    public static final void access$setupColor(EditEventTypeDialog $this, ImageView view) {
        $this.setupColor(view);
    }

    // $FF: synthetic method
    public static final void access$eventTypeConfirmed(EditEventTypeDialog $this, String title, AlertDialog dialog) {
        $this.eventTypeConfirmed(title, dialog);
    }
}
// EditEventTypeDialog$$special$$inlined$apply$lambda$2.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.View.OnClickListener;
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
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/EditEventTypeDialog$1$1"}
)
final class EditEventTypeDialog$$special$$inlined$apply$lambda$2 extends Lambda implements Function0 {
    // $FF: synthetic field
    final AlertDialog $this_apply;
    // $FF: synthetic field
    final EditEventTypeDialog this$0;
    // $FF: synthetic field
    final View $view$inlined;

    EditEventTypeDialog$$special$$inlined$apply$lambda$2(AlertDialog var1, EditEventTypeDialog var2, View var3) {
        super(0);
        this.$this_apply = var1;
        this.this$0 = var2;
        this.$view$inlined = var3;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        AlertDialog var10000 = this.$this_apply;
        View var10001 = this.$view$inlined;
        Intrinsics.checkNotNullExpressionValue(var10001, "view");
        MyEditText var1 = (MyEditText)var10001.findViewById(id.type_title);
        Intrinsics.checkNotNullExpressionValue(var1, "view.type_title");
        AlertDialogKt.showKeyboard(var10000, (EditText)var1);
        this.$this_apply.getButton(-1).setOnClickListener((OnClickListener)(new EditEventTypeDialog$$special$$inlined$apply$lambda$2$1(this)));
    }
}
// EditEventTypeDialog$$special$$inlined$apply$lambda$2$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.commons.helpers.ConstantsKt;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function0;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/EditEventTypeDialog$1$1$1"}
)
final class EditEventTypeDialog$$special$$inlined$apply$lambda$2$1 implements OnClickListener {
    // $FF: synthetic field
    final EditEventTypeDialog$$special$$inlined$apply$lambda$2 this$0;

    EditEventTypeDialog$$special$$inlined$apply$lambda$2$1(EditEventTypeDialog$$special$$inlined$apply$lambda$2 var1) {
        this.this$0 = var1;
    }

    public final void onClick(View it) {
        ConstantsKt.ensureBackgroundThread((Function0)(new EditEventTypeDialog$$special$$inlined$apply$lambda$2$1$1(this)));
    }
}
