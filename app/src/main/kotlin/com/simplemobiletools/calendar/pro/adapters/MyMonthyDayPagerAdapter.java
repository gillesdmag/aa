package com.simplemobiletools.calendar.pro.adapters;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.simplemobiletools.calendar.pro.fragments.MonthFragment;
import com.simplemobiletools.calendar.pro.interfaces.NavigationListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/adapters/MyMonthPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "mCodes", "", "", "mListener", "Lcom/simplemobiletools/calendar/pro/interfaces/NavigationListener;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Lcom/simplemobiletools/calendar/pro/interfaces/NavigationListener;)V", "mFragments", "Landroid/util/SparseArray;", "Lcom/simplemobiletools/calendar/pro/fragments/MonthFragment;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "printCurrentView", "", "pos", "updateCalendars", "calendar_debug"}
)
public final class MyMonthPagerAdapter extends FragmentStatePagerAdapter {
    private final SparseArray mFragments;
    private final List mCodes;
    private final NavigationListener mListener;

    public int getCount() {
        return this.mCodes.size();
    }

    @NotNull
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        String code = (String)this.mCodes.get(position);
        bundle.putString("day_code", code);
        MonthFragment fragment = new MonthFragment();
        fragment.setArguments(bundle);
        fragment.setListener(this.mListener);
        this.mFragments.put(position, fragment);
        return (Fragment)fragment;
    }

    public final void updateCalendars(int pos) {
        int i = -1;

        for(byte var3 = 1; i <= var3; ++i) {
            MonthFragment var10000 = (MonthFragment)this.mFragments.get(pos + i);
            if (var10000 != null) {
                var10000.updateCalendar();
            }
        }

    }

    public final void printCurrentView(int pos) {
        ((MonthFragment)this.mFragments.get(pos)).printCurrentView();
    }

    public MyMonthPagerAdapter(@NotNull FragmentManager fm, @NotNull List mCodes, @NotNull NavigationListener mListener) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(mCodes, "mCodes");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        super(fm);
        this.mCodes = mCodes;
        this.mListener = mListener;
        this.mFragments = new SparseArray();
    }
}
