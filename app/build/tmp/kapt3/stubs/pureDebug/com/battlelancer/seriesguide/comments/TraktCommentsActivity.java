package com.battlelancer.seriesguide.comments;

import java.lang.System;

/**
 * Hosts a [TraktCommentsFragment].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0014\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/comments/TraktCommentsActivity;", "Lcom/battlelancer/seriesguide/ui/BaseActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setupActionBar", "Companion", "app_pureDebug"})
public final class TraktCommentsActivity extends com.battlelancer.seriesguide.ui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.comments.TraktCommentsActivity.Companion Companion = null;
    public static final int LOADER_ID_COMMENTS = 100;
    private static final java.lang.String EXTRA_TITLE = "title";
    
    public TraktCommentsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * Display comments of an episode.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intentEpisode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String title, long episodeId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0006J \u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/comments/TraktCommentsActivity$Companion;", "", "()V", "EXTRA_TITLE", "", "LOADER_ID_COMMENTS", "", "intentEpisode", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "title", "episodeId", "", "intentMovie", "movieTmdbId", "intentShow", "showId", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Display comments of an episode.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intentEpisode(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String title, long episodeId) {
            return null;
        }
        
        /**
         * Display comments of a show.
         */
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent intentShow(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String title, long showId) {
            return null;
        }
        
        /**
         * Display comments of a movie.
         */
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent intentMovie(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String title, int movieTmdbId) {
            return null;
        }
    }
}