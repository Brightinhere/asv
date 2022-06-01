package com.battlelancer.seriesguide.sync;

import java.lang.System;

/**
 * A [Service] that returns an IBinder [SgSyncAdapter], allowing the sync adapter
 * framework to call onPerformSync().
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/sync/SgSyncService;", "Landroid/app/Service;", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "Companion", "app_pureDebug"})
public final class SgSyncService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.sync.SgSyncService.Companion Companion = null;
    private static final java.lang.Object syncAdapterLock = null;
    private static com.battlelancer.seriesguide.sync.SgSyncAdapter syncAdapter;
    
    public SgSyncService() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/sync/SgSyncService$Companion;", "", "()V", "syncAdapter", "Lcom/battlelancer/seriesguide/sync/SgSyncAdapter;", "syncAdapterLock", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}