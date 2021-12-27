// ExportEventsDialog.java
package com.simplemobiletools.calendar.pro.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
import com.simplemobiletools.calendar.pro.helpers.Config;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.extensions.ContextKt;
import com.simplemobiletools.commons.extensions.Context_storageKt;
import com.simplemobiletools.commons.extensions.ViewKt;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import com.simplemobiletools.commons.views.MyEditText;
import com.simplemobiletools.commons.views.MyTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012<\u0010\b\u001a8\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014RG\u0010\b\u001a8\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/ExportEventsDialog;", "", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "path", "", "hidePath", "", "callback", "Lkotlin/Function2;", "Ljava/io/File;", "Lkotlin/ParameterName;", "name", "file", "Ljava/util/ArrayList;", "", "eventTypes", "", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function2;", "config", "Lcom/simplemobiletools/calendar/pro/helpers/Config;", "getConfig", "()Lcom/simplemobiletools/calendar/pro/helpers/Config;", "getHidePath", "()Z", "getPath", "()Ljava/lang/String;", "realPath", "calendar_debug"}
)
public final class ExportEventsDialog {
    private String realPath;
    @NotNull
    private final Config config;
    @NotNull
    private final SimpleActivity activity;
    @NotNull
    private final String path;
    private final boolean hidePath;
    @NotNull
    private final Function2 callback;

    @NotNull
    public final Config getConfig() {
        return this.config;
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final boolean getHidePath() {
        return this.hidePath;
    }

    @NotNull
    public final Function2 getCallback() {
        return this.callback;
    }

    public ExportEventsDialog(@NotNull SimpleActivity activity, @NotNull String path, boolean hidePath, @NotNull Function2 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.path = path;
        this.hidePath = hidePath;
        this.callback = callback;
        CharSequence var5 = (CharSequence)this.path;
        this.realPath = var5.length() == 0 ? ContextKt.getInternalStoragePath((Context)this.activity) : this.path;
        this.config = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig((Context)this.activity);
        View var10000 = this.activity.getLayoutInflater().inflate(1300104, (ViewGroup)null);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } else {
            ViewGroup var6 = (ViewGroup)var10000;
            int var8 = false;
            MyTextView var11 = (MyTextView)((View)var6).findViewById(id.export_events_folder);
            Intrinsics.checkNotNullExpressionValue(var11, "export_events_folder");
            var11.setText((CharSequence)Context_storageKt.humanizePath((Context)this.activity, this.realPath));
            ((MyEditText)((View)var6).findViewById(id.export_events_filename)).setText((CharSequence)(this.activity.getString(1900296) + '_' + ContextKt.getCurrentFormattedDateTime((Context)this.activity)));
            MyAppCompatCheckbox var12 = (MyAppCompatCheckbox)((View)var6).findViewById(id.export_past_events_checkbox);
            Intrinsics.checkNotNullExpressionValue(var12, "export_past_events_checkbox");
            var12.setChecked(this.config.getExportPastEvents());
            ((RelativeLayout)((View)var6).findViewById(id.export_past_events_checkbox_holder)).setOnClickListener((OnClickListener)(new ExportEventsDialog$view$1$1(var6)));
            if (this.hidePath) {
                var11 = (MyTextView)((View)var6).findViewById(id.export_events_folder_label);
                Intrinsics.checkNotNullExpressionValue(var11, "export_events_folder_label");
                ViewKt.beGone((View)var11);
                var11 = (MyTextView)((View)var6).findViewById(id.export_events_folder);
                Intrinsics.checkNotNullExpressionValue(var11, "export_events_folder");
                ViewKt.beGone((View)var11);
            } else {
                ((MyTextView)((View)var6).findViewById(id.export_events_folder)).setOnClickListener((OnClickListener)(new ExportEventsDialog$$special$$inlined$apply$lambda$1(var6, this)));
            }

            com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper((Context)this.activity).getEventTypes((Activity)this.activity, false, (Function1)(new ExportEventsDialog$$special$$inlined$apply$lambda$2(var6, this)));
            ViewGroup view = var6;
            AlertDialog var10 = (new Builder((Context)this.activity)).setPositiveButton(1900829, (android.content.DialogInterface.OnClickListener)null).setNegativeButton(1900000, (android.content.DialogInterface.OnClickListener)null).create();
            var8 = false;
            Activity var13 = (Activity)this.activity;
            View var10001 = (View)view;
            Intrinsics.checkNotNullExpressionValue(var10, "this");
            ActivityKt.setupDialogStuff$default(var13, var10001, var10, 1900268, (String)null, false, (Function0)(new ExportEventsDialog$$special$$inlined$apply$lambda$3(var10, this, view)), 24, (Object)null);
        }
    }

    // $FF: synthetic method
    public static final String access$getRealPath$p(ExportEventsDialog $this) {
        return $this.realPath;
    }

    // $FF: synthetic method
    public static final void access$setRealPath$p(ExportEventsDialog $this, String var1) {
        $this.realPath = var1;
    }
}
// ExportEventsDialog$$special$$inlined$apply$lambda$3$1$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import androidx.recyclerview.widget.RecyclerView.Adapter;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.adapters.FilterEventTypeAdapter;
    import com.simplemobiletools.calendar.pro.helpers.Config;
    import com.simplemobiletools.commons.extensions.StringKt;
    import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
    import com.simplemobiletools.commons.views.MyRecyclerView;
    import java.io.File;
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
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/ExportEventsDialog$1$1$1$1"}
)
final class ExportEventsDialog$$special$$inlined$apply$lambda$3$1$1 extends Lambda implements Function0 {
    // $FF: synthetic field
    final ExportEventsDialog$$special$$inlined$apply$lambda$3$1 this$0;
    // $FF: synthetic field
    final File $file;

    ExportEventsDialog$$special$$inlined$apply$lambda$3$1$1(ExportEventsDialog$$special$$inlined$apply$lambda$3$1 var1, File var2) {
        super(0);
        this.this$0 = var1;
        this.$file = var2;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        Config var10000 = this.this$0.this$0.this$0.getConfig();
        String var10001 = this.$file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(var10001, "file.absolutePath");
        var10000.setLastExportPath(StringKt.getParentPath(var10001));
        var10000 = this.this$0.this$0.this$0.getConfig();
        MyAppCompatCheckbox var4 = (MyAppCompatCheckbox)((View)this.this$0.this$0.$view$inlined).findViewById(id.export_past_events_checkbox);
        Intrinsics.checkNotNullExpressionValue(var4, "view.export_past_events_checkbox");
        var10000.setExportPastEvents(var4.isChecked());
        MyRecyclerView var2 = (MyRecyclerView)((View)this.this$0.this$0.$view$inlined).findViewById(id.export_events_types_list);
        Intrinsics.checkNotNullExpressionValue(var2, "view.export_events_types_list");
        Adapter var3 = var2.getAdapter();
        if (var3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.calendar.pro.adapters.FilterEventTypeAdapter");
        } else {
            ArrayList eventTypes = ((FilterEventTypeAdapter)var3).getSelectedItemsList();
            this.this$0.this$0.this$0.getCallback().invoke(this.$file, eventTypes);
            this.this$0.this$0.$this_apply.dismiss();
        }
    }
}
// ExportEventsDialog$$special$$inlined$apply$lambda$1$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.content.Context;
    import android.view.View;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.extensions.Context_storageKt;
    import com.simplemobiletools.commons.views.MyTextView;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/ExportEventsDialog$view$1$2$1"}
)
final class ExportEventsDialog$$special$$inlined$apply$lambda$1$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final ExportEventsDialog$$special$$inlined$apply$lambda$1 this$0;

    ExportEventsDialog$$special$$inlined$apply$lambda$1$1(ExportEventsDialog$$special$$inlined$apply$lambda$1 var1) {
        super(1);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke((String)var1);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MyTextView var10000 = (MyTextView)((View)this.this$0.$this_apply).findViewById(id.export_events_folder);
        Intrinsics.checkNotNullExpressionValue(var10000, "export_events_folder");
        var10000.setText((CharSequence)Context_storageKt.humanizePath((Context)this.this$0.this$0.getActivity(), it));
        ExportEventsDialog.access$setRealPath$p(this.this$0.this$0, it);
    }
}
// ExportEventsDialog$$special$$inlined$apply$lambda$3.java
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
    d2 = {"<anonymous>", "", "invoke", "com/simplemobiletools/calendar/pro/dialogs/ExportEventsDialog$1$1"}
)
final class ExportEventsDialog$$special$$inlined$apply$lambda$3 extends Lambda implements Function0 {
    // $FF: synthetic field
    final AlertDialog $this_apply;
    // $FF: synthetic field
    final ExportEventsDialog this$0;
    // $FF: synthetic field
    final ViewGroup $view$inlined;

    ExportEventsDialog$$special$$inlined$apply$lambda$3(AlertDialog var1, ExportEventsDialog var2, ViewGroup var3) {
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
        this.$this_apply.getButton(-1).setOnClickListener((OnClickListener)(new ExportEventsDialog$$special$$inlined$apply$lambda$3$1(this)));
    }
}
// ExportEventsDialog$view$1$1.java
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
final class ExportEventsDialog$view$1$1 implements OnClickListener {
    // $FF: synthetic field
    final ViewGroup $this_apply;

    public final void onClick(View it) {
        ((MyAppCompatCheckbox)((View)this.$this_apply).findViewById(id.export_past_events_checkbox)).toggle();
    }

    ExportEventsDialog$view$1$1(ViewGroup var1) {
        this.$this_apply = var1;
    }
}
// ExportEventsDialog$$special$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.app.Activity;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.activities.BaseSimpleActivity;
    import com.simplemobiletools.commons.dialogs.FilePickerDialog;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.views.MyEditText;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.DefaultConstructorMarker;
    import kotlin.jvm.internal.Intrinsics;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/ExportEventsDialog$view$1$2"}
)
final class ExportEventsDialog$$special$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final ViewGroup $this_apply;
    // $FF: synthetic field
    final ExportEventsDialog this$0;

    ExportEventsDialog$$special$$inlined$apply$lambda$1(ViewGroup var1, ExportEventsDialog var2) {
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    public final void onClick(View it) {
        Activity var10000 = (Activity)this.this$0.getActivity();
        MyEditText var10001 = (MyEditText)((View)this.$this_apply).findViewById(id.export_events_filename);
        Intrinsics.checkNotNullExpressionValue(var10001, "export_events_filename");
        ActivityKt.hideKeyboard(var10000, (View)var10001);
        new FilePickerDialog((BaseSimpleActivity)this.this$0.getActivity(), ExportEventsDialog.access$getRealPath$p(this.this$0), false, false, true, false, false, false, (Function1)(new ExportEventsDialog$$special$$inlined$apply$lambda$1$1(this)), 232, (DefaultConstructorMarker)null);
    }
}
// ExportEventsDialog$$special$$inlined$apply$lambda$2.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.LinearLayout;
    import androidx.recyclerview.widget.RecyclerView.Adapter;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.adapters.FilterEventTypeAdapter;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import com.simplemobiletools.commons.extensions.ViewKt;
    import com.simplemobiletools.commons.views.MyRecyclerView;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.HashSet;
    import java.util.Iterator;
    import java.util.List;
    import java.util.Set;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"},
    d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "Lkotlin/collections/ArrayList;", "invoke", "com/simplemobiletools/calendar/pro/dialogs/ExportEventsDialog$view$1$3"}
)
final class ExportEventsDialog$$special$$inlined$apply$lambda$2 extends Lambda implements Function1 {
    // $FF: synthetic field
    final ViewGroup $this_apply;
    // $FF: synthetic field
    final ExportEventsDialog this$0;

    ExportEventsDialog$$special$$inlined$apply$lambda$2(ViewGroup var1, ExportEventsDialog var2) {
        super(1);
        this.$this_apply = var1;
        this.this$0 = var2;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke((ArrayList)var1);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HashSet eventTypes = new HashSet();
        Iterable $this$mapTo$iv = (Iterable)it;
        int $i$f$mapTo = false;
        Iterator var5 = $this$mapTo$iv.iterator();

        Collection var10000;
        while(var5.hasNext()) {
            Object item$iv = var5.next();
            var10000 = (Collection)eventTypes;
            EventType it = (EventType)item$iv;
            Collection var8 = var10000;
            int var9 = false;
            String var10 = String.valueOf(it.getId());
            var8.add(var10);
        }

        var10000 = (Collection)eventTypes;
        MyRecyclerView var11 = (MyRecyclerView)((View)this.$this_apply).findViewById(id.export_events_types_list);
        Intrinsics.checkNotNullExpressionValue(var11, "export_events_types_list");
        var11.setAdapter((Adapter)(new FilterEventTypeAdapter(this.this$0.getActivity(), (List)it, (Set)eventTypes)));
        if (it.size() > 1) {
            LinearLayout var12 = (LinearLayout)((View)this.$this_apply).findViewById(id.export_events_pick_types);
            Intrinsics.checkNotNullExpressionValue(var12, "export_events_pick_types");
            ViewKt.beVisible((View)var12);
        }

    }
}
// ExportEventsDialog$$special$$inlined$apply$lambda$3$1.java
package com.simplemobiletools.calendar.pro.dialogs;

    import android.content.Context;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.EditText;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.commons.extensions.ContextKt;
    import com.simplemobiletools.commons.extensions.EditTextKt;
    import com.simplemobiletools.commons.extensions.StringKt;
    import com.simplemobiletools.commons.helpers.ConstantsKt;
    import com.simplemobiletools.commons.views.MyEditText;
    import java.io.File;
    import kotlin.Metadata;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.internal.Intrinsics;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/dialogs/ExportEventsDialog$1$1$1"}
)
final class ExportEventsDialog$$special$$inlined$apply$lambda$3$1 implements OnClickListener {
    // $FF: synthetic field
    final ExportEventsDialog$$special$$inlined$apply$lambda$3 this$0;

    ExportEventsDialog$$special$$inlined$apply$lambda$3$1(ExportEventsDialog$$special$$inlined$apply$lambda$3 var1) {
        this.this$0 = var1;
    }

    public final void onClick(View it) {
        MyEditText var10000 = (MyEditText)((View)this.this$0.$view$inlined).findViewById(id.export_events_filename);
        Intrinsics.checkNotNullExpressionValue(var10000, "view.export_events_filename");
        String filename = EditTextKt.getValue((EditText)var10000);
        CharSequence var3 = (CharSequence)filename;
        if (var3.length() == 0) {
            ContextKt.toast$default((Context)this.this$0.this$0.getActivity(), 1900970, 0, 2, (Object)null);
        } else if (StringKt.isAValidFilename(filename)) {
            File file = new File(ExportEventsDialog.access$getRealPath$p(this.this$0.this$0), filename + ".ics");
            if (!this.this$0.this$0.getHidePath() && file.exists()) {
                ContextKt.toast$default((Context)this.this$0.this$0.getActivity(), 1900262, 0, 2, (Object)null);
                return;
            }

            ConstantsKt.ensureBackgroundThread((Function0)(new ExportEventsDialog$$special$$inlined$apply$lambda$3$1$1(this, file)));
        } else {
            ContextKt.toast$default((Context)this.this$0.this$0.getActivity(), 1900681, 0, 2, (Object)null);
        }

    }
}
