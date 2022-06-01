package com.battlelancer.seriesguide.extensions;

import java.lang.System;

/**
 * Creates views for a list of [Extension].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0012\u0013\u0014B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/battlelancer/seriesguide/extensions/Extension;", "context", "Landroid/content/Context;", "onItemClickListener", "Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter$OnItemClickListener;)V", "getCount", "", "getItemViewType", "position", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "getViewTypeCount", "Companion", "OnItemClickListener", "ViewHolder", "app_amazonDebug"})
public final class ExtensionsAdapter extends android.widget.ArrayAdapter<com.battlelancer.seriesguide.extensions.Extension> {
    private final com.battlelancer.seriesguide.extensions.ExtensionsAdapter.OnItemClickListener onItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.extensions.ExtensionsAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_EXTENSION = 0;
    private static final int VIEW_TYPE_ADD = 1;
    
    public ExtensionsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.extensions.ExtensionsAdapter.OnItemClickListener onItemClickListener) {
        super(null, 0);
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getViewTypeCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter$OnItemClickListener;", "", "onAddExtensionClick", "", "anchor", "Landroid/view/View;", "onExtensionMenuButtonClick", "extension", "Lcom/battlelancer/seriesguide/extensions/Extension;", "position", "", "app_amazonDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onExtensionMenuButtonClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.extensions.Extension extension, int position);
        
        public abstract void onAddExtensionClick(@org.jetbrains.annotations.NotNull()
        android.view.View anchor);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter$ViewHolder;", "", "binding", "Lcom/battlelancer/seriesguide/databinding/ItemExtensionBinding;", "onItemClickListener", "Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter$OnItemClickListener;", "(Lcom/battlelancer/seriesguide/databinding/ItemExtensionBinding;Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter$OnItemClickListener;)V", "drawableIcon", "Landroid/graphics/drawable/Drawable;", "extension", "Lcom/battlelancer/seriesguide/extensions/Extension;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "bindTo", "", "app_amazonDebug"})
    public static final class ViewHolder {
        private final com.battlelancer.seriesguide.databinding.ItemExtensionBinding binding = null;
        private final android.graphics.drawable.Drawable drawableIcon = null;
        private com.battlelancer.seriesguide.extensions.Extension extension;
        private int position = 0;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.databinding.ItemExtensionBinding binding, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.extensions.ExtensionsAdapter.OnItemClickListener onItemClickListener) {
            super();
        }
        
        public final int getPosition() {
            return 0;
        }
        
        public final void setPosition(int p0) {
        }
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.extensions.Extension extension, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/ExtensionsAdapter$Companion;", "", "()V", "VIEW_TYPE_ADD", "", "VIEW_TYPE_EXTENSION", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}