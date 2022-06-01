package com.battlelancer.seriesguide.settings;

import java.lang.System;

/**
 * Access settings related to the notification service.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0007J\u0016\u0010%\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0012J\u0016\u0010\'\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/battlelancer/seriesguide/settings/NotificationSettings;", "", "()V", "KEY_CHANNELS", "", "KEY_ENABLED", "KEY_IGNORE_HIDDEN", "KEY_LAST_CLEARED", "KEY_LAST_NOTIFIED", "KEY_NEXT_TO_NOTIFY", "KEY_ONLY_NEXT_EPISODE", "KEY_RINGTONE", "KEY_SELECTION", "KEY_THRESHOLD", "KEY_VIBRATE", "THRESHOLD_DEFAULT_MIN", "", "getLastCleared", "", "context", "Landroid/content/Context;", "getLastNotifiedAbout", "getLatestToIncludeTreshold", "getLatestToIncludeTresholdValue", "", "getNextToNotifyAbout", "getNotificationsRingtone", "isIgnoreHiddenShows", "", "isNotificationVibrating", "isNotificationsEnabled", "isOnlyNextEpisodes", "resetLastEpisodeAirtime", "", "setDefaultsForChannelErrors", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "setLastCleared", "clearedTime", "setLastNotifiedAbout", "releaseTime", "app_pureDebug"})
public final class NotificationSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.settings.NotificationSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ENABLED = "com.battlelancer.seriesguide.notifications";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_THRESHOLD = "com.battlelancer.seriesguide.notifications.threshold";
    
    /**
     * Just a link to a screen to select shows to notify about.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SELECTION = "com.battlelancer.seriesguide.notifications.shows";
    
    /**
     * Only visible on O+. Link to system settings app to modify further notification settings.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_CHANNELS = "com.battlelancer.seriesguide.notifications.channels";
    private static final java.lang.String KEY_LAST_CLEARED = "com.battlelancer.seriesguide.notifications.latestcleared";
    private static final java.lang.String KEY_LAST_NOTIFIED = "com.battlelancer.seriesguide.notifications.latestnotified";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_NEXT_TO_NOTIFY = "com.battlelancer.seriesguide.notifications.next";
    
    /**
     * Only visible on pre-O.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_RINGTONE = "com.battlelancer.seriesguide.notifications.ringtone";
    
    /**
     * Only visible on pre-O.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_VIBRATE = "com.battlelancer.seriesguide.notifications.vibrate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_IGNORE_HIDDEN = "com.battlelancer.seriesguide.notifications.hidden";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ONLY_NEXT_EPISODE = "com.uwetrottmann.seriesguide.notifications.nextonly";
    private static final int THRESHOLD_DEFAULT_MIN = 10;
    
    private NotificationSettings() {
        super();
    }
    
    public final boolean isNotificationsEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * How far into the future to include upcoming episodes in minutes.
     */
    public final int getLatestToIncludeTreshold(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * Text value when notifications for new episodes are shown, such as '10 minutes before'.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence getLatestToIncludeTresholdValue(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Get the air time of the next episode we plan to notify about.
     */
    public final long getNextToNotifyAbout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0L;
    }
    
    /**
     * Get the air time of the episode the user cleared last.
     */
    public final long getLastCleared(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0L;
    }
    
    public final void setLastCleared(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long clearedTime) {
    }
    
    /**
     * Get the air time of the episode we last notified about.
     */
    public final long getLastNotifiedAbout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0L;
    }
    
    public final void setLastNotifiedAbout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long releaseTime) {
    }
    
    /**
     * Resets the air time of the last notified about episode. Afterwards notifications for episodes
     * may appear, which were already notified about.
     */
    public final void resetLastEpisodeAirtime(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * @return Empty (!) string if silent, otherwise ringtone URI.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotificationsRingtone(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean isNotificationVibrating(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether hidden shows should be ignored when notifying about upcoming episodes.
     */
    public final boolean isIgnoreHiddenShows(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether only notifications for a shows next episode should be shown.
     */
    public final boolean isOnlyNextEpisodes(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setDefaultsForChannelErrors(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder builder) {
    }
}