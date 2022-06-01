package com.battlelancer.seriesguide.history;

import java.lang.System;

/**
 * Displays a stream of activities that can be refreshed by the user via a swipe gesture (or an
 * action item).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH$J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010!\u001a\u00020\rH$J\b\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\r2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010$\u001a\u00020%J\u0010\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u001cH\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006-"}, d2 = {"Lcom/battlelancer/seriesguide/history/StreamFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/battlelancer/seriesguide/databinding/FragmentStreamBinding;", "binding", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/FragmentStreamBinding;", "listAdapter", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter;", "getListAdapter", "()Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter;", "initializeStream", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "refreshStream", "refreshStreamWithNetworkCheck", "setEmptyMessage", "emptyMessage", "", "setListData", "data", "", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "showProgressBar", "isShowing", "Companion", "app_pureDebug"})
public abstract class StreamFragment extends androidx.fragment.app.Fragment {
    private com.battlelancer.seriesguide.databinding.FragmentStreamBinding _binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.history.StreamFragment.Companion Companion = null;
    private static final java.lang.String TRAKT_HISTORY_URL = "https://trakt.tv/users/me/history/";
    
    public StreamFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.databinding.FragmentStreamBinding getBinding() {
        return null;
    }
    
    /**
     * Implementers should create their history adapter here.
     */
    @org.jetbrains.annotations.NotNull()
    protected abstract com.battlelancer.seriesguide.history.BaseHistoryAdapter getListAdapter();
    
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
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void refreshStreamWithNetworkCheck() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    /**
     * Submits data and an sets empty message to be shown if the data list is empty.
     */
    public final void setListData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> data, @org.jetbrains.annotations.NotNull()
    java.lang.String emptyMessage) {
    }
    
    private final void setEmptyMessage(java.lang.String emptyMessage) {
    }
    
    /**
     * Implementers should initialize the activity stream and supply the results to the grid
     * adapter.
     */
    protected abstract void initializeStream();
    
    /**
     * Implementers should refresh the activity stream and replace the data of the grid adapter.
     * Once finished you should hide the progress bar with [.showProgressBar].
     */
    protected abstract void refreshStream();
    
    /**
     * Show or hide the progress bar of the [SwipeRefreshLayout]
     * wrapping the stream view.
     */
    protected final void showProgressBar(boolean isShowing) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/history/StreamFragment$Companion;", "", "()V", "TRAKT_HISTORY_URL", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}