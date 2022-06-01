package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

/**
 * Hosts an [OverviewFragment], [ShowFragment] and [SeasonsFragment] in a view pager on
 * small screens or pane layout on larger screens.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u000fH\u0014J\b\u0010%\u001a\u00020\u000fH\u0002J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020\u0013H\u0002J\u0012\u0010(\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/OverviewActivityImpl;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity;", "()V", "activeFragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "getActiveFragments", "()Ljava/util/ArrayList;", "fragments", "", "Ljava/lang/ref/WeakReference;", "showId", "", "findAndRemoveFragment", "", "fragmentId", "", "getSnackbarParentView", "Landroid/view/View;", "launchSearch", "onAttachFragment", "fragment", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onEventMainThread", "event", "Lcom/battlelancer/seriesguide/shows/tools/ShowTools2$OnRemovingShowEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupActionBar", "setupPanes", "setupViewPager", "pagerView", "setupViews", "Companion", "app_amazonDebug"})
public class OverviewActivityImpl extends com.battlelancer.seriesguide.ui.BaseMessageActivity {
    private long showId = 0L;
    private java.util.List<java.lang.ref.WeakReference<androidx.fragment.app.Fragment>> fragments;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.overview.OverviewActivityImpl.Companion Companion = null;
    public static final int OVERVIEW_ACTIONS_LOADER_ID = 104;
    
    /**
     * Used by legacy shortcuts.
     */
    private static final java.lang.String EXTRA_INT_SHOW_TVDBID = "show_tvdbid";
    
    /**
     * Used by shortcuts.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_INT_SHOW_TMDBID = "show_tmdbid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LONG_SHOW_ROWID = "show_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_BOOLEAN_DISPLAY_SEASONS = "EXTRA_DISPLAY_SEASONS";
    
    public OverviewActivityImpl() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    private final void setupViews(android.os.Bundle savedInstanceState) {
    }
    
    private final void setupPanes() {
    }
    
    private final void setupViewPager(android.view.View pagerView) {
    }
    
    private final void findAndRemoveFragment(int fragmentId) {
    }
    
    @java.lang.Override()
    public void onAttachFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<androidx.fragment.app.Fragment> getActiveFragments() {
        return null;
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
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.tools.ShowTools2.OnRemovingShowEvent event) {
    }
    
    private final void launchSearch() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View getSnackbarParentView() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/OverviewActivityImpl$Companion;", "", "()V", "EXTRA_BOOLEAN_DISPLAY_SEASONS", "", "EXTRA_INT_SHOW_TMDBID", "EXTRA_INT_SHOW_TVDBID", "EXTRA_LONG_SHOW_ROWID", "OVERVIEW_ACTIONS_LOADER_ID", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}