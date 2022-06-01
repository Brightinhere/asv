package com.battlelancer.seriesguide.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J>\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u000bJ#\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/battlelancer/seriesguide/sync/HexagonMovieSync;", "", "context", "Landroid/content/Context;", "hexagonTools", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/backend/HexagonTools;)V", "buildMovieList", "", "Lcom/uwetrottmann/seriesguide/backend/movies/model/Movie;", "download", "", "newCollectionMovies", "", "", "newWatchlistMovies", "newWatchedMoviesToPlays", "", "hasMergedMovies", "uploadAll", "putIfNotNull", "", "Landroid/content/ContentValues;", "value", "key", "", "(Landroid/content/ContentValues;Ljava/lang/Boolean;Ljava/lang/String;)V", "Companion", "app_amazonDebug"})
public final class HexagonMovieSync {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.backend.HexagonTools hexagonTools = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.sync.HexagonMovieSync.Companion Companion = null;
    private static final int MAX_BATCH_SIZE = 500;
    
    public HexagonMovieSync(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.backend.HexagonTools hexagonTools) {
        super();
    }
    
    /**
     * Downloads movies from hexagon, updates existing movies with new properties, removes
     * movies that are neither in collection or watchlist or watched.
     *
     * Adds movie tmdb ids of new movies to the respective collection, watchlist or watched set.
     */
    public final boolean download(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Integer> newCollectionMovies, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Integer> newWatchlistMovies, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> newWatchedMoviesToPlays, boolean hasMergedMovies) {
        return false;
    }
    
    private final void putIfNotNull(android.content.ContentValues $this$putIfNotNull, java.lang.Boolean value, java.lang.String key) {
    }
    
    /**
     * Uploads all local movies to Hexagon.
     */
    public final boolean uploadAll() {
        return false;
    }
    
    private final java.util.List<com.uwetrottmann.seriesguide.backend.movies.model.Movie> buildMovieList() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/sync/HexagonMovieSync$Companion;", "", "()V", "MAX_BATCH_SIZE", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}