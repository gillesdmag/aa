package com.simplemobiletools.calendar.pro.jobs;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.CalendarContract.Calendars;
import com.simplemobiletools.calendar.pro.extensions.ContextKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/jobs/CalDAVUpdateListener;", "Landroid/app/job/JobService;", "()V", "mHandler", "Landroid/os/Handler;", "mRunningParams", "Landroid/app/job/JobParameters;", "mWorker", "Ljava/lang/Runnable;", "cancelJob", "", "context", "Landroid/content/Context;", "isScheduled", "", "onStartJob", "params", "onStopJob", "scheduleJob", "Companion", "calendar_debug"}
)
@TargetApi(24)
public final class CalDAVUpdateListener extends JobService {
    private final Handler mHandler = new Handler();
    private final Runnable mWorker = (Runnable)(new Runnable() {
        public final void run() {
            CalDAVUpdateListener.this.scheduleJob((Context)CalDAVUpdateListener.this);
            CalDAVUpdateListener.this.jobFinished(CalDAVUpdateListener.this.mRunningParams, false);
        }
    });
    private JobParameters mRunningParams;
    public static final int CALDAV_EVENT_CONTENT_JOB = 1;
    @NotNull
    public static final CalDAVUpdateListener.Companion Companion = new CalDAVUpdateListener.Companion((DefaultConstructorMarker)null);

    public final void scheduleJob(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentName componentName = new ComponentName(context, CalDAVUpdateListener.class);
        Uri uri = Calendars.CONTENT_URI;
        Builder var4 = new Builder(1, componentName);
        int var6 = false;
        var4.addTriggerContentUri(new TriggerContentUri(uri, 1));
        Object var10000 = context.getSystemService("jobscheduler");
        if (var10000 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
        } else {
            ((JobScheduler)var10000).schedule(var4.build());
        }
    }

    public final boolean isScheduled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JobScheduler jobScheduler = (JobScheduler)context.getSystemService(JobScheduler.class);
        Intrinsics.checkNotNullExpressionValue(jobScheduler, "jobScheduler");
        List var10000 = jobScheduler.getAllPendingJobs();
        Intrinsics.checkNotNullExpressionValue(var10000, "jobScheduler.allPendingJobs");
        List jobs = var10000;
        Iterable $this$any$iv = (Iterable)jobs;
        int $i$f$any = false;
        boolean var10;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            var10 = false;
        } else {
            Iterator var6 = $this$any$iv.iterator();

            while(var6.hasNext()) {
                Object element$iv = var6.next();
                JobInfo it = (JobInfo)element$iv;
                int var9 = false;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.getId() == 1) {
                    var10 = true;
                    return var10;
                }
            }

            var10 = false;
        }

        return var10;
    }

    public final void cancelJob(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JobScheduler js = (JobScheduler)context.getSystemService(JobScheduler.class);
        js.cancel(1);
    }

    public boolean onStartJob(@NotNull JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.mRunningParams = params;
        if (params.getTriggeredContentAuthorities() != null && params.getTriggeredContentUris() != null) {
            ContextKt.recheckCalDAVCalendars(this, (Function0)null.INSTANCE);
        }

        this.mHandler.post(this.mWorker);
        return true;
    }

    public boolean onStopJob(@NotNull JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.mHandler.removeCallbacks(this.mWorker);
        return false;
    }

    // $FF: synthetic method
    public static final void access$setMRunningParams$p(CalDAVUpdateListener $this, JobParameters var1) {
        $this.mRunningParams = var1;
    }

    @Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"},
        d2 = {"Lcom/simplemobiletools/calendar/pro/jobs/CalDAVUpdateListener$Companion;", "", "()V", "CALDAV_EVENT_CONTENT_JOB", "", "calendar_debug"}
    )
    public static final class Companion {
        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
