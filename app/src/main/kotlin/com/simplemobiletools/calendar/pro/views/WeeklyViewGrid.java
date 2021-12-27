package com.simplemobiletools.calendar.pro.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/views/WeeklyViewGrid;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ROWS_CNT", "daysCount", "getDaysCount", "()I", "setDaysCount", "(I)V", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "Simple-Calendar.app"}
)
public final class WeeklyViewGrid extends View {
    private final int ROWS_CNT;
    private Paint paint;
    private int daysCount;
    private HashMap _$_findViewCache;

    public final int getDaysCount() {
        return this.daysCount;
    }

    public final void setDaysCount(int var1) {
        this.daysCount = var1;
    }

    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Context var10000 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(var10000, "context");
        float rowHeight = ContextKt.getWeeklyViewItemHeight(var10000);
        int i = 0;

        int i;
        for(i = this.ROWS_CNT; i < i; ++i) {
            float y = rowHeight * (float)i;
            canvas.drawLine(0.0F, y, (float)this.getWidth(), y, this.paint);
        }

        float rowWidth = (float)this.getWidth() / (float)this.daysCount;
        i = 0;

        for(int var8 = this.daysCount; i < var8; ++i) {
            float x = rowWidth * (float)i;
            canvas.drawLine(x, 0.0F, x, (float)this.getHeight(), this.paint);
        }

    }

    public WeeklyViewGrid(@NotNull Context context, @NotNull AttributeSet attrs, int defStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super(context, attrs, defStyle);
        this.ROWS_CNT = 24;
        this.paint = new Paint(1);
        this.daysCount = ContextKt.getConfig(context).getWeeklyViewDays();
        this.paint.setColor(context.getResources().getColor(500534));
    }

    public WeeklyViewGrid(@NotNull Context context, @NotNull AttributeSet attrs) {
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
