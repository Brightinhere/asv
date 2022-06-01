package com.battlelancer.seriesguide.shows.search;

import java.lang.System;

/**
 * Displays show search results.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001cH\u0007J\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/ShowSearchFragment;", "Lcom/battlelancer/seriesguide/shows/search/BaseSearchFragment;", "()V", "adapter", "Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter;", "model", "Lcom/battlelancer/seriesguide/shows/search/ShowSearchViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/search/ShowSearchViewModel;", "model$delegate", "Lkotlin/Lazy;", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$OnItemClickListener;", "searchTriggerListener", "Lcom/battlelancer/seriesguide/shows/search/SearchTriggerListener;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEventMainThread", "", "event", "Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl$SearchQueryEvent;", "onEventTabClick", "Lcom/battlelancer/seriesguide/util/TabClickEvent;", "onViewCreated", "view", "updateQuery", "args", "app_amazonDebug"})
public final class ShowSearchFragment extends com.battlelancer.seriesguide.shows.search.BaseSearchFragment {
    private final kotlin.Lazy model$delegate = null;
    private com.battlelancer.seriesguide.shows.search.ShowSearchAdapter adapter;
    private com.battlelancer.seriesguide.shows.search.SearchTriggerListener searchTriggerListener;
    private final com.battlelancer.seriesguide.shows.search.ShowSearchAdapter.OnItemClickListener onItemClickListener = null;
    
    public ShowSearchFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.search.ShowSearchViewModel getModel() {
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
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.SearchActivityImpl.SearchQueryEvent event) {
    }
    
    private final void updateQuery(android.os.Bundle args) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventTabClick(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.util.TabClickEvent event) {
    }
}