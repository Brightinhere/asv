package com.battlelancer.seriesguide.shows.search;

import java.lang.System;

/**
 * Display show search results.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/battlelancer/seriesguide/shows/database/SgShow2ForLists;", "context", "Landroid/content/Context;", "listener", "Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$OnItemClickListener;)V", "drawableStar", "Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;", "drawableStarZero", "getView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "setData", "", "data", "", "OnItemClickListener", "ShowViewHolder", "app_amazonDebug"})
public final class ShowSearchAdapter extends android.widget.ArrayAdapter<com.battlelancer.seriesguide.shows.database.SgShow2ForLists> {
    private final com.battlelancer.seriesguide.shows.search.ShowSearchAdapter.OnItemClickListener listener = null;
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat drawableStar = null;
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat drawableStarZero = null;
    
    public ShowSearchAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.ShowSearchAdapter.OnItemClickListener listener) {
        super(null, 0);
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2ForLists> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$OnItemClickListener;", "", "onFavoriteClick", "", "showId", "", "isFavorite", "", "onItemClick", "anchor", "Landroid/view/View;", "viewHolder", "Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$ShowViewHolder;", "onMenuClick", "app_amazonDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.ShowSearchAdapter.ShowViewHolder viewHolder);
        
        public abstract void onMenuClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.ShowSearchAdapter.ShowViewHolder viewHolder);
        
        public abstract void onFavoriteClick(long showId, boolean isFavorite);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0018\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0011H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$ShowViewHolder;", "", "v", "Landroid/view/View;", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$OnItemClickListener;", "drawableStar", "Landroid/graphics/drawable/Drawable;", "drawableStarZero", "(Landroid/view/View;Lcom/battlelancer/seriesguide/shows/search/ShowSearchAdapter$OnItemClickListener;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "contextMenu", "Landroid/widget/ImageView;", "episode", "Landroid/widget/TextView;", "episodeTime", "favorited", "isFavorited", "", "()Z", "setFavorited", "(Z)V", "isHidden", "setHidden", "name", "poster", "remainingCount", "showId", "", "getShowId", "()J", "setShowId", "(J)V", "timeAndNetwork", "bindTo", "", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2ForLists;", "context", "Landroid/content/Context;", "setFavoriteState", "view", "isFavorite", "app_amazonDebug"})
    public static final class ShowViewHolder {
        private final android.graphics.drawable.Drawable drawableStar = null;
        private final android.graphics.drawable.Drawable drawableStarZero = null;
        private final android.widget.TextView name = null;
        private final android.widget.TextView timeAndNetwork = null;
        private final android.widget.TextView episode = null;
        private final android.widget.TextView episodeTime = null;
        private final android.widget.TextView remainingCount = null;
        private final android.widget.ImageView poster = null;
        private final android.widget.ImageView favorited = null;
        private final android.widget.ImageView contextMenu = null;
        private long showId = 0L;
        private boolean isFavorited = false;
        private boolean isHidden = false;
        
        public ShowViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.ShowSearchAdapter.OnItemClickListener onItemClickListener, @org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable drawableStar, @org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable drawableStarZero) {
            super();
        }
        
        public final long getShowId() {
            return 0L;
        }
        
        public final void setShowId(long p0) {
        }
        
        public final boolean isFavorited() {
            return false;
        }
        
        public final void setFavorited(boolean p0) {
        }
        
        public final boolean isHidden() {
            return false;
        }
        
        public final void setHidden(boolean p0) {
        }
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgShow2ForLists show, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final void setFavoriteState(android.widget.ImageView view, boolean isFavorite) {
        }
    }
}