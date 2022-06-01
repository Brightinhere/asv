package com.battlelancer.seriesguide.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MoviesActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "scrollTabToTopLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/battlelancer/seriesguide/movies/MoviesActivityViewModel$ScrollTabToTopEvent;", "getScrollTabToTopLiveData", "()Landroidx/lifecycle/MutableLiveData;", "scrollTabToTop", "", "tabPosition", "", "isShowingNowTab", "", "ScrollTabToTopEvent", "app_pureDebug"})
public final class MoviesActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.movies.MoviesActivityViewModel.ScrollTabToTopEvent> scrollTabToTopLiveData = null;
    
    public MoviesActivityViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.movies.MoviesActivityViewModel.ScrollTabToTopEvent> getScrollTabToTopLiveData() {
        return null;
    }
    
    public final void scrollTabToTop(int tabPosition, boolean isShowingNowTab) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MoviesActivityViewModel$ScrollTabToTopEvent;", "", "tabPosition", "", "isShowingNowTab", "", "(IZ)V", "()Z", "getTabPosition", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_pureDebug"})
    public static final class ScrollTabToTopEvent {
        private final int tabPosition = 0;
        private final boolean isShowingNowTab = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.movies.MoviesActivityViewModel.ScrollTabToTopEvent copy(int tabPosition, boolean isShowingNowTab) {
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
        
        public ScrollTabToTopEvent(int tabPosition, boolean isShowingNowTab) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTabPosition() {
            return 0;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isShowingNowTab() {
            return false;
        }
    }
}