package com.battlelancer.seriesguide.movies;

import java.lang.System;

/**
 * Use with adapters for a list of movies.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieClickListener;", "", "onClickMovie", "", "movieTmdbId", "", "posterView", "Landroid/widget/ImageView;", "onClickMovieMoreOptions", "anchor", "Landroid/view/View;", "app_amazonDebug"})
public abstract interface MovieClickListener {
    
    public abstract void onClickMovie(int movieTmdbId, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView posterView);
    
    public abstract void onClickMovieMoreOptions(int movieTmdbId, @org.jetbrains.annotations.NotNull()
    android.view.View anchor);
}