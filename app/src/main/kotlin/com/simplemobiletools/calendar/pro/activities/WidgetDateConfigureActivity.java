package com.simplemobiletools.calendar.pro.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.helpers.Config;
import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.calendar.pro.helpers.MyWidgetDateProvider;
import com.simplemobiletools.commons.dialogs.ColorPickerDialog;
import com.simplemobiletools.commons.extensions.DrawableKt;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.extensions.IntKt;
import com.simplemobiletools.commons.views.MySeekBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/WidgetDateConfigureActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "()V", "bgSeekbarChangeListener", "com/simplemobiletools/calendar/pro/activities/WidgetDateConfigureActivity$bgSeekbarChangeListener$1", "Lcom/simplemobiletools/calendar/pro/activities/WidgetDateConfigureActivity$bgSeekbarChangeListener$1;", "mBgAlpha", "", "mBgColor", "", "mBgColorWithoutTransparency", "mPrimaryColor", "mTextColor", "mTextColorWithoutTransparency", "mWeakTextColor", "mWidgetId", "initVariables", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "pickBackgroundColor", "pickTextColor", "requestWidgetUpdate", "saveConfig", "storeWidgetColors", "updateBgColor", "updateColors", "calendar_debug"}
)
public final class WidgetDateConfigureActivity extends SimpleActivity {
    private float mBgAlpha;
    private int mWidgetId;
    private int mBgColorWithoutTransparency;
    private int mBgColor;
    private int mTextColorWithoutTransparency;
    private int mTextColor;
    private int mWeakTextColor;
    private int mPrimaryColor;
    private final <undefinedtype> bgSeekbarChangeListener = new OnSeekBarChangeListener() {
        public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            WidgetDateConfigureActivity.this.mBgAlpha = (float)progress / (float)100;
            WidgetDateConfigureActivity.this.updateBgColor();
        }

        public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }
    };
    private HashMap _$_findViewCache;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.setUseDynamicTheme(false);
        super.onCreate(savedInstanceState);
        this.setResult(0);
        this.setContentView(1300069);
        this.initVariables();
        Intent var10000 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(var10000, "intent");
        Bundle extras = var10000.getExtras();
        if (extras != null) {
            this.mWidgetId = extras.getInt("appWidgetId", 0);
        }

        if (this.mWidgetId == 0) {
            this.finish();
        }

        ((Button)this._$_findCachedViewById(id.config_save)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetDateConfigureActivity.this.saveConfig();
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.config_bg_color)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetDateConfigureActivity.this.pickBackgroundColor();
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.config_text_color)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetDateConfigureActivity.this.pickTextColor();
            }
        }));
        ((MySeekBar)this._$_findCachedViewById(id.config_bg_seekbar)).setColors(this.mTextColor, this.mPrimaryColor, this.mPrimaryColor);
        TextView var3 = (TextView)this._$_findCachedViewById(id.widget_date_label);
        Intrinsics.checkNotNullExpressionValue(var3, "widget_date_label");
        var3.setText((CharSequence)Formatter.INSTANCE.getTodayDayNumber());
        var3 = (TextView)this._$_findCachedViewById(id.widget_month_label);
        Intrinsics.checkNotNullExpressionValue(var3, "widget_month_label");
        var3.setText((CharSequence)Formatter.INSTANCE.getCurrentMonthShort());
    }

    protected void onResume() {
        super.onResume();
        Window var10000 = this.getWindow();
        Intrinsics.checkNotNullExpressionValue(var10000, "window");
        var10000.getDecorView().setBackgroundColor(0);
    }

    private final void initVariables() {
        this.mTextColorWithoutTransparency = ContextKt.getConfig(this).getWidgetTextColor();
        this.updateColors();
        this.mBgColor = ContextKt.getConfig(this).getWidgetBgColor();
        this.mBgAlpha = (float)Color.alpha(this.mBgColor) / (float)255;
        this.mBgColorWithoutTransparency = Color.rgb(Color.red(this.mBgColor), Color.green(this.mBgColor), Color.blue(this.mBgColor));
        ((MySeekBar)this._$_findCachedViewById(id.config_bg_seekbar)).setOnSeekBarChangeListener((OnSeekBarChangeListener)this.bgSeekbarChangeListener);
        MySeekBar var10000 = (MySeekBar)this._$_findCachedViewById(id.config_bg_seekbar);
        Intrinsics.checkNotNullExpressionValue(var10000, "config_bg_seekbar");
        var10000.setProgress((int)(this.mBgAlpha * (float)100));
        this.updateBgColor();
    }

    private final void saveConfig() {
        this.storeWidgetColors();
        this.requestWidgetUpdate();
        Intent var1 = new Intent();
        int var3 = false;
        var1.putExtra("appWidgetId", this.mWidgetId);
        this.setResult(-1, var1);
        this.finish();
    }

    private final void storeWidgetColors() {
        Config var1 = ContextKt.getConfig(this);
        int var3 = false;
        var1.setWidgetBgColor(this.mBgColor);
        var1.setWidgetTextColor(this.mTextColorWithoutTransparency);
    }

    private final void pickBackgroundColor() {
        new ColorPickerDialog((Activity)this, this.mBgColorWithoutTransparency, false, false, (Function1)null, (Function2)(new Function2() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1, Object var2) {
                this.invoke((Boolean)var1, ((Number)var2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean wasPositivePressed, int color) {
                if (wasPositivePressed) {
                    WidgetDateConfigureActivity.this.mBgColorWithoutTransparency = color;
                    WidgetDateConfigureActivity.this.updateBgColor();
                }

            }
        }), 28, (DefaultConstructorMarker)null);
    }

    private final void pickTextColor() {
        new ColorPickerDialog((Activity)this, this.mTextColor, false, false, (Function1)null, (Function2)(new Function2() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1, Object var2) {
                this.invoke((Boolean)var1, ((Number)var2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean wasPositivePressed, int color) {
                if (wasPositivePressed) {
                    WidgetDateConfigureActivity.this.mTextColorWithoutTransparency = color;
                    WidgetDateConfigureActivity.this.updateColors();
                }

            }
        }), 28, (DefaultConstructorMarker)null);
    }

    private final void requestWidgetUpdate() {
        Intent var1 = new Intent("android.appwidget.action.APPWIDGET_UPDATE", (Uri)null, (Context)this, MyWidgetDateProvider.class);
        int var3 = false;
        var1.putExtra("appWidgetIds", new int[]{this.mWidgetId});
        this.sendBroadcast(var1);
    }

    private final void updateColors() {
        this.mTextColor = this.mTextColorWithoutTransparency;
        this.mWeakTextColor = IntKt.adjustAlpha(this.mTextColorWithoutTransparency, 0.25F);
        this.mPrimaryColor = ContextKt.getConfig(this).getPrimaryColor();
        ImageView var10000 = (ImageView)this._$_findCachedViewById(id.config_text_color);
        Intrinsics.checkNotNullExpressionValue(var10000, "config_text_color");
        ImageViewKt.setFillWithStroke$default(var10000, this.mTextColor, -16777216, false, 4, (Object)null);
        ((Button)this._$_findCachedViewById(id.config_save)).setTextColor(this.mTextColor);
        ((TextView)this._$_findCachedViewById(id.widget_date_label)).setTextColor(this.mTextColor);
        ((TextView)this._$_findCachedViewById(id.widget_month_label)).setTextColor(this.mTextColor);
    }

    private final void updateBgColor() {
        this.mBgColor = IntKt.adjustAlpha(this.mBgColorWithoutTransparency, this.mBgAlpha);
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.config_date_time_wrapper);
        Intrinsics.checkNotNullExpressionValue(var10000, "config_date_time_wrapper");
        Drawable var1 = var10000.getBackground();
        Intrinsics.checkNotNullExpressionValue(var1, "config_date_time_wrapper.background");
        DrawableKt.applyColorFilter(var1, this.mBgColor);
        ImageView var2 = (ImageView)this._$_findCachedViewById(id.config_bg_color);
        Intrinsics.checkNotNullExpressionValue(var2, "config_bg_color");
        ImageViewKt.setFillWithStroke$default(var2, this.mBgColor, -16777216, false, 4, (Object)null);
        ((Button)this._$_findCachedViewById(id.config_save)).setBackgroundColor(this.mBgColor);
    }

    // $FF: synthetic method
    public static final int access$getMBgColorWithoutTransparency$p(WidgetDateConfigureActivity $this) {
        return $this.mBgColorWithoutTransparency;
    }

    // $FF: synthetic method
    public static final int access$getMTextColorWithoutTransparency$p(WidgetDateConfigureActivity $this) {
        return $this.mTextColorWithoutTransparency;
    }

    // $FF: synthetic method
    public static final float access$getMBgAlpha$p(WidgetDateConfigureActivity $this) {
        return $this.mBgAlpha;
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}
