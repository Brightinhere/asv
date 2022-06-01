package com.battlelancer.seriesguide.preferences;

import java.lang.System;

/**
 * Allows tweaking of various SeriesGuide settings. Does NOT inherit
 * from [com.battlelancer.seriesguide.ui.BaseActivity] to avoid
 * handling actions which might be confusing while adjusting settings.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0014J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/PreferencesActivityImpl;", "Lcom/battlelancer/seriesguide/ui/BaseThemeActivity;", "()V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setupActionBar", "switchToSettings", "settingsId", "", "Companion", "UpdateSummariesEvent", "app_pureDebug"})
public class PreferencesActivityImpl extends com.battlelancer.seriesguide.ui.BaseThemeActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.preferences.PreferencesActivityImpl.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SETTINGS_SCREEN = "settingsScreen";
    
    public PreferencesActivityImpl() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void switchToSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String settingsId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/PreferencesActivityImpl$UpdateSummariesEvent;", "", "()V", "app_pureDebug"})
    public static final class UpdateSummariesEvent {
        
        public UpdateSummariesEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/PreferencesActivityImpl$Companion;", "", "()V", "EXTRA_SETTINGS_SCREEN", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}