package com.battlelancer.seriesguide.shows;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0003\f\r\u000eB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FirstRunView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/battlelancer/seriesguide/databinding/ViewFirstRunBinding;", "onFinishInflate", "", "setFirstRunDismissed", "ButtonEvent", "ButtonType", "Companion", "app_amazonDebug"})
public final class FirstRunView extends android.widget.FrameLayout {
    private final com.battlelancer.seriesguide.databinding.ViewFirstRunBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.FirstRunView.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_KEY_FIRSTRUN = "accepted_eula";
    
    @kotlin.jvm.JvmOverloads()
    public FirstRunView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public FirstRunView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    private final void setFirstRunDismissed() {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean hasSeenFirstRunFragment(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FirstRunView$ButtonType;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "DISMISS", "ADD_SHOW", "SIGN_IN", "RESTORE_BACKUP", "app_amazonDebug"})
    public static enum ButtonType {
        /*public static final*/ DISMISS /* = new DISMISS(0) */,
        /*public static final*/ ADD_SHOW /* = new ADD_SHOW(0) */,
        /*public static final*/ SIGN_IN /* = new SIGN_IN(0) */,
        /*public static final*/ RESTORE_BACKUP /* = new RESTORE_BACKUP(0) */;
        private final int id = 0;
        
        ButtonType(int id) {
        }
        
        public final int getId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FirstRunView$ButtonEvent;", "", "type", "Lcom/battlelancer/seriesguide/shows/FirstRunView$ButtonType;", "(Lcom/battlelancer/seriesguide/shows/FirstRunView$ButtonType;)V", "getType", "()Lcom/battlelancer/seriesguide/shows/FirstRunView$ButtonType;", "app_amazonDebug"})
    public static final class ButtonEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.shows.FirstRunView.ButtonType type = null;
        
        public ButtonEvent(@org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.FirstRunView.ButtonType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.FirstRunView.ButtonType getType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/FirstRunView$Companion;", "", "()V", "PREF_KEY_FIRSTRUN", "", "hasSeenFirstRunFragment", "", "context", "Landroid/content/Context;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final boolean hasSeenFirstRunFragment(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
}