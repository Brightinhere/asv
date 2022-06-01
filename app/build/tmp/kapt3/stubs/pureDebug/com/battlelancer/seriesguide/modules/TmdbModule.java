package com.battlelancer.seriesguide.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0012"}, d2 = {"Lcom/battlelancer/seriesguide/modules/TmdbModule;", "", "()V", "provideConfigurationService", "Lcom/uwetrottmann/tmdb2/services/ConfigurationService;", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "provideMovieService", "Lcom/uwetrottmann/tmdb2/services/MoviesService;", "providePeopleService", "Lcom/uwetrottmann/tmdb2/services/PeopleService;", "provideSearchService", "Lcom/uwetrottmann/tmdb2/services/SearchService;", "provideSgTmdb", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideTvService", "Lcom/uwetrottmann/tmdb2/services/TvService;", "app_pureDebug"})
@dagger.Module()
public class TmdbModule {
    
    public TmdbModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.uwetrottmann.tmdb2.services.ConfigurationService provideConfigurationService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.uwetrottmann.tmdb2.services.MoviesService provideMovieService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.tmdb2.services.PeopleService providePeopleService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.tmdb2.services.SearchService provideSearchService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.tmdb2.services.TvService provideTvService(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.tmdb2.Tmdb tmdb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.uwetrottmann.tmdb2.Tmdb provideSgTmdb(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}