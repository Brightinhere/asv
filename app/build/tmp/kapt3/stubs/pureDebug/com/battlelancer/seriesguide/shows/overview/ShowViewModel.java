package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0012R#\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/ShowViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "credits", "Landroidx/lifecycle/LiveData;", "Lcom/uwetrottmann/tmdb2/entities/Credits;", "getCredits", "()Landroidx/lifecycle/LiveData;", "credits$delegate", "Lkotlin/Lazy;", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "getShow", "show$delegate", "showId", "Landroidx/lifecycle/MutableLiveData;", "", "setShowId", "", "app_pureDebug"})
public final class ShowViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> showId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy show$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy credits$delegate = null;
    
    public ShowViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgShow2> getShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.uwetrottmann.tmdb2.entities.Credits> getCredits() {
        return null;
    }
    
    public final void setShowId(long showId) {
    }
}