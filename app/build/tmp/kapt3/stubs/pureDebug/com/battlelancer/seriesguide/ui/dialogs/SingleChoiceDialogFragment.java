package com.battlelancer.seriesguide.ui.dialogs;

import java.lang.System;

/**
 * A dialog displaying a list of options to choose from, saving the selected option to the given
 * preference upon selection by the user.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/ui/dialogs/SingleChoiceDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_pureDebug"})
public final class SingleChoiceDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.ui.dialogs.SingleChoiceDialogFragment.Companion Companion = null;
    private static final java.lang.String ARG_ITEM_ARRAY = "ITEM_ARRAY";
    private static final java.lang.String ARG_ITEM_DATA = "ITEM_DATA";
    private static final java.lang.String ARG_SELECTED = "SELECTED";
    private static final java.lang.String ARG_PREF_KEY = "PREF_KEY";
    private static final java.lang.String ARG_DIALOG_TITLE = "DIALOG_TITLE";
    
    public SingleChoiceDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/ui/dialogs/SingleChoiceDialogFragment$Companion;", "", "()V", "ARG_DIALOG_TITLE", "", "ARG_ITEM_ARRAY", "ARG_ITEM_DATA", "ARG_PREF_KEY", "ARG_SELECTED", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "itemArrayResource", "", "itemDataArrayResource", "selectedItemIndex", "preferenceKey", "dialogTitleResource", "tag", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, int itemArrayResource, int itemDataArrayResource, int selectedItemIndex, @org.jetbrains.annotations.NotNull()
        java.lang.String preferenceKey, int dialogTitleResource, @org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
        }
    }
}