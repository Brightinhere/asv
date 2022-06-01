// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBillingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonBillingGetPass;

  @NonNull
  public final Button buttonBillingManageSubscription;

  @NonNull
  public final ScrollView containerBilling;

  @NonNull
  public final ProgressBar progressBarBilling;

  @NonNull
  public final RecyclerView recyclerViewBilling;

  @NonNull
  public final TextView textViewBillingDescription;

  @NonNull
  public final TextView textViewBillingError;

  @NonNull
  public final TextView textViewBillingExisting;

  @NonNull
  public final Button textViewBillingMoreInfo;

  @NonNull
  public final TextView textViewBillingPricePass;

  @NonNull
  public final TextView textViewBillingSubDescription;

  @NonNull
  public final TextView textViewBillingTitle;

  @NonNull
  public final TextView textViewBillingUnlockDetected;

  private ActivityBillingBinding(@NonNull LinearLayout rootView,
      @NonNull Button buttonBillingGetPass, @NonNull Button buttonBillingManageSubscription,
      @NonNull ScrollView containerBilling, @NonNull ProgressBar progressBarBilling,
      @NonNull RecyclerView recyclerViewBilling, @NonNull TextView textViewBillingDescription,
      @NonNull TextView textViewBillingError, @NonNull TextView textViewBillingExisting,
      @NonNull Button textViewBillingMoreInfo, @NonNull TextView textViewBillingPricePass,
      @NonNull TextView textViewBillingSubDescription, @NonNull TextView textViewBillingTitle,
      @NonNull TextView textViewBillingUnlockDetected) {
    this.rootView = rootView;
    this.buttonBillingGetPass = buttonBillingGetPass;
    this.buttonBillingManageSubscription = buttonBillingManageSubscription;
    this.containerBilling = containerBilling;
    this.progressBarBilling = progressBarBilling;
    this.recyclerViewBilling = recyclerViewBilling;
    this.textViewBillingDescription = textViewBillingDescription;
    this.textViewBillingError = textViewBillingError;
    this.textViewBillingExisting = textViewBillingExisting;
    this.textViewBillingMoreInfo = textViewBillingMoreInfo;
    this.textViewBillingPricePass = textViewBillingPricePass;
    this.textViewBillingSubDescription = textViewBillingSubDescription;
    this.textViewBillingTitle = textViewBillingTitle;
    this.textViewBillingUnlockDetected = textViewBillingUnlockDetected;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBillingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBillingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_billing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBillingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonBillingGetPass;
      Button buttonBillingGetPass = ViewBindings.findChildViewById(rootView, id);
      if (buttonBillingGetPass == null) {
        break missingId;
      }

      id = R.id.buttonBillingManageSubscription;
      Button buttonBillingManageSubscription = ViewBindings.findChildViewById(rootView, id);
      if (buttonBillingManageSubscription == null) {
        break missingId;
      }

      id = R.id.containerBilling;
      ScrollView containerBilling = ViewBindings.findChildViewById(rootView, id);
      if (containerBilling == null) {
        break missingId;
      }

      id = R.id.progressBarBilling;
      ProgressBar progressBarBilling = ViewBindings.findChildViewById(rootView, id);
      if (progressBarBilling == null) {
        break missingId;
      }

      id = R.id.recyclerViewBilling;
      RecyclerView recyclerViewBilling = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewBilling == null) {
        break missingId;
      }

      id = R.id.textViewBillingDescription;
      TextView textViewBillingDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingDescription == null) {
        break missingId;
      }

      id = R.id.textViewBillingError;
      TextView textViewBillingError = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingError == null) {
        break missingId;
      }

      id = R.id.textViewBillingExisting;
      TextView textViewBillingExisting = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingExisting == null) {
        break missingId;
      }

      id = R.id.textViewBillingMoreInfo;
      Button textViewBillingMoreInfo = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingMoreInfo == null) {
        break missingId;
      }

      id = R.id.textViewBillingPricePass;
      TextView textViewBillingPricePass = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingPricePass == null) {
        break missingId;
      }

      id = R.id.textViewBillingSubDescription;
      TextView textViewBillingSubDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingSubDescription == null) {
        break missingId;
      }

      id = R.id.textViewBillingTitle;
      TextView textViewBillingTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingTitle == null) {
        break missingId;
      }

      id = R.id.textViewBillingUnlockDetected;
      TextView textViewBillingUnlockDetected = ViewBindings.findChildViewById(rootView, id);
      if (textViewBillingUnlockDetected == null) {
        break missingId;
      }

      return new ActivityBillingBinding((LinearLayout) rootView, buttonBillingGetPass,
          buttonBillingManageSubscription, containerBilling, progressBarBilling,
          recyclerViewBilling, textViewBillingDescription, textViewBillingError,
          textViewBillingExisting, textViewBillingMoreInfo, textViewBillingPricePass,
          textViewBillingSubDescription, textViewBillingTitle, textViewBillingUnlockDetected);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}