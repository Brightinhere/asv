package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Tools to help build text fragments to be used throughout the user interface.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001=B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fJ4\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0012\u001a\u00020\fJ\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\fJ\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0007J \u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\fJ*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fJ&\u0010#\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fJ%\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010(J*\u0010)\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u0010\u0010.\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0004J\u0018\u00100\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0004J\"\u00102\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u00020\u0004H\u0007J\"\u00104\u001a\u0002052\u0006\u0010\t\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u00107\u001a\u00020\u0004H\u0002J\u0018\u00108\u001a\u0002052\u0006\u0010\t\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u0004J\u0016\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010:\u001a\u00020;J\u0014\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006>"}, d2 = {"Lcom/battlelancer/seriesguide/util/TextTools;", "", "()V", "buildPipeSeparatedString", "", "strings", "", "buildTextAppearanceSpan", "Landroid/text/Spannable;", "context", "Landroid/content/Context;", "textRes", "", "appearanceRes", "buildTitleAndSecondary", "title", "titleAppearance", "secondary", "secondaryAppearance", "buildTitleAndSummary", "titleRes", "summaryRes", "summary", "dotSeparate", "left", "right", "getEpisodeNumber", "season", "episode", "getEpisodeTitle", "getNextEpisodeString", "getRemainingEpisodes", "resources", "Landroid/content/res/Resources;", "remaining", "getShowWithEpisodeNumber", "getWatchedButtonText", "isWatched", "", "plays", "(Landroid/content/Context;ZLjava/lang/Integer;)Ljava/lang/String;", "networkAndTime", "release", "Ljava/util/Date;", "weekDay", "network", "splitPipeSeparatedStrings", "pipeSeparatedStrings", "textNoTranslation", "languageCode", "textNoTranslationMovieLanguage", "fallback", "textWithSource", "Landroid/text/SpannableStringBuilder;", "text", "source", "textWithTmdbSource", "timeInMillisToDateAndTime", "timeInMillis", "", "trimLeadingArticle", "EpisodeFormat", "app_amazonDebug"})
public final class TextTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.TextTools INSTANCE = null;
    
    private TextTools() {
        super();
    }
    
    /**
     * Returns the [episode] number formatted according to the users preference (e.g. '1x1',
     * 'S1:E1', ...). If `episode` is -1 only the [season] number is returned.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getEpisodeNumber(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int season, int episode) {
        return null;
    }
    
    /**
     * Returns the [title] or if it's empty a string like "Episode 2".
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEpisodeTitle(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String title, int episode) {
        return null;
    }
    
    /**
     * Returns a string like "1x01 Title". The number format may change based on user preference.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getNextEpisodeString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int season, int episode, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    /**
     * Returns a string like "Title 1x01". The number format may change based on user preference.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShowWithEpisodeNumber(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int season, int episode) {
        return null;
    }
    
    /**
     * Returns null if [remaining] is 0 or less.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemainingEpisodes(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources, int remaining) {
        return null;
    }
    
    /**
     * Splits the string on the pipe character `"|"` and reassembles it, separating the items
     * with commas. The given object is returned with the new string.
     *
     * @see buildPipeSeparatedString
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String splitPipeSeparatedStrings(@org.jetbrains.annotations.Nullable()
    java.lang.String pipeSeparatedStrings) {
        return null;
    }
    
    /**
     * Combines the strings into a single string, separated by the pipe character `"|"`.
     * Skips null or empty strings.
     *
     * @see splitPipeSeparatedStrings
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String buildPipeSeparatedString(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> strings) {
        return null;
    }
    
    /**
     * Removes a leading article from the given string (including the first whitespace that
     * follows).
     *
     * *Currently only supports English articles (the, a and an).*
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String trimLeadingArticle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    /**
     * Dot separates the two given strings. If one is empty, just returns the other string (no dot).
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String dotSeparate(@org.jetbrains.annotations.Nullable()
    java.lang.String left, @org.jetbrains.annotations.Nullable()
    java.lang.String right) {
        return null;
    }
    
    /**
     * Builds a network + release time string for a show formatted like "Network · Tue 08:00 PM".
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String networkAndTime(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.Date release, int weekDay, @org.jetbrains.annotations.Nullable()
    java.lang.String network) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String timeInMillisToDateAndTime(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long timeInMillis) {
        return null;
    }
    
    /**
     * Appends an empty new line and a new line listing the source of the text as TMDB.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.text.SpannableStringBuilder textWithTmdbSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    private final android.text.SpannableStringBuilder textWithSource(android.content.Context context, java.lang.String text, java.lang.String source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWatchedButtonText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isWatched, @org.jetbrains.annotations.Nullable()
    java.lang.Integer plays) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String textNoTranslation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String textNoTranslationMovieLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String fallback) {
        return null;
    }
    
    /**
     * Useful for check boxes to add a summary without an additional TextView.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spannable buildTitleAndSummary(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String summary) {
        return null;
    }
    
    /**
     * Useful for check boxes to add a summary without an additional TextView.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spannable buildTitleAndSummary(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.StringRes()
    int titleRes, @androidx.annotation.StringRes()
    int summaryRes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spannable buildTitleAndSecondary(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @androidx.annotation.StyleRes()
    int titleAppearance, @org.jetbrains.annotations.Nullable()
    java.lang.String secondary, @androidx.annotation.StyleRes()
    int secondaryAppearance) {
        return null;
    }
    
    /**
     * Spannable with TextAppearance applied to the whole string.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spannable buildTextAppearanceSpan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.StringRes()
    int textRes, @androidx.annotation.StyleRes()
    int appearanceRes) {
        return null;
    }
    
    /**
     * Must match numberData string-array in resources.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/util/TextTools$EpisodeFormat;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "PREFIX_ENGLISH", "PREFIX_ENGLISH_LOWER", "SUFFIX_LONG", "app_amazonDebug"})
    public static enum EpisodeFormat {
        /*public static final*/ DEFAULT /* = new DEFAULT(null) */,
        /*public static final*/ PREFIX_ENGLISH /* = new PREFIX_ENGLISH(null) */,
        /*public static final*/ PREFIX_ENGLISH_LOWER /* = new PREFIX_ENGLISH_LOWER(null) */,
        /*public static final*/ SUFFIX_LONG /* = new SUFFIX_LONG(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        EpisodeFormat(java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
}