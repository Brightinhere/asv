// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogStreamingInfoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonStreamingInfoRegion;

  @NonNull
  public final TextView textViewStreamingInfoPowered;

  private DialogStreamingInfoBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonStreamingInfoRegion, @NonNull TextView textViewStreamingInfoPowered) {
    this.rootView = rootView;
    this.buttonStreamingInfoRegion = buttonStreamingInfoRegion;
    this.textViewStreamingInfoPowered = textViewStreamingInfoPowered;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogStreamingInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogStreamingInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_streaming_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogStreamingInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonStreamingInfoRegion;
      Button buttonStreamingInfoRegion = ViewBindings.findChildViewById(rootView, id);
      if (buttonStreamingInfoRegion == null) {
        break missingId;
      }

      id = R.id.textViewStreamingInfoPowered;
      TextView textViewStreamingInfoPowered = ViewBindings.findChildViewById(rootView, id);
      if (textViewStreamingInfoPowered == null) {
        break missingId;
      }

      return new DialogStreamingInfoBinding((ConstraintLayout) rootView, buttonStreamingInfoRegion,
          textViewStreamingInfoPowered);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
