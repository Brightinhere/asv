package com.battlelancer.seriesguide.ui;

import java.lang.System;

/**
 * Shell to avoid breaking AndroidManifest.xml and shortcuts.xml and other references to this name.
 * Implementation moved to feature-specific package.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/battlelancer/seriesguide/ui/OverviewActivity;", "Lcom/battlelancer/seriesguide/shows/overview/OverviewActivityImpl;", "()V", "Companion", "app_amazonDebug"})
public final class OverviewActivity extends com.battlelancer.seriesguide.shows.overview.OverviewActivityImpl {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.ui.OverviewActivity.Companion Companion = null;
    
    public OverviewActivity() {
        super();
    }
    
    /**
     * After opening, switches to overview tab (only if not multi-pane).
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intentShowByTmdbId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int showTmdbId) {
        return null;
    }
    
    /**
     * After opening, switches to overview tab (only if not multi-pane).
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intentShow(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long showRowId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/ui/OverviewActivity$Companion;", "", "()V", "intentSeasons", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "showRowId", "", "intentShow", "intentShowByTmdbId", "showTmdbId", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * After opening, switches to overview tab (only if not multi-pane).
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intentShowByTmdbId(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int showTmdbId) {
            return null;
        }
        
        /**
         * After opening, switches to overview tab (only if not multi-pane).
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intentShow(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long showRowId) {
            return null;
        }
        
        /**
         * After opening, switches to seasons tab (only if not multi-pane).
         */
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent intentSeasons(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long showRowId) {
            return null;
        }
    }
}