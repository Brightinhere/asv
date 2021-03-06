// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.EmptyView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStatsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EmptyView errorView;

  @NonNull
  public final TextView labelMovies;

  @NonNull
  public final TextView labelStatsEpisodes;

  @NonNull
  public final TextView labelStatsShows;

  @NonNull
  public final ProgressBar progressBarEpisodesRuntime;

  @NonNull
  public final ProgressBar progressBarEpisodesWatched;

  @NonNull
  public final ProgressBar progressBarMoviesCollection;

  @NonNull
  public final ProgressBar progressBarMoviesWatched;

  @NonNull
  public final ProgressBar progressBarShowsContinuing;

  @NonNull
  public final ProgressBar progressBarShowsFinished;

  @NonNull
  public final ProgressBar progressBarShowsWithNextEpisode;

  @NonNull
  public final ConstraintLayout relativeLayout;

  @NonNull
  public final TextView textViewEpisodes;

  @NonNull
  public final TextView textViewEpisodesRuntime;

  @NonNull
  public final TextView textViewEpisodesWatched;

  @NonNull
  public final TextView textViewMovies;

  @NonNull
  public final TextView textViewMoviesCollection;

  @NonNull
  public final TextView textViewMoviesCollectionRuntime;

  @NonNull
  public final TextView textViewMoviesWatched;

  @NonNull
  public final TextView textViewMoviesWatchedRuntime;

  @NonNull
  public final TextView textViewMoviesWatchlist;

  @NonNull
  public final TextView textViewMoviesWatchlistRuntime;

  @NonNull
  public final TextView textViewShows;

  @NonNull
  public final TextView textViewShowsContinuing;

  @NonNull
  public final TextView textViewShowsFinished;

  @NonNull
  public final TextView textViewShowsWithNextEpisode;

  private FragmentStatsBinding(@NonNull ScrollView rootView, @NonNull EmptyView errorView,
      @NonNull TextView labelMovies, @NonNull TextView labelStatsEpisodes,
      @NonNull TextView labelStatsShows, @NonNull ProgressBar progressBarEpisodesRuntime,
      @NonNull ProgressBar progressBarEpisodesWatched,
      @NonNull ProgressBar progressBarMoviesCollection,
      @NonNull ProgressBar progressBarMoviesWatched,
      @NonNull ProgressBar progressBarShowsContinuing,
      @NonNull ProgressBar progressBarShowsFinished,
      @NonNull ProgressBar progressBarShowsWithNextEpisode,
      @NonNull ConstraintLayout relativeLayout, @NonNull TextView textViewEpisodes,
      @NonNull TextView textViewEpisodesRuntime, @NonNull TextView textViewEpisodesWatched,
      @NonNull TextView textViewMovies, @NonNull TextView textViewMoviesCollection,
      @NonNull TextView textViewMoviesCollectionRuntime, @NonNull TextView textViewMoviesWatched,
      @NonNull TextView textViewMoviesWatchedRuntime, @NonNull TextView textViewMoviesWatchlist,
      @NonNull TextView textViewMoviesWatchlistRuntime, @NonNull TextView textViewShows,
      @NonNull TextView textViewShowsContinuing, @NonNull TextView textViewShowsFinished,
      @NonNull TextView textViewShowsWithNextEpisode) {
    this.rootView = rootView;
    this.errorView = errorView;
    this.labelMovies = labelMovies;
    this.labelStatsEpisodes = labelStatsEpisodes;
    this.labelStatsShows = labelStatsShows;
    this.progressBarEpisodesRuntime = progressBarEpisodesRuntime;
    this.progressBarEpisodesWatched = progressBarEpisodesWatched;
    this.progressBarMoviesCollection = progressBarMoviesCollection;
    this.progressBarMoviesWatched = progressBarMoviesWatched;
    this.progressBarShowsContinuing = progressBarShowsContinuing;
    this.progressBarShowsFinished = progressBarShowsFinished;
    this.progressBarShowsWithNextEpisode = progressBarShowsWithNextEpisode;
    this.relativeLayout = relativeLayout;
    this.textViewEpisodes = textViewEpisodes;
    this.textViewEpisodesRuntime = textViewEpisodesRuntime;
    this.textViewEpisodesWatched = textViewEpisodesWatched;
    this.textViewMovies = textViewMovies;
    this.textViewMoviesCollection = textViewMoviesCollection;
    this.textViewMoviesCollectionRuntime = textViewMoviesCollectionRuntime;
    this.textViewMoviesWatched = textViewMoviesWatched;
    this.textViewMoviesWatchedRuntime = textViewMoviesWatchedRuntime;
    this.textViewMoviesWatchlist = textViewMoviesWatchlist;
    this.textViewMoviesWatchlistRuntime = textViewMoviesWatchlistRuntime;
    this.textViewShows = textViewShows;
    this.textViewShowsContinuing = textViewShowsContinuing;
    this.textViewShowsFinished = textViewShowsFinished;
    this.textViewShowsWithNextEpisode = textViewShowsWithNextEpisode;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStatsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStatsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_stats, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStatsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.errorView;
      EmptyView errorView = ViewBindings.findChildViewById(rootView, id);
      if (errorView == null) {
        break missingId;
      }

      id = R.id.labelMovies;
      TextView labelMovies = ViewBindings.findChildViewById(rootView, id);
      if (labelMovies == null) {
        break missingId;
      }

      id = R.id.labelStatsEpisodes;
      TextView labelStatsEpisodes = ViewBindings.findChildViewById(rootView, id);
      if (labelStatsEpisodes == null) {
        break missingId;
      }

      id = R.id.labelStatsShows;
      TextView labelStatsShows = ViewBindings.findChildViewById(rootView, id);
      if (labelStatsShows == null) {
        break missingId;
      }

      id = R.id.progressBarEpisodesRuntime;
      ProgressBar progressBarEpisodesRuntime = ViewBindings.findChildViewById(rootView, id);
      if (progressBarEpisodesRuntime == null) {
        break missingId;
      }

      id = R.id.progressBarEpisodesWatched;
      ProgressBar progressBarEpisodesWatched = ViewBindings.findChildViewById(rootView, id);
      if (progressBarEpisodesWatched == null) {
        break missingId;
      }

      id = R.id.progressBarMoviesCollection;
      ProgressBar progressBarMoviesCollection = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMoviesCollection == null) {
        break missingId;
      }

      id = R.id.progressBarMoviesWatched;
      ProgressBar progressBarMoviesWatched = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMoviesWatched == null) {
        break missingId;
      }

      id = R.id.progressBarShowsContinuing;
      ProgressBar progressBarShowsContinuing = ViewBindings.findChildViewById(rootView, id);
      if (progressBarShowsContinuing == null) {
        break missingId;
      }

      id = R.id.progressBarShowsFinished;
      ProgressBar progressBarShowsFinished = ViewBindings.findChildViewById(rootView, id);
      if (progressBarShowsFinished == null) {
        break missingId;
      }

      id = R.id.progressBarShowsWithNextEpisode;
      ProgressBar progressBarShowsWithNextEpisode = ViewBindings.findChildViewById(rootView, id);
      if (progressBarShowsWithNextEpisode == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      ConstraintLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.textViewEpisodes;
      TextView textViewEpisodes = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodes == null) {
        break missingId;
      }

      id = R.id.textViewEpisodesRuntime;
      TextView textViewEpisodesRuntime = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodesRuntime == null) {
        break missingId;
      }

      id = R.id.textViewEpisodesWatched;
      TextView textViewEpisodesWatched = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodesWatched == null) {
        break missingId;
      }

      id = R.id.textViewMovies;
      TextView textViewMovies = ViewBindings.findChildViewById(rootView, id);
      if (textViewMovies == null) {
        break missingId;
      }

      id = R.id.textViewMoviesCollection;
      TextView textViewMoviesCollection = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoviesCollection == null) {
        break missingId;
      }

      id = R.id.textViewMoviesCollectionRuntime;
      TextView textViewMoviesCollectionRuntime = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoviesCollectionRuntime == null) {
        break missingId;
      }

      id = R.id.textViewMoviesWatched;
      TextView textViewMoviesWatched = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoviesWatched == null) {
        break missingId;
      }

      id = R.id.textViewMoviesWatchedRuntime;
      TextView textViewMoviesWatchedRuntime = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoviesWatchedRuntime == null) {
        break missingId;
      }

      id = R.id.textViewMoviesWatchlist;
      TextView textViewMoviesWatchlist = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoviesWatchlist == null) {
        break missingId;
      }

      id = R.id.textViewMoviesWatchlistRuntime;
      TextView textViewMoviesWatchlistRuntime = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoviesWatchlistRuntime == null) {
        break missingId;
      }

      id = R.id.textViewShows;
      TextView textViewShows = ViewBindings.findChildViewById(rootView, id);
      if (textViewShows == null) {
        break missingId;
      }

      id = R.id.textViewShowsContinuing;
      TextView textViewShowsContinuing = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowsContinuing == null) {
        break missingId;
      }

      id = R.id.textViewShowsFinished;
      TextView textViewShowsFinished = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowsFinished == null) {
        break missingId;
      }

      id = R.id.textViewShowsWithNextEpisode;
      TextView textViewShowsWithNextEpisode = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowsWithNextEpisode == null) {
        break missingId;
      }

      return new FragmentStatsBinding((ScrollView) rootView, errorView, labelMovies,
          labelStatsEpisodes, labelStatsShows, progressBarEpisodesRuntime,
          progressBarEpisodesWatched, progressBarMoviesCollection, progressBarMoviesWatched,
          progressBarShowsContinuing, progressBarShowsFinished, progressBarShowsWithNextEpisode,
          relativeLayout, textViewEpisodes, textViewEpisodesRuntime, textViewEpisodesWatched,
          textViewMovies, textViewMoviesCollection, textViewMoviesCollectionRuntime,
          textViewMoviesWatched, textViewMoviesWatchedRuntime, textViewMoviesWatchlist,
          textViewMoviesWatchlistRuntime, textViewShows, textViewShowsContinuing,
          textViewShowsFinished, textViewShowsWithNextEpisode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
