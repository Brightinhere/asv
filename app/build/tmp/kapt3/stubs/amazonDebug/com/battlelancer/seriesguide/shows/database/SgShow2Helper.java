package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\b\u0010\u0005\u001a\u00020\u0003H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\b\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\'J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\'J\u0010\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rH\'J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\'\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0003H\'J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0003H\'J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0003H\'J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\'J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\'J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180#2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0012\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\'J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\r2\u0006\u00100\u001a\u000201H\'J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180\rH\'J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/040#2\u0006\u00100\u001a\u000201H\'J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020%0\rH\'J\u001c\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\r0#2\u0006\u00100\u001a\u000201H\'J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002090\rH\'J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020-0\rH\'J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\rH\'J\u0010\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u0018H\'J\b\u0010?\u001a\u00020\u0003H\'J\b\u0010@\u001a\u00020\bH\'J\u0010\u0010A\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0010\u0010B\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\b\u0010C\u001a\u00020\bH\'J\u0018\u0010D\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000bH\'J\u0018\u0010F\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020HH\'J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020HH\'J\u0018\u0010K\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020HH\'J\u0016\u0010M\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\'J\u0018\u0010O\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u0014H\'J\u0018\u0010Q\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u000bH\'J\u0018\u0010S\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000bH\'J\u001c\u0010S\u001a\u00020\b2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0VH\u0017J$\u0010W\u001a\u00020\b2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020X0V2\u0006\u0010Y\u001a\u00020ZH\u0017J\u0010\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020]H\'J\u0016\u0010^\u001a\u00020\u00032\f\u0010N\u001a\b\u0012\u0004\u0012\u00020_0\rH\'J\u0018\u0010`\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0003H\'J\u0018\u0010a\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u0003H\'J\u0018\u0010c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u0003H\'J\u001c\u0010d\u001a\u00020\b2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030VH\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgShow2Helper;", "", "countHiddenShows", "", "countShowsFinishedWatching", "countShowsFinishedWatchingWithoutSpecials", "countShowsNotifyEnabled", "deleteAllShows", "", "deleteShow", "showId", "", "getForCloudUpdate", "", "Lcom/battlelancer/seriesguide/shows/database/SgShow2CloudUpdate;", "id", "getHexagonMergeNotCompleted", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Ids;", "getHiddenShowsTmdbIds", "getLanguage", "", "getLastUpdated", "(J)Ljava/lang/Long;", "getShow", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "getShowIdByTmdbId", "tmdbId", "getShowIdByTvdbId", "tvdbId", "getShowIdByTvdbIdWithNullTmdbId", "getShowIds", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShowIdsLong", "getShowLastWatchedEpisodeId", "getShowLiveData", "Landroidx/lifecycle/LiveData;", "getShowMinimal", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Minimal;", "getShowTitle", "getShowTmdbId", "getShowTmdbIdByTvdbId", "showTvdbId", "getShowTraktId", "getShowTvdbId", "getShowWithLastWatchedEpisode", "Lcom/battlelancer/seriesguide/shows/database/SgShow2LastWatchedEpisode;", "getShows", "Lcom/battlelancer/seriesguide/shows/database/SgShow2ForLists;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getShowsForExport", "getShowsLiveData", "", "getShowsMinimal", "getShowsNotifyStates", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Notify;", "getShowsUpdateInfo", "Lcom/battlelancer/seriesguide/shows/database/SgShow2UpdateInfo;", "getShowsWithLastWatchedEpisode", "getStats", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Stats;", "insertShow", "sgShow2", "makeHiddenVisible", "migrateCanceledShowStatus", "setHexagonMergeCompleted", "setHexagonMergeNotCompleted", "setHexagonMergeNotCompletedForAll", "setLastUpdated", "lastUpdatedMs", "setShowFavorite", "isFavorite", "", "setShowHidden", "isHidden", "setShowNotify", "isNotify", "updateForCloudUpdate", "updates", "updateLanguage", "languageCode", "updateLastWatchedEpisodeId", "episodeId", "updateLastWatchedMsIfLater", "lastWatchedMs", "showIdsToLastWatched", "", "updateLastWatchedMsIfLaterAndLastWatchedEpisodeId", "Lcom/battlelancer/seriesguide/sync/ShowLastWatchedInfo;", "episodeHelper", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Helper;", "updateShow", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Update;", "updateShowNextEpisode", "Lcom/battlelancer/seriesguide/shows/database/SgShow2NextEpisodeUpdate;", "updateTmdbId", "updateUserRating", "userRating", "updateUserRatingByTmdbId", "updateUserRatings", "tmdbIdsToRating", "app_amazonDebug"})
public abstract interface SgShow2Helper {
    
    /**
     * Returns row ID.
     */
    @androidx.room.Insert()
    public abstract long insertShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgShow2 sgShow2);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgShow2.class)
    public abstract int updateShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgShow2Update show);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM sg_show WHERE _id = :id")
    public abstract com.battlelancer.seriesguide.shows.database.SgShow2 getShow(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_show WHERE _id=:id")
    public abstract androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgShow2> getShowLiveData(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT _id, series_tmdb_id, series_tvdb_id, series_title, series_poster_small FROM sg_show WHERE _id = :id")
    public abstract com.battlelancer.seriesguide.shows.database.SgShow2Minimal getShowMinimal(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, series_tmdb_id, series_tvdb_id, series_title, series_poster_small FROM sg_show")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2Minimal> getShowsMinimal();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT _id, series_tmdb_id, series_tvdb_id FROM sg_show WHERE _id=:id")
    public abstract java.lang.Object getShowIds(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.battlelancer.seriesguide.shows.database.SgShow2Ids> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, series_tmdb_id, series_tvdb_id FROM sg_show")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2Ids> getShowIds();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id FROM sg_show")
    public abstract java.util.List<java.lang.Long> getShowIdsLong();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, series_lastupdate, series_airsdayofweek FROM sg_show")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2UpdateInfo> getShowsUpdateInfo();
    
    @androidx.room.Query(value = "SELECT _id FROM sg_show WHERE series_tmdb_id=:tmdbId")
    public abstract long getShowIdByTmdbId(int tmdbId);
    
    @androidx.room.Query(value = "SELECT _id FROM sg_show WHERE series_tvdb_id=:tvdbId")
    public abstract long getShowIdByTvdbId(int tvdbId);
    
    @androidx.room.Query(value = "SELECT _id FROM sg_show WHERE series_tvdb_id=:tvdbId AND series_tmdb_id IS NULL")
    public abstract long getShowIdByTvdbIdWithNullTmdbId(int tvdbId);
    
    @androidx.room.Query(value = "SELECT series_trakt_id FROM sg_show WHERE _id = :id")
    public abstract int getShowTraktId(long id);
    
    @androidx.room.Query(value = "SELECT series_tmdb_id FROM sg_show WHERE _id=:id")
    public abstract int getShowTmdbId(long id);
    
    @androidx.room.Query(value = "SELECT series_tmdb_id FROM sg_show WHERE series_tvdb_id = :showTvdbId")
    public abstract int getShowTmdbIdByTvdbId(int showTvdbId);
    
    @androidx.room.Query(value = "SELECT series_tvdb_id FROM sg_show WHERE _id=:id")
    public abstract int getShowTvdbId(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT series_title FROM sg_show WHERE _id=:id")
    public abstract java.lang.String getShowTitle(long id);
    
    @androidx.room.Query(value = "SELECT series_lastwatchedid FROM sg_show WHERE _id = :id")
    public abstract long getShowLastWatchedEpisodeId(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_show ORDER BY series_title COLLATE UNICODE ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2> getShowsForExport();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgShow2.class})
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2ForLists> getShows(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgShow2.class})
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2ForLists>> getShowsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT sg_show._id, series_lastwatchedid, episode_number, episode_season_number, episode_firstairedms, episode_title, episode_plays FROM sg_show LEFT OUTER JOIN sg_episode ON series_lastwatchedid = sg_episode._id WHERE sg_show._id = :id")
    public abstract com.battlelancer.seriesguide.shows.database.SgShow2LastWatchedEpisode getShowWithLastWatchedEpisode(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT sg_show._id, series_lastwatchedid, episode_number, episode_season_number, episode_firstairedms, episode_title, episode_plays FROM sg_show LEFT OUTER JOIN sg_episode ON series_lastwatchedid = sg_episode._id")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2LastWatchedEpisode> getShowsWithLastWatchedEpisode();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, series_status, series_next, series_runtime FROM sg_show")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2Stats> getStats();
    
    @androidx.room.Query(value = "SELECT count(series_id) FROM (SELECT series_id, series_status, sum(case when episode_watched = \'0\' then 1 else 0 end) as episodes_unwatched FROM sg_episode LEFT OUTER JOIN sg_show ON sg_episode.series_id = sg_show._id GROUP BY series_id) WHERE episodes_unwatched = 0 AND series_status IN (0, -2)")
    public abstract int countShowsFinishedWatching();
    
    @androidx.room.Query(value = "SELECT count(series_id) FROM (SELECT series_id, series_status, sum(case when episode_watched = \'0\' then 1 else 0 end) as episodes_unwatched FROM sg_episode LEFT OUTER JOIN sg_show ON sg_episode.series_id = sg_show._id WHERE episode_season_number != 0 GROUP BY series_id) WHERE episodes_unwatched = 0 AND series_status IN (0, -2)")
    public abstract int countShowsFinishedWatchingWithoutSpecials();
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgShow2.class)
    public abstract int updateShowNextEpisode(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2NextEpisodeUpdate> updates);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_favorite = :isFavorite WHERE _id = :id")
    public abstract int setShowFavorite(long id, boolean isFavorite);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_notify = :isNotify WHERE _id = :id")
    public abstract int setShowNotify(long id, boolean isNotify);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgShow2.class})
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2Notify>> getShowsNotifyStates(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @androidx.room.Query(value = "SELECT count(_id) FROM sg_show WHERE series_notify = 1")
    public abstract int countShowsNotifyEnabled();
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_hidden = :isHidden WHERE _id = :id")
    public abstract int setShowHidden(long id, boolean isHidden);
    
    @androidx.room.Query(value = "SELECT count(_id) FROM sg_show WHERE series_hidden=1")
    public abstract int countHiddenShows();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT series_tmdb_id FROM sg_show WHERE series_hidden = 1")
    public abstract java.util.List<java.lang.Integer> getHiddenShowsTmdbIds();
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_hidden = 0 WHERE series_hidden = 1")
    public abstract int makeHiddenVisible();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT series_language FROM sg_show WHERE _id = :id")
    public abstract java.lang.String getLanguage(long id);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_language = :languageCode WHERE _id = :id")
    public abstract void updateLanguage(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_tmdb_id = :tmdbId WHERE _id = :id")
    public abstract int updateTmdbId(long id, int tmdbId);
    
    @androidx.room.Query(value = "DELETE FROM sg_show")
    public abstract void deleteAllShows();
    
    @androidx.room.Query(value = "DELETE FROM sg_show WHERE _id = :showId")
    public abstract int deleteShow(long showId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, series_tmdb_id, series_tvdb_id FROM sg_show WHERE series_syncenabled = 0")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2Ids> getHexagonMergeNotCompleted();
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_syncenabled = 0")
    public abstract void setHexagonMergeNotCompletedForAll();
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_syncenabled = 0 WHERE _id = :id")
    public abstract void setHexagonMergeNotCompleted(long id);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_syncenabled = 1 WHERE _id = :id")
    public abstract void setHexagonMergeCompleted(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT _id, series_tmdb_id, series_language, series_favorite, series_hidden, series_notify FROM sg_show WHERE _id = :id")
    public abstract com.battlelancer.seriesguide.shows.database.SgShow2CloudUpdate getForCloudUpdate(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, series_tmdb_id, series_language, series_favorite, series_hidden, series_notify FROM sg_show")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2CloudUpdate> getForCloudUpdate();
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgShow2.class)
    public abstract void updateForCloudUpdate(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2CloudUpdate> updates);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_lastwatched_ms = :lastWatchedMs WHERE _id = :id AND series_lastwatched_ms < :lastWatchedMs")
    public abstract void updateLastWatchedMsIfLater(long id, long lastWatchedMs);
    
    @androidx.room.Transaction()
    public abstract void updateLastWatchedMsIfLater(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, java.lang.Long> showIdsToLastWatched);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_lastwatchedid = :episodeId WHERE _id = :id")
    public abstract void updateLastWatchedEpisodeId(long id, long episodeId);
    
    @androidx.room.Transaction()
    public abstract void updateLastWatchedMsIfLaterAndLastWatchedEpisodeId(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, com.battlelancer.seriesguide.sync.ShowLastWatchedInfo> showIdsToLastWatched, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgEpisode2Helper episodeHelper);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_lastupdate = :lastUpdatedMs WHERE _id = :id")
    public abstract void setLastUpdated(long id, long lastUpdatedMs);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT series_lastupdate FROM sg_show WHERE _id = :id")
    public abstract java.lang.Long getLastUpdated(long id);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_rating_user = :userRating WHERE _id = :showId")
    public abstract int updateUserRating(long showId, int userRating);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_rating_user = :userRating WHERE series_tmdb_id = :tmdbId")
    public abstract int updateUserRatingByTmdbId(int tmdbId, int userRating);
    
    @androidx.room.Transaction()
    public abstract void updateUserRatings(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> tmdbIdsToRating);
    
    @androidx.room.Query(value = "UPDATE sg_show SET series_status = -2 WHERE series_status = 3")
    public abstract void migrateCanceledShowStatus();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void updateLastWatchedMsIfLater(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgShow2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Long, java.lang.Long> showIdsToLastWatched) {
        }
        
        @androidx.room.Transaction()
        public static void updateLastWatchedMsIfLaterAndLastWatchedEpisodeId(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgShow2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Long, com.battlelancer.seriesguide.sync.ShowLastWatchedInfo> showIdsToLastWatched, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper episodeHelper) {
        }
        
        @androidx.room.Transaction()
        public static void updateUserRatings(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgShow2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Integer, java.lang.Integer> tmdbIdsToRating) {
        }
    }
}