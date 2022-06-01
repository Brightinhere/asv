// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ItemHistoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialCardView cardViewHistory;

  @NonNull
  public final ConstraintLayout constaintLayoutHistory;

  @NonNull
  public final ImageView imageViewHistoryAvatar;

  @NonNull
  public final ImageView imageViewHistoryPoster;

  @NonNull
  public final ImageView imageViewHistoryType;

  @NonNull
  public final LinearLayout linearLayoutHistory;

  @NonNull
  public final TextView textViewHistoryEpisode;

  @NonNull
  public final TextView textViewHistoryHeader;

  @NonNull
  public final TextView textViewHistoryInfo;

  @NonNull
  public final TextView textViewHistoryShow;

  private ItemHistoryBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialCardView cardViewHistory, @NonNull ConstraintLayout constaintLayoutHistory,
      @NonNull ImageView imageViewHistoryAvatar, @NonNull ImageView imageViewHistoryPoster,
      @NonNull ImageView imageViewHistoryType, @NonNull LinearLayout linearLayoutHistory,
      @NonNull TextView textViewHistoryEpisode, @NonNull TextView textViewHistoryHeader,
      @NonNull TextView textViewHistoryInfo, @NonNull TextView textViewHistoryShow) {
    this.rootView = rootView;
    this.cardViewHistory = cardViewHistory;
    this.constaintLayoutHistory = constaintLayoutHistory;
    this.imageViewHistoryAvatar = imageViewHistoryAvatar;
    this.imageViewHistoryPoster = imageViewHistoryPoster;
    this.imageViewHistoryType = imageViewHistoryType;
    this.linearLayoutHistory = linearLayoutHistory;
    this.textViewHistoryEpisode = textViewHistoryEpisode;
    this.textViewHistoryHeader = textViewHistoryHeader;
    this.textViewHistoryInfo = textViewHistoryInfo;
    this.textViewHistoryShow = textViewHistoryShow;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardViewHistory;
      MaterialCardView cardViewHistory = ViewBindings.findChildViewById(rootView, id);
      if (cardViewHistory == null) {
        break missingId;
      }

      id = R.id.constaintLayoutHistory;
      ConstraintLayout constaintLayoutHistory = ViewBindings.findChildViewById(rootView, id);
      if (constaintLayoutHistory == null) {
        break missingId;
      }

      id = R.id.imageViewHistoryAvatar;
      ImageView imageViewHistoryAvatar = ViewBindings.findChildViewById(rootView, id);
      if (imageViewHistoryAvatar == null) {
        break missingId;
      }

      id = R.id.imageViewHistoryPoster;
      ImageView imageViewHistoryPoster = ViewBindings.findChildViewById(rootView, id);
      if (imageViewHistoryPoster == null) {
        break missingId;
      }

      id = R.id.imageViewHistoryType;
      ImageView imageViewHistoryType = ViewBindings.findChildViewById(rootView, id);
      if (imageViewHistoryType == null) {
        break missingId;
      }

      LinearLayout linearLayoutHistory = (LinearLayout) rootView;

      id = R.id.textViewHistoryEpisode;
      TextView textViewHistoryEpisode = ViewBindings.findChildViewById(rootView, id);
      if (textViewHistoryEpisode == null) {
        break missingId;
      }

      id = R.id.textViewHistoryHeader;
      TextView textViewHistoryHeader = ViewBindings.findChildViewById(rootView, id);
      if (textViewHistoryHeader == null) {
        break missingId;
      }

      id = R.id.textViewHistoryInfo;
      TextView textViewHistoryInfo = ViewBindings.findChildViewById(rootView, id);
      if (textViewHistoryInfo == null) {
        break missingId;
      }

      id = R.id.textViewHistoryShow;
      TextView textViewHistoryShow = ViewBindings.findChildViewById(rootView, id);
      if (textViewHistoryShow == null) {
        break missingId;
      }

      return new ItemHistoryBinding((LinearLayout) rootView, cardViewHistory,
          constaintLayoutHistory, imageViewHistoryAvatar, imageViewHistoryPoster,
          imageViewHistoryType, linearLayoutHistory, textViewHistoryEpisode, textViewHistoryHeader,
          textViewHistoryInfo, textViewHistoryShow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
