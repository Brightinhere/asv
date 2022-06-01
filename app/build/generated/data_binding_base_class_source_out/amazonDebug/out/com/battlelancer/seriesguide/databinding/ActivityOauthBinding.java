// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOauthBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonOauthBrowser;

  @NonNull
  public final Button buttonOauthWebView;

  @NonNull
  public final LinearLayout containerOauthButtons;

  @NonNull
  public final FrameLayout frameLayoutOauth;

  @NonNull
  public final ProgressBar progressBarOauth;

  @NonNull
  public final TextView textViewOauthMessage;

  private ActivityOauthBinding(@NonNull LinearLayout rootView, @NonNull Button buttonOauthBrowser,
      @NonNull Button buttonOauthWebView, @NonNull LinearLayout containerOauthButtons,
      @NonNull FrameLayout frameLayoutOauth, @NonNull ProgressBar progressBarOauth,
      @NonNull TextView textViewOauthMessage) {
    this.rootView = rootView;
    this.buttonOauthBrowser = buttonOauthBrowser;
    this.buttonOauthWebView = buttonOauthWebView;
    this.containerOauthButtons = containerOauthButtons;
    this.frameLayoutOauth = frameLayoutOauth;
    this.progressBarOauth = progressBarOauth;
    this.textViewOauthMessage = textViewOauthMessage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOauthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOauthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_oauth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOauthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonOauthBrowser;
      Button buttonOauthBrowser = ViewBindings.findChildViewById(rootView, id);
      if (buttonOauthBrowser == null) {
        break missingId;
      }

      id = R.id.buttonOauthWebView;
      Button buttonOauthWebView = ViewBindings.findChildViewById(rootView, id);
      if (buttonOauthWebView == null) {
        break missingId;
      }

      id = R.id.containerOauthButtons;
      LinearLayout containerOauthButtons = ViewBindings.findChildViewById(rootView, id);
      if (containerOauthButtons == null) {
        break missingId;
      }

      id = R.id.frameLayoutOauth;
      FrameLayout frameLayoutOauth = ViewBindings.findChildViewById(rootView, id);
      if (frameLayoutOauth == null) {
        break missingId;
      }

      id = R.id.progressBarOauth;
      ProgressBar progressBarOauth = ViewBindings.findChildViewById(rootView, id);
      if (progressBarOauth == null) {
        break missingId;
      }

      id = R.id.textViewOauthMessage;
      TextView textViewOauthMessage = ViewBindings.findChildViewById(rootView, id);
      if (textViewOauthMessage == null) {
        break missingId;
      }

      return new ActivityOauthBinding((LinearLayout) rootView, buttonOauthBrowser,
          buttonOauthWebView, containerOauthButtons, frameLayoutOauth, progressBarOauth,
          textViewOauthMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}