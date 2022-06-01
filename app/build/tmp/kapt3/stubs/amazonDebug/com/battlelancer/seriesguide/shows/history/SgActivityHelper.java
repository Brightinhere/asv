package com.battlelancer.seriesguide.shows.history;

import java.lang.System;

/**
 * Helper methods for adding or removing local episode watch activity.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/shows/history/SgActivityHelper;", "", "deleteActivity", "", "episodeStableId", "", "type", "deleteOldActivity", "deleteOlderThanMs", "", "getActivityByLatest", "", "Lcom/battlelancer/seriesguide/shows/history/SgActivity;", "insertActivity", "", "activity", "Companion", "app_amazonDebug"})
public abstract interface SgActivityHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.history.SgActivityHelper.Companion Companion = null;
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertActivity(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.history.SgActivity activity);
    
    @androidx.room.Query(value = "DELETE FROM activity WHERE activity_time < :deleteOlderThanMs")
    public abstract int deleteOldActivity(long deleteOlderThanMs);
    
    @androidx.room.Query(value = "DELETE FROM activity WHERE activity_episode = :episodeStableId AND activity_type = :type")
    public abstract int deleteActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String episodeStableId, int type);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM activity ORDER BY activity_time DESC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.history.SgActivity> getActivityByLatest();
    
    /**
     * Adds an activity entry for the given episode with the current time as timestamp.
     * If an entry already exists it is replaced.
     *
     * Also cleans up old entries.
     */
    @kotlin.jvm.JvmStatic()
    public static void addActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long episodeId, long showId) {
    }
    
    /**
     * Tries to remove any activity with the given episode id.
     */
    @kotlin.jvm.JvmStatic()
    public static void removeActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long episodeId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/history/SgActivityHelper$Companion;", "", "()V", "HISTORY_THRESHOLD", "", "addActivity", "", "context", "Landroid/content/Context;", "episodeId", "showId", "removeActivity", "app_amazonDebug"})
    public static final class Companion {
        private static final long HISTORY_THRESHOLD = 2592000000L;
        
        private Companion() {
            super();
        }
        
        /**
         * Adds an activity entry for the given episode with the current time as timestamp.
         * If an entry already exists it is replaced.
         *
         * Also cleans up old entries.
         */
        @kotlin.jvm.JvmStatic()
        public final void addActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long episodeId, long showId) {
        }
        
        /**
         * Tries to remove any activity with the given episode id.
         */
        @kotlin.jvm.JvmStatic()
        public final void removeActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long episodeId) {
        }
    }
}