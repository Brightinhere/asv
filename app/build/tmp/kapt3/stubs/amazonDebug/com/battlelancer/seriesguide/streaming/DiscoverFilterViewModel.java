package com.battlelancer.seriesguide.streaming;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/DiscoverFilterViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "type", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider$Type;", "(Landroid/app/Application;Lcom/battlelancer/seriesguide/streaming/SgWatchProvider$Type;)V", "allWatchProvidersFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider;", "getAllWatchProvidersFlow", "()Lkotlinx/coroutines/flow/Flow;", "updateWatchProviders", "", "watchRegion", "", "Companion", "app_amazonDebug"})
public final class DiscoverFilterViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.battlelancer.seriesguide.streaming.SgWatchProvider.Type type = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.battlelancer.seriesguide.streaming.SgWatchProvider>> allWatchProvidersFlow = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.streaming.DiscoverFilterViewModel.Companion Companion = null;
    
    public DiscoverFilterViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.streaming.SgWatchProvider.Type type) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.battlelancer.seriesguide.streaming.SgWatchProvider>> getAllWatchProvidersFlow() {
        return null;
    }
    
    public final void updateWatchProviders(@org.jetbrains.annotations.NotNull()
    java.lang.String watchRegion) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/DiscoverFilterViewModel$Companion;", "", "()V", "calculateProviderDiff", "Lcom/battlelancer/seriesguide/streaming/ProviderDiff;", "newProviders", "", "Lcom/uwetrottmann/tmdb2/entities/WatchProviders$WatchProvider;", "oldProviders", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider;", "type", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider$Type;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create inserts, updates and deletes to minimize database writes
         * at the cost of CPU and memory. Only pass providers of one type.
         */
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.VisibleForTesting()
        public final com.battlelancer.seriesguide.streaming.ProviderDiff calculateProviderDiff(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.uwetrottmann.tmdb2.entities.WatchProviders.WatchProvider> newProviders, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> oldProviders, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.streaming.SgWatchProvider.Type type) {
            return null;
        }
    }
}