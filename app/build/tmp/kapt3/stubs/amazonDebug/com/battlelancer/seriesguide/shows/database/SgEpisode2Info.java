package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0011H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u000eH\u00c6\u0003J\u0081\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0007H\u00d6\u0001J\t\u00105\u001a\u00020\tH\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015\u00a8\u00067"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Info;", "", "id", "", "seasonId", "showId", "episodeTvdbId", "", "title", "", "episodenumber", "absoluteNumber", "season", "dvdNumber", "", "watched", "collected", "", "firstReleasedMs", "(JJJILjava/lang/String;IIIDIZJ)V", "getAbsoluteNumber", "()I", "getCollected", "()Z", "getDvdNumber", "()D", "getEpisodeTvdbId", "getEpisodenumber", "getFirstReleasedMs", "()J", "getId", "getSeason", "getSeasonId", "getShowId", "getTitle", "()Ljava/lang/String;", "getWatched", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_amazonDebug"})
public final class SgEpisode2Info {
    @androidx.room.ColumnInfo(name = "_id")
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "season_id")
    private final long seasonId = 0L;
    @androidx.room.ColumnInfo(name = "series_id")
    private final long showId = 0L;
    @androidx.room.ColumnInfo(name = "episode_tvdb_id")
    private final int episodeTvdbId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "episode_title")
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "episode_number")
    private final int episodenumber = 0;
    @androidx.room.ColumnInfo(name = "episode_absolute_number")
    private final int absoluteNumber = 0;
    @androidx.room.ColumnInfo(name = "episode_season_number")
    private final int season = 0;
    @androidx.room.ColumnInfo(name = "episode_dvd_number")
    private final double dvdNumber = 0.0;
    @androidx.room.ColumnInfo(name = "episode_watched")
    private final int watched = 0;
    @androidx.room.ColumnInfo(name = "episode_collected")
    private final boolean collected = false;
    @androidx.room.ColumnInfo(name = "episode_firstairedms")
    private final long firstReleasedMs = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.database.SgEpisode2Info.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgEpisode2Info copy(long id, long seasonId, long showId, int episodeTvdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int episodenumber, int absoluteNumber, int season, double dvdNumber, int watched, boolean collected, long firstReleasedMs) {
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
    
    public SgEpisode2Info(long id, long seasonId, long showId, int episodeTvdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int episodenumber, int absoluteNumber, int season, double dvdNumber, int watched, boolean collected, long firstReleasedMs) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getSeasonId() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getShowId() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getEpisodeTvdbId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getEpisodenumber() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getAbsoluteNumber() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getDvdNumber() {
        return 0.0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getWatched() {
        return 0;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getCollected() {
        return false;
    }
    
    public final long component12() {
        return 0L;
    }
    
    public final long getFirstReleasedMs() {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Info$Companion;", "", "()V", "buildQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "seasonId", "", "order", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesSettings$EpisodeSorting;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Compile time validated using copy at [SgEpisode2Helper.dummyToValidateSgEpisode2Info].
         */
        @org.jetbrains.annotations.NotNull()
        public final androidx.sqlite.db.SimpleSQLiteQuery buildQuery(long seasonId, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.episodes.EpisodesSettings.EpisodeSorting order) {
            return null;
        }
    }
}