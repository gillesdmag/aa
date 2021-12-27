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
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.adapters.EventListAdapter;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
import com.simplemobiletools.calendar.pro.helpers.Config;
import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.calendar.pro.helpers.MyWidgetListProvider;
import com.simplemobiletools.calendar.pro.models.ListEvent;
import com.simplemobiletools.calendar.pro.models.ListSectionDay;
import com.simplemobiletools.commons.dialogs.ColorPickerDialog;
import com.simplemobiletools.commons.extensions.DrawableKt;
import com.simplemobiletools.commons.extensions.ImageViewKt;
import com.simplemobiletools.commons.extensions.IntKt;
import com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener;
import com.simplemobiletools.commons.views.MyRecyclerView;
import com.simplemobiletools.commons.views.MySeekBar;
import java.util.ArrayList;
import java.util.HashMap;
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
    d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/WidgetListConfigureActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "()V", "bgSeekbarChangeListener", "com/simplemobiletools/calendar/pro/activities/WidgetListConfigureActivity$bgSeekbarChangeListener$1", "Lcom/simplemobiletools/calendar/pro/activities/WidgetListConfigureActivity$bgSeekbarChangeListener$1;", "mBgAlpha", "", "mBgColor", "", "mBgColorWithoutTransparency", "mTextColor", "mTextColorWithoutTransparency", "mWidgetId", "getListItems", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/ListItem;", "initVariables", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "pickBackgroundColor", "pickTextColor", "requestWidgetUpdate", "saveConfig", "storeWidgetColors", "updateBgColor", "updateColors", "calendar_debug"}
)
public final class WidgetListConfigureActivity extends SimpleActivity {
    private float mBgAlpha;
    private int mWidgetId;
    private int mBgColorWithoutTransparency;
    private int mBgColor;
    private int mTextColorWithoutTransparency;
    private int mTextColor;
    private final <undefinedtype> bgSeekbarChangeListener = new OnSeekBarChangeListener() {
        public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            WidgetListConfigureActivity.this.mBgAlpha = (float)progress / (float)100;
            WidgetListConfigureActivity.this.updateBgColor();
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
        this.setContentView(1300180);
        this.initVariables();
        Intent var10000 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(var10000, "intent");
        Bundle var7 = var10000.getExtras();
        boolean isCustomizingColors = var7 != null ? var7.getBoolean("is_customizing_colors") : false;
        Intent var10001 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(var10001, "intent");
        Bundle var9 = var10001.getExtras();
        this.mWidgetId = var9 != null ? var9.getInt("appWidgetId") : 0;
        if (this.mWidgetId == 0 && !isCustomizingColors) {
            this.finish();
        }

        SimpleActivity var10002 = (SimpleActivity)this;
        ArrayList var10003 = this.getListItems();
        MyRecyclerView var10006 = (MyRecyclerView)this._$_findCachedViewById(id.config_events_list);
        Intrinsics.checkNotNullExpressionValue(var10006, "config_events_list");
        EventListAdapter var3 = new EventListAdapter(var10002, var10003, false, (RefreshRecyclerViewListener)null, var10006, (Function1)null.INSTANCE);
        int var5 = false;
        var3.updateTextColor(this.mTextColor);
        MyRecyclerView var8 = (MyRecyclerView)this._$_findCachedViewById(id.config_events_list);
        Intrinsics.checkNotNullExpressionValue(var8, "config_events_list");
        var8.setAdapter((Adapter)var3);
        ((Button)this._$_findCachedViewById(id.config_save)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetListConfigureActivity.this.saveConfig();
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.config_bg_color)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetListConfigureActivity.this.pickBackgroundColor();
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.config_text_color)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                WidgetListConfigureActivity.this.pickTextColor();
            }
        }));
        int primaryColor = ContextKt.getConfig(this).getPrimaryColor();
        ((MySeekBar)this._$_findCachedViewById(id.config_bg_seekbar)).setColors(this.mTextColor, primaryColor, primaryColor);
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
                    WidgetListConfigureActivity.this.mBgColorWithoutTransparency = color;
                    WidgetListConfigureActivity.this.updateBgColor();
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
                    WidgetListConfigureActivity.this.mTextColorWithoutTransparency = color;
                    WidgetListConfigureActivity.this.updateColors();
                }

            }
        }), 28, (DefaultConstructorMarker)null);
    }

    private final void requestWidgetUpdate() {
        Intent var1 = new Intent("android.appwidget.action.APPWIDGET_UPDATE", (Uri)null, (Context)this, MyWidgetListProvider.class);
        int var3 = false;
        var1.putExtra("appWidgetIds", new int[]{this.mWidgetId});
        this.sendBroadcast(var1);
    }

    private final void updateColors() {
        this.mTextColor = this.mTextColorWithoutTransparency;
        MyRecyclerView var10000 = (MyRecyclerView)this._$_findCachedViewById(id.config_events_list);
        Intrinsics.checkNotNullExpressionValue(var10000, "config_events_list");
        Adapter var1 = var10000.getAdapter();
        if (!(var1 instanceof EventListAdapter)) {
            var1 = null;
        }

        EventListAdapter var2 = (EventListAdapter)var1;
        if (var2 != null) {
            var2.updateTextColor(this.mTextColor);
        }

        ImageView var3 = (ImageView)this._$_findCachedViewById(id.config_text_color);
        Intrinsics.checkNotNullExpressionValue(var3, "config_text_color");
        ImageViewKt.setFillWithStroke$default(var3, this.mTextColor, -16777216, false, 4, (Object)null);
        ((Button)this._$_findCachedViewById(id.config_save)).setTextColor(this.mTextColor);
    }

    private final void updateBgColor() {
        this.mBgColor = IntKt.adjustAlpha(this.mBgColorWithoutTransparency, this.mBgAlpha);
        MyRecyclerView var10000 = (MyRecyclerView)this._$_findCachedViewById(id.config_events_list);
        Intrinsics.checkNotNullExpressionValue(var10000, "config_events_list");
        Drawable var1 = var10000.getBackground();
        Intrinsics.checkNotNullExpressionValue(var1, "config_events_list.background");
        DrawableKt.applyColorFilter(var1, this.mBgColor);
        ImageView var2 = (ImageView)this._$_findCachedViewById(id.config_bg_color);
        Intrinsics.checkNotNullExpressionValue(var2, "config_bg_color");
        ImageViewKt.setFillWithStroke$default(var2, this.mBgColor, -16777216, false, 4, (Object)null);
        ((Button)this._$_findCachedViewById(id.config_save)).setBackgroundColor(this.mBgColor);
    }

    private final ArrayList getListItems() {
        ArrayList listItems = new ArrayList(10);
        DateTime dateTime = DateTime.now().withTime(0, 0, 0, 0).plusDays(1);
        Formatter var10000 = Formatter.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(dateTime, "dateTime");
        String code = var10000.getDayCodeFromTS(DateTimeKt.seconds(dateTime));
        String day = Formatter.INSTANCE.getDateDayTitle(code);
        listItems.add(new ListSectionDay(day, code, false, false));
        DateTime time = dateTime.withHourOfDay(7);
        Intrinsics.checkNotNullExpressionValue(time, "time");
        long var10004 = DateTimeKt.seconds(time);
        DateTime var10005 = time.plusMinutes(30);
        Intrinsics.checkNotNullExpressionValue(var10005, "time.plusMinutes(30)");
        long var6 = DateTimeKt.seconds(var10005);
        String var10006 = this.getString(1901127);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.sample_title_1)");
        String var10007 = this.getString(1900161);
        Intrinsics.checkNotNullExpressionValue(var10007, "getString(R.string.sample_description_1)");
        listItems.add(new ListEvent(1L, var10004, var6, var10006, var10007, false, ContextKt.getConfig(this).getPrimaryColor(), "", false, false));
        time = dateTime.withHourOfDay(8);
        Intrinsics.checkNotNullExpressionValue(time, "time");
        var10004 = DateTimeKt.seconds(time);
        var10005 = time.plusHours(1);
        Intrinsics.checkNotNullExpressionValue(var10005, "time.plusHours(1)");
        var6 = DateTimeKt.seconds(var10005);
        var10006 = this.getString(1901128);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.sample_title_2)");
        var10007 = this.getString(1900164);
        Intrinsics.checkNotNullExpressionValue(var10007, "getString(R.string.sample_description_2)");
        listItems.add(new ListEvent(2L, var10004, var6, var10006, var10007, false, ContextKt.getConfig(this).getPrimaryColor(), "", false, false));
        dateTime = dateTime.plusDays(1);
        var10000 = Formatter.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(dateTime, "dateTime");
        code = var10000.getDayCodeFromTS(DateTimeKt.seconds(dateTime));
        day = Formatter.INSTANCE.getDateDayTitle(code);
        listItems.add(new ListSectionDay(day, code, false, false));
        time = dateTime.withHourOfDay(8);
        Intrinsics.checkNotNullExpressionValue(time, "time");
        var10004 = DateTimeKt.seconds(time);
        var10005 = time.plusHours(1);
        Intrinsics.checkNotNullExpressionValue(var10005, "time.plusHours(1)");
        var6 = DateTimeKt.seconds(var10005);
        var10006 = this.getString(1901129);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.sample_title_3)");
        listItems.add(new ListEvent(3L, var10004, var6, var10006, "", false, ContextKt.getConfig(this).getPrimaryColor(), "", false, false));
        time = dateTime.withHourOfDay(13);
        Intrinsics.checkNotNullExpressionValue(time, "time");
        var10004 = DateTimeKt.seconds(time);
        var10005 = time.plusHours(1);
        Intrinsics.checkNotNullExpressionValue(var10005, "time.plusHours(1)");
        var6 = DateTimeKt.seconds(var10005);
        var10006 = this.getString(1901116);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.sample_title_4)");
        var10007 = this.getString(1900159);
        Intrinsics.checkNotNullExpressionValue(var10007, "getString(R.string.sample_description_4)");
        listItems.add(new ListEvent(4L, var10004, var6, var10006, var10007, false, ContextKt.getConfig(this).getPrimaryColor(), "", false, false));
        time = dateTime.withHourOfDay(18);
        Intrinsics.checkNotNullExpressionValue(time, "time");
        var10004 = DateTimeKt.seconds(time);
        var10005 = time.plusMinutes(10);
        Intrinsics.checkNotNullExpressionValue(var10005, "time.plusMinutes(10)");
        var6 = DateTimeKt.seconds(var10005);
        var10006 = this.getString(1901118);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.sample_title_5)");
        listItems.add(new ListEvent(5L, var10004, var6, var10006, "", false, ContextKt.getConfig(this).getPrimaryColor(), "", false, false));
        return listItems;
    }

    // $FF: synthetic method
    public static final int access$getMBgColorWithoutTransparency$p(WidgetListConfigureActivity $this) {
        return $this.mBgColorWithoutTransparency;
    }

    // $FF: synthetic method
    public static final int access$getMTextColorWithoutTransparency$p(WidgetListConfigureActivity $this) {
        return $this.mTextColorWithoutTransparency;
    }

    // $FF: synthetic method
    public static final float access$getMBgAlpha$p(WidgetListConfigureActivity $this) {
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
