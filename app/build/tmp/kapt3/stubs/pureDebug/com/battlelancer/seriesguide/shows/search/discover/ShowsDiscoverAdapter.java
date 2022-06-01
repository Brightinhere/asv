package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005$%&\'(B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0006\u0010\u001d\u001a\u00020\u0017J\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012J\u001e\u0010!\u001a\u00020\u00172\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "itemClickListener", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;", "showMenuWatchlist", "", "hideMenuWatchlistIfAdded", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;ZZ)V", "links", "", "Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsLink;", "searchResults", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "showOnlyResults", "getItemCount", "", "getItemViewType", "position", "getSearchResultFor", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAllPendingNotAdded", "setStateForTmdbId", "showTmdbId", "state", "updateSearchResults", "newSearchResults", "", "Companion", "HeaderViewHolder", "LinkViewHolder", "OnItemClickListener", "ShowViewHolder", "app_pureDebug"})
public final class ShowsDiscoverAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverAdapter.OnItemClickListener itemClickListener = null;
    private final boolean showMenuWatchlist = false;
    private final boolean hideMenuWatchlistIfAdded = false;
    private final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> searchResults = null;
    private final java.util.List<com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink> links = null;
    private boolean showOnlyResults = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_LINK = com.battlelancer.seriesguide.R.layout.item_grid_link;
    public static final int VIEW_TYPE_HEADER = com.battlelancer.seriesguide.R.layout.item_grid_header;
    public static final int VIEW_TYPE_SHOW = com.battlelancer.seriesguide.R.layout.item_addshow;
    
    public ShowsDiscoverAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverAdapter.OnItemClickListener itemClickListener, boolean showMenuWatchlist, boolean hideMenuWatchlistIfAdded) {
        super();
    }
    
    public final void updateSearchResults(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> newSearchResults, boolean showOnlyResults) {
    }
    
    public final void setStateForTmdbId(int showTmdbId, int state) {
    }
    
    public final void setAllPendingNotAdded() {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final com.battlelancer.seriesguide.shows.search.discover.SearchResult getSearchResultFor(int position) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;", "", "onAddClick", "", "item", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "onItemClick", "onLinkClick", "anchor", "Landroid/view/View;", "link", "Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsLink;", "onMenuWatchlistClick", "view", "showTmdbId", "", "app_pureDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onLinkClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink link);
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.SearchResult item);
        
        public abstract void onAddClick(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.SearchResult item);
        
        public abstract void onMenuWatchlistClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, int showTmdbId);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$LinkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;", "(Landroid/view/View;Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;)V", "link", "Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsLink;", "getLink", "()Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsLink;", "setLink", "(Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsLink;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "app_pureDebug"})
    public static final class LinkViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink link;
        @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewGridLink)
        public android.widget.TextView title;
        
        public LinkViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink getLink() {
            return null;
        }
        
        public final void setLink(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "header", "Landroid/widget/TextView;", "getHeader", "()Landroid/widget/TextView;", "setHeader", "(Landroid/widget/TextView;)V", "app_pureDebug"})
    public static final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewGridHeader)
        public android.widget.TextView header;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getHeader() {
            return null;
        }
        
        public final void setHeader(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001e\u0010\"\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018\u00a8\u0006%"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$ShowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;", "(Landroid/view/View;Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$OnItemClickListener;)V", "addIndicator", "Lcom/battlelancer/seriesguide/shows/search/discover/AddIndicator;", "getAddIndicator", "()Lcom/battlelancer/seriesguide/shows/search/discover/AddIndicator;", "setAddIndicator", "(Lcom/battlelancer/seriesguide/shows/search/discover/AddIndicator;)V", "buttonContextMenu", "Landroid/widget/ImageView;", "getButtonContextMenu", "()Landroid/widget/ImageView;", "setButtonContextMenu", "(Landroid/widget/ImageView;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "setDescription", "(Landroid/widget/TextView;)V", "item", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "getItem", "()Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "setItem", "(Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;)V", "poster", "getPoster", "setPoster", "title", "getTitle", "setTitle", "app_pureDebug"})
    public static final class ShowViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public com.battlelancer.seriesguide.shows.search.discover.SearchResult item;
        @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewAddTitle)
        public android.widget.TextView title;
        @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewAddDescription)
        public android.widget.TextView description;
        @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.imageViewAddPoster)
        public android.widget.ImageView poster;
        @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.addIndicatorAddShow)
        public com.battlelancer.seriesguide.shows.search.discover.AddIndicator addIndicator;
        @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonItemAddMore)
        public android.widget.ImageView buttonContextMenu;
        
        public ShowViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.search.discover.SearchResult getItem() {
            return null;
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.SearchResult p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getPoster() {
            return null;
        }
        
        public final void setPoster(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.search.discover.AddIndicator getAddIndicator() {
            return null;
        }
        
        public final void setAddIndicator(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.AddIndicator p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getButtonContextMenu() {
            return null;
        }
        
        public final void setButtonContextMenu(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverAdapter$Companion;", "", "()V", "VIEW_TYPE_HEADER", "", "VIEW_TYPE_LINK", "VIEW_TYPE_SHOW", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}