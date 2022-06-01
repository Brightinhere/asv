// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.SyncStatusView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMoreOptionsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final Button buttonCommunity;

  @NonNull
  public final Button buttonContributeContent;

  @NonNull
  public final Button buttonDebugView;

  @NonNull
  public final Button buttonFeedback;

  @NonNull
  public final Button buttonHelp;

  @NonNull
  public final Button buttonMoreAbout;

  @NonNull
  public final Button buttonSettings;

  @NonNull
  public final Button buttonSupportTheApp;

  @NonNull
  public final Button buttonTranslations;

  @NonNull
  public final Button buttonTwitter;

  @NonNull
  public final LinearLayout containerCloud;

  @NonNull
  public final LinearLayout containerTrakt;

  @NonNull
  public final CoordinatorLayout coordinatorLayoutMoreOptions;

  @NonNull
  public final SyncStatusView syncStatus;

  @NonNull
  public final TextView textViewCloud;

  @NonNull
  public final TextView textViewCloudAccount;

  @NonNull
  public final TextView textViewMoreVersionInfo;

  @NonNull
  public final TextView textViewNoMoreUpdates;

  @NonNull
  public final TextView textViewThankYouSupporters;

  @NonNull
  public final TextView textViewTrakt;

  @NonNull
  public final TextView textViewTraktAccount;

  private ActivityMoreOptionsBinding(@NonNull LinearLayout rootView,
      @NonNull BottomNavigationView bottomNavigation, @NonNull Button buttonCommunity,
      @NonNull Button buttonContributeContent, @NonNull Button buttonDebugView,
      @NonNull Button buttonFeedback, @NonNull Button buttonHelp, @NonNull Button buttonMoreAbout,
      @NonNull Button buttonSettings, @NonNull Button buttonSupportTheApp,
      @NonNull Button buttonTranslations, @NonNull Button buttonTwitter,
      @NonNull LinearLayout containerCloud, @NonNull LinearLayout containerTrakt,
      @NonNull CoordinatorLayout coordinatorLayoutMoreOptions, @NonNull SyncStatusView syncStatus,
      @NonNull TextView textViewCloud, @NonNull TextView textViewCloudAccount,
      @NonNull TextView textViewMoreVersionInfo, @NonNull TextView textViewNoMoreUpdates,
      @NonNull TextView textViewThankYouSupporters, @NonNull TextView textViewTrakt,
      @NonNull TextView textViewTraktAccount) {
    this.rootView = rootView;
    this.bottomNavigation = bottomNavigation;
    this.buttonCommunity = buttonCommunity;
    this.buttonContributeContent = buttonContributeContent;
    this.buttonDebugView = buttonDebugView;
    this.buttonFeedback = buttonFeedback;
    this.buttonHelp = buttonHelp;
    this.buttonMoreAbout = buttonMoreAbout;
    this.buttonSettings = buttonSettings;
    this.buttonSupportTheApp = buttonSupportTheApp;
    this.buttonTranslations = buttonTranslations;
    this.buttonTwitter = buttonTwitter;
    this.containerCloud = containerCloud;
    this.containerTrakt = containerTrakt;
    this.coordinatorLayoutMoreOptions = coordinatorLayoutMoreOptions;
    this.syncStatus = syncStatus;
    this.textViewCloud = textViewCloud;
    this.textViewCloudAccount = textViewCloudAccount;
    this.textViewMoreVersionInfo = textViewMoreVersionInfo;
    this.textViewNoMoreUpdates = textViewNoMoreUpdates;
    this.textViewThankYouSupporters = textViewThankYouSupporters;
    this.textViewTrakt = textViewTrakt;
    this.textViewTraktAccount = textViewTraktAccount;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMoreOptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMoreOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_more_options, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMoreOptionsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      id = R.id.buttonCommunity;
      Button buttonCommunity = ViewBindings.findChildViewById(rootView, id);
      if (buttonCommunity == null) {
        break missingId;
      }

      id = R.id.buttonContributeContent;
      Button buttonContributeContent = ViewBindings.findChildViewById(rootView, id);
      if (buttonContributeContent == null) {
        break missingId;
      }

      id = R.id.buttonDebugView;
      Button buttonDebugView = ViewBindings.findChildViewById(rootView, id);
      if (buttonDebugView == null) {
        break missingId;
      }

      id = R.id.buttonFeedback;
      Button buttonFeedback = ViewBindings.findChildViewById(rootView, id);
      if (buttonFeedback == null) {
        break missingId;
      }

      id = R.id.buttonHelp;
      Button buttonHelp = ViewBindings.findChildViewById(rootView, id);
      if (buttonHelp == null) {
        break missingId;
      }

      id = R.id.buttonMoreAbout;
      Button buttonMoreAbout = ViewBindings.findChildViewById(rootView, id);
      if (buttonMoreAbout == null) {
        break missingId;
      }

      id = R.id.buttonSettings;
      Button buttonSettings = ViewBindings.findChildViewById(rootView, id);
      if (buttonSettings == null) {
        break missingId;
      }

      id = R.id.buttonSupportTheApp;
      Button buttonSupportTheApp = ViewBindings.findChildViewById(rootView, id);
      if (buttonSupportTheApp == null) {
        break missingId;
      }

      id = R.id.buttonTranslations;
      Button buttonTranslations = ViewBindings.findChildViewById(rootView, id);
      if (buttonTranslations == null) {
        break missingId;
      }

      id = R.id.buttonTwitter;
      Button buttonTwitter = ViewBindings.findChildViewById(rootView, id);
      if (buttonTwitter == null) {
        break missingId;
      }

      id = R.id.containerCloud;
      LinearLayout containerCloud = ViewBindings.findChildViewById(rootView, id);
      if (containerCloud == null) {
        break missingId;
      }

      id = R.id.containerTrakt;
      LinearLayout containerTrakt = ViewBindings.findChildViewById(rootView, id);
      if (containerTrakt == null) {
        break missingId;
      }

      id = R.id.coordinatorLayoutMoreOptions;
      CoordinatorLayout coordinatorLayoutMoreOptions = ViewBindings.findChildViewById(rootView, id);
      if (coordinatorLayoutMoreOptions == null) {
        break missingId;
      }

      id = R.id.syncStatus;
      SyncStatusView syncStatus = ViewBindings.findChildViewById(rootView, id);
      if (syncStatus == null) {
        break missingId;
      }

      id = R.id.textViewCloud;
      TextView textViewCloud = ViewBindings.findChildViewById(rootView, id);
      if (textViewCloud == null) {
        break missingId;
      }

      id = R.id.textViewCloudAccount;
      TextView textViewCloudAccount = ViewBindings.findChildViewById(rootView, id);
      if (textViewCloudAccount == null) {
        break missingId;
      }

      id = R.id.textViewMoreVersionInfo;
      TextView textViewMoreVersionInfo = ViewBindings.findChildViewById(rootView, id);
      if (textViewMoreVersionInfo == null) {
        break missingId;
      }

      id = R.id.textViewNoMoreUpdates;
      TextView textViewNoMoreUpdates = ViewBindings.findChildViewById(rootView, id);
      if (textViewNoMoreUpdates == null) {
        break missingId;
      }

      id = R.id.textViewThankYouSupporters;
      TextView textViewThankYouSupporters = ViewBindings.findChildViewById(rootView, id);
      if (textViewThankYouSupporters == null) {
        break missingId;
      }

      id = R.id.textViewTrakt;
      TextView textViewTrakt = ViewBindings.findChildViewById(rootView, id);
      if (textViewTrakt == null) {
        break missingId;
      }

      id = R.id.textViewTraktAccount;
      TextView textViewTraktAccount = ViewBindings.findChildViewById(rootView, id);
      if (textViewTraktAccount == null) {
        break missingId;
      }

      return new ActivityMoreOptionsBinding((LinearLayout) rootView, bottomNavigation,
          buttonCommunity, buttonContributeContent, buttonDebugView, buttonFeedback, buttonHelp,
          buttonMoreAbout, buttonSettings, buttonSupportTheApp, buttonTranslations, buttonTwitter,
          containerCloud, containerTrakt, coordinatorLayoutMoreOptions, syncStatus, textViewCloud,
          textViewCloudAccount, textViewMoreVersionInfo, textViewNoMoreUpdates,
          textViewThankYouSupporters, textViewTrakt, textViewTraktAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}