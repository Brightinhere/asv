// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.movies;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoviesNowFragment_ViewBinding implements Unbinder {
  private MoviesNowFragment target;

  @UiThread
  public MoviesNowFragment_ViewBinding(MoviesNowFragment target, View source) {
    this.target = target;

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayoutNow, "field 'swipeRefreshLayout'", EmptyViewSwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerViewNow, "field 'recyclerView'", RecyclerView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyViewNow, "field 'emptyView'", TextView.class);
    target.snackbar = Utils.findRequiredView(source, R.id.containerSnackbar, "field 'snackbar'");
    target.snackbarText = Utils.findRequiredViewAsType(source, R.id.textViewSnackbar, "field 'snackbarText'", TextView.class);
    target.snackbarButton = Utils.findRequiredViewAsType(source, R.id.buttonSnackbar, "field 'snackbarButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesNowFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
    target.recyclerView = null;
    target.emptyView = null;
    target.snackbar = null;
    target.snackbarText = null;
    target.snackbarButton = null;
  }
}
