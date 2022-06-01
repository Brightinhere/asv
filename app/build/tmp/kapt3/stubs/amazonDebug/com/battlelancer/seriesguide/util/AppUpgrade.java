package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * If necessary, runs upgrade code after an update with a higher version code is installed.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/battlelancer/seriesguide/util/AppUpgrade;", "", "context", "Landroid/content/Context;", "lastVersion", "", "currentVersion", "(Landroid/content/Context;II)V", "doUpgrades", "", "upgradeIfNewVersion", "", "app_amazonDebug"})
public final class AppUpgrade {
    private final android.content.Context context = null;
    private final int lastVersion = 0;
    private final int currentVersion = 0;
    
    public AppUpgrade(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int lastVersion, int currentVersion) {
        super();
    }
    
    /**
     * Returns true if the app was updated from a previous version.
     */
    public final boolean upgradeIfNewVersion() {
        return false;
    }
    
    private final void doUpgrades() {
    }
}