package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

/**
 * Error for tracking OAuth failures.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktOAuthError;", "", "action", "", "failure", "(Ljava/lang/String;Ljava/lang/String;)V", "app_pureDebug"})
public final class TraktOAuthError extends java.lang.Throwable {
    
    public TraktOAuthError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String failure) {
        super(null);
    }
}