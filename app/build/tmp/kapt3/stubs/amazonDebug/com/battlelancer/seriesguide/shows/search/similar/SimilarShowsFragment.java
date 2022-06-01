package com.battlelancer.seriesguide.shows.search.similar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\u001a\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\u0018\u0010,\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsFragment;", "Lcom/battlelancer/seriesguide/shows/search/discover/BaseAddShowsFragment;", "()V", "adapter", "Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsAdapter;", "emptyView", "Lcom/battlelancer/seriesguide/ui/widgets/EmptyView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showTitle", "", "showTmdbId", "", "similarShowsViewModel", "Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsViewModel;", "getSimilarShowsViewModel", "()Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsViewModel;", "similarShowsViewModel$delegate", "Lkotlin/Lazy;", "swipeRefreshLayout", "Lcom/uwetrottmann/seriesguide/widgets/EmptyViewSwipeRefreshLayout;", "loadSimilarShows", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onStart", "onViewCreated", "view", "setAllPendingNotAdded", "setStateForTmdbId", "newState", "Companion", "app_amazonDebug"})
public final class SimilarShowsFragment extends com.battlelancer.seriesguide.shows.search.discover.BaseAddShowsFragment {
    private int showTmdbId = 0;
    private java.lang.String showTitle;
    private final kotlin.Lazy similarShowsViewModel$delegate = null;
    private com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout swipeRefreshLayout;
    private com.battlelancer.seriesguide.ui.widgets.EmptyView emptyView;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.battlelancer.seriesguide.shows.search.similar.SimilarShowsAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.search.similar.SimilarShowsFragment.Companion Companion = null;
    private static final java.lang.String ARG_SHOW_TMDB_ID = "ARG_SHOW_TMDB_ID";
    private static final java.lang.String ARG_SHOW_TITLE = "ARG_SHOW_TITLE";
    private static final int MENU_ITEM_SEARCH_ID = 1;
    @org.jetbrains.annotations.NotNull()
    private static final com.uwetrottmann.seriesguide.common.SingleLiveEvent<com.battlelancer.seriesguide.shows.search.discover.SearchResult> displaySimilarShowsEventLiveData = null;
    
    public SimilarShowsFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.search.similar.SimilarShowsViewModel getSimilarShowsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void loadSimilarShows() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void setAllPendingNotAdded() {
    }
    
    @java.lang.Override()
    public void setStateForTmdbId(int showTmdbId, int newState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.uwetrottmann.seriesguide.common.SingleLiveEvent<com.battlelancer.seriesguide.shows.search.discover.SearchResult> getDisplaySimilarShowsEventLiveData() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsFragment$Companion;", "", "()V", "ARG_SHOW_TITLE", "", "ARG_SHOW_TMDB_ID", "MENU_ITEM_SEARCH_ID", "", "displaySimilarShowsEventLiveData", "Lcom/uwetrottmann/seriesguide/common/SingleLiveEvent;", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "getDisplaySimilarShowsEventLiveData$annotations", "getDisplaySimilarShowsEventLiveData", "()Lcom/uwetrottmann/seriesguide/common/SingleLiveEvent;", "newInstance", "Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsFragment;", "showTmdbId", "showTitle", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.uwetrottmann.seriesguide.common.SingleLiveEvent<com.battlelancer.seriesguide.shows.search.discover.SearchResult> getDisplaySimilarShowsEventLiveData() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getDisplaySimilarShowsEventLiveData$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.search.similar.SimilarShowsFragment newInstance(int showTmdbId, @org.jetbrains.annotations.Nullable()
        java.lang.String showTitle) {
            return null;
        }
    }
}