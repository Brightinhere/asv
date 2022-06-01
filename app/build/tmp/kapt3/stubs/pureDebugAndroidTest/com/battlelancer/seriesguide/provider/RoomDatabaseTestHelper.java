package com.battlelancer.seriesguide.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper;", "", "()V", "insertEpisode", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "episode", "Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestEpisode;", "showTvdbId", "", "seasonTvdbId", "seasonNumber", "watched", "", "insertMovie", "movieDetails", "Lcom/battlelancer/seriesguide/movies/details/MovieDetails;", "insertSeason", "season", "Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestSeason;", "insertShow", "show", "Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestShow;", "TestEpisode", "TestSeason", "TestShow", "app_pureDebug"})
public final class RoomDatabaseTestHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper INSTANCE = null;
    
    private RoomDatabaseTestHelper() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestShow show, @org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertSeason(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestSeason season, @org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertEpisode(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestEpisode episode, int showTvdbId, int seasonTvdbId, int seasonNumber, @org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertEpisode(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestEpisode episode, int showTvdbId, int seasonTvdbId, int seasonNumber, boolean watched) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertMovie(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase db, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.details.MovieDetails movieDetails) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestShow;", "", "tvdbId", "", "title", "", "runtime", "poster", "nextEpisode", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getNextEpisode", "()Ljava/lang/String;", "getPoster", "getRuntime", "()I", "getTitle", "getTvdbId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toContentValuesDb48OrLower", "Landroid/content/ContentValues;", "toString", "app_pureDebug"})
    public static final class TestShow {
        private final int tvdbId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        private final int runtime = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String poster = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String nextEpisode = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestShow copy(int tvdbId, @org.jetbrains.annotations.NotNull()
        java.lang.String title, int runtime, @org.jetbrains.annotations.NotNull()
        java.lang.String poster, @org.jetbrains.annotations.NotNull()
        java.lang.String nextEpisode) {
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
        
        public TestShow(int tvdbId, @org.jetbrains.annotations.NotNull()
        java.lang.String title, int runtime, @org.jetbrains.annotations.NotNull()
        java.lang.String poster, @org.jetbrains.annotations.NotNull()
        java.lang.String nextEpisode) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTvdbId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getRuntime() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPoster() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNextEpisode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.ContentValues toContentValuesDb48OrLower() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestSeason;", "", "tvdbId", "", "showTvdbId", "", "number", "(ILjava/lang/String;I)V", "getNumber", "()I", "getShowTvdbId", "()Ljava/lang/String;", "getTvdbId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toContentValuesDb48OrLower", "Landroid/content/ContentValues;", "toString", "app_pureDebug"})
    public static final class TestSeason {
        private final int tvdbId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String showTvdbId = null;
        private final int number = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestSeason copy(int tvdbId, @org.jetbrains.annotations.NotNull()
        java.lang.String showTvdbId, int number) {
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
        
        public TestSeason(int tvdbId, @org.jetbrains.annotations.NotNull()
        java.lang.String showTvdbId, int number) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTvdbId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getShowTvdbId() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getNumber() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.ContentValues toContentValuesDb48OrLower() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestEpisode;", "", "tvdbId", "", "name", "", "number", "(ILjava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getNumber", "()I", "getTvdbId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toContentValuesDb48OrLower", "Landroid/content/ContentValues;", "seasonTvdbId", "showTvdbId", "seasonNumber", "releaseDateTime", "", "toString", "app_pureDebug"})
    public static final class TestEpisode {
        private final int tvdbId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final int number = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestEpisode copy(int tvdbId, @org.jetbrains.annotations.NotNull()
        java.lang.String name, int number) {
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
        
        public TestEpisode(int tvdbId, @org.jetbrains.annotations.NotNull()
        java.lang.String name, int number) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTvdbId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getNumber() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.ContentValues toContentValuesDb48OrLower(int seasonTvdbId, int showTvdbId, int seasonNumber, long releaseDateTime) {
            return null;
        }
    }
}