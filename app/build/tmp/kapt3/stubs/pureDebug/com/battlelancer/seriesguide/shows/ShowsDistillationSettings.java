package com.battlelancer.seriesguide.shows;

import java.lang.System;

/**
 * Provides settings used to filter and sort displayed shows in [ShowsFragment].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002/0B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\b\u0017J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\b!\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\b#\u0010\u001fJ\u0019\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\b%\u0010\u001fJ\u0019\u0010&\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\b\'\u0010\u001fJ\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\b(JG\u0010)\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0007\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u0004*\u0004\u0018\u00010\u001bH\u0002\u00a2\u0006\u0002\u0010-J\u0013\u0010,\u001a\u0004\u0018\u00010\u001b*\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010.R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0080T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsDistillationSettings;", "", "()V", "FILTER_DISABLED", "", "FILTER_EXCLUDE", "FILTER_INCLUDE", "KEY_FILTER_CONTINUING", "", "KEY_FILTER_FAVORITES", "KEY_FILTER_HIDDEN", "KEY_FILTER_UNWATCHED", "KEY_FILTER_UPCOMING", "KEY_SORT_FAVORITES_FIRST", "KEY_SORT_ORDER", "filterLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "sortOrderLiveData", "Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;", "getSortOrderId", "context", "Landroid/content/Context;", "getSortOrderId$app_pureDebug", "getSortQuery2", "sortOrderId", "isSortFavoritesFirst", "", "isSortIgnoreArticles", "isFilteringContinuing", "isFilteringContinuing$app_pureDebug", "(Landroid/content/Context;)Ljava/lang/Boolean;", "isFilteringFavorites", "isFilteringFavorites$app_pureDebug", "isFilteringHidden", "isFilteringHidden$app_pureDebug", "isFilteringUnwatched", "isFilteringUnwatched$app_pureDebug", "isFilteringUpcoming", "isFilteringUpcoming$app_pureDebug", "isSortFavoritesFirst$app_pureDebug", "saveFilter", "", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "mapFilterState", "(Ljava/lang/Boolean;)I", "(I)Ljava/lang/Boolean;", "SgShow2SortQuery", "ShowsSortOrder", "app_pureDebug"})
public final class ShowsDistillationSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.ShowsDistillationSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter> filterLiveData = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder> sortOrderLiveData = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SORT_ORDER = "com.battlelancer.seriesguide.sort.order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SORT_FAVORITES_FIRST = "com.battlelancer.seriesguide.sort.favoritesfirst";
    private static final java.lang.String KEY_FILTER_FAVORITES = "seriesguide.show_filter.favorites";
    private static final java.lang.String KEY_FILTER_UNWATCHED = "seriesguide.show_filter.unwatched";
    private static final java.lang.String KEY_FILTER_UPCOMING = "seriesguide.show_filter.upcoming";
    private static final java.lang.String KEY_FILTER_HIDDEN = "seriesguide.show_filter.hidden";
    private static final java.lang.String KEY_FILTER_CONTINUING = "seriesguide.show_filter.continuing";
    private static final int FILTER_INCLUDE = 1;
    private static final int FILTER_EXCLUDE = -1;
    private static final int FILTER_DISABLED = 0;
    
    private ShowsDistillationSettings() {
        super();
    }
    
    /**
     * Builds an appropriate SQL sort statement for sorting SgShow2 table results.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getSortQuery2(int sortOrderId, boolean isSortFavoritesFirst, boolean isSortIgnoreArticles) {
        return null;
    }
    
    /**
     * Returns the id as of [ShowsDistillationSettings.ShowsSortOrder]
     * of the current show sort order.
     */
    public final int getSortOrderId$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final boolean isSortFavoritesFirst$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFilteringFavorites$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFilteringUnwatched$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFilteringUpcoming$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFilteringHidden$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFilteringContinuing$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void saveFilter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFilteringFavorites, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFilteringUnwatched, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFilteringUpcoming, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFilteringHidden, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFilteringContinuing) {
    }
    
    private final java.lang.Boolean mapFilterState(int $this$mapFilterState) {
        return null;
    }
    
    private final int mapFilterState(java.lang.Boolean $this$mapFilterState) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsDistillationSettings$SgShow2SortQuery;", "", "()V", "FAVORITES_FIRST", "", "LAST_WATCHED", "LATEST_EPISODE", "OLDEST_EPISODE", "REMAINING_EPISODES", "STATUS", "app_pureDebug"})
    static final class SgShow2SortQuery {
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.shows.ShowsDistillationSettings.SgShow2SortQuery INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OLDEST_EPISODE = "series_nextairdate ASC,series_status DESC,";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LATEST_EPISODE = "series_nextairdate DESC,series_status DESC,";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LAST_WATCHED = "series_lastwatched_ms DESC,";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REMAINING_EPISODES = "series_unwatched_count ASC,series_status DESC,";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String STATUS = "series_status DESC,";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FAVORITES_FIRST = "series_favorite DESC,";
        
        private SgShow2SortQuery() {
            super();
        }
    }
    
    /**
     * Used by [ShowsFragment] loader and various others to determine sort order of shows.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsDistillationSettings$ShowsSortOrder;", "", "()V", "LAST_WATCHED_ID", "", "LATEST_EPISODE_ID", "LEAST_REMAINING_EPISODES_ID", "OLDEST_EPISODE_ID", "STATUS", "TITLE_ID", "app_pureDebug"})
    public static final class ShowsSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.shows.ShowsDistillationSettings.ShowsSortOrder INSTANCE = null;
        public static final int TITLE_ID = 0;
        public static final int OLDEST_EPISODE_ID = 2;
        public static final int LATEST_EPISODE_ID = 3;
        public static final int LAST_WATCHED_ID = 4;
        public static final int LEAST_REMAINING_EPISODES_ID = 5;
        public static final int STATUS = 6;
        
        private ShowsSortOrder() {
            super();
        }
    }
}