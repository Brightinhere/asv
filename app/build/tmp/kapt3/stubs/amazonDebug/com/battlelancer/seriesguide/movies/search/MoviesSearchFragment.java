package com.battlelancer.seriesguide.movies.search;

import java.lang.System;

/**
 * Integrates with a search interface and displays movies based on query results. Can pre-populate
 * the displayed movies based on a sent link.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020(R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/battlelancer/seriesguide/movies/search/MoviesSearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/battlelancer/seriesguide/databinding/FragmentMoviesSearchBinding;", "adapter", "Lcom/battlelancer/seriesguide/movies/search/MoviesSearchAdapter;", "binding", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/FragmentMoviesSearchBinding;", "link", "Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;", "model", "Lcom/battlelancer/seriesguide/movies/search/MoviesSearchViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/movies/search/MoviesSearchViewModel;", "model$delegate", "Lkotlin/Lazy;", "onRefreshListener", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "searchClickListener", "Lcom/battlelancer/seriesguide/movies/search/MoviesSearchFragment$OnSearchClickListener;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "search", "query", "", "Companion", "OnSearchClickListener", "app_amazonDebug"})
public final class MoviesSearchFragment extends androidx.fragment.app.Fragment {
    private com.battlelancer.seriesguide.databinding.FragmentMoviesSearchBinding _binding;
    private com.battlelancer.seriesguide.movies.MoviesDiscoverLink link;
    private com.battlelancer.seriesguide.movies.search.MoviesSearchFragment.OnSearchClickListener searchClickListener;
    private com.battlelancer.seriesguide.movies.search.MoviesSearchAdapter adapter;
    private final kotlin.Lazy model$delegate = null;
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener onRefreshListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.movies.search.MoviesSearchFragment.Companion Companion = null;
    private static final java.lang.String ARG_ID_LINK = "linkId";
    
    public MoviesSearchFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.databinding.FragmentMoviesSearchBinding getBinding() {
        return null;
    }
    
    private final com.battlelancer.seriesguide.movies.search.MoviesSearchViewModel getModel() {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.movies.search.MoviesSearchFragment newInstance(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.MoviesDiscoverLink link) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/battlelancer/seriesguide/movies/search/MoviesSearchFragment$OnSearchClickListener;", "", "onSearchClick", "", "app_amazonDebug"})
    public static abstract interface OnSearchClickListener {
        
        public abstract void onSearchClick();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/movies/search/MoviesSearchFragment$Companion;", "", "()V", "ARG_ID_LINK", "", "newInstance", "Lcom/battlelancer/seriesguide/movies/search/MoviesSearchFragment;", "link", "Lcom/battlelancer/seriesguide/movies/MoviesDiscoverLink;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.movies.search.MoviesSearchFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.movies.MoviesDiscoverLink link) {
            return null;
        }
    }
}