package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Tools for working with the image cache server.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\"\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\u0018\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\"\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J.\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J&\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020%H\u0007J&\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020%H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/battlelancer/seriesguide/util/ImageTools;", "", "()V", "TVDB_LEGACY_CACHE_PREFIX", "", "TVDB_LEGACY_MIRROR_BANNERS", "TVDB_MIRROR_BANNERS", "cacheKey", "getCacheKey", "()Ljava/lang/String;", "sha256_hmac", "Ljavax/crypto/Mac;", "buildImageCacheUrl", "posterUrl", "encodeImageUrl", "data", "loadShowPoster", "", "context", "Landroid/content/Context;", "imageView", "Landroid/widget/ImageView;", "posterPath", "loadShowPosterAlpha", "loadShowPosterFitCrop", "loadShowPosterResizeCrop", "loadShowPosterResizeSmallCrop", "loadShowPosterUrlResizeCrop", "url", "loadShowPosterUrlResizeSmallCrop", "posterUrlOrResolve", "imagePath", "showTmdbId", "", "language", "tmdbOrTvdbPosterUrl", "originalSize", "", "tmdbOrTvdbStillUrl", "app_amazonDebug"})
public final class ImageTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.ImageTools INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TVDB_LEGACY_CACHE_PREFIX = "_cache/";
    private static final java.lang.String TVDB_MIRROR_BANNERS = "https://artworks.thetvdb.com/banners/";
    private static final java.lang.String TVDB_LEGACY_MIRROR_BANNERS = "https://www.thetvdb.com/banners/";
    private static javax.crypto.Mac sha256_hmac;
    
    private ImageTools() {
        super();
    }
    
    private final java.lang.String getCacheKey() {
        return null;
    }
    
    /**
     * Like [tmdbOrTvdbPosterUrl], only if [imagePath] is empty, will return an URL
     * that will be resolved to a poster by [SgPicassoRequestHandler].
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String posterUrlOrResolve(@org.jetbrains.annotations.Nullable()
    java.lang.String imagePath, int showTmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String tmdbOrTvdbPosterUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean originalSize) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String tmdbOrTvdbStillUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean originalSize) {
        return null;
    }
    
    /**
     * [posterUrl] must not be empty.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String buildImageCacheUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl) {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized java.lang.String encodeImageUrl(java.lang.String data) {
        return null;
    }
    
    /**
     * Tries to load the given show poster into the given [ImageView]
     * without any resizing or cropping.
     */
    public final void loadShowPoster(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath) {
    }
    
    /**
     * Tries to load the given TVDb show poster into the given [ImageView] without any
     * resizing or cropping. In addition sets alpha on the view.
     */
    @kotlin.jvm.JvmStatic()
    public static final void loadShowPosterAlpha(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath) {
    }
    
    /**
     * Tries to load a resized, center cropped version of the show poster into the given
     * [ImageView]. On failure displays an error drawable (ensure image view is set to center
     * inside).
     *
     * The resize dimensions are those used for posters in the show list and change depending on
     * screen size.
     */
    @kotlin.jvm.JvmStatic()
    public static final void loadShowPosterResizeCrop(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void loadShowPosterUrlResizeCrop(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    public final void loadShowPosterResizeSmallCrop(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath) {
    }
    
    /**
     * Tries to load a resized, center cropped version of the show poster into the given
     * [ImageView]. On failure displays an error drawable (ensure image view is set to center
     * inside).
     *
     * The resize dimensions are fixed for all screen sizes. Like for items using the show list
     * layout, use [loadShowPosterResizeCrop].
     *
     * @param posterUrl This should already be a built poster URL, not just a poster path!
     */
    @kotlin.jvm.JvmStatic()
    public static final void loadShowPosterUrlResizeSmallCrop(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl) {
    }
    
    /**
     * Tries to load a resized, center cropped version of the show poster into the given
     * [ImageView]. On failure displays an error drawable (ensure image view is set to center
     * inside).
     *
     * The resize dimensions are determined based on the image view size.
     */
    public final void loadShowPosterFitCrop(@org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}