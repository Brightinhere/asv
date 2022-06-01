package com.battlelancer.seriesguide.lists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/lists/SgListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/battlelancer/seriesguide/databinding/ItemShowBinding;", "onItemClickListener", "Lcom/battlelancer/seriesguide/lists/SgListItemAdapter$OnItemClickListener;", "drawableStar", "Landroid/graphics/drawable/Drawable;", "drawableStarZero", "(Lcom/battlelancer/seriesguide/databinding/ItemShowBinding;Lcom/battlelancer/seriesguide/lists/SgListItemAdapter$OnItemClickListener;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "item", "Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "getItem", "()Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "setItem", "(Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;)V", "bindTo", "", "context", "Landroid/content/Context;", "setRemainingCount", "unwatched", "", "app_pureDebug"})
public final class SgListItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.battlelancer.seriesguide.databinding.ItemShowBinding binding = null;
    private final android.graphics.drawable.Drawable drawableStar = null;
    private final android.graphics.drawable.Drawable drawableStarZero = null;
    @org.jetbrains.annotations.Nullable()
    private com.battlelancer.seriesguide.lists.database.SgListItemWithDetails item;
    
    public SgListItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.databinding.ItemShowBinding binding, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.lists.SgListItemAdapter.OnItemClickListener onItemClickListener, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableStar, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableStarZero) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.battlelancer.seriesguide.lists.database.SgListItemWithDetails getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.lists.database.SgListItemWithDetails p0) {
    }
    
    public final void bindTo(@org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.lists.database.SgListItemWithDetails item, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void setRemainingCount(int unwatched) {
    }
}