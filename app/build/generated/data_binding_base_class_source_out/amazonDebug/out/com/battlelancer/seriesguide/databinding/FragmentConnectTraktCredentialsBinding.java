// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.FeatureStatusView;
import com.battlelancer.seriesguide.ui.widgets.SyncStatusView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentConnectTraktCredentialsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Barrier barrier4;

  @NonNull
  public final Button buttonTraktConnect;

  @NonNull
  public final Button buttonTraktLibrary;

  @NonNull
  public final FeatureStatusView featureStatusTraktCheckIn;

  @NonNull
  public final FeatureStatusView featureStatusTraktComment;

  @NonNull
  public final FeatureStatusView featureStatusTraktHistory;

  @NonNull
  public final FeatureStatusView featureStatusTraktNotSupported;

  @NonNull
  public final FeatureStatusView featureStatusTraktRate;

  @NonNull
  public final FeatureStatusView featureStatusTraktSupported;

  @NonNull
  public final FeatureStatusView featureStatusTraktSync;

  @NonNull
  public final FeatureStatusView featureStatusTraktSyncLists;

  @NonNull
  public final FeatureStatusView featureStatusTraktSyncMovies;

  @NonNull
  public final FeatureStatusView featureStatusTraktSyncShows;

  @NonNull
  public final ImageView imageViewTraktIcon;

  @NonNull
  public final ScrollView scrollViewTraktCredentials;

  @NonNull
  public final SyncStatusView syncStatusTrakt;

  @NonNull
  public final TextView textViewConnectTraktHexagonWarning;

  @NonNull
  public final TextView textViewTraktAbout;

  @NonNull
  public final TextView textViewTraktUser;

  private FragmentConnectTraktCredentialsBinding(@NonNull ScrollView rootView,
      @NonNull Barrier barrier4, @NonNull Button buttonTraktConnect,
      @NonNull Button buttonTraktLibrary, @NonNull FeatureStatusView featureStatusTraktCheckIn,
      @NonNull FeatureStatusView featureStatusTraktComment,
      @NonNull FeatureStatusView featureStatusTraktHistory,
      @NonNull FeatureStatusView featureStatusTraktNotSupported,
      @NonNull FeatureStatusView featureStatusTraktRate,
      @NonNull FeatureStatusView featureStatusTraktSupported,
      @NonNull FeatureStatusView featureStatusTraktSync,
      @NonNull FeatureStatusView featureStatusTraktSyncLists,
      @NonNull FeatureStatusView featureStatusTraktSyncMovies,
      @NonNull FeatureStatusView featureStatusTraktSyncShows, @NonNull ImageView imageViewTraktIcon,
      @NonNull ScrollView scrollViewTraktCredentials, @NonNull SyncStatusView syncStatusTrakt,
      @NonNull TextView textViewConnectTraktHexagonWarning, @NonNull TextView textViewTraktAbout,
      @NonNull TextView textViewTraktUser) {
    this.rootView = rootView;
    this.barrier4 = barrier4;
    this.buttonTraktConnect = buttonTraktConnect;
    this.buttonTraktLibrary = buttonTraktLibrary;
    this.featureStatusTraktCheckIn = featureStatusTraktCheckIn;
    this.featureStatusTraktComment = featureStatusTraktComment;
    this.featureStatusTraktHistory = featureStatusTraktHistory;
    this.featureStatusTraktNotSupported = featureStatusTraktNotSupported;
    this.featureStatusTraktRate = featureStatusTraktRate;
    this.featureStatusTraktSupported = featureStatusTraktSupported;
    this.featureStatusTraktSync = featureStatusTraktSync;
    this.featureStatusTraktSyncLists = featureStatusTraktSyncLists;
    this.featureStatusTraktSyncMovies = featureStatusTraktSyncMovies;
    this.featureStatusTraktSyncShows = featureStatusTraktSyncShows;
    this.imageViewTraktIcon = imageViewTraktIcon;
    this.scrollViewTraktCredentials = scrollViewTraktCredentials;
    this.syncStatusTrakt = syncStatusTrakt;
    this.textViewConnectTraktHexagonWarning = textViewConnectTraktHexagonWarning;
    this.textViewTraktAbout = textViewTraktAbout;
    this.textViewTraktUser = textViewTraktUser;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentConnectTraktCredentialsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentConnectTraktCredentialsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_connect_trakt_credentials, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentConnectTraktCredentialsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier4;
      Barrier barrier4 = ViewBindings.findChildViewById(rootView, id);
      if (barrier4 == null) {
        break missingId;
      }

      id = R.id.buttonTraktConnect;
      Button buttonTraktConnect = ViewBindings.findChildViewById(rootView, id);
      if (buttonTraktConnect == null) {
        break missingId;
      }

      id = R.id.buttonTraktLibrary;
      Button buttonTraktLibrary = ViewBindings.findChildViewById(rootView, id);
      if (buttonTraktLibrary == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktCheckIn;
      FeatureStatusView featureStatusTraktCheckIn = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktCheckIn == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktComment;
      FeatureStatusView featureStatusTraktComment = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktComment == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktHistory;
      FeatureStatusView featureStatusTraktHistory = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktHistory == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktNotSupported;
      FeatureStatusView featureStatusTraktNotSupported = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktNotSupported == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktRate;
      FeatureStatusView featureStatusTraktRate = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktRate == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktSupported;
      FeatureStatusView featureStatusTraktSupported = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktSupported == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktSync;
      FeatureStatusView featureStatusTraktSync = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktSync == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktSyncLists;
      FeatureStatusView featureStatusTraktSyncLists = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktSyncLists == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktSyncMovies;
      FeatureStatusView featureStatusTraktSyncMovies = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktSyncMovies == null) {
        break missingId;
      }

      id = R.id.featureStatusTraktSyncShows;
      FeatureStatusView featureStatusTraktSyncShows = ViewBindings.findChildViewById(rootView, id);
      if (featureStatusTraktSyncShows == null) {
        break missingId;
      }

      id = R.id.imageViewTraktIcon;
      ImageView imageViewTraktIcon = ViewBindings.findChildViewById(rootView, id);
      if (imageViewTraktIcon == null) {
        break missingId;
      }

      ScrollView scrollViewTraktCredentials = (ScrollView) rootView;

      id = R.id.syncStatusTrakt;
      SyncStatusView syncStatusTrakt = ViewBindings.findChildViewById(rootView, id);
      if (syncStatusTrakt == null) {
        break missingId;
      }

      id = R.id.textViewConnectTraktHexagonWarning;
      TextView textViewConnectTraktHexagonWarning = ViewBindings.findChildViewById(rootView, id);
      if (textViewConnectTraktHexagonWarning == null) {
        break missingId;
      }

      id = R.id.textViewTraktAbout;
      TextView textViewTraktAbout = ViewBindings.findChildViewById(rootView, id);
      if (textViewTraktAbout == null) {
        break missingId;
      }

      id = R.id.textViewTraktUser;
      TextView textViewTraktUser = ViewBindings.findChildViewById(rootView, id);
      if (textViewTraktUser == null) {
        break missingId;
      }

      return new FragmentConnectTraktCredentialsBinding((ScrollView) rootView, barrier4,
          buttonTraktConnect, buttonTraktLibrary, featureStatusTraktCheckIn,
          featureStatusTraktComment, featureStatusTraktHistory, featureStatusTraktNotSupported,
          featureStatusTraktRate, featureStatusTraktSupported, featureStatusTraktSync,
          featureStatusTraktSyncLists, featureStatusTraktSyncMovies, featureStatusTraktSyncShows,
          imageViewTraktIcon, scrollViewTraktCredentials, syncStatusTrakt,
          textViewConnectTraktHexagonWarning, textViewTraktAbout, textViewTraktUser);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}