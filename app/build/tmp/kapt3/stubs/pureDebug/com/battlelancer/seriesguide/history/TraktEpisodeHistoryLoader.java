package com.battlelancer.seriesguide.history;

import java.lang.System;

/**
 * Loads the last few episodes watched on Trakt.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00100\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u000bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader;", "Lcom/uwetrottmann/androidutils/GenericSimpleLoader;", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$Result;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "action", "", "getAction", "()Ljava/lang/String;", "emptyText", "", "getEmptyText", "()I", "buildCall", "Lretrofit2/Call;", "", "Lcom/uwetrottmann/trakt5/entities/HistoryEntry;", "buildResultFailure", "emptyTextResId", "calculateHeaderTime", "", "calendar", "Ljava/util/Calendar;", "timestampMs", "loadInBackground", "Companion", "HistoryItem", "Result", "app_pureDebug"})
public class TraktEpisodeHistoryLoader extends com.uwetrottmann.androidutils.GenericSimpleLoader<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.Result> {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.Companion Companion = null;
    public static final int MAX_HISTORY_SIZE = 50;
    
    public TraktEpisodeHistoryLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.Result loadInBackground() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getAction() {
        return null;
    }
    
    @androidx.annotation.StringRes()
    public int getEmptyText() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected retrofit2.Call<java.util.List<com.uwetrottmann.trakt5.entities.HistoryEntry>> buildCall() {
        return null;
    }
    
    /**
     * Takes the action timestamp and "rounds" it down to shortly after midnight in the current
     * device time zone.
     */
    private final long calculateHeaderTime(java.util.Calendar calendar, long timestampMs) {
        return 0L;
    }
    
    private final com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.Result buildResultFailure() {
        return null;
    }
    
    private final com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.Result buildResultFailure(@androidx.annotation.StringRes()
    int emptyTextResId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "", "headerTime", "", "historyEntry", "Lcom/uwetrottmann/trakt5/entities/HistoryEntry;", "(JLcom/uwetrottmann/trakt5/entities/HistoryEntry;)V", "getHeaderTime", "()J", "getHistoryEntry", "()Lcom/uwetrottmann/trakt5/entities/HistoryEntry;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_pureDebug"})
    public static final class HistoryItem {
        private final long headerTime = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.uwetrottmann.trakt5.entities.HistoryEntry historyEntry = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem copy(long headerTime, @org.jetbrains.annotations.NotNull()
        com.uwetrottmann.trakt5.entities.HistoryEntry historyEntry) {
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
        
        public HistoryItem(long headerTime, @org.jetbrains.annotations.NotNull()
        com.uwetrottmann.trakt5.entities.HistoryEntry historyEntry) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getHeaderTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.uwetrottmann.trakt5.entities.HistoryEntry component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.uwetrottmann.trakt5.entities.HistoryEntry getHistoryEntry() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$Result;", "", "results", "", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$HistoryItem;", "emptyText", "", "(Ljava/util/List;Ljava/lang/String;)V", "getEmptyText", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_pureDebug"})
    public static final class Result {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> results = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String emptyText = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.Result copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> results, @org.jetbrains.annotations.NotNull()
        java.lang.String emptyText) {
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
        
        public Result(@org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> results, @org.jetbrains.annotations.NotNull()
        java.lang.String emptyText) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.HistoryItem> getResults() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmptyText() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$Companion;", "", "()V", "MAX_HISTORY_SIZE", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}