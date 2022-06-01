package com.battlelancer.seriesguide.movies;

import java.lang.System;

/**
 * Loads and displays the users trakt movie watchlist.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0010\u00a2\u0006\u0002\b\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MoviesWatchListFragment;", "Lcom/battlelancer/seriesguide/movies/MoviesBaseFragment;", "()V", "loaderId", "", "getLoaderId$app_amazonDebug", "()I", "getTabPosition", "showingNowTab", "", "getTabPosition$app_amazonDebug", "onCreateLoader", "Landroidx/loader/content/Loader;", "Landroid/database/Cursor;", "args", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "app_amazonDebug"})
public final class MoviesWatchListFragment extends com.battlelancer.seriesguide.movies.MoviesBaseFragment {
    
    public MoviesWatchListFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLoaderId$app_amazonDebug() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.loader.content.Loader<android.database.Cursor> onCreateLoader(int loaderId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle args) {
        return null;
    }
    
    @java.lang.Override()
    public int getTabPosition$app_amazonDebug(boolean showingNowTab) {
        return 0;
    }
}