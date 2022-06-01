package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000eH$J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH$J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000eH$R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/BaseNetworkJob;", "Lcom/battlelancer/seriesguide/jobs/NetworkJob;", "action", "Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;", "jobInfo", "Lcom/battlelancer/seriesguide/jobs/SgJobInfo;", "(Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;Lcom/battlelancer/seriesguide/jobs/SgJobInfo;)V", "getAction", "()Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;", "getJobInfo", "()Lcom/battlelancer/seriesguide/jobs/SgJobInfo;", "buildResult", "Lcom/battlelancer/seriesguide/sync/NetworkJobProcessor$JobResult;", "context", "Landroid/content/Context;", "result", "", "getActionDescription", "", "getErrorIntent", "Landroid/app/PendingIntent;", "getItemTitle", "app_amazonDebug"})
public abstract class BaseNetworkJob implements com.battlelancer.seriesguide.jobs.NetworkJob {
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.jobs.episodes.JobAction action = null;
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.jobs.SgJobInfo jobInfo = null;
    
    public BaseNetworkJob(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.episodes.JobAction action, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.SgJobInfo jobInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.jobs.episodes.JobAction getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.jobs.SgJobInfo getJobInfo() {
        return null;
    }
    
    /**
     * @return JobResult.jobRemovable true if the job can be removed, false if it should be retried
     * later.
     */
    @org.jetbrains.annotations.NotNull()
    protected final com.battlelancer.seriesguide.sync.NetworkJobProcessor.JobResult buildResult(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int result) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.String getItemTitle(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.String getActionDescription(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.app.PendingIntent getErrorIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
}