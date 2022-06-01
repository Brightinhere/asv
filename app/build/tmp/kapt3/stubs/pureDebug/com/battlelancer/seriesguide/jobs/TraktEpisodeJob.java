package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/TraktEpisodeJob;", "Lcom/battlelancer/seriesguide/jobs/BaseNetworkEpisodeJob;", "action", "Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;", "jobInfo", "Lcom/battlelancer/seriesguide/jobs/SgJobInfo;", "actionAtMs", "", "(Lcom/battlelancer/seriesguide/jobs/episodes/JobAction;Lcom/battlelancer/seriesguide/jobs/SgJobInfo;J)V", "execute", "Lcom/battlelancer/seriesguide/sync/NetworkJobProcessor$JobResult;", "context", "Landroid/content/Context;", "getEpisodesForTrakt", "", "Lcom/uwetrottmann/trakt5/entities/SyncSeason;", "isAddNotDelete", "", "upload", "", "showTraktId", "Companion", "app_pureDebug"})
public final class TraktEpisodeJob extends com.battlelancer.seriesguide.jobs.BaseNetworkEpisodeJob {
    private final long actionAtMs = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.jobs.TraktEpisodeJob.Companion Companion = null;
    
    public TraktEpisodeJob(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.episodes.JobAction action, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.SgJobInfo jobInfo, long actionAtMs) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.sync.NetworkJobProcessor.JobResult execute(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final int upload(android.content.Context context, int showTraktId) {
        return 0;
    }
    
    /**
     * Builds a list of [SyncSeason] objects to submit to Trakt.
     */
    private final java.util.List<com.uwetrottmann.trakt5.entities.SyncSeason> getEpisodesForTrakt(boolean isAddNotDelete) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/TraktEpisodeJob$Companion;", "", "()V", "isSyncSuccessful", "", "response", "Lcom/uwetrottmann/trakt5/entities/SyncResponse;", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * If the [SyncResponse.not_found] indicates any show,
         * season or episode was not found returns `false`.
         */
        private final boolean isSyncSuccessful(com.uwetrottmann.trakt5.entities.SyncResponse response) {
            return false;
        }
    }
}