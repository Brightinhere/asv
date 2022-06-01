package com.battlelancer.seriesguide.lists.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\bD\b\u0086\b\u0018\u0000 W2\u00020\u0001:\u0001WB\u00b7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\b\u00a2\u0006\u0002\u0010\u001aJ\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010,J\t\u0010C\u001a\u00020\u0014H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\bH\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\bH\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\u00e8\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020\u00142\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020\bH\u00d6\u0001J\t\u0010V\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b2\u0010,R\u0011\u00103\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b4\u00100R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b6\u0010,R\u0011\u00107\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b8\u00100R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0016\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00100\u00a8\u0006X"}, d2 = {"Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "", "id", "", "listItemId", "", "listId", "type", "", "itemRefId", "showId", "releaseTime", "nextText", "nextAirdateMs", "title", "titleNoArticle", "posterSmall", "network", "status", "favorite", "", "releaseWeekDay", "releaseTimeZone", "releaseCountry", "lastWatchedMs", "unwatchedCount", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Integer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JI)V", "getFavorite", "()Z", "setFavorite", "(Z)V", "getId", "()J", "getItemRefId", "()Ljava/lang/String;", "getLastWatchedMs", "getListId", "getListItemId", "getNetwork", "getNextAirdateMs", "getNextText", "getPosterSmall", "getReleaseCountry", "getReleaseTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "releaseTimeOrDefault", "getReleaseTimeOrDefault", "()I", "getReleaseTimeZone", "getReleaseWeekDay", "releaseWeekDayOrDefault", "getReleaseWeekDayOrDefault", "getShowId", "getStatus", "statusOrUnknown", "getStatusOrUnknown", "getTitle", "getTitleNoArticle", "getType", "getUnwatchedCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Integer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JI)Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "equals", "other", "hashCode", "toString", "Companion", "app_amazonDebug"})
public final class SgListItemWithDetails {
    @androidx.room.ColumnInfo(name = "_id")
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "list_item_id")
    private final java.lang.String listItemId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "list_id")
    private final java.lang.String listId = null;
    @androidx.room.ColumnInfo(name = "item_type")
    private final int type = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "item_ref_id")
    private final java.lang.String itemRefId = null;
    @androidx.room.ColumnInfo(name = "series_id")
    private final long showId = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_airstime")
    private final java.lang.Integer releaseTime = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_nexttext")
    private final java.lang.String nextText = null;
    @androidx.room.ColumnInfo(name = "series_nextairdate")
    private final long nextAirdateMs = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "series_title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_title_noarticle")
    private final java.lang.String titleNoArticle = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_poster_small")
    private final java.lang.String posterSmall = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_network")
    private final java.lang.String network = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_status")
    private final java.lang.Integer status = null;
    @androidx.room.ColumnInfo(name = "series_favorite")
    private boolean favorite;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_airsdayofweek")
    private final java.lang.Integer releaseWeekDay = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_timezone")
    private final java.lang.String releaseTimeZone = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_country")
    private final java.lang.String releaseCountry = null;
    @androidx.room.ColumnInfo(name = "series_lastwatched_ms")
    private final long lastWatchedMs = 0L;
    @androidx.room.ColumnInfo(name = "series_unwatched_count")
    private final int unwatchedCount = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.lists.database.SgListItemWithDetails.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT = "SELECT _id,list_item_id,item_ref_id,item_type,series_id,series_title,series_poster_small,series_network,series_airstime,series_airsdayofweek,series_timezone,series_country,series_status,series_nexttext,series_nextairdate,series_favorite,series_unwatched_count";
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.lists.database.SgListItemWithDetails copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String listItemId, @org.jetbrains.annotations.NotNull()
    java.lang.String listId, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String itemRefId, long showId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseTime, @org.jetbrains.annotations.Nullable()
    java.lang.String nextText, long nextAirdateMs, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleNoArticle, @org.jetbrains.annotations.Nullable()
    java.lang.String posterSmall, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, boolean favorite, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseWeekDay, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseCountry, long lastWatchedMs, int unwatchedCount) {
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
    
    public SgListItemWithDetails(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String listItemId, @org.jetbrains.annotations.NotNull()
    java.lang.String listId, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String itemRefId, long showId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseTime, @org.jetbrains.annotations.Nullable()
    java.lang.String nextText, long nextAirdateMs, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleNoArticle, @org.jetbrains.annotations.Nullable()
    java.lang.String posterSmall, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, boolean favorite, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseWeekDay, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseCountry, long lastWatchedMs, int unwatchedCount) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getListItemId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getListId() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemRefId() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getShowId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReleaseTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNextText() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getNextAirdateMs() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleNoArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterSmall() {
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
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReleaseWeekDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseTimeZone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseCountry() {
        return null;
    }
    
    public final long component19() {
        return 0L;
    }
    
    public final long getLastWatchedMs() {
        return 0L;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getUnwatchedCount() {
        return 0;
    }
    
    public final int getReleaseTimeOrDefault() {
        return 0;
    }
    
    public final int getReleaseWeekDayOrDefault() {
        return 0;
    }
    
    public final int getStatusOrUnknown() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails$Companion;", "", "()V", "SELECT", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}