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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutSnackbarSgBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonSnackbar;

  @NonNull
  public final LinearLayout containerSnackbar;

  @NonNull
  public final TextView textViewSnackbar;

  private LayoutSnackbarSgBinding(@NonNull LinearLayout rootView, @NonNull Button buttonSnackbar,
      @NonNull LinearLayout containerSnackbar, @NonNull TextView textViewSnackbar) {
    this.rootView = rootView;
    this.buttonSnackbar = buttonSnackbar;
    this.containerSnackbar = containerSnackbar;
    this.textViewSnackbar = textViewSnackbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutSnackbarSgBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutSnackbarSgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_snackbar_sg, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutSnackbarSgBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSnackbar;
      Button buttonSnackbar = ViewBindings.findChildViewById(rootView, id);
      if (buttonSnackbar == null) {
        break missingId;
      }

      LinearLayout containerSnackbar = (LinearLayout) rootView;

      id = R.id.textViewSnackbar;
      TextView textViewSnackbar = ViewBindings.findChildViewById(rootView, id);
      if (textViewSnackbar == null) {
        break missingId;
      }

      return new LayoutSnackbarSgBinding((LinearLayout) rootView, buttonSnackbar, containerSnackbar,
          textViewSnackbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}