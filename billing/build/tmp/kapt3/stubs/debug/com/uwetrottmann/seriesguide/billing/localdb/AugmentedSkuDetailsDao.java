package com.uwetrottmann.seriesguide.billing.localdb;

import java.lang.System;

/**
 * The rest of the app needs a list of the [SkuDetails] so to show users what to buy
 * and for how much. [LiveData] should be used so the appropriate UIs get the most up-to-date
 * data. Notice that two sets is being created: one for subscriptions and one for managed products.
 * That's because in this sample subscriptions and in-app products are listed separately. However,
 * some use cases may have more than two sets; for instance, if each Fragment/Activity must list
 * different set of SKUs.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetailsDao;", "", "getById", "Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetails;", "sku", "", "getSubscriptionSkuDetails", "Landroidx/lifecycle/LiveData;", "", "insert", "", "augmentedSkuDetails", "insertOrUpdate", "Lcom/android/billingclient/api/SkuDetails;", "skuDetails", "canPurchase", "", "update", "billing_debug"})
public abstract interface AugmentedSkuDetailsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AugmentedSkuDetails WHERE type = \'subs\' ORDER BY priceMicros ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails>> getSubscriptionSkuDetails();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Transaction()
    public abstract com.android.billingclient.api.SkuDetails insertOrUpdate(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.SkuDetails skuDetails);
    
    @androidx.room.Transaction()
    public abstract void insertOrUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String sku, boolean canPurchase);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM AugmentedSkuDetails WHERE sku = :sku")
    public abstract com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails getById(@org.jetbrains.annotations.NotNull()
    java.lang.String sku);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails augmentedSkuDetails);
    
    @androidx.room.Query(value = "UPDATE AugmentedSkuDetails SET canPurchase = :canPurchase WHERE sku = :sku")
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.lang.String sku, boolean canPurchase);
    
    /**
     * The rest of the app needs a list of the [SkuDetails] so to show users what to buy
     * and for how much. [LiveData] should be used so the appropriate UIs get the most up-to-date
     * data. Notice that two sets is being created: one for subscriptions and one for managed products.
     * That's because in this sample subscriptions and in-app products are listed separately. However,
     * some use cases may have more than two sets; for instance, if each Fragment/Activity must list
     * different set of SKUs.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.Transaction()
        public static com.android.billingclient.api.SkuDetails insertOrUpdate(@org.jetbrains.annotations.NotNull()
        com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetailsDao $this, @org.jetbrains.annotations.NotNull()
        com.android.billingclient.api.SkuDetails skuDetails) {
            return null;
        }
        
        @androidx.room.Transaction()
        public static void insertOrUpdate(@org.jetbrains.annotations.NotNull()
        com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetailsDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String sku, boolean canPurchase) {
        }
    }
}