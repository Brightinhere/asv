package com.battlelancer.seriesguide.history;

import java.lang.System;

/**
 * Displays the latest Trakt episode watch history of the user.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/history/UserEpisodeStreamFragment;", "Lcom/battlelancer/seriesguide/history/StreamFragment;", "()V", "activityLoaderCallbacks", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader$Result;", "adapter", "Lcom/battlelancer/seriesguide/history/EpisodeHistoryAdapter;", "itemClickListener", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter$OnItemClickListener;", "listAdapter", "Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter;", "getListAdapter", "()Lcom/battlelancer/seriesguide/history/BaseHistoryAdapter;", "initializeStream", "", "refreshStream", "app_pureDebug"})
public final class UserEpisodeStreamFragment extends com.battlelancer.seriesguide.history.StreamFragment {
    private com.battlelancer.seriesguide.history.EpisodeHistoryAdapter adapter;
    private final com.battlelancer.seriesguide.history.BaseHistoryAdapter.OnItemClickListener itemClickListener = null;
    private final androidx.loader.app.LoaderManager.LoaderCallbacks<com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader.Result> activityLoaderCallbacks = null;
    
    public UserEpisodeStreamFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.battlelancer.seriesguide.history.BaseHistoryAdapter getListAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void initializeStream() {
    }
    
    @java.lang.Override()
    protected void refreshStream() {
    }
}