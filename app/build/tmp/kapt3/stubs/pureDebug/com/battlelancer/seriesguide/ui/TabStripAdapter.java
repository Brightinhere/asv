package com.battlelancer.seriesguide.ui;

import java.lang.System;

/**
 * Helper class for easy setup of a {@link SlidingTabLayout} with a mutable set of tabs.
 * Requires that tabs each have a unique title string resource
 * as it is used to uniquely identify a tab.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J.\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0011J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/battlelancer/seriesguide/ui/TabStripAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "tabLayout", "Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/viewpager2/widget/ViewPager2;Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;)V", "tabTitleSupplier", "Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout$TabTitleSupplier;", "tabs", "Ljava/util/ArrayList;", "Lcom/battlelancer/seriesguide/ui/TabStripAdapter$TabInfo;", "addTab", "", "titleRes", "", "fragmentClass", "Ljava/lang/Class;", "args", "Landroid/os/Bundle;", "position", "containsItem", "", "itemId", "", "createFragment", "Landroidx/fragment/app/Fragment;", "getItemCount", "getItemId", "notifyTabsChanged", "TabInfo", "app_pureDebug"})
public class TabStripAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final androidx.fragment.app.FragmentActivity fragmentActivity = null;
    private final androidx.viewpager2.widget.ViewPager2 viewPager = null;
    private final com.uwetrottmann.seriesguide.widgets.SlidingTabLayout tabLayout = null;
    private final java.util.ArrayList<com.battlelancer.seriesguide.ui.TabStripAdapter.TabInfo> tabs = null;
    private final com.uwetrottmann.seriesguide.widgets.SlidingTabLayout.TabTitleSupplier tabTitleSupplier = null;
    
    public TabStripAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity, @org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 viewPager, @org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.widgets.SlidingTabLayout tabLayout) {
        super(null);
    }
    
    /**
     * Adds a new tab at the end.
     *
     * Make sure to call [notifyTabsChanged] after you have added them all.
     */
    public final void addTab(@androidx.annotation.StringRes()
    int titleRes, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> fragmentClass, @org.jetbrains.annotations.Nullable()
    android.os.Bundle args) {
    }
    
    /**
     * Adds a new tab at the given position.
     *
     * Make sure to call [notifyTabsChanged] after you have added them all.
     */
    public final void addTab(@androidx.annotation.StringRes()
    int titleRes, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> fragmentClass, @org.jetbrains.annotations.Nullable()
    android.os.Bundle args, int position) {
    }
    
    /**
     * Notifies the adapter and tab strip that the tabs have changed.
     */
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void notifyTabsChanged() {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean containsItem(long itemId) {
        return false;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/ui/TabStripAdapter$TabInfo;", "", "fragmentClass", "Ljava/lang/Class;", "args", "Landroid/os/Bundle;", "titleRes", "", "(Ljava/lang/Class;Landroid/os/Bundle;I)V", "getArgs", "()Landroid/os/Bundle;", "getFragmentClass", "()Ljava/lang/Class;", "getTitleRes", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_pureDebug"})
    public static final class TabInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Class<?> fragmentClass = null;
        @org.jetbrains.annotations.Nullable()
        private final android.os.Bundle args = null;
        private final int titleRes = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.ui.TabStripAdapter.TabInfo copy(@org.jetbrains.annotations.NotNull()
        java.lang.Class<?> fragmentClass, @org.jetbrains.annotations.Nullable()
        android.os.Bundle args, int titleRes) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public TabInfo(@org.jetbrains.annotations.NotNull()
        java.lang.Class<?> fragmentClass, @org.jetbrains.annotations.Nullable()
        android.os.Bundle args, int titleRes) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Class<?> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Class<?> getFragmentClass() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Bundle component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Bundle getArgs() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getTitleRes() {
            return 0;
        }
    }
}