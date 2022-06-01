package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsDistillationPageAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "initialShowFilter", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "filterListener", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$FilterListener;", "initialShowSortOrder", "Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;", "sortOrderListener", "Lcom/battlelancer/seriesguide/shows/SortShowsView$SortOrderListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;Lcom/battlelancer/seriesguide/shows/FilterShowsView$FilterListener;Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;Lcom/battlelancer/seriesguide/shows/SortShowsView$SortOrderListener;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "pageObject", "", "getCount", "getPageTitle", "", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "DistillationPages", "app_amazonDebug"})
public final class ShowsDistillationPageAdapter extends androidx.viewpager.widget.PagerAdapter {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter initialShowFilter = null;
    private final com.battlelancer.seriesguide.shows.FilterShowsView.FilterListener filterListener = null;
    private final com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder initialShowSortOrder = null;
    private final com.battlelancer.seriesguide.shows.SortShowsView.SortOrderListener sortOrderListener = null;
    
    public ShowsDistillationPageAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter initialShowFilter, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.FilterShowsView.FilterListener filterListener, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder initialShowSortOrder, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.SortShowsView.SortOrderListener sortOrderListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object pageObject) {
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object pageObject) {
        return false;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsDistillationPageAdapter$DistillationPages;", "", "titleRes", "", "(Ljava/lang/String;II)V", "getTitleRes", "()I", "FILTER", "SORT", "app_amazonDebug"})
    public static enum DistillationPages {
        /*public static final*/ FILTER /* = new FILTER(0) */,
        /*public static final*/ SORT /* = new SORT(0) */;
        private final int titleRes = 0;
        
        DistillationPages(@androidx.annotation.StringRes()
        int titleRes) {
        }
        
        public final int getTitleRes() {
            return 0;
        }
    }
}