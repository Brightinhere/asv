package com.battlelancer.seriesguide.tmdbapi;

import java.lang.System;

/**
 * The API request might succeed if tried again after a brief delay
 * (e.g. time outs or other temporary network issues).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/tmdbapi/TmdbRetry;", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbError;", "()V", "app_pureDebug"})
public final class TmdbRetry extends com.battlelancer.seriesguide.tmdbapi.TmdbError {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.tmdbapi.TmdbRetry INSTANCE = null;
    
    private TmdbRetry() {
        super();
    }
}