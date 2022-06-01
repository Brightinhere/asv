package com.uwetrottmann.seriesguide.billing.localdb;

import java.lang.System;

/**
 * This [Entity] is used partly for convenience and partly for security.
 *
 * - Convenience: when Play Billing calls onConsumeResponse, entitlements can be disbursed without
 *  first consulting the secure server, which might be temporarily down for, say, maintenance.
 *
 * - Security: Imagine a situation where four users of Trivial
 *  Drive decide to share one premium car purchase amongst themselves. So one user would buy the
 *  car and then log into the Play Store on each phone and as soon as they open the Trivial Drive
 *  app on a phone, they would see a Premium car. That would be fraudulent, but since this [Entity] is part
 *  of the local cache, the [BillingRepository] would notice there is a purchase in this local
 *  cache that the secure server does not recognize as belonging to this user. The secure server
 *  would then conduct further investigations and discover the fraud.
 *
 * This [Entity] will only be tracking active purchases. Hence, it's unlikely that very much data
 * will ever be saved here. It will keep subscriptions and non-consumables definitely, but
 * temporarily store consumables until Play confirms they have been consumed.
 *
 * While it would be more natural to simply call this class "Purchase," that might confuse new
 * developers to your team since [BillingClient] already calls its data [Purchase]. So it's better
 * to give it a different name. Also recall that [BillingRepository] must handle three different
 * data sources. So letting each source call its data by a slightly different name might make
 * reading the code easier.
 */
@androidx.room.TypeConverters(value = {com.uwetrottmann.seriesguide.billing.localdb.PurchaseTypeConverter.class})
@androidx.room.Entity(tableName = "purchase_table")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/CachedPurchase;", "", "data", "Lcom/android/billingclient/api/Purchase;", "(Lcom/android/billingclient/api/Purchase;)V", "getData", "()Lcom/android/billingclient/api/Purchase;", "id", "", "getId", "()I", "setId", "(I)V", "purchaseToken", "", "getPurchaseToken", "()Ljava/lang/String;", "sku", "getSku", "equals", "", "other", "hashCode", "billing_debug"})
public final class CachedPurchase {
    @org.jetbrains.annotations.NotNull()
    private final com.android.billingclient.api.Purchase data = null;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final java.lang.String purchaseToken = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final java.lang.String sku = null;
    
    public CachedPurchase(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.Purchase data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.billingclient.api.Purchase getData() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchaseToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSku() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}