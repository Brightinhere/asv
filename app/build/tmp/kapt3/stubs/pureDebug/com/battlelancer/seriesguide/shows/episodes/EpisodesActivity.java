package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

/**
 * Hosts a fragment which displays episodes of a season in a list and in a view pager.
 * On small screens only one is visible at a time, on larger screens they are shown side-by-side.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 S2\u00020\u0001:\u0001SB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u0002012\u0006\u00109\u001a\u00020:H\u0007J\u0010\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u000201H\u0014J\u0010\u0010?\u001a\u0002012\u0006\u0010@\u001a\u000204H\u0014J\b\u0010A\u001a\u000201H\u0014J\b\u0010B\u001a\u000201H\u0014J\b\u0010C\u001a\u000201H\u0002J\u000e\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020FJ\b\u0010G\u001a\u000201H\u0014J\b\u0010H\u001a\u000201H\u0002J\u0018\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!H\u0002J\u0018\u0010L\u001a\u0002012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020FH\u0002J\u0010\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020RH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010#R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivity;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity;", "()V", "backgroundImageView", "Landroid/widget/ImageView;", "getBackgroundImageView", "()Landroid/widget/ImageView;", "setBackgroundImageView", "(Landroid/widget/ImageView;)V", "containerList", "Landroid/view/ViewGroup;", "getContainerList", "()Landroid/view/ViewGroup;", "setContainerList", "(Landroid/view/ViewGroup;)V", "containerPager", "episodeDetailsAdapter", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodePagerAdapter;", "episodeDetailsPager", "Landroidx/viewpager2/widget/ViewPager2;", "getEpisodeDetailsPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setEpisodeDetailsPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "episodeDetailsTabs", "Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "getEpisodeDetailsTabs", "()Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "setEpisodeDetailsTabs", "(Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;)V", "episodesListFragment", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesFragment;", "hasTappedItemInSinglePaneView", "", "isListGone", "()Z", "isListVisibleInSinglePaneView", "isSinglePaneView", "isViewingSeason", "onPageChangeListener", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onSortOrderChangedListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "seasonId", "", "showId", "viewModel", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onEvent", "event", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceCompletedEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onSaveInstanceState", "outState", "onStart", "onStop", "reorderAndUpdateTabs", "setCurrentPage", "position", "", "setupActionBar", "setupViews", "switchView", "makeListVisible", "updateOptionsMenu", "updateActionBar", "showTitle", "", "seasonNumber", "updateViews", "info", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivityViewModel$EpisodeSeasonAndShowInfo;", "Companion", "app_pureDebug"})
public final class EpisodesActivity extends com.battlelancer.seriesguide.ui.BaseMessageActivity {
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.fragment_episodes)
    public android.view.ViewGroup containerList;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.containerEpisodesPager)
    public android.view.ViewGroup containerPager;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.pagerEpisodes)
    public androidx.viewpager2.widget.ViewPager2 episodeDetailsPager;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.tabsEpisodes)
    public com.uwetrottmann.seriesguide.widgets.SlidingTabLayout episodeDetailsTabs;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.imageViewEpisodesBackground)
    public android.widget.ImageView backgroundImageView;
    private com.battlelancer.seriesguide.shows.episodes.EpisodesFragment episodesListFragment;
    private com.battlelancer.seriesguide.shows.episodes.EpisodePagerAdapter episodeDetailsAdapter;
    private com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel viewModel;
    private long showId = 0L;
    private long seasonId = 0L;
    
    /**
     * Keeps list visibility even in multi-pane view.
     */
    private boolean isListVisibleInSinglePaneView = false;
    
    /**
     * Remembers if pager was shown due to tap on list item.
     */
    private boolean hasTappedItemInSinglePaneView = false;
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeListener = null;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener onSortOrderChangedListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.episodes.EpisodesActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_LONG_SEASON_ID = "season_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LONG_EPISODE_ID = "episode_id";
    
    /**
     * Either this or [EXTRA_EPISODE_TVDBID] is required.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String EXTRA_SEASON_TVDBID = "season_tvdbid";
    
    /**
     * Either this or [EXTRA_SEASON_TVDBID] is required.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String EXTRA_EPISODE_TVDBID = "episode_tvdbid";
    private static final java.lang.String PREF_PREFER_LIST_TO_VIEW_SEASON = "com.uwetrottmann.seriesguide.episodes.preferlist";
    private static final java.lang.String STATE_IS_LIST_VISIBLE = "STATE_IS_LIST_VISIBLE";
    private static final java.lang.String STATE_HAS_TAPPED_ITEM_SINGLE_PANE = "STATE_HAS_TAPPED_ITEM_SINGLE_PANE";
    public static final int EPISODES_LOADER_ID = 100;
    public static final int EPISODE_LOADER_ID = 101;
    public static final int ACTIONS_LOADER_ID = 102;
    
    public EpisodesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getContainerList() {
        return null;
    }
    
    public final void setContainerList(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.viewpager2.widget.ViewPager2 getEpisodeDetailsPager() {
        return null;
    }
    
    public final void setEpisodeDetailsPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.widgets.SlidingTabLayout getEpisodeDetailsTabs() {
        return null;
    }
    
    public final void setEpisodeDetailsTabs(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.widgets.SlidingTabLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getBackgroundImageView() {
        return null;
    }
    
    public final void setBackgroundImageView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    private final boolean isSinglePaneView() {
        return false;
    }
    
    private final boolean isListGone() {
        return false;
    }
    
    private final boolean isViewingSeason() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    private final void updateActionBar(java.lang.String showTitle, int seasonNumber) {
    }
    
    private final void switchView(boolean makeListVisible, boolean updateOptionsMenu) {
    }
    
    private final void setupViews() {
    }
    
    private final void updateViews(com.battlelancer.seriesguide.shows.episodes.EpisodesActivityViewModel.EpisodeSeasonAndShowInfo info) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    /**
     * Switch to the episode at the given position.
     */
    public final void setCurrentPage(int position) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.ui.BaseMessageActivity.ServiceCompletedEvent event) {
    }
    
    private final void reorderAndUpdateTabs() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intentSeason(long seasonRowId, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intentEpisode(long episodeRowId, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesActivity$Companion;", "", "()V", "ACTIONS_LOADER_ID", "", "EPISODES_LOADER_ID", "EPISODE_LOADER_ID", "EXTRA_EPISODE_TVDBID", "", "getEXTRA_EPISODE_TVDBID$annotations", "EXTRA_LONG_EPISODE_ID", "EXTRA_LONG_SEASON_ID", "EXTRA_SEASON_TVDBID", "getEXTRA_SEASON_TVDBID$annotations", "PREF_PREFER_LIST_TO_VIEW_SEASON", "STATE_HAS_TAPPED_ITEM_SINGLE_PANE", "STATE_IS_LIST_VISIBLE", "intentEpisode", "Landroid/content/Intent;", "episodeRowId", "", "context", "Landroid/content/Context;", "intentSeason", "seasonRowId", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Either this or [EXTRA_EPISODE_TVDBID] is required.
         */
        @java.lang.Deprecated()
        public static void getEXTRA_SEASON_TVDBID$annotations() {
        }
        
        /**
         * Either this or [EXTRA_SEASON_TVDBID] is required.
         */
        @java.lang.Deprecated()
        public static void getEXTRA_EPISODE_TVDBID$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intentSeason(long seasonRowId, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intentEpisode(long episodeRowId, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}