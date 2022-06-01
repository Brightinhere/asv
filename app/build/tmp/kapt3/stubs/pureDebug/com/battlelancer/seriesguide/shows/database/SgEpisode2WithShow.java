package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\fH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u007f\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0007H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017\u00a8\u00062"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;", "", "id", "", "episodetitle", "", "episodenumber", "", "season", "episode_firstairedms", "watched", "episode_collected", "", "overview", "seriestitle", "network", "series_poster_small", "(JLjava/lang/String;IIJIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEpisode_collected", "()Z", "getEpisode_firstairedms", "()J", "getEpisodenumber", "()I", "getEpisodetitle", "()Ljava/lang/String;", "getId", "getNetwork", "getOverview", "getSeason", "getSeries_poster_small", "getSeriestitle", "getWatched", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_pureDebug"})
public final class SgEpisode2WithShow {
    @androidx.room.ColumnInfo(name = "_id")
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_title")
    private final java.lang.String episodetitle = null;
    @androidx.room.ColumnInfo(name = "episode_number")
    private final int episodenumber = 0;
    @androidx.room.ColumnInfo(name = "episode_season_number")
    private final int season = 0;
    @androidx.room.ColumnInfo(name = "episode_firstairedms")
    private final long episode_firstairedms = 0L;
    @androidx.room.ColumnInfo(name = "episode_watched")
    private final int watched = 0;
    @androidx.room.ColumnInfo(name = "episode_collected")
    private final boolean episode_collected = false;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_description")
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "series_title")
    private final java.lang.String seriestitle = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_network")
    private final java.lang.String network = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_poster_small")
    private final java.lang.String series_poster_small = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT = "SELECT sg_episode._id, episode_title, episode_number, episode_season_number, episode_firstairedms, episode_watched, episode_collected, episode_description, series_title, series_network, series_poster_small FROM sg_episode LEFT OUTER JOIN sg_show ON sg_episode.series_id=sg_show._id";
    private static final long CALENDAR_DAY_LIMIT_MS = 2678400000L;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String episodetitle, int episodenumber, int season, long episode_firstairedms, int watched, boolean episode_collected, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    java.lang.String seriestitle, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.String series_poster_small) {
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
    
    public SgEpisode2WithShow(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String episodetitle, int episodenumber, int season, long episode_firstairedms, int watched, boolean episode_collected, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    java.lang.String seriestitle, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.String series_poster_small) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEpisodetitle() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getEpisodenumber() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getEpisode_firstairedms() {
        return 0L;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getWatched() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getEpisode_collected() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSeriestitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSeries_poster_small() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow$Companion;", "", "()V", "CALENDAR_DAY_LIMIT_MS", "", "SELECT", "", "buildEpisodesWithShowQuery", "context", "Landroid/content/Context;", "isUpcomingElseRecent", "", "isInfiniteCalendar", "isOnlyFavorites", "isOnlyUnwatched", "isOnlyCollected", "isOnlyPremieres", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * For use with [SgEpisode2Helper.getEpisodesWithShowDataSource].
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String buildEpisodesWithShowQuery(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean isUpcomingElseRecent, boolean isInfiniteCalendar, boolean isOnlyFavorites, boolean isOnlyUnwatched, boolean isOnlyCollected, boolean isOnlyPremieres) {
            return null;
        }
    }
}