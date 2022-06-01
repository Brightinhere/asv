package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

/**
 * One button export or import of the show database using a JSON file on external storage.
 * Uses Storage Access Framework so no permissions are required.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'H\u0007J\u0018\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010+\u001a\u00020\u0013H\u0016J\b\u0010,\u001a\u00020\u0013H\u0016J\u001a\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u000201H\u0002J\u001a\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u0002042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u00105\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u00106\u001a\u00020\u0013H\u0002J\b\u00107\u001a\u00020\u0013H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/DataLiberationFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$OnTaskProgressListener;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/FragmentDataLiberationBinding;", "createListsExportFileResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "createMovieExportFileResult", "createShowExportFileResult", "model", "Lcom/battlelancer/seriesguide/dataliberation/DataLiberationViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/dataliberation/DataLiberationViewModel;", "model$delegate", "Lkotlin/Lazy;", "selectListsImportFileResult", "", "selectMoviesImportFileResult", "selectShowsImportFileResult", "doDataExport", "type", "", "uri", "Landroid/net/Uri;", "doDataImport", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onEvent", "event", "Lcom/battlelancer/seriesguide/dataliberation/DataLiberationFragment$LiberationResultEvent;", "onProgressUpdate", "total", "completed", "onStart", "onStop", "onViewCreated", "view", "setProgressLock", "isLocked", "", "setUriOrPlaceholder", "textView", "Landroid/widget/TextView;", "storeImportFileUri", "updateFileViews", "updateImportButtonEnabledState", "LiberationResultEvent", "app_pureDebug"})
public final class DataLiberationFragment extends androidx.fragment.app.Fragment implements com.battlelancer.seriesguide.dataliberation.JsonExportTask.OnTaskProgressListener {
    private com.battlelancer.seriesguide.databinding.FragmentDataLiberationBinding binding;
    private final kotlin.Lazy model$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> createShowExportFileResult = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> createListsExportFileResult = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> createMovieExportFileResult = null;
    private final androidx.activity.result.ActivityResultLauncher<kotlin.Unit> selectShowsImportFileResult = null;
    private final androidx.activity.result.ActivityResultLauncher<kotlin.Unit> selectListsImportFileResult = null;
    private final androidx.activity.result.ActivityResultLauncher<kotlin.Unit> selectMoviesImportFileResult = null;
    
    public DataLiberationFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.dataliberation.DataLiberationViewModel getModel() {
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateImportButtonEnabledState() {
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
    
    @java.lang.Override()
    public void onProgressUpdate(int total, int completed) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.dataliberation.DataLiberationFragment.LiberationResultEvent event) {
    }
    
    private final void setProgressLock(boolean isLocked) {
    }
    
    private final void doDataImport() {
    }
    
    private final void doDataExport(int type, android.net.Uri uri) {
    }
    
    private final void storeImportFileUri(int type, android.net.Uri uri) {
    }
    
    private final void updateFileViews() {
    }
    
    private final void setUriOrPlaceholder(android.widget.TextView textView, android.net.Uri uri) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/DataLiberationFragment$LiberationResultEvent;", "", "()V", "message", "", "errorCause", "showIndefinite", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "handle", "", "view", "Landroid/view/View;", "app_pureDebug"})
    public static final class LiberationResultEvent {
        private final java.lang.String message = null;
        private final boolean showIndefinite = false;
        
        public LiberationResultEvent() {
            super();
        }
        
        public LiberationResultEvent(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCause, boolean showIndefinite) {
            super();
        }
        
        public final void handle(@org.jetbrains.annotations.Nullable()
        android.view.View view) {
        }
    }
}