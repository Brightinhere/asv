package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@androidx.room.Entity(tableName = "sg_episode", foreignKeys = {@androidx.room.ForeignKey(entity = com.battlelancer.seriesguide.shows.database.SgShow2.class, childColumns = {"series_id"}, parentColumns = {"_id"})}, indices = {@androidx.room.Index(value = {"season_id"}), @androidx.room.Index(value = {"series_id"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bR\b\u0087\b\u0018\u0000 f2\u00020\u0001:\u0001fB\u009f\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u00a2\u0006\u0002\u0010!J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0007H\u00c6\u0003J\t\u0010H\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\t\u0010L\u001a\u00020\u0015H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010T\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010U\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010V\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010[\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010\\\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010^\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u00b0\u0002\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010aJ\u0013\u0010b\u001a\u00020\u00152\b\u0010c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010d\u001a\u00020\u0007H\u00d6\u0001J\t\u0010e\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b8\u0010#R\u0011\u00109\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b:\u00105R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b;\u0010*R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b<\u0010#R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b=\u0010#R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\bB\u0010#R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\bC\u0010#R\u0016\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010(\u00a8\u0006g"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "", "id", "", "seasonId", "showId", "tmdbId", "", "tvdbId", "title", "", "overview", "number", "absoluteNumber", "season", "order", "dvdNumber", "", "watched", "plays", "collected", "", "directors", "guestStars", "writers", "image", "firstReleasedMs", "ratingGlobal", "ratingVotes", "ratingUser", "imdbId", "lastEditedSec", "lastUpdatedSec", "(JJJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;IILjava/lang/Double;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;JJ)V", "getAbsoluteNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCollected", "()Z", "getDirectors", "()Ljava/lang/String;", "getDvdNumber", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFirstReleasedMs", "()J", "getGuestStars", "getId", "getImage", "getImdbId", "getLastEditedSec", "getLastUpdatedSec", "getNumber", "()I", "getOrder", "getOverview", "getPlays", "playsOrZero", "getPlaysOrZero", "getRatingGlobal", "getRatingUser", "getRatingVotes", "getSeason", "getSeasonId", "getShowId", "getTitle", "getTmdbId", "getTvdbId", "getWatched", "getWriters", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;IILjava/lang/Double;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;JJ)Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "equals", "other", "hashCode", "toString", "Companion", "app_amazonDebug"})
public final class SgEpisode2 {
    @androidx.room.ColumnInfo(name = "_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "season_id")
    private final long seasonId = 0L;
    @androidx.room.ColumnInfo(name = "series_id")
    private final long showId = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_tmdb_id")
    private final java.lang.Integer tmdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_tvdb_id")
    private final java.lang.Integer tvdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_description")
    private final java.lang.String overview = null;
    @androidx.room.ColumnInfo(name = "episode_number")
    private final int number = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_absolute_number")
    private final java.lang.Integer absoluteNumber = null;
    @androidx.room.ColumnInfo(name = "episode_season_number")
    private final int season = 0;
    @androidx.room.ColumnInfo(name = "episode_order")
    private final int order = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_dvd_number")
    private final java.lang.Double dvdNumber = null;
    @androidx.room.ColumnInfo(name = "episode_watched")
    private final int watched = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_plays")
    private final java.lang.Integer plays = null;
    @androidx.room.ColumnInfo(name = "episode_collected")
    private final boolean collected = false;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_directors")
    private final java.lang.String directors = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_gueststars")
    private final java.lang.String guestStars = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_writers")
    private final java.lang.String writers = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_image")
    private final java.lang.String image = null;
    @androidx.room.ColumnInfo(name = "episode_firstairedms")
    private final long firstReleasedMs = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_rating")
    private final java.lang.Double ratingGlobal = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_rating_votes")
    private final java.lang.Integer ratingVotes = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_rating_user")
    private final java.lang.Integer ratingUser = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode_imdbid")
    private final java.lang.String imdbId = null;
    @androidx.room.ColumnInfo(name = "episode_lastedit")
    private final long lastEditedSec = 0L;
    @androidx.room.ColumnInfo(name = "episode_lastupdate")
    private final long lastUpdatedSec = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.database.SgEpisode2.Companion Companion = null;
    
    /**
     * See [com.battlelancer.seriesguide.provider.SeriesGuideContract.Episodes.FIRSTAIREDMS].
     */
    public static final int EPISODE_UNKNOWN_RELEASE = -1;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgEpisode2 copy(long id, long seasonId, long showId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, int number, @org.jetbrains.annotations.Nullable()
    java.lang.Integer absoluteNumber, int season, int order, @org.jetbrains.annotations.Nullable()
    java.lang.Double dvdNumber, int watched, @org.jetbrains.annotations.Nullable()
    java.lang.Integer plays, boolean collected, @org.jetbrains.annotations.Nullable()
    java.lang.String directors, @org.jetbrains.annotations.Nullable()
    java.lang.String guestStars, @org.jetbrains.annotations.Nullable()
    java.lang.String writers, @org.jetbrains.annotations.Nullable()
    java.lang.String image, long firstReleasedMs, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingGlobal, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVotes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingUser, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, long lastEditedSec, long lastUpdatedSec) {
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
    
    public SgEpisode2(long id, long seasonId, long showId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, int number, @org.jetbrains.annotations.Nullable()
    java.lang.Integer absoluteNumber, int season, int order, @org.jetbrains.annotations.Nullable()
    java.lang.Double dvdNumber, int watched, @org.jetbrains.annotations.Nullable()
    java.lang.Integer plays, boolean collected, @org.jetbrains.annotations.Nullable()
    java.lang.String directors, @org.jetbrains.annotations.Nullable()
    java.lang.String guestStars, @org.jetbrains.annotations.Nullable()
    java.lang.String writers, @org.jetbrains.annotations.Nullable()
    java.lang.String image, long firstReleasedMs, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingGlobal, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVotes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingUser, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, long lastEditedSec, long lastUpdatedSec) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTmdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTvdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAbsoluteNumber() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDvdNumber() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getWatched() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPlays() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getCollected() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirectors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGuestStars() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWriters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final long component20() {
        return 0L;
    }
    
    public final long getFirstReleasedMs() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRatingGlobal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingVotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final long component25() {
        return 0L;
    }
    
    public final long getLastEditedSec() {
        return 0L;
    }
    
    public final long component26() {
        return 0L;
    }
    
    public final long getLastUpdatedSec() {
        return 0L;
    }
    
    public final int getPlaysOrZero() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2$Companion;", "", "()V", "EPISODE_UNKNOWN_RELEASE", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}