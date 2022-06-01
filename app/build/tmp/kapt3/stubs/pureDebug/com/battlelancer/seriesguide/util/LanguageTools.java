package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Helper methods for language strings and codes.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/util/LanguageTools;", "", "()V", "buildLanguageDisplayName", "", "languageCode", "getLanguageStringFor", "context", "Landroid/content/Context;", "languageCodesRes", "", "getMovieLanguageStringFor", "fallback", "getShowLanguageDataFor", "Lcom/battlelancer/seriesguide/util/LanguageTools$LanguageData;", "getShowLanguageStringFor", "LanguageData", "app_pureDebug"})
public final class LanguageTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.LanguageTools INSTANCE = null;
    
    private LanguageTools() {
        super();
    }
    
    /**
     * Returns the string representation of the given two letter ISO 639-1 language code,
     * plus optional ISO-3166-1 region tag, if it is supported by SeriesGuide
     * (see R.array.languageCodesShows).
     *
     * If the given language code is `null` uses 'en' to ensure consistent behavior across
     * devices.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShowLanguageStringFor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
        return null;
    }
    
    /**
     * Returns the string representation of the given two letter ISO 639-1 language code,
     * plus optional ISO-3166-1 region tag, if it is supported by SeriesGuide
     * (see R.array.languageCodesMovies).
     *
     * If the given language code is `null`, uses [DisplaySettings.getMoviesLanguage].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getMovieLanguageStringFor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String fallback) {
        return null;
    }
    
    private final java.lang.String getLanguageStringFor(android.content.Context context, java.lang.String languageCode, @androidx.annotation.ArrayRes()
    int languageCodesRes) {
        return null;
    }
    
    /**
     * Together with the language code, returns the string representation of the given
     * two letter ISO 639-1 language code, plus optional ISO-3166-1 region tag,
     * if it is supported by SeriesGuide (see R.array.languageCodesShows).
     *
     * If the given language code is `null` uses 'en' to ensure consistent behavior across
     * devices.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.battlelancer.seriesguide.util.LanguageTools.LanguageData getShowLanguageDataFor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
        return null;
    }
    
    /**
     * Based on the first two letters gets the language display name. Except for
     * - Spanish (es-ES, es-MX)
     * - French (fr-FR, fr-CA)
     * - Portuguese (pt, pt-PT and pt-BR) and
     * - Chinese (zh, zh-CN, zh-TW, zh-HK),
     * where the region is added to the display name.
     *
     * For other languages region variants for TMDB appear to be superfluous or make no sense
     * (report to TMDB?).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String buildLanguageDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/util/LanguageTools$LanguageData;", "", "languageCode", "", "languageString", "(Ljava/lang/String;Ljava/lang/String;)V", "getLanguageCode", "()Ljava/lang/String;", "getLanguageString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_pureDebug"})
    public static final class LanguageData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String languageCode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String languageString = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.util.LanguageTools.LanguageData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
        java.lang.String languageString) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public LanguageData(@org.jetbrains.annotations.Nullable()
        java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
        java.lang.String languageString) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLanguageCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguageString() {
            return null;
        }
    }
}