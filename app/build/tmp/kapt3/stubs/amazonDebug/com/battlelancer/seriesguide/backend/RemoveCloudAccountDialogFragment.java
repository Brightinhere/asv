package com.battlelancer.seriesguide.backend;

import java.lang.System;

/**
 * Confirms whether to obliterate a SeriesGuide cloud account. If removal is tried, posts result as
 * [AccountRemovedEvent]. If dialog is canceled, posts a [CanceledEvent].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/backend/RemoveCloudAccountDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "sendCanceledEvent", "AccountRemovedEvent", "CanceledEvent", "RemoveHexagonAccountTask", "app_amazonDebug"})
public final class RemoveCloudAccountDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    
    public RemoveCloudAccountDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final void sendCanceledEvent() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0011\u0010\f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/backend/RemoveCloudAccountDialogFragment$RemoveHexagonAccountTask;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hexagonTools", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "doInBackground", "", "onPostExecute", "", "result", "run", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_amazonDebug"})
    public static final class RemoveHexagonAccountTask {
        private final android.content.Context context = null;
        private final com.battlelancer.seriesguide.backend.HexagonTools hexagonTools = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.backend.RemoveCloudAccountDialogFragment.RemoveHexagonAccountTask.Companion Companion = null;
        private static final java.lang.String ACTION_REMOVE_ACCOUNT = "remove account";
        private static final kotlinx.coroutines.sync.Semaphore removeJobSemaphore = null;
        
        public RemoveHexagonAccountTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object run(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        private final boolean doInBackground() {
            return false;
        }
        
        private final void onPostExecute(boolean result) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/backend/RemoveCloudAccountDialogFragment$RemoveHexagonAccountTask$Companion;", "", "()V", "ACTION_REMOVE_ACCOUNT", "", "removeJobSemaphore", "Lkotlinx/coroutines/sync/Semaphore;", "app_amazonDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/backend/RemoveCloudAccountDialogFragment$CanceledEvent;", "", "()V", "app_amazonDebug"})
    public static final class CanceledEvent {
        
        public CanceledEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/backend/RemoveCloudAccountDialogFragment$AccountRemovedEvent;", "", "successful", "", "(Z)V", "getSuccessful", "()Z", "handle", "", "context", "Landroid/content/Context;", "app_amazonDebug"})
    public static final class AccountRemovedEvent {
        private final boolean successful = false;
        
        public AccountRemovedEvent(boolean successful) {
            super();
        }
        
        public final boolean getSuccessful() {
            return false;
        }
        
        /**
         * Display status toasts depending on the result.
         */
        public final void handle(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}