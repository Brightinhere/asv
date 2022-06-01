// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMoviesBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout containerMovies;

  @NonNull
  public final GridView gridViewMovies;

  @NonNull
  public final TextView textViewMoviesEmpty;

  private FragmentMoviesBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout containerMovies, @NonNull GridView gridViewMovies,
      @NonNull TextView textViewMoviesEmpty) {
    this.rootView = rootView;
    this.containerMovies = containerMovies;
    this.gridViewMovies = gridViewMovies;
    this.textViewMoviesEmpty = textViewMoviesEmpty;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_movies, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMoviesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout containerMovies = (RelativeLayout) rootView;

      id = R.id.gridViewMovies;
      GridView gridViewMovies = ViewBindings.findChildViewById(rootView, id);
      if (gridViewMovies == null) {
        break missingId;
      }

      id = R.id.textViewMoviesEmpty;
      TextView textViewMoviesEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoviesEmpty == null) {
        break missingId;
      }

      return new FragmentMoviesBinding((RelativeLayout) rootView, containerMovies, gridViewMovies,
          textViewMoviesEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
