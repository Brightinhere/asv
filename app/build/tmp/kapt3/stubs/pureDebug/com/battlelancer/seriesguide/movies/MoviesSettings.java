package com.battlelancer.seriesguide.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MoviesSettings;", "", "()V", "KEY_LAST_ACTIVE_MOVIES_TAB", "", "KEY_MOVIES_LANGUAGE", "KEY_MOVIES_REGION", "getLastMoviesTabPosition", "", "context", "Landroid/content/Context;", "getMoviesLanguage", "getMoviesRegion", "saveLastMoviesTabPosition", "", "position", "saveMoviesLanguage", "code", "saveMoviesRegion", "app_pureDebug"})
public final class MoviesSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.movies.MoviesSettings INSTANCE = null;
    private static final java.lang.String KEY_LAST_ACTIVE_MOVIES_TAB = "com.battlelancer.seriesguide.moviesActiveTab";
    private static final java.lang.String KEY_MOVIES_LANGUAGE = "com.battlelancer.seriesguide.languagemovies";
    private static final java.lang.String KEY_MOVIES_REGION = "com.battlelancer.seriesguide.regionmovies";
    
    private MoviesSettings() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void saveLastMoviesTabPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int position) {
    }
    
    /**
     * Return the position of the last selected movies tab.
     */
    @kotlin.jvm.JvmStatic()
    public static final int getLastMoviesTabPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final void saveMoviesLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    /**
     * @return Two letter ISO 639-1 language code plus an extra ISO-3166-1 region tag used by TMDB
     * as preferred by the user. Or the default language.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getMoviesLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void saveMoviesRegion(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    /**
     * @return Two letter ISO-3166-1 region tag used by TMDB as preferred by the user. Or the
     * default region of the device. Or as a last resort "US".
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getMoviesRegion(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}