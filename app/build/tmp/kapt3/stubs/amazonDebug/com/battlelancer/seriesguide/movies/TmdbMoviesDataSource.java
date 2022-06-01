package com.battlelancer.seriesguide.movies;

import java.lang.System;

/**
 * Loads movies from TMDb in chunks.
 *
 * If a query is given, will load search results for that query. Otherwise will load a list of
 * movies based on the given link.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002-.BO\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0011J6\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\u0002H\u0002J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"H\u0002J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"H\u0002J#\u0010$\u001a\u0004\u0018\u00010\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&H\u0016\u00a2\u0006\u0002\u0010\'J+\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/battlelancer/seriesguide/movies/TmdbMoviesDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/uwetrottmann/tmdb2/entities/BaseMovie;", "context", "Landroid/content/Context;", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "link", "Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;", "query", "", "languageCode", "regionCode", "watchProviderIds", "", "watchRegion", "(Landroid/content/Context;Lcom/uwetrottmann/tmdb2/Tmdb;Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "dateInOneMonth", "Lcom/uwetrottmann/tmdb2/entities/TmdbDate;", "getDateInOneMonth", "()Lcom/uwetrottmann/tmdb2/entities/TmdbDate;", "dateNow", "getDateNow", "dateOneMonthAgo", "getDateOneMonthAgo", "dateTomorrow", "getDateTomorrow", "buildMovieListCall", "Lkotlin/Pair;", "Lretrofit2/Call;", "Lcom/uwetrottmann/tmdb2/entities/MovieResultsPage;", "page", "buildResultGenericFailure", "Landroidx/paging/PagingSource$LoadResult$Error;", "buildResultOffline", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Page", "app_amazonDebug"})
public final class TmdbMoviesDataSource extends androidx.paging.PagingSource<java.lang.Integer, com.uwetrottmann.tmdb2.entities.BaseMovie> {
    private final android.content.Context context = null;
    private final com.uwetrottmann.tmdb2.Tmdb tmdb = null;
    private final com.battlelancer.seriesguide.movies.MoviesDiscoverLink link = null;
    private final java.lang.String query = null;
    private final java.lang.String languageCode = null;
    private final java.lang.String regionCode = null;
    private final java.util.List<java.lang.Integer> watchProviderIds = null;
    private final java.lang.String watchRegion = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.movies.TmdbMoviesDataSource.Companion Companion = null;
    
    public TmdbMoviesDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.MoviesDiscoverLink link, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String regionCode, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> watchProviderIds, @org.jetbrains.annotations.Nullable()
    java.lang.String watchRegion) {
        super();
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateNow() {
        return null;
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateOneMonthAgo() {
        return null;
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateTomorrow() {
        return null;
    }
    
    private final com.uwetrottmann.tmdb2.entities.TmdbDate getDateInOneMonth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.uwetrottmann.tmdb2.entities.BaseMovie>> continuation) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.String, retrofit2.Call<com.uwetrottmann.tmdb2.entities.MovieResultsPage>> buildMovieListCall(java.lang.String languageCode, java.lang.String regionCode, int page) {
        return null;
    }
    
    private final androidx.paging.PagingSource.LoadResult.Error<java.lang.Integer, com.uwetrottmann.tmdb2.entities.BaseMovie> buildResultGenericFailure() {
        return null;
    }
    
    private final androidx.paging.PagingSource.LoadResult.Error<java.lang.Integer, com.uwetrottmann.tmdb2.entities.BaseMovie> buildResultOffline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.uwetrottmann.tmdb2.entities.BaseMovie> state) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/movies/TmdbMoviesDataSource$Page;", "", "items", "", "Lcom/uwetrottmann/tmdb2/entities/BaseMovie;", "totalCount", "", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_amazonDebug"})
    public static final class Page {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.uwetrottmann.tmdb2.entities.BaseMovie> items = null;
        private final int totalCount = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.movies.TmdbMoviesDataSource.Page copy(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseMovie> items, int totalCount) {
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
        
        public Page(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseMovie> items, int totalCount) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.uwetrottmann.tmdb2.entities.BaseMovie> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.uwetrottmann.tmdb2.entities.BaseMovie> getItems() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getTotalCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/movies/TmdbMoviesDataSource$Companion;", "", "()V", "isLinkFilterable", "", "link", "Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isLinkFilterable(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.movies.MoviesDiscoverLink link) {
            return false;
        }
    }
}