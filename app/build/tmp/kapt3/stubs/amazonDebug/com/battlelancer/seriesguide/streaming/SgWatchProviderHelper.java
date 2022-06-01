package com.battlelancer.seriesguide.streaming;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0004H\'J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0004H\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\r2\u0006\u0010\u0006\u001a\u00020\u0004H\'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u000f2\u0006\u0010\u0006\u001a\u00020\u0004H\'J\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004H\'J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0016\u0010\u0016\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J2\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0017\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/SgWatchProviderHelper;", "", "allWatchProvidersPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/battlelancer/seriesguide/streaming/SgWatchProvider;", "type", "delete", "", "providers", "", "getAllWatchProviders", "getEnabledWatchProviderIds", "Landroidx/lifecycle/LiveData;", "getEnabledWatchProviderIdsFlow", "Lkotlinx/coroutines/flow/Flow;", "insertOrReplace", "setAllDisabled", "setEnabled", "id", "enabled", "", "update", "updateWatchProviders", "inserts", "updates", "deletes", "app_amazonDebug"})
public abstract interface SgWatchProviderHelper {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertOrReplace(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> providers);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> providers);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> providers);
    
    @androidx.room.Transaction()
    public abstract void updateWatchProviders(@org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> inserts, @org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> updates, @org.jetbrains.annotations.NotNull()
    java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> deletes);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_watch_provider WHERE type=:type")
    public abstract java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> getAllWatchProviders(int type);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sg_watch_provider WHERE type=:type ORDER BY display_priority ASC, provider_name ASC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.battlelancer.seriesguide.streaming.SgWatchProvider> allWatchProvidersPagingSource(int type);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT provider_id FROM sg_watch_provider WHERE type=:type AND enabled=1")
    public abstract androidx.lifecycle.LiveData<java.util.List<java.lang.Integer>> getEnabledWatchProviderIds(int type);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT provider_id FROM sg_watch_provider WHERE type=:type AND enabled=1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<java.lang.Integer>> getEnabledWatchProviderIdsFlow(int type);
    
    @androidx.room.Query(value = "UPDATE sg_watch_provider SET enabled=:enabled WHERE _id=:id")
    public abstract void setEnabled(int id, boolean enabled);
    
    @androidx.room.Query(value = "UPDATE sg_watch_provider SET enabled=0 WHERE type=:type")
    public abstract void setAllDisabled(int type);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void updateWatchProviders(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.streaming.SgWatchProviderHelper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> inserts, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> updates, @org.jetbrains.annotations.NotNull()
        java.util.List<com.battlelancer.seriesguide.streaming.SgWatchProvider> deletes) {
        }
    }
}