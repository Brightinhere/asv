package com.battlelancer.seriesguide.appwidget;

import java.lang.System;

/**
 * Hosts a [ListWidgetPreferenceFragment] to allow changing settings of the associated app
 * widget.
 *
 * Does specifically NOT extend [com.battlelancer.seriesguide.ui.BaseActivity] to avoid
 * triggering update and backup mechanisms.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/appwidget/ListWidgetPreferenceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appWidgetId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setWidgetResult", "resultCode", "setupActionBar", "updateWidget", "app_amazonDebug"})
public final class ListWidgetPreferenceActivity extends androidx.appcompat.app.AppCompatActivity {
    private int appWidgetId = 0;
    
    public ListWidgetPreferenceActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupActionBar() {
    }
    
    /**
     * Called by [ListWidgetPreferenceFragment] to update a widget once preferences have changed.
     */
    public final void updateWidget() {
    }
    
    private final void setWidgetResult(int resultCode) {
    }
}