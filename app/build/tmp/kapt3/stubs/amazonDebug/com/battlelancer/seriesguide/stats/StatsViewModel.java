package com.battlelancer.seriesguide.stats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/stats/StatsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "hideSpecials", "Landroidx/lifecycle/MutableLiveData;", "", "getHideSpecials", "()Landroidx/lifecycle/MutableLiveData;", "statsData", "Landroidx/lifecycle/LiveData;", "Lcom/battlelancer/seriesguide/stats/StatsUpdateEvent;", "kotlin.jvm.PlatformType", "getStatsData", "()Landroidx/lifecycle/LiveData;", "buildUpdate", "stats", "Lcom/battlelancer/seriesguide/stats/Stats;", "countEpisodes", "", "excludeSpecials", "countMovies", "countShows", "", "", "", "loadStats", "Companion", "app_amazonDebug"})
public final class StatsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideSpecials = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.stats.StatsUpdateEvent> statsData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.stats.StatsViewModel.Companion Companion = null;
    private static final long PREVIEW_UPDATE_INTERVAL_MS = android.text.format.DateUtils.SECOND_IN_MILLIS;
    
    public StatsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideSpecials() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.stats.StatsUpdateEvent> getStatsData() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.stats.StatsUpdateEvent> loadStats(boolean excludeSpecials) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.stats.StatsUpdateEvent buildUpdate(com.battlelancer.seriesguide.stats.Stats stats) {
        return null;
    }
    
    private final void countMovies(com.battlelancer.seriesguide.stats.Stats stats) {
    }
    
    /**
     * Returns shows mapped to their runtime.
     */
    private final java.util.Map<java.lang.Long, java.lang.Integer> countShows(com.battlelancer.seriesguide.stats.Stats stats, boolean excludeSpecials) {
        return null;
    }
    
    private final void countEpisodes(com.battlelancer.seriesguide.stats.Stats stats, boolean excludeSpecials) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/stats/StatsViewModel$Companion;", "", "()V", "PREVIEW_UPDATE_INTERVAL_MS", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}