// Generated by Dagger (https://dagger.dev).
package com.battlelancer.seriesguide.traktapi;

import com.uwetrottmann.trakt5.TraktV2;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SgTraktInterceptor_Factory implements Factory<SgTraktInterceptor> {
  private final Provider<TraktV2> traktProvider;

  public SgTraktInterceptor_Factory(Provider<TraktV2> traktProvider) {
    this.traktProvider = traktProvider;
  }

  @Override
  public SgTraktInterceptor get() {
    return newInstance(DoubleCheck.lazy(traktProvider));
  }

  public static SgTraktInterceptor_Factory create(Provider<TraktV2> traktProvider) {
    return new SgTraktInterceptor_Factory(traktProvider);
  }

  public static SgTraktInterceptor newInstance(Lazy<TraktV2> trakt) {
    return new SgTraktInterceptor(trakt);
  }
}
