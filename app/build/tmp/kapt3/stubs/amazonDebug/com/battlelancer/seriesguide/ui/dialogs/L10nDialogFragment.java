package com.battlelancer.seriesguide.ui.dialogs;

import java.lang.System;

/**
 * A dialog displaying a list of languages to choose from, posting a
 * [L10nDialogFragment.LanguageChangedEvent] if a
 * language different from the given one was chosen.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J@\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0006\"\u0004\b\u0000\u0010\u0012\"\u0006\b\u0001\u0010\u0011\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00110\u0015H\u0082\b\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "currentLanguageIndex", "", "sortedLanguageCodes", "", "", "[Ljava/lang/String;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "postLanguageChangedEvent", "", "selectedLanguagePosition", "mapToArray", "R", "T", "", "transform", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "Companion", "LanguageChangedEvent", "LocalizationItem", "app_amazonDebug"})
public final class L10nDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private java.lang.String[] sortedLanguageCodes;
    private int currentLanguageIndex = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.ui.dialogs.L10nDialogFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG_ADD_DIALOG = "languageDialogAdd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG_DISCOVER = "languageDialogDiscover";
    private static final java.lang.String ARG_SELECTED_LANGUAGE_CODE = "selectedLanguageCode";
    private static final java.lang.String ARG_RES_ID_LANGUAGE_CODES = "resIdLanguageCodes";
    
    public L10nDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void postLanguageChangedEvent(int selectedLanguagePosition) {
    }
    
    /**
     * @param selectedLanguageCode two letter ISO 639-1 language code,
     * plus optional ISO-3166-1 region tag. If null selects first language code.
     */
    @kotlin.jvm.JvmStatic()
    public static final void forShow(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.Nullable()
    java.lang.String selectedLanguageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    /**
     * @param selectedLanguageCode two letter ISO 639-1 language code,
     * plus optional ISO-3166-1 region tag. If null selects first language code.
     */
    @kotlin.jvm.JvmStatic()
    public static final void forPerson(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.Nullable()
    java.lang.String selectedLanguageCode, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment$LanguageChangedEvent;", "", "selectedLanguageCode", "", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "getSelectedLanguageCode", "()Ljava/lang/String;", "getTag", "app_amazonDebug"})
    public static final class LanguageChangedEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String selectedLanguageCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String tag = null;
        
        public LanguageChangedEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String selectedLanguageCode, @org.jetbrains.annotations.Nullable()
        java.lang.String tag) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSelectedLanguageCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTag() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment$LocalizationItem;", "", "code", "", "displayText", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDisplayText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_amazonDebug"})
    public static final class LocalizationItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayText = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.ui.dialogs.L10nDialogFragment.LocalizationItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String code, @org.jetbrains.annotations.NotNull()
        java.lang.String displayText) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public LocalizationItem(@org.jetbrains.annotations.NotNull()
        java.lang.String code, @org.jetbrains.annotations.NotNull()
        java.lang.String displayText) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayText() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007J,\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment$Companion;", "", "()V", "ARG_RES_ID_LANGUAGE_CODES", "", "ARG_SELECTED_LANGUAGE_CODE", "TAG_ADD_DIALOG", "TAG_DISCOVER", "forPerson", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "selectedLanguageCode", "tag", "forShow", "show", "resIdLanguageCodes", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final void show(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String selectedLanguageCode, @androidx.annotation.ArrayRes()
        int resIdLanguageCodes, java.lang.String tag) {
        }
        
        /**
         * @param selectedLanguageCode two letter ISO 639-1 language code,
         * plus optional ISO-3166-1 region tag. If null selects first language code.
         */
        @kotlin.jvm.JvmStatic()
        public final void forShow(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.Nullable()
        java.lang.String selectedLanguageCode, @org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
        }
        
        /**
         * @param selectedLanguageCode two letter ISO 639-1 language code,
         * plus optional ISO-3166-1 region tag. If null selects first language code.
         */
        @kotlin.jvm.JvmStatic()
        public final void forPerson(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.Nullable()
        java.lang.String selectedLanguageCode, @org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
        }
    }
}