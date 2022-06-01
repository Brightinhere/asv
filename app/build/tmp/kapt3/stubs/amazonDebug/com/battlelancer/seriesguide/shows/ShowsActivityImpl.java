package com.battlelancer.seriesguide.shows;

import java.lang.System;

/**
 * Provides the apps main screen, displays tabs for shows, history, recent and upcoming episodes.
 * Runs upgrade code and checks billing state.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0003234B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0011H\u0014J\b\u0010+\u001a\u00020\u0011H\u0014J\b\u0010,\u001a\u00020\u0011H\u0014J\b\u0010-\u001a\u00020\u0011H\u0002J\u0012\u0010.\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u00100\u001a\u00020\u0011H\u0014J\b\u00101\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsActivityImpl;", "Lcom/battlelancer/seriesguide/ui/BaseTopActivity;", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment$OnAddShowListener;", "()V", "billingViewModel", "Lcom/uwetrottmann/seriesguide/billing/BillingViewModel;", "tabsAdapter", "Lcom/battlelancer/seriesguide/ui/TabStripAdapter;", "viewModel", "Lcom/battlelancer/seriesguide/shows/ShowsActivityViewModel;", "getViewModel", "()Lcom/battlelancer/seriesguide/shows/ShowsActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "checkGooglePlayPurchase", "", "getSnackbarParentView", "Landroid/view/View;", "handleViewIntents", "", "intent", "Landroid/content/Intent;", "onAddShow", "show", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onKeyLongPress", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onNewIntent", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onSelectedCurrentNavItem", "scrollSelectedTabToTop", "setInitialTab", "intentExtras", "setupActionBar", "setupViews", "Companion", "ShowsPageChangeListener", "Tab", "app_amazonDebug"})
public class ShowsActivityImpl extends com.battlelancer.seriesguide.ui.BaseTopActivity implements com.battlelancer.seriesguide.shows.search.discover.AddShowDialogFragment.OnAddShowListener {
    private com.battlelancer.seriesguide.ui.TabStripAdapter tabsAdapter;
    private androidx.viewpager2.widget.ViewPager2 viewPager;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.uwetrottmann.seriesguide.billing.BillingViewModel billingViewModel;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.ShowsActivityImpl.Companion Companion = null;
    public static final int NOW_RECENTLY_LOADER_ID = 104;
    public static final int NOW_TRAKT_USER_LOADER_ID = 106;
    public static final int NOW_TRAKT_FRIENDS_LOADER_ID = 107;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SELECTED_TAB = "selectedtab";
    
    public ShowsActivityImpl() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.ShowsActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Handles further behavior, if this activity was launched through one of the [Intents]
     * action filters defined in the manifest.
     *
     * @return true if a show or episode is viewed directly and this activity should finish.
     */
    private final boolean handleViewIntents(android.content.Intent intent) {
        return false;
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    private final void setupViews() {
    }
    
    private final void scrollSelectedTabToTop() {
    }
    
    @java.lang.Override()
    protected void onSelectedCurrentNavItem() {
    }
    
    /**
     * Tries to restore the current tab from given intent extras. If that fails, uses the last known
     * selected tab. If that fails also, defaults to the first tab.
     */
    private final void setInitialTab(android.os.Bundle intentExtras) {
    }
    
    private final void checkGooglePlayPurchase() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
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
    public boolean onKeyLongPress(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    /**
     * Called if the user adds a show from a trakt stream fragment.
     */
    @java.lang.Override()
    public void onAddShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.SearchResult show) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View getSnackbarParentView() {
        return null;
    }
    
    /**
     * Page change listener which hides the floating action button for all but the shows tab.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsActivityImpl$ShowsPageChangeListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "floatingActionButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "onPageScrollStateChanged", "", "arg0", "", "onPageScrolled", "arg1", "", "arg2", "onPageSelected", "position", "app_amazonDebug"})
    public static final class ShowsPageChangeListener extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        private final com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = null;
        
        public ShowsPageChangeListener(@org.jetbrains.annotations.NotNull()
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            super();
        }
        
        @java.lang.Override()
        public void onPageScrollStateChanged(int arg0) {
        }
        
        @java.lang.Override()
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsActivityImpl$Tab;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "SHOWS", "NOW", "UPCOMING", "RECENT", "app_amazonDebug"})
    public static enum Tab {
        /*public static final*/ SHOWS /* = new SHOWS(0) */,
        /*public static final*/ NOW /* = new NOW(0) */,
        /*public static final*/ UPCOMING /* = new UPCOMING(0) */,
        /*public static final*/ RECENT /* = new RECENT(0) */;
        private final int index = 0;
        
        Tab(int index) {
        }
        
        public final int getIndex() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsActivityImpl$Companion;", "", "()V", "EXTRA_SELECTED_TAB", "", "NOW_RECENTLY_LOADER_ID", "", "NOW_TRAKT_FRIENDS_LOADER_ID", "NOW_TRAKT_USER_LOADER_ID", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}