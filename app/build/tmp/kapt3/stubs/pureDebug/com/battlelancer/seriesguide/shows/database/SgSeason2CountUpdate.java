package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020\nH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgSeason2CountUpdate;", "", "id", "", "notWatchedReleasedCount", "", "notWatchedToBeReleasedCount", "notWatchedNoReleaseCount", "totalCount", "tags", "", "(JIIIILjava/lang/String;)V", "getId", "()J", "getNotWatchedNoReleaseCount", "()I", "getNotWatchedReleasedCount", "getNotWatchedToBeReleasedCount", "getTags", "()Ljava/lang/String;", "getTotalCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_pureDebug"})
public final class SgSeason2CountUpdate {
    @androidx.room.ColumnInfo(name = "_id")
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "season_watchcount")
    private final int notWatchedReleasedCount = 0;
    @androidx.room.ColumnInfo(name = "season_willaircount")
    private final int notWatchedToBeReleasedCount = 0;
    @androidx.room.ColumnInfo(name = "season_noairdatecount")
    private final int notWatchedNoReleaseCount = 0;
    @androidx.room.ColumnInfo(name = "season_totalcount")
    private final int totalCount = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "season_tags")
    private final java.lang.String tags = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgSeason2CountUpdate copy(long id, int notWatchedReleasedCount, int notWatchedToBeReleasedCount, int notWatchedNoReleaseCount, int totalCount, @org.jetbrains.annotations.NotNull()
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
    
    public SgSeason2CountUpdate(long id, int notWatchedReleasedCount, int notWatchedToBeReleasedCount, int notWatchedNoReleaseCount, int totalCount, @org.jetbrains.annotations.NotNull()
    java.lang.String tags) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getNotWatchedReleasedCount() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getNotWatchedToBeReleasedCount() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getNotWatchedNoReleaseCount() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTags() {
        return null;
    }
}