package com.battlelancer.seriesguide.movies;

import java.lang.System;

/**
 * A shell for a fragment displaying a number of movies.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H \u00a2\u0006\u0002\b\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020(H\u0007J\u001e\u0010)\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010,\u001a\u00020\u0003H\u0016J\u0016\u0010-\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030+H\u0016J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u0010X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u00063"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MoviesBaseFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "Landroid/database/Cursor;", "()V", "adapter", "Lcom/battlelancer/seriesguide/movies/MoviesCursorAdapter;", "emptyView", "Landroid/widget/TextView;", "getEmptyView", "()Landroid/widget/TextView;", "setEmptyView", "(Landroid/widget/TextView;)V", "gridView", "Landroid/widget/GridView;", "loaderId", "", "getLoaderId$app_pureDebug", "()I", "getTabPosition", "showingNowTab", "", "getTabPosition$app_pureDebug", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onEventMainThread", "event", "Lcom/battlelancer/seriesguide/movies/MoviesDistillationSettings$MoviesSortOrderChangedEvent;", "onLoadFinished", "loader", "Landroidx/loader/content/Loader;", "data", "onLoaderReset", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "app_pureDebug"})
public abstract class MoviesBaseFragment extends androidx.fragment.app.Fragment implements androidx.loader.app.LoaderManager.LoaderCallbacks<android.database.Cursor> {
    private android.widget.GridView gridView;
    public android.widget.TextView emptyView;
    private com.battlelancer.seriesguide.movies.MoviesCursorAdapter adapter;
    
    public MoviesBaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getEmptyView() {
        return null;
    }
    
    public final void setEmptyView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    /**
     * Return a loader id different from any other used within [com.battlelancer.seriesguide.ui.MoviesActivity].
     */
    public abstract int getLoaderId$app_pureDebug();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.movies.MoviesDistillationSettings.MoviesSortOrderChangedEvent event) {
    }
    
    /**
     * @return The current position in the tab strip.
     * @see MoviesActivity
     */
    public abstract int getTabPosition$app_pureDebug(boolean showingNowTab);
    
    @java.lang.Override()
    public void onLoadFinished(@org.jetbrains.annotations.NotNull()
    androidx.loader.content.Loader<android.database.Cursor> loader, @org.jetbrains.annotations.NotNull()
    android.database.Cursor data) {
    }
    
    @java.lang.Override()
    public void onLoaderReset(@org.jetbrains.annotations.NotNull()
    androidx.loader.content.Loader<android.database.Cursor> loader) {
    }
}