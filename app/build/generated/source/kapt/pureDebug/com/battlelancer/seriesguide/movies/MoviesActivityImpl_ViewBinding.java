// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.movies;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.uwetrottmann.seriesguide.widgets.SlidingTabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoviesActivityImpl_ViewBinding implements Unbinder {
  private MoviesActivityImpl target;

  @UiThread
  public MoviesActivityImpl_ViewBinding(MoviesActivityImpl target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MoviesActivityImpl_ViewBinding(MoviesActivityImpl target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPagerTabs, "field 'viewPager'", ViewPager2.class);
    target.tabs = Utils.findRequiredViewAsType(source, R.id.tabLayoutTabs, "field 'tabs'", SlidingTabLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesActivityImpl target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
    target.tabs = null;
  }
}
