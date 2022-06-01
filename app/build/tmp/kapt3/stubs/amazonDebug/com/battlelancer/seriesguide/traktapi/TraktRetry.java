package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

/**
 * The API request might succeed if tried again after a brief delay
 * (e.g. time outs or other temporary network issues).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktRetry;", "Lcom/battlelancer/seriesguide/traktapi/TraktError;", "()V", "app_amazonDebug"})
public final class TraktRetry extends com.battlelancer.seriesguide.traktapi.TraktError {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.TraktRetry INSTANCE = null;
    
    private TraktRetry() {
        super();
    }
}