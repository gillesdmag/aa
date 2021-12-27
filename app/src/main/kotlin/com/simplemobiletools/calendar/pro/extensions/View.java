package com.simplemobiletools.calendar.pro.extensions;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 2,
    d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"},
    d2 = {"getViewBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/View;", "calendar_debug"}
)
public final class ViewKt {
    @NotNull
    public static final Bitmap getViewBitmap(@NotNull View $this$getViewBitmap) {
        Intrinsics.checkNotNullParameter($this$getViewBitmap, "$this$getViewBitmap");
        Bitmap bitmap = Bitmap.createBitmap($this$getViewBitmap.getWidth(), $this$getViewBitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        $this$getViewBitmap.layout($this$getViewBitmap.getLeft(), $this$getViewBitmap.getTop(), $this$getViewBitmap.getRight(), $this$getViewBitmap.getBottom());
        $this$getViewBitmap.draw(canvas);
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }
}
