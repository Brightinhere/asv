// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewSortShowsBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final CheckBox checkboxShowsSortFavorites;

  @NonNull
  public final CheckBox checkboxShowsSortIgnoreArticles;

  @NonNull
  public final RadioGroup radioGroupShowsSort;

  @NonNull
  public final RadioButton radioShowsSortLastWatched;

  @NonNull
  public final RadioButton radioShowsSortLatestEpisode;

  @NonNull
  public final RadioButton radioShowsSortOldestEpisode;

  @NonNull
  public final RadioButton radioShowsSortRemaining;

  @NonNull
  public final RadioButton radioShowsSortStatus;

  @NonNull
  public final RadioButton radioShowsSortTitle;

  private ViewSortShowsBinding(@NonNull View rootView, @NonNull CheckBox checkboxShowsSortFavorites,
      @NonNull CheckBox checkboxShowsSortIgnoreArticles, @NonNull RadioGroup radioGroupShowsSort,
      @NonNull RadioButton radioShowsSortLastWatched,
      @NonNull RadioButton radioShowsSortLatestEpisode,
      @NonNull RadioButton radioShowsSortOldestEpisode,
      @NonNull RadioButton radioShowsSortRemaining, @NonNull RadioButton radioShowsSortStatus,
      @NonNull RadioButton radioShowsSortTitle) {
    this.rootView = rootView;
    this.checkboxShowsSortFavorites = checkboxShowsSortFavorites;
    this.checkboxShowsSortIgnoreArticles = checkboxShowsSortIgnoreArticles;
    this.radioGroupShowsSort = radioGroupShowsSort;
    this.radioShowsSortLastWatched = radioShowsSortLastWatched;
    this.radioShowsSortLatestEpisode = radioShowsSortLatestEpisode;
    this.radioShowsSortOldestEpisode = radioShowsSortOldestEpisode;
    this.radioShowsSortRemaining = radioShowsSortRemaining;
    this.radioShowsSortStatus = radioShowsSortStatus;
    this.radioShowsSortTitle = radioShowsSortTitle;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewSortShowsBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.view_sort_shows, parent);
    return bind(parent);
  }

  @NonNull
  public static ViewSortShowsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkbox_shows_sort_favorites;
      CheckBox checkboxShowsSortFavorites = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsSortFavorites == null) {
        break missingId;
      }

      id = R.id.checkbox_shows_sort_ignore_articles;
      CheckBox checkboxShowsSortIgnoreArticles = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsSortIgnoreArticles == null) {
        break missingId;
      }

      id = R.id.radio_group_shows_sort;
      RadioGroup radioGroupShowsSort = ViewBindings.findChildViewById(rootView, id);
      if (radioGroupShowsSort == null) {
        break missingId;
      }

      id = R.id.radio_shows_sort_last_watched;
      RadioButton radioShowsSortLastWatched = ViewBindings.findChildViewById(rootView, id);
      if (radioShowsSortLastWatched == null) {
        break missingId;
      }

      id = R.id.radio_shows_sort_latest_episode;
      RadioButton radioShowsSortLatestEpisode = ViewBindings.findChildViewById(rootView, id);
      if (radioShowsSortLatestEpisode == null) {
        break missingId;
      }

      id = R.id.radio_shows_sort_oldest_episode;
      RadioButton radioShowsSortOldestEpisode = ViewBindings.findChildViewById(rootView, id);
      if (radioShowsSortOldestEpisode == null) {
        break missingId;
      }

      id = R.id.radio_shows_sort_remaining;
      RadioButton radioShowsSortRemaining = ViewBindings.findChildViewById(rootView, id);
      if (radioShowsSortRemaining == null) {
        break missingId;
      }

      id = R.id.radio_shows_sort_status;
      RadioButton radioShowsSortStatus = ViewBindings.findChildViewById(rootView, id);
      if (radioShowsSortStatus == null) {
        break missingId;
      }

      id = R.id.radio_shows_sort_title;
      RadioButton radioShowsSortTitle = ViewBindings.findChildViewById(rootView, id);
      if (radioShowsSortTitle == null) {
        break missingId;
      }

      return new ViewSortShowsBinding(rootView, checkboxShowsSortFavorites,
          checkboxShowsSortIgnoreArticles, radioGroupShowsSort, radioShowsSortLastWatched,
          radioShowsSortLatestEpisode, radioShowsSortOldestEpisode, radioShowsSortRemaining,
          radioShowsSortStatus, radioShowsSortTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}