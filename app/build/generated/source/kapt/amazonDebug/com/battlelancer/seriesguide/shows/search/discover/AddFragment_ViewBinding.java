// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.search.discover;

import android.view.View;
import android.widget.GridView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.EmptyView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddFragment_ViewBinding implements Unbinder {
  private AddFragment target;

  @UiThread
  public AddFragment_ViewBinding(AddFragment target, View source) {
    this.target = target;

    target.contentContainer = Utils.findRequiredView(source, R.id.containerAddContent, "field 'contentContainer'");
    target.progressBar = Utils.findRequiredView(source, R.id.progressBarAdd, "field 'progressBar'");
    target.resultsGridView = Utils.findRequiredViewAsType(source, R.id.gridViewAdd, "field 'resultsGridView'", GridView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyViewAdd, "field 'emptyView'", EmptyView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.contentContainer = null;
    target.progressBar = null;
    target.resultsGridView = null;
    target.emptyView = null;
  }
}
