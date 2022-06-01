package com.battlelancer.seriesguide.extensions;

import java.lang.System;

/**
 * Searches the Google Play TV and movies section for an episode or movie.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/extensions/GooglePlayExtension;", "Lcom/battlelancer/seriesguide/api/SeriesGuideExtension;", "()V", "onRequest", "", "episodeIdentifier", "", "episode", "Lcom/battlelancer/seriesguide/api/Episode;", "movieIdentifier", "movie", "Lcom/battlelancer/seriesguide/api/Movie;", "publishGooglePlayAction", "identifier", "searchTerm", "", "app_amazonDebug"})
public final class GooglePlayExtension extends com.battlelancer.seriesguide.api.SeriesGuideExtension {
    
    public GooglePlayExtension() {
        super(null);
    }
    
    @java.lang.Override()
    protected void onRequest(int episodeIdentifier, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.api.Episode episode) {
    }
    
    @java.lang.Override()
    protected void onRequest(int movieIdentifier, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.api.Movie movie) {
    }
    
    private final void publishGooglePlayAction(int identifier, java.lang.String searchTerm) {
    }
}