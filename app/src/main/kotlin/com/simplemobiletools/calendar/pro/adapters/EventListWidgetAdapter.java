// EventListWidgetAdapter.java
package com.simplemobiletools.calendar.pro.adapters;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
import com.simplemobiletools.calendar.pro.helpers.ConstantsKt;
import com.simplemobiletools.calendar.pro.helpers.EventsHelper;
import com.simplemobiletools.calendar.pro.helpers.Formatter;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.calendar.pro.models.ListEvent;
import com.simplemobiletools.calendar.pro.models.ListSectionDay;
import com.simplemobiletools.calendar.pro.models.ListSectionMonth;
import com.simplemobiletools.commons.extensions.IntKt;
import com.simplemobiletools.commons.extensions.RemoteViewsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020$2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020$2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020/H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/EventListWidgetAdapter;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ITEM_EVENT", "", "ITEM_SECTION_DAY", "ITEM_SECTION_MONTH", "allDayString", "", "getContext", "()Landroid/content/Context;", "dimPastEvents", "", "displayDescription", "events", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/calendar/pro/models/ListItem;", "mediumFontSize", "", "replaceDescription", "textColor", "weakTextColor", "getCount", "getItemId", "", "position", "getItemViewType", "getLoadingView", "", "getViewAt", "Landroid/widget/RemoteViews;", "getViewTypeCount", "hasStableIds", "initConfigValues", "", "onCreate", "onDataSetChanged", "onDestroy", "setupListEvent", "remoteView", "item", "Lcom/simplemobiletools/calendar/pro/models/ListEvent;", "setupListSectionDay", "Lcom/simplemobiletools/calendar/pro/models/ListSectionDay;", "setupListSectionMonth", "Lcom/simplemobiletools/calendar/pro/models/ListSectionMonth;", "calendar_debug"}
)
public final class EventListWidgetAdapter implements RemoteViewsFactory {
    private final int ITEM_EVENT;
    private final int ITEM_SECTION_DAY;
    private final int ITEM_SECTION_MONTH;
    private final String allDayString;
    private ArrayList events;
    private int textColor;
    private int weakTextColor;
    private boolean displayDescription;
    private boolean replaceDescription;
    private boolean dimPastEvents;
    private float mediumFontSize;
    @NotNull
    private final Context context;

    private final void initConfigValues() {
        this.textColor = ContextKt.getConfig(this.context).getWidgetTextColor();
        this.weakTextColor = IntKt.adjustAlpha(this.textColor, 0.5F);
        this.displayDescription = ContextKt.getConfig(this.context).getDisplayDescription();
        this.replaceDescription = ContextKt.getConfig(this.context).getReplaceDescription();
        this.dimPastEvents = ContextKt.getConfig(this.context).getDimPastEvents();
        this.mediumFontSize = ContextKt.getWidgetFontSize(this.context);
    }

    @NotNull
    public RemoteViews getViewAt(int position) {
        int type = this.getItemViewType(position);
        RemoteViews remoteView = null;
        Object var10000;
        if (type == this.ITEM_EVENT) {
            var10000 = this.events.get(position);
            if (var10000 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.simplemobiletools.calendar.pro.models.ListEvent");
            }

            ListEvent event = (ListEvent)var10000;
            int layout = 1300062;
            remoteView = new RemoteViews(this.context.getPackageName(), layout);
            this.setupListEvent(remoteView, event);
        } else if (type == this.ITEM_SECTION_DAY) {
            remoteView = new RemoteViews(this.context.getPackageName(), 1300216);
            var10000 = CollectionsKt.getOrNull((List)this.events, position);
            if (!(var10000 instanceof ListSectionDay)) {
                var10000 = null;
            }

            ListSectionDay section = (ListSectionDay)var10000;
            if (section != null) {
                this.setupListSectionDay(remoteView, section);
            }
        } else {
            remoteView = new RemoteViews(this.context.getPackageName(), 1300092);
            var10000 = CollectionsKt.getOrNull((List)this.events, position);
            if (!(var10000 instanceof ListSectionMonth)) {
                var10000 = null;
            }

            ListSectionMonth section = (ListSectionMonth)var10000;
            if (section != null) {
                this.setupListSectionMonth(remoteView, section);
            }
        }

        return remoteView;
    }

    private final void setupListEvent(RemoteViews remoteView, ListEvent item) {
        int curTextColor = this.textColor;
        int var6 = false;
        RemoteViewsKt.setBackgroundColor(remoteView, 1000125, item.getColor());
        RemoteViewsKt.setText(remoteView, 1001245, item.getTitle());
        String timeText = item.isAllDay() ? this.allDayString : Formatter.INSTANCE.getTimeFromTS(this.context, item.getStartTS());
        String endText = Formatter.INSTANCE.getTimeFromTS(this.context, item.getEndTS());
        String descriptionText;
        if (item.getStartTS() != item.getEndTS()) {
            if (!item.isAllDay()) {
                timeText = timeText + " - " + endText;
            }

            descriptionText = Formatter.INSTANCE.getDayCodeFromTS(item.getStartTS());
            String endCode = Formatter.INSTANCE.getDayCodeFromTS(item.getEndTS());
            if (Intrinsics.areEqual(descriptionText, endCode) ^ true) {
                timeText = timeText + " (" + Formatter.INSTANCE.getDateDayTitle(endCode) + ')';
            }
        }

        Intrinsics.checkNotNullExpressionValue(timeText, "timeText");
        RemoteViewsKt.setText(remoteView, 1001024, timeText);
        descriptionText = this.replaceDescription ? item.getLocation() : item.getDescription();
        if (this.displayDescription) {
            CharSequence var13 = (CharSequence)descriptionText;
            if (var13.length() > 0) {
                RemoteViewsKt.setText(remoteView, 1001024, timeText + '\n' + descriptionText);
            }
        }

        if (this.dimPastEvents && item.isPastEvent()) {
            curTextColor = this.weakTextColor;
        }

        remoteView.setTextColor(1001245, curTextColor);
        remoteView.setTextColor(1001024, curTextColor);
        RemoteViewsKt.setTextSize(remoteView, 1001245, this.mediumFontSize);
        RemoteViewsKt.setTextSize(remoteView, 1001024, this.mediumFontSize);
        Intent var14 = new Intent();
        int var12 = false;
        var14.putExtra("event_id", item.getId());
        var14.putExtra("event_occurrence_ts", item.getStartTS());
        remoteView.setOnClickFillInIntent(1001283, var14);
    }

    private final void setupListSectionDay(RemoteViews remoteView, ListSectionDay item) {
        int curTextColor = this.textColor;
        if (this.dimPastEvents && item.isPastSection()) {
            curTextColor = this.weakTextColor;
        }

        int var6 = false;
        remoteView.setTextColor(1000393, curTextColor);
        RemoteViewsKt.setTextSize(remoteView, 1000393, this.mediumFontSize - 3.0F);
        RemoteViewsKt.setText(remoteView, 1000393, item.getTitle());
        Intent var7 = new Intent();
        int var9 = false;
        var7.putExtra("day_code", item.getCode());
        var7.putExtra("view_to_open", ContextKt.getConfig(this.context).getListWidgetViewToOpen());
        remoteView.setOnClickFillInIntent(1000393, var7);
    }

    private final void setupListSectionMonth(RemoteViews remoteView, ListSectionMonth item) {
        int curTextColor = this.textColor;
        int var6 = false;
        remoteView.setTextColor(1000393, curTextColor);
        RemoteViewsKt.setTextSize(remoteView, 1000393, this.mediumFontSize);
        RemoteViewsKt.setText(remoteView, 1000393, item.getTitle());
    }

    private final int getItemViewType(int position) {
        return CollectionsKt.getOrNull((List)this.events, position) instanceof ListEvent ? this.ITEM_EVENT : (CollectionsKt.getOrNull((List)this.events, position) instanceof ListSectionDay ? this.ITEM_SECTION_DAY : this.ITEM_SECTION_MONTH);
    }

    @Nullable
    public Void getLoadingView() {
        return null;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public RemoteViews getLoadingView() {
        return (RemoteViews)this.getLoadingView();
    }

    public int getViewTypeCount() {
        return 3;
    }

    public void onCreate() {
    }

    public long getItemId(int position) {
        return (long)position;
    }

    public void onDataSetChanged() {
        this.initConfigValues();
        long fromTS = DateTimeKt.seconds(new DateTime()) - (long)(ContextKt.getConfig(this.context).getDisplayPastEvents() * 60);
        DateTime var10000 = (new DateTime()).plusYears(1);
        Intrinsics.checkNotNullExpressionValue(var10000, "DateTime().plusYears(1)");
        long toTS = DateTimeKt.seconds(var10000);
        EventsHelper.getEventsSync$default(ContextKt.getEventsHelper(this.context), fromTS, toTS, 0L, true, (Function1)(new Function1() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke(Object var1) {
                this.invoke((ArrayList)var1);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ArrayList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList listItems = new ArrayList(it.size());
                boolean replaceDescription = ContextKt.getConfig(EventListWidgetAdapter.this.getContext()).getReplaceDescription();
                Iterable var10000 = (Iterable)it;
                Comparator var5 = (Comparator)(new EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$compareBy$1());
                var5 = (Comparator)(new EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$1(var5));
                var5 = (Comparator)(new EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$2(var5));
                List sorted = CollectionsKt.sortedWith(var10000, (Comparator)(new EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$3(var5, replaceDescription)));
                Object prevCode = "";
                Object prevMonthLabel = "";
                long now = ConstantsKt.getNowSeconds();
                String today = Formatter.getDayTitle$default(Formatter.INSTANCE, EventListWidgetAdapter.this.getContext(), Formatter.INSTANCE.getDayCodeFromTS(now), false, 4, (Object)null);
                Iterable $this$forEach$iv = (Iterable)sorted;
                int $i$f$forEach = false;
                Iterator var12 = $this$forEach$iv.iterator();

                while(var12.hasNext()) {
                    Object element$iv = var12.next();
                    Event itx = (Event)element$iv;
                    int var15 = false;
                    String code = Formatter.INSTANCE.getDayCodeFromTS(itx.getStartTS());
                    String monthLabel = Formatter.INSTANCE.getLongMonthYear(EventListWidgetAdapter.this.getContext(), code);
                    if (Intrinsics.areEqual(monthLabel, prevMonthLabel) ^ true) {
                        ListSectionMonth listSectionMonth = new ListSectionMonth(monthLabel);
                        listItems.add(listSectionMonth);
                        prevMonthLabel = monthLabel;
                    }

                    if (Intrinsics.areEqual(code, prevCode) ^ true) {
                        String day = Formatter.INSTANCE.getDateDayTitle(code);
                        boolean isToday = Intrinsics.areEqual(day, today);
                        ListSectionDay listSection = new ListSectionDay(day, code, isToday, !isToday && itx.getStartTS() < now);
                        listItems.add(listSection);
                        prevCode = code;
                    }

                    Long var10002 = itx.getId();
                    Intrinsics.checkNotNull(var10002);
                    ListEvent listEvent = new ListEvent(var10002, itx.getStartTS(), itx.getEndTS(), itx.getTitle(), itx.getDescription(), itx.getIsAllDay(), itx.getColor(), itx.getLocation(), itx.isPastEvent(), itx.getRepeatInterval() > 0);
                    listItems.add(listEvent);
                }

                EventListWidgetAdapter.this.events = listItems;
            }
        }), 4, (Object)null);
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return this.events.size();
    }

    public void onDestroy() {
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public EventListWidgetAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super();
        this.context = context;
        this.ITEM_SECTION_DAY = 1;
        this.ITEM_SECTION_MONTH = 2;
        String var10001 = this.context.getResources().getString(1900325);
        Intrinsics.checkNotNullExpressionValue(var10001, "context.resources.getString(R.string.all_day)");
        this.allDayString = var10001;
        this.events = new ArrayList();
        this.textColor = ContextKt.getConfig(this.context).getWidgetTextColor();
        this.weakTextColor = IntKt.adjustAlpha(this.textColor, 0.5F);
        this.displayDescription = ContextKt.getConfig(this.context).getDisplayDescription();
        this.replaceDescription = ContextKt.getConfig(this.context).getReplaceDescription();
        this.dimPastEvents = ContextKt.getConfig(this.context).getDimPastEvents();
        this.mediumFontSize = ContextKt.getWidgetFontSize(this.context);
        this.initConfigValues();
    }

    // $FF: synthetic method
    public static final ArrayList access$getEvents$p(EventListWidgetAdapter $this) {
        return $this.events;
    }
}
// EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$1.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.helpers.Formatter;
    import com.simplemobiletools.calendar.pro.models.Event;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$1 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;

    public EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$1(Comparator var1) {
        this.$this_thenBy = var1;
    }

    public final int compare(Object a, Object b) {
        int previousCompare = this.$this_thenBy.compare(a, b);
        int var10000;
        if (previousCompare != 0) {
            var10000 = previousCompare;
        } else {
            boolean var4 = false;
            Event it = (Event)a;
            int var6 = false;
            Comparable var9 = it.getIsAllDay() ? (Comparable)Formatter.INSTANCE.getDayEndTS(Formatter.INSTANCE.getDayCodeFromTS(it.getEndTS())) : (Comparable)it.getEndTS();
            it = (Event)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = it.getIsAllDay() ? (Comparable)Formatter.INSTANCE.getDayEndTS(Formatter.INSTANCE.getDayCodeFromTS(it.getEndTS())) : (Comparable)it.getEndTS();
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$3.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.models.Event;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$3 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;
    // $FF: synthetic field
    final boolean $replaceDescription$inlined;

    public EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$3(Comparator var1, boolean var2) {
        this.$this_thenBy = var1;
        this.$replaceDescription$inlined = var2;
    }

    public final int compare(Object a, Object b) {
        int previousCompare = this.$this_thenBy.compare(a, b);
        int var10000;
        if (previousCompare != 0) {
            var10000 = previousCompare;
        } else {
            boolean var4 = false;
            Event it = (Event)a;
            int var6 = false;
            Comparable var9 = this.$replaceDescription$inlined ? (Comparable)it.getLocation() : (Comparable)it.getDescription();
            it = (Event)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = this.$replaceDescription$inlined ? (Comparable)it.getLocation() : (Comparable)it.getDescription();
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$compareBy$1.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.helpers.Formatter;
    import com.simplemobiletools.calendar.pro.models.Event;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}
)
public final class EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$compareBy$1 implements Comparator {
    public final int compare(Object a, Object b) {
        boolean var3 = false;
        Event it = (Event)a;
        int var5 = false;
        Comparable var10000 = it.getIsAllDay() ? (Comparable)Formatter.INSTANCE.getDayStartTS(Formatter.INSTANCE.getDayCodeFromTS(it.getStartTS())) - 1L : (Comparable)it.getStartTS();
        it = (Event)b;
        Comparable var6 = var10000;
        var5 = false;
        Comparable var7 = it.getIsAllDay() ? (Comparable)Formatter.INSTANCE.getDayStartTS(Formatter.INSTANCE.getDayCodeFromTS(it.getStartTS())) - 1L : (Comparable)it.getStartTS();
        return ComparisonsKt.compareValues(var6, var7);
    }
}
// EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$2.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.models.Event;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$2 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;

    public EventListWidgetAdapter$onDataSetChanged$1$$special$$inlined$thenBy$2(Comparator var1) {
        this.$this_thenBy = var1;
    }

    public final int compare(Object a, Object b) {
        int previousCompare = this.$this_thenBy.compare(a, b);
        int var10000;
        if (previousCompare != 0) {
            var10000 = previousCompare;
        } else {
            boolean var4 = false;
            Event it = (Event)a;
            int var6 = false;
            Comparable var9 = (Comparable)it.getTitle();
            it = (Event)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)it.getTitle();
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
