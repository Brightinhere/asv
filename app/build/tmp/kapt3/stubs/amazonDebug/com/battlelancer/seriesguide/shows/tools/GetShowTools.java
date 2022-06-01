package com.battlelancer.seriesguide.shows.tools;

import java.lang.System;

/**
 * Downloads details of a show.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\u00020\b*\u00020\u0010H\u0002J\f\u0010\u000f\u001a\u00020\b*\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/GetShowTools;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getShowDetails", "Lcom/github/michaelbull/result/Result;", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$ShowDetails;", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError;", "showTmdbId", "", "desiredLanguage", "", "updateOnly", "", "toGetShowError", "Lcom/battlelancer/seriesguide/tmdbapi/TmdbError;", "Lcom/battlelancer/seriesguide/traktapi/TraktError;", "GetShowError", "ShowDetails", "app_amazonDebug"})
public final class GetShowTools {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public GetShowTools(@org.jetbrains.annotations.NotNull()
    @com.battlelancer.seriesguide.modules.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    /**
     * If [updateOnly] returns a show for updating, but without its ID set!
     */
    @org.jetbrains.annotations.NotNull()
    public final com.github.michaelbull.result.Result<com.battlelancer.seriesguide.shows.tools.GetShowTools.ShowDetails, com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError> getShowDetails(int showTmdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String desiredLanguage, boolean updateOnly) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError toGetShowError(com.battlelancer.seriesguide.tmdbapi.TmdbError $this$toGetShowError) {
        return null;
    }
    
    private final com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError toGetShowError(com.battlelancer.seriesguide.traktapi.TraktError $this$toGetShowError) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$ShowDetails;", "", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "showUpdate", "Lcom/battlelancer/seriesguide/shows/database/SgShow2Update;", "seasons", "", "Lcom/uwetrottmann/tmdb2/entities/TvSeason;", "(Lcom/battlelancer/seriesguide/shows/database/SgShow2;Lcom/battlelancer/seriesguide/shows/database/SgShow2Update;Ljava/util/List;)V", "getSeasons", "()Ljava/util/List;", "getShow", "()Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "getShowUpdate", "()Lcom/battlelancer/seriesguide/shows/database/SgShow2Update;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_amazonDebug"})
    public static final class ShowDetails {
        @org.jetbrains.annotations.Nullable()
        private final com.battlelancer.seriesguide.shows.database.SgShow2 show = null;
        @org.jetbrains.annotations.Nullable()
        private final com.battlelancer.seriesguide.shows.database.SgShow2Update showUpdate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.uwetrottmann.tmdb2.entities.TvSeason> seasons = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.GetShowTools.ShowDetails copy(@org.jetbrains.annotations.Nullable()
        com.battlelancer.seriesguide.shows.database.SgShow2 show, @org.jetbrains.annotations.Nullable()
        com.battlelancer.seriesguide.shows.database.SgShow2Update showUpdate, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.uwetrottmann.tmdb2.entities.TvSeason> seasons) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowDetails() {
            super();
        }
        
        public ShowDetails(@org.jetbrains.annotations.Nullable()
        com.battlelancer.seriesguide.shows.database.SgShow2 show, @org.jetbrains.annotations.Nullable()
        com.battlelancer.seriesguide.shows.database.SgShow2Update showUpdate, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.uwetrottmann.tmdb2.entities.TvSeason> seasons) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.battlelancer.seriesguide.shows.database.SgShow2 component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.battlelancer.seriesguide.shows.database.SgShow2 getShow() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.battlelancer.seriesguide.shows.database.SgShow2Update component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.battlelancer.seriesguide.shows.database.SgShow2Update getShowUpdate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.uwetrottmann.tmdb2.entities.TvSeason> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.uwetrottmann.tmdb2.entities.TvSeason> getSeasons() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError;", "", "service", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "(Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;)V", "getService", "()Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "GetShowDoesNotExist", "GetShowRetry", "GetShowStop", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError$GetShowRetry;", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError$GetShowStop;", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError$GetShowDoesNotExist;", "app_amazonDebug"})
    public static abstract class GetShowError {
        @org.jetbrains.annotations.NotNull()
        private final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service = null;
        
        private GetShowError(com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService getService() {
            return null;
        }
        
        /**
         * The API request might succeed if tried again after a brief delay
         * (e.g. time outs or other temporary network issues).
         */
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError$GetShowRetry;", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError;", "service", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "(Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;)V", "app_amazonDebug"})
        public static final class GetShowRetry extends com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError {
            
            public GetShowRetry(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service) {
                super(null);
            }
        }
        
        /**
         * The API request is unlikely to succeed if retried, at least right now
         * (e.g. API bugs or changes).
         */
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError$GetShowStop;", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError;", "service", "Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;", "(Lcom/battlelancer/seriesguide/shows/tools/AddUpdateShowTools$ShowService;)V", "app_amazonDebug"})
        public static final class GetShowStop extends com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError {
            
            public GetShowStop(@org.jetbrains.annotations.NotNull()
            com.battlelancer.seriesguide.shows.tools.AddUpdateShowTools.ShowService service) {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError$GetShowDoesNotExist;", "Lcom/battlelancer/seriesguide/shows/tools/GetShowTools$GetShowError;", "()V", "app_amazonDebug"})
        public static final class GetShowDoesNotExist extends com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError {
            @org.jetbrains.annotations.NotNull()
            public static final com.battlelancer.seriesguide.shows.tools.GetShowTools.GetShowError.GetShowDoesNotExist INSTANCE = null;
            
            private GetShowDoesNotExist() {
                super(null);
            }
        }
    }
}