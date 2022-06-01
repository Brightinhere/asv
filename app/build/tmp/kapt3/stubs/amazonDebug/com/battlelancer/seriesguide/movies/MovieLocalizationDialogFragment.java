package com.battlelancer.seriesguide.movies;

import java.lang.System;

/**
 * A dialog displaying a list of languages and regions to choose from, posting a
 * [LocalizationChangedEvent] once the dialog is dismissed (even if language or region
 * have not changed).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0005#$%&\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "_binding", "Lcom/battlelancer/seriesguide/databinding/DialogLocalizationBinding;", "adapter", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter;", "binding", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/DialogLocalizationBinding;", "currentCodeType", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType;", "onItemClickListener", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$OnItemClickListener;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onEventItemsLoaded", "event", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$ItemsLoadedEvent;", "onSaveInstanceState", "outState", "onStart", "onStop", "restoreViewState", "setListVisible", "listIsVisible", "", "updateButtonText", "CodeType", "Companion", "ItemsLoadedEvent", "LocalizationAdapter", "LocalizationChangedEvent", "app_amazonDebug"})
public final class MovieLocalizationDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogLocalizationBinding _binding;
    private com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter adapter;
    private com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType currentCodeType;
    private final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.OnItemClickListener onItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.Companion Companion = null;
    private static final java.lang.String STATE_LIST_VISIBLE = "listVisible";
    
    public MovieLocalizationDialogFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.databinding.DialogLocalizationBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void restoreViewState(android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventItemsLoaded(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.ItemsLoadedEvent event) {
    }
    
    private final void updateButtonText() {
    }
    
    private final void setListVisible(boolean listIsVisible) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationChangedEvent;", "", "()V", "app_amazonDebug"})
    public static final class LocalizationChangedEvent {
        
        public LocalizationChangedEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType;", "", "()V", "Language", "Region", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType$Language;", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType$Region;", "app_amazonDebug"})
    public static abstract class CodeType {
        
        private CodeType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType$Language;", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType;", "()V", "app_amazonDebug"})
        public static final class Language extends com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType.Language INSTANCE = null;
            
            private Language() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType$Region;", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType;", "()V", "app_amazonDebug"})
        public static final class Region extends com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType.Region INSTANCE = null;
            
            private Region() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$ItemsLoadedEvent;", "", "items", "", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$LocalizationItem;", "type", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType;", "(Ljava/util/List;Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType;)V", "getItems", "()Ljava/util/List;", "getType", "()Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$CodeType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_amazonDebug"})
    public static final class ItemsLoadedEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem> items = null;
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.ItemsLoadedEvent copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem> items, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType type) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ItemsLoadedEvent(@org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem> items, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem> getItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.CodeType getType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0016\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onItemClickListener", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$OnItemClickListener;", "(Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$OnItemClickListener;)V", "items", "Ljava/util/ArrayList;", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$LocalizationItem;", "getOnItemClickListener", "()Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateItems", "", "LocalizationItem", "OnItemClickListener", "ViewHolder", "app_amazonDebug"})
    public static final class LocalizationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.OnItemClickListener onItemClickListener = null;
        private final java.util.ArrayList<com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem> items = null;
        
        public LocalizationAdapter(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.OnItemClickListener onItemClickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.OnItemClickListener getOnItemClickListener() {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
        public final void updateItems(@org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem> items) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$LocalizationItem;", "", "code", "", "displayText", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDisplayText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_amazonDebug"})
        public static final class LocalizationItem {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String code = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String displayText = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.LocalizationItem copy(@org.jetbrains.annotations.Nullable()
            java.lang.String code, @org.jetbrains.annotations.NotNull()
            java.lang.String displayText) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public LocalizationItem(@org.jetbrains.annotations.Nullable()
            java.lang.String code, @org.jetbrains.annotations.NotNull()
            java.lang.String displayText) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCode() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDisplayText() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$OnItemClickListener;", "", "onItemClick", "", "code", "", "app_amazonDebug"})
        public static abstract interface OnItemClickListener {
            
            public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
            java.lang.String code);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/battlelancer/seriesguide/databinding/ItemDropdownBinding;", "onItemClickListener", "Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$OnItemClickListener;", "(Lcom/battlelancer/seriesguide/databinding/ItemDropdownBinding;Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$LocalizationAdapter$OnItemClickListener;)V", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/ItemDropdownBinding;", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "app_amazonDebug"})
        public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final com.battlelancer.seriesguide.databinding.ItemDropdownBinding binding = null;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String code;
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.databinding.ItemDropdownBinding binding, @org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.movies.MovieLocalizationDialogFragment.LocalizationAdapter.OnItemClickListener onItemClickListener) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.databinding.ItemDropdownBinding getBinding() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCode() {
                return null;
            }
            
            public final void setCode(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieLocalizationDialogFragment$Companion;", "", "()V", "STATE_LIST_VISIBLE", "", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
    }
}