// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSeasonBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatImageView imageViewContextMenu;

  @NonNull
  public final ImageView imageViewSeasonSkipped;

  @NonNull
  public final ProgressBar progressBarSeason;

  @NonNull
  public final TextView textViewSeasonProgress;

  @NonNull
  public final TextView textViewSeasonTitle;

  @NonNull
  public final TextView textViewSeasonWatchCount;

  private ItemSeasonBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatImageView imageViewContextMenu, @NonNull ImageView imageViewSeasonSkipped,
      @NonNull ProgressBar progressBarSeason, @NonNull TextView textViewSeasonProgress,
      @NonNull TextView textViewSeasonTitle, @NonNull TextView textViewSeasonWatchCount) {
    this.rootView = rootView;
    this.imageViewContextMenu = imageViewContextMenu;
    this.imageViewSeasonSkipped = imageViewSeasonSkipped;
    this.progressBarSeason = progressBarSeason;
    this.textViewSeasonProgress = textViewSeasonProgress;
    this.textViewSeasonTitle = textViewSeasonTitle;
    this.textViewSeasonWatchCount = textViewSeasonWatchCount;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSeasonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSeasonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_season, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSeasonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewContextMenu;
      AppCompatImageView imageViewContextMenu = ViewBindings.findChildViewById(rootView, id);
      if (imageViewContextMenu == null) {
        break missingId;
      }

      id = R.id.imageViewSeasonSkipped;
      ImageView imageViewSeasonSkipped = ViewBindings.findChildViewById(rootView, id);
      if (imageViewSeasonSkipped == null) {
        break missingId;
      }

      id = R.id.progressBarSeason;
      ProgressBar progressBarSeason = ViewBindings.findChildViewById(rootView, id);
      if (progressBarSeason == null) {
        break missingId;
      }

      id = R.id.textViewSeasonProgress;
      TextView textViewSeasonProgress = ViewBindings.findChildViewById(rootView, id);
      if (textViewSeasonProgress == null) {
        break missingId;
      }

      id = R.id.textViewSeasonTitle;
      TextView textViewSeasonTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewSeasonTitle == null) {
        break missingId;
      }

      id = R.id.textViewSeasonWatchCount;
      TextView textViewSeasonWatchCount = ViewBindings.findChildViewById(rootView, id);
      if (textViewSeasonWatchCount == null) {
        break missingId;
      }

      return new ItemSeasonBinding((RelativeLayout) rootView, imageViewContextMenu,
          imageViewSeasonSkipped, progressBarSeason, textViewSeasonProgress, textViewSeasonTitle,
          textViewSeasonWatchCount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
