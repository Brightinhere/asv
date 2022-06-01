package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsActivity;", "Lcom/battlelancer/seriesguide/ui/BaseMessageActivity;", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment$OnAddShowListener;", "()V", "onAddShow", "", "show", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupActionBar", "link", "Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsLink;", "Companion", "app_amazonDebug"})
public final class TraktShowsActivity extends com.battlelancer.seriesguide.ui.BaseMessageActivity implements com.battlelancer.seriesguide.shows.search.discover.AddShowDialogFragment.OnAddShowListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.search.discover.TraktShowsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LINK = "LINK";
    
    public TraktShowsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setupActionBar(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink link) {
    }
    
    @java.lang.Override()
    public void onAddShow(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.SearchResult show) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink link) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsActivity$Companion;", "", "()V", "EXTRA_LINK", "", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "link", "Lcom/battlelancer/seriesguide/shows/search/discover/TraktShowsLink;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.TraktShowsLink link) {
            return null;
        }
    }
}