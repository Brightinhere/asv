package com.battlelancer.seriesguide.extensions;

import java.lang.System;

/**
 * Just hosting a [com.battlelancer.seriesguide.extensions.ExtensionsConfigurationFragment].
 *
 * Is exported so it can be launched by extension.
 *
 * Test with 'adb shell am start -n com.battlelancer.seriesguide/com.battlelancer.seriesguide.extensions.ExtensionsConfigurationActivity'.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0014\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/ExtensionsConfigurationActivity;", "Lcom/battlelancer/seriesguide/ui/BaseActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setupActionBar", "Companion", "app_amazonDebug"})
public final class ExtensionsConfigurationActivity extends com.battlelancer.seriesguide.ui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.extensions.ExtensionsConfigurationActivity.Companion Companion = null;
    public static final int LOADER_ACTIONS_ID = 100;
    
    public ExtensionsConfigurationActivity() {
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
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/ExtensionsConfigurationActivity$Companion;", "", "()V", "LOADER_ACTIONS_ID", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}