// Generated by view binder compiler. Do not edit!
package com.battlelancer.seriesguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.battlelancer.seriesguide.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogListManageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonNegative;

  @NonNull
  public final Button buttonPositive;

  @NonNull
  public final LinearLayout root;

  @NonNull
  public final TextInputLayout textInputLayoutListManageListName;

  private DialogListManageBinding(@NonNull LinearLayout rootView, @NonNull Button buttonNegative,
      @NonNull Button buttonPositive, @NonNull LinearLayout root,
      @NonNull TextInputLayout textInputLayoutListManageListName) {
    this.rootView = rootView;
    this.buttonNegative = buttonNegative;
    this.buttonPositive = buttonPositive;
    this.root = root;
    this.textInputLayoutListManageListName = textInputLayoutListManageListName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogListManageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogListManageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_list_manage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogListManageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonNegative;
      Button buttonNegative = ViewBindings.findChildViewById(rootView, id);
      if (buttonNegative == null) {
        break missingId;
      }

      id = R.id.buttonPositive;
      Button buttonPositive = ViewBindings.findChildViewById(rootView, id);
      if (buttonPositive == null) {
        break missingId;
      }

      LinearLayout root = (LinearLayout) rootView;

      id = R.id.textInputLayoutListManageListName;
      TextInputLayout textInputLayoutListManageListName = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutListManageListName == null) {
        break missingId;
      }

      return new DialogListManageBinding((LinearLayout) rootView, buttonNegative, buttonPositive,
          root, textInputLayoutListManageListName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}