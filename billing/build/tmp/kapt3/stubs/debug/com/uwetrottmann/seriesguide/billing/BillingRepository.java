package com.uwetrottmann.seriesguide.billing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 D2\u00020\u0001:\u0002DEB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0$H\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+H\u0002J\u0019\u00101\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u0010\u00105\u001a\u00020-2\u0006\u00100\u001a\u00020+H\u0002J\b\u00106\u001a\u00020-H\u0002J\u0016\u00107\u001a\u00020)2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020%J\u001f\u0010;\u001a\u00020\u00012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020+0=H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u0011\u0010?\u001a\u00020)H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J\u0011\u0010A\u001a\u00020)H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J\b\u0010B\u001a\u00020/H\u0002J\u0006\u0010C\u001a\u00020)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u0019\u001a\u0004\b&\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006F"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/BillingRepository;", "", "applicationContext", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "billingClientStateListener", "Lcom/android/billingclient/api/BillingClientStateListener;", "disconnectCount", "", "entitlementRevokedEvent", "Lcom/uwetrottmann/seriesguide/common/SingleLiveEvent;", "Ljava/lang/Void;", "getEntitlementRevokedEvent", "()Lcom/uwetrottmann/seriesguide/common/SingleLiveEvent;", "errorEvent", "", "getErrorEvent", "goldStatusLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/uwetrottmann/seriesguide/billing/localdb/GoldStatus;", "getGoldStatusLiveData", "()Landroidx/lifecycle/LiveData;", "goldStatusLiveData$delegate", "Lkotlin/Lazy;", "localCacheBillingClient", "Lcom/uwetrottmann/seriesguide/billing/localdb/LocalBillingDb;", "playStoreBillingClient", "Lcom/android/billingclient/api/BillingClient;", "getPlayStoreBillingClient", "()Lcom/android/billingclient/api/BillingClient;", "playStoreBillingClient$delegate", "purchasesUpdatedListener", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "subsSkuDetailsListLiveData", "", "Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetails;", "getSubsSkuDetailsListLiveData", "subsSkuDetailsListLiveData$delegate", "acknowledgeNonConsumablePurchasesAsync", "", "nonConsumables", "Lcom/android/billingclient/api/Purchase;", "connectToPlayBillingService", "", "disburseEntitlement", "Lkotlinx/coroutines/Job;", "purchase", "insert", "entitlement", "Lcom/uwetrottmann/seriesguide/billing/localdb/Entitlement;", "(Lcom/uwetrottmann/seriesguide/billing/localdb/Entitlement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSignatureValid", "isSubscriptionSupported", "launchBillingFlow", "activity", "Landroid/app/Activity;", "augmentedSkuDetails", "processPurchases", "purchasesResult", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchasesAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "querySkuDetailsAsync", "revokeEntitlement", "startDataSourceConnections", "Companion", "SeriesGuideSku", "billing_debug"})
public final class BillingRepository {
    private final android.content.Context applicationContext = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    /**
     * The [BillingClient] is the most reliable and primary source of truth for all purchases
     * made through the Google Play Store. The Play Store takes security precautions in guarding
     * the data. Also, the data is available offline in most cases, which means the app incurs no
     * network charges for checking for purchases using the [BillingClient]. The offline bit is
     * because the Play Store caches every purchase the user owns, in an
     * [eventually consistent manner](https://developer.android.com/google/play/billing/billing_library_overview#Keep-up-to-date).
     * This is the only billing client an app is actually required to have on Android.
     * localCacheBillingClient is optional.
     *
     * ASIDE. Notice that the connection to [playStoreBillingClient] is created using the
     * applicationContext. This means the instance is not [Activity]-specific. And since it's also
     * not expensive, it can remain open for the life of the entire [Application]. So whether it is
     * (re)created for each Activity or Fragment or is kept open for the life of the application
     * is a matter of choice.
     */
    private final kotlin.Lazy playStoreBillingClient$delegate = null;
    
    /**
     * A local cache billing client is important in that the Play Store may be temporarily
     * unavailable during updates. In such cases, it may be important that the users
     * continue to get access to premium data that they own.
     *
     * The data that lives here should be refreshed at regular intervals so that it reflects what's
     * in the Google Play Store.
     */
    private com.uwetrottmann.seriesguide.billing.localdb.LocalBillingDb localCacheBillingClient;
    private int disconnectCount = 0;
    
    /**
     * This list tells clients what subscriptions are available for sale.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy subsSkuDetailsListLiveData$delegate = null;
    
    /**
     * Tracks whether this user is entitled to gold status. This call returns data from the app's
     * own local DB; this way if Play and the secure server are unavailable, users still have
     * access to features they purchased.  Normally this would be a good place to update the local
     * cache to make sure it's always up-to-date. However, onBillingSetupFinished already called
     * queryPurchasesAsync for you; so no need.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy goldStatusLiveData$delegate = null;
    
    /**
     * Triggered when the entitlement was revoked. Use only with one observer at a time.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.uwetrottmann.seriesguide.common.SingleLiveEvent<java.lang.Void> entitlementRevokedEvent = null;
    
    /**
     * Triggered if there was an error. Contains an error message to display.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.uwetrottmann.seriesguide.common.SingleLiveEvent<java.lang.String> errorEvent = null;
    private final com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener = null;
    private final com.android.billingclient.api.BillingClientStateListener billingClientStateListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.uwetrottmann.seriesguide.billing.BillingRepository.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.uwetrottmann.seriesguide.billing.BillingRepository INSTANCE;
    
    private BillingRepository(android.content.Context applicationContext, kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    /**
     * The [BillingClient] is the most reliable and primary source of truth for all purchases
     * made through the Google Play Store. The Play Store takes security precautions in guarding
     * the data. Also, the data is available offline in most cases, which means the app incurs no
     * network charges for checking for purchases using the [BillingClient]. The offline bit is
     * because the Play Store caches every purchase the user owns, in an
     * [eventually consistent manner](https://developer.android.com/google/play/billing/billing_library_overview#Keep-up-to-date).
     * This is the only billing client an app is actually required to have on Android.
     * localCacheBillingClient is optional.
     *
     * ASIDE. Notice that the connection to [playStoreBillingClient] is created using the
     * applicationContext. This means the instance is not [Activity]-specific. And since it's also
     * not expensive, it can remain open for the life of the entire [Application]. So whether it is
     * (re)created for each Activity or Fragment or is kept open for the life of the application
     * is a matter of choice.
     */
    private final com.android.billingclient.api.BillingClient getPlayStoreBillingClient() {
        return null;
    }
    
    /**
     * This list tells clients what subscriptions are available for sale.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails>> getSubsSkuDetailsListLiveData() {
        return null;
    }
    
    /**
     * Tracks whether this user is entitled to gold status. This call returns data from the app's
     * own local DB; this way if Play and the secure server are unavailable, users still have
     * access to features they purchased.  Normally this would be a good place to update the local
     * cache to make sure it's always up-to-date. However, onBillingSetupFinished already called
     * queryPurchasesAsync for you; so no need.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.uwetrottmann.seriesguide.billing.localdb.GoldStatus> getGoldStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.common.SingleLiveEvent<java.lang.Void> getEntitlementRevokedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uwetrottmann.seriesguide.common.SingleLiveEvent<java.lang.String> getErrorEvent() {
        return null;
    }
    
    public final void startDataSourceConnections() {
    }
    
    private final boolean connectToPlayBillingService() {
        return false;
    }
    
    /**
     * BACKGROUND
     *
     * Google Play Billing refers to receipts as [Purchases][Purchase]. So when a user buys
     * something, Play Billing returns a [Purchase] object that the app then uses to release the
     * [Entitlement] to the user. Receipts are pivotal within the [BillingRepository]; but they are
     * not part of the repo’s public API, because clients don’t need to know about them. When
     * the release of entitlements occurs depends on the type of purchase. For consumable products,
     * the release may be deferred until after consumption by Google Play; for non-consumable
     * products and subscriptions, the release may be deferred until after
     * [BillingClient.acknowledgePurchase] is called. You should keep receipts in the local
     * cache for augmented security and for making some transactions easier.
     *
     * THIS METHOD
     *
     * [This method][queryPurchasesAsync] grabs all the active purchases of this user and makes them
     * available to this app instance. Whereas this method plays a central role in the billing
     * system, it should be called at key junctures, such as when user the app starts.
     *
     * Because purchase data is vital to the rest of the app, this method is called each time
     * the [BillingViewModel] successfully establishes connection with the Play [BillingClient]:
     * the call comes through [billingClientStateListener]. Recall also from Figure 4 that this method
     * gets called from inside [purchasesUpdatedListener] in the event that a purchase is "already
     * owned," which can happen if a user buys the item around the same time
     * on a different device.
     */
    private final java.lang.Object queryPurchasesAsync(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object processPurchases(java.util.Set<? extends com.android.billingclient.api.Purchase> purchasesResult, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return null;
    }
    
    /**
     * If you do not acknowledge a purchase, the Google Play Store will provide a refund to the
     * users within a few days of the transaction. Therefore you have to implement
     * [BillingClient.acknowledgePurchase] inside your app.
     */
    private final void acknowledgeNonConsumablePurchasesAsync(java.util.List<? extends com.android.billingclient.api.Purchase> nonConsumables) {
    }
    
    /**
     * This is the final step, where purchases/receipts are converted to premium contents.
     */
    private final kotlinx.coroutines.Job disburseEntitlement(com.android.billingclient.api.Purchase purchase) {
        return null;
    }
    
    private final kotlinx.coroutines.Job revokeEntitlement() {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    private final java.lang.Object insert(com.uwetrottmann.seriesguide.billing.localdb.Entitlement entitlement, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Requests SKU details from Google Play and adds or updates the associated [AugmentedSkuDetails].
     */
    private final java.lang.Object querySkuDetailsAsync(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * This is the function to call when user wishes to make a purchase. This function will
     * launch the Google Play Billing flow. The response to this call is returned in
     * [purchasesUpdatedListener].
     */
    public final void launchBillingFlow(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails augmentedSkuDetails) {
    }
    
    private final boolean isSignatureValid(com.android.billingclient.api.Purchase purchase) {
        return false;
    }
    
    /**
     * Checks if the user's device supports subscriptions
     */
    private final boolean isSubscriptionSupported() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/BillingRepository$SeriesGuideSku;", "", "()V", "SUBS_SKUS_FOR_PURCHASE", "", "", "getSUBS_SKUS_FOR_PURCHASE", "()Ljava/util/List;", "X_PASS_IN_APP", "X_SUB_2014_02", "X_SUB_2016_05", "X_SUB_ALL_ACCESS", "X_SUB_LEGACY", "X_SUB_SPONSOR", "X_SUB_SUPPORTER", "billing_debug"})
    static final class SeriesGuideSku {
        @org.jetbrains.annotations.NotNull()
        public static final com.uwetrottmann.seriesguide.billing.BillingRepository.SeriesGuideSku INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String X_PASS_IN_APP = "x_upgrade";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String X_SUB_LEGACY = "x_subscription";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String X_SUB_2014_02 = "x_sub_2014_02";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String X_SUB_2016_05 = "x_sub_2016_05";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String X_SUB_ALL_ACCESS = "x_sub_2017_08";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String X_SUB_SUPPORTER = "sub_supporter";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String X_SUB_SPONSOR = "sub_sponsor";
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> SUBS_SKUS_FOR_PURCHASE = null;
        
        private SeriesGuideSku() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getSUBS_SKUS_FOR_PURCHASE() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/BillingRepository$Companion;", "", "()V", "INSTANCE", "Lcom/uwetrottmann/seriesguide/billing/BillingRepository;", "getInstance", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "billing_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.uwetrottmann.seriesguide.billing.BillingRepository getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope coroutineScope) {
            return null;
        }
    }
}