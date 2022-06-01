package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J4\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J$\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aH\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktTools2;", "", "()V", "getCollectedOrWatchedShows", "Lkotlin/Pair;", "", "", "Lcom/uwetrottmann/trakt5/entities/BaseShow;", "Lcom/battlelancer/seriesguide/traktapi/TraktTools2$ServiceResult;", "isCollectionNotWatched", "", "context", "Landroid/content/Context;", "getEpisodeRatings", "", "showTraktId", "", "seasonNumber", "episodeNumber", "getShowByTmdbId", "Lcom/github/michaelbull/result/Result;", "Lcom/uwetrottmann/trakt5/entities/Show;", "Lcom/battlelancer/seriesguide/traktapi/TraktError;", "showTmdbId", "mapByTmdbId", "traktShows", "", "SearchResult", "ServiceResult", "app_pureDebug"})
public final class TraktTools2 {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.TraktTools2 INSTANCE = null;
    
    private TraktTools2() {
        super();
    }
    
    /**
     * Look up a show by its TMDB ID, may return `null` if not found.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.github.michaelbull.result.Result<com.uwetrottmann.trakt5.entities.Show, com.battlelancer.seriesguide.traktapi.TraktError> getShowByTmdbId(int showTmdbId, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final kotlin.Pair<java.util.Map<java.lang.Integer, com.uwetrottmann.trakt5.entities.BaseShow>, com.battlelancer.seriesguide.traktapi.TraktTools2.ServiceResult> getCollectedOrWatchedShows(boolean isCollectionNotWatched, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.Map<java.lang.Integer, com.uwetrottmann.trakt5.entities.BaseShow> mapByTmdbId(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.uwetrottmann.trakt5.entities.BaseShow> traktShows) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.Double, java.lang.Integer> getEpisodeRatings(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String showTraktId, int seasonNumber, int episodeNumber) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktTools2$SearchResult;", "", "result", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowResult;", "show", "Lcom/uwetrottmann/trakt5/entities/Show;", "(Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowResult;Lcom/uwetrottmann/trakt5/entities/Show;)V", "getResult", "()Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowResult;", "getShow", "()Lcom/uwetrottmann/trakt5/entities/Show;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_pureDebug"})
    public static final class SearchResult {
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowResult result = null;
        @org.jetbrains.annotations.Nullable()
        private final com.uwetrottmann.trakt5.entities.Show show = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.traktapi.TraktTools2.SearchResult copy(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowResult result, @org.jetbrains.annotations.Nullable()
        com.uwetrottmann.trakt5.entities.Show show) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SearchResult(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowResult result, @org.jetbrains.annotations.Nullable()
        com.uwetrottmann.trakt5.entities.Show show) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowResult component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowResult getResult() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.uwetrottmann.trakt5.entities.Show component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.uwetrottmann.trakt5.entities.Show getShow() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktTools2$ServiceResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "AUTH_ERROR", "API_ERROR", "app_pureDebug"})
    public static enum ServiceResult {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ AUTH_ERROR /* = new AUTH_ERROR() */,
        /*public static final*/ API_ERROR /* = new API_ERROR() */;
        
        ServiceResult() {
        }
    }
}