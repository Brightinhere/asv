package com.battlelancer.seriesguide.movies.database;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieHelper_Impl implements MovieHelper {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfSetNotWatchedAndRemovePlays;

  private final SharedSQLiteStatement __preparedStmtOfSetWatchedAndAddPlay;

  private final SharedSQLiteStatement __preparedStmtOfUpdateInCollection;

  private final SharedSQLiteStatement __preparedStmtOfUpdateInWatchlist;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMovie;

  public MovieHelper_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfSetNotWatchedAndRemovePlays = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE movies SET movies_watched = 0, movies_plays = 0 WHERE movies_tmdbid=?";
        return _query;
      }
    };
    this.__preparedStmtOfSetWatchedAndAddPlay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE movies SET movies_watched = 1, movies_plays = movies_plays + 1 WHERE movies_tmdbid=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateInCollection = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE movies SET movies_incollection = ? WHERE movies_tmdbid=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateInWatchlist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE movies SET movies_inwatchlist = ? WHERE movies_tmdbid=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteMovie = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movies WHERE movies_tmdbid=?";
        return _query;
      }
    };
  }

  @Override
  public int setNotWatchedAndRemovePlays(final int tmdbId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetNotWatchedAndRemovePlays.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, tmdbId);
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
  public int setWatchedAndAddPlay(final int tmdbId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetWatchedAndAddPlay.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, tmdbId);
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
  public int updateInCollection(final int tmdbId, final boolean inCollection) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateInCollection.acquire();
    int _argIndex = 1;
    final int _tmp = inCollection ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, tmdbId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateInCollection.release(_stmt);
    }
  }

  @Override
  public int updateInWatchlist(final int tmdbId, final boolean inWatchlist) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateInWatchlist.acquire();
    int _argIndex = 1;
    final int _tmp = inWatchlist ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, tmdbId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateInWatchlist.release(_stmt);
    }
  }

  @Override
  public int deleteMovie(final int tmdbId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMovie.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, tmdbId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteMovie.release(_stmt);
    }
  }

  @Override
  public SgMovie getMovie(final int tmdbId) {
    final String _sql = "SELECT * FROM movies WHERE movies_tmdbid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_tmdbid");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_imdbid");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_title");
      final int _cursorIndexOfTitleNoArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_title_noarticle");
      final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_poster");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_genres");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_overview");
      final int _cursorIndexOfReleasedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_released");
      final int _cursorIndexOfRuntimeMin = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_runtime");
      final int _cursorIndexOfTrailer = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_trailer");
      final int _cursorIndexOfCertification = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_certification");
      final int _cursorIndexOfInCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_incollection");
      final int _cursorIndexOfInWatchlist = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_inwatchlist");
      final int _cursorIndexOfPlays = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_plays");
      final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_watched");
      final int _cursorIndexOfRatingTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_tmdb");
      final int _cursorIndexOfRatingVotesTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_votes_tmdb");
      final int _cursorIndexOfRatingTrakt = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_trakt");
      final int _cursorIndexOfRatingVotesTrakt = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_votes_trakt");
      final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_user");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_last_updated");
      final SgMovie _result;
      if(_cursor.moveToFirst()) {
        _result = new SgMovie();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _result.id = null;
        } else {
          _result.id = _cursor.getInt(_cursorIndexOfId);
        }
        _result.tmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _result.imdbId = null;
        } else {
          _result.imdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _result.title = null;
        } else {
          _result.title = _cursor.getString(_cursorIndexOfTitle);
        }
        if (_cursor.isNull(_cursorIndexOfTitleNoArticle)) {
          _result.titleNoArticle = null;
        } else {
          _result.titleNoArticle = _cursor.getString(_cursorIndexOfTitleNoArticle);
        }
        if (_cursor.isNull(_cursorIndexOfPoster)) {
          _result.poster = null;
        } else {
          _result.poster = _cursor.getString(_cursorIndexOfPoster);
        }
        if (_cursor.isNull(_cursorIndexOfGenres)) {
          _result.genres = null;
        } else {
          _result.genres = _cursor.getString(_cursorIndexOfGenres);
        }
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _result.overview = null;
        } else {
          _result.overview = _cursor.getString(_cursorIndexOfOverview);
        }
        if (_cursor.isNull(_cursorIndexOfReleasedMs)) {
          _result.releasedMs = null;
        } else {
          _result.releasedMs = _cursor.getLong(_cursorIndexOfReleasedMs);
        }
        if (_cursor.isNull(_cursorIndexOfRuntimeMin)) {
          _result.runtimeMin = null;
        } else {
          _result.runtimeMin = _cursor.getInt(_cursorIndexOfRuntimeMin);
        }
        if (_cursor.isNull(_cursorIndexOfTrailer)) {
          _result.trailer = null;
        } else {
          _result.trailer = _cursor.getString(_cursorIndexOfTrailer);
        }
        if (_cursor.isNull(_cursorIndexOfCertification)) {
          _result.certification = null;
        } else {
          _result.certification = _cursor.getString(_cursorIndexOfCertification);
        }
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfInCollection)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfInCollection);
        }
        _result.inCollection = _tmp == null ? null : _tmp != 0;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfInWatchlist)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfInWatchlist);
        }
        _result.inWatchlist = _tmp_1 == null ? null : _tmp_1 != 0;
        if (_cursor.isNull(_cursorIndexOfPlays)) {
          _result.plays = null;
        } else {
          _result.plays = _cursor.getInt(_cursorIndexOfPlays);
        }
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfWatched)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
        }
        _result.watched = _tmp_2 == null ? null : _tmp_2 != 0;
        if (_cursor.isNull(_cursorIndexOfRatingTmdb)) {
          _result.ratingTmdb = null;
        } else {
          _result.ratingTmdb = _cursor.getDouble(_cursorIndexOfRatingTmdb);
        }
        if (_cursor.isNull(_cursorIndexOfRatingVotesTmdb)) {
          _result.ratingVotesTmdb = null;
        } else {
          _result.ratingVotesTmdb = _cursor.getInt(_cursorIndexOfRatingVotesTmdb);
        }
        if (_cursor.isNull(_cursorIndexOfRatingTrakt)) {
          _result.ratingTrakt = null;
        } else {
          _result.ratingTrakt = _cursor.getInt(_cursorIndexOfRatingTrakt);
        }
        if (_cursor.isNull(_cursorIndexOfRatingVotesTrakt)) {
          _result.ratingVotesTrakt = null;
        } else {
          _result.ratingVotesTrakt = _cursor.getInt(_cursorIndexOfRatingVotesTrakt);
        }
        if (_cursor.isNull(_cursorIndexOfRatingUser)) {
          _result.ratingUser = null;
        } else {
          _result.ratingUser = _cursor.getInt(_cursorIndexOfRatingUser);
        }
        if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
          _result.lastUpdated = null;
        } else {
          _result.lastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
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
  public List<SgMovie> getMoviesForExport() {
    final String _sql = "SELECT * FROM movies ORDER BY movies_title COLLATE UNICODE ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_tmdbid");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_imdbid");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_title");
      final int _cursorIndexOfTitleNoArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_title_noarticle");
      final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_poster");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_genres");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_overview");
      final int _cursorIndexOfReleasedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_released");
      final int _cursorIndexOfRuntimeMin = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_runtime");
      final int _cursorIndexOfTrailer = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_trailer");
      final int _cursorIndexOfCertification = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_certification");
      final int _cursorIndexOfInCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_incollection");
      final int _cursorIndexOfInWatchlist = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_inwatchlist");
      final int _cursorIndexOfPlays = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_plays");
      final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_watched");
      final int _cursorIndexOfRatingTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_tmdb");
      final int _cursorIndexOfRatingVotesTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_votes_tmdb");
      final int _cursorIndexOfRatingTrakt = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_trakt");
      final int _cursorIndexOfRatingVotesTrakt = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_votes_trakt");
      final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_user");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_last_updated");
      final List<SgMovie> _result = new ArrayList<SgMovie>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgMovie _item;
        _item = new SgMovie();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getInt(_cursorIndexOfId);
        }
        _item.tmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _item.imdbId = null;
        } else {
          _item.imdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _item.title = null;
        } else {
          _item.title = _cursor.getString(_cursorIndexOfTitle);
        }
        if (_cursor.isNull(_cursorIndexOfTitleNoArticle)) {
          _item.titleNoArticle = null;
        } else {
          _item.titleNoArticle = _cursor.getString(_cursorIndexOfTitleNoArticle);
        }
        if (_cursor.isNull(_cursorIndexOfPoster)) {
          _item.poster = null;
        } else {
          _item.poster = _cursor.getString(_cursorIndexOfPoster);
        }
        if (_cursor.isNull(_cursorIndexOfGenres)) {
          _item.genres = null;
        } else {
          _item.genres = _cursor.getString(_cursorIndexOfGenres);
        }
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _item.overview = null;
        } else {
          _item.overview = _cursor.getString(_cursorIndexOfOverview);
        }
        if (_cursor.isNull(_cursorIndexOfReleasedMs)) {
          _item.releasedMs = null;
        } else {
          _item.releasedMs = _cursor.getLong(_cursorIndexOfReleasedMs);
        }
        if (_cursor.isNull(_cursorIndexOfRuntimeMin)) {
          _item.runtimeMin = null;
        } else {
          _item.runtimeMin = _cursor.getInt(_cursorIndexOfRuntimeMin);
        }
        if (_cursor.isNull(_cursorIndexOfTrailer)) {
          _item.trailer = null;
        } else {
          _item.trailer = _cursor.getString(_cursorIndexOfTrailer);
        }
        if (_cursor.isNull(_cursorIndexOfCertification)) {
          _item.certification = null;
        } else {
          _item.certification = _cursor.getString(_cursorIndexOfCertification);
        }
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfInCollection)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfInCollection);
        }
        _item.inCollection = _tmp == null ? null : _tmp != 0;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfInWatchlist)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfInWatchlist);
        }
        _item.inWatchlist = _tmp_1 == null ? null : _tmp_1 != 0;
        if (_cursor.isNull(_cursorIndexOfPlays)) {
          _item.plays = null;
        } else {
          _item.plays = _cursor.getInt(_cursorIndexOfPlays);
        }
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfWatched)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
        }
        _item.watched = _tmp_2 == null ? null : _tmp_2 != 0;
        if (_cursor.isNull(_cursorIndexOfRatingTmdb)) {
          _item.ratingTmdb = null;
        } else {
          _item.ratingTmdb = _cursor.getDouble(_cursorIndexOfRatingTmdb);
        }
        if (_cursor.isNull(_cursorIndexOfRatingVotesTmdb)) {
          _item.ratingVotesTmdb = null;
        } else {
          _item.ratingVotesTmdb = _cursor.getInt(_cursorIndexOfRatingVotesTmdb);
        }
        if (_cursor.isNull(_cursorIndexOfRatingTrakt)) {
          _item.ratingTrakt = null;
        } else {
          _item.ratingTrakt = _cursor.getInt(_cursorIndexOfRatingTrakt);
        }
        if (_cursor.isNull(_cursorIndexOfRatingVotesTrakt)) {
          _item.ratingVotesTrakt = null;
        } else {
          _item.ratingVotesTrakt = _cursor.getInt(_cursorIndexOfRatingVotesTrakt);
        }
        if (_cursor.isNull(_cursorIndexOfRatingUser)) {
          _item.ratingUser = null;
        } else {
          _item.ratingUser = _cursor.getInt(_cursorIndexOfRatingUser);
        }
        if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
          _item.lastUpdated = null;
        } else {
          _item.lastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
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
  public int getCount(final int tmdbId) {
    final String _sql = "SELECT COUNT(movies_tmdbid) FROM movies WHERE movies_tmdbid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
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
  public List<SgMovieTmdbId> getMoviesToUpdate(final long releasedAfter,
      final long updatedBeforeForReleasedAfter, final long updatedBeforeAllOthers) {
    final String _sql = "SELECT movies_tmdbid FROM movies WHERE\n"
            + "            (movies_incollection=1 OR movies_inwatchlist=1 OR movies_watched=1)\n"
            + "            AND (\n"
            + "            movies_last_updated IS NULL\n"
            + "            OR (movies_released > ? AND movies_last_updated < ?)\n"
            + "            OR \n"
            + "            movies_last_updated < ?\n"
            + "            )";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, releasedAfter);
    _argIndex = 2;
    _statement.bindLong(_argIndex, updatedBeforeForReleasedAfter);
    _argIndex = 3;
    _statement.bindLong(_argIndex, updatedBeforeAllOthers);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTmdbId = 0;
      final List<SgMovieTmdbId> _result = new ArrayList<SgMovieTmdbId>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgMovieTmdbId _item;
        _item = new SgMovieTmdbId();
        _item.tmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgMovieFlags> getMoviesOnListsOrWatched() {
    final String _sql = "SELECT movies_tmdbid, movies_incollection, movies_inwatchlist, movies_watched, movies_plays\n"
            + "            FROM movies WHERE movies_incollection=1 OR movies_inwatchlist=1 OR movies_watched=1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTmdbId = 0;
      final int _cursorIndexOfInCollection = 1;
      final int _cursorIndexOfInWatchlist = 2;
      final int _cursorIndexOfWatched = 3;
      final int _cursorIndexOfPlays = 4;
      final List<SgMovieFlags> _result = new ArrayList<SgMovieFlags>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgMovieFlags _item;
        final int _tmpTmdbId;
        _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        final boolean _tmpInCollection;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfInCollection);
        _tmpInCollection = _tmp != 0;
        final boolean _tmpInWatchlist;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfInWatchlist);
        _tmpInWatchlist = _tmp_1 != 0;
        final boolean _tmpWatched;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
        _tmpWatched = _tmp_2 != 0;
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgMovieFlags(_tmpTmdbId,_tmpInCollection,_tmpInWatchlist,_tmpWatched,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SgMovieFlags> getMovieFlags() {
    final String _sql = "SELECT movies_tmdbid, movies_incollection, movies_inwatchlist, movies_watched, movies_plays FROM movies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTmdbId = 0;
      final int _cursorIndexOfInCollection = 1;
      final int _cursorIndexOfInWatchlist = 2;
      final int _cursorIndexOfWatched = 3;
      final int _cursorIndexOfPlays = 4;
      final List<SgMovieFlags> _result = new ArrayList<SgMovieFlags>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgMovieFlags _item;
        final int _tmpTmdbId;
        _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        final boolean _tmpInCollection;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfInCollection);
        _tmpInCollection = _tmp != 0;
        final boolean _tmpInWatchlist;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfInWatchlist);
        _tmpInWatchlist = _tmp_1 != 0;
        final boolean _tmpWatched;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
        _tmpWatched = _tmp_2 != 0;
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _item = new SgMovieFlags(_tmpTmdbId,_tmpInCollection,_tmpInWatchlist,_tmpWatched,_tmpPlays);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SgMovieFlags getMovieFlags(final int tmdbId) {
    final String _sql = "SELECT movies_tmdbid, movies_incollection, movies_inwatchlist, movies_watched, movies_plays\n"
            + "            FROM movies WHERE movies_tmdbid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTmdbId = 0;
      final int _cursorIndexOfInCollection = 1;
      final int _cursorIndexOfInWatchlist = 2;
      final int _cursorIndexOfWatched = 3;
      final int _cursorIndexOfPlays = 4;
      final SgMovieFlags _result;
      if(_cursor.moveToFirst()) {
        final int _tmpTmdbId;
        _tmpTmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        final boolean _tmpInCollection;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfInCollection);
        _tmpInCollection = _tmp != 0;
        final boolean _tmpInWatchlist;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfInWatchlist);
        _tmpInWatchlist = _tmp_1 != 0;
        final boolean _tmpWatched;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
        _tmpWatched = _tmp_2 != 0;
        final int _tmpPlays;
        _tmpPlays = _cursor.getInt(_cursorIndexOfPlays);
        _result = new SgMovieFlags(_tmpTmdbId,_tmpInCollection,_tmpInWatchlist,_tmpWatched,_tmpPlays);
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
  public int countMovies() {
    final String _sql = "SELECT COUNT(_id) FROM movies";
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
  public MovieStats getStatsInWatchlist() {
    final String _sql = "SELECT COUNT(_id) as count, SUM(movies_runtime) as runtime FROM movies WHERE movies_inwatchlist = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCount = 0;
      final int _cursorIndexOfRuntime = 1;
      final MovieStats _result;
      if(_cursor.moveToFirst()) {
        final int _tmpCount;
        _tmpCount = _cursor.getInt(_cursorIndexOfCount);
        final long _tmpRuntime;
        _tmpRuntime = _cursor.getLong(_cursorIndexOfRuntime);
        _result = new MovieStats(_tmpCount,_tmpRuntime);
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
  public MovieStats getStatsInCollection() {
    final String _sql = "SELECT COUNT(_id) as count, SUM(movies_runtime) as runtime FROM movies WHERE movies_incollection = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCount = 0;
      final int _cursorIndexOfRuntime = 1;
      final MovieStats _result;
      if(_cursor.moveToFirst()) {
        final int _tmpCount;
        _tmpCount = _cursor.getInt(_cursorIndexOfCount);
        final long _tmpRuntime;
        _tmpRuntime = _cursor.getLong(_cursorIndexOfRuntime);
        _result = new MovieStats(_tmpCount,_tmpRuntime);
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
  public MovieStats getStatsWatched() {
    final String _sql = "SELECT COUNT(_id) as count, SUM(movies_runtime) as runtime FROM movies WHERE movies_watched = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCount = 0;
      final int _cursorIndexOfRuntime = 1;
      final MovieStats _result;
      if(_cursor.moveToFirst()) {
        final int _tmpCount;
        _tmpCount = _cursor.getInt(_cursorIndexOfCount);
        final long _tmpRuntime;
        _tmpRuntime = _cursor.getLong(_cursorIndexOfRuntime);
        _result = new MovieStats(_tmpCount,_tmpRuntime);
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
  public String getMovieTitle(final int tmdbId) {
    final String _sql = "SELECT movies_title FROM movies WHERE movies_tmdbid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
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
  public List<SgMovie> getAllMovies() {
    final String _sql = "SELECT * FROM movies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_tmdbid");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_imdbid");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_title");
      final int _cursorIndexOfTitleNoArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_title_noarticle");
      final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_poster");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_genres");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_overview");
      final int _cursorIndexOfReleasedMs = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_released");
      final int _cursorIndexOfRuntimeMin = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_runtime");
      final int _cursorIndexOfTrailer = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_trailer");
      final int _cursorIndexOfCertification = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_certification");
      final int _cursorIndexOfInCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_incollection");
      final int _cursorIndexOfInWatchlist = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_inwatchlist");
      final int _cursorIndexOfPlays = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_plays");
      final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_watched");
      final int _cursorIndexOfRatingTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_tmdb");
      final int _cursorIndexOfRatingVotesTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_votes_tmdb");
      final int _cursorIndexOfRatingTrakt = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_trakt");
      final int _cursorIndexOfRatingVotesTrakt = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_votes_trakt");
      final int _cursorIndexOfRatingUser = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_rating_user");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_last_updated");
      final List<SgMovie> _result = new ArrayList<SgMovie>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SgMovie _item;
        _item = new SgMovie();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getInt(_cursorIndexOfId);
        }
        _item.tmdbId = _cursor.getInt(_cursorIndexOfTmdbId);
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _item.imdbId = null;
        } else {
          _item.imdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _item.title = null;
        } else {
          _item.title = _cursor.getString(_cursorIndexOfTitle);
        }
        if (_cursor.isNull(_cursorIndexOfTitleNoArticle)) {
          _item.titleNoArticle = null;
        } else {
          _item.titleNoArticle = _cursor.getString(_cursorIndexOfTitleNoArticle);
        }
        if (_cursor.isNull(_cursorIndexOfPoster)) {
          _item.poster = null;
        } else {
          _item.poster = _cursor.getString(_cursorIndexOfPoster);
        }
        if (_cursor.isNull(_cursorIndexOfGenres)) {
          _item.genres = null;
        } else {
          _item.genres = _cursor.getString(_cursorIndexOfGenres);
        }
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _item.overview = null;
        } else {
          _item.overview = _cursor.getString(_cursorIndexOfOverview);
        }
        if (_cursor.isNull(_cursorIndexOfReleasedMs)) {
          _item.releasedMs = null;
        } else {
          _item.releasedMs = _cursor.getLong(_cursorIndexOfReleasedMs);
        }
        if (_cursor.isNull(_cursorIndexOfRuntimeMin)) {
          _item.runtimeMin = null;
        } else {
          _item.runtimeMin = _cursor.getInt(_cursorIndexOfRuntimeMin);
        }
        if (_cursor.isNull(_cursorIndexOfTrailer)) {
          _item.trailer = null;
        } else {
          _item.trailer = _cursor.getString(_cursorIndexOfTrailer);
        }
        if (_cursor.isNull(_cursorIndexOfCertification)) {
          _item.certification = null;
        } else {
          _item.certification = _cursor.getString(_cursorIndexOfCertification);
        }
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfInCollection)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfInCollection);
        }
        _item.inCollection = _tmp == null ? null : _tmp != 0;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfInWatchlist)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfInWatchlist);
        }
        _item.inWatchlist = _tmp_1 == null ? null : _tmp_1 != 0;
        if (_cursor.isNull(_cursorIndexOfPlays)) {
          _item.plays = null;
        } else {
          _item.plays = _cursor.getInt(_cursorIndexOfPlays);
        }
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfWatched)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
        }
        _item.watched = _tmp_2 == null ? null : _tmp_2 != 0;
        if (_cursor.isNull(_cursorIndexOfRatingTmdb)) {
          _item.ratingTmdb = null;
        } else {
          _item.ratingTmdb = _cursor.getDouble(_cursorIndexOfRatingTmdb);
        }
        if (_cursor.isNull(_cursorIndexOfRatingVotesTmdb)) {
          _item.ratingVotesTmdb = null;
        } else {
          _item.ratingVotesTmdb = _cursor.getInt(_cursorIndexOfRatingVotesTmdb);
        }
        if (_cursor.isNull(_cursorIndexOfRatingTrakt)) {
          _item.ratingTrakt = null;
        } else {
          _item.ratingTrakt = _cursor.getInt(_cursorIndexOfRatingTrakt);
        }
        if (_cursor.isNull(_cursorIndexOfRatingVotesTrakt)) {
          _item.ratingVotesTrakt = null;
        } else {
          _item.ratingVotesTrakt = _cursor.getInt(_cursorIndexOfRatingVotesTrakt);
        }
        if (_cursor.isNull(_cursorIndexOfRatingUser)) {
          _item.ratingUser = null;
        } else {
          _item.ratingUser = _cursor.getInt(_cursorIndexOfRatingUser);
        }
        if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
          _item.lastUpdated = null;
        } else {
          _item.lastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
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
  public PagingSource<Integer, SgMovie> getWatchedMovies(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return new LimitOffsetPagingSource<SgMovie>(_internalQuery, __db, "movies") {
      @Override
      protected List<SgMovie> convertRows(Cursor cursor) {
        final List<SgMovie> _result = new ArrayList<SgMovie>(cursor.getCount());
        while(cursor.moveToNext()) {
          final SgMovie _item;
          _item = __entityCursorConverter_comBattlelancerSeriesguideMoviesDatabaseSgMovie(cursor);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private SgMovie __entityCursorConverter_comBattlelancerSeriesguideMoviesDatabaseSgMovie(
      Cursor cursor) {
    final SgMovie _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("_id");
    final int _cursorIndexOfTmdbId = cursor.getColumnIndex("movies_tmdbid");
    final int _cursorIndexOfImdbId = cursor.getColumnIndex("movies_imdbid");
    final int _cursorIndexOfTitle = cursor.getColumnIndex("movies_title");
    final int _cursorIndexOfTitleNoArticle = cursor.getColumnIndex("movies_title_noarticle");
    final int _cursorIndexOfPoster = cursor.getColumnIndex("movies_poster");
    final int _cursorIndexOfGenres = cursor.getColumnIndex("movies_genres");
    final int _cursorIndexOfOverview = cursor.getColumnIndex("movies_overview");
    final int _cursorIndexOfReleasedMs = cursor.getColumnIndex("movies_released");
    final int _cursorIndexOfRuntimeMin = cursor.getColumnIndex("movies_runtime");
    final int _cursorIndexOfTrailer = cursor.getColumnIndex("movies_trailer");
    final int _cursorIndexOfCertification = cursor.getColumnIndex("movies_certification");
    final int _cursorIndexOfInCollection = cursor.getColumnIndex("movies_incollection");
    final int _cursorIndexOfInWatchlist = cursor.getColumnIndex("movies_inwatchlist");
    final int _cursorIndexOfPlays = cursor.getColumnIndex("movies_plays");
    final int _cursorIndexOfWatched = cursor.getColumnIndex("movies_watched");
    final int _cursorIndexOfRatingTmdb = cursor.getColumnIndex("movies_rating_tmdb");
    final int _cursorIndexOfRatingVotesTmdb = cursor.getColumnIndex("movies_rating_votes_tmdb");
    final int _cursorIndexOfRatingTrakt = cursor.getColumnIndex("movies_rating_trakt");
    final int _cursorIndexOfRatingVotesTrakt = cursor.getColumnIndex("movies_rating_votes_trakt");
    final int _cursorIndexOfRatingUser = cursor.getColumnIndex("movies_rating_user");
    final int _cursorIndexOfLastUpdated = cursor.getColumnIndex("movies_last_updated");
    _entity = new SgMovie();
    if (_cursorIndexOfId != -1) {
      if (cursor.isNull(_cursorIndexOfId)) {
        _entity.id = null;
      } else {
        _entity.id = cursor.getInt(_cursorIndexOfId);
      }
    }
    if (_cursorIndexOfTmdbId != -1) {
      _entity.tmdbId = cursor.getInt(_cursorIndexOfTmdbId);
    }
    if (_cursorIndexOfImdbId != -1) {
      if (cursor.isNull(_cursorIndexOfImdbId)) {
        _entity.imdbId = null;
      } else {
        _entity.imdbId = cursor.getString(_cursorIndexOfImdbId);
      }
    }
    if (_cursorIndexOfTitle != -1) {
      if (cursor.isNull(_cursorIndexOfTitle)) {
        _entity.title = null;
      } else {
        _entity.title = cursor.getString(_cursorIndexOfTitle);
      }
    }
    if (_cursorIndexOfTitleNoArticle != -1) {
      if (cursor.isNull(_cursorIndexOfTitleNoArticle)) {
        _entity.titleNoArticle = null;
      } else {
        _entity.titleNoArticle = cursor.getString(_cursorIndexOfTitleNoArticle);
      }
    }
    if (_cursorIndexOfPoster != -1) {
      if (cursor.isNull(_cursorIndexOfPoster)) {
        _entity.poster = null;
      } else {
        _entity.poster = cursor.getString(_cursorIndexOfPoster);
      }
    }
    if (_cursorIndexOfGenres != -1) {
      if (cursor.isNull(_cursorIndexOfGenres)) {
        _entity.genres = null;
      } else {
        _entity.genres = cursor.getString(_cursorIndexOfGenres);
      }
    }
    if (_cursorIndexOfOverview != -1) {
      if (cursor.isNull(_cursorIndexOfOverview)) {
        _entity.overview = null;
      } else {
        _entity.overview = cursor.getString(_cursorIndexOfOverview);
      }
    }
    if (_cursorIndexOfReleasedMs != -1) {
      if (cursor.isNull(_cursorIndexOfReleasedMs)) {
        _entity.releasedMs = null;
      } else {
        _entity.releasedMs = cursor.getLong(_cursorIndexOfReleasedMs);
      }
    }
    if (_cursorIndexOfRuntimeMin != -1) {
      if (cursor.isNull(_cursorIndexOfRuntimeMin)) {
        _entity.runtimeMin = null;
      } else {
        _entity.runtimeMin = cursor.getInt(_cursorIndexOfRuntimeMin);
      }
    }
    if (_cursorIndexOfTrailer != -1) {
      if (cursor.isNull(_cursorIndexOfTrailer)) {
        _entity.trailer = null;
      } else {
        _entity.trailer = cursor.getString(_cursorIndexOfTrailer);
      }
    }
    if (_cursorIndexOfCertification != -1) {
      if (cursor.isNull(_cursorIndexOfCertification)) {
        _entity.certification = null;
      } else {
        _entity.certification = cursor.getString(_cursorIndexOfCertification);
      }
    }
    if (_cursorIndexOfInCollection != -1) {
      final Integer _tmp;
      if (cursor.isNull(_cursorIndexOfInCollection)) {
        _tmp = null;
      } else {
        _tmp = cursor.getInt(_cursorIndexOfInCollection);
      }
      _entity.inCollection = _tmp == null ? null : _tmp != 0;
    }
    if (_cursorIndexOfInWatchlist != -1) {
      final Integer _tmp_1;
      if (cursor.isNull(_cursorIndexOfInWatchlist)) {
        _tmp_1 = null;
      } else {
        _tmp_1 = cursor.getInt(_cursorIndexOfInWatchlist);
      }
      _entity.inWatchlist = _tmp_1 == null ? null : _tmp_1 != 0;
    }
    if (_cursorIndexOfPlays != -1) {
      if (cursor.isNull(_cursorIndexOfPlays)) {
        _entity.plays = null;
      } else {
        _entity.plays = cursor.getInt(_cursorIndexOfPlays);
      }
    }
    if (_cursorIndexOfWatched != -1) {
      final Integer _tmp_2;
      if (cursor.isNull(_cursorIndexOfWatched)) {
        _tmp_2 = null;
      } else {
        _tmp_2 = cursor.getInt(_cursorIndexOfWatched);
      }
      _entity.watched = _tmp_2 == null ? null : _tmp_2 != 0;
    }
    if (_cursorIndexOfRatingTmdb != -1) {
      if (cursor.isNull(_cursorIndexOfRatingTmdb)) {
        _entity.ratingTmdb = null;
      } else {
        _entity.ratingTmdb = cursor.getDouble(_cursorIndexOfRatingTmdb);
      }
    }
    if (_cursorIndexOfRatingVotesTmdb != -1) {
      if (cursor.isNull(_cursorIndexOfRatingVotesTmdb)) {
        _entity.ratingVotesTmdb = null;
      } else {
        _entity.ratingVotesTmdb = cursor.getInt(_cursorIndexOfRatingVotesTmdb);
      }
    }
    if (_cursorIndexOfRatingTrakt != -1) {
      if (cursor.isNull(_cursorIndexOfRatingTrakt)) {
        _entity.ratingTrakt = null;
      } else {
        _entity.ratingTrakt = cursor.getInt(_cursorIndexOfRatingTrakt);
      }
    }
    if (_cursorIndexOfRatingVotesTrakt != -1) {
      if (cursor.isNull(_cursorIndexOfRatingVotesTrakt)) {
        _entity.ratingVotesTrakt = null;
      } else {
        _entity.ratingVotesTrakt = cursor.getInt(_cursorIndexOfRatingVotesTrakt);
      }
    }
    if (_cursorIndexOfRatingUser != -1) {
      if (cursor.isNull(_cursorIndexOfRatingUser)) {
        _entity.ratingUser = null;
      } else {
        _entity.ratingUser = cursor.getInt(_cursorIndexOfRatingUser);
      }
    }
    if (_cursorIndexOfLastUpdated != -1) {
      if (cursor.isNull(_cursorIndexOfLastUpdated)) {
        _entity.lastUpdated = null;
      } else {
        _entity.lastUpdated = cursor.getLong(_cursorIndexOfLastUpdated);
      }
    }
    return _entity;
  }
}
