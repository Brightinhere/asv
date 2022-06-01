package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

/**
 * Kotlin add show fragment listening to add events to update adapter items.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/BaseAddShowsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "itemClickListener", "Lcom/battlelancer/seriesguide/shows/search/discover/AddFragment$AddAdapter$OnItemClickListener;", "getItemClickListener", "()Lcom/battlelancer/seriesguide/shows/search/discover/AddFragment$AddAdapter$OnItemClickListener;", "onEventAddingShow", "", "event", "Lcom/battlelancer/seriesguide/shows/search/discover/AddFragment$OnAddingShowEvent;", "onEventShowAdded", "Lcom/battlelancer/seriesguide/shows/tools/AddShowTask$OnShowAddedEvent;", "onEventShowRemoved", "Lcom/battlelancer/seriesguide/shows/tools/ShowTools2$OnShowRemovedEvent;", "onStart", "onStop", "setAllPendingNotAdded", "setStateForTmdbId", "showTmdbId", "", "newState", "app_pureDebug"})
public abstract class BaseAddShowsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.shows.search.discover.AddFragment.AddAdapter.OnItemClickListener itemClickListener = null;
    
    public BaseAddShowsFragment() {
        super();
    }
    
    public abstract void setAllPendingNotAdded();
    
    public abstract void setStateForTmdbId(int showTmdbId, int newState);
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    /**
     * Called if the user triggers adding a single new show through the add dialog. The show is not
     * actually added, yet.
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventAddingShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.AddFragment.OnAddingShowEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventShowAdded(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.tools.AddShowTask.OnShowAddedEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventShowRemoved(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.tools.ShowTools2.OnShowRemovedEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.battlelancer.seriesguide.shows.search.discover.AddFragment.AddAdapter.OnItemClickListener getItemClickListener() {
        return null;
    }
}