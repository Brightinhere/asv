package com.battlelancer.seriesguide.streaming;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001.B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\u0013J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\r\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0007J\u000e\u0010*\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0016\u0010,\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006/"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/StreamingSearch;", "", "()V", "KEY_SETTING_REGION", "", "regionLiveData", "Landroidx/lifecycle/MutableLiveData;", "getRegionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "supportedRegions", "", "getSupportedRegions", "()Ljava/util/List;", "configureButton", "button", "Landroid/widget/Button;", "watchInfo", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbTools2$WatchInfo;", "addToButtonText", "", "getCurrentRegionOrNull", "context", "Landroid/content/Context;", "getCurrentRegionOrSelectString", "getServiceDisplayName", "service", "getWatchInfoMediator", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/battlelancer/seriesguide/streaming/StreamingSearch$WatchInfo;", "tmdbId", "Landroidx/lifecycle/LiveData;", "", "getWatchProviderLiveData", "viewModelContext", "Lkotlin/coroutines/CoroutineContext;", "isMovie", "initButtons", "", "linkButton", "Landroid/view/View;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "initRegionLiveData", "isNotConfigured", "setRegion", "region", "WatchInfo", "app_amazonDebug"})
public final class StreamingSearch {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.streaming.StreamingSearch INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> regionLiveData = null;
    
    /**
     * if null = not configured, also used in settings_basic.xml
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SETTING_REGION = "com.uwetrottmann.seriesguide.watch.region";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> supportedRegions = null;
    
    private StreamingSearch() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRegionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSupportedRegions() {
        return null;
    }
    
    public final void initRegionLiveData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.battlelancer.seriesguide.streaming.StreamingSearch.WatchInfo> getWatchInfoMediator(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Integer> tmdbId) {
        return null;
    }
    
    /**
     * Defaults to show providers, set [isMovie] to get for a movie.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo> getWatchProviderLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.battlelancer.seriesguide.streaming.StreamingSearch.WatchInfo> watchInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext viewModelContext, @org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isMovie) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void initButtons(@org.jetbrains.annotations.NotNull()
    android.view.View linkButton, @org.jetbrains.annotations.NotNull()
    android.view.View configureButton, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String configureButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button button, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.tmdbapi.TmdbTools2.WatchInfo watchInfo, boolean addToButtonText) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isNotConfigured(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getCurrentRegionOrNull(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getServiceDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String service) {
        return null;
    }
    
    public final void setRegion(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String region) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentRegionOrSelectString(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/StreamingSearch$WatchInfo;", "", "tmdbId", "", "region", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getRegion", "()Ljava/lang/String;", "getTmdbId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/battlelancer/seriesguide/streaming/StreamingSearch$WatchInfo;", "equals", "", "other", "hashCode", "toString", "app_amazonDebug"})
    public static final class WatchInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer tmdbId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String region = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.streaming.StreamingSearch.WatchInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
        java.lang.String region) {
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
        
        public WatchInfo(@org.jetbrains.annotations.Nullable()
        java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
        java.lang.String region) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTmdbId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRegion() {
            return null;
        }
    }
}