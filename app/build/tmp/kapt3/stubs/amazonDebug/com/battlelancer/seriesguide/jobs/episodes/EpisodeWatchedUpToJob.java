package com.battlelancer.seriesguide.jobs.episodes;

import java.lang.System;

/**
 * Set episodes watched up to (== including) a specific one excluding those with no release date.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/episodes/EpisodeWatchedUpToJob;", "Lcom/battlelancer/seriesguide/jobs/episodes/BaseEpisodesJob;", "showId", "", "episodeFirstAired", "episodeNumber", "", "(JJI)V", "applyDatabaseChanges", "", "context", "Landroid/content/Context;", "applyLocalChanges", "requiresNetworkJob", "getConfirmationText", "", "getEpisodesForNetworkJob", "", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Numbers;", "getPlaysForNetworkJob", "plays", "getShowId", "app_amazonDebug"})
public final class EpisodeWatchedUpToJob extends com.battlelancer.seriesguide.jobs.episodes.BaseEpisodesJob {
    private final long showId = 0L;
    private final long episodeFirstAired = 0L;
    private final int episodeNumber = 0;
    
    public EpisodeWatchedUpToJob(long showId, long episodeFirstAired, int episodeNumber) {
        super(0, null);
    }
    
    @java.lang.Override()
    protected long getShowId() {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean applyLocalChanges(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean requiresNetworkJob) {
        return false;
    }
    
    @java.lang.Override()
    protected boolean applyDatabaseChanges(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2Numbers> getEpisodesForNetworkJob(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Note: this should mirror the planned database changes in [applyDatabaseChanges].
     */
    @java.lang.Override()
    protected int getPlaysForNetworkJob(int plays) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getConfirmationText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}