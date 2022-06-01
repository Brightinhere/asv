package com.battlelancer.seriesguide.modules;

import java.lang.System;

/**
 * WARNING: for Dagger2 to work with kapt, this interface has to be in Kotlin.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\n\u0010 \u001a\u0004\u0018\u00010!H&J\n\u0010\"\u001a\u0004\u0018\u00010#H&\u00a8\u0006$"}, d2 = {"Lcom/battlelancer/seriesguide/modules/ServicesComponent;", "", "addUpdateShowTools", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools;", "getShowTools", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools;", "hexagonShowSync", "Lcom/battlelancer/seriesguide/sync/HexagonShowSync;", "hexagonTools", "Lcom/battlelancer/seriesguide/backend/HexagonTools;", "inject", "", "traktCommentsLoader", "Lcom/battlelancer/seriesguide/comments/TraktCommentsLoader;", "traktAddLoader", "Lcom/battlelancer/seriesguide/shows/search/discover/TraktAddLoader;", "addShowTask", "Lcom/battlelancer/seriesguide/shows/tools/AddShowTask;", "sgSyncAdapter", "Lcom/battlelancer/seriesguide/sync/SgSyncAdapter;", "movieTools", "Lcom/battlelancer/seriesguide/movies/tools/MovieTools;", "moviesService", "Lcom/uwetrottmann/tmdb2/services/MoviesService;", "peopleService", "Lcom/uwetrottmann/tmdb2/services/PeopleService;", "showTools", "Lcom/battlelancer/seriesguide/shows/tools/ShowTools2;", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "trakt", "Lcom/uwetrottmann/trakt5/TraktV2;", "traktSync", "Lcom/uwetrottmann/trakt5/services/Sync;", "traktUsers", "Lcom/uwetrottmann/trakt5/services/Users;", "app_amazonDebug"})
@dagger.Component(modules = {com.battlelancer.seriesguide.modules.AppModule.class, com.battlelancer.seriesguide.modules.HttpClientModule.class, com.battlelancer.seriesguide.modules.TmdbModule.class, com.battlelancer.seriesguide.modules.TraktModule.class})
@javax.inject.Singleton()
public abstract interface ServicesComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.backend.HexagonTools hexagonTools();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.sync.HexagonShowSync hexagonShowSync();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.uwetrottmann.tmdb2.services.MoviesService moviesService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.movies.tools.MovieTools movieTools();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.uwetrottmann.tmdb2.services.PeopleService peopleService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.shows.tools.ShowTools2 showTools();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools addUpdateShowTools();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.battlelancer.seriesguide.shows.tools.GetShowTools getShowTools();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.uwetrottmann.tmdb2.Tmdb tmdb();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.uwetrottmann.trakt5.TraktV2 trakt();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.uwetrottmann.trakt5.services.Sync traktSync();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.uwetrottmann.trakt5.services.Users traktUsers();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.tools.AddShowTask addShowTask);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.sync.SgSyncAdapter sgSyncAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.search.discover.TraktAddLoader traktAddLoader);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.comments.TraktCommentsLoader traktCommentsLoader);
}