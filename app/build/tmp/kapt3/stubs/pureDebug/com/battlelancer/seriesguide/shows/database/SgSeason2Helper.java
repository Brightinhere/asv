package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0017J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\u0006H\'J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\f\u001a\u00020\u0006H\'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\f\u001a\u00020\u0006H\'J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u00182\u0006\u0010\f\u001a\u00020\u0006H\'J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u00182\u0006\u0010\f\u001a\u00020\u0006H\'J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000fH\'J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\'J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H\'J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020#0\tH\'J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020%0\tH\'\u00a8\u0006&"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgSeason2Helper;", "", "deleteAllSeasons", "", "deleteSeason", "seasonId", "", "deleteSeasons", "seasonIds", "", "deleteSeasonsOfShow", "", "showId", "deleteSeasonsWithoutTmdbId", "getSeason", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "getSeasonIdsOfShow", "getSeasonNumbers", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2Numbers;", "getSeasonNumbersByTvdbId", "seasonTvdbId", "getSeasonNumbersOfShow", "getSeasonsForExport", "getSeasonsOfShowLatestFirst", "Landroidx/lifecycle/LiveData;", "getSeasonsOfShowOldestFirst", "insertSeason", "season", "insertSeasons", "", "seasons", "updateSeasonCounters", "seasonCountUpdate", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2CountUpdate;", "updateSeasons", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2Update;", "updateTmdbIds", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2TmdbIdUpdate;", "app_pureDebug"})
public abstract interface SgSeason2Helper {
    
    @androidx.room.Insert()
    public abstract long insertSeason(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgSeason2 season);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract long[] insertSeasons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2> seasons);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgSeason2.class)
    public abstract int updateSeasons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2Update> seasons);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgSeason2.class)
    public abstract int updateTmdbIds(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2TmdbIdUpdate> seasons);
    
    @androidx.room.Query(value = "DELETE FROM sg_season")
    public abstract void deleteAllSeasons();
    
    @androidx.room.Query(value = "DELETE FROM sg_season WHERE _id = :seasonId")
    public abstract void deleteSeason(long seasonId);
    
    @androidx.room.Transaction()
    public abstract void deleteSeasons(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> seasonIds);
    
    @androidx.room.Query(value = "DELETE FROM sg_season WHERE series_id = :showId AND season_tmdb_id IS NULL")
    public abstract void deleteSeasonsWithoutTmdbId(long showId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM sg_season WHERE _id = :seasonId")
    public abstract com.battlelancer.seriesguide.shows.database.SgSeason2 getSeason(long seasonId);
    
    /**
     * Get IDs of seasons of a show, sorted by most recent one.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id FROM sg_season WHERE series_id = :showId ORDER BY season_number DESC")
    public abstract java.util.List<java.lang.Long> getSeasonIdsOfShow(long showId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT _id, series_id, season_tmdb_id, season_tvdb_id, season_number FROM sg_season WHERE _id = :seasonId")
    public abstract com.battlelancer.seriesguide.shows.database.SgSeason2Numbers getSeasonNumbers(long seasonId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT _id, series_id, season_tmdb_id, season_tvdb_id, season_number FROM sg_season WHERE season_tvdb_id = :seasonTvdbId")
    public abstract com.battlelancer.seriesguide.shows.database.SgSeason2Numbers getSeasonNumbersByTvdbId(int seasonTvdbId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, series_id, season_tmdb_id, season_tvdb_id, season_number FROM sg_season WHERE series_id = :showId ORDER BY season_number")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2Numbers> getSeasonNumbersOfShow(long showId);
    
    /**
     * Excludes seasons where total episode count is 0.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_season WHERE series_id = :showId AND season_totalcount != 0 ORDER BY season_number DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2>> getSeasonsOfShowLatestFirst(long showId);
    
    /**
     * Excludes seasons where total episode count is 0.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_season WHERE series_id = :showId AND season_totalcount != 0 ORDER BY season_number ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2>> getSeasonsOfShowOldestFirst(long showId);
    
    /**
     * Note: does not exclude seasons based on season_totalcount because it might not be up-to-date.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_season WHERE series_id = :showId ORDER BY season_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2> getSeasonsForExport(long showId);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgSeason2.class)
    public abstract void updateSeasonCounters(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgSeason2CountUpdate seasonCountUpdate);
    
    @androidx.room.Query(value = "DELETE FROM sg_season WHERE series_id = :showId")
    public abstract int deleteSeasonsOfShow(long showId);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void deleteSeasons(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgSeason2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> seasonIds) {
        }
    }
}