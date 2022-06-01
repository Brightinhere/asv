package com.battlelancer.seriesguide.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006Jp\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002JF\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00182\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u001cj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013`\u001d2\u0006\u0010\u001e\u001a\u00020\u001aJj\u0010\u001f\u001a\u00020\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u001cj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013`\u001d2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u0018H\u0002Jz\u0010 \u001a\u00020\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u001cj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013`\u001d2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0015H\u0002J\u0019\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0014\u0010&\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010)\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/battlelancer/seriesguide/sync/HexagonShowSync;", "", "context", "Landroid/content/Context;", "hexagonTools", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/backend/HexagonTools;)V", "appendShowUpdates", "", "updates", "", "Lcom/battlelancer/seriesguide/shows/database/SgShow2CloudUpdate;", "toUpdate", "", "", "removed", "", "toAdd", "", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "shows", "", "Lcom/uwetrottmann/seriesguide/backend/shows/model/SgCloudShow;", "tmdbIdsToShowIds", "", "mergeValues", "", "download", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "hasMergedShows", "downloadLegacyShows", "downloadShows", "lastSyncTime", "Lcom/google/api/client/util/DateTime;", "mapLegacyShows", "legacyShows", "Lcom/uwetrottmann/seriesguide/backend/shows/model/Show;", "upload", "show", "(Lcom/uwetrottmann/seriesguide/backend/shows/model/SgCloudShow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadAll", "app_amazonDebug"})
public final class HexagonShowSync {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.backend.HexagonTools hexagonTools = null;
    
    @javax.inject.Inject()
    public HexagonShowSync(@org.jetbrains.annotations.NotNull()
    @com.battlelancer.seriesguide.modules.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.backend.HexagonTools hexagonTools) {
        super();
    }
    
    /**
     * Downloads shows from Hexagon and updates existing shows with new property values. Any
     * shows not yet in the local database, determined by the given TMDB ID map, will be added
     * to the given map.
     *
     * When merging shows (e.g. just signed in) also downloads legacy cloud shows.
     */
    public final boolean download(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Long> tmdbIdsToShowIds, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> toAdd, boolean hasMergedShows) {
        return false;
    }
    
    private final boolean downloadShows(java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2CloudUpdate> updates, java.util.Set<java.lang.Long> toUpdate, java.util.Set<java.lang.Integer> removed, java.util.HashMap<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> toAdd, java.util.Map<java.lang.Integer, java.lang.Long> tmdbIdsToShowIds, boolean hasMergedShows, com.google.api.client.util.DateTime lastSyncTime) {
        return false;
    }
    
    private final boolean downloadLegacyShows(java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2CloudUpdate> updates, java.util.Set<java.lang.Long> toUpdate, java.util.Set<java.lang.Integer> removed, java.util.HashMap<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> toAdd, java.util.Map<java.lang.Integer, java.lang.Long> tmdbIdsToShowIds) {
        return false;
    }
    
    /**
     * Returns null on network error while looking up TMDB ID.
     */
    private final java.util.List<com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow> mapLegacyShows(java.util.List<com.uwetrottmann.seriesguide.backend.shows.model.Show> legacyShows) {
        return null;
    }
    
    private final void appendShowUpdates(java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2CloudUpdate> updates, java.util.Set<java.lang.Long> toUpdate, java.util.Set<java.lang.Integer> removed, java.util.Map<java.lang.Integer, com.battlelancer.seriesguide.shows.search.discover.SearchResult> toAdd, java.util.List<com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow> shows, java.util.Map<java.lang.Integer, java.lang.Long> tmdbIdsToShowIds, boolean mergeValues) {
    }
    
    /**
     * Uploads all local shows to Hexagon.
     */
    public final boolean uploadAll() {
        return false;
    }
    
    /**
     * Uploads the given list of shows to Hexagon.
     */
    public final boolean upload(@org.jetbrains.annotations.NotNull()
    java.util.List<com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow> shows) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object upload(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow show, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}