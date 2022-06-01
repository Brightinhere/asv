package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/shows/SortShowsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/battlelancer/seriesguide/databinding/ViewSortShowsBinding;", "sortOrderListener", "Lcom/battlelancer/seriesguide/shows/SortShowsView$SortOrderListener;", "setInitialSort", "", "showSortOrder", "Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;", "setSortOrderListener", "updateSortOrderListener", "changedIgnoreArticles", "", "ShowSortOrder", "SortOrderListener", "app_amazonDebug"})
public final class SortShowsView extends android.widget.LinearLayout {
    private final com.battlelancer.seriesguide.databinding.ViewSortShowsBinding binding = null;
    private com.battlelancer.seriesguide.shows.SortShowsView.SortOrderListener sortOrderListener;
    
    @kotlin.jvm.JvmOverloads()
    public SortShowsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SortShowsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SortShowsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void updateSortOrderListener(boolean changedIgnoreArticles) {
    }
    
    public final void setInitialSort(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder showSortOrder) {
    }
    
    public final void setSortOrderListener(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.SortShowsView.SortOrderListener sortOrderListener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;", "", "sortOrderId", "", "isSortFavoritesFirst", "", "isSortIgnoreArticles", "changedIgnoreArticles", "(IZZZ)V", "getChangedIgnoreArticles", "()Z", "getSortOrderId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "app_amazonDebug"})
    public static final class ShowSortOrder {
        private final int sortOrderId = 0;
        private final boolean isSortFavoritesFirst = false;
        private final boolean isSortIgnoreArticles = false;
        private final boolean changedIgnoreArticles = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder copy(int sortOrderId, boolean isSortFavoritesFirst, boolean isSortIgnoreArticles, boolean changedIgnoreArticles) {
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
        
        public ShowSortOrder(int sortOrderId, boolean isSortFavoritesFirst, boolean isSortIgnoreArticles, boolean changedIgnoreArticles) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getSortOrderId() {
            return 0;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isSortFavoritesFirst() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isSortIgnoreArticles() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getChangedIgnoreArticles() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static final com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder fromSettings(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder$Companion;", "", "()V", "fromSettings", "Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;", "context", "Landroid/content/Context;", "app_amazonDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder fromSettings(@org.jetbrains.annotations.NotNull()
            android.content.Context context) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/shows/SortShowsView$SortOrderListener;", "", "onSortOrderUpdate", "", "showSortOrder", "Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;", "app_amazonDebug"})
    public static abstract interface SortOrderListener {
        
        public abstract void onSortOrderUpdate(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder showSortOrder);
    }
}