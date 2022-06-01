package com.battlelancer.seriesguide.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J$\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/backend/FirebaseHttpExecuteInterceptor;", "Lcom/google/api/client/http/HttpExecuteInterceptor;", "Lcom/google/api/client/http/HttpUnsuccessfulResponseHandler;", "firebaseHttpRequestInitializer", "Lcom/battlelancer/seriesguide/backend/FirebaseHttpRequestInitializer;", "(Lcom/battlelancer/seriesguide/backend/FirebaseHttpRequestInitializer;)V", "received401", "", "handleResponse", "request", "Lcom/google/api/client/http/HttpRequest;", "response", "Lcom/google/api/client/http/HttpResponse;", "supportsRetry", "intercept", "", "app_amazonDebug"})
final class FirebaseHttpExecuteInterceptor implements com.google.api.client.http.HttpExecuteInterceptor, com.google.api.client.http.HttpUnsuccessfulResponseHandler {
    private final com.battlelancer.seriesguide.backend.FirebaseHttpRequestInitializer firebaseHttpRequestInitializer = null;
    private boolean received401 = false;
    
    public FirebaseHttpExecuteInterceptor(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.backend.FirebaseHttpRequestInitializer firebaseHttpRequestInitializer) {
        super();
    }
    
    @java.lang.Override()
    public void intercept(@org.jetbrains.annotations.Nullable()
    com.google.api.client.http.HttpRequest request) {
    }
    
    @java.lang.Override()
    public boolean handleResponse(@org.jetbrains.annotations.Nullable()
    com.google.api.client.http.HttpRequest request, @org.jetbrains.annotations.Nullable()
    com.google.api.client.http.HttpResponse response, boolean supportsRetry) {
        return false;
    }
}