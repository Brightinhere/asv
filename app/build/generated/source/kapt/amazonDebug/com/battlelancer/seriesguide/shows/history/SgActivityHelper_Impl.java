package com.battlelancer.seriesguide.shows.history;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SgActivityHelper_Impl implements SgActivityHelper {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SgActivity> __insertionAdapterOfSgActivity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOldActivity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteActivity;

  public SgActivityHelper_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSgActivity = new EntityInsertionAdapter<SgActivity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `activity` (`_id`,`activity_episode`,`activity_show`,`activity_time`,`activity_type`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgActivity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getEpisodeTvdbOrTmdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEpisodeTvdbOrTmdbId());
        }
        if (value.getShowTvdbOrTmdbId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getShowTvdbOrTmdbId());
        }
        stmt.bindLong(4, value.getTimestampMs());
        stmt.bindLong(5, value.getActivity_type());
      }
    };
    this.__preparedStmtOfDeleteOldActivity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM activity WHERE activity_time < ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteActivity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM activity WHERE activity_episode = ? AND activity_type = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertActivity(final SgActivity activity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSgActivity.insert(activity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteOldActivity(final long deleteOlderThanMs) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOldActivity.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, deleteOlderThanMs);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteOldActivity.release(_stmt);
    }
  }

  @Override
  public int deleteActivity(final String episodeStableId, final int type) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteActivity.acquire();
    int _argIndex = 1;
    if (episodeStableId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, episodeStableId);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, type);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteActivity.release(_stmt);
    }
  }

  @Override
  public List<SgActivity> getActivityByLatest() {
    final String _sql = "SELECT * FROM activity ORDER BY activity_time DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfEpisodeTvdbOrTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "activity_episode");
      final int _cursorIndexOfShowTvdbOrTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "activity_show");
      final int _cursorIndexOfTimestampMs = CursorUtil.getColumnIndexOrThrow(_cursor, "activity_time");
      final int _cursorIndexOfActivityType = CursorUtil.getColumnIndexOrThrow(_cursor, "activity_type");
      final List<SgActivity> _result = new ArrayList<SgActivity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgActivity _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpEpisodeTvdbOrTmdbId;
        if (_cursor.isNull(_cursorIndexOfEpisodeTvdbOrTmdbId)) {
          _tmpEpisodeTvdbOrTmdbId = null;
        } else {
          _tmpEpisodeTvdbOrTmdbId = _cursor.getString(_cursorIndexOfEpisodeTvdbOrTmdbId);
        }
        final String _tmpShowTvdbOrTmdbId;
        if (_cursor.isNull(_cursorIndexOfShowTvdbOrTmdbId)) {
          _tmpShowTvdbOrTmdbId = null;
        } else {
          _tmpShowTvdbOrTmdbId = _cursor.getString(_cursorIndexOfShowTvdbOrTmdbId);
        }
        final long _tmpTimestampMs;
        _tmpTimestampMs = _cursor.getLong(_cursorIndexOfTimestampMs);
        final int _tmpActivity_type;
        _tmpActivity_type = _cursor.getInt(_cursorIndexOfActivityType);
        _item = new SgActivity(_tmpId,_tmpEpisodeTvdbOrTmdbId,_tmpShowTvdbOrTmdbId,_tmpTimestampMs,_tmpActivity_type);
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
