// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.search.discover;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.EmptyView;
import com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ShowsDiscoverFragment_ViewBinding implements Unbinder {
  private ShowsDiscoverFragment target;

  @UiThread
  public ShowsDiscoverFragment_ViewBinding(ShowsDiscoverFragment target, View source) {
    this.target = target;

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayoutShowsDiscover, "field 'swipeRefreshLayout'", EmptyViewSwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerViewShowsDiscover, "field 'recyclerView'", RecyclerView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyViewShowsDiscover, "field 'emptyView'", EmptyView.class);
  }

  @Override
  public void unbind() {
    ShowsDiscoverFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
    target.recyclerView = null;
    target.emptyView = null;
  }
}
