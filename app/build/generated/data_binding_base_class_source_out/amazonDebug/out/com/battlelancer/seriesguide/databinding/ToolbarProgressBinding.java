// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarProgressBinding implements ViewBinding {
  @NonNull
  private final Toolbar rootView;

  @NonNull
  public final ProgressBar progressBarTabs;

  @NonNull
  public final Toolbar sgToolbar;

  private ToolbarProgressBinding(@NonNull Toolbar rootView, @NonNull ProgressBar progressBarTabs,
      @NonNull Toolbar sgToolbar) {
    this.rootView = rootView;
    this.progressBarTabs = progressBarTabs;
    this.sgToolbar = sgToolbar;
  }

  @Override
  @NonNull
  public Toolbar getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarProgressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_progress, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarProgressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBarTabs;
      ProgressBar progressBarTabs = ViewBindings.findChildViewById(rootView, id);
      if (progressBarTabs == null) {
        break missingId;
      }

      Toolbar sgToolbar = (Toolbar) rootView;

      return new ToolbarProgressBinding((Toolbar) rootView, progressBarTabs, sgToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
