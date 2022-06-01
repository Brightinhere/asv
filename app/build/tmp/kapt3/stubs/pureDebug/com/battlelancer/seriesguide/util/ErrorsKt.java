package com.battlelancer.seriesguide.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0005H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0005H\u0002\u001a\f\u0010\b\u001a\u00020\u0003*\u00020\u0001H\u0002\u00a8\u0006\t"}, d2 = {"getUltimateCause", "", "isClientError", "", "Lcom/google/api/client/http/HttpResponseException;", "Lokhttp3/Response;", "isRetryError", "isServerError", "shouldReport", "app_pureDebug"})
public final class ErrorsKt {
    
    private static final boolean isClientError(okhttp3.Response $this$isClientError) {
        return false;
    }
    
    private static final boolean isServerError(okhttp3.Response $this$isServerError) {
        return false;
    }
    
    private static final boolean isClientError(com.google.api.client.http.HttpResponseException $this$isClientError) {
        return false;
    }
    
    private static final boolean isServerError(com.google.api.client.http.HttpResponseException $this$isServerError) {
        return false;
    }
    
    /**
     * Returns true if the exception is not one of the following:
     * - ConnectException - network issues (e.g. "Failed to connect to x").
     * - InterruptedIOException - network request time outs.
     * - UnknownHostException - network issues.
     */
    private static final boolean shouldReport(java.lang.Throwable $this$shouldReport) {
        return false;
    }
    
    /**
     * Returns true if the throwable is a network exception that might be
     * recovered from by retrying the network request.
     */
    public static final boolean isRetryError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable $this$isRetryError) {
        return false;
    }
    
    /**
     * Returns the bottom most cause, or this if there is no cause.
     */
    private static final java.lang.Throwable getUltimateCause(java.lang.Throwable $this$getUltimateCause) {
        return null;
    }
}