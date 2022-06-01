package com.battlelancer.seriesguide.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/modules/TestHttpClientModule;", "Lcom/battlelancer/seriesguide/modules/HttpClientModule;", "()V", "provideOkHttpCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "app_pureDebug"})
public final class TestHttpClientModule extends com.battlelancer.seriesguide.modules.HttpClientModule {
    
    public TestHttpClientModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Cache provideOkHttpCache(@org.jetbrains.annotations.NotNull()
    @ApplicationContext()
    android.content.Context context) {
        return null;
    }
}