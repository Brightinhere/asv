package com.battlelancer.seriesguide.util;

import java.lang.System;

@kotlin.jvm.JvmName(name = "DialogTools")
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"safeShow", "", "Landroidx/fragment/app/DialogFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "tag", "", "app_amazonDebug"})
public final class DialogTools {
    
    /**
     * If [FragmentManager.isStateSaved] returns `false`, otherwise shows the dialog and returns `true`.
     */
    public static final boolean safeShow(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment $this$safeShow, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return false;
    }
    
    /**
     * If [FragmentManager.isStateSaved] returns `false`, otherwise shows the dialog and returns `true`.
     */
    public static final boolean safeShow(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment $this$safeShow, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentTransaction fragmentTransaction, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return false;
    }
}