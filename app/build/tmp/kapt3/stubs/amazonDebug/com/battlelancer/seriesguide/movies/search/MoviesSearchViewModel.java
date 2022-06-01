package com.battlelancer.seriesguide.movies.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/movies/search/MoviesSearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "link", "Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;", "(Landroid/app/Application;Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;)V", "items", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/uwetrottmann/tmdb2/entities/BaseMovie;", "getItems", "()Lkotlinx/coroutines/flow/Flow;", "queryString", "Landroidx/lifecycle/MutableLiveData;", "", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "watchProviderIds", "", "", "updateQuery", "", "query", "app_amazonDebug"})
public final class MoviesSearchViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.flow.Flow<java.util.List<java.lang.Integer>> watchProviderIds = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryString = null;
    private final com.uwetrottmann.tmdb2.Tmdb tmdb = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.uwetrottmann.tmdb2.entities.BaseMovie>> items = null;
    
    public MoviesSearchViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.MoviesDiscoverLink link) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.uwetrottmann.tmdb2.entities.BaseMovie>> getItems() {
        return null;
    }
    
    public final void updateQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
}