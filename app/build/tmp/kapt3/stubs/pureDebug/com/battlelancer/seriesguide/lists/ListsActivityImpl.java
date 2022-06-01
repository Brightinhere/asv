package com.battlelancer.seriesguide.lists;

import java.lang.System;

/**
 * Hosts a view pager to display and manage user created lists.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0014J\b\u0010\u001e\u001a\u00020\u000eH\u0014J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006$"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ListsActivityImpl;", "Lcom/battlelancer/seriesguide/ui/BaseTopActivity;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/ActivityListsBinding;", "listsAdapter", "Lcom/battlelancer/seriesguide/lists/ListsPagerAdapter;", "viewModel", "Lcom/battlelancer/seriesguide/lists/ListsActivityViewModel;", "getViewModel", "()Lcom/battlelancer/seriesguide/lists/ListsActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "changeSortOrder", "", "sortOrderId", "", "getSnackbarParentView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onSelectedCurrentNavItem", "setupViews", "showListManageDialog", "selectedListIndex", "toggleSortIgnoreArticles", "Companion", "app_pureDebug"})
public class ListsActivityImpl extends com.battlelancer.seriesguide.ui.BaseTopActivity {
    private com.battlelancer.seriesguide.databinding.ActivityListsBinding binding;
    private com.battlelancer.seriesguide.lists.ListsPagerAdapter listsAdapter;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.lists.ListsActivityImpl.Companion Companion = null;
    public static final int LISTS_REORDER_LOADER_ID = 2;
    
    public ListsActivityImpl() {
        super();
    }
    
    private final com.battlelancer.seriesguide.lists.ListsActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showListManageDialog(int selectedListIndex) {
    }
    
    @java.lang.Override()
    protected void onSelectedCurrentNavItem() {
    }
    
    private final void changeSortOrder(int sortOrderId) {
    }
    
    private final void toggleSortIgnoreArticles() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View getSnackbarParentView() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ListsActivityImpl$Companion;", "", "()V", "LISTS_REORDER_LOADER_ID", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}