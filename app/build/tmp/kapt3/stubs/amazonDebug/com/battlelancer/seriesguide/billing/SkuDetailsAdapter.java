package com.battlelancer.seriesguide.billing;

import java.lang.System;

/**
 * This is an [AugmentedSkuDetails] adapter. It can be used anywhere there is a need to display a
 * list of AugmentedSkuDetails. In this app it's used to display both the list of subscriptions and
 * the list of in-app products.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/battlelancer/seriesguide/billing/SkuDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/battlelancer/seriesguide/billing/SkuDetailsAdapter$SkuDetailsViewHolder;", "()V", "skuDetailsList", "", "Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetails;", "getItem", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSkuDetailsClicked", "item", "setSkuDetailsList", "list", "SkuDetailsViewHolder", "app_amazonDebug"})
public class SkuDetailsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.battlelancer.seriesguide.billing.SkuDetailsAdapter.SkuDetailsViewHolder> {
    private java.util.List<com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails> skuDetailsList;
    
    public SkuDetailsAdapter() {
        super();
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.battlelancer.seriesguide.billing.SkuDetailsAdapter.SkuDetailsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.billing.SkuDetailsAdapter.SkuDetailsViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails getItem(int position) {
        return null;
    }
    
    public final void setSkuDetailsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails> list) {
    }
    
    /**
     * In the spirit of keeping simple things simple: this is a friendly way of allowing clients
     * to listen to clicks. You should consider doing this for all your other adapters.
     */
    public void onSkuDetailsClicked(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails item) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/billing/SkuDetailsAdapter$SkuDetailsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Lcom/battlelancer/seriesguide/billing/SkuDetailsAdapter;Landroid/view/ViewGroup;)V", "skuDescription", "Landroid/widget/TextView;", "skuImage", "Landroid/view/View;", "skuPrice", "skuTitle", "bind", "", "item", "Lcom/uwetrottmann/seriesguide/billing/localdb/AugmentedSkuDetails;", "onDisabled", "enabled", "", "app_amazonDebug"})
    public final class SkuDetailsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.view.View skuImage = null;
        private final android.widget.TextView skuTitle = null;
        private final android.widget.TextView skuPrice = null;
        private final android.widget.TextView skuDescription = null;
        
        public SkuDetailsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails item) {
        }
        
        private final void onDisabled(boolean enabled) {
        }
    }
}