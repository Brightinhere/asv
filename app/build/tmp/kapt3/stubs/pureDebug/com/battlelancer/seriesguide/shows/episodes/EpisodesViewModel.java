package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019\u00a8\u0006\""}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "seasonId", "", "(Landroid/app/Application;J)V", "episodeCounts", "Landroidx/lifecycle/MutableLiveData;", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesViewModel$Counts;", "getEpisodeCounts", "()Landroidx/lifecycle/MutableLiveData;", "episodes", "Landroidx/lifecycle/LiveData;", "", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Info;", "kotlin.jvm.PlatformType", "getEpisodes", "()Landroidx/lifecycle/LiveData;", "order", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesSettings$EpisodeSorting;", "selectedItemId", "getSelectedItemId", "()J", "setSelectedItemId", "(J)V", "showId", "getShowId", "setShowId", "updateCounts", "Lkotlinx/coroutines/Job;", "updateOrder", "", "Counts", "app_pureDebug"})
public final class EpisodesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final long seasonId = 0L;
    private long showId = 0L;
    private final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.episodes.EpisodesSettings.EpisodeSorting> order = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Info>> episodes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.episodes.EpisodesViewModel.Counts> episodeCounts = null;
    private long selectedItemId = -1L;
    
    public EpisodesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, long seasonId) {
        super(null);
    }
    
    public final long getShowId() {
        return 0L;
    }
    
    public final void setShowId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Info>> getEpisodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.episodes.EpisodesViewModel.Counts> getEpisodeCounts() {
        return null;
    }
    
    public final long getSelectedItemId() {
        return 0L;
    }
    
    public final void setSelectedItemId(long p0) {
    }
    
    public final void updateOrder() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateCounts() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesViewModel$Counts;", "", "unwatchedEpisodes", "", "uncollectedEpisodes", "(II)V", "getUncollectedEpisodes", "()I", "getUnwatchedEpisodes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_pureDebug"})
    public static final class Counts {
        private final int unwatchedEpisodes = 0;
        private final int uncollectedEpisodes = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodesViewModel.Counts copy(int unwatchedEpisodes, int uncollectedEpisodes) {
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
        
        public Counts(int unwatchedEpisodes, int uncollectedEpisodes) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getUnwatchedEpisodes() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getUncollectedEpisodes() {
            return 0;
        }
    }
}