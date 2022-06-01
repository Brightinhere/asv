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

public final class ShowsDiscoverAdapter$LinkViewHolder_ViewBinding implements Unbinder {
  private ShowsDiscoverAdapter.LinkViewHolder target;

  @UiThread
  public ShowsDiscoverAdapter$LinkViewHolder_ViewBinding(ShowsDiscoverAdapter.LinkViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.textViewGridLink, "field 'title'", TextView.class);
  }

  @Override
  public void unbind() {
    ShowsDiscoverAdapter.LinkViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
  }
}
