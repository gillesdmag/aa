package com.simplemobiletools.calendar.pro.extensions;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 2,
    d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"},
    d2 = {"addResizedBackgroundDrawable", "", "Landroid/widget/TextView;", "res", "Landroid/content/res/Resources;", "drawableHeight", "Lcom/simplemobiletools/calendar/pro/extensions/Int;", "primaryColor", "drawableId", "calendar_debug"}
)
public final class TextViewKt {
    public static final void addResizedBackgroundDrawable(@NotNull TextView $this$addResizedBackgroundDrawable, @NotNull Resources res, @NotNull Int drawableHeight, @NotNull Int primaryColor, @NotNull Int drawableId) {
        Intrinsics.checkNotNullParameter($this$addResizedBackgroundDrawable, "$this$addResizedBackgroundDrawable");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(drawableHeight, "drawableHeight");
        Intrinsics.checkNotNullParameter(primaryColor, "primaryColor");
        Intrinsics.checkNotNullParameter(drawableId, "drawableId");
        Drawable var10000 = res.getDrawable(((Number)drawableId).intValue());
        Intrinsics.checkNotNullExpressionValue(var10000, "res.getDrawable(drawableId)");
        Bitmap baseDrawable = DrawableKt.toBitmap$default(var10000, ((Number)drawableHeight).intValue(), ((Number)drawableHeight).intValue(), (Config)null, 4, (Object)null);
        BitmapDrawable scaledDrawable = new BitmapDrawable(res, baseDrawable);
        com.simplemobiletools.commons.extensions.DrawableKt.applyColorFilter((Drawable)scaledDrawable, ((Number)primaryColor).intValue());
        $this$addResizedBackgroundDrawable.setBackground((Drawable)scaledDrawable);
    }
}
