package com.battlelancer.seriesguide.shows.calendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarAdapter2;", "Landroidx/paging/PagingDataAdapter;", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2ViewModel$CalendarItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/battlelancer/seriesguide/ui/AutoGridLayoutManager$SpanCountListener;", "context", "Landroid/content/Context;", "itemClickListener", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarAdapter2$ItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/calendar/CalendarAdapter2$ItemClickListener;)V", "isMultiColumn", "", "()Z", "setMultiColumn", "(Z)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSetSpanCount", "spanCount", "Companion", "ItemClickListener", "app_amazonDebug"})
public final class CalendarAdapter2 extends androidx.paging.PagingDataAdapter<com.battlelancer.seriesguide.shows.calendar.CalendarFragment2ViewModel.CalendarItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements com.battlelancer.seriesguide.ui.AutoGridLayoutManager.SpanCountListener {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.shows.calendar.CalendarAdapter2.ItemClickListener itemClickListener = null;
    private boolean isMultiColumn = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.calendar.CalendarAdapter2.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.shows.calendar.CalendarFragment2ViewModel.CalendarItem> DIFF_CALLBACK = null;
    
    public CalendarAdapter2(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.calendar.CalendarAdapter2.ItemClickListener itemClickListener) {
        super(null, null, null);
    }
    
    public final boolean isMultiColumn() {
        return false;
    }
    
    public final void setMultiColumn(boolean p0) {
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
    
    @java.lang.Override()
    public void onSetSpanCount(int spanCount) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarAdapter2$ItemClickListener;", "", "onItemClick", "", "episodeId", "", "onItemLongClick", "anchor", "Landroid/view/View;", "episode", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;", "onItemWatchBoxClick", "isWatched", "", "app_amazonDebug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClick(long episodeId);
        
        public abstract void onItemLongClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow episode);
        
        public abstract void onItemWatchBoxClick(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow episode, boolean isWatched);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarAdapter2$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2ViewModel$CalendarItem;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.shows.calendar.CalendarFragment2ViewModel.CalendarItem> getDIFF_CALLBACK() {
            return null;
        }
    }
}