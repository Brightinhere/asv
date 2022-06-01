package com.battlelancer.seriesguide.shows.search;

import java.lang.System;

/**
 * Handles search intents and displays a [EpisodeSearchFragment] when needed or redirects
 * directly to an [EpisodesActivity].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0006\b\u0016\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004MNOPB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020\u0010H\u0014J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0012\u00103\u001a\u0002002\b\u00104\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u0002002\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u000200H\u0014J\u0010\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020>H\u0007J\u0010\u0010?\u001a\u0002002\u0006\u00101\u001a\u000202H\u0014J\u0010\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000200H\u0014J\b\u0010D\u001a\u000200H\u0014J\b\u0010E\u001a\u000200H\u0014J\u0010\u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020\bH\u0002J\b\u0010H\u001a\u000200H\u0016J\u0012\u0010I\u001a\u0002002\b\u0010J\u001a\u0004\u0018\u00010KH\u0002J\b\u0010L\u001a\u000200H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u0006Q"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity;", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment$OnAddShowListener;", "Lcom/battlelancer/seriesguide/shows/search/SearchTriggerListener;", "()V", "pageChangeListener", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "remoteSearchVisible", "", "searchAutoCompleteView", "Landroid/widget/AutoCompleteTextView;", "getSearchAutoCompleteView$app_amazonDebug", "()Landroid/widget/AutoCompleteTextView;", "setSearchAutoCompleteView$app_amazonDebug", "(Landroid/widget/AutoCompleteTextView;)V", "searchContainer", "Landroid/view/View;", "getSearchContainer$app_amazonDebug", "()Landroid/view/View;", "setSearchContainer$app_amazonDebug", "(Landroid/view/View;)V", "searchHistory", "Lcom/battlelancer/seriesguide/util/SearchHistory;", "searchHistoryAdapter", "Landroid/widget/ArrayAdapter;", "", "searchInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getSearchInputLayout$app_amazonDebug", "()Lcom/google/android/material/textfield/TextInputLayout;", "setSearchInputLayout$app_amazonDebug", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "tabs", "Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "getTabs$app_amazonDebug", "()Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "setTabs$app_amazonDebug", "(Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;)V", "textWatcher", "Landroid/text/TextWatcher;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager$app_amazonDebug", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager$app_amazonDebug", "(Landroidx/viewpager2/widget/ViewPager2;)V", "getSnackbarParentView", "handleSearchIntent", "", "intent", "Landroid/content/Intent;", "handleSharedText", "sharedText", "onAddShow", "show", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEventMainThread", "event", "Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl$ClearSearchHistoryEvent;", "onNewIntent", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "setupActionBar", "setupViews", "mayShowKeyboard", "switchToDiscoverAndSearch", "triggerLocalSearch", "queryRaw", "", "triggerTvdbSearch", "ClearSearchHistoryEvent", "Companion", "SearchQueryEvent", "SearchQuerySubmitEvent", "app_amazonDebug"})
public class SearchActivityImpl extends com.battlelancer.seriesguide.ui.BaseMessageActivity implements com.battlelancer.seriesguide.shows.search.discover.AddShowDialogFragment.OnAddShowListener, com.battlelancer.seriesguide.shows.search.SearchTriggerListener {
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.containerSearchBar)
    public android.view.View searchContainer;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.text_input_layout_toolbar)
    public com.google.android.material.textfield.TextInputLayout searchInputLayout;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.auto_complete_view_toolbar)
    public android.widget.AutoCompleteTextView searchAutoCompleteView;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.tabsSearch)
    public com.uwetrottmann.seriesguide.widgets.SlidingTabLayout tabs;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.pagerSearch)
    public androidx.viewpager2.widget.ViewPager2 viewPager;
    private com.battlelancer.seriesguide.util.SearchHistory searchHistory;
    private android.widget.ArrayAdapter<java.lang.String> searchHistoryAdapter;
    private boolean remoteSearchVisible = false;
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback pageChangeListener = null;
    private final android.text.TextWatcher textWatcher = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.search.SearchActivityImpl.Companion Companion = null;
    
    /**
     * Which tab to select upon launch.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_DEFAULT_TAB = "default_tab";
    public static final int TAB_POSITION_SHOWS = 0;
    public static final int TAB_POSITION_EPISODES = 1;
    public static final int TAB_POSITION_SEARCH = 2;
    public static final int SHOWS_LOADER_ID = 100;
    public static final int EPISODES_LOADER_ID = 101;
    public static final int TRAKT_BASE_LOADER_ID = 200;
    
    public SearchActivityImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getSearchContainer$app_amazonDebug() {
        return null;
    }
    
    public final void setSearchContainer$app_amazonDebug(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getSearchInputLayout$app_amazonDebug() {
        return null;
    }
    
    public final void setSearchInputLayout$app_amazonDebug(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.AutoCompleteTextView getSearchAutoCompleteView$app_amazonDebug() {
        return null;
    }
    
    public final void setSearchAutoCompleteView$app_amazonDebug(@org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.widgets.SlidingTabLayout getTabs$app_amazonDebug() {
        return null;
    }
    
    public final void setTabs$app_amazonDebug(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.widgets.SlidingTabLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.viewpager2.widget.ViewPager2 getViewPager$app_amazonDebug() {
        return null;
    }
    
    public final void setViewPager$app_amazonDebug(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    private final void setupViews(boolean mayShowKeyboard) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void handleSearchIntent(android.content.Intent intent) {
    }
    
    private final void handleSharedText(java.lang.String sharedText) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void triggerLocalSearch(java.lang.CharSequence queryRaw) {
    }
    
    private final void triggerTvdbSearch() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onAddShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.SearchResult show) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.shows.search.SearchActivityImpl.ClearSearchHistoryEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View getSnackbarParentView() {
        return null;
    }
    
    @java.lang.Override()
    public void switchToDiscoverAndSearch() {
    }
    
    /**
     * Used by [ShowsDiscoverFragment] to indicate the search history should be cleared.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl$ClearSearchHistoryEvent;", "", "()V", "app_amazonDebug"})
    public static final class ClearSearchHistoryEvent {
        
        public ClearSearchHistoryEvent() {
            super();
        }
    }
    
    /**
     * Used by [ShowSearchFragment] and [EpisodeSearchFragment] to search as the user
     * types.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl$SearchQueryEvent;", "", "args", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getArgs", "()Landroid/os/Bundle;", "app_amazonDebug"})
    public static final class SearchQueryEvent {
        @org.jetbrains.annotations.NotNull()
        private final android.os.Bundle args = null;
        
        public SearchQueryEvent(@org.jetbrains.annotations.NotNull()
        android.os.Bundle args) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle getArgs() {
            return null;
        }
    }
    
    /**
     * Used by [ShowsDiscoverFragment] to submit a query. Unlike local search it is not type
     * and search.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl$SearchQuerySubmitEvent;", "", "query", "", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "app_amazonDebug"})
    public static final class SearchQuerySubmitEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String query = null;
        
        public SearchQuerySubmitEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String query) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQuery() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/SearchActivityImpl$Companion;", "", "()V", "EPISODES_LOADER_ID", "", "EXTRA_DEFAULT_TAB", "", "SHOWS_LOADER_ID", "TAB_POSITION_EPISODES", "TAB_POSITION_SEARCH", "TAB_POSITION_SHOWS", "TRAKT_BASE_LOADER_ID", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}