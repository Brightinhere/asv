package com.battlelancer.seriesguide.notifications;

import java.lang.System;

/**
 * To debug set [.DEBUG] to true.
 *
 * Useful commands:
 *
 * Dump alarms:
 *
 * `adb shell dumpsys alarm > alarms.txt`
 *
 * Doze mode:
 * ```
 * adb shell dumpsys deviceidle force-idle
 *
 * adb shell dumpsys deviceidle unforce
 * ```
 *
 * App Standby:
 * ```
 * adb shell dumpsys battery unplug
 * adb shell am set-inactive com.battlelancer.seriesguide true
 *
 * adb shell am set-inactive com.battlelancer.seriesguide false
 *
 * adb shell am get-inactive com.battlelancer.seriesguide
 * ```
 *
 * https://developer.android.com/training/monitoring-device-state/doze-standby.html
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J,\u0010\u0018\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0006\u0010\u001e\u001a\u00020\u000bJ&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\f\u0010#\u001a\u00020 *\u00020$H\u0002R\u0016\u0010\u0002\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006&"}, d2 = {"Lcom/battlelancer/seriesguide/notifications/NotificationService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "kotlin.jvm.PlatformType", "wakeUpPendingIntent", "Landroid/app/PendingIntent;", "getWakeUpPendingIntent", "()Landroid/app/PendingIntent;", "maybeNotify", "", "prefs", "Landroid/content/SharedPreferences;", "upcomingEpisodes", "", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;", "latestTimeToInclude", "", "maybeSetPoster", "nb", "Landroidx/core/app/NotificationCompat$Builder;", "posterPath", "", "notifyAbout", "notifyPositions", "", "latestAirtime", "queryUpcomingEpisodes", "customCurrentTime", "run", "shouldCheckToNotify", "", "plannedWakeUpTime", "nextEpisodeReleaseTime", "canScheduleExactAlarmsCompat", "Landroid/app/AlarmManager;", "Companion", "app_amazonDebug"})
public final class NotificationService {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.notifications.NotificationService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CLEARED = "seriesguide.intent.action.CLEARED";
    private static final java.lang.String EXTRA_EPISODE_CLEARED_TIME = "com.battlelancer.seriesguide.episode_cleared_time";
    private static final boolean DEBUG = false;
    private static final int REQUEST_CODE_DELETE_INTENT = 1;
    private static final int REQUEST_CODE_SINGLE_EPISODE = 2;
    private static final int REQUEST_CODE_MULTIPLE_EPISODES = 3;
    private static final int REQUEST_CODE_ACTION_CHECKIN = 4;
    private static final int REQUEST_CODE_ACTION_SET_WATCHED = 4;
    @org.jetbrains.annotations.NotNull()
    private static final long[] VIBRATION_PATTERN = {0L, 100L, 200L, 100L, 100L, 100L};
    private static final java.lang.String SELECTION = "series_notify = 1 AND episode_watched=0 AND episode_firstairedms>= ? AND episode_firstairedms< ?";
    
    /**
     * By release date, then by show, then lowest number first.
     */
    private static final java.lang.String ORDER = "episode_firstairedms ASC,series_title COLLATE UNICODE ASC,episode_number ASC";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.Executor SERIAL_EXECUTOR = null;
    
    public NotificationService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final android.app.PendingIntent getWakeUpPendingIntent() {
        return null;
    }
    
    public final void run() {
    }
    
    /**
     * Returns if the service may need to display notifications and should find a new wake-up time,
     * or otherwise should go to sleep and wake-up as planned.
     *
     * True if running for the first time ([plannedWakeUpTime] is <= 0) or woken up as planned
     * (or later). Also if woken up earlier than planned and
     * - there are no [upcomingEpisodes], or
     * - there is an upcoming episode released before [nextEpisodeReleaseTime] and after the release
     *  time of the last one notified about, or
     * - there is no upcoming episode released at [nextEpisodeReleaseTime].
     */
    @androidx.annotation.VisibleForTesting()
    public final boolean shouldCheckToNotify(long plannedWakeUpTime, long nextEpisodeReleaseTime, @org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow> upcomingEpisodes) {
        return false;
    }
    
    private final boolean canScheduleExactAlarmsCompat(android.app.AlarmManager $this$canScheduleExactAlarmsCompat) {
        return false;
    }
    
    /**
     * Get episodes which released 12 hours ago until in 14 days (to avoid
     * loading too much data), excludes some episodes based on user settings.
     * Ordered by [ORDER].
     */
    private final java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow> queryUpcomingEpisodes(long customCurrentTime) {
        return null;
    }
    
    private final void maybeNotify(android.content.SharedPreferences prefs, java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow> upcomingEpisodes, long latestTimeToInclude) {
    }
    
    private final void notifyAbout(java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow> upcomingEpisodes, java.util.List<java.lang.Integer> notifyPositions, long latestAirtime) {
    }
    
    private final void maybeSetPoster(androidx.core.app.NotificationCompat.Builder nb, java.lang.String posterPath) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lcom/battlelancer/seriesguide/notifications/NotificationService$Companion;", "", "()V", "ACTION_CLEARED", "", "DEBUG", "", "EXTRA_EPISODE_CLEARED_TIME", "ORDER", "REQUEST_CODE_ACTION_CHECKIN", "", "REQUEST_CODE_ACTION_SET_WATCHED", "REQUEST_CODE_DELETE_INTENT", "REQUEST_CODE_MULTIPLE_EPISODES", "REQUEST_CODE_SINGLE_EPISODE", "SELECTION", "SERIAL_EXECUTOR", "Ljava/util/concurrent/Executor;", "getSERIAL_EXECUTOR", "()Ljava/util/concurrent/Executor;", "VIBRATION_PATTERN", "", "getVIBRATION_PATTERN", "()[J", "handleDeleteIntent", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "trigger", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final long[] getVIBRATION_PATTERN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.concurrent.Executor getSERIAL_EXECUTOR() {
            return null;
        }
        
        /**
         * Send broadcast to run the notification service to display and (re)schedule upcoming episode
         * alarms.
         */
        public final void trigger(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * Extracts the last cleared time and stores it in settings.
         */
        public final void handleDeleteIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
    }
}