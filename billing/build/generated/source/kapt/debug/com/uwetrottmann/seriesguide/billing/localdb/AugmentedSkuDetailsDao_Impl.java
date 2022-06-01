package com.uwetrottmann.seriesguide.billing.localdb;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.android.billingclient.api.SkuDetails;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AugmentedSkuDetailsDao_Impl implements AugmentedSkuDetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AugmentedSkuDetails> __insertionAdapterOfAugmentedSkuDetails;

  private final SharedSQLiteStatement __preparedStmtOfUpdate;

  public AugmentedSkuDetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAugmentedSkuDetails = new EntityInsertionAdapter<AugmentedSkuDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AugmentedSkuDetails` (`canPurchase`,`sku`,`type`,`price`,`priceMicros`,`title`,`description`,`originalJson`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AugmentedSkuDetails value) {
        final int _tmp = value.getCanPurchase() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        if (value.getSku() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSku());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPrice());
        }
        if (value.getPriceMicros() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getPriceMicros());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        if (value.getOriginalJson() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginalJson());
        }
      }
    };
    this.__preparedStmtOfUpdate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE AugmentedSkuDetails SET canPurchase = ? WHERE sku = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AugmentedSkuDetails augmentedSkuDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAugmentedSkuDetails.insert(augmentedSkuDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public SkuDetails insertOrUpdate(final SkuDetails skuDetails) {
    __db.beginTransaction();
    try {
      SkuDetails _result = AugmentedSkuDetailsDao.DefaultImpls.insertOrUpdate(AugmentedSkuDetailsDao_Impl.this, skuDetails);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrUpdate(final String sku, final boolean canPurchase) {
    __db.beginTransaction();
    try {
      AugmentedSkuDetailsDao.DefaultImpls.insertOrUpdate(AugmentedSkuDetailsDao_Impl.this, sku, canPurchase);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final String sku, final boolean canPurchase) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdate.acquire();
    int _argIndex = 1;
    final int _tmp = canPurchase ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (sku == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, sku);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdate.release(_stmt);
    }
  }

  @Override
  public LiveData<List<AugmentedSkuDetails>> getSubscriptionSkuDetails() {
    final String _sql = "SELECT * FROM AugmentedSkuDetails WHERE type = 'subs' ORDER BY priceMicros ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"AugmentedSkuDetails"}, false, new Callable<List<AugmentedSkuDetails>>() {
      @Override
      public List<AugmentedSkuDetails> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCanPurchase = CursorUtil.getColumnIndexOrThrow(_cursor, "canPurchase");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfPriceMicros = CursorUtil.getColumnIndexOrThrow(_cursor, "priceMicros");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfOriginalJson = CursorUtil.getColumnIndexOrThrow(_cursor, "originalJson");
          final List<AugmentedSkuDetails> _result = new ArrayList<AugmentedSkuDetails>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AugmentedSkuDetails _item;
            final boolean _tmpCanPurchase;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCanPurchase);
            _tmpCanPurchase = _tmp != 0;
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpPrice;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmpPrice = null;
            } else {
              _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
            }
            final Long _tmpPriceMicros;
            if (_cursor.isNull(_cursorIndexOfPriceMicros)) {
              _tmpPriceMicros = null;
            } else {
              _tmpPriceMicros = _cursor.getLong(_cursorIndexOfPriceMicros);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpOriginalJson;
            if (_cursor.isNull(_cursorIndexOfOriginalJson)) {
              _tmpOriginalJson = null;
            } else {
              _tmpOriginalJson = _cursor.getString(_cursorIndexOfOriginalJson);
            }
            _item = new AugmentedSkuDetails(_tmpCanPurchase,_tmpSku,_tmpType,_tmpPrice,_tmpPriceMicros,_tmpTitle,_tmpDescription,_tmpOriginalJson);
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
  public AugmentedSkuDetails getById(final String sku) {
    final String _sql = "SELECT * FROM AugmentedSkuDetails WHERE sku = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sku == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sku);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCanPurchase = CursorUtil.getColumnIndexOrThrow(_cursor, "canPurchase");
      final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfPriceMicros = CursorUtil.getColumnIndexOrThrow(_cursor, "priceMicros");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfOriginalJson = CursorUtil.getColumnIndexOrThrow(_cursor, "originalJson");
      final AugmentedSkuDetails _result;
      if(_cursor.moveToFirst()) {
        final boolean _tmpCanPurchase;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCanPurchase);
        _tmpCanPurchase = _tmp != 0;
        final String _tmpSku;
        if (_cursor.isNull(_cursorIndexOfSku)) {
          _tmpSku = null;
        } else {
          _tmpSku = _cursor.getString(_cursorIndexOfSku);
        }
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final String _tmpPrice;
        if (_cursor.isNull(_cursorIndexOfPrice)) {
          _tmpPrice = null;
        } else {
          _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
        }
        final Long _tmpPriceMicros;
        if (_cursor.isNull(_cursorIndexOfPriceMicros)) {
          _tmpPriceMicros = null;
        } else {
          _tmpPriceMicros = _cursor.getLong(_cursorIndexOfPriceMicros);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpOriginalJson;
        if (_cursor.isNull(_cursorIndexOfOriginalJson)) {
          _tmpOriginalJson = null;
        } else {
          _tmpOriginalJson = _cursor.getString(_cursorIndexOfOriginalJson);
        }
        _result = new AugmentedSkuDetails(_tmpCanPurchase,_tmpSku,_tmpType,_tmpPrice,_tmpPriceMicros,_tmpTitle,_tmpDescription,_tmpOriginalJson);
      } else {
        _result = null;
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
