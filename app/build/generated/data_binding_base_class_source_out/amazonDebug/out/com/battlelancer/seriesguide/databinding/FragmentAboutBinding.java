// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button buttonAboutCredits;

  @NonNull
  public final Button buttonAboutPrivacy;

  @NonNull
  public final Button buttonAboutTmdbApiTerms;

  @NonNull
  public final Button buttonAboutTmdbTerms;

  @NonNull
  public final Button buttonAboutTraktTerms;

  @NonNull
  public final Button buttonAboutWebsite;

  @NonNull
  public final TextView textViewAboutTitle;

  @NonNull
  public final TextView textViewAboutVersion;

  private FragmentAboutBinding(@NonNull FrameLayout rootView, @NonNull Button buttonAboutCredits,
      @NonNull Button buttonAboutPrivacy, @NonNull Button buttonAboutTmdbApiTerms,
      @NonNull Button buttonAboutTmdbTerms, @NonNull Button buttonAboutTraktTerms,
      @NonNull Button buttonAboutWebsite, @NonNull TextView textViewAboutTitle,
      @NonNull TextView textViewAboutVersion) {
    this.rootView = rootView;
    this.buttonAboutCredits = buttonAboutCredits;
    this.buttonAboutPrivacy = buttonAboutPrivacy;
    this.buttonAboutTmdbApiTerms = buttonAboutTmdbApiTerms;
    this.buttonAboutTmdbTerms = buttonAboutTmdbTerms;
    this.buttonAboutTraktTerms = buttonAboutTraktTerms;
    this.buttonAboutWebsite = buttonAboutWebsite;
    this.textViewAboutTitle = textViewAboutTitle;
    this.textViewAboutVersion = textViewAboutVersion;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAboutCredits;
      Button buttonAboutCredits = ViewBindings.findChildViewById(rootView, id);
      if (buttonAboutCredits == null) {
        break missingId;
      }

      id = R.id.buttonAboutPrivacy;
      Button buttonAboutPrivacy = ViewBindings.findChildViewById(rootView, id);
      if (buttonAboutPrivacy == null) {
        break missingId;
      }

      id = R.id.buttonAboutTmdbApiTerms;
      Button buttonAboutTmdbApiTerms = ViewBindings.findChildViewById(rootView, id);
      if (buttonAboutTmdbApiTerms == null) {
        break missingId;
      }

      id = R.id.buttonAboutTmdbTerms;
      Button buttonAboutTmdbTerms = ViewBindings.findChildViewById(rootView, id);
      if (buttonAboutTmdbTerms == null) {
        break missingId;
      }

      id = R.id.buttonAboutTraktTerms;
      Button buttonAboutTraktTerms = ViewBindings.findChildViewById(rootView, id);
      if (buttonAboutTraktTerms == null) {
        break missingId;
      }

      id = R.id.buttonAboutWebsite;
      Button buttonAboutWebsite = ViewBindings.findChildViewById(rootView, id);
      if (buttonAboutWebsite == null) {
        break missingId;
      }

      id = R.id.textViewAboutTitle;
      TextView textViewAboutTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewAboutTitle == null) {
        break missingId;
      }

      id = R.id.textViewAboutVersion;
      TextView textViewAboutVersion = ViewBindings.findChildViewById(rootView, id);
      if (textViewAboutVersion == null) {
        break missingId;
      }

      return new FragmentAboutBinding((FrameLayout) rootView, buttonAboutCredits,
          buttonAboutPrivacy, buttonAboutTmdbApiTerms, buttonAboutTmdbTerms, buttonAboutTraktTerms,
          buttonAboutWebsite, textViewAboutTitle, textViewAboutVersion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}