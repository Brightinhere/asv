package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/BaseJob;", "", "action", "Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;", "(Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;)V", "persistNetworkJob", "", "context", "Landroid/content/Context;", "jobInfo", "", "app_amazonDebug"})
public abstract class BaseJob {
    private final com.battlelancer.seriesguide.jobs.episodes.JobAction action = null;
    
    public BaseJob(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.episodes.JobAction action) {
        super();
    }
    
    protected final boolean persistNetworkJob(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    byte[] jobInfo) {
        return false;
    }
}