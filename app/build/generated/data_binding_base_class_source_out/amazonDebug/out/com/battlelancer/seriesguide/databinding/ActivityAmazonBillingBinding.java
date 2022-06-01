// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityAmazonBillingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonAmazonBillingGetPass;

  @NonNull
  public final Button buttonAmazonBillingSubscribe;

  @NonNull
  public final ProgressBar progressBarAmazonBilling;

  @NonNull
  public final TextView textViewAmazonBillingDescription;

  @NonNull
  public final TextView textViewAmazonBillingExisting;

  @NonNull
  public final Button textViewAmazonBillingMoreInfo;

  @NonNull
  public final TextView textViewAmazonBillingPricePass;

  @NonNull
  public final TextView textViewAmazonBillingSubPrice;

  @NonNull
  public final TextView textViewAmazonBillingTitle;

  private ActivityAmazonBillingBinding(@NonNull LinearLayout rootView,
      @NonNull Button buttonAmazonBillingGetPass, @NonNull Button buttonAmazonBillingSubscribe,
      @NonNull ProgressBar progressBarAmazonBilling,
      @NonNull TextView textViewAmazonBillingDescription,
      @NonNull TextView textViewAmazonBillingExisting,
      @NonNull Button textViewAmazonBillingMoreInfo,
      @NonNull TextView textViewAmazonBillingPricePass,
      @NonNull TextView textViewAmazonBillingSubPrice,
      @NonNull TextView textViewAmazonBillingTitle) {
    this.rootView = rootView;
    this.buttonAmazonBillingGetPass = buttonAmazonBillingGetPass;
    this.buttonAmazonBillingSubscribe = buttonAmazonBillingSubscribe;
    this.progressBarAmazonBilling = progressBarAmazonBilling;
    this.textViewAmazonBillingDescription = textViewAmazonBillingDescription;
    this.textViewAmazonBillingExisting = textViewAmazonBillingExisting;
    this.textViewAmazonBillingMoreInfo = textViewAmazonBillingMoreInfo;
    this.textViewAmazonBillingPricePass = textViewAmazonBillingPricePass;
    this.textViewAmazonBillingSubPrice = textViewAmazonBillingSubPrice;
    this.textViewAmazonBillingTitle = textViewAmazonBillingTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAmazonBillingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAmazonBillingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_amazon_billing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAmazonBillingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAmazonBillingGetPass;
      Button buttonAmazonBillingGetPass = ViewBindings.findChildViewById(rootView, id);
      if (buttonAmazonBillingGetPass == null) {
        break missingId;
      }

      id = R.id.buttonAmazonBillingSubscribe;
      Button buttonAmazonBillingSubscribe = ViewBindings.findChildViewById(rootView, id);
      if (buttonAmazonBillingSubscribe == null) {
        break missingId;
      }

      id = R.id.progressBarAmazonBilling;
      ProgressBar progressBarAmazonBilling = ViewBindings.findChildViewById(rootView, id);
      if (progressBarAmazonBilling == null) {
        break missingId;
      }

      id = R.id.textViewAmazonBillingDescription;
      TextView textViewAmazonBillingDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmazonBillingDescription == null) {
        break missingId;
      }

      id = R.id.textViewAmazonBillingExisting;
      TextView textViewAmazonBillingExisting = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmazonBillingExisting == null) {
        break missingId;
      }

      id = R.id.textViewAmazonBillingMoreInfo;
      Button textViewAmazonBillingMoreInfo = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmazonBillingMoreInfo == null) {
        break missingId;
      }

      id = R.id.textViewAmazonBillingPricePass;
      TextView textViewAmazonBillingPricePass = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmazonBillingPricePass == null) {
        break missingId;
      }

      id = R.id.textViewAmazonBillingSubPrice;
      TextView textViewAmazonBillingSubPrice = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmazonBillingSubPrice == null) {
        break missingId;
      }

      id = R.id.textViewAmazonBillingTitle;
      TextView textViewAmazonBillingTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmazonBillingTitle == null) {
        break missingId;
      }

      return new ActivityAmazonBillingBinding((LinearLayout) rootView, buttonAmazonBillingGetPass,
          buttonAmazonBillingSubscribe, progressBarAmazonBilling, textViewAmazonBillingDescription,
          textViewAmazonBillingExisting, textViewAmazonBillingMoreInfo,
          textViewAmazonBillingPricePass, textViewAmazonBillingSubPrice,
          textViewAmazonBillingTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
