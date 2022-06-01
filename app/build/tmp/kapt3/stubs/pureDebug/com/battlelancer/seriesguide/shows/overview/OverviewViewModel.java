package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0003J\u0015\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010 R#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001b\u0010\u000b\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/OverviewViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "showId", "", "application", "Landroid/app/Application;", "(JLandroid/app/Application;)V", "episode", "Landroidx/lifecycle/LiveData;", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "getEpisode", "()Landroidx/lifecycle/LiveData;", "episode$delegate", "Lkotlin/Lazy;", "episodeId", "Landroidx/lifecycle/MutableLiveData;", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "getShow", "show$delegate", "showTmdbId", "", "watchInfoMediator", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/battlelancer/seriesguide/streaming/StreamingSearch$WatchInfo;", "watchProvider", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2$WatchInfo;", "getWatchProvider", "watchProvider$delegate", "setEpisodeId", "", "setShowTmdbId", "(Ljava/lang/Integer;)V", "app_pureDebug"})
public final class OverviewViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy show$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> episodeId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy episode$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> showTmdbId = null;
    private final androidx.lifecycle.MediatorLiveData<com.battlelancer.seriesguide.streaming.StreamingSearch.WatchInfo> watchInfoMediator = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy watchProvider$delegate = null;
    
    public OverviewViewModel(long showId, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgShow2> getShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgEpisode2> getEpisode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo> getWatchProvider() {
        return null;
    }
    
    public final void setEpisodeId(long episodeId) {
    }
    
    public final void setShowTmdbId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer showTmdbId) {
    }
}