// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.search.discover;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ShowsDiscoverAdapter$ShowViewHolder_ViewBinding implements Unbinder {
  private ShowsDiscoverAdapter.ShowViewHolder target;

  @UiThread
  public ShowsDiscoverAdapter$ShowViewHolder_ViewBinding(ShowsDiscoverAdapter.ShowViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.textViewAddTitle, "field 'title'", TextView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.textViewAddDescription, "field 'description'", TextView.class);
    target.poster = Utils.findRequiredViewAsType(source, R.id.imageViewAddPoster, "field 'poster'", ImageView.class);
    target.addIndicator = Utils.findRequiredViewAsType(source, R.id.addIndicatorAddShow, "field 'addIndicator'", AddIndicator.class);
    target.buttonContextMenu = Utils.findRequiredViewAsType(source, R.id.buttonItemAddMore, "field 'buttonContextMenu'", ImageView.class);
  }

  @Override
  public void unbind() {
    ShowsDiscoverAdapter.ShowViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.description = null;
    target.poster = null;
    target.addIndicator = null;
    target.buttonContextMenu = null;
  }
}
