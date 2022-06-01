package com.battlelancer.seriesguide.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/battlelancer/seriesguide/util/Errors;", "", "()V", "Companion", "app_pureDebug"})
public final class Errors {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.Errors.Companion Companion = null;
    
    public Errors() {
        super();
    }
    
    /**
     * Logs the exception and if it should be, reports it. Adds action as key to report.
     */
    @kotlin.jvm.JvmStatic()
    public static final void logAndReportNoBend(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    /**
     * Logs the exception and if it should be, reports it. Bends the stack trace of the
     * bottom-most exception to the call site of this method. Adds action as key to report.
     * If [throwable] is a [CancellationException] re-throws it so a coroutine
     * is cancelled properly.
     */
    @kotlin.jvm.JvmStatic()
    public static final void logAndReport(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    /**
     * If a HttpResponseException, maps to ClientError, ServerError or RequestError depending on
     * response code. Otherwise bends the stack trace of the bottom-most exception to the call
     * site of this method. Then logs the exception and if it should be, reports it.
     */
    @kotlin.jvm.JvmStatic()
    public static final void logAndReportHexagon(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    /**
     * Maps to ClientError, ServerError or RequestError depending on response code.
     * Then logs and reports error. Adds action as key to report. Appends additional message.
     */
    @kotlin.jvm.JvmStatic()
    public static final void logAndReport(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    /**
     * Maps to ClientError, ServerError or RequestError depending on response code.
     * Then logs and reports error. Adds action as key to report. Appends additional message.
     */
    @kotlin.jvm.JvmStatic()
    public static final void logAndReport(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<?> response, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    /**
     * Maps to ClientError, ServerError or RequestError depending on response code.
     * Then logs and reports error. Adds action as key to report.
     */
    @kotlin.jvm.JvmStatic()
    public static final void logAndReport(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<?> response) {
    }
    
    @androidx.annotation.VisibleForTesting()
    @kotlin.jvm.JvmStatic()
    public static final void removeErrorToolsFromStackTrace(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.Throwable testCreateThrowable() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001b\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0007J\u001c\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0007J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u001c\u001a\u00020\u0006H\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/battlelancer/seriesguide/util/Errors$Companion;", "", "()V", "bendCauseStackTrace", "", "throwable", "", "getReporter", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "indexOfFirstCallSiteElement", "", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)I", "logAndReport", "action", "", "response", "Lokhttp3/Response;", "message", "Lretrofit2/Response;", "logAndReportHexagon", "e", "logAndReportHexagonAuthError", "Lcom/battlelancer/seriesguide/backend/HexagonAuthError;", "logAndReportNoBend", "removeErrorToolsFromStackTrace", "testCreateThrowable", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Returns null instead of crashing when Firebase is not configured, e.g. for vanilla debug
         * builds and CI builds.
         */
        @org.jetbrains.annotations.Nullable()
        @android.annotation.SuppressLint(value = {"LogNotTimber"})
        public final com.google.firebase.crashlytics.FirebaseCrashlytics getReporter() {
            return null;
        }
        
        /**
         * Logs the exception and if it should be, reports it. Adds action as key to report.
         */
        @kotlin.jvm.JvmStatic()
        public final void logAndReportNoBend(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
        }
        
        /**
         * Logs the exception and if it should be, reports it. Bends the stack trace of the
         * bottom-most exception to the call site of this method. Adds action as key to report.
         * If [throwable] is a [CancellationException] re-throws it so a coroutine
         * is cancelled properly.
         */
        @kotlin.jvm.JvmStatic()
        public final void logAndReport(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
        }
        
        /**
         * Inserts the call site stack trace element at the beginning of the bottom-most exception.
         *
         * This is useful as the reporting tool differentiates exceptions based on the first stack
         * trace element.
         */
        private final void bendCauseStackTrace(java.lang.Throwable throwable) {
        }
        
        /**
         * If a HttpResponseException, maps to ClientError, ServerError or RequestError depending on
         * response code. Otherwise bends the stack trace of the bottom-most exception to the call
         * site of this method. Then logs the exception and if it should be, reports it.
         */
        @kotlin.jvm.JvmStatic()
        public final void logAndReportHexagon(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public final void logAndReportHexagonAuthError(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.backend.HexagonAuthError throwable) {
        }
        
        /**
         * Maps to ClientError, ServerError or RequestError depending on response code.
         * Then logs and reports error. Adds action as key to report. Appends additional message.
         */
        @kotlin.jvm.JvmStatic()
        public final void logAndReport(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        okhttp3.Response response, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
        }
        
        /**
         * Maps to ClientError, ServerError or RequestError depending on response code.
         * Then logs and reports error. Adds action as key to report. Appends additional message.
         */
        @kotlin.jvm.JvmStatic()
        public final void logAndReport(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        retrofit2.Response<?> response, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
        }
        
        /**
         * Maps to ClientError, ServerError or RequestError depending on response code.
         * Then logs and reports error. Adds action as key to report.
         */
        @kotlin.jvm.JvmStatic()
        public final void logAndReport(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        retrofit2.Response<?> response) {
        }
        
        @androidx.annotation.VisibleForTesting()
        @kotlin.jvm.JvmStatic()
        public final void removeErrorToolsFromStackTrace(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.VisibleForTesting()
        @kotlin.jvm.JvmStatic()
        public final java.lang.Throwable testCreateThrowable() {
            return null;
        }
        
        private final int indexOfFirstCallSiteElement(java.lang.StackTraceElement[] stackTrace) {
            return 0;
        }
    }
}