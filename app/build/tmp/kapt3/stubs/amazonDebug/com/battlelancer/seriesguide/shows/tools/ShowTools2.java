package com.battlelancer.seriesguide.shows.tools;

import java.lang.System;

/**
 * Provides some show operations as (async) suspend functions, running within global scope.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002/0B\u001f\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\tJ\u0019\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0017J!\u0010 \u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0017J!\u0010$\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0016\u0010%\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\u0013J\u0016\u0010(\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0017J!\u0010*\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/ShowTools2;", "", "context", "Landroid/content/Context;", "hexagonShowSync", "Ldagger/Lazy;", "Lcom/battlelancer/seriesguide/sync/HexagonShowSync;", "(Landroid/content/Context;Ldagger/Lazy;)V", "getShowId", "", "showTmdbId", "", "showTvdbId", "(ILjava/lang/Integer;)Ljava/lang/Long;", "getShowTraktId", "showId", "(J)Ljava/lang/Integer;", "getTmdbIdsToPoster", "Landroidx/collection/SparseArrayCompat;", "", "getTmdbIdsToShowIds", "", "isNotConnected", "", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeShow", "", "removeShowAsync", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeAllHiddenVisible", "storeIsFavorite", "isFavorite", "storeIsFavoriteAsync", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeIsHidden", "isHidden", "storeIsHiddenAsync", "storeLanguage", "Lkotlinx/coroutines/Job;", "languageCode", "storeNotify", "notify", "storeNotifyAsync", "uploadShowToCloud", "show", "Lcom/uwetrottmann/seriesguide/backend/shows/model/SgCloudShow;", "(Lcom/uwetrottmann/seriesguide/backend/shows/model/SgCloudShow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OnRemovingShowEvent", "OnShowRemovedEvent", "app_amazonDebug"})
public final class ShowTools2 {
    private final android.content.Context context = null;
    private final dagger.Lazy<com.battlelancer.seriesguide.sync.HexagonShowSync> hexagonShowSync = null;
    
    @javax.inject.Inject()
    public ShowTools2(@org.jetbrains.annotations.NotNull()
    @com.battlelancer.seriesguide.modules.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.battlelancer.seriesguide.sync.HexagonShowSync> hexagonShowSync) {
        super();
    }
    
    /**
     * Gets row ID of a show by TMDB id first, then if given by TVDB id and null TMDB id (show is
     * not migrated, yet). Null if not in database or matched by TVDB id, but has different TMDB id.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getShowId(int showTmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer showTvdbId) {
        return null;
    }
    
    /**
     * Returns the Trakt id of a show, or `null` if it is invalid or there is none.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShowTraktId(long showId) {
        return null;
    }
    
    /**
     * Removes a show and its seasons and episodes, including search docs. Sends isRemoved flag to
     * Hexagon so the show will not be auto-added on any device connected to Hexagon.
     *
     * Posts [OnRemovingShowEvent] when starting and [OnShowRemovedEvent] once completed.
     */
    public final void removeShow(long showId) {
    }
    
    /**
     * Returns [com.battlelancer.seriesguide.enums.NetworkResult].
     */
    private final java.lang.Object removeShowAsync(long showId, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    /**
     * Saves new favorite flag to the local database and, if signed in, up into the cloud as well.
     */
    public final void storeIsFavorite(long showId, boolean isFavorite) {
    }
    
    private final java.lang.Object storeIsFavoriteAsync(long showId, boolean isFavorite, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Saves new hidden flag to the local database and, if signed in, up into the cloud as well.
     */
    public final void storeIsHidden(long showId, boolean isHidden) {
    }
    
    private final java.lang.Object storeIsHiddenAsync(long showId, boolean isHidden, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Saves new notify flag to the local database and, if signed in, up into the cloud as well.
     */
    public final void storeNotify(long showId, boolean notify) {
    }
    
    private final java.lang.Object storeNotifyAsync(long showId, boolean notify, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Removes hidden flag from all hidden shows in the local database and, if signed in, sends to
     * the cloud as well.
     */
    public final void storeAllHiddenVisible() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job storeLanguage(long showId, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    private final java.lang.Object isNotConnected(android.content.Context context, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object uploadShowToCloud(com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow show, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.collection.SparseArrayCompat<java.lang.String> getTmdbIdsToPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.lang.Long> getTmdbIdsToShowIds() {
        return null;
    }
    
    /**
     * Posted if a show is about to get removed.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/ShowTools2$OnRemovingShowEvent;", "", "showId", "", "(J)V", "getShowId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_amazonDebug"})
    public static final class OnRemovingShowEvent {
        private final long showId = 0L;
        
        /**
         * Posted if a show is about to get removed.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.ShowTools2.OnRemovingShowEvent copy(long showId) {
            return null;
        }
        
        /**
         * Posted if a show is about to get removed.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Posted if a show is about to get removed.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Posted if a show is about to get removed.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public OnRemovingShowEvent(long showId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getShowId() {
            return 0L;
        }
    }
    
    /**
     * Posted if show was just removed (or failure).
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/ShowTools2$OnShowRemovedEvent;", "", "showTmdbId", "", "resultCode", "(II)V", "getResultCode", "()I", "getShowTmdbId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_amazonDebug"})
    public static final class OnShowRemovedEvent {
        private final int showTmdbId = 0;
        
        /**
         * One of [com.battlelancer.seriesguide.enums.NetworkResult].
         */
        private final int resultCode = 0;
        
        /**
         * Posted if show was just removed (or failure).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.ShowTools2.OnShowRemovedEvent copy(int showTmdbId, int resultCode) {
            return null;
        }
        
        /**
         * Posted if show was just removed (or failure).
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Posted if show was just removed (or failure).
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Posted if show was just removed (or failure).
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public OnShowRemovedEvent(int showTmdbId, int resultCode) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getShowTmdbId() {
            return 0;
        }
        
        /**
         * One of [com.battlelancer.seriesguide.enums.NetworkResult].
         */
        public final int component2() {
            return 0;
        }
        
        /**
         * One of [com.battlelancer.seriesguide.enums.NetworkResult].
         */
        public final int getResultCode() {
            return 0;
        }
    }
}