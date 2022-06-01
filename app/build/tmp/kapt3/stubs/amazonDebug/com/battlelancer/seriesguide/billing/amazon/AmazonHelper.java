package com.battlelancer.seriesguide.billing.amazon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/billing/amazon/AmazonHelper;", "", "()V", "iapManager", "Lcom/battlelancer/seriesguide/billing/amazon/AmazonIapManagerInterface;", "getIapManager$annotations", "getIapManager", "()Lcom/battlelancer/seriesguide/billing/amazon/AmazonIapManagerInterface;", "iapManagerInstance", "create", "", "context", "Landroid/content/Context;", "app_amazonDebug"})
public final class AmazonHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.billing.amazon.AmazonHelper INSTANCE = null;
    private static com.battlelancer.seriesguide.billing.amazon.AmazonIapManagerInterface iapManagerInstance;
    
    private AmazonHelper() {
        super();
    }
    
    /**
     * This is only available after calling [create].
     */
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getIapManager$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.billing.amazon.AmazonIapManagerInterface getIapManager() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized void create(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}