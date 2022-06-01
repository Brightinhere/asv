package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@androidx.room.Entity(tableName = "sg_season", foreignKeys = {@androidx.room.ForeignKey(entity = com.battlelancer.seriesguide.shows.database.SgShow2.class, childColumns = {"series_id"}, parentColumns = {"_id"})}, indices = {@androidx.room.Index(value = {"series_id"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010/\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00104\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0098\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\bH\u00d6\u0001J\t\u0010?\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0018R\u001a\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0011\u0010\"\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0015R\u0011\u0010)\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b,\u0010\u001a\u00a8\u0006@"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "", "id", "", "showId", "tmdbId", "", "tvdbId", "", "numberOrNull", "name", "order", "notWatchedReleasedOrNull", "notWatchedToBeReleasedOrNull", "notWatchedNoReleaseOrNull", "totalOrNull", "tags", "(JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "notWatchedNoRelease", "getNotWatchedNoRelease", "()I", "getNotWatchedNoReleaseOrNull", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "notWatchedReleased", "getNotWatchedReleased", "getNotWatchedReleasedOrNull", "notWatchedToBeReleased", "getNotWatchedToBeReleased", "getNotWatchedToBeReleasedOrNull", "number", "getNumber", "getNumberOrNull", "getOrder", "getShowId", "getTags", "getTmdbId", "total", "getTotal", "getTotalOrNull", "getTvdbId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "equals", "", "other", "hashCode", "toString", "app_amazonDebug"})
public final class SgSeason2 {
    @androidx.room.ColumnInfo(name = "_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "series_id")
    private final long showId = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_tmdb_id")
    private final java.lang.String tmdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_tvdb_id")
    private final java.lang.Integer tvdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_number")
    private final java.lang.Integer numberOrNull = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_name")
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "season_order")
    private final int order = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_watchcount")
    private final java.lang.Integer notWatchedReleasedOrNull = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_willaircount")
    private final java.lang.Integer notWatchedToBeReleasedOrNull = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_noairdatecount")
    private final java.lang.Integer notWatchedNoReleaseOrNull = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_totalcount")
    private final java.lang.Integer totalOrNull = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season_tags")
    private final java.lang.String tags = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgSeason2 copy(long id, long showId, @org.jetbrains.annotations.Nullable()
    java.lang.String tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.String name, int order, @org.jetbrains.annotations.Nullable()
    java.lang.Integer notWatchedReleasedOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.Integer notWatchedToBeReleasedOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.Integer notWatchedNoReleaseOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.String tags) {
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
    
    public SgSeason2(long id, long showId, @org.jetbrains.annotations.Nullable()
    java.lang.String tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.String name, int order, @org.jetbrains.annotations.Nullable()
    java.lang.Integer notWatchedReleasedOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.Integer notWatchedToBeReleasedOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.Integer notWatchedNoReleaseOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalOrNull, @org.jetbrains.annotations.Nullable()
    java.lang.String tags) {
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
    
    public final long getShowId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTmdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTvdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumberOrNull() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNotWatchedReleasedOrNull() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNotWatchedToBeReleasedOrNull() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNotWatchedNoReleaseOrNull() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalOrNull() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTags() {
        return null;
    }
    
    public final int getNumber() {
        return 0;
    }
    
    public final int getNotWatchedReleased() {
        return 0;
    }
    
    public final int getNotWatchedToBeReleased() {
        return 0;
    }
    
    public final int getNotWatchedNoRelease() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
}