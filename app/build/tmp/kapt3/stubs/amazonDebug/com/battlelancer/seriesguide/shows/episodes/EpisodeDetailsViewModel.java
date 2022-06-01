package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u001fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u000b\u00a8\u0006 "}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodeDetailsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "episodeId", "", "application", "Landroid/app/Application;", "(JLandroid/app/Application;)V", "episode", "Landroidx/lifecycle/LiveData;", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "getEpisode", "()Landroidx/lifecycle/LiveData;", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "getShow", "showId", "Landroidx/lifecycle/MutableLiveData;", "getShowId", "()Landroidx/lifecycle/MutableLiveData;", "showTmdbId", "", "watchInfoMediator", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/battlelancer/seriesguide/streaming/StreamingSearch$WatchInfo;", "watchProvider", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2$WatchInfo;", "getWatchProvider", "watchProvider$delegate", "Lkotlin/Lazy;", "setShowTmdbId", "", "(Ljava/lang/Integer;)V", "app_amazonDebug"})
public final class EpisodeDetailsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgEpisode2> episode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> showId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgShow2> show = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> showTmdbId = null;
    private final androidx.lifecycle.MediatorLiveData<com.battlelancer.seriesguide.streaming.StreamingSearch.WatchInfo> watchInfoMediator = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy watchProvider$delegate = null;
    
    public EpisodeDetailsViewModel(long episodeId, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgEpisode2> getEpisode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getShowId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgShow2> getShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo> getWatchProvider() {
        return null;
    }
    
    public final void setShowTmdbId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer showTmdbId) {
    }
}