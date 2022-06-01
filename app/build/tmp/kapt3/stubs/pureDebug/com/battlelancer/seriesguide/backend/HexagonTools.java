package com.battlelancer.seriesguide.backend;

import java.lang.System;

/**
 * Handles credentials and services for interacting with Hexagon.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u0004\u0018\u00010*J\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0017H\u0002J\n\u0010-\u001a\u0004\u0018\u00010.H\u0002J+\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u000202002\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000104\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u00020,J\u000e\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020:J\u0012\u0010;\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u00010:H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d8F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0005\u001a\u0004\u0018\u00010!8F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0005\u001a\u0004\u0018\u00010%8F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006="}, d2 = {"Lcom/battlelancer/seriesguide/backend/HexagonTools;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "Lcom/uwetrottmann/seriesguide/backend/episodes/Episodes;", "episodesService", "getEpisodesService", "()Lcom/uwetrottmann/seriesguide/backend/episodes/Episodes;", "firebaseSignInProviders", "", "Lcom/firebase/ui/auth/AuthUI$IdpConfig;", "getFirebaseSignInProviders", "()Ljava/util/List;", "firebaseSignInProviders$delegate", "Lkotlin/Lazy;", "httpRequestInitializer", "Lcom/battlelancer/seriesguide/backend/FirebaseHttpRequestInitializer;", "getHttpRequestInitializer", "()Lcom/battlelancer/seriesguide/backend/FirebaseHttpRequestInitializer;", "httpRequestInitializer$delegate", "isGoogleSignInAvailable", "", "()Z", "isGoogleSignInAvailable$delegate", "isTimeForSignInStateCheck", "lastSignInCheck", "", "Lcom/uwetrottmann/seriesguide/backend/lists/Lists;", "listsService", "getListsService", "()Lcom/uwetrottmann/seriesguide/backend/lists/Lists;", "Lcom/uwetrottmann/seriesguide/backend/movies/Movies;", "moviesService", "getMoviesService", "()Lcom/uwetrottmann/seriesguide/backend/movies/Movies;", "Lcom/uwetrottmann/seriesguide/backend/shows/Shows;", "showsService", "getShowsService", "()Lcom/uwetrottmann/seriesguide/backend/shows/Shows;", "buildAccountService", "Lcom/uwetrottmann/seriesguide/backend/account/Account;", "checkSignInState", "", "getHttpRequestInitializerIfSignedIn", "Lcom/google/api/client/http/HttpRequestInitializer;", "getShow", "Lcom/github/michaelbull/result/Result;", "Lcom/uwetrottmann/seriesguide/backend/shows/model/SgCloudShow;", "Lcom/battlelancer/seriesguide/backend/HexagonError;", "showTmdbId", "", "showTvdbId", "(ILjava/lang/Integer;)Lcom/github/michaelbull/result/Result;", "removeAccountAndSetDisabled", "setAccountAndEnabled", "firebaseUser", "Lcom/google/firebase/auth/FirebaseUser;", "storeAccount", "Companion", "app_pureDebug"})
@javax.inject.Singleton()
public final class HexagonTools {
    private final android.content.Context context = null;
    
    /**
     * Only checking once, assuming that if Play Services are missing or invalid this won't change.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy isGoogleSignInAvailable$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy firebaseSignInProviders$delegate = null;
    private final kotlin.Lazy httpRequestInitializer$delegate = null;
    private long lastSignInCheck = 0L;
    
    /**
     * Returns the instance for this hexagon service or null if not signed in.
     *
     * Warning: checks sign-in state, make sure to guard with [HexagonSettings.isEnabled].
     */
    @org.jetbrains.annotations.Nullable()
    private com.uwetrottmann.seriesguide.backend.shows.Shows showsService;
    
    /**
     * Returns the instance for this hexagon service or null if not signed in.
     *
     * Warning: checks sign-in state, make sure to guard with [HexagonSettings.isEnabled].
     */
    @org.jetbrains.annotations.Nullable()
    private com.uwetrottmann.seriesguide.backend.episodes.Episodes episodesService;
    
    /**
     * Returns the instance for this hexagon service or null if not signed in.
     *
     * Warning: checks sign-in state, make sure to guard with [HexagonSettings.isEnabled].
     */
    @org.jetbrains.annotations.Nullable()
    private com.uwetrottmann.seriesguide.backend.movies.Movies moviesService;
    
    /**
     * Returns the instance for this hexagon service or null if not signed in.
     */
    @org.jetbrains.annotations.Nullable()
    private com.uwetrottmann.seriesguide.backend.lists.Lists listsService;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.backend.HexagonTools.Companion Companion = null;
    private static final java.lang.String ACTION_SILENT_SIGN_IN = "silent sign-in";
    private static final com.google.api.client.json.JsonFactory JSON_FACTORY = null;
    private static final com.google.api.client.http.HttpTransport HTTP_TRANSPORT = null;
    private static final long SIGN_IN_CHECK_INTERVAL_MS = 300000L;
    
    @javax.inject.Inject()
    public HexagonTools(@org.jetbrains.annotations.NotNull()
    @com.battlelancer.seriesguide.modules.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    /**
     * Only checking once, assuming that if Play Services are missing or invalid this won't change.
     */
    public final boolean isGoogleSignInAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.firebase.ui.auth.AuthUI.IdpConfig> getFirebaseSignInProviders() {
        return null;
    }
    
    private final com.battlelancer.seriesguide.backend.FirebaseHttpRequestInitializer getHttpRequestInitializer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    public final synchronized com.uwetrottmann.seriesguide.backend.shows.Shows getShowsService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    public final synchronized com.uwetrottmann.seriesguide.backend.episodes.Episodes getEpisodesService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    public final synchronized com.uwetrottmann.seriesguide.backend.movies.Movies getMoviesService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    public final synchronized com.uwetrottmann.seriesguide.backend.lists.Lists getListsService() {
        return null;
    }
    
    /**
     * Creates and returns a new instance for this hexagon service or null if not signed in.
     *
     * Warning: checks sign-in state, make sure to guard with [HexagonSettings.isEnabled].
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    public final synchronized com.uwetrottmann.seriesguide.backend.account.Account buildAccountService() {
        return null;
    }
    
    /**
     * Enables Hexagon and saves account data. If there was no account or the email address
     * has changed re-sets sync state.
     *
     * @return `false` if sync state could not be reset or enabled state was not saved.
     */
    public final boolean setAccountAndEnabled(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseUser firebaseUser) {
        return false;
    }
    
    /**
     * Disables Hexagon and removes any account data.
     */
    public final void removeAccountAndSetDisabled() {
    }
    
    /**
     * Get the Firebase user credentials to talk with Hexagon.
     *
     * Make sure to check [FirebaseHttpRequestInitializer.firebaseUser] is not null (the
     * account might have gotten signed out).
     *
     * @param checkSignInState If enabled, tries to silently sign in with Google. If it fails, sets
     * the [HexagonSettings.KEY_SHOULD_VALIDATE_ACCOUNT] flag. If successful, clears the flag.
     */
    @kotlin.jvm.Synchronized()
    private final synchronized com.battlelancer.seriesguide.backend.FirebaseHttpRequestInitializer getHttpRequestInitializer(boolean checkSignInState) {
        return null;
    }
    
    private final com.google.api.client.http.HttpRequestInitializer getHttpRequestInitializerIfSignedIn() {
        return null;
    }
    
    private final void checkSignInState() {
    }
    
    private final boolean isTimeForSignInStateCheck() {
        return false;
    }
    
    /**
     * Sets the account used for calls to Hexagon and saves the email address to display it in UI.
     */
    private final void storeAccount(com.google.firebase.auth.FirebaseUser firebaseUser) {
    }
    
    /**
     * Gets show by TMDB ID, or if not found and TVDB ID given, gets show by that.
     * Returns null value if not found.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.github.michaelbull.result.Result<com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow, com.battlelancer.seriesguide.backend.HexagonError> getShow(int showTmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer showTvdbId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/backend/HexagonTools$Companion;", "", "()V", "ACTION_SILENT_SIGN_IN", "", "HTTP_TRANSPORT", "Lcom/google/api/client/http/HttpTransport;", "JSON_FACTORY", "Lcom/google/api/client/json/JsonFactory;", "SIGN_IN_CHECK_INTERVAL_MS", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}