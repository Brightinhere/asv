// Generated by Dagger (https://dagger.dev).
package com.battlelancer.seriesguide.shows.tools;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetShowTools_Factory implements Factory<GetShowTools> {
  private final Provider<Context> contextProvider;

  public GetShowTools_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public GetShowTools get() {
    return newInstance(contextProvider.get());
  }

  public static GetShowTools_Factory create(Provider<Context> contextProvider) {
    return new GetShowTools_Factory(contextProvider);
  }

  public static GetShowTools newInstance(Context context) {
    return new GetShowTools(context);
  }
}
