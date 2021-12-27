package com.simplemobiletools.calendar.pro;

import androidx.multidex.MultiDexApplication;
import com.simplemobiletools.commons.extensions.AppKt;
import kotlin.Metadata;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/App;", "Landroidx/multidex/MultiDexApplication;", "()V", "onCreate", "", "Simple-Calendar.app"}
)
public final class App extends MultiDexApplication {
    public void onCreate() {
        super.onCreate();
        AppKt.checkUseEnglish(this);
    }
}
