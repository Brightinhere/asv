package com.battlelancer.seriesguide.sync;

import java.lang.System;

/**
 * [AbstractThreadedSyncAdapter] which updates show and movie data and sends data to
 * or syncs with Trakt and Cloud.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0002)*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0002R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b\u00a8\u0006+"}, d2 = {"Lcom/battlelancer/seriesguide/sync/SgSyncAdapter;", "Landroid/content/AbstractThreadedSyncAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hexagonTools", "Ldagger/Lazy;", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "getHexagonTools", "()Ldagger/Lazy;", "setHexagonTools", "(Ldagger/Lazy;)V", "movieTools", "Lcom/battlelancer/seriesguide/movies/tools/MovieTools;", "getMovieTools", "setMovieTools", "tmdbConfigService", "Lcom/uwetrottmann/tmdb2/services/ConfigurationService;", "getTmdbConfigService", "setTmdbConfigService", "traktSync", "Lcom/uwetrottmann/trakt5/services/Sync;", "getTraktSync", "setTraktSync", "onPerformSync", "", "account", "Landroid/accounts/Account;", "extras", "Landroid/os/Bundle;", "authority", "", "provider", "Landroid/content/ContentProviderClient;", "syncResult", "Landroid/content/SyncResult;", "updateTimeAndFailedCounter", "prefs", "Landroid/content/SharedPreferences;", "resultCode", "Lcom/battlelancer/seriesguide/sync/SgSyncAdapter$UpdateResult;", "Companion", "UpdateResult", "app_pureDebug"})
public final class SgSyncAdapter extends android.content.AbstractThreadedSyncAdapter {
    @javax.inject.Inject()
    public dagger.Lazy<com.battlelancer.seriesguide.backend.HexagonTools> hexagonTools;
    @javax.inject.Inject()
    public dagger.Lazy<com.uwetrottmann.trakt5.services.Sync> traktSync;
    @javax.inject.Inject()
    public dagger.Lazy<com.battlelancer.seriesguide.movies.tools.MovieTools> movieTools;
    @javax.inject.Inject()
    public dagger.Lazy<com.uwetrottmann.tmdb2.services.ConfigurationService> tmdbConfigService;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.sync.SgSyncAdapter.Companion Companion = null;
    
    /**
     * Used when registering the SyncAdapter, see [AccountUtils.createAccount].
     */
    public static final int SYNC_INTERVAL_SECONDS = 86400;
    
    /**
     * Should never be outside 4-32 so back-off works as expected.
     */
    private static final int SYNC_INTERVAL_MINIMUM_MINUTES = 5;
    
    /**
     * One of [SyncType].
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SYNC_TYPE = "com.battlelancer.seriesguide.sync_type";
    
    /**
     * If [EXTRA_SYNC_TYPE] is [SyncType.SINGLE], the row id of the show
     * to sync.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SYNC_SHOW_ID = "com.battlelancer.seriesguide.sync_show";
    
    /**
     * Whether the sync should occur despite time or backoff limits.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SYNC_IMMEDIATE = "com.battlelancer.seriesguide.sync_immediate";
    
    public SgSyncAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.battlelancer.seriesguide.backend.HexagonTools> getHexagonTools() {
        return null;
    }
    
    public final void setHexagonTools(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.battlelancer.seriesguide.backend.HexagonTools> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.uwetrottmann.trakt5.services.Sync> getTraktSync() {
        return null;
    }
    
    public final void setTraktSync(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.uwetrottmann.trakt5.services.Sync> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.battlelancer.seriesguide.movies.tools.MovieTools> getMovieTools() {
        return null;
    }
    
    public final void setMovieTools(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.battlelancer.seriesguide.movies.tools.MovieTools> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.uwetrottmann.tmdb2.services.ConfigurationService> getTmdbConfigService() {
        return null;
    }
    
    public final void setTmdbConfigService(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.uwetrottmann.tmdb2.services.ConfigurationService> p0) {
    }
    
    @java.lang.Override()
    public void onPerformSync(@org.jetbrains.annotations.NotNull()
    android.accounts.Account account, @org.jetbrains.annotations.NotNull()
    android.os.Bundle extras, @org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    android.content.ContentProviderClient provider, @org.jetbrains.annotations.NotNull()
    android.content.SyncResult syncResult) {
    }
    
    private final void updateTimeAndFailedCounter(android.content.SharedPreferences prefs, com.battlelancer.seriesguide.sync.SgSyncAdapter.UpdateResult resultCode) {
    }
    
    /**
     * Calls [requestSyncIfConnected] if there is no pending sync.
     */
    @kotlin.jvm.JvmStatic()
    public static final void requestSyncIfTime(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Schedules a sync for a single show if [ShowSync.shouldUpdateShow] returns true.
     *
     * *Note: Runs a content provider op, so you should do this on a background thread.*
     */
    @kotlin.jvm.JvmStatic()
    public static final void requestSyncIfTime(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long showId) {
    }
    
    /**
     * @see .requestSyncDeltaImmediate
     */
    @kotlin.jvm.JvmStatic()
    public static final void requestSyncSingleImmediate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean showStatusToast, long showId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/sync/SgSyncAdapter$UpdateResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "INCOMPLETE", "app_pureDebug"})
    public static enum UpdateResult {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ INCOMPLETE /* = new INCOMPLETE() */;
        
        UpdateResult() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000bJ \u0010\u001a\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0012H\u0007J(\u0010\u001f\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ \u0010!\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0012H\u0007J\u0016\u0010\"\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/battlelancer/seriesguide/sync/SgSyncAdapter$Companion;", "", "()V", "EXTRA_SYNC_IMMEDIATE", "", "EXTRA_SYNC_SHOW_ID", "EXTRA_SYNC_TYPE", "SYNC_INTERVAL_MINIMUM_MINUTES", "", "SYNC_INTERVAL_SECONDS", "isSyncActive", "", "context", "Landroid/content/Context;", "isDisplayWarning", "isSyncAutomatically", "isTimeForSync", "currentTime", "", "requestSync", "", "args", "Landroid/os/Bundle;", "requestSyncDeltaImmediate", "showStatusToast", "requestSyncFullImmediate", "requestSyncIfConnected", "syncType", "Lcom/battlelancer/seriesguide/sync/SyncOptions$SyncType;", "showId", "requestSyncIfTime", "requestSyncImmediate", "requestSyncJobsImmediate", "requestSyncSingleImmediate", "setSyncAutomatically", "sync", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final boolean isTimeForSync(android.content.Context context, long currentTime) {
            return false;
        }
        
        /**
         * Calls [requestSyncIfConnected] if there is no pending sync.
         */
        @kotlin.jvm.JvmStatic()
        public final void requestSyncIfTime(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * Schedules a sync for a single show if [ShowSync.shouldUpdateShow] returns true.
         *
         * *Note: Runs a content provider op, so you should do this on a background thread.*
         */
        @kotlin.jvm.JvmStatic()
        public final void requestSyncIfTime(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long showId) {
        }
        
        /**
         * Schedules a sync. Will only queue a sync request if there is a network connection and
         * auto-sync is enabled.
         *
         * @param showId If using [SyncType.SINGLE], the row id of a show.
         */
        private final void requestSyncIfConnected(android.content.Context context, com.battlelancer.seriesguide.sync.SyncOptions.SyncType syncType, long showId) {
        }
        
        public final void requestSyncJobsImmediate(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * Schedules an immediate sync even if auto-sync is disabled, it runs as soon as there is a
         * connection.
         *
         * @param showStatusToast If set, shows a status toast and aborts if offline.
         */
        public final void requestSyncDeltaImmediate(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean showStatusToast) {
        }
        
        /**
         * @see .requestSyncDeltaImmediate
         */
        @kotlin.jvm.JvmStatic()
        public final void requestSyncSingleImmediate(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean showStatusToast, long showId) {
        }
        
        /**
         * @see .requestSyncDeltaImmediate
         */
        public final void requestSyncFullImmediate(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean showStatusToast) {
        }
        
        private final void requestSyncImmediate(android.content.Context context, com.battlelancer.seriesguide.sync.SyncOptions.SyncType syncType, long showId, boolean showStatusToast) {
        }
        
        /**
         * Schedules a sync with the given arguments.
         */
        private final void requestSync(android.content.Context context, android.os.Bundle args) {
        }
        
        /**
         * Returns true if there is currently a sync operation for the given account or authority in the
         * pending list, or actively being processed.
         */
        public final boolean isSyncActive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean isDisplayWarning) {
            return false;
        }
        
        /**
         * Check if the provider should be synced when a network tickle is received.
         */
        public final boolean isSyncAutomatically(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        /**
         * Set whether or not the provider is synced when it receives a network tickle.
         */
        public final void setSyncAutomatically(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean sync) {
        }
    }
}