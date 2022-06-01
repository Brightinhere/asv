package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

/**
 * Note: using LEFT OUTER JOIN, so episode table values may be null!
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ^\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\'\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgShow2LastWatchedEpisode;", "", "id", "", "lastWatchedEpisodeId", "episodeNumber", "", "seasonNumber", "episodeReleaseDateMs", "episodeTitle", "", "episodePlays", "(JJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getEpisodeNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodePlays", "getEpisodeReleaseDateMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEpisodeTitle", "()Ljava/lang/String;", "getId", "()J", "getLastWatchedEpisodeId", "getSeasonNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/battlelancer/seriesguide/shows/database/SgShow2LastWatchedEpisode;", "equals", "", "other", "hashCode", "toString", "app_amazonDebug"})
public final class SgShow2LastWatchedEpisode {
    @androidx.room.ColumnInfo(name = "_id")
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "series_lastwatchedid")
    private final long lastWatchedEpisodeId = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_number")
    private final java.lang.Integer episodeNumber = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_season_number")
    private final java.lang.Integer seasonNumber = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_firstairedms")
    private final java.lang.Long episodeReleaseDateMs = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_title")
    private final java.lang.String episodeTitle = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_plays")
    private final java.lang.Integer episodePlays = null;
    
    /**
     * Note: using LEFT OUTER JOIN, so episode table values may be null!
     */
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgShow2LastWatchedEpisode copy(long id, long lastWatchedEpisodeId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodeNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seasonNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Long episodeReleaseDateMs, @org.jetbrains.annotations.Nullable()
    java.lang.String episodeTitle, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodePlays) {
        return null;
    }
    
    /**
     * Note: using LEFT OUTER JOIN, so episode table values may be null!
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Note: using LEFT OUTER JOIN, so episode table values may be null!
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Note: using LEFT OUTER JOIN, so episode table values may be null!
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SgShow2LastWatchedEpisode(long id, long lastWatchedEpisodeId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodeNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seasonNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Long episodeReleaseDateMs, @org.jetbrains.annotations.Nullable()
    java.lang.String episodeTitle, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodePlays) {
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
    
    public final long getLastWatchedEpisodeId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEpisodeNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSeasonNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEpisodeReleaseDateMs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEpisodeTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEpisodePlays() {
        return null;
    }
}