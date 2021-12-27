package com.simplemobiletools.calendar.pro.helpers;

import android.content.Context;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.extensions.DateTimeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00040\u0004J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\n \u0011*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010#\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0004J \u0010'\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010)\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010+\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010,\u001a\n \u0011*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0004J\u0016\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004J\u0016\u0010.\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010/\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 J\u001e\u00103\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u00104\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u00105\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u00106\u001a\u00020\u0004J\u000e\u00107\u001a\n \u0011*\u0004\u0018\u00010\u00040\u0004J\u000e\u00108\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 J\u0016\u00109\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006:"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/helpers/Formatter;", "", "()V", "DATE_DAY_PATTERN", "", "DAYCODE_PATTERN", "DAY_OF_WEEK_PATTERN", "DAY_PATTERN", "LONGEST_PATTERN", "MONTH_PATTERN", "PATTERN_HOURS_12", "PATTERN_HOURS_24", "PATTERN_TIME_12", "PATTERN_TIME_24", "TIME_PATTERN", "YEAR_PATTERN", "getCurrentMonthShort", "kotlin.jvm.PlatformType", "getDate", "context", "Landroid/content/Context;", "dateTime", "Lorg/joda/time/DateTime;", "addDayOfWeek", "", "getDateDayTitle", "dayCode", "getDateFromCode", "shortMonth", "getDateFromTS", "Lorg/joda/time/LocalDate;", "ts", "", "getDateTimeFromCode", "getDateTimeFromTS", "getDayCodeFromDateTime", "getDayCodeFromTS", "getDayEndTS", "getDayStartTS", "getDayTitle", "getExportedTime", "getFullDate", "getHourPattern", "getHours", "getLocalDateTimeFromCode", "getLongMonthYear", "getLongestDate", "getMonthName", "id", "", "getShiftedImportTimestamp", "getTime", "getTimeFromTS", "getTimePattern", "getTodayCode", "getTodayDayNumber", "getUTCDateTimeFromTS", "getUTCDayCodeFromTS", "Simple-Calendar.app"}
)
public final class Formatter {
    @NotNull
    public static final String DAYCODE_PATTERN = "YYYYMMdd";
    @NotNull
    public static final String YEAR_PATTERN = "YYYY";
    @NotNull
    public static final String TIME_PATTERN = "HHmmss";
    private static final String MONTH_PATTERN = "MMM";
    private static final String DAY_PATTERN = "d";
    private static final String DAY_OF_WEEK_PATTERN = "EEE";
    private static final String LONGEST_PATTERN = "MMMM d YYYY (EEEE)";
    private static final String DATE_DAY_PATTERN = "d EEEE";
    private static final String PATTERN_TIME_12 = "hh:mm a";
    private static final String PATTERN_TIME_24 = "HH:mm";
    private static final String PATTERN_HOURS_12 = "h a";
    private static final String PATTERN_HOURS_24 = "HH";
    @NotNull
    public static final Formatter INSTANCE;

    @NotNull
    public final String getDateFromCode(@NotNull Context context, @NotNull String dayCode, boolean shortMonth) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        DateTime dateTime = this.getDateTimeFromCode(dayCode);
        String day = dateTime.toString("d");
        String year = dateTime.toString("YYYY");
        byte var9 = 4;
        byte var10 = 6;
        String var10000 = dayCode.substring(var9, var10);
        Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Integer monthIndex = Integer.valueOf(var10000);
        Intrinsics.checkNotNullExpressionValue(monthIndex, "monthIndex");
        String month = this.getMonthName(context, monthIndex);
        if (shortMonth) {
            Intrinsics.checkNotNullExpressionValue(month, "month");
            var10 = 0;
            int var11 = Math.min(month.length(), 3);
            if (month == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            var10000 = month.substring(var10, var11);
            Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            month = var10000;
        }

        String date = month + ' ' + day;
        if (Intrinsics.areEqual(year, (new DateTime()).toString("YYYY")) ^ true) {
            date = date + ' ' + year;
        }

        return date;
    }

    // $FF: synthetic method
    public static String getDateFromCode$default(Formatter var0, Context var1, String var2, boolean var3, int var4, Object var5) {
        if ((var4 & 4) != 0) {
            var3 = false;
        }

        return var0.getDateFromCode(var1, var2, var3);
    }

    @NotNull
    public final String getDayTitle(@NotNull Context context, @NotNull String dayCode, boolean addDayOfWeek) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        String date = getDateFromCode$default(this, context, dayCode, false, 4, (Object)null);
        DateTime dateTime = this.getDateTimeFromCode(dayCode);
        String day = dateTime.toString("EEE");
        return addDayOfWeek ? date + " (" + day + ')' : date;
    }

    // $FF: synthetic method
    public static String getDayTitle$default(Formatter var0, Context var1, String var2, boolean var3, int var4, Object var5) {
        if ((var4 & 4) != 0) {
            var3 = true;
        }

        return var0.getDayTitle(var1, var2, var3);
    }

    @NotNull
    public final String getDateDayTitle(@NotNull String dayCode) {
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        DateTime dateTime = this.getDateTimeFromCode(dayCode);
        String var10000 = dateTime.toString("d EEEE");
        Intrinsics.checkNotNullExpressionValue(var10000, "dateTime.toString(DATE_DAY_PATTERN)");
        return var10000;
    }

    @NotNull
    public final String getLongMonthYear(@NotNull Context context, @NotNull String dayCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        DateTime dateTime = this.getDateTimeFromCode(dayCode);
        byte var6 = 4;
        byte var7 = 6;
        String var10000 = dayCode.substring(var6, var7);
        Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Integer monthIndex = Integer.valueOf(var10000);
        Intrinsics.checkNotNullExpressionValue(monthIndex, "monthIndex");
        String month = this.getMonthName(context, monthIndex);
        String year = dateTime.toString("YYYY");
        String date = month;
        if (Intrinsics.areEqual(year, (new DateTime()).toString("YYYY")) ^ true) {
            date = month + ' ' + year;
        }

        Intrinsics.checkNotNullExpressionValue(date, "date");
        return date;
    }

    public final String getLongestDate(long ts) {
        return this.getDateTimeFromTS(ts).toString("MMMM d YYYY (EEEE)");
    }

    @NotNull
    public final String getDate(@NotNull Context context, @NotNull DateTime dateTime, boolean addDayOfWeek) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        String var10002 = this.getDayCodeFromDateTime(dateTime);
        Intrinsics.checkNotNullExpressionValue(var10002, "getDayCodeFromDateTime(dateTime)");
        return this.getDayTitle(context, var10002, addDayOfWeek);
    }

    // $FF: synthetic method
    public static String getDate$default(Formatter var0, Context var1, DateTime var2, boolean var3, int var4, Object var5) {
        if ((var4 & 4) != 0) {
            var3 = true;
        }

        return var0.getDate(var1, var2, var3);
    }

    @NotNull
    public final String getFullDate(@NotNull Context context, @NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        String day = dateTime.toString("d");
        String year = dateTime.toString("YYYY");
        int monthIndex = dateTime.getMonthOfYear();
        String month = this.getMonthName(context, monthIndex);
        return month + ' ' + day + ' ' + year;
    }

    @NotNull
    public final String getTodayCode() {
        return this.getDayCodeFromTS(ConstantsKt.getNowSeconds());
    }

    public final String getTodayDayNumber() {
        return this.getDateTimeFromTS(ConstantsKt.getNowSeconds()).toString("d");
    }

    public final String getCurrentMonthShort() {
        return this.getDateTimeFromTS(ConstantsKt.getNowSeconds()).toString("MMM");
    }

    public final String getHours(@NotNull Context context, @NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        return dateTime.toString(this.getHourPattern(context));
    }

    public final String getTime(@NotNull Context context, @NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        return dateTime.toString(this.getTimePattern(context));
    }

    public final DateTime getDateTimeFromCode(@NotNull String dayCode) {
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        return DateTimeFormat.forPattern("YYYYMMdd").withZone(DateTimeZone.UTC).parseDateTime(dayCode);
    }

    public final DateTime getLocalDateTimeFromCode(@NotNull String dayCode) {
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        return DateTimeFormat.forPattern("YYYYMMdd").withZone(DateTimeZone.getDefault()).parseLocalDate(dayCode).toDateTimeAtStartOfDay();
    }

    public final String getTimeFromTS(@NotNull Context context, long ts) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.getTime(context, this.getDateTimeFromTS(ts));
    }

    public final long getDayStartTS(@NotNull String dayCode) {
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        DateTime var10000 = this.getLocalDateTimeFromCode(dayCode);
        Intrinsics.checkNotNullExpressionValue(var10000, "getLocalDateTimeFromCode(dayCode)");
        return DateTimeKt.seconds(var10000);
    }

    public final long getDayEndTS(@NotNull String dayCode) {
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        DateTime var10000 = this.getLocalDateTimeFromCode(dayCode).plusDays(1).minusMinutes(1);
        Intrinsics.checkNotNullExpressionValue(var10000, "getLocalDateTimeFromCode…usDays(1).minusMinutes(1)");
        return DateTimeKt.seconds(var10000);
    }

    public final String getDayCodeFromDateTime(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        return dateTime.toString("YYYYMMdd");
    }

    @NotNull
    public final LocalDate getDateFromTS(long ts) {
        return new LocalDate(ts * 1000L, DateTimeZone.getDefault());
    }

    @NotNull
    public final DateTime getDateTimeFromTS(long ts) {
        return new DateTime(ts * 1000L, DateTimeZone.getDefault());
    }

    @NotNull
    public final DateTime getUTCDateTimeFromTS(long ts) {
        return new DateTime(ts * 1000L, DateTimeZone.UTC);
    }

    public final String getMonthName(@NotNull Context context, int id) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getStringArray(200011)[id - 1];
    }

    @NotNull
    public final String getHourPattern(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextKt.getConfig(context).getUse24HourFormat() ? "HH" : "h a";
    }

    @NotNull
    public final String getTimePattern(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextKt.getConfig(context).getUse24HourFormat() ? "HH:mm" : "hh:mm a";
    }

    @NotNull
    public final String getExportedTime(long ts) {
        DateTime dateTime = new DateTime(ts, DateTimeZone.UTC);
        return dateTime.toString("YYYYMMdd") + 'T' + dateTime.toString("HHmmss") + 'Z';
    }

    @NotNull
    public final String getDayCodeFromTS(long ts) {
        String daycode = this.getDateTimeFromTS(ts).toString("YYYYMMdd");
        Intrinsics.checkNotNullExpressionValue(daycode, "daycode");
        CharSequence var4 = (CharSequence)daycode;
        return var4.length() > 0 ? daycode : "0";
    }

    public final String getUTCDayCodeFromTS(long ts) {
        return this.getUTCDateTimeFromTS(ts).toString("YYYYMMdd");
    }

    public final long getShiftedImportTimestamp(long ts) {
        DateTime var10000 = this.getUTCDateTimeFromTS(ts).withTime(13, 0, 0, 0).withZoneRetainFields(DateTimeZone.getDefault());
        Intrinsics.checkNotNullExpressionValue(var10000, "getUTCDateTimeFromTS(ts)…ateTimeZone.getDefault())");
        return DateTimeKt.seconds(var10000);
    }

    private Formatter() {
    }

    static {
        Formatter var0 = new Formatter();
        INSTANCE = var0;
    }
}
