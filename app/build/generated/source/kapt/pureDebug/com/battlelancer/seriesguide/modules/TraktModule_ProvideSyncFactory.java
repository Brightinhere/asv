// Generated by Dagger (https://dagger.dev).
package com.battlelancer.seriesguide.modules;

import com.uwetrottmann.trakt5.TraktV2;
import com.uwetrottmann.trakt5.services.Sync;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TraktModule_ProvideSyncFactory implements Factory<Sync> {
  private final TraktModule module;

  private final Provider<TraktV2> traktProvider;

  public TraktModule_ProvideSyncFactory(TraktModule module, Provider<TraktV2> traktProvider) {
    this.module = module;
    this.traktProvider = traktProvider;
  }

  @Override
  @Nullable
  public Sync get() {
    return provideSync(module, traktProvider.get());
  }

  public static TraktModule_ProvideSyncFactory create(TraktModule module,
      Provider<TraktV2> traktProvider) {
    return new TraktModule_ProvideSyncFactory(module, traktProvider);
  }

  @Nullable
  public static Sync provideSync(TraktModule instance, TraktV2 trakt) {
    return instance.provideSync(trakt);
  }
}