package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

/**
 * Imports shows, lists or movies from a human-readable JSON file replacing existing data.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0002J&\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0002J\u0010\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<H\u0002J\u0012\u0010=\u001a\u0004\u0018\u00010>2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010?\u001a\u0002092\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010@\u001a\u00020)2\u0006\u00108\u001a\u0002092\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010C\u001a\u00020)2\u0006\u0010-\u001a\u00020.2\u0006\u00104\u001a\u000205H\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u000209H\u0002J\u0011\u0010F\u001a\u000209H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010 R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006I"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonImportTask;", "", "context", "Landroid/content/Context;", "importShows", "", "importLists", "importMovies", "(Landroid/content/Context;ZZZ)V", "(Landroid/content/Context;)V", "database", "Lcom/battlelancer/seriesguide/provider/SgRoomDatabase;", "sgShow2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Helper;", "sgSeason2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2Helper;", "sgEpisode2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Helper;", "(Landroid/content/Context;ZZZLcom/battlelancer/seriesguide/provider/SgRoomDatabase;Lcom/battlelancer/seriesguide/shows/database/SgShow2Helper;Lcom/battlelancer/seriesguide/shows/database/SgSeason2Helper;Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Helper;)V", "<set-?>", "", "errorCause", "getErrorCause$annotations", "()V", "getErrorCause", "()Ljava/lang/String;", "isImportLists", "isImportMovies", "isImportShows", "isImportingAutoBackup", "languageCodes", "", "[Ljava/lang/String;", "testBackupFile", "Ljava/io/File;", "getTestBackupFile$annotations", "getTestBackupFile", "()Ljava/io/File;", "setTestBackupFile", "(Ljava/io/File;)V", "addListToDatabase", "", "list", "Lcom/battlelancer/seriesguide/dataliberation/model/List;", "addShowToDatabase", "show", "Lcom/battlelancer/seriesguide/dataliberation/model/Show;", "buildEpisodeBatch", "Ljava/util/ArrayList;", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "season", "Lcom/battlelancer/seriesguide/dataliberation/model/Season;", "showId", "", "seasonId", "clearExistingData", "type", "", "doInBackground", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getDataBackupFile", "Landroid/net/Uri;", "importData", "importFromJson", "inputStream", "Ljava/io/FileInputStream;", "insertSeasonsAndEpisodes", "onPostExecute", "result", "run", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_amazonDebug"})
public final class JsonImportTask {
    private final com.battlelancer.seriesguide.provider.SgRoomDatabase database = null;
    private final com.battlelancer.seriesguide.shows.database.SgShow2Helper sgShow2Helper = null;
    private final com.battlelancer.seriesguide.shows.database.SgSeason2Helper sgSeason2Helper = null;
    private final com.battlelancer.seriesguide.shows.database.SgEpisode2Helper sgEpisode2Helper = null;
    private final android.content.Context context = null;
    private final java.lang.String[] languageCodes = null;
    private boolean isImportingAutoBackup;
    private final boolean isImportShows = false;
    private final boolean isImportLists = false;
    private final boolean isImportMovies = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorCause;
    
    /**
     * If set will use this file instead of opening via URI, which seems broken with Robolectric
     * (openFileDescriptor throws FileNotFoundException).
     */
    @org.jetbrains.annotations.Nullable()
    private java.io.File testBackupFile;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.dataliberation.JsonImportTask.Companion Companion = null;
    public static final int SUCCESS = 1;
    private static final int ERROR_STORAGE_ACCESS = 0;
    private static final int ERROR = -1;
    private static final int ERROR_LARGE_DB_OP = -2;
    private static final int ERROR_FILE_ACCESS = -3;
    
    public JsonImportTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean importShows, boolean importLists, boolean importMovies, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.provider.SgRoomDatabase database, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgShow2Helper sgShow2Helper, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgSeason2Helper sgSeason2Helper, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgEpisode2Helper sgEpisode2Helper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorCause() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getErrorCause$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getTestBackupFile() {
        return null;
    }
    
    /**
     * If set will use this file instead of opening via URI, which seems broken with Robolectric
     * (openFileDescriptor throws FileNotFoundException).
     */
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getTestBackupFile$annotations() {
    }
    
    public final void setTestBackupFile(@org.jetbrains.annotations.Nullable()
    java.io.File p0) {
    }
    
    public JsonImportTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean importShows, boolean importLists, boolean importMovies) {
        super();
    }
    
    public JsonImportTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object run(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    private final int doInBackground(kotlinx.coroutines.CoroutineScope coroutineScope) {
        return 0;
    }
    
    private final void onPostExecute(int result) {
    }
    
    private final int importData(@com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type) {
        return 0;
    }
    
    private final android.net.Uri getDataBackupFile(@com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type) {
        return null;
    }
    
    private final boolean clearExistingData(@com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type) {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.google.gson.JsonParseException.class, java.io.IOException.class, java.lang.IllegalArgumentException.class})
    private final void importFromJson(@com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type, java.io.FileInputStream inputStream) throws com.google.gson.JsonParseException, java.io.IOException, java.lang.IllegalArgumentException {
    }
    
    private final void addShowToDatabase(com.battlelancer.seriesguide.dataliberation.model.Show show) {
    }
    
    private final void insertSeasonsAndEpisodes(com.battlelancer.seriesguide.dataliberation.model.Show show, long showId) {
    }
    
    private final java.util.ArrayList<com.battlelancer.seriesguide.shows.database.SgEpisode2> buildEpisodeBatch(com.battlelancer.seriesguide.dataliberation.model.Season season, long showId, long seasonId) {
        return null;
    }
    
    private final void addListToDatabase(com.battlelancer.seriesguide.dataliberation.model.List list) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonImportTask$Companion;", "", "()V", "ERROR", "", "ERROR_FILE_ACCESS", "ERROR_LARGE_DB_OP", "ERROR_STORAGE_ACCESS", "SUCCESS", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}