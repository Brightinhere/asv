package com.uwetrottmann.seriesguide.billing.localdb;

import java.lang.System;

/**
 * The Play [BillingClient] provides a [SkuDetails] list that the [BillingRepository] could pass
 * along to clients to tell them what the app sells. With that approach, however, clients would have
 * to figure out all correlations between SkuDetails and [entitlements][Entitlement]. For example:
 * When the gas tankis full, the client would have to figure it out and disable the
 * [SkuDetails] button for buying more gas.
 *
 * Therefore, in the spirit of being client-friendly, whereas the [BillingRepository] is in a
 * better position to determine the correlations between a [SkuDetails] and its [Entitlement],
 * the API should provide an [AugmentedSkuDetails] object instead of the basic [SkuDetails].
 * This object not only passes to clients the actual [SkuDetails] object from Google, but also
 * tells clients whether a user is allowed to purchase that item at this particular moment.
 *
 * To be thorough, your implementation may be the following
 *
 * ```
 * @Entity
 * @TypeConverters(SkuDetailsTypeConverter::class)
 * class AugmentedSkuDetails(var skuDetails: SkuDetails, var canPurchase:Boolean,@PrimaryKey val sku:String)
 *
 * // and your Dao updates would look like:
 *
 * @Update
 * fun update(skuDetails: SkuDetails, sku:String)
 *
 * @Update
 * fun update(canPurchase:Boolean, sku:String)
 *
 * ```
 * But the actual implementation below shows an alternative where you only include the fields
 * you want your clients to care about. The choice is up to you.
 */
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jj\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetails;", "", "canPurchase", "", "sku", "", "type", "price", "priceMicros", "", "title", "description", "originalJson", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCanPurchase", "()Z", "getDescription", "()Ljava/lang/String;", "getOriginalJson", "getPrice", "getPriceMicros", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSku", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetails;", "equals", "other", "hashCode", "", "toString", "billing_debug"})
public final class AugmentedSkuDetails {
    private final boolean canPurchase = false;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String sku = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String price = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long priceMicros = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalJson = null;
    
    /**
     * The Play [BillingClient] provides a [SkuDetails] list that the [BillingRepository] could pass
     * along to clients to tell them what the app sells. With that approach, however, clients would have
     * to figure out all correlations between SkuDetails and [entitlements][Entitlement]. For example:
     * When the gas tankis full, the client would have to figure it out and disable the
     * [SkuDetails] button for buying more gas.
     *
     * Therefore, in the spirit of being client-friendly, whereas the [BillingRepository] is in a
     * better position to determine the correlations between a [SkuDetails] and its [Entitlement],
     * the API should provide an [AugmentedSkuDetails] object instead of the basic [SkuDetails].
     * This object not only passes to clients the actual [SkuDetails] object from Google, but also
     * tells clients whether a user is allowed to purchase that item at this particular moment.
     *
     * To be thorough, your implementation may be the following
     *
     * ```
     * @Entity
     * @TypeConverters(SkuDetailsTypeConverter::class)
     * class AugmentedSkuDetails(var skuDetails: SkuDetails, var canPurchase:Boolean,@PrimaryKey val sku:String)
     *
     * // and your Dao updates would look like:
     *
     * @Update
     * fun update(skuDetails: SkuDetails, sku:String)
     *
     * @Update
     * fun update(canPurchase:Boolean, sku:String)
     *
     * ```
     * But the actual implementation below shows an alternative where you only include the fields
     * you want your clients to care about. The choice is up to you.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails copy(boolean canPurchase, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.Long priceMicros, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String originalJson) {
        return null;
    }
    
    /**
     * The Play [BillingClient] provides a [SkuDetails] list that the [BillingRepository] could pass
     * along to clients to tell them what the app sells. With that approach, however, clients would have
     * to figure out all correlations between SkuDetails and [entitlements][Entitlement]. For example:
     * When the gas tankis full, the client would have to figure it out and disable the
     * [SkuDetails] button for buying more gas.
     *
     * Therefore, in the spirit of being client-friendly, whereas the [BillingRepository] is in a
     * better position to determine the correlations between a [SkuDetails] and its [Entitlement],
     * the API should provide an [AugmentedSkuDetails] object instead of the basic [SkuDetails].
     * This object not only passes to clients the actual [SkuDetails] object from Google, but also
     * tells clients whether a user is allowed to purchase that item at this particular moment.
     *
     * To be thorough, your implementation may be the following
     *
     * ```
     * @Entity
     * @TypeConverters(SkuDetailsTypeConverter::class)
     * class AugmentedSkuDetails(var skuDetails: SkuDetails, var canPurchase:Boolean,@PrimaryKey val sku:String)
     *
     * // and your Dao updates would look like:
     *
     * @Update
     * fun update(skuDetails: SkuDetails, sku:String)
     *
     * @Update
     * fun update(canPurchase:Boolean, sku:String)
     *
     * ```
     * But the actual implementation below shows an alternative where you only include the fields
     * you want your clients to care about. The choice is up to you.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * The Play [BillingClient] provides a [SkuDetails] list that the [BillingRepository] could pass
     * along to clients to tell them what the app sells. With that approach, however, clients would have
     * to figure out all correlations between SkuDetails and [entitlements][Entitlement]. For example:
     * When the gas tankis full, the client would have to figure it out and disable the
     * [SkuDetails] button for buying more gas.
     *
     * Therefore, in the spirit of being client-friendly, whereas the [BillingRepository] is in a
     * better position to determine the correlations between a [SkuDetails] and its [Entitlement],
     * the API should provide an [AugmentedSkuDetails] object instead of the basic [SkuDetails].
     * This object not only passes to clients the actual [SkuDetails] object from Google, but also
     * tells clients whether a user is allowed to purchase that item at this particular moment.
     *
     * To be thorough, your implementation may be the following
     *
     * ```
     * @Entity
     * @TypeConverters(SkuDetailsTypeConverter::class)
     * class AugmentedSkuDetails(var skuDetails: SkuDetails, var canPurchase:Boolean,@PrimaryKey val sku:String)
     *
     * // and your Dao updates would look like:
     *
     * @Update
     * fun update(skuDetails: SkuDetails, sku:String)
     *
     * @Update
     * fun update(canPurchase:Boolean, sku:String)
     *
     * ```
     * But the actual implementation below shows an alternative where you only include the fields
     * you want your clients to care about. The choice is up to you.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * The Play [BillingClient] provides a [SkuDetails] list that the [BillingRepository] could pass
     * along to clients to tell them what the app sells. With that approach, however, clients would have
     * to figure out all correlations between SkuDetails and [entitlements][Entitlement]. For example:
     * When the gas tankis full, the client would have to figure it out and disable the
     * [SkuDetails] button for buying more gas.
     *
     * Therefore, in the spirit of being client-friendly, whereas the [BillingRepository] is in a
     * better position to determine the correlations between a [SkuDetails] and its [Entitlement],
     * the API should provide an [AugmentedSkuDetails] object instead of the basic [SkuDetails].
     * This object not only passes to clients the actual [SkuDetails] object from Google, but also
     * tells clients whether a user is allowed to purchase that item at this particular moment.
     *
     * To be thorough, your implementation may be the following
     *
     * ```
     * @Entity
     * @TypeConverters(SkuDetailsTypeConverter::class)
     * class AugmentedSkuDetails(var skuDetails: SkuDetails, var canPurchase:Boolean,@PrimaryKey val sku:String)
     *
     * // and your Dao updates would look like:
     *
     * @Update
     * fun update(skuDetails: SkuDetails, sku:String)
     *
     * @Update
     * fun update(canPurchase:Boolean, sku:String)
     *
     * ```
     * But the actual implementation below shows an alternative where you only include the fields
     * you want your clients to care about. The choice is up to you.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AugmentedSkuDetails(boolean canPurchase, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.Long priceMicros, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String originalJson) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getCanPurchase() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPriceMicros() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalJson() {
        return null;
    }
}