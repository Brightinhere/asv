package com.battlelancer.seriesguide.notifications;

import java.lang.System;

/**
 * A serial executor that uses the [AsyncTask.THREAD_POOL_EXECUTOR] to execute tasks on.
 *
 * Adapted from [AsyncTask.SERIAL_EXECUTOR], Copyright (C) 2008 The Android Open Source
 * Project, Licensed under the Apache License, Version 2.0.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/notifications/SerialExecutor;", "Ljava/util/concurrent/Executor;", "()V", "active", "Ljava/lang/Runnable;", "tasks", "Ljava/util/ArrayDeque;", "execute", "", "r", "scheduleNext", "app_amazonDebug"})
public final class SerialExecutor implements java.util.concurrent.Executor {
    private final java.util.ArrayDeque<java.lang.Runnable> tasks = null;
    private java.lang.Runnable active;
    
    public SerialExecutor() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void execute(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable r) {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void scheduleNext() {
    }
}