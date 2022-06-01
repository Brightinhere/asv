package com.battlelancer.seriesguide.preferences;

import java.lang.System;

/**
 * Displays accounts, links to unlock all features, settings and help
 * and if the app does no longer receive updates.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/MoreOptionsActivity;", "Lcom/battlelancer/seriesguide/ui/BaseTopActivity;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/ActivityMoreOptionsBinding;", "configureViews", "", "getSnackbarParentView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEvent", "event", "Lcom/battlelancer/seriesguide/sync/SyncProgress$SyncEvent;", "onStart", "Companion", "app_amazonDebug"})
public final class MoreOptionsActivity extends com.battlelancer.seriesguide.ui.BaseTopActivity {
    private com.battlelancer.seriesguide.databinding.ActivityMoreOptionsBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.preferences.MoreOptionsActivity.Companion Companion = null;
    private static final java.lang.String SUPPORT_MAIL = "support@seriesgui.de";
    
    public MoreOptionsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
    private final void configureViews() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View getSnackbarParentView() {
        return null;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN, sticky = true)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.SyncProgress.SyncEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent getFeedbackEmailIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/MoreOptionsActivity$Companion;", "", "()V", "SUPPORT_MAIL", "", "getFeedbackEmailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent getFeedbackEmailIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}