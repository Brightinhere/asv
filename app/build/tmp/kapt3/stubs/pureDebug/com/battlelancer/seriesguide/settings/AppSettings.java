package com.battlelancer.seriesguide.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/settings/AppSettings;", "", "()V", "KEY_ASKED_FOR_FEEDBACK", "", "KEY_GOOGLEANALYTICS", "getKEY_GOOGLEANALYTICS$annotations", "KEY_HAS_SEEN_NAV_DRAWER", "getKEY_HAS_SEEN_NAV_DRAWER$annotations", "KEY_SEND_ERROR_REPORTS", "KEY_USER_DEBUG_MODE_ENBALED", "KEY_VERSION", "getLastVersionCode", "", "context", "Landroid/content/Context;", "isSendErrorReports", "", "isUserDebugModeEnabled", "setAskedForFeedback", "", "setSendErrorReports", "isEnabled", "save", "shouldAskForFeedback", "app_pureDebug"})
public final class AppSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.settings.AppSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_VERSION = "oldversioncode";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String KEY_GOOGLEANALYTICS = "enableGAnalytics";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String KEY_HAS_SEEN_NAV_DRAWER = "hasSeenNavDrawer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ASKED_FOR_FEEDBACK = "askedForFeedback";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SEND_ERROR_REPORTS = "com.battlelancer.seriesguide.sendErrorReports";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_DEBUG_MODE_ENBALED = "com.battlelancer.seriesguide.userDebugModeEnabled";
    
    private AppSettings() {
        super();
    }
    
    @java.lang.Deprecated()
    public static void getKEY_GOOGLEANALYTICS$annotations() {
    }
    
    @java.lang.Deprecated()
    public static void getKEY_HAS_SEEN_NAV_DRAWER$annotations() {
    }
    
    /**
     * Returns the version code of the previously installed version. Is the current version on fresh
     * installs.
     */
    @kotlin.jvm.JvmStatic()
    public static final int getLastVersionCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean shouldAskForFeedback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setAskedForFeedback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isSendErrorReports(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void setSendErrorReports(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isEnabled, boolean save) {
    }
    
    /**
     * Returns if user-visible debug components should be enabled
     * (e.g. logging to logcat, debug views). Always true for debug builds.
     */
    public final boolean isUserDebugModeEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}