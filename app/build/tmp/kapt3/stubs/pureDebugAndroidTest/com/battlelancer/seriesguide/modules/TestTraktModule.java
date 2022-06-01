package com.battlelancer.seriesguide.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/modules/TestTraktModule;", "Lcom/battlelancer/seriesguide/modules/TraktModule;", "()V", "provideEpisodes", "Lcom/uwetrottmann/trakt5/services/Episodes;", "trakt", "Lcom/uwetrottmann/trakt5/TraktV2;", "provideMovies", "Lcom/uwetrottmann/trakt5/services/Movies;", "provideSearch", "Lcom/uwetrottmann/trakt5/services/Search;", "provideShows", "Lcom/uwetrottmann/trakt5/services/Shows;", "provideSync", "Lcom/uwetrottmann/trakt5/services/Sync;", "provideUsers", "Lcom/uwetrottmann/trakt5/services/Users;", "app_pureDebug"})
public final class TestTraktModule extends com.battlelancer.seriesguide.modules.TraktModule {
    
    public TestTraktModule() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.trakt5.services.Episodes provideEpisodes(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.trakt5.services.Movies provideMovies(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.trakt5.services.Shows provideShows(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.trakt5.services.Search provideSearch(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.trakt5.services.Sync provideSync(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.trakt5.services.Users provideUsers(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
}