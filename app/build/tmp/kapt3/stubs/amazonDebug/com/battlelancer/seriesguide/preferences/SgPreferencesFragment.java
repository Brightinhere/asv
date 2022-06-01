package com.battlelancer.seriesguide.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0005H\u0002J\u0012\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u0005H\u0002J\b\u0010&\u001a\u00020\u0005H\u0002J\b\u0010\'\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u0005H\u0002J\b\u0010+\u001a\u00020\u0005H\u0002J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0017H\u0002J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0017H\u0002J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0017H\u0002\u00a8\u00064"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/SgPreferencesFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onEvent", "event", "Lcom/battlelancer/seriesguide/preferences/PreferencesActivityImpl$UpdateSummariesEvent;", "Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment$LanguageChangedEvent;", "onPreferenceTreeClick", "", "preference", "Landroidx/preference/Preference;", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "onStart", "onStop", "resetAndRunNotificationsService", "context", "Landroid/content/Context;", "restartApp", "setListPreferenceSummary", "listPref", "Landroidx/preference/ListPreference;", "setupBasicSettings", "setupNotificationSettings", "setupRootSettings", "updateFallbackLanguageSummary", "pref", "updateNotificationSettings", "updateRootSettings", "updateSelectionSummary", "selectionPref", "updateStreamSearchServiceSummary", "updateThresholdSummary", "thresholdPref", "updateTimeOffsetSummary", "offsetListPref", "Companion", "app_amazonDebug"})
public final class SgPreferencesFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.preferences.SgPreferencesFragment.Companion Companion = null;
    private static final java.lang.String KEY_CLEAR_CACHE = "clearCache";
    private static final java.lang.String KEY_BATTERY_SETTINGS = "com.battlelancer.seriesguide.notifications.battery";
    private static final java.lang.String LINK_BASE_KEY = "com.battlelancer.seriesguide.settings.";
    private static final java.lang.String LINK_KEY_AUTOBACKUP = "com.battlelancer.seriesguide.settings.autobackup";
    private static final java.lang.String LINK_KEY_DATALIBERATION = "com.battlelancer.seriesguide.settings.dataliberation";
    private static final java.lang.String KEY_SCREEN_BASIC = "screen_basic";
    private static final java.lang.String KEY_SCREEN_NOTIFICATIONS = "screen_notifications";
    private static final int REQUEST_CODE_RINGTONE = 0;
    private static final java.lang.String TAG_LANGUAGE_FALLBACK = "PREF_LANGUAGE_FALLBACK";
    private static final androidx.preference.Preference.OnPreferenceChangeListener sNoOpChangeListener = null;
    
    public SgPreferencesFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    private final void setupRootSettings() {
    }
    
    /**
     * Restart to apply new theme, go back to this settings screen.
     * This will lose the existing task stack, but that's fine.
     */
    private final void restartApp() {
    }
    
    private final void updateRootSettings() {
    }
    
    private final void setupNotificationSettings() {
    }
    
    private final void updateNotificationSettings() {
    }
    
    private final void setupBasicSettings() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public boolean onPreferenceTreeClick(@org.jetbrains.annotations.NotNull()
    androidx.preference.Preference preference) {
        return false;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.battlelancer.seriesguide.preferences.PreferencesActivityImpl.UpdateSummariesEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.ui.dialogs.L10nDialogFragment.LanguageChangedEvent event) {
    }
    
    private final void setListPreferenceSummary(androidx.preference.ListPreference listPref) {
    }
    
    private final void updateThresholdSummary(androidx.preference.Preference thresholdPref) {
    }
    
    private final void updateSelectionSummary(androidx.preference.Preference selectionPref) {
    }
    
    private final void updateStreamSearchServiceSummary(androidx.preference.Preference pref) {
    }
    
    private final void updateTimeOffsetSummary(androidx.preference.Preference offsetListPref) {
    }
    
    private final void updateFallbackLanguageSummary(androidx.preference.Preference pref) {
    }
    
    /**
     * Resets and runs the notification service to take care of potential time shifts when e.g.
     * changing the time offset.
     */
    private final void resetAndRunNotificationsService(android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/SgPreferencesFragment$Companion;", "", "()V", "KEY_BATTERY_SETTINGS", "", "KEY_CLEAR_CACHE", "KEY_SCREEN_BASIC", "KEY_SCREEN_NOTIFICATIONS", "LINK_BASE_KEY", "LINK_KEY_AUTOBACKUP", "LINK_KEY_DATALIBERATION", "REQUEST_CODE_RINGTONE", "", "TAG_LANGUAGE_FALLBACK", "sNoOpChangeListener", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}