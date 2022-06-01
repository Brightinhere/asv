package com.battlelancer.seriesguide.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/history/HistoryItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/battlelancer/seriesguide/databinding/ItemHistoryBinding;", "itemClickListener", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;", "(Lcom/battlelancer/seriesguide/databinding/ItemHistoryBinding;Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;)V", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/ItemHistoryBinding;", "historyEntry", "Lcom/uwetrottmann/trakt5/entities/HistoryEntry;", "bindCommon", "", "item", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "previousItem", "drawableWatched", "Landroid/graphics/drawable/Drawable;", "drawableCheckIn", "isMultiColumn", "", "bindToEpisode", "localShowPosters", "Landroidx/collection/SparseArrayCompat;", "", "bindToMovie", "Companion", "app_amazonDebug"})
public final class HistoryItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.databinding.ItemHistoryBinding binding = null;
    private com.uwetrottmann.trakt5.entities.HistoryEntry historyEntry;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.history.HistoryItemViewHolder.Companion Companion = null;
    
    public HistoryItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.databinding.ItemHistoryBinding binding, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.BaseHistoryAdapter.OnItemClickListener itemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.databinding.ItemHistoryBinding getBinding() {
        return null;
    }
    
    public final void bindCommon(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem item, @org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem previousItem, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableWatched, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableCheckIn, boolean isMultiColumn) {
    }
    
    public final void bindToEpisode(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.entities.HistoryEntry item, @org.jetbrains.annotations.Nullable()
    androidx.collection.SparseArrayCompat<java.lang.String> localShowPosters) {
    }
    
    public final void bindToMovie(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.entities.HistoryEntry item) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/history/HistoryItemViewHolder$Companion;", "", "()V", "areContentsTheSame", "", "oldItem", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "newItem", "inflate", "Lcom/battlelancer/seriesguide/history/HistoryItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "itemClickListener", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.history.HistoryItemViewHolder inflate(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.history.BaseHistoryAdapter.OnItemClickListener itemClickListener) {
            return null;
        }
        
        public final boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem oldItem, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem newItem) {
            return false;
        }
    }
}