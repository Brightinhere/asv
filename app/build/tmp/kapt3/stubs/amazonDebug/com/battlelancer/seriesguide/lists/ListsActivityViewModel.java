package com.battlelancer.seriesguide.lists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ListsActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "hasRestoredLastListsTabPosition", "", "getHasRestoredLastListsTabPosition", "()Z", "setHasRestoredLastListsTabPosition", "(Z)V", "listsLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/battlelancer/seriesguide/lists/database/SgList;", "getListsLiveData", "()Landroidx/lifecycle/LiveData;", "listsLiveData$delegate", "Lkotlin/Lazy;", "scrollTabToTopLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getScrollTabToTopLiveData", "()Landroidx/lifecycle/MutableLiveData;", "scrollTabToTop", "", "tabPosition", "app_amazonDebug"})
public final class ListsActivityViewModel extends androidx.lifecycle.AndroidViewModel {
    private boolean hasRestoredLastListsTabPosition = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy listsLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> scrollTabToTopLiveData = null;
    
    public ListsActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final boolean getHasRestoredLastListsTabPosition() {
        return false;
    }
    
    public final void setHasRestoredLastListsTabPosition(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.lists.database.SgList>> getListsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getScrollTabToTopLiveData() {
        return null;
    }
    
    public final void scrollTabToTop(int tabPosition) {
    }
}