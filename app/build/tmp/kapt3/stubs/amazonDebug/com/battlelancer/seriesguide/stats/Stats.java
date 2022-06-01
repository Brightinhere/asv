package com.battlelancer.seriesguide.stats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\nH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\nH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u0095\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\nH\u00c6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001J\t\u0010F\u001a\u00020GH\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016\u00a8\u0006H"}, d2 = {"Lcom/battlelancer/seriesguide/stats/Stats;", "", "shows", "", "showsFinished", "showsContinuing", "showsWithNextEpisodes", "episodes", "episodesWatched", "episodesWatchedRuntime", "", "movies", "moviesWatchlist", "moviesWatchlistRuntime", "moviesWatched", "moviesWatchedRuntime", "moviesCollection", "moviesCollectionRuntime", "(IIIIIIJIIJIJIJ)V", "getEpisodes", "()I", "setEpisodes", "(I)V", "getEpisodesWatched", "setEpisodesWatched", "getEpisodesWatchedRuntime", "()J", "setEpisodesWatchedRuntime", "(J)V", "getMovies", "setMovies", "getMoviesCollection", "setMoviesCollection", "getMoviesCollectionRuntime", "setMoviesCollectionRuntime", "getMoviesWatched", "setMoviesWatched", "getMoviesWatchedRuntime", "setMoviesWatchedRuntime", "getMoviesWatchlist", "setMoviesWatchlist", "getMoviesWatchlistRuntime", "setMoviesWatchlistRuntime", "getShows", "setShows", "getShowsContinuing", "setShowsContinuing", "getShowsFinished", "setShowsFinished", "getShowsWithNextEpisodes", "setShowsWithNextEpisodes", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_amazonDebug"})
public final class Stats {
    private int shows;
    private int showsFinished;
    private int showsContinuing;
    private int showsWithNextEpisodes;
    private int episodes;
    private int episodesWatched;
    private long episodesWatchedRuntime;
    private int movies;
    private int moviesWatchlist;
    private long moviesWatchlistRuntime;
    private int moviesWatched;
    private long moviesWatchedRuntime;
    private int moviesCollection;
    private long moviesCollectionRuntime;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.stats.Stats copy(int shows, int showsFinished, int showsContinuing, int showsWithNextEpisodes, int episodes, int episodesWatched, long episodesWatchedRuntime, int movies, int moviesWatchlist, long moviesWatchlistRuntime, int moviesWatched, long moviesWatchedRuntime, int moviesCollection, long moviesCollectionRuntime) {
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
    
    public Stats() {
        super();
    }
    
    public Stats(int shows, int showsFinished, int showsContinuing, int showsWithNextEpisodes, int episodes, int episodesWatched, long episodesWatchedRuntime, int movies, int moviesWatchlist, long moviesWatchlistRuntime, int moviesWatched, long moviesWatchedRuntime, int moviesCollection, long moviesCollectionRuntime) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getShows() {
        return 0;
    }
    
    public final void setShows(int p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getShowsFinished() {
        return 0;
    }
    
    public final void setShowsFinished(int p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getShowsContinuing() {
        return 0;
    }
    
    public final void setShowsContinuing(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getShowsWithNextEpisodes() {
        return 0;
    }
    
    public final void setShowsWithNextEpisodes(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getEpisodes() {
        return 0;
    }
    
    public final void setEpisodes(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getEpisodesWatched() {
        return 0;
    }
    
    public final void setEpisodesWatched(int p0) {
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getEpisodesWatchedRuntime() {
        return 0L;
    }
    
    public final void setEpisodesWatchedRuntime(long p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getMovies() {
        return 0;
    }
    
    public final void setMovies(int p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getMoviesWatchlist() {
        return 0;
    }
    
    public final void setMoviesWatchlist(int p0) {
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getMoviesWatchlistRuntime() {
        return 0L;
    }
    
    public final void setMoviesWatchlistRuntime(long p0) {
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getMoviesWatched() {
        return 0;
    }
    
    public final void setMoviesWatched(int p0) {
    }
    
    public final long component12() {
        return 0L;
    }
    
    public final long getMoviesWatchedRuntime() {
        return 0L;
    }
    
    public final void setMoviesWatchedRuntime(long p0) {
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getMoviesCollection() {
        return 0;
    }
    
    public final void setMoviesCollection(int p0) {
    }
    
    public final long component14() {
        return 0L;
    }
    
    public final long getMoviesCollectionRuntime() {
        return 0L;
    }
    
    public final void setMoviesCollectionRuntime(long p0) {
    }
}