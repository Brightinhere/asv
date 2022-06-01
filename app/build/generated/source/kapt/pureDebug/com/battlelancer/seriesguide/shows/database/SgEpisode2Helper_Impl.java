package com.battlelancer.seriesguide.shows.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SgEpisode2Helper_Impl implements SgEpisode2Helper {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SgEpisode2> __insertionAdapterOfSgEpisode2;

  private final EntityDeletionOrUpdateAdapter<SgEpisode2Update> __updateAdapterOfSgEpisode2UpdateAsSgEpisode2;

  private final EntityDeletionOrUpdateAdapter<SgEpisode2TmdbIdUpdate> __updateAdapterOfSgEpisode2TmdbIdUpdateAsSgEpisode2;

  private final EntityDeletionOrUpdateAdapter<SgEpisode2WatchedUpdate> __updateAdapterOfSgEpisode2WatchedUpdateAsSgEpisode2;

  private final EntityDeletionOrUpdateAdapter<SgEpisode2CollectedUpdate> __updateAdapterOfSgEpisode2CollectedUpdateAsSgEpisode2;

  private final SharedSQLiteStatement __preparedStmtOfUpdateRating;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUserRating;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUserRatingByTmdbId;

  private final SharedSQLiteStatement __preparedStmtOfUpdateImdbId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllEpisodes;

  private final SharedSQLiteStatement __preparedStmtOfDeleteEpisode;

  private final SharedSQLiteStatement __preparedStmtOfDeleteEpisodesWithoutTmdbId;

  private final SharedSQLiteStatement __preparedStmtOfSetNotWatchedAndRemovePlays;

  private final SharedSQLiteStatement __preparedStmtOfSetWatchedAndAddPlay;

  private final SharedSQLiteStatement __preparedStmtOfSetSkipped;

  private final SharedSQLiteStatement __preparedStmtOfSetWatchedUpToAndAddPlay;

  private final SharedSQLiteStatement __preparedStmtOfSetSeasonNotWatchedAndRemovePlays;

  private final SharedSQLiteStatement __preparedStmtOfSetSeasonNotWatchedExcludeSkipped;

  private final SharedSQLiteStatement __preparedStmtOfSetShowNotWatchedExcludeSkipped;

  private final SharedSQLiteStatement __preparedStmtOfSetSeasonWatched;

  private final SharedSQLiteStatement __preparedStmtOfSetSeasonWatchedAndAddPlay;

  private final SharedSQLiteStatement __preparedStmtOfSetSeasonSkipped;

  private final SharedSQLiteStatement __preparedStmtOfSetShowNotWatchedAndRemovePlays;

  private final SharedSQLiteStatement __preparedStmtOfSetShowWatchedAndAddPlay;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCollected;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCollectedOfSeason;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCollectedOfShow;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCollectedOfShowExcludeSpecials;

  private final SharedSQLiteStatement __preparedStmtOfUpdateWatchedByNumber;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCollectedByNumber;

  private final SharedSQLiteStatement __preparedStmtOfResetLastUpdatedForAll;

  private final SharedSQLiteStatement __preparedStmtOfResetLastUpdatedForShow;

  private final SharedSQLiteStatement __preparedStmtOfDeleteEpisodesOfSeason;

  private final SharedSQLiteStatement __preparedStmtOfDeleteEpisodesOfShow;

  public SgEpisode2Helper_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSgEpisode2 = new EntityInsertionAdapter<SgEpisode2>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `sg_episode` (`_id`,`season_id`,`series_id`,`episode_tmdb_id`,`episode_tvdb_id`,`episode_title`,`episode_description`,`episode_number`,`episode_absolute_number`,`episode_season_number`,`episode_order`,`episode_dvd_number`,`episode_watched`,`episode_plays`,`episode_collected`,`episode_directors`,`episode_gueststars`,`episode_writers`,`episode_image`,`episode_firstairedms`,`episode_rating`,`episode_rating_votes`,`episode_rating_user`,`episode_imdbid`,`episode_lastedit`,`episode_lastupdate`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgEpisode2 value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getSeasonId());
        stmt.bindLong(3, value.getShowId());
        if (value.getTmdbId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTmdbId());
        }
        if (value.getTvdbId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getTvdbId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOverview());
        }
        stmt.bindLong(8, value.getNumber());
        if (value.getAbsoluteNumber() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getAbsoluteNumber());
        }
        stmt.bindLong(10, value.getSeason());
        stmt.bindLong(11, value.getOrder());
        if (value.getDvdNumber() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindDouble(12, value.getDvdNumber());
        }
        stmt.bindLong(13, value.getWatched());
        if (value.getPlays() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getPlays());
        }
        final int _tmp = value.getCollected() ? 1 : 0;
        stmt.bindLong(15, _tmp);
        if (value.getDirectors() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getDirectors());
        }
        if (value.getGuestStars() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getGuestStars());
        }
        if (value.getWriters() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getWriters());
        }
        if (value.getImage() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getImage());
        }
        stmt.bindLong(20, value.getFirstReleasedMs());
        if (value.getRatingGlobal() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindDouble(21, value.getRatingGlobal());
        }
        if (value.getRatingVotes() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindLong(22, value.getRatingVotes());
        }
        if (value.getRatingUser() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindLong(23, value.getRatingUser());
        }
        if (value.getImdbId() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getImdbId());
        }
        stmt.bindLong(25, value.getLastEditedSec());
        stmt.bindLong(26, value.getLastUpdatedSec());
      }
    };
    this.__updateAdapterOfSgEpisode2UpdateAsSgEpisode2 = new EntityDeletionOrUpdateAdapter<SgEpisode2Update>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_episode` SET `_id` = ?,`episode_tmdb_id` = ?,`episode_title` = ?,`episode_description` = ?,`episode_number` = ?,`episode_order` = ?,`episode_directors` = ?,`episode_gueststars` = ?,`episode_writers` = ?,`episode_image` = ?,`episode_firstairedms` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgEpisode2Update value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getTmdbId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOverview());
        }
        stmt.bindLong(5, value.getNumber());
        stmt.bindLong(6, value.getOrder());
        if (value.getDirectors() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDirectors());
        }
        if (value.getGuestStars() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getGuestStars());
        }
        if (value.getWriters() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getWriters());
        }
        if (value.getImage() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getImage());
        }
        stmt.bindLong(11, value.getFirstReleasedMs());
        stmt.bindLong(12, value.getId());
      }
    };
    this.__updateAdapterOfSgEpisode2TmdbIdUpdateAsSgEpisode2 = new EntityDeletionOrUpdateAdapter<SgEpisode2TmdbIdUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_episode` SET `_id` = ?,`episode_tmdb_id` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgEpisode2TmdbIdUpdate value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getTmdbId());
        stmt.bindLong(3, value.getId());
      }
    };
    this.__updateAdapterOfSgEpisode2WatchedUpdateAsSgEpisode2 = new EntityDeletionOrUpdateAdapter<SgEpisode2WatchedUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_episode` SET `_id` = ?,`episode_watched` = ?,`episode_plays` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgEpisode2WatchedUpdate value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getWatched());
        stmt.bindLong(3, value.getPlays());
        stmt.bindLong(4, value.getId());
      }
    };
    this.__updateAdapterOfSgEpisode2CollectedUpdateAsSgEpisode2 = new EntityDeletionOrUpdateAdapter<SgEpisode2CollectedUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_episode` SET `_id` = ?,`episode_collected` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgEpisode2CollectedUpdate value) {
        stmt.bindLong(1, value.getId());
        final int _tmp = value.getCollected() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        stmt.bindLong(3, value.getId());
      }
    };
    this.__preparedStmtOfUpdateRating = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_rating = ?, episode_rating_votes = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUserRating = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_rating_user = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUserRatingByTmdbId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_rating_user = ? WHERE episode_tmdb_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateImdbId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_imdbid = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllEpisodes = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_episode";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteEpisode = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_episode WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteEpisodesWithoutTmdbId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_episode WHERE series_id = ? AND episode_tmdb_id IS NULL";
        return _query;
      }
    };
    this.__preparedStmtOfSetNotWatchedAndRemovePlays = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0 WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetWatchedAndAddPlay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1 WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetSkipped = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 2 WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetWatchedUpToAndAddPlay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1 WHERE series_id = ?\n"
                + "            AND (\n"
                + "            episode_firstairedms < ?\n"
                + "            OR (episode_firstairedms = ? AND episode_number <= ?)\n"
                + "            )\n"
                + "            AND episode_firstairedms != -1\n"
                + "            AND episode_watched != 1";
        return _query;
      }
    };
    this.__preparedStmtOfSetSeasonNotWatchedAndRemovePlays = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n"
                + "        WHERE season_id = ? AND episode_watched != 0";
        return _query;
      }
    };
    this.__preparedStmtOfSetSeasonNotWatchedExcludeSkipped = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n"
                + "        WHERE season_id = ? AND episode_watched == 1";
        return _query;
      }
    };
    this.__preparedStmtOfSetShowNotWatchedExcludeSkipped = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n"
                + "        WHERE series_id = ? AND episode_watched == 1";
        return _query;
      }
    };
    this.__preparedStmtOfSetSeasonWatched = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 1, episode_plays = 1 WHERE season_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetSeasonWatchedAndAddPlay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1 \n"
                + "            WHERE season_id = ? AND episode_watched != 1\n"
                + "            AND episode_firstairedms <= ? AND episode_firstairedms != -1";
        return _query;
      }
    };
    this.__preparedStmtOfSetSeasonSkipped = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 2 \n"
                + "            WHERE season_id = ? AND episode_watched = 0\n"
                + "            AND episode_firstairedms <= ? AND episode_firstairedms != -1";
        return _query;
      }
    };
    this.__preparedStmtOfSetShowNotWatchedAndRemovePlays = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 0, episode_plays = 0\n"
                + "            WHERE series_id = ? AND episode_watched != 0\n"
                + "            AND episode_season_number != 0";
        return _query;
      }
    };
    this.__preparedStmtOfSetShowWatchedAndAddPlay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = 1, episode_plays = episode_plays + 1\n"
                + "            WHERE series_id = ? AND episode_watched != 1\n"
                + "            AND episode_firstairedms <= ? AND episode_firstairedms != -1\n"
                + "            AND episode_season_number != 0";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCollected = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_collected = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCollectedOfSeason = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_collected = ? WHERE season_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCollectedOfShow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_collected = ? WHERE series_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCollectedOfShowExcludeSpecials = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_collected = ? WHERE series_id = ? AND episode_season_number != 0";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateWatchedByNumber = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_watched = ?, episode_plays = ? WHERE series_id = ? AND episode_season_number = ? AND episode_number = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCollectedByNumber = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_collected = ? WHERE series_id = ? AND episode_season_number = ? AND episode_number = ?";
        return _query;
      }
    };
    this.__preparedStmtOfResetLastUpdatedForAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_lastupdate = 0";
        return _query;
      }
    };
    this.__preparedStmtOfResetLastUpdatedForShow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_episode SET episode_lastupdate = 0 WHERE series_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteEpisodesOfSeason = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_episode WHERE season_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteEpisodesOfShow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_episode WHERE series_id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insertEpisode(final SgEpisode2 episode) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSgEpisode2.insertAndReturnId(episode);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long[] insertEpisodes(final List<SgEpisode2> episodes) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long[] _result = __insertionAdapterOfSgEpisode2.insertAndReturnIdsArray(episodes);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateEpisodes(final List<SgEpisode2Update> episodes) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgEpisode2UpdateAsSgEpisode2.handleMultiple(episodes);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateTmdbIds(final List<SgEpisode2TmdbIdUpdate> episodes) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgEpisode2TmdbIdUpdateAsSgEpisode2.handleMultiple(episodes);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateEpisodesWatched(final List<SgEpisode2WatchedUpdate> episodes) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgEpisode2WatchedUpdateAsSgEpisode2.handleMultiple(episodes);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateEpisodesCollected(final List<SgEpisode2CollectedUpdate> episodes) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgEpisode2CollectedUpdateAsSgEpisode2.handleMultiple(episodes);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUserRatings(final Map<Integer, Integer> tmdbIdsToRating) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.updateUserRatings(SgEpisode2Helper_Impl.this, tmdbIdsToRating);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteEpisodes(final List<Long> episodeIds) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.deleteEpisodes(SgEpisode2Helper_Impl.this, episodeIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setSeasonsNotWatchedExcludeSkipped(final List<Long> seasonIds) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.setSeasonsNotWatchedExcludeSkipped(SgEpisode2Helper_Impl.this, seasonIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setShowsNotWatchedExcludeSkipped(final List<Long> showIds) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.setShowsNotWatchedExcludeSkipped(SgEpisode2Helper_Impl.this, showIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCollectedOfSeasons(final List<Long> seasonIds, final boolean isCollected) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.updateCollectedOfSeasons(SgEpisode2Helper_Impl.this, seasonIds, isCollected);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCollectedOfShows(final List<Long> showIds, final boolean isCollected) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.updateCollectedOfShows(SgEpisode2Helper_Impl.this, showIds, isCollected);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateWatchedAndCollectedByNumber(final List<SgEpisode2UpdateByNumber> episodes) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.updateWatchedAndCollectedByNumber(SgEpisode2Helper_Impl.this, episodes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteEpisodesOfSeasons(final List<Long> seasonIds) {
    __db.beginTransaction();
    try {
      SgEpisode2Helper.DefaultImpls.deleteEpisodesOfSeasons(SgEpisode2Helper_Impl.this, seasonIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateRating(final long episodeId, final double rating, final int votes) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateRating.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, rating);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, votes);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateRating.release(_stmt);
    }
  }

  @Override
  public int updateUserRating(final long episodeId, final int userRating) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUserRating.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, userRating);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateUserRating.release(_stmt);
    }
  }

  @Override
  public void updateUserRatingByTmdbId(final int tmdbId, final int userRating) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUserRatingByTmdbId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, userRating);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, tmdbId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateUserRatingByTmdbId.release(_stmt);
    }
  }

  @Override
  public void updateImdbId(final long episodeId, final String imdbId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateImdbId.acquire();
    int _argIndex = 1;
    if (imdbId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, imdbId);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateImdbId.release(_stmt);
    }
  }

  @Override
  public void deleteAllEpisodes() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllEpisodes.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllEpisodes.release(_stmt);
    }
  }

  @Override
  public void deleteEpisode(final long episodeId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteEpisode.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteEpisode.release(_stmt);
    }
  }

  @Override
  public void deleteEpisodesWithoutTmdbId(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteEpisodesWithoutTmdbId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteEpisodesWithoutTmdbId.release(_stmt);
    }
  }

  @Override
  public int setNotWatchedAndRemovePlays(final long episodeId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetNotWatchedAndRemovePlays.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetNotWatchedAndRemovePlays.release(_stmt);
    }
  }

  @Override
  public int setWatchedAndAddPlay(final long episodeId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetWatchedAndAddPlay.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetWatchedAndAddPlay.release(_stmt);
    }
  }

  @Override
  public int setSkipped(final long episodeId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetSkipped.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetSkipped.release(_stmt);
    }
  }

  @Override
  public int setWatchedUpToAndAddPlay(final long showId, final long episodeFirstAired,
      final int episodeNumber) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetWatchedUpToAndAddPlay.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, episodeFirstAired);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, episodeFirstAired);
    _argIndex = 4;
    _stmt.bindLong(_argIndex, episodeNumber);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetWatchedUpToAndAddPlay.release(_stmt);
    }
  }

  @Override
  public int setSeasonNotWatchedAndRemovePlays(final long seasonId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetSeasonNotWatchedAndRemovePlays.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, seasonId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetSeasonNotWatchedAndRemovePlays.release(_stmt);
    }
  }

  @Override
  public int setSeasonNotWatchedExcludeSkipped(final long seasonId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetSeasonNotWatchedExcludeSkipped.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, seasonId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetSeasonNotWatchedExcludeSkipped.release(_stmt);
    }
  }

  @Override
  public int setShowNotWatchedExcludeSkipped(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetShowNotWatchedExcludeSkipped.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetShowNotWatchedExcludeSkipped.release(_stmt);
    }
  }

  @Override
  public int setSeasonWatched(final long seasonId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetSeasonWatched.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, seasonId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetSeasonWatched.release(_stmt);
    }
  }

  @Override
  public int setSeasonWatchedAndAddPlay(final long seasonId, final long currentTimePlusOneHour) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetSeasonWatchedAndAddPlay.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, seasonId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, currentTimePlusOneHour);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetSeasonWatchedAndAddPlay.release(_stmt);
    }
  }

  @Override
  public int setSeasonSkipped(final long seasonId, final long currentTimePlusOneHour) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetSeasonSkipped.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, seasonId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, currentTimePlusOneHour);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetSeasonSkipped.release(_stmt);
    }
  }

  @Override
  public int setShowNotWatchedAndRemovePlays(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetShowNotWatchedAndRemovePlays.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetShowNotWatchedAndRemovePlays.release(_stmt);
    }
  }

  @Override
  public int setShowWatchedAndAddPlay(final long showId, final long currentTimePlusOneHour) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetShowWatchedAndAddPlay.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, currentTimePlusOneHour);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetShowWatchedAndAddPlay.release(_stmt);
    }
  }

  @Override
  public int updateCollected(final long episodeId, final boolean isCollected) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCollected.acquire();
    int _argIndex = 1;
    final int _tmp = isCollected ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, episodeId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCollected.release(_stmt);
    }
  }

  @Override
  public int updateCollectedOfSeason(final long seasonId, final boolean isCollected) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCollectedOfSeason.acquire();
    int _argIndex = 1;
    final int _tmp = isCollected ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, seasonId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCollectedOfSeason.release(_stmt);
    }
  }

  @Override
  public int updateCollectedOfShow(final long showId, final boolean isCollected) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCollectedOfShow.acquire();
    int _argIndex = 1;
    final int _tmp = isCollected ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCollectedOfShow.release(_stmt);
    }
  }

  @Override
  public int updateCollectedOfShowExcludeSpecials(final long showId, final boolean isCollected) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCollectedOfShowExcludeSpecials.acquire();
    int _argIndex = 1;
    final int _tmp = isCollected ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCollectedOfShowExcludeSpecials.release(_stmt);
    }
  }

  @Override
  public void updateWatchedByNumber(final long showId, final int seasonNumber,
      final int episodeNumber, final int watched, final int plays) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateWatchedByNumber.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, watched);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, plays);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, showId);
    _argIndex = 4;
    _stmt.bindLong(_argIndex, seasonNumber);
    _argIndex = 5;
    _stmt.bindLong(_argIndex, episodeNumber);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateWatchedByNumber.release(_stmt);
    }
  }

  @Override
  public void updateCollectedByNumber(final long showId, final int seasonNumber,
      final int episodeNumber, final boolean isCollected) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCollectedByNumber.acquire();
    int _argIndex = 1;
    final int _tmp = isCollected ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, showId);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, seasonNumber);
    _argIndex = 4;
    _stmt.bindLong(_argIndex, episodeNumber);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCollectedByNumber.release(_stmt);
    }
  }

  @Override
  public void resetLastUpdatedForAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfResetLastUpdatedForAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfResetLastUpdatedForAll.release(_stmt);
    }
  }

  @Override
  public void resetLastUpdatedForShow(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfResetLastUpdatedForShow.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfResetLastUpdatedForShow.release(_stmt);
    }
  }

  @Override
  public int deleteEpisodesOfSeason(final long seasonId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteEpisodesOfSeason.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, seasonId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteEpisodesOfSeason.release(_stmt);
    }
  }

  @Override
  public int deleteEpisodesOfShow(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteEpisodesOfShow.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteEpisodesOfShow.release(_stmt);
    }
  }

  @Override
  public long getEpisodeIdByTmdbId(final int tmdbId) {
    final String _sql = "SELECT _id FROM sg_episode WHERE episode_tmdb_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getEpisodeIdByTvdbId(final int tvdbId) {
    final String _sql = "SELECT _id FROM sg_episode WHERE episode_tvdb_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tvdbId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getEpisodeIdByNumber(final long showId, final int season, final int number) {
    final String _sql = "SELECT _id FROM sg_episode WHERE series_id = ? AND episode_season_number = ? AND episode_number = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, season);
    _argIndex = 3;
    _statement.bindLong(_argIndex, number);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getEpisodeTvdbId(final long episodeId) {
    final String _sql = "SELECT episode_tvdb_id FROM sg_episode WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, episodeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getEpisodeTmdbId(final long episodeId) {
    final String _sql = "SELECT episode_tmdb_id FROM sg_episode WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, episodeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgEpisode2Numbers getEpisodeNumbers(final long episodeId) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, episodeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final SgEpisode2Numbers _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _result = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgEpisode2Info getEpisodeInfo(final long episodeId) {
    final String _sql = "SELECT _id, season_id, series_id, episode_tvdb_id, episode_title, episode_number, episode_absolute_number, episode_season_number, episode_dvd_number, episode_firstairedms, episode_watched, episode_collected FROM sg_episode WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, episodeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodeTvdbId = 3;
      final int _cursorIndexOfTitle = 4;
      final int _cursorIndexOfEpisodenumber = 5;
      final int _cursorIndexOfAbsoluteNumber = 6;
      final int _cursorIndexOfSeason = 7;
      final int _cursorIndexOfDvdNumber = 8;
      final int _cursorIndexOfFirstReleasedMs = 9;
      final int _cursorIndexOfWatched = 10;
      final int _cursorIndexOfCollected = 11;
      final SgEpisode2Info _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodeTvdbId;
        _tmpEpisodeTvdbId = _cursor.getInt(_cursorIndexOfEpisodeTvdbId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpAbsoluteNumber;
        _tmpAbsoluteNumber = _cursor.getInt(_cursorIndexOfAbsoluteNumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final double _tmpDvdNumber;
        _tmpDvdNumber = _cursor.getDouble(_cursorIndexOfDvdNumber);
        final long _tmpFirstReleasedMs;
        _tmpFirstReleasedMs = _cursor.getLong(_cursorIndexOfFirstReleasedMs);
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        _result = new SgEpisode2Info(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodeTvdbId,_tmpTitle,_tmpEpisodenumber,_tmpAbsoluteNumber,_tmpSeason,_tmpDvdNumber,_tmpWatched,_tmpCollected,_tmpFirstReleasedMs);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgEpisode2 getEpisode(final long episodeId) {
    final String _sql = "SELECT * FROM sg_episode WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, episodeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfSeasonId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_id");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_tmdb_id");
      final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_tvdb_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_title");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_description");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_number");
      final int _cursorIndexOfAbsoluteNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_absolute_number");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_season_number");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_order");
      final int _cursorIndexOfDvdNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_dvd_number");
      final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_watched");
      final int _cursorIndexOfPlays = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_plays");
      final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_collected");
      final int _cursorIndexOfDirectors = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_directors");
      final int _cursorIndexOfGuestStars = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_gueststars");
      final int _cursorIndexOfWriters = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_writers");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_image");
      final int _cursorIndexOfFirstReleasedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_firstairedms");
      final int _cursorIndexOfRatingGlobal = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating");
      final int _cursorIndexOfRatingVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating_votes");
      final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating_user");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_imdbid");
      final int _cursorIndexOfLastEditedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_lastedit");
      final int _cursorIndexOfLastUpdatedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_lastupdate");
      final SgEpisode2 _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final Integer _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        }
        final Integer _tmpTvdbId;
        if (_cursor.isNull(_cursorIndexOfTvdbId)) {
          _tmpTvdbId = null;
        } else {
          _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final int _tmpNumber;
        _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
        final Integer _tmpAbsoluteNumber;
        if (_cursor.isNull(_cursorIndexOfAbsoluteNumber)) {
          _tmpAbsoluteNumber = null;
        } else {
          _tmpAbsoluteNumber = _cursor.getInt(_cursorIndexOfAbsoluteNumber);
        }
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpOrder;
        _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
        final Double _tmpDvdNumber;
        if (_cursor.isNull(_cursorIndexOfDvdNumber)) {
          _tmpDvdNumber = null;
        } else {
          _tmpDvdNumber = _cursor.getDouble(_cursorIndexOfDvdNumber);
        }
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final Integer _tmpPlays;
        if (_cursor.isNull(_cursorIndexOfPlays)) {
          _tmpPlays = null;
        } else {
          _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        }
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        final String _tmpDirectors;
        if (_cursor.isNull(_cursorIndexOfDirectors)) {
          _tmpDirectors = null;
        } else {
          _tmpDirectors = _cursor.getString(_cursorIndexOfDirectors);
        }
        final String _tmpGuestStars;
        if (_cursor.isNull(_cursorIndexOfGuestStars)) {
          _tmpGuestStars = null;
        } else {
          _tmpGuestStars = _cursor.getString(_cursorIndexOfGuestStars);
        }
        final String _tmpWriters;
        if (_cursor.isNull(_cursorIndexOfWriters)) {
          _tmpWriters = null;
        } else {
          _tmpWriters = _cursor.getString(_cursorIndexOfWriters);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final long _tmpFirstReleasedMs;
        _tmpFirstReleasedMs = _cursor.getLong(_cursorIndexOfFirstReleasedMs);
        final Double _tmpRatingGlobal;
        if (_cursor.isNull(_cursorIndexOfRatingGlobal)) {
          _tmpRatingGlobal = null;
        } else {
          _tmpRatingGlobal = _cursor.getDouble(_cursorIndexOfRatingGlobal);
        }
        final Integer _tmpRatingVotes;
        if (_cursor.isNull(_cursorIndexOfRatingVotes)) {
          _tmpRatingVotes = null;
        } else {
          _tmpRatingVotes = _cursor.getInt(_cursorIndexOfRatingVotes);
        }
        final Integer _tmpRatingUser;
        if (_cursor.isNull(_cursorIndexOfRatingUser)) {
          _tmpRatingUser = null;
        } else {
          _tmpRatingUser = _cursor.getInt(_cursorIndexOfRatingUser);
        }
        final String _tmpImdbId;
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _tmpImdbId = null;
        } else {
          _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
        final long _tmpLastEditedSec;
        _tmpLastEditedSec = _cursor.getLong(_cursorIndexOfLastEditedSec);
        final long _tmpLastUpdatedSec;
        _tmpLastUpdatedSec = _cursor.getLong(_cursorIndexOfLastUpdatedSec);
        _result = new SgEpisode2(_tmpId,_tmpSeasonId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpTitle,_tmpOverview,_tmpNumber,_tmpAbsoluteNumber,_tmpSeason,_tmpOrder,_tmpDvdNumber,_tmpWatched,_tmpPlays,_tmpCollected,_tmpDirectors,_tmpGuestStars,_tmpWriters,_tmpImage,_tmpFirstReleasedMs,_tmpRatingGlobal,_tmpRatingVotes,_tmpRatingUser,_tmpImdbId,_tmpLastEditedSec,_tmpLastUpdatedSec);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<SgEpisode2> getEpisodeLiveData(final long id) {
    final String _sql = "SELECT * FROM sg_episode WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_episode"}, false, new Callable<SgEpisode2>() {
      @Override
      public SgEpisode2 call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfSeasonId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_id");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_tmdb_id");
          final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_tvdb_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_description");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_number");
          final int _cursorIndexOfAbsoluteNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_absolute_number");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_season_number");
          final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_order");
          final int _cursorIndexOfDvdNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_dvd_number");
          final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_watched");
          final int _cursorIndexOfPlays = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_plays");
          final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_collected");
          final int _cursorIndexOfDirectors = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_directors");
          final int _cursorIndexOfGuestStars = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_gueststars");
          final int _cursorIndexOfWriters = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_writers");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_image");
          final int _cursorIndexOfFirstReleasedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_firstairedms");
          final int _cursorIndexOfRatingGlobal = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating");
          final int _cursorIndexOfRatingVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating_votes");
          final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating_user");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_imdbid");
          final int _cursorIndexOfLastEditedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_lastedit");
          final int _cursorIndexOfLastUpdatedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_lastupdate");
          final SgEpisode2 _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpSeasonId;
            _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
            final long _tmpShowId;
            _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
            final Integer _tmpTmdbId;
            if (_cursor.isNull(_cursorIndexOfTmdbId)) {
              _tmpTmdbId = null;
            } else {
              _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
            }
            final Integer _tmpTvdbId;
            if (_cursor.isNull(_cursorIndexOfTvdbId)) {
              _tmpTvdbId = null;
            } else {
              _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final Integer _tmpAbsoluteNumber;
            if (_cursor.isNull(_cursorIndexOfAbsoluteNumber)) {
              _tmpAbsoluteNumber = null;
            } else {
              _tmpAbsoluteNumber = _cursor.getInt(_cursorIndexOfAbsoluteNumber);
            }
            final int _tmpSeason;
            _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
            final int _tmpOrder;
            _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
            final Double _tmpDvdNumber;
            if (_cursor.isNull(_cursorIndexOfDvdNumber)) {
              _tmpDvdNumber = null;
            } else {
              _tmpDvdNumber = _cursor.getDouble(_cursorIndexOfDvdNumber);
            }
            final int _tmpWatched;
            _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
            final Integer _tmpPlays;
            if (_cursor.isNull(_cursorIndexOfPlays)) {
              _tmpPlays = null;
            } else {
              _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
            }
            final boolean _tmpCollected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCollected);
            _tmpCollected = _tmp != 0;
            final String _tmpDirectors;
            if (_cursor.isNull(_cursorIndexOfDirectors)) {
              _tmpDirectors = null;
            } else {
              _tmpDirectors = _cursor.getString(_cursorIndexOfDirectors);
            }
            final String _tmpGuestStars;
            if (_cursor.isNull(_cursorIndexOfGuestStars)) {
              _tmpGuestStars = null;
            } else {
              _tmpGuestStars = _cursor.getString(_cursorIndexOfGuestStars);
            }
            final String _tmpWriters;
            if (_cursor.isNull(_cursorIndexOfWriters)) {
              _tmpWriters = null;
            } else {
              _tmpWriters = _cursor.getString(_cursorIndexOfWriters);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final long _tmpFirstReleasedMs;
            _tmpFirstReleasedMs = _cursor.getLong(_cursorIndexOfFirstReleasedMs);
            final Double _tmpRatingGlobal;
            if (_cursor.isNull(_cursorIndexOfRatingGlobal)) {
              _tmpRatingGlobal = null;
            } else {
              _tmpRatingGlobal = _cursor.getDouble(_cursorIndexOfRatingGlobal);
            }
            final Integer _tmpRatingVotes;
            if (_cursor.isNull(_cursorIndexOfRatingVotes)) {
              _tmpRatingVotes = null;
            } else {
              _tmpRatingVotes = _cursor.getInt(_cursorIndexOfRatingVotes);
            }
            final Integer _tmpRatingUser;
            if (_cursor.isNull(_cursorIndexOfRatingUser)) {
              _tmpRatingUser = null;
            } else {
              _tmpRatingUser = _cursor.getInt(_cursorIndexOfRatingUser);
            }
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
            final long _tmpLastEditedSec;
            _tmpLastEditedSec = _cursor.getLong(_cursorIndexOfLastEditedSec);
            final long _tmpLastUpdatedSec;
            _tmpLastUpdatedSec = _cursor.getLong(_cursorIndexOfLastUpdatedSec);
            _result = new SgEpisode2(_tmpId,_tmpSeasonId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpTitle,_tmpOverview,_tmpNumber,_tmpAbsoluteNumber,_tmpSeason,_tmpOrder,_tmpDvdNumber,_tmpWatched,_tmpPlays,_tmpCollected,_tmpDirectors,_tmpGuestStars,_tmpWriters,_tmpImage,_tmpFirstReleasedMs,_tmpRatingGlobal,_tmpRatingVotes,_tmpRatingUser,_tmpImdbId,_tmpLastEditedSec,_tmpLastUpdatedSec);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public long getHighestWatchedEpisodeOfSeason(final long seasonId,
      final long currentTimePlusOneHour) {
    final String _sql = "SELECT _id FROM sg_episode WHERE season_id = ? \n"
            + "        AND episode_firstairedms <= ?\n"
            + "        ORDER BY episode_number DESC, episode_firstairedms DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, currentTimePlusOneHour);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getPreviousWatchedEpisodeOfShow(final long showId, final int seasonNumber,
      final int episodeNumber) {
    final String _sql = "SELECT _id FROM sg_episode WHERE series_id = ? \n"
            + "        AND episode_season_number > 0 AND episode_watched != 0 \n"
            + "        AND (episode_season_number < ? OR (episode_season_number = ? AND episode_number < ?))\n"
            + "        ORDER BY episode_season_number DESC, episode_number DESC, episode_firstairedms DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, seasonNumber);
    _argIndex = 3;
    _statement.bindLong(_argIndex, seasonNumber);
    _argIndex = 4;
    _statement.bindLong(_argIndex, episodeNumber);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgEpisode2WithShow getEpisodeWithShow(final long episodeId) {
    final String _sql = "SELECT sg_episode._id, episode_title, episode_number, episode_season_number, episode_firstairedms, episode_watched, episode_collected, episode_description, series_title, series_network, series_poster_small FROM sg_episode LEFT OUTER JOIN sg_show ON sg_episode.series_id=sg_show._id WHERE sg_episode._id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, episodeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfEpisodetitle = 1;
      final int _cursorIndexOfEpisodenumber = 2;
      final int _cursorIndexOfSeason = 3;
      final int _cursorIndexOfEpisodeFirstairedms = 4;
      final int _cursorIndexOfWatched = 5;
      final int _cursorIndexOfEpisodeCollected = 6;
      final int _cursorIndexOfOverview = 7;
      final int _cursorIndexOfSeriestitle = 8;
      final int _cursorIndexOfNetwork = 9;
      final int _cursorIndexOfSeriesPosterSmall = 10;
      final SgEpisode2WithShow _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpEpisodetitle;
        if (_cursor.isNull(_cursorIndexOfEpisodetitle)) {
          _tmpEpisodetitle = null;
        } else {
          _tmpEpisodetitle = _cursor.getString(_cursorIndexOfEpisodetitle);
        }
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final long _tmpEpisode_firstairedms;
        _tmpEpisode_firstairedms = _cursor.getLong(_cursorIndexOfEpisodeFirstairedms);
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final boolean _tmpEpisode_collected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfEpisodeCollected);
        _tmpEpisode_collected = _tmp != 0;
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final String _tmpSeriestitle;
        if (_cursor.isNull(_cursorIndexOfSeriestitle)) {
          _tmpSeriestitle = null;
        } else {
          _tmpSeriestitle = _cursor.getString(_cursorIndexOfSeriestitle);
        }
        final String _tmpNetwork;
        if (_cursor.isNull(_cursorIndexOfNetwork)) {
          _tmpNetwork = null;
        } else {
          _tmpNetwork = _cursor.getString(_cursorIndexOfNetwork);
        }
        final String _tmpSeries_poster_small;
        if (_cursor.isNull(_cursorIndexOfSeriesPosterSmall)) {
          _tmpSeries_poster_small = null;
        } else {
          _tmpSeries_poster_small = _cursor.getString(_cursorIndexOfSeriesPosterSmall);
        }
        _result = new SgEpisode2WithShow(_tmpId,_tmpEpisodetitle,_tmpEpisodenumber,_tmpSeason,_tmpEpisode_firstairedms,_tmpWatched,_tmpEpisode_collected,_tmpOverview,_tmpSeriestitle,_tmpNetwork,_tmpSeries_poster_small);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Ids> getEpisodeIdsOfSeason(final long seasonId) {
    final String _sql = "SELECT _id, episode_tmdb_id, episode_number FROM sg_episode WHERE season_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTmdbId = 1;
      final int _cursorIndexOfEpisodenumber = 2;
      final List<SgEpisode2Ids> _result = new ArrayList<SgEpisode2Ids>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Ids _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Integer _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        }
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        _item = new SgEpisode2Ids(_tmpId,_tmpTmdbId,_tmpEpisodenumber);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Numbers> getEpisodeNumbersOfSeason(final long seasonId) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE season_id = ? ORDER BY episode_season_number ASC, episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Numbers> getEpisodeNumbersOfShow(final long showId) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE series_id = ? AND episode_season_number != 0 ORDER BY episode_season_number ASC, episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2ForSync> getEpisodesForHexagonSync(final long showId) {
    final String _sql = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE series_id = ? AND episode_tmdb_id > 0 AND (episode_watched != 0 OR episode_collected = 1)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfNumber = 1;
      final int _cursorIndexOfSeason = 2;
      final int _cursorIndexOfWatched = 3;
      final int _cursorIndexOfPlays = 4;
      final int _cursorIndexOfCollected = 5;
      final List<SgEpisode2ForSync> _result = new ArrayList<SgEpisode2ForSync>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2ForSync _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final int _tmpNumber;
        _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        _item = new SgEpisode2ForSync(_tmpId,_tmpNumber,_tmpSeason,_tmpWatched,_tmpPlays,_tmpCollected);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2ForSync> getEpisodesForTraktSync(final long seasonId) {
    final String _sql = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE season_id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfNumber = 1;
      final int _cursorIndexOfSeason = 2;
      final int _cursorIndexOfWatched = 3;
      final int _cursorIndexOfPlays = 4;
      final int _cursorIndexOfCollected = 5;
      final List<SgEpisode2ForSync> _result = new ArrayList<SgEpisode2ForSync>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2ForSync _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final int _tmpNumber;
        _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        _item = new SgEpisode2ForSync(_tmpId,_tmpNumber,_tmpSeason,_tmpWatched,_tmpPlays,_tmpCollected);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2ForSync> getWatchedEpisodesForTraktSync(final long seasonId) {
    final String _sql = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE season_id=? AND episode_watched = 1 ORDER BY episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfNumber = 1;
      final int _cursorIndexOfSeason = 2;
      final int _cursorIndexOfWatched = 3;
      final int _cursorIndexOfPlays = 4;
      final int _cursorIndexOfCollected = 5;
      final List<SgEpisode2ForSync> _result = new ArrayList<SgEpisode2ForSync>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2ForSync _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final int _tmpNumber;
        _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        _item = new SgEpisode2ForSync(_tmpId,_tmpNumber,_tmpSeason,_tmpWatched,_tmpPlays,_tmpCollected);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2ForSync> getCollectedEpisodesForTraktSync(final long seasonId) {
    final String _sql = "SELECT _id, episode_number, episode_season_number, episode_watched, episode_plays, episode_collected FROM sg_episode WHERE season_id=? AND episode_collected = 1 ORDER BY episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfNumber = 1;
      final int _cursorIndexOfSeason = 2;
      final int _cursorIndexOfWatched = 3;
      final int _cursorIndexOfPlays = 4;
      final int _cursorIndexOfCollected = 5;
      final List<SgEpisode2ForSync> _result = new ArrayList<SgEpisode2ForSync>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2ForSync _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final int _tmpNumber;
        _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        _item = new SgEpisode2ForSync(_tmpId,_tmpNumber,_tmpSeason,_tmpWatched,_tmpPlays,_tmpCollected);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2> getEpisodesForExport(final long seasonId) {
    final String _sql = "SELECT * FROM sg_episode WHERE season_id = ? ORDER BY episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfSeasonId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_id");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_tmdb_id");
      final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_tvdb_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_title");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_description");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_number");
      final int _cursorIndexOfAbsoluteNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_absolute_number");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_season_number");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_order");
      final int _cursorIndexOfDvdNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_dvd_number");
      final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_watched");
      final int _cursorIndexOfPlays = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_plays");
      final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_collected");
      final int _cursorIndexOfDirectors = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_directors");
      final int _cursorIndexOfGuestStars = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_gueststars");
      final int _cursorIndexOfWriters = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_writers");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_image");
      final int _cursorIndexOfFirstReleasedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_firstairedms");
      final int _cursorIndexOfRatingGlobal = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating");
      final int _cursorIndexOfRatingVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating_votes");
      final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_rating_user");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_imdbid");
      final int _cursorIndexOfLastEditedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_lastedit");
      final int _cursorIndexOfLastUpdatedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "episode_lastupdate");
      final List<SgEpisode2> _result = new ArrayList<SgEpisode2>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2 _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final Integer _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        }
        final Integer _tmpTvdbId;
        if (_cursor.isNull(_cursorIndexOfTvdbId)) {
          _tmpTvdbId = null;
        } else {
          _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final int _tmpNumber;
        _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
        final Integer _tmpAbsoluteNumber;
        if (_cursor.isNull(_cursorIndexOfAbsoluteNumber)) {
          _tmpAbsoluteNumber = null;
        } else {
          _tmpAbsoluteNumber = _cursor.getInt(_cursorIndexOfAbsoluteNumber);
        }
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpOrder;
        _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
        final Double _tmpDvdNumber;
        if (_cursor.isNull(_cursorIndexOfDvdNumber)) {
          _tmpDvdNumber = null;
        } else {
          _tmpDvdNumber = _cursor.getDouble(_cursorIndexOfDvdNumber);
        }
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final Integer _tmpPlays;
        if (_cursor.isNull(_cursorIndexOfPlays)) {
          _tmpPlays = null;
        } else {
          _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        }
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        final String _tmpDirectors;
        if (_cursor.isNull(_cursorIndexOfDirectors)) {
          _tmpDirectors = null;
        } else {
          _tmpDirectors = _cursor.getString(_cursorIndexOfDirectors);
        }
        final String _tmpGuestStars;
        if (_cursor.isNull(_cursorIndexOfGuestStars)) {
          _tmpGuestStars = null;
        } else {
          _tmpGuestStars = _cursor.getString(_cursorIndexOfGuestStars);
        }
        final String _tmpWriters;
        if (_cursor.isNull(_cursorIndexOfWriters)) {
          _tmpWriters = null;
        } else {
          _tmpWriters = _cursor.getString(_cursorIndexOfWriters);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final long _tmpFirstReleasedMs;
        _tmpFirstReleasedMs = _cursor.getLong(_cursorIndexOfFirstReleasedMs);
        final Double _tmpRatingGlobal;
        if (_cursor.isNull(_cursorIndexOfRatingGlobal)) {
          _tmpRatingGlobal = null;
        } else {
          _tmpRatingGlobal = _cursor.getDouble(_cursorIndexOfRatingGlobal);
        }
        final Integer _tmpRatingVotes;
        if (_cursor.isNull(_cursorIndexOfRatingVotes)) {
          _tmpRatingVotes = null;
        } else {
          _tmpRatingVotes = _cursor.getInt(_cursorIndexOfRatingVotes);
        }
        final Integer _tmpRatingUser;
        if (_cursor.isNull(_cursorIndexOfRatingUser)) {
          _tmpRatingUser = null;
        } else {
          _tmpRatingUser = _cursor.getInt(_cursorIndexOfRatingUser);
        }
        final String _tmpImdbId;
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _tmpImdbId = null;
        } else {
          _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
        final long _tmpLastEditedSec;
        _tmpLastEditedSec = _cursor.getLong(_cursorIndexOfLastEditedSec);
        final long _tmpLastUpdatedSec;
        _tmpLastUpdatedSec = _cursor.getLong(_cursorIndexOfLastUpdatedSec);
        _item = new SgEpisode2(_tmpId,_tmpSeasonId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpTitle,_tmpOverview,_tmpNumber,_tmpAbsoluteNumber,_tmpSeason,_tmpOrder,_tmpDvdNumber,_tmpWatched,_tmpPlays,_tmpCollected,_tmpDirectors,_tmpGuestStars,_tmpWriters,_tmpImage,_tmpFirstReleasedMs,_tmpRatingGlobal,_tmpRatingVotes,_tmpRatingUser,_tmpImdbId,_tmpLastEditedSec,_tmpLastUpdatedSec);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Info> dummyToValidateSgEpisode2Info(final long seasonId) {
    final String _sql = "SELECT _id, season_id, series_id, episode_tvdb_id, episode_title, episode_number, episode_absolute_number, episode_season_number, episode_dvd_number, episode_firstairedms, episode_watched, episode_collected FROM sg_episode WHERE season_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodeTvdbId = 3;
      final int _cursorIndexOfTitle = 4;
      final int _cursorIndexOfEpisodenumber = 5;
      final int _cursorIndexOfAbsoluteNumber = 6;
      final int _cursorIndexOfSeason = 7;
      final int _cursorIndexOfDvdNumber = 8;
      final int _cursorIndexOfFirstReleasedMs = 9;
      final int _cursorIndexOfWatched = 10;
      final int _cursorIndexOfCollected = 11;
      final List<SgEpisode2Info> _result = new ArrayList<SgEpisode2Info>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Info _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodeTvdbId;
        _tmpEpisodeTvdbId = _cursor.getInt(_cursorIndexOfEpisodeTvdbId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpAbsoluteNumber;
        _tmpAbsoluteNumber = _cursor.getInt(_cursorIndexOfAbsoluteNumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final double _tmpDvdNumber;
        _tmpDvdNumber = _cursor.getDouble(_cursorIndexOfDvdNumber);
        final long _tmpFirstReleasedMs;
        _tmpFirstReleasedMs = _cursor.getLong(_cursorIndexOfFirstReleasedMs);
        final int _tmpWatched;
        _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        final boolean _tmpCollected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCollected);
        _tmpCollected = _tmp != 0;
        _item = new SgEpisode2Info(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodeTvdbId,_tmpTitle,_tmpEpisodenumber,_tmpAbsoluteNumber,_tmpSeason,_tmpDvdNumber,_tmpWatched,_tmpCollected,_tmpFirstReleasedMs);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countEpisodes() {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countEpisodesWithoutSpecials() {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE episode_season_number != 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countWatchedEpisodes() {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE episode_watched == 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countWatchedEpisodesWithoutSpecials() {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE episode_watched == 1 AND episode_season_number != 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countWatchedEpisodesOfShow(final long showId) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = ? AND episode_watched = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countWatchedEpisodesOfShowWithoutSpecials(final long showId) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = ? AND episode_watched = 1 AND episode_season_number != 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countNotCollectedEpisodesOfShow(final long showId, final long currentTimeToolsTime) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = ? AND episode_collected = 0 AND episode_season_number != 0 AND episode_firstairedms != -1 AND episode_firstairedms <= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, currentTimeToolsTime);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countNotWatchedEpisodesOfShow(final long showId, final long currentTimeToolsTime) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE series_id = ? AND episode_watched = 0 AND episode_season_number != 0 AND episode_firstairedms != -1 AND episode_firstairedms <= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, currentTimeToolsTime);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countEpisodesOfSeason(final long seasonId) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countNotWatchedReleasedEpisodesOfSeason(final long seasonId,
      final long currentTimeToolsTime) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = ? AND episode_watched = 0 AND episode_firstairedms != -1 AND episode_firstairedms <= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, currentTimeToolsTime);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countNotWatchedToBeReleasedEpisodesOfSeason(final long seasonId,
      final long currentTimeToolsTime) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = ? AND episode_watched = 0 AND episode_firstairedms > ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, currentTimeToolsTime);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countNotWatchedNoReleaseEpisodesOfSeason(final long seasonId) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = ? AND episode_watched = 0 AND episode_firstairedms = -1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countSkippedEpisodesOfSeason(final long seasonId) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = ? AND episode_watched = 2";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countNotCollectedEpisodesOfSeason(final long seasonId) {
    final String _sql = "SELECT COUNT(_id) FROM sg_episode WHERE season_id = ? AND episode_collected = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Numbers> getEpisodeNumbersForWatchedUpTo(final long showId,
      final long episodeFirstAired, final int episodeNumber) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode WHERE series_id = ? \n"
            + "            AND (\n"
            + "            episode_firstairedms < ?\n"
            + "            OR (episode_firstairedms = ? AND episode_number <= ?)\n"
            + "            )\n"
            + "            AND episode_firstairedms != -1\n"
            + "            AND episode_watched != 1\n"
            + "            ORDER BY episode_season_number ASC, episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, episodeFirstAired);
    _argIndex = 3;
    _statement.bindLong(_argIndex, episodeFirstAired);
    _argIndex = 4;
    _statement.bindLong(_argIndex, episodeNumber);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Numbers> getWatchedOrSkippedEpisodeNumbersOfSeason(final long seasonId) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n"
            + "        WHERE season_id = ? AND episode_watched != 0\n"
            + "        ORDER BY episode_season_number ASC, episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Numbers> getNotWatchedOrSkippedEpisodeNumbersOfSeason(final long seasonId,
      final long currentTimePlusOneHour) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n"
            + "        WHERE season_id = ? AND episode_watched != 1\n"
            + "        AND episode_firstairedms <= ? AND episode_firstairedms != -1\n"
            + "        ORDER BY episode_season_number ASC, episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, currentTimePlusOneHour);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Numbers> getWatchedOrSkippedEpisodeNumbersOfShow(final long showId) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n"
            + "        WHERE series_id = ? AND episode_watched != 0\n"
            + "        AND episode_season_number != 0\n"
            + "        ORDER BY episode_season_number ASC, episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgEpisode2Numbers> getNotWatchedOrSkippedEpisodeNumbersOfShow(final long showId,
      final long currentTimePlusOneHour) {
    final String _sql = "SELECT _id, season_id, series_id, episode_number, episode_season_number, episode_plays FROM sg_episode \n"
            + "        WHERE series_id = ? AND episode_watched != 1\n"
            + "        AND episode_firstairedms <= ? AND episode_firstairedms != -1\n"
            + "        AND episode_season_number != 0\n"
            + "        ORDER BY episode_season_number ASC, episode_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, currentTimePlusOneHour);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSeasonId = 1;
      final int _cursorIndexOfShowId = 2;
      final int _cursorIndexOfEpisodenumber = 3;
      final int _cursorIndexOfSeason = 4;
      final int _cursorIndexOfPlays = 5;
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSeasonId;
        _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final int _tmpEpisodenumber;
        _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        final int _tmpSeason;
        _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgEpisode2Info getEpisodeInfo(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
      final int _cursorIndexOfSeasonId = CursorUtil.getColumnIndex(_cursor, "season_id");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndex(_cursor, "series_id");
      final int _cursorIndexOfEpisodeTvdbId = CursorUtil.getColumnIndex(_cursor, "episode_tvdb_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "episode_title");
      final int _cursorIndexOfEpisodenumber = CursorUtil.getColumnIndex(_cursor, "episode_number");
      final int _cursorIndexOfAbsoluteNumber = CursorUtil.getColumnIndex(_cursor, "episode_absolute_number");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndex(_cursor, "episode_season_number");
      final int _cursorIndexOfDvdNumber = CursorUtil.getColumnIndex(_cursor, "episode_dvd_number");
      final int _cursorIndexOfWatched = CursorUtil.getColumnIndex(_cursor, "episode_watched");
      final int _cursorIndexOfCollected = CursorUtil.getColumnIndex(_cursor, "episode_collected");
      final int _cursorIndexOfFirstReleasedMs = CursorUtil.getColumnIndex(_cursor, "episode_firstairedms");
      final SgEpisode2Info _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        if (_cursorIndexOfId == -1) {
          _tmpId = 0;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final long _tmpSeasonId;
        if (_cursorIndexOfSeasonId == -1) {
          _tmpSeasonId = 0;
        } else {
          _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        }
        final long _tmpShowId;
        if (_cursorIndexOfShowId == -1) {
          _tmpShowId = 0;
        } else {
          _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        }
        final int _tmpEpisodeTvdbId;
        if (_cursorIndexOfEpisodeTvdbId == -1) {
          _tmpEpisodeTvdbId = 0;
        } else {
          _tmpEpisodeTvdbId = _cursor.getInt(_cursorIndexOfEpisodeTvdbId);
        }
        final String _tmpTitle;
        if (_cursorIndexOfTitle == -1) {
          _tmpTitle = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
        }
        final int _tmpEpisodenumber;
        if (_cursorIndexOfEpisodenumber == -1) {
          _tmpEpisodenumber = 0;
        } else {
          _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        }
        final int _tmpAbsoluteNumber;
        if (_cursorIndexOfAbsoluteNumber == -1) {
          _tmpAbsoluteNumber = 0;
        } else {
          _tmpAbsoluteNumber = _cursor.getInt(_cursorIndexOfAbsoluteNumber);
        }
        final int _tmpSeason;
        if (_cursorIndexOfSeason == -1) {
          _tmpSeason = 0;
        } else {
          _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        }
        final double _tmpDvdNumber;
        if (_cursorIndexOfDvdNumber == -1) {
          _tmpDvdNumber = 0;
        } else {
          _tmpDvdNumber = _cursor.getDouble(_cursorIndexOfDvdNumber);
        }
        final int _tmpWatched;
        if (_cursorIndexOfWatched == -1) {
          _tmpWatched = 0;
        } else {
          _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        }
        final boolean _tmpCollected;
        if (_cursorIndexOfCollected == -1) {
          _tmpCollected = false;
        } else {
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfCollected);
          _tmpCollected = _tmp != 0;
        }
        final long _tmpFirstReleasedMs;
        if (_cursorIndexOfFirstReleasedMs == -1) {
          _tmpFirstReleasedMs = 0;
        } else {
          _tmpFirstReleasedMs = _cursor.getLong(_cursorIndexOfFirstReleasedMs);
        }
        _result = new SgEpisode2Info(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodeTvdbId,_tmpTitle,_tmpEpisodenumber,_tmpAbsoluteNumber,_tmpSeason,_tmpDvdNumber,_tmpWatched,_tmpCollected,_tmpFirstReleasedMs);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public List<SgEpisode2WithShow> getEpisodesWithShow(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
      final int _cursorIndexOfEpisodetitle = CursorUtil.getColumnIndex(_cursor, "episode_title");
      final int _cursorIndexOfEpisodenumber = CursorUtil.getColumnIndex(_cursor, "episode_number");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndex(_cursor, "episode_season_number");
      final int _cursorIndexOfEpisodeFirstairedms = CursorUtil.getColumnIndex(_cursor, "episode_firstairedms");
      final int _cursorIndexOfWatched = CursorUtil.getColumnIndex(_cursor, "episode_watched");
      final int _cursorIndexOfEpisodeCollected = CursorUtil.getColumnIndex(_cursor, "episode_collected");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndex(_cursor, "episode_description");
      final int _cursorIndexOfSeriestitle = CursorUtil.getColumnIndex(_cursor, "series_title");
      final int _cursorIndexOfNetwork = CursorUtil.getColumnIndex(_cursor, "series_network");
      final int _cursorIndexOfSeriesPosterSmall = CursorUtil.getColumnIndex(_cursor, "series_poster_small");
      final List<SgEpisode2WithShow> _result = new ArrayList<SgEpisode2WithShow>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2WithShow _item;
        final long _tmpId;
        if (_cursorIndexOfId == -1) {
          _tmpId = 0;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpEpisodetitle;
        if (_cursorIndexOfEpisodetitle == -1) {
          _tmpEpisodetitle = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfEpisodetitle)) {
            _tmpEpisodetitle = null;
          } else {
            _tmpEpisodetitle = _cursor.getString(_cursorIndexOfEpisodetitle);
          }
        }
        final int _tmpEpisodenumber;
        if (_cursorIndexOfEpisodenumber == -1) {
          _tmpEpisodenumber = 0;
        } else {
          _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        }
        final int _tmpSeason;
        if (_cursorIndexOfSeason == -1) {
          _tmpSeason = 0;
        } else {
          _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        }
        final long _tmpEpisode_firstairedms;
        if (_cursorIndexOfEpisodeFirstairedms == -1) {
          _tmpEpisode_firstairedms = 0;
        } else {
          _tmpEpisode_firstairedms = _cursor.getLong(_cursorIndexOfEpisodeFirstairedms);
        }
        final int _tmpWatched;
        if (_cursorIndexOfWatched == -1) {
          _tmpWatched = 0;
        } else {
          _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
        }
        final boolean _tmpEpisode_collected;
        if (_cursorIndexOfEpisodeCollected == -1) {
          _tmpEpisode_collected = false;
        } else {
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfEpisodeCollected);
          _tmpEpisode_collected = _tmp != 0;
        }
        final String _tmpOverview;
        if (_cursorIndexOfOverview == -1) {
          _tmpOverview = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfOverview)) {
            _tmpOverview = null;
          } else {
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
          }
        }
        final String _tmpSeriestitle;
        if (_cursorIndexOfSeriestitle == -1) {
          _tmpSeriestitle = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfSeriestitle)) {
            _tmpSeriestitle = null;
          } else {
            _tmpSeriestitle = _cursor.getString(_cursorIndexOfSeriestitle);
          }
        }
        final String _tmpNetwork;
        if (_cursorIndexOfNetwork == -1) {
          _tmpNetwork = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfNetwork)) {
            _tmpNetwork = null;
          } else {
            _tmpNetwork = _cursor.getString(_cursorIndexOfNetwork);
          }
        }
        final String _tmpSeries_poster_small;
        if (_cursorIndexOfSeriesPosterSmall == -1) {
          _tmpSeries_poster_small = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfSeriesPosterSmall)) {
            _tmpSeries_poster_small = null;
          } else {
            _tmpSeries_poster_small = _cursor.getString(_cursorIndexOfSeriesPosterSmall);
          }
        }
        _item = new SgEpisode2WithShow(_tmpId,_tmpEpisodetitle,_tmpEpisodenumber,_tmpSeason,_tmpEpisode_firstairedms,_tmpWatched,_tmpEpisode_collected,_tmpOverview,_tmpSeriestitle,_tmpNetwork,_tmpSeries_poster_small);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public PagingSource<Integer, SgEpisode2WithShow> getEpisodesWithShowDataSource(
      final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return new LimitOffsetPagingSource<SgEpisode2WithShow>(_internalQuery, __db, "sg_episode", "sg_show") {
      @Override
      protected List<SgEpisode2WithShow> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "_id");
        final int _cursorIndexOfEpisodetitle = CursorUtil.getColumnIndex(cursor, "episode_title");
        final int _cursorIndexOfEpisodenumber = CursorUtil.getColumnIndex(cursor, "episode_number");
        final int _cursorIndexOfSeason = CursorUtil.getColumnIndex(cursor, "episode_season_number");
        final int _cursorIndexOfEpisodeFirstairedms = CursorUtil.getColumnIndex(cursor, "episode_firstairedms");
        final int _cursorIndexOfWatched = CursorUtil.getColumnIndex(cursor, "episode_watched");
        final int _cursorIndexOfEpisodeCollected = CursorUtil.getColumnIndex(cursor, "episode_collected");
        final int _cursorIndexOfOverview = CursorUtil.getColumnIndex(cursor, "episode_description");
        final int _cursorIndexOfSeriestitle = CursorUtil.getColumnIndex(cursor, "series_title");
        final int _cursorIndexOfNetwork = CursorUtil.getColumnIndex(cursor, "series_network");
        final int _cursorIndexOfSeriesPosterSmall = CursorUtil.getColumnIndex(cursor, "series_poster_small");
        final List<SgEpisode2WithShow> _result = new ArrayList<SgEpisode2WithShow>(cursor.getCount());
        while(cursor.moveToNext()) {
          final SgEpisode2WithShow _item;
          final long _tmpId;
          if (_cursorIndexOfId == -1) {
            _tmpId = 0;
          } else {
            _tmpId = cursor.getLong(_cursorIndexOfId);
          }
          final String _tmpEpisodetitle;
          if (_cursorIndexOfEpisodetitle == -1) {
            _tmpEpisodetitle = null;
          } else {
            if (cursor.isNull(_cursorIndexOfEpisodetitle)) {
              _tmpEpisodetitle = null;
            } else {
              _tmpEpisodetitle = cursor.getString(_cursorIndexOfEpisodetitle);
            }
          }
          final int _tmpEpisodenumber;
          if (_cursorIndexOfEpisodenumber == -1) {
            _tmpEpisodenumber = 0;
          } else {
            _tmpEpisodenumber = cursor.getInt(_cursorIndexOfEpisodenumber);
          }
          final int _tmpSeason;
          if (_cursorIndexOfSeason == -1) {
            _tmpSeason = 0;
          } else {
            _tmpSeason = cursor.getInt(_cursorIndexOfSeason);
          }
          final long _tmpEpisode_firstairedms;
          if (_cursorIndexOfEpisodeFirstairedms == -1) {
            _tmpEpisode_firstairedms = 0;
          } else {
            _tmpEpisode_firstairedms = cursor.getLong(_cursorIndexOfEpisodeFirstairedms);
          }
          final int _tmpWatched;
          if (_cursorIndexOfWatched == -1) {
            _tmpWatched = 0;
          } else {
            _tmpWatched = cursor.getInt(_cursorIndexOfWatched);
          }
          final boolean _tmpEpisode_collected;
          if (_cursorIndexOfEpisodeCollected == -1) {
            _tmpEpisode_collected = false;
          } else {
            final int _tmp;
            _tmp = cursor.getInt(_cursorIndexOfEpisodeCollected);
            _tmpEpisode_collected = _tmp != 0;
          }
          final String _tmpOverview;
          if (_cursorIndexOfOverview == -1) {
            _tmpOverview = null;
          } else {
            if (cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = cursor.getString(_cursorIndexOfOverview);
            }
          }
          final String _tmpSeriestitle;
          if (_cursorIndexOfSeriestitle == -1) {
            _tmpSeriestitle = null;
          } else {
            if (cursor.isNull(_cursorIndexOfSeriestitle)) {
              _tmpSeriestitle = null;
            } else {
              _tmpSeriestitle = cursor.getString(_cursorIndexOfSeriestitle);
            }
          }
          final String _tmpNetwork;
          if (_cursorIndexOfNetwork == -1) {
            _tmpNetwork = null;
          } else {
            if (cursor.isNull(_cursorIndexOfNetwork)) {
              _tmpNetwork = null;
            } else {
              _tmpNetwork = cursor.getString(_cursorIndexOfNetwork);
            }
          }
          final String _tmpSeries_poster_small;
          if (_cursorIndexOfSeriesPosterSmall == -1) {
            _tmpSeries_poster_small = null;
          } else {
            if (cursor.isNull(_cursorIndexOfSeriesPosterSmall)) {
              _tmpSeries_poster_small = null;
            } else {
              _tmpSeries_poster_small = cursor.getString(_cursorIndexOfSeriesPosterSmall);
            }
          }
          _item = new SgEpisode2WithShow(_tmpId,_tmpEpisodetitle,_tmpEpisodenumber,_tmpSeason,_tmpEpisode_firstairedms,_tmpWatched,_tmpEpisode_collected,_tmpOverview,_tmpSeriestitle,_tmpNetwork,_tmpSeries_poster_small);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public List<SgEpisode2Numbers> getEpisodeNumbersOfSeason(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
      final int _cursorIndexOfSeasonId = CursorUtil.getColumnIndex(_cursor, "season_id");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndex(_cursor, "series_id");
      final int _cursorIndexOfEpisodenumber = CursorUtil.getColumnIndex(_cursor, "episode_number");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndex(_cursor, "episode_season_number");
      final int _cursorIndexOfPlays = CursorUtil.getColumnIndex(_cursor, "episode_plays");
      final List<SgEpisode2Numbers> _result = new ArrayList<SgEpisode2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgEpisode2Numbers _item;
        final long _tmpId;
        if (_cursorIndexOfId == -1) {
          _tmpId = 0;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final long _tmpSeasonId;
        if (_cursorIndexOfSeasonId == -1) {
          _tmpSeasonId = 0;
        } else {
          _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
        }
        final long _tmpShowId;
        if (_cursorIndexOfShowId == -1) {
          _tmpShowId = 0;
        } else {
          _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        }
        final int _tmpEpisodenumber;
        if (_cursorIndexOfEpisodenumber == -1) {
          _tmpEpisodenumber = 0;
        } else {
          _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
        }
        final int _tmpSeason;
        if (_cursorIndexOfSeason == -1) {
          _tmpSeason = 0;
        } else {
          _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
        }
        final int _tmpPlays;
        if (_cursorIndexOfPlays == -1) {
          _tmpPlays = 0;
        } else {
          _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        }
        _item = new SgEpisode2Numbers(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodenumber,_tmpSeason,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public LiveData<List<SgEpisode2Info>> getEpisodeInfoOfSeasonLiveData(
      final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_episode"}, false, new Callable<List<SgEpisode2Info>>() {
      @Override
      public List<SgEpisode2Info> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
          final int _cursorIndexOfSeasonId = CursorUtil.getColumnIndex(_cursor, "season_id");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndex(_cursor, "series_id");
          final int _cursorIndexOfEpisodeTvdbId = CursorUtil.getColumnIndex(_cursor, "episode_tvdb_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "episode_title");
          final int _cursorIndexOfEpisodenumber = CursorUtil.getColumnIndex(_cursor, "episode_number");
          final int _cursorIndexOfAbsoluteNumber = CursorUtil.getColumnIndex(_cursor, "episode_absolute_number");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndex(_cursor, "episode_season_number");
          final int _cursorIndexOfDvdNumber = CursorUtil.getColumnIndex(_cursor, "episode_dvd_number");
          final int _cursorIndexOfWatched = CursorUtil.getColumnIndex(_cursor, "episode_watched");
          final int _cursorIndexOfCollected = CursorUtil.getColumnIndex(_cursor, "episode_collected");
          final int _cursorIndexOfFirstReleasedMs = CursorUtil.getColumnIndex(_cursor, "episode_firstairedms");
          final List<SgEpisode2Info> _result = new ArrayList<SgEpisode2Info>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgEpisode2Info _item;
            final long _tmpId;
            if (_cursorIndexOfId == -1) {
              _tmpId = 0;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final long _tmpSeasonId;
            if (_cursorIndexOfSeasonId == -1) {
              _tmpSeasonId = 0;
            } else {
              _tmpSeasonId = _cursor.getLong(_cursorIndexOfSeasonId);
            }
            final long _tmpShowId;
            if (_cursorIndexOfShowId == -1) {
              _tmpShowId = 0;
            } else {
              _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
            }
            final int _tmpEpisodeTvdbId;
            if (_cursorIndexOfEpisodeTvdbId == -1) {
              _tmpEpisodeTvdbId = 0;
            } else {
              _tmpEpisodeTvdbId = _cursor.getInt(_cursorIndexOfEpisodeTvdbId);
            }
            final String _tmpTitle;
            if (_cursorIndexOfTitle == -1) {
              _tmpTitle = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
            }
            final int _tmpEpisodenumber;
            if (_cursorIndexOfEpisodenumber == -1) {
              _tmpEpisodenumber = 0;
            } else {
              _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
            }
            final int _tmpAbsoluteNumber;
            if (_cursorIndexOfAbsoluteNumber == -1) {
              _tmpAbsoluteNumber = 0;
            } else {
              _tmpAbsoluteNumber = _cursor.getInt(_cursorIndexOfAbsoluteNumber);
            }
            final int _tmpSeason;
            if (_cursorIndexOfSeason == -1) {
              _tmpSeason = 0;
            } else {
              _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
            }
            final double _tmpDvdNumber;
            if (_cursorIndexOfDvdNumber == -1) {
              _tmpDvdNumber = 0;
            } else {
              _tmpDvdNumber = _cursor.getDouble(_cursorIndexOfDvdNumber);
            }
            final int _tmpWatched;
            if (_cursorIndexOfWatched == -1) {
              _tmpWatched = 0;
            } else {
              _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
            }
            final boolean _tmpCollected;
            if (_cursorIndexOfCollected == -1) {
              _tmpCollected = false;
            } else {
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfCollected);
              _tmpCollected = _tmp != 0;
            }
            final long _tmpFirstReleasedMs;
            if (_cursorIndexOfFirstReleasedMs == -1) {
              _tmpFirstReleasedMs = 0;
            } else {
              _tmpFirstReleasedMs = _cursor.getLong(_cursorIndexOfFirstReleasedMs);
            }
            _item = new SgEpisode2Info(_tmpId,_tmpSeasonId,_tmpShowId,_tmpEpisodeTvdbId,_tmpTitle,_tmpEpisodenumber,_tmpAbsoluteNumber,_tmpSeason,_tmpDvdNumber,_tmpWatched,_tmpCollected,_tmpFirstReleasedMs);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  @Override
  public LiveData<List<SgEpisode2SearchResult>> getEpisodeSearchResults(
      final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_episode","sg_show"}, false, new Callable<List<SgEpisode2SearchResult>>() {
      @Override
      public List<SgEpisode2SearchResult> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
          final int _cursorIndexOfEpisodetitle = CursorUtil.getColumnIndex(_cursor, "episode_title");
          final int _cursorIndexOfEpisodenumber = CursorUtil.getColumnIndex(_cursor, "episode_number");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndex(_cursor, "episode_season_number");
          final int _cursorIndexOfWatched = CursorUtil.getColumnIndex(_cursor, "episode_watched");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndex(_cursor, "episode_description");
          final int _cursorIndexOfSeriestitle = CursorUtil.getColumnIndex(_cursor, "series_title");
          final int _cursorIndexOfSeriesPosterSmall = CursorUtil.getColumnIndex(_cursor, "series_poster_small");
          final List<SgEpisode2SearchResult> _result = new ArrayList<SgEpisode2SearchResult>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgEpisode2SearchResult _item;
            final long _tmpId;
            if (_cursorIndexOfId == -1) {
              _tmpId = 0;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final String _tmpEpisodetitle;
            if (_cursorIndexOfEpisodetitle == -1) {
              _tmpEpisodetitle = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfEpisodetitle)) {
                _tmpEpisodetitle = null;
              } else {
                _tmpEpisodetitle = _cursor.getString(_cursorIndexOfEpisodetitle);
              }
            }
            final int _tmpEpisodenumber;
            if (_cursorIndexOfEpisodenumber == -1) {
              _tmpEpisodenumber = 0;
            } else {
              _tmpEpisodenumber = _cursor.getInt(_cursorIndexOfEpisodenumber);
            }
            final int _tmpSeason;
            if (_cursorIndexOfSeason == -1) {
              _tmpSeason = 0;
            } else {
              _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
            }
            final int _tmpWatched;
            if (_cursorIndexOfWatched == -1) {
              _tmpWatched = 0;
            } else {
              _tmpWatched = _cursor.getInt(_cursorIndexOfWatched);
            }
            final String _tmpOverview;
            if (_cursorIndexOfOverview == -1) {
              _tmpOverview = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfOverview)) {
                _tmpOverview = null;
              } else {
                _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
              }
            }
            final String _tmpSeriestitle;
            if (_cursorIndexOfSeriestitle == -1) {
              _tmpSeriestitle = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfSeriestitle)) {
                _tmpSeriestitle = null;
              } else {
                _tmpSeriestitle = _cursor.getString(_cursorIndexOfSeriestitle);
              }
            }
            final String _tmpSeries_poster_small;
            if (_cursorIndexOfSeriesPosterSmall == -1) {
              _tmpSeries_poster_small = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfSeriesPosterSmall)) {
                _tmpSeries_poster_small = null;
              } else {
                _tmpSeries_poster_small = _cursor.getString(_cursorIndexOfSeriesPosterSmall);
              }
            }
            _item = new SgEpisode2SearchResult(_tmpId,_tmpEpisodetitle,_tmpEpisodenumber,_tmpSeason,_tmpWatched,_tmpOverview,_tmpSeriestitle,_tmpSeries_poster_small);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
