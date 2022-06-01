package com.uwetrottmann.seriesguide.billing.localdb;

import java.lang.System;

/**
 * No update methods necessary since for each table there is ever expecting one row, hence why
 * the primary key is hardcoded.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J!\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0017\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J!\u0010\u000e\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0017\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/uwetrottmann/seriesguide/billing/localdb/EntitlementsDao;", "", "delete", "", "goldStatus", "Lcom/uwetrottmann/seriesguide/billing/localdb/GoldStatus;", "getGoldStatus", "getGoldStatusLiveData", "Landroidx/lifecycle/LiveData;", "insert", "entitlements", "", "Lcom/uwetrottmann/seriesguide/billing/localdb/Entitlement;", "([Lcom/uwetrottmann/seriesguide/billing/localdb/Entitlement;)V", "update", "billing_debug"})
public abstract interface EntitlementsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.GoldStatus goldStatus);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.GoldStatus goldStatus);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM gold_status LIMIT 1")
    public abstract com.uwetrottmann.seriesguide.billing.localdb.GoldStatus getGoldStatus();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM gold_status LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.uwetrottmann.seriesguide.billing.localdb.GoldStatus> getGoldStatusLiveData();
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.GoldStatus goldStatus);
    
    /**
     * This is purely for convenience. The clients of this DAO
     * can simply send in a list of [entitlements][Entitlement].
     */
    @androidx.room.Transaction()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.Entitlement... entitlements);
    
    @androidx.room.Transaction()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.Entitlement... entitlements);
    
    /**
     * No update methods necessary since for each table there is ever expecting one row, hence why
     * the primary key is hardcoded.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * This is purely for convenience. The clients of this DAO
         * can simply send in a list of [entitlements][Entitlement].
         */
        @androidx.room.Transaction()
        public static void insert(@org.jetbrains.annotations.NotNull()
        com.uwetrottmann.seriesguide.billing.localdb.EntitlementsDao $this, @org.jetbrains.annotations.NotNull()
        com.uwetrottmann.seriesguide.billing.localdb.Entitlement... entitlements) {
        }
        
        @androidx.room.Transaction()
        public static void update(@org.jetbrains.annotations.NotNull()
        com.uwetrottmann.seriesguide.billing.localdb.EntitlementsDao $this, @org.jetbrains.annotations.NotNull()
        com.uwetrottmann.seriesguide.billing.localdb.Entitlement... entitlements) {
        }
    }
}