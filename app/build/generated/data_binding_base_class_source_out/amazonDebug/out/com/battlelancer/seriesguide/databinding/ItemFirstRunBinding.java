// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.shows.FirstRunView;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemFirstRunBinding implements ViewBinding {
  @NonNull
  private final FirstRunView rootView;

  private ItemFirstRunBinding(@NonNull FirstRunView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public FirstRunView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFirstRunBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFirstRunBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_first_run, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFirstRunBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ItemFirstRunBinding((FirstRunView) rootView);
  }
}