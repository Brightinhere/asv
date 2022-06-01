package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Add a shortcut to the overview page of the given show to the Home screen.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u0004\u0018\u00010\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002J\u0011\u0010\u0012\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/util/ShortcutCreator;", "", "localContext", "Landroid/content/Context;", "showTitle", "", "posterPath", "showTmdbId", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "context", "kotlin.jvm.PlatformType", "createBitmap", "Landroid/graphics/Bitmap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pinShortcut", "", "posterBitmap", "prepareAndPinShortcut", "RoundedCornerTransformation", "app_pureDebug"})
public final class ShortcutCreator {
    private final java.lang.String showTitle = null;
    private final java.lang.String posterPath = null;
    private final int showTmdbId = 0;
    private final android.content.Context context = null;
    
    public ShortcutCreator(@org.jetbrains.annotations.NotNull()
    android.content.Context localContext, @org.jetbrains.annotations.NotNull()
    java.lang.String showTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String posterPath, int showTmdbId) {
        super();
    }
    
    /**
     * Prepares the bitmap for the shortcut on [Dispatchers.IO],
     * when ready suggest to (O+) or pins the shortcut.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object prepareAndPinShortcut(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object createBitmap(kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return null;
    }
    
    private final void pinShortcut(android.graphics.Bitmap posterBitmap) {
    }
    
    /**
     * A [Transformation] used to draw a [Bitmap] with round corners
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/util/ShortcutCreator$RoundedCornerTransformation;", "Lcom/squareup/picasso/Transformation;", "key", "", "radius", "", "(Ljava/lang/String;F)V", "transform", "Landroid/graphics/Bitmap;", "source", "app_pureDebug"})
    static final class RoundedCornerTransformation implements com.squareup.picasso.Transformation {
        
        /**
         * A key used to uniquely identify this [Transformation]
         */
        private final java.lang.String key = null;
        
        /**
         * The corner radius
         */
        private final float radius = 0.0F;
        
        public RoundedCornerTransformation(@org.jetbrains.annotations.NotNull()
        java.lang.String key, float radius) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap source) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String key() {
            return null;
        }
    }
}