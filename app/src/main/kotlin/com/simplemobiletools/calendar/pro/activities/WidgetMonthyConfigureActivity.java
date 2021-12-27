// WidgetMonthlyConfigureActivity$updateDays$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.activities;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/activities/WidgetMonthlyConfigureActivity$updateDays$2$1"}
)
final class WidgetMonthlyConfigureActivity$updateDays$$inlined$apply$lambda$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final WidgetMonthlyConfigureActivity this$0;
    // $FF: synthetic field
    final int $i$inlined;
    // $FF: synthetic field
    final int $dividerMargin$inlined;

    WidgetMonthlyConfigureActivity$updateDays$$inlined$apply$lambda$1(WidgetMonthlyConfigureActivity var1, int var2, int var3) {
        super(1);
        this.this$0 = var1;
        this.$i$inlined = var2;
        this.$dividerMargin$inlined = var3;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke(((Number)var1).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int it) {
        WidgetMonthlyConfigureActivity.access$setDayLabelHeight$p(this.this$0, it);
    }
}
// WidgetMonthlyConfigureActivity.java
package com.simplemobiletools.calendar.pro.activities;

    import android.app.Activity;
    import android.content.Context;
    import android.content.Intent;
    import android.content.res.Resources;
    import android.graphics.Color;
    import android.graphics.drawable.Drawable;
    import android.net.Uri;
    import android.os.Bundle;
    import android.view.View;
    import android.view.Window;
    import android.view.View.OnClickListener;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.LinearLayout;
    import android.widget.SeekBar;
    import android.widget.TextView;
    import android.widget.SeekBar.OnSeekBarChangeListener;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.calendar.pro.helpers.Config;
    import com.simplemobiletools.calendar.pro.helpers.ConstantsKt;
    import com.simplemobiletools.calendar.pro.helpers.MonthlyCalendarImpl;
    import com.simplemobiletools.calendar.pro.helpers.MyWidgetMonthlyProvider;
    import com.simplemobiletools.calendar.pro.interfaces.MonthlyCalendar;
    import com.simplemobiletools.calendar.pro.models.DayMonthly;
    import com.simplemobiletools.commons.dialogs.ColorPickerDialog;
    import com.simplemobiletools.commons.extensions.DrawableKt;
    import com.simplemobiletools.commons.extensions.ImageViewKt;
    import com.simplemobiletools.commons.extensions.IntKt;
    import com.simplemobiletools.commons.extensions.ViewKt;
    import com.simplemobiletools.commons.views.MySeekBar;
    import com.simplemobiletools.commons.views.MyTextView;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.functions.Function2;
    import kotlin.jvm.internal.DefaultConstructorMarker;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;
    import org.jetbrains.annotations.Nullable;
    import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J@\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000f0-j\b\u0012\u0004\u0012\u00020\u000f`.2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u000201H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/WidgetMonthlyConfigureActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "Lcom/simplemobiletools/calendar/pro/interfaces/MonthlyCalendar;", "()V", "bgSeekbarChangeListener", "com/simplemobiletools/calendar/pro/activities/WidgetMonthlyConfigureActivity$bgSeekbarChangeListener$1", "Lcom/simplemobiletools/calendar/pro/activities/WidgetMonthlyConfigureActivity$bgSeekbarChangeListener$1;", "dayLabelHeight", "", "mBgAlpha", "", "mBgColor", "mBgColorWithoutTransparency", "mDays", "", "Lcom/simplemobiletools/calendar/pro/models/DayMonthly;", "mHighlightWeekends", "", "mPrimaryColor", "mTextColor", "mTextColorWithoutTransparency", "mWeakTextColor", "mWeekendsTextColor", "mWidgetId", "initVariables", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "pickBackgroundColor", "pickTextColor", "requestWidgetUpdate", "saveConfig", "storeWidgetColors", "updateBgColor", "updateColors", "updateDays", "updateLabels", "updateMonthlyCalendar", "context", "Landroid/content/Context;", "month", "", "days", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "checkedEvents", "currTargetDate", "Lorg/joda/time/DateTime;", "calendar_debug"}
)
public final class WidgetMonthlyConfigureActivity extends SimpleActivity implements MonthlyCalendar {
    private List mDays;
    private int dayLabelHeight;
    private float mBgAlpha;
    private int mWidgetId;
    private int mBgColorWithoutTransparency;
    private int mBgColor;
    private int mTextColorWithoutTransparency;
    private int mTextColor;
    private int mWeakTextColor;
    private int mPrimaryColor;
    private int mWeekendsTextColor;
    private boolean mHighlightWeekends;
    private final <undefinedtype> bgSeekbarChangeListener = new OnSeekBarChangeListener() {
        public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            WidgetMonthlyConfigureActivity.this.mBgAlpha = (float)progress / (float)100;
            WidgetMonthlyConfigureActivity.this.updateBgColor();
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
        this.setContentView(1300149);
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
                WidgetMonthlyConfigureActivity.this.saveConfig();
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.config_bg_color)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetMonthlyConfigureActivity.this.pickBackgroundColor();
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.config_text_color)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetMonthlyConfigureActivity.this.pickTextColor();
            }
        }));
        ((MySeekBar)this._$_findCachedViewById(id.config_bg_seekbar)).setColors(this.mTextColor, this.mPrimaryColor, this.mPrimaryColor);
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
        MonthlyCalendar var10002 = (MonthlyCalendar)this;
        Context var10003 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(var10003, "applicationContext");
        MonthlyCalendarImpl var1 = new MonthlyCalendarImpl(var10002, var10003);
        DateTime var10001 = (new DateTime()).withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(var10001, "DateTime().withDayOfMonth(1)");
        var1.updateMonthlyCalendar(var10001);
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
                    WidgetMonthlyConfigureActivity.this.mBgColorWithoutTransparency = color;
                    WidgetMonthlyConfigureActivity.this.updateBgColor();
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
                    WidgetMonthlyConfigureActivity.this.mTextColorWithoutTransparency = color;
                    WidgetMonthlyConfigureActivity.this.updateColors();
                    WidgetMonthlyConfigureActivity.this.updateDays();
                }

            }
        }), 28, (DefaultConstructorMarker)null);
    }

    private final void requestWidgetUpdate() {
        Intent var1 = new Intent("android.appwidget.action.APPWIDGET_UPDATE", (Uri)null, (Context)this, MyWidgetMonthlyProvider.class);
        int var3 = false;
        var1.putExtra("appWidgetIds", new int[]{this.mWidgetId});
        this.sendBroadcast(var1);
    }

    private final void updateColors() {
        this.mTextColor = this.mTextColorWithoutTransparency;
        this.mWeakTextColor = IntKt.adjustAlpha(this.mTextColorWithoutTransparency, 0.25F);
        this.mPrimaryColor = ContextKt.getConfig(this).getPrimaryColor();
        this.mWeekendsTextColor = ContextKt.getConfig(this).getHighlightWeekendsColor();
        this.mHighlightWeekends = ContextKt.getConfig(this).getHighlightWeekends();
        ImageView var10000 = (ImageView)this._$_findCachedViewById(id.top_left_arrow);
        Intrinsics.checkNotNullExpressionValue(var10000, "top_left_arrow");
        ImageViewKt.applyColorFilter(var10000, this.mTextColor);
        var10000 = (ImageView)this._$_findCachedViewById(id.top_right_arrow);
        Intrinsics.checkNotNullExpressionValue(var10000, "top_right_arrow");
        ImageViewKt.applyColorFilter(var10000, this.mTextColor);
        ((MyTextView)this._$_findCachedViewById(id.top_value)).setTextColor(this.mTextColor);
        var10000 = (ImageView)this._$_findCachedViewById(id.config_text_color);
        Intrinsics.checkNotNullExpressionValue(var10000, "config_text_color");
        ImageViewKt.setFillWithStroke$default(var10000, this.mTextColor, -16777216, false, 4, (Object)null);
        ((Button)this._$_findCachedViewById(id.config_save)).setTextColor(this.mTextColor);
        this.updateLabels();
    }

    private final void updateBgColor() {
        this.mBgColor = IntKt.adjustAlpha(this.mBgColorWithoutTransparency, this.mBgAlpha);
        View var10000 = this._$_findCachedViewById(id.config_calendar);
        Intrinsics.checkNotNullExpressionValue(var10000, "config_calendar");
        Drawable var1 = var10000.getBackground();
        Intrinsics.checkNotNullExpressionValue(var1, "config_calendar.background");
        DrawableKt.applyColorFilter(var1, this.mBgColor);
        ImageView var2 = (ImageView)this._$_findCachedViewById(id.config_bg_color);
        Intrinsics.checkNotNullExpressionValue(var2, "config_bg_color");
        ImageViewKt.setFillWithStroke$default(var2, this.mBgColor, -16777216, false, 4, (Object)null);
        ((Button)this._$_findCachedViewById(id.config_save)).setBackgroundColor(this.mBgColor);
    }

    private final void updateDays() {
        List var10000 = this.mDays;
        Intrinsics.checkNotNull(var10000);
        int len = var10000.size();
        Context var14 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(var14, "applicationContext");
        int dividerMargin;
        if (ContextKt.getConfig(var14).getShowWeekNumbers()) {
            ((MyTextView)this._$_findCachedViewById(id.week_num)).setTextColor(this.mTextColor);
            MyTextView var15 = (MyTextView)this._$_findCachedViewById(id.week_num);
            Intrinsics.checkNotNullExpressionValue(var15, "week_num");
            ViewKt.beVisible((View)var15);
            dividerMargin = 0;

            for(byte var3 = 5; dividerMargin <= var3; ++dividerMargin) {
                View var4 = this.findViewById(this.getResources().getIdentifier("week_num_" + dividerMargin, "id", this.getPackageName()));
                TextView $this$apply = (TextView)var4;
                int var6 = false;
                StringBuilder var10001 = new StringBuilder();
                List var10002 = this.mDays;
                Intrinsics.checkNotNull(var10002);
                $this$apply.setText((CharSequence)var10001.append(((DayMonthly)var10002.get(dividerMargin * 7 + 3)).getWeekOfYear()).append(':').toString());
                $this$apply.setTextColor(this.mTextColor);
                ViewKt.beVisible((View)$this$apply);
            }
        }

        Resources var16 = this.getResources();
        Intrinsics.checkNotNullExpressionValue(var16, "resources");
        dividerMargin = (int)var16.getDisplayMetrics().density;
        int i = 0;

        for(int var11 = len; i < var11; ++i) {
            View var12 = this.findViewById(this.getResources().getIdentifier("day_" + i, "id", this.getPackageName()));
            LinearLayout $this$apply = (LinearLayout)var12;
            int var7 = false;
            var10000 = this.mDays;
            Intrinsics.checkNotNull(var10000);
            DayMonthly day = (DayMonthly)var10000.get(i);
            $this$apply.removeAllViews();
            int dayTextColor = ContextKt.getConfig(this).getHighlightWeekends() && day.isWeekend() ? ContextKt.getConfig(this).getHighlightWeekendsColor() : this.mTextColor;
            var14 = $this$apply.getContext();
            Intrinsics.checkNotNullExpressionValue(var14, "context");
            Intrinsics.checkNotNullExpressionValue($this$apply, "this");
            ContextKt.addDayNumber(var14, dayTextColor, day, $this$apply, this.dayLabelHeight, (Function1)(new WidgetMonthlyConfigureActivity$updateDays$$inlined$apply$lambda$1(this, i, dividerMargin)));
            var14 = $this$apply.getContext();
            Intrinsics.checkNotNullExpressionValue(var14, "context");
            Resources var10003 = $this$apply.getResources();
            Intrinsics.checkNotNullExpressionValue(var10003, "resources");
            ContextKt.addDayEvents(var14, day, $this$apply, var10003, dividerMargin);
        }

    }

    public void updateMonthlyCalendar(@NotNull Context context, @NotNull final String month, @NotNull final ArrayList days, boolean checkedEvents, @NotNull DateTime currTargetDate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(days, "days");
        Intrinsics.checkNotNullParameter(currTargetDate, "currTargetDate");
        this.runOnUiThread((Runnable)(new Runnable() {
            public final void run() {
                WidgetMonthlyConfigureActivity.this.mDays = (List)days;
                MyTextView var10000 = (MyTextView)WidgetMonthlyConfigureActivity.this._$_findCachedViewById(id.top_value);
                Intrinsics.checkNotNullExpressionValue(var10000, "top_value");
                var10000.setText((CharSequence)month);
                WidgetMonthlyConfigureActivity.this.updateDays();
            }
        }));
    }

    private final void updateLabels() {
        int i = 0;

        for(byte var2 = 6; i <= var2; ++i) {
            View var3 = this.findViewById(this.getResources().getIdentifier("label_" + i, "id", this.getPackageName()));
            TextView $this$apply = (TextView)var3;
            int var5 = false;
            int textColor = ContextKt.getConfig(this).getHighlightWeekends() && ConstantsKt.isWeekend(i, ContextKt.getConfig(this).isSundayFirst()) ? this.mWeekendsTextColor : this.mTextColor;
            $this$apply.setTextColor(textColor);
        }

    }

    // $FF: synthetic method
    public static final int access$getMBgColorWithoutTransparency$p(WidgetMonthlyConfigureActivity $this) {
        return $this.mBgColorWithoutTransparency;
    }

    // $FF: synthetic method
    public static final int access$getMTextColorWithoutTransparency$p(WidgetMonthlyConfigureActivity $this) {
        return $this.mTextColorWithoutTransparency;
    }

    // $FF: synthetic method
    public static final int access$getDayLabelHeight$p(WidgetMonthlyConfigureActivity $this) {
        return $this.dayLabelHeight;
    }

    // $FF: synthetic method
    public static final void access$setDayLabelHeight$p(WidgetMonthlyConfigureActivity $this, int var1) {
        $this.dayLabelHeight = var1;
    }

    // $FF: synthetic method
    public static final List access$getMDays$p(WidgetMonthlyConfigureActivity $this) {
        return $this.mDays;
    }

    // $FF: synthetic method
    public static final float access$getMBgAlpha$p(WidgetMonthlyConfigureActivity $this) {
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
