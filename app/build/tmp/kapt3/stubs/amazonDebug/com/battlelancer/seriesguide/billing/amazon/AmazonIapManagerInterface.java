package com.battlelancer.seriesguide.billing.amazon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/billing/amazon/AmazonIapManagerInterface;", "", "activate", "", "deactivate", "register", "requestProductData", "requestUserDataAndPurchaseUpdates", "validateSupporterState", "activity", "Landroid/app/Activity;", "app_amazonDebug"})
public abstract interface AmazonIapManagerInterface {
    
    /**
     * Sets up Amazon IAP.
     *
     * Ensure to call this in `onCreate` of any activity before making calls to any other methods.
     */
    public abstract void register();
    
    public abstract void requestProductData();
    
    public abstract void requestUserDataAndPurchaseUpdates();
    
    public abstract void activate();
    
    public abstract void deactivate();
    
    public abstract void validateSupporterState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
}