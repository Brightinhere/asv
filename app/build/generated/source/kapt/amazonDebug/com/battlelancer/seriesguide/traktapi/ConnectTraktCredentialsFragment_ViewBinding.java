// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.traktapi;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.widgets.FeatureStatusView;
import com.battlelancer.seriesguide.ui.widgets.SyncStatusView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ConnectTraktCredentialsFragment_ViewBinding implements Unbinder {
  private ConnectTraktCredentialsFragment target;

  @UiThread
  public ConnectTraktCredentialsFragment_ViewBinding(ConnectTraktCredentialsFragment target,
      View source) {
    this.target = target;

    target.textViewAbout = Utils.findRequiredViewAsType(source, R.id.textViewTraktAbout, "field 'textViewAbout'", TextView.class);
    target.buttonAccount = Utils.findRequiredViewAsType(source, R.id.buttonTraktConnect, "field 'buttonAccount'", Button.class);
    target.textViewUsername = Utils.findRequiredViewAsType(source, R.id.textViewTraktUser, "field 'textViewUsername'", TextView.class);
    target.syncStatusView = Utils.findRequiredViewAsType(source, R.id.syncStatusTrakt, "field 'syncStatusView'", SyncStatusView.class);
    target.featureStatusCheckIn = Utils.findRequiredViewAsType(source, R.id.featureStatusTraktCheckIn, "field 'featureStatusCheckIn'", FeatureStatusView.class);
    target.featureStatusSync = Utils.findRequiredViewAsType(source, R.id.featureStatusTraktSync, "field 'featureStatusSync'", FeatureStatusView.class);
    target.featureStatusSyncShows = Utils.findRequiredViewAsType(source, R.id.featureStatusTraktSyncShows, "field 'featureStatusSyncShows'", FeatureStatusView.class);
    target.featureStatusSyncMovies = Utils.findRequiredViewAsType(source, R.id.featureStatusTraktSyncMovies, "field 'featureStatusSyncMovies'", FeatureStatusView.class);
    target.buttonLibrary = Utils.findRequiredViewAsType(source, R.id.buttonTraktLibrary, "field 'buttonLibrary'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ConnectTraktCredentialsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textViewAbout = null;
    target.buttonAccount = null;
    target.textViewUsername = null;
    target.syncStatusView = null;
    target.featureStatusCheckIn = null;
    target.featureStatusSync = null;
    target.featureStatusSyncShows = null;
    target.featureStatusSyncMovies = null;
    target.buttonLibrary = null;
  }
}
