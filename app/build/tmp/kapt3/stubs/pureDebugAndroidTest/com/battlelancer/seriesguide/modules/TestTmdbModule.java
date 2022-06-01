package com.battlelancer.seriesguide.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/modules/TestTmdbModule;", "Lcom/battlelancer/seriesguide/modules/TmdbModule;", "()V", "providePeopleService", "Lcom/uwetrottmann/tmdb2/services/PeopleService;", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "provideSearchService", "Lcom/uwetrottmann/tmdb2/services/SearchService;", "provideTvService", "Lcom/uwetrottmann/tmdb2/services/TvService;", "app_pureDebug"})
public final class TestTmdbModule extends com.battlelancer.seriesguide.modules.TmdbModule {
    
    public TestTmdbModule() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.tmdb2.services.PeopleService providePeopleService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.tmdb2.services.SearchService provideSearchService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.uwetrottmann.tmdb2.services.TvService provideTvService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
}