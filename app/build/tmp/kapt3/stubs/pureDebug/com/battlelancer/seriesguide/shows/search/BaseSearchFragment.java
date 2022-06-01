package com.battlelancer.seriesguide.shows.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u001a\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/battlelancer/seriesguide/shows/search/BaseSearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "emptyView", "Landroid/view/View;", "getEmptyView", "()Landroid/view/View;", "setEmptyView", "(Landroid/view/View;)V", "gridView", "Landroid/widget/GridView;", "getGridView", "()Landroid/widget/GridView;", "setGridView", "(Landroid/widget/GridView;)V", "initialSearchArgs", "Landroid/os/Bundle;", "getInitialSearchArgs", "()Landroid/os/Bundle;", "setInitialSearchArgs", "(Landroid/os/Bundle;)V", "onCreate", "", "savedInstanceState", "onStart", "onStop", "onViewCreated", "view", "updateEmptyState", "hasNoResults", "", "hasQuery", "app_pureDebug"})
public abstract class BaseSearchFragment extends androidx.fragment.app.Fragment {
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewSearchEmpty)
    public android.view.View emptyView;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.gridViewSearch)
    public android.widget.GridView gridView;
    @org.jetbrains.annotations.Nullable()
    private android.os.Bundle initialSearchArgs;
    
    public BaseSearchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getEmptyView() {
        return null;
    }
    
    public final void setEmptyView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.GridView getGridView() {
        return null;
    }
    
    public final void setGridView(@org.jetbrains.annotations.NotNull()
    android.widget.GridView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.Bundle getInitialSearchArgs() {
        return null;
    }
    
    public final void setInitialSearchArgs(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    protected final void updateEmptyState(boolean hasNoResults, boolean hasQuery) {
    }
}