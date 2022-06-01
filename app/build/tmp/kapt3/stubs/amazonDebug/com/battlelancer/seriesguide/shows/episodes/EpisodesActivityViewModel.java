package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

/**
 * Based on either an episode or a season id loads season and show info
 * as well as the list of episodes of that season.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "episodeTvdbId", "", "episodeRowId", "", "seasonRowId", "(Landroid/app/Application;IJJ)V", "seasonAndShowInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$EpisodeSeasonAndShowInfo;", "getSeasonAndShowInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "updateEpisodesData", "Lkotlinx/coroutines/Job;", "EpisodeSeasonAndShowInfo", "SeasonAndShowInfo", "SeasonInfo", "app_amazonDebug"})
public final class EpisodesActivityViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.EpisodeSeasonAndShowInfo> seasonAndShowInfoLiveData = null;
    
    public EpisodesActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int episodeTvdbId, long episodeRowId, long seasonRowId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.EpisodeSeasonAndShowInfo> getSeasonAndShowInfoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateEpisodesData(int episodeTvdbId, long episodeRowId, long seasonRowId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$SeasonInfo;", "", "seasonId", "", "seasonNumber", "", "showId", "(Ljava/lang/Long;Ljava/lang/Integer;J)V", "getSeasonId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSeasonNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowId", "()J", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;J)Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$SeasonInfo;", "equals", "", "other", "hashCode", "toString", "", "app_amazonDebug"})
    public static final class SeasonInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long seasonId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer seasonNumber = null;
        private final long showId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.SeasonInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.Long seasonId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer seasonNumber, long showId) {
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
        
        public SeasonInfo(@org.jetbrains.annotations.Nullable()
        java.lang.Long seasonId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer seasonNumber, long showId) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getSeasonId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSeasonNumber() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getShowId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$SeasonAndShowInfo;", "", "seasonId", "", "seasonNumber", "", "showId", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Minimal;", "(JIJLcom/battlelancer/seriesguide/shows/database/SgShow2Minimal;)V", "getSeasonId", "()J", "getSeasonNumber", "()I", "getShow", "()Lcom/battlelancer/seriesguide/shows/database/SgShow2Minimal;", "getShowId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_amazonDebug"})
    public static final class SeasonAndShowInfo {
        private final long seasonId = 0L;
        private final int seasonNumber = 0;
        private final long showId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.shows.database.SgShow2Minimal show = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.SeasonAndShowInfo copy(long seasonId, int seasonNumber, long showId, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgShow2Minimal show) {
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
        
        public SeasonAndShowInfo(long seasonId, int seasonNumber, long showId, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgShow2Minimal show) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getSeasonId() {
            return 0L;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getSeasonNumber() {
            return 0;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getShowId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.database.SgShow2Minimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.database.SgShow2Minimal getShow() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$EpisodeSeasonAndShowInfo;", "", "seasonAndShowInfo", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$SeasonAndShowInfo;", "startPosition", "", "episodes", "", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Numbers;", "(Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$SeasonAndShowInfo;ILjava/util/List;)V", "getEpisodes", "()Ljava/util/List;", "getSeasonAndShowInfo", "()Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$SeasonAndShowInfo;", "getStartPosition", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_amazonDebug"})
    public static final class EpisodeSeasonAndShowInfo {
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.SeasonAndShowInfo seasonAndShowInfo = null;
        private final int startPosition = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> episodes = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.EpisodeSeasonAndShowInfo copy(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.SeasonAndShowInfo seasonAndShowInfo, int startPosition, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> episodes) {
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
        
        public EpisodeSeasonAndShowInfo(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.SeasonAndShowInfo seasonAndShowInfo, int startPosition, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> episodes) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.SeasonAndShowInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.SeasonAndShowInfo getSeasonAndShowInfo() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getStartPosition() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getEpisodes() {
            return null;
        }
    }
}