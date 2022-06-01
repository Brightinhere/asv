package com.battlelancer.seriesguide.backend;

import java.lang.System;

/**
 * Common utilities for working with Cloud Endpoints.
 *
 * If you'd like to test using a locally-running version of your App Engine backend (i.e. running on
 * the Development App Server), you need to set USE_LOCAL_VERSION to 'true'.
 *
 * See https://cloud.google.com/appengine/docs/java/endpoints
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u0002H\u000eH\u0007\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0014\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/backend/CloudEndpointUtils;", "", "()V", "PATH_API", "", "ROOT_URL_LOCALHOST", "ROOT_URL_LOCALHOST_ANDROID", "ROOT_URL_STAGING", "USE_LOCAL_VERSION", "", "getUSE_LOCAL_VERSION$annotations", "USE_STAGING_VERSION", "getUSE_STAGING_VERSION$annotations", "updateBuilder", "B", "Lcom/google/api/client/googleapis/services/AbstractGoogleClient$Builder;", "context", "Landroid/content/Context;", "builder", "(Landroid/content/Context;Lcom/google/api/client/googleapis/services/AbstractGoogleClient$Builder;)Lcom/google/api/client/googleapis/services/AbstractGoogleClient$Builder;", "app_amazonDebug"})
public final class CloudEndpointUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.backend.CloudEndpointUtils INSTANCE = null;
    private static final java.lang.String PATH_API = "/_ah/api/";
    
    /**
     * Change this to 'true' if you're running your backend locally using the DevAppServer.
     */
    private static final boolean USE_LOCAL_VERSION = false;
    private static final boolean USE_STAGING_VERSION = false;
    private static final java.lang.String ROOT_URL_STAGING = "https://staging-dot-optical-hexagon-364.appspot.com";
    
    /**
     * The root URL of where your DevAppServer is running (if you're running the DevAppServer
     * locally).
     */
    private static final java.lang.String ROOT_URL_LOCALHOST = "http://localhost:8080/";
    
    /**
     * The root URL of where your DevAppServer is running when it's being accessed via the Android
     * emulator (if you're running the DevAppServer locally). In this case, you're running behind
     * Android's virtual router. See http://developer.android.com/tools/devices/emulator.html#networkaddresses
     * for more information.
     */
    private static final java.lang.String ROOT_URL_LOCALHOST_ANDROID = "http://10.0.2.2:8080";
    
    private CloudEndpointUtils() {
        super();
    }
    
    /**
     * Change this to 'true' if you're running your backend locally using the DevAppServer.
     */
    @kotlin.Suppress(names = {"SimplifyBooleanWithConstants"})
    @java.lang.Deprecated()
    private static void getUSE_LOCAL_VERSION$annotations() {
    }
    
    @kotlin.Suppress(names = {"SimplifyBooleanWithConstants"})
    @java.lang.Deprecated()
    private static void getUSE_STAGING_VERSION$annotations() {
    }
    
    /**
     * Updates the Google client builder to connect the appropriate server based on whether
     * USE_LOCAL_VERSION is true or false and sets a custom user agent.
     *
     * @param builder Google client builder
     * @return same Google client builder
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final <B extends com.google.api.client.googleapis.services.AbstractGoogleClient.Builder>B updateBuilder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    B builder) {
        return null;
    }
}