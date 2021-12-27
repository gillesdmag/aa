// ImportEventsDialog$initDialog$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.dialogs;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/ImportEventsDialog$initDialog$view$1$1"}
)
final class ImportEventsDialog$initDialog$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final ViewGroup $this_apply;
    // $FF: synthetic field
    final ImportEventsDialog this$0;

    ImportEventsDialog$initDialog$$inlined$apply$lambda$1(ViewGroup var1, ImportEventsDialog var2) {
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    public final void onClick(View it) {
        new SelectEventTypeDialog((Activity)this.this$0.getActivity(), this.this$0.getCurrEventTypeId(), true, true, false, true, (Function1)(new ImportEventsDialog$initDialog$$inlined$apply$lambda$1$1(this)));
    }
}
// ImportEventsDialog$initDialog$view$1$2.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
    import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}
)
final class ImportEventsDialog$initDialog$view$1$2 implements OnClickListener {
    // $FF: synthetic field
    final ViewGroup $this_apply;

    public final void onClick(View it) {
        ((MyAppCompatCheckbox)((View)this.$this_apply).findViewById(id.import_events_checkbox)).toggle();
    }

    ImportEventsDialog$initDialog$view$1$2(ViewGroup var1) {
        this.$this_apply = var1;
    }
}
// ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.helpers.IcsImporter;
    import com.simplemobiletools.calendar.pro.helpers.IcsImporter.ImportResult;
    import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
    import java.util.ArrayList;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"},
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/ImportEventsDialog$initDialog$1$1$1$1"}
)
final class ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1$1 extends Lambda implements Function0 {
    // $FF: synthetic field
    final ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1 this$0;

    ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1$1(ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1 var1) {
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
        MyAppCompatCheckbox var10000 = (MyAppCompatCheckbox)((View)this.this$0.this$0.$view$inlined).findViewById(id.import_events_checkbox);
        Intrinsics.checkNotNullExpressionValue(var10000, "view.import_events_checkbox");
        boolean overrideFileEventTypes = var10000.isChecked();
        ImportResult result = IcsImporter.importEvents$default(new IcsImporter(this.this$0.this$0.this$0.getActivity()), this.this$0.this$0.this$0.getPath(), this.this$0.this$0.this$0.getCurrEventTypeId(), this.this$0.this$0.this$0.getCurrEventTypeCalDAVCalendarId(), overrideFileEventTypes, (ArrayList)null, 16, (Object)null);
        ImportEventsDialog.access$handleParseResult(this.this$0.this$0.this$0, result);
        this.this$0.this$0.$this_apply.dismiss();
    }
}
// ImportEventsDialog.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.content.Context;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.ImageView;
    import android.widget.RelativeLayout;
    import androidx.appcompat.app.AlertDialog;
    import androidx.appcompat.app.AlertDialog.Builder;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.calendar.pro.helpers.Config;
    import com.simplemobiletools.calendar.pro.helpers.IcsImporter.ImportResult;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.ImageViewKt;
    import com.simplemobiletools.commons.helpers.ConstantsKt;
    import com.simplemobiletools.commons.views.MyTextView;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\fH\u0002J\u0010\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020*H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006+"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/ImportEventsDialog;", "", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "path", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "refreshView", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "config", "Lcom/simplemobiletools/calendar/pro/helpers/Config;", "getConfig", "()Lcom/simplemobiletools/calendar/pro/helpers/Config;", "currEventTypeCalDAVCalendarId", "", "getCurrEventTypeCalDAVCalendarId", "()I", "setCurrEventTypeCalDAVCalendarId", "(I)V", "currEventTypeId", "", "getCurrEventTypeId", "()J", "setCurrEventTypeId", "(J)V", "getPath", "()Ljava/lang/String;", "handleParseResult", "result", "Lcom/simplemobiletools/calendar/pro/helpers/IcsImporter$ImportResult;", "initDialog", "updateEventType", "view", "Landroid/view/ViewGroup;", "calendar_debug"}
)
public final class ImportEventsDialog {
    private long currEventTypeId;
    private int currEventTypeCalDAVCalendarId;
    @NotNull
    private final Config config;
    @NotNull
    private final SimpleActivity activity;
    @NotNull
    private final String path;
    @NotNull
    private final Function1 callback;

    public final long getCurrEventTypeId() {
        return this.currEventTypeId;
    }

    public final void setCurrEventTypeId(long var1) {
        this.currEventTypeId = var1;
    }

    public final int getCurrEventTypeCalDAVCalendarId() {
        return this.currEventTypeCalDAVCalendarId;
    }

    public final void setCurrEventTypeCalDAVCalendarId(int var1) {
        this.currEventTypeCalDAVCalendarId = var1;
    }

    @NotNull
    public final Config getConfig() {
        return this.config;
    }

    private final void initDialog() {
        View var10000 = this.activity.getLayoutInflater().inflate(1300126, (ViewGroup)null);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } else {
            ViewGroup var2 = (ViewGroup)var10000;
            int var4 = false;
            this.updateEventType(var2);
            ((RelativeLayout)((View)var2).findViewById(id.import_event_type_holder)).setOnClickListener((OnClickListener)(new ImportEventsDialog$initDialog$$inlined$apply$lambda$1(var2, this)));
            ((RelativeLayout)((View)var2).findViewById(id.import_events_checkbox_holder)).setOnClickListener((OnClickListener)(new ImportEventsDialog$initDialog$view$1$2(var2)));
            ViewGroup view = var2;
            AlertDialog var5 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (android.content.DialogInterface.OnClickListener)null).setNegativeButton(1900000, (android.content.DialogInterface.OnClickListener)null).create();
            var4 = false;
            Activity var6 = (Activity)this.activity;
            View var10001 = (View)view;
            Intrinsics.checkNotNullExpressionValue(var5, "this");
            ActivityKt.setupDialogStuff$default(var6, var10001, var5, 1900241, (String)null, false, (Function0)(new ImportEventsDialog$initDialog$$inlined$apply$lambda$2(var5, this, view)), 24, (Object)null);
        }
    }

    private final void updateEventType(final ViewGroup view) {
        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                final EventType eventType = ContextKt.getEventTypesDB((Context)ImportEventsDialog.this.getActivity()).getEventTypeWithId(ImportEventsDialog.this.getCurrEventTypeId());
                ImportEventsDialog.this.getActivity().runOnUiThread((Runnable)(new Runnable() {
                    public final void run() {
                        MyTextView var10000 = (MyTextView)((View)view).findViewById(id.import_event_type_title);
                        Intrinsics.checkNotNullExpressionValue(var10000, "view.import_event_type_title");
                        EventType var10001 = eventType;
                        Intrinsics.checkNotNull(var10001);
                        var10000.setText((CharSequence)var10001.getDisplayTitle());
                        ImageView var1 = (ImageView)((View)view).findViewById(id.import_event_type_color);
                        Intrinsics.checkNotNullExpressionValue(var1, "view.import_event_type_color");
                        ImageViewKt.setFillWithStroke$default(var1, eventType.getColor(), ContextKt.getConfig((Context)ImportEventsDialog.this.getActivity()).getBackgroundColor(), false, 4, (Object)null);
                    }
                }));
            }
        }));
    }

    private final void handleParseResult(ImportResult result) {
        // $FF: Couldn't be decompiled
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public ImportEventsDialog(@NotNull SimpleActivity activity, @NotNull String path, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.path = path;
        this.callback = callback;
        this.currEventTypeId = 1L;
        this.config = ContextKt.getConfig((Context)this.activity);
        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                if (ContextKt.getEventTypesDB((Context)ImportEventsDialog.this.getActivity()).getEventTypeWithId(ImportEventsDialog.this.getConfig().getLastUsedLocalEventTypeId()) == null) {
                    ImportEventsDialog.this.getConfig().setLastUsedLocalEventTypeId(1L);
                }

                boolean isLastCaldavCalendarOK = ImportEventsDialog.this.getConfig().getCaldavSync() && ImportEventsDialog.this.getConfig().getSyncedCalendarIdsAsList().contains(ImportEventsDialog.this.getConfig().getLastUsedCaldavCalendarId());
                ImportEventsDialog var10000 = ImportEventsDialog.this;
                long var3;
                if (isLastCaldavCalendarOK) {
                    EventType lastUsedCalDAVCalendar = ContextKt.getEventsHelper((Context)ImportEventsDialog.this.getActivity()).getEventTypeWithCalDAVCalendarId(ImportEventsDialog.this.getConfig().getLastUsedCaldavCalendarId());
                    if (lastUsedCalDAVCalendar != null) {
                        ImportEventsDialog.this.setCurrEventTypeCalDAVCalendarId(ImportEventsDialog.this.getConfig().getLastUsedCaldavCalendarId());
                        Long var10001 = lastUsedCalDAVCalendar.getId();
                        Intrinsics.checkNotNull(var10001);
                        var3 = var10001;
                    } else {
                        var3 = 1L;
                    }
                } else {
                    var3 = ImportEventsDialog.this.getConfig().getLastUsedLocalEventTypeId();
                }

                var10000.setCurrEventTypeId(var3);
                ImportEventsDialog.this.getActivity().runOnUiThread((Runnable)(new Runnable() {
                    public final void run() {
                        ImportEventsDialog.this.initDialog();
                    }
                }));
            }
        }));
    }

    // $FF: synthetic method
    public static final void access$updateEventType(ImportEventsDialog $this, ViewGroup view) {
        $this.updateEventType(view);
    }

    // $FF: synthetic method
    public static final void access$handleParseResult(ImportEventsDialog $this, ImportResult result) {
        $this.handleParseResult(result);
    }
}
// ImportEventsDialog$initDialog$$inlined$apply$lambda$1$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import com.simplemobiletools.calendar.pro.helpers.Config;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "invoke", "com/simplemobiletools/calendar/pro/dialogs/ImportEventsDialog$initDialog$view$1$1$1"}
)
final class ImportEventsDialog$initDialog$$inlined$apply$lambda$1$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final ImportEventsDialog$initDialog$$inlined$apply$lambda$1 this$0;

    ImportEventsDialog$initDialog$$inlined$apply$lambda$1$1(ImportEventsDialog$initDialog$$inlined$apply$lambda$1 var1) {
        super(1);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke((EventType)var1);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull EventType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ImportEventsDialog var10000 = this.this$0.this$0;
        Long var10001 = it.getId();
        Intrinsics.checkNotNull(var10001);
        var10000.setCurrEventTypeId(var10001);
        this.this$0.this$0.setCurrEventTypeCalDAVCalendarId(it.getCaldavCalendarId());
        Config var2 = this.this$0.this$0.getConfig();
        var10001 = it.getId();
        Intrinsics.checkNotNull(var10001);
        var2.setLastUsedLocalEventTypeId(var10001);
        this.this$0.this$0.getConfig().setLastUsedCaldavCalendarId(it.getCaldavCalendarId());
        ImportEventsDialog.access$updateEventType(this.this$0.this$0, this.this$0.$this_apply);
    }
}
// ImportEventsDialog$WhenMappings.java
package com.simplemobiletools.calendar.pro.dialogs;

    import com.simplemobiletools.calendar.pro.helpers.IcsImporter.ImportResult;
    import kotlin.Metadata;

// $FF: synthetic class
@Metadata(
    mv = {1, 5, 1},
    k = 3
)
public final class ImportEventsDialog$WhenMappings {
    // $FF: synthetic field
    public static final int[] $EnumSwitchMapping$0 = new int[ImportResult.values().length];

    static {
        $EnumSwitchMapping$0[ImportResult.IMPORT_NOTHING_NEW.ordinal()] = 1;
        $EnumSwitchMapping$0[ImportResult.IMPORT_OK.ordinal()] = 2;
        $EnumSwitchMapping$0[ImportResult.IMPORT_PARTIAL.ordinal()] = 3;
    }
}
// ImportEventsDialog$initDialog$$inlined$apply$lambda$2.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import androidx.appcompat.app.AlertDialog;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"},
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/ImportEventsDialog$initDialog$1$1"}
)
final class ImportEventsDialog$initDialog$$inlined$apply$lambda$2 extends Lambda implements Function0 {
    // $FF: synthetic field
    final AlertDialog $this_apply;
    // $FF: synthetic field
    final ImportEventsDialog this$0;
    // $FF: synthetic field
    final ViewGroup $view$inlined;

    ImportEventsDialog$initDialog$$inlined$apply$lambda$2(AlertDialog var1, ImportEventsDialog var2, ViewGroup var3) {
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
        this.$this_apply.getButton(-1).setOnClickListener((OnClickListener)(new ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1(this)));
    }
}
// ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.content.Context;
    import android.view.View;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.commons.extensions.ContextKt;
    import com.simplemobiletools.commons.helpers.ConstantsKt;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function0;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/ImportEventsDialog$initDialog$1$1$1"}
)
final class ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1 implements OnClickListener {
    // $FF: synthetic field
    final ImportEventsDialog$initDialog$$inlined$apply$lambda$2 this$0;

    ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1(ImportEventsDialog$initDialog$$inlined$apply$lambda$2 var1) {
        this.this$0 = var1;
    }

    public final void onClick(View it) {
        this.this$0.$this_apply.getButton(-1).setOnClickListener((OnClickListener)null);
        ContextKt.toast$default((Context)this.this$0.this$0.getActivity(), 1900798, 0, 2, (Object)null);
        ConstantsKt.ensureBackgroundThread((Function0)(new ImportEventsDialog$initDialog$$inlined$apply$lambda$2$1$1(this)));
    }
}

