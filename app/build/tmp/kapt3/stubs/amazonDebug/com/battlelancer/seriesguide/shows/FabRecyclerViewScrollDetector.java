package com.battlelancer.seriesguide.shows;

import java.lang.System;

/**
 * Hides the floating action button when scrolling down, shows it when scrolling up. If the view can
 * no longer scroll down, shows the button also.
 *
 * Built upon https://github.com/makovkastar/FloatingActionButton scroll detectors.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FabRecyclerViewScrollDetector;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "button", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "scrollThreshold", "", "onScrollDown", "", "onScrollUp", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "app_amazonDebug"})
public final class FabRecyclerViewScrollDetector extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private final com.google.android.material.floatingactionbutton.FloatingActionButton button = null;
    private final int scrollThreshold = 0;
    
    public FabRecyclerViewScrollDetector(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton button) {
        super();
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    private final void onScrollDown() {
    }
    
    private final void onScrollUp() {
    }
}