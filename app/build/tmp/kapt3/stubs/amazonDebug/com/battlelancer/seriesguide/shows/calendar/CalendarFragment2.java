package com.battlelancer.seriesguide.shows.calendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u000278B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u001f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'2\u0006\u0010+\u001a\u00020,H\u0002J\u0011\u0010-\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020%H\u0002J\u0018\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020%H\u0002J\u0018\u00105\u001a\u00020\u00162\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarAdapter2;", "calendarItemClickListener", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarAdapter2$ItemClickListener;", "prefChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "textViewEmpty", "Landroid/widget/TextView;", "type", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2$CalendarType;", "viewModel", "Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2ViewModel;", "getViewModel", "()Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "toggleFilterSetting", "key", "", "updateCalendarQuery", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEmptyView", "isEmpty", "updateEpisodeCollectionState", "episodeId", "", "addToCollection", "updateEpisodeWatchedState", "isWatched", "CalendarType", "Companion", "app_amazonDebug"})
public final class CalendarFragment2 extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView textViewEmpty;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.battlelancer.seriesguide.shows.calendar.CalendarAdapter2 adapter;
    private com.battlelancer.seriesguide.shows.calendar.CalendarFragment2.CalendarType type;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener prefChangeListener = null;
    private final com.battlelancer.seriesguide.shows.calendar.CalendarAdapter2.ItemClickListener calendarItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.calendar.CalendarFragment2.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_CALENDAR_TYPE = "calendarType";
    private static final int CONTEXT_FLAG_WATCHED_ID = 0;
    private static final int CONTEXT_FLAG_UNWATCHED_ID = 1;
    private static final int CONTEXT_CHECKIN_ID = 2;
    private static final int CONTEXT_COLLECTION_ADD_ID = 3;
    private static final int CONTEXT_COLLECTION_REMOVE_ID = 4;
    
    public CalendarFragment2() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.calendar.CalendarFragment2ViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateEmptyView(boolean isEmpty) {
    }
    
    private final java.lang.Object updateCalendarQuery(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void toggleFilterSetting(android.view.MenuItem item, java.lang.String key) {
    }
    
    private final void updateEpisodeCollectionState(long episodeId, boolean addToCollection) {
    }
    
    private final void updateEpisodeWatchedState(long episodeId, boolean isWatched) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2$CalendarType;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "UPCOMING", "RECENT", "app_amazonDebug"})
    public static enum CalendarType {
        /*public static final*/ UPCOMING /* = new UPCOMING(0) */,
        /*public static final*/ RECENT /* = new RECENT(0) */;
        private final int id = 0;
        
        CalendarType(int id) {
        }
        
        public final int getId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/calendar/CalendarFragment2$Companion;", "", "()V", "ARG_CALENDAR_TYPE", "", "CONTEXT_CHECKIN_ID", "", "CONTEXT_COLLECTION_ADD_ID", "CONTEXT_COLLECTION_REMOVE_ID", "CONTEXT_FLAG_UNWATCHED_ID", "CONTEXT_FLAG_WATCHED_ID", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}