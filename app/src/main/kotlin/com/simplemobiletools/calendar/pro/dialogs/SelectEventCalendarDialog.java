package com.simplemobiletools.calendar.pro.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.models.CalDAVCalendar;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import com.simplemobiletools.commons.views.MyCompatRadioButton;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001BF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0002\u0010\u000fJ \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R,\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/SelectEventCalendarDialog;", "", "activity", "Landroid/app/Activity;", "calendars", "", "Lcom/simplemobiletools/calendar/pro/models/CalDAVCalendar;", "currCalendarId", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "id", "", "(Landroid/app/Activity;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCalendars", "()Ljava/util/List;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getCurrCalendarId", "()I", "dialog", "Landroidx/appcompat/app/AlertDialog;", "radioGroup", "Landroid/widget/RadioGroup;", "wasInit", "", "addRadioButton", "title", "", "typeId", "color", "viewClicked", "calendar_debug"}
)
public final class SelectEventCalendarDialog {
    private final AlertDialog dialog;
    private final RadioGroup radioGroup;
    private boolean wasInit;
    @NotNull
    private final Activity activity;
    @NotNull
    private final List calendars;
    private final int currCalendarId;
    @NotNull
    private final Function1 callback;

    private final void addRadioButton(String title, final int typeId, int color) {
        View view = this.activity.getLayoutInflater().inflate(1300185, (ViewGroup)null);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        MyCompatRadioButton var10000 = (MyCompatRadioButton)view.findViewById(id.dialog_radio_button);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioButton");
        } else {
            RadioButton var5 = (RadioButton)var10000;
            int var7 = false;
            var5.setText((CharSequence)title);
            var5.setChecked(typeId == this.currCalendarId);
            var5.setId(typeId);
            if (typeId != 0) {
                ImageView var8 = (ImageView)view.findViewById(id.dialog_radio_color);
                Intrinsics.checkNotNullExpressionValue(var8, "view.dialog_radio_color");
                ImageViewKt.setFillWithStroke$default(var8, color, ContextKt.getConfig((Context)this.activity).getBackgroundColor(), false, 4, (Object)null);
            }

            view.setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    SelectEventCalendarDialog.this.viewClicked(typeId);
                }
            }));
            this.radioGroup.addView(view, (LayoutParams)(new android.widget.RadioGroup.LayoutParams(-1, -2)));
        }
    }

    private final void viewClicked(int typeId) {
        if (this.wasInit) {
            this.callback.invoke(typeId);
            AlertDialog var10000 = this.dialog;
            if (var10000 != null) {
                var10000.dismiss();
            }
        }

    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final List getCalendars() {
        return this.calendars;
    }

    public final int getCurrCalendarId() {
        return this.currCalendarId;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public SelectEventCalendarDialog(@NotNull Activity activity, @NotNull List calendars, int currCalendarId, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(calendars, "calendars");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.calendars = calendars;
        this.currCalendarId = currCalendarId;
        this.callback = callback;
        View var10000 = this.activity.getLayoutInflater().inflate(1300162, (ViewGroup)null);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } else {
            final ViewGroup view = (ViewGroup)var10000;
            RadioGroup var10001 = (RadioGroup)((View)view).findViewById(id.dialog_radio_group);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.dialog_radio_group");
            this.radioGroup = var10001;
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    Iterable $this$forEach$iv = (Iterable)SelectEventCalendarDialog.this.getCalendars();
                    int $i$f$forEach = false;
                    Iterator var3 = $this$forEach$iv.iterator();

                    while(var3.hasNext()) {
                        Object element$iv = var3.next();
                        CalDAVCalendar it = (CalDAVCalendar)element$iv;
                        int var6 = false;
                        EventType localEventType = ContextKt.getEventsHelper((Context)SelectEventCalendarDialog.this.getActivity()).getEventTypeWithCalDAVCalendarId(it.getId());
                        if (localEventType != null) {
                            it.setColor(localEventType.getColor());
                        }
                    }

                    SelectEventCalendarDialog.this.getActivity().runOnUiThread((Runnable)(new Runnable() {
                        public final void run() {
                            Iterable $this$forEach$iv = (Iterable)SelectEventCalendarDialog.this.getCalendars();
                            int $i$f$forEach = false;
                            Iterator var3 = $this$forEach$iv.iterator();

                            while(var3.hasNext()) {
                                Object element$iv = var3.next();
                                CalDAVCalendar it = (CalDAVCalendar)element$iv;
                                int var6 = false;
                                SelectEventCalendarDialog.this.addRadioButton(it.getFullTitle(), it.getId(), it.getColor());
                            }

                            SelectEventCalendarDialog var10000 = SelectEventCalendarDialog.this;
                            String var10001 = SelectEventCalendarDialog.this.getActivity().getString(1900563);
                            Intrinsics.checkNotNullExpressionValue(var10001, "activity.getString(R.string.store_locally_only)");
                            var10000.addRadioButton(var10001, 0, 0);
                            SelectEventCalendarDialog.this.wasInit = true;
                            Context var7 = (Context)SelectEventCalendarDialog.this.getActivity();
                            ScrollView var8 = (ScrollView)((View)view).findViewById(id.dialog_radio_holder);
                            Intrinsics.checkNotNullExpressionValue(var8, "view.dialog_radio_holder");
                            com.simplemobiletools.commons.extensions.ContextKt.updateTextColors$default(var7, (ViewGroup)var8, 0, 0, 6, (Object)null);
                        }
                    }));
                }
            }));
            AlertDialog var6 = (new Builder((Context)this.activity)).create();
            int var8 = false;
            Activity var11 = this.activity;
            View var12 = (View)view;
            Intrinsics.checkNotNullExpressionValue(var6, "this");
            ActivityKt.setupDialogStuff$default(var11, var12, var6, 0, (String)null, false, (Function0)null, 60, (Object)null);
            Unit var10 = Unit.INSTANCE;
            this.dialog = var6;
        }
    }

    // $FF: synthetic method
    public static final boolean access$getWasInit$p(SelectEventCalendarDialog $this) {
        return $this.wasInit;
    }
}
