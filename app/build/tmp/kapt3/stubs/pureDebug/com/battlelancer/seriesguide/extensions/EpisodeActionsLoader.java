package com.battlelancer.seriesguide.extensions;

import java.lang.System;

/**
 * Tries returning existing actions for an episode. If no actions have been published, will ask
 * extensions to do so and returns an empty list.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/EpisodeActionsLoader;", "Lcom/uwetrottmann/androidutils/GenericSimpleLoader;", "", "Lcom/battlelancer/seriesguide/api/Action;", "context", "Landroid/content/Context;", "episodeId", "", "(Landroid/content/Context;J)V", "loadInBackground", "app_pureDebug"})
public final class EpisodeActionsLoader extends com.uwetrottmann.androidutils.GenericSimpleLoader<java.util.List<com.battlelancer.seriesguide.api.Action>> {
    private final long episodeId = 0L;
    
    public EpisodeActionsLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long episodeId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.battlelancer.seriesguide.api.Action> loadInBackground() {
        return null;
    }
}