package com.battlelancer.seriesguide.jobs.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/movies/MovieWatchedJob;", "Lcom/battlelancer/seriesguide/jobs/movies/MovieJob;", "movieTmdbId", "", "isWatched", "", "currentPlays", "(IZI)V", "applyDatabaseUpdate", "context", "Landroid/content/Context;", "getConfirmationText", "", "app_pureDebug"})
public final class MovieWatchedJob extends com.battlelancer.seriesguide.jobs.movies.MovieJob {
    private final boolean isWatched = false;
    
    public MovieWatchedJob(int movieTmdbId, boolean isWatched, int currentPlays) {
        super(null, 0, 0);
    }
    
    @java.lang.Override()
    protected boolean applyDatabaseUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int movieTmdbId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getConfirmationText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}