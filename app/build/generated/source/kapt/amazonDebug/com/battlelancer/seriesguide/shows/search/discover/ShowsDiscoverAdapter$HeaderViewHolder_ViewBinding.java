// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.search.discover;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ShowsDiscoverAdapter$HeaderViewHolder_ViewBinding implements Unbinder {
  private ShowsDiscoverAdapter.HeaderViewHolder target;

  @UiThread
  public ShowsDiscoverAdapter$HeaderViewHolder_ViewBinding(
      ShowsDiscoverAdapter.HeaderViewHolder target, View source) {
    this.target = target;

    target.header = Utils.findRequiredViewAsType(source, R.id.textViewGridHeader, "field 'header'", TextView.class);
  }

  @Override
  public void unbind() {
    ShowsDiscoverAdapter.HeaderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.header = null;
  }
}
