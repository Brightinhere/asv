package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FilterShowsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/battlelancer/seriesguide/databinding/ViewFilterShowsBinding;", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/ViewFilterShowsBinding;", "filterListener", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$FilterListener;", "setFilterListener", "", "setInitialFilter", "showFilter", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "noReleased", "", "updateFilterListener", "FilterListener", "ShowFilter", "app_pureDebug"})
public final class FilterShowsView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.databinding.ViewFilterShowsBinding binding = null;
    private com.battlelancer.seriesguide.shows.FilterShowsView.FilterListener filterListener;
    
    @kotlin.jvm.JvmOverloads()
    public FilterShowsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public FilterShowsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public FilterShowsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.databinding.ViewFilterShowsBinding getBinding() {
        return null;
    }
    
    private final void updateFilterListener() {
    }
    
    public final void setInitialFilter(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter showFilter, boolean noReleased) {
    }
    
    public final void setFilterListener(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.FilterShowsView.FilterListener filterListener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJJ\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "", "isFilterFavorites", "", "isFilterUnwatched", "isFilterUpcoming", "isFilterHidden", "isFilterContinuing", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "equals", "other", "hashCode", "", "isAnyFilterEnabled", "toString", "", "Companion", "app_pureDebug"})
    public static final class ShowFilter {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isFilterFavorites = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isFilterUnwatched = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isFilterUpcoming = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isFilterHidden = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isFilterContinuing = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterFavorites, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterUnwatched, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterUpcoming, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterHidden, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterContinuing) {
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
        
        public ShowFilter(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterFavorites, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterUnwatched, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterUpcoming, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterHidden, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isFilterContinuing) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isFilterFavorites() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isFilterUnwatched() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isFilterUpcoming() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isFilterHidden() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isFilterContinuing() {
            return null;
        }
        
        public final boolean isAnyFilterEnabled() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static final com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter allDisabled() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static final com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter fromSettings(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter$Companion;", "", "()V", "allDisabled", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "fromSettings", "context", "Landroid/content/Context;", "app_pureDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter allDisabled() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter fromSettings(@org.jetbrains.annotations.NotNull()
            android.content.Context context) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FilterShowsView$FilterListener;", "", "onConfigureUpcomingRangeClick", "", "onFilterUpdate", "filter", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "onMakeAllHiddenVisibleClick", "onNoReleasedChanged", "value", "", "app_pureDebug"})
    public static abstract interface FilterListener {
        
        public abstract void onFilterUpdate(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter filter);
        
        public abstract void onConfigureUpcomingRangeClick();
        
        public abstract void onMakeAllHiddenVisibleClick();
        
        public abstract void onNoReleasedChanged(boolean value);
    }
}