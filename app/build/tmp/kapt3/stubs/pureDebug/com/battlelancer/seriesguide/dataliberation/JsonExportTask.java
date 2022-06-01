package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

/**
 * Export the show database to a human-readable JSON file on external storage. By default meta-data
 * like descriptions, ratings, actors, etc. will not be included.
 *
 * @param isFullDump Whether to also export meta-data like descriptions, ratings, actors, etc.
 * Increases file size about 2-4 times.
 * @param isAutoBackupMode Whether to run an auto backup, also shows no result toasts.
 */
@kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 L2\u00020\u0001:\u0005KLMNOB3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bBY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\u0019\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020,H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J!\u0010.\u001a\u00020\n2\u0006\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0010\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\t\u001a\u00020\nJ\u0016\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00105\u001a\u000206H\u0002J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000208032\u0006\u00109\u001a\u000206H\u0002J\u0006\u0010:\u001a\u00020;J\u0010\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020\nH\u0002J!\u0010>\u001a\u00020\'2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010C\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ!\u0010E\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\u0006\u0010F\u001a\u00020GH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010HJ!\u0010I\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\u0006\u0010F\u001a\u00020GH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010HJ!\u0010J\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\u0006\u0010F\u001a\u00020GH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010HR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010%\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006P"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask;", "", "context", "Landroid/content/Context;", "progressListener", "Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$OnTaskProgressListener;", "isFullDump", "", "isAutoBackupMode", "type", "", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$OnTaskProgressListener;ZZLjava/lang/Integer;)V", "sgShow2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Helper;", "sgSeason2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2Helper;", "sgEpisode2Helper", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Helper;", "sgListHelper", "Lcom/battlelancer/seriesguide/lists/database/SgListHelper;", "movieHelper", "Lcom/battlelancer/seriesguide/movies/database/MovieHelper;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$OnTaskProgressListener;ZZLjava/lang/Integer;Lcom/battlelancer/seriesguide/shows/database/SgShow2Helper;Lcom/battlelancer/seriesguide/shows/database/SgSeason2Helper;Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Helper;Lcom/battlelancer/seriesguide/lists/database/SgListHelper;Lcom/battlelancer/seriesguide/movies/database/MovieHelper;)V", "<set-?>", "", "errorCause", "getErrorCause$annotations", "()V", "getErrorCause", "()Ljava/lang/String;", "testBackupFile", "Ljava/io/File;", "getTestBackupFile$annotations", "getTestBackupFile", "()Ljava/io/File;", "setTestBackupFile", "(Ljava/io/File;)V", "Ljava/lang/Integer;", "addListItems", "", "list", "Lcom/battlelancer/seriesguide/dataliberation/model/List;", "doInBackground", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exportData", "(Lkotlinx/coroutines/CoroutineScope;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataBackupFile", "Landroid/net/Uri;", "getEpisodes", "", "Lcom/battlelancer/seriesguide/dataliberation/model/Episode;", "seasonId", "", "getSeasons", "Lcom/battlelancer/seriesguide/dataliberation/model/Season;", "showId", "launch", "Lkotlinx/coroutines/Job;", "onPostExecute", "result", "onProgressUpdate", "total", "completed", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeBackupFileUri", "run", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeJsonStreamLists", "out", "Ljava/io/OutputStream;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeJsonStreamMovies", "writeJsonStreamShows", "BackupType", "Companion", "ListItemTypesExport", "OnTaskProgressListener", "ShowStatusExport", "app_pureDebug"})
public final class JsonExportTask {
    private final com.battlelancer.seriesguide.dataliberation.JsonExportTask.OnTaskProgressListener progressListener = null;
    private final boolean isFullDump = false;
    private final boolean isAutoBackupMode = false;
    private final java.lang.Integer type = null;
    private final com.battlelancer.seriesguide.shows.database.SgShow2Helper sgShow2Helper = null;
    private final com.battlelancer.seriesguide.shows.database.SgSeason2Helper sgSeason2Helper = null;
    private final com.battlelancer.seriesguide.shows.database.SgEpisode2Helper sgEpisode2Helper = null;
    private final com.battlelancer.seriesguide.lists.database.SgListHelper sgListHelper = null;
    private final com.battlelancer.seriesguide.movies.database.MovieHelper movieHelper = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorCause;
    
    /**
     * If set will use this file instead of opening via URI, which seems broken with Robolectric
     * (openFileDescriptor throws FileNotFoundException).
     */
    @org.jetbrains.annotations.Nullable()
    private java.io.File testBackupFile;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.dataliberation.JsonExportTask.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPORT_JSON_FILE_SHOWS = "seriesguide-shows-backup.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPORT_JSON_FILE_LISTS = "seriesguide-lists-backup.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPORT_JSON_FILE_MOVIES = "seriesguide-movies-backup.json";
    public static final int BACKUP_SHOWS = 1;
    public static final int BACKUP_LISTS = 2;
    public static final int BACKUP_MOVIES = 3;
    public static final int SUCCESS = 1;
    private static final int ERROR_FILE_ACCESS = 0;
    private static final int ERROR = -1;
    
    public JsonExportTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.dataliberation.JsonExportTask.OnTaskProgressListener progressListener, boolean isFullDump, boolean isAutoBackupMode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgShow2Helper sgShow2Helper, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgSeason2Helper sgSeason2Helper, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgEpisode2Helper sgEpisode2Helper, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.lists.database.SgListHelper sgListHelper, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.movies.database.MovieHelper movieHelper) {
        super();
    }
    
    public JsonExportTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.dataliberation.JsonExportTask.OnTaskProgressListener progressListener, boolean isFullDump, boolean isAutoBackupMode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type) {
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
    
    /**
     * Wraps [run] so it can be called from Java code.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job launch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object run(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    private final java.lang.Object doInBackground(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    private final java.lang.Object onProgressUpdate(int total, int completed, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onPostExecute(int result) {
    }
    
    private final java.lang.Object exportData(kotlinx.coroutines.CoroutineScope coroutineScope, @com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getDataBackupFile(@com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type) {
        return null;
    }
    
    public final void removeBackupFileUri(@com.battlelancer.seriesguide.dataliberation.JsonExportTask.BackupType()
    int type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final java.lang.Object writeJsonStreamShows(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    java.io.OutputStream out, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Returns possibly empty list of seasons with episodes.
     */
    private final java.util.List<com.battlelancer.seriesguide.dataliberation.model.Season> getSeasons(long showId) {
        return null;
    }
    
    /**
     * Returns possibly empty list of episodes for season.
     */
    private final java.util.List<com.battlelancer.seriesguide.dataliberation.model.Episode> getEpisodes(long seasonId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final java.lang.Object writeJsonStreamLists(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    java.io.OutputStream out, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void addListItems(com.battlelancer.seriesguide.dataliberation.model.List list) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final java.lang.Object writeJsonStreamMovies(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    java.io.OutputStream out, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$OnTaskProgressListener;", "", "onProgressUpdate", "", "total", "", "completed", "app_pureDebug"})
    public static abstract interface OnTaskProgressListener {
        
        public abstract void onProgressUpdate(int total, int completed);
    }
    
    @androidx.annotation.IntDef(value = {1, 2, 3})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$BackupType;", "", "app_pureDebug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface BackupType {
    }
    
    /**
     * Show status used when exporting data.
     * Compare with [com.battlelancer.seriesguide.ui.shows.ShowTools.Status].
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$ShowStatusExport;", "", "()V", "CANCELED", "", "CONTINUING", "ENDED", "IN_PRODUCTION", "PILOT", "UNKNOWN", "UPCOMING", "app_pureDebug"})
    public static final class ShowStatusExport {
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.dataliberation.JsonExportTask.ShowStatusExport INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IN_PRODUCTION = "in_production";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PILOT = "pilot";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CANCELED = "canceled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UPCOMING = "upcoming";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONTINUING = "continuing";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENDED = "ended";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNKNOWN = "unknown";
        
        private ShowStatusExport() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$ListItemTypesExport;", "", "()V", "EPISODE", "", "SEASON", "SHOW", "TMDB_SHOW", "app_pureDebug"})
    public static final class ListItemTypesExport {
        @org.jetbrains.annotations.NotNull()
        public static final com.battlelancer.seriesguide.dataliberation.JsonExportTask.ListItemTypesExport INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW = "show";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TMDB_SHOW = "tmdb-show";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SEASON = "season";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EPISODE = "episode";
        
        private ListItemTypesExport() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/JsonExportTask$Companion;", "", "()V", "BACKUP_LISTS", "", "BACKUP_MOVIES", "BACKUP_SHOWS", "ERROR", "ERROR_FILE_ACCESS", "EXPORT_JSON_FILE_LISTS", "", "EXPORT_JSON_FILE_MOVIES", "EXPORT_JSON_FILE_SHOWS", "SUCCESS", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}