package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003JN\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\t2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J\t\u0010)\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgShow2CloudUpdate;", "", "id", "", "tmdbId", "", "language", "", "favorite", "", "hidden", "notify", "(JLjava/lang/Integer;Ljava/lang/String;ZZZ)V", "getFavorite", "()Z", "setFavorite", "(Z)V", "getHidden", "setHidden", "getId", "()J", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "getNotify", "setNotify", "getTmdbId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Integer;Ljava/lang/String;ZZZ)Lcom/battlelancer/seriesguide/shows/database/SgShow2CloudUpdate;", "equals", "other", "hashCode", "toString", "app_pureDebug"})
public final class SgShow2CloudUpdate {
    @androidx.room.ColumnInfo(name = "_id")
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_tmdb_id")
    private final java.lang.Integer tmdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_language")
    private java.lang.String language;
    @androidx.room.ColumnInfo(name = "series_favorite")
    private boolean favorite;
    @androidx.room.ColumnInfo(name = "series_hidden")
    private boolean hidden;
    @androidx.room.ColumnInfo(name = "series_notify")
    private boolean notify;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgShow2CloudUpdate copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String language, boolean favorite, boolean hidden, boolean notify) {
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
    
    public SgShow2CloudUpdate(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String language, boolean favorite, boolean hidden, boolean notify) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTmdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getHidden() {
        return false;
    }
    
    public final void setHidden(boolean p0) {
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getNotify() {
        return false;
    }
    
    public final void setNotify(boolean p0) {
    }
}