package com.battlelancer.seriesguide.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/AmazonExtensionReceiver;", "Lcom/battlelancer/seriesguide/api/SeriesGuideExtensionReceiver;", "()V", "getExtensionClass", "Ljava/lang/Class;", "Lcom/battlelancer/seriesguide/api/SeriesGuideExtension;", "getJobId", "", "app_amazonDebug"})
public final class AmazonExtensionReceiver extends com.battlelancer.seriesguide.api.SeriesGuideExtensionReceiver {
    
    public AmazonExtensionReceiver() {
        super();
    }
    
    @java.lang.Override()
    protected int getJobId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<? extends com.battlelancer.seriesguide.api.SeriesGuideExtension> getExtensionClass() {
        return null;
    }
}