package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "showTmdbId", "", "initialLanguageCode", "", "(Landroid/app/Application;ILjava/lang/String;)V", "languageCode", "Landroidx/lifecycle/MutableLiveData;", "getLanguageCode", "()Landroidx/lifecycle/MutableLiveData;", "showDetails", "Landroidx/lifecycle/LiveData;", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogViewModel$ShowDetails;", "getShowDetails", "()Landroidx/lifecycle/LiveData;", "watchInfoMediator", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/battlelancer/seriesguide/streaming/StreamingSearch$WatchInfo;", "watchProvider", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2$WatchInfo;", "getWatchProvider", "watchProvider$delegate", "Lkotlin/Lazy;", "ShowDetails", "app_pureDebug"})
public final class AddShowDialogViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> languageCode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.search.discover.AddShowDialogViewModel.ShowDetails> showDetails = null;
    private final androidx.lifecycle.MediatorLiveData<com.battlelancer.seriesguide.streaming.StreamingSearch.WatchInfo> watchInfoMediator = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy watchProvider$delegate = null;
    
    public AddShowDialogViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int showTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String initialLanguageCode) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLanguageCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.shows.search.discover.AddShowDialogViewModel.ShowDetails> getShowDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo> getWatchProvider() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogViewModel$ShowDetails;", "", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "localShowId", "", "doesNotExist", "", "(Lcom/battlelancer/seriesguide/shows/database/SgShow2;Ljava/lang/Long;Z)V", "getDoesNotExist", "()Z", "getLocalShowId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShow", "()Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "component1", "component2", "component3", "copy", "(Lcom/battlelancer/seriesguide/shows/database/SgShow2;Ljava/lang/Long;Z)Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogViewModel$ShowDetails;", "equals", "other", "hashCode", "", "toString", "", "app_pureDebug"})
    public static final class ShowDetails {
        @org.jetbrains.annotations.Nullable()
        private final com.battlelancer.seriesguide.shows.database.SgShow2 show = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long localShowId = null;
        private final boolean doesNotExist = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.search.discover.AddShowDialogViewModel.ShowDetails copy(@org.jetbrains.annotations.Nullable()
        com.battlelancer.seriesguide.shows.database.SgShow2 show, @org.jetbrains.annotations.Nullable()
        java.lang.Long localShowId, boolean doesNotExist) {
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
        
        public ShowDetails(@org.jetbrains.annotations.Nullable()
        com.battlelancer.seriesguide.shows.database.SgShow2 show, @org.jetbrains.annotations.Nullable()
        java.lang.Long localShowId, boolean doesNotExist) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.battlelancer.seriesguide.shows.database.SgShow2 component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.battlelancer.seriesguide.shows.database.SgShow2 getShow() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getLocalShowId() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getDoesNotExist() {
            return false;
        }
    }
}