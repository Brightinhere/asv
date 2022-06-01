// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class ItemPersonBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageViewPerson;

  @NonNull
  public final ConstraintLayout rootItemPerson;

  @NonNull
  public final TextView textViewPerson;

  @NonNull
  public final TextView textViewPersonDescription;

  private ItemPersonBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageViewPerson,
      @NonNull ConstraintLayout rootItemPerson, @NonNull TextView textViewPerson,
      @NonNull TextView textViewPersonDescription) {
    this.rootView = rootView;
    this.imageViewPerson = imageViewPerson;
    this.rootItemPerson = rootItemPerson;
    this.textViewPerson = textViewPerson;
    this.textViewPersonDescription = textViewPersonDescription;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPersonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPersonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_person, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPersonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewPerson;
      ImageView imageViewPerson = ViewBindings.findChildViewById(rootView, id);
      if (imageViewPerson == null) {
        break missingId;
      }

      ConstraintLayout rootItemPerson = (ConstraintLayout) rootView;

      id = R.id.textViewPerson;
      TextView textViewPerson = ViewBindings.findChildViewById(rootView, id);
      if (textViewPerson == null) {
        break missingId;
      }

      id = R.id.textViewPersonDescription;
      TextView textViewPersonDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewPersonDescription == null) {
        break missingId;
      }

      return new ItemPersonBinding((ConstraintLayout) rootView, imageViewPerson, rootItemPerson,
          textViewPerson, textViewPersonDescription);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
