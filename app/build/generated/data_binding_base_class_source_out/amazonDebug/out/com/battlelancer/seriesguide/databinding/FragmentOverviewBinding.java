// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOverviewBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton buttonOverviewFavoriteShow;

  @NonNull
  public final Button buttonOverviewRemoveShow;

  @NonNull
  public final Button buttonOverviewSimilarShows;

  @NonNull
  public final ConstraintLayout containerOverviewEmpty;

  @NonNull
  public final LinearLayout containerOverviewEpisode;

  @NonNull
  public final MaterialCardView containerOverviewEpisodeCard;

  @NonNull
  public final LinearLayout containerOverviewEpisodeDetails;

  @NonNull
  public final LinearLayout containerOverviewProgress;

  @NonNull
  public final ConstraintLayout containerOverviewShow;

  @NonNull
  public final View dividerOverviewEpisodeDetails;

  @NonNull
  public final TextView episodeTitle;

  @NonNull
  public final FrameLayout frameLayoutOverview;

  @NonNull
  public final ImageView imageViewOverviewEpisode;

  @NonNull
  public final ButtonsEpisodeBinding includeButtons;

  @NonNull
  public final RatingsShowsBinding includeRatings;

  @NonNull
  public final ButtonsServicesBinding includeServices;

  @NonNull
  public final TextView labelDvdNumber;

  @NonNull
  public final TextView labelGuestStars;

  @NonNull
  public final LinearLayout overviewContainer;

  @NonNull
  public final TextView overviewShowNetworkAndTime;

  @NonNull
  public final TextView overviewShowStatus;

  @NonNull
  public final ScrollView scrollViewOverview;

  @NonNull
  public final TextView textDvdNumber;

  @NonNull
  public final TextView textGuestStars;

  @NonNull
  public final TextView textOverviewEpisodeHeader;

  @NonNull
  public final TextView textOverviewEpisodeInfo;

  @NonNull
  public final TextView textViewEpisodeDescription;

  @NonNull
  public final TextView textViewOverviewEmpty;

  @NonNull
  public final TextView textViewOverviewNotMigrated;

  @NonNull
  public final ViewStub viewStubOverviewFeedback;

  private FragmentOverviewBinding(@NonNull FrameLayout rootView,
      @NonNull ImageButton buttonOverviewFavoriteShow, @NonNull Button buttonOverviewRemoveShow,
      @NonNull Button buttonOverviewSimilarShows, @NonNull ConstraintLayout containerOverviewEmpty,
      @NonNull LinearLayout containerOverviewEpisode,
      @NonNull MaterialCardView containerOverviewEpisodeCard,
      @NonNull LinearLayout containerOverviewEpisodeDetails,
      @NonNull LinearLayout containerOverviewProgress,
      @NonNull ConstraintLayout containerOverviewShow, @NonNull View dividerOverviewEpisodeDetails,
      @NonNull TextView episodeTitle, @NonNull FrameLayout frameLayoutOverview,
      @NonNull ImageView imageViewOverviewEpisode, @NonNull ButtonsEpisodeBinding includeButtons,
      @NonNull RatingsShowsBinding includeRatings, @NonNull ButtonsServicesBinding includeServices,
      @NonNull TextView labelDvdNumber, @NonNull TextView labelGuestStars,
      @NonNull LinearLayout overviewContainer, @NonNull TextView overviewShowNetworkAndTime,
      @NonNull TextView overviewShowStatus, @NonNull ScrollView scrollViewOverview,
      @NonNull TextView textDvdNumber, @NonNull TextView textGuestStars,
      @NonNull TextView textOverviewEpisodeHeader, @NonNull TextView textOverviewEpisodeInfo,
      @NonNull TextView textViewEpisodeDescription, @NonNull TextView textViewOverviewEmpty,
      @NonNull TextView textViewOverviewNotMigrated, @NonNull ViewStub viewStubOverviewFeedback) {
    this.rootView = rootView;
    this.buttonOverviewFavoriteShow = buttonOverviewFavoriteShow;
    this.buttonOverviewRemoveShow = buttonOverviewRemoveShow;
    this.buttonOverviewSimilarShows = buttonOverviewSimilarShows;
    this.containerOverviewEmpty = containerOverviewEmpty;
    this.containerOverviewEpisode = containerOverviewEpisode;
    this.containerOverviewEpisodeCard = containerOverviewEpisodeCard;
    this.containerOverviewEpisodeDetails = containerOverviewEpisodeDetails;
    this.containerOverviewProgress = containerOverviewProgress;
    this.containerOverviewShow = containerOverviewShow;
    this.dividerOverviewEpisodeDetails = dividerOverviewEpisodeDetails;
    this.episodeTitle = episodeTitle;
    this.frameLayoutOverview = frameLayoutOverview;
    this.imageViewOverviewEpisode = imageViewOverviewEpisode;
    this.includeButtons = includeButtons;
    this.includeRatings = includeRatings;
    this.includeServices = includeServices;
    this.labelDvdNumber = labelDvdNumber;
    this.labelGuestStars = labelGuestStars;
    this.overviewContainer = overviewContainer;
    this.overviewShowNetworkAndTime = overviewShowNetworkAndTime;
    this.overviewShowStatus = overviewShowStatus;
    this.scrollViewOverview = scrollViewOverview;
    this.textDvdNumber = textDvdNumber;
    this.textGuestStars = textGuestStars;
    this.textOverviewEpisodeHeader = textOverviewEpisodeHeader;
    this.textOverviewEpisodeInfo = textOverviewEpisodeInfo;
    this.textViewEpisodeDescription = textViewEpisodeDescription;
    this.textViewOverviewEmpty = textViewOverviewEmpty;
    this.textViewOverviewNotMigrated = textViewOverviewNotMigrated;
    this.viewStubOverviewFeedback = viewStubOverviewFeedback;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOverviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOverviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_overview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOverviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonOverviewFavoriteShow;
      ImageButton buttonOverviewFavoriteShow = ViewBindings.findChildViewById(rootView, id);
      if (buttonOverviewFavoriteShow == null) {
        break missingId;
      }

      id = R.id.buttonOverviewRemoveShow;
      Button buttonOverviewRemoveShow = ViewBindings.findChildViewById(rootView, id);
      if (buttonOverviewRemoveShow == null) {
        break missingId;
      }

      id = R.id.buttonOverviewSimilarShows;
      Button buttonOverviewSimilarShows = ViewBindings.findChildViewById(rootView, id);
      if (buttonOverviewSimilarShows == null) {
        break missingId;
      }

      id = R.id.containerOverviewEmpty;
      ConstraintLayout containerOverviewEmpty = ViewBindings.findChildViewById(rootView, id);
      if (containerOverviewEmpty == null) {
        break missingId;
      }

      id = R.id.containerOverviewEpisode;
      LinearLayout containerOverviewEpisode = ViewBindings.findChildViewById(rootView, id);
      if (containerOverviewEpisode == null) {
        break missingId;
      }

      id = R.id.containerOverviewEpisodeCard;
      MaterialCardView containerOverviewEpisodeCard = ViewBindings.findChildViewById(rootView, id);
      if (containerOverviewEpisodeCard == null) {
        break missingId;
      }

      id = R.id.containerOverviewEpisodeDetails;
      LinearLayout containerOverviewEpisodeDetails = ViewBindings.findChildViewById(rootView, id);
      if (containerOverviewEpisodeDetails == null) {
        break missingId;
      }

      id = R.id.containerOverviewProgress;
      LinearLayout containerOverviewProgress = ViewBindings.findChildViewById(rootView, id);
      if (containerOverviewProgress == null) {
        break missingId;
      }

      id = R.id.containerOverviewShow;
      ConstraintLayout containerOverviewShow = ViewBindings.findChildViewById(rootView, id);
      if (containerOverviewShow == null) {
        break missingId;
      }

      id = R.id.dividerOverviewEpisodeDetails;
      View dividerOverviewEpisodeDetails = ViewBindings.findChildViewById(rootView, id);
      if (dividerOverviewEpisodeDetails == null) {
        break missingId;
      }

      id = R.id.episodeTitle;
      TextView episodeTitle = ViewBindings.findChildViewById(rootView, id);
      if (episodeTitle == null) {
        break missingId;
      }

      FrameLayout frameLayoutOverview = (FrameLayout) rootView;

      id = R.id.imageViewOverviewEpisode;
      ImageView imageViewOverviewEpisode = ViewBindings.findChildViewById(rootView, id);
      if (imageViewOverviewEpisode == null) {
        break missingId;
      }

      id = R.id.includeButtons;
      View includeButtons = ViewBindings.findChildViewById(rootView, id);
      if (includeButtons == null) {
        break missingId;
      }
      ButtonsEpisodeBinding binding_includeButtons = ButtonsEpisodeBinding.bind(includeButtons);

      id = R.id.includeRatings;
      View includeRatings = ViewBindings.findChildViewById(rootView, id);
      if (includeRatings == null) {
        break missingId;
      }
      RatingsShowsBinding binding_includeRatings = RatingsShowsBinding.bind(includeRatings);

      id = R.id.includeServices;
      View includeServices = ViewBindings.findChildViewById(rootView, id);
      if (includeServices == null) {
        break missingId;
      }
      ButtonsServicesBinding binding_includeServices = ButtonsServicesBinding.bind(includeServices);

      id = R.id.labelDvdNumber;
      TextView labelDvdNumber = ViewBindings.findChildViewById(rootView, id);
      if (labelDvdNumber == null) {
        break missingId;
      }

      id = R.id.labelGuestStars;
      TextView labelGuestStars = ViewBindings.findChildViewById(rootView, id);
      if (labelGuestStars == null) {
        break missingId;
      }

      id = R.id.overview_container;
      LinearLayout overviewContainer = ViewBindings.findChildViewById(rootView, id);
      if (overviewContainer == null) {
        break missingId;
      }

      id = R.id.overviewShowNetworkAndTime;
      TextView overviewShowNetworkAndTime = ViewBindings.findChildViewById(rootView, id);
      if (overviewShowNetworkAndTime == null) {
        break missingId;
      }

      id = R.id.overviewShowStatus;
      TextView overviewShowStatus = ViewBindings.findChildViewById(rootView, id);
      if (overviewShowStatus == null) {
        break missingId;
      }

      id = R.id.scrollViewOverview;
      ScrollView scrollViewOverview = ViewBindings.findChildViewById(rootView, id);
      if (scrollViewOverview == null) {
        break missingId;
      }

      id = R.id.textDvdNumber;
      TextView textDvdNumber = ViewBindings.findChildViewById(rootView, id);
      if (textDvdNumber == null) {
        break missingId;
      }

      id = R.id.textGuestStars;
      TextView textGuestStars = ViewBindings.findChildViewById(rootView, id);
      if (textGuestStars == null) {
        break missingId;
      }

      id = R.id.textOverviewEpisodeHeader;
      TextView textOverviewEpisodeHeader = ViewBindings.findChildViewById(rootView, id);
      if (textOverviewEpisodeHeader == null) {
        break missingId;
      }

      id = R.id.textOverviewEpisodeInfo;
      TextView textOverviewEpisodeInfo = ViewBindings.findChildViewById(rootView, id);
      if (textOverviewEpisodeInfo == null) {
        break missingId;
      }

      id = R.id.textViewEpisodeDescription;
      TextView textViewEpisodeDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodeDescription == null) {
        break missingId;
      }

      id = R.id.textViewOverviewEmpty;
      TextView textViewOverviewEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textViewOverviewEmpty == null) {
        break missingId;
      }

      id = R.id.textViewOverviewNotMigrated;
      TextView textViewOverviewNotMigrated = ViewBindings.findChildViewById(rootView, id);
      if (textViewOverviewNotMigrated == null) {
        break missingId;
      }

      id = R.id.viewStubOverviewFeedback;
      ViewStub viewStubOverviewFeedback = ViewBindings.findChildViewById(rootView, id);
      if (viewStubOverviewFeedback == null) {
        break missingId;
      }

      return new FragmentOverviewBinding((FrameLayout) rootView, buttonOverviewFavoriteShow,
          buttonOverviewRemoveShow, buttonOverviewSimilarShows, containerOverviewEmpty,
          containerOverviewEpisode, containerOverviewEpisodeCard, containerOverviewEpisodeDetails,
          containerOverviewProgress, containerOverviewShow, dividerOverviewEpisodeDetails,
          episodeTitle, frameLayoutOverview, imageViewOverviewEpisode, binding_includeButtons,
          binding_includeRatings, binding_includeServices, labelDvdNumber, labelGuestStars,
          overviewContainer, overviewShowNetworkAndTime, overviewShowStatus, scrollViewOverview,
          textDvdNumber, textGuestStars, textOverviewEpisodeHeader, textOverviewEpisodeInfo,
          textViewEpisodeDescription, textViewOverviewEmpty, textViewOverviewNotMigrated,
          viewStubOverviewFeedback);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
