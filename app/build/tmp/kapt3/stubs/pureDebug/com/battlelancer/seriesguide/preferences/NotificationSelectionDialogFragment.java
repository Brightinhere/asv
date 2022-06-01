package com.battlelancer.seriesguide.preferences;

import java.lang.System;

/**
 * A dialog displaying a list of shows with switches to turn notifications on or off.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "adapter", "Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter;", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogNotificationSelectionBinding;", "model", "Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$NotificationSelectionModel;", "getModel", "()Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$NotificationSelectionModel;", "model$delegate", "Lkotlin/Lazy;", "onItemClickListener", "Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$OnItemClickListener;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "NotificationSelectionModel", "SelectionAdapter", "app_pureDebug"})
public final class NotificationSelectionDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogNotificationSelectionBinding binding;
    private com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter adapter;
    private final kotlin.Lazy model$delegate = null;
    private final com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter.OnItemClickListener onItemClickListener = null;
    
    public NotificationSelectionDialogFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.NotificationSelectionModel getModel() {
        return null;
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
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$NotificationSelectionModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "shows", "Landroidx/lifecycle/LiveData;", "", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Notify;", "getShows", "()Landroidx/lifecycle/LiveData;", "shows$delegate", "Lkotlin/Lazy;", "app_pureDebug"})
    public static final class NotificationSelectionModel extends androidx.lifecycle.AndroidViewModel {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy shows$delegate = null;
        
        public NotificationSelectionModel(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2Notify>> getShows() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Notify;", "Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$ViewHolder;", "onItemClickListener", "Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$OnItemClickListener;", "(Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "SelectionDiffCallback", "ViewHolder", "app_pureDebug"})
    public static final class SelectionAdapter extends androidx.recyclerview.widget.ListAdapter<com.battlelancer.seriesguide.shows.database.SgShow2Notify, com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter.ViewHolder> {
        private final com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter.OnItemClickListener onItemClickListener = null;
        
        public SelectionAdapter(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter.ViewHolder holder, int position) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$OnItemClickListener;", "", "onItemClick", "", "showId", "", "notify", "", "app_pureDebug"})
        public static abstract interface OnItemClickListener {
            
            public abstract void onItemClick(long showId, boolean notify);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$OnItemClickListener;", "(Landroid/view/View;Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$OnItemClickListener;)V", "showId", "", "getShowId", "()J", "setShowId", "(J)V", "switchCompat", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitchCompat", "()Landroidx/appcompat/widget/SwitchCompat;", "app_pureDebug"})
        public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final androidx.appcompat.widget.SwitchCompat switchCompat = null;
            private long showId = 0L;
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView, @org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.preferences.NotificationSelectionDialogFragment.SelectionAdapter.OnItemClickListener onItemClickListener) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final androidx.appcompat.widget.SwitchCompat getSwitchCompat() {
                return null;
            }
            
            public final long getShowId() {
                return 0L;
            }
            
            public final void setShowId(long p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/NotificationSelectionDialogFragment$SelectionAdapter$SelectionDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Notify;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_pureDebug"})
        public static final class SelectionDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.battlelancer.seriesguide.shows.database.SgShow2Notify> {
            
            public SelectionDiffCallback() {
                super();
            }
            
            @java.lang.Override()
            public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.database.SgShow2Notify oldItem, @org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.database.SgShow2Notify newItem) {
                return false;
            }
            
            @java.lang.Override()
            public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.database.SgShow2Notify oldItem, @org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.database.SgShow2Notify newItem) {
                return false;
            }
        }
    }
}