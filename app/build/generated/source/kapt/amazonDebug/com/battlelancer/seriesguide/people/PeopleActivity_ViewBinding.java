// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.people;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PeopleActivity_ViewBinding implements Unbinder {
  private PeopleActivity target;

  @UiThread
  public PeopleActivity_ViewBinding(PeopleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PeopleActivity_ViewBinding(PeopleActivity target, View source) {
    this.target = target;

    target.shadowPeoplePane = source.findViewById(R.id.viewPeopleShadowStart);
    target.containerPeople = Utils.findRequiredView(source, R.id.containerPeople, "field 'containerPeople'");
  }

  @Override
  @CallSuper
  public void unbind() {
    PeopleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.shadowPeoplePane = null;
    target.containerPeople = null;
  }
}
