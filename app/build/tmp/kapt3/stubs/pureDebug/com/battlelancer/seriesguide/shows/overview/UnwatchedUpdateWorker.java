package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/UnwatchedUpdateWorker;", "", "()V", "updateUnwatchedCount", "", "context", "Landroid/content/Context;", "showRowId", "", "seasonRowId", "(Landroid/content/Context;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUnwatchedCountFor", "updateUnwatchedCountForSeason", "app_pureDebug"})
public final class UnwatchedUpdateWorker {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.overview.UnwatchedUpdateWorker INSTANCE = null;
    
    private UnwatchedUpdateWorker() {
        super();
    }
    
    /**
     * Updates episode counts for a specific season or all seasons of a show.
     *
     * Runs all calls on a single thread to prevent parallel execution.
     *
     * May be cancelled when the app process dies.
     */
    public final void updateUnwatchedCountFor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long showRowId, long seasonRowId) {
    }
    
    private final java.lang.Object updateUnwatchedCount(android.content.Context context, long showRowId, long seasonRowId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void updateUnwatchedCountForSeason(android.content.Context context, long seasonRowId) {
    }
}