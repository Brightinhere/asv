package com.battlelancer.seriesguide.settings;

import java.lang.System;

/**
 * Access advanced settings for auto backup and auto update.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/settings/AdvancedSettings;", "", "()V", "KEY_LAST_SUPPORTER_STATE", "", "KEY_UPCOMING_LIMIT", "getLastSupporterState", "", "context", "Landroid/content/Context;", "getUpcomingLimitInDays", "", "setSupporterState", "", "isSubscribedToX", "app_amazonDebug"})
public final class AdvancedSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.settings.AdvancedSettings INSTANCE = null;
    private static final java.lang.String KEY_LAST_SUPPORTER_STATE = "com.battlelancer.seriesguide.lastupgradestate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_UPCOMING_LIMIT = "com.battlelancer.seriesguide.upcominglimit";
    
    private AdvancedSettings() {
        super();
    }
    
    /**
     * (Only Amazon version) Returns if the user was a supporter through an in-app purchase
     * the last time we checked.
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean getLastSupporterState(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * (Only Amazon version) Set if the user currently has an active purchase to support the app.
     */
    @kotlin.jvm.JvmStatic()
    public static final void setSupporterState(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isSubscribedToX) {
    }
    
    /**
     * Returns the maximum number of days from today on an episode can air for its show to be
     * considered as upcoming. Returns -1 if any future release date is considered upcoming.
     */
    public final int getUpcomingLimitInDays(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
}