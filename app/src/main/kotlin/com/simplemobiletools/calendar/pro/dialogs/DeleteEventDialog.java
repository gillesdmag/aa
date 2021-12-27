package com.simplemobiletools.calendar.pro.dialogs;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.commons.extensions.ActivityKt;
import com.simplemobiletools.commons.extensions.ViewKt;
import com.simplemobiletools.commons.views.MyTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R,\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/dialogs/DeleteEventDialog;", "", "activity", "Landroid/app/Activity;", "eventIds", "", "", "hasRepeatableEvent", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "deleteRule", "", "(Landroid/app/Activity;Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "dialogConfirmed", "view", "Landroid/view/ViewGroup;", "calendar_debug"}
)
public final class DeleteEventDialog {
    @Nullable
    private final AlertDialog dialog;
    @NotNull
    private final Activity activity;
    @NotNull
    private final Function1 callback;

    @Nullable
    public final AlertDialog getDialog() {
        return this.dialog;
    }

    private final void dialogConfirmed(ViewGroup view) {
        RadioGroup var10000 = (RadioGroup)((View)view).findViewById(id.delete_event_radio_view);
        Intrinsics.checkNotNullExpressionValue(var10000, "view.delete_event_radio_view");
        byte var3;
        switch(var10000.getCheckedRadioButtonId()) {
            case 1000151:
                var3 = 1;
                break;
            case 1000558:
                var3 = 2;
                break;
            default:
                var3 = 0;
        }

        int deleteRule = var3;
        AlertDialog var4 = this.dialog;
        if (var4 != null) {
            var4.dismiss();
        }

        this.callback.invoke(Integer.valueOf(deleteRule));
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Function1 getCallback() {
        return this.callback;
    }

    public DeleteEventDialog(@NotNull Activity activity, @NotNull List eventIds, boolean hasRepeatableEvent, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super();
        this.activity = activity;
        this.callback = callback;
        final View var6 = this.activity.getLayoutInflater().inflate(1300140, (ViewGroup)null);
        int var8 = false;
        MyTextView var10000 = (MyTextView)var6.findViewById(id.delete_event_repeat_description);
        Intrinsics.checkNotNullExpressionValue(var10000, "delete_event_repeat_description");
        ViewKt.beVisibleIf((View)var10000, hasRepeatableEvent);
        RadioGroup var12 = (RadioGroup)var6.findViewById(id.delete_event_radio_view);
        Intrinsics.checkNotNullExpressionValue(var12, "delete_event_radio_view");
        ViewKt.beVisibleIf((View)var12, hasRepeatableEvent);
        if (!hasRepeatableEvent) {
            ((RadioGroup)var6.findViewById(id.delete_event_radio_view)).check(1000558);
        }

        if (eventIds.size() > 1) {
            var10000 = (MyTextView)var6.findViewById(id.delete_event_repeat_description);
            Intrinsics.checkNotNullExpressionValue(var10000, "delete_event_repeat_description");
            var10000.setText((CharSequence)var6.getResources().getString(1900888));
        }

        View view = var6;
        AlertDialog var11 = (new Builder((Context)this.activity)).setPositiveButton(1900396, (OnClickListener)(new OnClickListener() {
            public final void onClick(DialogInterface dialog, int which) {
                DeleteEventDialog var10000 = DeleteEventDialog.this;
                View var10001 = var6;
                if (var10001 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } else {
                    var10000.dialogConfirmed((ViewGroup)var10001);
                }
            }
        })).setNegativeButton(1900818, (OnClickListener)null).create();
        var8 = false;
        Activity var13 = this.activity;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        Intrinsics.checkNotNullExpressionValue(var11, "this");
        ActivityKt.setupDialogStuff$default(var13, view, var11, 0, (String)null, false, (Function0)null, 60, (Object)null);
        Unit var10 = Unit.INSTANCE;
        this.dialog = var11;
    }
}
