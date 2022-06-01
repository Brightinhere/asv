package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c\u001d\u001eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/ShowsAdapter$OnItemClickListener;)V", "displayFirstRunHeader", "", "getDisplayFirstRunHeader", "()Z", "setDisplayFirstRunHeader", "(Z)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "", "Companion", "OnItemClickListener", "ShowItem", "app_amazonDebug"})
public final class ShowsAdapter extends androidx.recyclerview.widget.ListAdapter<com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.shows.ShowsAdapter.OnItemClickListener onItemClickListener = null;
    private boolean displayFirstRunHeader = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.ShowsAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_FIRST_RUN = 1;
    public static final int VIEW_TYPE_SHOW_ITEM = 2;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem> DIFF_CALLBACK = null;
    
    public ShowsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.ShowsAdapter.OnItemClickListener onItemClickListener) {
        super(null);
    }
    
    public final boolean getDisplayFirstRunHeader() {
        return false;
    }
    
    public final void setDisplayFirstRunHeader(boolean p0) {
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem> list) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsAdapter$OnItemClickListener;", "", "onItemClick", "", "anchor", "Landroid/view/View;", "showRowId", "", "onItemMenuClick", "show", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "onItemSetWatchedClick", "app_amazonDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, long showRowId);
        
        public abstract void onItemMenuClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem show);
        
        public abstract void onItemSetWatchedClick(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem show);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\fH\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\u0098\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0005H\u00d6\u0001J\t\u00105\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0018R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015\u00a8\u00067"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "", "rowId", "", "showTvdbId", "", "nextEpisodeId", "hasNextEpisode", "", "isFavorite", "isHidden", "name", "", "timeAndNetwork", "episode", "episodeTime", "remainingCount", "posterPath", "isHeader", "(JLjava/lang/Integer;JZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEpisode", "()Ljava/lang/String;", "getEpisodeTime", "getHasNextEpisode", "()Z", "getName", "getNextEpisodeId", "()J", "getPosterPath", "getRemainingCount", "getRowId", "getShowTvdbId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeAndNetwork", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/Integer;JZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "equals", "other", "hashCode", "toString", "Companion", "app_amazonDebug"})
    public static final class ShowItem {
        private final long rowId = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer showTvdbId = null;
        private final long nextEpisodeId = 0L;
        private final boolean hasNextEpisode = false;
        private final boolean isFavorite = false;
        private final boolean isHidden = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String timeAndNetwork = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String episode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String episodeTime = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String remainingCount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String posterPath = null;
        private final boolean isHeader = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem HEADER_FIRST_RUN = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem copy(long rowId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer showTvdbId, long nextEpisodeId, boolean hasNextEpisode, boolean isFavorite, boolean isHidden, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String timeAndNetwork, @org.jetbrains.annotations.NotNull()
        java.lang.String episode, @org.jetbrains.annotations.Nullable()
        java.lang.String episodeTime, @org.jetbrains.annotations.Nullable()
        java.lang.String remainingCount, @org.jetbrains.annotations.Nullable()
        java.lang.String posterPath, boolean isHeader) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowItem(long rowId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer showTvdbId, long nextEpisodeId, boolean hasNextEpisode, boolean isFavorite, boolean isHidden, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String timeAndNetwork, @org.jetbrains.annotations.NotNull()
        java.lang.String episode, @org.jetbrains.annotations.Nullable()
        java.lang.String episodeTime, @org.jetbrains.annotations.Nullable()
        java.lang.String remainingCount, @org.jetbrains.annotations.Nullable()
        java.lang.String posterPath, boolean isHeader) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRowId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getShowTvdbId() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getNextEpisodeId() {
            return 0L;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getHasNextEpisode() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isFavorite() {
            return false;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean isHidden() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTimeAndNetwork() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEpisode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEpisodeTime() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRemainingCount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPosterPath() {
            return null;
        }
        
        public final boolean component13() {
            return false;
        }
        
        public final boolean isHeader() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem$Companion;", "", "()V", "HEADER_FIRST_RUN", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "getHEADER_FIRST_RUN", "()Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "header", "map", "sgShow", "Lcom/battlelancer/seriesguide/shows/database/SgShow2ForLists;", "context", "Landroid/content/Context;", "app_amazonDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem getHEADER_FIRST_RUN() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem header() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem map(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.database.SgShow2ForLists sgShow, @org.jetbrains.annotations.NotNull()
            android.content.Context context) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$ShowItem;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "VIEW_TYPE_FIRST_RUN", "", "VIEW_TYPE_SHOW_ITEM", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.shows.ShowsAdapter.ShowItem> getDIFF_CALLBACK() {
            return null;
        }
    }
}