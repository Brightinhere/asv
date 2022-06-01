package com.battlelancer.seriesguide.provider;

import java.lang.System;

/**
 * Helper class for working with the SQLiteDatabase using SQLite APIs (before Room).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/provider/SqliteDatabaseTestHelper;", "", "()V", "insertEpisode", "", "episode", "Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestEpisode;", "showTvdbId", "", "seasonTvdbId", "seasonNumber", "db", "Landroid/database/sqlite/SQLiteDatabase;", "insertSeason", "season", "Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestSeason;", "insertShow", "show", "Lcom/battlelancer/seriesguide/provider/RoomDatabaseTestHelper$TestShow;", "app_pureDebug"})
public final class SqliteDatabaseTestHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.provider.SqliteDatabaseTestHelper INSTANCE = null;
    
    private SqliteDatabaseTestHelper() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestShow show, @org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertSeason(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestSeason season, @org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void insertEpisode(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.RoomDatabaseTestHelper.TestEpisode episode, int showTvdbId, int seasonTvdbId, int seasonNumber, @org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
}