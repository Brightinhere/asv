package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/SeasonTools;", "", "()V", "getSeasonString", "", "context", "Landroid/content/Context;", "seasonNumber", "", "hasSkippedTag", "", "tags", "app_amazonDebug"})
public final class SeasonTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.overview.SeasonTools INSTANCE = null;
    
    private SeasonTools() {
        super();
    }
    
    public final boolean hasSkippedTag(@org.jetbrains.annotations.Nullable()
    java.lang.String tags) {
        return false;
    }
    
    /**
     * Builds a localized string like "Season 5" or if the number is 0 "Special Episodes".
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSeasonString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int seasonNumber) {
        return null;
    }
}