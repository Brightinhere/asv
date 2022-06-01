package com.battlelancer.seriesguide.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u001a\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0016"}, d2 = {"Lcom/battlelancer/seriesguide/modules/TraktModule;", "", "()V", "provideEpisodes", "Lcom/uwetrottmann/trakt5/services/Episodes;", "trakt", "Lcom/uwetrottmann/trakt5/TraktV2;", "provideMovies", "Lcom/uwetrottmann/trakt5/services/Movies;", "provideSearch", "Lcom/uwetrottmann/trakt5/services/Search;", "provideShows", "Lcom/uwetrottmann/trakt5/services/Shows;", "provideSync", "Lcom/uwetrottmann/trakt5/services/Sync;", "provideTrakt", "context", "Landroid/content/Context;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideUsers", "Lcom/uwetrottmann/trakt5/services/Users;", "app_amazonDebug"})
@dagger.Module()
public class TraktModule {
    
    public TraktModule() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.trakt5.services.Episodes provideEpisodes(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.trakt5.services.Movies provideMovies(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.trakt5.services.Shows provideShows(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.trakt5.services.Search provideSearch(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.trakt5.services.Sync provideSync(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public com.uwetrottmann.trakt5.services.Users provideUsers(@org.jetbrains.annotations.NotNull()
    com.uwetrottmann.trakt5.TraktV2 trakt) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.uwetrottmann.trakt5.TraktV2 provideTrakt(@org.jetbrains.annotations.NotNull()
    @ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}