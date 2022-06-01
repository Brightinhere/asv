package com.battlelancer.seriesguide.appwidget;

import java.lang.System;

/**
 * [RemoteViewsService.RemoteViewsFactory] that supplies the actual item contents and layouts
 * to [ListWidgetService].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JU\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\bH\u0002\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\bH\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\rH\u0016J\u001a\u0010-\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010.\u001a\u00020(H\u0016J\b\u0010/\u001a\u00020(H\u0016J\b\u00100\u001a\u00020(H\u0016J\b\u00101\u001a\u00020(H\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/battlelancer/seriesguide/appwidget/ListWidgetRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;)V", "appWidgetId", "", "episodesWithShow", "", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2WithShow;", "isHideWatchButton", "", "isLargeFont", "shows", "Lcom/battlelancer/seriesguide/shows/database/SgShow2ForLists;", "theme", "Lcom/battlelancer/seriesguide/settings/WidgetSettings$WidgetTheme;", "widgetType", "bindViewAt", "Landroid/widget/RemoteViews;", "rv", "episodeId", "", "episodeDescription", "", "actualRelease", "Ljava/util/Date;", "network", "showTitle", "posterPath", "episodeFlag", "(Landroid/widget/RemoteViews;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/widget/RemoteViews;", "getCount", "getItemId", "position", "getLoadingView", "getRowLayoutResId", "getUpcomingElseRecentEpisodes", "", "isUpcomingElseRecent", "getViewAt", "getViewTypeCount", "hasStableIds", "maybeSetPoster", "onCreate", "onDataSetChanged", "onDestroy", "onQueryForData", "app_pureDebug"})
public final class ListWidgetRemoteViewsFactory implements android.widget.RemoteViewsService.RemoteViewsFactory {
    private final android.content.Context context = null;
    private final int appWidgetId = 0;
    private java.util.List<com.battlelancer.seriesguide.shows.database.SgShow2ForLists> shows;
    private java.util.List<com.battlelancer.seriesguide.shows.database.SgEpisode2WithShow> episodesWithShow;
    private int widgetType = 0;
    private com.battlelancer.seriesguide.settings.WidgetSettings.WidgetTheme theme = com.battlelancer.seriesguide.settings.WidgetSettings.WidgetTheme.SYSTEM;
    private boolean isLargeFont = false;
    private boolean isHideWatchButton = false;
    
    public ListWidgetRemoteViewsFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void onQueryForData() {
    }
    
    private final void getUpcomingElseRecentEpisodes(boolean isUpcomingElseRecent) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    private final int getRowLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RemoteViews getViewAt(int position) {
        return null;
    }
    
    private final android.widget.RemoteViews bindViewAt(android.widget.RemoteViews rv, java.lang.Long episodeId, java.lang.String episodeDescription, java.util.Date actualRelease, java.lang.String network, java.lang.String showTitle, java.lang.String posterPath, int episodeFlag) {
        return null;
    }
    
    private final void maybeSetPoster(android.widget.RemoteViews rv, java.lang.String posterPath) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RemoteViews getLoadingView() {
        return null;
    }
    
    @java.lang.Override()
    public int getViewTypeCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @java.lang.Override()
    public void onDataSetChanged() {
    }
}