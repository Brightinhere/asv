package com.battlelancer.seriesguide.lists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListItemAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "Lcom/battlelancer/seriesguide/lists/SgListItemViewHolder;", "context", "Landroid/content/Context;", "onItemClickListener", "Lcom/battlelancer/seriesguide/lists/SgListItemAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/lists/SgListItemAdapter$OnItemClickListener;)V", "drawableStar", "Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;", "drawableStarZero", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "OnItemClickListener", "app_pureDebug"})
public final class SgListItemAdapter extends androidx.recyclerview.widget.ListAdapter<com.battlelancer.seriesguide.lists.database.SgListItemWithDetails, com.battlelancer.seriesguide.lists.SgListItemViewHolder> {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.lists.SgListItemAdapter.OnItemClickListener onItemClickListener = null;
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat drawableStar = null;
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat drawableStarZero = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.lists.SgListItemAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.lists.database.SgListItemWithDetails> DIFF_CALLBACK = null;
    
    public SgListItemAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.lists.SgListItemAdapter.OnItemClickListener onItemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.lists.SgListItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.lists.SgListItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListItemAdapter$OnItemClickListener;", "", "onFavoriteClick", "", "showId", "", "isFavorite", "", "onItemClick", "anchor", "Landroid/view/View;", "item", "Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "onMenuClick", "app_pureDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.lists.database.SgListItemWithDetails item);
        
        public abstract void onMenuClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.lists.database.SgListItemWithDetails item);
        
        public abstract void onFavoriteClick(long showId, boolean isFavorite);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListItemAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.lists.database.SgListItemWithDetails> getDIFF_CALLBACK() {
            return null;
        }
    }
}