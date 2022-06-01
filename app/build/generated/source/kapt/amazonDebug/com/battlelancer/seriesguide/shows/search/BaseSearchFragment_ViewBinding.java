// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.search;

import android.view.View;
import android.widget.GridView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseSearchFragment_ViewBinding implements Unbinder {
  private BaseSearchFragment target;

  @UiThread
  public BaseSearchFragment_ViewBinding(BaseSearchFragment target, View source) {
    this.target = target;

    target.emptyView = Utils.findRequiredView(source, R.id.textViewSearchEmpty, "field 'emptyView'");
    target.gridView = Utils.findRequiredViewAsType(source, R.id.gridViewSearch, "field 'gridView'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseSearchFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emptyView = null;
    target.gridView = null;
  }
}
