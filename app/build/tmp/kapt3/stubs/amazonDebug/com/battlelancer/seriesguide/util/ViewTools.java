package com.battlelancer.seriesguide.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J%\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0002\u0010!J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$J\u001e\u0010%\u001a\u00020\u00042\f\u0010&\u001a\b\u0018\u00010\'R\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010-\u001a\u00020.J\u0016\u00100\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0006\u00a8\u00062"}, d2 = {"Lcom/battlelancer/seriesguide/util/ViewTools;", "", "()V", "configureImdbButton", "", "button", "Landroid/view/View;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "episode", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "configureNotMigratedWarning", "view", "notMigrated", "", "openUriOnClick", "uri", "", "setCompoundDrawablesWithIntrinsicBounds", "textView", "Landroid/widget/TextView;", "left", "Landroid/graphics/drawable/Drawable;", "top", "setLabelValueOrHide", "label", "text", "value", "", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/Double;)Z", "setMenuItemActiveString", "item", "Landroid/view/MenuItem;", "setSwipeRefreshLayoutColors", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setValueOrPlaceholder", "setVectorDrawableLeft", "vectorRes", "", "setVectorDrawableTop", "showSoftKeyboardOnSearchView", "searchView", "app_amazonDebug"})
public final class ViewTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.util.ViewTools INSTANCE = null;
    
    private ViewTools() {
        super();
    }
    
    public final void setVectorDrawableTop(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @androidx.annotation.DrawableRes()
    int vectorRes) {
    }
    
    public final void setVectorDrawableLeft(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @androidx.annotation.DrawableRes()
    int vectorRes) {
    }
    
    /**
     * Sets the Drawables (if any) to appear to the start of, above, to the end of, and below the
     * text. Use null if you do not want a Drawable there. The Drawables' bounds will be set to
     * their intrinsic bounds.
     */
    private final void setCompoundDrawablesWithIntrinsicBounds(android.widget.TextView textView, android.graphics.drawable.Drawable left, android.graphics.drawable.Drawable top) {
    }
    
    public final void setValueOrPlaceholder(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    /**
     * If the given string is not null or empty, will make the label and value field [View.VISIBLE].
     * Otherwise both [View.GONE].
     *
     * @return True if the views are visible.
     */
    public final boolean setLabelValueOrHide(@org.jetbrains.annotations.NotNull()
    android.view.View label, @org.jetbrains.annotations.NotNull()
    android.widget.TextView text, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return false;
    }
    
    /**
     * If the given double is larger than 0, will make the label and value field [View.VISIBLE].
     * Otherwise both [View.GONE].
     *
     * @return True if the views are visible.
     */
    public final boolean setLabelValueOrHide(@org.jetbrains.annotations.NotNull()
    android.view.View label, @org.jetbrains.annotations.NotNull()
    android.widget.TextView text, @org.jetbrains.annotations.Nullable()
    java.lang.Double value) {
        return false;
    }
    
    public final void setMenuItemActiveString(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setSwipeRefreshLayoutColors(@org.jetbrains.annotations.Nullable()
    android.content.res.Resources.Theme theme, @org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
    }
    
    public final void showSoftKeyboardOnSearchView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View searchView) {
    }
    
    public final void openUriOnClick(@org.jetbrains.annotations.Nullable()
    android.view.View button, @org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
    }
    
    public final void configureNotMigratedWarning(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean notMigrated) {
    }
    
    /**
     * Configures button to open IMDB, if needed fetches ID from network while disabling button.
     */
    public final void configureImdbButton(@org.jetbrains.annotations.NotNull()
    android.view.View button, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.shows.database.SgShow2 show, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.database.SgEpisode2 episode) {
    }
}