package com.battlelancer.seriesguide.billing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0015J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0014J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u0016H\u0014J\b\u0010!\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/battlelancer/seriesguide/billing/BillingActivity;", "Lcom/battlelancer/seriesguide/ui/BaseActivity;", "()V", "adapter", "Lcom/battlelancer/seriesguide/billing/SkuDetailsAdapter;", "billingViewModel", "Lcom/uwetrottmann/seriesguide/billing/BillingViewModel;", "buttonManageSubs", "Landroid/widget/Button;", "buttonPass", "contentContainer", "Landroid/view/View;", "manageSubscriptionUrl", "", "progressScreen", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "textViewBillingError", "Landroid/widget/TextView;", "textViewBillingUnlockDetected", "textViewHasUpgrade", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onStart", "setWaitMode", "isActive", "setupActionBar", "setupViews", "updateViewStates", "hasUpgrade", "unlockAppDetected", "Companion", "app_amazonDebug"})
public final class BillingActivity extends com.battlelancer.seriesguide.ui.BaseActivity {
    private android.view.View progressScreen;
    private android.view.View contentContainer;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.battlelancer.seriesguide.billing.SkuDetailsAdapter adapter;
    private android.widget.Button buttonManageSubs;
    private android.widget.Button buttonPass;
    private android.view.View textViewHasUpgrade;
    private android.view.View textViewBillingUnlockDetected;
    private android.widget.TextView textViewBillingError;
    private com.uwetrottmann.seriesguide.billing.BillingViewModel billingViewModel;
    private java.lang.String manageSubscriptionUrl;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.billing.BillingActivity.Companion Companion = null;
    private static final java.lang.String PLAY_MANAGE_SUBS_ALL = "https://play.google.com/store/account/subscriptions";
    private static final java.lang.String PLAY_MANAGE_SUBS_ONE = "https://play.google.com/store/account/subscriptions?package=com.uwetrottmann.seriesguide.amzn&sku=";
    
    public BillingActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupActionBar() {
    }
    
    private final void setupViews() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void updateViewStates(boolean hasUpgrade, boolean unlockAppDetected) {
    }
    
    private final void setWaitMode(boolean isActive) {
    }
    
    /**
     * Displays a notification that the subscription has expired. Its action opens this activity.
     */
    @kotlin.jvm.JvmStatic()
    public static final void showExpiredNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/battlelancer/seriesguide/billing/BillingActivity$Companion;", "", "()V", "PLAY_MANAGE_SUBS_ALL", "", "PLAY_MANAGE_SUBS_ONE", "showExpiredNotification", "", "context", "Landroid/content/Context;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Displays a notification that the subscription has expired. Its action opens this activity.
         */
        @kotlin.jvm.JvmStatic()
        public final void showExpiredNotification(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}