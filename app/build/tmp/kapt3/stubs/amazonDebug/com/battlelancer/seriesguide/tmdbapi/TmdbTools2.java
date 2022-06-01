package com.battlelancer.seriesguide.tmdbapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001HB\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J#\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J3\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J+\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)JE\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000b2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J8\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u001e\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eJ,\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eJ \u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eJ1\u00104\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$JC\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00162\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0010\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;J+\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?J+\u0010@\u001a\u0004\u0018\u00010;2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?J#\u0010A\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020CH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ1\u0010E\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u001e2\u0006\u0010F\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006I"}, d2 = {"Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2;", "", "()V", "dateNow", "Lcom/uwetrottmann/tmdb2/entities/TmdbDate;", "getDateNow", "()Lcom/uwetrottmann/tmdb2/entities/TmdbDate;", "dateOneWeekAgo", "getDateOneWeekAgo", "findShowTmdbId", "Lcom/github/michaelbull/result/Result;", "", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbError;", "context", "Landroid/content/Context;", "showTvdbId", "getCreditsForMovie", "Lcom/uwetrottmann/tmdb2/entities/Credits;", "tmdbId", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreditsForShow", "getImdbIdForEpisode", "", "tvEpisodesService", "Lcom/uwetrottmann/tmdb2/services/TvEpisodesService;", "showTmdbId", "seasonNumber", "episodeNumber", "(Lcom/uwetrottmann/tmdb2/services/TvEpisodesService;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieWatchProviders", "", "Lcom/uwetrottmann/tmdb2/entities/WatchProviders$WatchProvider;", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "language", "watchRegion", "(Lcom/uwetrottmann/tmdb2/Tmdb;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPerson", "Lcom/uwetrottmann/tmdb2/entities/Person;", "peopleService", "Lcom/uwetrottmann/tmdb2/services/PeopleService;", "(Lcom/uwetrottmann/tmdb2/services/PeopleService;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularShows", "Lcom/uwetrottmann/tmdb2/entities/TvShowResultsPage;", "page", "watchProviderIds", "(Lcom/uwetrottmann/tmdb2/Tmdb;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeason", "Lcom/uwetrottmann/tmdb2/entities/TvEpisode;", "getShowAndExternalIds", "Lcom/uwetrottmann/tmdb2/entities/TvShow;", "getShowDetails", "getShowWatchProviders", "getShowsWithNewEpisodes", "Lcom/uwetrottmann/tmdb2/entities/BaseTvShow;", "(Lcom/uwetrottmann/tmdb2/Tmdb;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopWatchProvider", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2$WatchInfo;", "providers", "Lcom/uwetrottmann/tmdb2/entities/WatchProviders$CountryInfo;", "getWatchProvidersForMovie", "movieTmdbId", "region", "(ILjava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWatchProvidersForShow", "loadCreditsForShow", "showRowId", "", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchShows", "query", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WatchInfo", "app_amazonDebug"})
public final class TmdbTools2 {
    
    public TmdbTools2() {
        super();
    }
    
    /**
     * Tries to find the TMDB id for the given show's TheTVDB id. Returns null value if not found.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.github.michaelbull.result.Result<java.lang.Integer, com.battlelancer.seriesguide.tmdbapi.TmdbError> findShowTmdbId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int showTvdbId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.uwetrottmann.tmdb2.entities.TvShow getShowDetails(int showTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Returns null value if the show no longer exists (TMDB returned HTTP 404).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.github.michaelbull.result.Result<com.uwetrottmann.tmdb2.entities.TvShow, com.battlelancer.seriesguide.tmdbapi.TmdbError> getShowAndExternalIds(int showTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Returns null if network call fails.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchShows(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseTvShow>> continuation) {
        return null;
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateNow() {
        return null;
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateOneWeekAgo() {
        return null;
    }
    
    /**
     * Returns null if network call fails.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShowsWithNewEpisodes(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> watchProviderIds, @org.jetbrains.annotations.Nullable()
    java.lang.String watchRegion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseTvShow>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPopularShows(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb, @org.jetbrains.annotations.NotNull()
    java.lang.String language, int page, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> watchProviderIds, @org.jetbrains.annotations.Nullable()
    java.lang.String watchRegion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.uwetrottmann.tmdb2.entities.TvShowResultsPage> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShowWatchProviders(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String watchRegion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieWatchProviders(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String watchRegion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadCreditsForShow(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long showRowId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.uwetrottmann.tmdb2.entities.Credits> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreditsForShow(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int tmdbId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.uwetrottmann.tmdb2.entities.Credits> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreditsForMovie(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int tmdbId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.uwetrottmann.tmdb2.entities.Credits> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPerson(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.services.PeopleService peopleService, int tmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.uwetrottmann.tmdb2.entities.Person> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.michaelbull.result.Result<java.util.List<com.uwetrottmann.tmdb2.entities.TvEpisode>, com.battlelancer.seriesguide.tmdbapi.TmdbError> getSeason(int showTmdbId, int seasonNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo getTopWatchProvider(@org.jetbrains.annotations.Nullable()
    com.uwetrottmann.tmdb2.entities.WatchProviders.CountryInfo providers) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWatchProvidersForShow(int showTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String region, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.uwetrottmann.tmdb2.entities.WatchProviders.CountryInfo> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWatchProvidersForMovie(int movieTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String region, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.uwetrottmann.tmdb2.entities.WatchProviders.CountryInfo> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImdbIdForEpisode(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.services.TvEpisodesService tvEpisodesService, int showTmdbId, int seasonNumber, int episodeNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2$WatchInfo;", "", "url", "", "provider", "Lcom/uwetrottmann/tmdb2/entities/WatchProviders$WatchProvider;", "countMore", "", "(Ljava/lang/String;Lcom/uwetrottmann/tmdb2/entities/WatchProviders$WatchProvider;I)V", "getCountMore", "()I", "getProvider", "()Lcom/uwetrottmann/tmdb2/entities/WatchProviders$WatchProvider;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_amazonDebug"})
    public static final class WatchInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        @org.jetbrains.annotations.Nullable()
        private final com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider provider = null;
        private final int countMore = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider provider, int countMore) {
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
        
        public WatchInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider provider, int countMore) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider getProvider() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getCountMore() {
            return 0;
        }
    }
}