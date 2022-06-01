package com.battlelancer.seriesguide.provider;

import java.lang.System;

@androidx.room.Database(entities = {com.battlelancer.seriesguide.shows.database.SgShow.class, com.battlelancer.seriesguide.shows.database.SgSeason.class, com.battlelancer.seriesguide.shows.database.SgEpisode.class, com.battlelancer.seriesguide.shows.database.SgShow2.class, com.battlelancer.seriesguide.shows.database.SgSeason2.class, com.battlelancer.seriesguide.shows.database.SgEpisode2.class, com.battlelancer.seriesguide.lists.database.SgList.class, com.battlelancer.seriesguide.lists.database.SgListItem.class, com.battlelancer.seriesguide.movies.database.SgMovie.class, com.battlelancer.seriesguide.shows.history.SgActivity.class, com.battlelancer.seriesguide.jobs.SgJob.class, com.battlelancer.seriesguide.streaming.SgWatchProvider.class}, version = 50)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/provider/SgRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieHelper", "Lcom/battlelancer/seriesguide/movies/database/MovieHelper;", "sgActivityHelper", "Lcom/battlelancer/seriesguide/shows/history/SgActivityHelper;", "sgEpisode2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Helper;", "sgListHelper", "Lcom/battlelancer/seriesguide/lists/database/SgListHelper;", "sgSeason2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2Helper;", "sgShow2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Helper;", "sgWatchProviderHelper", "Lcom/battlelancer/seriesguide/streaming/SgWatchProviderHelper;", "Companion", "SgRoomCallback", "app_amazonDebug"})
public abstract class SgRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.provider.SgRoomDatabase.Companion Companion = null;
    public static final int VERSION_43_ROOM = 43;
    public static final int VERSION_44_RECREATE_SERIES_EPISODES = 44;
    public static final int VERSION_45_RECREATE_SEASONS = 45;
    public static final int VERSION_46_SERIES_SLUG = 46;
    public static final int VERSION_47_SERIES_POSTER_THUMB = 47;
    public static final int VERSION_48_EPISODE_PLAYS = 48;
    
    /**
     * Shows, seasons and episodes now use auto-generated row IDs,
     * a TMDB ID column is introduced. Also renames some columns for consistency.
     *
     * Also adds new activity table column modifies its index.
     */
    public static final int VERSION_49_AUTO_ID_MIGRATION = 49;
    
    /**
     * Added [SgWatchProvider] table.
     */
    public static final int VERSION_50_WATCH_PROVIDERS = 50;
    public static final int VERSION = 50;
    @kotlin.jvm.Volatile()
    private static volatile com.battlelancer.seriesguide.provider.SgRoomDatabase instance;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_49_50 = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_48_49 = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_47_48 = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_46_47 = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_45_46 = null;
    
    /**
     * Recreates seasons table to pass migration validation which failed due to
     * columns with unexpected types likely due to using legacy backup tool.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_44_45 = null;
    
    /**
     * Quick path from pre-Room, skips actors column check.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_42_44 = null;
    
    /**
     * Recreates series and episodes tables to pass migration validation which failed due to
     * left over columns and columns that have changed types from pre-Room.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_43_44 = null;
    
    /**
     * Migrates from pre-Room to Room.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.room.migration.Migration MIGRATION_42_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_41_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_40_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_39_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_38_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_37_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_36_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_35_43 = null;
    private static final androidx.room.migration.Migration MIGRATION_34_43 = null;
    
    public SgRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.shows.database.SgShow2Helper sgShow2Helper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.shows.database.SgSeason2Helper sgSeason2Helper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.shows.database.SgEpisode2Helper sgEpisode2Helper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.shows.history.SgActivityHelper sgActivityHelper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.lists.database.SgListHelper sgListHelper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.movies.database.MovieHelper movieHelper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.streaming.SgWatchProviderHelper sgWatchProviderHelper();
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.provider.SgRoomDatabase getInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Changes the instance to an in memory database for content provider unit testing.
     */
    @androidx.annotation.VisibleForTesting()
    @kotlin.jvm.JvmStatic()
    public static final void switchToInMemory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0016\u0010\u0002\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/provider/SgRoomDatabase$SgRoomCallback;", "Landroidx/room/RoomDatabase$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "kotlin.jvm.PlatformType", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_amazonDebug"})
    public static final class SgRoomCallback extends androidx.room.RoomDatabase.Callback {
        private final android.content.Context context = null;
        
        public SgRoomCallback(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/battlelancer/seriesguide/provider/SgRoomDatabase$Companion;", "", "()V", "MIGRATION_34_43", "Landroidx/room/migration/Migration;", "MIGRATION_35_43", "MIGRATION_36_43", "MIGRATION_37_43", "MIGRATION_38_43", "MIGRATION_39_43", "MIGRATION_40_43", "MIGRATION_41_43", "MIGRATION_42_43", "MIGRATION_42_44", "MIGRATION_43_44", "MIGRATION_44_45", "MIGRATION_45_46", "MIGRATION_46_47", "MIGRATION_47_48", "MIGRATION_48_49", "MIGRATION_49_50", "VERSION", "", "VERSION_43_ROOM", "VERSION_44_RECREATE_SERIES_EPISODES", "VERSION_45_RECREATE_SEASONS", "VERSION_46_SERIES_SLUG", "VERSION_47_SERIES_POSTER_THUMB", "VERSION_48_EPISODE_PLAYS", "VERSION_49_AUTO_ID_MIGRATION", "VERSION_50_WATCH_PROVIDERS", "instance", "Lcom/battlelancer/seriesguide/provider/SgRoomDatabase;", "getInstance", "context", "Landroid/content/Context;", "switchToInMemory", "", "SeasonIds", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.provider.SgRoomDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Changes the instance to an in memory database for content provider unit testing.
         */
        @androidx.annotation.VisibleForTesting()
        @kotlin.jvm.JvmStatic()
        public final void switchToInMemory(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/provider/SgRoomDatabase$Companion$SeasonIds;", "", "seasonId", "", "showId", "seasonTvdbId", "(III)V", "getSeasonId", "()I", "getSeasonTvdbId", "getShowId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_amazonDebug"})
        public static final class SeasonIds {
            private final int seasonId = 0;
            private final int showId = 0;
            private final int seasonTvdbId = 0;
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.provider.SgRoomDatabase.Companion.SeasonIds copy(int seasonId, int showId, int seasonTvdbId) {
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
            
            public SeasonIds(int seasonId, int showId, int seasonTvdbId) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getSeasonId() {
                return 0;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getShowId() {
                return 0;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getSeasonTvdbId() {
                return 0;
            }
        }
    }
}