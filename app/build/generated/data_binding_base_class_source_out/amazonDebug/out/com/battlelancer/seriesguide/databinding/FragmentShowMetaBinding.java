// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentShowMetaBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final Button buttonShowLanguage;

  @NonNull
  public final CastAndCrewBinding containerShowPeople;

  @NonNull
  public final TextView textShowLastUpdated;

  @NonNull
  public final TextView textViewShowContentRating;

  @NonNull
  public final TextView textViewShowFirstAirdate;

  @NonNull
  public final TextView textViewShowGenres;

  @NonNull
  public final TextView textViewShowOverview;

  @NonNull
  public final TextView textViewShowReleaseCountry;

  private FragmentShowMetaBinding(@NonNull View rootView, @NonNull Button buttonShowLanguage,
      @NonNull CastAndCrewBinding containerShowPeople, @NonNull TextView textShowLastUpdated,
      @NonNull TextView textViewShowContentRating, @NonNull TextView textViewShowFirstAirdate,
      @NonNull TextView textViewShowGenres, @NonNull TextView textViewShowOverview,
      @NonNull TextView textViewShowReleaseCountry) {
    this.rootView = rootView;
    this.buttonShowLanguage = buttonShowLanguage;
    this.containerShowPeople = containerShowPeople;
    this.textShowLastUpdated = textShowLastUpdated;
    this.textViewShowContentRating = textViewShowContentRating;
    this.textViewShowFirstAirdate = textViewShowFirstAirdate;
    this.textViewShowGenres = textViewShowGenres;
    this.textViewShowOverview = textViewShowOverview;
    this.textViewShowReleaseCountry = textViewShowReleaseCountry;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentShowMetaBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.fragment_show_meta, parent);
    return bind(parent);
  }

  @NonNull
  public static FragmentShowMetaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonShowLanguage;
      Button buttonShowLanguage = ViewBindings.findChildViewById(rootView, id);
      if (buttonShowLanguage == null) {
        break missingId;
      }

      id = R.id.containerShowPeople;
      View containerShowPeople = ViewBindings.findChildViewById(rootView, id);
      if (containerShowPeople == null) {
        break missingId;
      }
      CastAndCrewBinding binding_containerShowPeople = CastAndCrewBinding.bind(containerShowPeople);

      id = R.id.textShowLastUpdated;
      TextView textShowLastUpdated = ViewBindings.findChildViewById(rootView, id);
      if (textShowLastUpdated == null) {
        break missingId;
      }

      id = R.id.textViewShowContentRating;
      TextView textViewShowContentRating = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowContentRating == null) {
        break missingId;
      }

      id = R.id.textViewShowFirstAirdate;
      TextView textViewShowFirstAirdate = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowFirstAirdate == null) {
        break missingId;
      }

      id = R.id.textViewShowGenres;
      TextView textViewShowGenres = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowGenres == null) {
        break missingId;
      }

      id = R.id.textViewShowOverview;
      TextView textViewShowOverview = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowOverview == null) {
        break missingId;
      }

      id = R.id.textViewShowReleaseCountry;
      TextView textViewShowReleaseCountry = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowReleaseCountry == null) {
        break missingId;
      }

      return new FragmentShowMetaBinding(rootView, buttonShowLanguage, binding_containerShowPeople,
          textShowLastUpdated, textViewShowContentRating, textViewShowFirstAirdate,
          textViewShowGenres, textViewShowOverview, textViewShowReleaseCountry);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}