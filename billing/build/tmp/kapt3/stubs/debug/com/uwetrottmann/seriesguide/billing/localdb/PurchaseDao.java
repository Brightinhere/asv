package com.uwetrottmann.seriesguide.billing.localdb;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\'\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0017\u00a8\u0006\u000e"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/PurchaseDao;", "", "delete", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "Lcom/uwetrottmann/seriesguide/billing/localdb/CachedPurchase;", "([Lcom/uwetrottmann/seriesguide/billing/localdb/CachedPurchase;)V", "deleteAll", "getPurchases", "", "insert", "billing_debug"})
public abstract interface PurchaseDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM purchase_table")
    public abstract java.util.List<com.uwetrottmann.seriesguide.billing.localdb.CachedPurchase> getPurchases();
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.CachedPurchase purchase);
    
    @androidx.room.Transaction()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.android.billingclient.api.Purchase> purchases);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.CachedPurchase... purchases);
    
    @androidx.room.Query(value = "DELETE FROM purchase_table")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM purchase_table WHERE data = :purchase")
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.Purchase purchase);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void insert(@org.jetbrains.annotations.NotNull()
        com.uwetrottmann.seriesguide.billing.localdb.PurchaseDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.android.billingclient.api.Purchase> purchases) {
        }
    }
}