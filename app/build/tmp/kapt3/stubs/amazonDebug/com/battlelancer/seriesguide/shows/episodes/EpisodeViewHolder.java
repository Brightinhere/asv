package com.battlelancer.seriesguide.shows.episodes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/battlelancer/seriesguide/databinding/ItemEpisodeBinding;", "clickListener", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter$ClickListener;", "(Lcom/battlelancer/seriesguide/databinding/ItemEpisodeBinding;Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter$ClickListener;)V", "episode", "Lcom/battlelancer/seriesguide/shows/database/SgEpisode2Info;", "integerFormat", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "bind", "", "isActivated", "", "context", "Landroid/content/Context;", "Companion", "app_amazonDebug"})
public final class EpisodeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.battlelancer.seriesguide.databinding.ItemEpisodeBinding binding = null;
    private final java.text.NumberFormat integerFormat = null;
    private com.battlelancer.seriesguide.shows.database.SgEpisode2Info episode;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.episodes.EpisodeViewHolder.Companion Companion = null;
    
    public EpisodeViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.databinding.ItemEpisodeBinding binding, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.shows.episodes.EpisodesAdapter.ClickListener clickListener) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.shows.database.SgEpisode2Info episode, boolean isActivated, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/episodes/EpisodeViewHolder$Companion;", "", "()V", "create", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodeViewHolder;", "parent", "Landroid/view/ViewGroup;", "clickListener", "Lcom/battlelancer/seriesguide/shows/episodes/EpisodesAdapter$ClickListener;", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.battlelancer.seriesguide.shows.episodes.EpisodeViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        com.battlelancer.seriesguide.shows.episodes.EpisodesAdapter.ClickListener clickListener) {
            return null;
        }
    }
}