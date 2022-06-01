// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.search.discover;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddIndicator_ViewBinding implements Unbinder {
  private AddIndicator target;

  @UiThread
  public AddIndicator_ViewBinding(AddIndicator target) {
    this(target, target);
  }

  @UiThread
  public AddIndicator_ViewBinding(AddIndicator target, View source) {
    this.target = target;

    target.add = Utils.findRequiredViewAsType(source, R.id.imageViewAddIndicator, "field 'add'", ImageView.class);
    target.added = Utils.findRequiredViewAsType(source, R.id.imageViewAddIndicatorAdded, "field 'added'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBarAddIndicator, "field 'progressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddIndicator target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.add = null;
    target.added = null;
    target.progressBar = null;
  }
}
