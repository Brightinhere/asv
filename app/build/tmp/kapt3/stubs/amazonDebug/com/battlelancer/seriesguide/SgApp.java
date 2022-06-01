package com.battlelancer.seriesguide;

import java.lang.System;

/**
 * Initializes logging and services.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0003J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/SgApp;", "Landroid/app/Application;", "()V", "enableStrictMode", "", "initializeEventBus", "initializeLogging", "initializeNotificationChannels", "initializePicasso", "initializeSecurityProvider", "onCreate", "Companion", "app_amazonDebug"})
public final class SgApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.SgApp.Companion Companion = null;
    public static final int JOB_ID_EXTENSION_AMAZON = 1001;
    public static final int JOB_ID_EXTENSION_GOOGLE_PLAY = 1002;
    public static final int JOB_ID_EXTENSION_VODSTER = 1003;
    public static final int JOB_ID_EXTENSION_WEBSEARCH = 1004;
    public static final int JOB_ID_EXTENSION_YOUTUBE = 1005;
    public static final int JOB_ID_EXTENSION_ACTIONS_SERVICE = 1006;
    public static final int NOTIFICATION_EPISODE_ID = 1;
    public static final int NOTIFICATION_SUBSCRIPTION_ID = 2;
    public static final int NOTIFICATION_TRAKT_AUTH_ID = 3;
    public static final int NOTIFICATION_JOB_ID = 4;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_EPISODES = "episodes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ERRORS = "errors";
    
    /**
     * Time calculation has changed, all episodes need re-calculation.
     */
    public static final int RELEASE_VERSION_12_BETA5 = 218;
    
    /**
     * Requires legacy cache clearing due to switch to Picasso for posters.
     */
    public static final int RELEASE_VERSION_16_BETA1 = 15010;
    
    /**
     * Requires trakt watched movie (re-)download.
     */
    public static final int RELEASE_VERSION_23_BETA4 = 15113;
    
    /**
     * Requires full show update due to switch to locally stored trakt ids.
     */
    public static final int RELEASE_VERSION_26_BETA3 = 15142;
    
    /**
     * Populate shows last watched field from activity table.
     */
    public static final int RELEASE_VERSION_34_BETA4 = 15223;
    
    /**
     * Switched to Google Sign-In: notify existing Cloud users to sign in again.
     */
    public static final int RELEASE_VERSION_36_BETA2 = 15241;
    
    /**
     * Extensions API v2, old extensions no longer work.
     */
    public static final int RELEASE_VERSION_40_BETA4 = 1502803;
    
    /**
     * ListWidgetProvider alarm intent is now explicit.
     */
    public static final int RELEASE_VERSION_40_BETA6 = 1502805;
    
    /**
     * For trakt and hexagon sync movies were not added in all cases, reset sync times.
     */
    public static final int RELEASE_VERSION_50_1 = 2105008;
    public static final int RELEASE_VERSION_51_BETA4 = 2105103;
    public static final int RELEASE_VERSION_59_BETA1 = 2105900;
    
    /**
     * The content authority used to identify the SeriesGuide [android.content.ContentProvider].
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONTENT_AUTHORITY = "com.uwetrottmann.seriesguide.amzn.provider";
    
    /**
     * A global [CoroutineScope] to avoid using [kotlinx.coroutines.GlobalScope]
     * and leave open the possibility of exception handling and other things.
     * Uses [Dispatchers.Default] by default.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    /**
     * Executes one coroutine at a time. But does not guarantee order if they suspend.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.ExecutorCoroutineDispatcher SINGLE = null;
    private static com.battlelancer.seriesguide.modules.ServicesComponent servicesComponent;
    
    public SgApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized com.battlelancer.seriesguide.modules.ServicesComponent getServicesComponent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * Tell Google Play Services to update the security provider.
     * This enables older devices to keep connecting to APIs and image servers
     * by use modern encryption.
     */
    private final void initializeSecurityProvider() {
    }
    
    private final void initializeLogging() {
    }
    
    private final void initializeEventBus() {
    }
    
    private final void initializePicasso() {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.O)
    private final void initializeNotificationChannels() {
    }
    
    /**
     * Used to enable [StrictMode] for debug builds.
     */
    private final void enableStrictMode() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/battlelancer/seriesguide/SgApp$Companion;", "", "()V", "CONTENT_AUTHORITY", "", "JOB_ID_EXTENSION_ACTIONS_SERVICE", "", "JOB_ID_EXTENSION_AMAZON", "JOB_ID_EXTENSION_GOOGLE_PLAY", "JOB_ID_EXTENSION_VODSTER", "JOB_ID_EXTENSION_WEBSEARCH", "JOB_ID_EXTENSION_YOUTUBE", "NOTIFICATION_CHANNEL_EPISODES", "NOTIFICATION_CHANNEL_ERRORS", "NOTIFICATION_EPISODE_ID", "NOTIFICATION_JOB_ID", "NOTIFICATION_SUBSCRIPTION_ID", "NOTIFICATION_TRAKT_AUTH_ID", "RELEASE_VERSION_12_BETA5", "RELEASE_VERSION_16_BETA1", "RELEASE_VERSION_23_BETA4", "RELEASE_VERSION_26_BETA3", "RELEASE_VERSION_34_BETA4", "RELEASE_VERSION_36_BETA2", "RELEASE_VERSION_40_BETA4", "RELEASE_VERSION_40_BETA6", "RELEASE_VERSION_50_1", "RELEASE_VERSION_51_BETA4", "RELEASE_VERSION_59_BETA1", "SINGLE", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getSINGLE", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "servicesComponent", "Lcom/battlelancer/seriesguide/modules/ServicesComponent;", "getServicesComponent", "context", "Landroid/content/Context;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.ExecutorCoroutineDispatcher getSINGLE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        @kotlin.jvm.JvmStatic()
        public final synchronized com.battlelancer.seriesguide.modules.ServicesComponent getServicesComponent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}