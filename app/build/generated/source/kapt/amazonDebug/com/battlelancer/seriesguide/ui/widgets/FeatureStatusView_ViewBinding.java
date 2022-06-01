// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.widgets;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeatureStatusView_ViewBinding implements Unbinder {
  private FeatureStatusView target;

  @UiThread
  public FeatureStatusView_ViewBinding(FeatureStatusView target) {
    this(target, target);
  }

  @UiThread
  public FeatureStatusView_ViewBinding(FeatureStatusView target, View source) {
    this.target = target;

    target.imageViewStatus = Utils.findRequiredViewAsType(source, R.id.imageViewStatus, "field 'imageViewStatus'", ImageView.class);
    target.textViewStatus = Utils.findRequiredViewAsType(source, R.id.textViewStatus, "field 'textViewStatus'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FeatureStatusView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageViewStatus = null;
    target.textViewStatus = null;
  }
}
