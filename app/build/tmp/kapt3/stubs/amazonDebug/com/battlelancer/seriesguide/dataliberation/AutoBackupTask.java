package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

/**
 * Backs up shows, lists and movies to timestamped files
 * in a [Context.getExternalFilesDir] subdirectory.
 * This directory is included in Android's full auto backup (app data backup).
 *
 * If the last backup attempt failed an error is recorded that can be shown in UI.
 *
 * If the user has specified auto backup files, copies the latest backups to them.
 * If the user specified files do not exist, their URI is purged from prefs.
 */
@kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0002J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\f\u0010\u0017\u001a\u00020\b*\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask;", "", "jsonExportTask", "Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask;", "context", "Landroid/content/Context;", "(Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask;Landroid/content/Context;)V", "backup", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup;", "backupFile", "Ljava/io/File;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyBackupToUserFile", "sourceFile", "getBackupFile", "timestamp", "", "backupDirectory", "run", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeFinally", "Ljava/io/Closeable;", "Backup", "app_amazonDebug"})
public final class AutoBackupTask {
    private final com.battlelancer.seriesguide.dataliberation.JsonExportTask jsonExportTask = null;
    private final android.content.Context context = null;
    
    public AutoBackupTask(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.dataliberation.JsonExportTask jsonExportTask, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final java.io.File getBackupFile(com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup backup, java.lang.String timestamp, java.io.File backupDirectory) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.battlelancer.seriesguide.dataliberation.AutoBackupException.class})
    public final java.lang.Object run(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.battlelancer.seriesguide.dataliberation.AutoBackupException.class})
    private final java.lang.Object backup(kotlinx.coroutines.CoroutineScope coroutineScope, com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup backup, java.io.File backupFile, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.battlelancer.seriesguide.dataliberation.AutoBackupException.class})
    private final void copyBackupToUserFile(com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup backup, java.io.File sourceFile) throws com.battlelancer.seriesguide.dataliberation.AutoBackupException {
    }
    
    private final void closeFinally(java.io.Closeable $this$closeFinally) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup;", "", "name", "", "type", "", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getType", "()I", "Lists", "Movies", "Shows", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup$Shows;", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup$Lists;", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup$Movies;", "app_amazonDebug"})
    public static abstract class Backup {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final int type = 0;
        
        private Backup(java.lang.String name, @com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
        int type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getType() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup$Shows;", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup;", "()V", "app_amazonDebug"})
        public static final class Shows extends com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup.Shows INSTANCE = null;
            
            private Shows() {
                super(null, 0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup$Lists;", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup;", "()V", "app_amazonDebug"})
        public static final class Lists extends com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup.Lists INSTANCE = null;
            
            private Lists() {
                super(null, 0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup$Movies;", "Lcom/battlelancer/seriesguide/dataliberation/AutoBackupTask$Backup;", "()V", "app_amazonDebug"})
        public static final class Movies extends com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.dataliberation.AutoBackupTask.Backup.Movies INSTANCE = null;
            
            private Movies() {
                super(null, 0);
            }
        }
    }
}