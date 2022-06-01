package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Tools to periodically ask users to support the developer of this app.
 * Some might not even be aware this is possible.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/util/SupportTheDev;", "", "()V", "DURATION_ASK_AGAIN", "", "PREF_SUPPORT_DEV_LAST_DISMISSED", "", "buildSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "context", "Landroid/content/Context;", "parentView", "Landroid/view/View;", "shouldAsk", "", "saveLastDismissed", "", "Landroid/content/SharedPreferences;", "timeInMillis", "app_pureDebug"})
public final class SupportTheDev {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.SupportTheDev INSTANCE = null;
    private static final java.lang.String PREF_SUPPORT_DEV_LAST_DISMISSED = "com.uwetrottmann.seriesguide.support_dev_last_dismissed";
    private static final long DURATION_ASK_AGAIN = 3628800000L;
    
    private SupportTheDev() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean shouldAsk(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private final void saveLastDismissed(android.content.SharedPreferences $this$saveLastDismissed, long timeInMillis) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.google.android.material.snackbar.Snackbar buildSnackbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View parentView) {
        return null;
    }
}