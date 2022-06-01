package com.battlelancer.seriesguide.billing.amazon;

import java.lang.System;

/**
 * No-op dummy of Amazon IAP manager.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/billing/amazon/AmazonIapManager;", "Lcom/battlelancer/seriesguide/billing/amazon/AmazonIapManagerInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activate", "", "deactivate", "register", "requestProductData", "requestUserDataAndPurchaseUpdates", "validateSupporterState", "activity", "Landroid/app/Activity;", "app_pureDebug"})
public final class AmazonIapManager implements com.battlelancer.seriesguide.billing.amazon.AmazonIapManagerInterface {
    
    public AmazonIapManager(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void register() {
    }
    
    @java.lang.Override()
    public void requestProductData() {
    }
    
    @java.lang.Override()
    public void requestUserDataAndPurchaseUpdates() {
    }
    
    @java.lang.Override()
    public void activate() {
    }
    
    @java.lang.Override()
    public void deactivate() {
    }
    
    @java.lang.Override()
    public void validateSupporterState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}