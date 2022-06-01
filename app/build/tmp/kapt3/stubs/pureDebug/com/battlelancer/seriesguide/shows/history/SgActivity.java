package com.battlelancer.seriesguide.shows.history;

import java.lang.System;

/**
 * Note: ensure to use CONFLICT_REPLACE when inserting to mimic SQLite UNIQUE x ON CONFLICT REPLACE.
 */
@androidx.room.Entity(tableName = "activity", indices = {@androidx.room.Index(unique = true, value = {"activity_episode", "activity_type"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003JB\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/shows/history/SgActivity;", "", "id", "", "episodeTvdbOrTmdbId", "", "showTvdbOrTmdbId", "timestampMs", "activity_type", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JI)V", "getActivity_type", "()I", "getEpisodeTvdbOrTmdbId", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShowTvdbOrTmdbId", "getTimestampMs", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JI)Lcom/battlelancer/seriesguide/shows/history/SgActivity;", "equals", "", "other", "hashCode", "toString", "app_pureDebug"})
public final class SgActivity {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Long id = null;
    
    /**
     * Unique string identifier.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "activity_episode")
    private final java.lang.String episodeTvdbOrTmdbId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "activity_show")
    private final java.lang.String showTvdbOrTmdbId = null;
    @androidx.room.ColumnInfo(name = "activity_time")
    private final long timestampMs = 0L;
    
    /**
     * One of [ActivityType].
     */
    private final int activity_type = 0;
    
    /**
     * Note: ensure to use CONFLICT_REPLACE when inserting to mimic SQLite UNIQUE x ON CONFLICT REPLACE.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.history.SgActivity copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String episodeTvdbOrTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String showTvdbOrTmdbId, long timestampMs, int activity_type) {
        return null;
    }
    
    /**
     * Note: ensure to use CONFLICT_REPLACE when inserting to mimic SQLite UNIQUE x ON CONFLICT REPLACE.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Note: ensure to use CONFLICT_REPLACE when inserting to mimic SQLite UNIQUE x ON CONFLICT REPLACE.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Note: ensure to use CONFLICT_REPLACE when inserting to mimic SQLite UNIQUE x ON CONFLICT REPLACE.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SgActivity(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String episodeTvdbOrTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String showTvdbOrTmdbId, long timestampMs, int activity_type) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    /**
     * Unique string identifier.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Unique string identifier.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEpisodeTvdbOrTmdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShowTvdbOrTmdbId() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getTimestampMs() {
        return 0L;
    }
    
    /**
     * One of [ActivityType].
     */
    public final int component5() {
        return 0;
    }
    
    /**
     * One of [ActivityType].
     */
    public final int getActivity_type() {
        return 0;
    }
}