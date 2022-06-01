package com.battlelancer.seriesguide.lists;

import java.lang.System;

/**
 * Displays a dialog displaying all user created lists,
 * allowing to add or remove the given show for any.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ManageListsDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "adapter", "Lcom/battlelancer/seriesguide/lists/ManageListsDialogFragment$ListsAdapter;", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogManageListsBinding;", "loaderCallbacks", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "Landroid/database/Cursor;", "onItemClickListener", "Landroid/widget/AdapterView$OnItemClickListener;", "showId", "", "showTmdbId", "", "loadShowAndListDetails", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "ListsAdapter", "ListsQuery", "app_amazonDebug"})
public final class ManageListsDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogManageListsBinding binding;
    private com.battlelancer.seriesguide.lists.ManageListsDialogFragment.ListsAdapter adapter;
    private long showId = 0L;
    
    /**
     * Remains 0 if TMDB id for show not found (show is not migrated to TMDB data).
     */
    private int showTmdbId = 0;
    private final android.widget.AdapterView.OnItemClickListener onItemClickListener = null;
    private final androidx.loader.app.LoaderManager.LoaderCallbacks<android.database.Cursor> loaderCallbacks = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.lists.ManageListsDialogFragment.Companion Companion = null;
    private static final java.lang.String TAG = "listsdialog";
    private static final java.lang.String ARG_LONG_SHOW_ID = "show_id";
    
    public ManageListsDialogFragment() {
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
    
    private final java.lang.Object loadShowAndListDetails(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Display a dialog which asks if the user wants to add the given show to one or more lists.
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, long showId) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ManageListsDialogFragment$ListsAdapter;", "Landroidx/cursoradapter/widget/CursorAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkedPositions", "Landroid/util/SparseBooleanArray;", "getCheckedPositions", "()Landroid/util/SparseBooleanArray;", "layoutInflater", "Landroid/view/LayoutInflater;", "bindView", "", "view", "Landroid/view/View;", "cursor", "Landroid/database/Cursor;", "newView", "parent", "Landroid/view/ViewGroup;", "setItemChecked", "position", "", "value", "", "app_amazonDebug"})
    static final class ListsAdapter extends androidx.cursoradapter.widget.CursorAdapter {
        private final android.view.LayoutInflater layoutInflater = null;
        @org.jetbrains.annotations.NotNull()
        private final android.util.SparseBooleanArray checkedPositions = null;
        
        public ListsAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.util.SparseBooleanArray getCheckedPositions() {
            return null;
        }
        
        @java.lang.Override()
        public void bindView(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.database.Cursor cursor) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View newView(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.database.Cursor cursor, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        public final void setItemChecked(int position, boolean value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ManageListsDialogFragment$ListsQuery;", "", "Companion", "app_amazonDebug"})
    public static abstract interface ListsQuery {
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.lists.ManageListsDialogFragment.ListsQuery.Companion Companion = null;
        public static final int LIST_ID = 1;
        public static final int NAME = 2;
        public static final int LIST_ITEM_ID = 3;
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ManageListsDialogFragment$ListsQuery$Companion;", "", "()V", "LIST_ID", "", "LIST_ITEM_ID", "NAME", "PROJECTION", "", "", "getPROJECTION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "app_amazonDebug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            private static final java.lang.String[] PROJECTION = {"lists._id", "lists.list_id", "list_name", "list_item_id"};
            public static final int LIST_ID = 1;
            public static final int NAME = 2;
            public static final int LIST_ITEM_ID = 3;
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String[] getPROJECTION() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ManageListsDialogFragment$Companion;", "", "()V", "ARG_LONG_SHOW_ID", "", "TAG", "newInstance", "Lcom/battlelancer/seriesguide/lists/ManageListsDialogFragment;", "showId", "", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.battlelancer.seriesguide.lists.ManageListsDialogFragment newInstance(long showId) {
            return null;
        }
        
        /**
         * Display a dialog which asks if the user wants to add the given show to one or more lists.
         */
        @kotlin.jvm.JvmStatic()
        public final boolean show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm, long showId) {
            return false;
        }
    }
}