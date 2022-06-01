package com.battlelancer.seriesguide.appwidget;

import java.lang.System;

/**
 * Shows settings fragment for a specific app widget, hosted inside a [ListWidgetPreferenceActivity]
 * activity.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J6\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u001c\u0010(\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010)\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020\u0010H\u0002J\u0018\u0010/\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/battlelancer/seriesguide/appwidget/ListWidgetPreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "backgroundPref", "Landroidx/preference/ListPreference;", "hideWatchedPreference", "Landroidx/preference/CheckBoxPreference;", "isInfinitePref", "onlyCollectedPref", "onlyPremieresPref", "preferenceChangeListener", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "showsSortPref", "themePref", "typePref", "bindPreferenceSummaryToValue", "", "preference", "createCheckBoxPref", "key", "", "titleRes", "", "defaultValue", "", "createListPref", "title", "entries", "values", "disablePersistence", "group", "Landroidx/preference/PreferenceGroup;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreatePreferences", "rootKey", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "saveAllPreferences", "savePreferences", "editor", "Landroid/content/SharedPreferences$Editor;", "Companion", "app_pureDebug"})
public final class ListWidgetPreferenceFragment extends androidx.preference.PreferenceFragmentCompat {
    private androidx.preference.ListPreference typePref;
    private androidx.preference.ListPreference showsSortPref;
    private androidx.preference.CheckBoxPreference onlyPremieresPref;
    private androidx.preference.CheckBoxPreference onlyCollectedPref;
    private androidx.preference.CheckBoxPreference hideWatchedPreference;
    private androidx.preference.CheckBoxPreference isInfinitePref;
    private androidx.preference.ListPreference themePref;
    private androidx.preference.ListPreference backgroundPref;
    private final androidx.preference.Preference.OnPreferenceChangeListener preferenceChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.appwidget.ListWidgetPreferenceFragment.Companion Companion = null;
    private static final java.lang.String ARG_WIDGET_ID = "appWidgetId";
    
    public ListWidgetPreferenceFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final androidx.preference.CheckBoxPreference createCheckBoxPref(java.lang.String key, @androidx.annotation.StringRes()
    int titleRes, boolean defaultValue) {
        return null;
    }
    
    private final androidx.preference.ListPreference createListPref(java.lang.String key, @androidx.annotation.StringRes()
    int title, @androidx.annotation.ArrayRes()
    int entries, @androidx.annotation.ArrayRes()
    int values, java.lang.String defaultValue) {
        return null;
    }
    
    /**
     * Walks through all preferences of the [group] and sets [Preference.setPersistent] false.
     */
    private final void disablePersistence(androidx.preference.PreferenceGroup group) {
    }
    
    private final void saveAllPreferences() {
    }
    
    private final void savePreferences(androidx.preference.PreferenceGroup group, android.content.SharedPreferences.Editor editor) {
    }
    
    /**
     * Binds a preference's summary to its value. More specifically, when the
     * preference's value is changed, its summary (line of text below the
     * preference title) is updated to reflect the value. The summary is also
     * immediately updated upon calling this method. The exact display format is
     * dependent on the type of preference.
     */
    private final void bindPreferenceSummaryToValue(androidx.preference.ListPreference preference) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/appwidget/ListWidgetPreferenceFragment$Companion;", "", "()V", "ARG_WIDGET_ID", "", "newInstance", "Lcom/battlelancer/seriesguide/appwidget/ListWidgetPreferenceFragment;", "appWidgetId", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.appwidget.ListWidgetPreferenceFragment newInstance(int appWidgetId) {
            return null;
        }
    }
}