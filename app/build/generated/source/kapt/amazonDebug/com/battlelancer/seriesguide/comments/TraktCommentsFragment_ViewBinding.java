// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.comments;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.uwetrottmann.seriesguide.widgets.EmptyViewSwipeRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TraktCommentsFragment_ViewBinding implements Unbinder {
  private TraktCommentsFragment target;

  @UiThread
  public TraktCommentsFragment_ViewBinding(TraktCommentsFragment target, View source) {
    this.target = target;

    target.list = Utils.findRequiredViewAsType(source, R.id.listViewShouts, "field 'list'", ListView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.textViewShoutsEmpty, "field 'emptyView'", TextView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayoutShouts, "field 'swipeRefreshLayout'", EmptyViewSwipeRefreshLayout.class);
    target.buttonShout = Utils.findRequiredViewAsType(source, R.id.buttonShouts, "field 'buttonShout'", Button.class);
    target.editTextShout = Utils.findRequiredViewAsType(source, R.id.editTextShouts, "field 'editTextShout'", EditText.class);
    target.checkBoxIsSpoiler = Utils.findRequiredViewAsType(source, R.id.checkBoxShouts, "field 'checkBoxIsSpoiler'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TraktCommentsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.list = null;
    target.emptyView = null;
    target.swipeRefreshLayout = null;
    target.buttonShout = null;
    target.editTextShout = null;
    target.checkBoxIsSpoiler = null;
  }
}
