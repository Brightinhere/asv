package com.battlelancer.seriesguide.lists;

import java.lang.System;

/**
 * Displays one user created list of shows.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u001a\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "emptyView", "Landroid/widget/TextView;", "listsActivityViewModel", "Lcom/battlelancer/seriesguide/lists/ListsActivityViewModel;", "getListsActivityViewModel", "()Lcom/battlelancer/seriesguide/lists/ListsActivityViewModel;", "listsActivityViewModel$delegate", "Lkotlin/Lazy;", "model", "Lcom/battlelancer/seriesguide/lists/SgListItemViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/lists/SgListItemViewModel;", "model$delegate", "onItemClickListener", "Lcom/battlelancer/seriesguide/lists/SgListItemAdapter$OnItemClickListener;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onEventMainThread", "event", "Lcom/battlelancer/seriesguide/lists/ListsDistillationSettings$ListsSortOrderChangedEvent;", "onStart", "onStop", "onViewCreated", "view", "Companion", "PopupMenuItemClickListener", "app_amazonDebug"})
public final class SgListFragment extends androidx.fragment.app.Fragment {
    private android.widget.TextView emptyView;
    private final kotlin.Lazy model$delegate = null;
    private final kotlin.Lazy listsActivityViewModel$delegate = null;
    private final com.battlelancer.seriesguide.lists.SgListItemAdapter.OnItemClickListener onItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.lists.SgListFragment.Companion Companion = null;
    private static final java.lang.String ARG_LIST_ID = "LIST_ID";
    private static final java.lang.String ARG_LIST_POSITION = "LIST_POSITION";
    
    public SgListFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.lists.SgListItemViewModel getModel() {
        return null;
    }
    
    private final com.battlelancer.seriesguide.lists.ListsActivityViewModel getListsActivityViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.lists.ListsDistillationSettings.ListsSortOrderChangedEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.lists.SgListFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String listId, int listPosition) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListFragment$PopupMenuItemClickListener;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "itemId", "", "showId", "", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;J)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_amazonDebug"})
    static final class PopupMenuItemClickListener implements android.widget.PopupMenu.OnMenuItemClickListener {
        private final android.content.Context context = null;
        private final androidx.fragment.app.FragmentManager fragmentManager = null;
        private final java.lang.String itemId = null;
        private final long showId = 0L;
        
        public PopupMenuItemClickListener(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        java.lang.String itemId, long showId) {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListFragment$Companion;", "", "()V", "ARG_LIST_ID", "", "ARG_LIST_POSITION", "newInstance", "Lcom/battlelancer/seriesguide/lists/SgListFragment;", "listId", "listPosition", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.lists.SgListFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String listId, int listPosition) {
            return null;
        }
    }
}