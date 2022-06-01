package com.battlelancer.seriesguide.backend;

import java.lang.System;

/**
 * Error for tracking Cloud Sign-In failures.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/backend/HexagonAuthError;", "", "action", "", "failure", "(Ljava/lang/String;Ljava/lang/String;)V", "cause", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Integer;)V", "getAction", "()Ljava/lang/String;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isSignInRequiredError", "", "Companion", "app_pureDebug"})
public final class HexagonAuthError extends java.lang.Throwable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String action = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer statusCode = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.backend.HexagonAuthError.Companion Companion = null;
    
    public HexagonAuthError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String failure, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause, @org.jetbrains.annotations.Nullable()
    java.lang.Integer statusCode) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatusCode() {
        return null;
    }
    
    public HexagonAuthError(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String failure) {
        super(null);
    }
    
    public final boolean isSignInRequiredError() {
        return false;
    }
    
    /**
     * Extracts status code from ApiException, FirebaseUiException.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.backend.HexagonAuthError build(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/backend/HexagonAuthError$Companion;", "", "()V", "build", "Lcom/battlelancer/seriesguide/backend/HexagonAuthError;", "action", "", "throwable", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Extracts status code from ApiException, FirebaseUiException.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.backend.HexagonAuthError build(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            return null;
        }
    }
}