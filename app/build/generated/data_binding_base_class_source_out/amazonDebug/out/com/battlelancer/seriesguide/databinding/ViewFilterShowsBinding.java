// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.FilterBox;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewFilterShowsBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final Button buttonShowsFilterAllVisible;

  @NonNull
  public final Button buttonShowsFilterRemove;

  @NonNull
  public final ImageButton buttonShowsFilterUpcomingRange;

  @NonNull
  public final FilterBox checkboxShowsFilterContinuing;

  @NonNull
  public final FilterBox checkboxShowsFilterFavorites;

  @NonNull
  public final FilterBox checkboxShowsFilterHidden;

  @NonNull
  public final CheckBox checkboxShowsFilterNoReleased;

  @NonNull
  public final FilterBox checkboxShowsFilterUnwatched;

  @NonNull
  public final FilterBox checkboxShowsFilterUpcoming;

  private ViewFilterShowsBinding(@NonNull View rootView,
      @NonNull Button buttonShowsFilterAllVisible, @NonNull Button buttonShowsFilterRemove,
      @NonNull ImageButton buttonShowsFilterUpcomingRange,
      @NonNull FilterBox checkboxShowsFilterContinuing,
      @NonNull FilterBox checkboxShowsFilterFavorites, @NonNull FilterBox checkboxShowsFilterHidden,
      @NonNull CheckBox checkboxShowsFilterNoReleased,
      @NonNull FilterBox checkboxShowsFilterUnwatched,
      @NonNull FilterBox checkboxShowsFilterUpcoming) {
    this.rootView = rootView;
    this.buttonShowsFilterAllVisible = buttonShowsFilterAllVisible;
    this.buttonShowsFilterRemove = buttonShowsFilterRemove;
    this.buttonShowsFilterUpcomingRange = buttonShowsFilterUpcomingRange;
    this.checkboxShowsFilterContinuing = checkboxShowsFilterContinuing;
    this.checkboxShowsFilterFavorites = checkboxShowsFilterFavorites;
    this.checkboxShowsFilterHidden = checkboxShowsFilterHidden;
    this.checkboxShowsFilterNoReleased = checkboxShowsFilterNoReleased;
    this.checkboxShowsFilterUnwatched = checkboxShowsFilterUnwatched;
    this.checkboxShowsFilterUpcoming = checkboxShowsFilterUpcoming;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewFilterShowsBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.view_filter_shows, parent);
    return bind(parent);
  }

  @NonNull
  public static ViewFilterShowsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_shows_filter_all_visible;
      Button buttonShowsFilterAllVisible = ViewBindings.findChildViewById(rootView, id);
      if (buttonShowsFilterAllVisible == null) {
        break missingId;
      }

      id = R.id.button_shows_filter_remove;
      Button buttonShowsFilterRemove = ViewBindings.findChildViewById(rootView, id);
      if (buttonShowsFilterRemove == null) {
        break missingId;
      }

      id = R.id.button_shows_filter_upcoming_range;
      ImageButton buttonShowsFilterUpcomingRange = ViewBindings.findChildViewById(rootView, id);
      if (buttonShowsFilterUpcomingRange == null) {
        break missingId;
      }

      id = R.id.checkbox_shows_filter_continuing;
      FilterBox checkboxShowsFilterContinuing = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsFilterContinuing == null) {
        break missingId;
      }

      id = R.id.checkbox_shows_filter_favorites;
      FilterBox checkboxShowsFilterFavorites = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsFilterFavorites == null) {
        break missingId;
      }

      id = R.id.checkbox_shows_filter_hidden;
      FilterBox checkboxShowsFilterHidden = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsFilterHidden == null) {
        break missingId;
      }

      id = R.id.checkbox_shows_filter_no_released;
      CheckBox checkboxShowsFilterNoReleased = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsFilterNoReleased == null) {
        break missingId;
      }

      id = R.id.checkbox_shows_filter_unwatched;
      FilterBox checkboxShowsFilterUnwatched = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsFilterUnwatched == null) {
        break missingId;
      }

      id = R.id.checkbox_shows_filter_upcoming;
      FilterBox checkboxShowsFilterUpcoming = ViewBindings.findChildViewById(rootView, id);
      if (checkboxShowsFilterUpcoming == null) {
        break missingId;
      }

      return new ViewFilterShowsBinding(rootView, buttonShowsFilterAllVisible,
          buttonShowsFilterRemove, buttonShowsFilterUpcomingRange, checkboxShowsFilterContinuing,
          checkboxShowsFilterFavorites, checkboxShowsFilterHidden, checkboxShowsFilterNoReleased,
          checkboxShowsFilterUnwatched, checkboxShowsFilterUpcoming);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
