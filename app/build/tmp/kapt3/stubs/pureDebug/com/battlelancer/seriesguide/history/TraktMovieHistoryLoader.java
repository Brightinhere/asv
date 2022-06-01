package com.battlelancer.seriesguide.history;

import java.lang.System;

/**
 * Loads the last few movies watched on Trakt.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f0\u000eH\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/history/TraktMovieHistoryLoader;", "Lcom/battlelancer/seriesguide/history/TraktEpisodeHistoryLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "action", "", "getAction", "()Ljava/lang/String;", "emptyText", "", "getEmptyText", "()I", "buildCall", "Lretrofit2/Call;", "", "Lcom/uwetrottmann/trakt5/entities/HistoryEntry;", "app_pureDebug"})
public final class TraktMovieHistoryLoader extends com.battlelancer.seriesguide.history.TraktEpisodeHistoryLoader {
    
    public TraktMovieHistoryLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAction() {
        return null;
    }
    
    @java.lang.Override()
    public int getEmptyText() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected retrofit2.Call<java.util.List<com.uwetrottmann.trakt5.entities.HistoryEntry>> buildCall() {
        return null;
    }
}