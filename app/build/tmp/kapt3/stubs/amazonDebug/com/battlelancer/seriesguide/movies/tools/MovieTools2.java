package com.battlelancer.seriesguide.movies.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/movies/tools/MovieTools2;", "", "()V", "updateReleaseDateForRegion", "", "movie", "Lcom/uwetrottmann/tmdb2/entities/Movie;", "results", "Lcom/uwetrottmann/tmdb2/entities/ReleaseDatesResults;", "regionCode", "", "app_amazonDebug"})
public final class MovieTools2 {
    
    public MovieTools2() {
        super();
    }
    
    /**
     * Replaces the release date of the movie with one of the given region, if available.
     * Picks the theatrical release or if not available the first date for that region.
     * This is not always the best approach, e.g. when viewing disc or digital releases this might
     * not display the correct date. But this is the best possible right now.
     */
    public final void updateReleaseDateForRegion(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.entities.Movie movie, @org.jetbrains.annotations.Nullable()
    com.uwetrottmann.tmdb2.entities.ReleaseDatesResults results, @org.jetbrains.annotations.NotNull()
    java.lang.String regionCode) {
    }
}