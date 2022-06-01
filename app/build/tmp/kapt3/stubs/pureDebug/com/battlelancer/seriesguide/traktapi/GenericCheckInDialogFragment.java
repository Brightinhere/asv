package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH$J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/GenericCheckInDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogCheckinBinding;", "checkIn", "", "checkInTrakt", "message", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onEvent", "event", "Lcom/battlelancer/seriesguide/traktapi/TraktTask$TraktActionCompleteEvent;", "Lcom/battlelancer/seriesguide/traktapi/TraktTask$TraktCheckInBlockedEvent;", "onStart", "onStop", "setProgressLock", "lock", "", "CheckInDialogDismissedEvent", "Companion", "app_pureDebug"})
public abstract class GenericCheckInDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogCheckinBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.GenericCheckInDialogFragment.Companion Companion = null;
    
    /**
     * Title of episode or movie. **Required.**
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ITEM_TITLE = "itemtitle";
    
    /**
     * Movie TMDb id. **Required for movies.**
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_MOVIE_TMDB_ID = "movietmdbid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_EPISODE_ID = "episodeid";
    
    public GenericCheckInDialogFragment() {
        super();
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
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.traktapi.TraktTask.TraktActionCompleteEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.traktapi.TraktTask.TraktCheckInBlockedEvent event) {
    }
    
    private final void checkIn() {
    }
    
    /**
     * Start the Trakt check-in task.
     */
    protected abstract void checkInTrakt(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    /**
     * Disables all interactive UI elements and shows a progress indicator.
     */
    private final void setProgressLock(boolean lock) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/GenericCheckInDialogFragment$CheckInDialogDismissedEvent;", "", "()V", "app_pureDebug"})
    public static final class CheckInDialogDismissedEvent {
        
        public CheckInDialogDismissedEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/GenericCheckInDialogFragment$Companion;", "", "()V", "ARG_EPISODE_ID", "", "ARG_ITEM_TITLE", "ARG_MOVIE_TMDB_ID", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}