package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

/**
 * Displays a list of episodes of a season.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\nH\u0002J\u0018\u0010/\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u00172\u0006\u00100\u001a\u00020\nH\u0002J\u0018\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u00172\u0006\u00102\u001a\u00020\nH\u0002J\u0010\u00103\u001a\u00020\n2\u0006\u00104\u001a\u000205H\u0016J\u001a\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u0019H\u0002J\u000e\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0019J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u0019H\u0002J\u0010\u0010>\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0019H\u0002J\b\u0010?\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter;", "binding", "Lcom/battlelancer/seriesguide/databinding/FragmentEpisodesBinding;", "collectedAllClickListener", "Landroid/view/View$OnClickListener;", "collectedAllEpisodes", "", "episodesListClickListener", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter$ClickListener;", "model", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/episodes/EpisodesViewModel;", "model$delegate", "Lkotlin/Lazy;", "onSortOrderChangedListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "scrollToCheckedItemOnDataRefresh", "seasonId", "", "startingPosition", "", "watchedAllClickListener", "watchedAllEpisodes", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onFlagEpisodeCollected", "episodeId", "isCollected", "onFlagEpisodeSkipped", "isSkipped", "onFlagEpisodeWatched", "isWatched", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "setCollectedToggleState", "uncollectedEpisodes", "setItemChecked", "position", "setWatchedToggleState", "unwatchedEpisodes", "showDetails", "showSortDialog", "Companion", "app_pureDebug"})
public final class EpisodesFragment extends androidx.fragment.app.Fragment {
    private long seasonId = 0L;
    private int startingPosition = 0;
    private boolean scrollToCheckedItemOnDataRefresh = false;
    private boolean watchedAllEpisodes = false;
    private boolean collectedAllEpisodes = false;
    private com.battlelancer.seriesguide.databinding.FragmentEpisodesBinding binding;
    private com.battlelancer.seriesguide.shows.episodes.EpisodesAdapter adapter;
    private final kotlin.Lazy model$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.episodes.EpisodesFragment.Companion Companion = null;
    private static final java.lang.String ARG_LONG_SEASON_ID = "season_id";
    private static final java.lang.String ARG_INT_STARTING_POSITION = "starting_position";
    private static final int CONTEXT_WATCHED_ALL = 1;
    private static final int CONTEXT_WATCHED_NONE = 2;
    private static final int CONTEXT_COLLECTED_ALL = 3;
    private static final int CONTEXT_COLLECTED_NONE = 4;
    private final com.battlelancer.seriesguide.shows.episodes.EpisodesAdapter.ClickListener episodesListClickListener = null;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener onSortOrderChangedListener = null;
    private final android.view.View.OnClickListener watchedAllClickListener = null;
    private final android.view.View.OnClickListener collectedAllClickListener = null;
    
    public EpisodesFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.episodes.EpisodesViewModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.shows.episodes.EpisodesFragment newInstance(long seasonId, int startingPosition) {
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
    
    /**
     * Display the episode at the given position in the detail pane, highlight it in the list.
     */
    private final void showDetails(int position) {
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
    
    private final void onFlagEpisodeWatched(long episodeId, boolean isWatched) {
    }
    
    private final void onFlagEpisodeSkipped(long episodeId, boolean isSkipped) {
    }
    
    private final void onFlagEpisodeCollected(long episodeId, boolean isCollected) {
    }
    
    private final void showSortDialog() {
    }
    
    /**
     * Highlight the given episode in the list.
     */
    public final void setItemChecked(int position) {
    }
    
    private final void setWatchedToggleState(int unwatchedEpisodes) {
    }
    
    private final void setCollectedToggleState(int uncollectedEpisodes) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodesFragment$Companion;", "", "()V", "ARG_INT_STARTING_POSITION", "", "ARG_LONG_SEASON_ID", "CONTEXT_COLLECTED_ALL", "", "CONTEXT_COLLECTED_NONE", "CONTEXT_WATCHED_ALL", "CONTEXT_WATCHED_NONE", "newInstance", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesFragment;", "seasonId", "", "startingPosition", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodesFragment newInstance(long seasonId, int startingPosition) {
            return null;
        }
    }
}