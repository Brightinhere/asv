package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

/**
 * Blank activity, just used to quickly check into a show/episode.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0014\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/QuickCheckInActivity;", "Lcom/battlelancer/seriesguide/ui/BaseThemeActivity;", "()V", "getCustomTheme", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onEvent", "event", "Lcom/battlelancer/seriesguide/traktapi/GenericCheckInDialogFragment$CheckInDialogDismissedEvent;", "Lcom/battlelancer/seriesguide/traktapi/TraktTask$TraktActionCompleteEvent;", "onStart", "onStop", "Companion", "app_amazonDebug"})
public final class QuickCheckInActivity extends com.battlelancer.seriesguide.ui.BaseThemeActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.QuickCheckInActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_LONG_EPISODE_ID = "episode_id";
    
    public QuickCheckInActivity() {
        super();
    }
    
    @java.lang.Override()
    protected int getCustomTheme() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.traktapi.GenericCheckInDialogFragment.CheckInDialogDismissedEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.traktapi.TraktTask.TraktActionCompleteEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intent(long episodeId, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/QuickCheckInActivity$Companion;", "", "()V", "EXTRA_LONG_EPISODE_ID", "", "intent", "Landroid/content/Intent;", "episodeId", "", "context", "Landroid/content/Context;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intent(long episodeId, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}