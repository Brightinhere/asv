// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.shows.search.discover.AddIndicator;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemAddshowBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AddIndicator addIndicatorAddShow;

  @NonNull
  public final ImageView buttonItemAddMore;

  @NonNull
  public final MaterialCardView cardViewAddPoster;

  @NonNull
  public final ImageView imageViewAddPoster;

  @NonNull
  public final TextView textViewAddDescription;

  @NonNull
  public final TextView textViewAddTitle;

  private ItemAddshowBinding(@NonNull FrameLayout rootView,
      @NonNull AddIndicator addIndicatorAddShow, @NonNull ImageView buttonItemAddMore,
      @NonNull MaterialCardView cardViewAddPoster, @NonNull ImageView imageViewAddPoster,
      @NonNull TextView textViewAddDescription, @NonNull TextView textViewAddTitle) {
    this.rootView = rootView;
    this.addIndicatorAddShow = addIndicatorAddShow;
    this.buttonItemAddMore = buttonItemAddMore;
    this.cardViewAddPoster = cardViewAddPoster;
    this.imageViewAddPoster = imageViewAddPoster;
    this.textViewAddDescription = textViewAddDescription;
    this.textViewAddTitle = textViewAddTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAddshowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAddshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_addshow, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAddshowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addIndicatorAddShow;
      AddIndicator addIndicatorAddShow = ViewBindings.findChildViewById(rootView, id);
      if (addIndicatorAddShow == null) {
        break missingId;
      }

      id = R.id.buttonItemAddMore;
      ImageView buttonItemAddMore = ViewBindings.findChildViewById(rootView, id);
      if (buttonItemAddMore == null) {
        break missingId;
      }

      id = R.id.cardViewAddPoster;
      MaterialCardView cardViewAddPoster = ViewBindings.findChildViewById(rootView, id);
      if (cardViewAddPoster == null) {
        break missingId;
      }

      id = R.id.imageViewAddPoster;
      ImageView imageViewAddPoster = ViewBindings.findChildViewById(rootView, id);
      if (imageViewAddPoster == null) {
        break missingId;
      }

      id = R.id.textViewAddDescription;
      TextView textViewAddDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewAddDescription == null) {
        break missingId;
      }

      id = R.id.textViewAddTitle;
      TextView textViewAddTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewAddTitle == null) {
        break missingId;
      }

      return new ItemAddshowBinding((FrameLayout) rootView, addIndicatorAddShow, buttonItemAddMore,
          cardViewAddPoster, imageViewAddPoster, textViewAddDescription, textViewAddTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
