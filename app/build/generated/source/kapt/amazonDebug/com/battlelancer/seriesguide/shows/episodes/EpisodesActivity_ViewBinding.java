// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.episodes;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.uwetrottmann.seriesguide.widgets.SlidingTabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class EpisodesActivity_ViewBinding implements Unbinder {
  private EpisodesActivity target;

  @UiThread
  public EpisodesActivity_ViewBinding(EpisodesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EpisodesActivity_ViewBinding(EpisodesActivity target, View source) {
    this.target = target;

    target.containerList = Utils.findRequiredViewAsType(source, R.id.fragment_episodes, "field 'containerList'", ViewGroup.class);
    target.containerPager = Utils.findOptionalViewAsType(source, R.id.containerEpisodesPager, "field 'containerPager'", ViewGroup.class);
    target.episodeDetailsPager = Utils.findRequiredViewAsType(source, R.id.pagerEpisodes, "field 'episodeDetailsPager'", ViewPager2.class);
    target.episodeDetailsTabs = Utils.findRequiredViewAsType(source, R.id.tabsEpisodes, "field 'episodeDetailsTabs'", SlidingTabLayout.class);
    target.backgroundImageView = Utils.findRequiredViewAsType(source, R.id.imageViewEpisodesBackground, "field 'backgroundImageView'", ImageView.class);
  }

  @Override
  public void unbind() {
    EpisodesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.containerList = null;
    target.containerPager = null;
    target.episodeDetailsPager = null;
    target.episodeDetailsTabs = null;
    target.backgroundImageView = null;
  }
}
