package com.battlelancer.seriesguide.shows;

import java.lang.System;

/**
 * Displays the list of shows in a users local library with sorting and filtering abilities. The
 * main view of the app.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020 H\u0016J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020 H\u0016J\b\u00105\u001a\u00020 H\u0016J\u001a\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00108\u001a\u00020 H\u0002J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u000201H\u0002J\b\u0010;\u001a\u00020 H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activityModel", "Lcom/battlelancer/seriesguide/shows/ShowsActivityViewModel;", "getActivityModel", "()Lcom/battlelancer/seriesguide/shows/ShowsActivityViewModel;", "activityModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter;", "emptyView", "Landroid/widget/Button;", "emptyViewFilter", "model", "Lcom/battlelancer/seriesguide/shows/ShowsViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/ShowsViewModel;", "model$delegate", "onItemClickListener", "Lcom/battlelancer/seriesguide/shows/ShowsAdapter$OnItemClickListener;", "onPreferenceChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scheduledUpdateJob", "Lkotlinx/coroutines/Job;", "showFilter", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$ShowFilter;", "showSortOrder", "Lcom/battlelancer/seriesguide/shows/SortShowsView$ShowSortOrder;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEventFirstRunButton", "event", "Lcom/battlelancer/seriesguide/shows/FirstRunView$ButtonEvent;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onStart", "onStop", "onViewCreated", "view", "startActivityAddShows", "updateEmptyView", "isEmpty", "updateShowsQuery", "app_amazonDebug"})
public final class ShowsFragment extends androidx.fragment.app.Fragment {
    private com.battlelancer.seriesguide.shows.SortShowsView.ShowSortOrder showSortOrder;
    private com.battlelancer.seriesguide.shows.FilterShowsView.ShowFilter showFilter;
    private com.battlelancer.seriesguide.shows.ShowsAdapter adapter;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.Button emptyView;
    private android.widget.Button emptyViewFilter;
    private kotlinx.coroutines.Job scheduledUpdateJob;
    private final kotlin.Lazy activityModel$delegate = null;
    private final kotlin.Lazy model$delegate = null;
    private final com.battlelancer.seriesguide.shows.ShowsAdapter.OnItemClickListener onItemClickListener = null;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener onPreferenceChangeListener = null;
    
    public ShowsFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.ShowsActivityViewModel getActivityModel() {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.ShowsViewModel getModel() {
        return null;
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
    
    private final void updateShowsQuery() {
    }
    
    private final void updateEmptyView(boolean isEmpty) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
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
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventFirstRunButton(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.FirstRunView.ButtonEvent event) {
    }
    
    private final void startActivityAddShows() {
    }
}