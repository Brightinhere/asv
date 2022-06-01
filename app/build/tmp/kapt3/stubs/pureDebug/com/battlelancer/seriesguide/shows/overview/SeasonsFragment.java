package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

/**
 * Displays a list of seasons of one show.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 F2\u00020\u0001:\u0001FB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J$\u0010&\u001a\u00020\'2\u0006\u0010$\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/H\u0007J\u0018\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\rH\u0002J\u0010\u00103\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u0003H\u0002J\u0018\u00104\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u00032\u0006\u00105\u001a\u00020\rH\u0002J\u0010\u00106\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\rH\u0002J\u0010\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\rH\u0002J\u0010\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u001bH\u0016J\b\u0010<\u001a\u00020\u001bH\u0016J\u001a\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\'2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020\u001bH\u0002J\b\u0010E\u001a\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsFragment;", "Landroidx/fragment/app/Fragment;", "showId", "", "(J)V", "()V", "adapter", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter;", "binding", "Lcom/battlelancer/seriesguide/databinding/FragmentSeasonsBinding;", "collectedAllClickListener", "Landroid/view/View$OnClickListener;", "collectedAllEpisodes", "", "listOnItemClickListener", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsAdapter$ItemClickListener;", "model", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/overview/SeasonsViewModel;", "model$delegate", "Lkotlin/Lazy;", "onSortOrderChangedListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "watchedAllClickListener", "watchedAllEpisodes", "handleRemainingCountUpdate", "", "result", "Lcom/battlelancer/seriesguide/shows/overview/RemainingCountLiveData$Result;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onEvent", "event", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceCompletedEvent;", "onFlagSeasonCollected", "seasonId", "isCollected", "onFlagSeasonSkipped", "onFlagSeasonWatched", "isWatched", "onFlagShowCollected", "onFlagShowWatched", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "onStop", "onViewCreated", "view", "setCollectedToggleState", "uncollectedEpisodes", "", "setWatchedToggleState", "unwatchedEpisodes", "showSortDialog", "updateUnwatchedCounts", "Companion", "app_pureDebug"})
public final class SeasonsFragment extends androidx.fragment.app.Fragment {
    private com.battlelancer.seriesguide.databinding.FragmentSeasonsBinding binding;
    private com.battlelancer.seriesguide.shows.overview.SeasonsAdapter adapter;
    private final kotlin.Lazy model$delegate = null;
    private boolean watchedAllEpisodes = false;
    private boolean collectedAllEpisodes = false;
    private long showId = 0L;
    private final com.battlelancer.seriesguide.shows.overview.SeasonsAdapter.ItemClickListener listOnItemClickListener = null;
    private final android.view.View.OnClickListener watchedAllClickListener = null;
    private final android.view.View.OnClickListener collectedAllClickListener = null;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener onSortOrderChangedListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.overview.SeasonsFragment.Companion Companion = null;
    private static final java.lang.String ARG_LONG_SHOW_ROW_ID = "show_id";
    private static final int CONTEXT_WATCHED_SHOW_ALL_ID = 0;
    private static final int CONTEXT_WATCHED_SHOW_NONE_ID = 1;
    private static final int CONTEXT_COLLECTED_SHOW_ALL_ID = 2;
    private static final int CONTEXT_COLLECTED_SHOW_NONE_ID = 3;
    
    public SeasonsFragment() {
        super();
    }
    
    public SeasonsFragment(long showId) {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.overview.SeasonsViewModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * Updates the total remaining episodes counter, updates season counters after episode actions.
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.ui.BaseMessageActivity.ServiceCompletedEvent event) {
    }
    
    private final void onFlagSeasonSkipped(long seasonId) {
    }
    
    /**
     * Changes the seasons episodes watched flags, updates the status label of the season.
     */
    private final void onFlagSeasonWatched(long seasonId, boolean isWatched) {
    }
    
    /**
     * Changes the seasons episodes collected flags.
     */
    private final void onFlagSeasonCollected(long seasonId, boolean isCollected) {
    }
    
    /**
     * Changes the watched flag for all episodes of the given show, updates the status labels of all
     * seasons.
     */
    private final void onFlagShowWatched(boolean isWatched) {
    }
    
    /**
     * Changes the collected flag for all episodes of the given show, updates the status labels of
     * all seasons.
     */
    private final void onFlagShowCollected(boolean isCollected) {
    }
    
    /**
     * Update unwatched stats for all seasons of this fragments show. If finished worker
     * notifies provider causing the loader to reload.
     */
    private final void updateUnwatchedCounts() {
    }
    
    private final void handleRemainingCountUpdate(com.battlelancer.seriesguide.shows.overview.RemainingCountLiveData.Result result) {
    }
    
    private final void setWatchedToggleState(int unwatchedEpisodes) {
    }
    
    private final void setCollectedToggleState(int uncollectedEpisodes) {
    }
    
    private final void showSortDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.os.Bundle buildArgs(long showId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsFragment$Companion;", "", "()V", "ARG_LONG_SHOW_ROW_ID", "", "CONTEXT_COLLECTED_SHOW_ALL_ID", "", "CONTEXT_COLLECTED_SHOW_NONE_ID", "CONTEXT_WATCHED_SHOW_ALL_ID", "CONTEXT_WATCHED_SHOW_NONE_ID", "buildArgs", "Landroid/os/Bundle;", "showId", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.os.Bundle buildArgs(long showId) {
            return null;
        }
    }
}