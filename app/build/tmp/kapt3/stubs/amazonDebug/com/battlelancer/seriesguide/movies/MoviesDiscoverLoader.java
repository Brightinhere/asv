package com.battlelancer.seriesguide.movies;

import java.lang.System;

/**
 * Loads a list of movies from TMDb.
 *
 * If a query is given, will load search results for that query. Otherwise will load a list of
 * movies based on the given link.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLoader;", "Lcom/uwetrottmann/androidutils/GenericSimpleLoader;", "Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLoader$Result;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dateNow", "Lcom/uwetrottmann/tmdb2/entities/TmdbDate;", "getDateNow", "()Lcom/uwetrottmann/tmdb2/entities/TmdbDate;", "dateOneMonthAgo", "getDateOneMonthAgo", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "buildErrorResult", "loadInBackground", "Result", "app_amazonDebug"})
public final class MoviesDiscoverLoader extends com.uwetrottmann.androidutils.GenericSimpleLoader<com.battlelancer.seriesguide.movies.MoviesDiscoverLoader.Result> {
    private final com.uwetrottmann.tmdb2.Tmdb tmdb = null;
    
    public MoviesDiscoverLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateNow() {
        return null;
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateOneMonthAgo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.movies.MoviesDiscoverLoader.Result loadInBackground() {
        return null;
    }
    
    private final com.battlelancer.seriesguide.movies.MoviesDiscoverLoader.Result buildErrorResult() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLoader$Result;", "", "results", "", "Lcom/uwetrottmann/tmdb2/entities/BaseMovie;", "emptyText", "", "(Ljava/util/List;Ljava/lang/String;)V", "getEmptyText", "()Ljava/lang/String;", "setEmptyText", "(Ljava/lang/String;)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "app_amazonDebug"})
    public static final class Result {
        
        /**
         * If loading failed, is null. Empty if no results.
         */
        @org.jetbrains.annotations.Nullable()
        private java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseMovie> results;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String emptyText;
        
        public Result(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseMovie> results, @org.jetbrains.annotations.NotNull()
        java.lang.String emptyText) {
            super();
        }
        
        /**
         * If loading failed, is null. Empty if no results.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.uwetrottmann.tmdb2.entities.BaseMovie> getResults() {
            return null;
        }
        
        /**
         * If loading failed, is null. Empty if no results.
         */
        public final void setResults(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseMovie> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmptyText() {
            return null;
        }
        
        public final void setEmptyText(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}