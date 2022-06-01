package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/FlagJobExecutor;", "", "()V", "semaphore", "Lkotlinx/coroutines/sync/Semaphore;", "getSemaphore", "()Lkotlinx/coroutines/sync/Semaphore;", "execute", "", "context", "Landroid/content/Context;", "job", "Lcom/battlelancer/seriesguide/jobs/FlagJob;", "app_amazonDebug"})
public final class FlagJobExecutor {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.jobs.FlagJobExecutor INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Semaphore semaphore = null;
    
    private FlagJobExecutor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.sync.Semaphore getSemaphore() {
        return null;
    }
    
    /**
     * Executes one job at a time in the order they are submitted
     * (e.g. set watched + set not watched order matters).
     * Runs on IO dispatcher.
     */
    @kotlin.jvm.JvmStatic()
    public static final void execute(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.jobs.FlagJob job) {
    }
}