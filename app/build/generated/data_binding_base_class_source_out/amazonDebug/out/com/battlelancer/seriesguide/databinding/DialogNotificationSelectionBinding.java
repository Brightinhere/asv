// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

public final class DialogNotificationSelectionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView recyclerViewSelection;

  @NonNull
  public final LinearLayout rootViewSelection;

  @NonNull
  public final TextView textViewSelectionEmpty;

  private DialogNotificationSelectionBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView recyclerViewSelection, @NonNull LinearLayout rootViewSelection,
      @NonNull TextView textViewSelectionEmpty) {
    this.rootView = rootView;
    this.recyclerViewSelection = recyclerViewSelection;
    this.rootViewSelection = rootViewSelection;
    this.textViewSelectionEmpty = textViewSelectionEmpty;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogNotificationSelectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogNotificationSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_notification_selection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogNotificationSelectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recyclerViewSelection;
      RecyclerView recyclerViewSelection = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewSelection == null) {
        break missingId;
      }

      LinearLayout rootViewSelection = (LinearLayout) rootView;

      id = R.id.textViewSelectionEmpty;
      TextView textViewSelectionEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textViewSelectionEmpty == null) {
        break missingId;
      }

      return new DialogNotificationSelectionBinding((LinearLayout) rootView, recyclerViewSelection,
          rootViewSelection, textViewSelectionEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
