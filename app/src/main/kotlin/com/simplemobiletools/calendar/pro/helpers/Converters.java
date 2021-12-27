package com.simplemobiletools.calendar.pro.helpers;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\nH\u0007J(\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\n0\n2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/Converters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "stringType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "jsonToStringList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "value", "stringListToJson", "list", "Simple-Calendar.app"}
)
public final class Converters {
    private final Gson gson = new Gson();
    private final Type stringType = (new TypeToken() {
    }).getType();

    @TypeConverter
    @NotNull
    public final ArrayList jsonToStringList(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        CharSequence var3 = (CharSequence)value;
        String newValue = var3.length() > 0 && !StringsKt.startsWith$default(value, "[", false, 2, (Object)null) ? '[' + value + ']' : value;

        ArrayList var6;
        try {
            Object var10000 = this.gson.fromJson(newValue, this.stringType);
            Intrinsics.checkNotNullExpressionValue(var10000, "gson.fromJson(newValue, stringType)");
            var6 = (ArrayList)var10000;
        } catch (Exception var5) {
            var6 = new ArrayList();
        }

        return var6;
    }

    @TypeConverter
    public final String stringListToJson(@NotNull ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return this.gson.toJson(list);
    }
}
