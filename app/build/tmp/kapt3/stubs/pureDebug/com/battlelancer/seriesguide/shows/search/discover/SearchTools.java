package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/SearchTools;", "", "()V", "mapTvShowsToSearchResults", "", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "languageCode", "", "results", "Lcom/uwetrottmann/tmdb2/entities/BaseTvShow;", "markLocalShowsAsAddedAndPreferLocalPoster", "", "context", "Landroid/content/Context;", "app_pureDebug"})
public final class SearchTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.search.discover.SearchTools INSTANCE = null;
    
    private SearchTools() {
        super();
    }
    
    /**
     * Maps TMDB TV shows to search results.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> mapTvShowsToSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.uwetrottmann.tmdb2.entities.BaseTvShow> results) {
        return null;
    }
    
    /**
     * Replaces with local poster (e.g. if the user added the show in a different language to
     * ensure it shows up with the same poster and to avoid fetching another image).
     */
    public final void markLocalShowsAsAddedAndPreferLocalPoster(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> results) {
    }
}