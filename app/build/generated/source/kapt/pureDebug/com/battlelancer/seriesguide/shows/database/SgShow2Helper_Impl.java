package com.battlelancer.seriesguide.shows.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.battlelancer.seriesguide.sync.ShowLastWatchedInfo;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SgShow2Helper_Impl implements SgShow2Helper {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SgShow2> __insertionAdapterOfSgShow2;

  private final EntityDeletionOrUpdateAdapter<SgShow2Update> __updateAdapterOfSgShow2UpdateAsSgShow2;

  private final EntityDeletionOrUpdateAdapter<SgShow2NextEpisodeUpdate> __updateAdapterOfSgShow2NextEpisodeUpdateAsSgShow2;

  private final EntityDeletionOrUpdateAdapter<SgShow2CloudUpdate> __updateAdapterOfSgShow2CloudUpdateAsSgShow2;

  private final SharedSQLiteStatement __preparedStmtOfSetShowFavorite;

  private final SharedSQLiteStatement __preparedStmtOfSetShowNotify;

  private final SharedSQLiteStatement __preparedStmtOfSetShowHidden;

  private final SharedSQLiteStatement __preparedStmtOfMakeHiddenVisible;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLanguage;

  private final SharedSQLiteStatement __preparedStmtOfUpdateTmdbId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllShows;

  private final SharedSQLiteStatement __preparedStmtOfDeleteShow;

  private final SharedSQLiteStatement __preparedStmtOfSetHexagonMergeNotCompletedForAll;

  private final SharedSQLiteStatement __preparedStmtOfSetHexagonMergeNotCompleted;

  private final SharedSQLiteStatement __preparedStmtOfSetHexagonMergeCompleted;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLastWatchedMsIfLater;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLastWatchedEpisodeId;

  private final SharedSQLiteStatement __preparedStmtOfSetLastUpdated;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUserRating;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUserRatingByTmdbId;

  private final SharedSQLiteStatement __preparedStmtOfMigrateCanceledShowStatus;

  public SgShow2Helper_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSgShow2 = new EntityInsertionAdapter<SgShow2>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `sg_show` (`_id`,`series_tmdb_id`,`series_tvdb_id`,`series_slug`,`series_trakt_id`,`series_title`,`series_title_noarticle`,`series_overview`,`series_airstime`,`series_airsdayofweek`,`series_country`,`series_timezone`,`series_firstaired`,`series_genres`,`series_network`,`series_imdbid`,`series_rating`,`series_rating_votes`,`series_rating_user`,`series_runtime`,`series_status`,`series_contentrating`,`series_next`,`series_poster`,`series_poster_small`,`series_nextairdate`,`series_nexttext`,`series_lastupdate`,`series_lastedit`,`series_lastwatchedid`,`series_lastwatched_ms`,`series_language`,`series_unwatched_count`,`series_favorite`,`series_hidden`,`series_notify`,`series_syncenabled`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgShow2 value) {
        stmt.bindLong(1, value.getId());
        if (value.getTmdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTmdbId());
        }
        if (value.getTvdbId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTvdbId());
        }
        if (value.getSlug() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSlug());
        }
        if (value.getTraktId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getTraktId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getTitleNoArticle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitleNoArticle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOverview());
        }
        if (value.getReleaseTime() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getReleaseTime());
        }
        if (value.getReleaseWeekDay() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getReleaseWeekDay());
        }
        if (value.getReleaseCountry() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getReleaseCountry());
        }
        if (value.getReleaseTimeZone() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getReleaseTimeZone());
        }
        if (value.getFirstRelease() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getFirstRelease());
        }
        if (value.getGenres() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getGenres());
        }
        if (value.getNetwork() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getNetwork());
        }
        if (value.getImdbId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getImdbId());
        }
        if (value.getRatingGlobal() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindDouble(17, value.getRatingGlobal());
        }
        if (value.getRatingVotes() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, value.getRatingVotes());
        }
        if (value.getRatingUser() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, value.getRatingUser());
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindLong(20, value.getRuntime());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindLong(21, value.getStatus());
        }
        if (value.getContentRating() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getContentRating());
        }
        if (value.getNextEpisode() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getNextEpisode());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getPoster());
        }
        if (value.getPosterSmall() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPosterSmall());
        }
        if (value.getNextAirdateMs() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindLong(26, value.getNextAirdateMs());
        }
        if (value.getNextText() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getNextText());
        }
        stmt.bindLong(28, value.getLastUpdatedMs());
        stmt.bindLong(29, value.getLastEditedSec());
        stmt.bindLong(30, value.getLastWatchedEpisodeId());
        stmt.bindLong(31, value.getLastWatchedMs());
        if (value.getLanguage() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getLanguage());
        }
        stmt.bindLong(33, value.getUnwatchedCount());
        final int _tmp = value.getFavorite() ? 1 : 0;
        stmt.bindLong(34, _tmp);
        final int _tmp_1 = value.getHidden() ? 1 : 0;
        stmt.bindLong(35, _tmp_1);
        final int _tmp_2 = value.getNotify() ? 1 : 0;
        stmt.bindLong(36, _tmp_2);
        final int _tmp_3 = value.getHexagonMergeComplete() ? 1 : 0;
        stmt.bindLong(37, _tmp_3);
      }
    };
    this.__updateAdapterOfSgShow2UpdateAsSgShow2 = new EntityDeletionOrUpdateAdapter<SgShow2Update>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_show` SET `_id` = ?,`series_tvdb_id` = ?,`series_trakt_id` = ?,`series_title` = ?,`series_title_noarticle` = ?,`series_overview` = ?,`series_airstime` = ?,`series_airsdayofweek` = ?,`series_country` = ?,`series_timezone` = ?,`series_firstaired` = ?,`series_genres` = ?,`series_network` = ?,`series_imdbid` = ?,`series_rating` = ?,`series_rating_votes` = ?,`series_runtime` = ?,`series_status` = ?,`series_poster` = ?,`series_poster_small` = ?,`series_lastupdate` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgShow2Update value) {
        stmt.bindLong(1, value.getId());
        if (value.getTvdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTvdbId());
        }
        if (value.getTraktId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTraktId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getTitleNoArticle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitleNoArticle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        stmt.bindLong(7, value.getReleaseTime());
        stmt.bindLong(8, value.getReleaseWeekDay());
        if (value.getReleaseCountry() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getReleaseCountry());
        }
        if (value.getReleaseTimeZone() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getReleaseTimeZone());
        }
        if (value.getFirstRelease() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getFirstRelease());
        }
        if (value.getGenres() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getGenres());
        }
        if (value.getNetwork() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getNetwork());
        }
        if (value.getImdbId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getImdbId());
        }
        stmt.bindDouble(15, value.getRatingGlobal());
        stmt.bindLong(16, value.getRatingVotes());
        if (value.getRuntime() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindLong(17, value.getRuntime());
        }
        stmt.bindLong(18, value.getStatus());
        if (value.getPoster() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getPoster());
        }
        if (value.getPosterSmall() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getPosterSmall());
        }
        stmt.bindLong(21, value.getLastUpdatedMs());
        stmt.bindLong(22, value.getId());
      }
    };
    this.__updateAdapterOfSgShow2NextEpisodeUpdateAsSgShow2 = new EntityDeletionOrUpdateAdapter<SgShow2NextEpisodeUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_show` SET `_id` = ?,`series_next` = ?,`series_nextairdate` = ?,`series_nexttext` = ?,`series_unwatched_count` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgShow2NextEpisodeUpdate value) {
        stmt.bindLong(1, value.getId());
        if (value.getNextEpisode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNextEpisode());
        }
        stmt.bindLong(3, value.getNextAirdateMs());
        if (value.getNextText() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNextText());
        }
        stmt.bindLong(5, value.getUnwatchedCount());
        stmt.bindLong(6, value.getId());
      }
    };
    this.__updateAdapterOfSgShow2CloudUpdateAsSgShow2 = new EntityDeletionOrUpdateAdapter<SgShow2CloudUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_show` SET `_id` = ?,`series_tmdb_id` = ?,`series_language` = ?,`series_favorite` = ?,`series_hidden` = ?,`series_notify` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgShow2CloudUpdate value) {
        stmt.bindLong(1, value.getId());
        if (value.getTmdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTmdbId());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLanguage());
        }
        final int _tmp = value.getFavorite() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final int _tmp_1 = value.getHidden() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        final int _tmp_2 = value.getNotify() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfSetShowFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_favorite = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetShowNotify = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_notify = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetShowHidden = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_hidden = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMakeHiddenVisible = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_hidden = 0 WHERE series_hidden = 1";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLanguage = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_language = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateTmdbId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_tmdb_id = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllShows = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_show";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteShow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_show WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetHexagonMergeNotCompletedForAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_syncenabled = 0";
        return _query;
      }
    };
    this.__preparedStmtOfSetHexagonMergeNotCompleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_syncenabled = 0 WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetHexagonMergeCompleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_syncenabled = 1 WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLastWatchedMsIfLater = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_lastwatched_ms = ? WHERE _id = ? AND series_lastwatched_ms < ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLastWatchedEpisodeId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_lastwatchedid = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetLastUpdated = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_lastupdate = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUserRating = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_rating_user = ? WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUserRatingByTmdbId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_rating_user = ? WHERE series_tmdb_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMigrateCanceledShowStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_show SET series_status = -2 WHERE series_status = 3";
        return _query;
      }
    };
  }

  @Override
  public long insertShow(final SgShow2 sgShow2) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSgShow2.insertAndReturnId(sgShow2);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateShow(final SgShow2Update show) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgShow2UpdateAsSgShow2.handle(show);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateShowNextEpisode(final List<SgShow2NextEpisodeUpdate> updates) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgShow2NextEpisodeUpdateAsSgShow2.handleMultiple(updates);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateForCloudUpdate(final List<SgShow2CloudUpdate> updates) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSgShow2CloudUpdateAsSgShow2.handleMultiple(updates);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLastWatchedMsIfLater(final Map<Long, Long> showIdsToLastWatched) {
    __db.beginTransaction();
    try {
      SgShow2Helper.DefaultImpls.updateLastWatchedMsIfLater(SgShow2Helper_Impl.this, showIdsToLastWatched);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLastWatchedMsIfLaterAndLastWatchedEpisodeId(
      final Map<Long, ShowLastWatchedInfo> showIdsToLastWatched,
      final SgEpisode2Helper episodeHelper) {
    __db.beginTransaction();
    try {
      SgShow2Helper.DefaultImpls.updateLastWatchedMsIfLaterAndLastWatchedEpisodeId(SgShow2Helper_Impl.this, showIdsToLastWatched, episodeHelper);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUserRatings(final Map<Integer, Integer> tmdbIdsToRating) {
    __db.beginTransaction();
    try {
      SgShow2Helper.DefaultImpls.updateUserRatings(SgShow2Helper_Impl.this, tmdbIdsToRating);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int setShowFavorite(final long id, final boolean isFavorite) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetShowFavorite.acquire();
    int _argIndex = 1;
    final int _tmp = isFavorite ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetShowFavorite.release(_stmt);
    }
  }

  @Override
  public int setShowNotify(final long id, final boolean isNotify) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetShowNotify.acquire();
    int _argIndex = 1;
    final int _tmp = isNotify ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetShowNotify.release(_stmt);
    }
  }

  @Override
  public int setShowHidden(final long id, final boolean isHidden) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetShowHidden.acquire();
    int _argIndex = 1;
    final int _tmp = isHidden ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetShowHidden.release(_stmt);
    }
  }

  @Override
  public int makeHiddenVisible() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMakeHiddenVisible.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfMakeHiddenVisible.release(_stmt);
    }
  }

  @Override
  public void updateLanguage(final long id, final String languageCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLanguage.acquire();
    int _argIndex = 1;
    if (languageCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, languageCode);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLanguage.release(_stmt);
    }
  }

  @Override
  public int updateTmdbId(final long id, final int tmdbId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateTmdbId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, tmdbId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateTmdbId.release(_stmt);
    }
  }

  @Override
  public void deleteAllShows() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllShows.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllShows.release(_stmt);
    }
  }

  @Override
  public int deleteShow(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteShow.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteShow.release(_stmt);
    }
  }

  @Override
  public void setHexagonMergeNotCompletedForAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetHexagonMergeNotCompletedForAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetHexagonMergeNotCompletedForAll.release(_stmt);
    }
  }

  @Override
  public void setHexagonMergeNotCompleted(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetHexagonMergeNotCompleted.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetHexagonMergeNotCompleted.release(_stmt);
    }
  }

  @Override
  public void setHexagonMergeCompleted(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetHexagonMergeCompleted.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetHexagonMergeCompleted.release(_stmt);
    }
  }

  @Override
  public void updateLastWatchedMsIfLater(final long id, final long lastWatchedMs) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLastWatchedMsIfLater.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, lastWatchedMs);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, lastWatchedMs);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLastWatchedMsIfLater.release(_stmt);
    }
  }

  @Override
  public void updateLastWatchedEpisodeId(final long id, final long episodeId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLastWatchedEpisodeId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, episodeId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLastWatchedEpisodeId.release(_stmt);
    }
  }

  @Override
  public void setLastUpdated(final long id, final long lastUpdatedMs) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetLastUpdated.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, lastUpdatedMs);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetLastUpdated.release(_stmt);
    }
  }

  @Override
  public int updateUserRating(final long showId, final int userRating) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUserRating.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, userRating);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, showId);
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
  public int updateUserRatingByTmdbId(final int tmdbId, final int userRating) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUserRatingByTmdbId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, userRating);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, tmdbId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateUserRatingByTmdbId.release(_stmt);
    }
  }

  @Override
  public void migrateCanceledShowStatus() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMigrateCanceledShowStatus.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMigrateCanceledShowStatus.release(_stmt);
    }
  }

  @Override
  public SgShow2 getShow(final long id) {
    final String _sql = "SELECT * FROM sg_show WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tmdb_id");
      final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tvdb_id");
      final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "series_slug");
      final int _cursorIndexOfTraktId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_trakt_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "series_title");
      final int _cursorIndexOfTitleNoArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "series_title_noarticle");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "series_overview");
      final int _cursorIndexOfReleaseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "series_airstime");
      final int _cursorIndexOfReleaseWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "series_airsdayofweek");
      final int _cursorIndexOfReleaseCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "series_country");
      final int _cursorIndexOfReleaseTimeZone = CursorUtil.getColumnIndexOrThrow(_cursor, "series_timezone");
      final int _cursorIndexOfFirstRelease = CursorUtil.getColumnIndexOrThrow(_cursor, "series_firstaired");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "series_genres");
      final int _cursorIndexOfNetwork = CursorUtil.getColumnIndexOrThrow(_cursor, "series_network");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_imdbid");
      final int _cursorIndexOfRatingGlobal = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating");
      final int _cursorIndexOfRatingVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating_votes");
      final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating_user");
      final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "series_runtime");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "series_status");
      final int _cursorIndexOfContentRating = CursorUtil.getColumnIndexOrThrow(_cursor, "series_contentrating");
      final int _cursorIndexOfNextEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "series_next");
      final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "series_poster");
      final int _cursorIndexOfPosterSmall = CursorUtil.getColumnIndexOrThrow(_cursor, "series_poster_small");
      final int _cursorIndexOfNextAirdateMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_nextairdate");
      final int _cursorIndexOfNextText = CursorUtil.getColumnIndexOrThrow(_cursor, "series_nexttext");
      final int _cursorIndexOfLastUpdatedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastupdate");
      final int _cursorIndexOfLastEditedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastedit");
      final int _cursorIndexOfLastWatchedEpisodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastwatchedid");
      final int _cursorIndexOfLastWatchedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastwatched_ms");
      final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "series_language");
      final int _cursorIndexOfUnwatchedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "series_unwatched_count");
      final int _cursorIndexOfFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "series_favorite");
      final int _cursorIndexOfHidden = CursorUtil.getColumnIndexOrThrow(_cursor, "series_hidden");
      final int _cursorIndexOfNotify = CursorUtil.getColumnIndexOrThrow(_cursor, "series_notify");
      final int _cursorIndexOfHexagonMergeComplete = CursorUtil.getColumnIndexOrThrow(_cursor, "series_syncenabled");
      final SgShow2 _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
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
        final String _tmpSlug;
        if (_cursor.isNull(_cursorIndexOfSlug)) {
          _tmpSlug = null;
        } else {
          _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
        }
        final Integer _tmpTraktId;
        if (_cursor.isNull(_cursorIndexOfTraktId)) {
          _tmpTraktId = null;
        } else {
          _tmpTraktId = _cursor.getInt(_cursorIndexOfTraktId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpTitleNoArticle;
        if (_cursor.isNull(_cursorIndexOfTitleNoArticle)) {
          _tmpTitleNoArticle = null;
        } else {
          _tmpTitleNoArticle = _cursor.getString(_cursorIndexOfTitleNoArticle);
        }
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final Integer _tmpReleaseTime;
        if (_cursor.isNull(_cursorIndexOfReleaseTime)) {
          _tmpReleaseTime = null;
        } else {
          _tmpReleaseTime = _cursor.getInt(_cursorIndexOfReleaseTime);
        }
        final Integer _tmpReleaseWeekDay;
        if (_cursor.isNull(_cursorIndexOfReleaseWeekDay)) {
          _tmpReleaseWeekDay = null;
        } else {
          _tmpReleaseWeekDay = _cursor.getInt(_cursorIndexOfReleaseWeekDay);
        }
        final String _tmpReleaseCountry;
        if (_cursor.isNull(_cursorIndexOfReleaseCountry)) {
          _tmpReleaseCountry = null;
        } else {
          _tmpReleaseCountry = _cursor.getString(_cursorIndexOfReleaseCountry);
        }
        final String _tmpReleaseTimeZone;
        if (_cursor.isNull(_cursorIndexOfReleaseTimeZone)) {
          _tmpReleaseTimeZone = null;
        } else {
          _tmpReleaseTimeZone = _cursor.getString(_cursorIndexOfReleaseTimeZone);
        }
        final String _tmpFirstRelease;
        if (_cursor.isNull(_cursorIndexOfFirstRelease)) {
          _tmpFirstRelease = null;
        } else {
          _tmpFirstRelease = _cursor.getString(_cursorIndexOfFirstRelease);
        }
        final String _tmpGenres;
        if (_cursor.isNull(_cursorIndexOfGenres)) {
          _tmpGenres = null;
        } else {
          _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
        }
        final String _tmpNetwork;
        if (_cursor.isNull(_cursorIndexOfNetwork)) {
          _tmpNetwork = null;
        } else {
          _tmpNetwork = _cursor.getString(_cursorIndexOfNetwork);
        }
        final String _tmpImdbId;
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _tmpImdbId = null;
        } else {
          _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
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
        final Integer _tmpRuntime;
        if (_cursor.isNull(_cursorIndexOfRuntime)) {
          _tmpRuntime = null;
        } else {
          _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
        }
        final Integer _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        }
        final String _tmpContentRating;
        if (_cursor.isNull(_cursorIndexOfContentRating)) {
          _tmpContentRating = null;
        } else {
          _tmpContentRating = _cursor.getString(_cursorIndexOfContentRating);
        }
        final String _tmpNextEpisode;
        if (_cursor.isNull(_cursorIndexOfNextEpisode)) {
          _tmpNextEpisode = null;
        } else {
          _tmpNextEpisode = _cursor.getString(_cursorIndexOfNextEpisode);
        }
        final String _tmpPoster;
        if (_cursor.isNull(_cursorIndexOfPoster)) {
          _tmpPoster = null;
        } else {
          _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
        }
        final String _tmpPosterSmall;
        if (_cursor.isNull(_cursorIndexOfPosterSmall)) {
          _tmpPosterSmall = null;
        } else {
          _tmpPosterSmall = _cursor.getString(_cursorIndexOfPosterSmall);
        }
        final Long _tmpNextAirdateMs;
        if (_cursor.isNull(_cursorIndexOfNextAirdateMs)) {
          _tmpNextAirdateMs = null;
        } else {
          _tmpNextAirdateMs = _cursor.getLong(_cursorIndexOfNextAirdateMs);
        }
        final String _tmpNextText;
        if (_cursor.isNull(_cursorIndexOfNextText)) {
          _tmpNextText = null;
        } else {
          _tmpNextText = _cursor.getString(_cursorIndexOfNextText);
        }
        final long _tmpLastUpdatedMs;
        _tmpLastUpdatedMs = _cursor.getLong(_cursorIndexOfLastUpdatedMs);
        final long _tmpLastEditedSec;
        _tmpLastEditedSec = _cursor.getLong(_cursorIndexOfLastEditedSec);
        final long _tmpLastWatchedEpisodeId;
        _tmpLastWatchedEpisodeId = _cursor.getLong(_cursorIndexOfLastWatchedEpisodeId);
        final long _tmpLastWatchedMs;
        _tmpLastWatchedMs = _cursor.getLong(_cursorIndexOfLastWatchedMs);
        final String _tmpLanguage;
        if (_cursor.isNull(_cursorIndexOfLanguage)) {
          _tmpLanguage = null;
        } else {
          _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
        }
        final int _tmpUnwatchedCount;
        _tmpUnwatchedCount = _cursor.getInt(_cursorIndexOfUnwatchedCount);
        final boolean _tmpFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFavorite);
        _tmpFavorite = _tmp != 0;
        final boolean _tmpHidden;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfHidden);
        _tmpHidden = _tmp_1 != 0;
        final boolean _tmpNotify;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfNotify);
        _tmpNotify = _tmp_2 != 0;
        final boolean _tmpHexagonMergeComplete;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfHexagonMergeComplete);
        _tmpHexagonMergeComplete = _tmp_3 != 0;
        _result = new SgShow2(_tmpId,_tmpTmdbId,_tmpTvdbId,_tmpSlug,_tmpTraktId,_tmpTitle,_tmpTitleNoArticle,_tmpOverview,_tmpReleaseTime,_tmpReleaseWeekDay,_tmpReleaseCountry,_tmpReleaseTimeZone,_tmpFirstRelease,_tmpGenres,_tmpNetwork,_tmpImdbId,_tmpRatingGlobal,_tmpRatingVotes,_tmpRatingUser,_tmpRuntime,_tmpStatus,_tmpContentRating,_tmpNextEpisode,_tmpPoster,_tmpPosterSmall,_tmpNextAirdateMs,_tmpNextText,_tmpLastUpdatedMs,_tmpLastEditedSec,_tmpLastWatchedEpisodeId,_tmpLastWatchedMs,_tmpLanguage,_tmpUnwatchedCount,_tmpFavorite,_tmpHidden,_tmpNotify,_tmpHexagonMergeComplete);
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
  public LiveData<SgShow2> getShowLiveData(final long id) {
    final String _sql = "SELECT * FROM sg_show WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_show"}, false, new Callable<SgShow2>() {
      @Override
      public SgShow2 call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tmdb_id");
          final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tvdb_id");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "series_slug");
          final int _cursorIndexOfTraktId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_trakt_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "series_title");
          final int _cursorIndexOfTitleNoArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "series_title_noarticle");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "series_overview");
          final int _cursorIndexOfReleaseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "series_airstime");
          final int _cursorIndexOfReleaseWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "series_airsdayofweek");
          final int _cursorIndexOfReleaseCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "series_country");
          final int _cursorIndexOfReleaseTimeZone = CursorUtil.getColumnIndexOrThrow(_cursor, "series_timezone");
          final int _cursorIndexOfFirstRelease = CursorUtil.getColumnIndexOrThrow(_cursor, "series_firstaired");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "series_genres");
          final int _cursorIndexOfNetwork = CursorUtil.getColumnIndexOrThrow(_cursor, "series_network");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_imdbid");
          final int _cursorIndexOfRatingGlobal = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating");
          final int _cursorIndexOfRatingVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating_votes");
          final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating_user");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "series_runtime");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "series_status");
          final int _cursorIndexOfContentRating = CursorUtil.getColumnIndexOrThrow(_cursor, "series_contentrating");
          final int _cursorIndexOfNextEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "series_next");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "series_poster");
          final int _cursorIndexOfPosterSmall = CursorUtil.getColumnIndexOrThrow(_cursor, "series_poster_small");
          final int _cursorIndexOfNextAirdateMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_nextairdate");
          final int _cursorIndexOfNextText = CursorUtil.getColumnIndexOrThrow(_cursor, "series_nexttext");
          final int _cursorIndexOfLastUpdatedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastupdate");
          final int _cursorIndexOfLastEditedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastedit");
          final int _cursorIndexOfLastWatchedEpisodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastwatchedid");
          final int _cursorIndexOfLastWatchedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastwatched_ms");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "series_language");
          final int _cursorIndexOfUnwatchedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "series_unwatched_count");
          final int _cursorIndexOfFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "series_favorite");
          final int _cursorIndexOfHidden = CursorUtil.getColumnIndexOrThrow(_cursor, "series_hidden");
          final int _cursorIndexOfNotify = CursorUtil.getColumnIndexOrThrow(_cursor, "series_notify");
          final int _cursorIndexOfHexagonMergeComplete = CursorUtil.getColumnIndexOrThrow(_cursor, "series_syncenabled");
          final SgShow2 _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final String _tmpSlug;
            if (_cursor.isNull(_cursorIndexOfSlug)) {
              _tmpSlug = null;
            } else {
              _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            }
            final Integer _tmpTraktId;
            if (_cursor.isNull(_cursorIndexOfTraktId)) {
              _tmpTraktId = null;
            } else {
              _tmpTraktId = _cursor.getInt(_cursorIndexOfTraktId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpTitleNoArticle;
            if (_cursor.isNull(_cursorIndexOfTitleNoArticle)) {
              _tmpTitleNoArticle = null;
            } else {
              _tmpTitleNoArticle = _cursor.getString(_cursorIndexOfTitleNoArticle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Integer _tmpReleaseTime;
            if (_cursor.isNull(_cursorIndexOfReleaseTime)) {
              _tmpReleaseTime = null;
            } else {
              _tmpReleaseTime = _cursor.getInt(_cursorIndexOfReleaseTime);
            }
            final Integer _tmpReleaseWeekDay;
            if (_cursor.isNull(_cursorIndexOfReleaseWeekDay)) {
              _tmpReleaseWeekDay = null;
            } else {
              _tmpReleaseWeekDay = _cursor.getInt(_cursorIndexOfReleaseWeekDay);
            }
            final String _tmpReleaseCountry;
            if (_cursor.isNull(_cursorIndexOfReleaseCountry)) {
              _tmpReleaseCountry = null;
            } else {
              _tmpReleaseCountry = _cursor.getString(_cursorIndexOfReleaseCountry);
            }
            final String _tmpReleaseTimeZone;
            if (_cursor.isNull(_cursorIndexOfReleaseTimeZone)) {
              _tmpReleaseTimeZone = null;
            } else {
              _tmpReleaseTimeZone = _cursor.getString(_cursorIndexOfReleaseTimeZone);
            }
            final String _tmpFirstRelease;
            if (_cursor.isNull(_cursorIndexOfFirstRelease)) {
              _tmpFirstRelease = null;
            } else {
              _tmpFirstRelease = _cursor.getString(_cursorIndexOfFirstRelease);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final String _tmpNetwork;
            if (_cursor.isNull(_cursorIndexOfNetwork)) {
              _tmpNetwork = null;
            } else {
              _tmpNetwork = _cursor.getString(_cursorIndexOfNetwork);
            }
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
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
            final Integer _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
            }
            final Integer _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            }
            final String _tmpContentRating;
            if (_cursor.isNull(_cursorIndexOfContentRating)) {
              _tmpContentRating = null;
            } else {
              _tmpContentRating = _cursor.getString(_cursorIndexOfContentRating);
            }
            final String _tmpNextEpisode;
            if (_cursor.isNull(_cursorIndexOfNextEpisode)) {
              _tmpNextEpisode = null;
            } else {
              _tmpNextEpisode = _cursor.getString(_cursorIndexOfNextEpisode);
            }
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final String _tmpPosterSmall;
            if (_cursor.isNull(_cursorIndexOfPosterSmall)) {
              _tmpPosterSmall = null;
            } else {
              _tmpPosterSmall = _cursor.getString(_cursorIndexOfPosterSmall);
            }
            final Long _tmpNextAirdateMs;
            if (_cursor.isNull(_cursorIndexOfNextAirdateMs)) {
              _tmpNextAirdateMs = null;
            } else {
              _tmpNextAirdateMs = _cursor.getLong(_cursorIndexOfNextAirdateMs);
            }
            final String _tmpNextText;
            if (_cursor.isNull(_cursorIndexOfNextText)) {
              _tmpNextText = null;
            } else {
              _tmpNextText = _cursor.getString(_cursorIndexOfNextText);
            }
            final long _tmpLastUpdatedMs;
            _tmpLastUpdatedMs = _cursor.getLong(_cursorIndexOfLastUpdatedMs);
            final long _tmpLastEditedSec;
            _tmpLastEditedSec = _cursor.getLong(_cursorIndexOfLastEditedSec);
            final long _tmpLastWatchedEpisodeId;
            _tmpLastWatchedEpisodeId = _cursor.getLong(_cursorIndexOfLastWatchedEpisodeId);
            final long _tmpLastWatchedMs;
            _tmpLastWatchedMs = _cursor.getLong(_cursorIndexOfLastWatchedMs);
            final String _tmpLanguage;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmpLanguage = null;
            } else {
              _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            }
            final int _tmpUnwatchedCount;
            _tmpUnwatchedCount = _cursor.getInt(_cursorIndexOfUnwatchedCount);
            final boolean _tmpFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFavorite);
            _tmpFavorite = _tmp != 0;
            final boolean _tmpHidden;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfHidden);
            _tmpHidden = _tmp_1 != 0;
            final boolean _tmpNotify;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfNotify);
            _tmpNotify = _tmp_2 != 0;
            final boolean _tmpHexagonMergeComplete;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfHexagonMergeComplete);
            _tmpHexagonMergeComplete = _tmp_3 != 0;
            _result = new SgShow2(_tmpId,_tmpTmdbId,_tmpTvdbId,_tmpSlug,_tmpTraktId,_tmpTitle,_tmpTitleNoArticle,_tmpOverview,_tmpReleaseTime,_tmpReleaseWeekDay,_tmpReleaseCountry,_tmpReleaseTimeZone,_tmpFirstRelease,_tmpGenres,_tmpNetwork,_tmpImdbId,_tmpRatingGlobal,_tmpRatingVotes,_tmpRatingUser,_tmpRuntime,_tmpStatus,_tmpContentRating,_tmpNextEpisode,_tmpPoster,_tmpPosterSmall,_tmpNextAirdateMs,_tmpNextText,_tmpLastUpdatedMs,_tmpLastEditedSec,_tmpLastWatchedEpisodeId,_tmpLastWatchedMs,_tmpLanguage,_tmpUnwatchedCount,_tmpFavorite,_tmpHidden,_tmpNotify,_tmpHexagonMergeComplete);
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
  public SgShow2Minimal getShowMinimal(final long id) {
    final String _sql = "SELECT _id, series_tmdb_id, series_tvdb_id, series_title, series_poster_small FROM sg_show WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTmdbId = 1;
      final int _cursorIndexOfTvdbId = 2;
      final int _cursorIndexOfTitle = 3;
      final int _cursorIndexOfPosterSmall = 4;
      final SgShow2Minimal _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
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
        final String _tmpPosterSmall;
        if (_cursor.isNull(_cursorIndexOfPosterSmall)) {
          _tmpPosterSmall = null;
        } else {
          _tmpPosterSmall = _cursor.getString(_cursorIndexOfPosterSmall);
        }
        _result = new SgShow2Minimal(_tmpId,_tmpTmdbId,_tmpTvdbId,_tmpTitle,_tmpPosterSmall);
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
  public List<SgShow2Minimal> getShowsMinimal() {
    final String _sql = "SELECT _id, series_tmdb_id, series_tvdb_id, series_title, series_poster_small FROM sg_show";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTmdbId = 1;
      final int _cursorIndexOfTvdbId = 2;
      final int _cursorIndexOfTitle = 3;
      final int _cursorIndexOfPosterSmall = 4;
      final List<SgShow2Minimal> _result = new ArrayList<SgShow2Minimal>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2Minimal _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
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
        final String _tmpPosterSmall;
        if (_cursor.isNull(_cursorIndexOfPosterSmall)) {
          _tmpPosterSmall = null;
        } else {
          _tmpPosterSmall = _cursor.getString(_cursorIndexOfPosterSmall);
        }
        _item = new SgShow2Minimal(_tmpId,_tmpTmdbId,_tmpTvdbId,_tmpTitle,_tmpPosterSmall);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getShowIds(final long id, final Continuation<? super SgShow2Ids> continuation) {
    final String _sql = "SELECT _id, series_tmdb_id, series_tvdb_id FROM sg_show WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<SgShow2Ids>() {
      @Override
      public SgShow2Ids call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfTmdbId = 1;
          final int _cursorIndexOfTvdbId = 2;
          final SgShow2Ids _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            _result = new SgShow2Ids(_tmpId,_tmpTmdbId,_tmpTvdbId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public List<SgShow2Ids> getShowIds() {
    final String _sql = "SELECT _id, series_tmdb_id, series_tvdb_id FROM sg_show";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTmdbId = 1;
      final int _cursorIndexOfTvdbId = 2;
      final List<SgShow2Ids> _result = new ArrayList<SgShow2Ids>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2Ids _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
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
        _item = new SgShow2Ids(_tmpId,_tmpTmdbId,_tmpTvdbId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Long> getShowIdsLong() {
    final String _sql = "SELECT _id FROM sg_show";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<Long> _result = new ArrayList<Long>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Long _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getLong(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgShow2UpdateInfo> getShowsUpdateInfo() {
    final String _sql = "SELECT _id, series_lastupdate, series_airsdayofweek FROM sg_show";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfLastUpdatedMs = 1;
      final int _cursorIndexOfReleaseWeekDay = 2;
      final List<SgShow2UpdateInfo> _result = new ArrayList<SgShow2UpdateInfo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2UpdateInfo _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpLastUpdatedMs;
        _tmpLastUpdatedMs = _cursor.getLong(_cursorIndexOfLastUpdatedMs);
        final int _tmpReleaseWeekDay;
        _tmpReleaseWeekDay = _cursor.getInt(_cursorIndexOfReleaseWeekDay);
        _item = new SgShow2UpdateInfo(_tmpId,_tmpLastUpdatedMs,_tmpReleaseWeekDay);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getShowIdByTmdbId(final int tmdbId) {
    final String _sql = "SELECT _id FROM sg_show WHERE series_tmdb_id=?";
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
  public long getShowIdByTvdbId(final int tvdbId) {
    final String _sql = "SELECT _id FROM sg_show WHERE series_tvdb_id=?";
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
  public long getShowIdByTvdbIdWithNullTmdbId(final int tvdbId) {
    final String _sql = "SELECT _id FROM sg_show WHERE series_tvdb_id=? AND series_tmdb_id IS NULL";
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
  public int getShowTraktId(final long id) {
    final String _sql = "SELECT series_trakt_id FROM sg_show WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
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
  public int getShowTmdbId(final long id) {
    final String _sql = "SELECT series_tmdb_id FROM sg_show WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
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
  public int getShowTmdbIdByTvdbId(final int showTvdbId) {
    final String _sql = "SELECT series_tmdb_id FROM sg_show WHERE series_tvdb_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showTvdbId);
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
  public int getShowTvdbId(final long id) {
    final String _sql = "SELECT series_tvdb_id FROM sg_show WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
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
  public String getShowTitle(final long id) {
    final String _sql = "SELECT series_title FROM sg_show WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
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
  public long getShowLastWatchedEpisodeId(final long id) {
    final String _sql = "SELECT series_lastwatchedid FROM sg_show WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
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
  public List<SgShow2> getShowsForExport() {
    final String _sql = "SELECT * FROM sg_show ORDER BY series_title COLLATE UNICODE ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tmdb_id");
      final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tvdb_id");
      final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "series_slug");
      final int _cursorIndexOfTraktId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_trakt_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "series_title");
      final int _cursorIndexOfTitleNoArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "series_title_noarticle");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "series_overview");
      final int _cursorIndexOfReleaseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "series_airstime");
      final int _cursorIndexOfReleaseWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "series_airsdayofweek");
      final int _cursorIndexOfReleaseCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "series_country");
      final int _cursorIndexOfReleaseTimeZone = CursorUtil.getColumnIndexOrThrow(_cursor, "series_timezone");
      final int _cursorIndexOfFirstRelease = CursorUtil.getColumnIndexOrThrow(_cursor, "series_firstaired");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "series_genres");
      final int _cursorIndexOfNetwork = CursorUtil.getColumnIndexOrThrow(_cursor, "series_network");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_imdbid");
      final int _cursorIndexOfRatingGlobal = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating");
      final int _cursorIndexOfRatingVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating_votes");
      final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "series_rating_user");
      final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "series_runtime");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "series_status");
      final int _cursorIndexOfContentRating = CursorUtil.getColumnIndexOrThrow(_cursor, "series_contentrating");
      final int _cursorIndexOfNextEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "series_next");
      final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "series_poster");
      final int _cursorIndexOfPosterSmall = CursorUtil.getColumnIndexOrThrow(_cursor, "series_poster_small");
      final int _cursorIndexOfNextAirdateMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_nextairdate");
      final int _cursorIndexOfNextText = CursorUtil.getColumnIndexOrThrow(_cursor, "series_nexttext");
      final int _cursorIndexOfLastUpdatedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastupdate");
      final int _cursorIndexOfLastEditedSec = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastedit");
      final int _cursorIndexOfLastWatchedEpisodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastwatchedid");
      final int _cursorIndexOfLastWatchedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "series_lastwatched_ms");
      final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "series_language");
      final int _cursorIndexOfUnwatchedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "series_unwatched_count");
      final int _cursorIndexOfFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "series_favorite");
      final int _cursorIndexOfHidden = CursorUtil.getColumnIndexOrThrow(_cursor, "series_hidden");
      final int _cursorIndexOfNotify = CursorUtil.getColumnIndexOrThrow(_cursor, "series_notify");
      final int _cursorIndexOfHexagonMergeComplete = CursorUtil.getColumnIndexOrThrow(_cursor, "series_syncenabled");
      final List<SgShow2> _result = new ArrayList<SgShow2>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2 _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
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
        final String _tmpSlug;
        if (_cursor.isNull(_cursorIndexOfSlug)) {
          _tmpSlug = null;
        } else {
          _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
        }
        final Integer _tmpTraktId;
        if (_cursor.isNull(_cursorIndexOfTraktId)) {
          _tmpTraktId = null;
        } else {
          _tmpTraktId = _cursor.getInt(_cursorIndexOfTraktId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpTitleNoArticle;
        if (_cursor.isNull(_cursorIndexOfTitleNoArticle)) {
          _tmpTitleNoArticle = null;
        } else {
          _tmpTitleNoArticle = _cursor.getString(_cursorIndexOfTitleNoArticle);
        }
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final Integer _tmpReleaseTime;
        if (_cursor.isNull(_cursorIndexOfReleaseTime)) {
          _tmpReleaseTime = null;
        } else {
          _tmpReleaseTime = _cursor.getInt(_cursorIndexOfReleaseTime);
        }
        final Integer _tmpReleaseWeekDay;
        if (_cursor.isNull(_cursorIndexOfReleaseWeekDay)) {
          _tmpReleaseWeekDay = null;
        } else {
          _tmpReleaseWeekDay = _cursor.getInt(_cursorIndexOfReleaseWeekDay);
        }
        final String _tmpReleaseCountry;
        if (_cursor.isNull(_cursorIndexOfReleaseCountry)) {
          _tmpReleaseCountry = null;
        } else {
          _tmpReleaseCountry = _cursor.getString(_cursorIndexOfReleaseCountry);
        }
        final String _tmpReleaseTimeZone;
        if (_cursor.isNull(_cursorIndexOfReleaseTimeZone)) {
          _tmpReleaseTimeZone = null;
        } else {
          _tmpReleaseTimeZone = _cursor.getString(_cursorIndexOfReleaseTimeZone);
        }
        final String _tmpFirstRelease;
        if (_cursor.isNull(_cursorIndexOfFirstRelease)) {
          _tmpFirstRelease = null;
        } else {
          _tmpFirstRelease = _cursor.getString(_cursorIndexOfFirstRelease);
        }
        final String _tmpGenres;
        if (_cursor.isNull(_cursorIndexOfGenres)) {
          _tmpGenres = null;
        } else {
          _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
        }
        final String _tmpNetwork;
        if (_cursor.isNull(_cursorIndexOfNetwork)) {
          _tmpNetwork = null;
        } else {
          _tmpNetwork = _cursor.getString(_cursorIndexOfNetwork);
        }
        final String _tmpImdbId;
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _tmpImdbId = null;
        } else {
          _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
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
        final Integer _tmpRuntime;
        if (_cursor.isNull(_cursorIndexOfRuntime)) {
          _tmpRuntime = null;
        } else {
          _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
        }
        final Integer _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        }
        final String _tmpContentRating;
        if (_cursor.isNull(_cursorIndexOfContentRating)) {
          _tmpContentRating = null;
        } else {
          _tmpContentRating = _cursor.getString(_cursorIndexOfContentRating);
        }
        final String _tmpNextEpisode;
        if (_cursor.isNull(_cursorIndexOfNextEpisode)) {
          _tmpNextEpisode = null;
        } else {
          _tmpNextEpisode = _cursor.getString(_cursorIndexOfNextEpisode);
        }
        final String _tmpPoster;
        if (_cursor.isNull(_cursorIndexOfPoster)) {
          _tmpPoster = null;
        } else {
          _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
        }
        final String _tmpPosterSmall;
        if (_cursor.isNull(_cursorIndexOfPosterSmall)) {
          _tmpPosterSmall = null;
        } else {
          _tmpPosterSmall = _cursor.getString(_cursorIndexOfPosterSmall);
        }
        final Long _tmpNextAirdateMs;
        if (_cursor.isNull(_cursorIndexOfNextAirdateMs)) {
          _tmpNextAirdateMs = null;
        } else {
          _tmpNextAirdateMs = _cursor.getLong(_cursorIndexOfNextAirdateMs);
        }
        final String _tmpNextText;
        if (_cursor.isNull(_cursorIndexOfNextText)) {
          _tmpNextText = null;
        } else {
          _tmpNextText = _cursor.getString(_cursorIndexOfNextText);
        }
        final long _tmpLastUpdatedMs;
        _tmpLastUpdatedMs = _cursor.getLong(_cursorIndexOfLastUpdatedMs);
        final long _tmpLastEditedSec;
        _tmpLastEditedSec = _cursor.getLong(_cursorIndexOfLastEditedSec);
        final long _tmpLastWatchedEpisodeId;
        _tmpLastWatchedEpisodeId = _cursor.getLong(_cursorIndexOfLastWatchedEpisodeId);
        final long _tmpLastWatchedMs;
        _tmpLastWatchedMs = _cursor.getLong(_cursorIndexOfLastWatchedMs);
        final String _tmpLanguage;
        if (_cursor.isNull(_cursorIndexOfLanguage)) {
          _tmpLanguage = null;
        } else {
          _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
        }
        final int _tmpUnwatchedCount;
        _tmpUnwatchedCount = _cursor.getInt(_cursorIndexOfUnwatchedCount);
        final boolean _tmpFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFavorite);
        _tmpFavorite = _tmp != 0;
        final boolean _tmpHidden;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfHidden);
        _tmpHidden = _tmp_1 != 0;
        final boolean _tmpNotify;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfNotify);
        _tmpNotify = _tmp_2 != 0;
        final boolean _tmpHexagonMergeComplete;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfHexagonMergeComplete);
        _tmpHexagonMergeComplete = _tmp_3 != 0;
        _item = new SgShow2(_tmpId,_tmpTmdbId,_tmpTvdbId,_tmpSlug,_tmpTraktId,_tmpTitle,_tmpTitleNoArticle,_tmpOverview,_tmpReleaseTime,_tmpReleaseWeekDay,_tmpReleaseCountry,_tmpReleaseTimeZone,_tmpFirstRelease,_tmpGenres,_tmpNetwork,_tmpImdbId,_tmpRatingGlobal,_tmpRatingVotes,_tmpRatingUser,_tmpRuntime,_tmpStatus,_tmpContentRating,_tmpNextEpisode,_tmpPoster,_tmpPosterSmall,_tmpNextAirdateMs,_tmpNextText,_tmpLastUpdatedMs,_tmpLastEditedSec,_tmpLastWatchedEpisodeId,_tmpLastWatchedMs,_tmpLanguage,_tmpUnwatchedCount,_tmpFavorite,_tmpHidden,_tmpNotify,_tmpHexagonMergeComplete);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgShow2LastWatchedEpisode getShowWithLastWatchedEpisode(final long id) {
    final String _sql = "SELECT sg_show._id, series_lastwatchedid, episode_number, episode_season_number, episode_firstairedms, episode_title, episode_plays FROM sg_show LEFT OUTER JOIN sg_episode ON series_lastwatchedid = sg_episode._id WHERE sg_show._id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfLastWatchedEpisodeId = 1;
      final int _cursorIndexOfEpisodeNumber = 2;
      final int _cursorIndexOfSeasonNumber = 3;
      final int _cursorIndexOfEpisodeReleaseDateMs = 4;
      final int _cursorIndexOfEpisodeTitle = 5;
      final int _cursorIndexOfEpisodePlays = 6;
      final SgShow2LastWatchedEpisode _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpLastWatchedEpisodeId;
        _tmpLastWatchedEpisodeId = _cursor.getLong(_cursorIndexOfLastWatchedEpisodeId);
        final Integer _tmpEpisodeNumber;
        if (_cursor.isNull(_cursorIndexOfEpisodeNumber)) {
          _tmpEpisodeNumber = null;
        } else {
          _tmpEpisodeNumber = _cursor.getInt(_cursorIndexOfEpisodeNumber);
        }
        final Integer _tmpSeasonNumber;
        if (_cursor.isNull(_cursorIndexOfSeasonNumber)) {
          _tmpSeasonNumber = null;
        } else {
          _tmpSeasonNumber = _cursor.getInt(_cursorIndexOfSeasonNumber);
        }
        final Long _tmpEpisodeReleaseDateMs;
        if (_cursor.isNull(_cursorIndexOfEpisodeReleaseDateMs)) {
          _tmpEpisodeReleaseDateMs = null;
        } else {
          _tmpEpisodeReleaseDateMs = _cursor.getLong(_cursorIndexOfEpisodeReleaseDateMs);
        }
        final String _tmpEpisodeTitle;
        if (_cursor.isNull(_cursorIndexOfEpisodeTitle)) {
          _tmpEpisodeTitle = null;
        } else {
          _tmpEpisodeTitle = _cursor.getString(_cursorIndexOfEpisodeTitle);
        }
        final Integer _tmpEpisodePlays;
        if (_cursor.isNull(_cursorIndexOfEpisodePlays)) {
          _tmpEpisodePlays = null;
        } else {
          _tmpEpisodePlays = _cursor.getInt(_cursorIndexOfEpisodePlays);
        }
        _result = new SgShow2LastWatchedEpisode(_tmpId,_tmpLastWatchedEpisodeId,_tmpEpisodeNumber,_tmpSeasonNumber,_tmpEpisodeReleaseDateMs,_tmpEpisodeTitle,_tmpEpisodePlays);
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
  public List<SgShow2LastWatchedEpisode> getShowsWithLastWatchedEpisode() {
    final String _sql = "SELECT sg_show._id, series_lastwatchedid, episode_number, episode_season_number, episode_firstairedms, episode_title, episode_plays FROM sg_show LEFT OUTER JOIN sg_episode ON series_lastwatchedid = sg_episode._id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfLastWatchedEpisodeId = 1;
      final int _cursorIndexOfEpisodeNumber = 2;
      final int _cursorIndexOfSeasonNumber = 3;
      final int _cursorIndexOfEpisodeReleaseDateMs = 4;
      final int _cursorIndexOfEpisodeTitle = 5;
      final int _cursorIndexOfEpisodePlays = 6;
      final List<SgShow2LastWatchedEpisode> _result = new ArrayList<SgShow2LastWatchedEpisode>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2LastWatchedEpisode _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpLastWatchedEpisodeId;
        _tmpLastWatchedEpisodeId = _cursor.getLong(_cursorIndexOfLastWatchedEpisodeId);
        final Integer _tmpEpisodeNumber;
        if (_cursor.isNull(_cursorIndexOfEpisodeNumber)) {
          _tmpEpisodeNumber = null;
        } else {
          _tmpEpisodeNumber = _cursor.getInt(_cursorIndexOfEpisodeNumber);
        }
        final Integer _tmpSeasonNumber;
        if (_cursor.isNull(_cursorIndexOfSeasonNumber)) {
          _tmpSeasonNumber = null;
        } else {
          _tmpSeasonNumber = _cursor.getInt(_cursorIndexOfSeasonNumber);
        }
        final Long _tmpEpisodeReleaseDateMs;
        if (_cursor.isNull(_cursorIndexOfEpisodeReleaseDateMs)) {
          _tmpEpisodeReleaseDateMs = null;
        } else {
          _tmpEpisodeReleaseDateMs = _cursor.getLong(_cursorIndexOfEpisodeReleaseDateMs);
        }
        final String _tmpEpisodeTitle;
        if (_cursor.isNull(_cursorIndexOfEpisodeTitle)) {
          _tmpEpisodeTitle = null;
        } else {
          _tmpEpisodeTitle = _cursor.getString(_cursorIndexOfEpisodeTitle);
        }
        final Integer _tmpEpisodePlays;
        if (_cursor.isNull(_cursorIndexOfEpisodePlays)) {
          _tmpEpisodePlays = null;
        } else {
          _tmpEpisodePlays = _cursor.getInt(_cursorIndexOfEpisodePlays);
        }
        _item = new SgShow2LastWatchedEpisode(_tmpId,_tmpLastWatchedEpisodeId,_tmpEpisodeNumber,_tmpSeasonNumber,_tmpEpisodeReleaseDateMs,_tmpEpisodeTitle,_tmpEpisodePlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgShow2Stats> getStats() {
    final String _sql = "SELECT _id, series_status, series_next, series_runtime FROM sg_show";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfStatus = 1;
      final int _cursorIndexOfNextEpisode = 2;
      final int _cursorIndexOfRuntime = 3;
      final List<SgShow2Stats> _result = new ArrayList<SgShow2Stats>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2Stats _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        final String _tmpNextEpisode;
        if (_cursor.isNull(_cursorIndexOfNextEpisode)) {
          _tmpNextEpisode = null;
        } else {
          _tmpNextEpisode = _cursor.getString(_cursorIndexOfNextEpisode);
        }
        final int _tmpRuntime;
        _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
        _item = new SgShow2Stats(_tmpId,_tmpStatus,_tmpNextEpisode,_tmpRuntime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countShowsFinishedWatching() {
    final String _sql = "SELECT count(series_id) FROM (SELECT series_id, series_status, sum(case when episode_watched = '0' then 1 else 0 end) as episodes_unwatched FROM sg_episode LEFT OUTER JOIN sg_show ON sg_episode.series_id = sg_show._id GROUP BY series_id) WHERE episodes_unwatched = 0 AND series_status IN (0, -2)";
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
  public int countShowsFinishedWatchingWithoutSpecials() {
    final String _sql = "SELECT count(series_id) FROM (SELECT series_id, series_status, sum(case when episode_watched = '0' then 1 else 0 end) as episodes_unwatched FROM sg_episode LEFT OUTER JOIN sg_show ON sg_episode.series_id = sg_show._id WHERE episode_season_number != 0 GROUP BY series_id) WHERE episodes_unwatched = 0 AND series_status IN (0, -2)";
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
  public int countShowsNotifyEnabled() {
    final String _sql = "SELECT count(_id) FROM sg_show WHERE series_notify = 1";
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
  public int countHiddenShows() {
    final String _sql = "SELECT count(_id) FROM sg_show WHERE series_hidden=1";
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
  public List<Integer> getHiddenShowsTmdbIds() {
    final String _sql = "SELECT series_tmdb_id FROM sg_show WHERE series_hidden = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<Integer> _result = new ArrayList<Integer>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Integer _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getInt(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getLanguage(final long id) {
    final String _sql = "SELECT series_language FROM sg_show WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
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
  public List<SgShow2Ids> getHexagonMergeNotCompleted() {
    final String _sql = "SELECT _id, series_tmdb_id, series_tvdb_id FROM sg_show WHERE series_syncenabled = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTmdbId = 1;
      final int _cursorIndexOfTvdbId = 2;
      final List<SgShow2Ids> _result = new ArrayList<SgShow2Ids>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2Ids _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
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
        _item = new SgShow2Ids(_tmpId,_tmpTmdbId,_tmpTvdbId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgShow2CloudUpdate getForCloudUpdate(final long id) {
    final String _sql = "SELECT _id, series_tmdb_id, series_language, series_favorite, series_hidden, series_notify FROM sg_show WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTmdbId = 1;
      final int _cursorIndexOfLanguage = 2;
      final int _cursorIndexOfFavorite = 3;
      final int _cursorIndexOfHidden = 4;
      final int _cursorIndexOfNotify = 5;
      final SgShow2CloudUpdate _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Integer _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        }
        final String _tmpLanguage;
        if (_cursor.isNull(_cursorIndexOfLanguage)) {
          _tmpLanguage = null;
        } else {
          _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
        }
        final boolean _tmpFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFavorite);
        _tmpFavorite = _tmp != 0;
        final boolean _tmpHidden;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfHidden);
        _tmpHidden = _tmp_1 != 0;
        final boolean _tmpNotify;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfNotify);
        _tmpNotify = _tmp_2 != 0;
        _result = new SgShow2CloudUpdate(_tmpId,_tmpTmdbId,_tmpLanguage,_tmpFavorite,_tmpHidden,_tmpNotify);
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
  public List<SgShow2CloudUpdate> getForCloudUpdate() {
    final String _sql = "SELECT _id, series_tmdb_id, series_language, series_favorite, series_hidden, series_notify FROM sg_show";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTmdbId = 1;
      final int _cursorIndexOfLanguage = 2;
      final int _cursorIndexOfFavorite = 3;
      final int _cursorIndexOfHidden = 4;
      final int _cursorIndexOfNotify = 5;
      final List<SgShow2CloudUpdate> _result = new ArrayList<SgShow2CloudUpdate>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2CloudUpdate _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Integer _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        }
        final String _tmpLanguage;
        if (_cursor.isNull(_cursorIndexOfLanguage)) {
          _tmpLanguage = null;
        } else {
          _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
        }
        final boolean _tmpFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFavorite);
        _tmpFavorite = _tmp != 0;
        final boolean _tmpHidden;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfHidden);
        _tmpHidden = _tmp_1 != 0;
        final boolean _tmpNotify;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfNotify);
        _tmpNotify = _tmp_2 != 0;
        _item = new SgShow2CloudUpdate(_tmpId,_tmpTmdbId,_tmpLanguage,_tmpFavorite,_tmpHidden,_tmpNotify);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Long getLastUpdated(final long id) {
    final String _sql = "SELECT series_lastupdate FROM sg_show WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Long _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getLong(0);
        }
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
  public List<SgShow2ForLists> getShows(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
      final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndex(_cursor, "series_tvdb_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "series_title");
      final int _cursorIndexOfReleaseTime = CursorUtil.getColumnIndex(_cursor, "series_airstime");
      final int _cursorIndexOfReleaseWeekDay = CursorUtil.getColumnIndex(_cursor, "series_airsdayofweek");
      final int _cursorIndexOfReleaseCountry = CursorUtil.getColumnIndex(_cursor, "series_country");
      final int _cursorIndexOfReleaseTimeZone = CursorUtil.getColumnIndex(_cursor, "series_timezone");
      final int _cursorIndexOfNetwork = CursorUtil.getColumnIndex(_cursor, "series_network");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndex(_cursor, "series_status");
      final int _cursorIndexOfNextEpisode = CursorUtil.getColumnIndex(_cursor, "series_next");
      final int _cursorIndexOfPoster = CursorUtil.getColumnIndex(_cursor, "series_poster");
      final int _cursorIndexOfPosterSmall = CursorUtil.getColumnIndex(_cursor, "series_poster_small");
      final int _cursorIndexOfNextAirdateMs = CursorUtil.getColumnIndex(_cursor, "series_nextairdate");
      final int _cursorIndexOfNextText = CursorUtil.getColumnIndex(_cursor, "series_nexttext");
      final int _cursorIndexOfUnwatchedCount = CursorUtil.getColumnIndex(_cursor, "series_unwatched_count");
      final int _cursorIndexOfFavorite = CursorUtil.getColumnIndex(_cursor, "series_favorite");
      final int _cursorIndexOfHidden = CursorUtil.getColumnIndex(_cursor, "series_hidden");
      final List<SgShow2ForLists> _result = new ArrayList<SgShow2ForLists>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgShow2ForLists _item;
        final long _tmpId;
        if (_cursorIndexOfId == -1) {
          _tmpId = 0;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final Integer _tmpTvdbId;
        if (_cursorIndexOfTvdbId == -1) {
          _tmpTvdbId = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfTvdbId)) {
            _tmpTvdbId = null;
          } else {
            _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
          }
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
        final int _tmpReleaseTime;
        if (_cursorIndexOfReleaseTime == -1) {
          _tmpReleaseTime = 0;
        } else {
          _tmpReleaseTime = _cursor.getInt(_cursorIndexOfReleaseTime);
        }
        final int _tmpReleaseWeekDay;
        if (_cursorIndexOfReleaseWeekDay == -1) {
          _tmpReleaseWeekDay = 0;
        } else {
          _tmpReleaseWeekDay = _cursor.getInt(_cursorIndexOfReleaseWeekDay);
        }
        final String _tmpReleaseCountry;
        if (_cursorIndexOfReleaseCountry == -1) {
          _tmpReleaseCountry = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfReleaseCountry)) {
            _tmpReleaseCountry = null;
          } else {
            _tmpReleaseCountry = _cursor.getString(_cursorIndexOfReleaseCountry);
          }
        }
        final String _tmpReleaseTimeZone;
        if (_cursorIndexOfReleaseTimeZone == -1) {
          _tmpReleaseTimeZone = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfReleaseTimeZone)) {
            _tmpReleaseTimeZone = null;
          } else {
            _tmpReleaseTimeZone = _cursor.getString(_cursorIndexOfReleaseTimeZone);
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
        final Integer _tmpStatus;
        if (_cursorIndexOfStatus == -1) {
          _tmpStatus = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
          }
        }
        final String _tmpNextEpisode;
        if (_cursorIndexOfNextEpisode == -1) {
          _tmpNextEpisode = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfNextEpisode)) {
            _tmpNextEpisode = null;
          } else {
            _tmpNextEpisode = _cursor.getString(_cursorIndexOfNextEpisode);
          }
        }
        final String _tmpPoster;
        if (_cursorIndexOfPoster == -1) {
          _tmpPoster = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfPoster)) {
            _tmpPoster = null;
          } else {
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
          }
        }
        final String _tmpPosterSmall;
        if (_cursorIndexOfPosterSmall == -1) {
          _tmpPosterSmall = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfPosterSmall)) {
            _tmpPosterSmall = null;
          } else {
            _tmpPosterSmall = _cursor.getString(_cursorIndexOfPosterSmall);
          }
        }
        final long _tmpNextAirdateMs;
        if (_cursorIndexOfNextAirdateMs == -1) {
          _tmpNextAirdateMs = 0;
        } else {
          _tmpNextAirdateMs = _cursor.getLong(_cursorIndexOfNextAirdateMs);
        }
        final String _tmpNextText;
        if (_cursorIndexOfNextText == -1) {
          _tmpNextText = null;
        } else {
          if (_cursor.isNull(_cursorIndexOfNextText)) {
            _tmpNextText = null;
          } else {
            _tmpNextText = _cursor.getString(_cursorIndexOfNextText);
          }
        }
        final int _tmpUnwatchedCount;
        if (_cursorIndexOfUnwatchedCount == -1) {
          _tmpUnwatchedCount = 0;
        } else {
          _tmpUnwatchedCount = _cursor.getInt(_cursorIndexOfUnwatchedCount);
        }
        final boolean _tmpFavorite;
        if (_cursorIndexOfFavorite == -1) {
          _tmpFavorite = false;
        } else {
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfFavorite);
          _tmpFavorite = _tmp != 0;
        }
        final boolean _tmpHidden;
        if (_cursorIndexOfHidden == -1) {
          _tmpHidden = false;
        } else {
          final int _tmp_1;
          _tmp_1 = _cursor.getInt(_cursorIndexOfHidden);
          _tmpHidden = _tmp_1 != 0;
        }
        _item = new SgShow2ForLists(_tmpId,_tmpTvdbId,_tmpTitle,_tmpReleaseTime,_tmpReleaseWeekDay,_tmpReleaseCountry,_tmpReleaseTimeZone,_tmpNetwork,_tmpStatus,_tmpNextEpisode,_tmpPoster,_tmpPosterSmall,_tmpNextAirdateMs,_tmpNextText,_tmpUnwatchedCount,_tmpFavorite,_tmpHidden);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public LiveData<List<SgShow2ForLists>> getShowsLiveData(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_show"}, false, new Callable<List<SgShow2ForLists>>() {
      @Override
      public List<SgShow2ForLists> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
          final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndex(_cursor, "series_tvdb_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "series_title");
          final int _cursorIndexOfReleaseTime = CursorUtil.getColumnIndex(_cursor, "series_airstime");
          final int _cursorIndexOfReleaseWeekDay = CursorUtil.getColumnIndex(_cursor, "series_airsdayofweek");
          final int _cursorIndexOfReleaseCountry = CursorUtil.getColumnIndex(_cursor, "series_country");
          final int _cursorIndexOfReleaseTimeZone = CursorUtil.getColumnIndex(_cursor, "series_timezone");
          final int _cursorIndexOfNetwork = CursorUtil.getColumnIndex(_cursor, "series_network");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndex(_cursor, "series_status");
          final int _cursorIndexOfNextEpisode = CursorUtil.getColumnIndex(_cursor, "series_next");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndex(_cursor, "series_poster");
          final int _cursorIndexOfPosterSmall = CursorUtil.getColumnIndex(_cursor, "series_poster_small");
          final int _cursorIndexOfNextAirdateMs = CursorUtil.getColumnIndex(_cursor, "series_nextairdate");
          final int _cursorIndexOfNextText = CursorUtil.getColumnIndex(_cursor, "series_nexttext");
          final int _cursorIndexOfUnwatchedCount = CursorUtil.getColumnIndex(_cursor, "series_unwatched_count");
          final int _cursorIndexOfFavorite = CursorUtil.getColumnIndex(_cursor, "series_favorite");
          final int _cursorIndexOfHidden = CursorUtil.getColumnIndex(_cursor, "series_hidden");
          final List<SgShow2ForLists> _result = new ArrayList<SgShow2ForLists>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgShow2ForLists _item;
            final long _tmpId;
            if (_cursorIndexOfId == -1) {
              _tmpId = 0;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final Integer _tmpTvdbId;
            if (_cursorIndexOfTvdbId == -1) {
              _tmpTvdbId = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfTvdbId)) {
                _tmpTvdbId = null;
              } else {
                _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
              }
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
            final int _tmpReleaseTime;
            if (_cursorIndexOfReleaseTime == -1) {
              _tmpReleaseTime = 0;
            } else {
              _tmpReleaseTime = _cursor.getInt(_cursorIndexOfReleaseTime);
            }
            final int _tmpReleaseWeekDay;
            if (_cursorIndexOfReleaseWeekDay == -1) {
              _tmpReleaseWeekDay = 0;
            } else {
              _tmpReleaseWeekDay = _cursor.getInt(_cursorIndexOfReleaseWeekDay);
            }
            final String _tmpReleaseCountry;
            if (_cursorIndexOfReleaseCountry == -1) {
              _tmpReleaseCountry = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfReleaseCountry)) {
                _tmpReleaseCountry = null;
              } else {
                _tmpReleaseCountry = _cursor.getString(_cursorIndexOfReleaseCountry);
              }
            }
            final String _tmpReleaseTimeZone;
            if (_cursorIndexOfReleaseTimeZone == -1) {
              _tmpReleaseTimeZone = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfReleaseTimeZone)) {
                _tmpReleaseTimeZone = null;
              } else {
                _tmpReleaseTimeZone = _cursor.getString(_cursorIndexOfReleaseTimeZone);
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
            final Integer _tmpStatus;
            if (_cursorIndexOfStatus == -1) {
              _tmpStatus = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
              }
            }
            final String _tmpNextEpisode;
            if (_cursorIndexOfNextEpisode == -1) {
              _tmpNextEpisode = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfNextEpisode)) {
                _tmpNextEpisode = null;
              } else {
                _tmpNextEpisode = _cursor.getString(_cursorIndexOfNextEpisode);
              }
            }
            final String _tmpPoster;
            if (_cursorIndexOfPoster == -1) {
              _tmpPoster = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfPoster)) {
                _tmpPoster = null;
              } else {
                _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
              }
            }
            final String _tmpPosterSmall;
            if (_cursorIndexOfPosterSmall == -1) {
              _tmpPosterSmall = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfPosterSmall)) {
                _tmpPosterSmall = null;
              } else {
                _tmpPosterSmall = _cursor.getString(_cursorIndexOfPosterSmall);
              }
            }
            final long _tmpNextAirdateMs;
            if (_cursorIndexOfNextAirdateMs == -1) {
              _tmpNextAirdateMs = 0;
            } else {
              _tmpNextAirdateMs = _cursor.getLong(_cursorIndexOfNextAirdateMs);
            }
            final String _tmpNextText;
            if (_cursorIndexOfNextText == -1) {
              _tmpNextText = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfNextText)) {
                _tmpNextText = null;
              } else {
                _tmpNextText = _cursor.getString(_cursorIndexOfNextText);
              }
            }
            final int _tmpUnwatchedCount;
            if (_cursorIndexOfUnwatchedCount == -1) {
              _tmpUnwatchedCount = 0;
            } else {
              _tmpUnwatchedCount = _cursor.getInt(_cursorIndexOfUnwatchedCount);
            }
            final boolean _tmpFavorite;
            if (_cursorIndexOfFavorite == -1) {
              _tmpFavorite = false;
            } else {
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfFavorite);
              _tmpFavorite = _tmp != 0;
            }
            final boolean _tmpHidden;
            if (_cursorIndexOfHidden == -1) {
              _tmpHidden = false;
            } else {
              final int _tmp_1;
              _tmp_1 = _cursor.getInt(_cursorIndexOfHidden);
              _tmpHidden = _tmp_1 != 0;
            }
            _item = new SgShow2ForLists(_tmpId,_tmpTvdbId,_tmpTitle,_tmpReleaseTime,_tmpReleaseWeekDay,_tmpReleaseCountry,_tmpReleaseTimeZone,_tmpNetwork,_tmpStatus,_tmpNextEpisode,_tmpPoster,_tmpPosterSmall,_tmpNextAirdateMs,_tmpNextText,_tmpUnwatchedCount,_tmpFavorite,_tmpHidden);
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
  public LiveData<List<SgShow2Notify>> getShowsNotifyStates(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_show"}, false, new Callable<List<SgShow2Notify>>() {
      @Override
      public List<SgShow2Notify> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "series_title");
          final int _cursorIndexOfNotify = CursorUtil.getColumnIndex(_cursor, "series_notify");
          final List<SgShow2Notify> _result = new ArrayList<SgShow2Notify>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgShow2Notify _item;
            final long _tmpId;
            if (_cursorIndexOfId == -1) {
              _tmpId = 0;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            final boolean _tmpNotify;
            if (_cursorIndexOfNotify == -1) {
              _tmpNotify = false;
            } else {
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfNotify);
              _tmpNotify = _tmp != 0;
            }
            _item = new SgShow2Notify(_tmpId,_tmpTitle,_tmpNotify);
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
