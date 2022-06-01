package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\'J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\'J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0011\u001a\u00020\u0003H\'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'J\b\u0010\u0014\u001a\u00020\u0003H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u0016\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0017J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0017J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0006H\'J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0018\u001a\u00020\u0006H\'J \u0010\'\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\'J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0003H\'J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0003H\'J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0012\u00100\u001a\u0004\u0018\u00010\"2\u0006\u00101\u001a\u000202H\'J\u0012\u00100\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001b042\u0006\u00101\u001a\u000202H\'J\u0018\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&042\u0006\u00106\u001a\u00020\u0006H\'J\u0012\u00107\u001a\u0004\u0018\u0001082\u0006\u0010\u0018\u001a\u00020\u0006H\'J&\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0003H\'J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u00101\u001a\u000202H\'J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u0010\n\u001a\u00020\u0006H\'J\u001c\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u001b042\u0006\u00101\u001a\u000202H\'J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u0012\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\u0006\u0010\n\u001a\u00020\u0006H\'J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020C0\u001b2\u0006\u00101\u001a\u000202H\'J\u001c\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020C0I2\u0006\u00101\u001a\u000202H\'J\u0018\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\'J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\'J\u001e\u0010M\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\'J \u0010N\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0003H\'J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u0010\n\u001a\u00020\u0006H\'J\u0010\u0010S\u001a\u00020\u00062\u0006\u0010T\u001a\u00020&H\'J\u0016\u0010U\u001a\u00020V2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020&0\u001bH\'J\b\u0010X\u001a\u00020\u0016H\'J\u0010\u0010Y\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0006H\'J\u0010\u0010Z\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u0010\u0010[\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\\\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010]\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\'J\u0010\u0010^\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010_\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\'J\u0016\u0010`\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0017J\u0010\u0010a\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'J\u0010\u0010b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'J\u0018\u0010c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\'J\u0016\u0010d\u001a\u00020\u00162\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0017J\u0010\u0010f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u0010\u0010g\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\'J \u0010h\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0003H\'J\u0018\u0010i\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010j\u001a\u00020kH\'J(\u0010l\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00032\u0006\u0010j\u001a\u00020kH\'J\u0018\u0010m\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010j\u001a\u00020kH\'J\u001e\u0010n\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010j\u001a\u00020kH\u0017J\u0018\u0010o\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010j\u001a\u00020kH\'J\u0018\u0010p\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010j\u001a\u00020kH\'J\u001e\u0010q\u001a\u00020\u00162\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010j\u001a\u00020kH\u0017J\u0016\u0010r\u001a\u00020\u00032\f\u0010W\u001a\b\u0012\u0004\u0012\u00020s0\u001bH\'J\u0016\u0010t\u001a\u00020\u00032\f\u0010W\u001a\b\u0012\u0004\u0012\u00020u0\u001bH\'J\u0016\u0010v\u001a\u00020\u00032\f\u0010W\u001a\b\u0012\u0004\u0012\u00020w0\u001bH\'J\u0018\u0010x\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010y\u001a\u00020zH\'J \u0010{\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u0003H\'J\u0017\u0010\u007f\u001a\u00020\u00032\r\u0010W\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u001bH\'J\u001a\u0010\u0081\u0001\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00062\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\'J\u001a\u0010\u0083\u0001\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00032\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\'J\u001f\u0010\u0084\u0001\u001a\u00020\u00162\u0014\u0010\u0085\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0086\u0001H\u0017J\u0018\u0010\u0087\u0001\u001a\u00020\u00162\r\u0010W\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u001bH\u0017J3\u0010\u0089\u0001\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00032\u0007\u0010\u008a\u0001\u001a\u00020\u00032\u0007\u0010\u008b\u0001\u001a\u00020\u0003H\'\u00a8\u0006\u008c\u0001"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Helper;", "", "countEpisodes", "", "countEpisodesOfSeason", "seasonId", "", "countEpisodesWithoutSpecials", "countNotCollectedEpisodesOfSeason", "countNotCollectedEpisodesOfShow", "showId", "currentTimeToolsTime", "countNotWatchedEpisodesOfShow", "countNotWatchedNoReleaseEpisodesOfSeason", "countNotWatchedReleasedEpisodesOfSeason", "countNotWatchedToBeReleasedEpisodesOfSeason", "countSkippedEpisodesOfSeason", "countWatchedEpisodes", "countWatchedEpisodesOfShow", "countWatchedEpisodesOfShowWithoutSpecials", "countWatchedEpisodesWithoutSpecials", "deleteAllEpisodes", "", "deleteEpisode", "episodeId", "deleteEpisodes", "episodeIds", "", "deleteEpisodesOfSeason", "deleteEpisodesOfSeasons", "seasonIds", "deleteEpisodesOfShow", "deleteEpisodesWithoutTmdbId", "dummyToValidateSgEpisode2Info", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Info;", "getCollectedEpisodesForTraktSync", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2ForSync;", "getEpisode", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "getEpisodeIdByNumber", "season", "number", "getEpisodeIdByTmdbId", "tmdbId", "getEpisodeIdByTvdbId", "tvdbId", "getEpisodeIdsOfSeason", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Ids;", "getEpisodeInfo", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getEpisodeInfoOfSeasonLiveData", "Landroidx/lifecycle/LiveData;", "getEpisodeLiveData", "id", "getEpisodeNumbers", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Numbers;", "getEpisodeNumbersForWatchedUpTo", "episodeFirstAired", "episodeNumber", "getEpisodeNumbersOfSeason", "getEpisodeNumbersOfShow", "getEpisodeSearchResults", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2SearchResult;", "getEpisodeTmdbId", "getEpisodeTvdbId", "getEpisodeWithShow", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;", "getEpisodesForExport", "getEpisodesForHexagonSync", "getEpisodesForTraktSync", "getEpisodesWithShow", "getEpisodesWithShowDataSource", "Landroidx/paging/PagingSource;", "getHighestWatchedEpisodeOfSeason", "currentTimePlusOneHour", "getNotWatchedOrSkippedEpisodeNumbersOfSeason", "getNotWatchedOrSkippedEpisodeNumbersOfShow", "getPreviousWatchedEpisodeOfShow", "seasonNumber", "getWatchedEpisodesForTraktSync", "getWatchedOrSkippedEpisodeNumbersOfSeason", "getWatchedOrSkippedEpisodeNumbersOfShow", "insertEpisode", "episode", "insertEpisodes", "", "episodes", "resetLastUpdatedForAll", "resetLastUpdatedForShow", "setNotWatchedAndRemovePlays", "setSeasonNotWatchedAndRemovePlays", "setSeasonNotWatchedExcludeSkipped", "setSeasonSkipped", "setSeasonWatched", "setSeasonWatchedAndAddPlay", "setSeasonsNotWatchedExcludeSkipped", "setShowNotWatchedAndRemovePlays", "setShowNotWatchedExcludeSkipped", "setShowWatchedAndAddPlay", "setShowsNotWatchedExcludeSkipped", "showIds", "setSkipped", "setWatchedAndAddPlay", "setWatchedUpToAndAddPlay", "updateCollected", "isCollected", "", "updateCollectedByNumber", "updateCollectedOfSeason", "updateCollectedOfSeasons", "updateCollectedOfShow", "updateCollectedOfShowExcludeSpecials", "updateCollectedOfShows", "updateEpisodes", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Update;", "updateEpisodesCollected", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2CollectedUpdate;", "updateEpisodesWatched", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WatchedUpdate;", "updateImdbId", "imdbId", "", "updateRating", "rating", "", "votes", "updateTmdbIds", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2TmdbIdUpdate;", "updateUserRating", "userRating", "updateUserRatingByTmdbId", "updateUserRatings", "tmdbIdsToRating", "", "updateWatchedAndCollectedByNumber", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2UpdateByNumber;", "updateWatchedByNumber", "watched", "plays", "app_pureDebug"})
public abstract interface SgEpisode2Helper {
    
    @androidx.room.Insert()
    public abstract long insertEpisode(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgEpisode2 episode);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract long[] insertEpisodes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2> episodes);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgEpisode2.class)
    public abstract int updateEpisodes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Update> episodes);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgEpisode2.class)
    public abstract int updateTmdbIds(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2TmdbIdUpdate> episodes);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_rating = :rating, episode_rating_votes = :votes WHERE _id = :episodeId")
    public abstract void updateRating(long episodeId, double rating, int votes);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_rating_user = :userRating WHERE _id = :episodeId")
    public abstract int updateUserRating(long episodeId, int userRating);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_rating_user = :userRating WHERE episode_tmdb_id = :tmdbId")
    public abstract void updateUserRatingByTmdbId(int tmdbId, int userRating);
    
    @androidx.room.Transaction()
    public abstract void updateUserRatings(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> tmdbIdsToRating);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_imdbid = :imdbId WHERE _id = :episodeId")
    public abstract void updateImdbId(long episodeId, @org.jetbrains.annotations.NotNull()
    java.lang.String imdbId);
    
    @androidx.room.Query(value = "DELETE FROM sg_episode")
    public abstract void deleteAllEpisodes();
    
    @androidx.room.Query(value = "DELETE FROM sg_episode WHERE _id = :episodeId")
    public abstract void deleteEpisode(long episodeId);
    
    @androidx.room.Transaction()
    public abstract void deleteEpisodes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> episodeIds);
    
    @androidx.room.Query(value = "DELETE FROM sg_episode WHERE series_id = :showId AND episode_tmdb_id IS NULL")
    public abstract void deleteEpisodesWithoutTmdbId(long showId);
    
    @androidx.room.Query(value = "SELECT _id FROM sg_episode WHERE episode_tmdb_id = :tmdbId")
    public abstract long getEpisodeIdByTmdbId(int tmdbId);
    
    @androidx.room.Query(value = "SELECT _id FROM sg_episode WHERE episode_tvdb_id = :tvdbId")
    public abstract long getEpisodeIdByTvdbId(int tvdbId);
    
    @androidx.room.Query(value = "SELECT _id FROM sg_episode WHERE series_id = :showId AND episode_season_number = :season AND episode_number = :number")
    public abstract long getEpisodeIdByNumber(long showId, int season, int number);
    
    @androidx.room.Query(value = "SELECT episode_tvdb_id FROM sg_episode WHERE _id = :episodeId")
    public abstract int getEpisodeTvdbId(long episodeId);
    
    @androidx.room.Query(value = "SELECT episode_tmdb_id FROM sg_episode WHERE _id = :episodeId")
    public abstract int getEpisodeTmdbId(long episodeId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE _id = :episodeId")
    public abstract com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers getEpisodeNumbers(long episodeId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_tvdb_id, episode_title, episode_number, episode_absolute_number, episode_season_number, episode_dvd_number, episode_firstairedms, episode_watched, episode_collected FROM sg_episode WHERE _id = :episodeId")
    public abstract com.battlelancer.seriesguide.shows.database.SgEpisode2Info getEpisodeInfo(long episodeId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.RawQuery()
    public abstract com.battlelancer.seriesguide.shows.database.SgEpisode2Info getEpisodeInfo(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM sg_episode WHERE _id = :episodeId")
    public abstract com.battlelancer.seriesguide.shows.database.SgEpisode2 getEpisode(long episodeId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_episode WHERE _id=:id")
    public abstract androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.database.SgEpisode2> getEpisodeLiveData(long id);
    
    @androidx.room.Query(value = "SELECT _id FROM sg_episode WHERE season_id = :seasonId \n        AND episode_firstairedms <= :currentTimePlusOneHour\n        ORDER BY episode_number DESC, episode_firstairedms DESC")
    public abstract long getHighestWatchedEpisodeOfSeason(long seasonId, long currentTimePlusOneHour);
    
    @androidx.room.Query(value = "SELECT _id FROM sg_episode WHERE series_id = :showId \n        AND episode_season_number > 0 AND episode_watched != 0 \n        AND (episode_season_number < :seasonNumber OR (episode_season_number = :seasonNumber AND episode_number < :episodeNumber))\n        ORDER BY episode_season_number DESC, episode_number DESC, episode_firstairedms DESC")
    public abstract long getPreviousWatchedEpisodeOfShow(long showId, int seasonNumber, int episodeNumber);
    
    /**
     * Also used for compile time validation of [SgEpisode2WithShow.SELECT] (minus the WHERE clause).
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT sg_episode._id, episode_title, episode_number, episode_season_number, episode_firstairedms, episode_watched, episode_collected, episode_description, series_title, series_network, series_poster_small FROM sg_episode LEFT OUTER JOIN sg_show ON sg_episode.series_id=sg_show._id WHERE sg_episode._id = :episodeId")
    public abstract com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow getEpisodeWithShow(long episodeId);
    
    /**
     * See [SgEpisode2WithShow.buildEpisodesWithShowQuery].
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgEpisode2.class, com.battlelancer.seriesguide.shows.database.SgShow2.class})
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow> getEpisodesWithShow(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    /**
     * See [SgEpisode2WithShow.buildEpisodesWithShowQuery].
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgEpisode2.class, com.battlelancer.seriesguide.shows.database.SgShow2.class})
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow> getEpisodesWithShowDataSource(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, episode_tmdb_id, episode_number FROM sg_episode WHERE season_id = :seasonId")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Ids> getEpisodeIdsOfSeason(long seasonId);
    
    /**
     * Also serves as compile time validation of [SgEpisode2Numbers.buildQuery]
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE season_id = :seasonId ORDER BY episode_season_number ASC, episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getEpisodeNumbersOfSeason(long seasonId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgEpisode2.class})
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getEpisodeNumbersOfSeason(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    /**
     * Excludes specials.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE series_id = :showId AND episode_season_number != 0 ORDER BY episode_season_number ASC, episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getEpisodeNumbersOfShow(long showId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE series_id = :showId AND episode_tmdb_id > 0 AND (episode_watched != 0 OR episode_collected = 1)")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2ForSync> getEpisodesForHexagonSync(long showId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE season_id=:seasonId")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2ForSync> getEpisodesForTraktSync(long seasonId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE season_id=:seasonId AND episode_watched = 1 ORDER BY episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2ForSync> getWatchedEpisodesForTraktSync(long seasonId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE season_id=:seasonId AND episode_collected = 1 ORDER BY episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2ForSync> getCollectedEpisodesForTraktSync(long seasonId);
    
    /**
     * Gets episodes of season ordered by episode number.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_episode WHERE season_id = :seasonId ORDER BY episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2> getEpisodesForExport(long seasonId);
    
    /**
     * WAIT, just for compile time validation of [SgEpisode2Info.buildQuery]
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_tvdb_id, episode_title, episode_number, episode_absolute_number, episode_season_number, episode_dvd_number, episode_firstairedms, episode_watched, episode_collected FROM sg_episode WHERE season_id = :seasonId")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Info> dummyToValidateSgEpisode2Info(long seasonId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgEpisode2.class})
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Info>> getEpisodeInfoOfSeasonLiveData(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    /**
     * Note: make sure to limit the result set to avoid memory issues, otherwise this may return
     * thousands of rows depending on how many shows are added.
     *
     * If no limit may cause "RuntimeException: Exception while computing database live data."
     * caused by "IllegalStateException: Couldn't read row 2645, col 0 from CursorWindow.
     * Make sure the Cursor is initialized correctly before accessing data from it."
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.shows.database.SgEpisode2.class, com.battlelancer.seriesguide.shows.database.SgShow2.class})
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2SearchResult>> getEpisodeSearchResults(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode")
    public abstract int countEpisodes();
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE episode_season_number != 0")
    public abstract int countEpisodesWithoutSpecials();
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE episode_watched == 1")
    public abstract int countWatchedEpisodes();
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE episode_watched == 1 AND episode_season_number != 0")
    public abstract int countWatchedEpisodesWithoutSpecials();
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = :showId AND episode_watched = 1")
    public abstract int countWatchedEpisodesOfShow(long showId);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = :showId AND episode_watched = 1 AND episode_season_number != 0")
    public abstract int countWatchedEpisodesOfShowWithoutSpecials(long showId);
    
    /**
     * Returns how many episodes of a show are left to collect. Only considers regular, released
     * episodes (no specials, must have a release date in the past).
     */
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = :showId AND episode_collected = 0 AND episode_season_number != 0 AND episode_firstairedms != -1 AND episode_firstairedms <= :currentTimeToolsTime")
    public abstract int countNotCollectedEpisodesOfShow(long showId, long currentTimeToolsTime);
    
    /**
     * Returns how many episodes of a show are left to watch (only aired and not watched, exclusive
     * episodes with no air date and without specials).
     */
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = :showId AND episode_watched = 0 AND episode_season_number != 0 AND episode_firstairedms != -1 AND episode_firstairedms <= :currentTimeToolsTime")
    public abstract int countNotWatchedEpisodesOfShow(long showId, long currentTimeToolsTime);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = :seasonId")
    public abstract int countEpisodesOfSeason(long seasonId);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = :seasonId AND episode_watched = 0 AND episode_firstairedms != -1 AND episode_firstairedms <= :currentTimeToolsTime")
    public abstract int countNotWatchedReleasedEpisodesOfSeason(long seasonId, long currentTimeToolsTime);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = :seasonId AND episode_watched = 0 AND episode_firstairedms > :currentTimeToolsTime")
    public abstract int countNotWatchedToBeReleasedEpisodesOfSeason(long seasonId, long currentTimeToolsTime);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = :seasonId AND episode_watched = 0 AND episode_firstairedms = -1")
    public abstract int countNotWatchedNoReleaseEpisodesOfSeason(long seasonId);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = :seasonId AND episode_watched = 2")
    public abstract int countSkippedEpisodesOfSeason(long seasonId);
    
    @androidx.room.Query(value = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = :seasonId AND episode_collected = 0")
    public abstract int countNotCollectedEpisodesOfSeason(long seasonId);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0 WHERE _id = :episodeId")
    public abstract int setNotWatchedAndRemovePlays(long episodeId);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1 WHERE _id = :episodeId")
    public abstract int setWatchedAndAddPlay(long episodeId);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 2 WHERE _id = :episodeId")
    public abstract int setSkipped(long episodeId);
    
    /**
     * Sets not watched or skipped episodes, that have been released,
     * as watched and adds play if these conditions are met:
     *
     * Must
     * - be released before given episode release time,
     * - OR at the same time, but with same (itself) or lower (others released at same time) number.
     *
     * Note: keep in sync with EpisodeWatchedUpToJob.
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1 WHERE series_id = :showId\n            AND (\n            episode_firstairedms < :episodeFirstAired\n            OR (episode_firstairedms = :episodeFirstAired AND episode_number <= :episodeNumber)\n            )\n            AND episode_firstairedms != -1\n            AND episode_watched != 1")
    public abstract int setWatchedUpToAndAddPlay(long showId, long episodeFirstAired, int episodeNumber);
    
    /**
     * See [setWatchedUpToAndAddPlay] for which episodes are returned.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE series_id = :showId \n            AND (\n            episode_firstairedms < :episodeFirstAired\n            OR (episode_firstairedms = :episodeFirstAired AND episode_number <= :episodeNumber)\n            )\n            AND episode_firstairedms != -1\n            AND episode_watched != 1\n            ORDER BY episode_season_number ASC, episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getEpisodeNumbersForWatchedUpTo(long showId, long episodeFirstAired, int episodeNumber);
    
    /**
     * Note: keep in sync with [setSeasonNotWatchedAndRemovePlays].
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n        WHERE season_id = :seasonId AND episode_watched != 0\n        ORDER BY episode_season_number ASC, episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getWatchedOrSkippedEpisodeNumbersOfSeason(long seasonId);
    
    /**
     * Sets all watched or skipped as not watched and removes all plays.
     *
     * Note: keep in sync with [getWatchedOrSkippedEpisodeNumbersOfSeason].
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n        WHERE season_id = :seasonId AND episode_watched != 0")
    public abstract int setSeasonNotWatchedAndRemovePlays(long seasonId);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n        WHERE season_id = :seasonId AND episode_watched == 1")
    public abstract int setSeasonNotWatchedExcludeSkipped(long seasonId);
    
    @androidx.room.Transaction()
    public abstract void setSeasonsNotWatchedExcludeSkipped(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> seasonIds);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n        WHERE series_id = :showId AND episode_watched == 1")
    public abstract int setShowNotWatchedExcludeSkipped(long showId);
    
    @androidx.room.Transaction()
    public abstract void setShowsNotWatchedExcludeSkipped(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> showIds);
    
    /**
     * Does NOT include watched episodes to avoid Trakt adding a new play,
     * only includes episodes that have been released until within the hour.
     *
     * Note: keep in sync with [setSeasonSkipped] and [setSeasonWatchedAndAddPlay].
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n        WHERE season_id = :seasonId AND episode_watched != 1\n        AND episode_firstairedms <= :currentTimePlusOneHour AND episode_firstairedms != -1\n        ORDER BY episode_season_number ASC, episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getNotWatchedOrSkippedEpisodeNumbersOfSeason(long seasonId, long currentTimePlusOneHour);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 1, episode_plays = 1 WHERE season_id = :seasonId")
    public abstract int setSeasonWatched(long seasonId);
    
    /**
     * Sets not watched or skipped episodes, released until within the hour,
     * as watched and adds play.
     *
     * Does NOT mark watched episodes again to avoid adding a new play (Trakt and local).
     *
     * Note: keep in sync with [getNotWatchedOrSkippedEpisodeNumbersOfSeason].
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1 \n            WHERE season_id = :seasonId AND episode_watched != 1\n            AND episode_firstairedms <= :currentTimePlusOneHour AND episode_firstairedms != -1")
    public abstract int setSeasonWatchedAndAddPlay(long seasonId, long currentTimePlusOneHour);
    
    /**
     * Sets not watched episodes, released until within the hour, as skipped.
     *
     * Note: keep in sync with [getNotWatchedOrSkippedEpisodeNumbersOfSeason].
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 2 \n            WHERE season_id = :seasonId AND episode_watched = 0\n            AND episode_firstairedms <= :currentTimePlusOneHour AND episode_firstairedms != -1")
    public abstract int setSeasonSkipped(long seasonId, long currentTimePlusOneHour);
    
    /**
     * Note: keep in sync with [setShowNotWatchedAndRemovePlays].
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n        WHERE series_id = :showId AND episode_watched != 0\n        AND episode_season_number != 0\n        ORDER BY episode_season_number ASC, episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getWatchedOrSkippedEpisodeNumbersOfShow(long showId);
    
    /**
     * Sets watched or skipped episodes, excluding specials, as not watched and removes all plays.
     *
     * Note: keep in sync with [getWatchedOrSkippedEpisodeNumbersOfShow].
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n            WHERE series_id = :showId AND episode_watched != 0\n            AND episode_season_number != 0")
    public abstract int setShowNotWatchedAndRemovePlays(long showId);
    
    /**
     * Note: keep in sync with [setShowWatchedAndAddPlay].
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n        WHERE series_id = :showId AND episode_watched != 1\n        AND episode_firstairedms <= :currentTimePlusOneHour AND episode_firstairedms != -1\n        AND episode_season_number != 0\n        ORDER BY episode_season_number ASC, episode_number ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getNotWatchedOrSkippedEpisodeNumbersOfShow(long showId, long currentTimePlusOneHour);
    
    /**
     * Sets not watched or skipped episodes, released until within the hour, excluding specials,
     * as watched and adds play.
     *
     * Does NOT mark watched episodes again to avoid adding a new play (Trakt and local).
     *
     * Note: keep in sync with [getNotWatchedOrSkippedEpisodeNumbersOfShow].
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1\n            WHERE series_id = :showId AND episode_watched != 1\n            AND episode_firstairedms <= :currentTimePlusOneHour AND episode_firstairedms != -1\n            AND episode_season_number != 0")
    public abstract int setShowWatchedAndAddPlay(long showId, long currentTimePlusOneHour);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgEpisode2.class)
    public abstract int updateEpisodesWatched(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2WatchedUpdate> episodes);
    
    @androidx.room.Update(entity = com.battlelancer.seriesguide.shows.database.SgEpisode2.class)
    public abstract int updateEpisodesCollected(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2CollectedUpdate> episodes);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_collected = :isCollected WHERE _id = :episodeId")
    public abstract int updateCollected(long episodeId, boolean isCollected);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_collected = :isCollected WHERE season_id = :seasonId")
    public abstract int updateCollectedOfSeason(long seasonId, boolean isCollected);
    
    @androidx.room.Transaction()
    public abstract void updateCollectedOfSeasons(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> seasonIds, boolean isCollected);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_collected = :isCollected WHERE series_id = :showId")
    public abstract int updateCollectedOfShow(long showId, boolean isCollected);
    
    @androidx.room.Transaction()
    public abstract void updateCollectedOfShows(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> showIds, boolean isCollected);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_collected = :isCollected WHERE series_id = :showId AND episode_season_number != 0")
    public abstract int updateCollectedOfShowExcludeSpecials(long showId, boolean isCollected);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_watched = :watched, episode_plays = :plays WHERE series_id = :showId AND episode_season_number = :seasonNumber AND episode_number = :episodeNumber")
    public abstract void updateWatchedByNumber(long showId, int seasonNumber, int episodeNumber, int watched, int plays);
    
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_collected = :isCollected WHERE series_id = :showId AND episode_season_number = :seasonNumber AND episode_number = :episodeNumber")
    public abstract void updateCollectedByNumber(long showId, int seasonNumber, int episodeNumber, boolean isCollected);
    
    @androidx.room.Transaction()
    public abstract void updateWatchedAndCollectedByNumber(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2UpdateByNumber> episodes);
    
    /**
     * Note: currently last updated value is unused, all episodes are always updated.
     * See [com.battlelancer.seriesguide.ui.shows.ShowTools2].
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_lastupdate = 0")
    public abstract void resetLastUpdatedForAll();
    
    /**
     * Note: currently last updated value is unused, all episodes are always updated.
     * See [com.battlelancer.seriesguide.ui.shows.ShowTools2].
     */
    @androidx.room.Query(value = "UPDATE sg_episode SET episode_lastupdate = 0 WHERE series_id = :showId")
    public abstract void resetLastUpdatedForShow(long showId);
    
    @androidx.room.Query(value = "DELETE FROM sg_episode WHERE season_id = :seasonId")
    public abstract int deleteEpisodesOfSeason(long seasonId);
    
    @androidx.room.Transaction()
    public abstract void deleteEpisodesOfSeasons(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> seasonIds);
    
    @androidx.room.Query(value = "DELETE FROM sg_episode WHERE series_id = :showId")
    public abstract int deleteEpisodesOfShow(long showId);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void updateUserRatings(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Integer, java.lang.Integer> tmdbIdsToRating) {
        }
        
        @androidx.room.Transaction()
        public static void deleteEpisodes(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> episodeIds) {
        }
        
        @androidx.room.Transaction()
        public static void setSeasonsNotWatchedExcludeSkipped(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> seasonIds) {
        }
        
        @androidx.room.Transaction()
        public static void setShowsNotWatchedExcludeSkipped(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> showIds) {
        }
        
        @androidx.room.Transaction()
        public static void updateCollectedOfSeasons(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> seasonIds, boolean isCollected) {
        }
        
        @androidx.room.Transaction()
        public static void updateCollectedOfShows(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> showIds, boolean isCollected) {
        }
        
        @androidx.room.Transaction()
        public static void updateWatchedAndCollectedByNumber(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2UpdateByNumber> episodes) {
        }
        
        @androidx.room.Transaction()
        public static void deleteEpisodesOfSeasons(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2Helper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> seasonIds) {
        }
    }
}