package com.battlelancer.seriesguide.lists;

import java.lang.System;

/**
 * Dialog to rename or remove a list.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ListManageDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogListManageBinding;", "listId", "", "configureViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDestroyView", "Companion", "app_pureDebug"})
public final class ListManageDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogListManageBinding binding;
    private java.lang.String listId;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.lists.ListManageDialogFragment.Companion Companion = null;
    private static final java.lang.String TAG = "listmanagedialog";
    private static final java.lang.String ARG_LIST_ID = "listId";
    
    public ListManageDialogFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void configureViews() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ListManageDialogFragment$Companion;", "", "()V", "ARG_LIST_ID", "", "TAG", "newInstance", "Lcom/battlelancer/seriesguide/lists/ListManageDialogFragment;", "listId", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.battlelancer.seriesguide.lists.ListManageDialogFragment newInstance(java.lang.String listId) {
            return null;
        }
        
        /**
         * Display a dialog which allows to edit the title of this list or remove it.
         */
        public final void show(@org.jetbrains.annotations.NotNull()
        java.lang.String listId, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm) {
        }
    }
}