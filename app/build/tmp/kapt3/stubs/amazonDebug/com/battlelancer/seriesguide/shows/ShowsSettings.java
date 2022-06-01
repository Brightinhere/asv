package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/shows/ShowsSettings;", "", "()V", "KEY_LANGUAGE_FALLBACK", "", "KEY_LANGUAGE_SEARCH", "KEY_LAST_ACTIVE_SHOWS_TAB", "getLastShowsTabPosition", "", "context", "Landroid/content/Context;", "getShowsLanguageFallback", "getShowsSearchLanguage", "saveLastShowsTabPosition", "", "position", "saveShowsSearchLanguage", "languageCode", "app_amazonDebug"})
public final class ShowsSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.ShowsSettings INSTANCE = null;
    private static final java.lang.String KEY_LAST_ACTIVE_SHOWS_TAB = "com.battlelancer.seriesguide.activitytab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LANGUAGE_FALLBACK = "com.battlelancer.seriesguide.languageFallback";
    private static final java.lang.String KEY_LANGUAGE_SEARCH = "com.battlelancer.seriesguide.languagesearch";
    
    private ShowsSettings() {
        super();
    }
    
    public final void saveLastShowsTabPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int position) {
    }
    
    /**
     * Return the position of the last selected shows tab.
     */
    public final int getLastShowsTabPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final void saveShowsSearchLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
    }
    
    /**
     * Returns a two letter ISO 639-1 language code, plus optional ISO-3166-1 region tag,
     * of the language the user prefers when searching. Defaults to English.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getShowsSearchLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Returns a two letter ISO 639-1 language code, plus optional ISO-3166-1 region tag,
     * of the fallback show language preferred by the user. Defaults to 'en'.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShowsLanguageFallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}