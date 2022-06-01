// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class AppwidgetRowDarkBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout appwidgetRow;

  private AppwidgetRowDarkBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout appwidgetRow) {
    this.rootView = rootView;
    this.appwidgetRow = appwidgetRow;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppwidgetRowDarkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppwidgetRowDarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.appwidget_row_dark, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppwidgetRowDarkBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    LinearLayout appwidgetRow = (LinearLayout) rootView;

    return new AppwidgetRowDarkBinding((LinearLayout) rootView, appwidgetRow);
  }
}
