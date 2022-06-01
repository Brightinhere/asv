package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

/**
 * Downloads Trakt ratings for an episode, stores them in the database.
 * The recent 50 downloads are cached for at most a day.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007J#\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktRatingsFetcher;", "", "()V", "HARD_CACHE_CAPACITY", "", "MAXIMUM_AGE", "", "lruCache", "Landroidx/collection/LruCache;", "fetchEpisodeRatingsAsync", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "episodeId", "fetchRating", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_pureDebug"})
public final class TraktRatingsFetcher {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.TraktRatingsFetcher INSTANCE = null;
    private static final int HARD_CACHE_CAPACITY = 50;
    private static final long MAXIMUM_AGE = android.text.format.DateUtils.DAY_IN_MILLIS;
    private static final androidx.collection.LruCache<java.lang.Long, java.lang.Long> lruCache = null;
    
    private TraktRatingsFetcher() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final kotlinx.coroutines.Job fetchEpisodeRatingsAsync(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long episodeId) {
        return null;
    }
    
    private final java.lang.Object fetchRating(android.content.Context context, long episodeId, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return null;
    }
}