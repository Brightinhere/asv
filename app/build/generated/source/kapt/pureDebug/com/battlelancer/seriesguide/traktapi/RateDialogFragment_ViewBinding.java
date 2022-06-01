// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.traktapi;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RateDialogFragment_ViewBinding implements Unbinder {
  private RateDialogFragment target;

  @UiThread
  public RateDialogFragment_ViewBinding(RateDialogFragment target, View source) {
    this.target = target;

    target.ratingButtons = Utils.listFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.rating1, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating2, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating3, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating4, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating5, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating6, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating7, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating8, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating9, "field 'ratingButtons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.rating10, "field 'ratingButtons'", Button.class));
  }

  @Override
  @CallSuper
  public void unbind() {
    RateDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ratingButtons = null;
  }
}
