package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverFilterAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider;", "Lcom/battlelancer/seriesguide/shows/search/discover/SgWatchProviderViewHolder;", "clickListener", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverFilterAdapter$ClickListener;", "(Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverFilterAdapter$ClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickListener", "app_pureDebug"})
public final class ShowsDiscoverFilterAdapter extends androidx.paging.PagingDataAdapter<com.battlelancer.seriesguide.streaming.SgWatchProvider, com.battlelancer.seriesguide.shows.search.discover.SgWatchProviderViewHolder> {
    private final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverFilterAdapter.ClickListener clickListener = null;
    
    public ShowsDiscoverFilterAdapter(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverFilterAdapter.ClickListener clickListener) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.shows.search.discover.SgWatchProviderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.SgWatchProviderViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverFilterAdapter$ClickListener;", "", "onClick", "", "watchProvider", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider;", "app_pureDebug"})
    public static abstract interface ClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.streaming.SgWatchProvider watchProvider);
    }
}