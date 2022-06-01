package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/HexagonMovieJob;", "Lcom/battlelancer/seriesguide/jobs/BaseNetworkMovieJob;", "hexagonTools", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "action", "Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;", "jobInfo", "Lcom/battlelancer/seriesguide/jobs/SgJobInfo;", "(Lcom/battlelancer/seriesguide/backend/HexagonTools;Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;Lcom/battlelancer/seriesguide/jobs/SgJobInfo;)V", "execute", "Lcom/battlelancer/seriesguide/sync/NetworkJobProcessor$JobResult;", "context", "Landroid/content/Context;", "getMovieForHexagon", "", "Lcom/uwetrottmann/seriesguide/backend/movies/model/Movie;", "app_pureDebug"})
public final class HexagonMovieJob extends com.battlelancer.seriesguide.jobs.BaseNetworkMovieJob {
    private final com.battlelancer.seriesguide.backend.HexagonTools hexagonTools = null;
    
    public HexagonMovieJob(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.backend.HexagonTools hexagonTools, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.episodes.JobAction action, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.SgJobInfo jobInfo) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.sync.NetworkJobProcessor.JobResult execute(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final java.util.List<com.uwetrottmann.seriesguide.backend.movies.model.Movie> getMovieForHexagon() {
        return null;
    }
}