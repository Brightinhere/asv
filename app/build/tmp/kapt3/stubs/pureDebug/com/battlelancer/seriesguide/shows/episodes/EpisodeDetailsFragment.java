package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

/**
 * Displays details about a single episode like summary, ratings and episode image if available.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020-H\u0016J\u001a\u00100\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u00010\u001d2\u0006\u00102\u001a\u00020\u0015H\u0002J\b\u00103\u001a\u00020-H\u0002J\u0012\u00104\u001a\u00020-2\b\u00105\u001a\u0004\u0018\u000106H\u0016J$\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010=\u001a\u00020-H\u0016J\b\u0010>\u001a\u00020-H\u0016J\u0012\u0010?\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u00010AH\u0007J\u0012\u0010?\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u00010BH\u0007J\u0010\u0010C\u001a\u00020-2\u0006\u0010@\u001a\u00020DH\u0017J\b\u0010E\u001a\u00020-H\u0016J\b\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020-H\u0002J\b\u0010H\u001a\u00020-H\u0002J\b\u0010I\u001a\u00020-H\u0002J\u001a\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u0002082\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0018\u0010L\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010M\u001a\u00020-H\u0002J\u0010\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020\u0015H\u0002J\b\u0010P\u001a\u00020-H\u0002J\u0018\u0010Q\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010R\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodeDetailsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/battlelancer/seriesguide/extensions/EpisodeActionsContract;", "()V", "actionsLoaderCallbacks", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "", "Lcom/battlelancer/seriesguide/api/Action;", "actionsRunnable", "Ljava/lang/Runnable;", "binding", "Lcom/battlelancer/seriesguide/databinding/LayoutEpisodeBinding;", "bindingActions", "Lcom/battlelancer/seriesguide/databinding/ButtonsServicesBinding;", "bindingBottom", "Lcom/battlelancer/seriesguide/databinding/ButtonsEpisodeMoreBinding;", "bindingButtons", "Lcom/battlelancer/seriesguide/databinding/ButtonsEpisodeBinding;", "bindingRatings", "Lcom/battlelancer/seriesguide/databinding/RatingsShowsBinding;", "collected", "", "episode", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "episodeFlag", "", "episodeId", "", "episodeTitle", "", "handler", "Landroid/os/Handler;", "model", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodeDetailsViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/episodes/EpisodeDetailsViewModel;", "model$delegate", "Lkotlin/Lazy;", "ratingFetchJob", "Lkotlinx/coroutines/Job;", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "watchedEpisodePopupMenuListener", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "changeEpisodeFlag", "", "loadEpisodeActions", "loadEpisodeActionsDelayed", "loadImage", "imagePath", "hideDetails", "loadTraktRatings", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onEventEpisodeTask", "event", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceActiveEvent;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceCompletedEvent;", "onEventMainThread", "Lcom/battlelancer/seriesguide/extensions/ExtensionManager$EpisodeActionReceivedEvent;", "onPause", "onResume", "onToggleCollected", "onToggleSkipped", "onToggleWatched", "onViewCreated", "view", "populateEpisodeData", "rateEpisode", "setEpisodeButtonsEnabled", "enabled", "shareEpisode", "updatePrimaryButtons", "updateSecondaryButtons", "Companion", "app_pureDebug"})
public final class EpisodeDetailsFragment extends androidx.fragment.app.Fragment implements com.battlelancer.seriesguide.extensions.EpisodeActionsContract {
    private final android.os.Handler handler = null;
    private kotlinx.coroutines.Job ratingFetchJob;
    private long episodeId = 0L;
    private com.battlelancer.seriesguide.shows.database.SgEpisode2 episode;
    private com.battlelancer.seriesguide.shows.database.SgShow2 show;
    private java.lang.String episodeTitle;
    private int episodeFlag = 0;
    private boolean collected = false;
    private com.battlelancer.seriesguide.databinding.LayoutEpisodeBinding binding;
    private com.battlelancer.seriesguide.databinding.ButtonsEpisodeBinding bindingButtons;
    private com.battlelancer.seriesguide.databinding.RatingsShowsBinding bindingRatings;
    private com.battlelancer.seriesguide.databinding.ButtonsServicesBinding bindingActions;
    private com.battlelancer.seriesguide.databinding.ButtonsEpisodeMoreBinding bindingBottom;
    private final kotlin.Lazy model$delegate = null;
    private final android.widget.PopupMenu.OnMenuItemClickListener watchedEpisodePopupMenuListener = null;
    private final androidx.loader.app.LoaderManager.LoaderCallbacks<java.util.List<com.battlelancer.seriesguide.api.Action>> actionsLoaderCallbacks = null;
    private java.lang.Runnable actionsRunnable;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.episodes.EpisodeDetailsFragment.Companion Companion = null;
    private static final java.lang.String ARG_LONG_EPISODE_ID = "episode_id";
    private static final java.lang.String KEY_EPISODE_ID = "episode_id";
    
    public EpisodeDetailsFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.episodes.EpisodeDetailsViewModel getModel() {
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
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * If episode was watched, flags as unwatched. Otherwise, flags as watched.
     */
    private final void onToggleWatched() {
    }
    
    /**
     * If episode was skipped, flags as unwatched. Otherwise, flags as skipped.
     */
    private final void onToggleSkipped() {
    }
    
    private final void changeEpisodeFlag(int episodeFlag) {
    }
    
    private final void onToggleCollected() {
    }
    
    @java.lang.Override()
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.extensions.ExtensionManager.EpisodeActionReceivedEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventEpisodeTask(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.ui.BaseMessageActivity.ServiceActiveEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventEpisodeTask(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.ui.BaseMessageActivity.ServiceCompletedEvent event) {
    }
    
    private final void setEpisodeButtonsEnabled(boolean enabled) {
    }
    
    private final void populateEpisodeData(com.battlelancer.seriesguide.shows.database.SgEpisode2 episode, com.battlelancer.seriesguide.shows.database.SgShow2 show) {
    }
    
    private final void updatePrimaryButtons(com.battlelancer.seriesguide.shows.database.SgEpisode2 episode, com.battlelancer.seriesguide.shows.database.SgShow2 show) {
    }
    
    private final void updateSecondaryButtons(com.battlelancer.seriesguide.shows.database.SgEpisode2 episode, com.battlelancer.seriesguide.shows.database.SgShow2 show) {
    }
    
    private final void loadTraktRatings() {
    }
    
    private final void rateEpisode() {
    }
    
    private final void shareEpisode() {
    }
    
    private final void loadImage(java.lang.String imagePath, boolean hideDetails) {
    }
    
    @java.lang.Override()
    public void loadEpisodeActions() {
    }
    
    @java.lang.Override()
    public void loadEpisodeActionsDelayed() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodeDetailsFragment$Companion;", "", "()V", "ARG_LONG_EPISODE_ID", "", "KEY_EPISODE_ID", "newInstance", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodeDetailsFragment;", "episodeId", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodeDetailsFragment newInstance(long episodeId) {
            return null;
        }
    }
}