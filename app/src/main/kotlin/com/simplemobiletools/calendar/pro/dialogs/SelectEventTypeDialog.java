package com.simplemobiletools.calendar.pro.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.views.MyCompatRadioButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/SelectEventTypeDialog;", "", "activity", "Landroid/app/Activity;", "currEventType", "", "showCalDAVCalendars", "", "showNewEventTypeOption", "addLastUsedOneAsFirstOption", "showOnlyWritable", "callback", "Lkotlin/Function1;", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "Lkotlin/ParameterName;", "name", "eventType", "", "(Landroid/app/Activity;JZZZZLkotlin/jvm/functions/Function1;)V", "LAST_USED_EVENT_TYPE_ID", "NEW_EVENT_TYPE_ID", "getActivity", "()Landroid/app/Activity;", "getAddLastUsedOneAsFirstOption", "()Z", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getCurrEventType", "()J", "dialog", "Landroidx/appcompat/app/AlertDialog;", "eventTypes", "Ljava/util/ArrayList;", "radioGroup", "Landroid/widget/RadioGroup;", "getShowCalDAVCalendars", "getShowNewEventTypeOption", "getShowOnlyWritable", "wasInit", "addRadioButton", "viewClicked", "calendar_debug"}
)
public final class SelectEventTypeDialog {
    private final long NEW_EVENT_TYPE_ID;
    private final long LAST_USED_EVENT_TYPE_ID;
    private final AlertDialog dialog;
    private final RadioGroup radioGroup;
    private boolean wasInit;
    private ArrayList eventTypes;
    @NotNull
    private final Activity activity;
    private final long currEventType;
    private final boolean showCalDAVCalendars;
    private final boolean showNewEventTypeOption;
    private final boolean addLastUsedOneAsFirstOption;
    private final boolean showOnlyWritable;
    @NotNull
    private final Function1 callback;

    private final void addRadioButton(final EventType eventType) {
        View view = this.activity.getLayoutInflater().inflate(1300185, (ViewGroup)null);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        MyCompatRadioButton var10000 = (MyCompatRadioButton)view.findViewById(id.dialog_radio_button);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.commons.views.MyCompatRadioButton");
        } else {
            Long var10001;
            MyCompatRadioButton var3;
            boolean var9;
            label20: {
                var3 = var10000;
                int var5 = false;
                var3.setText((CharSequence)eventType.getDisplayTitle());
                var10001 = eventType.getId();
                long var6 = this.currEventType;
                if (var10001 != null) {
                    if (var10001 == var6) {
                        var9 = true;
                        break label20;
                    }
                }

                var9 = false;
            }

            var3.setChecked(var9);
            var10001 = eventType.getId();
            Intrinsics.checkNotNull(var10001);
            var3.setId((int)var10001);
            if (eventType.getColor() != 0) {
                ImageView var8 = (ImageView)view.findViewById(id.dialog_radio_color);
                Intrinsics.checkNotNullExpressionValue(var8, "view.dialog_radio_color");
                ImageViewKt.setFillWithStroke$default(var8, eventType.getColor(), ContextKt.getConfig((Context)this.activity).getBackgroundColor(), false, 4, (Object)null);
            }

            view.setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    SelectEventTypeDialog.this.viewClicked(eventType);
                }
            }));
            this.radioGroup.addView(view, (LayoutParams)(new android.widget.RadioGroup.LayoutParams(-1, -2)));
        }
    }

    private final void viewClicked(EventType eventType) {
        if (this.wasInit) {
            Long var10000 = eventType.getId();
            long var2 = this.NEW_EVENT_TYPE_ID;
            if (var10000 != null) {
                if (var10000 == var2) {
                    new EditEventTypeDialog(this.activity, (EventType)null, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke((EventType)var1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull EventType it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            SelectEventTypeDialog.this.getCallback().invoke(it);
                            ActivityKt.hideKeyboard(SelectEventTypeDialog.this.getActivity());
                            AlertDialog var10000 = SelectEventTypeDialog.this.dialog;
                            if (var10000 != null) {
                                var10000.dismiss();
                            }

                        }
                    }), 2, (DefaultConstructorMarker)null);
                    return;
                }
            }

            this.callback.invoke(eventType);
            AlertDialog var4 = this.dialog;
            if (var4 != null) {
                var4.dismiss();
            }

        }
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final long getCurrEventType() {
        return this.currEventType;
    }

    public final boolean getShowCalDAVCalendars() {
        return this.showCalDAVCalendars;
    }

    public final boolean getShowNewEventTypeOption() {
        return this.showNewEventTypeOption;
    }

    public final boolean getAddLastUsedOneAsFirstOption() {
        return this.addLastUsedOneAsFirstOption;
    }

    public final boolean getShowOnlyWritable() {
        return this.showOnlyWritable;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public SelectEventTypeDialog(@NotNull Activity activity, long currEventType, boolean showCalDAVCalendars, boolean showNewEventTypeOption, boolean addLastUsedOneAsFirstOption, boolean showOnlyWritable, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.currEventType = currEventType;
        this.showCalDAVCalendars = showCalDAVCalendars;
        this.showNewEventTypeOption = showNewEventTypeOption;
        this.addLastUsedOneAsFirstOption = addLastUsedOneAsFirstOption;
        this.showOnlyWritable = showOnlyWritable;
        this.callback = callback;
        this.NEW_EVENT_TYPE_ID = -2L;
        this.LAST_USED_EVENT_TYPE_ID = -1L;
        this.eventTypes = new ArrayList();
        View var10000 = this.activity.getLayoutInflater().inflate(1300162, (ViewGroup)null);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } else {
            final ViewGroup view = (ViewGroup)var10000;
            RadioGroup var10001 = (RadioGroup)((View)view).findViewById(id.dialog_radio_group);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.dialog_radio_group");
            this.radioGroup = var10001;
            ContextKt.getEventsHelper((Context)this.activity).getEventTypes(this.activity, this.showOnlyWritable, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((ArrayList)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ArrayList it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SelectEventTypeDialog.this.eventTypes = it;
                    SelectEventTypeDialog.this.getActivity().runOnUiThread((Runnable)(new Runnable() {
                        public final void run() {
                            EventType newEventType;
                            Long var10002;
                            String var10003;
                            if (SelectEventTypeDialog.this.getAddLastUsedOneAsFirstOption()) {
                                var10002 = SelectEventTypeDialog.this.LAST_USED_EVENT_TYPE_ID;
                                var10003 = SelectEventTypeDialog.this.getActivity().getString(1900021);
                                Intrinsics.checkNotNullExpressionValue(var10003, "activity.getString(R.string.last_used_one)");
                                newEventType = new EventType(var10002, var10003, 0, 0, (String)null, (String)null, 48, (DefaultConstructorMarker)null);
                                SelectEventTypeDialog.this.addRadioButton(newEventType);
                            }

                            Iterable $this$forEach$iv = (Iterable)SelectEventTypeDialog.this.eventTypes;
                            int $i$f$forEach = false;
                            Collection destination$iv$iv = (Collection)(new ArrayList());
                            int $i$f$filterTo = false;
                            Iterator var6 = $this$forEach$iv.iterator();

                            while(var6.hasNext()) {
                                Object element$iv$iv = var6.next();
                                EventType itx = (EventType)element$iv$iv;
                                int var9 = false;
                                if (SelectEventTypeDialog.this.getShowCalDAVCalendars() || itx.getCaldavCalendarId() == 0) {
                                    destination$iv$iv.add(element$iv$iv);
                                }
                            }

                            $this$forEach$iv = (Iterable)((List)destination$iv$iv);
                            $i$f$forEach = false;
                            Iterator var3 = $this$forEach$iv.iterator();

                            while(var3.hasNext()) {
                                Object element$iv = var3.next();
                                EventType it = (EventType)element$iv;
                                int var13 = false;
                                SelectEventTypeDialog.this.addRadioButton(it);
                            }

                            if (SelectEventTypeDialog.this.getShowNewEventTypeOption()) {
                                var10002 = SelectEventTypeDialog.this.NEW_EVENT_TYPE_ID;
                                var10003 = SelectEventTypeDialog.this.getActivity().getString(1901048);
                                Intrinsics.checkNotNullExpressionValue(var10003, "activity.getString(R.string.add_new_type)");
                                newEventType = new EventType(var10002, var10003, 0, 0, (String)null, (String)null, 48, (DefaultConstructorMarker)null);
                                SelectEventTypeDialog.this.addRadioButton(newEventType);
                            }

                            SelectEventTypeDialog.this.wasInit = true;
                            Context var10000 = (Context)SelectEventTypeDialog.this.getActivity();
                            ScrollView var10001 = (ScrollView)((View)view).findViewById(id.dialog_radio_holder);
                            Intrinsics.checkNotNullExpressionValue(var10001, "view.dialog_radio_holder");
                            com.simplemobiletools.commons.extensions.ContextKt.updateTextColors$default(var10000, (ViewGroup)var10001, 0, 0, 6, (Object)null);
                        }
                    }));
                }
            }));
            AlertDialog var10 = (new Builder((Context)this.activity)).create();
            int var12 = false;
            Activity var15 = this.activity;
            View var16 = (View)view;
            Intrinsics.checkNotNullExpressionValue(var10, "this");
            ActivityKt.setupDialogStuff$default(var15, var16, var10, 0, (String)null, false, (Function0)null, 60, (Object)null);
            Unit var14 = Unit.INSTANCE;
            this.dialog = var10;
        }
    }

    // $FF: synthetic method
    public static final boolean access$getWasInit$p(SelectEventTypeDialog $this) {
        return $this.wasInit;
    }
}
