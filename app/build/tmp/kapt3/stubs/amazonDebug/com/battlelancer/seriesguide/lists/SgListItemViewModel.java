package com.battlelancer.seriesguide.lists;

import java.lang.System;

/**
 * Uses raw query to get list items with show details.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListItemViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "listId", "", "application", "Landroid/app/Application;", "(Ljava/lang/String;Landroid/app/Application;)V", "queryString", "Landroidx/lifecycle/MutableLiveData;", "sgListItemLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "getSgListItemLiveData", "()Landroidx/lifecycle/LiveData;", "updateQuery", "", "app_amazonDebug"})
public final class SgListItemViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String listId = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryString = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.lists.database.SgListItemWithDetails>> sgListItemLiveData = null;
    
    public SgListItemViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String listId, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.lists.database.SgListItemWithDetails>> getSgListItemLiveData() {
        return null;
    }
    
    public final void updateQuery() {
    }
}