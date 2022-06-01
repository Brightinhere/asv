package com.battlelancer.seriesguide.ui.widgets;

import java.lang.System;

/**
 * Three state check box for filter being disabled, included or excluded.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/ui/widgets/FilterBox;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/battlelancer/seriesguide/databinding/ViewFilterBoxBinding;", "filterDescription", "", "value", "", "state", "getState", "()Ljava/lang/Boolean;", "setState", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "moveToNextState", "", "onFinishInflate", "performClick", "updateState", "app_pureDebug"})
public final class FilterBox extends android.widget.LinearLayout {
    private final java.lang.String filterDescription = null;
    private final com.battlelancer.seriesguide.databinding.ViewFilterBoxBinding binding = null;
    
    /**
     * Pass `null` to disable filter, `true` to include and `false` to exclude.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean state;
    
    @kotlin.jvm.JvmOverloads()
    public FilterBox(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public FilterBox(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public FilterBox(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    private final void updateState() {
    }
    
    @java.lang.Override()
    public boolean performClick() {
        return false;
    }
    
    private final void moveToNextState() {
    }
}