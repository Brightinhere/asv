// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.uwetrottmann.seriesguide.widgets.SlidingTabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ShowsDistillationFragment_ViewBinding implements Unbinder {
  private ShowsDistillationFragment target;

  @UiThread
  public ShowsDistillationFragment_ViewBinding(ShowsDistillationFragment target, View source) {
    this.target = target;

    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tabLayoutShowsDistillation, "field 'tabLayout'", SlidingTabLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPagerShowsDistillation, "field 'viewPager'", ViewPager.class);
  }

  @Override
  public void unbind() {
    ShowsDistillationFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabLayout = null;
    target.viewPager = null;
  }
}
