package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

/**
 * Provides a list of seasons.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ViewHolder;", "context", "Landroid/content/Context;", "itemClickListener", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemClickListener", "ViewHolder", "app_amazonDebug"})
public final class SeasonsAdapter extends androidx.recyclerview.widget.ListAdapter<com.battlelancer.seriesguide.shows.database.SgSeason2, com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ItemClickListener itemClickListener = null;
    
    public SeasonsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ItemClickListener itemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ItemClickListener;", "", "onItemClick", "", "v", "Landroid/view/View;", "seasonRowId", "", "onPopupMenuClick", "app_amazonDebug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View v, long seasonRowId);
        
        public abstract void onPopupMenuClick(@org.jetbrains.annotations.NotNull()
        android.view.View v, long seasonRowId);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/battlelancer/seriesguide/databinding/ItemSeasonBinding;", "itemClickListener", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ItemClickListener;", "(Lcom/battlelancer/seriesguide/databinding/ItemSeasonBinding;Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ItemClickListener;)V", "isRtlLayout", "", "season", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "bindTo", "", "context", "Landroid/content/Context;", "Companion", "app_amazonDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.battlelancer.seriesguide.databinding.ItemSeasonBinding binding = null;
        private final boolean isRtlLayout = false;
        private com.battlelancer.seriesguide.shows.database.SgSeason2 season;
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ViewHolder.Companion Companion = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.databinding.ItemSeasonBinding binding, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ItemClickListener itemClickListener) {
            super(null);
        }
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgSeason2 season, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ViewHolder$Companion;", "", "()V", "inflate", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "itemClickListener", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ItemClickListener;", "app_amazonDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ViewHolder inflate(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ItemClickListener itemClickListener) {
                return null;
            }
        }
    }
}