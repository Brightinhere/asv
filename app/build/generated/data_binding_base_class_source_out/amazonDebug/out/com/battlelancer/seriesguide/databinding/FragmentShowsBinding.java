// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentShowsBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button emptyViewShows;

  @NonNull
  public final Button emptyViewShowsFilter;

  @NonNull
  public final RecyclerView recyclerViewShows;

  @NonNull
  public final FrameLayout showsFragment;

  private FragmentShowsBinding(@NonNull FrameLayout rootView, @NonNull Button emptyViewShows,
      @NonNull Button emptyViewShowsFilter, @NonNull RecyclerView recyclerViewShows,
      @NonNull FrameLayout showsFragment) {
    this.rootView = rootView;
    this.emptyViewShows = emptyViewShows;
    this.emptyViewShowsFilter = emptyViewShowsFilter;
    this.recyclerViewShows = recyclerViewShows;
    this.showsFragment = showsFragment;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentShowsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentShowsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_shows, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentShowsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptyViewShows;
      Button emptyViewShows = ViewBindings.findChildViewById(rootView, id);
      if (emptyViewShows == null) {
        break missingId;
      }

      id = R.id.emptyViewShowsFilter;
      Button emptyViewShowsFilter = ViewBindings.findChildViewById(rootView, id);
      if (emptyViewShowsFilter == null) {
        break missingId;
      }

      id = R.id.recyclerViewShows;
      RecyclerView recyclerViewShows = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewShows == null) {
        break missingId;
      }

      FrameLayout showsFragment = (FrameLayout) rootView;

      return new FragmentShowsBinding((FrameLayout) rootView, emptyViewShows, emptyViewShowsFilter,
          recyclerViewShows, showsFragment);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
