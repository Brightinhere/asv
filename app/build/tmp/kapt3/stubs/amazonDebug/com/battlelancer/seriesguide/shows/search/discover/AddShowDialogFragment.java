package com.battlelancer.seriesguide.shows.search.discover;

import java.lang.System;

/**
 * A [DialogFragment] allowing the user to decide whether to add a show to SeriesGuide.
 * Displays show details as well.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0002&\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "addShowListener", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment$OnAddShowListener;", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogAddshowBinding;", "languageCode", "", "model", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogViewModel;", "model$delegate", "Lkotlin/Lazy;", "showTmdbId", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDestroyView", "onEventMainThread", "event", "Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment$LanguageChangedEvent;", "onStart", "onStop", "populateShowViews", "result", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogViewModel$ShowDetails;", "showProgressBar", "isVisible", "", "Companion", "OnAddShowListener", "app_amazonDebug"})
public final class AddShowDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogAddshowBinding binding;
    private com.battlelancer.seriesguide.shows.search.discover.AddShowDialogFragment.OnAddShowListener addShowListener;
    private int showTmdbId = 0;
    private java.lang.String languageCode;
    private final kotlin.Lazy model$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.search.discover.AddShowDialogFragment.Companion Companion = null;
    private static final java.lang.String TAG = "AddShowDialogFragment";
    private static final java.lang.String ARG_INT_SHOW_TMDBID = "show_tmdbid";
    private static final java.lang.String ARG_STRING_LANGUAGE_CODE = "language";
    
    public AddShowDialogFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.shows.search.discover.AddShowDialogViewModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.ui.dialogs.L10nDialogFragment.LanguageChangedEvent event) {
    }
    
    private final void populateShowViews(com.battlelancer.seriesguide.shows.search.discover.AddShowDialogViewModel.ShowDetails result) {
    }
    
    private final void showProgressBar(boolean isVisible) {
    }
    
    /**
     * Display a [AddShowDialogFragment] for the given show. The language of the show should
     * be set.
     */
    @kotlin.jvm.JvmStatic()
    public static final void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.SearchResult show) {
    }
    
    /**
     * Display a [AddShowDialogFragment] for the given show.
     *
     * Use if there is no actual search result, but just a TheTVDB id available. Uses the search
     * or fall back language.
     */
    @kotlin.jvm.JvmStatic()
    public static final void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, int showTmdbId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment$OnAddShowListener;", "", "onAddShow", "", "show", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "app_amazonDebug"})
    public static abstract interface OnAddShowListener {
        
        public abstract void onAddShow(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.SearchResult show);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0010H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment$Companion;", "", "()V", "ARG_INT_SHOW_TMDBID", "", "ARG_STRING_LANGUAGE_CODE", "TAG", "newInstance", "Lcom/battlelancer/seriesguide/shows/search/discover/AddShowDialogFragment;", "showTmdbId", "", "languageCode", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "Lcom/battlelancer/seriesguide/shows/search/discover/SearchResult;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Display a [AddShowDialogFragment] for the given show. The language of the show should
         * be set.
         */
        @kotlin.jvm.JvmStatic()
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.search.discover.SearchResult show) {
        }
        
        /**
         * Display a [AddShowDialogFragment] for the given show.
         *
         * Use if there is no actual search result, but just a TheTVDB id available. Uses the search
         * or fall back language.
         */
        @kotlin.jvm.JvmStatic()
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm, int showTmdbId) {
        }
        
        private final com.battlelancer.seriesguide.shows.search.discover.AddShowDialogFragment newInstance(int showTmdbId, java.lang.String languageCode) {
            return null;
        }
    }
}