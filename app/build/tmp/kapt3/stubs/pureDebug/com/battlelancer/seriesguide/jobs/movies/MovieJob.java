package com.battlelancer.seriesguide.jobs.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H$J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/movies/MovieJob;", "Lcom/battlelancer/seriesguide/jobs/BaseJob;", "Lcom/battlelancer/seriesguide/jobs/FlagJob;", "action", "Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;", "movieTmdbId", "", "plays", "(Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;II)V", "applyDatabaseUpdate", "", "context", "Landroid/content/Context;", "applyLocalChanges", "requiresNetworkJob", "prepareNetworkJob", "", "supportsHexagon", "supportsTrakt", "app_pureDebug"})
public abstract class MovieJob extends com.battlelancer.seriesguide.jobs.BaseJob implements com.battlelancer.seriesguide.jobs.FlagJob {
    private final int movieTmdbId = 0;
    private final int plays = 0;
    
    public MovieJob(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.episodes.JobAction action, int movieTmdbId, int plays) {
        super(null);
    }
    
    @java.lang.Override()
    public boolean supportsHexagon() {
        return false;
    }
    
    @java.lang.Override()
    public boolean supportsTrakt() {
        return false;
    }
    
    @java.lang.Override()
    public boolean applyLocalChanges(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean requiresNetworkJob) {
        return false;
    }
    
    protected abstract boolean applyDatabaseUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int movieTmdbId);
    
    private final byte[] prepareNetworkJob() {
        return null;
    }
}