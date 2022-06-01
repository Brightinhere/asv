package com.battlelancer.seriesguide.preferences;

import java.lang.System;

/**
 * Dialog which allows to select the number of hours (between +/-24)
 * to offset show release times by.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/battlelancer/seriesguide/preferences/TimeOffsetDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "binding", "Lcom/battlelancer/seriesguide/databinding/DialogTimeOffsetBinding;", "hours", "", "textWatcher", "Landroid/text/TextWatcher;", "formatToTimeString", "", "localDateTime", "Lorg/threeten/bp/LocalDateTime;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "parseAndUpdateValue", "s", "Landroid/text/Editable;", "saveAndDismiss", "updateSummaryAndExample", "value", "app_pureDebug"})
public final class TimeOffsetDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private com.battlelancer.seriesguide.databinding.DialogTimeOffsetBinding binding;
    private int hours = 0;
    private final android.text.TextWatcher textWatcher = null;
    
    public TimeOffsetDialogFragment() {
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void updateSummaryAndExample(int value) {
    }
    
    private final java.lang.CharSequence formatToTimeString(org.threeten.bp.LocalDateTime localDateTime) {
        return null;
    }
    
    private final void saveAndDismiss() {
    }
}