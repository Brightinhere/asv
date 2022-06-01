package com.battlelancer.seriesguide.shows.tools;

import java.lang.System;

/**
 * Adds or updates a show and its seasons and episodes.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006BCDEFGBC\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\u0002\u0010\rJL\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0019Jp\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00132\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\'\u0018\u00010&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\'\u0018\u00010&H\u0002Jr\u0010)\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\'\u0018\u00010&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\'\u0018\u00010&H\u0002J\u001a\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u0010 \u001a\u00020!H\u0002J&\u0010.\u001a\b\u0012\u0004\u0012\u00020/0+2\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010+2\u0006\u0010 \u001a\u00020!H\u0002J \u00103\u001a\u0002042\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0013H\u0002J$\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002040\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020\u0013H\u0002J&\u00106\u001a\b\u0012\u0004\u0012\u0002070+2\u000e\u00108\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010+2\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u00109\u001a\u0002042\u0006\u0010 \u001a\u00020!J\u0016\u0010:\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0+H\u0002J\f\u0010>\u001a\u00020\u000f*\u00020?H\u0002J\f\u0010@\u001a\u000204*\u00020AH\u0002J\f\u0010@\u001a\u000204*\u00020?H\u0002J\f\u0010@\u001a\u000204*\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools;", "", "context", "Landroid/content/Context;", "getShowTools", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools;", "hexagonShowSync", "Ldagger/Lazy;", "Lcom/battlelancer/seriesguide/sync/HexagonShowSync;", "hexagonTools", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "showTools", "Lcom/battlelancer/seriesguide/shows/tools/ShowTools2;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/shows/tools/GetShowTools;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "addShow", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowResult;", "showTmdbId", "", "desiredLanguage", "", "traktCollection", "", "Lcom/uwetrottmann/trakt5/entities/BaseShow;", "traktWatched", "hexagonEpisodeSync", "Lcom/battlelancer/seriesguide/sync/HexagonEpisodeSync;", "getEpisodesOfSeason", "Lcom/github/michaelbull/result/Result;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$EpisodeDetails;", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbError;", "releaseInfo", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ReleaseInfo;", "showId", "", "seasonNumber", "seasonId", "language", "localEpisodesByTmdbId", "", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Ids;", "localEpisodesWithoutTmdbIdByNumber", "mapToSgEpisode2", "tmdbEpisodes", "", "Lcom/uwetrottmann/tmdb2/entities/TvEpisode;", "tmdbEpisodesFallback", "mapToSgSeason2", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "tmdbSeason", "Lcom/uwetrottmann/tmdb2/entities/TvSeason;", "seasons", "migrateSeasonsToTmdbIds", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult;", "migrateShowToTmdbIds", "updateSeasons", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$SeasonInfo;", "tmdbSeasons", "updateShow", "uploadShowsToCloud", "", "shows", "Lcom/uwetrottmann/seriesguide/backend/shows/model/SgCloudShow;", "toShowResult", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError;", "toUpdateResult", "Lcom/battlelancer/seriesguide/backend/HexagonError;", "EpisodeDetails", "ReleaseInfo", "SeasonInfo", "ShowResult", "ShowService", "UpdateResult", "app_pureDebug"})
public final class AddUpdateShowTools {
    private final android.content.Context context = null;
    private final com.battlelancer.seriesguide.shows.tools.GetShowTools getShowTools = null;
    private final dagger.Lazy<com.battlelancer.seriesguide.sync.HexagonShowSync> hexagonShowSync = null;
    private final dagger.Lazy<com.battlelancer.seriesguide.backend.HexagonTools> hexagonTools = null;
    private final dagger.Lazy<com.battlelancer.seriesguide.shows.tools.ShowTools2> showTools = null;
    
    @javax.inject.Inject()
    public AddUpdateShowTools(@org.jetbrains.annotations.NotNull()
    @com.battlelancer.seriesguide.modules.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.tools.GetShowTools getShowTools, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.battlelancer.seriesguide.sync.HexagonShowSync> hexagonShowSync, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.battlelancer.seriesguide.backend.HexagonTools> hexagonTools, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.battlelancer.seriesguide.shows.tools.ShowTools2> showTools) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowResult addShow(int showTmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String desiredLanguage, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Integer, ? extends com.uwetrottmann.trakt5.entities.BaseShow> traktCollection, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Integer, ? extends com.uwetrottmann.trakt5.entities.BaseShow> traktWatched, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.HexagonEpisodeSync hexagonEpisodeSync) {
        return null;
    }
    
    private final java.util.List<com.battlelancer.seriesguide.shows.database.SgSeason2> mapToSgSeason2(java.util.List<? extends com.uwetrottmann.tmdb2.entities.TvSeason> seasons, long showId) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.database.SgSeason2 mapToSgSeason2(com.uwetrottmann.tmdb2.entities.TvSeason tmdbSeason, long showId) {
        return null;
    }
    
    private final com.github.michaelbull.result.Result<com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.EpisodeDetails, com.battlelancer.seriesguide.tmdbapi.TmdbError> getEpisodesOfSeason(com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ReleaseInfo releaseInfo, int showTmdbId, long showId, int seasonNumber, long seasonId, java.lang.String language, java.util.Map<java.lang.Integer, com.battlelancer.seriesguide.shows.database.SgEpisode2Ids> localEpisodesByTmdbId, java.util.Map<java.lang.Integer, com.battlelancer.seriesguide.shows.database.SgEpisode2Ids> localEpisodesWithoutTmdbIdByNumber) {
        return null;
    }
    
    /**
     * If [localEpisodesByTmdbId] is not null, will add update or delete info.
     * Will choose to update episode if not found in [localEpisodesByTmdbId],
     * but found in [localEpisodesWithoutTmdbIdByNumber].
     */
    private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.EpisodeDetails mapToSgEpisode2(java.util.List<? extends com.uwetrottmann.tmdb2.entities.TvEpisode> tmdbEpisodes, java.util.List<? extends com.uwetrottmann.tmdb2.entities.TvEpisode> tmdbEpisodesFallback, com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ReleaseInfo releaseInfo, long showId, long seasonId, int seasonNumber, java.util.Map<java.lang.Integer, com.battlelancer.seriesguide.shows.database.SgEpisode2Ids> localEpisodesByTmdbId, java.util.Map<java.lang.Integer, com.battlelancer.seriesguide.shows.database.SgEpisode2Ids> localEpisodesWithoutTmdbIdByNumber) {
        return null;
    }
    
    /**
     * Updates a show. Adds new, updates changed and removes orphaned episodes.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult updateShow(long showId) {
        return null;
    }
    
    /**
     * Inserts, updates and removes (removal incl. episodes) seasons in the database based on the
     * given seasons.
     * Returns season IDs (and numbers) that were inserted or updated, excluding removed seasons.
     */
    private final java.util.List<com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.SeasonInfo> updateSeasons(java.util.List<? extends com.uwetrottmann.tmdb2.entities.TvSeason> tmdbSeasons, long showId) {
        return null;
    }
    
    /**
     * Finds TMDB ID by TVDB ID, then sets season and episode TMDB IDs by matching on numbers.
     * If Hexagon is enabled and not uploaded via TMDB ID, uploads show info and schedules
     * episode upload.
     */
    private final com.github.michaelbull.result.Result<java.lang.Integer, com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult> migrateShowToTmdbIds(long showId, java.lang.String language) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult migrateSeasonsToTmdbIds(long showId, int showTmdbId, java.lang.String language) {
        return null;
    }
    
    private final boolean uploadShowsToCloud(java.util.List<com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow> shows) {
        return false;
    }
    
    private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowResult toShowResult(com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError $this$toShowResult) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult toUpdateResult(com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError $this$toUpdateResult) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult toUpdateResult(com.battlelancer.seriesguide.backend.HexagonError $this$toUpdateResult) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult toUpdateResult(com.battlelancer.seriesguide.tmdbapi.TmdbError $this$toUpdateResult) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "IN_DATABASE", "DOES_NOT_EXIST", "TMDB_ERROR", "TRAKT_ERROR", "HEXAGON_ERROR", "DATABASE_ERROR", "app_pureDebug"})
    public static enum ShowResult {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ IN_DATABASE /* = new IN_DATABASE() */,
        /*public static final*/ DOES_NOT_EXIST /* = new DOES_NOT_EXIST() */,
        /*public static final*/ TMDB_ERROR /* = new TMDB_ERROR() */,
        /*public static final*/ TRAKT_ERROR /* = new TRAKT_ERROR() */,
        /*public static final*/ HEXAGON_ERROR /* = new HEXAGON_ERROR() */,
        /*public static final*/ DATABASE_ERROR /* = new DATABASE_ERROR() */;
        
        ShowResult() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$EpisodeDetails;", "", "toInsert", "", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "toUpdate", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Update;", "toRemove", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getToInsert", "()Ljava/util/List;", "getToRemove", "getToUpdate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_pureDebug"})
    public static final class EpisodeDetails {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2> toInsert = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Update> toUpdate = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> toRemove = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.EpisodeDetails copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2> toInsert, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Update> toUpdate, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> toRemove) {
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
        
        public EpisodeDetails(@org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2> toInsert, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Update> toUpdate, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> toRemove) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2> getToInsert() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Update> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Update> getToUpdate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getToRemove() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ReleaseInfo;", "", "releaseTimeZone", "", "releaseTimeOrDefault", "", "releaseCountry", "network", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getNetwork", "()Ljava/lang/String;", "getReleaseCountry", "getReleaseTimeOrDefault", "()I", "getReleaseTimeZone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_pureDebug"})
    public static final class ReleaseInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String releaseTimeZone = null;
        private final int releaseTimeOrDefault = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String releaseCountry = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String network = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ReleaseInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.String releaseTimeZone, int releaseTimeOrDefault, @org.jetbrains.annotations.Nullable()
        java.lang.String releaseCountry, @org.jetbrains.annotations.Nullable()
        java.lang.String network) {
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
        
        public ReleaseInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String releaseTimeZone, int releaseTimeOrDefault, @org.jetbrains.annotations.Nullable()
        java.lang.String releaseCountry, @org.jetbrains.annotations.Nullable()
        java.lang.String network) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReleaseTimeZone() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getReleaseTimeOrDefault() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReleaseCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getNetwork() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$SeasonInfo;", "", "id", "", "number", "", "(JI)V", "getId", "()J", "getNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_pureDebug"})
    public static final class SeasonInfo {
        private final long id = 0L;
        private final int number = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.SeasonInfo copy(long id, int number) {
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
        
        public SeasonInfo(long id, int number) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getNumber() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "", "nameResId", "", "(Ljava/lang/String;II)V", "getNameResId", "()I", "HEXAGON", "TMDB", "TRAKT", "app_pureDebug"})
    public static enum ShowService {
        /*public static final*/ HEXAGON /* = new HEXAGON(0) */,
        /*public static final*/ TMDB /* = new TMDB(0) */,
        /*public static final*/ TRAKT /* = new TRAKT(0) */;
        private final int nameResId = 0;
        
        ShowService(@androidx.annotation.StringRes()
        int nameResId) {
        }
        
        public final int getNameResId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult;", "", "()V", "ApiErrorRetry", "ApiErrorStop", "DatabaseError", "DoesNotExist", "Success", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$Success;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$DoesNotExist;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$ApiErrorStop;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$ApiErrorRetry;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$DatabaseError;", "app_pureDebug"})
    public static abstract class UpdateResult {
        
        private UpdateResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$Success;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult;", "()V", "app_pureDebug"})
        public static final class Success extends com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$DoesNotExist;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult;", "()V", "app_pureDebug"})
        public static final class DoesNotExist extends com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult.DoesNotExist INSTANCE = null;
            
            private DoesNotExist() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$ApiErrorStop;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult;", "service", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "(Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;)V", "getService", "()Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "app_pureDebug"})
        public static final class ApiErrorStop extends com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult {
            @org.jetbrains.annotations.NotNull()
            private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service = null;
            
            public ApiErrorStop(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService getService() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$ApiErrorRetry;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult;", "service", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "(Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;)V", "getService", "()Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "app_pureDebug"})
        public static final class ApiErrorRetry extends com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult {
            @org.jetbrains.annotations.NotNull()
            private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service = null;
            
            public ApiErrorRetry(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService getService() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult$DatabaseError;", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$UpdateResult;", "()V", "app_pureDebug"})
        public static final class DatabaseError extends com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.UpdateResult.DatabaseError INSTANCE = null;
            
            private DatabaseError() {
                super();
            }
        }
    }
}