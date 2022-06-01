package com.battlelancer.seriesguide.shows.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SgSeason2Helper_Impl implements SgSeason2Helper {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SgSeason2> __insertionAdapterOfSgSeason2;

  private final EntityDeletionOrUpdateAdapter<SgSeason2Update> __updateAdapterOfSgSeason2UpdateAsSgSeason2;

  private final EntityDeletionOrUpdateAdapter<SgSeason2TmdbIdUpdate> __updateAdapterOfSgSeason2TmdbIdUpdateAsSgSeason2;

  private final EntityDeletionOrUpdateAdapter<SgSeason2CountUpdate> __updateAdapterOfSgSeason2CountUpdateAsSgSeason2;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllSeasons;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSeason;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSeasonsWithoutTmdbId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSeasonsOfShow;

  public SgSeason2Helper_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSgSeason2 = new EntityInsertionAdapter<SgSeason2>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `sg_season` (`_id`,`series_id`,`season_tmdb_id`,`season_tvdb_id`,`season_number`,`season_name`,`season_order`,`season_watchcount`,`season_willaircount`,`season_noairdatecount`,`season_totalcount`,`season_tags`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgSeason2 value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getShowId());
        if (value.getTmdbId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTmdbId());
        }
        if (value.getTvdbId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTvdbId());
        }
        if (value.getNumberOrNull() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getNumberOrNull());
        }
        if (value.getName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getName());
        }
        stmt.bindLong(7, value.getOrder());
        if (value.getNotWatchedReleasedOrNull() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getNotWatchedReleasedOrNull());
        }
        if (value.getNotWatchedToBeReleasedOrNull() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getNotWatchedToBeReleasedOrNull());
        }
        if (value.getNotWatchedNoReleaseOrNull() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getNotWatchedNoReleaseOrNull());
        }
        if (value.getTotalOrNull() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getTotalOrNull());
        }
        if (value.getTags() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getTags());
        }
      }
    };
    this.__updateAdapterOfSgSeason2UpdateAsSgSeason2 = new EntityDeletionOrUpdateAdapter<SgSeason2Update>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_season` SET `_id` = ?,`season_number` = ?,`season_order` = ?,`season_name` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgSeason2Update value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getNumber());
        stmt.bindLong(3, value.getOrder());
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__updateAdapterOfSgSeason2TmdbIdUpdateAsSgSeason2 = new EntityDeletionOrUpdateAdapter<SgSeason2TmdbIdUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_season` SET `_id` = ?,`season_tmdb_id` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgSeason2TmdbIdUpdate value) {
        stmt.bindLong(1, value.getId());
        if (value.getTmdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTmdbId());
        }
        stmt.bindLong(3, value.getId());
      }
    };
    this.__updateAdapterOfSgSeason2CountUpdateAsSgSeason2 = new EntityDeletionOrUpdateAdapter<SgSeason2CountUpdate>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_season` SET `_id` = ?,`season_watchcount` = ?,`season_willaircount` = ?,`season_noairdatecount` = ?,`season_totalcount` = ?,`season_tags` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgSeason2CountUpdate value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getNotWatchedReleasedCount());
        stmt.bindLong(3, value.getNotWatchedToBeReleasedCount());
        stmt.bindLong(4, value.getNotWatchedNoReleaseCount());
        stmt.bindLong(5, value.getTotalCount());
        if (value.getTags() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTags());
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllSeasons = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_season";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSeason = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_season WHERE _id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSeasonsWithoutTmdbId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_season WHERE series_id = ? AND season_tmdb_id IS NULL";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSeasonsOfShow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sg_season WHERE series_id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insertSeason(final SgSeason2 season) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSgSeason2.insertAndReturnId(season);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long[] insertSeasons(final List<SgSeason2> seasons) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long[] _result = __insertionAdapterOfSgSeason2.insertAndReturnIdsArray(seasons);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateSeasons(final List<SgSeason2Update> seasons) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgSeason2UpdateAsSgSeason2.handleMultiple(seasons);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateTmdbIds(final List<SgSeason2TmdbIdUpdate> seasons) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSgSeason2TmdbIdUpdateAsSgSeason2.handleMultiple(seasons);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateSeasonCounters(final SgSeason2CountUpdate seasonCountUpdate) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSgSeason2CountUpdateAsSgSeason2.handle(seasonCountUpdate);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteSeasons(final List<Long> seasonIds) {
    __db.beginTransaction();
    try {
      SgSeason2Helper.DefaultImpls.deleteSeasons(SgSeason2Helper_Impl.this, seasonIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllSeasons() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllSeasons.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllSeasons.release(_stmt);
    }
  }

  @Override
  public void deleteSeason(final long seasonId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSeason.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, seasonId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSeason.release(_stmt);
    }
  }

  @Override
  public void deleteSeasonsWithoutTmdbId(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSeasonsWithoutTmdbId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSeasonsWithoutTmdbId.release(_stmt);
    }
  }

  @Override
  public int deleteSeasonsOfShow(final long showId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSeasonsOfShow.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, showId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSeasonsOfShow.release(_stmt);
    }
  }

  @Override
  public SgSeason2 getSeason(final long seasonId) {
    final String _sql = "SELECT * FROM sg_season WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tmdb_id");
      final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tvdb_id");
      final int _cursorIndexOfNumberOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_number");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "season_name");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "season_order");
      final int _cursorIndexOfNotWatchedReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_watchcount");
      final int _cursorIndexOfNotWatchedToBeReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_willaircount");
      final int _cursorIndexOfNotWatchedNoReleaseOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_noairdatecount");
      final int _cursorIndexOfTotalOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_totalcount");
      final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tags");
      final SgSeason2 _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final String _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
        }
        final Integer _tmpTvdbId;
        if (_cursor.isNull(_cursorIndexOfTvdbId)) {
          _tmpTvdbId = null;
        } else {
          _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
        }
        final Integer _tmpNumberOrNull;
        if (_cursor.isNull(_cursorIndexOfNumberOrNull)) {
          _tmpNumberOrNull = null;
        } else {
          _tmpNumberOrNull = _cursor.getInt(_cursorIndexOfNumberOrNull);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final int _tmpOrder;
        _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
        final Integer _tmpNotWatchedReleasedOrNull;
        if (_cursor.isNull(_cursorIndexOfNotWatchedReleasedOrNull)) {
          _tmpNotWatchedReleasedOrNull = null;
        } else {
          _tmpNotWatchedReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedReleasedOrNull);
        }
        final Integer _tmpNotWatchedToBeReleasedOrNull;
        if (_cursor.isNull(_cursorIndexOfNotWatchedToBeReleasedOrNull)) {
          _tmpNotWatchedToBeReleasedOrNull = null;
        } else {
          _tmpNotWatchedToBeReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedToBeReleasedOrNull);
        }
        final Integer _tmpNotWatchedNoReleaseOrNull;
        if (_cursor.isNull(_cursorIndexOfNotWatchedNoReleaseOrNull)) {
          _tmpNotWatchedNoReleaseOrNull = null;
        } else {
          _tmpNotWatchedNoReleaseOrNull = _cursor.getInt(_cursorIndexOfNotWatchedNoReleaseOrNull);
        }
        final Integer _tmpTotalOrNull;
        if (_cursor.isNull(_cursorIndexOfTotalOrNull)) {
          _tmpTotalOrNull = null;
        } else {
          _tmpTotalOrNull = _cursor.getInt(_cursorIndexOfTotalOrNull);
        }
        final String _tmpTags;
        if (_cursor.isNull(_cursorIndexOfTags)) {
          _tmpTags = null;
        } else {
          _tmpTags = _cursor.getString(_cursorIndexOfTags);
        }
        _result = new SgSeason2(_tmpId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpNumberOrNull,_tmpName,_tmpOrder,_tmpNotWatchedReleasedOrNull,_tmpNotWatchedToBeReleasedOrNull,_tmpNotWatchedNoReleaseOrNull,_tmpTotalOrNull,_tmpTags);
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
  public List<Long> getSeasonIdsOfShow(final long showId) {
    final String _sql = "SELECT _id FROM sg_season WHERE series_id = ? ORDER BY season_number DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
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
  public SgSeason2Numbers getSeasonNumbers(final long seasonId) {
    final String _sql = "SELECT _id, series_id, season_tmdb_id, season_tvdb_id, season_number FROM sg_season WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfShowId = 1;
      final int _cursorIndexOfTmdbId = 2;
      final int _cursorIndexOfTvdbId = 3;
      final int _cursorIndexOfNumberOrNull = 4;
      final SgSeason2Numbers _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final String _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
        }
        final Integer _tmpTvdbId;
        if (_cursor.isNull(_cursorIndexOfTvdbId)) {
          _tmpTvdbId = null;
        } else {
          _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
        }
        final Integer _tmpNumberOrNull;
        if (_cursor.isNull(_cursorIndexOfNumberOrNull)) {
          _tmpNumberOrNull = null;
        } else {
          _tmpNumberOrNull = _cursor.getInt(_cursorIndexOfNumberOrNull);
        }
        _result = new SgSeason2Numbers(_tmpId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpNumberOrNull);
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
  public SgSeason2Numbers getSeasonNumbersByTvdbId(final int seasonTvdbId) {
    final String _sql = "SELECT _id, series_id, season_tmdb_id, season_tvdb_id, season_number FROM sg_season WHERE season_tvdb_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, seasonTvdbId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfShowId = 1;
      final int _cursorIndexOfTmdbId = 2;
      final int _cursorIndexOfTvdbId = 3;
      final int _cursorIndexOfNumberOrNull = 4;
      final SgSeason2Numbers _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final String _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
        }
        final Integer _tmpTvdbId;
        if (_cursor.isNull(_cursorIndexOfTvdbId)) {
          _tmpTvdbId = null;
        } else {
          _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
        }
        final Integer _tmpNumberOrNull;
        if (_cursor.isNull(_cursorIndexOfNumberOrNull)) {
          _tmpNumberOrNull = null;
        } else {
          _tmpNumberOrNull = _cursor.getInt(_cursorIndexOfNumberOrNull);
        }
        _result = new SgSeason2Numbers(_tmpId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpNumberOrNull);
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
  public List<SgSeason2Numbers> getSeasonNumbersOfShow(final long showId) {
    final String _sql = "SELECT _id, series_id, season_tmdb_id, season_tvdb_id, season_number FROM sg_season WHERE series_id = ? ORDER BY season_number";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfShowId = 1;
      final int _cursorIndexOfTmdbId = 2;
      final int _cursorIndexOfTvdbId = 3;
      final int _cursorIndexOfNumberOrNull = 4;
      final List<SgSeason2Numbers> _result = new ArrayList<SgSeason2Numbers>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgSeason2Numbers _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final String _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
        }
        final Integer _tmpTvdbId;
        if (_cursor.isNull(_cursorIndexOfTvdbId)) {
          _tmpTvdbId = null;
        } else {
          _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
        }
        final Integer _tmpNumberOrNull;
        if (_cursor.isNull(_cursorIndexOfNumberOrNull)) {
          _tmpNumberOrNull = null;
        } else {
          _tmpNumberOrNull = _cursor.getInt(_cursorIndexOfNumberOrNull);
        }
        _item = new SgSeason2Numbers(_tmpId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpNumberOrNull);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<SgSeason2>> getSeasonsOfShowLatestFirst(final long showId) {
    final String _sql = "SELECT * FROM sg_season WHERE series_id = ? AND season_totalcount != 0 ORDER BY season_number DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_season"}, false, new Callable<List<SgSeason2>>() {
      @Override
      public List<SgSeason2> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tmdb_id");
          final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tvdb_id");
          final int _cursorIndexOfNumberOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_number");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "season_name");
          final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "season_order");
          final int _cursorIndexOfNotWatchedReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_watchcount");
          final int _cursorIndexOfNotWatchedToBeReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_willaircount");
          final int _cursorIndexOfNotWatchedNoReleaseOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_noairdatecount");
          final int _cursorIndexOfTotalOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_totalcount");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tags");
          final List<SgSeason2> _result = new ArrayList<SgSeason2>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgSeason2 _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpShowId;
            _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
            final String _tmpTmdbId;
            if (_cursor.isNull(_cursorIndexOfTmdbId)) {
              _tmpTmdbId = null;
            } else {
              _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
            }
            final Integer _tmpTvdbId;
            if (_cursor.isNull(_cursorIndexOfTvdbId)) {
              _tmpTvdbId = null;
            } else {
              _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
            }
            final Integer _tmpNumberOrNull;
            if (_cursor.isNull(_cursorIndexOfNumberOrNull)) {
              _tmpNumberOrNull = null;
            } else {
              _tmpNumberOrNull = _cursor.getInt(_cursorIndexOfNumberOrNull);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpOrder;
            _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
            final Integer _tmpNotWatchedReleasedOrNull;
            if (_cursor.isNull(_cursorIndexOfNotWatchedReleasedOrNull)) {
              _tmpNotWatchedReleasedOrNull = null;
            } else {
              _tmpNotWatchedReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedReleasedOrNull);
            }
            final Integer _tmpNotWatchedToBeReleasedOrNull;
            if (_cursor.isNull(_cursorIndexOfNotWatchedToBeReleasedOrNull)) {
              _tmpNotWatchedToBeReleasedOrNull = null;
            } else {
              _tmpNotWatchedToBeReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedToBeReleasedOrNull);
            }
            final Integer _tmpNotWatchedNoReleaseOrNull;
            if (_cursor.isNull(_cursorIndexOfNotWatchedNoReleaseOrNull)) {
              _tmpNotWatchedNoReleaseOrNull = null;
            } else {
              _tmpNotWatchedNoReleaseOrNull = _cursor.getInt(_cursorIndexOfNotWatchedNoReleaseOrNull);
            }
            final Integer _tmpTotalOrNull;
            if (_cursor.isNull(_cursorIndexOfTotalOrNull)) {
              _tmpTotalOrNull = null;
            } else {
              _tmpTotalOrNull = _cursor.getInt(_cursorIndexOfTotalOrNull);
            }
            final String _tmpTags;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmpTags = null;
            } else {
              _tmpTags = _cursor.getString(_cursorIndexOfTags);
            }
            _item = new SgSeason2(_tmpId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpNumberOrNull,_tmpName,_tmpOrder,_tmpNotWatchedReleasedOrNull,_tmpNotWatchedToBeReleasedOrNull,_tmpNotWatchedNoReleaseOrNull,_tmpTotalOrNull,_tmpTags);
            _result.add(_item);
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
  public LiveData<List<SgSeason2>> getSeasonsOfShowOldestFirst(final long showId) {
    final String _sql = "SELECT * FROM sg_season WHERE series_id = ? AND season_totalcount != 0 ORDER BY season_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_season"}, false, new Callable<List<SgSeason2>>() {
      @Override
      public List<SgSeason2> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tmdb_id");
          final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tvdb_id");
          final int _cursorIndexOfNumberOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_number");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "season_name");
          final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "season_order");
          final int _cursorIndexOfNotWatchedReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_watchcount");
          final int _cursorIndexOfNotWatchedToBeReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_willaircount");
          final int _cursorIndexOfNotWatchedNoReleaseOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_noairdatecount");
          final int _cursorIndexOfTotalOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_totalcount");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tags");
          final List<SgSeason2> _result = new ArrayList<SgSeason2>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgSeason2 _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpShowId;
            _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
            final String _tmpTmdbId;
            if (_cursor.isNull(_cursorIndexOfTmdbId)) {
              _tmpTmdbId = null;
            } else {
              _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
            }
            final Integer _tmpTvdbId;
            if (_cursor.isNull(_cursorIndexOfTvdbId)) {
              _tmpTvdbId = null;
            } else {
              _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
            }
            final Integer _tmpNumberOrNull;
            if (_cursor.isNull(_cursorIndexOfNumberOrNull)) {
              _tmpNumberOrNull = null;
            } else {
              _tmpNumberOrNull = _cursor.getInt(_cursorIndexOfNumberOrNull);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpOrder;
            _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
            final Integer _tmpNotWatchedReleasedOrNull;
            if (_cursor.isNull(_cursorIndexOfNotWatchedReleasedOrNull)) {
              _tmpNotWatchedReleasedOrNull = null;
            } else {
              _tmpNotWatchedReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedReleasedOrNull);
            }
            final Integer _tmpNotWatchedToBeReleasedOrNull;
            if (_cursor.isNull(_cursorIndexOfNotWatchedToBeReleasedOrNull)) {
              _tmpNotWatchedToBeReleasedOrNull = null;
            } else {
              _tmpNotWatchedToBeReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedToBeReleasedOrNull);
            }
            final Integer _tmpNotWatchedNoReleaseOrNull;
            if (_cursor.isNull(_cursorIndexOfNotWatchedNoReleaseOrNull)) {
              _tmpNotWatchedNoReleaseOrNull = null;
            } else {
              _tmpNotWatchedNoReleaseOrNull = _cursor.getInt(_cursorIndexOfNotWatchedNoReleaseOrNull);
            }
            final Integer _tmpTotalOrNull;
            if (_cursor.isNull(_cursorIndexOfTotalOrNull)) {
              _tmpTotalOrNull = null;
            } else {
              _tmpTotalOrNull = _cursor.getInt(_cursorIndexOfTotalOrNull);
            }
            final String _tmpTags;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmpTags = null;
            } else {
              _tmpTags = _cursor.getString(_cursorIndexOfTags);
            }
            _item = new SgSeason2(_tmpId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpNumberOrNull,_tmpName,_tmpOrder,_tmpNotWatchedReleasedOrNull,_tmpNotWatchedToBeReleasedOrNull,_tmpNotWatchedNoReleaseOrNull,_tmpTotalOrNull,_tmpTags);
            _result.add(_item);
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
  public List<SgSeason2> getSeasonsForExport(final long showId) {
    final String _sql = "SELECT * FROM sg_season WHERE series_id = ? ORDER BY season_number ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, showId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tmdb_id");
      final int _cursorIndexOfTvdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tvdb_id");
      final int _cursorIndexOfNumberOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_number");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "season_name");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "season_order");
      final int _cursorIndexOfNotWatchedReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_watchcount");
      final int _cursorIndexOfNotWatchedToBeReleasedOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_willaircount");
      final int _cursorIndexOfNotWatchedNoReleaseOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_noairdatecount");
      final int _cursorIndexOfTotalOrNull = CursorUtil.getColumnIndexOrThrow(_cursor, "season_totalcount");
      final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "season_tags");
      final List<SgSeason2> _result = new ArrayList<SgSeason2>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgSeason2 _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpShowId;
        _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
        final String _tmpTmdbId;
        if (_cursor.isNull(_cursorIndexOfTmdbId)) {
          _tmpTmdbId = null;
        } else {
          _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
        }
        final Integer _tmpTvdbId;
        if (_cursor.isNull(_cursorIndexOfTvdbId)) {
          _tmpTvdbId = null;
        } else {
          _tmpTvdbId = _cursor.getInt(_cursorIndexOfTvdbId);
        }
        final Integer _tmpNumberOrNull;
        if (_cursor.isNull(_cursorIndexOfNumberOrNull)) {
          _tmpNumberOrNull = null;
        } else {
          _tmpNumberOrNull = _cursor.getInt(_cursorIndexOfNumberOrNull);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final int _tmpOrder;
        _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
        final Integer _tmpNotWatchedReleasedOrNull;
        if (_cursor.isNull(_cursorIndexOfNotWatchedReleasedOrNull)) {
          _tmpNotWatchedReleasedOrNull = null;
        } else {
          _tmpNotWatchedReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedReleasedOrNull);
        }
        final Integer _tmpNotWatchedToBeReleasedOrNull;
        if (_cursor.isNull(_cursorIndexOfNotWatchedToBeReleasedOrNull)) {
          _tmpNotWatchedToBeReleasedOrNull = null;
        } else {
          _tmpNotWatchedToBeReleasedOrNull = _cursor.getInt(_cursorIndexOfNotWatchedToBeReleasedOrNull);
        }
        final Integer _tmpNotWatchedNoReleaseOrNull;
        if (_cursor.isNull(_cursorIndexOfNotWatchedNoReleaseOrNull)) {
          _tmpNotWatchedNoReleaseOrNull = null;
        } else {
          _tmpNotWatchedNoReleaseOrNull = _cursor.getInt(_cursorIndexOfNotWatchedNoReleaseOrNull);
        }
        final Integer _tmpTotalOrNull;
        if (_cursor.isNull(_cursorIndexOfTotalOrNull)) {
          _tmpTotalOrNull = null;
        } else {
          _tmpTotalOrNull = _cursor.getInt(_cursorIndexOfTotalOrNull);
        }
        final String _tmpTags;
        if (_cursor.isNull(_cursorIndexOfTags)) {
          _tmpTags = null;
        } else {
          _tmpTags = _cursor.getString(_cursorIndexOfTags);
        }
        _item = new SgSeason2(_tmpId,_tmpShowId,_tmpTmdbId,_tmpTvdbId,_tmpNumberOrNull,_tmpName,_tmpOrder,_tmpNotWatchedReleasedOrNull,_tmpNotWatchedToBeReleasedOrNull,_tmpNotWatchedNoReleaseOrNull,_tmpTotalOrNull,_tmpTags);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
