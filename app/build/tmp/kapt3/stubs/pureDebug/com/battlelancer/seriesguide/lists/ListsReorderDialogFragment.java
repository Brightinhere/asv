package com.battlelancer.seriesguide.lists;

import java.lang.System;

/**
 * Dialog to reorder lists using a vertical list with drag handles. Currently not accessibility or
 * keyboard friendly (same as extension configuration screen).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ListsReorderDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "adapter", "Lcom/battlelancer/seriesguide/lists/ListsAdapter;", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogListsReorderBinding;", "listsLoaderCallbacks", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "", "Lcom/battlelancer/seriesguide/lists/OrderedListsLoader$OrderedList;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "reorderList", "from", "", "to", "saveListsOrder", "app_pureDebug"})
public final class ListsReorderDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogListsReorderBinding binding;
    private com.battlelancer.seriesguide.lists.ListsAdapter adapter;
    private final androidx.loader.app.LoaderManager.LoaderCallbacks<java.util.List<com.battlelancer.seriesguide.lists.OrderedListsLoader.OrderedList>> listsLoaderCallbacks = null;
    
    public ListsReorderDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void reorderList(int from, int to) {
    }
    
    private final void saveListsOrder() {
    }
}