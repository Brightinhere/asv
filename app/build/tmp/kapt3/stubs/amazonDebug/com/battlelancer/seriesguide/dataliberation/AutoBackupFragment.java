package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

/**
 * Configuration of auto backup, creation of optional copies
 * and ability to import the last auto backup.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u001a\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\b\u0010$\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\fH\u0002J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\fH\u0002J\u001a\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u001a\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u0002002\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00063"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/FragmentAutoBackupBinding;", "createListsExportFileResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "createMovieExportFileResult", "createShowExportFileResult", "isBackupAvailableForImport", "", "viewModel", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupViewModel;", "getViewModel", "()Lcom/battlelancer/seriesguide/dataliberation/AutoBackupViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onEvent", "event", "Lcom/battlelancer/seriesguide/dataliberation/DataLiberationFragment$LiberationResultEvent;", "onStart", "onStop", "onViewCreated", "view", "runAutoBackupImport", "setContainerSettingsVisible", "visible", "setProgressLock", "isLocked", "setUriOrPlaceholder", "textView", "Landroid/widget/TextView;", "uri", "Landroid/net/Uri;", "storeBackupFile", "type", "", "updateFileViews", "updateImportButtonState", "app_amazonDebug"})
public final class AutoBackupFragment extends androidx.fragment.app.Fragment {
    private com.battlelancer.seriesguide.databinding.FragmentAutoBackupBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isBackupAvailableForImport = false;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> createShowExportFileResult = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> createListsExportFileResult = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> createMovieExportFileResult = null;
    
    public AutoBackupFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.dataliberation.AutoBackupViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.dataliberation.DataLiberationFragment.LiberationResultEvent event) {
    }
    
    private final void runAutoBackupImport() {
    }
    
    private final void storeBackupFile(int type, android.net.Uri uri) {
    }
    
    private final void setContainerSettingsVisible(boolean visible) {
    }
    
    private final void updateImportButtonState() {
    }
    
    private final void setProgressLock(boolean isLocked) {
    }
    
    private final void updateFileViews() {
    }
    
    private final void setUriOrPlaceholder(android.widget.TextView textView, android.net.Uri uri) {
    }
}