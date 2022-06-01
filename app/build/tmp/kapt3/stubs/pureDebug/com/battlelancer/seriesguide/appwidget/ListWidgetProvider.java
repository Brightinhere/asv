package com.battlelancer.seriesguide.appwidget;

import java.lang.System;

/**
 * [AppWidgetProvider] for the list widget handles general widget layout and theme
 * and scheduling updates.
 *
 * Useful commands for testing:
 *
 * Dump alarms: `adb shell dumpsys alarm > alarms.txt`
 *
 * Note: Doze mode and App Standby should have no effect on the alarm. Instead turn off the
 * device screen.
 *
 * https://developer.android.com/training/monitoring-device-state/doze-standby.html
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/appwidget/ListWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "buildDataChangedPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "onAppWidgetOptionsChanged", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "onDisabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetIds", "", "scheduleWidgetUpdate", "Companion", "app_pureDebug"})
public final class ListWidgetProvider extends android.appwidget.AppWidgetProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.appwidget.ListWidgetProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DATA_CHANGED = "com.battlelancer.seriesguide.appwidget.UPDATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CLICK_ITEM = "seriesguide.appwidget.ACTION_CLICK_ITEM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SHOWS_TAB_INDEX = "SHOWS_TAB_INDEX";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EPISODE_ID = "EPISODE_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EPISODE_FLAG = "EPISODE_FLAG";
    public static final int REQUEST_CODE = 195;
    private static final long REPETITION_INTERVAL = 300000L;
    private static final int DIP_THRESHOLD_COMPACT_LAYOUT = 80;
    private static final boolean USE_NONCE_WORKAROUND = false;
    private static final java.util.Random random = null;
    
    public ListWidgetProvider() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onDisabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    private final void scheduleWidgetUpdate(android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onAppWidgetOptionsChanged(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle newOptions) {
    }
    
    private final android.app.PendingIntent buildDataChangedPendingIntent(android.content.Context context) {
        return null;
    }
    
    /**
     * Send broadcast to update lists of all list widgets.
     */
    @kotlin.jvm.JvmStatic()
    public static final void notifyDataChanged(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/battlelancer/seriesguide/appwidget/ListWidgetProvider$Companion;", "", "()V", "ACTION_CLICK_ITEM", "", "ACTION_DATA_CHANGED", "DIP_THRESHOLD_COMPACT_LAYOUT", "", "EXTRA_EPISODE_FLAG", "EXTRA_EPISODE_ID", "EXTRA_SHOWS_TAB_INDEX", "REPETITION_INTERVAL", "", "REQUEST_CODE", "USE_NONCE_WORKAROUND", "", "random", "Ljava/util/Random;", "buildDataChangedIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "buildRemoteViews", "Landroid/widget/RemoteViews;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "isCompactLayout", "notifyDataChanged", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Send broadcast to update lists of all list widgets.
         */
        @kotlin.jvm.JvmStatic()
        public final void notifyDataChanged(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RemoteViews buildRemoteViews(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId) {
            return null;
        }
        
        /**
         * Based on the widget size determines whether to use a compact layout.
         */
        private final boolean isCompactLayout(android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId) {
            return false;
        }
        
        private final android.content.Intent buildDataChangedIntent(android.content.Context context) {
            return null;
        }
    }
}