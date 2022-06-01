package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsDistillationFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "filterListener", "Lcom/battlelancer/seriesguide/shows/FilterShowsView$FilterListener;", "sortOrderListener", "Lcom/battlelancer/seriesguide/shows/SortShowsView$SortOrderListener;", "tabLayout", "Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "getTabLayout$app_amazonDebug", "()Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "setTabLayout$app_amazonDebug", "(Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;)V", "unbinder", "Lbutterknife/Unbinder;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getViewPager$app_amazonDebug", "()Landroidx/viewpager/widget/ViewPager;", "setViewPager$app_amazonDebug", "(Landroidx/viewpager/widget/ViewPager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "Companion", "app_amazonDebug"})
public final class ShowsDistillationFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.tabLayoutShowsDistillation)
    public com.uwetrottmann.seriesguide.widgets.SlidingTabLayout tabLayout;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.viewPagerShowsDistillation)
    public androidx.viewpager.widget.ViewPager viewPager;
    private butterknife.Unbinder unbinder;
    private final com.battlelancer.seriesguide.shows.FilterShowsView.FilterListener filterListener = null;
    private final com.battlelancer.seriesguide.shows.SortShowsView.SortOrderListener sortOrderListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.ShowsDistillationFragment.Companion Companion = null;
    private static final java.lang.String TAG = "shows-distillation-dialog";
    
    public ShowsDistillationFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.widgets.SlidingTabLayout getTabLayout$app_amazonDebug() {
        return null;
    }
    
    public final void setTabLayout$app_amazonDebug(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.widgets.SlidingTabLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.viewpager.widget.ViewPager getViewPager$app_amazonDebug() {
        return null;
    }
    
    public final void setViewPager$app_amazonDebug(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager p0) {
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
    public void onDestroyView() {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsDistillationFragment$Companion;", "", "()V", "TAG", "", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
    }
}