// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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

public final class FragmentSeasonsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imageViewSeasonsCollectedToggle;

  @NonNull
  public final ImageView imageViewSeasonsWatchedToggle;

  @NonNull
  public final RecyclerView recyclerViewSeasons;

  @NonNull
  public final TextView textViewSeasonsRemaining;

  private FragmentSeasonsBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView imageViewSeasonsCollectedToggle,
      @NonNull ImageView imageViewSeasonsWatchedToggle, @NonNull RecyclerView recyclerViewSeasons,
      @NonNull TextView textViewSeasonsRemaining) {
    this.rootView = rootView;
    this.imageViewSeasonsCollectedToggle = imageViewSeasonsCollectedToggle;
    this.imageViewSeasonsWatchedToggle = imageViewSeasonsWatchedToggle;
    this.recyclerViewSeasons = recyclerViewSeasons;
    this.textViewSeasonsRemaining = textViewSeasonsRemaining;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSeasonsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSeasonsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_seasons, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSeasonsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewSeasonsCollectedToggle;
      ImageView imageViewSeasonsCollectedToggle = ViewBindings.findChildViewById(rootView, id);
      if (imageViewSeasonsCollectedToggle == null) {
        break missingId;
      }

      id = R.id.imageViewSeasonsWatchedToggle;
      ImageView imageViewSeasonsWatchedToggle = ViewBindings.findChildViewById(rootView, id);
      if (imageViewSeasonsWatchedToggle == null) {
        break missingId;
      }

      id = R.id.recyclerViewSeasons;
      RecyclerView recyclerViewSeasons = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewSeasons == null) {
        break missingId;
      }

      id = R.id.textViewSeasonsRemaining;
      TextView textViewSeasonsRemaining = ViewBindings.findChildViewById(rootView, id);
      if (textViewSeasonsRemaining == null) {
        break missingId;
      }

      return new FragmentSeasonsBinding((RelativeLayout) rootView, imageViewSeasonsCollectedToggle,
          imageViewSeasonsWatchedToggle, recyclerViewSeasons, textViewSeasonsRemaining);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
