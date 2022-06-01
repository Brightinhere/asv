package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTools;", "", "()V", "deleteOldBackups", "", "context", "Landroid/content/Context;", "backup", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup;", "getAllBackupsNewestFirst", "", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTools$BackupFile;", "getBackupDirectory", "Ljava/io/File;", "getBackupTimestamp", "", "file", "(Ljava/io/File;)Ljava/lang/Long;", "getLatestBackupOrNull", "type", "", "isAutoBackupMaybeAvailable", "", "BackupFile", "app_pureDebug"})
public final class AutoBackupTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.dataliberation.AutoBackupTools INSTANCE = null;
    
    private AutoBackupTools() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {com.battlelancer.seriesguide.dataliberation.AutoBackupException.class})
    public final java.io.File getBackupDirectory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) throws com.battlelancer.seriesguide.dataliberation.AutoBackupException {
        return null;
    }
    
    public final void deleteOldBackups(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void deleteOldBackups(com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup backup, android.content.Context context) {
    }
    
    /**
     * Only checks if an auto backup file for shows is available, likely others are then, too.
     */
    public final boolean isAutoBackupMaybeAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.dataliberation.AutoBackupTools.BackupFile getLatestBackupOrNull(@com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.util.List<com.battlelancer.seriesguide.dataliberation.AutoBackupTools.BackupFile> getAllBackupsNewestFirst(com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup backup, android.content.Context context) {
        return null;
    }
    
    private final java.lang.Long getBackupTimestamp(java.io.File file) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTools$BackupFile;", "", "file", "Ljava/io/File;", "timestamp", "", "(Ljava/io/File;J)V", "getFile", "()Ljava/io/File;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_pureDebug"})
    public static final class BackupFile {
        @org.jetbrains.annotations.NotNull()
        private final java.io.File file = null;
        private final long timestamp = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.dataliberation.AutoBackupTools.BackupFile copy(@org.jetbrains.annotations.NotNull()
        java.io.File file, long timestamp) {
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
        
        public BackupFile(@org.jetbrains.annotations.NotNull()
        java.io.File file, long timestamp) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getFile() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getTimestamp() {
            return 0L;
        }
    }
}