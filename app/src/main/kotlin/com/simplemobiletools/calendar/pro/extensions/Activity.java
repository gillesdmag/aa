package com.simplemobiletools.calendar.pro.extensions;

import android.app.Activity;
import android.content.Context;
import com.simplemobiletools.calendar.pro.dialogs.CustomEventRepeatIntervalDialog;
import com.simplemobiletools.calendar.pro.helpers.IcsExporter;
import com.simplemobiletools.calendar.pro.helpers.IcsExporter.ExportResult;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.dialogs.RadioGroupDialog;
import com.simplemobiletools.commons.extensions.ContextKt;
import com.simplemobiletools.commons.extensions.FileKt;
import com.simplemobiletools.commons.helpers.ConstantsKt;
import com.simplemobiletools.commons.models.RadioItem;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 2,
    d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a5\u0010\b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\r¨\u0006\u0011"},
    d2 = {"getTempFile", "Ljava/io/File;", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "shareEvents", "", "ids", "", "", "showEventRepeatIntervalDialog", "Landroid/app/Activity;", "curSeconds", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "minutes", "calendar_debug"}
)
public final class ActivityKt {
    public static final void shareEvents(@NotNull final BaseSimpleActivity $this$shareEvents, @NotNull final List ids) {
        Intrinsics.checkNotNullParameter($this$shareEvents, "$this$shareEvents");
        Intrinsics.checkNotNullParameter(ids, "ids");
        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                final File file = ActivityKt.getTempFile($this$shareEvents);
                if (file == null) {
                    ContextKt.toast$default((Context)$this$shareEvents, 1900338, 0, 2, (Object)null);
                } else {
                    List var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsDB((Context)$this$shareEvents).getEventsWithIds(ids);
                    if (var10000 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.simplemobiletools.calendar.pro.models.Event> /* = java.util.ArrayList<com.simplemobiletools.calendar.pro.models.Event> */");
                    } else {
                        final ArrayList events = (ArrayList)var10000;
                        com.simplemobiletools.commons.extensions.ActivityKt.getFileOutputStream($this$shareEvents, FileKt.toFileDirItem(file, (Context)$this$shareEvents), true, (Function1)(new Function1() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke(Object var1) {
                                this.invoke((OutputStream)var1);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable OutputStream it) {
                                (new IcsExporter()).exportEvents($this$shareEvents, it, events, false, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke((ExportResult)var1);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull ExportResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (it == ExportResult.EXPORT_OK) {
                                            Activity var10000 = (Activity)$this$shareEvents;
                                            String var10001 = file.getAbsolutePath();
                                            Intrinsics.checkNotNullExpressionValue(var10001, "file.absolutePath");
                                            com.simplemobiletools.commons.extensions.ActivityKt.sharePathIntent(var10000, var10001, "com.simplemobiletools.calendar.pro.debug");
                                        }

                                    }
                                }));
                            }
                        }));
                    }
                }
            }
        }));
    }

    @Nullable
    public static final File getTempFile(@NotNull BaseSimpleActivity $this$getTempFile) {
        Intrinsics.checkNotNullParameter($this$getTempFile, "$this$getTempFile");
        File folder = new File($this$getTempFile.getCacheDir(), "events");
        if (!folder.exists() && !folder.mkdir()) {
            ContextKt.toast$default((Context)$this$getTempFile, 1900338, 0, 2, (Object)null);
            return null;
        } else {
            return new File(folder, "events.ics");
        }
    }

    public static final void showEventRepeatIntervalDialog(@NotNull final Activity $this$showEventRepeatIntervalDialog, int curSeconds, @NotNull final Function1 callback) {
        Intrinsics.checkNotNullParameter($this$showEventRepeatIntervalDialog, "$this$showEventRepeatIntervalDialog");
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.simplemobiletools.commons.extensions.ActivityKt.hideKeyboard($this$showEventRepeatIntervalDialog);
        TreeSet seconds = new TreeSet();
        int $i$f$mapIndexedTo = false;
        seconds.add(0);
        seconds.add(86400);
        seconds.add(604800);
        seconds.add(2592001);
        seconds.add(31536000);
        seconds.add(curSeconds);
        ArrayList items = new ArrayList(seconds.size() + 1);
        Iterable $this$mapIndexedTo$iv = (Iterable)seconds;
        $i$f$mapIndexedTo = false;
        int index$iv = 0;
        Iterator var8 = $this$mapIndexedTo$iv.iterator();

        Collection var10000;
        while(var8.hasNext()) {
            Object item$iv = var8.next();
            var10000 = (Collection)items;
            int var10 = index$iv++;
            boolean var11 = false;
            if (var10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }

            int value = ((Number)item$iv).intValue();
            Collection var16 = var10000;
            int var14 = false;
            RadioItem var17 = new RadioItem(var10, com.simplemobiletools.calendar.pro.extensions.ContextKt.getRepetitionText((Context)$this$showEventRepeatIntervalDialog, value), value);
            var16.add(var17);
        }

        var10000 = (Collection)items;
        int selectedIndex = 0;
        Iterable $this$forEachIndexed$iv = (Iterable)seconds;
        int $i$f$forEachIndexed = false;
        int index$iv = 0;
        Iterator var22 = $this$forEachIndexed$iv.iterator();

        while(var22.hasNext()) {
            Object item$iv = var22.next();
            int var24 = index$iv++;
            boolean var25 = false;
            if (var24 < 0) {
                CollectionsKt.throwIndexOverflow();
            }

            int value = ((Number)item$iv).intValue();
            int var15 = false;
            if (value == curSeconds) {
                selectedIndex = var24;
            }
        }

        String var10004 = $this$showEventRepeatIntervalDialog.getString(1900711);
        Intrinsics.checkNotNullExpressionValue(var10004, "getString(R.string.custom)");
        items.add(new RadioItem(-1, var10004, (Object)null, 4, (DefaultConstructorMarker)null));
        new RadioGroupDialog($this$showEventRepeatIntervalDialog, items, selectedIndex, 0, false, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (Intrinsics.areEqual(it, -1)) {
                    new CustomEventRepeatIntervalDialog($this$showEventRepeatIntervalDialog, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke(((Number)var1).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int it) {
                            callback.invoke(it);
                        }
                    }));
                } else {
                    callback.invoke((Integer)it);
                }

            }
        }), 56, (DefaultConstructorMarker)null);
    }
}
