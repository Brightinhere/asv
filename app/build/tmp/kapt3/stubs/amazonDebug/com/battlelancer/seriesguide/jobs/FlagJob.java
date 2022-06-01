package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/FlagJob;", "", "applyLocalChanges", "", "context", "Landroid/content/Context;", "requiresNetworkJob", "getConfirmationText", "", "supportsHexagon", "supportsTrakt", "app_amazonDebug"})
public abstract interface FlagJob {
    
    public abstract boolean supportsHexagon();
    
    public abstract boolean supportsTrakt();
    
    /**
     * If requested, prepares a network job. Applies local changes, then persists the network job.
     *
     * @return If local changes were applied successfully and if requested the network op was
     * persisted.
     */
    public abstract boolean applyLocalChanges(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean requiresNetworkJob);
    
    /**
     * A message to be shown to the user that an action has completed (locally).
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConfirmationText(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
}