// AutoCompleteTextViewAdapter.java
package com.simplemobiletools.calendar.pro.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Filter.FilterResults;
import com.simplemobiletools.calendar.pro.R.id;
import com.simplemobiletools.calendar.pro.activities.SimpleActivity;
import com.simplemobiletools.calendar.pro.models.Attendee;
import com.simplemobiletools.commons.extensions.StringKt;
import com.simplemobiletools.commons.helpers.SimpleContactsHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/AutoCompleteTextViewAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/simplemobiletools/calendar/pro/models/Attendee;", "activity", "Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "contacts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;Ljava/util/ArrayList;)V", "getActivity", "()Lcom/simplemobiletools/calendar/pro/activities/SimpleActivity;", "getContacts", "()Ljava/util/ArrayList;", "resultList", "getResultList", "setResultList", "(Ljava/util/ArrayList;)V", "getCount", "", "getFilter", "Landroid/widget/Filter;", "getItem", "index", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "calendar_debug"}
)
public final class AutoCompleteTextViewAdapter extends ArrayAdapter {
    @NotNull
    private ArrayList resultList;
    @NotNull
    private final SimpleActivity activity;
    @NotNull
    private final ArrayList contacts;

    @NotNull
    public final ArrayList getResultList() {
        return this.resultList;
    }

    public final void setResultList(@NotNull ArrayList var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.resultList = var1;
    }

    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        Attendee contact;
        View listItem;
        CharSequence var7;
        label62: {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Object var10000 = this.resultList.get(position);
            Intrinsics.checkNotNullExpressionValue(var10000, "resultList[position]");
            contact = (Attendee)var10000;
            listItem = convertView;
            if (convertView != null) {
                var10000 = convertView.getTag();
                CharSequence var6 = (CharSequence)contact.getName();
                if (!(Intrinsics.areEqual(var10000, var6.length() > 0) ^ true)) {
                    break label62;
                }
            }

            var7 = (CharSequence)contact.getName();
            int layout = var7.length() > 0 ? 1300094 : 1300084;
            listItem = LayoutInflater.from((Context)this.activity).inflate(layout, parent, false);
        }

        var7 = (CharSequence)contact.getName();
        String var15;
        if (var7.length() > 0) {
            var15 = contact.getName();
        } else {
            var7 = (CharSequence)contact.getEmail();
            var15 = var7.length() > 0 ? contact.getEmail() : "A";
        }

        String nameToUse = var15;
        Resources var10002 = this.activity.getResources();
        Context var10005 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(var10005, "context");
        BitmapDrawable placeholder = new BitmapDrawable(var10002, (new SimpleContactsHelper(var10005)).getContactLetterIcon(nameToUse));
        Intrinsics.checkNotNull(listItem);
        int var10 = false;
        CharSequence var11 = (CharSequence)contact.getName();
        listItem.setTag(var11.length() > 0);
        TextView var16 = (TextView)listItem.findViewById(id.item_autocomplete_name);
        if (var16 != null) {
            var16.setText((CharSequence)contact.getName());
        }

        var16 = (TextView)listItem.findViewById(id.item_autocomplete_email);
        if (var16 != null) {
            var16.setText((CharSequence)contact.getEmail());
        }

        Context var10001 = listItem.getContext();
        Intrinsics.checkNotNullExpressionValue(var10001, "context");
        ImageView var17 = (ImageView)listItem.findViewById(id.item_autocomplete_image);
        Intrinsics.checkNotNullExpressionValue(var17, "item_autocomplete_image");
        contact.updateImage(var10001, var17, (Drawable)placeholder);
        return listItem;
    }

    @NotNull
    public Filter getFilter() {
        return (Filter)(new Filter() {
            @NotNull
            protected FilterResults performFiltering(@Nullable CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                if (constraint != null) {
                    AutoCompleteTextViewAdapter.this.getResultList().clear();
                    String searchString = StringKt.normalizeString(constraint.toString());
                    Iterable $this$forEach$iv = (Iterable)AutoCompleteTextViewAdapter.this.getContacts();
                    int $i$f$forEach = false;
                    Iterator var6 = $this$forEach$iv.iterator();

                    while(var6.hasNext()) {
                        Object element$iv = var6.next();
                        Attendee it = (Attendee)element$iv;
                        int var9 = false;
                        if (StringsKt.contains((CharSequence)it.getEmail(), (CharSequence)searchString, true) || StringsKt.contains((CharSequence)it.getName(), (CharSequence)searchString, true)) {
                            AutoCompleteTextViewAdapter.this.getResultList().add(it);
                        }
                    }

                    List var10000 = (List)AutoCompleteTextViewAdapter.this.getResultList();
                    Comparator var10 = (Comparator)(new AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$compareBy$1(searchString));
                    var10 = (Comparator)(new AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$1(var10, searchString));
                    var10 = (Comparator)(new AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$2(var10, searchString));
                    CollectionsKt.sortWith(var10000, (Comparator)(new AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$3(var10, searchString)));
                    CollectionsKt.reverse((List)AutoCompleteTextViewAdapter.this.getResultList());
                    filterResults.values = AutoCompleteTextViewAdapter.this.getResultList();
                    filterResults.count = AutoCompleteTextViewAdapter.this.getResultList().size();
                }

                return filterResults;
            }

            protected void publishResults(@Nullable CharSequence constraint, @Nullable FilterResults results) {
                if ((results != null ? results.count : -1) > 0) {
                    AutoCompleteTextViewAdapter.this.notifyDataSetChanged();
                } else {
                    AutoCompleteTextViewAdapter.this.notifyDataSetInvalidated();
                }

            }

            @Nullable
            public String convertResultToString(@Nullable Object resultValue) {
                Object var10000 = resultValue;
                if (!(resultValue instanceof Attendee)) {
                    var10000 = null;
                }

                return (Attendee)var10000 != null ? ((Attendee)var10000).getPublicName() : null;
            }

            // $FF: synthetic method
            // $FF: bridge method
            public CharSequence convertResultToString(Object var1) {
                return (CharSequence)this.convertResultToString(var1);
            }
        });
    }

    @NotNull
    public Attendee getItem(int index) {
        Object var10000 = this.resultList.get(index);
        Intrinsics.checkNotNullExpressionValue(var10000, "resultList[index]");
        return (Attendee)var10000;
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object getItem(int var1) {
        return this.getItem(var1);
    }

    public int getCount() {
        return this.resultList.size();
    }

    @NotNull
    public final SimpleActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final ArrayList getContacts() {
        return this.contacts;
    }

    public AutoCompleteTextViewAdapter(@NotNull SimpleActivity activity, @NotNull ArrayList contacts) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        super((Context)activity, 0, (List)contacts);
        this.activity = activity;
        this.contacts = contacts;
        this.resultList = new ArrayList();
    }
}
// AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$compareBy$1.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;
    import kotlin.text.StringsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}
)
public final class AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$compareBy$1 implements Comparator {
    // $FF: synthetic field
    final String $searchString$inlined;

    public AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$compareBy$1(String var1) {
        this.$searchString$inlined = var1;
    }

    public final int compare(Object a, Object b) {
        boolean var3 = false;
        Attendee it = (Attendee)a;
        int var5 = false;
        Comparable var10000 = (Comparable)StringsKt.startsWith(it.getName(), this.$searchString$inlined, true);
        it = (Attendee)b;
        Comparable var6 = var10000;
        var5 = false;
        Comparable var7 = (Comparable)StringsKt.startsWith(it.getName(), this.$searchString$inlined, true);
        return ComparisonsKt.compareValues(var6, var7);
    }
}
// AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$1.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;
    import kotlin.text.StringsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$1 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;
    // $FF: synthetic field
    final String $searchString$inlined;

    public AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$1(Comparator var1, String var2) {
        this.$this_thenBy = var1;
        this.$searchString$inlined = var2;
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
            Comparable var9 = (Comparable)StringsKt.startsWith(it.getEmail(), this.$searchString$inlined, true);
            it = (Attendee)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)StringsKt.startsWith(it.getEmail(), this.$searchString$inlined, true);
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$3.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;
    import kotlin.text.StringsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$3 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;
    // $FF: synthetic field
    final String $searchString$inlined;

    public AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$3(Comparator var1, String var2) {
        this.$this_thenBy = var1;
        this.$searchString$inlined = var2;
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
            Comparable var9 = (Comparable)StringsKt.contains((CharSequence)it.getEmail(), (CharSequence)this.$searchString$inlined, true);
            it = (Attendee)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)StringsKt.contains((CharSequence)it.getEmail(), (CharSequence)this.$searchString$inlined, true);
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
// AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$2.java
package com.simplemobiletools.calendar.pro.adapters;

    import com.simplemobiletools.calendar.pro.models.Attendee;
    import java.util.Comparator;
    import kotlin.Metadata;
    import kotlin.comparisons.ComparisonsKt;
    import kotlin.text.StringsKt;

@Metadata(
    mv = {1, 5, 1},
    k = 3,
    d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
    d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}
)
public final class AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$2 implements Comparator {
    // $FF: synthetic field
    final Comparator $this_thenBy;
    // $FF: synthetic field
    final String $searchString$inlined;

    public AutoCompleteTextViewAdapter$getFilter$1$performFiltering$$inlined$thenBy$2(Comparator var1, String var2) {
        this.$this_thenBy = var1;
        this.$searchString$inlined = var2;
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
            Comparable var9 = (Comparable)StringsKt.contains((CharSequence)it.getName(), (CharSequence)this.$searchString$inlined, true);
            it = (Attendee)b;
            Comparable var7 = var9;
            var6 = false;
            Comparable var8 = (Comparable)StringsKt.contains((CharSequence)it.getName(), (CharSequence)this.$searchString$inlined, true);
            var10000 = ComparisonsKt.compareValues(var7, var8);
        }

        return var10000;
    }
}
