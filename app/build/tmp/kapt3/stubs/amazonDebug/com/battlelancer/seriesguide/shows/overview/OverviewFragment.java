package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

/**
 * Displays general information about a show and, if there is one, the next episode to watch.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0001XB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0002J\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\u0012\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\b\u00101\u001a\u00020\u001dH\u0002J\b\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\u0012\u00104\u001a\u00020\u001d2\b\u00105\u001a\u0004\u0018\u000106H\u0016J$\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010<\u001a\u00020\u001dH\u0016J\b\u0010=\u001a\u00020\u001dH\u0016J\u0012\u0010>\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u00010@H\u0007J\u0012\u0010>\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u00010AH\u0007J\u0010\u0010B\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020CH\u0017J\b\u0010D\u001a\u00020\u001dH\u0016J\b\u0010E\u001a\u00020\u001dH\u0016J\u001a\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010H\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010I\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010J\u001a\u00020KH\u0002J\u0018\u0010L\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010M\u001a\u00020NH\u0002J+\u0010O\u001a\u00020\u001d2!\u0010P\u001a\u001d\u0012\u0013\u0012\u00110K\u00a2\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u001d0QH\u0002J\u0010\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u0011H\u0002J\b\u0010V\u001a\u00020\u001dH\u0002J\u001a\u0010W\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010KH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/OverviewFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/battlelancer/seriesguide/extensions/EpisodeActionsContract;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/FragmentOverviewBinding;", "episodeActionsLoaderCallbacks", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "", "Lcom/battlelancer/seriesguide/api/Action;", "episodeActionsRunnable", "Ljava/lang/Runnable;", "feedbackView", "Lcom/battlelancer/seriesguide/shows/overview/FeedbackView;", "handler", "Landroid/os/Handler;", "hasSetEpisodeWatched", "", "model", "Lcom/battlelancer/seriesguide/shows/overview/OverviewViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/overview/OverviewViewModel;", "model$delegate", "Lkotlin/Lazy;", "ratingFetchJob", "Lkotlinx/coroutines/Job;", "showId", "", "changeEpisodeFlag", "", "episodeFlag", "", "createCalendarEvent", "hideFeedbackView", "loadEpisodeActions", "loadEpisodeActionsDelayed", "loadEpisodeDetails", "loadEpisodeImage", "imageView", "Landroid/widget/ImageView;", "imagePath", "", "maybeAddFeedbackView", "onButtonCheckInClick", "onButtonCollectedClick", "onButtonCommentsClick", "v", "Landroid/view/View;", "onButtonFavoriteClick", "onButtonRateClick", "onButtonSkipClicked", "onButtonWatchedClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onEventEpisodeTask", "event", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceActiveEvent;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceCompletedEvent;", "onEventMainThread", "Lcom/battlelancer/seriesguide/extensions/ExtensionManager$EpisodeActionReceivedEvent;", "onPause", "onResume", "onViewCreated", "view", "populateEpisodeDescriptionAndTvdbButton", "populateEpisodeViews", "episode", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "populateShowViews", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "runIfHasEpisode", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "setEpisodeButtonsEnabled", "enabled", "shareEpisode", "updateEpisodeViews", "Companion", "app_amazonDebug"})
public final class OverviewFragment extends androidx.fragment.app.Fragment implements com.battlelancer.seriesguide.extensions.EpisodeActionsContract {
    private com.battlelancer.seriesguide.databinding.FragmentOverviewBinding binding;
    
    /**
     * Inflated on demand from ViewStub.
     */
    private com.battlelancer.seriesguide.shows.overview.FeedbackView feedbackView;
    private final android.os.Handler handler = null;
    private kotlinx.coroutines.Job ratingFetchJob;
    private final kotlin.Lazy model$delegate = null;
    private long showId = 0L;
    private boolean hasSetEpisodeWatched = false;
    private java.lang.Runnable episodeActionsRunnable;
    private final androidx.loader.app.LoaderManager.LoaderCallbacks<java.util.List<com.battlelancer.seriesguide.api.Action>> episodeActionsLoaderCallbacks = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.overview.OverviewFragment.Companion Companion = null;
    private static final java.lang.String ARG_LONG_SHOW_ROWID = "show_id";
    private static final java.lang.String ARG_EPISODE_ID = "episode_id";
    
    public OverviewFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.overview.OverviewViewModel getModel() {
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
    
    private final void createCalendarEvent() {
    }
    
    private final void onButtonFavoriteClick() {
    }
    
    private final void onButtonCheckInClick() {
    }
    
    private final void onButtonWatchedClick() {
    }
    
    private final void onButtonCollectedClick() {
    }
    
    private final void onButtonSkipClicked() {
    }
    
    private final void changeEpisodeFlag(int episodeFlag) {
    }
    
    private final void onButtonRateClick() {
    }
    
    private final void onButtonCommentsClick(android.view.View v) {
    }
    
    private final void shareEpisode() {
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
    
    private final void updateEpisodeViews(com.battlelancer.seriesguide.databinding.FragmentOverviewBinding binding, com.battlelancer.seriesguide.shows.database.SgEpisode2 episode) {
    }
    
    private final void populateEpisodeViews(com.battlelancer.seriesguide.databinding.FragmentOverviewBinding binding, com.battlelancer.seriesguide.shows.database.SgEpisode2 episode) {
    }
    
    /**
     * Updates the episode description and TVDB button. Need both show and episode data loaded.
     */
    private final void populateEpisodeDescriptionAndTvdbButton(com.battlelancer.seriesguide.databinding.FragmentOverviewBinding binding) {
    }
    
    @java.lang.Override()
    public void loadEpisodeActions() {
    }
    
    @java.lang.Override()
    public void loadEpisodeActionsDelayed() {
    }
    
    private final void loadEpisodeImage(android.widget.ImageView imageView, java.lang.String imagePath) {
    }
    
    private final void loadEpisodeDetails() {
    }
    
    private final void populateShowViews(com.battlelancer.seriesguide.databinding.FragmentOverviewBinding binding, com.battlelancer.seriesguide.shows.database.SgShow2 show) {
    }
    
    private final void runIfHasEpisode(kotlin.jvm.functions.Function1<? super com.battlelancer.seriesguide.shows.database.SgEpisode2, kotlin.Unit> block) {
    }
    
    private final void maybeAddFeedbackView(com.battlelancer.seriesguide.databinding.FragmentOverviewBinding binding) {
    }
    
    private final void hideFeedbackView() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/OverviewFragment$Companion;", "", "()V", "ARG_EPISODE_ID", "", "ARG_LONG_SHOW_ROWID", "buildArgs", "Landroid/os/Bundle;", "showRowId", "", "newInstance", "Lcom/battlelancer/seriesguide/shows/overview/OverviewFragment;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle buildArgs(long showRowId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.overview.OverviewFragment newInstance(long showRowId) {
            return null;
        }
    }
}