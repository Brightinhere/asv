package com.battlelancer.seriesguide.shows.tools;

import java.lang.System;

/**
 * Show status valued as stored in the database in [com.battlelancer.seriesguide.provider.SeriesGuideContract.Shows.STATUS].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/ShowStatus;", "", "Companion", "app_pureDebug"})
public abstract interface ShowStatus {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.tools.ShowStatus.Companion Companion = null;
    public static final int IN_PRODUCTION = 5;
    public static final int PILOT = 4;
    public static final int PLANNED = 2;
    
    /**
     * Episodes are to be released.
     */
    public static final int RETURNING = 1;
    
    /**
     * Typically all episodes released, with a planned ending.
     */
    public static final int ENDED = 0;
    public static final int UNKNOWN = -1;
    
    /**
     * Typically all episodes released, but abruptly ended.
     */
    public static final int CANCELED = -2;
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/ShowStatus$Companion;", "", "()V", "CANCELED", "", "ENDED", "IN_PRODUCTION", "PILOT", "PLANNED", "RETURNING", "UNKNOWN", "getStatus", "", "context", "Landroid/content/Context;", "encodedStatus", "setStatusAndColor", "", "view", "Landroid/widget/TextView;", "app_pureDebug"})
    public static final class Companion {
        public static final int IN_PRODUCTION = 5;
        public static final int PILOT = 4;
        public static final int PLANNED = 2;
        
        /**
         * Episodes are to be released.
         */
        public static final int RETURNING = 1;
        
        /**
         * Typically all episodes released, with a planned ending.
         */
        public static final int ENDED = 0;
        public static final int UNKNOWN = -1;
        
        /**
         * Typically all episodes released, but abruptly ended.
         */
        public static final int CANCELED = -2;
        
        private Companion() {
            super();
        }
        
        /**
         * Decodes the [ShowTools.Status] and returns the localized text representation.
         * May be `null` if status is unknown.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStatus(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int encodedStatus) {
            return null;
        }
        
        /**
         * Gets the show status from [getStatus] and sets a status dependant text color on the
         * given view.
         *
         * @param encodedStatus Detection based on [ShowStatus].
         */
        public final void setStatusAndColor(@org.jetbrains.annotations.NotNull()
        android.widget.TextView view, int encodedStatus) {
        }
    }
}