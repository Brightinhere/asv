package com.battlelancer.seriesguide.movies.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/movies/details/MovieDetailsModel;", "Landroidx/lifecycle/AndroidViewModel;", "movieTmdbId", "", "application", "Landroid/app/Application;", "(ILandroid/app/Application;)V", "credits", "Landroidx/lifecycle/LiveData;", "Lcom/uwetrottmann/tmdb2/entities/Credits;", "getCredits", "()Landroidx/lifecycle/LiveData;", "watchInfoMediator", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/battlelancer/seriesguide/streaming/StreamingSearch$WatchInfo;", "watchProvider", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2$WatchInfo;", "getWatchProvider", "watchProvider$delegate", "Lkotlin/Lazy;", "app_pureDebug"})
public final class MovieDetailsModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.battlelancer.seriesguide.streaming.StreamingSearch.WatchInfo> watchInfoMediator = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy watchProvider$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.uwetrottmann.tmdb2.entities.Credits> credits = null;
    
    public MovieDetailsModel(int movieTmdbId, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo> getWatchProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.uwetrottmann.tmdb2.entities.Credits> getCredits() {
        return null;
    }
}