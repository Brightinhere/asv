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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.shows.episodes.WatchedBox;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemEpisodeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView imageViewCollected;

  @NonNull
  public final AppCompatImageView imageViewContextMenu;

  @NonNull
  public final TextView textViewEpisodeAirdate;

  @NonNull
  public final TextView textViewEpisodeAlternativeNumbers;

  @NonNull
  public final TextView textViewEpisodeNumber;

  @NonNull
  public final TextView textViewEpisodeTitle;

  @NonNull
  public final WatchedBox watchedBoxEpisode;

  private ItemEpisodeBinding(@NonNull FrameLayout rootView, @NonNull ImageView imageViewCollected,
      @NonNull AppCompatImageView imageViewContextMenu, @NonNull TextView textViewEpisodeAirdate,
      @NonNull TextView textViewEpisodeAlternativeNumbers, @NonNull TextView textViewEpisodeNumber,
      @NonNull TextView textViewEpisodeTitle, @NonNull WatchedBox watchedBoxEpisode) {
    this.rootView = rootView;
    this.imageViewCollected = imageViewCollected;
    this.imageViewContextMenu = imageViewContextMenu;
    this.textViewEpisodeAirdate = textViewEpisodeAirdate;
    this.textViewEpisodeAlternativeNumbers = textViewEpisodeAlternativeNumbers;
    this.textViewEpisodeNumber = textViewEpisodeNumber;
    this.textViewEpisodeTitle = textViewEpisodeTitle;
    this.watchedBoxEpisode = watchedBoxEpisode;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEpisodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEpisodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_episode, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEpisodeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewCollected;
      ImageView imageViewCollected = ViewBindings.findChildViewById(rootView, id);
      if (imageViewCollected == null) {
        break missingId;
      }

      id = R.id.imageViewContextMenu;
      AppCompatImageView imageViewContextMenu = ViewBindings.findChildViewById(rootView, id);
      if (imageViewContextMenu == null) {
        break missingId;
      }

      id = R.id.textViewEpisodeAirdate;
      TextView textViewEpisodeAirdate = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodeAirdate == null) {
        break missingId;
      }

      id = R.id.textViewEpisodeAlternativeNumbers;
      TextView textViewEpisodeAlternativeNumbers = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodeAlternativeNumbers == null) {
        break missingId;
      }

      id = R.id.textViewEpisodeNumber;
      TextView textViewEpisodeNumber = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodeNumber == null) {
        break missingId;
      }

      id = R.id.textViewEpisodeTitle;
      TextView textViewEpisodeTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewEpisodeTitle == null) {
        break missingId;
      }

      id = R.id.watchedBoxEpisode;
      WatchedBox watchedBoxEpisode = ViewBindings.findChildViewById(rootView, id);
      if (watchedBoxEpisode == null) {
        break missingId;
      }

      return new ItemEpisodeBinding((FrameLayout) rootView, imageViewCollected,
          imageViewContextMenu, textViewEpisodeAirdate, textViewEpisodeAlternativeNumbers,
          textViewEpisodeNumber, textViewEpisodeTitle, watchedBoxEpisode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
