package com.battlelancer.seriesguide.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/sync/TmdbSync;", "", "context", "Landroid/content/Context;", "configurationService", "Lcom/uwetrottmann/tmdb2/services/ConfigurationService;", "movieTools", "Lcom/battlelancer/seriesguide/movies/tools/MovieTools;", "(Landroid/content/Context;Lcom/uwetrottmann/tmdb2/services/ConfigurationService;Lcom/battlelancer/seriesguide/movies/tools/MovieTools;)V", "updateConfiguration", "", "prefs", "Landroid/content/SharedPreferences;", "updateMovies", "progress", "Lcom/battlelancer/seriesguide/sync/SyncProgress;", "Companion", "app_pureDebug"})
public final class TmdbSync {
    private final android.content.Context context = null;
    private final com.uwetrottmann.tmdb2.services.ConfigurationService configurationService = null;
    private final com.battlelancer.seriesguide.movies.tools.MovieTools movieTools = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.sync.TmdbSync.Companion Companion = null;
    public static final long RELEASED_AFTER_DAYS = 15552000000L;
    public static final long UPDATED_BEFORE_DAYS = 604800000L;
    public static final long UPDATED_BEFORE_90_DAYS = 7776000000L;
    
    public TmdbSync(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.services.ConfigurationService configurationService, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.tools.MovieTools movieTools) {
        super();
    }
    
    /**
     * Downloads and stores the latest image url configuration from themoviedb.org.
     */
    public final boolean updateConfiguration(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs) {
        return false;
    }
    
    /**
     * Regularly updates current and future movies (or those without a release date) with data from
     * themoviedb.org. All other movies are updated rarely.
     */
    public final boolean updateMovies(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.SyncProgress progress) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/sync/TmdbSync$Companion;", "", "()V", "RELEASED_AFTER_DAYS", "", "UPDATED_BEFORE_90_DAYS", "UPDATED_BEFORE_DAYS", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}