package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

/**
 * View model that checks for available backup files.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0006\u0010\u0015\u001a\u00020\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "availableBackupLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAvailableBackupLiveData", "()Landroidx/lifecycle/MutableLiveData;", "importTask", "Lkotlinx/coroutines/Job;", "getImportTask", "()Lkotlinx/coroutines/Job;", "setImportTask", "(Lkotlinx/coroutines/Job;)V", "isImportTaskNotCompleted", "", "()Z", "onCleared", "", "updateAvailableBackupData", "app_amazonDebug"})
public final class AutoBackupViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * Try to keep the import task around on config changes
     * so it does not have to be finished.
     */
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job importTask;
    
    /**
     * Time string of the available backup, or null if no backup is available.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> availableBackupLiveData = null;
    
    public AutoBackupViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getImportTask() {
        return null;
    }
    
    public final void setImportTask(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    public final boolean isImportTaskNotCompleted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAvailableBackupLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateAvailableBackupData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}