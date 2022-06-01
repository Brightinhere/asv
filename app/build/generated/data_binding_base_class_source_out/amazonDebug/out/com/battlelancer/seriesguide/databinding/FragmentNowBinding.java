// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNowBinding implements ViewBinding {
  @NonNull
  private final EmptyViewSwipeRefreshLayout rootView;

  @NonNull
  public final TextView emptyViewNow;

  @NonNull
  public final RecyclerView recyclerViewNow;

  @NonNull
  public final ScrollView scrollViewNow;

  @NonNull
  public final EmptyViewSwipeRefreshLayout swipeRefreshLayoutNow;

  private FragmentNowBinding(@NonNull EmptyViewSwipeRefreshLayout rootView,
      @NonNull TextView emptyViewNow, @NonNull RecyclerView recyclerViewNow,
      @NonNull ScrollView scrollViewNow,
      @NonNull EmptyViewSwipeRefreshLayout swipeRefreshLayoutNow) {
    this.rootView = rootView;
    this.emptyViewNow = emptyViewNow;
    this.recyclerViewNow = recyclerViewNow;
    this.scrollViewNow = scrollViewNow;
    this.swipeRefreshLayoutNow = swipeRefreshLayoutNow;
  }

  @Override
  @NonNull
  public EmptyViewSwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_now, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptyViewNow;
      TextView emptyViewNow = ViewBindings.findChildViewById(rootView, id);
      if (emptyViewNow == null) {
        break missingId;
      }

      id = R.id.recyclerViewNow;
      RecyclerView recyclerViewNow = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewNow == null) {
        break missingId;
      }

      id = R.id.scrollViewNow;
      ScrollView scrollViewNow = ViewBindings.findChildViewById(rootView, id);
      if (scrollViewNow == null) {
        break missingId;
      }

      EmptyViewSwipeRefreshLayout swipeRefreshLayoutNow = (EmptyViewSwipeRefreshLayout) rootView;

      return new FragmentNowBinding((EmptyViewSwipeRefreshLayout) rootView, emptyViewNow,
          recyclerViewNow, scrollViewNow, swipeRefreshLayoutNow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}