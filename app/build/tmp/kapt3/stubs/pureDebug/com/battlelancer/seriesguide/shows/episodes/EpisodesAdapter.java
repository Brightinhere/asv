package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Info;", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodeViewHolder;", "context", "Landroid/content/Context;", "clickListener", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter$ClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter$ClickListener;)V", "selectedItemId", "", "getSelectedItemId", "()J", "setSelectedItemId", "(J)V", "getItemId", "position", "", "getPositionForId", "itemId", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "selectItem", "ClickListener", "app_pureDebug"})
public final class EpisodesAdapter extends androidx.recyclerview.widget.ListAdapter<com.battlelancer.seriesguide.shows.database.SgEpisode2Info, com.battlelancer.seriesguide.shows.episodes.EpisodeViewHolder> {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.shows.episodes.EpisodesAdapter.ClickListener clickListener = null;
    private long selectedItemId = -1L;
    
    public EpisodesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.episodes.EpisodesAdapter.ClickListener clickListener) {
        super(null);
    }
    
    public final long getSelectedItemId() {
        return 0L;
    }
    
    public final void setSelectedItemId(long p0) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.shows.episodes.EpisodeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.episodes.EpisodeViewHolder holder, int position) {
    }
    
    /**
     * Returns -1 if the item ID was not found in the [getCurrentList].
     */
    public final int getPositionForId(long itemId) {
        return 0;
    }
    
    public final long selectItem(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J8\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000fH&\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter$ClickListener;", "", "onItemClick", "", "position", "", "onPopupMenuClick", "v", "Landroid/view/View;", "episodeId", "", "episodeNumber", "releaseTimeMs", "watchedFlag", "isCollected", "", "onWatchedBoxClick", "isWatched", "app_pureDebug"})
    public static abstract interface ClickListener {
        
        public abstract void onItemClick(int position);
        
        public abstract void onWatchedBoxClick(long episodeId, boolean isWatched);
        
        public abstract void onPopupMenuClick(@org.jetbrains.annotations.NotNull()
        android.view.View v, long episodeId, int episodeNumber, long releaseTimeMs, int watchedFlag, boolean isCollected);
    }
}