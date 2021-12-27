// SelectTimeZoneActivity.java
package com.simplemobiletools.calendar.pro.activities;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView.OnQueryTextListener;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.MenuItemCompat.OnActionExpandListener;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.adapters.SelectTimeZoneAdapter;
import com.simplemobiletools.calendar.pro.helpers.MyTimeZonesKt;
import com.simplemobiletools.calendar.pro.models.MyTimeZone;
import com.simplemobiletools.commons.activities.BaseSimpleActivity;
import com.simplemobiletools.commons.views.MyRecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/activities/SelectTimeZoneActivity;", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "()V", "allTimeZones", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/MyTimeZone;", "Lkotlin/collections/ArrayList;", "mSearchMenuItem", "Landroid/view/MenuItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "searchQueryChanged", "text", "", "setupSearch", "calendar_debug"}
)
public final class SelectTimeZoneActivity extends SimpleActivity {
    private MenuItem mSearchMenuItem;
    private final ArrayList allTimeZones = MyTimeZonesKt.getAllTimeZones();
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300098);
        this.setTitle((CharSequence)"");
        SelectTimeZoneAdapter var2 = new SelectTimeZoneAdapter((SimpleActivity)this, this.allTimeZones, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke(var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Intent data = new Intent();
                data.putExtra("time_zone", (Serializable)((MyTimeZone)it));
                SelectTimeZoneActivity.this.setResult(-1, data);
                SelectTimeZoneActivity.this.finish();
            }
        }));
        int var4 = false;
        MyRecyclerView var10000 = (MyRecyclerView)this._$_findCachedViewById(id.select_time_zone_list);
        Intrinsics.checkNotNullExpressionValue(var10000, "select_time_zone_list");
        var10000.setAdapter((Adapter)var2);
        String var13 = this.getIntent().getStringExtra("current_time_zone");
        if (var13 == null) {
            TimeZone var14 = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(var14, "TimeZone.getDefault()");
            var13 = var14.getID();
        }

        String currentTimeZone = var13;
        List $this$indexOfFirst$iv = (List)this.allTimeZones;
        int $i$f$indexOfFirst = false;
        int index$iv = 0;
        Iterator var7 = $this$indexOfFirst$iv.iterator();

        int var15;
        while(true) {
            if (!var7.hasNext()) {
                var15 = -1;
                break;
            }

            Object item$iv = var7.next();
            MyTimeZone it = (MyTimeZone)item$iv;
            int var10 = false;
            if (StringsKt.equals(it.getZoneName(), currentTimeZone, true)) {
                var15 = index$iv;
                break;
            }

            ++index$iv;
        }

        int pos = var15;
        if (pos != -1) {
            ((MyRecyclerView)this._$_findCachedViewById(id.select_time_zone_list)).scrollToPosition(pos);
        }

    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.getMenuInflater().inflate(1400009, menu);
        this.setupSearch(menu);
        BaseSimpleActivity.updateMenuItemColors$default(this, menu, false, 0, 6, (Object)null);
        return true;
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
                var3.setQueryHint((CharSequence)this.getString(1900991));
                var3.setSearchableInfo(searchManager.getSearchableInfo(this.getComponentName()));
                var3.setSubmitButtonEnabled(false);
                var3.setIconified(false);
                var3.setOnQueryTextListener((OnQueryTextListener)(new SelectTimeZoneActivity$setupSearch$$inlined$apply$lambda$1(this, searchManager)));
                var6 = this.mSearchMenuItem;
                Intrinsics.checkNotNull(var6);
                var6.expandActionView();
                MenuItemCompat.setOnActionExpandListener(this.mSearchMenuItem, (OnActionExpandListener)(new OnActionExpandListener() {
                    public boolean onMenuItemActionExpand(@Nullable MenuItem item) {
                        SelectTimeZoneActivity.this.searchQueryChanged("");
                        return true;
                    }

                    public boolean onMenuItemActionCollapse(@Nullable MenuItem item) {
                        SelectTimeZoneActivity.this.finish();
                        return true;
                    }
                }));
            }
        }
    }

    private final void searchQueryChanged(String text) {
        Iterable $this$filter$iv = (Iterable)this.allTimeZones;
        int $i$f$filter = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        int $i$f$filterTo = false;
        Iterator var8 = $this$filter$iv.iterator();

        while(var8.hasNext()) {
            Object element$iv$iv = var8.next();
            MyTimeZone it = (MyTimeZone)element$iv$iv;
            int var11 = false;
            String var12 = it.getZoneName();
            Locale var10000 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(var10000, "Locale.getDefault()");
            Locale var13 = var10000;
            boolean var15 = false;
            if (var12 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            String var16 = var12.toLowerCase(var13);
            Intrinsics.checkNotNullExpressionValue(var16, "(this as java.lang.String).toLowerCase(locale)");
            CharSequence var17 = (CharSequence)var16;
            Locale var10001 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(var10001, "Locale.getDefault()");
            var13 = var10001;
            var15 = false;
            if (text == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            String var20 = text.toLowerCase(var13);
            Intrinsics.checkNotNullExpressionValue(var20, "(this as java.lang.String).toLowerCase(locale)");
            if (StringsKt.contains$default(var17, (CharSequence)var20, false, 2, (Object)null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        List var18 = CollectionsKt.toMutableList((Collection)((List)destination$iv$iv));
        if (var18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<com.simplemobiletools.calendar.pro.models.MyTimeZone>");
        } else {
            ArrayList timeZones = (ArrayList)var18;
            MyRecyclerView var19 = (MyRecyclerView)this._$_findCachedViewById(id.select_time_zone_list);
            Intrinsics.checkNotNullExpressionValue(var19, "select_time_zone_list");
            Adapter var21 = var19.getAdapter();
            if (!(var21 instanceof SelectTimeZoneAdapter)) {
                var21 = null;
            }

            SelectTimeZoneAdapter var22 = (SelectTimeZoneAdapter)var21;
            if (var22 != null) {
                var22.updateTimeZones(timeZones);
            }

        }
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
// SelectTimeZoneActivity$setupSearch$$inlined$apply$lambda$1.java
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
    d2 = {"com/simplemobiletools/calendar/pro/activities/SelectTimeZoneActivity$setupSearch$1$1", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", "query", "calendar_debug"}
)
public final class SelectTimeZoneActivity$setupSearch$$inlined$apply$lambda$1 implements OnQueryTextListener {
    // $FF: synthetic field
    final SelectTimeZoneActivity this$0;
    // $FF: synthetic field
    final SearchManager $searchManager$inlined;

    SelectTimeZoneActivity$setupSearch$$inlined$apply$lambda$1(SelectTimeZoneActivity var1, SearchManager var2) {
        this.this$0 = var1;
        this.$searchManager$inlined = var2;
    }

    public boolean onQueryTextSubmit(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return false;
    }

    public boolean onQueryTextChange(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        SelectTimeZoneActivity.access$searchQueryChanged(this.this$0, newText);
        return true;
    }
}
