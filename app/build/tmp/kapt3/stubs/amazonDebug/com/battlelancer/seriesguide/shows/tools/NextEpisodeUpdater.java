package com.battlelancer.seriesguide.shows.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/NextEpisodeUpdater;", "", "()V", "buildNextEpisodeSelection", "", "isHidingSpecials", "", "isNoReleasedEpisodes", "updateForShows", "", "context", "Landroid/content/Context;", "showIdOrNull", "(Landroid/content/Context;Ljava/lang/Long;)J", "Companion", "app_amazonDebug"})
public final class NextEpisodeUpdater {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.tools.NextEpisodeUpdater.Companion Companion = null;
    
    /**
     * Used for show next episode time value, see [SgShow2Columns.NEXTAIRDATEMS].
     * Ensures these shows are sorted last if sorting by oldest episode first,
     * and first if sorting by latest episode. Also affects filter settings.
     * See [com.battlelancer.seriesguide.ui.shows.ShowsViewModel] and
     * [com.battlelancer.seriesguide.ui.shows.ShowsDistillationSettings].
     */
    public static final long UNKNOWN_NEXT_RELEASE_DATE = 9223372036854775807L;
    
    /**
     * Less plays, not skipped, released later
     * or has a different (to also match specials) number or season if released the same time.
     */
    private static final java.lang.String SELECT_NEXT = "episode_plays<? AND episode_watched!=2 AND ((episode_firstairedms=? AND (episode_number!=? OR episode_season_number!=?)) OR episode_firstairedms>?)";
    private static final java.lang.String SELECT_WITHAIRDATE = " AND episode_firstairedms!=-1";
    private static final java.lang.String SELECT_ONLYFUTURE = " AND episode_firstairedms>=?";
    
    /**
     * Oldest release date first, then lowest season, then lowest episode number.
     */
    private static final java.lang.String SORTORDER = "episode_firstairedms ASC,episode_season_number ASC,episode_number ASC";
    
    public NextEpisodeUpdater() {
        super();
    }
    
    /**
     * Update next episode field and unwatched episode count for the given show. If no show id is
     * passed, will update next episodes for all shows.
     *
     * @return If only one show was passed, the row id of the new next episode. Otherwise -1.
     */
    public final long updateForShows(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Long showIdOrNull) {
        return 0L;
    }
    
    private final java.lang.String buildNextEpisodeSelection(boolean isHidingSpecials, boolean isNoReleasedEpisodes) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/NextEpisodeUpdater$Companion;", "", "()V", "SELECT_NEXT", "", "SELECT_ONLYFUTURE", "SELECT_WITHAIRDATE", "SORTORDER", "UNKNOWN_NEXT_RELEASE_DATE", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}