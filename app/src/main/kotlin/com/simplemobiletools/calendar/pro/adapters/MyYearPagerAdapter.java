package com.simplemobiletools.calendar.pro.adapters;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.simplemobiletools.calendar.pro.fragments.YearFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/MyYearPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "mYears", "", "", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "mFragments", "Landroid/util/SparseArray;", "Lcom/simplemobiletools/calendar/pro/fragments/YearFragment;", "getMYears", "()Ljava/util/List;", "getCount", "getItem", "Landroidx/fragment/app/Fragment;", "position", "printCurrentView", "", "pos", "updateCalendars", "calendar_debug"}
)
public final class MyYearPagerAdapter extends FragmentStatePagerAdapter {
    private final SparseArray mFragments;
    @NotNull
    private final List mYears;

    public int getCount() {
        return this.mYears.size();
    }

    @NotNull
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        int year = ((Number)this.mYears.get(position)).intValue();
        bundle.putInt("year", year);
        YearFragment fragment = new YearFragment();
        fragment.setArguments(bundle);
        this.mFragments.put(position, fragment);
        return (Fragment)fragment;
    }

    public final void updateCalendars(int pos) {
        int i = -1;

        for(byte var3 = 1; i <= var3; ++i) {
            YearFragment var10000 = (YearFragment)this.mFragments.get(pos + i);
            if (var10000 != null) {
                var10000.updateCalendar();
            }
        }

    }

    public final void printCurrentView(int pos) {
        ((YearFragment)this.mFragments.get(pos)).printCurrentView();
    }

    @NotNull
    public final List getMYears() {
        return this.mYears;
    }

    public MyYearPagerAdapter(@NotNull FragmentManager fm, @NotNull List mYears) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(mYears, "mYears");
        super(fm);
        this.mYears = mYears;
        this.mFragments = new SparseArray();
    }
}
