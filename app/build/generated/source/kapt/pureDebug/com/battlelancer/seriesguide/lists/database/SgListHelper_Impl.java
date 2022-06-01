package com.battlelancer.seriesguide.lists.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
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

@SuppressWarnings({"unchecked", "deprecation"})
public final class SgListHelper_Impl implements SgListHelper {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SgListItem> __insertionAdapterOfSgListItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteListItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllLists;

  public SgListHelper_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSgListItem = new EntityInsertionAdapter<SgListItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `listitems` (`_id`,`list_item_id`,`item_ref_id`,`item_type`,`list_id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SgListItem value) {
        if (value.id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.id);
        }
        if (value.listItemId == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.listItemId);
        }
        if (value.itemRefId == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.itemRefId);
        }
        stmt.bindLong(4, value.type);
        if (value.listId == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.listId);
        }
      }
    };
    this.__preparedStmtOfDeleteListItem = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM listitems WHERE list_item_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllLists = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM lists";
        return _query;
      }
    };
  }

  @Override
  public void insertListItems(final List<? extends SgListItem> listItems) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSgListItem.insert(listItems);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteListItems(final List<String> listItemIds) {
    __db.beginTransaction();
    try {
      SgListHelper.DefaultImpls.deleteListItems(SgListHelper_Impl.this, listItemIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteListItem(final String listItemId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteListItem.acquire();
    int _argIndex = 1;
    if (listItemId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, listItemId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteListItem.release(_stmt);
    }
  }

  @Override
  public void deleteAllLists() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllLists.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllLists.release(_stmt);
    }
  }

  @Override
  public LiveData<List<SgList>> getListsForDisplay() {
    final String _sql = "SELECT * FROM lists ORDER BY list_order ASC,list_name COLLATE UNICODE ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"lists"}, false, new Callable<List<SgList>>() {
      @Override
      public List<SgList> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "list_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "list_name");
          final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "list_order");
          final List<SgList> _result = new ArrayList<SgList>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgList _item;
            _item = new SgList();
            if (_cursor.isNull(_cursorIndexOfId)) {
              _item.id = null;
            } else {
              _item.id = _cursor.getInt(_cursorIndexOfId);
            }
            if (_cursor.isNull(_cursorIndexOfListId)) {
              _item.listId = null;
            } else {
              _item.listId = _cursor.getString(_cursorIndexOfListId);
            }
            if (_cursor.isNull(_cursorIndexOfName)) {
              _item.name = null;
            } else {
              _item.name = _cursor.getString(_cursorIndexOfName);
            }
            if (_cursor.isNull(_cursorIndexOfOrder)) {
              _item.order = null;
            } else {
              _item.order = _cursor.getInt(_cursorIndexOfOrder);
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
  public List<SgList> getListsForExport() {
    final String _sql = "SELECT * FROM lists ORDER BY list_order ASC,list_name COLLATE UNICODE ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "list_id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "list_name");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "list_order");
      final List<SgList> _result = new ArrayList<SgList>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgList _item;
        _item = new SgList();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getInt(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfListId)) {
          _item.listId = null;
        } else {
          _item.listId = _cursor.getString(_cursorIndexOfListId);
        }
        if (_cursor.isNull(_cursorIndexOfName)) {
          _item.name = null;
        } else {
          _item.name = _cursor.getString(_cursorIndexOfName);
        }
        if (_cursor.isNull(_cursorIndexOfOrder)) {
          _item.order = null;
        } else {
          _item.order = _cursor.getInt(_cursorIndexOfOrder);
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
  public List<SgListItem> getListItemsForExport(final String listId) {
    final String _sql = "SELECT * FROM listitems WHERE list_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (listId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, listId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfListItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "list_item_id");
      final int _cursorIndexOfItemRefId = CursorUtil.getColumnIndexOrThrow(_cursor, "item_ref_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "item_type");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "list_id");
      final List<SgListItem> _result = new ArrayList<SgListItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgListItem _item;
        _item = new SgListItem();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getInt(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfListItemId)) {
          _item.listItemId = null;
        } else {
          _item.listItemId = _cursor.getString(_cursorIndexOfListItemId);
        }
        if (_cursor.isNull(_cursorIndexOfItemRefId)) {
          _item.itemRefId = null;
        } else {
          _item.itemRefId = _cursor.getString(_cursorIndexOfItemRefId);
        }
        _item.type = _cursor.getInt(_cursorIndexOfType);
        if (_cursor.isNull(_cursorIndexOfListId)) {
          _item.listId = null;
        } else {
          _item.listId = _cursor.getString(_cursorIndexOfListId);
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
  public List<SgListItem> getTvdbShowListItems() {
    final String _sql = "SELECT * FROM listitems WHERE item_type = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfListItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "list_item_id");
      final int _cursorIndexOfItemRefId = CursorUtil.getColumnIndexOrThrow(_cursor, "item_ref_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "item_type");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "list_id");
      final List<SgListItem> _result = new ArrayList<SgListItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgListItem _item;
        _item = new SgListItem();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getInt(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfListItemId)) {
          _item.listItemId = null;
        } else {
          _item.listItemId = _cursor.getString(_cursorIndexOfListItemId);
        }
        if (_cursor.isNull(_cursorIndexOfItemRefId)) {
          _item.itemRefId = null;
        } else {
          _item.itemRefId = _cursor.getString(_cursorIndexOfItemRefId);
        }
        _item.type = _cursor.getInt(_cursorIndexOfType);
        if (_cursor.isNull(_cursorIndexOfListId)) {
          _item.listId = null;
        } else {
          _item.listId = _cursor.getString(_cursorIndexOfListId);
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
  public LiveData<List<SgListItemWithDetails>> getListItemsWithDetails(
      final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return __db.getInvalidationTracker().createLiveData(new String[]{"listitems","sg_show"}, false, new Callable<List<SgListItemWithDetails>>() {
      @Override
      public List<SgListItemWithDetails> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "_id");
          final int _cursorIndexOfListItemId = CursorUtil.getColumnIndex(_cursor, "list_item_id");
          final int _cursorIndexOfListId = CursorUtil.getColumnIndex(_cursor, "list_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndex(_cursor, "item_type");
          final int _cursorIndexOfItemRefId = CursorUtil.getColumnIndex(_cursor, "item_ref_id");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndex(_cursor, "series_id");
          final int _cursorIndexOfReleaseTime = CursorUtil.getColumnIndex(_cursor, "series_airstime");
          final int _cursorIndexOfNextText = CursorUtil.getColumnIndex(_cursor, "series_nexttext");
          final int _cursorIndexOfNextAirdateMs = CursorUtil.getColumnIndex(_cursor, "series_nextairdate");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "series_title");
          final int _cursorIndexOfTitleNoArticle = CursorUtil.getColumnIndex(_cursor, "series_title_noarticle");
          final int _cursorIndexOfPosterSmall = CursorUtil.getColumnIndex(_cursor, "series_poster_small");
          final int _cursorIndexOfNetwork = CursorUtil.getColumnIndex(_cursor, "series_network");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndex(_cursor, "series_status");
          final int _cursorIndexOfFavorite = CursorUtil.getColumnIndex(_cursor, "series_favorite");
          final int _cursorIndexOfReleaseWeekDay = CursorUtil.getColumnIndex(_cursor, "series_airsdayofweek");
          final int _cursorIndexOfReleaseTimeZone = CursorUtil.getColumnIndex(_cursor, "series_timezone");
          final int _cursorIndexOfReleaseCountry = CursorUtil.getColumnIndex(_cursor, "series_country");
          final int _cursorIndexOfLastWatchedMs = CursorUtil.getColumnIndex(_cursor, "series_lastwatched_ms");
          final int _cursorIndexOfUnwatchedCount = CursorUtil.getColumnIndex(_cursor, "series_unwatched_count");
          final List<SgListItemWithDetails> _result = new ArrayList<SgListItemWithDetails>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SgListItemWithDetails _item;
            final long _tmpId;
            if (_cursorIndexOfId == -1) {
              _tmpId = 0;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final String _tmpListItemId;
            if (_cursorIndexOfListItemId == -1) {
              _tmpListItemId = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfListItemId)) {
                _tmpListItemId = null;
              } else {
                _tmpListItemId = _cursor.getString(_cursorIndexOfListItemId);
              }
            }
            final String _tmpListId;
            if (_cursorIndexOfListId == -1) {
              _tmpListId = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfListId)) {
                _tmpListId = null;
              } else {
                _tmpListId = _cursor.getString(_cursorIndexOfListId);
              }
            }
            final int _tmpType;
            if (_cursorIndexOfType == -1) {
              _tmpType = 0;
            } else {
              _tmpType = _cursor.getInt(_cursorIndexOfType);
            }
            final String _tmpItemRefId;
            if (_cursorIndexOfItemRefId == -1) {
              _tmpItemRefId = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfItemRefId)) {
                _tmpItemRefId = null;
              } else {
                _tmpItemRefId = _cursor.getString(_cursorIndexOfItemRefId);
              }
            }
            final long _tmpShowId;
            if (_cursorIndexOfShowId == -1) {
              _tmpShowId = 0;
            } else {
              _tmpShowId = _cursor.getLong(_cursorIndexOfShowId);
            }
            final Integer _tmpReleaseTime;
            if (_cursorIndexOfReleaseTime == -1) {
              _tmpReleaseTime = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfReleaseTime)) {
                _tmpReleaseTime = null;
              } else {
                _tmpReleaseTime = _cursor.getInt(_cursorIndexOfReleaseTime);
              }
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
            final long _tmpNextAirdateMs;
            if (_cursorIndexOfNextAirdateMs == -1) {
              _tmpNextAirdateMs = 0;
            } else {
              _tmpNextAirdateMs = _cursor.getLong(_cursorIndexOfNextAirdateMs);
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
            final String _tmpTitleNoArticle;
            if (_cursorIndexOfTitleNoArticle == -1) {
              _tmpTitleNoArticle = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfTitleNoArticle)) {
                _tmpTitleNoArticle = null;
              } else {
                _tmpTitleNoArticle = _cursor.getString(_cursorIndexOfTitleNoArticle);
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
            final boolean _tmpFavorite;
            if (_cursorIndexOfFavorite == -1) {
              _tmpFavorite = false;
            } else {
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfFavorite);
              _tmpFavorite = _tmp != 0;
            }
            final Integer _tmpReleaseWeekDay;
            if (_cursorIndexOfReleaseWeekDay == -1) {
              _tmpReleaseWeekDay = null;
            } else {
              if (_cursor.isNull(_cursorIndexOfReleaseWeekDay)) {
                _tmpReleaseWeekDay = null;
              } else {
                _tmpReleaseWeekDay = _cursor.getInt(_cursorIndexOfReleaseWeekDay);
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
            final long _tmpLastWatchedMs;
            if (_cursorIndexOfLastWatchedMs == -1) {
              _tmpLastWatchedMs = 0;
            } else {
              _tmpLastWatchedMs = _cursor.getLong(_cursorIndexOfLastWatchedMs);
            }
            final int _tmpUnwatchedCount;
            if (_cursorIndexOfUnwatchedCount == -1) {
              _tmpUnwatchedCount = 0;
            } else {
              _tmpUnwatchedCount = _cursor.getInt(_cursorIndexOfUnwatchedCount);
            }
            _item = new SgListItemWithDetails(_tmpId,_tmpListItemId,_tmpListId,_tmpType,_tmpItemRefId,_tmpShowId,_tmpReleaseTime,_tmpNextText,_tmpNextAirdateMs,_tmpTitle,_tmpTitleNoArticle,_tmpPosterSmall,_tmpNetwork,_tmpStatus,_tmpFavorite,_tmpReleaseWeekDay,_tmpReleaseTimeZone,_tmpReleaseCountry,_tmpLastWatchedMs,_tmpUnwatchedCount);
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
