package com.battlelancer.seriesguide.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/util/ServerError;", "Lcom/battlelancer/seriesguide/util/RequestError;", "action", "", "response", "Lokhttp3/Response;", "(Ljava/lang/String;Lokhttp3/Response;)V", "additionalMessage", "(Ljava/lang/String;Lokhttp3/Response;Ljava/lang/String;)V", "e", "Lcom/google/api/client/http/HttpResponseException;", "(Ljava/lang/String;Lcom/google/api/client/http/HttpResponseException;)V", "app_pureDebug"})
public final class ServerError extends com.battlelancer.seriesguide.util.RequestError {
    
    public ServerError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
        super(null, null);
    }
    
    public ServerError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response, @org.jetbrains.annotations.NotNull()
    java.lang.String additionalMessage) {
        super(null, null);
    }
    
    public ServerError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    com.google.api.client.http.HttpResponseException e) {
        super(null, null);
    }
}