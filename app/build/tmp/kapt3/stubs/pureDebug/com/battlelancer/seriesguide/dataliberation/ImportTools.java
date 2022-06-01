package com.battlelancer.seriesguide.dataliberation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/dataliberation/ImportTools;", "", "()V", "toSgEpisodeForImport", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2;", "Lcom/battlelancer/seriesguide/dataliberation/model/Episode;", "showId", "", "seasonId", "seasonNumber", "", "toSgSeasonForImport", "Lcom/battlelancer/seriesguide/shows/database/SgSeason2;", "Lcom/battlelancer/seriesguide/dataliberation/model/Season;", "toSgShowForImport", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "Lcom/battlelancer/seriesguide/dataliberation/model/Show;", "app_pureDebug"})
public final class ImportTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.dataliberation.ImportTools INSTANCE = null;
    
    private ImportTools() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.shows.database.SgShow2 toSgShowForImport(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.dataliberation.model.Show $this$toSgShowForImport) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.shows.database.SgSeason2 toSgSeasonForImport(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.dataliberation.model.Season $this$toSgSeasonForImport, long showId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.shows.database.SgEpisode2 toSgEpisodeForImport(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.dataliberation.model.Episode $this$toSgEpisodeForImport, long showId, long seasonId, int seasonNumber) {
        return null;
    }
}