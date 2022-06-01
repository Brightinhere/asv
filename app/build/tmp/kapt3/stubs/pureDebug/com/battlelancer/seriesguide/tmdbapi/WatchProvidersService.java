package com.battlelancer.seriesguide.tmdbapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/tmdbapi/WatchProvidersService;", "", "movie", "Lcom/battlelancer/seriesguide/tmdbapi/WatchProviderResults;", "language", "", "watchRegion", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tv", "app_pureDebug"})
public abstract interface WatchProvidersService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "watch/providers/movie")
    public abstract java.lang.Object movie(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "watch_region")
    java.lang.String watchRegion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.battlelancer.seriesguide.tmdbapi.WatchProviderResults> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "watch/providers/tv")
    public abstract java.lang.Object tv(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "watch_region")
    java.lang.String watchRegion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.battlelancer.seriesguide.tmdbapi.WatchProviderResults> continuation);
}