package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

/**
 * Asks user to confirm before flagging all episodes
 * released up to (== including) the given one as watched,
 * excluding those with no release date.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodeWatchedUpToDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "episodeNumber", "", "episodeReleaseTime", "", "showId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "app_pureDebug"})
public final class EpisodeWatchedUpToDialog extends androidx.appcompat.app.AppCompatDialogFragment {
    private long showId = 0L;
    private long episodeReleaseTime = 0L;
    private int episodeNumber = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.episodes.EpisodeWatchedUpToDialog.Companion Companion = null;
    private static final java.lang.String ARG_SHOW_ID = "ARG_SHOW_ID";
    private static final java.lang.String ARG_EPISODE_RELEASE_TIME = "ARG_EPISODE_RELEASE_TIME";
    private static final java.lang.String ARG_EPISODE_NUMBER = "ARG_EPISODE_NUMBER";
    
    public EpisodeWatchedUpToDialog() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.shows.episodes.EpisodeWatchedUpToDialog newInstance(long showId, long episodeReleaseTime, int episodeNumber) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodeWatchedUpToDialog$Companion;", "", "()V", "ARG_EPISODE_NUMBER", "", "ARG_EPISODE_RELEASE_TIME", "ARG_SHOW_ID", "newInstance", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodeWatchedUpToDialog;", "showId", "", "episodeReleaseTime", "episodeNumber", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodeWatchedUpToDialog newInstance(long showId, long episodeReleaseTime, int episodeNumber) {
            return null;
        }
    }
}