package com.battlelancer.seriesguide;

import java.lang.System;

/**
 * On API 23+ (M+) uses full backup. On older versions key-value based backup, which requires
 * a com.google.android.backup.api_key meta-data tag in AndroidManifest.xml.
 *
 * A [BackupAgent] that resets Hexagon and first run settings in [BackupAgent.onRestoreFinished].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/SgBackupAgent;", "Landroid/app/backup/BackupAgentHelper;", "()V", "keyValueBackupKey", "", "onCreate", "", "onRestoreFinished", "app_amazonDebug"})
public final class SgBackupAgent extends android.app.backup.BackupAgentHelper {
    private final java.lang.String keyValueBackupKey = "prefs";
    
    public SgBackupAgent() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onRestoreFinished() {
    }
}