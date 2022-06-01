package com.battlelancer.seriesguide.extensions;

import java.lang.System;

/**
 * Queries for any installed [com.battlelancer.seriesguide.api.SeriesGuideExtension]
 * extensions.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/AvailableExtensionsLoader;", "Lcom/uwetrottmann/androidutils/GenericSimpleLoader;", "", "Lcom/battlelancer/seriesguide/extensions/Extension;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "loadInBackground", "app_amazonDebug"})
public final class AvailableExtensionsLoader extends com.uwetrottmann.androidutils.GenericSimpleLoader<java.util.List<com.battlelancer.seriesguide.extensions.Extension>> {
    
    public AvailableExtensionsLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.battlelancer.seriesguide.extensions.Extension> loadInBackground() {
        return null;
    }
}