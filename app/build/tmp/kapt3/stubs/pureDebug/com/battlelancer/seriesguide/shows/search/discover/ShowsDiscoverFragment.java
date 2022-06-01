package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

/**
 * Displays a list of shows with new episodes with links to popular shows and if connected to trakt
 * also with links to recommendations, watched and collected shows. If a search event is received,
 * displays search results. If a link is clicked launches a new activity to display them.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\'\u001a\u00020&H\u0002J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0012\u0010+\u001a\u00020&2\b\b\u0002\u0010,\u001a\u00020-H\u0002J\u0012\u0010.\u001a\u00020&2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00101\u001a\u00020&2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00104\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u0010;\u001a\u00020&H\u0016J\u0010\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020>H\u0007J\u0010\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020?H\u0007J\u0010\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020&2\u0006\u0010D\u001a\u000200H\u0016J\u0010\u0010E\u001a\u00020&2\u0006\u0010=\u001a\u00020FH\u0007J\u001a\u0010G\u001a\u00020&2\u0006\u0010H\u001a\u0002072\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u0010I\u001a\u00020&H\u0016J\u0018\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020LH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverFragment;", "Lcom/battlelancer/seriesguide/shows/search/discover/BaseAddShowsFragment;", "()V", "KEY_QUERY", "", "adapter", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter;", "discoverItemClickListener", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;", "emptyView", "Lcom/battlelancer/seriesguide/ui/widgets/EmptyView;", "getEmptyView", "()Lcom/battlelancer/seriesguide/ui/widgets/EmptyView;", "setEmptyView", "(Lcom/battlelancer/seriesguide/ui/widgets/EmptyView;)V", "languageCode", "model", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverViewModel;", "model$delegate", "Lkotlin/Lazy;", "query", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "swipeRefreshLayout", "Lcom/uwetrottmann/seriesguide/widgets/EmptyViewSwipeRefreshLayout;", "getSwipeRefreshLayout", "()Lcom/uwetrottmann/seriesguide/widgets/EmptyViewSwipeRefreshLayout;", "setSwipeRefreshLayout", "(Lcom/uwetrottmann/seriesguide/widgets/EmptyViewSwipeRefreshLayout;)V", "unbinder", "Lbutterknife/Unbinder;", "changeLanguage", "", "displayLanguageSettings", "handleResultsUpdate", "result", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverLiveData$Result;", "loadResults", "forceLoad", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onEventMainThread", "event", "Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl$SearchQuerySubmitEvent;", "Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment$LanguageChangedEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onTabClickEvent", "Lcom/battlelancer/seriesguide/util/TabClickEvent;", "onViewCreated", "view", "setAllPendingNotAdded", "setStateForTmdbId", "showTmdbId", "", "newState", "app_pureDebug"})
public final class ShowsDiscoverFragment extends com.battlelancer.seriesguide.shows.search.discover.BaseAddShowsFragment {
    private final java.lang.String KEY_QUERY = "searchQuery";
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.swipeRefreshLayoutShowsDiscover)
    public com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout swipeRefreshLayout;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.recyclerViewShowsDiscover)
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.emptyViewShowsDiscover)
    public com.battlelancer.seriesguide.ui.widgets.EmptyView emptyView;
    private butterknife.Unbinder unbinder;
    private com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverAdapter adapter;
    private final kotlin.Lazy model$delegate = null;
    
    /**
     * Two letter ISO 639-1 language code.
     */
    private java.lang.String languageCode;
    private java.lang.String query = "";
    private final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverAdapter.OnItemClickListener discoverItemClickListener = null;
    
    public ShowsDiscoverFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout getSwipeRefreshLayout() {
        return null;
    }
    
    public final void setSwipeRefreshLayout(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.ui.widgets.EmptyView getEmptyView() {
        return null;
    }
    
    public final void setEmptyView(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.ui.widgets.EmptyView p0) {
    }
    
    private final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverViewModel getModel() {
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
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.SearchActivityImpl.SearchQuerySubmitEvent event) {
    }
    
    private final void loadResults(boolean forceLoad) {
    }
    
    private final void handleResultsUpdate(com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverLiveData.Result result) {
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
    
    private final void displayLanguageSettings() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.ui.dialogs.L10nDialogFragment.LanguageChangedEvent event) {
    }
    
    private final void changeLanguage(java.lang.String languageCode) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onTabClickEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.util.TabClickEvent event) {
    }
    
    @java.lang.Override()
    public void setAllPendingNotAdded() {
    }
    
    @java.lang.Override()
    public void setStateForTmdbId(int showTmdbId, int newState) {
    }
}