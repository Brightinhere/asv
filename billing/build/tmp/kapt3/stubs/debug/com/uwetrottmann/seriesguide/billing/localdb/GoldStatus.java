package com.uwetrottmann.seriesguide.billing.localdb;

import java.lang.System;

/**
 * Subscription is kept simple in this project. And so here the user either has a subscription
 * to gold status or s/he doesn't. For more on subscriptions, see the Classy Taxi sample app.
 */
@androidx.room.Entity(tableName = "gold_status")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/GoldStatus;", "Lcom/uwetrottmann/seriesguide/billing/localdb/Entitlement;", "entitled", "", "isSub", "sku", "", "purchaseToken", "(ZZLjava/lang/String;Ljava/lang/String;)V", "getEntitled", "()Z", "getPurchaseToken", "()Ljava/lang/String;", "getSku", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "mayPurchase", "toString", "billing_debug"})
public final class GoldStatus extends com.uwetrottmann.seriesguide.billing.localdb.Entitlement {
    private final boolean entitled = false;
    private final boolean isSub = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sku = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String purchaseToken = null;
    
    /**
     * Subscription is kept simple in this project. And so here the user either has a subscription
     * to gold status or s/he doesn't. For more on subscriptions, see the Classy Taxi sample app.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.billing.localdb.GoldStatus copy(boolean entitled, boolean isSub, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseToken) {
        return null;
    }
    
    /**
     * Subscription is kept simple in this project. And so here the user either has a subscription
     * to gold status or s/he doesn't. For more on subscriptions, see the Classy Taxi sample app.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Subscription is kept simple in this project. And so here the user either has a subscription
     * to gold status or s/he doesn't. For more on subscriptions, see the Classy Taxi sample app.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Subscription is kept simple in this project. And so here the user either has a subscription
     * to gold status or s/he doesn't. For more on subscriptions, see the Classy Taxi sample app.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public GoldStatus(boolean entitled, boolean isSub, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseToken) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getEntitled() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isSub() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPurchaseToken() {
        return null;
    }
    
    @java.lang.Override()
    public boolean mayPurchase() {
        return false;
    }
}