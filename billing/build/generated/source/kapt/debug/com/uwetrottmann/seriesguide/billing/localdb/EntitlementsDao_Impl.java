package com.uwetrottmann.seriesguide.billing.localdb;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EntitlementsDao_Impl implements EntitlementsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GoldStatus> __insertionAdapterOfGoldStatus;

  private final EntityDeletionOrUpdateAdapter<GoldStatus> __deletionAdapterOfGoldStatus;

  private final EntityDeletionOrUpdateAdapter<GoldStatus> __updateAdapterOfGoldStatus;

  public EntitlementsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGoldStatus = new EntityInsertionAdapter<GoldStatus>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `gold_status` (`entitled`,`isSub`,`sku`,`purchaseToken`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GoldStatus value) {
        final int _tmp = value.getEntitled() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        final int _tmp_1 = value.isSub() ? 1 : 0;
        stmt.bindLong(2, _tmp_1);
        if (value.getSku() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSku());
        }
        if (value.getPurchaseToken() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPurchaseToken());
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__deletionAdapterOfGoldStatus = new EntityDeletionOrUpdateAdapter<GoldStatus>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `gold_status` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GoldStatus value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfGoldStatus = new EntityDeletionOrUpdateAdapter<GoldStatus>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `gold_status` SET `entitled` = ?,`isSub` = ?,`sku` = ?,`purchaseToken` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GoldStatus value) {
        final int _tmp = value.getEntitled() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        final int _tmp_1 = value.isSub() ? 1 : 0;
        stmt.bindLong(2, _tmp_1);
        if (value.getSku() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSku());
        }
        if (value.getPurchaseToken() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPurchaseToken());
        }
        stmt.bindLong(5, value.getId());
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public void insert(final GoldStatus goldStatus) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGoldStatus.insert(goldStatus);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final GoldStatus goldStatus) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfGoldStatus.handle(goldStatus);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final GoldStatus goldStatus) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfGoldStatus.handle(goldStatus);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Entitlement... entitlements) {
    __db.beginTransaction();
    try {
      EntitlementsDao.DefaultImpls.insert(EntitlementsDao_Impl.this, entitlements);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Entitlement... entitlements) {
    __db.beginTransaction();
    try {
      EntitlementsDao.DefaultImpls.update(EntitlementsDao_Impl.this, entitlements);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public GoldStatus getGoldStatus() {
    final String _sql = "SELECT * FROM gold_status LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfEntitled = CursorUtil.getColumnIndexOrThrow(_cursor, "entitled");
      final int _cursorIndexOfIsSub = CursorUtil.getColumnIndexOrThrow(_cursor, "isSub");
      final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
      final int _cursorIndexOfPurchaseToken = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseToken");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final GoldStatus _result;
      if(_cursor.moveToFirst()) {
        final boolean _tmpEntitled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfEntitled);
        _tmpEntitled = _tmp != 0;
        final boolean _tmpIsSub;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsSub);
        _tmpIsSub = _tmp_1 != 0;
        final String _tmpSku;
        if (_cursor.isNull(_cursorIndexOfSku)) {
          _tmpSku = null;
        } else {
          _tmpSku = _cursor.getString(_cursorIndexOfSku);
        }
        final String _tmpPurchaseToken;
        if (_cursor.isNull(_cursorIndexOfPurchaseToken)) {
          _tmpPurchaseToken = null;
        } else {
          _tmpPurchaseToken = _cursor.getString(_cursorIndexOfPurchaseToken);
        }
        _result = new GoldStatus(_tmpEntitled,_tmpIsSub,_tmpSku,_tmpPurchaseToken);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
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
  public LiveData<GoldStatus> getGoldStatusLiveData() {
    final String _sql = "SELECT * FROM gold_status LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"gold_status"}, false, new Callable<GoldStatus>() {
      @Override
      public GoldStatus call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfEntitled = CursorUtil.getColumnIndexOrThrow(_cursor, "entitled");
          final int _cursorIndexOfIsSub = CursorUtil.getColumnIndexOrThrow(_cursor, "isSub");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfPurchaseToken = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseToken");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final GoldStatus _result;
          if(_cursor.moveToFirst()) {
            final boolean _tmpEntitled;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfEntitled);
            _tmpEntitled = _tmp != 0;
            final boolean _tmpIsSub;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSub);
            _tmpIsSub = _tmp_1 != 0;
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpPurchaseToken;
            if (_cursor.isNull(_cursorIndexOfPurchaseToken)) {
              _tmpPurchaseToken = null;
            } else {
              _tmpPurchaseToken = _cursor.getString(_cursorIndexOfPurchaseToken);
            }
            _result = new GoldStatus(_tmpEntitled,_tmpIsSub,_tmpSku,_tmpPurchaseToken);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
