package com.battlelancer.seriesguide.util;

import java.lang.System;

/**
 * Helper methods to support SeriesGuide's different themes.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\u00020\t*\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/util/ThemeUtils;", "", "()V", "getColorFromAttribute", "", "context", "Landroid/content/Context;", "attribute", "setTheme", "", "activity", "Landroid/app/Activity;", "themeResId", "updateTheme", "themeIndex", "", "setDefaultStyle", "Lcom/uwetrottmann/seriesguide/widgets/SlidingTabLayout;", "app_pureDebug"})
public final class ThemeUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.ThemeUtils INSTANCE = null;
    
    private ThemeUtils() {
        super();
    }
    
    /**
     * Sets the global app theme variable. Applied by all activities once they are created.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void updateTheme(@org.jetbrains.annotations.NotNull()
    java.lang.String themeIndex) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int getColorFromAttribute(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int attribute) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setDefaultStyle(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.widgets.SlidingTabLayout $this$setDefaultStyle) {
    }
    
    /**
     * If [DisplaySettings.isDynamicColorsEnabled] applies Material 3 Dynamic Colors theme overlay
     * if available on the device.
     * https://m3.material.io/libraries/mdc-android/color-theming
     */
    public final void setTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int themeResId) {
    }
}