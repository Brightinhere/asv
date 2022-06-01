// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.history;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NowAdapter$HistoryViewHolder_ViewBinding implements Unbinder {
  private NowAdapter.HistoryViewHolder target;

  @UiThread
  public NowAdapter$HistoryViewHolder_ViewBinding(NowAdapter.HistoryViewHolder target,
      View source) {
    this.target = target;

    target.header = Utils.findRequiredViewAsType(source, R.id.textViewHistoryHeader, "field 'header'", TextView.class);
    target.containerItem = Utils.findRequiredViewAsType(source, R.id.constaintLayoutHistory, "field 'containerItem'", ViewGroup.class);
    target.show = Utils.findRequiredViewAsType(source, R.id.textViewHistoryShow, "field 'show'", TextView.class);
    target.episode = Utils.findRequiredViewAsType(source, R.id.textViewHistoryEpisode, "field 'episode'", TextView.class);
    target.poster = Utils.findRequiredViewAsType(source, R.id.imageViewHistoryPoster, "field 'poster'", ImageView.class);
    target.info = Utils.findRequiredViewAsType(source, R.id.textViewHistoryInfo, "field 'info'", TextView.class);
    target.avatar = Utils.findRequiredViewAsType(source, R.id.imageViewHistoryAvatar, "field 'avatar'", ImageView.class);
    target.type = Utils.findRequiredViewAsType(source, R.id.imageViewHistoryType, "field 'type'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NowAdapter.HistoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.header = null;
    target.containerItem = null;
    target.show = null;
    target.episode = null;
    target.poster = null;
    target.info = null;
    target.avatar = null;
    target.type = null;
  }
}
