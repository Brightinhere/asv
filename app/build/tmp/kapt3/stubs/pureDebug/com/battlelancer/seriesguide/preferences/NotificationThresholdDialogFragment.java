package com.battlelancer.seriesguide.preferences;

import java.lang.System;

/**
 * Dialog which allows to select the number of minutes, hours or days when a notification should
 * appear before an episode is released.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/NotificationThresholdDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogNotificationThresholdBinding;", "textWatcher", "Landroid/text/TextWatcher;", "value", "", "getQuantityStringWithoutPlaceholder", "", "pattern", "Ljava/util/regex/Pattern;", "res", "Landroid/content/res/Resources;", "pluralsRes", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "parseAndUpdateValue", "s", "Landroid/text/Editable;", "saveAndDismiss", "updateRadioButtons", "app_pureDebug"})
public final class NotificationThresholdDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogNotificationThresholdBinding binding;
    private int value = 0;
    private final android.text.TextWatcher textWatcher = null;
    
    public NotificationThresholdDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void parseAndUpdateValue(android.text.Editable s) {
    }
    
    private final void updateRadioButtons(int value) {
    }
    
    private final java.lang.String getQuantityStringWithoutPlaceholder(java.util.regex.Pattern pattern, android.content.res.Resources res, @androidx.annotation.PluralsRes()
    int pluralsRes, int value) {
        return null;
    }
    
    private final void saveAndDismiss() {
    }
}