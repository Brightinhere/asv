package com.battlelancer.seriesguide.shows.database;

import java.lang.System;

@androidx.room.Entity(tableName = "sg_show", indices = {@androidx.room.Index(value = {"series_tmdb_id"}), @androidx.room.Index(value = {"series_tvdb_id"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\bo\b\u0087\b\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001B\u0095\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010\'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010*\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020(\u00a2\u0006\u0002\u0010,J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u000b\u0010m\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0002\u0010LJ\u0010\u0010t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u0010\u0010u\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u0010\u0010v\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u0010\u0010w\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u0010\u0010x\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u000b\u0010y\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u000b\u0010~\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020(H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\n\u0010\u008c\u0001\u001a\u00020\bH\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u00b6\u0003\u0010\u0090\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020(H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0091\u0001J\u0015\u0010\u0092\u0001\u001a\u00020(2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u0095\u0001\u001a\u00020\bH\u00d6\u0001R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0016\u0010+\u001a\u00020(8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u001e\u0010)\u001a\u00020(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00100\"\u0004\b7\u00102R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0016\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0016\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0016\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00109R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u001e\u0010*\u001a\u00020(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00100\"\u0004\bG\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010M\u001a\u0004\bK\u0010LR\u0011\u0010N\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bQ\u0010RR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bT\u0010RR\u0011\u0010U\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\bV\u0010WR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010.R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bY\u0010RR\u0011\u0010Z\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b[\u0010WR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010.R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\b]\u0010RR\u0011\u0010^\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b_\u0010WR\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\b`\u0010RR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010.R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bb\u0010RR\u0011\u0010c\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\bd\u0010WR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010.R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bg\u0010RR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bh\u0010RR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bi\u0010RR\u0016\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010W\u00a8\u0006\u0097\u0001"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "", "id", "", "tmdbId", "", "tvdbId", "slug", "", "traktId", "title", "titleNoArticle", "overview", "releaseTime", "releaseWeekDay", "releaseCountry", "releaseTimeZone", "firstRelease", "genres", "network", "imdbId", "ratingGlobal", "", "ratingVotes", "ratingUser", "runtime", "status", "contentRating", "nextEpisode", "poster", "posterSmall", "nextAirdateMs", "nextText", "lastUpdatedMs", "lastEditedSec", "lastWatchedEpisodeId", "lastWatchedMs", "language", "unwatchedCount", "favorite", "", "hidden", "notify", "hexagonMergeComplete", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JJJJLjava/lang/String;IZZZZ)V", "getContentRating", "()Ljava/lang/String;", "getFavorite", "()Z", "setFavorite", "(Z)V", "getFirstRelease", "getGenres", "getHexagonMergeComplete", "getHidden", "setHidden", "getId", "()J", "getImdbId", "getLanguage", "getLastEditedSec", "getLastUpdatedMs", "getLastWatchedEpisodeId", "getLastWatchedMs", "getNetwork", "getNextAirdateMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNextEpisode", "getNextText", "getNotify", "setNotify", "getOverview", "getPoster", "getPosterSmall", "getRatingGlobal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "ratingGlobalOrZero", "getRatingGlobalOrZero", "()D", "getRatingUser", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRatingVotes", "ratingVotesOrZero", "getRatingVotesOrZero", "()I", "getReleaseCountry", "getReleaseTime", "releaseTimeOrDefault", "getReleaseTimeOrDefault", "getReleaseTimeZone", "getReleaseWeekDay", "releaseWeekDayOrDefault", "getReleaseWeekDayOrDefault", "getRuntime", "getSlug", "getStatus", "statusOrUnknown", "getStatusOrUnknown", "getTitle", "getTitleNoArticle", "getTmdbId", "getTraktId", "getTvdbId", "getUnwatchedCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JJJJLjava/lang/String;IZZZZ)Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "equals", "other", "hashCode", "toString", "Companion", "app_amazonDebug"})
public final class SgShow2 {
    @androidx.room.ColumnInfo(name = "_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_tmdb_id")
    private final java.lang.Integer tmdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_tvdb_id")
    private final java.lang.Integer tvdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_slug")
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_trakt_id")
    private final java.lang.Integer traktId = null;
    
    /**
     * Ensure this is NOT null (enforced through database constraint).
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "series_title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_title_noarticle")
    private final java.lang.String titleNoArticle = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_overview")
    private final java.lang.String overview = null;
    
    /**
     * Local release time. Encoded as integer (hhmm).
     *
     * <pre>
     * Example: 2035
     * Default: -1
     * </pre>
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_airstime")
    private final java.lang.Integer releaseTime = null;
    
    /**
     * Local release week day. Encoded as integer.
     * <pre>
     * Range:   1-7
     * Daily:   0
     * Default: -1
     * </pre>
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_airsdayofweek")
    private final java.lang.Integer releaseWeekDay = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_country")
    private final java.lang.String releaseCountry = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_timezone")
    private final java.lang.String releaseTimeZone = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_firstaired")
    private final java.lang.String firstRelease = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_genres")
    private final java.lang.String genres = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_network")
    private final java.lang.String network = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_imdbid")
    private final java.lang.String imdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_rating")
    private final java.lang.Double ratingGlobal = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_rating_votes")
    private final java.lang.Integer ratingVotes = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_rating_user")
    private final java.lang.Integer ratingUser = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_runtime")
    private final java.lang.Integer runtime = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_status")
    private final java.lang.Integer status = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_contentrating")
    private final java.lang.String contentRating = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_next")
    private final java.lang.String nextEpisode = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_poster")
    private final java.lang.String poster = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_poster_small")
    private final java.lang.String posterSmall = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_nextairdate")
    private final java.lang.Long nextAirdateMs = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_nexttext")
    private final java.lang.String nextText = null;
    @androidx.room.ColumnInfo(name = "series_lastupdate")
    private final long lastUpdatedMs = 0L;
    @androidx.room.ColumnInfo(name = "series_lastedit")
    private final long lastEditedSec = 0L;
    @androidx.room.ColumnInfo(name = "series_lastwatchedid")
    private final long lastWatchedEpisodeId = 0L;
    @androidx.room.ColumnInfo(name = "series_lastwatched_ms")
    private final long lastWatchedMs = 0L;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "series_language")
    private final java.lang.String language = null;
    @androidx.room.ColumnInfo(name = "series_unwatched_count")
    private final int unwatchedCount = 0;
    @androidx.room.ColumnInfo(name = "series_favorite")
    private boolean favorite;
    @androidx.room.ColumnInfo(name = "series_hidden")
    private boolean hidden;
    @androidx.room.ColumnInfo(name = "series_notify")
    private boolean notify;
    @androidx.room.ColumnInfo(name = "series_syncenabled")
    private final boolean hexagonMergeComplete = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.database.SgShow2.Companion Companion = null;
    
    /**
     * Used if the number of remaining episodes to watch for a show is not (yet) known.
     *
     * @see Shows.UNWATCHED_COUNT
     */
    public static final int UNKNOWN_UNWATCHED_COUNT = -1;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.database.SgShow2 copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.Integer traktId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleNoArticle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseTime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseWeekDay, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseCountry, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String firstRelease, @org.jetbrains.annotations.Nullable()
    java.lang.String genres, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingGlobal, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVotes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingUser, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String contentRating, @org.jetbrains.annotations.Nullable()
    java.lang.String nextEpisode, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.Nullable()
    java.lang.String posterSmall, @org.jetbrains.annotations.Nullable()
    java.lang.Long nextAirdateMs, @org.jetbrains.annotations.Nullable()
    java.lang.String nextText, long lastUpdatedMs, long lastEditedSec, long lastWatchedEpisodeId, long lastWatchedMs, @org.jetbrains.annotations.Nullable()
    java.lang.String language, int unwatchedCount, boolean favorite, boolean hidden, boolean notify, boolean hexagonMergeComplete) {
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
    
    public SgShow2(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tvdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.Integer traktId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String titleNoArticle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseTime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer releaseWeekDay, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseCountry, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String firstRelease, @org.jetbrains.annotations.Nullable()
    java.lang.String genres, @org.jetbrains.annotations.Nullable()
    java.lang.String network, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingGlobal, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVotes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingUser, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String contentRating, @org.jetbrains.annotations.Nullable()
    java.lang.String nextEpisode, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.Nullable()
    java.lang.String posterSmall, @org.jetbrains.annotations.Nullable()
    java.lang.Long nextAirdateMs, @org.jetbrains.annotations.Nullable()
    java.lang.String nextText, long lastUpdatedMs, long lastEditedSec, long lastWatchedEpisodeId, long lastWatchedMs, @org.jetbrains.annotations.Nullable()
    java.lang.String language, int unwatchedCount, boolean favorite, boolean hidden, boolean notify, boolean hexagonMergeComplete) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTmdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTvdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTraktId() {
        return null;
    }
    
    /**
     * Ensure this is NOT null (enforced through database constraint).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Ensure this is NOT null (enforced through database constraint).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleNoArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    /**
     * Local release time. Encoded as integer (hhmm).
     *
     * <pre>
     * Example: 2035
     * Default: -1
     * </pre>
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    /**
     * Local release time. Encoded as integer (hhmm).
     *
     * <pre>
     * Example: 2035
     * Default: -1
     * </pre>
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReleaseTime() {
        return null;
    }
    
    /**
     * Local release week day. Encoded as integer.
     * <pre>
     * Range:   1-7
     * Daily:   0
     * Default: -1
     * </pre>
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    /**
     * Local release week day. Encoded as integer.
     * <pre>
     * Range:   1-7
     * Daily:   0
     * Default: -1
     * </pre>
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReleaseWeekDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseTimeZone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstRelease() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRatingGlobal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingVotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContentRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNextEpisode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterSmall() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getNextAirdateMs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNextText() {
        return null;
    }
    
    public final long component28() {
        return 0L;
    }
    
    public final long getLastUpdatedMs() {
        return 0L;
    }
    
    public final long component29() {
        return 0L;
    }
    
    public final long getLastEditedSec() {
        return 0L;
    }
    
    public final long component30() {
        return 0L;
    }
    
    public final long getLastWatchedEpisodeId() {
        return 0L;
    }
    
    public final long component31() {
        return 0L;
    }
    
    public final long getLastWatchedMs() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final int component33() {
        return 0;
    }
    
    public final int getUnwatchedCount() {
        return 0;
    }
    
    public final boolean component34() {
        return false;
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    public final boolean component35() {
        return false;
    }
    
    public final boolean getHidden() {
        return false;
    }
    
    public final void setHidden(boolean p0) {
    }
    
    public final boolean component36() {
        return false;
    }
    
    public final boolean getNotify() {
        return false;
    }
    
    public final void setNotify(boolean p0) {
    }
    
    public final boolean component37() {
        return false;
    }
    
    public final boolean getHexagonMergeComplete() {
        return false;
    }
    
    public final int getReleaseTimeOrDefault() {
        return 0;
    }
    
    public final int getReleaseWeekDayOrDefault() {
        return 0;
    }
    
    public final int getStatusOrUnknown() {
        return 0;
    }
    
    public final double getRatingGlobalOrZero() {
        return 0.0;
    }
    
    public final int getRatingVotesOrZero() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/battlelancer/seriesguide/shows/database/SgShow2$Companion;", "", "()V", "UNKNOWN_UNWATCHED_COUNT", "", "app_amazonDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}