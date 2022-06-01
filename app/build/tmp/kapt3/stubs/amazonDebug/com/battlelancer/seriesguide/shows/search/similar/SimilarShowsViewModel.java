package com.battlelancer.seriesguide.shows.search.similar;

import java.lang.System;

/**
 * Loads similar shows from TMDB and maps the results to standard search results with TheTVDB id.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\rJ\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "showTmdbId", "", "(Landroid/app/Application;I)V", "resultLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsViewModel$Result;", "getResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadSimilarShows", "", "postFailedResult", "postSuccessfulResult", "results", "", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "setAllPendingNotAdded", "setStateForTmdbId", "newState", "Result", "app_amazonDebug"})
public final class SimilarShowsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.search.similar.SimilarShowsViewModel.Result> resultLiveData = null;
    
    public SimilarShowsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int showTmdbId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.shows.search.similar.SimilarShowsViewModel.Result> getResultLiveData() {
        return null;
    }
    
    public final void loadSimilarShows(int showTmdbId) {
    }
    
    private final void postFailedResult() {
    }
    
    private final void postSuccessfulResult(java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> results) {
    }
    
    public final void setStateForTmdbId(int showTmdbId, int newState) {
    }
    
    public final void setAllPendingNotAdded() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/similar/SimilarShowsViewModel$Result;", "", "emptyMessage", "", "results", "", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "(Ljava/lang/String;Ljava/util/List;)V", "getEmptyMessage", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_amazonDebug"})
    public static final class Result {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String emptyMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> results = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.search.similar.SimilarShowsViewModel.Result copy(@org.jetbrains.annotations.NotNull()
        java.lang.String emptyMessage, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> results) {
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
        java.lang.String emptyMessage, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.battlelancer.seriesguide.shows.search.discover.SearchResult> results) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmptyMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.battlelancer.seriesguide.shows.search.discover.SearchResult> getResults() {
            return null;
        }
    }
}