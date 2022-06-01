package com.battlelancer.seriesguide.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/battlelancer/seriesguide/modules/TestServicesComponent;", "Lcom/battlelancer/seriesguide/modules/ServicesComponent;", "inject", "", "tmdbSyncTest", "Lcom/battlelancer/seriesguide/sync/TmdbSyncTest;", "app_pureDebug"})
@dagger.Component(modules = {com.battlelancer.seriesguide.modules.AppModule.class, com.battlelancer.seriesguide.modules.HttpClientModule.class, com.battlelancer.seriesguide.modules.TmdbModule.class, com.battlelancer.seriesguide.modules.TraktModule.class})
@javax.inject.Singleton()
public abstract interface TestServicesComponent extends com.battlelancer.seriesguide.modules.ServicesComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.TmdbSyncTest tmdbSyncTest);
}