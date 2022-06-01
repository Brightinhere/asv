package com.battlelancer.seriesguide.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u0012\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/battlelancer/seriesguide/databinding/ItemDiscoverMovieBinding;", "itemClickListener", "Lcom/battlelancer/seriesguide/movies/MovieClickListener;", "(Lcom/battlelancer/seriesguide/databinding/ItemDiscoverMovieBinding;Lcom/battlelancer/seriesguide/movies/MovieClickListener;)V", "getBinding", "()Lcom/battlelancer/seriesguide/databinding/ItemDiscoverMovieBinding;", "contextMenu", "Landroidx/appcompat/widget/AppCompatImageView;", "date", "Landroid/widget/TextView;", "movieTmdbId", "", "poster", "Landroid/widget/ImageView;", "title", "bindTo", "", "sgMovie", "Lcom/battlelancer/seriesguide/movies/database/SgMovie;", "dateFormatMovieReleaseDate", "Ljava/text/DateFormat;", "posterBaseUrl", "", "tmdbMovie", "Lcom/uwetrottmann/tmdb2/entities/BaseMovie;", "context", "Landroid/content/Context;", "Companion", "app_pureDebug"})
public final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final com.battlelancer.seriesguide.databinding.ItemDiscoverMovieBinding binding = null;
    private int movieTmdbId = 0;
    private final android.widget.TextView title = null;
    private final android.widget.TextView date = null;
    private final android.widget.ImageView poster = null;
    private final androidx.appcompat.widget.AppCompatImageView contextMenu = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.movies.MovieViewHolder.Companion Companion = null;
    
    public MovieViewHolder(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.databinding.ItemDiscoverMovieBinding binding, @org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.movies.MovieClickListener itemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.databinding.ItemDiscoverMovieBinding getBinding() {
        return null;
    }
    
    public final void bindTo(@org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.movies.database.SgMovie sgMovie, @org.jetbrains.annotations.NotNull()
    java.text.DateFormat dateFormatMovieReleaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String posterBaseUrl) {
    }
    
    public final void bindTo(@org.jetbrains.annotations.Nullable()
    com.uwetrottmann.tmdb2.entities.BaseMovie tmdbMovie, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.text.DateFormat dateFormatMovieReleaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String posterBaseUrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.battlelancer.seriesguide.movies.MovieViewHolder inflate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable()
    com.battlelancer.seriesguide.movies.MovieClickListener itemClickListener) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/battlelancer/seriesguide/movies/MovieViewHolder$Companion;", "", "()V", "areContentsTheSame", "", "oldItem", "Lcom/uwetrottmann/tmdb2/entities/BaseMovie;", "newItem", "inflate", "Lcom/battlelancer/seriesguide/movies/MovieViewHolder;", "parent", "Landroid/view/ViewGroup;", "itemClickListener", "Lcom/battlelancer/seriesguide/movies/MovieClickListener;", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.battlelancer.seriesguide.movies.MovieViewHolder inflate(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable()
        com.battlelancer.seriesguide.movies.MovieClickListener itemClickListener) {
            return null;
        }
        
        public final boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.uwetrottmann.tmdb2.entities.BaseMovie oldItem, @org.jetbrains.annotations.NotNull()
        com.uwetrottmann.tmdb2.entities.BaseMovie newItem) {
            return false;
        }
    }
}