package com.battlelancer.seriesguide.jobs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/NetworkJob;", "", "execute", "Lcom/battlelancer/seriesguide/sync/NetworkJobProcessor$JobResult;", "context", "Landroid/content/Context;", "Companion", "app_amazonDebug"})
public abstract interface NetworkJob {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.jobs.NetworkJob.Companion Companion = null;
    public static final int SUCCESS = 0;
    
    /**
     * Issue connecting or reading a response, should retry.
     */
    public static final int ERROR_CONNECTION = -1;
    public static final int ERROR_TRAKT_AUTH = -2;
    
    /**
     * Issue with request, do not retry.
     */
    public static final int ERROR_TRAKT_CLIENT = -3;
    
    /**
     * Issue with connection or server, do retry.
     */
    public static final int ERROR_TRAKT_SERVER = -4;
    
    /**
     * Show, season or episode not found, do not retry, but notify.
     */
    public static final int ERROR_TRAKT_NOT_FOUND = -5;
    
    /**
     * Issue with the request, do not retry.
     */
    public static final int ERROR_HEXAGON_CLIENT = -6;
    
    /**
     * Issue with connection or server, should retry.
     */
    public static final int ERROR_HEXAGON_SERVER = -7;
    public static final int ERROR_HEXAGON_AUTH = -8;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.sync.NetworkJobProcessor.JobResult execute(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/jobs/NetworkJob$Companion;", "", "()V", "ERROR_CONNECTION", "", "ERROR_HEXAGON_AUTH", "ERROR_HEXAGON_CLIENT", "ERROR_HEXAGON_SERVER", "ERROR_TRAKT_AUTH", "ERROR_TRAKT_CLIENT", "ERROR_TRAKT_NOT_FOUND", "ERROR_TRAKT_SERVER", "SUCCESS", "app_amazonDebug"})
    public static final class Companion {
        public static final int SUCCESS = 0;
        
        /**
         * Issue connecting or reading a response, should retry.
         */
        public static final int ERROR_CONNECTION = -1;
        public static final int ERROR_TRAKT_AUTH = -2;
        
        /**
         * Issue with request, do not retry.
         */
        public static final int ERROR_TRAKT_CLIENT = -3;
        
        /**
         * Issue with connection or server, do retry.
         */
        public static final int ERROR_TRAKT_SERVER = -4;
        
        /**
         * Show, season or episode not found, do not retry, but notify.
         */
        public static final int ERROR_TRAKT_NOT_FOUND = -5;
        
        /**
         * Issue with the request, do not retry.
         */
        public static final int ERROR_HEXAGON_CLIENT = -6;
        
        /**
         * Issue with connection or server, should retry.
         */
        public static final int ERROR_HEXAGON_SERVER = -7;
        public static final int ERROR_HEXAGON_AUTH = -8;
        
        private Companion() {
            super();
        }
    }
}