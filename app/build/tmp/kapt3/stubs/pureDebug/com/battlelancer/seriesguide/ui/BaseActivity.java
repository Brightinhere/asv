package com.battlelancer.seriesguide.ui;

import java.lang.System;

/**
 * Provides some common functionality for triggering sync and auto backup and handling some events.
 *
 * Registers with [EventBus.getDefault] by default to handle various common events,
 * see [registerEventBus] and [unregisterEventBus] to prevent that.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014J\b\u0010\u0013\u001a\u00020\nH\u0014J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/ui/BaseActivity;", "Lcom/battlelancer/seriesguide/ui/BaseThemeActivity;", "()V", "handler", "Landroid/os/Handler;", "updateShowRunnable", "Ljava/lang/Runnable;", "onAutoBackup", "", "onAutoBackupMissingFiles", "", "onEvent", "event", "Lcom/battlelancer/seriesguide/shows/tools/AddShowTask$OnShowAddedEvent;", "Lcom/battlelancer/seriesguide/traktapi/TraktTask$TraktActionCompleteEvent;", "onEventMainThread", "Lcom/battlelancer/seriesguide/util/DBUtils$DatabaseErrorEvent;", "onLastAutoBackupFailed", "onStart", "onStop", "registerEventBus", "unregisterEventBus", "updateShowDelayed", "showId", "", "app_pureDebug"})
public abstract class BaseActivity extends com.battlelancer.seriesguide.ui.BaseThemeActivity {
    private android.os.Handler handler;
    private java.lang.Runnable updateShowRunnable;
    
    public BaseActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    /**
     * Override this to avoid registering with [EventBus.getDefault] in [onStart].
     *
     * See [unregisterEventBus] as well.
     */
    public void registerEventBus() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    /**
     * Override this to avoid unregistering from [EventBus.getDefault] in [onStop].
     *
     * See [registerEventBus] as well.
     */
    public void unregisterEventBus() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.tools.AddShowTask.OnShowAddedEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.traktapi.TraktTask.TraktActionCompleteEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.util.DBUtils.DatabaseErrorEvent event) {
    }
    
    /**
     * Periodically do an automatic backup of the show database.
     */
    private final boolean onAutoBackup() {
        return false;
    }
    
    /**
     * Implementers may choose to show a warning that the last auto backup has failed.
     */
    protected void onLastAutoBackupFailed() {
    }
    
    /**
     * Implementers may choose to show a warning that auto backup can not complete because not all
     * custom backup files are configured.
     */
    protected void onAutoBackupMissingFiles() {
    }
    
    /**
     * Schedule an update for the given show. Might not run if this show was just updated. Execution
     * is also delayed so it won't reduce UI setup performance (may call this in [onCreate]).
     *
     * See [SgSyncAdapter.requestSyncIfTime].
     */
    protected final void updateShowDelayed(long showId) {
    }
}