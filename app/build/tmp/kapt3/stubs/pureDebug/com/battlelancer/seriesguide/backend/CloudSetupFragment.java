package com.battlelancer.seriesguide.backend;

import java.lang.System;

/**
 * Manages signing in and out with Cloud and account removal.
 * Tries to silent sign-in when started. Enables Cloud on sign-in.
 * If Cloud is still enabled, but the account requires validation
 * enables to retry sign-in or to sign out (actually just disable Cloud).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\'H\u0007J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020(H\u0007J\b\u0010)\u001a\u00020\u0010H\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J\u001a\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J \u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0002J\u0010\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u000200H\u0002J\u0010\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0010H\u0002J\b\u00109\u001a\u00020\u0010H\u0002J\b\u0010:\u001a\u00020\u0010H\u0002J\b\u0010;\u001a\u00020\u0010H\u0002J\b\u0010<\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/battlelancer/seriesguide/backend/CloudSetupFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/FragmentCloudSetupBinding;", "hexagonTools", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "signInAccount", "Lcom/google/firebase/auth/FirebaseUser;", "signInWithFirebase", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "changeAccount", "", "account", "errorIfNull", "", "dismissSnackbar", "handleSilentSignInResult", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onEvent", "event", "Lcom/battlelancer/seriesguide/sync/SyncProgress$SyncEvent;", "onEventMainThread", "Lcom/battlelancer/seriesguide/backend/RemoveCloudAccountDialogFragment$AccountRemovedEvent;", "Lcom/battlelancer/seriesguide/backend/RemoveCloudAccountDialogFragment$CanceledEvent;", "onPause", "onResume", "onStart", "onViewCreated", "view", "setButtonsVisible", "signInVisible", "", "signOutVisible", "removeVisible", "setProgressVisible", "isVisible", "showSnackbar", "message", "", "signIn", "signOut", "startHexagonSetup", "trySilentSignIn", "updateViews", "Companion", "app_pureDebug"})
public final class CloudSetupFragment extends androidx.fragment.app.Fragment {
    private com.battlelancer.seriesguide.databinding.FragmentCloudSetupBinding binding;
    private com.google.android.material.snackbar.Snackbar snackbar;
    private com.google.firebase.auth.FirebaseUser signInAccount;
    private com.battlelancer.seriesguide.backend.HexagonTools hexagonTools;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> signInWithFirebase = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.backend.CloudSetupFragment.Companion Companion = null;
    private static final java.lang.String ACTION_SIGN_IN = "sign-in";
    
    public CloudSetupFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.backend.RemoveCloudAccountDialogFragment.CanceledEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.backend.RemoveCloudAccountDialogFragment.AccountRemovedEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN, sticky = true)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.SyncProgress.SyncEvent event) {
    }
    
    private final void trySilentSignIn() {
    }
    
    /**
     * @param task A completed sign-in task.
     */
    private final void handleSilentSignInResult(com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    }
    
    /**
     * If the Firebase account is not null, saves it and auto-starts setup if Cloud is not
     * enabled or the account needs validation.
     * On sign-in failure with error message (so was not canceled) sets should validate account flag.
     */
    private final void changeAccount(com.google.firebase.auth.FirebaseUser account, java.lang.String errorIfNull) {
    }
    
    private final void signIn() {
    }
    
    private final void signOut() {
    }
    
    private final void updateViews() {
    }
    
    private final void setButtonsVisible(boolean signInVisible, boolean signOutVisible, boolean removeVisible) {
    }
    
    /**
     * Disables buttons and shows a progress bar.
     */
    private final void setProgressVisible(boolean isVisible) {
    }
    
    private final void showSnackbar(java.lang.CharSequence message) {
    }
    
    private final void dismissSnackbar() {
    }
    
    private final void startHexagonSetup() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/backend/CloudSetupFragment$Companion;", "", "()V", "ACTION_SIGN_IN", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}