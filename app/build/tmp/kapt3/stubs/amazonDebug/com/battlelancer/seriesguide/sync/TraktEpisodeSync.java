package com.battlelancer.seriesguide.sync;

import java.lang.System;

/**
 * Downloads and uploads watched and collected episodes.
 *
 * [traktSync] may be null if not an initial sync, e.g. if calling [storeEpisodeFlags].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J6\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J(\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002J:\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J6\u0010\u001f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J4\u0010 \u001a\u00020\u00102\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ,\u0010#\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u001e2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0015\u001a\u00020\u0010J,\u0010&\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u001e2\b\u0010\'\u001a\u0004\u0018\u00010%2\u0006\u0010\u0015\u001a\u00020\u0010J.\u0010(\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J(\u0010*\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\n2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/battlelancer/seriesguide/sync/TraktEpisodeSync;", "", "context", "Landroid/content/Context;", "traktSync", "Lcom/uwetrottmann/trakt5/services/Sync;", "(Landroid/content/Context;Lcom/uwetrottmann/trakt5/services/Sync;)V", "buildSyncSeason", "Lcom/uwetrottmann/trakt5/entities/SyncSeason;", "seasonId", "", "seasonNumber", "", "flag", "Lcom/battlelancer/seriesguide/sync/TraktEpisodeSync$Flag;", "processCollectedTraktEpisodes", "", "traktSeason", "Lcom/uwetrottmann/trakt5/entities/BaseSeason;", "syncSeasons", "", "isInitialSync", "processTraktSeasons", "showRowId", "traktShow", "Lcom/uwetrottmann/trakt5/entities/BaseShow;", "processTraktShows", "remoteShows", "", "tmdbIdsToShowIds", "", "processWatchedTraktEpisodes", "storeEpisodeFlags", "tmdbIdsToTraktShow", "showTmdbId", "syncCollected", "collectedAt", "Lorg/threeten/bp/OffsetDateTime;", "syncWatched", "watchedAt", "upload", "showTraktId", "uploadShow", "showId", "Flag", "app_amazonDebug"})
public final class TraktEpisodeSync {
    private final android.content.Context context = null;
    private final com.uwetrottmann.trakt5.services.Sync traktSync = null;
    
    public TraktEpisodeSync(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.uwetrottmann.trakt5.services.Sync traktSync) {
        super();
    }
    
    /**
     * Similar to the sync methods, but does not download anything and only processes a single show.
     */
    public final boolean storeEpisodeFlags(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Integer, ? extends com.uwetrottmann.trakt5.entities.BaseShow> tmdbIdsToTraktShow, int showTmdbId, long showRowId, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.TraktEpisodeSync.Flag flag) {
        return false;
    }
    
    /**
     * Sets all episodes that are watched on Trakt and not watched locally as watched.
     * If [isInitialSync] will upload episodes watched locally that are not watched on
     * Trakt. If an episode has multiple plays, uploads it multiple times.
     * If false, sets episodes that are not watched on Trakt but watched locally
     * (and only those, e.g. no skipped episodes) as not watched.
     */
    public final boolean syncWatched(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Long> tmdbIdsToShowIds, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime watchedAt, boolean isInitialSync) {
        return false;
    }
    
    /**
     * Sets all episodes that are collected on Trakt and not collected locally as collected.
     * If [isInitialSync] will upload episodes collected locally that are not collected on
     * Trakt.
     * If false, sets episodes that are not collected on Trakt but collected locally
     * as not collected.
     */
    public final boolean syncCollected(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Long> tmdbIdsToShowIds, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime collectedAt, boolean isInitialSync) {
        return false;
    }
    
    private final boolean processTraktShows(java.util.List<? extends com.uwetrottmann.trakt5.entities.BaseShow> remoteShows, java.util.Map<java.lang.Integer, java.lang.Long> tmdbIdsToShowIds, com.battlelancer.seriesguide.sync.TraktEpisodeSync.Flag flag, boolean isInitialSync) {
        return false;
    }
    
    /**
     * Sync the watched/collected episodes of the given Trakt show with the local episodes. The
     * given show has to be watched/collected on Trakt.
     *
     * If [isInitialSync], will upload watched/collected episodes that are not
     * watched/collected on Trakt. If `false`, will set them not watched/collected (if not
     * skipped) to mirror the Trakt episode.
     */
    private final boolean processTraktSeasons(boolean isInitialSync, long showRowId, com.uwetrottmann.trakt5.entities.BaseShow traktShow, com.battlelancer.seriesguide.sync.TraktEpisodeSync.Flag flag) {
        return false;
    }
    
    private final boolean processWatchedTraktEpisodes(long seasonId, int seasonNumber, com.uwetrottmann.trakt5.entities.BaseSeason traktSeason, java.util.List<com.uwetrottmann.trakt5.entities.SyncSeason> syncSeasons, boolean isInitialSync) {
        return false;
    }
    
    private final boolean processCollectedTraktEpisodes(long seasonId, int seasonNumber, com.uwetrottmann.trakt5.entities.BaseSeason traktSeason, java.util.List<com.uwetrottmann.trakt5.entities.SyncSeason> syncSeasons, boolean isInitialSync) {
        return false;
    }
    
    /**
     * Uploads all watched/collected episodes for the given show to Trakt.
     */
    private final boolean uploadShow(com.uwetrottmann.trakt5.services.Sync traktSync, long showId, int showTraktId, com.battlelancer.seriesguide.sync.TraktEpisodeSync.Flag flag) {
        return false;
    }
    
    /**
     * Uploads all the given watched/collected episodes of the given show to Trakt.
     *
     * @return Any of the [TraktTools] result codes.
     */
    private final boolean upload(com.uwetrottmann.trakt5.services.Sync traktSync, int showTraktId, java.util.List<? extends com.uwetrottmann.trakt5.entities.SyncSeason> syncSeasons, com.battlelancer.seriesguide.sync.TraktEpisodeSync.Flag flag) {
        return false;
    }
    
    /**
     * Returns watched/collected episodes of the given season for uploading.
     * Returns `null` if no episodes of that season are watched or collected.
     */
    private final com.uwetrottmann.trakt5.entities.SyncSeason buildSyncSeason(long seasonId, int seasonNumber, com.battlelancer.seriesguide.sync.TraktEpisodeSync.Flag flag) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/sync/TraktEpisodeSync$Flag;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "COLLECTED", "WATCHED", "app_amazonDebug"})
    public static enum Flag {
        /*public static final*/ COLLECTED /* = new COLLECTED(null) */,
        /*public static final*/ WATCHED /* = new WATCHED(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        
        Flag(java.lang.String id) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
    }
}