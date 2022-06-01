package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/BaseNetworkEpisodeJob;", "Lcom/battlelancer/seriesguide/jobs/BaseNetworkJob;", "action", "Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;", "jobInfo", "Lcom/battlelancer/seriesguide/jobs/SgJobInfo;", "(Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;Lcom/battlelancer/seriesguide/jobs/SgJobInfo;)V", "getActionDescription", "", "context", "Landroid/content/Context;", "getErrorIntent", "Landroid/app/PendingIntent;", "getItemTitle", "app_amazonDebug"})
public abstract class BaseNetworkEpisodeJob extends com.battlelancer.seriesguide.jobs.BaseNetworkJob {
    
    public BaseNetworkEpisodeJob(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.episodes.JobAction action, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.SgJobInfo jobInfo) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String getItemTitle(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String getActionDescription(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.app.PendingIntent getErrorIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}