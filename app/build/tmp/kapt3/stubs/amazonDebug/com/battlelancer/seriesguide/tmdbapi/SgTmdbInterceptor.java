package com.battlelancer.seriesguide.tmdbapi;

import java.lang.System;

/**
 * A custom [TmdbInterceptor] which does not require a [Tmdb] instance until
 * intercepting.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/tmdbapi/SgTmdbInterceptor;", "Lokhttp3/Interceptor;", "tmdb", "Ldagger/Lazy;", "Lcom/uwetrottmann/tmdb2/Tmdb;", "(Ldagger/Lazy;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_amazonDebug"})
public final class SgTmdbInterceptor implements okhttp3.Interceptor {
    private final dagger.Lazy<com.uwetrottmann.tmdb2.Tmdb> tmdb = null;
    
    @javax.inject.Inject()
    public SgTmdbInterceptor(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.uwetrottmann.tmdb2.Tmdb> tmdb) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
}