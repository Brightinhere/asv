package com.battlelancer.seriesguide.tmdbapi;

import java.lang.System;

/**
 * Creates a custom [Tmdb] using the given API key and HTTP client.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/tmdbapi/SgTmdb;", "Lcom/uwetrottmann/tmdb2/Tmdb;", "okHttpClient", "Lokhttp3/OkHttpClient;", "apiKey", "", "(Lokhttp3/OkHttpClient;Ljava/lang/String;)V", "getRetrofit", "Lretrofit2/Retrofit;", "app_pureDebug"})
public final class SgTmdb extends com.uwetrottmann.tmdb2.Tmdb {
    private final okhttp3.OkHttpClient okHttpClient = null;
    
    public SgTmdb(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    protected synchronized okhttp3.OkHttpClient okHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Retrofit getRetrofit() {
        return null;
    }
}