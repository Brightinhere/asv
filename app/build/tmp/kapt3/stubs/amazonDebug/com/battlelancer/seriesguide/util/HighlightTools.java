package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Helps highlight a toolbar item.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/util/HighlightTools;", "", "()V", "BASE_PREF_KEY", "", "highlightSgToolbarItem", "", "feature", "Lcom/battlelancer/seriesguide/util/HighlightTools$Feature;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "menuItemId", "", "textRes", "condition", "Lkotlin/Function0;", "", "setSeen", "context", "Landroid/content/Context;", "shouldHighlight", "Feature", "app_amazonDebug"})
public final class HighlightTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.HighlightTools INSTANCE = null;
    private static final java.lang.String BASE_PREF_KEY = "com.uwetrottmann.seriesguide.seenFeature.";
    
    private HighlightTools() {
        super();
    }
    
    public final boolean shouldHighlight(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.util.HighlightTools.Feature feature) {
        return false;
    }
    
    public final void setSeen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.util.HighlightTools.Feature feature) {
    }
    
    public final void highlightSgToolbarItem(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.util.HighlightTools.Feature feature, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleCoroutineScope scope, @androidx.annotation.IdRes()
    int menuItemId, @androidx.annotation.StringRes()
    int textRes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/util/HighlightTools$Feature;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "SHOW_FILTER", "MOVIE_FILTER", "app_amazonDebug"})
    public static enum Feature {
        /*public static final*/ SHOW_FILTER /* = new SHOW_FILTER(0) */,
        /*public static final*/ MOVIE_FILTER /* = new MOVIE_FILTER(0) */;
        private final int index = 0;
        
        Feature(int index) {
        }
        
        public final int getIndex() {
            return 0;
        }
    }
}