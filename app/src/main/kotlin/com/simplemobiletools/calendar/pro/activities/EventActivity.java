// EventActivity$saveEvent$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.activities;

import com.simplemobiletools.commons.extensions.ContextKt;
import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"},
    d2 = {"<anonymous>", "", "run", "com/simplemobiletools/calendar/pro/activities/EventActivity$saveEvent$newEventType$2$1"}
)
final class EventActivity$saveEvent$$inlined$apply$lambda$1 implements Runnable {
    // $FF: synthetic field
    final EventActivity this$0;

    EventActivity$saveEvent$$inlined$apply$lambda$1(EventActivity var1) {
        this.this$0 = var1;
    }

    public final void run() {
        ContextKt.toast$default(this.this$0, 1900748, 0, 2, (Object)null);
    }
}
// EventActivity$updateAttendees$$inlined$thenBy$3.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class EventActivity$updateAttendees$$inlined$thenBy$3 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;

    public EventActivity$updateAttendees$$inlined$thenBy$3(Comparator var1) {
        this.$this_thenBy = var1;
    }

    public final int compare(Object a, Object b) {
        int previousCompare = this.$this_thenBy.compare(a, b);
        int var10000;
        if (previousCompare != 0) {
            var10000 = previousCompare;
        } else {
            boolean var4 = false;
            Attendee it = (Attendee)a;
            int var6 = false;
            Comparable var9 = (Comparable)it.getStatus() == 4;
            it = (Attendee)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)it.getStatus() == 4;
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// EventActivity$updateAttendees$$inlined$compareBy$1.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}
)
public final class EventActivity$updateAttendees$$inlined$compareBy$1 implements Comparator {
    public final int compare(Object a, Object b) {
        boolean var3 = false;
        Attendee it = (Attendee)a;
        int var5 = false;
        Comparable var10000 = (Comparable)it.isMe();
        it = (Attendee)b;
        Comparable var6 = var10000;
        var5 = false;
        Comparable var7 = (Comparable)it.isMe();
        return ComparisonsKt.compareValues(var6, var7);
    }
}
// EventActivity$onRestoreInstanceState$1$token$1.java
package com.simplemobiletools.calendar.pro.activities;

    import com.google.gson.reflect.TypeToken;
    import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"},
    d2 = {"com/simplemobiletools/calendar/pro/activities/EventActivity$onRestoreInstanceState$1$token$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/simplemobiletools/calendar/pro/models/Attendee;", "calendar_debug"}
)
public final class EventActivity$onRestoreInstanceState$1$token$1 extends TypeToken {
    EventActivity$onRestoreInstanceState$1$token$1() {
    }
}
// EventActivity$getReminders$$inlined$sortedBy$1.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.models.Reminder;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}
)
public final class EventActivity$getReminders$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object a, Object b) {
        boolean var3 = false;
        Reminder it = (Reminder)a;
        int var5 = false;
        Comparable var10000 = (Comparable)it.getMinutes();
        it = (Reminder)b;
        Comparable var6 = var10000;
        var5 = false;
        Integer var7 = it.getMinutes();
        return ComparisonsKt.compareValues(var6, (Comparable)var7);
    }
}
// EventActivity$isEventChanged$1.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.models.Event;
    import kotlin.Metadata;
    import kotlin.jvm.internal.MutablePropertyReference0Impl;
    import org.jetbrains.annotations.Nullable;

// $FF: synthetic class
@Metadata(
    mv = {1, 5, 1},
    k = 3
)
final class EventActivity$isEventChanged$1 extends MutablePropertyReference0Impl {
    EventActivity$isEventChanged$1(EventActivity var1) {
        super(var1, EventActivity.class, "mEvent", "getMEvent()Lcom/simplemobiletools/calendar/pro/models/Event;", 0);
    }

    @Nullable
    public Object get() {
        return EventActivity.access$getMEvent$p((EventActivity)this.receiver);
    }

    public void set(@Nullable Object value) {
        EventActivity.access$setMEvent$p((EventActivity)this.receiver, (Event)value);
    }
}
// EventActivity$updateAttendees$$inlined$thenBy$2.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class EventActivity$updateAttendees$$inlined$thenBy$2 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;

    public EventActivity$updateAttendees$$inlined$thenBy$2(Comparator var1) {
        this.$this_thenBy = var1;
    }

    public final int compare(Object a, Object b) {
        int previousCompare = this.$this_thenBy.compare(a, b);
        int var10000;
        if (previousCompare != 0) {
            var10000 = previousCompare;
        } else {
            boolean var4 = false;
            Attendee it = (Attendee)a;
            int var6 = false;
            Comparable var9 = (Comparable)it.getStatus() == 2;
            it = (Attendee)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)it.getStatus() == 2;
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// EventActivity$updateAttendees$$inlined$thenBy$4.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class EventActivity$updateAttendees$$inlined$thenBy$4 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;

    public EventActivity$updateAttendees$$inlined$thenBy$4(Comparator var1) {
        this.$this_thenBy = var1;
    }

    public final int compare(Object a, Object b) {
        int previousCompare = this.$this_thenBy.compare(a, b);
        int var10000;
        if (previousCompare != 0) {
            var10000 = previousCompare;
        } else {
            boolean var4 = false;
            Attendee it = (Attendee)a;
            int var6 = false;
            Comparable var9 = (Comparable)it.getStatus();
            it = (Attendee)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)it.getStatus();
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// EventActivity$addSelectedAttendee$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.activities;

    import android.app.Activity;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.RelativeLayout;
    import com.simplemobiletools.calendar.pro.models.Attendee;
    import com.simplemobiletools.commons.dialogs.RadioGroupDialog;
    import com.simplemobiletools.commons.models.RadioItem;
    import java.util.ArrayList;
    import kotlin.Metadata;
    import kotlin.collections.CollectionsKt;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.DefaultConstructorMarker;
    import kotlin.jvm.internal.Intrinsics;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/simplemobiletools/calendar/pro/activities/EventActivity$addSelectedAttendee$1$5"}
)
final class EventActivity$addSelectedAttendee$$inlined$apply$lambda$1 implements OnClickListener {
    // $FF: synthetic field
    final RelativeLayout $this_apply;
    // $FF: synthetic field
    final EventActivity this$0;
    // $FF: synthetic field
    final Attendee $attendee$inlined;

    EventActivity$addSelectedAttendee$$inlined$apply$lambda$1(RelativeLayout var1, EventActivity var2, Attendee var3) {
        this.$this_apply = var1;
        this.this$0 = var2;
        this.$attendee$inlined = var3;
    }

    public final void onClick(View it) {
        RadioItem[] var10000 = new RadioItem[3];
        String var10006 = this.this$0.getString(1900587);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.going)");
        var10000[0] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.this$0.getString(1900826);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.not_going)");
        var10000[1] = new RadioItem(2, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.this$0.getString(1901132);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.maybe_going)");
        var10000[2] = new RadioItem(4, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        ArrayList items = CollectionsKt.arrayListOf(var10000);
        new RadioGroupDialog((Activity)this.this$0, items, this.$attendee$inlined.getStatus(), 0, false, (Function0)null, (Function1)(new EventActivity$addSelectedAttendee$$inlined$apply$lambda$1$1(this)), 56, (DefaultConstructorMarker)null);
    }
}
// EventActivity.java
package com.simplemobiletools.calendar.pro.activities;

    import android.app.Activity;
    import android.app.DatePickerDialog;
    import android.app.TimePickerDialog;
    import android.app.DatePickerDialog.OnDateSetListener;
    import android.app.TimePickerDialog.OnTimeSetListener;
    import android.content.Context;
    import android.content.Intent;
    import android.content.res.Resources;
    import android.database.Cursor;
    import android.graphics.drawable.BitmapDrawable;
    import android.graphics.drawable.Drawable;
    import android.graphics.drawable.LayerDrawable;
    import android.net.Uri;
    import android.os.Bundle;
    import android.provider.ContactsContract.Data;
    import android.provider.ContactsContract.CommonDataKinds.Email;
    import android.text.TextUtils;
    import android.text.method.LinkMovementMethod;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.view.ViewGroup.LayoutParams;
    import android.widget.AdapterView;
    import android.widget.CompoundButton;
    import android.widget.DatePicker;
    import android.widget.EditText;
    import android.widget.ImageView;
    import android.widget.LinearLayout;
    import android.widget.ListAdapter;
    import android.widget.RelativeLayout;
    import android.widget.ScrollView;
    import android.widget.TextView;
    import android.widget.TimePicker;
    import android.widget.AdapterView.OnItemClickListener;
    import android.widget.CompoundButton.OnCheckedChangeListener;
    import androidx.appcompat.app.ActionBar;
    import androidx.core.app.NotificationManagerCompat;
    import com.google.gson.Gson;
    import com.google.gson.reflect.TypeToken;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.adapters.AutoCompleteTextViewAdapter;
    import com.simplemobiletools.calendar.pro.dialogs.DeleteEventDialog;
    import com.simplemobiletools.calendar.pro.dialogs.EditRepeatingEventDialog;
    import com.simplemobiletools.calendar.pro.dialogs.RepeatLimitTypePickerDialog;
    import com.simplemobiletools.calendar.pro.dialogs.RepeatRuleWeeklyDialog;
    import com.simplemobiletools.calendar.pro.dialogs.SelectEventCalendarDialog;
    import com.simplemobiletools.calendar.pro.dialogs.SelectEventTypeDialog;
    import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
    import com.simplemobiletools.calendar.pro.extensions.IntKt;
    import com.simplemobiletools.calendar.pro.helpers.Config;
    import com.simplemobiletools.calendar.pro.helpers.EventsHelper;
    import com.simplemobiletools.calendar.pro.helpers.Formatter;
    import com.simplemobiletools.calendar.pro.models.Attendee;
    import com.simplemobiletools.calendar.pro.models.CalDAVCalendar;
    import com.simplemobiletools.calendar.pro.models.Event;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import com.simplemobiletools.calendar.pro.models.MyTimeZone;
    import com.simplemobiletools.calendar.pro.models.Reminder;
    import com.simplemobiletools.commons.activities.BaseSimpleActivity;
    import com.simplemobiletools.commons.dialogs.ConfirmationAdvancedDialog;
    import com.simplemobiletools.commons.dialogs.ConfirmationDialog;
    import com.simplemobiletools.commons.dialogs.RadioGroupDialog;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.ContextKt;
    import com.simplemobiletools.commons.extensions.CursorKt;
    import com.simplemobiletools.commons.extensions.DrawableKt;
    import com.simplemobiletools.commons.extensions.EditTextKt;
    import com.simplemobiletools.commons.extensions.ImageViewKt;
    import com.simplemobiletools.commons.extensions.ResourcesKt;
    import com.simplemobiletools.commons.extensions.TextViewKt;
    import com.simplemobiletools.commons.extensions.ViewKt;
    import com.simplemobiletools.commons.helpers.ConstantsKt;
    import com.simplemobiletools.commons.helpers.SimpleContactsHelper;
    import com.simplemobiletools.commons.models.RadioItem;
    import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
    import com.simplemobiletools.commons.views.MyAutoCompleteTextView;
    import com.simplemobiletools.commons.views.MyEditText;
    import com.simplemobiletools.commons.views.MyTextView;
    import java.io.Serializable;
    import java.lang.reflect.Type;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.Comparator;
    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.Iterator;
    import java.util.List;
    import java.util.TimeZone;
    import java.util.UUID;
    import java.util.regex.Pattern;
    import kotlin.Metadata;
    import kotlin.Pair;
    import kotlin.Unit;
    import kotlin.collections.CollectionsKt;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.DefaultConstructorMarker;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.text.StringsKt;
    import org.jetbrains.annotations.NotNull;
    import org.jetbrains.annotations.Nullable;
    import org.joda.time.DateTime;
    import org.joda.time.DateTimeZone;
    import org.joda.time.ReadableInstant;
    import org.joda.time.DateTime.Property;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010E\u001a\u00020F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010 H\u0002J\b\u0010H\u001a\u00020FH\u0002J \u0010I\u001a\u00020F2\u0006\u0010G\u001a\u00020 2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020FH\u0002J\b\u0010N\u001a\u00020FH\u0002J\b\u0010O\u001a\u00020FH\u0002J\b\u0010P\u001a\u00020FH\u0002J\u0010\u0010Q\u001a\u00020F2\u0006\u0010R\u001a\u00020\u0015H\u0002J\b\u0010S\u001a\u00020FH\u0002J\b\u0010T\u001a\u00020FH\u0002J\b\u0010U\u001a\u00020FH\u0002J(\u0010V\u001a\u00020F2\u0006\u0010W\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020.H\u0002J\b\u0010[\u001a\u00020FH\u0002J\b\u0010\\\u001a\u00020FH\u0002J\b\u0010]\u001a\u00020FH\u0002J\u0010\u0010^\u001a\u00020\u00042\u0006\u0010_\u001a\u00020.H\u0002J\u0010\u0010`\u001a\u00020a2\u0006\u0010G\u001a\u00020 H\u0002J\u0018\u0010b\u001a\u0012\u0012\u0004\u0012\u00020c0\u001cj\b\u0012\u0004\u0012\u00020c`\u001eH\u0002J\u0018\u0010d\u001a\u0012\u0012\u0004\u0012\u00020c0\u001cj\b\u0012\u0004\u0012\u00020c`\u001eH\u0002J\u0010\u0010e\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0015H\u0002J\b\u0010f\u001a\u00020\u0015H\u0002J \u0010g\u001a\u0004\u0018\u00010h2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020h0j2\u0006\u0010k\u001a\u00020\u0015H\u0002J\u0010\u0010l\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0015H\u0002J\u0018\u0010m\u001a\u0012\u0012\u0004\u0012\u00020 0\u001cj\b\u0012\u0004\u0012\u00020 `\u001eH\u0002J\b\u0010n\u001a\u00020\u0004H\u0002J\u000e\u0010o\u001a\b\u0012\u0004\u0012\u00020 0jH\u0002J\u0010\u0010p\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0015H\u0002J\u0018\u0010r\u001a\u0012\u0012\u0004\u0012\u00020s0\u001cj\b\u0012\u0004\u0012\u00020s`\u001eH\u0002J\u0018\u0010t\u001a\u00020\u00042\u0006\u0010u\u001a\u00020.2\u0006\u0010q\u001a\u00020\u0015H\u0002J\u0018\u0010v\u001a\u00020\u00042\u0006\u0010u\u001a\u00020.2\u0006\u0010q\u001a\u00020\u0015H\u0002J\u0014\u0010w\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0xH\u0002J\b\u0010y\u001a\u00020\u0004H\u0002J&\u0010z\u001a\u00020F2\b\u0010{\u001a\u0004\u0018\u00010|2\b\u0010}\u001a\u0004\u0018\u00010?2\b\u0010~\u001a\u0004\u0018\u00010%H\u0002J\u0018\u0010\u007f\u001a\u00020F2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u00020F0\u0081\u0001H\u0002J\t\u0010\u0082\u0001\u001a\u00020.H\u0002J\t\u0010\u0083\u0001\u001a\u00020.H\u0002J\t\u0010\u0084\u0001\u001a\u00020.H\u0002J\u0011\u0010\u0085\u0001\u001a\u00020.2\u0006\u0010Y\u001a\u00020\u0015H\u0002J'\u0010\u0086\u0001\u001a\u00020F2\u0007\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020\u00152\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0014J\t\u0010\u008b\u0001\u001a\u00020FH\u0016J\u0013\u0010\u008c\u0001\u001a\u00020F2\b\u0010{\u001a\u0004\u0018\u00010|H\u0014J\u0013\u0010\u008d\u0001\u001a\u00020.2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\u0013\u0010\u0090\u0001\u001a\u00020.2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0016J\u0011\u0010\u0093\u0001\u001a\u00020F2\u0006\u0010{\u001a\u00020|H\u0014J\u0012\u0010\u0094\u0001\u001a\u00020F2\u0007\u0010\u0095\u0001\u001a\u00020|H\u0014J\t\u0010\u0096\u0001\u001a\u00020FH\u0002J\t\u0010\u0097\u0001\u001a\u00020FH\u0002J\t\u0010\u0098\u0001\u001a\u00020FH\u0002J\u0012\u0010\u0099\u0001\u001a\u00020F2\u0007\u0010\u009a\u0001\u001a\u00020\u0015H\u0002J\u0011\u0010\u009b\u0001\u001a\u00020F2\u0006\u0010R\u001a\u00020*H\u0002J\u0012\u0010\u009c\u0001\u001a\u00020F2\u0007\u0010\u009d\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u009e\u0001\u001a\u00020FH\u0002J\t\u0010\u009f\u0001\u001a\u00020FH\u0002J\t\u0010 \u0001\u001a\u00020FH\u0002J\t\u0010¡\u0001\u001a\u00020FH\u0002J\t\u0010¢\u0001\u001a\u00020FH\u0002J\t\u0010£\u0001\u001a\u00020FH\u0002J\t\u0010¤\u0001\u001a\u00020FH\u0002J\t\u0010¥\u0001\u001a\u00020FH\u0002J(\u0010¦\u0001\u001a\u00020F2\u0007\u0010§\u0001\u001a\u00020\u00152\u0014\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020F0¨\u0001H\u0002J\t\u0010©\u0001\u001a\u00020FH\u0002J\t\u0010ª\u0001\u001a\u00020FH\u0002J\t\u0010«\u0001\u001a\u00020FH\u0002J\t\u0010¬\u0001\u001a\u00020FH\u0002J\t\u0010\u00ad\u0001\u001a\u00020FH\u0002J\t\u0010®\u0001\u001a\u00020FH\u0002J(\u0010¯\u0001\u001a\u00020F2\u0007\u0010§\u0001\u001a\u00020\u00152\u0014\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020F0¨\u0001H\u0002J\t\u0010°\u0001\u001a\u00020FH\u0002J\t\u0010±\u0001\u001a\u00020FH\u0002J\t\u0010²\u0001\u001a\u00020FH\u0002J\u0012\u0010³\u0001\u001a\u00020F2\u0007\u0010´\u0001\u001a\u00020.H\u0002J#\u0010µ\u0001\u001a\u00020F2\u0007\u0010¶\u0001\u001a\u00020\u00152\u0007\u0010·\u0001\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020.H\u0002J\u0012\u0010¸\u0001\u001a\u00020F2\u0007\u0010¹\u0001\u001a\u00020.H\u0002J\u001a\u0010º\u0001\u001a\u00020F2\u0007\u0010»\u0001\u001a\u00020L2\u0006\u0010G\u001a\u00020 H\u0002J\t\u0010¼\u0001\u001a\u00020FH\u0002J\t\u0010½\u0001\u001a\u00020FH\u0002J\t\u0010¾\u0001\u001a\u00020FH\u0002J\t\u0010¿\u0001\u001a\u00020FH\u0002J\t\u0010À\u0001\u001a\u00020FH\u0002J\u0014\u0010Á\u0001\u001a\u00020F2\t\u0010Â\u0001\u001a\u0004\u0018\u00010hH\u0002J\t\u0010Ã\u0001\u001a\u00020FH\u0002J\t\u0010Ä\u0001\u001a\u00020FH\u0002J\t\u0010Å\u0001\u001a\u00020FH\u0002J\t\u0010Æ\u0001\u001a\u00020FH\u0002J\t\u0010Ç\u0001\u001a\u00020FH\u0002J\t\u0010È\u0001\u001a\u00020FH\u0002J\t\u0010É\u0001\u001a\u00020FH\u0002J\t\u0010Ê\u0001\u001a\u00020FH\u0002J\u001c\u0010Ë\u0001\u001a\u00020F2\b\u0010Ì\u0001\u001a\u00030Í\u00012\u0007\u0010Î\u0001\u001a\u00020sH\u0002J\t\u0010Ï\u0001\u001a\u00020FH\u0002J\t\u0010Ð\u0001\u001a\u00020FH\u0002J\t\u0010Ñ\u0001\u001a\u00020FH\u0002J\t\u0010Ò\u0001\u001a\u00020FH\u0002J\t\u0010Ó\u0001\u001a\u00020FH\u0002J\t\u0010Ô\u0001\u001a\u00020FH\u0002J\t\u0010Õ\u0001\u001a\u00020FH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020 0\u001cj\b\u0012\u0004\u0012\u00020 `\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 0\u001cj\b\u0012\u0004\u0012\u00020 `\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\n 3*\u0004\u0018\u00010\u00040\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010=\u001a\u0012\u0012\u0004\u0012\u00020 0\u001cj\b\u0012\u0004\u0012\u00020 `\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0\u001cj\b\u0012\u0004\u0012\u00020?`\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ö\u0001"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/EventActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "()V", "ATTENDEES", "", "AVAILABILITY", "END_TS", "EVENT", "EVENT_CALENDAR_ID", "EVENT_TYPE_ID", "LAT_LON_PATTERN", "REMINDER_1_MINUTES", "REMINDER_1_TYPE", "REMINDER_2_MINUTES", "REMINDER_2_TYPE", "REMINDER_3_MINUTES", "REMINDER_3_TYPE", "REPEAT_INTERVAL", "REPEAT_LIMIT", "REPEAT_RULE", "SELECT_TIME_ZONE_INTENT", "", "START_TS", "endDateSetListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "endTimeSetListener", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "mAttendeeAutoCompleteViews", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/commons/views/MyAutoCompleteTextView;", "Lkotlin/collections/ArrayList;", "mAttendees", "Lcom/simplemobiletools/calendar/pro/models/Attendee;", "mAvailability", "mAvailableContacts", "mDialogTheme", "mEvent", "Lcom/simplemobiletools/calendar/pro/models/Event;", "mEventCalendarId", "mEventEndDateTime", "Lorg/joda/time/DateTime;", "mEventOccurrenceTS", "", "mEventStartDateTime", "mEventTypeId", "mIsAllDayEvent", "", "mLastSavePromptTS", "mOriginalEndTS", "mOriginalStartTS", "mOriginalTimeZone", "kotlin.jvm.PlatformType", "mReminder1Minutes", "mReminder1Type", "mReminder2Minutes", "mReminder2Type", "mReminder3Minutes", "mReminder3Type", "mRepeatInterval", "mRepeatLimit", "mRepeatRule", "mSelectedContacts", "mStoredEventTypes", "Lcom/simplemobiletools/calendar/pro/models/EventType;", "mWasActivityInitialized", "mWasCalendarChanged", "mWasContactsPermissionChecked", "startDateSetListener", "startTimeSetListener", "addAttendee", "", "attendee", "addDefValuesToNewEvent", "addSelectedAttendee", "autoCompleteView", "selectedAttendeeHolder", "Landroid/widget/RelativeLayout;", "checkAttendees", "checkNewAttendeeField", "checkReminderTexts", "checkRepeatRule", "checkRepeatTexts", "limit", "checkRepetitionLimitText", "checkRepetitionRuleText", "checkStartEndValidity", "dateSet", "year", "month", "day", "isStart", "deleteEvent", "duplicateEvent", "fillAvailableContacts", "getAllAttendees", "isSavingEvent", "getAttendeeStatusImage", "Landroid/graphics/drawable/Drawable;", "getAvailableMonthlyRepetitionRules", "Lcom/simplemobiletools/commons/models/RadioItem;", "getAvailableYearlyRepetitionRules", "getBaseString", "getCalendarId", "getCalendarWithId", "Lcom/simplemobiletools/calendar/pro/models/CalDAVCalendar;", "calendars", "", "calendarId", "getDayString", "getEmails", "getMonthlyRepetitionRuleText", "getNames", "getOrderString", "repeatRule", "getReminders", "Lcom/simplemobiletools/calendar/pro/models/Reminder;", "getRepeatXthDayInMonthString", "includeBase", "getRepeatXthDayString", "getStartEndTimes", "Lkotlin/Pair;", "getYearlyRepetitionRuleText", "gotEvent", "savedInstanceState", "Landroid/os/Bundle;", "localEventType", "event", "handleNotificationAvailability", "callback", "Lkotlin/Function0;", "isEventChanged", "isLastDayOfTheMonth", "isLastWeekDayOfMonth", "isMaleGender", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onBackPressed", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "resetTime", "saveCurrentEvent", "saveEvent", "setRepeatInterval", "interval", "setRepeatLimit", "setRepeatRule", "rule", "setupEditEvent", "setupEndDate", "setupEndTime", "setupNewEvent", "setupStartDate", "setupStartTime", "setupTimeZone", "shareEvent", "showAvailabilityPicker", "currentValue", "Lkotlin/Function1;", "showEditRepeatingEventDialog", "showEventTypeDialog", "showOnMap", "showReminder1Dialog", "showReminder2Dialog", "showReminder3Dialog", "showReminderTypePicker", "showRepeatIntervalDialog", "showRepetitionRuleDialog", "showRepetitionTypePicker", "storeEvent", "wasRepeatable", "timeSet", "hours", "minutes", "toggleAllDay", "isChecked", "updateAttendeeMe", "holder", "updateAttendees", "updateAvailabilityImage", "updateAvailabilityText", "updateCalDAVCalendar", "updateCalDAVVisibility", "updateCurrentCalendarInfo", "currentCalendar", "updateEndDateText", "updateEndTexts", "updateEndTimeText", "updateEventType", "updateIconColors", "updateReminder1Text", "updateReminder2Text", "updateReminder3Text", "updateReminderTypeImage", "view", "Landroid/widget/ImageView;", "reminder", "updateReminderTypeImages", "updateRepetitionText", "updateStartDateText", "updateStartTexts", "updateStartTimeText", "updateTexts", "updateTimeZoneText", "calendar_debug"}
)
public final class EventActivity extends SimpleActivity {
    private final String LAT_LON_PATTERN = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?)([,;])\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$";
    private final String EVENT = "EVENT";
    private final String START_TS = "START_TS";
    private final String END_TS = "END_TS";
    private final String REMINDER_1_MINUTES = "REMINDER_1_MINUTES";
    private final String REMINDER_2_MINUTES = "REMINDER_2_MINUTES";
    private final String REMINDER_3_MINUTES = "REMINDER_3_MINUTES";
    private final String REMINDER_1_TYPE = "REMINDER_1_TYPE";
    private final String REMINDER_2_TYPE = "REMINDER_2_TYPE";
    private final String REMINDER_3_TYPE = "REMINDER_3_TYPE";
    private final String REPEAT_INTERVAL = "REPEAT_INTERVAL";
    private final String REPEAT_LIMIT = "REPEAT_LIMIT";
    private final String REPEAT_RULE = "REPEAT_RULE";
    private final String ATTENDEES = "ATTENDEES";
    private final String AVAILABILITY = "AVAILABILITY";
    private final String EVENT_TYPE_ID = "EVENT_TYPE_ID";
    private final String EVENT_CALENDAR_ID = "EVENT_CALENDAR_ID";
    private final int SELECT_TIME_ZONE_INTENT = 1;
    private boolean mIsAllDayEvent;
    private int mReminder1Minutes = -1;
    private int mReminder2Minutes = -1;
    private int mReminder3Minutes = -1;
    private int mReminder1Type;
    private int mReminder2Type;
    private int mReminder3Type;
    private int mRepeatInterval;
    private long mRepeatLimit;
    private int mRepeatRule;
    private long mEventTypeId = 1L;
    private int mDialogTheme;
    private long mEventOccurrenceTS;
    private long mLastSavePromptTS;
    private int mEventCalendarId;
    private boolean mWasActivityInitialized;
    private boolean mWasContactsPermissionChecked;
    private boolean mWasCalendarChanged;
    private ArrayList mAttendees = new ArrayList();
    private ArrayList mAttendeeAutoCompleteViews = new ArrayList();
    private ArrayList mAvailableContacts = new ArrayList();
    private ArrayList mSelectedContacts = new ArrayList();
    private int mAvailability;
    private ArrayList mStoredEventTypes = new ArrayList();
    private String mOriginalTimeZone;
    private long mOriginalStartTS;
    private long mOriginalEndTS;
    private DateTime mEventStartDateTime;
    private DateTime mEventEndDateTime;
    private Event mEvent;
    private final OnDateSetListener startDateSetListener;
    private final OnTimeSetListener startTimeSetListener;
    private final OnDateSetListener endDateSetListener;
    private final OnTimeSetListener endTimeSetListener;
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300203);
        if (!ActivityKt.checkAppSideloading(this)) {
            ActionBar var10000 = this.getSupportActionBar();
            if (var10000 != null) {
                var10000.setHomeAsUpIndicator(700008);
            }

            Intent var5 = this.getIntent();
            if (var5 != null) {
                Intent intent = var5;
                this.mDialogTheme = ContextKt.getDialogTheme(this);
                this.mWasContactsPermissionChecked = ContextKt.hasPermission(this, 5);
                final long eventId = intent.getLongExtra("event_id", 0L);
                ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        EventActivity var10000 = EventActivity.this;
                        List var10001 = CollectionsKt.toMutableList((Collection)com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventTypesDB(EventActivity.this).getEventTypes());
                        if (var10001 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.simplemobiletools.calendar.pro.models.EventType> /* = java.util.ArrayList<com.simplemobiletools.calendar.pro.models.EventType> */");
                        } else {
                            var10000.mStoredEventTypes = (ArrayList)var10001;
                            final Event event = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsDB(EventActivity.this).getEventWithId(eventId);
                            if (eventId != 0L && event == null) {
                                EventActivity.this.finish();
                            } else {
                                Iterable $this$firstOrNull$iv = (Iterable)EventActivity.this.mStoredEventTypes;
                                int $i$f$firstOrNull = false;
                                Iterator var5 = $this$firstOrNull$iv.iterator();

                                Object var13;
                                while(true) {
                                    if (!var5.hasNext()) {
                                        var13 = null;
                                        break;
                                    }

                                    Object element$iv;
                                    boolean var12;
                                    label32: {
                                        element$iv = var5.next();
                                        EventType it = (EventType)element$iv;
                                        int var8 = false;
                                        Long var11 = it.getId();
                                        long var9 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).getLastUsedLocalEventTypeId();
                                        if (var11 != null) {
                                            if (var11 == var9) {
                                                var12 = true;
                                                break label32;
                                            }
                                        }

                                        var12 = false;
                                    }

                                    if (var12) {
                                        var13 = element$iv;
                                        break;
                                    }
                                }

                                final EventType localEventType = (EventType)var13;
                                EventActivity.this.runOnUiThread((Runnable)(new Runnable() {
                                    public final void run() {
                                        if (!EventActivity.this.isDestroyed() && !EventActivity.this.isFinishing()) {
                                            EventActivity.this.gotEvent(savedInstanceState, localEventType, event);
                                        }

                                    }
                                }));
                            }
                        }
                    }
                }));
            }
        }
    }

    private final void gotEvent(Bundle savedInstanceState, EventType localEventType, Event event) {
        if (localEventType == null || localEventType.getCaldavCalendarId() != 0) {
            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setLastUsedLocalEventTypeId(1L);
        }

        this.mEventTypeId = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultEventTypeId() == -1L ? com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getLastUsedLocalEventTypeId() : com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultEventTypeId();
        boolean var6;
        Event var10;
        if (event != null) {
            this.mEvent = event;
            this.mEventOccurrenceTS = this.getIntent().getLongExtra("event_occurrence_ts", 0L);
            if (savedInstanceState == null) {
                this.setupEditEvent();
            }

            if (this.getIntent().getBooleanExtra("is_duplicate_intent", false)) {
                Event var10000 = this.mEvent;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                var10000.setId((Long)null);
                String var10001 = this.getString(1900995);
                Intrinsics.checkNotNullExpressionValue(var10001, "getString(R.string.new_event)");
                ActivityKt.updateActionBarTitle$default(this, var10001, 0, 2, (Object)null);
            } else {
                var10 = this.mEvent;
                if (var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                Long var11 = var10.getId();
                Intrinsics.checkNotNull(var11);
                com.simplemobiletools.calendar.pro.extensions.ContextKt.cancelNotification(this, var11);
            }
        } else {
            this.mEvent = new Event((Long)null, 0L, 0L, (String)null, (String)null, (String)null, 0, 0, 0, 0, 0, 0, 0, 0, 0L, (ArrayList)null, (String)null, (String)null, (String)null, 0, 0L, 0L, 0L, (String)null, 0, 0, 67108862, (DefaultConstructorMarker)null);
            Config var4 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this);
            var6 = false;
            this.mReminder1Minutes = var4.getUsePreviousEventReminders() && var4.getLastEventReminderMinutes1() >= -1 ? var4.getLastEventReminderMinutes1() : var4.getDefaultReminder1();
            this.mReminder2Minutes = var4.getUsePreviousEventReminders() && var4.getLastEventReminderMinutes2() >= -1 ? var4.getLastEventReminderMinutes2() : var4.getDefaultReminder2();
            this.mReminder3Minutes = var4.getUsePreviousEventReminders() && var4.getLastEventReminderMinutes3() >= -1 ? var4.getLastEventReminderMinutes3() : var4.getDefaultReminder3();
            if (savedInstanceState == null) {
                this.setupNewEvent();
            }
        }

        if (savedInstanceState == null) {
            this.updateTexts();
            this.updateEventType();
            this.updateCalDAVCalendar();
        }

        ((ImageView)this._$_findCachedViewById(id.event_show_on_map)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showOnMap();
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_start_date)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.setupStartDate();
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_start_time)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.setupStartTime();
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_end_date)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.setupEndDate();
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_end_time)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.setupEndTime();
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_time_zone)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.setupTimeZone();
            }
        }));
        ((MyAppCompatCheckbox)this._$_findCachedViewById(id.event_all_day)).setOnCheckedChangeListener((OnCheckedChangeListener)(new OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                EventActivity.this.toggleAllDay(isChecked);
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_repetition)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showRepeatIntervalDialog();
            }
        }));
        ((RelativeLayout)this._$_findCachedViewById(id.event_repetition_rule_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showRepetitionRuleDialog();
            }
        }));
        ((RelativeLayout)this._$_findCachedViewById(id.event_repetition_limit_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showRepetitionTypePicker();
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_reminder_1)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.handleNotificationAvailability((Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).getWasAlarmWarningShown()) {
                            EventActivity.this.showReminder1Dialog();
                        } else {
                            new ConfirmationDialog((Activity)EventActivity.this, (String)null, 1900095, 1900829, 0, false, (Function0)(new Function0() {
                                // $FF: synthetic method
                                // $FF: bridge method
                                public Object invoke() {
                                    this.invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).setWasAlarmWarningShown(true);
                                    EventActivity.this.showReminder1Dialog();
                                }
                            }), 34, (DefaultConstructorMarker)null);
                        }

                    }
                }));
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_reminder_2)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showReminder2Dialog();
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_reminder_3)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showReminder3Dialog();
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.event_reminder_1_type)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showReminderTypePicker(EventActivity.this.mReminder1Type, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        EventActivity.this.mReminder1Type = it;
                        EventActivity var10000 = EventActivity.this;
                        ImageView var10001 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_reminder_1_type);
                        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_1_type");
                        var10000.updateReminderTypeImage(var10001, new Reminder(EventActivity.this.mReminder1Minutes, EventActivity.this.mReminder1Type));
                    }
                }));
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.event_reminder_2_type)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showReminderTypePicker(EventActivity.this.mReminder2Type, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        EventActivity.this.mReminder2Type = it;
                        EventActivity var10000 = EventActivity.this;
                        ImageView var10001 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_reminder_2_type);
                        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_2_type");
                        var10000.updateReminderTypeImage(var10001, new Reminder(EventActivity.this.mReminder2Minutes, EventActivity.this.mReminder2Type));
                    }
                }));
            }
        }));
        ((ImageView)this._$_findCachedViewById(id.event_reminder_3_type)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showReminderTypePicker(EventActivity.this.mReminder3Type, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        EventActivity.this.mReminder3Type = it;
                        EventActivity var10000 = EventActivity.this;
                        ImageView var10001 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_reminder_3_type);
                        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_3_type");
                        var10000.updateReminderTypeImage(var10001, new Reminder(EventActivity.this.mReminder3Minutes, EventActivity.this.mReminder3Type));
                    }
                }));
            }
        }));
        ((MyTextView)this._$_findCachedViewById(id.event_availability)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showAvailabilityPicker(EventActivity.this.mAvailability, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(((Number)var1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int it) {
                        EventActivity.this.mAvailability = it;
                        EventActivity.this.updateAvailabilityText();
                        EventActivity.this.updateAvailabilityImage();
                    }
                }));
            }
        }));
        ((RelativeLayout)this._$_findCachedViewById(id.event_type_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EventActivity.this.showEventTypeDialog();
            }
        }));
        MyAppCompatCheckbox var7 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.event_all_day);
        var6 = false;
        var10 = this.mEvent;
        if (var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var7.setChecked((var10.getFlags() & 1) != 0);
        var7.jumpDrawablesToCurrentState();
        ((RelativeLayout)this._$_findCachedViewById(id.event_all_day_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                ((MyAppCompatCheckbox)EventActivity.this._$_findCachedViewById(id.event_all_day)).toggle();
            }
        }));
        ScrollView var12 = (ScrollView)this._$_findCachedViewById(id.event_scrollview);
        Intrinsics.checkNotNullExpressionValue(var12, "event_scrollview");
        ContextKt.updateTextColors$default(this, (ViewGroup)var12, 0, 0, 6, (Object)null);
        this.updateIconColors();
        ImageView var8 = (ImageView)this._$_findCachedViewById(id.event_time_zone_image);
        Intrinsics.checkNotNullExpressionValue(var8, "event_time_zone_image");
        ViewKt.beVisibleIf((View)var8, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getAllowChangingTimeZones());
        MyTextView var9 = (MyTextView)this._$_findCachedViewById(id.event_time_zone);
        Intrinsics.checkNotNullExpressionValue(var9, "event_time_zone");
        ViewKt.beVisibleIf((View)var9, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getAllowChangingTimeZones());
        this.mWasActivityInitialized = true;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.getMenuInflater().inflate(1400005, menu);
        if (this.mWasActivityInitialized) {
            MenuItem var10000 = menu.findItem(1000983);
            Intrinsics.checkNotNullExpressionValue(var10000, "menu.findItem(R.id.delete)");
            Event var10001 = this.mEvent;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            var10000.setVisible(var10001.getId() != null);
            var10000 = menu.findItem(1000213);
            Intrinsics.checkNotNullExpressionValue(var10000, "menu.findItem(R.id.share)");
            var10001 = this.mEvent;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            var10000.setVisible(var10001.getId() != null);
            var10000 = menu.findItem(1000466);
            Intrinsics.checkNotNullExpressionValue(var10000, "menu.findItem(R.id.duplicate)");
            var10001 = this.mEvent;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            var10000.setVisible(var10001.getId() != null);
        }

        BaseSimpleActivity.updateMenuItemColors$default(this, menu, false, 0, 6, (Object)null);
        return true;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        switch(item.getItemId()) {
            case 1000198:
                this.saveCurrentEvent();
                break;
            case 1000213:
                this.shareEvent();
                break;
            case 1000466:
                this.duplicateEvent();
                break;
            case 1000983:
                this.deleteEvent();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private final Pair getStartEndTimes() {
        long var9;
        label38: {
            if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getAllowChangingTimeZones()) {
                Event var10000 = this.mEvent;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                if (!StringsKt.equals(var10000.getTimeZoneString(), this.mOriginalTimeZone, true)) {
                    String var10 = this.mOriginalTimeZone;
                    Intrinsics.checkNotNullExpressionValue(var10, "mOriginalTimeZone");
                    CharSequence var4 = (CharSequence)var10;
                    if (var4.length() == 0) {
                        DateTimeZone var11 = DateTimeZone.getDefault();
                        Intrinsics.checkNotNullExpressionValue(var11, "DateTimeZone.getDefault()");
                        var10 = var11.getID();
                    } else {
                        var10 = this.mOriginalTimeZone;
                    }

                    String original = var10;
                    long millis = System.currentTimeMillis();
                    var10000 = this.mEvent;
                    if (var10000 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    var9 = (long)(DateTimeZone.forID(var10000.getTimeZoneString()).getOffset(millis) - DateTimeZone.forID(original).getOffset(millis)) / 1000L;
                    break label38;
                }
            }

            var9 = 0L;
        }

        long offset = var9;
        DateTime var12 = this.mEventStartDateTime;
        if (var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var12 = var12.withSecondOfMinute(0).withMillisOfSecond(0);
        Intrinsics.checkNotNullExpressionValue(var12, "mEventStartDateTime.with…(0).withMillisOfSecond(0)");
        long newStartTS = DateTimeKt.seconds(var12) - offset;
        var12 = this.mEventEndDateTime;
        if (var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        var12 = var12.withSecondOfMinute(0).withMillisOfSecond(0);
        Intrinsics.checkNotNullExpressionValue(var12, "mEventEndDateTime.withSe…(0).withMillisOfSecond(0)");
        long newEndTS = DateTimeKt.seconds(var12) - offset;
        return new Pair(newStartTS, newEndTS);
    }

    private final ArrayList getReminders() {
        ArrayList reminders = CollectionsKt.arrayListOf(new Reminder[]{new Reminder(this.mReminder1Minutes, this.mReminder1Type), new Reminder(this.mReminder2Minutes, this.mReminder2Type), new Reminder(this.mReminder3Minutes, this.mReminder3Type)});
        Iterable $this$sortedBy$iv = (Iterable)reminders;
        int $i$f$sortedBy = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var7 = $this$sortedBy$iv.iterator();

        while(var7.hasNext()) {
            Object element$iv$iv = var7.next();
            Reminder it = (Reminder)element$iv$iv;
            int var10 = false;
            if (it.getMinutes() != -1) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        $this$sortedBy$iv = (Iterable)((List)destination$iv$iv);
        $i$f$sortedBy = false;
        boolean var4 = false;
        List var10000 = CollectionsKt.toMutableList((Collection)CollectionsKt.sortedWith($this$sortedBy$iv, (Comparator)(new EventActivity$getReminders$$inlined$sortedBy$1())));
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.simplemobiletools.calendar.pro.models.Reminder> /* = java.util.ArrayList<com.simplemobiletools.calendar.pro.models.Reminder> */");
        } else {
            reminders = (ArrayList)var10000;
            return reminders;
        }
    }

    private final boolean isEventChanged() {
        if (((EventActivity)this).mEvent == null) {
            return false;
        } else {
            long newStartTS = 0L;
            long newEndTS = 0L;
            Pair var1 = this.getStartEndTimes();
            int var3 = false;
            newStartTS = ((Number)var1.getFirst()).longValue();
            newEndTS = ((Number)var1.getSecond()).longValue();
            boolean var9;
            if (this.mOriginalStartTS == 0L) {
                label91: {
                    Event var10000 = this.mEvent;
                    if (var10000 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    if (var10000.getStartTS() == newStartTS) {
                        var10000 = this.mEvent;
                        if (var10000 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                        }

                        if (var10000.getEndTS() == newEndTS) {
                            var9 = false;
                            break label91;
                        }
                    }

                    var9 = true;
                }
            } else {
                var9 = this.mOriginalStartTS != newStartTS || this.mOriginalEndTS != newEndTS;
            }

            boolean hasTimeChanged = var9;
            ArrayList reminders = this.getReminders();
            MyEditText var10 = (MyEditText)this._$_findCachedViewById(id.event_title);
            Intrinsics.checkNotNullExpressionValue(var10, "event_title");
            String var11 = var10.getText().toString();
            Event var10001 = this.mEvent;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            if (!(Intrinsics.areEqual(var11, var10001.getTitle()) ^ true)) {
                var10 = (MyEditText)this._$_findCachedViewById(id.event_location);
                Intrinsics.checkNotNullExpressionValue(var10, "event_location");
                var11 = var10.getText().toString();
                var10001 = this.mEvent;
                if (var10001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                if (!(Intrinsics.areEqual(var11, var10001.getLocation()) ^ true)) {
                    var10 = (MyEditText)this._$_findCachedViewById(id.event_description);
                    Intrinsics.checkNotNullExpressionValue(var10, "event_description");
                    var11 = var10.getText().toString();
                    var10001 = this.mEvent;
                    if (var10001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    if (!(Intrinsics.areEqual(var11, var10001.getDescription()) ^ true)) {
                        MyTextView var12 = (MyTextView)this._$_findCachedViewById(id.event_time_zone);
                        Intrinsics.checkNotNullExpressionValue(var12, "event_time_zone");
                        CharSequence var13 = var12.getText();
                        var10001 = this.mEvent;
                        if (var10001 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                        }

                        if (!(Intrinsics.areEqual(var13, var10001.getTimeZoneString()) ^ true)) {
                            var10001 = this.mEvent;
                            if (var10001 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                            }

                            if (!(Intrinsics.areEqual(reminders, var10001.getReminders()) ^ true)) {
                                int var14 = this.mRepeatInterval;
                                var10001 = this.mEvent;
                                if (var10001 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                                }

                                if (var14 == var10001.getRepeatInterval()) {
                                    var14 = this.mRepeatRule;
                                    var10001 = this.mEvent;
                                    if (var10001 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                                    }

                                    if (var14 == var10001.getRepeatRule()) {
                                        long var15 = this.mEventTypeId;
                                        var10001 = this.mEvent;
                                        if (var10001 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                                        }

                                        if (var15 == var10001.getEventType() && !this.mWasCalendarChanged && !hasTimeChanged) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            return true;
        }
    }

    public void onBackPressed() {
        if (System.currentTimeMillis() - this.mLastSavePromptTS > 1000L && this.isEventChanged()) {
            this.mLastSavePromptTS = System.currentTimeMillis();
            new ConfirmationAdvancedDialog((Activity)this, "", 1900349, 1900180, 1900409, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((Boolean)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean it) {
                    if (it) {
                        EventActivity.this.saveCurrentEvent();
                    } else {
                        EventActivity.super.onBackPressed();
                    }

                }
            }));
        } else {
            super.onBackPressed();
        }

    }

    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.mWasActivityInitialized) {
            int var4 = false;
            String var10001 = this.EVENT;
            Event var10002 = this.mEvent;
            if (var10002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            outState.putSerializable(var10001, (Serializable)var10002);
            var10001 = this.START_TS;
            DateTime var5 = this.mEventStartDateTime;
            if (var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
            }

            outState.putLong(var10001, DateTimeKt.seconds(var5));
            var10001 = this.END_TS;
            var5 = this.mEventEndDateTime;
            if (var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
            }

            outState.putLong(var10001, DateTimeKt.seconds(var5));
            var10002 = this.mEvent;
            if (var10002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            outState.putString("time_zone", var10002.getTimeZone());
            outState.putInt(this.REMINDER_1_MINUTES, this.mReminder1Minutes);
            outState.putInt(this.REMINDER_2_MINUTES, this.mReminder2Minutes);
            outState.putInt(this.REMINDER_3_MINUTES, this.mReminder3Minutes);
            outState.putInt(this.REMINDER_1_TYPE, this.mReminder1Type);
            outState.putInt(this.REMINDER_2_TYPE, this.mReminder2Type);
            outState.putInt(this.REMINDER_3_TYPE, this.mReminder3Type);
            outState.putInt(this.REPEAT_INTERVAL, this.mRepeatInterval);
            outState.putInt(this.REPEAT_RULE, this.mRepeatRule);
            outState.putLong(this.REPEAT_LIMIT, this.mRepeatLimit);
            outState.putString(this.ATTENDEES, this.getAllAttendees(false));
            outState.putInt(this.AVAILABILITY, this.mAvailability);
            outState.putLong(this.EVENT_TYPE_ID, this.mEventTypeId);
            outState.putInt(this.EVENT_CALENDAR_ID, this.mEventCalendarId);
        }
    }

    protected void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        if (!savedInstanceState.containsKey(this.START_TS)) {
            this.finish();
        } else {
            int var4 = false;
            Serializable var10001 = savedInstanceState.getSerializable(this.EVENT);
            if (var10001 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.calendar.pro.models.Event");
            } else {
                this.mEvent = (Event)var10001;
                this.mEventStartDateTime = Formatter.INSTANCE.getDateTimeFromTS(savedInstanceState.getLong(this.START_TS));
                this.mEventEndDateTime = Formatter.INSTANCE.getDateTimeFromTS(savedInstanceState.getLong(this.END_TS));
                Event var10000 = this.mEvent;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                String var6 = savedInstanceState.getString("time_zone");
                if (var6 == null) {
                    TimeZone var7 = TimeZone.getDefault();
                    Intrinsics.checkNotNullExpressionValue(var7, "TimeZone.getDefault()");
                    var6 = var7.getID();
                    Intrinsics.checkNotNullExpressionValue(var6, "TimeZone.getDefault().id");
                }

                var10000.setTimeZone(var6);
                this.mReminder1Minutes = savedInstanceState.getInt(this.REMINDER_1_MINUTES);
                this.mReminder2Minutes = savedInstanceState.getInt(this.REMINDER_2_MINUTES);
                this.mReminder3Minutes = savedInstanceState.getInt(this.REMINDER_3_MINUTES);
                this.mReminder1Type = savedInstanceState.getInt(this.REMINDER_1_TYPE);
                this.mReminder2Type = savedInstanceState.getInt(this.REMINDER_2_TYPE);
                this.mReminder3Type = savedInstanceState.getInt(this.REMINDER_3_TYPE);
                this.mAvailability = savedInstanceState.getInt(this.AVAILABILITY);
                this.mRepeatInterval = savedInstanceState.getInt(this.REPEAT_INTERVAL);
                this.mRepeatRule = savedInstanceState.getInt(this.REPEAT_RULE);
                this.mRepeatLimit = savedInstanceState.getLong(this.REPEAT_LIMIT);
                Type token = (new EventActivity$onRestoreInstanceState$1$token$1()).getType();
                ArrayList var8 = (ArrayList)(new Gson()).fromJson(savedInstanceState.getString(this.ATTENDEES), token);
                if (var8 == null) {
                    var8 = new ArrayList();
                }

                this.mAttendees = var8;
                this.mEventTypeId = savedInstanceState.getLong(this.EVENT_TYPE_ID);
                this.mEventCalendarId = savedInstanceState.getInt(this.EVENT_CALENDAR_ID);
                this.checkRepeatTexts(this.mRepeatInterval);
                this.checkRepeatRule();
                this.updateTexts();
                this.updateEventType();
                this.updateCalDAVCalendar();
                this.checkAttendees();
            }
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent resultData) {
        if (requestCode == this.SELECT_TIME_ZONE_INTENT && resultCode == -1) {
            if (resultData != null) {
                if (resultData.hasExtra("time_zone")) {
                    Serializable var10000 = resultData.getSerializableExtra("time_zone");
                    if (var10000 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.calendar.pro.models.MyTimeZone");
                    }

                    MyTimeZone timeZone = (MyTimeZone)var10000;
                    Event var5 = this.mEvent;
                    if (var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    var5.setTimeZone(timeZone.getZoneName());
                    this.updateTimeZoneText();
                }
            }
        }

        super.onActivityResult(requestCode, resultCode, resultData);
    }

    private final void updateTexts() {
        this.updateRepetitionText();
        this.checkReminderTexts();
        this.updateStartTexts();
        this.updateEndTexts();
        this.updateTimeZoneText();
        this.updateCalDAVVisibility();
        this.updateAvailabilityText();
        this.updateAvailabilityImage();
    }

    private final void setupEditEvent() {
        long var9;
        Event var10000;
        if (this.mEventOccurrenceTS == 0L) {
            var10000 = this.mEvent;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            var9 = var10000.getStartTS();
        } else {
            var9 = this.mEventOccurrenceTS;
        }

        long realStart = var9;
        var10000 = this.mEvent;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var9 = var10000.getEndTS();
        Event var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        long duration = var9 - var10001.getStartTS();
        this.mOriginalStartTS = realStart;
        this.mOriginalEndTS = realStart + duration;
        this.getWindow().setSoftInputMode(3);
        String var10 = this.getString(1900488);
        Intrinsics.checkNotNullExpressionValue(var10, "getString(R.string.edit_event)");
        ActivityKt.updateActionBarTitle$default(this, var10, 0, 2, (Object)null);
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mOriginalTimeZone = var10001.getTimeZone();
        if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getAllowChangingTimeZones()) {
            try {
                DateTime var12 = Formatter.INSTANCE.getDateTimeFromTS(realStart).withZone(DateTimeZone.forID(this.mOriginalTimeZone));
                Intrinsics.checkNotNullExpressionValue(var12, "Formatter.getDateTimeFro…forID(mOriginalTimeZone))");
                this.mEventStartDateTime = var12;
                var12 = Formatter.INSTANCE.getDateTimeFromTS(realStart + duration).withZone(DateTimeZone.forID(this.mOriginalTimeZone));
                Intrinsics.checkNotNullExpressionValue(var12, "Formatter.getDateTimeFro…forID(mOriginalTimeZone))");
                this.mEventEndDateTime = var12;
            } catch (Exception var6) {
                ContextKt.showErrorToast$default(this, var6, 0, 2, (Object)null);
                this.mEventStartDateTime = Formatter.INSTANCE.getDateTimeFromTS(realStart);
                this.mEventEndDateTime = Formatter.INSTANCE.getDateTimeFromTS(realStart + duration);
            }
        } else {
            this.mEventStartDateTime = Formatter.INSTANCE.getDateTimeFromTS(realStart);
            this.mEventEndDateTime = Formatter.INSTANCE.getDateTimeFromTS(realStart + duration);
        }

        MyEditText var11 = (MyEditText)this._$_findCachedViewById(id.event_title);
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var11.setText((CharSequence)var10001.getTitle());
        var11 = (MyEditText)this._$_findCachedViewById(id.event_location);
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var11.setText((CharSequence)var10001.getLocation());
        var11 = (MyEditText)this._$_findCachedViewById(id.event_description);
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var11.setText((CharSequence)var10001.getDescription());
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mReminder1Minutes = var10001.getReminder1Minutes();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mReminder2Minutes = var10001.getReminder2Minutes();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mReminder3Minutes = var10001.getReminder3Minutes();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mReminder1Type = var10001.getReminder1Type();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mReminder2Type = var10001.getReminder2Type();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mReminder3Type = var10001.getReminder3Type();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mRepeatInterval = var10001.getRepeatInterval();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mRepeatLimit = var10001.getRepeatLimit();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mRepeatRule = var10001.getRepeatRule();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mEventTypeId = var10001.getEventType();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mEventCalendarId = var10001.getCalDAVCalendarId();
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        this.mAvailability = var10001.getAvailability();
        Type token = (new TypeToken() {
        }).getType();
        Gson var7 = new Gson();
        Event var10002 = this.mEvent;
        if (var10002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        ArrayList var8 = (ArrayList)var7.fromJson(var10002.getAttendees(), token);
        if (var8 == null) {
            var8 = new ArrayList();
        }

        this.mAttendees = var8;
        this.checkRepeatTexts(this.mRepeatInterval);
        this.checkAttendees();
    }

    private final void setupNewEvent() {
        this.getWindow().setSoftInputMode(5);
        ((MyEditText)this._$_findCachedViewById(id.event_title)).requestFocus();
        String var10001 = this.getString(1900995);
        Intrinsics.checkNotNullExpressionValue(var10001, "getString(R.string.new_event)");
        ActivityKt.updateActionBarTitle$default(this, var10001, 0, 2, (Object)null);
        if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultEventTypeId() != -1L) {
            Config var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this);
            Iterable $this$firstOrNull$iv = (Iterable)this.mStoredEventTypes;
            Config var9 = var10000;
            int $i$f$firstOrNull = false;
            Iterator var3 = $this$firstOrNull$iv.iterator();

            Object var20;
            while(true) {
                if (!var3.hasNext()) {
                    var20 = null;
                    break;
                }

                Object element$iv;
                boolean var18;
                label86: {
                    element$iv = var3.next();
                    EventType it = (EventType)element$iv;
                    int var6 = false;
                    Long var17 = it.getId();
                    long var7 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultEventTypeId();
                    if (var17 != null) {
                        if (var17 == var7) {
                            var18 = true;
                            break label86;
                        }
                    }

                    var18 = false;
                }

                if (var18) {
                    var20 = element$iv;
                    break;
                }
            }

            Object var10 = var20;
            var9.setLastUsedCaldavCalendarId((EventType)var10 != null ? ((EventType)var10).getCaldavCalendarId() : 0);
        }

        label97: {
            boolean isLastCaldavCalendarOK = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync() && com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getSyncedCalendarIdsAsList().contains(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getLastUsedCaldavCalendarId());
            this.mEventCalendarId = isLastCaldavCalendarOK ? com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getLastUsedCaldavCalendarId() : 0;
            Intent var22 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(var22, "intent");
            long startTS;
            if (!Intrinsics.areEqual(var22.getAction(), "android.intent.action.EDIT")) {
                var22 = this.getIntent();
                Intrinsics.checkNotNullExpressionValue(var22, "intent");
                if (!Intrinsics.areEqual(var22.getAction(), "android.intent.action.INSERT")) {
                    startTS = this.getIntent().getLongExtra("new_event_start_ts", 0L);
                    DateTime dateTime = Formatter.INSTANCE.getDateTimeFromTS(startTS);
                    this.mEventStartDateTime = dateTime;
                    int var27;
                    if (this.getIntent().getBooleanExtra("new_event_set_hour_duration", false)) {
                        DateTime var26 = this.mEventStartDateTime;
                        if (var26 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                        }

                        var27 = var26.getHourOfDay() == 23 ? 59 : 60;
                    } else {
                        var27 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getDefaultDuration();
                    }

                    int addMinutes = var27;
                    DateTime var21 = this.mEventStartDateTime;
                    if (var21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                    }

                    var21 = var21.plusMinutes(addMinutes);
                    Intrinsics.checkNotNullExpressionValue(var21, "mEventStartDateTime.plusMinutes(addMinutes)");
                    this.mEventEndDateTime = var21;
                    break label97;
                }
            }

            startTS = this.getIntent().getLongExtra("beginTime", System.currentTimeMillis()) / 1000L;
            this.mEventStartDateTime = Formatter.INSTANCE.getDateTimeFromTS(startTS);
            long endTS = this.getIntent().getLongExtra("endTime", System.currentTimeMillis()) / 1000L;
            this.mEventEndDateTime = Formatter.INSTANCE.getDateTimeFromTS(endTS);
            if (this.getIntent().getBooleanExtra("allDay", false)) {
                Event var23 = this.mEvent;
                if (var23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                Event var19 = this.mEvent;
                if (var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                var23.setFlags(var19.getFlags() | 1);
                MyAppCompatCheckbox var24 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.event_all_day);
                Intrinsics.checkNotNullExpressionValue(var24, "event_all_day");
                var24.setChecked(true);
                this.toggleAllDay(true);
            }

            ((MyEditText)this._$_findCachedViewById(id.event_title)).setText((CharSequence)this.getIntent().getStringExtra("title"));
            ((MyEditText)this._$_findCachedViewById(id.event_location)).setText((CharSequence)this.getIntent().getStringExtra("eventLocation"));
            ((MyEditText)this._$_findCachedViewById(id.event_description)).setText((CharSequence)this.getIntent().getStringExtra("description"));
            MyEditText var25 = (MyEditText)this._$_findCachedViewById(id.event_description);
            Intrinsics.checkNotNullExpressionValue(var25, "event_description");
            CharSequence var16 = (CharSequence)EditTextKt.getValue((EditText)var25);
            if (var16.length() > 0) {
                var25 = (MyEditText)this._$_findCachedViewById(id.event_description);
                Intrinsics.checkNotNullExpressionValue(var25, "event_description");
                var25.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }

        this.addDefValuesToNewEvent();
        this.checkAttendees();
    }

    private final void addDefValuesToNewEvent() {
        long newStartTS = 0L;
        long newEndTS = 0L;
        Pair var1 = this.getStartEndTimes();
        int var3 = false;
        newStartTS = ((Number)var1.getFirst()).longValue();
        newEndTS = ((Number)var1.getSecond()).longValue();
        Event var10000 = this.mEvent;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        Event var8 = var10000;
        var3 = false;
        var8.setStartTS(newStartTS);
        var8.setEndTS(newEndTS);
        var8.setReminder1Minutes(this.mReminder1Minutes);
        var8.setReminder1Type(this.mReminder1Type);
        var8.setReminder2Minutes(this.mReminder2Minutes);
        var8.setReminder2Type(this.mReminder2Type);
        var8.setReminder3Minutes(this.mReminder3Minutes);
        var8.setReminder3Type(this.mReminder3Type);
        var8.setEventType(this.mEventTypeId);
    }

    private final void checkAttendees() {
        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                EventActivity.this.fillAvailableContacts();
                EventActivity.this.updateAttendees();
            }
        }));
    }

    private final void handleNotificationAvailability(final Function0 callback) {
        if (NotificationManagerCompat.from(this.getApplicationContext()).areNotificationsEnabled()) {
            callback.invoke();
        } else {
            new ConfirmationDialog((Activity)this, (String)null, 1900227, 1900829, 0, false, (Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    callback.invoke();
                }
            }), 34, (DefaultConstructorMarker)null);
        }

    }

    private final void showReminder1Dialog() {
        ActivityKt.showPickSecondsDialogHelper$default(this, this.mReminder1Minutes, false, false, this.mIsAllDayEvent, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                EventActivity.this.mReminder1Minutes = it != -1 && it != 0 ? it / 60 : it;
                EventActivity.this.checkReminderTexts();
            }
        }), 22, (Object)null);
    }

    private final void showReminder2Dialog() {
        ActivityKt.showPickSecondsDialogHelper$default(this, this.mReminder2Minutes, false, false, this.mIsAllDayEvent, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                EventActivity.this.mReminder2Minutes = it != -1 && it != 0 ? it / 60 : it;
                EventActivity.this.checkReminderTexts();
            }
        }), 22, (Object)null);
    }

    private final void showReminder3Dialog() {
        ActivityKt.showPickSecondsDialogHelper$default(this, this.mReminder3Minutes, false, false, this.mIsAllDayEvent, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                EventActivity.this.mReminder3Minutes = it != -1 && it != 0 ? it / 60 : it;
                EventActivity.this.checkReminderTexts();
            }
        }), 22, (Object)null);
    }

    private final void showRepeatIntervalDialog() {
        com.simplemobiletools.calendar.pro.extensions.ActivityKt.showEventRepeatIntervalDialog(this, this.mRepeatInterval, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                EventActivity.this.setRepeatInterval(it);
            }
        }));
    }

    private final void setRepeatInterval(int interval) {
        this.mRepeatInterval = interval;
        this.updateRepetitionText();
        this.checkRepeatTexts(interval);
        if (IntKt.isXWeeklyRepetition(this.mRepeatInterval)) {
            DateTime var10002 = this.mEventStartDateTime;
            if (var10002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
            }

            this.setRepeatRule((int)Math.pow(2.0D, (double)(var10002.getDayOfWeek() - 1)));
        } else if (IntKt.isXMonthlyRepetition(this.mRepeatInterval)) {
            this.setRepeatRule(1);
        } else if (IntKt.isXYearlyRepetition(this.mRepeatInterval)) {
            this.setRepeatRule(1);
        }

    }

    private final void checkRepeatTexts(int limit) {
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.event_repetition_limit_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_limit_holder");
        ViewKt.beGoneIf((View)var10000, limit == 0);
        this.checkRepetitionLimitText();
        var10000 = (RelativeLayout)this._$_findCachedViewById(id.event_repetition_rule_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_rule_holder");
        ViewKt.beVisibleIf((View)var10000, IntKt.isXWeeklyRepetition(this.mRepeatInterval) || IntKt.isXMonthlyRepetition(this.mRepeatInterval) || IntKt.isXYearlyRepetition(this.mRepeatInterval));
        this.checkRepetitionRuleText();
    }

    private final void showRepetitionTypePicker() {
        ActivityKt.hideKeyboard(this);
        RepeatLimitTypePickerDialog var10001 = new RepeatLimitTypePickerDialog;
        Activity var10002 = (Activity)this;
        long var10003 = this.mRepeatLimit;
        DateTime var10004 = this.mEventStartDateTime;
        if (var10004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var10001.<init>(var10002, var10003, DateTimeKt.seconds(var10004), (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long it) {
                EventActivity.this.setRepeatLimit(it);
            }
        }));
    }

    private final void setRepeatLimit(long limit) {
        this.mRepeatLimit = limit;
        this.checkRepetitionLimitText();
    }

    private final void checkRepetitionLimitText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_repetition_limit);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_limit");
        MyTextView var10001;
        CharSequence var2;
        if (this.mRepeatLimit == 0L) {
            var10001 = (MyTextView)this._$_findCachedViewById(id.event_repetition_limit_label);
            Intrinsics.checkNotNullExpressionValue(var10001, "event_repetition_limit_label");
            var10001.setText((CharSequence)this.getString(1900828));
            var2 = (CharSequence)this.getResources().getString(1900981);
        } else if (this.mRepeatLimit > 0L) {
            var10001 = (MyTextView)this._$_findCachedViewById(id.event_repetition_limit_label);
            Intrinsics.checkNotNullExpressionValue(var10001, "event_repetition_limit_label");
            var10001.setText((CharSequence)this.getString(1900277));
            DateTime repeatLimitDateTime = Formatter.INSTANCE.getDateTimeFromTS(this.mRepeatLimit);
            Formatter var3 = Formatter.INSTANCE;
            Context var10002 = this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(var10002, "applicationContext");
            var2 = (CharSequence)var3.getFullDate(var10002, repeatLimitDateTime);
        } else {
            var10001 = (MyTextView)this._$_findCachedViewById(id.event_repetition_limit_label);
            Intrinsics.checkNotNullExpressionValue(var10001, "event_repetition_limit_label");
            var10001.setText((CharSequence)this.getString(1900828));
            var2 = (CharSequence)("" + -this.mRepeatLimit + ' ' + this.getString(1900269));
        }

        var10000.setText(var2);
    }

    private final void showRepetitionRuleDialog() {
        ActivityKt.hideKeyboard(this);
        if (IntKt.isXWeeklyRepetition(this.mRepeatInterval)) {
            new RepeatRuleWeeklyDialog((Activity)this, this.mRepeatRule, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke(((Number)var1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int it) {
                    EventActivity.this.setRepeatRule(it);
                }
            }));
        } else {
            ArrayList items;
            if (IntKt.isXMonthlyRepetition(this.mRepeatInterval)) {
                items = this.getAvailableMonthlyRepetitionRules();
                new RadioGroupDialog((Activity)this, items, this.mRepeatRule, 0, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        EventActivity.this.setRepeatRule((Integer)it);
                    }
                }), 56, (DefaultConstructorMarker)null);
            } else if (IntKt.isXYearlyRepetition(this.mRepeatInterval)) {
                items = this.getAvailableYearlyRepetitionRules();
                new RadioGroupDialog((Activity)this, items, this.mRepeatRule, 0, false, (Function0)null, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke(var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        EventActivity.this.setRepeatRule((Integer)it);
                    }
                }), 56, (DefaultConstructorMarker)null);
            }
        }

    }

    private final ArrayList getAvailableMonthlyRepetitionRules() {
        RadioItem[] var10000 = new RadioItem[1];
        String var10006 = this.getString(1900703);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.repeat_on_the_same_day_monthly)");
        var10000[0] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        ArrayList items = CollectionsKt.arrayListOf(var10000);
        items.add(new RadioItem(4, this.getRepeatXthDayString(true, 4), (Object)null, 4, (DefaultConstructorMarker)null));
        if (this.isLastWeekDayOfMonth()) {
            items.add(new RadioItem(2, this.getRepeatXthDayString(true, 2), (Object)null, 4, (DefaultConstructorMarker)null));
        }

        if (this.isLastDayOfTheMonth()) {
            String var10004 = this.getString(1900394);
            Intrinsics.checkNotNullExpressionValue(var10004, "getString(R.string.repeat_on_the_last_day_monthly)");
            items.add(new RadioItem(3, var10004, (Object)null, 4, (DefaultConstructorMarker)null));
        }

        return items;
    }

    private final ArrayList getAvailableYearlyRepetitionRules() {
        RadioItem[] var10000 = new RadioItem[1];
        String var10006 = this.getString(1900552);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.repeat_on_the_same_day_yearly)");
        var10000[0] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        ArrayList items = CollectionsKt.arrayListOf(var10000);
        items.add(new RadioItem(4, this.getRepeatXthDayInMonthString(true, 4), (Object)null, 4, (DefaultConstructorMarker)null));
        if (this.isLastWeekDayOfMonth()) {
            items.add(new RadioItem(2, this.getRepeatXthDayInMonthString(true, 2), (Object)null, 4, (DefaultConstructorMarker)null));
        }

        return items;
    }

    private final boolean isLastDayOfTheMonth() {
        DateTime var10000 = this.mEventStartDateTime;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        int var1 = var10000.getDayOfMonth();
        DateTime var10001 = this.mEventStartDateTime;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var10001 = var10001.dayOfMonth().withMaximumValue();
        Intrinsics.checkNotNullExpressionValue(var10001, "mEventStartDateTime.dayO…onth().withMaximumValue()");
        return var1 == var10001.getDayOfMonth();
    }

    private final boolean isLastWeekDayOfMonth() {
        DateTime var10000 = this.mEventStartDateTime;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        int var1 = var10000.getMonthOfYear();
        DateTime var10001 = this.mEventStartDateTime;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var10001 = var10001.plusDays(7);
        Intrinsics.checkNotNullExpressionValue(var10001, "mEventStartDateTime.plusDays(7)");
        return var1 != var10001.getMonthOfYear();
    }

    private final String getRepeatXthDayString(boolean includeBase, int repeatRule) {
        DateTime var10000 = this.mEventStartDateTime;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        int dayOfWeek = var10000.getDayOfWeek();
        String base = this.getBaseString(dayOfWeek);
        String order = this.getOrderString(repeatRule);
        String dayString = this.getDayString(dayOfWeek);
        String var8;
        if (includeBase) {
            var8 = base + ' ' + order + ' ' + dayString;
        } else {
            DateTime var10002 = this.mEventStartDateTime;
            if (var10002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
            }

            var8 = this.getString(this.isMaleGender(var10002.getDayOfWeek()) ? 1900250 : 1900242);
            Intrinsics.checkNotNullExpressionValue(var8, "getString(if (isMaleGend…_m else R.string.every_f)");
            String everyString = var8;
            var8 = everyString + ' ' + order + ' ' + dayString;
        }

        return var8;
    }

    private final String getBaseString(int day) {
        String var10000 = this.getString(this.isMaleGender(day) ? 1900905 : 1900899);
        Intrinsics.checkNotNullExpressionValue(var10000, "getString(\n            i…f\n            }\n        )");
        return var10000;
    }

    private final boolean isMaleGender(int day) {
        return day == 1 || day == 2 || day == 4 || day == 5;
    }

    private final String getOrderString(int repeatRule) {
        DateTime var10000 = this.mEventStartDateTime;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        int dayOfMonth = var10000.getDayOfMonth();
        int order = (dayOfMonth - 1) / 7 + 1;
        if (this.isLastWeekDayOfMonth() && repeatRule == 2) {
            order = -1;
        }

        DateTime var10001 = this.mEventStartDateTime;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        boolean isMale = this.isMaleGender(var10001.getDayOfWeek());
        int var6;
        switch(order) {
            case 1:
                var6 = isMale ? 1901138 : 1901133;
                break;
            case 2:
                var6 = isMale ? 1900481 : 1900491;
                break;
            case 3:
                var6 = isMale ? 1900626 : 1900616;
                break;
            case 4:
                var6 = isMale ? 1900865 : 1900871;
                break;
            case 5:
                var6 = isMale ? 1900478 : 1900487;
                break;
            default:
                var6 = isMale ? 1900701 : 1900743;
        }

        String var5 = this.getString(var6);
        Intrinsics.checkNotNullExpressionValue(var5, "getString(\n            w…f\n            }\n        )");
        return var5;
    }

    private final String getDayString(int day) {
        int var10001;
        switch(day) {
            case 1:
                var10001 = 1900568;
                break;
            case 2:
                var10001 = 1900012;
                break;
            case 3:
                var10001 = 1900732;
                break;
            case 4:
                var10001 = 1900018;
                break;
            case 5:
                var10001 = 1900524;
                break;
            case 6:
                var10001 = 1900103;
                break;
            default:
                var10001 = 1900555;
        }

        String var10000 = this.getString(var10001);
        Intrinsics.checkNotNullExpressionValue(var10000, "getString(\n            w…t\n            }\n        )");
        return var10000;
    }

    private final String getRepeatXthDayInMonthString(boolean includeBase, int repeatRule) {
        String weekDayString = this.getRepeatXthDayString(includeBase, repeatRule);
        String[] var10000 = this.getResources().getStringArray(200010);
        DateTime var10001 = this.mEventStartDateTime;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        String monthString = var10000[var10001.getMonthOfYear() - 1];
        return weekDayString + ' ' + monthString;
    }

    private final void setRepeatRule(int rule) {
        this.mRepeatRule = rule;
        this.checkRepetitionRuleText();
        if (rule == 0) {
            this.setRepeatInterval(0);
        }

    }

    private final void checkRepetitionRuleText() {
        MyTextView var10000;
        if (IntKt.isXWeeklyRepetition(this.mRepeatInterval)) {
            var10000 = (MyTextView)this._$_findCachedViewById(id.event_repetition_rule);
            Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_rule");
            var10000.setText(this.mRepeatRule == 127 ? (CharSequence)this.getString(1900073) : (CharSequence)ContextKt.getSelectedDaysString(this, this.mRepeatRule));
        } else {
            int repeatString;
            if (IntKt.isXMonthlyRepetition(this.mRepeatInterval)) {
                repeatString = this.mRepeatRule != 2 && this.mRepeatRule != 4 ? 1900558 : 1900828;
                var10000 = (MyTextView)this._$_findCachedViewById(id.event_repetition_rule_label);
                Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_rule_label");
                var10000.setText((CharSequence)this.getString(repeatString));
                var10000 = (MyTextView)this._$_findCachedViewById(id.event_repetition_rule);
                Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_rule");
                var10000.setText((CharSequence)this.getMonthlyRepetitionRuleText());
            } else if (IntKt.isXYearlyRepetition(this.mRepeatInterval)) {
                repeatString = this.mRepeatRule != 2 && this.mRepeatRule != 4 ? 1900558 : 1900828;
                var10000 = (MyTextView)this._$_findCachedViewById(id.event_repetition_rule_label);
                Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_rule_label");
                var10000.setText((CharSequence)this.getString(repeatString));
                var10000 = (MyTextView)this._$_findCachedViewById(id.event_repetition_rule);
                Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition_rule");
                var10000.setText((CharSequence)this.getYearlyRepetitionRuleText());
            }
        }

    }

    private final String getMonthlyRepetitionRuleText() {
        String var10000;
        switch(this.mRepeatRule) {
            case 1:
                var10000 = this.getString(1900678);
                break;
            case 2:
            default:
                var10000 = this.getRepeatXthDayString(false, this.mRepeatRule);
                break;
            case 3:
                var10000 = this.getString(1900320);
        }

        Intrinsics.checkNotNullExpressionValue(var10000, "when (mRepeatRule) {\n   …false, mRepeatRule)\n    }");
        return var10000;
    }

    private final String getYearlyRepetitionRuleText() {
        String var10000;
        switch(this.mRepeatRule) {
            case 1:
                var10000 = this.getString(1900678);
                break;
            default:
                var10000 = this.getRepeatXthDayInMonthString(false, this.mRepeatRule);
        }

        Intrinsics.checkNotNullExpressionValue(var10000, "when (mRepeatRule) {\n   …false, mRepeatRule)\n    }");
        return var10000;
    }

    private final void showEventTypeDialog() {
        ActivityKt.hideKeyboard(this);
        new SelectEventTypeDialog((Activity)this, this.mEventTypeId, false, true, false, true, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((EventType)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull EventType it) {
                Intrinsics.checkNotNullParameter(it, "it");
                EventActivity var10000 = EventActivity.this;
                Long var10001 = it.getId();
                Intrinsics.checkNotNull(var10001);
                var10000.mEventTypeId = var10001;
                EventActivity.this.updateEventType();
            }
        }));
    }

    private final void checkReminderTexts() {
        this.updateReminder1Text();
        this.updateReminder2Text();
        this.updateReminder3Text();
        this.updateReminderTypeImages();
    }

    private final void updateReminder1Text() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_reminder_1);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_reminder_1");
        var10000.setText((CharSequence)ContextKt.getFormattedMinutes$default(this, this.mReminder1Minutes, false, 2, (Object)null));
    }

    private final void updateReminder2Text() {
        MyTextView var1 = (MyTextView)this._$_findCachedViewById(id.event_reminder_2);
        int var3 = false;
        View var10000 = (View)var1;
        MyTextView var10001 = (MyTextView)((View)var1).findViewById(id.event_reminder_2);
        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_2");
        ViewKt.beGoneIf(var10000, ViewKt.isGone((View)var10001) && this.mReminder1Minutes == -1);
        if (this.mReminder2Minutes == -1) {
            var1.setText((CharSequence)var1.getResources().getString(1900230));
            var1.setAlpha(0.4F);
        } else {
            var1.setText((CharSequence)ContextKt.getFormattedMinutes$default(this, this.mReminder2Minutes, false, 2, (Object)null));
            var1.setAlpha(1.0F);
        }

    }

    private final void updateReminder3Text() {
        MyTextView var1 = (MyTextView)this._$_findCachedViewById(id.event_reminder_3);
        int var3 = false;
        View var10000 = (View)var1;
        MyTextView var10001 = (MyTextView)((View)var1).findViewById(id.event_reminder_3);
        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_3");
        ViewKt.beGoneIf(var10000, ViewKt.isGone((View)var10001) && (this.mReminder2Minutes == -1 || this.mReminder1Minutes == -1));
        if (this.mReminder3Minutes == -1) {
            var1.setText((CharSequence)var1.getResources().getString(1900230));
            var1.setAlpha(0.4F);
        } else {
            var1.setText((CharSequence)ContextKt.getFormattedMinutes$default(this, this.mReminder3Minutes, false, 2, (Object)null));
            var1.setAlpha(1.0F);
        }

    }

    private final void showReminderTypePicker(int currentValue, final Function1 callback) {
        RadioItem[] var10000 = new RadioItem[2];
        String var10006 = this.getString(1900510);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.notification)");
        var10000[0] = new RadioItem(0, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.getString(1900903);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.email)");
        var10000[1] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        ArrayList items = CollectionsKt.arrayListOf(var10000);
        new RadioGroupDialog((Activity)this, items, currentValue, 0, false, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                callback.invoke((Integer)it);
            }
        }), 56, (DefaultConstructorMarker)null);
    }

    private final void showAvailabilityPicker(int currentValue, final Function1 callback) {
        RadioItem[] var10000 = new RadioItem[2];
        String var10006 = this.getString(1900143);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.status_busy)");
        var10000[0] = new RadioItem(0, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.getString(1900608);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.status_free)");
        var10000[1] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        ArrayList items = CollectionsKt.arrayListOf(var10000);
        new RadioGroupDialog((Activity)this, items, currentValue, 0, false, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                callback.invoke((Integer)it);
            }
        }), 56, (DefaultConstructorMarker)null);
    }

    private final void updateReminderTypeImages() {
        ImageView var10001 = (ImageView)this._$_findCachedViewById(id.event_reminder_1_type);
        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_1_type");
        this.updateReminderTypeImage(var10001, new Reminder(this.mReminder1Minutes, this.mReminder1Type));
        var10001 = (ImageView)this._$_findCachedViewById(id.event_reminder_2_type);
        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_2_type");
        this.updateReminderTypeImage(var10001, new Reminder(this.mReminder2Minutes, this.mReminder2Type));
        var10001 = (ImageView)this._$_findCachedViewById(id.event_reminder_3_type);
        Intrinsics.checkNotNullExpressionValue(var10001, "event_reminder_3_type");
        this.updateReminderTypeImage(var10001, new Reminder(this.mReminder3Minutes, this.mReminder3Type));
    }

    private final void updateCalDAVVisibility() {
        boolean isSyncedEvent = this.mEventCalendarId != 0;
        ImageView var10000 = (ImageView)this._$_findCachedViewById(id.event_attendees_image);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_attendees_image");
        ViewKt.beVisibleIf((View)var10000, isSyncedEvent);
        LinearLayout var2 = (LinearLayout)this._$_findCachedViewById(id.event_attendees_holder);
        Intrinsics.checkNotNullExpressionValue(var2, "event_attendees_holder");
        ViewKt.beVisibleIf((View)var2, isSyncedEvent);
        var10000 = (ImageView)this._$_findCachedViewById(id.event_attendees_divider);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_attendees_divider");
        ViewKt.beVisibleIf((View)var10000, isSyncedEvent);
        var10000 = (ImageView)this._$_findCachedViewById(id.event_availability_divider);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_availability_divider");
        ViewKt.beVisibleIf((View)var10000, isSyncedEvent);
        var10000 = (ImageView)this._$_findCachedViewById(id.event_availability_image);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_availability_image");
        ViewKt.beVisibleIf((View)var10000, isSyncedEvent);
        MyTextView var3 = (MyTextView)this._$_findCachedViewById(id.event_availability);
        Intrinsics.checkNotNullExpressionValue(var3, "event_availability");
        ViewKt.beVisibleIf((View)var3, isSyncedEvent);
    }

    private final void updateReminderTypeImage(ImageView view, Reminder reminder) {
        ViewKt.beVisibleIf((View)view, reminder.getMinutes() != -1 && this.mEventCalendarId != 0);
        int drawable = reminder.getType() == 0 ? 700025 : 700261;
        Resources var10000 = this.getResources();
        Intrinsics.checkNotNullExpressionValue(var10000, "resources");
        Drawable icon = ResourcesKt.getColoredDrawableWithColor$default(var10000, drawable, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getTextColor(), 0, 4, (Object)null);
        view.setImageDrawable(icon);
    }

    private final void updateAvailabilityImage() {
        int drawable = this.mAvailability == 1 ? 700207 : 700283;
        Resources var10000 = this.getResources();
        Intrinsics.checkNotNullExpressionValue(var10000, "resources");
        Drawable icon = ResourcesKt.getColoredDrawableWithColor$default(var10000, drawable, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getTextColor(), 0, 4, (Object)null);
        ((ImageView)this._$_findCachedViewById(id.event_availability_image)).setImageDrawable(icon);
    }

    private final void updateAvailabilityText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_availability);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_availability");
        var10000.setText(this.mAvailability == 1 ? (CharSequence)this.getString(1900608) : (CharSequence)this.getString(1900143));
    }

    private final void updateRepetitionText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_repetition);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_repetition");
        var10000.setText((CharSequence)com.simplemobiletools.calendar.pro.extensions.ContextKt.getRepetitionText(this, this.mRepeatInterval));
    }

    private final void updateEventType() {
        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                final EventType eventType = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventTypesDB(EventActivity.this).getEventTypeWithId(EventActivity.this.mEventTypeId);
                if (eventType != null) {
                    EventActivity.this.runOnUiThread((Runnable)(new Runnable() {
                        public final void run() {
                            MyTextView var10000 = (MyTextView)EventActivity.this._$_findCachedViewById(id.event_type);
                            Intrinsics.checkNotNullExpressionValue(var10000, "event_type");
                            var10000.setText((CharSequence)eventType.getTitle());
                            ImageView var1 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_type_color);
                            Intrinsics.checkNotNullExpressionValue(var1, "event_type_color");
                            ImageViewKt.setFillWithStroke$default(var1, eventType.getColor(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).getBackgroundColor(), false, 4, (Object)null);
                        }
                    }));
                }

            }
        }));
    }

    private final void updateCalDAVCalendar() {
        if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync()) {
            ImageView var10000 = (ImageView)this._$_findCachedViewById(id.event_caldav_calendar_image);
            Intrinsics.checkNotNullExpressionValue(var10000, "event_caldav_calendar_image");
            ViewKt.beVisible((View)var10000);
            RelativeLayout var11 = (RelativeLayout)this._$_findCachedViewById(id.event_caldav_calendar_holder);
            Intrinsics.checkNotNullExpressionValue(var11, "event_caldav_calendar_holder");
            ViewKt.beVisible((View)var11);
            var10000 = (ImageView)this._$_findCachedViewById(id.event_caldav_calendar_divider);
            Intrinsics.checkNotNullExpressionValue(var10000, "event_caldav_calendar_divider");
            ViewKt.beVisible((View)var10000);
            Iterable $this$filter$iv = (Iterable)com.simplemobiletools.calendar.pro.extensions.ContextKt.getCalDAVHelper(this).getCalDAVCalendars("", true);
            int $i$f$filter = false;
            Collection destination$iv$iv = (Collection)(new ArrayList());
            int $i$f$filterTo = false;
            Iterator var7 = $this$filter$iv.iterator();

            while(var7.hasNext()) {
                Object element$iv$iv = var7.next();
                CalDAVCalendar it = (CalDAVCalendar)element$iv$iv;
                int var10 = false;
                if (it.canWrite() && com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getSyncedCalendarIdsAsList().contains(it.getId())) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }

            final List calendars = (List)destination$iv$iv;
            this.updateCurrentCalendarInfo(this.mEventCalendarId == 0 ? null : this.getCalendarWithId(calendars, this.getCalendarId()));
            ((RelativeLayout)this._$_findCachedViewById(id.event_caldav_calendar_holder)).setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    ActivityKt.hideKeyboard(EventActivity.this);
                    new SelectEventCalendarDialog((Activity)EventActivity.this, calendars, EventActivity.this.mEventCalendarId, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke(((Number)var1).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int it) {
                            if (EventActivity.this.mEventCalendarId != 0 && it == 0) {
                                EventActivity.this.mEventTypeId = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).getLastUsedLocalEventTypeId();
                                EventActivity.this.updateEventType();
                            }

                            EventActivity.this.mWasCalendarChanged = true;
                            EventActivity.this.mEventCalendarId = it;
                            com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).setLastUsedCaldavCalendarId(it);
                            EventActivity.this.updateCurrentCalendarInfo(EventActivity.this.getCalendarWithId(calendars, it));
                            EventActivity.this.updateReminderTypeImages();
                            EventActivity.this.updateCalDAVVisibility();
                            EventActivity.this.updateAvailabilityText();
                            EventActivity.this.updateAvailabilityImage();
                        }
                    }));
                }
            }));
        } else {
            this.updateCurrentCalendarInfo((CalDAVCalendar)null);
        }

    }

    private final int getCalendarId() {
        Event var10000 = this.mEvent;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        int var1;
        if (Intrinsics.areEqual(var10000.getSource(), "simple-calendar")) {
            var1 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getLastUsedCaldavCalendarId();
        } else {
            var10000 = this.mEvent;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            var1 = var10000.getCalDAVCalendarId();
        }

        return var1;
    }

    private final CalDAVCalendar getCalendarWithId(List calendars, int calendarId) {
        Iterable $this$firstOrNull$iv = (Iterable)calendars;
        int $i$f$firstOrNull = false;
        Iterator var5 = $this$firstOrNull$iv.iterator();

        Object var10000;
        while(true) {
            if (var5.hasNext()) {
                Object element$iv = var5.next();
                CalDAVCalendar it = (CalDAVCalendar)element$iv;
                int var8 = false;
                if (it.getId() != calendarId) {
                    continue;
                }

                var10000 = element$iv;
                break;
            }

            var10000 = null;
            break;
        }

        return (CalDAVCalendar)var10000;
    }

    private final void updateCurrentCalendarInfo(final CalDAVCalendar currentCalendar) {
        ImageView var10000 = (ImageView)this._$_findCachedViewById(id.event_type_image);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_type_image");
        ViewKt.beVisibleIf((View)var10000, currentCalendar == null);
        RelativeLayout var7 = (RelativeLayout)this._$_findCachedViewById(id.event_type_holder);
        Intrinsics.checkNotNullExpressionValue(var7, "event_type_holder");
        ViewKt.beVisibleIf((View)var7, currentCalendar == null);
        var10000 = (ImageView)this._$_findCachedViewById(id.event_caldav_calendar_divider);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_caldav_calendar_divider");
        ViewKt.beVisibleIf((View)var10000, currentCalendar == null);
        MyTextView var8 = (MyTextView)this._$_findCachedViewById(id.event_caldav_calendar_email);
        Intrinsics.checkNotNullExpressionValue(var8, "event_caldav_calendar_email");
        ViewKt.beGoneIf((View)var8, currentCalendar == null);
        var10000 = (ImageView)this._$_findCachedViewById(id.event_caldav_calendar_color);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_caldav_calendar_color");
        ViewKt.beGoneIf((View)var10000, currentCalendar == null);
        if (currentCalendar == null) {
            this.mEventCalendarId = 0;
            int mediumMargin = (int)this.getResources().getDimension(600086);
            MyTextView var3 = (MyTextView)this._$_findCachedViewById(id.event_caldav_calendar_name);
            int var5 = false;
            var3.setText((CharSequence)this.getString(1900563));
            var3.setPadding(var3.getPaddingLeft(), var3.getPaddingTop(), var3.getPaddingRight(), mediumMargin);
            RelativeLayout var6 = (RelativeLayout)this._$_findCachedViewById(id.event_caldav_calendar_holder);
            var5 = false;
            var6.setPadding(var6.getPaddingLeft(), mediumMargin, var6.getPaddingRight(), mediumMargin);
        } else {
            var8 = (MyTextView)this._$_findCachedViewById(id.event_caldav_calendar_email);
            Intrinsics.checkNotNullExpressionValue(var8, "event_caldav_calendar_email");
            var8.setText((CharSequence)currentCalendar.getAccountName());
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    EventType var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this).getEventTypeWithCalDAVCalendarId(currentCalendar.getId());
                    final int calendarColor = var10000 != null ? var10000.getColor() : currentCalendar.getColor();
                    EventActivity.this.runOnUiThread((Runnable)(new Runnable() {
                        public final void run() {
                            ImageView var10000 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_caldav_calendar_color);
                            Intrinsics.checkNotNullExpressionValue(var10000, "event_caldav_calendar_color");
                            ImageViewKt.setFillWithStroke$default(var10000, calendarColor, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).getBackgroundColor(), false, 4, (Object)null);
                            MyTextView var1 = (MyTextView)EventActivity.this._$_findCachedViewById(id.event_caldav_calendar_name);
                            int var3 = false;
                            var1.setText((CharSequence)currentCalendar.getDisplayName());
                            var1.setPadding(var1.getPaddingLeft(), var1.getPaddingTop(), var1.getPaddingRight(), (int)var1.getResources().getDimension(600308));
                            RelativeLayout var4 = (RelativeLayout)EventActivity.this._$_findCachedViewById(id.event_caldav_calendar_holder);
                            var3 = false;
                            var4.setPadding(var4.getPaddingLeft(), 0, var4.getPaddingRight(), 0);
                        }
                    }));
                }
            }));
        }

    }

    private final void resetTime() {
        DateTime var10000 = this.mEventEndDateTime;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        DateTime var10001 = this.mEventStartDateTime;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        if (var10000.isBefore((ReadableInstant)var10001)) {
            var10000 = this.mEventStartDateTime;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
            }

            Property var1 = var10000.dayOfMonth();
            var10001 = this.mEventEndDateTime;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
            }

            if (Intrinsics.areEqual(var1, var10001.dayOfMonth())) {
                var10000 = this.mEventStartDateTime;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                }

                var1 = var10000.monthOfYear();
                var10001 = this.mEventEndDateTime;
                if (var10001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
                }

                if (Intrinsics.areEqual(var1, var10001.monthOfYear())) {
                    var10001 = this.mEventEndDateTime;
                    if (var10001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
                    }

                    DateTime var10002 = this.mEventStartDateTime;
                    if (var10002 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                    }

                    int var2 = var10002.getHourOfDay();
                    DateTime var10003 = this.mEventStartDateTime;
                    if (var10003 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                    }

                    int var3 = var10003.getMinuteOfHour();
                    DateTime var10004 = this.mEventStartDateTime;
                    if (var10004 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                    }

                    var10001 = var10001.withTime(var2, var3, var10004.getSecondOfMinute(), 0);
                    Intrinsics.checkNotNullExpressionValue(var10001, "mEventEndDateTime.withTi…teTime.secondOfMinute, 0)");
                    this.mEventEndDateTime = var10001;
                    this.updateEndTimeText();
                    this.checkStartEndValidity();
                }
            }
        }

    }

    private final void toggleAllDay(boolean isChecked) {
        this.mIsAllDayEvent = isChecked;
        ActivityKt.hideKeyboard(this);
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_start_time);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_start_time");
        ViewKt.beGoneIf((View)var10000, isChecked);
        var10000 = (MyTextView)this._$_findCachedViewById(id.event_end_time);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_end_time");
        ViewKt.beGoneIf((View)var10000, isChecked);
        this.resetTime();
    }

    private final void shareEvent() {
        Long[] var10001 = new Long[1];
        Event var10004 = this.mEvent;
        if (var10004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        Long var1 = var10004.getId();
        Intrinsics.checkNotNull(var1);
        var10001[0] = var1;
        com.simplemobiletools.calendar.pro.extensions.ActivityKt.shareEvents(this, (List)CollectionsKt.arrayListOf(var10001));
    }

    private final void deleteEvent() {
        Event var10000 = this.mEvent;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        if (var10000.getId() != null) {
            DeleteEventDialog var10001 = new DeleteEventDialog;
            Activity var10002 = (Activity)this;
            Long[] var10003 = new Long[1];
            Event var10006 = this.mEvent;
            if (var10006 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            Long var1 = var10006.getId();
            Intrinsics.checkNotNull(var1);
            var10003[0] = var1;
            List var2 = (List)CollectionsKt.arrayListOf(var10003);
            Event var10004 = this.mEvent;
            if (var10004 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            var10001.<init>(var10002, var2, var10004.getRepeatInterval() > 0, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke(((Number)var1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final int it) {
                    ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            EventsHelper var10000;
                            Long var10001;
                            switch(it) {
                                case 0:
                                    var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this);
                                    var10001 = EventActivity.access$getMEvent$p(EventActivity.this).getId();
                                    Intrinsics.checkNotNull(var10001);
                                    var10000.addEventRepetitionException(var10001, EventActivity.this.mEventOccurrenceTS, true);
                                    break;
                                case 1:
                                    var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this);
                                    var10001 = EventActivity.access$getMEvent$p(EventActivity.this).getId();
                                    Intrinsics.checkNotNull(var10001);
                                    var10000.addEventRepeatLimit(var10001, EventActivity.this.mEventOccurrenceTS);
                                    break;
                                case 2:
                                    var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this);
                                    var10001 = EventActivity.access$getMEvent$p(EventActivity.this).getId();
                                    Intrinsics.checkNotNull(var10001);
                                    var10000.deleteEvent(var10001, true);
                            }

                            EventActivity.this.runOnUiThread((Runnable)(new Runnable() {
                                public final void run() {
                                    EventActivity.this.finish();
                                }
                            }));
                        }
                    }));
                }
            }));
        }
    }

    private final void duplicateEvent() {
        this.finish();
        Intent var1 = new Intent((Context)this, EventActivity.class);
        int var3 = false;
        Event var10002 = this.mEvent;
        if (var10002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var1.putExtra("event_id", (Serializable)var10002.getId());
        var1.putExtra("event_occurrence_ts", this.mEventOccurrenceTS);
        var1.putExtra("is_duplicate_intent", true);
        this.startActivity(var1);
    }

    private final void saveCurrentEvent() {
        if (!com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getWasAlarmWarningShown() && (this.mReminder1Minutes != -1 || this.mReminder2Minutes != -1 || this.mReminder3Minutes != -1)) {
            new ConfirmationDialog((Activity)this, (String)null, 1900095, 1900829, 0, false, (Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(EventActivity.this).setWasAlarmWarningShown(true);
                    ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            EventActivity.this.saveEvent();
                        }
                    }));
                }
            }), 34, (DefaultConstructorMarker)null);
        } else {
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    EventActivity.this.saveEvent();
                }
            }));
        }

    }

    private final void saveEvent() {
        MyEditText var10000 = (MyEditText)this._$_findCachedViewById(id.event_title);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_title");
        String newTitle = EditTextKt.getValue((EditText)var10000);
        CharSequence var2 = (CharSequence)newTitle;
        if (var2.length() == 0) {
            ContextKt.toast$default(this, 1900387, 0, 2, (Object)null);
            this.runOnUiThread((Runnable)(new Runnable() {
                public final void run() {
                    ((MyEditText)EventActivity.this._$_findCachedViewById(id.event_title)).requestFocus();
                }
            }));
        } else {
            long newStartTS = 0L;
            long newEndTS = 0L;
            Pair var3 = this.getStartEndTimes();
            int var5 = false;
            newStartTS = ((Number)var3.getFirst()).longValue();
            newEndTS = ((Number)var3.getSecond()).longValue();
            if (newStartTS > newEndTS) {
                ContextKt.toast$default(this, 1900215, 0, 2, (Object)null);
            } else {
                Event var32 = this.mEvent;
                if (var32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                boolean wasRepeatable = var32.getRepeatInterval() > 0;
                var32 = this.mEvent;
                if (var32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                String oldSource = var32.getSource();
                var32 = this.mEvent;
                if (var32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                String var10001;
                String var34;
                if (var32.getId() != null) {
                    var32 = this.mEvent;
                    if (var32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    var34 = var32.getImportId();
                } else {
                    StringBuilder var36 = new StringBuilder();
                    var10001 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(var10001, "UUID.randomUUID().toString()");
                    var34 = var36.append(StringsKt.replace$default(var10001, "-", "", false, 4, (Object)null)).append(String.valueOf(System.currentTimeMillis())).toString();
                }

                String newImportId = var34;
                long var38;
                if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync() && com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getLastUsedCaldavCalendarId() != 0 && this.mEventCalendarId != 0) {
                    label213: {
                        Iterable $this$firstOrNull$iv = (Iterable)com.simplemobiletools.calendar.pro.extensions.ContextKt.getCalDAVHelper(this).getCalDAVCalendars("", true);
                        int $i$f$firstOrNull = false;
                        Iterator var10 = $this$firstOrNull$iv.iterator();

                        Object var39;
                        label193: {
                            while(var10.hasNext()) {
                                Object element$iv = var10.next();
                                CalDAVCalendar it = (CalDAVCalendar)element$iv;
                                int var13 = false;
                                if (it.getId() == this.mEventCalendarId) {
                                    var39 = element$iv;
                                    break label193;
                                }
                            }

                            var39 = null;
                        }

                        CalDAVCalendar var41 = (CalDAVCalendar)var39;
                        if (var41 != null) {
                            CalDAVCalendar var23 = var41;
                            int var26 = false;
                            if (!var23.canWrite()) {
                                this.runOnUiThread((Runnable)(new EventActivity$saveEvent$$inlined$apply$lambda$1(this)));
                                return;
                            }
                        }

                        EventType var42 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(this).getEventTypeWithCalDAVCalendarId(this.mEventCalendarId);
                        if (var42 != null) {
                            Long var44 = var42.getId();
                            if (var44 != null) {
                                var38 = var44;
                                break label213;
                            }
                        }

                        var38 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getLastUsedLocalEventTypeId();
                    }
                } else {
                    var38 = this.mEventTypeId;
                }

                long newEventType = var38;
                if (com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getCaldavSync() && this.mEventCalendarId != 0) {
                    var34 = "Caldav-" + this.mEventCalendarId;
                } else {
                    com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).setLastUsedLocalEventTypeId(newEventType);
                    var34 = "simple-calendar";
                }

                String newSource = var34;
                ArrayList reminders = this.getReminders();
                MyAppCompatCheckbox var45 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.event_all_day);
                Intrinsics.checkNotNullExpressionValue(var45, "event_all_day");
                Reminder var46;
                if (!var45.isChecked()) {
                    var46 = (Reminder)CollectionsKt.getOrNull((List)reminders, 2);
                    if ((var46 != null ? var46.getMinutes() : 0) < -1) {
                        reminders.remove(2);
                    }

                    var46 = (Reminder)CollectionsKt.getOrNull((List)reminders, 1);
                    if ((var46 != null ? var46.getMinutes() : 0) < -1) {
                        reminders.remove(1);
                    }

                    var46 = (Reminder)CollectionsKt.getOrNull((List)reminders, 0);
                    if ((var46 != null ? var46.getMinutes() : 0) < -1) {
                        reminders.remove(0);
                    }
                }

                var46 = (Reminder)CollectionsKt.getOrNull((List)reminders, 0);
                if (var46 == null) {
                    var46 = new Reminder(-1, 0);
                }

                Reminder reminder1 = var46;
                var46 = (Reminder)CollectionsKt.getOrNull((List)reminders, 1);
                if (var46 == null) {
                    var46 = new Reminder(-1, 0);
                }

                Reminder reminder2 = var46;
                var46 = (Reminder)CollectionsKt.getOrNull((List)reminders, 2);
                if (var46 == null) {
                    var46 = new Reminder(-1, 0);
                }

                Reminder reminder3 = var46;
                this.mReminder1Type = this.mEventCalendarId == 0 ? 0 : reminder1.getType();
                this.mReminder2Type = this.mEventCalendarId == 0 ? 0 : reminder2.getType();
                this.mReminder3Type = this.mEventCalendarId == 0 ? 0 : reminder3.getType();
                Config var30 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this);
                int var15 = false;
                if (var30.getUsePreviousEventReminders()) {
                    var30.setLastEventReminderMinutes1(reminder1.getMinutes());
                    var30.setLastEventReminderMinutes2(reminder2.getMinutes());
                    var30.setLastEventReminderMinutes3(reminder3.getMinutes());
                }

                var32 = this.mEvent;
                if (var32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                Event var31 = var32;
                var15 = false;
                var31.setStartTS(newStartTS);
                var31.setEndTS(newEndTS);
                var31.setTitle(newTitle);
                MyEditText var33 = (MyEditText)this._$_findCachedViewById(id.event_description);
                Intrinsics.checkNotNullExpressionValue(var33, "event_description");
                var31.setDescription(EditTextKt.getValue((EditText)var33));
                var31.setReminder1Minutes(reminder1.getMinutes());
                var31.setReminder2Minutes(reminder2.getMinutes());
                var31.setReminder3Minutes(reminder3.getMinutes());
                var31.setReminder1Type(this.mReminder1Type);
                var31.setReminder2Type(this.mReminder2Type);
                var31.setReminder3Type(this.mReminder3Type);
                var31.setRepeatInterval(this.mRepeatInterval);
                var31.setImportId(newImportId);
                Event var35 = this.mEvent;
                if (var35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                CharSequence var16 = (CharSequence)var35.getTimeZone();
                if (var16.length() == 0) {
                    TimeZone var37 = TimeZone.getDefault();
                    Intrinsics.checkNotNullExpressionValue(var37, "TimeZone.getDefault()");
                    var10001 = var37.getID();
                    Intrinsics.checkNotNullExpressionValue(var10001, "TimeZone.getDefault().id");
                } else {
                    var10001 = var31.getTimeZone();
                }

                var31.setTimeZone(var10001);
                var35 = this.mEvent;
                if (var35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                int var40 = var35.getFlags();
                MyAppCompatCheckbox var10002 = (MyAppCompatCheckbox)this._$_findCachedViewById(id.event_all_day);
                Intrinsics.checkNotNullExpressionValue(var10002, "event_all_day");
                var31.setFlags(com.simplemobiletools.commons.extensions.IntKt.addBitIf(var40, var10002.isChecked(), 1));
                var31.setRepeatLimit(var31.getRepeatInterval() == 0 ? 0L : this.mRepeatLimit);
                var31.setRepeatRule(this.mRepeatRule);
                var31.setAttendees(this.mEventCalendarId == 0 ? "" : this.getAllAttendees(true));
                var31.setEventType(newEventType);
                var31.setLastUpdated(System.currentTimeMillis());
                var31.setSource(newSource);
                var33 = (MyEditText)this._$_findCachedViewById(id.event_location);
                Intrinsics.checkNotNullExpressionValue(var33, "event_location");
                var31.setLocation(EditTextKt.getValue((EditText)var33));
                var31.setAvailability(this.mAvailability);
                var32 = this.mEvent;
                if (var32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                if (var32.getId() != null && Intrinsics.areEqual(oldSource, newSource) ^ true) {
                    EventsHelper var47 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(this);
                    var35 = this.mEvent;
                    if (var35 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    Long var43 = var35.getId();
                    Intrinsics.checkNotNull(var43);
                    var47.deleteEvent(var43, true);
                    var32 = this.mEvent;
                    if (var32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    var32.setId((Long)null);
                }

                this.storeEvent(wasRepeatable);
            }
        }
    }

    private final void storeEvent(boolean wasRepeatable) {
        Event var10000 = this.mEvent;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        Event var10001;
        EventsHelper var2;
        if (var10000.getId() != null) {
            var10000 = this.mEvent;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }

            if (var10000.getId() != null) {
                if (this.mRepeatInterval > 0 && wasRepeatable) {
                    this.runOnUiThread((Runnable)(new Runnable() {
                        public final void run() {
                            EventActivity.this.showEditRepeatingEventDialog();
                        }
                    }));
                } else {
                    var2 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(this);
                    var10001 = this.mEvent;
                    if (var10001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                    }

                    var2.updateEvent(var10001, true, true, (Function0)(new Function0() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            EventActivity.this.finish();
                        }
                    }));
                }

                return;
            }
        }

        var2 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(this);
        var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var2.insertEvent(var10001, true, true, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long it) {
                if (DateTime.now().isAfter(EventActivity.access$getMEventStartDateTime$p(EventActivity.this).getMillis()) && EventActivity.access$getMEvent$p(EventActivity.this).getRepeatInterval() == 0) {
                    Iterable $this$any$iv = (Iterable)EventActivity.access$getMEvent$p(EventActivity.this).getReminders();
                    int $i$f$any = false;
                    boolean var10000;
                    if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                        var10000 = false;
                    } else {
                        label42: {
                            Iterator var5 = $this$any$iv.iterator();

                            while(var5.hasNext()) {
                                Object element$iv = var5.next();
                                Reminder itx = (Reminder)element$iv;
                                int var8 = false;
                                if (itx.getType() == 0) {
                                    var10000 = true;
                                    break label42;
                                }
                            }

                            var10000 = false;
                        }
                    }

                    if (var10000) {
                        com.simplemobiletools.calendar.pro.extensions.ContextKt.notifyEvent(EventActivity.this, EventActivity.access$getMEvent$p(EventActivity.this));
                    }
                }

                EventActivity.this.finish();
            }
        }));
    }

    private final void showEditRepeatingEventDialog() {
        new EditRepeatingEventDialog((SimpleActivity)this, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(((Number)var1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int it) {
                switch(it) {
                    case 0:
                        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke() {
                                this.invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                EventsHelper var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this);
                                Long var10001 = EventActivity.access$getMEvent$p(EventActivity.this).getId();
                                Intrinsics.checkNotNull(var10001);
                                var10000.addEventRepetitionException(var10001, EventActivity.this.mEventOccurrenceTS, true);
                                Event var1 = EventActivity.access$getMEvent$p(EventActivity.this);
                                int var3 = false;
                                var10001 = var1.getId();
                                Intrinsics.checkNotNull(var10001);
                                var1.setParentId(var10001);
                                var1.setId((Long)null);
                                var1.setRepeatRule(0);
                                var1.setRepeatInterval(0);
                                var1.setRepeatLimit(0L);
                                com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this).insertEvent(EventActivity.access$getMEvent$p(EventActivity.this), true, true, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke(((Number)var1).longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long it) {
                                        EventActivity.this.finish();
                                    }
                                }));
                            }
                        }));
                        break;
                    case 1:
                        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke() {
                                this.invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                EventsHelper var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this);
                                Long var10001 = EventActivity.access$getMEvent$p(EventActivity.this).getId();
                                Intrinsics.checkNotNull(var10001);
                                var10000.addEventRepeatLimit(var10001, EventActivity.this.mEventOccurrenceTS);
                                Event var1 = EventActivity.access$getMEvent$p(EventActivity.this);
                                int var3 = false;
                                var1.setId((Long)null);
                                com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this).insertEvent(EventActivity.access$getMEvent$p(EventActivity.this), true, true, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke(((Number)var1).longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long it) {
                                        EventActivity.this.finish();
                                    }
                                }));
                            }
                        }));
                        break;
                    case 2:
                        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke() {
                                this.invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                EventsHelper var10000 = com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this);
                                Long var10001 = EventActivity.access$getMEvent$p(EventActivity.this).getId();
                                Intrinsics.checkNotNull(var10001);
                                var10000.addEventRepeatLimit(var10001, EventActivity.this.mEventOccurrenceTS);
                                com.simplemobiletools.calendar.pro.extensions.ContextKt.getEventsHelper(EventActivity.this).updateEvent(EventActivity.access$getMEvent$p(EventActivity.this), true, true, (Function0)(new Function0() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke() {
                                        this.invoke();
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke() {
                                        EventActivity.this.finish();
                                    }
                                }));
                            }
                        }));
                }

            }
        }));
    }

    private final void updateStartTexts() {
        this.updateStartDateText();
        this.updateStartTimeText();
    }

    private final void updateStartDateText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_start_date);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_start_date");
        Formatter var10001 = Formatter.INSTANCE;
        Context var10002 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(var10002, "applicationContext");
        DateTime var10003 = this.mEventStartDateTime;
        if (var10003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var10000.setText((CharSequence)Formatter.getDate$default(var10001, var10002, var10003, false, 4, (Object)null));
        this.checkStartEndValidity();
    }

    private final void updateStartTimeText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_start_time);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_start_time");
        Formatter var10001 = Formatter.INSTANCE;
        Context var10002 = (Context)this;
        DateTime var10003 = this.mEventStartDateTime;
        if (var10003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var10000.setText((CharSequence)var10001.getTime(var10002, var10003));
        this.checkStartEndValidity();
    }

    private final void updateEndTexts() {
        this.updateEndDateText();
        this.updateEndTimeText();
    }

    private final void updateEndDateText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_end_date);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_end_date");
        Formatter var10001 = Formatter.INSTANCE;
        Context var10002 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(var10002, "applicationContext");
        DateTime var10003 = this.mEventEndDateTime;
        if (var10003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        var10000.setText((CharSequence)Formatter.getDate$default(var10001, var10002, var10003, false, 4, (Object)null));
        this.checkStartEndValidity();
    }

    private final void updateEndTimeText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_end_time);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_end_time");
        Formatter var10001 = Formatter.INSTANCE;
        Context var10002 = (Context)this;
        DateTime var10003 = this.mEventEndDateTime;
        if (var10003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        var10000.setText((CharSequence)var10001.getTime(var10002, var10003));
        this.checkStartEndValidity();
    }

    private final void updateTimeZoneText() {
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.event_time_zone);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_time_zone");
        Event var10001 = this.mEvent;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var10000.setText((CharSequence)var10001.getTimeZoneString());
    }

    private final void checkStartEndValidity() {
        DateTime var10000 = this.mEventStartDateTime;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        DateTime var10001 = this.mEventEndDateTime;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        int textColor = var10000.isAfter((ReadableInstant)var10001) ? this.getResources().getColor(500172) : com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getTextColor();
        ((MyTextView)this._$_findCachedViewById(id.event_end_date)).setTextColor(textColor);
        ((MyTextView)this._$_findCachedViewById(id.event_end_time)).setTextColor(textColor);
    }

    private final void showOnMap() {
        MyEditText var10000 = (MyEditText)this._$_findCachedViewById(id.event_location);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_location");
        CharSequence var1 = (CharSequence)EditTextKt.getValue((EditText)var10000);
        if (var1.length() == 0) {
            ContextKt.toast$default(this, 1900484, 0, 2, (Object)null);
        } else {
            Pattern pattern = Pattern.compile(this.LAT_LON_PATTERN);
            var10000 = (MyEditText)this._$_findCachedViewById(id.event_location);
            Intrinsics.checkNotNullExpressionValue(var10000, "event_location");
            String locationValue = EditTextKt.getValue((EditText)var10000);
            String delimiter;
            Uri var10;
            if (pattern.matcher((CharSequence)locationValue).find()) {
                delimiter = StringsKt.contains$default((CharSequence)locationValue, ';', false, 2, (Object)null) ? ";" : ",";
                List parts = StringsKt.split$default((CharSequence)locationValue, new String[]{delimiter}, false, 0, 6, (Object)null);
                String latitude = (String)CollectionsKt.first(parts);
                String longitude = (String)CollectionsKt.last(parts);
                var10 = Uri.parse("geo:" + latitude + ',' + longitude);
            } else {
                delimiter = Uri.encode(locationValue);
                var10 = Uri.parse("geo:0,0?q=" + delimiter);
            }

            Uri uri = var10;
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            ContextKt.launchActivityIntent(this, intent);
        }
    }

    private final void setupStartDate() {
        ActivityKt.hideKeyboard(this);
        com.simplemobiletools.commons.extensions.IntKt.getContrastColor(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getBackgroundColor());
        DatePickerDialog var10000 = new DatePickerDialog;
        Context var10002 = (Context)this;
        int var10003 = this.mDialogTheme;
        OnDateSetListener var10004 = this.startDateSetListener;
        DateTime var10005 = this.mEventStartDateTime;
        if (var10005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        int var2 = var10005.getYear();
        DateTime var10006 = this.mEventStartDateTime;
        if (var10006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        int var3 = var10006.getMonthOfYear() - 1;
        DateTime var10007 = this.mEventStartDateTime;
        if (var10007 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var10000.<init>(var10002, var10003, var10004, var2, var3, var10007.getDayOfMonth());
        DatePickerDialog datepicker = var10000;
        DatePicker var4 = datepicker.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(var4, "datepicker.datePicker");
        var4.setFirstDayOfWeek(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).isSundayFirst() ? 1 : 2);
        datepicker.show();
    }

    private final void setupStartTime() {
        ActivityKt.hideKeyboard(this);
        TimePickerDialog var10000 = new TimePickerDialog;
        Context var10002 = (Context)this;
        int var10003 = this.mDialogTheme;
        OnTimeSetListener var10004 = this.startTimeSetListener;
        DateTime var10005 = this.mEventStartDateTime;
        if (var10005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        int var1 = var10005.getHourOfDay();
        DateTime var10006 = this.mEventStartDateTime;
        if (var10006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        var10000.<init>(var10002, var10003, var10004, var1, var10006.getMinuteOfHour(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUse24HourFormat());
        var10000.show();
    }

    private final void setupEndDate() {
        ActivityKt.hideKeyboard(this);
        DatePickerDialog var10000 = new DatePickerDialog;
        Context var10002 = (Context)this;
        int var10003 = this.mDialogTheme;
        OnDateSetListener var10004 = this.endDateSetListener;
        DateTime var10005 = this.mEventEndDateTime;
        if (var10005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        int var2 = var10005.getYear();
        DateTime var10006 = this.mEventEndDateTime;
        if (var10006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        int var3 = var10006.getMonthOfYear() - 1;
        DateTime var10007 = this.mEventEndDateTime;
        if (var10007 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        var10000.<init>(var10002, var10003, var10004, var2, var3, var10007.getDayOfMonth());
        DatePickerDialog datepicker = var10000;
        DatePicker var4 = datepicker.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(var4, "datepicker.datePicker");
        var4.setFirstDayOfWeek(com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).isSundayFirst() ? 1 : 2);
        datepicker.show();
    }

    private final void setupEndTime() {
        ActivityKt.hideKeyboard(this);
        TimePickerDialog var10000 = new TimePickerDialog;
        Context var10002 = (Context)this;
        int var10003 = this.mDialogTheme;
        OnTimeSetListener var10004 = this.endTimeSetListener;
        DateTime var10005 = this.mEventEndDateTime;
        if (var10005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        int var1 = var10005.getHourOfDay();
        DateTime var10006 = this.mEventEndDateTime;
        if (var10006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
        }

        var10000.<init>(var10002, var10003, var10004, var1, var10006.getMinuteOfHour(), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getUse24HourFormat());
        var10000.show();
    }

    private final void dateSet(int year, int month, int day, boolean isStart) {
        DateTime var10001;
        if (isStart) {
            DateTime var10000 = this.mEventEndDateTime;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
            }

            long var7 = DateTimeKt.seconds(var10000);
            var10001 = this.mEventStartDateTime;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
            }

            long diff = var7 - DateTimeKt.seconds(var10001);
            var10001 = this.mEventStartDateTime;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
            }

            var10001 = var10001.withDate(year, month + 1, day);
            Intrinsics.checkNotNullExpressionValue(var10001, "mEventStartDateTime.withDate(year, month + 1, day)");
            this.mEventStartDateTime = var10001;
            this.updateStartDateText();
            this.checkRepeatRule();
            var10001 = this.mEventStartDateTime;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
            }

            var10001 = var10001.plusSeconds((int)diff);
            Intrinsics.checkNotNullExpressionValue(var10001, "mEventStartDateTime.plusSeconds(diff.toInt())");
            this.mEventEndDateTime = var10001;
            this.updateEndTexts();
        } else {
            var10001 = this.mEventEndDateTime;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
            }

            var10001 = var10001.withDate(year, month + 1, day);
            Intrinsics.checkNotNullExpressionValue(var10001, "mEventEndDateTime.withDate(year, month + 1, day)");
            this.mEventEndDateTime = var10001;
            this.updateEndDateText();
        }

    }

    private final void timeSet(int hours, int minutes, boolean isStart) {
        try {
            DateTime var10001;
            if (isStart) {
                DateTime var10000 = this.mEventEndDateTime;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
                }

                long var7 = DateTimeKt.seconds(var10000);
                var10001 = this.mEventStartDateTime;
                if (var10001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                }

                long diff = var7 - DateTimeKt.seconds(var10001);
                var10001 = this.mEventStartDateTime;
                if (var10001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                }

                var10001 = var10001.withHourOfDay(hours).withMinuteOfHour(minutes);
                Intrinsics.checkNotNullExpressionValue(var10001, "mEventStartDateTime.with…withMinuteOfHour(minutes)");
                this.mEventStartDateTime = var10001;
                this.updateStartTimeText();
                var10001 = this.mEventStartDateTime;
                if (var10001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                }

                var10001 = var10001.plusSeconds((int)diff);
                Intrinsics.checkNotNullExpressionValue(var10001, "mEventStartDateTime.plusSeconds(diff.toInt())");
                this.mEventEndDateTime = var10001;
                this.updateEndTexts();
            } else {
                var10001 = this.mEventEndDateTime;
                if (var10001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventEndDateTime");
                }

                var10001 = var10001.withHourOfDay(hours).withMinuteOfHour(minutes);
                Intrinsics.checkNotNullExpressionValue(var10001, "mEventEndDateTime.withHo…withMinuteOfHour(minutes)");
                this.mEventEndDateTime = var10001;
                this.updateEndTimeText();
            }

        } catch (Exception var6) {
            this.timeSet(hours + 1, minutes, isStart);
        }
    }

    private final void setupTimeZone() {
        Intent var1 = new Intent((Context)this, SelectTimeZoneActivity.class);
        int var3 = false;
        Event var10002 = this.mEvent;
        if (var10002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        var1.putExtra("current_time_zone", var10002.getTimeZoneString());
        this.startActivityForResult(var1, this.SELECT_TIME_ZONE_INTENT);
    }

    private final void checkRepeatRule() {
        if (IntKt.isXWeeklyRepetition(this.mRepeatInterval)) {
            int day = this.mRepeatRule;
            if (day == 1 || day == 2 || day == 4 || day == 8 || day == 16 || day == 32 || day == 64) {
                DateTime var10002 = this.mEventStartDateTime;
                if (var10002 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
                }

                this.setRepeatRule((int)Math.pow(2.0D, (double)(var10002.getDayOfWeek() - 1)));
            }
        } else if (IntKt.isXMonthlyRepetition(this.mRepeatInterval) || IntKt.isXYearlyRepetition(this.mRepeatInterval)) {
            if (this.mRepeatRule == 3 && !this.isLastDayOfTheMonth()) {
                this.mRepeatRule = 1;
            }

            this.checkRepetitionRuleText();
        }

    }

    private final void fillAvailableContacts() {
        this.mAvailableContacts = this.getEmails();
        List names = this.getNames();
        Iterable $this$forEach$iv = (Iterable)this.mAvailableContacts;
        int $i$f$forEach = false;
        Iterator var4 = $this$forEach$iv.iterator();

        while(var4.hasNext()) {
            Object element$iv = var4.next();
            Attendee it = (Attendee)element$iv;
            int var7 = false;
            int contactId = it.getContactId();
            Iterable $this$firstOrNull$iv = (Iterable)names;
            int $i$f$firstOrNull = false;
            Iterator var11 = $this$firstOrNull$iv.iterator();

            Object var10000;
            label44: {
                while(var11.hasNext()) {
                    Object element$iv = var11.next();
                    Attendee it = (Attendee)element$iv;
                    int var14 = false;
                    if (it.getContactId() == contactId) {
                        var10000 = element$iv;
                        break label44;
                    }
                }

                var10000 = null;
            }

            Attendee contact = (Attendee)var10000;
            String name = contact != null ? contact.getName() : null;
            if (name != null) {
                it.setName(name);
            }

            String photoUri = contact != null ? contact.getPhotoUri() : null;
            if (photoUri != null) {
                it.setPhotoUri(photoUri);
            }
        }

    }

    private final void updateAttendees() {
        Iterable $this$forEach$iv = (Iterable)com.simplemobiletools.calendar.pro.extensions.ContextKt.getCalDAVHelper(this).getCalDAVCalendars("", true);
        int $i$f$forEach = false;
        Iterator var4 = $this$forEach$iv.iterator();

        Object var10000;
        Object element$iv;
        boolean var7;
        while(true) {
            if (var4.hasNext()) {
                element$iv = var4.next();
                CalDAVCalendar it = (CalDAVCalendar)element$iv;
                var7 = false;
                if (it.getId() != this.mEventCalendarId) {
                    continue;
                }

                var10000 = element$iv;
                break;
            }

            var10000 = null;
            break;
        }

        CalDAVCalendar currentCalendar = (CalDAVCalendar)var10000;
        $this$forEach$iv = (Iterable)this.mAttendees;
        $i$f$forEach = false;
        var4 = $this$forEach$iv.iterator();

        while(var4.hasNext()) {
            element$iv = var4.next();
            Attendee it = (Attendee)element$iv;
            var7 = false;
            it.setMe(Intrinsics.areEqual(it.getEmail(), currentCalendar != null ? currentCalendar.getAccountName() : null));
        }

        List var10 = (List)this.mAttendees;
        Comparator var8 = (Comparator)(new EventActivity$updateAttendees$$inlined$compareBy$1());
        var8 = (Comparator)(new EventActivity$updateAttendees$$inlined$thenBy$1(var8));
        var8 = (Comparator)(new EventActivity$updateAttendees$$inlined$thenBy$2(var8));
        var8 = (Comparator)(new EventActivity$updateAttendees$$inlined$thenBy$3(var8));
        CollectionsKt.sortWith(var10, (Comparator)(new EventActivity$updateAttendees$$inlined$thenBy$4(var8)));
        CollectionsKt.reverse((List)this.mAttendees);
        this.runOnUiThread((Runnable)(new Runnable() {
            public final void run() {
                Iterable $this$forEach$iv = (Iterable)EventActivity.this.mAttendees;
                int $i$f$forEach = false;

                Attendee attendee;
                for(Iterator var3 = $this$forEach$iv.iterator(); var3.hasNext(); EventActivity.this.addAttendee(attendee)) {
                    Object element$ivx = var3.next();
                    Attendee itx = (Attendee)element$ivx;
                    int var6 = false;
                    attendee = itx;
                    Iterable $this$firstOrNull$iv = (Iterable)EventActivity.this.mAvailableContacts;
                    int $i$f$firstOrNull = false;
                    Iterator var10 = $this$firstOrNull$iv.iterator();

                    Object var17;
                    label51: {
                        while(var10.hasNext()) {
                            Object element$iv;
                            boolean var10000;
                            label47: {
                                element$iv = var10.next();
                                Attendee it = (Attendee)element$iv;
                                int var13 = false;
                                CharSequence var14 = (CharSequence)it.getEmail();
                                if (var14.length() > 0 && Intrinsics.areEqual(it.getEmail(), attendee.getEmail())) {
                                    var14 = (CharSequence)it.getPhotoUri();
                                    if (var14.length() > 0) {
                                        var10000 = true;
                                        break label47;
                                    }
                                }

                                var10000 = false;
                            }

                            if (var10000) {
                                var17 = element$iv;
                                break label51;
                            }
                        }

                        var17 = null;
                    }

                    Attendee deviceContact = (Attendee)var17;
                    if (deviceContact != null) {
                        attendee.setPhotoUri(deviceContact.getPhotoUri());
                    }
                }

                EventActivity.addAttendee$default(EventActivity.this, (Attendee)null, 1, (Object)null);
                ImageView var18 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_repetition_image);
                Intrinsics.checkNotNullExpressionValue(var18, "event_repetition_image");
                int imageHeight = var18.getHeight();
                if (imageHeight > 0) {
                    var18 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_attendees_image);
                    Intrinsics.checkNotNullExpressionValue(var18, "event_attendees_image");
                    var18.getLayoutParams().height = imageHeight;
                } else {
                    var18 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_repetition_image);
                    Intrinsics.checkNotNullExpressionValue(var18, "event_repetition_image");
                    ViewKt.onGlobalLayout((View)var18, (Function0)(new Function0() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            ImageView var10000 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_attendees_image);
                            Intrinsics.checkNotNullExpressionValue(var10000, "event_attendees_image");
                            LayoutParams var1 = var10000.getLayoutParams();
                            ImageView var10001 = (ImageView)EventActivity.this._$_findCachedViewById(id.event_repetition_image);
                            Intrinsics.checkNotNullExpressionValue(var10001, "event_repetition_image");
                            var1.height = var10001.getHeight();
                        }
                    }));
                }

            }
        }));
    }

    private final void addAttendee(Attendee attendee) {
        View var10000 = this.getLayoutInflater().inflate(1300122, (LinearLayout)this._$_findCachedViewById(id.event_attendees_holder), false);
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        } else {
            final RelativeLayout attendeeHolder = (RelativeLayout)var10000;
            final MyAutoCompleteTextView autoCompleteView = (MyAutoCompleteTextView)((View)attendeeHolder).findViewById(id.event_attendee);
            final RelativeLayout selectedAttendeeHolder = (RelativeLayout)((View)attendeeHolder).findViewById(id.event_contact_attendee);
            final ImageView selectedAttendeeDismiss = (ImageView)((View)attendeeHolder).findViewById(id.event_contact_dismiss);
            this.mAttendeeAutoCompleteViews.add(autoCompleteView);
            Intrinsics.checkNotNullExpressionValue(autoCompleteView, "autoCompleteView");
            EditTextKt.onTextChangeListener((EditText)autoCompleteView, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((String)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (EventActivity.this.mWasContactsPermissionChecked) {
                        EventActivity.this.checkNewAttendeeField();
                    } else {
                        EventActivity.this.handlePermission(5, (Function1)(new Function1() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke(Object var1) {
                                this.invoke((Boolean)var1);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean it) {
                                EventActivity.this.checkNewAttendeeField();
                                EventActivity.this.mWasContactsPermissionChecked = true;
                            }
                        }));
                    }

                }
            }));
            ((LinearLayout)this._$_findCachedViewById(id.event_attendees_holder)).addView((View)attendeeHolder);
            int textColor = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getTextColor();
            autoCompleteView.setColors(textColor, ContextKt.getAdjustedPrimaryColor(this), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getBackgroundColor());
            Intrinsics.checkNotNullExpressionValue(selectedAttendeeHolder, "selectedAttendeeHolder");
            ((MyTextView)((View)selectedAttendeeHolder).findViewById(id.event_contact_name)).setColors(textColor, ContextKt.getAdjustedPrimaryColor(this), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getBackgroundColor());
            ((MyTextView)((View)selectedAttendeeHolder).findViewById(id.event_contact_me_status)).setColors(textColor, ContextKt.getAdjustedPrimaryColor(this), com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getBackgroundColor());
            Intrinsics.checkNotNullExpressionValue(selectedAttendeeDismiss, "selectedAttendeeDismiss");
            ImageViewKt.applyColorFilter(selectedAttendeeDismiss, textColor);
            selectedAttendeeDismiss.setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    ViewKt.beGone((View)attendeeHolder);
                    EventActivity var10000 = EventActivity.this;
                    Iterable $this$filter$iv = (Iterable)EventActivity.this.mSelectedContacts;
                    EventActivity var11 = var10000;
                    int $i$f$filter = false;
                    Collection destination$iv$iv = (Collection)(new ArrayList());
                    int $i$f$filterTo = false;
                    Iterator var7 = $this$filter$iv.iterator();

                    while(var7.hasNext()) {
                        Object element$iv$iv = var7.next();
                        Attendee itx = (Attendee)element$iv$iv;
                        int var10 = false;
                        String var13 = itx.toString();
                        ImageView var10001 = selectedAttendeeDismiss;
                        Intrinsics.checkNotNullExpressionValue(var10001, "selectedAttendeeDismiss");
                        if (Intrinsics.areEqual(var13, var10001.getTag()) ^ true) {
                            destination$iv$iv.add(element$iv$iv);
                        }
                    }

                    List var12 = (List)destination$iv$iv;
                    List var14 = CollectionsKt.toMutableList((Collection)var12);
                    if (var14 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.simplemobiletools.calendar.pro.models.Attendee> /* = java.util.ArrayList<com.simplemobiletools.calendar.pro.models.Attendee> */");
                    } else {
                        var11.mSelectedContacts = (ArrayList)var14;
                    }
                }
            }));
            AutoCompleteTextViewAdapter adapter = new AutoCompleteTextViewAdapter((SimpleActivity)this, this.mAvailableContacts);
            autoCompleteView.setAdapter((ListAdapter)adapter);
            autoCompleteView.setImeOptions(5);
            autoCompleteView.setOnItemClickListener((OnItemClickListener)(new OnItemClickListener() {
                public final void onItemClick(AdapterView parent, View view, int position, long id) {
                    MyAutoCompleteTextView var10000 = autoCompleteView;
                    Intrinsics.checkNotNullExpressionValue(var10000, "autoCompleteView");
                    ListAdapter var8 = var10000.getAdapter();
                    if (var8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.calendar.pro.adapters.AutoCompleteTextViewAdapter");
                    } else {
                        ArrayList currAttendees = ((AutoCompleteTextViewAdapter)var8).getResultList();
                        Object var9 = currAttendees.get(position);
                        Intrinsics.checkNotNullExpressionValue(var9, "currAttendees[position]");
                        Attendee selectedAttendee = (Attendee)var9;
                        EventActivity var10 = EventActivity.this;
                        MyAutoCompleteTextView var10002 = autoCompleteView;
                        Intrinsics.checkNotNullExpressionValue(var10002, "autoCompleteView");
                        RelativeLayout var10003 = selectedAttendeeHolder;
                        Intrinsics.checkNotNullExpressionValue(var10003, "selectedAttendeeHolder");
                        var10.addSelectedAttendee(selectedAttendee, var10002, var10003);
                    }
                }
            }));
            if (attendee != null) {
                this.addSelectedAttendee(attendee, autoCompleteView, selectedAttendeeHolder);
            }

        }
    }

    // $FF: synthetic method
    static void addAttendee$default(EventActivity var0, Attendee var1, int var2, Object var3) {
        if ((var2 & 1) != 0) {
            var1 = (Attendee)null;
        }

        var0.addAttendee(var1);
    }

    private final void addSelectedAttendee(Attendee attendee, MyAutoCompleteTextView autoCompleteView, RelativeLayout selectedAttendeeHolder) {
        this.mSelectedContacts.add(attendee);
        ViewKt.beGone((View)autoCompleteView);
        View var10000 = autoCompleteView.focusSearch(130);
        if (var10000 != null) {
            var10000.requestFocus();
        }

        int var6 = false;
        ViewKt.beVisible((View)selectedAttendeeHolder);
        Drawable attendeeStatusBackground = selectedAttendeeHolder.getResources().getDrawable(700280);
        if (attendeeStatusBackground == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        } else {
            Drawable var14 = ((LayerDrawable)attendeeStatusBackground).findDrawableByLayerId(1001265);
            Intrinsics.checkNotNullExpressionValue(var14, "(attendeeStatusBackgroun…atus_circular_background)");
            DrawableKt.applyColorFilter(var14, com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getBackgroundColor());
            ImageView var8 = (ImageView)((View)selectedAttendeeHolder).findViewById(id.event_contact_status_image);
            int var10 = false;
            var8.setBackground(attendeeStatusBackground);
            var8.setImageDrawable(this.getAttendeeStatusImage(attendee));
            ViewKt.beVisibleIf((View)var8, attendee.showStatusImage());
            MyTextView var15 = (MyTextView)((View)selectedAttendeeHolder).findViewById(id.event_contact_name);
            Intrinsics.checkNotNullExpressionValue(var15, "event_contact_name");
            var15.setText(attendee.isMe() ? (CharSequence)this.getString(1900435) : (CharSequence)attendee.getPublicName());
            if (attendee.isMe()) {
                var15 = (MyTextView)((View)selectedAttendeeHolder).findViewById(id.event_contact_name);
                Intrinsics.checkNotNullExpressionValue(var15, "event_contact_name");
                LayoutParams var16 = var15.getLayoutParams();
                if (var16 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }

                android.widget.RelativeLayout.LayoutParams var17 = (android.widget.RelativeLayout.LayoutParams)var16;
                MyTextView var10002 = (MyTextView)((View)selectedAttendeeHolder).findViewById(id.event_contact_me_status);
                Intrinsics.checkNotNullExpressionValue(var10002, "event_contact_me_status");
                var17.addRule(16, var10002.getId());
            }

            Resources var18 = selectedAttendeeHolder.getResources();
            Context var10005 = selectedAttendeeHolder.getContext();
            Intrinsics.checkNotNullExpressionValue(var10005, "context");
            SimpleContactsHelper var10003 = new SimpleContactsHelper(var10005);
            MyTextView var10004 = (MyTextView)((View)selectedAttendeeHolder).findViewById(id.event_contact_name);
            Intrinsics.checkNotNullExpressionValue(var10004, "event_contact_name");
            BitmapDrawable placeholder = new BitmapDrawable(var18, var10003.getContactLetterIcon(TextViewKt.getValue((TextView)var10004)));
            ImageView var9 = (ImageView)((View)selectedAttendeeHolder).findViewById(id.event_contact_image);
            int var11 = false;
            Context var10001 = this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(var10001, "applicationContext");
            Intrinsics.checkNotNullExpressionValue(var9, "this");
            attendee.updateImage(var10001, var9, (Drawable)placeholder);
            ViewKt.beVisible((View)var9);
            var9 = (ImageView)((View)selectedAttendeeHolder).findViewById(id.event_contact_dismiss);
            var11 = false;
            var9.setTag(attendee.toString());
            ViewKt.beGoneIf((View)var9, attendee.isMe());
            if (attendee.isMe()) {
                this.updateAttendeeMe(selectedAttendeeHolder, attendee);
            }

            MyTextView var13 = (MyTextView)((View)selectedAttendeeHolder).findViewById(id.event_contact_me_status);
            var11 = false;
            ViewKt.beVisibleIf((View)var13, attendee.isMe());
            if (attendee.isMe()) {
                ((RelativeLayout)((View)selectedAttendeeHolder).findViewById(id.event_contact_attendee)).setOnClickListener((OnClickListener)(new EventActivity$addSelectedAttendee$$inlined$apply$lambda$1(selectedAttendeeHolder, this, attendee)));
            }

        }
    }

    private final Drawable getAttendeeStatusImage(Attendee attendee) {
        Resources var10000 = this.getResources();
        int var10001;
        switch(attendee.getStatus()) {
            case 1:
                var10001 = 700043;
                break;
            case 2:
                var10001 = 700343;
                break;
            default:
                var10001 = 700164;
        }

        Drawable var2 = var10000.getDrawable(var10001);
        Intrinsics.checkNotNullExpressionValue(var2, "resources.getDrawable(\n …w\n            }\n        )");
        return var2;
    }

    private final void updateAttendeeMe(RelativeLayout holder, Attendee attendee) {
        int var5 = false;
        MyTextView var10000 = (MyTextView)((View)holder).findViewById(id.event_contact_me_status);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_contact_me_status");
        int var10002;
        switch(attendee.getStatus()) {
            case 1:
                var10002 = 1900587;
                break;
            case 2:
                var10002 = 1900826;
                break;
            case 3:
            default:
                var10002 = 1900937;
                break;
            case 4:
                var10002 = 1901132;
        }

        var10000.setText((CharSequence)this.getString(var10002));
        ImageView var6 = (ImageView)((View)holder).findViewById(id.event_contact_status_image);
        int var8 = false;
        ViewKt.beVisibleIf((View)var6, attendee.showStatusImage());
        var6.setImageDrawable(this.getAttendeeStatusImage(attendee));
        Iterable $this$firstOrNull$iv = (Iterable)this.mAttendees;
        int $i$f$firstOrNull = false;
        Iterator var13 = $this$firstOrNull$iv.iterator();

        Object var14;
        while(true) {
            if (var13.hasNext()) {
                Object element$iv = var13.next();
                Attendee it = (Attendee)element$iv;
                int var11 = false;
                if (!it.isMe()) {
                    continue;
                }

                var14 = element$iv;
                break;
            }

            var14 = null;
            break;
        }

        Attendee var15 = (Attendee)var14;
        if (var15 != null) {
            var15.setStatus(attendee.getStatus());
        }

    }

    private final void checkNewAttendeeField() {
        Iterable $this$none$iv = (Iterable)this.mAttendeeAutoCompleteViews;
        int $i$f$none = false;
        boolean var10000;
        if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
            var10000 = true;
        } else {
            Iterator var3 = $this$none$iv.iterator();

            while(true) {
                if (!var3.hasNext()) {
                    var10000 = true;
                    break;
                }

                label32: {
                    Object element$iv = var3.next();
                    MyAutoCompleteTextView it = (MyAutoCompleteTextView)element$iv;
                    int var6 = false;
                    if (ViewKt.isVisible((View)it)) {
                        CharSequence var7 = (CharSequence)EditTextKt.getValue((EditText)it);
                        if (var7.length() == 0) {
                            var10000 = true;
                            break label32;
                        }
                    }

                    var10000 = false;
                }

                if (var10000) {
                    var10000 = false;
                    break;
                }
            }
        }

        if (var10000) {
            addAttendee$default(this, (Attendee)null, 1, (Object)null);
        }

    }

    private final String getAllAttendees(boolean isSavingEvent) {
        Object attendees = new ArrayList();
        Iterable $this$forEach$iv = (Iterable)this.mSelectedContacts;
        int $i$f$forEach = false;
        Iterator var5 = $this$forEach$iv.iterator();

        boolean $i$f$filterTo;
        while(var5.hasNext()) {
            Object element$iv = var5.next();
            Attendee it = (Attendee)element$iv;
            $i$f$filterTo = false;
            attendees.add(it);
        }

        Iterable $this$distinctBy$iv = (Iterable)this.mAttendeeAutoCompleteViews;
        int $i$f$distinctBy = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        $i$f$filterTo = false;
        Iterator var9 = $this$distinctBy$iv.iterator();

        Object element$iv$iv;
        MyAutoCompleteTextView it;
        boolean var12;
        while(var9.hasNext()) {
            element$iv$iv = var9.next();
            it = (MyAutoCompleteTextView)element$iv$iv;
            var12 = false;
            if (ViewKt.isVisible((View)it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        $this$distinctBy$iv = (Iterable)((List)destination$iv$iv);
        $i$f$distinctBy = false;
        destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$distinctBy$iv, 10)));
        $i$f$filterTo = false;
        var9 = $this$distinctBy$iv.iterator();

        while(var9.hasNext()) {
            element$iv$iv = var9.next();
            it = (MyAutoCompleteTextView)element$iv$iv;
            var12 = false;
            String var20 = EditTextKt.getValue((EditText)it);
            destination$iv$iv.add(var20);
        }

        $this$distinctBy$iv = (Iterable)((List)destination$iv$iv);
        $i$f$distinctBy = false;
        destination$iv$iv = (Collection)(new ArrayList());
        $i$f$filterTo = false;
        var9 = $this$distinctBy$iv.iterator();

        while(var9.hasNext()) {
            element$iv$iv = var9.next();
            String it = (String)element$iv$iv;
            var12 = false;
            CharSequence var13 = (CharSequence)it;
            if (var13.length() > 0) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        List var10000 = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        } else {
            ArrayList customEmails = (ArrayList)var10000;
            $this$distinctBy$iv = (Iterable)customEmails;
            Collection destination$iv = (Collection)attendees;
            int $i$f$firstOrNull = false;
            Iterator var32 = $this$distinctBy$iv.iterator();

            Object element$iv;
            boolean $i$f$filter;
            while(var32.hasNext()) {
                element$iv = var32.next();
                String it = (String)element$iv;
                $i$f$filter = false;
                Attendee var53 = new Attendee(0, "", it, 3, "", false, 0);
                destination$iv.add(var53);
            }

            $this$distinctBy$iv = (Iterable)attendees;
            $i$f$distinctBy = false;
            HashSet set$iv = new HashSet();
            ArrayList list$iv = new ArrayList();
            Iterator var35 = $this$distinctBy$iv.iterator();

            while(var35.hasNext()) {
                Object e$iv = var35.next();
                Attendee it = (Attendee)e$iv;
                int var46 = false;
                Object key$iv = it.getEmail();
                if (set$iv.add(key$iv)) {
                    list$iv.add(e$iv);
                }
            }

            List var54 = (List)list$iv;
            var10000 = CollectionsKt.toMutableList((Collection)var54);
            if (var10000 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.simplemobiletools.calendar.pro.models.Attendee> /* = java.util.ArrayList<com.simplemobiletools.calendar.pro.models.Attendee> */");
            } else {
                attendees = (ArrayList)var10000;
                Event var49 = this.mEvent;
                if (var49 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }

                if (var49.getId() == null && isSavingEvent) {
                    Collection var24 = (Collection)attendees;
                    if (!var24.isEmpty()) {
                        Iterable $this$firstOrNull$iv = (Iterable)com.simplemobiletools.calendar.pro.extensions.ContextKt.getCalDAVHelper(this).getCalDAVCalendars("", true);
                        $i$f$firstOrNull = false;
                        var32 = $this$firstOrNull$iv.iterator();

                        Object var50;
                        label110: {
                            while(var32.hasNext()) {
                                element$iv = var32.next();
                                CalDAVCalendar it = (CalDAVCalendar)element$iv;
                                $i$f$filter = false;
                                if (it.getId() == this.mEventCalendarId) {
                                    var50 = element$iv;
                                    break label110;
                                }
                            }

                            var50 = null;
                        }

                        CalDAVCalendar currentCalendar = (CalDAVCalendar)var50;
                        $this$firstOrNull$iv = (Iterable)this.mAvailableContacts;
                        $i$f$firstOrNull = false;
                        var32 = $this$firstOrNull$iv.iterator();

                        label100: {
                            while(var32.hasNext()) {
                                element$iv = var32.next();
                                Attendee it = (Attendee)element$iv;
                                $i$f$filter = false;
                                if (Intrinsics.areEqual(it.getEmail(), currentCalendar != null ? currentCalendar.getAccountName() : null)) {
                                    var50 = element$iv;
                                    break label100;
                                }
                            }

                            var50 = null;
                        }

                        Attendee var51 = (Attendee)var50;
                        if (var51 != null) {
                            Attendee var31 = var51;
                            int var36 = false;
                            Iterable $this$filter$iv = (Iterable)attendees;
                            $i$f$filter = false;
                            Collection destination$iv$iv = (Collection)(new ArrayList());
                            int $i$f$filterTo = false;
                            Iterator var14 = $this$filter$iv.iterator();

                            while(var14.hasNext()) {
                                Object element$iv$iv = var14.next();
                                Attendee it = (Attendee)element$iv$iv;
                                int var17 = false;
                                if (Intrinsics.areEqual(it.getEmail(), currentCalendar != null ? currentCalendar.getAccountName() : null) ^ true) {
                                    destination$iv$iv.add(element$iv$iv);
                                }
                            }

                            List var18 = (List)destination$iv$iv;
                            var10000 = CollectionsKt.toMutableList((Collection)var18);
                            if (var10000 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.simplemobiletools.calendar.pro.models.Attendee> /* = java.util.ArrayList<com.simplemobiletools.calendar.pro.models.Attendee> */");
                            }

                            attendees = (ArrayList)var10000;
                            var31.setStatus(1);
                            var31.setRelationship(2);
                            attendees.add(var31);
                        }
                    }
                }

                String var52 = (new Gson()).toJson(attendees);
                Intrinsics.checkNotNullExpressionValue(var52, "Gson().toJson(attendees)");
                return var52;
            }
        }
    }

    private final List getNames() {
        final ArrayList contacts = new ArrayList();
        Uri uri = Data.CONTENT_URI;
        String[] projection = new String[]{"contact_id", "data4", "data2", "data5", "data3", "data6", "photo_thumb_uri"};
        String selection = "mimetype = ?";
        String[] selectionArgs = new String[]{"vnd.android.cursor.item/name"};
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        ContextKt.queryCursor$default(this, uri, projection, selection, selectionArgs, (String)null, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Cursor)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                int id = CursorKt.getIntValue(cursor, "contact_id");
                String var10000 = CursorKt.getStringValue(cursor, "data4");
                if (var10000 == null) {
                    var10000 = "";
                }

                String prefix = var10000;
                var10000 = CursorKt.getStringValue(cursor, "data2");
                if (var10000 == null) {
                    var10000 = "";
                }

                String firstName = var10000;
                var10000 = CursorKt.getStringValue(cursor, "data5");
                if (var10000 == null) {
                    var10000 = "";
                }

                String middleName = var10000;
                var10000 = CursorKt.getStringValue(cursor, "data3");
                if (var10000 == null) {
                    var10000 = "";
                }

                String surname = var10000;
                var10000 = CursorKt.getStringValue(cursor, "data6");
                if (var10000 == null) {
                    var10000 = "";
                }

                String suffix = var10000;
                var10000 = CursorKt.getStringValue(cursor, "photo_thumb_uri");
                if (var10000 == null) {
                    var10000 = "";
                }

                String photoUri = var10000;
                Iterable $this$filter$iv = (Iterable)CollectionsKt.arrayListOf(new String[]{prefix, firstName, middleName, surname, suffix});
                int $i$f$filter = false;
                Collection destination$iv$iv = (Collection)(new ArrayList());
                int $i$f$filterTo = false;
                Iterator var15 = $this$filter$iv.iterator();

                while(var15.hasNext()) {
                    Object element$iv$iv = var15.next();
                    String it = (String)element$iv$iv;
                    int var18 = false;
                    CharSequence var19 = (CharSequence)StringsKt.trim((CharSequence)it).toString();
                    if (var19.length() > 0) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                }

                List names = (List)destination$iv$iv;
                var10000 = TextUtils.join((CharSequence)" ", (Iterable)names);
                Intrinsics.checkNotNullExpressionValue(var10000, "TextUtils.join(\" \", names)");
                String var21 = var10000;
                String fullName = StringsKt.trim((CharSequence)var21).toString();
                CharSequence var22 = (CharSequence)fullName;
                if (var22.length() <= 0) {
                    var22 = (CharSequence)photoUri;
                    if (var22.length() <= 0) {
                        return;
                    }
                }

                Attendee contact = new Attendee(id, fullName, "", 0, photoUri, false, 0);
                contacts.add(contact);
            }
        }), 48, (Object)null);
        return (List)contacts;
    }

    private final ArrayList getEmails() {
        final ArrayList contacts = new ArrayList();
        Uri uri = Email.CONTENT_URI;
        String[] projection = new String[]{"contact_id", "data1"};
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        ContextKt.queryCursor$default(this, uri, projection, (String)null, (String[])null, (String)null, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Cursor)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                int id = CursorKt.getIntValue(cursor, "contact_id");
                String var10000 = CursorKt.getStringValue(cursor, "data1");
                if (var10000 != null) {
                    String email = var10000;
                    Attendee contact = new Attendee(id, "", email, 0, "", false, 0);
                    contacts.add(contact);
                }
            }
        }), 60, (Object)null);
        return contacts;
    }

    private final void updateIconColors() {
        ImageView var10000 = (ImageView)this._$_findCachedViewById(id.event_show_on_map);
        Intrinsics.checkNotNullExpressionValue(var10000, "event_show_on_map");
        ImageViewKt.applyColorFilter(var10000, ContextKt.getAdjustedPrimaryColor(this));
        int textColor = com.simplemobiletools.calendar.pro.extensions.ContextKt.getConfig(this).getTextColor();
        Object[] $this$forEach$iv = new ImageView[]{(ImageView)this._$_findCachedViewById(id.event_time_image), (ImageView)this._$_findCachedViewById(id.event_time_zone_image), (ImageView)this._$_findCachedViewById(id.event_repetition_image), (ImageView)this._$_findCachedViewById(id.event_reminder_image), (ImageView)this._$_findCachedViewById(id.event_type_image), (ImageView)this._$_findCachedViewById(id.event_caldav_calendar_image), (ImageView)this._$_findCachedViewById(id.event_reminder_1_type), (ImageView)this._$_findCachedViewById(id.event_reminder_2_type), (ImageView)this._$_findCachedViewById(id.event_reminder_3_type), (ImageView)this._$_findCachedViewById(id.event_attendees_image), (ImageView)this._$_findCachedViewById(id.event_availability_image)};
        int $i$f$forEach = false;
        ImageView[] var4 = $this$forEach$iv;
        int var5 = $this$forEach$iv.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Object element$iv = var4[var6];
            int var9 = false;
            Intrinsics.checkNotNullExpressionValue(element$iv, "it");
            ImageViewKt.applyColorFilter(element$iv, textColor);
        }

    }

    public EventActivity() {
        DateTimeZone var10001 = DateTimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(var10001, "DateTimeZone.getDefault()");
        this.mOriginalTimeZone = var10001.getID();
        this.startDateSetListener = (OnDateSetListener)(new OnDateSetListener() {
            public final void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                EventActivity.this.dateSet(year, monthOfYear, dayOfMonth, true);
            }
        });
        this.startTimeSetListener = (OnTimeSetListener)(new OnTimeSetListener() {
            public final void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                EventActivity.this.timeSet(hourOfDay, minute, true);
            }
        });
        this.endDateSetListener = (OnDateSetListener)(new OnDateSetListener() {
            public final void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                EventActivity.this.dateSet(year, monthOfYear, dayOfMonth, false);
            }
        });
        this.endTimeSetListener = (OnTimeSetListener)(new OnTimeSetListener() {
            public final void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                EventActivity.this.timeSet(hourOfDay, minute, false);
            }
        });
    }

    // $FF: synthetic method
    public static final Event access$getMEvent$p(EventActivity $this) {
        Event var10000 = $this.mEvent;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }

        return var10000;
    }

    // $FF: synthetic method
    public static final void access$setMEvent$p(EventActivity $this, Event var1) {
        $this.mEvent = var1;
    }

    // $FF: synthetic method
    public static final boolean access$getMWasCalendarChanged$p(EventActivity $this) {
        return $this.mWasCalendarChanged;
    }

    // $FF: synthetic method
    public static final void access$setMEventOccurrenceTS$p(EventActivity $this, long var1) {
        $this.mEventOccurrenceTS = var1;
    }

    // $FF: synthetic method
    public static final DateTime access$getMEventStartDateTime$p(EventActivity $this) {
        DateTime var10000 = $this.mEventStartDateTime;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventStartDateTime");
        }

        return var10000;
    }

    // $FF: synthetic method
    public static final void access$setMEventStartDateTime$p(EventActivity $this, DateTime var1) {
        $this.mEventStartDateTime = var1;
    }

    // $FF: synthetic method
    public static final void access$setMAttendees$p(EventActivity $this, ArrayList var1) {
        $this.mAttendees = var1;
    }

    // $FF: synthetic method
    public static final void access$setMAvailableContacts$p(EventActivity $this, ArrayList var1) {
        $this.mAvailableContacts = var1;
    }

    // $FF: synthetic method
    public static final void access$updateAttendeeMe(EventActivity $this, RelativeLayout holder, Attendee attendee) {
        $this.updateAttendeeMe(holder, attendee);
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
// EventActivity$updateAttendees$$inlined$thenBy$1.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class EventActivity$updateAttendees$$inlined$thenBy$1 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;

    public EventActivity$updateAttendees$$inlined$thenBy$1(Comparator var1) {
        this.$this_thenBy = var1;
    }

    public final int compare(Object a, Object b) {
        int previousCompare = this.$this_thenBy.compare(a, b);
        int var10000;
        if (previousCompare != 0) {
            var10000 = previousCompare;
        } else {
            boolean var4 = false;
            Attendee it = (Attendee)a;
            int var6 = false;
            Comparable var9 = (Comparable)it.getStatus() == 1;
            it = (Attendee)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)it.getStatus() == 1;
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// EventActivity$addSelectedAttendee$$inlined$apply$lambda$1$1.java
package com.simplemobiletools.calendar.pro.activities;

    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Lambda;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/activities/EventActivity$addSelectedAttendee$1$5$1"}
)
final class EventActivity$addSelectedAttendee$$inlined$apply$lambda$1$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final EventActivity$addSelectedAttendee$$inlined$apply$lambda$1 this$0;

    EventActivity$addSelectedAttendee$$inlined$apply$lambda$1$1(EventActivity$addSelectedAttendee$$inlined$apply$lambda$1 var1) {
        super(1);
        this.this$0 = var1;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke(var1);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.$attendee$inlined.setStatus((Integer)it);
        EventActivity.access$updateAttendeeMe(this.this$0.this$0, this.this$0.$this_apply, this.this$0.$attendee$inlined);
    }
}
