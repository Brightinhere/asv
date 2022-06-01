package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

/**
 * Gets search results for the given query, or if the query is blank gets shows with new episodes.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J*\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J1\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J)\u0010\u001a\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u0012J!\u0010\u001e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverLiveData$Result;", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "currentJob", "Lkotlinx/coroutines/Job;", "language", "", "query", "watchProviderIds", "", "", "buildResultFailure", "isResultsForQuery", "", "buildResultSuccess", "results", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "emptyTextResId", "fetchDiscoverData", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShowsWithNewEpisodes", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "forceLoad", "searchShows", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "app_amazonDebug"})
public final class ShowsDiscoverLiveData extends androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverLiveData.Result> {
    private final android.content.Context context = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private java.lang.String query = "";
    private java.lang.String language;
    private java.util.List<java.lang.Integer> watchProviderIds;
    private kotlinx.coroutines.Job currentJob;
    
    public ShowsDiscoverLiveData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super(null);
    }
    
    /**
     * Schedules loading, give two letter ISO 639-1 [language] code.
     * Set [forceLoad] to load new set of results even if language has not changed.
     * Returns if it will load.
     */
    public final boolean load(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> watchProviderIds, boolean forceLoad) {
        return false;
    }
    
    private final java.lang.Object fetchDiscoverData(java.lang.String query, java.lang.String language, java.util.List<java.lang.Integer> watchProviderIds, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getShowsWithNewEpisodes(java.lang.String language, java.util.List<java.lang.Integer> watchProviderIds, kotlin.coroutines.Continuation<? super com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverLiveData.Result> continuation) {
        return null;
    }
    
    private final java.lang.Object searchShows(java.lang.String query, java.lang.String language, kotlin.coroutines.Continuation<? super com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverLiveData.Result> continuation) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverLiveData.Result buildResultSuccess(java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> results, @androidx.annotation.StringRes()
    int emptyTextResId, boolean isResultsForQuery) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverLiveData.Result buildResultFailure(boolean isResultsForQuery) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverLiveData$Result;", "", "searchResults", "", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "emptyText", "", "isResultsForQuery", "", "successful", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "getEmptyText", "()Ljava/lang/String;", "()Z", "getSearchResults", "()Ljava/util/List;", "getSuccessful", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_amazonDebug"})
    public static final class Result {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> searchResults = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String emptyText = null;
        private final boolean isResultsForQuery = false;
        private final boolean successful = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverLiveData.Result copy(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> searchResults, @org.jetbrains.annotations.NotNull()
        java.lang.String emptyText, boolean isResultsForQuery, boolean successful) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Result(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> searchResults, @org.jetbrains.annotations.NotNull()
        java.lang.String emptyText, boolean isResultsForQuery, boolean successful) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> getSearchResults() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmptyText() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isResultsForQuery() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getSuccessful() {
            return false;
        }
    }
}