package com.battlelancer.seriesguide.settings;

import java.lang.System;

/**
 * Settings related to appearance, display formats and sort orders.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/battlelancer/seriesguide/settings/DisplaySettings;", "", "()V", "KEY_DISPLAY_EXACT_DATE", "", "KEY_DYNAMIC_COLOR", "KEY_HIDE_SPECIALS", "KEY_NO_RELEASED_EPISODES", "KEY_NUMBERFORMAT", "KEY_PREVENT_SPOILERS", "KEY_SHOWS_TIME_OFFSET", "KEY_SORT_IGNORE_ARTICLE", "KEY_THEME", "LANGUAGE_EN", "getNumberFormat", "context", "Landroid/content/Context;", "getShowsTimeOffset", "", "getThemeIndex", "isDisplayExactDate", "", "isDynamicColorsEnabled", "isHidingSpecials", "isNoReleasedEpisodes", "isSortOrderIgnoringArticles", "isVeryHighDensityScreen", "preventSpoilers", "setNoReleasedEpisodes", "", "value", "app_pureDebug"})
public final class DisplaySettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.settings.DisplaySettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE_EN = "en";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_THEME = "com.uwetrottmann.seriesguide.theme";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DYNAMIC_COLOR = "com.uwetrottmann.seriesguide.dynamiccolor";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_NUMBERFORMAT = "numberformat";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SHOWS_TIME_OFFSET = "com.battlelancer.seriesguide.timeoffset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_NO_RELEASED_EPISODES = "onlyFutureEpisodes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_HIDE_SPECIALS = "onlySeasonEpisodes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SORT_IGNORE_ARTICLE = "com.battlelancer.seriesguide.sort.ignorearticle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DISPLAY_EXACT_DATE = "com.battlelancer.seriesguide.shows.exactdate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREVENT_SPOILERS = "com.battlelancer.seriesguide.PREVENT_SPOILERS";
    
    private DisplaySettings() {
        super();
    }
    
    /**
     * Returns true for all screens with dpi higher than [DisplayMetrics.DENSITY_HIGH].
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean isVeryHighDensityScreen(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThemeIndex(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean isDynamicColorsEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getNumberFormat(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * @return A positive or negative number of hours to offset show release times by.
     * Defaults to 0.
     */
    @kotlin.jvm.JvmStatic()
    public static final int getShowsTimeOffset(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isNoReleasedEpisodes(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void setNoReleasedEpisodes(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean value) {
    }
    
    /**
     * Whether to exclude special episodes wherever possible (except in the actual seasons and
     * episode lists of a show).
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean isHidingSpecials(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether shows and movies sorted by title should ignore the leading article.
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean isSortOrderIgnoringArticles(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether to show the exact/absolute date (31.10.2010) instead of a relative time string (in 5
     * days).
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean isDisplayExactDate(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Whether the app should hide details potentially spoiling an unwatched episode.
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean preventSpoilers(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}