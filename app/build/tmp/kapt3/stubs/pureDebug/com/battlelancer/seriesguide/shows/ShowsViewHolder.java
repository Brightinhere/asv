package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$OnItemClickListener;", "(Landroid/view/View;Lcom/battlelancer/seriesguide/shows/ShowsAdapter$OnItemClickListener;)V", "contextMenu", "Landroid/widget/ImageView;", "episode", "Landroid/widget/TextView;", "episodeTime", "favorited", "name", "poster", "remainingCount", "setWatchedButton", "showItem", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "timeAndNetwork", "bind", "", "show", "context", "Landroid/content/Context;", "Companion", "app_pureDebug"})
public final class ShowsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView name = null;
    private final android.widget.TextView timeAndNetwork = null;
    private final android.widget.TextView episode = null;
    private final android.widget.TextView episodeTime = null;
    private final android.widget.TextView remainingCount = null;
    private final android.widget.ImageView poster = null;
    private final android.widget.ImageView favorited = null;
    private final android.widget.ImageView setWatchedButton = null;
    private final android.widget.ImageView contextMenu = null;
    private com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem showItem;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.ShowsViewHolder.Companion Companion = null;
    
    public ShowsViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.ShowsAdapter.OnItemClickListener onItemClickListener) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem show, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsViewHolder$Companion;", "", "()V", "create", "Lcom/battlelancer/seriesguide/shows/ShowsViewHolder;", "parent", "Landroid/view/ViewGroup;", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$OnItemClickListener;", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.ShowsViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.ShowsAdapter.OnItemClickListener onItemClickListener) {
            return null;
        }
    }
}