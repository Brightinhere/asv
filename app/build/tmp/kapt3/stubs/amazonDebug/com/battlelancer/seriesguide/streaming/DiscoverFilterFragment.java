package com.battlelancer.seriesguide.streaming;

import java.lang.System;

/**
 * Dialog to configure watch provider list in a specific region only to filter by,
 * stores different list for shows or movies.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/DiscoverFilterFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/FragmentShowsDiscoverFilterBinding;", "model", "Lcom/battlelancer/seriesguide/streaming/DiscoverFilterViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/streaming/DiscoverFilterViewModel;", "model$delegate", "Lkotlin/Lazy;", "type", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider$Type;", "watchProviderClickListener", "Lcom/battlelancer/seriesguide/shows/search/discover/ShowsDiscoverFilterAdapter$ClickListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "app_amazonDebug"})
public final class DiscoverFilterFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.streaming.SgWatchProvider.Type type;
    private final kotlin.Lazy model$delegate = null;
    private com.battlelancer.seriesguide.databinding.FragmentShowsDiscoverFilterBinding binding;
    private final com.battlelancer.seriesguide.shows.search.discover.ShowsDiscoverFilterAdapter.ClickListener watchProviderClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.streaming.DiscoverFilterFragment.Companion Companion = null;
    private static final java.lang.String ARG_TYPE = "type";
    
    public DiscoverFilterFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.streaming.DiscoverFilterViewModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/DiscoverFilterFragment$Companion;", "", "()V", "ARG_TYPE", "", "showForMovies", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showForShows", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean showForShows(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
            return false;
        }
        
        public final boolean showForMovies(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
            return false;
        }
    }
}