package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Throwable to track service request errors.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/util/RequestError;", "", "action", "", "response", "Lokhttp3/Response;", "(Ljava/lang/String;Lokhttp3/Response;)V", "additionalMessage", "(Ljava/lang/String;Lokhttp3/Response;Ljava/lang/String;)V", "e", "Lcom/google/api/client/http/HttpResponseException;", "(Ljava/lang/String;Lcom/google/api/client/http/HttpResponseException;)V", "code", "", "message", "(Ljava/lang/String;ILjava/lang/String;)V", "app_pureDebug"})
public class RequestError extends java.lang.Throwable {
    
    public RequestError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, int code, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super(null);
    }
    
    public RequestError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
        super(null);
    }
    
    public RequestError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response, @org.jetbrains.annotations.NotNull()
    java.lang.String additionalMessage) {
        super(null);
    }
    
    public RequestError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    com.google.api.client.http.HttpResponseException e) {
        super(null);
    }
}