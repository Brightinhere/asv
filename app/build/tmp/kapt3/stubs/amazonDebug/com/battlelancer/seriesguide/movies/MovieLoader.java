package com.battlelancer.seriesguide.movies;

import java.lang.System;

/**
 * Tries to load current movie details from trakt and TMDb, if failing tries to fall back to local
 * database copy.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLoader;", "Lcom/uwetrottmann/androidutils/GenericSimpleLoader;", "Lcom/battlelancer/seriesguide/movies/details/MovieDetails;", "context", "Landroid/content/Context;", "tmdbId", "", "(Landroid/content/Context;I)V", "loadInBackground", "app_amazonDebug"})
public final class MovieLoader extends com.uwetrottmann.androidutils.GenericSimpleLoader<com.battlelancer.seriesguide.movies.details.MovieDetails> {
    private final int tmdbId = 0;
    
    public MovieLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int tmdbId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.movies.details.MovieDetails loadInBackground() {
        return null;
    }
}