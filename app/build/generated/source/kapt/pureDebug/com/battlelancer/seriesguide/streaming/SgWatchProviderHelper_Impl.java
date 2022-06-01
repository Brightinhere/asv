package com.battlelancer.seriesguide.streaming;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SgWatchProviderHelper_Impl implements SgWatchProviderHelper {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SgWatchProvider> __insertionAdapterOfSgWatchProvider;

  private final EntityDeletionOrUpdateAdapter<SgWatchProvider> __deletionAdapterOfSgWatchProvider;

  private final EntityDeletionOrUpdateAdapter<SgWatchProvider> __updateAdapterOfSgWatchProvider;

  private final SharedSQLiteStatement __preparedStmtOfSetEnabled;

  private final SharedSQLiteStatement __preparedStmtOfSetAllDisabled;

  public SgWatchProviderHelper_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSgWatchProvider = new EntityInsertionAdapter<SgWatchProvider>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sg_watch_provider` (`_id`,`provider_id`,`provider_name`,`display_priority`,`logo_path`,`type`,`enabled`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgWatchProvider value) {
        stmt.bindLong(1, value.get_id());
        stmt.bindLong(2, value.getProvider_id());
        if (value.getProvider_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProvider_name());
        }
        stmt.bindLong(4, value.getDisplay_priority());
        if (value.getLogo_path() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLogo_path());
        }
        stmt.bindLong(6, value.getType());
        final int _tmp = value.getEnabled() ? 1 : 0;
        stmt.bindLong(7, _tmp);
      }
    };
    this.__deletionAdapterOfSgWatchProvider = new EntityDeletionOrUpdateAdapter<SgWatchProvider>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `sg_watch_provider` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgWatchProvider value) {
        stmt.bindLong(1, value.get_id());
      }
    };
    this.__updateAdapterOfSgWatchProvider = new EntityDeletionOrUpdateAdapter<SgWatchProvider>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sg_watch_provider` SET `_id` = ?,`provider_id` = ?,`provider_name` = ?,`display_priority` = ?,`logo_path` = ?,`type` = ?,`enabled` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgWatchProvider value) {
        stmt.bindLong(1, value.get_id());
        stmt.bindLong(2, value.getProvider_id());
        if (value.getProvider_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProvider_name());
        }
        stmt.bindLong(4, value.getDisplay_priority());
        if (value.getLogo_path() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLogo_path());
        }
        stmt.bindLong(6, value.getType());
        final int _tmp = value.getEnabled() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.get_id());
      }
    };
    this.__preparedStmtOfSetEnabled = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_watch_provider SET enabled=? WHERE _id=?";
        return _query;
      }
    };
    this.__preparedStmtOfSetAllDisabled = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE sg_watch_provider SET enabled=0 WHERE type=?";
        return _query;
      }
    };
  }

  @Override
  public void insertOrReplace(final List<SgWatchProvider> providers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSgWatchProvider.insert(providers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final List<SgWatchProvider> providers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSgWatchProvider.handleMultiple(providers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final List<SgWatchProvider> providers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSgWatchProvider.handleMultiple(providers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateWatchProviders(final List<SgWatchProvider> inserts,
      final List<SgWatchProvider> updates, final List<SgWatchProvider> deletes) {
    __db.beginTransaction();
    try {
      SgWatchProviderHelper.DefaultImpls.updateWatchProviders(SgWatchProviderHelper_Impl.this, inserts, updates, deletes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setEnabled(final int id, final boolean enabled) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetEnabled.acquire();
    int _argIndex = 1;
    final int _tmp = enabled ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetEnabled.release(_stmt);
    }
  }

  @Override
  public void setAllDisabled(final int type) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetAllDisabled.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, type);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetAllDisabled.release(_stmt);
    }
  }

  @Override
  public List<SgWatchProvider> getAllWatchProviders(final int type) {
    final String _sql = "SELECT * FROM sg_watch_provider WHERE type=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, type);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfProviderId = CursorUtil.getColumnIndexOrThrow(_cursor, "provider_id");
      final int _cursorIndexOfProviderName = CursorUtil.getColumnIndexOrThrow(_cursor, "provider_name");
      final int _cursorIndexOfDisplayPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "display_priority");
      final int _cursorIndexOfLogoPath = CursorUtil.getColumnIndexOrThrow(_cursor, "logo_path");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "enabled");
      final List<SgWatchProvider> _result = new ArrayList<SgWatchProvider>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgWatchProvider _item;
        final int _tmp_id;
        _tmp_id = _cursor.getInt(_cursorIndexOfId);
        final int _tmpProvider_id;
        _tmpProvider_id = _cursor.getInt(_cursorIndexOfProviderId);
        final String _tmpProvider_name;
        if (_cursor.isNull(_cursorIndexOfProviderName)) {
          _tmpProvider_name = null;
        } else {
          _tmpProvider_name = _cursor.getString(_cursorIndexOfProviderName);
        }
        final int _tmpDisplay_priority;
        _tmpDisplay_priority = _cursor.getInt(_cursorIndexOfDisplayPriority);
        final String _tmpLogo_path;
        if (_cursor.isNull(_cursorIndexOfLogoPath)) {
          _tmpLogo_path = null;
        } else {
          _tmpLogo_path = _cursor.getString(_cursorIndexOfLogoPath);
        }
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final boolean _tmpEnabled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfEnabled);
        _tmpEnabled = _tmp != 0;
        _item = new SgWatchProvider(_tmp_id,_tmpProvider_id,_tmpProvider_name,_tmpDisplay_priority,_tmpLogo_path,_tmpType,_tmpEnabled);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public PagingSource<Integer, SgWatchProvider> allWatchProvidersPagingSource(final int type) {
    final String _sql = "SELECT * FROM sg_watch_provider WHERE type=? ORDER BY display_priority ASC, provider_name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, type);
    return new LimitOffsetPagingSource<SgWatchProvider>(_statement, __db, "sg_watch_provider") {
      @Override
      protected List<SgWatchProvider> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "_id");
        final int _cursorIndexOfProviderId = CursorUtil.getColumnIndexOrThrow(cursor, "provider_id");
        final int _cursorIndexOfProviderName = CursorUtil.getColumnIndexOrThrow(cursor, "provider_name");
        final int _cursorIndexOfDisplayPriority = CursorUtil.getColumnIndexOrThrow(cursor, "display_priority");
        final int _cursorIndexOfLogoPath = CursorUtil.getColumnIndexOrThrow(cursor, "logo_path");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfEnabled = CursorUtil.getColumnIndexOrThrow(cursor, "enabled");
        final List<SgWatchProvider> _result = new ArrayList<SgWatchProvider>(cursor.getCount());
        while(cursor.moveToNext()) {
          final SgWatchProvider _item;
          final int _tmp_id;
          _tmp_id = cursor.getInt(_cursorIndexOfId);
          final int _tmpProvider_id;
          _tmpProvider_id = cursor.getInt(_cursorIndexOfProviderId);
          final String _tmpProvider_name;
          if (cursor.isNull(_cursorIndexOfProviderName)) {
            _tmpProvider_name = null;
          } else {
            _tmpProvider_name = cursor.getString(_cursorIndexOfProviderName);
          }
          final int _tmpDisplay_priority;
          _tmpDisplay_priority = cursor.getInt(_cursorIndexOfDisplayPriority);
          final String _tmpLogo_path;
          if (cursor.isNull(_cursorIndexOfLogoPath)) {
            _tmpLogo_path = null;
          } else {
            _tmpLogo_path = cursor.getString(_cursorIndexOfLogoPath);
          }
          final int _tmpType;
          _tmpType = cursor.getInt(_cursorIndexOfType);
          final boolean _tmpEnabled;
          final int _tmp;
          _tmp = cursor.getInt(_cursorIndexOfEnabled);
          _tmpEnabled = _tmp != 0;
          _item = new SgWatchProvider(_tmp_id,_tmpProvider_id,_tmpProvider_name,_tmpDisplay_priority,_tmpLogo_path,_tmpType,_tmpEnabled);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public LiveData<List<Integer>> getEnabledWatchProviderIds(final int type) {
    final String _sql = "SELECT provider_id FROM sg_watch_provider WHERE type=? AND enabled=1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, type);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sg_watch_provider"}, false, new Callable<List<Integer>>() {
      @Override
      public List<Integer> call() throws Exception {
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
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Integer>> getEnabledWatchProviderIdsFlow(final int type) {
    final String _sql = "SELECT provider_id FROM sg_watch_provider WHERE type=? AND enabled=1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, type);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"sg_watch_provider"}, new Callable<List<Integer>>() {
      @Override
      public List<Integer> call() throws Exception {
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
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
