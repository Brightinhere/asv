package com.battlelancer.seriesguide.movies.search;

import java.lang.System;

/**
 * Hosts [MoviesSearchFragment], provides a special toolbar with search bar that expands.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0018H\u0014J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/battlelancer/seriesguide/movies/search/MoviesSearchActivity;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity;", "Lcom/battlelancer/seriesguide/movies/search/MoviesSearchFragment$OnSearchClickListener;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/ActivityMoviesSearchBinding;", "link", "Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;", "searchHistory", "Lcom/battlelancer/seriesguide/util/SearchHistory;", "searchHistoryAdapter", "Landroid/widget/ArrayAdapter;", "", "searchViewActionListener", "Landroid/widget/TextView$OnEditorActionListener;", "searchViewClickListener", "Landroid/view/View$OnClickListener;", "searchViewItemClickListener", "Landroid/widget/AdapterView$OnItemClickListener;", "showSearchView", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onEventLanguageChanged", "event", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationChangedEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onSearchClick", "search", "setSearchViewVisible", "visible", "setupActionBar", "Companion", "app_pureDebug"})
public final class MoviesSearchActivity extends com.battlelancer.seriesguide.ui.BaseMessageActivity implements com.battlelancer.seriesguide.movies.search.MoviesSearchFragment.OnSearchClickListener {
    private com.battlelancer.seriesguide.databinding.ActivityMoviesSearchBinding binding;
    private com.battlelancer.seriesguide.util.SearchHistory searchHistory;
    private android.widget.ArrayAdapter<java.lang.String> searchHistoryAdapter;
    private boolean showSearchView = false;
    private com.battlelancer.seriesguide.movies.MoviesDiscoverLink link;
    private final android.view.View.OnClickListener searchViewClickListener = null;
    private final android.widget.AdapterView.OnItemClickListener searchViewItemClickListener = null;
    private final android.widget.TextView.OnEditorActionListener searchViewActionListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.movies.search.MoviesSearchActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID_LINK = "idLink";
    private static final java.lang.String STATE_SEARCH_VISIBLE = "searchVisible";
    
    public MoviesSearchActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupActionBar(com.battlelancer.seriesguide.movies.MoviesDiscoverLink link) {
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
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventLanguageChanged(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationChangedEvent event) {
    }
    
    @java.lang.Override()
    public void onSearchClick() {
    }
    
    private final void search() {
    }
    
    private final void setSearchViewVisible(boolean visible) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/movies/search/MoviesSearchActivity$Companion;", "", "()V", "EXTRA_ID_LINK", "", "STATE_SEARCH_VISIBLE", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}