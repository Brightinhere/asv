// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogLocalizationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonDismiss;

  @NonNull
  public final Button buttonLocalizationLanguage;

  @NonNull
  public final Button buttonLocalizationRegion;

  @NonNull
  public final RecyclerView recyclerViewLocalization;

  @NonNull
  public final LinearLayout root;

  @NonNull
  public final TextView textViewLocalizationLanguage;

  @NonNull
  public final TextView textViewLocalizationRegion;

  private DialogLocalizationBinding(@NonNull LinearLayout rootView, @NonNull Button buttonDismiss,
      @NonNull Button buttonLocalizationLanguage, @NonNull Button buttonLocalizationRegion,
      @NonNull RecyclerView recyclerViewLocalization, @NonNull LinearLayout root,
      @NonNull TextView textViewLocalizationLanguage,
      @NonNull TextView textViewLocalizationRegion) {
    this.rootView = rootView;
    this.buttonDismiss = buttonDismiss;
    this.buttonLocalizationLanguage = buttonLocalizationLanguage;
    this.buttonLocalizationRegion = buttonLocalizationRegion;
    this.recyclerViewLocalization = recyclerViewLocalization;
    this.root = root;
    this.textViewLocalizationLanguage = textViewLocalizationLanguage;
    this.textViewLocalizationRegion = textViewLocalizationRegion;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogLocalizationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogLocalizationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_localization, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogLocalizationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDismiss;
      Button buttonDismiss = ViewBindings.findChildViewById(rootView, id);
      if (buttonDismiss == null) {
        break missingId;
      }

      id = R.id.buttonLocalizationLanguage;
      Button buttonLocalizationLanguage = ViewBindings.findChildViewById(rootView, id);
      if (buttonLocalizationLanguage == null) {
        break missingId;
      }

      id = R.id.buttonLocalizationRegion;
      Button buttonLocalizationRegion = ViewBindings.findChildViewById(rootView, id);
      if (buttonLocalizationRegion == null) {
        break missingId;
      }

      id = R.id.recyclerViewLocalization;
      RecyclerView recyclerViewLocalization = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewLocalization == null) {
        break missingId;
      }

      LinearLayout root = (LinearLayout) rootView;

      id = R.id.textViewLocalizationLanguage;
      TextView textViewLocalizationLanguage = ViewBindings.findChildViewById(rootView, id);
      if (textViewLocalizationLanguage == null) {
        break missingId;
      }

      id = R.id.textViewLocalizationRegion;
      TextView textViewLocalizationRegion = ViewBindings.findChildViewById(rootView, id);
      if (textViewLocalizationRegion == null) {
        break missingId;
      }

      return new DialogLocalizationBinding((LinearLayout) rootView, buttonDismiss,
          buttonLocalizationLanguage, buttonLocalizationRegion, recyclerViewLocalization, root,
          textViewLocalizationLanguage, textViewLocalizationRegion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
