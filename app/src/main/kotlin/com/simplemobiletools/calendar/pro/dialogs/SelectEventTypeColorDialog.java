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
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.models.EventType;
import com.simplemobiletools.commons.dialogs.ColorPickerDialog;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.views.MyCompatRadioButton;
import com.simplemobiletools.commons.views.MyTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020\fH\u0002J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0013j\b\u0012\u0004\u0012\u00020\b`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/SelectEventTypeColorDialog;", "", "activity", "Landroid/app/Activity;", "eventType", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "color", "", "(Landroid/app/Activity;Lcom/simplemobiletools/calendar/pro/models/EventType;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "colors", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getEventType", "()Lcom/simplemobiletools/calendar/pro/models/EventType;", "radioGroup", "Landroid/widget/RadioGroup;", "wasInit", "", "addRadioButton", "colorKey", "showCustomColorPicker", "viewClicked", "calendar_debug"}
)
public final class SelectEventTypeColorDialog {
    private final AlertDialog dialog;
    private final RadioGroup radioGroup;
    private boolean wasInit;
    private final ArrayList colors;
    @NotNull
    private final Activity activity;
    @NotNull
    private final EventType eventType;
    @NotNull
    private final Function1 callback;

    private final void addRadioButton(final int colorKey, int color) {
        View view = this.activity.getLayoutInflater().inflate(1300185, (ViewGroup)null);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        MyCompatRadioButton var10000 = (MyCompatRadioButton)view.findViewById(id.dialog_radio_button);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioButton");
        } else {
            RadioButton var4 = (RadioButton)var10000;
            int var6 = false;
            CharSequence var10001;
            if (color == 0) {
                var10001 = (CharSequence)this.activity.getString(1900619);
            } else {
                StringCompanionObject var7 = StringCompanionObject.INSTANCE;
                String var8 = "#%06X";
                Object[] var9 = new Object[]{16777215 & color};
                String var11 = String.format(var8, Arrays.copyOf(var9, var9.length));
                Intrinsics.checkNotNullExpressionValue(var11, "java.lang.String.format(format, *args)");
                var10001 = (CharSequence)var11;
            }

            var4.setText(var10001);
            var4.setChecked(color == this.eventType.getColor());
            var4.setId(colorKey);
            ImageView var10 = (ImageView)view.findViewById(id.dialog_radio_color);
            Intrinsics.checkNotNullExpressionValue(var10, "view.dialog_radio_color");
            ImageViewKt.setFillWithStroke$default(var10, color, ContextKt.getConfig((Context)this.activity).getBackgroundColor(), false, 4, (Object)null);
            view.setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    SelectEventTypeColorDialog.this.viewClicked(colorKey);
                }
            }));
            this.radioGroup.addView(view, (LayoutParams)(new android.widget.RadioGroup.LayoutParams(-1, -2)));
        }
    }

    private final void viewClicked(int colorKey) {
        if (this.wasInit) {
            Function1 var10000 = this.callback;
            Object var10001 = this.colors.get(colorKey);
            Intrinsics.checkNotNullExpressionValue(var10001, "colors[colorKey]");
            var10000.invoke(var10001);
            AlertDialog var2 = this.dialog;
            if (var2 != null) {
                var2.dismiss();
            }

        }
    }

    private final void showCustomColorPicker() {
        new ColorPickerDialog(this.activity, this.eventType.getColor(), false, false, (Function1)null, (Function2)(new Function2() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1, Object var2) {
                this.invoke((Boolean)var1, ((Number)var2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean wasPositivePressed, int color) {
                if (wasPositivePressed) {
                    SelectEventTypeColorDialog.this.getCallback().invoke(color);
                }

                AlertDialog var10000 = SelectEventTypeColorDialog.this.dialog;
                if (var10000 != null) {
                    var10000.dismiss();
                }

            }
        }), 28, (DefaultConstructorMarker)null);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public SelectEventTypeColorDialog(@NotNull Activity activity, @NotNull EventType eventType, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.eventType = eventType;
        this.callback = callback;
        this.colors = ContextKt.getCalDAVHelper((Context)this.activity).getAvailableCalDAVCalendarColors(this.eventType);
        View var10000 = this.activity.getLayoutInflater().inflate(1300132, (ViewGroup)null);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } else {
            ViewGroup view = (ViewGroup)var10000;
            RadioGroup var10001 = (RadioGroup)((View)view).findViewById(id.dialog_select_event_type_color_radio);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.dialog_select_event_type_color_radio");
            this.radioGroup = var10001;
            ((MyTextView)((View)view).findViewById(id.dialog_select_event_type_other_value)).setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    SelectEventTypeColorDialog.this.showCustomColorPicker();
                }
            }));
            Iterable $this$forEachIndexed$iv = (Iterable)this.colors;
            int $i$f$forEachIndexed = false;
            int index$iv = 0;
            Iterator var8 = $this$forEachIndexed$iv.iterator();

            while(var8.hasNext()) {
                Object item$iv = var8.next();
                int var10 = index$iv++;
                boolean var11 = false;
                if (var10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }

                int value = ((Number)item$iv).intValue();
                int var14 = false;
                this.addRadioButton(var10, value);
            }

            this.wasInit = true;
            AlertDialog var17 = (new Builder((Context)this.activity)).create();
            int var18 = false;
            Activity var20 = this.activity;
            View var21 = (View)view;
            Intrinsics.checkNotNullExpressionValue(var17, "this");
            ActivityKt.setupDialogStuff$default(var20, var21, var17, 0, (String)null, false, (Function0)null, 60, (Object)null);
            if (this.colors.isEmpty()) {
                this.showCustomColorPicker();
            }

            Unit var16 = Unit.INSTANCE;
            this.dialog = var17;
        }
    }
}
