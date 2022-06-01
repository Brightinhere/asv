// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.extensions;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.uwetrottmann.seriesguide.widgets.dragsortview.DragSortListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ExtensionsConfigurationFragment_ViewBinding implements Unbinder {
  private ExtensionsConfigurationFragment target;

  @UiThread
  public ExtensionsConfigurationFragment_ViewBinding(ExtensionsConfigurationFragment target,
      View source) {
    this.target = target;

    target.listView = Utils.findRequiredViewAsType(source, R.id.listViewExtensionsConfiguration, "field 'listView'", DragSortListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ExtensionsConfigurationFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
  }
}
