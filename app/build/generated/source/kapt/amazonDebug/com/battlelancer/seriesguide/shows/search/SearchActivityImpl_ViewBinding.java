// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.shows.search;

import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.google.android.material.textfield.TextInputLayout;
import com.uwetrottmann.seriesguide.widgets.SlidingTabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchActivityImpl_ViewBinding implements Unbinder {
  private SearchActivityImpl target;

  @UiThread
  public SearchActivityImpl_ViewBinding(SearchActivityImpl target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchActivityImpl_ViewBinding(SearchActivityImpl target, View source) {
    this.target = target;

    target.searchContainer = Utils.findRequiredView(source, R.id.containerSearchBar, "field 'searchContainer'");
    target.searchInputLayout = Utils.findRequiredViewAsType(source, R.id.text_input_layout_toolbar, "field 'searchInputLayout'", TextInputLayout.class);
    target.searchAutoCompleteView = Utils.findRequiredViewAsType(source, R.id.auto_complete_view_toolbar, "field 'searchAutoCompleteView'", AutoCompleteTextView.class);
    target.tabs = Utils.findRequiredViewAsType(source, R.id.tabsSearch, "field 'tabs'", SlidingTabLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.pagerSearch, "field 'viewPager'", ViewPager2.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchActivityImpl target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.searchContainer = null;
    target.searchInputLayout = null;
    target.searchAutoCompleteView = null;
    target.tabs = null;
    target.viewPager = null;
  }
}
