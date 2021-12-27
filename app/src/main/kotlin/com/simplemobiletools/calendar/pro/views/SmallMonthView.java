package com.simplemobiletools.calendar.pro.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.View;
import com.simplemobiletools.calendar.pro.R.styleable;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.helpers.ConstantsKt;
import com.simplemobiletools.calendar.pro.models.DayYearly;
import com.simplemobiletools.commons.extensions.IntKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0014J\u000e\u0010)\u001a\u00020&2\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010*\u001a\u00020&2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018J\u0006\u0010,\u001a\u00020&R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u000e\u0010!\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/views/SmallMonthView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dayWidth", "", "days", "firstDay", "getFirstDay", "()I", "setFirstDay", "(I)V", "highlightWeekends", "", "isLandscape", "isPrintVersion", "isSundayFirst", "mEvents", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/DayYearly;", "paint", "Landroid/graphics/Paint;", "textColor", "todayCirclePaint", "todaysId", "getTodaysId", "setTodaysId", "weekendsTextColor", "getPaint", "curId", "weekDay", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setDays", "setEvents", "events", "togglePrintMode", "Simple-Calendar.app"}
)
public final class SmallMonthView extends View {
    private Paint paint;
    private Paint todayCirclePaint;
    private float dayWidth;
    private int textColor;
    private int weekendsTextColor;
    private int days;
    private boolean isLandscape;
    private boolean highlightWeekends;
    private boolean isSundayFirst;
    private boolean isPrintVersion;
    private ArrayList mEvents;
    private int firstDay;
    private int todaysId;
    private HashMap _$_findViewCache;

    public final int getFirstDay() {
        return this.firstDay;
    }

    public final void setFirstDay(int var1) {
        this.firstDay = var1;
    }

    public final int getTodaysId() {
        return this.todaysId;
    }

    public final void setTodaysId(int var1) {
        this.todaysId = var1;
    }

    public final void setDays(int days) {
        this.days = days;
        this.invalidate();
    }

    public final void setEvents(@Nullable ArrayList events) {
        this.mEvents = events;
        this.post((Runnable)(new Runnable() {
            public final void run() {
                SmallMonthView.this.invalidate();
            }
        }));
    }

    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.dayWidth == 0.0F) {
            this.dayWidth = this.isLandscape ? (float)this.getWidth() / 9.0F : (float)this.getWidth() / 7.0F;
        }

        int curId = 1 - this.firstDay;
        int y = 1;

        for(byte var4 = 6; y <= var4; ++y) {
            int x = 1;

            for(byte var6 = 7; x <= var6; ++x) {
                int var10000 = this.days;
                if (1 <= curId) {
                    if (var10000 >= curId) {
                        Paint paint = this.getPaint(curId, x, this.highlightWeekends);
                        canvas.drawText(String.valueOf(curId), (float)x * this.dayWidth - this.dayWidth / (float)4, (float)y * this.dayWidth, paint);
                        if (curId == this.todaysId && !this.isPrintVersion) {
                            int dividerConstant = this.isLandscape ? 6 : 4;
                            canvas.drawCircle((float)x * this.dayWidth - this.dayWidth / (float)2, (float)y * this.dayWidth - this.dayWidth / (float)dividerConstant, this.dayWidth * 0.41F, this.todayCirclePaint);
                        }
                    }
                }

                ++curId;
            }
        }

    }

    private final Paint getPaint(int curId, int weekDay, boolean highlightWeekends) {
        HashSet var8;
        label29: {
            ArrayList var10000 = this.mEvents;
            if (var10000 != null) {
                DayYearly var7 = (DayYearly)var10000.get(curId);
                if (var7 != null) {
                    var8 = var7.getEventColors();
                    if (var8 != null) {
                        break label29;
                    }
                }
            }

            var8 = new HashSet();
        }

        HashSet colors = var8;
        Collection var5 = (Collection)colors;
        Paint curPaint;
        if (!var5.isEmpty()) {
            curPaint = new Paint(this.paint);
            curPaint.setColor(((Number)CollectionsKt.first((Iterable)colors)).intValue());
            return curPaint;
        } else if (highlightWeekends && ConstantsKt.isWeekend(weekDay - 1, this.isSundayFirst)) {
            curPaint = new Paint(this.paint);
            curPaint.setColor(this.weekendsTextColor);
            return curPaint;
        } else {
            return this.paint;
        }
    }

    public final void togglePrintMode() {
        this.isPrintVersion = !this.isPrintVersion;
        int var10001;
        if (this.isPrintVersion) {
            var10001 = this.getResources().getColor(500098);
        } else {
            Context var1 = this.getContext();
            Intrinsics.checkNotNullExpressionValue(var1, "context");
            var10001 = IntKt.adjustAlpha(ContextKt.getConfig(var1).getTextColor(), 0.5F);
        }

        this.textColor = var10001;
        this.paint.setColor(this.textColor);
        this.invalidate();
    }

    public SmallMonthView(@NotNull Context context, @NotNull AttributeSet attrs, int defStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super(context, attrs, defStyle);
        this.days = 31;
        TypedArray var10000 = context.getTheme().obtainStyledAttributes(attrs, styleable.SmallMonthView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(var10000, "context.theme.obtainStyl…thView,\n            0, 0)");
        TypedArray attributes = var10000;

        try {
            this.days = attributes.getInt(2100671, 31);
        } finally {
            attributes.recycle();
        }

        int baseColor = ContextKt.getConfig(context).getTextColor();
        this.textColor = IntKt.adjustAlpha(baseColor, 0.5F);
        this.weekendsTextColor = IntKt.adjustAlpha(ContextKt.getConfig(context).getHighlightWeekendsColor(), 0.5F);
        this.highlightWeekends = ContextKt.getConfig(context).getHighlightWeekends();
        this.isSundayFirst = ContextKt.getConfig(context).isSundayFirst();
        Paint var6 = new Paint(1);
        boolean var8 = false;
        var6.setColor(this.textColor);
        var6.setTextSize((float)this.getResources().getDimensionPixelSize(600134));
        var6.setTextAlign(Align.RIGHT);
        Unit var10 = Unit.INSTANCE;
        this.paint = var6;
        this.todayCirclePaint = new Paint(this.paint);
        this.todayCirclePaint.setColor(IntKt.adjustAlpha(com.simplemobiletools.commons.extensions.ContextKt.getAdjustedPrimaryColor(context), 0.5F));
        Resources var10001 = this.getResources();
        Intrinsics.checkNotNullExpressionValue(var10001, "resources");
        this.isLandscape = var10001.getConfiguration().orientation == 2;
    }

    public SmallMonthView(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this(context, attrs, 0);
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
