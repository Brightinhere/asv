package com.uwetrottmann.seriesguide.billing.localdb;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.uwetrottmann.seriesguide.billing.localdb.PurchaseTypeConverter.class})
@androidx.room.Database(entities = {com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails.class, com.uwetrottmann.seriesguide.billing.localdb.CachedPurchase.class, com.uwetrottmann.seriesguide.billing.localdb.GoldStatus.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/LocalBillingDb;", "Landroidx/room/RoomDatabase;", "()V", "entitlementsDao", "Lcom/uwetrottmann/seriesguide/billing/localdb/EntitlementsDao;", "purchaseDao", "Lcom/uwetrottmann/seriesguide/billing/localdb/PurchaseDao;", "skuDetailsDao", "Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetailsDao;", "Companion", "billing_debug"})
public abstract class LocalBillingDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.uwetrottmann.seriesguide.billing.localdb.LocalBillingDb.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.uwetrottmann.seriesguide.billing.localdb.LocalBillingDb INSTANCE;
    private static final java.lang.String DATABASE_NAME = "purchase_db";
    
    public LocalBillingDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.uwetrottmann.seriesguide.billing.localdb.PurchaseDao purchaseDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.uwetrottmann.seriesguide.billing.localdb.EntitlementsDao entitlementsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetailsDao skuDetailsDao();
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.uwetrottmann.seriesguide.billing.localdb.LocalBillingDb getInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/LocalBillingDb$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/uwetrottmann/seriesguide/billing/localdb/LocalBillingDb;", "buildDatabase", "appContext", "Landroid/content/Context;", "getInstance", "context", "billing_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.uwetrottmann.seriesguide.billing.localdb.LocalBillingDb getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.uwetrottmann.seriesguide.billing.localdb.LocalBillingDb buildDatabase(android.content.Context appContext) {
            return null;
        }
    }
}