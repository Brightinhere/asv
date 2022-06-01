package com.battlelancer.seriesguide.people;

import java.lang.System;

/**
 * A fragment loading and showing a list of cast or crew members.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 52\u00020\u0001:\u000256B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\"H\u0016J\u001a\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010.\u001a\u00020\u001dH\u0002J\u0006\u0010/\u001a\u00020\u001dJ\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u0006H\u0002J\b\u00102\u001a\u00020\u001dH\u0002J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/battlelancer/seriesguide/people/PeopleFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activateOnItemClick", "", "activatedPosition", "", "adapter", "Lcom/battlelancer/seriesguide/people/PeopleAdapter;", "emptyView", "Lcom/battlelancer/seriesguide/ui/widgets/EmptyView;", "listView", "Landroid/widget/ListView;", "mediaType", "Lcom/battlelancer/seriesguide/people/PeopleActivity$MediaType;", "model", "Lcom/battlelancer/seriesguide/people/PeopleViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/people/PeopleViewModel;", "model$delegate", "Lkotlin/Lazy;", "onShowPersonListener", "Lcom/battlelancer/seriesguide/people/PeopleFragment$OnShowPersonListener;", "peopleType", "Lcom/battlelancer/seriesguide/people/PeopleActivity$PeopleType;", "progressBar", "Landroid/widget/ProgressBar;", "tmdbId", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onSaveInstanceState", "outState", "onViewCreated", "view", "refresh", "setActivateOnItemClick", "setActivatedPosition", "position", "setEmptyMessage", "setProgressVisibility", "isVisible", "Companion", "OnShowPersonListener", "app_amazonDebug"})
public final class PeopleFragment extends androidx.fragment.app.Fragment {
    private android.widget.ListView listView;
    private com.battlelancer.seriesguide.ui.widgets.EmptyView emptyView;
    private com.battlelancer.seriesguide.people.PeopleAdapter adapter;
    private android.widget.ProgressBar progressBar;
    private com.battlelancer.seriesguide.people.PeopleActivity.MediaType mediaType;
    private com.battlelancer.seriesguide.people.PeopleActivity.PeopleType peopleType;
    private int tmdbId = 0;
    private com.battlelancer.seriesguide.people.PeopleFragment.OnShowPersonListener onShowPersonListener;
    private boolean activateOnItemClick = false;
    
    /**
     * The current activated item position. Only used on tablets.
     */
    private int activatedPosition = -1;
    private final kotlin.Lazy model$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.people.PeopleFragment.Companion Companion = null;
    
    /**
     * The serialization (saved instance state) Bundle key representing the activated item position.
     * Only used on tablets.
     */
    private static final java.lang.String STATE_ACTIVATED_POSITION = "activated_position";
    private static final com.battlelancer.seriesguide.people.PeopleFragment.OnShowPersonListener sDummyListener = null;
    
    public PeopleFragment() {
        super();
    }
    
    private final com.battlelancer.seriesguide.people.PeopleViewModel getModel() {
        return null;
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void refresh() {
    }
    
    /**
     * Turns on activate-on-click mode. When this mode is on, list items will be given the
     * 'activated' state when touched.
     */
    public final void setActivateOnItemClick() {
    }
    
    private final void setActivatedPosition(int position) {
    }
    
    /**
     * Shows or hides a custom indeterminate progress indicator inside this activity layout.
     */
    private final void setProgressVisibility(boolean isVisible) {
    }
    
    private final void setEmptyMessage() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/people/PeopleFragment$OnShowPersonListener;", "", "showPerson", "", "tmdbId", "", "app_amazonDebug"})
    public static abstract interface OnShowPersonListener {
        
        public abstract void showPerson(int tmdbId);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/people/PeopleFragment$Companion;", "", "()V", "STATE_ACTIVATED_POSITION", "", "sDummyListener", "Lcom/battlelancer/seriesguide/people/PeopleFragment$OnShowPersonListener;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}