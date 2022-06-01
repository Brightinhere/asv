package com.battlelancer.seriesguide.shows.tools;

import java.lang.System;

/**
 * Updates show data from the show data source.
 * If updating a single show, should supply its row ID.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/ShowSync;", "", "syncType", "Lcom/battlelancer/seriesguide/sync/SyncOptions$SyncType;", "singleShowId", "", "(Lcom/battlelancer/seriesguide/sync/SyncOptions$SyncType;J)V", "hasUpdatedShows", "", "isSyncMultiple", "()Z", "getShowsToDeltaUpdate", "", "context", "Landroid/content/Context;", "currentTime", "getShowsToUpdate", "setImportantMessageIfNone", "", "progress", "Lcom/battlelancer/seriesguide/sync/SyncProgress;", "showId", "messageTemplate", "", "sync", "Lcom/battlelancer/seriesguide/sync/SgSyncAdapter$UpdateResult;", "Companion", "app_amazonDebug"})
public final class ShowSync {
    private final com.battlelancer.seriesguide.sync.SyncOptions.SyncType syncType = null;
    private final long singleShowId = 0L;
    private boolean hasUpdatedShows = false;
    private final boolean isSyncMultiple = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.tools.ShowSync.Companion Companion = null;
    private static final long UPDATE_THRESHOLD_WEEKLYS_MS = 561600000L;
    private static final long UPDATE_THRESHOLD_DAILYS_MS = 129600000L;
    
    public ShowSync(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.SyncOptions.SyncType syncType, long singleShowId) {
        super();
    }
    
    /**
     * Update shows based on the sync type. Returns
     *
     * - null if the given show ID is not found
     * - [SgSyncAdapter.UpdateResult.INCOMPLETE] if a show has failed to update or the update
     * process should be retried later
     * - [SgSyncAdapter.UpdateResult.SUCCESS] if all desired shows were updated
     *
     * Considers shows that no longer exist at the source to be updated.
     * On network errors retries a few times to update a show before failing.
     */
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"TimberExceptionLogging"})
    public final com.battlelancer.seriesguide.sync.SgSyncAdapter.UpdateResult sync(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long currentTime, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.SyncProgress progress) {
        return null;
    }
    
    private final void setImportantMessageIfNone(android.content.Context context, com.battlelancer.seriesguide.sync.SyncProgress progress, long showId, java.lang.String messageTemplate) {
    }
    
    /**
     * Returns an array of show ids to update.
     */
    private final java.util.List<java.lang.Long> getShowsToUpdate(android.content.Context context, long currentTime) {
        return null;
    }
    
    /**
     * Return list of show IDs that have not been updated for a certain time.
     */
    private final java.util.List<java.lang.Long> getShowsToDeltaUpdate(android.content.Context context, long currentTime) {
        return null;
    }
    
    public final boolean isSyncMultiple() {
        return false;
    }
    
    public final boolean hasUpdatedShows() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/ShowSync$Companion;", "", "()V", "UPDATE_THRESHOLD_DAILYS_MS", "", "UPDATE_THRESHOLD_WEEKLYS_MS", "shouldUpdateShow", "", "context", "Landroid/content/Context;", "showId", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Returns true if the given show has not been updated in the last 12 hours.
         */
        public final boolean shouldUpdateShow(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long showId) {
            return false;
        }
    }
}