package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "showId", "", "(Landroid/app/Application;J)V", "order", "Landroidx/lifecycle/MutableLiveData;", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsSettings$SeasonSorting;", "remainingCountData", "Lcom/battlelancer/seriesguide/shows/overview/RemainingCountLiveData;", "getRemainingCountData", "()Lcom/battlelancer/seriesguide/shows/overview/RemainingCountLiveData;", "seasons", "Landroidx/lifecycle/LiveData;", "", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "kotlin.jvm.PlatformType", "getSeasons", "()Landroidx/lifecycle/LiveData;", "updateOrder", "", "app_amazonDebug"})
public final class SeasonsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final long showId = 0L;
    private final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.overview.SeasonsSettings.SeasonSorting> order = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2>> seasons = null;
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.shows.overview.RemainingCountLiveData remainingCountData = null;
    
    public SeasonsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, long showId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2>> getSeasons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.overview.RemainingCountLiveData getRemainingCountData() {
        return null;
    }
    
    public final void updateOrder() {
    }
}