package com.battlelancer.seriesguide.lists.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\u0006H\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\u000eH\'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\'J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\'\u00a8\u0006\u0018"}, d2 = {"Lcom/battlelancer/seriesguide/lists/database/SgListHelper;", "", "deleteAllLists", "", "deleteListItem", "listItemId", "", "deleteListItems", "listItemIds", "", "getListItemsForExport", "Lcom/battlelancer/seriesguide/lists/database/SgListItem;", "listId", "getListItemsWithDetails", "Landroidx/lifecycle/LiveData;", "Lcom/battlelancer/seriesguide/lists/database/SgListItemWithDetails;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getListsForDisplay", "Lcom/battlelancer/seriesguide/lists/database/SgList;", "getListsForExport", "getTvdbShowListItems", "insertListItems", "listItems", "app_pureDebug"})
public abstract interface SgListHelper {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM lists ORDER BY list_order ASC,list_name COLLATE UNICODE ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.lists.database.SgList>> getListsForDisplay();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM lists ORDER BY list_order ASC,list_name COLLATE UNICODE ASC")
    public abstract java.util.List<com.battlelancer.seriesguide.lists.database.SgList> getListsForExport();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.battlelancer.seriesguide.lists.database.SgListItem.class, com.battlelancer.seriesguide.shows.database.SgShow2.class})
    public abstract androidx.lifecycle.LiveData<java.util.List<com.battlelancer.seriesguide.lists.database.SgListItemWithDetails>> getListItemsWithDetails(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM listitems WHERE list_id = :listId")
    public abstract java.util.List<com.battlelancer.seriesguide.lists.database.SgListItem> getListItemsForExport(@org.jetbrains.annotations.NotNull()
    java.lang.String listId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertListItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.battlelancer.seriesguide.lists.database.SgListItem> listItems);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM listitems WHERE item_type = 1")
    public abstract java.util.List<com.battlelancer.seriesguide.lists.database.SgListItem> getTvdbShowListItems();
    
    @androidx.room.Query(value = "DELETE FROM listitems WHERE list_item_id = :listItemId")
    public abstract void deleteListItem(@org.jetbrains.annotations.NotNull()
    java.lang.String listItemId);
    
    @androidx.room.Transaction()
    public abstract void deleteListItems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listItemIds);
    
    /**
     * By default the database inserts a first list when being created, d
     */
    @androidx.room.Query(value = "DELETE FROM lists")
    @androidx.annotation.VisibleForTesting()
    public abstract void deleteAllLists();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void deleteListItems(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.lists.database.SgListHelper $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> listItemIds) {
        }
    }
}