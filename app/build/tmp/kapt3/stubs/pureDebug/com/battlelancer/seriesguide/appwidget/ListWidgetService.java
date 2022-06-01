package com.battlelancer.seriesguide.appwidget;

import java.lang.System;

/**
 * [RemoteViewsService] that accompanies [ListWidgetProvider] by supplying
 * item contents and layouts through [ListWidgetRemoteViewsFactory].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/battlelancer/seriesguide/appwidget/ListWidgetService;", "Landroid/widget/RemoteViewsService;", "()V", "onGetViewFactory", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "app_pureDebug"})
public final class ListWidgetService extends android.widget.RemoteViewsService {
    
    public ListWidgetService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
}