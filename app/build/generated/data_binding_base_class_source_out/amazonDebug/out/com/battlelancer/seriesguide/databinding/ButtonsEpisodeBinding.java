// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ButtonsEpisodeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonEpisodeCheckin;

  @NonNull
  public final Button buttonEpisodeCollected;

  @NonNull
  public final Button buttonEpisodeSkip;

  @NonNull
  public final Button buttonEpisodeStreamingSearch;

  @NonNull
  public final ImageButton buttonEpisodeStreamingSearchInfo;

  @NonNull
  public final Button buttonEpisodeWatched;

  @NonNull
  public final Button buttonEpisodeWatchedUpTo;

  @NonNull
  public final ConstraintLayout containerEpisodeStreamingSearch;

  @NonNull
  public final View dividerEpisodeButtons;

  private ButtonsEpisodeBinding(@NonNull LinearLayout rootView,
      @NonNull Button buttonEpisodeCheckin, @NonNull Button buttonEpisodeCollected,
      @NonNull Button buttonEpisodeSkip, @NonNull Button buttonEpisodeStreamingSearch,
      @NonNull ImageButton buttonEpisodeStreamingSearchInfo, @NonNull Button buttonEpisodeWatched,
      @NonNull Button buttonEpisodeWatchedUpTo,
      @NonNull ConstraintLayout containerEpisodeStreamingSearch,
      @NonNull View dividerEpisodeButtons) {
    this.rootView = rootView;
    this.buttonEpisodeCheckin = buttonEpisodeCheckin;
    this.buttonEpisodeCollected = buttonEpisodeCollected;
    this.buttonEpisodeSkip = buttonEpisodeSkip;
    this.buttonEpisodeStreamingSearch = buttonEpisodeStreamingSearch;
    this.buttonEpisodeStreamingSearchInfo = buttonEpisodeStreamingSearchInfo;
    this.buttonEpisodeWatched = buttonEpisodeWatched;
    this.buttonEpisodeWatchedUpTo = buttonEpisodeWatchedUpTo;
    this.containerEpisodeStreamingSearch = containerEpisodeStreamingSearch;
    this.dividerEpisodeButtons = dividerEpisodeButtons;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ButtonsEpisodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ButtonsEpisodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.buttons_episode, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ButtonsEpisodeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonEpisodeCheckin;
      Button buttonEpisodeCheckin = ViewBindings.findChildViewById(rootView, id);
      if (buttonEpisodeCheckin == null) {
        break missingId;
      }

      id = R.id.buttonEpisodeCollected;
      Button buttonEpisodeCollected = ViewBindings.findChildViewById(rootView, id);
      if (buttonEpisodeCollected == null) {
        break missingId;
      }

      id = R.id.buttonEpisodeSkip;
      Button buttonEpisodeSkip = ViewBindings.findChildViewById(rootView, id);
      if (buttonEpisodeSkip == null) {
        break missingId;
      }

      id = R.id.buttonEpisodeStreamingSearch;
      Button buttonEpisodeStreamingSearch = ViewBindings.findChildViewById(rootView, id);
      if (buttonEpisodeStreamingSearch == null) {
        break missingId;
      }

      id = R.id.buttonEpisodeStreamingSearchInfo;
      ImageButton buttonEpisodeStreamingSearchInfo = ViewBindings.findChildViewById(rootView, id);
      if (buttonEpisodeStreamingSearchInfo == null) {
        break missingId;
      }

      id = R.id.buttonEpisodeWatched;
      Button buttonEpisodeWatched = ViewBindings.findChildViewById(rootView, id);
      if (buttonEpisodeWatched == null) {
        break missingId;
      }

      id = R.id.buttonEpisodeWatchedUpTo;
      Button buttonEpisodeWatchedUpTo = ViewBindings.findChildViewById(rootView, id);
      if (buttonEpisodeWatchedUpTo == null) {
        break missingId;
      }

      id = R.id.containerEpisodeStreamingSearch;
      ConstraintLayout containerEpisodeStreamingSearch = ViewBindings.findChildViewById(rootView, id);
      if (containerEpisodeStreamingSearch == null) {
        break missingId;
      }

      id = R.id.dividerEpisodeButtons;
      View dividerEpisodeButtons = ViewBindings.findChildViewById(rootView, id);
      if (dividerEpisodeButtons == null) {
        break missingId;
      }

      return new ButtonsEpisodeBinding((LinearLayout) rootView, buttonEpisodeCheckin,
          buttonEpisodeCollected, buttonEpisodeSkip, buttonEpisodeStreamingSearch,
          buttonEpisodeStreamingSearchInfo, buttonEpisodeWatched, buttonEpisodeWatchedUpTo,
          containerEpisodeStreamingSearch, dividerEpisodeButtons);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
