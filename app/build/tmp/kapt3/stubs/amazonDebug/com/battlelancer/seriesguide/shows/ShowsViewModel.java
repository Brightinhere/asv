package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u0013\u0010\u0018\u001a\u00020\u0019*\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0019*\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0019*\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "queryString", "Landroidx/lifecycle/MutableLiveData;", "", "sgShowsLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/battlelancer/seriesguide/shows/database/SgShow2ForLists;", "showItemsLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "getShowItemsLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "showItemsLiveDataSemaphore", "Lkotlinx/coroutines/sync/Semaphore;", "updateQuery", "", "filter", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "orderClause", "isFalse", "", "(Ljava/lang/Boolean;)Z", "isNullOrFalse", "isTrue", "app_amazonDebug"})
public final class ShowsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryString = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2ForLists>> sgShowsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem>> showItemsLiveData = null;
    private final kotlinx.coroutines.sync.Semaphore showItemsLiveDataSemaphore = null;
    
    public ShowsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem>> getShowItemsLiveData() {
        return null;
    }
    
    private final boolean isTrue(java.lang.Boolean $this$isTrue) {
        return false;
    }
    
    private final boolean isFalse(java.lang.Boolean $this$isFalse) {
        return false;
    }
    
    private final boolean isNullOrFalse(java.lang.Boolean $this$isNullOrFalse) {
        return false;
    }
    
    public final void updateQuery(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter filter, @org.jetbrains.annotations.NotNull()
    java.lang.String orderClause) {
    }
}