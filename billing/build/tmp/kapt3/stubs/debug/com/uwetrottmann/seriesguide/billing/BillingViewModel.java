package com.uwetrottmann.seriesguide.billing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/BillingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineScope;)V", "entitlementRevokedEvent", "Landroidx/lifecycle/LiveData;", "Ljava/lang/Void;", "getEntitlementRevokedEvent", "()Landroidx/lifecycle/LiveData;", "errorEvent", "", "getErrorEvent", "goldStatusLiveData", "Lcom/uwetrottmann/seriesguide/billing/localdb/GoldStatus;", "getGoldStatusLiveData", "repository", "Lcom/uwetrottmann/seriesguide/billing/BillingRepository;", "subsSkuDetailsListLiveData", "", "Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetails;", "getSubsSkuDetailsListLiveData", "makePurchase", "", "activity", "Landroid/app/Activity;", "augmentedSkuDetails", "billing_debug"})
public final class BillingViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.uwetrottmann.seriesguide.billing.localdb.GoldStatus> goldStatusLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails>> subsSkuDetailsListLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Void> entitlementRevokedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorEvent = null;
    private final com.uwetrottmann.seriesguide.billing.BillingRepository repository = null;
    
    public BillingViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.uwetrottmann.seriesguide.billing.localdb.GoldStatus> getGoldStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails>> getSubsSkuDetailsListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Void> getEntitlementRevokedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorEvent() {
        return null;
    }
    
    public final void makePurchase(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails augmentedSkuDetails) {
    }
}