package com.battlelancer.seriesguide.shows.search;

import java.lang.System;

/**
 * Displays episode search results.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/EpisodeSearchAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2SearchResult;", "context", "Landroid/content/Context;", "clickListener", "Lcom/battlelancer/seriesguide/shows/search/EpisodeSearchAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/search/EpisodeSearchAdapter$OnItemClickListener;)V", "getView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "setData", "", "data", "", "OnItemClickListener", "app_pureDebug"})
public final class EpisodeSearchAdapter extends android.widget.ArrayAdapter<com.battlelancer.seriesguide.shows.database.SgEpisode2SearchResult> {
    private final com.battlelancer.seriesguide.shows.search.EpisodeSearchAdapter.OnItemClickListener clickListener = null;
    
    public EpisodeSearchAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.EpisodeSearchAdapter.OnItemClickListener clickListener) {
        super(null, 0);
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2SearchResult> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/EpisodeSearchAdapter$OnItemClickListener;", "", "onItemClick", "", "anchor", "Landroid/view/View;", "episodeId", "", "app_pureDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, long episodeId);
    }
}