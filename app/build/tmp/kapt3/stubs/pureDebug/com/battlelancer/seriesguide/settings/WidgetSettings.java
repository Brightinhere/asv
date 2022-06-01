package com.battlelancer.seriesguide.settings;

import java.lang.System;

/**
 * Access some widget related settings values.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002$%B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u001e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010#\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/battlelancer/seriesguide/settings/WidgetSettings;", "", "()V", "DEFAULT_WIDGET_BACKGROUND_OPACITY", "", "DEFAULT_WIDGET_BACKGROUND_OPACITY_INT", "", "KEY_PREFIX_WIDGET_BACKGROUND_OPACITY", "KEY_PREFIX_WIDGET_HIDE_WATCHED", "KEY_PREFIX_WIDGET_IS_HIDE_WATCH_BUTTON", "KEY_PREFIX_WIDGET_IS_INFINITE", "KEY_PREFIX_WIDGET_IS_LARGE_FONT", "KEY_PREFIX_WIDGET_LISTTYPE", "KEY_PREFIX_WIDGET_ONLY_COLLECTED", "KEY_PREFIX_WIDGET_ONLY_FAVORITES", "KEY_PREFIX_WIDGET_ONLY_PREMIERES", "KEY_PREFIX_WIDGET_SHOWS_SORT_ORDER", "KEY_PREFIX_WIDGET_THEME", "SETTINGS_FILE", "getTheme", "Lcom/battlelancer/seriesguide/settings/WidgetSettings$WidgetTheme;", "context", "Landroid/content/Context;", "appWidgetId", "getWidgetBackgroundColor", "lightBackground", "", "getWidgetListType", "getWidgetShowsSortOrderId", "isHideWatchButton", "isHidingWatchedEpisodes", "isInfinite", "isLargeFont", "isOnlyCollectedEpisodes", "isOnlyFavoriteShows", "isOnlyPremieres", "Type", "WidgetTheme", "app_pureDebug"})
public final class WidgetSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.settings.WidgetSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SETTINGS_FILE = "ListWidgetPreferences";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_BACKGROUND_OPACITY = "background_color_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_THEME = "theme_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_LISTTYPE = "type_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_HIDE_WATCHED = "unwatched_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_ONLY_COLLECTED = "only_collected_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_ONLY_FAVORITES = "only_favorites_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_ONLY_PREMIERES = "only_premieres_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_IS_INFINITE = "is_infinite_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_IS_LARGE_FONT = "is_largefont_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_IS_HIDE_WATCH_BUTTON = "is_hide_watch_button_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PREFIX_WIDGET_SHOWS_SORT_ORDER = "shows_order_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_WIDGET_BACKGROUND_OPACITY = "100";
    private static final int DEFAULT_WIDGET_BACKGROUND_OPACITY_INT = 100;
    
    private WidgetSettings() {
        super();
    }
    
    /**
     * Returns the type of episodes that the widget should display.
     *
     * @return One of [com.battlelancer.seriesguide.settings.WidgetSettings.Type].
     */
    public final int getWidgetListType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return 0;
    }
    
    /**
     * Returns the sort order of shows. Should be used when the widget is set to the shows type.
     *
     * @return A [ShowsDistillationSettings.ShowsSortOrder]
     * id.
     */
    public final int getWidgetShowsSortOrderId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return 0;
    }
    
    /**
     * Returns if this widget should not show watched episodes.
     */
    public final boolean isHidingWatchedEpisodes(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return false;
    }
    
    /**
     * Returns if this widget should only show collected episodes.
     */
    public final boolean isOnlyCollectedEpisodes(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return false;
    }
    
    /**
     * Returns if this widget should only show episodes of favorited shows.
     */
    public final boolean isOnlyFavoriteShows(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return false;
    }
    
    /**
     * Returns if this widget should only display premieres (first episodes).
     */
    public final boolean isOnlyPremieres(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return false;
    }
    
    /**
     * Returns if this widget should display an infinite number of days.
     */
    public final boolean isInfinite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return false;
    }
    
    /**
     * Returns if the layouts using larger fonts should be used.
     */
    public final boolean isLargeFont(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return false;
    }
    
    /**
     * Returns if the watch button should be hidden.
     */
    public final boolean isHideWatchButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.settings.WidgetSettings.WidgetTheme getTheme(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId) {
        return null;
    }
    
    /**
     * Calculates the background color for this widget based on user preference.
     *
     * @param lightBackground If true, will return white with alpha. Otherwise black with alpha. See
     * [getTheme].
     */
    public final int getWidgetBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId, boolean lightBackground) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/settings/WidgetSettings$Type;", "", "Companion", "app_pureDebug"})
    public static abstract interface Type {
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.settings.WidgetSettings.Type.Companion Companion = null;
        public static final int UPCOMING = 0;
        public static final int RECENT = 1;
        public static final int SHOWS = 2;
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/settings/WidgetSettings$Type$Companion;", "", "()V", "RECENT", "", "SHOWS", "UPCOMING", "app_pureDebug"})
        public static final class Companion {
            public static final int UPCOMING = 0;
            public static final int RECENT = 1;
            public static final int SHOWS = 2;
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/settings/WidgetSettings$WidgetTheme;", "", "(Ljava/lang/String;I)V", "DARK", "LIGHT", "SYSTEM", "app_pureDebug"})
    public static enum WidgetTheme {
        /*public static final*/ DARK /* = new DARK() */,
        /*public static final*/ LIGHT /* = new LIGHT() */,
        /*public static final*/ SYSTEM /* = new SYSTEM() */;
        
        WidgetTheme() {
        }
    }
}