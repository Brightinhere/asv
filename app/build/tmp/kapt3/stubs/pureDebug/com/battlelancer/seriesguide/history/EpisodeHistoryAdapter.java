package com.battlelancer.seriesguide.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012H\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/history/EpisodeHistoryAdapter;", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter;", "context", "Landroid/content/Context;", "itemClickListener", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;)V", "localShowPosters", "Landroidx/collection/SparseArrayCompat;", "", "onBindHistoryItemViewHolder", "", "holder", "Lcom/battlelancer/seriesguide/history/HistoryItemViewHolder;", "item", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "submitList", "list", "", "app_pureDebug"})
public final class EpisodeHistoryAdapter extends com.battlelancer.seriesguide.history.BaseHistoryAdapter {
    private androidx.collection.SparseArrayCompat<java.lang.String> localShowPosters;
    
    public EpisodeHistoryAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.BaseHistoryAdapter.OnItemClickListener itemClickListener) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> list) {
    }
    
    @java.lang.Override()
    public void onBindHistoryItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.HistoryItemViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem item) {
    }
}