package com.uwetrottmann.seriesguide.billing.localdb;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LocalBillingDb_Impl extends LocalBillingDb {
  private volatile PurchaseDao _purchaseDao;

  private volatile EntitlementsDao _entitlementsDao;

  private volatile AugmentedSkuDetailsDao _augmentedSkuDetailsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AugmentedSkuDetails` (`canPurchase` INTEGER NOT NULL, `sku` TEXT NOT NULL, `type` TEXT, `price` TEXT, `priceMicros` INTEGER, `title` TEXT, `description` TEXT, `originalJson` TEXT, PRIMARY KEY(`sku`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `purchase_table` (`data` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `gold_status` (`entitled` INTEGER NOT NULL, `isSub` INTEGER NOT NULL, `sku` TEXT, `purchaseToken` TEXT, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ae1a049cb09caf447b1de5ad92733919')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `AugmentedSkuDetails`");
        _db.execSQL("DROP TABLE IF EXISTS `purchase_table`");
        _db.execSQL("DROP TABLE IF EXISTS `gold_status`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAugmentedSkuDetails = new HashMap<String, TableInfo.Column>(8);
        _columnsAugmentedSkuDetails.put("canPurchase", new TableInfo.Column("canPurchase", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAugmentedSkuDetails.put("sku", new TableInfo.Column("sku", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAugmentedSkuDetails.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAugmentedSkuDetails.put("price", new TableInfo.Column("price", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAugmentedSkuDetails.put("priceMicros", new TableInfo.Column("priceMicros", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAugmentedSkuDetails.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAugmentedSkuDetails.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAugmentedSkuDetails.put("originalJson", new TableInfo.Column("originalJson", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAugmentedSkuDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAugmentedSkuDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAugmentedSkuDetails = new TableInfo("AugmentedSkuDetails", _columnsAugmentedSkuDetails, _foreignKeysAugmentedSkuDetails, _indicesAugmentedSkuDetails);
        final TableInfo _existingAugmentedSkuDetails = TableInfo.read(_db, "AugmentedSkuDetails");
        if (! _infoAugmentedSkuDetails.equals(_existingAugmentedSkuDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "AugmentedSkuDetails(com.uwetrottmann.seriesguide.billing.localdb.AugmentedSkuDetails).\n"
                  + " Expected:\n" + _infoAugmentedSkuDetails + "\n"
                  + " Found:\n" + _existingAugmentedSkuDetails);
        }
        final HashMap<String, TableInfo.Column> _columnsPurchaseTable = new HashMap<String, TableInfo.Column>(2);
        _columnsPurchaseTable.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPurchaseTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPurchaseTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPurchaseTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPurchaseTable = new TableInfo("purchase_table", _columnsPurchaseTable, _foreignKeysPurchaseTable, _indicesPurchaseTable);
        final TableInfo _existingPurchaseTable = TableInfo.read(_db, "purchase_table");
        if (! _infoPurchaseTable.equals(_existingPurchaseTable)) {
          return new RoomOpenHelper.ValidationResult(false, "purchase_table(com.uwetrottmann.seriesguide.billing.localdb.CachedPurchase).\n"
                  + " Expected:\n" + _infoPurchaseTable + "\n"
                  + " Found:\n" + _existingPurchaseTable);
        }
        final HashMap<String, TableInfo.Column> _columnsGoldStatus = new HashMap<String, TableInfo.Column>(5);
        _columnsGoldStatus.put("entitled", new TableInfo.Column("entitled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoldStatus.put("isSub", new TableInfo.Column("isSub", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoldStatus.put("sku", new TableInfo.Column("sku", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoldStatus.put("purchaseToken", new TableInfo.Column("purchaseToken", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoldStatus.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGoldStatus = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGoldStatus = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGoldStatus = new TableInfo("gold_status", _columnsGoldStatus, _foreignKeysGoldStatus, _indicesGoldStatus);
        final TableInfo _existingGoldStatus = TableInfo.read(_db, "gold_status");
        if (! _infoGoldStatus.equals(_existingGoldStatus)) {
          return new RoomOpenHelper.ValidationResult(false, "gold_status(com.uwetrottmann.seriesguide.billing.localdb.GoldStatus).\n"
                  + " Expected:\n" + _infoGoldStatus + "\n"
                  + " Found:\n" + _existingGoldStatus);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ae1a049cb09caf447b1de5ad92733919", "0d2e65fc5fd28aad4b4bfbe68caa5c4d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "AugmentedSkuDetails","purchase_table","gold_status");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `AugmentedSkuDetails`");
      _db.execSQL("DELETE FROM `purchase_table`");
      _db.execSQL("DELETE FROM `gold_status`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PurchaseDao.class, PurchaseDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(EntitlementsDao.class, EntitlementsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AugmentedSkuDetailsDao.class, AugmentedSkuDetailsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public PurchaseDao purchaseDao() {
    if (_purchaseDao != null) {
      return _purchaseDao;
    } else {
      synchronized(this) {
        if(_purchaseDao == null) {
          _purchaseDao = new PurchaseDao_Impl(this);
        }
        return _purchaseDao;
      }
    }
  }

  @Override
  public EntitlementsDao entitlementsDao() {
    if (_entitlementsDao != null) {
      return _entitlementsDao;
    } else {
      synchronized(this) {
        if(_entitlementsDao == null) {
          _entitlementsDao = new EntitlementsDao_Impl(this);
        }
        return _entitlementsDao;
      }
    }
  }

  @Override
  public AugmentedSkuDetailsDao skuDetailsDao() {
    if (_augmentedSkuDetailsDao != null) {
      return _augmentedSkuDetailsDao;
    } else {
      synchronized(this) {
        if(_augmentedSkuDetailsDao == null) {
          _augmentedSkuDetailsDao = new AugmentedSkuDetailsDao_Impl(this);
        }
        return _augmentedSkuDetailsDao;
      }
    }
  }
}
