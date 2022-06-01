package com.battlelancer.seriesguide.movies.details;

import java.lang.System;

/**
 * Displays details about one movie including plot, ratings, trailers and a poster.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0003LMNB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u001dH\u0016J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u000201H\u0007J\u0010\u00102\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u000203H\u0007J\u0010\u00102\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u000204H\u0007J\u0010\u00105\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u000206H\u0017J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u001dH\u0016J\b\u0010<\u001a\u00020\u001dH\u0016J\b\u0010=\u001a\u00020\u001dH\u0016J\u001a\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010@\u001a\u00020\u001d2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J\b\u0010C\u001a\u00020\u001dH\u0002J\b\u0010D\u001a\u00020\u001dH\u0002J\b\u0010E\u001a\u00020\u001dH\u0002J\u0010\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u000208H\u0002J\u0010\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u000208H\u0002J\u0010\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u000208H\u0002J\b\u0010K\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lcom/battlelancer/seriesguide/movies/details/MovieDetailsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/battlelancer/seriesguide/extensions/MovieActionsContract;", "()V", "_binding", "Lcom/battlelancer/seriesguide/databinding/FragmentMovieBinding;", "binding", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/FragmentMovieBinding;", "loadActionsJob", "Lkotlinx/coroutines/Job;", "model", "Lcom/battlelancer/seriesguide/movies/details/MovieDetailsModel;", "getModel", "()Lcom/battlelancer/seriesguide/movies/details/MovieDetailsModel;", "model$delegate", "Lkotlin/Lazy;", "movieDetails", "Lcom/battlelancer/seriesguide/movies/details/MovieDetails;", "movieLoaderCallbacks", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "movieTitle", "", "tmdbId", "", "trailer", "Lcom/uwetrottmann/tmdb2/entities/Videos$Video;", "trailerLoaderCallbacks", "handleLanguageEvent", "", "event", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationChangedEvent;", "loadMovieActions", "loadMovieActionsDelayed", "onButtonCheckInClick", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onEvent", "Lcom/battlelancer/seriesguide/movies/tools/MovieTools$MovieChangedEvent;", "onEventEpisodeTask", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceActiveEvent;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity$ServiceCompletedEvent;", "onEventMainThread", "Lcom/battlelancer/seriesguide/extensions/ExtensionManager$MovieActionReceivedEvent;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "onStart", "onStop", "onViewCreated", "view", "populateMovieCreditsViews", "credits", "Lcom/uwetrottmann/tmdb2/entities/Credits;", "populateMovieViews", "rateMovie", "restartMovieLoader", "setCastVisibility", "visible", "setCrewVisibility", "setMovieButtonsEnabled", "enabled", "setupViews", "Companion", "ToolbarScrollChangeListener", "WatchedPopupMenuListener", "app_amazonDebug"})
public final class MovieDetailsFragment extends androidx.fragment.app.Fragment implements com.battlelancer.seriesguide.extensions.MovieActionsContract {
    private com.battlelancer.seriesguide.databinding.FragmentMovieBinding _binding;
    private int tmdbId = 0;
    private com.battlelancer.seriesguide.movies.details.MovieDetails movieDetails;
    private java.lang.String movieTitle;
    private com.uwetrottmann.tmdb2.entities.Videos.Video trailer;
    private final kotlin.Lazy model$delegate = null;
    private kotlinx.coroutines.Job loadActionsJob;
    private final androidx.loader.app.LoaderManager.LoaderCallbacks<com.battlelancer.seriesguide.movies.details.MovieDetails> movieLoaderCallbacks = null;
    private final androidx.loader.app.LoaderManager.LoaderCallbacks<com.uwetrottmann.tmdb2.entities.Videos.Video> trailerLoaderCallbacks = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.movies.details.MovieDetailsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_TMDB_ID = "tmdbid";
    
    public MovieDetailsFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.databinding.FragmentMovieBinding getBinding() {
        return null;
    }
    
    private final com.battlelancer.seriesguide.movies.details.MovieDetailsModel getModel() {
        return null;
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
    
    private final void setupViews() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
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
    
    private final void populateMovieViews() {
    }
    
    private final void populateMovieCreditsViews(com.uwetrottmann.tmdb2.entities.Credits credits) {
    }
    
    private final void onButtonCheckInClick() {
    }
    
    @java.lang.Override()
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.extensions.ExtensionManager.MovieActionReceivedEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.tools.MovieTools.MovieChangedEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventEpisodeTask(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.ui.BaseMessageActivity.ServiceActiveEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventEpisodeTask(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.ui.BaseMessageActivity.ServiceCompletedEvent event) {
    }
    
    private final void setMovieButtonsEnabled(boolean enabled) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void handleLanguageEvent(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationChangedEvent event) {
    }
    
    @java.lang.Override()
    public void loadMovieActions() {
    }
    
    @java.lang.Override()
    public void loadMovieActionsDelayed() {
    }
    
    private final void rateMovie() {
    }
    
    private final void setCrewVisibility(boolean visible) {
    }
    
    private final void setCastVisibility(boolean visible) {
    }
    
    private final void restartMovieLoader() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.movies.details.MovieDetailsFragment newInstance(int tmdbId) {
        return null;
    }
    
    /**
     * Menu click listener to watch again (supporters only) or set unwatched.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/movies/details/MovieDetailsFragment$WatchedPopupMenuListener;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "context", "Landroid/content/Context;", "movieTmdbId", "", "plays", "inWatchlist", "", "(Landroid/content/Context;IIZ)V", "getContext", "()Landroid/content/Context;", "getInWatchlist", "()Z", "getMovieTmdbId", "()I", "getPlays", "onMenuItemClick", "item", "Landroid/view/MenuItem;", "app_amazonDebug"})
    static final class WatchedPopupMenuListener implements android.widget.PopupMenu.OnMenuItemClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        private final int movieTmdbId = 0;
        private final int plays = 0;
        private final boolean inWatchlist = false;
        
        public WatchedPopupMenuListener(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int movieTmdbId, int plays, boolean inWatchlist) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final int getMovieTmdbId() {
            return 0;
        }
        
        public final int getPlays() {
            return 0;
        }
        
        public final boolean getInWatchlist() {
            return false;
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/movies/details/MovieDetailsFragment$ToolbarScrollChangeListener;", "Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;", "overlayThresholdPx", "", "titleThresholdPx", "(Lcom/battlelancer/seriesguide/movies/details/MovieDetailsFragment;II)V", "showOverlay", "", "showOverlayMap", "Landroidx/collection/SparseArrayCompat;", "showTitle", "onScrollChange", "", "v", "Landroidx/core/widget/NestedScrollView;", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "app_amazonDebug"})
    final class ToolbarScrollChangeListener implements androidx.core.widget.NestedScrollView.OnScrollChangeListener {
        private final int overlayThresholdPx = 0;
        private final int titleThresholdPx = 0;
        private final androidx.collection.SparseArrayCompat<java.lang.Boolean> showOverlayMap = null;
        private boolean showOverlay = false;
        private boolean showTitle = false;
        
        public ToolbarScrollChangeListener(int overlayThresholdPx, int titleThresholdPx) {
            super();
        }
        
        @java.lang.Override()
        public void onScrollChange(@org.jetbrains.annotations.NotNull()
        androidx.core.widget.NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/movies/details/MovieDetailsFragment$Companion;", "", "()V", "ARG_TMDB_ID", "", "newInstance", "Lcom/battlelancer/seriesguide/movies/details/MovieDetailsFragment;", "tmdbId", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.movies.details.MovieDetailsFragment newInstance(int tmdbId) {
            return null;
        }
    }
}