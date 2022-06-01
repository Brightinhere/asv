package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivityModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "connectInProgress", "", "getConnectInProgress", "()Z", "setConnectInProgress", "(Z)V", "connectResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivityModel$ConnectResult;", "getConnectResult", "()Landroidx/lifecycle/MutableLiveData;", "connectTrakt", "Lkotlinx/coroutines/Job;", "authCode", "", "ConnectResult", "app_amazonDebug"})
public final class TraktAuthActivityModel extends androidx.lifecycle.AndroidViewModel {
    private boolean connectInProgress = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.traktapi.TraktAuthActivityModel.ConnectResult> connectResult = null;
    
    public TraktAuthActivityModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final boolean getConnectInProgress() {
        return false;
    }
    
    public final void setConnectInProgress(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.battlelancer.seriesguide.traktapi.TraktAuthActivityModel.ConnectResult> getConnectResult() {
        return null;
    }
    
    /**
     * Expects a valid Trakt OAuth auth code. Retrieves the access token and username
     * for the associated user. If successful, the credentials and user info are stored.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job connectTrakt(@org.jetbrains.annotations.Nullable()
    java.lang.String authCode) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivityModel$ConnectResult;", "", "code", "", "debugMessage", "", "(ILjava/lang/String;)V", "getCode", "()I", "getDebugMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_amazonDebug"})
    public static final class ConnectResult {
        
        /**
         * One of {@link TraktResult}.
         */
        private final int code = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String debugMessage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.traktapi.TraktAuthActivityModel.ConnectResult copy(int code, @org.jetbrains.annotations.Nullable()
        java.lang.String debugMessage) {
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
        
        public ConnectResult(int code, @org.jetbrains.annotations.Nullable()
        java.lang.String debugMessage) {
            super();
        }
        
        /**
         * One of {@link TraktResult}.
         */
        public final int component1() {
            return 0;
        }
        
        /**
         * One of {@link TraktResult}.
         */
        public final int getCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDebugMessage() {
            return null;
        }
    }
}