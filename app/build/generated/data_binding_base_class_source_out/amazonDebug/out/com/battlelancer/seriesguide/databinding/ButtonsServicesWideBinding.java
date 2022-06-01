// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ButtonsServicesWideBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout containerEpisodeActions;

  @NonNull
  public final ButtonsEpisodeMoreBinding includeMore;

  private ButtonsServicesWideBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout containerEpisodeActions,
      @NonNull ButtonsEpisodeMoreBinding includeMore) {
    this.rootView = rootView;
    this.containerEpisodeActions = containerEpisodeActions;
    this.includeMore = includeMore;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ButtonsServicesWideBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ButtonsServicesWideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.buttons_services_wide, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ButtonsServicesWideBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.containerEpisodeActions;
      LinearLayout containerEpisodeActions = ViewBindings.findChildViewById(rootView, id);
      if (containerEpisodeActions == null) {
        break missingId;
      }

      id = R.id.include_more;
      View includeMore = ViewBindings.findChildViewById(rootView, id);
      if (includeMore == null) {
        break missingId;
      }
      ButtonsEpisodeMoreBinding binding_includeMore = ButtonsEpisodeMoreBinding.bind(includeMore);

      return new ButtonsServicesWideBinding((LinearLayout) rootView, containerEpisodeActions,
          binding_includeMore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}