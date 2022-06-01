package com.battlelancer.seriesguide.backend;

import java.lang.System;

/**
 * Adds authorization header using Firebase JWT token to each request for current Firebase user.
 * Fetches token once and caches it between requests.
 * If a request fails with HTTP 401 tries once to fetch token again.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/backend/FirebaseHttpRequestInitializer;", "Lcom/google/api/client/http/HttpRequestInitializer;", "()V", "firebaseUser", "Lcom/google/firebase/auth/FirebaseUser;", "getFirebaseUser", "()Lcom/google/firebase/auth/FirebaseUser;", "setFirebaseUser", "(Lcom/google/firebase/auth/FirebaseUser;)V", "token", "", "clearJwtToken", "", "getJwtToken", "initialize", "request", "Lcom/google/api/client/http/HttpRequest;", "app_amazonDebug"})
public final class FirebaseHttpRequestInitializer implements com.google.api.client.http.HttpRequestInitializer {
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.auth.FirebaseUser firebaseUser;
    private java.lang.String token;
    
    public FirebaseHttpRequestInitializer() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.FirebaseUser getFirebaseUser() {
        return null;
    }
    
    public final void setFirebaseUser(@org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.FirebaseUser p0) {
    }
    
    @java.lang.Override()
    public void initialize(@org.jetbrains.annotations.Nullable()
    com.google.api.client.http.HttpRequest request) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.concurrent.ExecutionException.class, java.lang.InterruptedException.class})
    @kotlin.jvm.Synchronized()
    public final synchronized java.lang.String getJwtToken() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void clearJwtToken() {
    }
}