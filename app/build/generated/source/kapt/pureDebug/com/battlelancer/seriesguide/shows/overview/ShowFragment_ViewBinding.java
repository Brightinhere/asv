// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.overview;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.google.android.material.button.MaterialButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ShowFragment_ViewBinding implements Unbinder {
  private ShowFragment target;

  @UiThread
  public ShowFragment_ViewBinding(ShowFragment target, View source) {
    this.target = target;

    target.containerPoster = Utils.findRequiredView(source, R.id.containerShowPoster, "field 'containerPoster'");
    target.imageViewPoster = Utils.findRequiredViewAsType(source, R.id.imageViewShowPoster, "field 'imageViewPoster'", ImageView.class);
    target.textViewStatus = Utils.findOptionalViewAsType(source, R.id.textViewShowStatus, "field 'textViewStatus'", TextView.class);
    target.textViewReleaseTime = Utils.findOptionalViewAsType(source, R.id.textViewShowReleaseTime, "field 'textViewReleaseTime'", TextView.class);
    target.textViewOverview = Utils.findRequiredViewAsType(source, R.id.textViewShowOverview, "field 'textViewOverview'", TextView.class);
    target.textViewReleaseCountry = Utils.findRequiredViewAsType(source, R.id.textViewShowReleaseCountry, "field 'textViewReleaseCountry'", TextView.class);
    target.textViewFirstRelease = Utils.findRequiredViewAsType(source, R.id.textViewShowFirstAirdate, "field 'textViewFirstRelease'", TextView.class);
    target.textShowLastUpdated = Utils.findRequiredViewAsType(source, R.id.textShowLastUpdated, "field 'textShowLastUpdated'", TextView.class);
    target.textViewContentRating = Utils.findRequiredViewAsType(source, R.id.textViewShowContentRating, "field 'textViewContentRating'", TextView.class);
    target.textViewGenres = Utils.findRequiredViewAsType(source, R.id.textViewShowGenres, "field 'textViewGenres'", TextView.class);
    target.textViewRating = Utils.findRequiredViewAsType(source, R.id.textViewRatingsValue, "field 'textViewRating'", TextView.class);
    target.textViewRatingRange = Utils.findRequiredViewAsType(source, R.id.textViewRatingsRange, "field 'textViewRatingRange'", TextView.class);
    target.textViewRatingVotes = Utils.findRequiredViewAsType(source, R.id.textViewRatingsVotes, "field 'textViewRatingVotes'", TextView.class);
    target.textViewRatingUser = Utils.findRequiredViewAsType(source, R.id.textViewRatingsUser, "field 'textViewRatingUser'", TextView.class);
    target.buttonFavorite = Utils.findRequiredViewAsType(source, R.id.buttonShowFavorite, "field 'buttonFavorite'", MaterialButton.class);
    target.buttonNotify = Utils.findRequiredViewAsType(source, R.id.buttonShowNotify, "field 'buttonNotify'", MaterialButton.class);
    target.buttonHidden = Utils.findRequiredViewAsType(source, R.id.buttonShowHidden, "field 'buttonHidden'", MaterialButton.class);
    target.buttonShortcut = Utils.findRequiredViewAsType(source, R.id.buttonShowShortcut, "field 'buttonShortcut'", Button.class);
    target.buttonLanguage = Utils.findRequiredViewAsType(source, R.id.buttonShowLanguage, "field 'buttonLanguage'", Button.class);
    target.buttonRate = Utils.findRequiredView(source, R.id.containerRatings, "field 'buttonRate'");
    target.buttonSimilar = Utils.findRequiredViewAsType(source, R.id.buttonShowSimilar, "field 'buttonSimilar'", Button.class);
    target.buttonImdb = Utils.findRequiredViewAsType(source, R.id.buttonShowImdb, "field 'buttonImdb'", Button.class);
    target.buttonShowMetacritic = Utils.findRequiredViewAsType(source, R.id.buttonShowMetacritic, "field 'buttonShowMetacritic'", Button.class);
    target.buttonTmdb = Utils.findRequiredViewAsType(source, R.id.buttonShowTmdb, "field 'buttonTmdb'", Button.class);
    target.buttonTrakt = Utils.findRequiredViewAsType(source, R.id.buttonShowTrakt, "field 'buttonTrakt'", Button.class);
    target.buttonWebSearch = Utils.findRequiredViewAsType(source, R.id.buttonShowWebSearch, "field 'buttonWebSearch'", Button.class);
    target.buttonComments = Utils.findRequiredViewAsType(source, R.id.buttonShowComments, "field 'buttonComments'", Button.class);
    target.buttonShare = Utils.findRequiredViewAsType(source, R.id.buttonShowShare, "field 'buttonShare'", Button.class);
    target.castLabel = Utils.findRequiredViewAsType(source, R.id.labelCast, "field 'castLabel'", TextView.class);
    target.castContainer = Utils.findRequiredViewAsType(source, R.id.containerCast, "field 'castContainer'", LinearLayout.class);
    target.crewLabel = Utils.findRequiredViewAsType(source, R.id.labelCrew, "field 'crewLabel'", TextView.class);
    target.crewContainer = Utils.findRequiredViewAsType(source, R.id.containerCrew, "field 'crewContainer'", LinearLayout.class);
  }

  @Override
  public void unbind() {
    ShowFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.containerPoster = null;
    target.imageViewPoster = null;
    target.textViewStatus = null;
    target.textViewReleaseTime = null;
    target.textViewOverview = null;
    target.textViewReleaseCountry = null;
    target.textViewFirstRelease = null;
    target.textShowLastUpdated = null;
    target.textViewContentRating = null;
    target.textViewGenres = null;
    target.textViewRating = null;
    target.textViewRatingRange = null;
    target.textViewRatingVotes = null;
    target.textViewRatingUser = null;
    target.buttonFavorite = null;
    target.buttonNotify = null;
    target.buttonHidden = null;
    target.buttonShortcut = null;
    target.buttonLanguage = null;
    target.buttonRate = null;
    target.buttonSimilar = null;
    target.buttonImdb = null;
    target.buttonShowMetacritic = null;
    target.buttonTmdb = null;
    target.buttonTrakt = null;
    target.buttonWebSearch = null;
    target.buttonComments = null;
    target.buttonShare = null;
    target.castLabel = null;
    target.castContainer = null;
    target.crewLabel = null;
    target.crewContainer = null;
  }
}
