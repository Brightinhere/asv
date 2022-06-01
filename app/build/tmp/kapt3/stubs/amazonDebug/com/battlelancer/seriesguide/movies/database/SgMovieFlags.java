package com.battlelancer.seriesguide.movies.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/battlelancer/seriesguide/movies/database/SgMovieFlags;", "", "tmdbId", "", "inCollection", "", "inWatchlist", "watched", "plays", "(IZZZI)V", "getInCollection", "()Z", "getInWatchlist", "getPlays", "()I", "getTmdbId", "getWatched", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_amazonDebug"})
public final class SgMovieFlags {
    @androidx.room.ColumnInfo(name = "movies_tmdbid")
    private final int tmdbId = 0;
    @androidx.room.ColumnInfo(name = "movies_incollection")
    private final boolean inCollection = false;
    @androidx.room.ColumnInfo(name = "movies_inwatchlist")
    private final boolean inWatchlist = false;
    @androidx.room.ColumnInfo(name = "movies_watched")
    private final boolean watched = false;
    @androidx.room.ColumnInfo(name = "movies_plays")
    private final int plays = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.movies.database.SgMovieFlags copy(int tmdbId, boolean inCollection, boolean inWatchlist, boolean watched, int plays) {
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
    
    public SgMovieFlags() {
        super();
    }
    
    public SgMovieFlags(int tmdbId, boolean inCollection, boolean inWatchlist, boolean watched, int plays) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTmdbId() {
        return 0;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getInCollection() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getInWatchlist() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getWatched() {
        return false;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getPlays() {
        return 0;
    }
}