package com.battlelancer.seriesguide.shows.search.similar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsActivity;", "Lcom/battlelancer/seriesguide/ui/BaseActivity;", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment$OnAddShowListener;", "()V", "addFragmentWithSimilarShows", "", "showTmdbId", "", "showTitle", "", "addToBackStack", "", "onAddShow", "show", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupActionBar", "Companion", "app_amazonDebug"})
public final class SimilarShowsActivity extends com.battlelancer.seriesguide.ui.BaseActivity implements com.battlelancer.seriesguide.shows.search.discover.AddShowDialogFragment.OnAddShowListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.search.similar.SimilarShowsActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_SHOW_TMDB_ID = "EXTRA_SHOW_TMDB_ID";
    private static final java.lang.String EXTRA_SHOW_TITLE = "EXTRA_SHOW_TITLE";
    
    public SimilarShowsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onAddShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.SearchResult show) {
    }
    
    private final void addFragmentWithSimilarShows(int showTmdbId, java.lang.String showTitle, boolean addToBackStack) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int showTmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String showTitle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsActivity$Companion;", "", "()V", "EXTRA_SHOW_TITLE", "", "EXTRA_SHOW_TMDB_ID", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "showTmdbId", "", "showTitle", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int showTmdbId, @org.jetbrains.annotations.Nullable()
        java.lang.String showTitle) {
            return null;
        }
    }
}