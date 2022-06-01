package com.battlelancer.seriesguide.lists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/lists/ListsSettings;", "", "()V", "KEY_LAST_ACTIVE_LISTS_TAB", "", "getLastListsTabPosition", "", "context", "Landroid/content/Context;", "app_amazonDebug"})
public final class ListsSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.lists.ListsSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LAST_ACTIVE_LISTS_TAB = "com.battlelancer.seriesguide.listsActiveTab";
    
    private ListsSettings() {
        super();
    }
    
    /**
     * Return the position of the last selected lists tab.
     */
    public final int getLastListsTabPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
}