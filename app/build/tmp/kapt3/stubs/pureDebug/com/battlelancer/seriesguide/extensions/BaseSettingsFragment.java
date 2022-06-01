package com.battlelancer.seriesguide.extensions;

import java.lang.System;

/**
 * A [android.preference.PreferenceFragment] which has a helper method to easily display the
 * current settings value of a [android.preference.ListPreference].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/BaseSettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "Companion", "app_pureDebug"})
public abstract class BaseSettingsFragment extends androidx.preference.PreferenceFragmentCompat {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.extensions.BaseSettingsFragment.Companion Companion = null;
    private static final androidx.preference.Preference.OnPreferenceChangeListener sSetSummaryListener = null;
    
    public BaseSettingsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/BaseSettingsFragment$Companion;", "", "()V", "sSetSummaryListener", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "bindPreferenceSummaryToValue", "", "prefs", "Landroid/content/SharedPreferences;", "preference", "Landroidx/preference/Preference;", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Binds a preference's summary to its value. More specifically, when the
         * preference's value is changed, its summary (line of text below the
         * preference title) is updated to reflect the value. The summary is also
         * immediately updated upon calling this method. The exact display format is
         * dependent on the type of preference.
         */
        public final void bindPreferenceSummaryToValue(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences prefs, @org.jetbrains.annotations.NotNull()
        androidx.preference.Preference preference) {
        }
    }
}