package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsSettings;", "", "()V", "KEY_SEASON_SORT_ORDER", "", "getSeasonSortOrder", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsSettings$SeasonSorting;", "context", "Landroid/content/Context;", "SeasonSorting", "app_amazonDebug"})
public final class SeasonsSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.overview.SeasonsSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SEASON_SORT_ORDER = "seasonSorting";
    
    private SeasonsSettings() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.overview.SeasonsSettings.SeasonSorting getSeasonSortOrder(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsSettings$SeasonSorting;", "", "index", "", "value", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getIndex", "()I", "toString", "LATEST_FIRST", "OLDEST_FIRST", "Companion", "app_amazonDebug"})
    public static enum SeasonSorting {
        /*public static final*/ LATEST_FIRST /* = new LATEST_FIRST(0, null) */,
        /*public static final*/ OLDEST_FIRST /* = new OLDEST_FIRST(0, null) */;
        private final int index = 0;
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.shows.overview.SeasonsSettings.SeasonSorting.Companion Companion = null;
        
        SeasonSorting(int index, java.lang.String value) {
        }
        
        public final int getIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonsSettings$SeasonSorting$Companion;", "", "()V", "fromValue", "Lcom/battlelancer/seriesguide/shows/overview/SeasonsSettings$SeasonSorting;", "value", "", "app_amazonDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.battlelancer.seriesguide.shows.overview.SeasonsSettings.SeasonSorting fromValue(@org.jetbrains.annotations.Nullable()
            java.lang.String value) {
                return null;
            }
        }
    }
}