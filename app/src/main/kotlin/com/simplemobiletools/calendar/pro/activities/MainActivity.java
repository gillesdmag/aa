// MainActivity$addPrivateEvents$$inlined$forEach$lambda$1.java
package com.simplemobiletools.calendar.pro.activities;

import com.simplemobiletools.commons.models.SimpleContact;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"},
    d2 = {"<anonymous>", "", "it", "", "invoke", "com/simplemobiletools/calendar/pro/activities/MainActivity$addPrivateEvents$2$1$2", "com/simplemobiletools/calendar/pro/activities/MainActivity$$special$$inlined$forEach$lambda$1"}
)
final class MainActivity$addPrivateEvents$$inlined$forEach$lambda$1 extends Lambda implements Function1 {
    // $FF: synthetic field
    final SimpleContact $contact$inlined;
    // $FF: synthetic field
    final MainActivity this$0;
    // $FF: synthetic field
    final boolean $birthdays$inlined;
    // $FF: synthetic field
    final ArrayList $reminders$inlined;
    // $FF: synthetic field
    final long $eventTypeId$inlined;
    // $FF: synthetic field
    final String $source$inlined;
    // $FF: synthetic field
    final HashMap $importIDs$inlined;
    // $FF: synthetic field
    final IntRef $eventsFound$inlined;
    // $FF: synthetic field
    final IntRef $eventsAdded$inlined;

    MainActivity$addPrivateEvents$$inlined$forEach$lambda$1(SimpleContact var1, MainActivity var2, boolean var3, ArrayList var4, long var5, String var7, HashMap var8, IntRef var9, IntRef var10) {
        super(1);
        this.$contact$inlined = var1;
        this.this$0 = var2;
        this.$birthdays$inlined = var3;
        this.$reminders$inlined = var4;
        this.$eventTypeId$inlined = var5;
        this.$source$inlined = var7;
        this.$importIDs$inlined = var8;
        this.$eventsFound$inlined = var9;
        this.$eventsAdded$inlined = var10;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke(Object var1) {
        this.invoke(((Number)var1).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long it) {
        int var10001 = this.$eventsAdded$inlined.element++;
    }
}
// MainActivity$setupSearch$$inlined$apply$lambda$1.java
package com.simplemobiletools.calendar.pro.activities;

    import android.app.SearchManager;
    import androidx.appcompat.widget.SearchView.OnQueryTextListener;
    import kotlin.Metadata;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b¸\u0006\u0000"},
    d2 = {"com/simplemobiletools/calendar/pro/activities/MainActivity$setupSearch$1$1", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", "query", "calendar_debug"}
)
public final class MainActivity$setupSearch$$inlined$apply$lambda$1 implements OnQueryTextListener {
    // $FF: synthetic field
    final MainActivity this$0;
    // $FF: synthetic field
    final SearchManager $searchManager$inlined;

    MainActivity$setupSearch$$inlined$apply$lambda$1(MainActivity var1, SearchManager var2) {
        this.this$0 = var1;
        this.$searchManager$inlined = var2;
    }

    public boolean onQueryTextSubmit(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return false;
    }

    public boolean onQueryTextChange(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        if (MainActivity.access$getMIsSearchOpen$p(this.this$0)) {
            MainActivity.access$searchQueryChanged(this.this$0, newText);
        }

        return true;
    }
}
// MainActivity$WhenMappings.java
package com.simplemobiletools.calendar.pro.activities;

    import com.simplemobiletools.calendar.pro.helpers.IcsExporter.ExportResult;
    import com.simplemobiletools.calendar.pro.helpers.IcsImporter.ImportResult;
    import kotlin.Metadata;

// $FF: synthetic class
@Metadata(
    mv = {1, 5, 1},
    k = 3
)
public final class MainActivity$WhenMappings {
    // $FF: synthetic field
    public static final int[] $EnumSwitchMapping$0 = new int[ImportResult.values().length];
    // $FF: synthetic field
    public static final int[] $EnumSwitchMapping$1;

    static {
        $EnumSwitchMapping$0[ImportResult.IMPORT_NOTHING_NEW.ordinal()] = 1;
        $EnumSwitchMapping$0[ImportResult.IMPORT_OK.ordinal()] = 2;
        $EnumSwitchMapping$0[ImportResult.IMPORT_PARTIAL.ordinal()] = 3;
        $EnumSwitchMapping$1 = new int[ExportResult.values().length];
        $EnumSwitchMapping$1[ExportResult.EXPORT_OK.ordinal()] = 1;
        $EnumSwitchMapping$1[ExportResult.EXPORT_PARTIAL.ordinal()] = 2;
    }
}
// MainActivity.java
package com.simplemobiletools.calendar.pro.activities;

    import android.annotation.SuppressLint;
    import android.app.Activity;
    import android.app.SearchManager;
    import android.content.ContentResolver;
    import android.content.Context;
    import android.content.Intent;
    import android.content.pm.ShortcutInfo;
    import android.content.pm.ShortcutManager;
    import android.content.pm.ShortcutInfo.Builder;
    import android.database.Cursor;
    import android.graphics.Bitmap;
    import android.graphics.drawable.ColorDrawable;
    import android.graphics.drawable.Drawable;
    import android.graphics.drawable.Icon;
    import android.graphics.drawable.LayerDrawable;
    import android.net.Uri;
    import android.os.Bundle;
    import android.provider.ContactsContract.Data;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.View.OnClickListener;
    import android.widget.RelativeLayout;
    import androidx.appcompat.app.ActionBar;
    import androidx.appcompat.widget.SearchView;
    import androidx.appcompat.widget.SearchView.OnQueryTextListener;
    import androidx.coordinatorlayout.widget.CoordinatorLayout;
    import androidx.core.view.MenuItemCompat;
    import androidx.core.view.MenuItemCompat.OnActionExpandListener;
    import androidx.fragment.app.Fragment;
    import androidx.loader.content.CursorLoader;
    import androidx.recyclerview.widget.RecyclerView.Adapter;
    import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
    import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
    import com.simplemobiletools.calendar.pro.R.id;
    import com.simplemobiletools.calendar.pro.adapters.EventListAdapter;
    import com.simplemobiletools.calendar.pro.adapters.QuickFilterEventTypeAdapter;
    import com.simplemobiletools.calendar.pro.databases.EventsDatabase;
    import com.simplemobiletools.calendar.pro.dialogs.ExportEventsDialog;
    import com.simplemobiletools.calendar.pro.dialogs.FilterEventTypesDialog;
    import com.simplemobiletools.calendar.pro.dialogs.ImportEventsDialog;
    import com.simplemobiletools.calendar.pro.dialogs.SetRemindersDialog;
    import com.simplemobiletools.calendar.pro.extensions.ContextKt;
    import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
    import com.simplemobiletools.calendar.pro.fragments.DayFragmentsHolder;
    import com.simplemobiletools.calendar.pro.fragments.EventListFragment;
    import com.simplemobiletools.calendar.pro.fragments.MonthDayFragmentsHolder;
    import com.simplemobiletools.calendar.pro.fragments.MonthFragmentsHolder;
    import com.simplemobiletools.calendar.pro.fragments.MyFragmentHolder;
    import com.simplemobiletools.calendar.pro.fragments.WeekFragmentsHolder;
    import com.simplemobiletools.calendar.pro.fragments.YearFragmentsHolder;
    import com.simplemobiletools.calendar.pro.helpers.Config;
    import com.simplemobiletools.calendar.pro.helpers.EventsHelper;
    import com.simplemobiletools.calendar.pro.helpers.Formatter;
    import com.simplemobiletools.calendar.pro.helpers.IcsExporter;
    import com.simplemobiletools.calendar.pro.helpers.IcsImporter;
    import com.simplemobiletools.calendar.pro.helpers.IcsExporter.ExportResult;
    import com.simplemobiletools.calendar.pro.helpers.IcsImporter.ImportResult;
    import com.simplemobiletools.calendar.pro.jobs.CalDAVUpdateListener;
    import com.simplemobiletools.calendar.pro.models.Event;
    import com.simplemobiletools.calendar.pro.models.EventType;
    import com.simplemobiletools.calendar.pro.models.ListEvent;
    import com.simplemobiletools.commons.activities.BaseSimpleActivity;
    import com.simplemobiletools.commons.dialogs.ConfirmationDialog;
    import com.simplemobiletools.commons.dialogs.FilePickerDialog;
    import com.simplemobiletools.commons.dialogs.RadioGroupDialog;
    import com.simplemobiletools.commons.extensions.ActivityKt;
    import com.simplemobiletools.commons.extensions.CursorKt;
    import com.simplemobiletools.commons.extensions.DrawableKt;
    import com.simplemobiletools.commons.extensions.FileKt;
    import com.simplemobiletools.commons.extensions.StringKt;
    import com.simplemobiletools.commons.extensions.ViewKt;
    import com.simplemobiletools.commons.helpers.ConstantsKt;
    import com.simplemobiletools.commons.helpers.MyContactsContentProvider;
    import com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener;
    import com.simplemobiletools.commons.models.FAQItem;
    import com.simplemobiletools.commons.models.RadioItem;
    import com.simplemobiletools.commons.models.Release;
    import com.simplemobiletools.commons.models.SimpleContact;
    import com.simplemobiletools.commons.views.MyFloatingActionButton;
    import com.simplemobiletools.commons.views.MyRecyclerView;
    import com.simplemobiletools.commons.views.MyTextView;
    import java.io.File;
    import java.io.FileOutputStream;
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collection;
    import java.util.Date;
    import java.util.HashMap;
    import java.util.Iterator;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Locale;
    import java.util.Map;
    import java.util.Set;
    import java.util.TimeZone;
    import java.util.Map.Entry;
    import kotlin.Metadata;
    import kotlin.Unit;
    import kotlin.collections.CollectionsKt;
    import kotlin.io.ByteStreamsKt;
    import kotlin.jvm.functions.Function0;
    import kotlin.jvm.functions.Function1;
    import kotlin.jvm.functions.Function2;
    import kotlin.jvm.internal.DefaultConstructorMarker;
    import kotlin.jvm.internal.Intrinsics;
    import kotlin.jvm.internal.Ref.IntRef;
    import kotlin.text.StringsKt;
    import org.jetbrains.annotations.NotNull;
    import org.jetbrains.annotations.Nullable;
    import org.joda.time.DateTime;
    import org.joda.time.DateTimeZone;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0002JL\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00102\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\n2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0*H\u0002J\b\u0010+\u001a\u00020#H\u0002Jx\u0010,\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00102\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0\bj\b\u0012\u0004\u0012\u00020.`\n2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\n26\u0010)\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020#0/H\u0002J\b\u00104\u001a\u00020#H\u0002J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020\u0010H\u0002J\b\u00107\u001a\u00020#H\u0002J\b\u00108\u001a\u00020#H\u0003J\b\u00109\u001a\u00020#H\u0002J\b\u0010:\u001a\u00020#H\u0002J\b\u0010;\u001a\u00020#H\u0002J*\u0010<\u001a\u00020#2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\n2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\b\u0010@\u001a\u00020\tH\u0002J\u0018\u0010A\u001a\u0012\u0012\u0004\u0012\u00020B0\bj\b\u0012\u0004\u0012\u00020B`\nH\u0002J\b\u0010C\u001a\u00020\u0012H\u0002J\b\u0010D\u001a\u00020#H\u0002J\u0010\u0010E\u001a\u00020#2\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020#H\u0002J\b\u0010I\u001a\u00020#H\u0002J\b\u0010J\u001a\u00020#H\u0002J\"\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00052\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\b\u0010P\u001a\u00020#H\u0016J\u0012\u0010Q\u001a\u00020#2\b\u0010R\u001a\u0004\u0018\u00010SH\u0014J\u0010\u0010T\u001a\u00020\u00102\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020#H\u0014J\u0012\u0010X\u001a\u00020#2\b\u0010Y\u001a\u0004\u0018\u00010OH\u0014J\u0010\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u000eH\u0016J\b\u0010\\\u001a\u00020#H\u0014J\u0010\u0010]\u001a\u00020\u00102\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010^\u001a\u00020#H\u0014J\u0010\u0010_\u001a\u00020#2\u0006\u0010`\u001a\u00020\fH\u0002J\u000e\u0010a\u001a\u00020#2\u0006\u0010b\u001a\u00020cJ\u000e\u0010d\u001a\u00020#2\u0006\u0010b\u001a\u00020cJ\b\u0010e\u001a\u00020#H\u0002J\u0010\u0010f\u001a\u00020#2\u0006\u0010g\u001a\u00020\u0010H\u0002J\b\u0010h\u001a\u00020#H\u0016J\b\u0010i\u001a\u00020#H\u0002J\b\u0010j\u001a\u00020#H\u0002J\b\u0010k\u001a\u00020#H\u0002J\u0010\u0010l\u001a\u00020#2\u0006\u0010m\u001a\u00020\u0012H\u0002J\b\u0010n\u001a\u00020#H\u0002J\u0010\u0010o\u001a\u00020#2\u0006\u0010U\u001a\u00020VH\u0002J\b\u0010p\u001a\u00020#H\u0002J\u0006\u0010q\u001a\u00020#J\u0010\u0010r\u001a\u00020#2\u0006\u0010s\u001a\u00020\u0012H\u0002J\b\u0010t\u001a\u00020#H\u0002J\b\u0010u\u001a\u00020#H\u0002J\b\u0010v\u001a\u00020#H\u0002J\u000e\u0010w\u001a\u00020#2\u0006\u0010x\u001a\u00020\u0010J\b\u0010y\u001a\u00020#H\u0002J\b\u0010z\u001a\u00020#H\u0002J\b\u0010{\u001a\u00020#H\u0002J\b\u0010|\u001a\u00020#H\u0002J\u0010\u0010}\u001a\u00020#2\u0006\u0010~\u001a\u00020\u007fH\u0002J\u0012\u0010\u0080\u0001\u001a\u00020#2\u0007\u0010\u0081\u0001\u001a\u00020\u0005H\u0002J\u0016\u0010\u0082\u0001\u001a\u00020#2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0084\u0001"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/MainActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;", "()V", "PICK_EXPORT_FILE_INTENT", "", "PICK_IMPORT_SOURCE_INTENT", "currentFragments", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/fragments/MyFragmentHolder;", "Lkotlin/collections/ArrayList;", "eventTypesToExport", "", "goToTodayButton", "Landroid/view/MenuItem;", "mIsSearchOpen", "", "mLatestSearchQuery", "", "mSearchMenuItem", "mShouldFilterBeVisible", "mStoredAdjustedPrimaryColor", "mStoredBackgroundColor", "mStoredDayCode", "mStoredDimPastEvents", "mStoredHighlightWeekends", "mStoredHighlightWeekendsColor", "mStoredIsSundayFirst", "mStoredMidnightSpan", "mStoredStartWeekWithCurrentDay", "mStoredTextColor", "mStoredUse24HourFormat", "shouldGoToTodayBeVisible", "showCalDAVRefreshToast", "addBirthdaysAnniversariesAtStart", "", "addContactEvents", "birthdays", "reminders", "initEventsFound", "initEventsAdded", "callback", "Lkotlin/Function1;", "addHolidays", "addPrivateEvents", "contacts", "Lcom/simplemobiletools/commons/models/SimpleContact;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "eventsFound", "eventsAdded", "calDAVChanged", "checkCalDAVUpdateListener", "checkIsOpenIntent", "checkIsViewIntent", "checkShortcuts", "checkSwipeRefreshAvailability", "checkWhatsNewDialog", "closeSearch", "exportEventsTo", "eventTypes", "outputStream", "Ljava/io/OutputStream;", "getFragmentsHolder", "getHolidayRadioItems", "Lcom/simplemobiletools/commons/models/RadioItem;", "getThisWeekDateTime", "goToToday", "handleParseResult", "result", "Lcom/simplemobiletools/calendar/pro/helpers/IcsImporter$ImportResult;", "importEvents", "launchAbout", "launchSettings", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onNewIntent", "intent", "onOptionsItemSelected", "item", "onPause", "onPrepareOptionsMenu", "onResume", "openDayAt", "timestamp", "openDayFromMonthly", "dateTime", "Lorg/joda/time/DateTime;", "openMonthFromYearly", "printView", "refreshCalDAVCalendars", "showRefreshToast", "refreshItems", "refreshViewPager", "removeTopFragment", "resetActionBarTitle", "searchQueryChanged", "text", "setupQuickFilter", "setupSearch", "showFilterDialog", "showGoToDateDialog", "showImportEventsDialog", "path", "showViewDialog", "stopCalDAVUpdateListener", "storeStateVariables", "toggleGoToTodayVisibility", "beVisible", "tryAddAnniversaries", "tryAddBirthdays", "tryExportEvents", "tryImportEvents", "tryImportEventsFromFile", "uri", "Landroid/net/Uri;", "updateView", "view", "updateViewPager", "dayCode", "calendar_debug"}
)
public final class MainActivity extends SimpleActivity implements RefreshRecyclerViewListener {
    private final int PICK_IMPORT_SOURCE_INTENT = 1;
    private final int PICK_EXPORT_FILE_INTENT = 2;
    private boolean showCalDAVRefreshToast;
    private boolean mShouldFilterBeVisible;
    private boolean mIsSearchOpen;
    private String mLatestSearchQuery = "";
    private MenuItem mSearchMenuItem;
    private boolean shouldGoToTodayBeVisible;
    private MenuItem goToTodayButton;
    private ArrayList currentFragments = new ArrayList();
    private ArrayList eventTypesToExport = new ArrayList();
    private int mStoredTextColor;
    private int mStoredBackgroundColor;
    private int mStoredAdjustedPrimaryColor;
    private String mStoredDayCode = "";
    private boolean mStoredIsSundayFirst;
    private boolean mStoredMidnightSpan = true;
    private boolean mStoredUse24HourFormat;
    private boolean mStoredDimPastEvents = true;
    private boolean mStoredHighlightWeekends;
    private boolean mStoredStartWeekWithCurrentDay;
    private int mStoredHighlightWeekendsColor;
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300089);
        ActivityKt.appLaunched(this, "com.simplemobiletools.calendar.pro.debug");
        this.checkWhatsNewDialog();
        MyFloatingActionButton var10000 = (MyFloatingActionButton)this._$_findCachedViewById(id.calendar_fab);
        Intrinsics.checkNotNullExpressionValue(var10000, "calendar_fab");
        ViewKt.beVisibleIf((View)var10000, ContextKt.getConfig(this).getStoredView() != 2 && ContextKt.getConfig(this).getStoredView() != 4);
        ((MyFloatingActionButton)this._$_findCachedViewById(id.calendar_fab)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MyFragmentHolder lastFragment = (MyFragmentHolder)CollectionsKt.last((List)MainActivity.this.currentFragments);
                boolean allowChangingDay = !(lastFragment instanceof DayFragmentsHolder) && !(lastFragment instanceof MonthDayFragmentsHolder);
                ContextKt.launchNewEventIntent(MainActivity.this, lastFragment.getNewEventDayCode(), allowChangingDay);
            }
        }));
        this.storeStateVariables();
        if (!com.simplemobiletools.commons.extensions.ContextKt.hasPermission(this, 8) || !com.simplemobiletools.commons.extensions.ContextKt.hasPermission(this, 7)) {
            ContextKt.getConfig(this).setCaldavSync(false);
        }

        if (ContextKt.getConfig(this).getCaldavSync()) {
            this.refreshCalDAVCalendars(false);
        }

        ((SwipeRefreshLayout)this._$_findCachedViewById(id.swipe_refresh_layout)).setOnRefreshListener((OnRefreshListener)(new OnRefreshListener() {
            public final void onRefresh() {
                MainActivity.this.refreshCalDAVCalendars(false);
            }
        }));
        this.checkIsViewIntent();
        if (!this.checkIsOpenIntent()) {
            updateViewPager$default(this, (String)null, 1, (Object)null);
        }

        this.checkAppOnSDCard();
        if (savedInstanceState == null) {
            this.checkCalDAVUpdateListener();
        }

        this.addBirthdaysAnniversariesAtStart();
        if (!ContextKt.getConfig(this).getWasUpgradedFromFreeShown() && com.simplemobiletools.commons.extensions.ContextKt.isPackageInstalled(this, "com.simplemobiletools.calendar")) {
            new ConfirmationDialog((Activity)this, "", 1900173, 1900829, 0, false, (Function0)null.INSTANCE, 32, (DefaultConstructorMarker)null);
            ContextKt.getConfig(this).setWasUpgradedFromFreeShown(true);
        }

    }

    protected void onResume() {
        super.onResume();
        if (this.mStoredTextColor != ContextKt.getConfig(this).getTextColor() || this.mStoredBackgroundColor != ContextKt.getConfig(this).getBackgroundColor() || this.mStoredAdjustedPrimaryColor != com.simplemobiletools.commons.extensions.ContextKt.getAdjustedPrimaryColor(this) || Intrinsics.areEqual(this.mStoredDayCode, Formatter.INSTANCE.getTodayCode()) ^ true || this.mStoredDimPastEvents != ContextKt.getConfig(this).getDimPastEvents() || this.mStoredHighlightWeekends != ContextKt.getConfig(this).getHighlightWeekends() || this.mStoredHighlightWeekendsColor != ContextKt.getConfig(this).getHighlightWeekendsColor()) {
            updateViewPager$default(this, (String)null, 1, (Object)null);
        }

        ContextKt.getEventsHelper(this).getEventTypes((Activity)this, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean newShouldFilterBeVisible = it.size() > 1 || ContextKt.getConfig(MainActivity.this).getDisplayEventTypes().isEmpty();
                if (newShouldFilterBeVisible != MainActivity.this.mShouldFilterBeVisible) {
                    MainActivity.this.mShouldFilterBeVisible = newShouldFilterBeVisible;
                }

            }
        }));
        if (ContextKt.getConfig(this).getStoredView() == 4 && (this.mStoredIsSundayFirst != ContextKt.getConfig(this).isSundayFirst() || this.mStoredUse24HourFormat != ContextKt.getConfig(this).getUse24HourFormat() || this.mStoredMidnightSpan != ContextKt.getConfig(this).getShowMidnightSpanningEventsAtTop() || this.mStoredStartWeekWithCurrentDay != ContextKt.getConfig(this).getStartWeekWithCurrentDay())) {
            updateViewPager$default(this, (String)null, 1, (Object)null);
        }

        this.storeStateVariables();
        ContextKt.updateWidgets(this);
        CoordinatorLayout var10001 = (CoordinatorLayout)this._$_findCachedViewById(id.calendar_coordinator);
        Intrinsics.checkNotNullExpressionValue(var10001, "calendar_coordinator");
        com.simplemobiletools.commons.extensions.ContextKt.updateTextColors$default(this, (ViewGroup)var10001, 0, 0, 6, (Object)null);
        RelativeLayout var10000 = (RelativeLayout)this._$_findCachedViewById(id.search_holder);
        Intrinsics.checkNotNullExpressionValue(var10000, "search_holder");
        var10000.setBackground((Drawable)(new ColorDrawable(ContextKt.getConfig(this).getBackgroundColor())));
        this.checkSwipeRefreshAvailability();
        this.checkShortcuts();
        if (!this.mIsSearchOpen) {
            this.invalidateOptionsMenu();
        }

        this.setupQuickFilter();
    }

    protected void onPause() {
        super.onPause();
        this.storeStateVariables();
    }

    protected void onDestroy() {
        super.onDestroy();
        if (!this.isChangingConfigurations()) {
            EventsDatabase.Companion.destroyInstance();
            this.stopCalDAVUpdateListener();
        }

    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.getMenuInflater().inflate(1400003, menu);
        this.shouldGoToTodayBeVisible = ((MyFragmentHolder)CollectionsKt.last((List)this.currentFragments)).shouldGoToTodayBeVisible();
        int var4 = false;
        this.goToTodayButton = menu.findItem(1000375);
        MenuItem var10000 = menu.findItem(1000855);
        Intrinsics.checkNotNullExpressionValue(var10000, "findItem(R.id.print)");
        var10000.setVisible(ContextKt.getConfig(this).getStoredView() != 7);
        var10000 = menu.findItem(1001235);
        Intrinsics.checkNotNullExpressionValue(var10000, "findItem(R.id.filter)");
        var10000.setVisible(this.mShouldFilterBeVisible);
        var10000 = menu.findItem(1000375);
        Intrinsics.checkNotNullExpressionValue(var10000, "findItem(R.id.go_to_today)");
        var10000.setVisible(this.shouldGoToTodayBeVisible && !this.mIsSearchOpen);
        var10000 = menu.findItem(1000068);
        Intrinsics.checkNotNullExpressionValue(var10000, "findItem(R.id.go_to_date)");
        var10000.setVisible(ContextKt.getConfig(this).getStoredView() != 3);
        this.setupSearch(menu);
        BaseSimpleActivity.updateMenuItemColors$default(this, menu, false, 0, 6, (Object)null);
        return true;
    }

    public boolean onPrepareOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        int var4 = false;
        MenuItem var10000 = menu.findItem(1000943);
        Intrinsics.checkNotNullExpressionValue(var10000, "findItem(R.id.refresh_caldav_calendars)");
        var10000.setVisible(ContextKt.getConfig(this).getCaldavSync());
        var10000 = menu.findItem(1001235);
        Intrinsics.checkNotNullExpressionValue(var10000, "findItem(R.id.filter)");
        var10000.setVisible(this.mShouldFilterBeVisible);
        return true;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        switch(item.getItemId()) {
            case 1000068:
                this.showGoToDateDialog();
                break;
            case 1000110:
                this.showViewDialog();
                break;
            case 1000273:
                this.launchSettings();
                break;
            case 1000292:
                this.tryImportEvents();
                break;
            case 1000311:
                this.tryExportEvents();
                break;
            case 1000375:
                this.goToToday();
                break;
            case 1000517:
                this.tryAddBirthdays();
                break;
            case 1000855:
                this.printView();
                break;
            case 1000943:
                this.refreshCalDAVCalendars(true);
                break;
            case 1001028:
                this.launchAbout();
                break;
            case 1001235:
                this.showFilterDialog();
                break;
            case 1001244:
                this.tryAddAnniversaries();
                break;
            case 1001294:
                this.addHolidays();
                break;
            case 16908332:
                this.onBackPressed();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    public void onBackPressed() {
        SwipeRefreshLayout var10000 = (SwipeRefreshLayout)this._$_findCachedViewById(id.swipe_refresh_layout);
        Intrinsics.checkNotNullExpressionValue(var10000, "swipe_refresh_layout");
        var10000.setRefreshing(false);
        this.checkSwipeRefreshAvailability();
        if (this.currentFragments.size() > 1) {
            this.removeTopFragment();
        } else {
            super.onBackPressed();
        }

    }

    protected void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.checkIsOpenIntent();
        this.checkIsViewIntent();
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent resultData) {
        super.onActivityResult(requestCode, resultCode, resultData);
        Uri var10001;
        if (requestCode == this.PICK_IMPORT_SOURCE_INTENT && resultCode == -1 && resultData != null && resultData.getData() != null) {
            var10001 = resultData.getData();
            Intrinsics.checkNotNull(var10001);
            Intrinsics.checkNotNullExpressionValue(var10001, "resultData.data!!");
            this.tryImportEventsFromFile(var10001);
        } else if (requestCode == this.PICK_EXPORT_FILE_INTENT && resultCode == -1 && resultData != null && resultData.getData() != null) {
            ContentResolver var10000 = this.getContentResolver();
            var10001 = resultData.getData();
            Intrinsics.checkNotNull(var10001);
            OutputStream outputStream = var10000.openOutputStream(var10001);
            this.exportEventsTo(this.eventTypesToExport, outputStream);
        }

    }

    private final void storeStateVariables() {
        Config var1 = ContextKt.getConfig(this);
        int var3 = false;
        this.mStoredIsSundayFirst = var1.isSundayFirst();
        this.mStoredTextColor = var1.getTextColor();
        this.mStoredBackgroundColor = var1.getBackgroundColor();
        this.mStoredUse24HourFormat = var1.getUse24HourFormat();
        this.mStoredDimPastEvents = var1.getDimPastEvents();
        this.mStoredHighlightWeekends = var1.getHighlightWeekends();
        this.mStoredHighlightWeekendsColor = var1.getHighlightWeekendsColor();
        this.mStoredMidnightSpan = var1.getShowMidnightSpanningEventsAtTop();
        this.mStoredStartWeekWithCurrentDay = var1.getStartWeekWithCurrentDay();
        this.mStoredAdjustedPrimaryColor = com.simplemobiletools.commons.extensions.ContextKt.getAdjustedPrimaryColor(this);
        this.mStoredDayCode = Formatter.INSTANCE.getTodayCode();
    }

    private final void setupSearch(Menu menu) {
        Object var10000 = this.getSystemService("search");
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.SearchManager");
        } else {
            SearchManager searchManager = (SearchManager)var10000;
            this.mSearchMenuItem = menu.findItem(1000732);
            MenuItem var6 = this.mSearchMenuItem;
            Intrinsics.checkNotNull(var6);
            View var7 = var6.getActionView();
            if (var7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            } else {
                SearchView var3 = (SearchView)var7;
                int var5 = false;
                var3.setSearchableInfo(searchManager.getSearchableInfo(this.getComponentName()));
                var3.setSubmitButtonEnabled(false);
                var3.setOnQueryTextListener((OnQueryTextListener)(new MainActivity$setupSearch$$inlined$apply$lambda$1(this, searchManager)));
                MenuItemCompat.setOnActionExpandListener(this.mSearchMenuItem, (OnActionExpandListener)(new OnActionExpandListener() {
                    public boolean onMenuItemActionExpand(@Nullable MenuItem item) {
                        MainActivity.this.mIsSearchOpen = true;
                        RelativeLayout var10000 = (RelativeLayout)MainActivity.this._$_findCachedViewById(id.search_holder);
                        Intrinsics.checkNotNullExpressionValue(var10000, "search_holder");
                        ViewKt.beVisible((View)var10000);
                        MyFloatingActionButton var2 = (MyFloatingActionButton)MainActivity.this._$_findCachedViewById(id.calendar_fab);
                        Intrinsics.checkNotNullExpressionValue(var2, "calendar_fab");
                        ViewKt.beGone((View)var2);
                        MainActivity.this.searchQueryChanged("");
                        MainActivity.this.invalidateOptionsMenu();
                        return true;
                    }

                    public boolean onMenuItemActionCollapse(@Nullable MenuItem item) {
                        MainActivity.this.mIsSearchOpen = false;
                        RelativeLayout var10000 = (RelativeLayout)MainActivity.this._$_findCachedViewById(id.search_holder);
                        Intrinsics.checkNotNullExpressionValue(var10000, "search_holder");
                        ViewKt.beGone((View)var10000);
                        MyFloatingActionButton var2 = (MyFloatingActionButton)MainActivity.this._$_findCachedViewById(id.calendar_fab);
                        Intrinsics.checkNotNullExpressionValue(var2, "calendar_fab");
                        ViewKt.beVisibleIf((View)var2, !(CollectionsKt.last((List)MainActivity.this.currentFragments) instanceof YearFragmentsHolder) && !(CollectionsKt.last((List)MainActivity.this.currentFragments) instanceof WeekFragmentsHolder));
                        MainActivity.this.invalidateOptionsMenu();
                        return true;
                    }
                }));
            }
        }
    }

    private final void setupQuickFilter() {
        ContextKt.getEventsHelper(this).getEventTypes((Activity)this, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Set quickFilterEventTypes = ContextKt.getConfig(MainActivity.this).getQuickFilterEventTypes();
                MyRecyclerView var10000 = (MyRecyclerView)MainActivity.this._$_findCachedViewById(id.quick_event_type_filter);
                Intrinsics.checkNotNullExpressionValue(var10000, "quick_event_type_filter");
                var10000.setAdapter((Adapter)(new QuickFilterEventTypeAdapter((SimpleActivity)MainActivity.this, (List)it, quickFilterEventTypes, (Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        MainActivity.this.refreshViewPager();
                        ContextKt.updateWidgets(MainActivity.this);
                    }
                }))));
            }
        }));
    }

    private final void closeSearch() {
        MenuItem var10000 = this.mSearchMenuItem;
        if (var10000 != null) {
            var10000.collapseActionView();
        }

    }

    private final void checkCalDAVUpdateListener() {
        if (ConstantsKt.isNougatPlus()) {
            CalDAVUpdateListener updateListener = new CalDAVUpdateListener();
            Context var10001;
            if (ContextKt.getConfig(this).getCaldavSync()) {
                var10001 = this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(var10001, "applicationContext");
                if (!updateListener.isScheduled(var10001)) {
                    var10001 = this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(var10001, "applicationContext");
                    updateListener.scheduleJob(var10001);
                }
            } else {
                var10001 = this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(var10001, "applicationContext");
                updateListener.cancelJob(var10001);
            }
        }

    }

    private final void stopCalDAVUpdateListener() {
        if (ConstantsKt.isNougatPlus() && !ContextKt.getConfig(this).getCaldavSync()) {
            CalDAVUpdateListener updateListener = new CalDAVUpdateListener();
            Context var10001 = this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(var10001, "applicationContext");
            updateListener.cancelJob(var10001);
        }

    }

    @SuppressLint({"NewApi"})
    private final void checkShortcuts() {
        int appIconColor = ContextKt.getConfig(this).getAppIconColor();
        if (ConstantsKt.isNougatMR1Plus() && ContextKt.getConfig(this).getLastHandledShortcutColor() != appIconColor) {
            String var10000 = this.getString(1900995);
            Intrinsics.checkNotNullExpressionValue(var10000, "getString(R.string.new_event)");
            String newEvent = var10000;
            ShortcutManager manager = (ShortcutManager)this.getSystemService(ShortcutManager.class);
            Drawable drawable = this.getResources().getDrawable(700243);
            if (drawable == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            }

            Drawable var10 = ((LayerDrawable)drawable).findDrawableByLayerId(1001225);
            Intrinsics.checkNotNullExpressionValue(var10, "(drawable as LayerDrawab…shortcut_plus_background)");
            DrawableKt.applyColorFilter(var10, appIconColor);
            Bitmap bmp = DrawableKt.convertToBitmap(drawable);
            Intent intent = new Intent((Context)this, SplashActivity.class);
            intent.setAction("shortcut_new_event");
            ShortcutInfo var11 = (new Builder((Context)this, "new_event")).setShortLabel((CharSequence)newEvent).setLongLabel((CharSequence)newEvent).setIcon(Icon.createWithBitmap(bmp)).setIntent(intent).build();
            Intrinsics.checkNotNullExpressionValue(var11, "ShortcutInfo.Builder(thi…\n                .build()");
            ShortcutInfo shortcut = var11;

            try {
                Intrinsics.checkNotNullExpressionValue(manager, "manager");
                manager.setDynamicShortcuts(Arrays.asList(shortcut));
                ContextKt.getConfig(this).setLastHandledShortcutColor(appIconColor);
            } catch (Exception var9) {
            }
        }

    }

    private final boolean checkIsOpenIntent() {
        String var10000 = this.getIntent().getStringExtra("day_code");
        if (var10000 == null) {
            var10000 = "";
        }

        Intrinsics.checkNotNullExpressionValue(var10000, "intent.getStringExtra(DAY_CODE) ?: \"\"");
        String dayCodeToOpen = var10000;
        int viewToOpen = this.getIntent().getIntExtra("view_to_open", 5);
        this.getIntent().removeExtra("view_to_open");
        this.getIntent().removeExtra("day_code");
        CharSequence var3 = (CharSequence)dayCodeToOpen;
        if (var3.length() > 0) {
            MyFloatingActionButton var11 = (MyFloatingActionButton)this._$_findCachedViewById(id.calendar_fab);
            Intrinsics.checkNotNullExpressionValue(var11, "calendar_fab");
            ViewKt.beVisible((View)var11);
            if (viewToOpen != 6) {
                ContextKt.getConfig(this).setStoredView(viewToOpen);
            }

            this.updateViewPager(dayCodeToOpen);
            return true;
        } else {
            long eventIdToOpen = this.getIntent().getLongExtra("event_id", 0L);
            long eventOccurrenceToOpen = this.getIntent().getLongExtra("event_occurrence_ts", 0L);
            this.getIntent().removeExtra("event_id");
            this.getIntent().removeExtra("event_occurrence_ts");
            if (eventIdToOpen != 0L && eventOccurrenceToOpen != 0L) {
                Intent var7 = new Intent((Context)this, EventActivity.class);
                int var9 = false;
                var7.putExtra("event_id", eventIdToOpen);
                var7.putExtra("event_occurrence_ts", eventOccurrenceToOpen);
                this.startActivity(var7);
            }

            return false;
        }
    }

    private final void checkIsViewIntent() {
        Intent var10000 = this.getIntent();
        if (Intrinsics.areEqual(var10000 != null ? var10000.getAction() : null, "android.intent.action.VIEW")) {
            var10000 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(var10000, "intent");
            if (var10000.getData() != null) {
                final Uri uri;
                String var4;
                label66: {
                    var10000 = this.getIntent();
                    Intrinsics.checkNotNullExpressionValue(var10000, "intent");
                    uri = var10000.getData();
                    if (uri != null) {
                        var4 = uri.getAuthority();
                        if (var4 != null && var4.equals("com.android.calendar")) {
                            break label66;
                        }
                    }

                    label49: {
                        if (uri != null) {
                            var4 = uri.getAuthority();
                            if (var4 != null) {
                                var4 = StringsKt.substringAfter$default(var4, "@", (String)null, 2, (Object)null);
                                break label49;
                            }
                        }

                        var4 = null;
                    }

                    if (!Intrinsics.areEqual(var4, "com.android.calendar")) {
                        Intrinsics.checkNotNull(uri);
                        this.tryImportEventsFromFile(uri);
                        return;
                    }
                }

                var4 = uri.getPath();
                Intrinsics.checkNotNull(var4);
                Intrinsics.checkNotNullExpressionValue(var4, "uri.path!!");
                if (StringsKt.startsWith$default(var4, "/events", false, 2, (Object)null)) {
                    ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            String eventId = uri.getLastPathSegment();
                            Long id = ContextKt.getEventsDB(MainActivity.this).getEventIdWithLastImportId("%-" + eventId);
                            if (id != null) {
                                Intent var3 = new Intent((Context)MainActivity.this, EventActivity.class);
                                int var5 = false;
                                var3.putExtra("event_id", id);
                                MainActivity.this.startActivity(var3);
                            } else {
                                com.simplemobiletools.commons.extensions.ContextKt.toast(MainActivity.this, 1900031, 1);
                            }

                        }
                    }));
                } else {
                    var4 = uri.getPath();
                    Intrinsics.checkNotNull(var4);
                    Intrinsics.checkNotNullExpressionValue(var4, "uri.path!!");
                    if (!StringsKt.startsWith$default(var4, "/time", false, 2, (Object)null)) {
                        label75: {
                            var10000 = this.getIntent();
                            if (var10000 != null) {
                                Bundle var5 = var10000.getExtras();
                                if (var5 != null && var5.getBoolean("DETAIL_VIEW", false)) {
                                    break label75;
                                }
                            }

                            return;
                        }
                    }

                    List var6 = uri.getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(var6, "uri.pathSegments");
                    String timestamp = (String)CollectionsKt.last(var6);
                    Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
                    if (StringKt.areDigitsOnly(timestamp)) {
                        this.openDayAt(Long.parseLong(timestamp));
                        return;
                    }
                }
            }
        }

    }

    private final void showViewDialog() {
        RadioItem[] var10000 = new RadioItem[6];
        String var10006 = this.getString(1900848);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.daily_view)");
        var10000[0] = new RadioItem(5, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.getString(1900824);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.weekly_view)");
        var10000[1] = new RadioItem(4, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.getString(1901033);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.monthly_view)");
        var10000[2] = new RadioItem(1, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.getString(1900051);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.monthly_daily_view)");
        var10000[3] = new RadioItem(7, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.getString(1900201);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.yearly_view)");
        var10000[4] = new RadioItem(2, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        var10006 = this.getString(1901081);
        Intrinsics.checkNotNullExpressionValue(var10006, "getString(R.string.simple_event_list)");
        var10000[5] = new RadioItem(3, var10006, (Object)null, 4, (DefaultConstructorMarker)null);
        ArrayList items = CollectionsKt.arrayListOf(var10000);
        new RadioGroupDialog((Activity)this, items, ContextKt.getConfig(this).getStoredView(), 0, false, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MainActivity.this.resetActionBarTitle();
                MainActivity.this.closeSearch();
                MainActivity.this.updateView((Integer)it);
                MainActivity.this.shouldGoToTodayBeVisible = false;
                MainActivity.this.invalidateOptionsMenu();
            }
        }), 56, (DefaultConstructorMarker)null);
    }

    private final void goToToday() {
        ((MyFragmentHolder)CollectionsKt.last((List)this.currentFragments)).goToToday();
    }

    public final void showGoToDateDialog() {
        ((MyFragmentHolder)CollectionsKt.last((List)this.currentFragments)).showGoToDateDialog();
    }

    private final void printView() {
        ((MyFragmentHolder)CollectionsKt.last((List)this.currentFragments)).printView();
    }

    private final void resetActionBarTitle() {
        String var10001 = this.getString(1900264);
        Intrinsics.checkNotNullExpressionValue(var10001, "getString(R.string.app_launcher_name)");
        ActivityKt.updateActionBarTitle$default(this, var10001, 0, 2, (Object)null);
        ActivityKt.updateActionBarSubtitle(this, "");
    }

    private final void showFilterDialog() {
        new FilterEventTypesDialog((SimpleActivity)this, (Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                MainActivity.this.refreshViewPager();
                MainActivity.this.setupQuickFilter();
                ContextKt.updateWidgets(MainActivity.this);
            }
        }));
    }

    public final void toggleGoToTodayVisibility(boolean beVisible) {
        this.shouldGoToTodayBeVisible = beVisible;
        MenuItem var10000 = this.goToTodayButton;
        if (var10000 != null) {
            if (var10000.isVisible() == beVisible) {
                return;
            }
        }

        this.invalidateOptionsMenu();
    }

    private final void refreshCalDAVCalendars(boolean showRefreshToast) {
        this.showCalDAVRefreshToast = showRefreshToast;
        if (showRefreshToast) {
            com.simplemobiletools.commons.extensions.ContextKt.toast$default(this, 1901135, 0, 2, (Object)null);
        }

        this.syncCalDAVCalendars(this, (Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ContextKt.getCalDAVHelper(MainActivity.this).refreshCalendars(true, (Function0)(new Function0() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        MainActivity.this.calDAVChanged();
                    }
                }));
            }
        }));
    }

    private final void calDAVChanged() {
        this.refreshViewPager();
        if (this.showCalDAVRefreshToast) {
            com.simplemobiletools.commons.extensions.ContextKt.toast$default(this, 1900794, 0, 2, (Object)null);
        }

        this.runOnUiThread((Runnable)(new Runnable() {
            public final void run() {
                SwipeRefreshLayout var10000 = (SwipeRefreshLayout)MainActivity.this._$_findCachedViewById(id.swipe_refresh_layout);
                Intrinsics.checkNotNullExpressionValue(var10000, "swipe_refresh_layout");
                var10000.setRefreshing(false);
            }
        }));
    }

    private final void addHolidays() {
        ArrayList items = this.getHolidayRadioItems();
        new RadioGroupDialog((Activity)this, items, 0, 0, false, (Function0)null, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final Object selectedHoliday) {
                Intrinsics.checkNotNullParameter(selectedHoliday, "selectedHoliday");
                new SetRemindersDialog((Activity)MainActivity.this, 0, (Function1)(new Function1() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public Object invoke(Object var1) {
                        this.invoke((ArrayList)var1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final ArrayList it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900798, 0, 2, (Object)null);
                        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke() {
                                this.invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                String var10000 = MainActivity.this.getString(1900360);
                                Intrinsics.checkNotNullExpressionValue(var10000, "getString(R.string.holidays)");
                                String holidays = var10000;
                                long eventTypeId = ContextKt.getEventsHelper(MainActivity.this).getEventTypeIdWithTitle(holidays);
                                if (eventTypeId == -1L) {
                                    EventType eventType = new EventType((Long)null, holidays, MainActivity.this.getResources().getColor(500089), 0, (String)null, (String)null, 56, (DefaultConstructorMarker)null);
                                    eventTypeId = ContextKt.getEventsHelper(MainActivity.this).insertOrUpdateEventTypeSync(eventType);
                                }

                                IcsImporter var6 = new IcsImporter((SimpleActivity)MainActivity.this);
                                Object var10001 = selectedHoliday;
                                if (var10001 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                } else {
                                    ImportResult result = var6.importEvents((String)var10001, eventTypeId, 0, false, it);
                                    MainActivity.this.handleParseResult(result);
                                    if (result != ImportResult.IMPORT_FAIL) {
                                        MainActivity.this.runOnUiThread((Runnable)(new Runnable() {
                                            public final void run() {
                                                MainActivity.updateViewPager$default(MainActivity.this, (String)null, 1, (Object)null);
                                                MainActivity.this.setupQuickFilter();
                                            }
                                        }));
                                    }

                                }
                            }
                        }));
                    }
                }));
            }
        }), 60, (DefaultConstructorMarker)null);
    }

    private final void tryAddBirthdays() {
        this.handlePermission(5, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Boolean)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(boolean it) {
                if (it) {
                    new SetRemindersDialog((Activity)MainActivity.this, 1, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke((ArrayList)var1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull final ArrayList it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CursorLoader var10000 = com.simplemobiletools.commons.extensions.ContextKt.getMyContactsCursor(MainActivity.this, false, false);
                            final Cursor privateCursor = var10000 != null ? var10000.loadInBackground() : null;
                            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                                // $FF: synthetic method
                                // $FF: bridge method
                                public Object invoke() {
                                    this.invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    ArrayList privateContacts = MyContactsContentProvider.Companion.getSimpleContacts((Context)MainActivity.this, privateCursor);
                                    MainActivity.this.addPrivateEvents(true, privateContacts, it, (Function2)(new Function2() {
                                        // $FF: synthetic method
                                        // $FF: bridge method
                                        public Object invoke(Object var1, Object var2) {
                                            this.invoke(((Number)var1).intValue(), ((Number)var2).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int eventsFound, int eventsAdded) {
                                            MainActivity.this.addContactEvents(true, it, eventsFound, eventsAdded, (Function1)(new Function1() {
                                                // $FF: synthetic method
                                                // $FF: bridge method
                                                public Object invoke(Object var1) {
                                                    this.invoke(((Number)var1).intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(int itx) {
                                                    if (itx > 0) {
                                                        com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900255, 0, 2, (Object)null);
                                                        MainActivity.updateViewPager$default(MainActivity.this, (String)null, 1, (Object)null);
                                                        MainActivity.this.setupQuickFilter();
                                                    } else if (itx == -1) {
                                                        com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900680, 0, 2, (Object)null);
                                                    } else {
                                                        com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900599, 0, 2, (Object)null);
                                                    }

                                                }
                                            }));
                                        }
                                    }));
                                }
                            }));
                        }
                    }));
                } else {
                    com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900361, 0, 2, (Object)null);
                }

            }
        }));
    }

    private final void tryAddAnniversaries() {
        this.handlePermission(5, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Boolean)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(boolean it) {
                if (it) {
                    new SetRemindersDialog((Activity)MainActivity.this, 2, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke((ArrayList)var1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull final ArrayList it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CursorLoader var10000 = com.simplemobiletools.commons.extensions.ContextKt.getMyContactsCursor(MainActivity.this, false, false);
                            final Cursor privateCursor = var10000 != null ? var10000.loadInBackground() : null;
                            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                                // $FF: synthetic method
                                // $FF: bridge method
                                public Object invoke() {
                                    this.invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    ArrayList privateContacts = MyContactsContentProvider.Companion.getSimpleContacts((Context)MainActivity.this, privateCursor);
                                    MainActivity.this.addPrivateEvents(false, privateContacts, it, (Function2)(new Function2() {
                                        // $FF: synthetic method
                                        // $FF: bridge method
                                        public Object invoke(Object var1, Object var2) {
                                            this.invoke(((Number)var1).intValue(), ((Number)var2).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int eventsFound, int eventsAdded) {
                                            MainActivity.this.addContactEvents(false, it, eventsFound, eventsAdded, (Function1)(new Function1() {
                                                // $FF: synthetic method
                                                // $FF: bridge method
                                                public Object invoke(Object var1) {
                                                    this.invoke(((Number)var1).intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(int itx) {
                                                    if (itx > 0) {
                                                        com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900351, 0, 2, (Object)null);
                                                        MainActivity.updateViewPager$default(MainActivity.this, (String)null, 1, (Object)null);
                                                        MainActivity.this.setupQuickFilter();
                                                    } else if (itx == -1) {
                                                        com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900365, 0, 2, (Object)null);
                                                    } else {
                                                        com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900582, 0, 2, (Object)null);
                                                    }

                                                }
                                            }));
                                        }
                                    }));
                                }
                            }));
                        }
                    }));
                } else {
                    com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900361, 0, 2, (Object)null);
                }

            }
        }));
    }

    private final void addBirthdaysAnniversariesAtStart() {
        if ((ContextKt.getConfig(this).getAddBirthdaysAutomatically() || ContextKt.getConfig(this).getAddAnniversariesAutomatically()) && com.simplemobiletools.commons.extensions.ContextKt.hasPermission(this, 5)) {
            CursorLoader var10000 = com.simplemobiletools.commons.extensions.ContextKt.getMyContactsCursor(this, false, false);
            final Cursor privateCursor = var10000 != null ? var10000.loadInBackground() : null;
            ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ArrayList privateContacts = MyContactsContentProvider.Companion.getSimpleContacts((Context)MainActivity.this, privateCursor);
                    if (ContextKt.getConfig(MainActivity.this).getAddBirthdaysAutomatically()) {
                        MainActivity.this.addPrivateEvents(true, privateContacts, ContextKt.getConfig(MainActivity.this).getBirthdayReminders(), (Function2)(new Function2() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke(Object var1, Object var2) {
                                this.invoke(((Number)var1).intValue(), ((Number)var2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int eventsFound, int eventsAdded) {
                                MainActivity.this.addContactEvents(true, ContextKt.getConfig(MainActivity.this).getBirthdayReminders(), eventsFound, eventsAdded, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke(((Number)var1).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int it) {
                                        if (it > 0) {
                                            com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900255, 0, 2, (Object)null);
                                            MainActivity.updateViewPager$default(MainActivity.this, (String)null, 1, (Object)null);
                                            MainActivity.this.setupQuickFilter();
                                        }

                                    }
                                }));
                            }
                        }));
                    }

                    if (ContextKt.getConfig(MainActivity.this).getAddAnniversariesAutomatically()) {
                        MainActivity.this.addPrivateEvents(false, privateContacts, ContextKt.getConfig(MainActivity.this).getAnniversaryReminders(), (Function2)(new Function2() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke(Object var1, Object var2) {
                                this.invoke(((Number)var1).intValue(), ((Number)var2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int eventsFound, int eventsAdded) {
                                MainActivity.this.addContactEvents(false, ContextKt.getConfig(MainActivity.this).getAnniversaryReminders(), eventsFound, eventsAdded, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke(((Number)var1).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int it) {
                                        if (it > 0) {
                                            com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900351, 0, 2, (Object)null);
                                            MainActivity.updateViewPager$default(MainActivity.this, (String)null, 1, (Object)null);
                                            MainActivity.this.setupQuickFilter();
                                        }

                                    }
                                }));
                            }
                        }));
                    }

                }
            }));
        }
    }

    private final void handleParseResult(ImportResult result) {
        // $FF: Couldn't be decompiled
    }

    private final void addContactEvents(boolean birthdays, final ArrayList reminders, int initEventsFound, int initEventsAdded, final Function1 callback) {
        final IntRef eventsFound = new IntRef();
        eventsFound.element = initEventsFound;
        final IntRef eventsAdded = new IntRef();
        eventsAdded.element = initEventsAdded;
        Uri uri = Data.CONTENT_URI;
        String[] projection = new String[]{"display_name", "contact_id", "contact_last_updated_timestamp", "data1"};
        String selection = "mimetype = ? AND data2 = ?";
        int type = birthdays ? 3 : 1;
        String[] selectionArgs = new String[]{"vnd.android.cursor.item/contact_event", String.valueOf(type)};
        final ArrayList dateFormats = ConstantsKt.getDateFormats();
        final ArrayList yearDateFormats = ConstantsKt.getDateFormatsWithYear();
        List existingEvents = birthdays ? ContextKt.getEventsDB(this).getBirthdays() : ContextKt.getEventsDB(this).getAnniversaries();
        final HashMap importIDs = new HashMap();
        Iterable $this$forEach$iv = (Iterable)existingEvents;
        int $i$f$forEach = false;
        Iterator var19 = $this$forEach$iv.iterator();

        while(var19.hasNext()) {
            Object element$iv = var19.next();
            Event it = (Event)element$iv;
            int var22 = false;
            ((Map)importIDs).put(it.getImportId(), it.getStartTS());
        }

        final long eventTypeId = birthdays ? EventsHelper.getBirthdaysEventTypeId$default(ContextKt.getEventsHelper(this), false, 1, (Object)null) : EventsHelper.getAnniversariesEventTypeId$default(ContextKt.getEventsHelper(this), false, 1, (Object)null);
        final String source = birthdays ? "contact-birthday" : "contact-anniversary";
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        com.simplemobiletools.commons.extensions.ContextKt.queryCursor$default(this, uri, projection, selection, selectionArgs, (String)null, true, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Cursor)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                String contactId = String.valueOf(CursorKt.getIntValue(cursor, "contact_id"));
                String name = CursorKt.getStringValue(cursor, "display_name");
                String startDate = CursorKt.getStringValue(cursor, "data1");
                Iterator var6 = dateFormats.iterator();

                while(var6.hasNext()) {
                    String format = (String)var6.next();

                    try {
                        SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.getDefault());
                        Date date = formatter.parse(startDate);
                        int flags = yearDateFormats.contains(format) ? 1 : 5;
                        Intrinsics.checkNotNullExpressionValue(date, "date");
                        long timestamp = date.getTime() / 1000L;
                        long lastUpdated = CursorKt.getLongValue(cursor, "contact_last_updated_timestamp");
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        Object var10008 = reminders.get(0);
                        Intrinsics.checkNotNullExpressionValue(var10008, "reminders[0]");
                        int var44 = ((Number)var10008).intValue();
                        Object var10009 = reminders.get(1);
                        Intrinsics.checkNotNullExpressionValue(var10009, "reminders[1]");
                        int var45 = ((Number)var10009).intValue();
                        Object var10010 = reminders.get(2);
                        Intrinsics.checkNotNullExpressionValue(var10010, "reminders[2]");
                        int var46 = ((Number)var10010).intValue();
                        DateTimeZone var10015 = DateTimeZone.getDefault();
                        Intrinsics.checkNotNullExpressionValue(var10015, "DateTimeZone.getDefault()");
                        String var47 = var10015.getID();
                        Intrinsics.checkNotNullExpressionValue(var47, "DateTimeZone.getDefault().id");
                        byte var15 = 0;
                        byte var16 = 0;
                        String var19 = source;
                        long var20 = 0L;
                        long var22 = eventTypeId;
                        byte var24 = 1;
                        int var25 = 31536000;
                        Object var27 = null;
                        Object var28 = null;
                        long var29 = 0L;
                        String var31 = var47;
                        Event event = new Event((Long)null, timestamp, timestamp, name, (String)null, (String)null, var44, var45, var46, 0, 0, 0, var25, var24, var29, (ArrayList)var28, (String)var27, contactId, var31, flags, var22, var20, lastUpdated, var19, var16, var15, 52547120, (DefaultConstructorMarker)null);
                        ArrayList importIDsToDelete = new ArrayList();
                        Map var18 = (Map)importIDs;
                        Iterator var17 = var18.entrySet().iterator();

                        while(var17.hasNext()) {
                            Entry var35 = (Entry)var17.next();
                            String key = (String)var35.getKey();
                            long value = ((Number)var35.getValue()).longValue();
                            if (Intrinsics.areEqual(key, contactId) && value != timestamp) {
                                int deleted = ContextKt.getEventsDB(MainActivity.this).deleteBirthdayAnniversary(source, key);
                                if (deleted == 1) {
                                    importIDsToDelete.add(key);
                                }
                            }
                        }

                        Iterable $this$forEach$iv = (Iterable)importIDsToDelete;
                        int $i$f$forEach = false;
                        Iterator var39 = $this$forEach$iv.iterator();

                        while(var39.hasNext()) {
                            Object element$iv = var39.next();
                            String it = (String)element$iv;
                            int var43 = false;
                            importIDs.remove(it);
                        }

                        int var10001 = eventsFound.element++;
                        if (!importIDs.containsKey(contactId)) {
                            ContextKt.getEventsHelper(MainActivity.this).insertEvent(event, false, false, (Function1)(new Function1() {
                                // $FF: synthetic method
                                // $FF: bridge method
                                public Object invoke(Object var1) {
                                    this.invoke(((Number)var1).longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long it) {
                                    int var10001 = eventsAdded.element++;
                                }
                            }));
                        }
                        break;
                    } catch (Exception var33) {
                    }
                }

            }
        }), 16, (Object)null);
        this.runOnUiThread((Runnable)(new Runnable() {
            public final void run() {
                callback.invoke(eventsAdded.element == 0 && eventsFound.element > 0 ? -1 : eventsAdded.element);
            }
        }));
    }

    private final void addPrivateEvents(boolean birthdays, ArrayList contacts, ArrayList reminders, Function2 callback) {
        IntRef eventsAdded = new IntRef();
        eventsAdded.element = 0;
        IntRef eventsFound = new IntRef();
        eventsFound.element = 0;
        if (contacts.isEmpty()) {
            callback.invoke(0, 0);
        } else {
            try {
                long eventTypeId = birthdays ? EventsHelper.getBirthdaysEventTypeId$default(ContextKt.getEventsHelper(this), false, 1, (Object)null) : EventsHelper.getAnniversariesEventTypeId$default(ContextKt.getEventsHelper(this), false, 1, (Object)null);
                String source = birthdays ? "contact-birthday" : "contact-anniversary";
                List existingEvents = birthdays ? ContextKt.getEventsDB(this).getBirthdays() : ContextKt.getEventsDB(this).getAnniversaries();
                HashMap importIDs = new HashMap();
                Iterable $this$forEach$iv = (Iterable)existingEvents;
                int $i$f$forEach = false;
                Iterator var14 = $this$forEach$iv.iterator();

                Object element$iv;
                boolean var17;
                while(var14.hasNext()) {
                    element$iv = var14.next();
                    Event it = (Event)element$iv;
                    var17 = false;
                    ((Map)importIDs).put(it.getImportId(), it.getStartTS());
                }

                $this$forEach$iv = (Iterable)contacts;
                $i$f$forEach = false;
                var14 = $this$forEach$iv.iterator();

                while(var14.hasNext()) {
                    element$iv = var14.next();
                    SimpleContact contact = (SimpleContact)element$iv;
                    var17 = false;
                    ArrayList events = birthdays ? contact.getBirthdays() : contact.getAnniversaries();
                    Iterable $this$forEach$iv = (Iterable)events;
                    int $i$f$forEach = false;
                    Iterator var21 = $this$forEach$iv.iterator();

                    while(var21.hasNext()) {
                        Object element$iv = var21.next();
                        String birthdayAnniversary = (String)element$iv;
                        int var24 = false;
                        String format = StringsKt.startsWith$default(birthdayAnniversary, "--", false, 2, (Object)null) ? "--MM-dd" : "yyyy-MM-dd";
                        SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.getDefault());
                        Date date = formatter.parse(birthdayAnniversary);
                        Intrinsics.checkNotNullExpressionValue(date, "date");
                        if (date.getYear() < 70) {
                            date.setYear(70);
                        }

                        long timestamp = date.getTime() / 1000L;
                        long lastUpdated = System.currentTimeMillis();
                        String var10005 = contact.getName();
                        Object var10008 = reminders.get(0);
                        Intrinsics.checkNotNullExpressionValue(var10008, "reminders[0]");
                        int var59 = ((Number)var10008).intValue();
                        Object var10009 = reminders.get(1);
                        Intrinsics.checkNotNullExpressionValue(var10009, "reminders[1]");
                        int var60 = ((Number)var10009).intValue();
                        Object var10010 = reminders.get(2);
                        Intrinsics.checkNotNullExpressionValue(var10010, "reminders[2]");
                        int var61 = ((Number)var10010).intValue();
                        String var10014 = String.valueOf(contact.getContactId());
                        DateTimeZone var10015 = DateTimeZone.getDefault();
                        Intrinsics.checkNotNullExpressionValue(var10015, "DateTimeZone.getDefault()");
                        String var62 = var10015.getID();
                        Intrinsics.checkNotNullExpressionValue(var62, "DateTimeZone.getDefault().id");
                        byte var32 = 0;
                        byte var33 = 0;
                        long var37 = 0L;
                        byte var41 = 1;
                        int var42 = 31536000;
                        byte var43 = 1;
                        Object var44 = null;
                        Object var45 = null;
                        long var46 = 0L;
                        String var48 = var62;
                        String var49 = var10014;
                        Event event = new Event((Long)null, timestamp, timestamp, var10005, (String)null, (String)null, var59, var60, var61, 0, 0, 0, var42, var41, var46, (ArrayList)var45, (String)var44, var49, var48, var43, eventTypeId, var37, lastUpdated, source, var33, var32, 52547120, (DefaultConstructorMarker)null);
                        ArrayList importIDsToDelete = new ArrayList();
                        Map var51 = (Map)importIDs;
                        Iterator var52 = var51.entrySet().iterator();

                        while(var52.hasNext()) {
                            Entry var64 = (Entry)var52.next();
                            String key = (String)var64.getKey();
                            long value = ((Number)var64.getValue()).longValue();
                            if (Intrinsics.areEqual(key, String.valueOf(contact.getContactId())) && value != timestamp) {
                                int deleted = ContextKt.getEventsDB(this).deleteBirthdayAnniversary(source, key);
                                if (deleted == 1) {
                                    importIDsToDelete.add(key);
                                }
                            }
                        }

                        Iterable $this$forEach$iv = (Iterable)importIDsToDelete;
                        int $i$f$forEach = false;
                        Iterator var67 = $this$forEach$iv.iterator();

                        while(var67.hasNext()) {
                            Object element$iv = var67.next();
                            String it = (String)element$iv;
                            int var69 = false;
                            importIDs.remove(it);
                        }

                        int var10001 = eventsFound.element++;
                        if (!importIDs.containsKey(String.valueOf(contact.getContactId()))) {
                            ContextKt.getEventsHelper(this).insertEvent(event, false, false, (Function1)(new MainActivity$addPrivateEvents$$inlined$forEach$lambda$1(contact, this, birthdays, reminders, eventTypeId, source, importIDs, eventsFound, eventsAdded)));
                        }
                    }
                }
            } catch (Exception var57) {
                com.simplemobiletools.commons.extensions.ContextKt.showErrorToast$default(this, var57, 0, 2, (Object)null);
            }

            callback.invoke(eventsFound.element, eventsAdded.element);
        }
    }

    private final void updateView(int view) {
        MyFloatingActionButton var10000 = (MyFloatingActionButton)this._$_findCachedViewById(id.calendar_fab);
        Intrinsics.checkNotNullExpressionValue(var10000, "calendar_fab");
        ViewKt.beVisibleIf((View)var10000, view != 2 && view != 4);
        ContextKt.getConfig(this).setStoredView(view);
        this.checkSwipeRefreshAvailability();
        updateViewPager$default(this, (String)null, 1, (Object)null);
        MenuItem var2 = this.goToTodayButton;
        if (var2 != null) {
            if (var2.isVisible()) {
                this.shouldGoToTodayBeVisible = false;
                this.invalidateOptionsMenu();
            }
        }

    }

    private final void updateViewPager(String dayCode) {
        MyFragmentHolder fragment = this.getFragmentsHolder();
        Iterable $this$forEach$iv = (Iterable)this.currentFragments;
        int $i$f$forEach = false;
        Iterator var5 = $this$forEach$iv.iterator();

        while(var5.hasNext()) {
            Object element$iv = var5.next();
            MyFragmentHolder it = (MyFragmentHolder)element$iv;
            boolean var8 = false;

            try {
                this.getSupportFragmentManager().beginTransaction().remove((Fragment)it).commitNow();
            } catch (Exception var10) {
                return;
            }
        }

        this.currentFragments.clear();
        this.currentFragments.add(fragment);
        Bundle bundle = new Bundle();
        switch(ContextKt.getConfig(this).getStoredView()) {
            case 1:
            case 5:
            case 7:
                bundle.putString("day_code", dayCode);
            case 2:
            case 3:
            case 6:
            default:
                break;
            case 4:
                bundle.putString("week_start_date_time", this.getThisWeekDateTime());
        }

        fragment.setArguments(bundle);
        this.getSupportFragmentManager().beginTransaction().add(1000543, (Fragment)fragment).commitNow();
    }

    // $FF: synthetic method
    static void updateViewPager$default(MainActivity var0, String var1, int var2, Object var3) {
        if ((var2 & 1) != 0) {
            var1 = Formatter.INSTANCE.getTodayCode();
        }

        var0.updateViewPager(var1);
    }

    public final void openMonthFromYearly(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        if (!(CollectionsKt.last((List)this.currentFragments) instanceof MonthFragmentsHolder)) {
            MonthFragmentsHolder fragment = new MonthFragmentsHolder();
            this.currentFragments.add(fragment);
            Bundle bundle = new Bundle();
            bundle.putString("day_code", Formatter.INSTANCE.getDayCodeFromDateTime(dateTime));
            fragment.setArguments(bundle);
            this.getSupportFragmentManager().beginTransaction().add(1000543, (Fragment)fragment).commitNow();
            this.resetActionBarTitle();
            MyFloatingActionButton var10000 = (MyFloatingActionButton)this._$_findCachedViewById(id.calendar_fab);
            Intrinsics.checkNotNullExpressionValue(var10000, "calendar_fab");
            ViewKt.beVisible((View)var10000);
            ActionBar var4 = this.getSupportActionBar();
            if (var4 != null) {
                var4.setDisplayHomeAsUpEnabled(true);
            }

        }
    }

    public final void openDayFromMonthly(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        if (!(CollectionsKt.last((List)this.currentFragments) instanceof DayFragmentsHolder)) {
            DayFragmentsHolder fragment = new DayFragmentsHolder();
            this.currentFragments.add(fragment);
            Bundle bundle = new Bundle();
            bundle.putString("day_code", Formatter.INSTANCE.getDayCodeFromDateTime(dateTime));
            fragment.setArguments(bundle);

            try {
                this.getSupportFragmentManager().beginTransaction().add(1000543, (Fragment)fragment).commitNow();
                ActionBar var10000 = this.getSupportActionBar();
                if (var10000 != null) {
                    var10000.setDisplayHomeAsUpEnabled(true);
                }
            } catch (Exception var5) {
            }

        }
    }

    private final String getThisWeekDateTime() {
        String var6;
        if (!ContextKt.getConfig(this).getStartWeekWithCurrentDay()) {
            TimeZone var10000 = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(var10000, "TimeZone.getDefault()");
            int currentOffsetHours = var10000.getRawOffset() / 1000 / 60 / 60;
            int useHours = currentOffsetHours >= 10 ? 8 : 12;
            DateTime thisweek = (new DateTime()).withZone(DateTimeZone.UTC).withDayOfWeek(1).withHourOfDay(useHours).minusDays(ContextKt.getConfig(this).isSundayFirst() ? 1 : 0);
            DateTime var4 = (new DateTime()).minusDays(7);
            Intrinsics.checkNotNullExpressionValue(var4, "DateTime().minusDays(7)");
            long var5 = DateTimeKt.seconds(var4);
            Intrinsics.checkNotNullExpressionValue(thisweek, "thisweek");
            if (var5 > DateTimeKt.seconds(thisweek)) {
                thisweek = thisweek.plusDays(7);
            }

            var6 = thisweek.toString();
            Intrinsics.checkNotNullExpressionValue(var6, "thisweek.toString()");
        } else {
            var6 = (new DateTime()).withZone(DateTimeZone.UTC).toString();
            Intrinsics.checkNotNullExpressionValue(var6, "DateTime().withZone(DateTimeZone.UTC).toString()");
        }

        return var6;
    }

    private final MyFragmentHolder getFragmentsHolder() {
        MyFragmentHolder var10000;
        switch(ContextKt.getConfig(this).getStoredView()) {
            case 1:
                var10000 = (MyFragmentHolder)(new MonthFragmentsHolder());
                break;
            case 2:
                var10000 = (MyFragmentHolder)(new YearFragmentsHolder());
                break;
            case 3:
                var10000 = (MyFragmentHolder)(new EventListFragment());
                break;
            case 4:
            case 6:
            default:
                var10000 = (MyFragmentHolder)(new WeekFragmentsHolder());
                break;
            case 5:
                var10000 = (MyFragmentHolder)(new DayFragmentsHolder());
                break;
            case 7:
                var10000 = (MyFragmentHolder)(new MonthDayFragmentsHolder());
        }

        return var10000;
    }

    private final void removeTopFragment() {
        this.getSupportFragmentManager().beginTransaction().remove((Fragment)CollectionsKt.last((List)this.currentFragments)).commit();
        this.currentFragments.remove(this.currentFragments.size() - 1);
        this.toggleGoToTodayVisibility(((MyFragmentHolder)CollectionsKt.last((List)this.currentFragments)).shouldGoToTodayBeVisible());
        Object var1 = CollectionsKt.last((List)this.currentFragments);
        MyFragmentHolder $this$apply = (MyFragmentHolder)var1;
        int var3 = false;
        $this$apply.refreshEvents();
        $this$apply.updateActionBarTitle();
        MyFloatingActionButton var10000 = (MyFloatingActionButton)this._$_findCachedViewById(id.calendar_fab);
        Intrinsics.checkNotNullExpressionValue(var10000, "calendar_fab");
        ViewKt.beGoneIf((View)var10000, this.currentFragments.size() == 1 && ContextKt.getConfig(this).getStoredView() == 2);
        ActionBar var4 = this.getSupportActionBar();
        if (var4 != null) {
            var4.setDisplayHomeAsUpEnabled(this.currentFragments.size() > 1);
        }

    }

    private final void refreshViewPager() {
        this.runOnUiThread((Runnable)(new Runnable() {
            public final void run() {
                if (!MainActivity.this.isDestroyed()) {
                    ((MyFragmentHolder)CollectionsKt.last((List)MainActivity.this.currentFragments)).refreshEvents();
                }

            }
        }));
    }

    private final void tryImportEvents() {
        if (ConstantsKt.isQPlus()) {
            Intent var1 = new Intent("android.intent.action.GET_CONTENT");
            int var3 = false;
            var1.addCategory("android.intent.category.OPENABLE");
            var1.setType("text/calendar");
            this.startActivityForResult(var1, this.PICK_IMPORT_SOURCE_INTENT);
        } else {
            this.handlePermission(1, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((Boolean)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean it) {
                    if (it) {
                        MainActivity.this.importEvents();
                    }

                }
            }));
        }

    }

    private final void importEvents() {
        new FilePickerDialog((BaseSimpleActivity)this, (String)null, false, false, false, false, false, false, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((String)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MainActivity.this.showImportEventsDialog(it);
            }
        }), 254, (DefaultConstructorMarker)null);
    }

    private final void tryImportEventsFromFile(Uri uri) {
        String var10001;
        if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            var10001 = uri.getPath();
            Intrinsics.checkNotNull(var10001);
            Intrinsics.checkNotNullExpressionValue(var10001, "uri.path!!");
            this.showImportEventsDialog(var10001);
        } else if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            File tempFile = com.simplemobiletools.calendar.pro.extensions.ActivityKt.getTempFile(this);
            if (tempFile == null) {
                com.simplemobiletools.commons.extensions.ContextKt.toast$default(this, 1900338, 0, 2, (Object)null);
                return;
            }

            try {
                InputStream inputStream = this.getContentResolver().openInputStream(uri);
                FileOutputStream out = new FileOutputStream(tempFile);
                Intrinsics.checkNotNull(inputStream);
                ByteStreamsKt.copyTo$default(inputStream, (OutputStream)out, 0, 2, (Object)null);
                var10001 = tempFile.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(var10001, "tempFile.absolutePath");
                this.showImportEventsDialog(var10001);
            } catch (Exception var5) {
                com.simplemobiletools.commons.extensions.ContextKt.showErrorToast$default(this, var5, 0, 2, (Object)null);
            }
        } else {
            com.simplemobiletools.commons.extensions.ContextKt.toast$default(this, 1901018, 0, 2, (Object)null);
        }

    }

    private final void showImportEventsDialog(String path) {
        new ImportEventsDialog((SimpleActivity)this, path, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((Boolean)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(boolean it) {
                if (it) {
                    MainActivity.this.runOnUiThread((Runnable)(new Runnable() {
                        public final void run() {
                            MainActivity.updateViewPager$default(MainActivity.this, (String)null, 1, (Object)null);
                            MainActivity.this.setupQuickFilter();
                        }
                    }));
                }

            }
        }));
    }

    private final void tryExportEvents() {
        if (ConstantsKt.isQPlus()) {
            new ExportEventsDialog((SimpleActivity)this, ContextKt.getConfig(this).getLastExportPath(), true, (Function2)(new Function2() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1, Object var2) {
                    this.invoke((File)var1, (ArrayList)var2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull File file, @NotNull ArrayList eventTypes) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(eventTypes, "eventTypes");
                    MainActivity.this.eventTypesToExport = eventTypes;
                    Intent var3 = new Intent("android.intent.action.CREATE_DOCUMENT");
                    int var5 = false;
                    var3.setType("text/calendar");
                    var3.putExtra("android.intent.extra.TITLE", file.getName());
                    var3.addCategory("android.intent.category.OPENABLE");
                    MainActivity.this.startActivityForResult(var3, MainActivity.this.PICK_EXPORT_FILE_INTENT);
                }
            }));
        } else {
            this.handlePermission(2, (Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((Boolean)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean it) {
                    if (it) {
                        new ExportEventsDialog((SimpleActivity)MainActivity.this, ContextKt.getConfig(MainActivity.this).getLastExportPath(), false, (Function2)(new Function2() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke(Object var1, Object var2) {
                                this.invoke((File)var1, (ArrayList)var2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull File file, @NotNull final ArrayList eventTypes) {
                                Intrinsics.checkNotNullParameter(file, "file");
                                Intrinsics.checkNotNullParameter(eventTypes, "eventTypes");
                                ActivityKt.getFileOutputStream(MainActivity.this, FileKt.toFileDirItem(file, (Context)MainActivity.this), true, (Function1)(new Function1() {
                                    // $FF: synthetic method
                                    // $FF: bridge method
                                    public Object invoke(Object var1) {
                                        this.invoke((OutputStream)var1);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable OutputStream it) {
                                        MainActivity.this.exportEventsTo(eventTypes, it);
                                    }
                                }));
                            }
                        }));
                    }

                }
            }));
        }

    }

    private final void exportEventsTo(final ArrayList eventTypes, final OutputStream outputStream) {
        ConstantsKt.ensureBackgroundThread((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ArrayList events = ContextKt.getEventsHelper(MainActivity.this).getEventsToExport(eventTypes);
                if (events.isEmpty()) {
                    com.simplemobiletools.commons.extensions.ContextKt.toast$default(MainActivity.this, 1900448, 0, 2, (Object)null);
                } else {
                    (new IcsExporter()).exportEvents((BaseSimpleActivity)MainActivity.this, outputStream, events, true, (Function1)(new Function1() {
                        // $FF: synthetic method
                        // $FF: bridge method
                        public Object invoke(Object var1) {
                            this.invoke((ExportResult)var1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ExportResult it) {
                            // $FF: Couldn't be decompiled
                        }
                    }));
                }

            }
        }));
    }

    private final void launchSettings() {
        this.startActivity(new Intent(this.getApplicationContext(), SettingsActivity.class));
    }

    private final void launchAbout() {
        int licenses = 64;
        ArrayList faqItems = CollectionsKt.arrayListOf(new FAQItem[]{new FAQItem(1900682, 1900521), new FAQItem(1900490, 1900066), new FAQItem(1900389, 1900266), new FAQItem(1900835, 1900545), new FAQItem(1900604, 1900580), new FAQItem(1900464, 1900926), new FAQItem(1900838, 1901062), new FAQItem(1900774, 1900807), new FAQItem(1900734, 1900698)});
        this.startAboutActivity(1900059, licenses, "6.16.2", faqItems, true);
    }

    private final void searchQueryChanged(String text) {
        this.mLatestSearchQuery = text;
        MyTextView var10000 = (MyTextView)this._$_findCachedViewById(id.search_placeholder_2);
        Intrinsics.checkNotNullExpressionValue(var10000, "search_placeholder_2");
        ViewKt.beGoneIf((View)var10000, text.length() >= 2);
        if (text.length() >= 2) {
            ContextKt.getEventsHelper(this).getEventsWithSearchQuery(text, (Activity)this, (Function2)(new Function2() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1, Object var2) {
                    this.invoke((String)var1, (List)var2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String searchedText, @NotNull List events) {
                    Intrinsics.checkNotNullParameter(searchedText, "searchedText");
                    Intrinsics.checkNotNullParameter(events, "events");
                    if (Intrinsics.areEqual(searchedText, MainActivity.this.mLatestSearchQuery)) {
                        MyRecyclerView var10000 = (MyRecyclerView)MainActivity.this._$_findCachedViewById(id.search_results_list);
                        Intrinsics.checkNotNullExpressionValue(var10000, "search_results_list");
                        View var6 = (View)var10000;
                        Collection var3 = (Collection)events;
                        ViewKt.beVisibleIf(var6, !var3.isEmpty());
                        MyTextView var7 = (MyTextView)MainActivity.this._$_findCachedViewById(id.search_placeholder);
                        Intrinsics.checkNotNullExpressionValue(var7, "search_placeholder");
                        ViewKt.beVisibleIf((View)var7, events.isEmpty());
                        ArrayList listItems = ContextKt.getEventListItems$default(MainActivity.this, events, false, false, 6, (Object)null);
                        SimpleActivity var10002 = (SimpleActivity)MainActivity.this;
                        RefreshRecyclerViewListener var10005 = (RefreshRecyclerViewListener)MainActivity.this;
                        MyRecyclerView var10006 = (MyRecyclerView)MainActivity.this._$_findCachedViewById(id.search_results_list);
                        Intrinsics.checkNotNullExpressionValue(var10006, "search_results_list");
                        EventListAdapter eventsAdapter = new EventListAdapter(var10002, listItems, true, var10005, var10006, (Function1)(new Function1() {
                            // $FF: synthetic method
                            // $FF: bridge method
                            public Object invoke(Object var1) {
                                this.invoke(var1);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (it instanceof ListEvent) {
                                    Intent var2 = new Intent(MainActivity.this.getApplicationContext(), EventActivity.class);
                                    int var4 = false;
                                    var2.putExtra("event_id", ((ListEvent)it).getId());
                                    MainActivity.this.startActivity(var2);
                                }

                            }
                        }));
                        var10000 = (MyRecyclerView)MainActivity.this._$_findCachedViewById(id.search_results_list);
                        Intrinsics.checkNotNullExpressionValue(var10000, "search_results_list");
                        var10000.setAdapter((Adapter)eventsAdapter);
                    }

                }
            }));
        } else {
            var10000 = (MyTextView)this._$_findCachedViewById(id.search_placeholder);
            Intrinsics.checkNotNullExpressionValue(var10000, "search_placeholder");
            ViewKt.beVisible((View)var10000);
            MyRecyclerView var2 = (MyRecyclerView)this._$_findCachedViewById(id.search_results_list);
            Intrinsics.checkNotNullExpressionValue(var2, "search_results_list");
            ViewKt.beGone((View)var2);
        }

    }

    private final void checkSwipeRefreshAvailability() {
        SwipeRefreshLayout var10000 = (SwipeRefreshLayout)this._$_findCachedViewById(id.swipe_refresh_layout);
        Intrinsics.checkNotNullExpressionValue(var10000, "swipe_refresh_layout");
        var10000.setEnabled(ContextKt.getConfig(this).getCaldavSync() && ContextKt.getConfig(this).getPullToRefresh() && ContextKt.getConfig(this).getStoredView() != 4);
        var10000 = (SwipeRefreshLayout)this._$_findCachedViewById(id.swipe_refresh_layout);
        Intrinsics.checkNotNullExpressionValue(var10000, "swipe_refresh_layout");
        if (!var10000.isEnabled()) {
            var10000 = (SwipeRefreshLayout)this._$_findCachedViewById(id.swipe_refresh_layout);
            Intrinsics.checkNotNullExpressionValue(var10000, "swipe_refresh_layout");
            var10000.setRefreshing(false);
        }

    }

    public void refreshItems() {
        this.searchQueryChanged(this.mLatestSearchQuery);
        this.refreshViewPager();
    }

    private final void openDayAt(long timestamp) {
        String dayCode = Formatter.INSTANCE.getDayCodeFromTS(timestamp / 1000L);
        MyFloatingActionButton var10000 = (MyFloatingActionButton)this._$_findCachedViewById(id.calendar_fab);
        Intrinsics.checkNotNullExpressionValue(var10000, "calendar_fab");
        ViewKt.beVisible((View)var10000);
        ContextKt.getConfig(this).setStoredView(5);
        this.updateViewPager(dayCode);
    }

    private final ArrayList getHolidayRadioItems() {
        ArrayList items = new ArrayList();
        LinkedHashMap var2 = new LinkedHashMap();
        int var4 = false;
        var2.put("Algeria", "algeria.ics");
        var2.put("Argentina", "argentina.ics");
        var2.put("Australia", "australia.ics");
        var2.put("België", "belgium.ics");
        var2.put("Bolivia", "bolivia.ics");
        var2.put("Brasil", "brazil.ics");
        var2.put("България", "bulgaria.ics");
        var2.put("Canada", "canada.ics");
        var2.put("China", "china.ics");
        var2.put("Colombia", "colombia.ics");
        var2.put("Česká republika", "czech.ics");
        var2.put("Danmark", "denmark.ics");
        var2.put("Deutschland", "germany.ics");
        var2.put("Eesti", "estonia.ics");
        var2.put("España", "spain.ics");
        var2.put("Éire", "ireland.ics");
        var2.put("France", "france.ics");
        var2.put("Fürstentum Liechtenstein", "liechtenstein.ics");
        var2.put("Hellas", "greece.ics");
        var2.put("Hrvatska", "croatia.ics");
        var2.put("India", "india.ics");
        var2.put("Indonesia", "indonesia.ics");
        var2.put("Ísland", "iceland.ics");
        var2.put("Israel", "israel.ics");
        var2.put("Italia", "italy.ics");
        var2.put("Қазақстан Республикасы", "kazakhstan.ics");
        var2.put("المملكة المغربية", "morocco.ics");
        var2.put("Latvija", "latvia.ics");
        var2.put("Lietuva", "lithuania.ics");
        var2.put("Luxemburg", "luxembourg.ics");
        var2.put("Makedonija", "macedonia.ics");
        var2.put("Malaysia", "malaysia.ics");
        var2.put("Magyarország", "hungary.ics");
        var2.put("México", "mexico.ics");
        var2.put("Nederland", "netherlands.ics");
        var2.put("República de Nicaragua", "nicaragua.ics");
        var2.put("日本", "japan.ics");
        var2.put("Nigeria", "nigeria.ics");
        var2.put("Norge", "norway.ics");
        var2.put("Österreich", "austria.ics");
        var2.put("Pākistān", "pakistan.ics");
        var2.put("Polska", "poland.ics");
        var2.put("Portugal", "portugal.ics");
        var2.put("Россия", "russia.ics");
        var2.put("República de Costa Rica", "costarica.ics");
        var2.put("República Oriental del Uruguay", "uruguay.ics");
        var2.put("République d'Haïti", "haiti.ics");
        var2.put("România", "romania.ics");
        var2.put("Schweiz", "switzerland.ics");
        var2.put("Singapore", "singapore.ics");
        var2.put("한국", "southkorea.ics");
        var2.put("Srbija", "serbia.ics");
        var2.put("Slovenija", "slovenia.ics");
        var2.put("Slovensko", "slovakia.ics");
        var2.put("South Africa", "southafrica.ics");
        var2.put("Sri Lanka", "srilanka.ics");
        var2.put("Suomi", "finland.ics");
        var2.put("Sverige", "sweden.ics");
        var2.put("Taiwan", "taiwan.ics");
        var2.put("ราชอาณาจักรไทย", "thailand.ics");
        var2.put("Türkiye Cumhuriyeti", "turkey.ics");
        var2.put("Ukraine", "ukraine.ics");
        var2.put("United Kingdom", "unitedkingdom.ics");
        var2.put("United States", "unitedstates.ics");
        int i = 0;
        Map var6 = (Map)var2;
        Iterator var7 = var6.entrySet().iterator();

        while(var7.hasNext()) {
            Entry var8 = (Entry)var7.next();
            String country = (String)var8.getKey();
            String file = (String)var8.getValue();
            items.add(new RadioItem(i++, country, file));
        }

        return items;
    }

    private final void checkWhatsNewDialog() {
        ArrayList var1 = new ArrayList();
        int var3 = false;
        var1.add(new Release(39, 1900569));
        var1.add(new Release(40, 1900588));
        var1.add(new Release(42, 1900585));
        var1.add(new Release(44, 1900592));
        var1.add(new Release(46, 1900589));
        var1.add(new Release(48, 1900593));
        var1.add(new Release(49, 1900596));
        var1.add(new Release(51, 1900612));
        var1.add(new Release(52, 1900614));
        var1.add(new Release(54, 1900611));
        var1.add(new Release(57, 1900615));
        var1.add(new Release(59, 1900621));
        var1.add(new Release(60, 1900630));
        var1.add(new Release(62, 1900632));
        var1.add(new Release(67, 1900637));
        var1.add(new Release(69, 1900635));
        var1.add(new Release(71, 1901046));
        var1.add(new Release(73, 1901051));
        var1.add(new Release(76, 1901049));
        var1.add(new Release(77, 1901054));
        var1.add(new Release(80, 1901069));
        var1.add(new Release(84, 1901075));
        var1.add(new Release(86, 1901071));
        var1.add(new Release(88, 1901080));
        var1.add(new Release(98, 1901098));
        var1.add(new Release(117, 1900773));
        var1.add(new Release(119, 1900767));
        var1.add(new Release(129, 1900943));
        var1.add(new Release(143, 1900918));
        var1.add(new Release(155, 1900966));
        var1.add(new Release(167, 1900949));
        ActivityKt.checkWhatsNew(this, (List)var1, 211);
    }

    // $FF: synthetic method
    public static final void access$setCurrentFragments$p(MainActivity $this, ArrayList var1) {
        $this.currentFragments = var1;
    }

    // $FF: synthetic method
    public static final boolean access$getMIsSearchOpen$p(MainActivity $this) {
        return $this.mIsSearchOpen;
    }

    // $FF: synthetic method
    public static final boolean access$getShouldGoToTodayBeVisible$p(MainActivity $this) {
        return $this.shouldGoToTodayBeVisible;
    }

    // $FF: synthetic method
    public static final ArrayList access$getEventTypesToExport$p(MainActivity $this) {
        return $this.eventTypesToExport;
    }

    // $FF: synthetic method
    public static final void access$setMLatestSearchQuery$p(MainActivity $this, String var1) {
        $this.mLatestSearchQuery = var1;
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
