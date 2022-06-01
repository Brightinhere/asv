package com.uwetrottmann.seriesguide.billing.localdb;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.android.billingclient.api.Purchase;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PurchaseDao_Impl implements PurchaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CachedPurchase> __insertionAdapterOfCachedPurchase;

  private final PurchaseTypeConverter __purchaseTypeConverter = new PurchaseTypeConverter();

  private final EntityDeletionOrUpdateAdapter<CachedPurchase> __deletionAdapterOfCachedPurchase;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PurchaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCachedPurchase = new EntityInsertionAdapter<CachedPurchase>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `purchase_table` (`data`,`id`) VALUES (?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedPurchase value) {
        final String _tmp = __purchaseTypeConverter.toString(value.getData());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        stmt.bindLong(2, value.getId());
      }
    };
    this.__deletionAdapterOfCachedPurchase = new EntityDeletionOrUpdateAdapter<CachedPurchase>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `purchase_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedPurchase value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM purchase_table WHERE data = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM purchase_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final CachedPurchase purchase) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCachedPurchase.insert(purchase);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CachedPurchase... purchases) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCachedPurchase.handleMultiple(purchases);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final List<? extends Purchase> purchases) {
    __db.beginTransaction();
    try {
      PurchaseDao.DefaultImpls.insert(PurchaseDao_Impl.this, purchases);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Purchase purchase) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    final String _tmp = __purchaseTypeConverter.toString(purchase);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, _tmp);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<CachedPurchase> getPurchases() {
    final String _sql = "SELECT * FROM purchase_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<CachedPurchase> _result = new ArrayList<CachedPurchase>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CachedPurchase _item;
        final Purchase _tmpData;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfData)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfData);
        }
        _tmpData = __purchaseTypeConverter.toPurchase(_tmp);
        _item = new CachedPurchase(_tmpData);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
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
