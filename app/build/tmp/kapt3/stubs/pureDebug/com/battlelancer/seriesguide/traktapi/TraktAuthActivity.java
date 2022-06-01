package com.battlelancer.seriesguide.traktapi;

import java.lang.System;

/**
 * Starts a Trakt OAuth 2.0 authorization flow using the default browser
 * or an embedded [android.webkit.WebView] as a fallback.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0015H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivity;", "Lcom/battlelancer/seriesguide/traktapi/BaseOAuthActivity;", "()V", "model", "Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivityModel;", "getModel", "()Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivityModel;", "model$delegate", "Lkotlin/Lazy;", "state", "", "fetchTokensAndFinish", "", "authCode", "getAuthErrorMessage", "getAuthorizationUrl", "handleTraktConnectResult", "event", "Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivityModel$ConnectResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "Companion", "app_pureDebug"})
public final class TraktAuthActivity extends com.battlelancer.seriesguide.traktapi.BaseOAuthActivity {
    private java.lang.String state;
    private final kotlin.Lazy model$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.traktapi.TraktAuthActivity.Companion Companion = null;
    private static final java.lang.String KEY_STATE = "state";
    private static final java.lang.String ACTION_FETCHING_TOKENS = "fetching tokens";
    private static final java.lang.String ERROR_DESCRIPTION_STATE_MISMATCH = "invalid_state, State is null or does not match.";
    
    public TraktAuthActivity() {
        super();
    }
    
    private final com.battlelancer.seriesguide.traktapi.TraktAuthActivityModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String getAuthorizationUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getAuthErrorMessage() {
        return null;
    }
    
    @java.lang.Override()
    protected void fetchTokensAndFinish(@org.jetbrains.annotations.Nullable()
    java.lang.String authCode, @org.jetbrains.annotations.Nullable()
    java.lang.String state) {
    }
    
    private final void handleTraktConnectResult(com.battlelancer.seriesguide.traktapi.TraktAuthActivityModel.ConnectResult event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/traktapi/TraktAuthActivity$Companion;", "", "()V", "ACTION_FETCHING_TOKENS", "", "ERROR_DESCRIPTION_STATE_MISMATCH", "KEY_STATE", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}