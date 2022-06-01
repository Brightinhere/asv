package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

/**
 * Allows to check into an episode. Launching activities should subscribe to
 * [TraktTask.TraktActionCompleteEvent] to display status toasts.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/CheckInDialogFragment;", "Lcom/battlelancer/seriesguide/traktapi/GenericCheckInDialogFragment;", "()V", "checkInTrakt", "", "message", "", "Companion", "app_pureDebug"})
public final class CheckInDialogFragment extends com.battlelancer.seriesguide.traktapi.GenericCheckInDialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.CheckInDialogFragment.Companion Companion = null;
    
    public CheckInDialogFragment() {
        super();
    }
    
    @java.lang.Override()
    protected void checkInTrakt(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/CheckInDialogFragment$Companion;", "", "()V", "show", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "episodeId", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Builds and shows a new [CheckInDialogFragment] setting all values based on the given
         * episode row ID.
         *
         * @return `false` if the fragment was not shown.
         */
        public final boolean show(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, long episodeId) {
            return false;
        }
    }
}