package com.battlelancer.seriesguide.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002!\"B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H&J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001aH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/battlelancer/seriesguide/ui/AutoGridLayoutManager$SpanCountListener;", "context", "Landroid/content/Context;", "itemClickListener", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;)V", "getContext", "()Landroid/content/Context;", "drawableCheckIn", "Landroid/graphics/drawable/Drawable;", "drawableWatched", "isMultiColumn", "", "getItemClickListener", "()Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;", "onBindHistoryItemViewHolder", "", "holder", "Lcom/battlelancer/seriesguide/history/HistoryItemViewHolder;", "item", "onBindViewHolder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSetSpanCount", "spanCount", "Companion", "OnItemClickListener", "app_amazonDebug"})
public abstract class BaseHistoryAdapter extends androidx.recyclerview.widget.ListAdapter<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements com.battlelancer.seriesguide.ui.AutoGridLayoutManager.SpanCountListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.history.BaseHistoryAdapter.OnItemClickListener itemClickListener = null;
    private android.graphics.drawable.Drawable drawableWatched;
    private android.graphics.drawable.Drawable drawableCheckIn;
    private boolean isMultiColumn = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.history.BaseHistoryAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> DIFF_CALLBACK = null;
    
    public BaseHistoryAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.BaseHistoryAdapter.OnItemClickListener itemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.history.BaseHistoryAdapter.OnItemClickListener getItemClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public abstract void onBindHistoryItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.HistoryItemViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem item);
    
    @java.lang.Override()
    public void onSetSpanCount(int spanCount) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "item", "Lcom/uwetrottmann/trakt5/entities/HistoryEntry;", "app_amazonDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.uwetrottmann.trakt5.entities.HistoryEntry item);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}