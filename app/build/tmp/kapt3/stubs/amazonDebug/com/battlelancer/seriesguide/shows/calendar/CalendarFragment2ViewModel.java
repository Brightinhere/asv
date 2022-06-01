package com.battlelancer.seriesguide.shows.calendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2ViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "calendarItemPagingConfig", "Landroidx/paging/PagingConfig;", "items", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2ViewModel$CalendarItem;", "getItems", "()Lkotlinx/coroutines/flow/Flow;", "queryLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "calculateHeaderTime", "", "context", "Landroid/content/Context;", "calendar", "Ljava/util/Calendar;", "releaseTime", "updateCalendarQuery", "", "isUpcomingElseRecent", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CalendarItem", "app_amazonDebug"})
public final class CalendarFragment2ViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryLiveData = null;
    private final androidx.paging.PagingConfig calendarItemPagingConfig = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.battlelancer.seriesguide.shows.calendar.CalendarFragment2ViewModel.CalendarItem>> items = null;
    
    public CalendarFragment2ViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.battlelancer.seriesguide.shows.calendar.CalendarFragment2ViewModel.CalendarItem>> getItems() {
        return null;
    }
    
    /**
     * Builds the calendar query based on given settings, updates the associated LiveData which
     * will update the query results.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateCalendarQuery(boolean isUpcomingElseRecent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final long calculateHeaderTime(android.content.Context context, java.util.Calendar calendar, long releaseTime) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2ViewModel$CalendarItem;", "", "headerTime", "", "episode", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;", "(JLcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;)V", "getEpisode", "()Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;", "getHeaderTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_amazonDebug"})
    public static final class CalendarItem {
        private final long headerTime = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow episode = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.calendar.CalendarFragment2ViewModel.CalendarItem copy(long headerTime, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow episode) {
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
        
        public CalendarItem(long headerTime, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow episode) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getHeaderTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow getEpisode() {
            return null;
        }
    }
}