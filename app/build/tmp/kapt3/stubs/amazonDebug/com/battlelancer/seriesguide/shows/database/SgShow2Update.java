package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00c9\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010?\u001a\u00020\u0014H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010E\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\t\u0010H\u001a\u00020\bH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u00fa\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010S\u001a\u00020\u0005H\u00d6\u0001J\t\u0010T\u001a\u00020\bH\u00d6\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001dR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b7\u00102R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b8\u00102\u00a8\u0006U"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgShow2Update;", "", "id", "", "tvdbId", "", "traktId", "title", "", "titleNoArticle", "overview", "releaseTime", "releaseWeekDay", "releaseCountry", "releaseTimeZone", "firstRelease", "genres", "network", "imdbId", "ratingGlobal", "", "ratingVotes", "runtime", "status", "poster", "posterSmall", "lastUpdatedMs", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;J)V", "getFirstRelease", "()Ljava/lang/String;", "getGenres", "getId", "()J", "setId", "(J)V", "getImdbId", "getLastUpdatedMs", "getNetwork", "getOverview", "getPoster", "getPosterSmall", "getRatingGlobal", "()D", "getRatingVotes", "()I", "getReleaseCountry", "getReleaseTime", "getReleaseTimeZone", "getReleaseWeekDay", "getRuntime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getTitle", "getTitleNoArticle", "getTraktId", "getTvdbId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;J)Lcom/battlelancer/seriesguide/shows/database/SgShow2Update;", "equals", "", "other", "hashCode", "toString", "app_amazonDebug"})
public final class SgShow2Update {
    @androidx.room.ColumnInfo(name = "_id")
    private long id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_tvdb_id")
    private final java.lang.Integer tvdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_trakt_id")
    private final java.lang.Integer traktId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "series_title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_title_noarticle")
    private final java.lang.String titleNoArticle = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_overview")
    private final java.lang.String overview = null;
    @androidx.room.ColumnInfo(name = "series_airstime")
    private final int releaseTime = 0;
    @androidx.room.ColumnInfo(name = "series_airsdayofweek")
    private final int releaseWeekDay = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_country")
    private final java.lang.String releaseCountry = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_timezone")
    private final java.lang.String releaseTimeZone = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_firstaired")
    private final java.lang.String firstRelease = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_genres")
    private final java.lang.String genres = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_network")
    private final java.lang.String network = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_imdbid")
    private final java.lang.String imdbId = null;
    @androidx.room.ColumnInfo(name = "series_rating")
    private final double ratingGlobal = 0.0;
    @androidx.room.ColumnInfo(name = "series_rating_votes")
    private final int ratingVotes = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_runtime")
    private final java.lang.Integer runtime = null;
    @androidx.room.ColumnInfo(name = "series_status")
    private final int status = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_poster")
    private final java.lang.String poster = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_poster_small")
    private final java.lang.String posterSmall = null;
    @androidx.room.ColumnInfo(name = "series_lastupdate")
    private final long lastUpdatedMs = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgShow2Update copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer traktId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleNoArticle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, int releaseTime, int releaseWeekDay, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseCountry, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String firstRelease, @org.jetbrains.annotations.Nullable()
    java.lang.String genres, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, double ratingGlobal, int ratingVotes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, int status, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.Nullable()
    java.lang.String posterSmall, long lastUpdatedMs) {
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
    
    public SgShow2Update(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer traktId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleNoArticle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, int releaseTime, int releaseWeekDay, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseCountry, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String firstRelease, @org.jetbrains.annotations.Nullable()
    java.lang.String genres, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, double ratingGlobal, int ratingVotes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, int status, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.Nullable()
    java.lang.String posterSmall, long lastUpdatedMs) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTvdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTraktId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleNoArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getReleaseTime() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getReleaseWeekDay() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseTimeZone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstRelease() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double getRatingGlobal() {
        return 0.0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getRatingVotes() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterSmall() {
        return null;
    }
    
    public final long component21() {
        return 0L;
    }
    
    public final long getLastUpdatedMs() {
        return 0L;
    }
}