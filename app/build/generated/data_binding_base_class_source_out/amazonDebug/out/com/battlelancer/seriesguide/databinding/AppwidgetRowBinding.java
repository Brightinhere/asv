// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppwidgetRowBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final RelativeLayout relativeLayoutWidgetText;

  @NonNull
  public final TextView textViewWidgetEpisode;

  @NonNull
  public final TextView textViewWidgetShow;

  @NonNull
  public final TextView widgetAirtime;

  @NonNull
  public final TextView widgetNetwork;

  @NonNull
  public final ImageView widgetPoster;

  @NonNull
  public final ImageButton widgetWatchedButton;

  private AppwidgetRowBinding(@NonNull View rootView,
      @NonNull RelativeLayout relativeLayoutWidgetText, @NonNull TextView textViewWidgetEpisode,
      @NonNull TextView textViewWidgetShow, @NonNull TextView widgetAirtime,
      @NonNull TextView widgetNetwork, @NonNull ImageView widgetPoster,
      @NonNull ImageButton widgetWatchedButton) {
    this.rootView = rootView;
    this.relativeLayoutWidgetText = relativeLayoutWidgetText;
    this.textViewWidgetEpisode = textViewWidgetEpisode;
    this.textViewWidgetShow = textViewWidgetShow;
    this.widgetAirtime = widgetAirtime;
    this.widgetNetwork = widgetNetwork;
    this.widgetPoster = widgetPoster;
    this.widgetWatchedButton = widgetWatchedButton;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static AppwidgetRowBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.appwidget_row, parent);
    return bind(parent);
  }

  @NonNull
  public static AppwidgetRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.relativeLayoutWidgetText;
      RelativeLayout relativeLayoutWidgetText = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayoutWidgetText == null) {
        break missingId;
      }

      id = R.id.textViewWidgetEpisode;
      TextView textViewWidgetEpisode = ViewBindings.findChildViewById(rootView, id);
      if (textViewWidgetEpisode == null) {
        break missingId;
      }

      id = R.id.textViewWidgetShow;
      TextView textViewWidgetShow = ViewBindings.findChildViewById(rootView, id);
      if (textViewWidgetShow == null) {
        break missingId;
      }

      id = R.id.widgetAirtime;
      TextView widgetAirtime = ViewBindings.findChildViewById(rootView, id);
      if (widgetAirtime == null) {
        break missingId;
      }

      id = R.id.widgetNetwork;
      TextView widgetNetwork = ViewBindings.findChildViewById(rootView, id);
      if (widgetNetwork == null) {
        break missingId;
      }

      id = R.id.widgetPoster;
      ImageView widgetPoster = ViewBindings.findChildViewById(rootView, id);
      if (widgetPoster == null) {
        break missingId;
      }

      id = R.id.widgetWatchedButton;
      ImageButton widgetWatchedButton = ViewBindings.findChildViewById(rootView, id);
      if (widgetWatchedButton == null) {
        break missingId;
      }

      return new AppwidgetRowBinding(rootView, relativeLayoutWidgetText, textViewWidgetEpisode,
          textViewWidgetShow, widgetAirtime, widgetNetwork, widgetPoster, widgetWatchedButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}