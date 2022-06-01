package com.battlelancer.seriesguide.shows.calendar;

import java.lang.System;

/**
 * Access settings specifically related to the calendar views, e.g. upcoming and recent episodes.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarSettings;", "", "()V", "KEY_HIDE_WATCHED_EPISODES", "", "KEY_INFINITE_SCROLLING_2", "KEY_ONLY_COLLECTED", "KEY_ONLY_FAVORITE_SHOWS", "KEY_ONLY_PREMIERES", "isHidingWatchedEpisodes", "", "context", "Landroid/content/Context;", "isInfiniteScrolling", "isOnlyCollected", "isOnlyFavorites", "isOnlyPremieres", "app_amazonDebug"})
public final class CalendarSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.calendar.CalendarSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_HIDE_WATCHED_EPISODES = "com.battlelancer.seriesguide.activity.nowatched";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_INFINITE_SCROLLING_2 = "com.battlelancer.seriesguide.calendar.infinite";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ONLY_COLLECTED = "com.battlelancer.seriesguide.activity.onlycollected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ONLY_FAVORITE_SHOWS = "com.battlelancer.seriesguide.onlyfavorites";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ONLY_PREMIERES = "com.battlelancer.seriesguide.calendar.onlypremieres";
    
    private CalendarSettings() {
        super();
    }
    
    /**
     * Whether the calendar should not include watched episodes.
     */
    public final boolean isHidingWatchedEpisodes(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether the calendar should be infinite (default) or limited to a number of days.
     */
    public final boolean isInfiniteScrolling(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether the calendar should only include collected episodes.
     */
    public final boolean isOnlyCollected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether the calendar should only include episodes from favorite shows.
     */
    public final boolean isOnlyFavorites(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether the calendar should only include first episodes (premieres).
     */
    public final boolean isOnlyPremieres(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}