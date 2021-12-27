// EventsDatabase.java
package com.simplemobiletools.calendar.pro.databases;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.RoomDatabase.Callback;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import com.simplemobiletools.calendar.pro.helpers.Converters;
import com.simplemobiletools.calendar.pro.interfaces.EventTypesDao;
import com.simplemobiletools.calendar.pro.interfaces.EventsDao;
import com.simplemobiletools.calendar.pro.models.Event;
import com.simplemobiletools.calendar.pro.models.EventType;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/databases/EventsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "EventTypesDao", "Lcom/simplemobiletools/calendar/pro/interfaces/EventTypesDao;", "EventsDao", "Lcom/simplemobiletools/calendar/pro/interfaces/EventsDao;", "Companion", "calendar_debug"}
)
@Database(
    entities = {Event.class, EventType.class},
    version = 4
)
@TypeConverters({Converters.class})
public abstract class EventsDatabase extends RoomDatabase {
    private static EventsDatabase db;
    private static final <undefinedtype> MIGRATION_1_2 = new Migration(1, 2) {
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            int var4 = false;
            database.execSQL("ALTER TABLE events ADD COLUMN reminder_1_type INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE events ADD COLUMN reminder_2_type INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE events ADD COLUMN reminder_3_type INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE events ADD COLUMN attendees TEXT NOT NULL DEFAULT ''");
        }
    };
    private static final <undefinedtype> MIGRATION_2_3 = new Migration(2, 3) {
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            int var4 = false;
            database.execSQL("ALTER TABLE events ADD COLUMN time_zone TEXT NOT NULL DEFAULT ''");
        }
    };
    private static final <undefinedtype> MIGRATION_3_4 = new Migration(3, 4) {
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            int var4 = false;
            database.execSQL("ALTER TABLE events ADD COLUMN availability INTEGER NOT NULL DEFAULT 0");
        }
    };
    @NotNull
    public static final EventsDatabase.Companion Companion = new EventsDatabase.Companion((DefaultConstructorMarker)null);

    @NotNull
    public abstract EventsDao EventsDao();

    @NotNull
    public abstract EventTypesDao EventTypesDao();

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0003\u0004\u0007\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion;", "", "()V", "MIGRATION_1_2", "com/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion$MIGRATION_1_2$1", "Lcom/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion$MIGRATION_1_2$1;", "MIGRATION_2_3", "com/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion$MIGRATION_2_3$1", "Lcom/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion$MIGRATION_2_3$1;", "MIGRATION_3_4", "com/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion$MIGRATION_3_4$1", "Lcom/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion$MIGRATION_3_4$1;", "db", "Lcom/simplemobiletools/calendar/pro/databases/EventsDatabase;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "insertRegularEventType", "calendar_debug"}
    )
    public static final class Companion {
        @NotNull
        public final EventsDatabase getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            EventsDatabase var10000;
            if (EventsDatabase.db == null) {
                KClass var2 = Reflection.getOrCreateKotlinClass(EventsDatabase.class);
                synchronized(var2) {
                    int var3 = false;
                    if (EventsDatabase.db == null) {
                        EventsDatabase.db = (EventsDatabase)Room.databaseBuilder(context.getApplicationContext(), EventsDatabase.class, "events.db").addCallback((Callback)(new EventsDatabase$Companion$getInstance$$inlined$synchronized$lambda$1(context))).addMigrations(new Migration[]{(Migration)EventsDatabase.MIGRATION_1_2}).addMigrations(new Migration[]{(Migration)EventsDatabase.MIGRATION_2_3}).addMigrations(new Migration[]{(Migration)EventsDatabase.MIGRATION_3_4}).build();
                        var10000 = EventsDatabase.db;
                        Intrinsics.checkNotNull(var10000);
                        var10000.getOpenHelper().setWriteAheadLoggingEnabled(true);
                    }

                    Unit var5 = Unit.INSTANCE;
                }
            }

            var10000 = EventsDatabase.db;
            Intrinsics.checkNotNull(var10000);
            return var10000;
        }

        public final void destroyInstance() {
            EventsDatabase.db = (EventsDatabase)null;
        }

        private final void insertRegularEventType(final Context context) {
            Executors.newSingleThreadScheduledExecutor().execute((Runnable)(new Runnable() {
                public final void run() {
                    String var10000 = context.getResources().getString(1900672);
                    Intrinsics.checkNotNullExpressionValue(var10000, "context.resources.getStr…g(R.string.regular_event)");
                    String regularEvent = var10000;
                    EventType eventType = new EventType(1L, regularEvent, ContextKt.getConfig(context).getPrimaryColor(), 0, (String)null, (String)null, 56, (DefaultConstructorMarker)null);
                    EventsDatabase var3 = EventsDatabase.db;
                    Intrinsics.checkNotNull(var3);
                    var3.EventTypesDao().insertOrUpdate(eventType);
                    ContextKt.getConfig(context).addDisplayEventType(String.valueOf(1L));
                }
            }));
        }

        private Companion() {
        }

        // $FF: synthetic method
        public static final void access$insertRegularEventType(EventsDatabase.Companion $this, Context context) {
            $this.insertRegularEventType(context);
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
// EventsDatabase$Companion$getInstance$$inlined$synchronized$lambda$1.java
package com.simplemobiletools.calendar.pro.databases;

    import android.content.Context;
    import androidx.room.RoomDatabase.Callback;
    import androidx.sqlite.db.SupportSQLiteDatabase;
    import kotlin.Metadata;
    import kotlin.jvm.internal.Intrinsics;
    import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"},
    d2 = {"com/simplemobiletools/calendar/pro/databases/EventsDatabase$Companion$getInstance$1$1", "Landroidx/room/RoomDatabase$Callback;", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "calendar_debug"}
)
public final class EventsDatabase$Companion$getInstance$$inlined$synchronized$lambda$1 extends Callback {
    // $FF: synthetic field
    final Context $context$inlined;

    EventsDatabase$Companion$getInstance$$inlined$synchronized$lambda$1(Context var1) {
        this.$context$inlined = var1;
    }

    public void onCreate(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onCreate(db);
        EventsDatabase.Companion.access$insertRegularEventType(EventsDatabase.Companion, this.$context$inlined);
    }
}
