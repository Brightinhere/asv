package com.battlelancer.seriesguide.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/sync/DownloadFlagsResult;", "", "success", "", "noData", "lastWatchedMs", "", "(ZZLjava/lang/Long;)V", "getLastWatchedMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNoData", "()Z", "getSuccess", "component1", "component2", "component3", "copy", "(ZZLjava/lang/Long;)Lcom/battlelancer/seriesguide/sync/DownloadFlagsResult;", "equals", "other", "hashCode", "", "toString", "", "Companion", "app_pureDebug"})
public final class DownloadFlagsResult {
    private final boolean success = false;
    private final boolean noData = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long lastWatchedMs = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.sync.DownloadFlagsResult.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final com.battlelancer.seriesguide.sync.DownloadFlagsResult FAILED = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final com.battlelancer.seriesguide.sync.DownloadFlagsResult NO_DATA = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.sync.DownloadFlagsResult copy(boolean success, boolean noData, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastWatchedMs) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DownloadFlagsResult(boolean success, boolean noData, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastWatchedMs) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getNoData() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastWatchedMs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/sync/DownloadFlagsResult$Companion;", "", "()V", "FAILED", "Lcom/battlelancer/seriesguide/sync/DownloadFlagsResult;", "NO_DATA", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}