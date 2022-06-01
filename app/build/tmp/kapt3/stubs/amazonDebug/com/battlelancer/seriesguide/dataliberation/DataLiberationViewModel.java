package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

/**
 * Try to keep the backup tasks on config changes so they do not have to be finished.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/DataLiberationViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dataLibJob", "Lkotlinx/coroutines/Job;", "getDataLibJob", "()Lkotlinx/coroutines/Job;", "setDataLibJob", "(Lkotlinx/coroutines/Job;)V", "isDataLibTaskNotCompleted", "", "()Z", "onCleared", "", "app_amazonDebug"})
public final class DataLiberationViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job dataLibJob;
    
    public DataLiberationViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getDataLibJob() {
        return null;
    }
    
    public final void setDataLibJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    public final boolean isDataLibTaskNotCompleted() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}