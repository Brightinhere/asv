package com.battlelancer.seriesguide.movies.database;

import java.lang.System;

/**
 * Data Access Object for the movies table.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\'J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\'J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\'J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\'J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\'J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\'J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010%\u001a\u00020#H\'\u00a8\u0006&"}, d2 = {"Lcom/battlelancer/seriesguide/movies/database/MovieHelper;", "", "countMovies", "", "deleteMovie", "tmdbId", "getAllMovies", "", "Lcom/battlelancer/seriesguide/movies/database/SgMovie;", "getCount", "getMovie", "getMovieFlags", "Lcom/battlelancer/seriesguide/movies/database/SgMovieFlags;", "getMovieTitle", "", "getMoviesForExport", "getMoviesOnListsOrWatched", "getMoviesToUpdate", "Lcom/battlelancer/seriesguide/movies/database/SgMovieTmdbId;", "releasedAfter", "", "updatedBeforeForReleasedAfter", "updatedBeforeAllOthers", "getStatsInCollection", "Lcom/battlelancer/seriesguide/movies/database/MovieStats;", "getStatsInWatchlist", "getStatsWatched", "getWatchedMovies", "Landroidx/paging/PagingSource;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "setNotWatchedAndRemovePlays", "setWatchedAndAddPlay", "updateInCollection", "inCollection", "", "updateInWatchlist", "inWatchlist", "app_amazonDebug"})
public abstract interface MovieHelper {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM movies WHERE movies_tmdbid=:tmdbId")
    public abstract com.battlelancer.seriesguide.movies.database.SgMovie getMovie(int tmdbId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movies ORDER BY movies_title COLLATE UNICODE ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.movies.database.SgMovie> getMoviesForExport();
    
    @androidx.room.Query(value = "SELECT COUNT(movies_tmdbid) FROM movies WHERE movies_tmdbid=:tmdbId")
    public abstract int getCount(int tmdbId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT movies_tmdbid FROM movies WHERE\n            (movies_incollection=1 OR movies_inwatchlist=1 OR movies_watched=1)\n            AND (\n            movies_last_updated IS NULL\n            OR (movies_released > :releasedAfter AND movies_last_updated < :updatedBeforeForReleasedAfter)\n            OR \n            movies_last_updated < :updatedBeforeAllOthers\n            )")
    public abstract java.util.List<com.battlelancer.seriesguide.movies.database.SgMovieTmdbId> getMoviesToUpdate(long releasedAfter, long updatedBeforeForReleasedAfter, long updatedBeforeAllOthers);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.movies.database.SgMovie.class})
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.battlelancer.seriesguide.movies.database.SgMovie> getWatchedMovies(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT movies_tmdbid, movies_incollection, movies_inwatchlist, movies_watched, movies_plays\n            FROM movies WHERE movies_incollection=1 OR movies_inwatchlist=1 OR movies_watched=1")
    public abstract java.util.List<com.battlelancer.seriesguide.movies.database.SgMovieFlags> getMoviesOnListsOrWatched();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT movies_tmdbid, movies_incollection, movies_inwatchlist, movies_watched, movies_plays FROM movies")
    public abstract java.util.List<com.battlelancer.seriesguide.movies.database.SgMovieFlags> getMovieFlags();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT movies_tmdbid, movies_incollection, movies_inwatchlist, movies_watched, movies_plays\n            FROM movies WHERE movies_tmdbid=:tmdbId")
    public abstract com.battlelancer.seriesguide.movies.database.SgMovieFlags getMovieFlags(int tmdbId);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM movies")
    public abstract int countMovies();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(_id) as count, SUM(movies_runtime) as runtime FROM movies WHERE movies_inwatchlist = 1")
    public abstract com.battlelancer.seriesguide.movies.database.MovieStats getStatsInWatchlist();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(_id) as count, SUM(movies_runtime) as runtime FROM movies WHERE movies_incollection = 1")
    public abstract com.battlelancer.seriesguide.movies.database.MovieStats getStatsInCollection();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(_id) as count, SUM(movies_runtime) as runtime FROM movies WHERE movies_watched = 1")
    public abstract com.battlelancer.seriesguide.movies.database.MovieStats getStatsWatched();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT movies_title FROM movies WHERE movies_tmdbid=:tmdbId")
    public abstract java.lang.String getMovieTitle(int tmdbId);
    
    @androidx.room.Query(value = "UPDATE movies SET movies_watched = 0, movies_plays = 0 WHERE movies_tmdbid=:tmdbId")
    public abstract int setNotWatchedAndRemovePlays(int tmdbId);
    
    @androidx.room.Query(value = "UPDATE movies SET movies_watched = 1, movies_plays = movies_plays + 1 WHERE movies_tmdbid=:tmdbId")
    public abstract int setWatchedAndAddPlay(int tmdbId);
    
    @androidx.room.Query(value = "UPDATE movies SET movies_incollection = :inCollection WHERE movies_tmdbid=:tmdbId")
    public abstract int updateInCollection(int tmdbId, boolean inCollection);
    
    @androidx.room.Query(value = "UPDATE movies SET movies_inwatchlist = :inWatchlist WHERE movies_tmdbid=:tmdbId")
    public abstract int updateInWatchlist(int tmdbId, boolean inWatchlist);
    
    @androidx.room.Query(value = "DELETE FROM movies WHERE movies_tmdbid=:tmdbId")
    public abstract int deleteMovie(int tmdbId);
    
    /**
     * For testing.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movies")
    public abstract java.util.List<com.battlelancer.seriesguide.movies.database.SgMovie> getAllMovies();
}