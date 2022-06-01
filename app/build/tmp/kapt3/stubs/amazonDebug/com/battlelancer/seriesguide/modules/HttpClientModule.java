package com.battlelancer.seriesguide.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/modules/HttpClientModule;", "", "()V", "provideOkHttpCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "cache", "traktInterceptor", "Lcom/battlelancer/seriesguide/traktapi/SgTraktInterceptor;", "tmdbInterceptor", "Lcom/battlelancer/seriesguide/tmdbapi/SgTmdbInterceptor;", "authenticator", "Lcom/battlelancer/seriesguide/util/AllApisAuthenticator;", "Companion", "app_amazonDebug"})
@dagger.Module()
public class HttpClientModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.modules.HttpClientModule.Companion Companion = null;
    private static final int CONNECT_TIMEOUT_MILLIS = 15000;
    private static final int READ_TIMEOUT_MILLIS = 20000;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CACHE = "api-cache";
    private static final long MIN_DISK_API_CACHE_SIZE = 2097152L;
    private static final long MAX_DISK_API_CACHE_SIZE = 20971520L;
    
    public HttpClientModule() {
        super();
    }
    
    /**
     * Returns this apps [OkHttpClient] with enabled response cache. Should be used with API calls.
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.traktapi.SgTraktInterceptor traktInterceptor, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.tmdbapi.SgTmdbInterceptor tmdbInterceptor, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.util.AllApisAuthenticator authenticator) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public okhttp3.Cache provideOkHttpCache(@org.jetbrains.annotations.NotNull()
    @ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/modules/HttpClientModule$Companion;", "", "()V", "API_CACHE", "", "CONNECT_TIMEOUT_MILLIS", "", "MAX_DISK_API_CACHE_SIZE", "", "MIN_DISK_API_CACHE_SIZE", "READ_TIMEOUT_MILLIS", "calculateApiDiskCacheSize", "dir", "Ljava/io/File;", "createApiCacheDir", "context", "Landroid/content/Context;", "directoryName", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File createApiCacheDir(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String directoryName) {
            return null;
        }
        
        public final long calculateApiDiskCacheSize(@org.jetbrains.annotations.NotNull()
        java.io.File dir) {
            return 0L;
        }
    }
}