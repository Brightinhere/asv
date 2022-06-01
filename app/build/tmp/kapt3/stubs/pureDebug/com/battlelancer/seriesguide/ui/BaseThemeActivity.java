package com.battlelancer.seriesguide.ui;

import java.lang.System;

/**
 * Sets the user defined theme, supports setting up a toolbar as the action bar,
 * enables up navigation.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0014\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/ui/BaseThemeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getCustomTheme", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setupActionBar", "app_pureDebug"})
public abstract class BaseThemeActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseThemeActivity() {
        super();
    }
    
    protected int getCustomTheme() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Call this in [onCreate] after [setContentView] to use a toolbar with id sgToolbar
     * as the action bar.
     *
     * If setting a title, might also want to supply a title to the
     * activity with [setTitle] for better accessibility.
     */
    protected void setupActionBar() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}