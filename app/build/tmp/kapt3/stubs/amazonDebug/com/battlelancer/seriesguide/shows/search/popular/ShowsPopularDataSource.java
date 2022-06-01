package com.battlelancer.seriesguide.shows.search.popular;

import java.lang.System;

/**
 * Loads popular shows in pages from TMDB.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J#\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/popular/ShowsPopularDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "context", "Landroid/content/Context;", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "languageCode", "", "watchProviderIds", "", "watchRegion", "(Landroid/content/Context;Lcom/uwetrottmann/tmdb2/Tmdb;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "buildResultGenericFailure", "Landroidx/paging/PagingSource$LoadResult$Error;", "buildResultOffline", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_amazonDebug"})
public final class ShowsPopularDataSource extends androidx.paging.PagingSource<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> {
    private final android.content.Context context = null;
    private final com.uwetrottmann.tmdb2.Tmdb tmdb = null;
    private final java.lang.String languageCode = null;
    private final java.util.List<java.lang.Integer> watchProviderIds = null;
    private final java.lang.String watchRegion = null;
    
    public ShowsPopularDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> watchProviderIds, @org.jetbrains.annotations.Nullable()
    java.lang.String watchRegion) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult>> continuation) {
        return null;
    }
    
    private final androidx.paging.PagingSource.LoadResult.Error<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> buildResultGenericFailure() {
        return null;
    }
    
    private final androidx.paging.PagingSource.LoadResult.Error<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> buildResultOffline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> state) {
        return null;
    }
}