package com.battlelancer.seriesguide.ui;

import java.lang.System;

/**
 * Displays an image URL full screen in a zoomable view. If a preview image URL is provided, it is
 * shown as a placeholder until the higher resolution image loads. The preview image has to be
 * cached by Picasso already.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0014J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0018\u001a\u00020\fH\u0014J\b\u0010\u0019\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/ui/FullscreenImageActivity;", "Lcom/battlelancer/seriesguide/ui/BaseActivity;", "()V", "hideHandler", "Landroid/os/Handler;", "hideRunnable", "Ljava/lang/Runnable;", "photoView", "Luk/co/senab/photoview/PhotoView;", "systemUiHider", "Lcom/battlelancer/seriesguide/util/SystemUiHider;", "delayedHide", "", "loadLargeImage", "hasPreviewImage", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onPostCreate", "setupActionBar", "setupViews", "Companion", "app_pureDebug"})
public final class FullscreenImageActivity extends com.battlelancer.seriesguide.ui.BaseActivity {
    
    /**
     * The instance of the [SystemUiHider] for this activity.
     */
    private com.battlelancer.seriesguide.util.SystemUiHider systemUiHider;
    
    /**
     * Displays the poster or episode preview
     */
    private uk.co.senab.photoview.PhotoView photoView;
    private android.os.Handler hideHandler;
    private java.lang.Runnable hideRunnable;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.ui.FullscreenImageActivity.Companion Companion = null;
    
    /**
     * Image URL that has been cached already. Will show initially before replacing with larger
     * version.
     */
    private static final java.lang.String EXTRA_PREVIEW_IMAGE = "PREVIEW_IMAGE";
    private static final java.lang.String EXTRA_IMAGE = "IMAGE";
    private static final int DELAY_100_MS = 100;
    
    public FullscreenImageActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    private final void setupViews() {
    }
    
    private final void loadLargeImage(boolean hasPreviewImage) {
    }
    
    @java.lang.Override()
    protected void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Schedules a call to hide() in [DELAY_100_MS] milliseconds, canceling any previously scheduled
     * calls.
     */
    private final void delayedHide() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String previewImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/ui/FullscreenImageActivity$Companion;", "", "()V", "DELAY_100_MS", "", "EXTRA_IMAGE", "", "EXTRA_PREVIEW_IMAGE", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "previewImageUrl", "imageUrl", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent intent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String previewImageUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl) {
            return null;
        }
    }
}