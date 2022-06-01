package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

/**
 * A singleton helping to manage the user's trakt credentials.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0014J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktCredentials;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "displayName", "getDisplayName", "hasCredentials", "", "<set-?>", "username", "getUsername", "refreshAccessToken", "trakt", "Lcom/uwetrottmann/trakt5/TraktV2;", "removeAccessToken", "", "removeCredentials", "setAccessToken", "setCredentialsInvalid", "setDisplayname", "displayname", "setUsername", "storeAccessToken", "storeUsername", "Companion", "app_pureDebug"})
public final class TraktCredentials {
    private final android.content.Context context = null;
    private boolean hasCredentials;
    
    /**
     * Get the username.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.TraktCredentials.Companion Companion = null;
    private static final java.lang.String KEY_USERNAME = "com.battlelancer.seriesguide.traktuser";
    private static final java.lang.String KEY_DISPLAYNAME = "com.battlelancer.seriesguide.traktuser.name";
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.battlelancer.seriesguide.traktapi.TraktCredentials instance;
    
    private TraktCredentials(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    /**
     * If there is a username and access token.
     */
    public final boolean hasCredentials() {
        return false;
    }
    
    /**
     * Removes the current trakt access token (but not the username), so [.hasCredentials]
     * will return `false`, and shows a notification asking the user to re-connect.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void setCredentialsInvalid() {
    }
    
    /**
     * Only removes the access token, but keeps the username.
     */
    private final void removeAccessToken() {
    }
    
    /**
     * Removes the username and access token.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void removeCredentials() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    /**
     * Stores the given access token.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void storeAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken) {
    }
    
    /**
     * Stores the given user name and display name.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized boolean storeUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String displayname) {
        return false;
    }
    
    private final boolean setUsername(java.lang.String username) {
        return false;
    }
    
    private final boolean setDisplayname(java.lang.String displayname) {
        return false;
    }
    
    private final boolean setAccessToken(java.lang.String accessToken) {
        return false;
    }
    
    /**
     * Tries to refresh the current access token. Returns `false` on failure.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized boolean refreshAccessToken(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.traktapi.TraktCredentials get(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Checks for existing trakt credentials. If there aren't any valid ones, launches the trakt
     * connect flow.
     *
     * @return **true** if credentials are valid, **false** if invalid and launching trakt
     * connect flow.
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean ensureCredentials(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktCredentials$Companion;", "", "()V", "KEY_DISPLAYNAME", "", "KEY_USERNAME", "instance", "Lcom/battlelancer/seriesguide/traktapi/TraktCredentials;", "ensureCredentials", "", "context", "Landroid/content/Context;", "get", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.traktapi.TraktCredentials get(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Checks for existing trakt credentials. If there aren't any valid ones, launches the trakt
         * connect flow.
         *
         * @return **true** if credentials are valid, **false** if invalid and launching trakt
         * connect flow.
         */
        @kotlin.jvm.JvmStatic()
        public final boolean ensureCredentials(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
}