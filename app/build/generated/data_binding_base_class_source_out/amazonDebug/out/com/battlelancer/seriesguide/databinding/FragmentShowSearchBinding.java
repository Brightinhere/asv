// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.EmptyView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentShowSearchBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final GridView gridViewSearch;

  @NonNull
  public final FrameLayout searchFragment;

  @NonNull
  public final EmptyView textViewSearchEmpty;

  private FragmentShowSearchBinding(@NonNull FrameLayout rootView, @NonNull GridView gridViewSearch,
      @NonNull FrameLayout searchFragment, @NonNull EmptyView textViewSearchEmpty) {
    this.rootView = rootView;
    this.gridViewSearch = gridViewSearch;
    this.searchFragment = searchFragment;
    this.textViewSearchEmpty = textViewSearchEmpty;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentShowSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentShowSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_show_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentShowSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gridViewSearch;
      GridView gridViewSearch = ViewBindings.findChildViewById(rootView, id);
      if (gridViewSearch == null) {
        break missingId;
      }

      FrameLayout searchFragment = (FrameLayout) rootView;

      id = R.id.textViewSearchEmpty;
      EmptyView textViewSearchEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textViewSearchEmpty == null) {
        break missingId;
      }

      return new FragmentShowSearchBinding((FrameLayout) rootView, gridViewSearch, searchFragment,
          textViewSearchEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
