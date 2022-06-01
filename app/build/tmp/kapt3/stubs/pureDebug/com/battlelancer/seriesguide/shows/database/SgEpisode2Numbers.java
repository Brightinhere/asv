package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Numbers;", "", "id", "", "seasonId", "showId", "episodenumber", "", "season", "plays", "(JJJIII)V", "getEpisodenumber", "()I", "getId", "()J", "getPlays", "getSeason", "getSeasonId", "getShowId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_pureDebug"})
public final class SgEpisode2Numbers {
    @androidx.room.ColumnInfo(name = "_id")
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "season_id")
    private final long seasonId = 0L;
    @androidx.room.ColumnInfo(name = "series_id")
    private final long showId = 0L;
    @androidx.room.ColumnInfo(name = "episode_number")
    private final int episodenumber = 0;
    @androidx.room.ColumnInfo(name = "episode_season_number")
    private final int season = 0;
    @androidx.room.ColumnInfo(name = "episode_plays")
    private final int plays = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers copy(long id, long seasonId, long showId, int episodenumber, int season, int plays) {
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
    
    public SgEpisode2Numbers(long id, long seasonId, long showId, int episodenumber, int season, int plays) {
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
    
    public final int getEpisodenumber() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getPlays() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Numbers$Companion;", "", "()V", "buildQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "seasonId", "", "order", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesSettings$EpisodeSorting;", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Compile time validated using copy at [SgEpisode2Helper.getEpisodeNumbersOfSeason].
         */
        @org.jetbrains.annotations.NotNull()
        public final androidx.sqlite.db.SimpleSQLiteQuery buildQuery(long seasonId, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.episodes.EpisodesSettings.EpisodeSorting order) {
            return null;
        }
    }
}