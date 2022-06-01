package com.battlelancer.seriesguide.provider;

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
import com.battlelancer.seriesguide.lists.database.SgListHelper;
import com.battlelancer.seriesguide.lists.database.SgListHelper_Impl;
import com.battlelancer.seriesguide.movies.database.MovieHelper;
import com.battlelancer.seriesguide.movies.database.MovieHelper_Impl;
import com.battlelancer.seriesguide.shows.database.SgEpisode2Helper;
import com.battlelancer.seriesguide.shows.database.SgEpisode2Helper_Impl;
import com.battlelancer.seriesguide.shows.database.SgSeason2Helper;
import com.battlelancer.seriesguide.shows.database.SgSeason2Helper_Impl;
import com.battlelancer.seriesguide.shows.database.SgShow2Helper;
import com.battlelancer.seriesguide.shows.database.SgShow2Helper_Impl;
import com.battlelancer.seriesguide.shows.history.SgActivityHelper;
import com.battlelancer.seriesguide.shows.history.SgActivityHelper_Impl;
import com.battlelancer.seriesguide.streaming.SgWatchProviderHelper;
import com.battlelancer.seriesguide.streaming.SgWatchProviderHelper_Impl;
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
public final class SgRoomDatabase_Impl extends SgRoomDatabase {
  private volatile SgShow2Helper _sgShow2Helper;

  private volatile SgSeason2Helper _sgSeason2Helper;

  private volatile SgEpisode2Helper _sgEpisode2Helper;

  private volatile SgActivityHelper _sgActivityHelper;

  private volatile SgListHelper _sgListHelper;

  private volatile MovieHelper _movieHelper;

  private volatile SgWatchProviderHelper _sgWatchProviderHelper;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(50) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `series` (`_id` INTEGER NOT NULL, `series_slug` TEXT, `seriestitle` TEXT NOT NULL, `series_title_noarticle` TEXT, `overview` TEXT, `airstime` INTEGER, `airsdayofweek` INTEGER, `series_airtime` TEXT, `series_timezone` TEXT, `firstaired` TEXT, `genres` TEXT, `network` TEXT, `rating` REAL, `series_rating_votes` INTEGER, `series_rating_user` INTEGER, `runtime` TEXT, `status` TEXT, `contentrating` TEXT, `next` TEXT, `poster` TEXT, `series_poster_small` TEXT, `series_nextairdate` INTEGER, `nexttext` TEXT, `imdbid` TEXT, `series_trakt_id` INTEGER, `series_favorite` INTEGER NOT NULL, `series_syncenabled` INTEGER NOT NULL, `series_hidden` INTEGER NOT NULL, `series_lastupdate` INTEGER NOT NULL, `series_lastedit` INTEGER NOT NULL, `series_lastwatchedid` INTEGER NOT NULL, `series_lastwatched_ms` INTEGER NOT NULL, `series_language` TEXT, `series_unwatched_count` INTEGER NOT NULL, `series_notify` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `seasons` (`_id` INTEGER, `combinednr` INTEGER, `series_id` TEXT, `watchcount` INTEGER, `willaircount` INTEGER, `noairdatecount` INTEGER, `seasonposter` TEXT, `season_totalcount` INTEGER, PRIMARY KEY(`_id`), FOREIGN KEY(`series_id`) REFERENCES `series`(`_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_seasons_series_id` ON `seasons` (`series_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `episodes` (`_id` INTEGER NOT NULL, `episodetitle` TEXT NOT NULL, `episodedescription` TEXT, `episodenumber` INTEGER NOT NULL, `season` INTEGER NOT NULL, `dvdnumber` REAL, `season_id` INTEGER NOT NULL, `series_id` INTEGER NOT NULL, `watched` INTEGER NOT NULL, `plays` INTEGER, `directors` TEXT, `gueststars` TEXT, `writers` TEXT, `episodeimage` TEXT, `episode_firstairedms` INTEGER NOT NULL, `episode_collected` INTEGER NOT NULL, `rating` REAL, `episode_rating_votes` INTEGER, `episode_rating_user` INTEGER, `episode_imdbid` TEXT, `episode_lastedit` INTEGER NOT NULL, `absolute_number` INTEGER, `episode_lastupdate` INTEGER NOT NULL, PRIMARY KEY(`_id`), FOREIGN KEY(`season_id`) REFERENCES `seasons`(`_id`) ON UPDATE NO ACTION ON DELETE NO ACTION , FOREIGN KEY(`series_id`) REFERENCES `series`(`_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_episodes_season_id` ON `episodes` (`season_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_episodes_series_id` ON `episodes` (`series_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sg_show` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `series_tmdb_id` INTEGER, `series_tvdb_id` INTEGER, `series_slug` TEXT, `series_trakt_id` INTEGER, `series_title` TEXT NOT NULL, `series_title_noarticle` TEXT, `series_overview` TEXT, `series_airstime` INTEGER, `series_airsdayofweek` INTEGER, `series_country` TEXT, `series_timezone` TEXT, `series_firstaired` TEXT, `series_genres` TEXT, `series_network` TEXT, `series_imdbid` TEXT, `series_rating` REAL, `series_rating_votes` INTEGER, `series_rating_user` INTEGER, `series_runtime` INTEGER, `series_status` INTEGER, `series_contentrating` TEXT, `series_next` TEXT, `series_poster` TEXT, `series_poster_small` TEXT, `series_nextairdate` INTEGER, `series_nexttext` TEXT, `series_lastupdate` INTEGER NOT NULL, `series_lastedit` INTEGER NOT NULL, `series_lastwatchedid` INTEGER NOT NULL, `series_lastwatched_ms` INTEGER NOT NULL, `series_language` TEXT, `series_unwatched_count` INTEGER NOT NULL, `series_favorite` INTEGER NOT NULL, `series_hidden` INTEGER NOT NULL, `series_notify` INTEGER NOT NULL, `series_syncenabled` INTEGER NOT NULL)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_show_series_tmdb_id` ON `sg_show` (`series_tmdb_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_show_series_tvdb_id` ON `sg_show` (`series_tvdb_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sg_season` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `series_id` INTEGER NOT NULL, `season_tmdb_id` TEXT, `season_tvdb_id` INTEGER, `season_number` INTEGER, `season_name` TEXT, `season_order` INTEGER NOT NULL, `season_watchcount` INTEGER, `season_willaircount` INTEGER, `season_noairdatecount` INTEGER, `season_totalcount` INTEGER, `season_tags` TEXT, FOREIGN KEY(`series_id`) REFERENCES `sg_show`(`_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_season_series_id` ON `sg_season` (`series_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sg_episode` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `season_id` INTEGER NOT NULL, `series_id` INTEGER NOT NULL, `episode_tmdb_id` INTEGER, `episode_tvdb_id` INTEGER, `episode_title` TEXT, `episode_description` TEXT, `episode_number` INTEGER NOT NULL, `episode_absolute_number` INTEGER, `episode_season_number` INTEGER NOT NULL, `episode_order` INTEGER NOT NULL, `episode_dvd_number` REAL, `episode_watched` INTEGER NOT NULL, `episode_plays` INTEGER, `episode_collected` INTEGER NOT NULL, `episode_directors` TEXT, `episode_gueststars` TEXT, `episode_writers` TEXT, `episode_image` TEXT, `episode_firstairedms` INTEGER NOT NULL, `episode_rating` REAL, `episode_rating_votes` INTEGER, `episode_rating_user` INTEGER, `episode_imdbid` TEXT, `episode_lastedit` INTEGER NOT NULL, `episode_lastupdate` INTEGER NOT NULL, FOREIGN KEY(`series_id`) REFERENCES `sg_show`(`_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_episode_season_id` ON `sg_episode` (`season_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_episode_series_id` ON `sg_episode` (`series_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `lists` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `list_id` TEXT NOT NULL, `list_name` TEXT NOT NULL, `list_order` INTEGER)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_lists_list_id` ON `lists` (`list_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `listitems` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `list_item_id` TEXT NOT NULL, `item_ref_id` TEXT NOT NULL, `item_type` INTEGER NOT NULL, `list_id` TEXT, FOREIGN KEY(`list_id`) REFERENCES `lists`(`list_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_listitems_list_item_id` ON `listitems` (`list_item_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_listitems_list_id` ON `listitems` (`list_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movies` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `movies_tmdbid` INTEGER NOT NULL, `movies_imdbid` TEXT, `movies_title` TEXT, `movies_title_noarticle` TEXT, `movies_poster` TEXT, `movies_genres` TEXT, `movies_overview` TEXT, `movies_released` INTEGER, `movies_runtime` INTEGER, `movies_trailer` TEXT, `movies_certification` TEXT, `movies_incollection` INTEGER, `movies_inwatchlist` INTEGER, `movies_plays` INTEGER, `movies_watched` INTEGER, `movies_rating_tmdb` REAL, `movies_rating_votes_tmdb` INTEGER, `movies_rating_trakt` INTEGER, `movies_rating_votes_trakt` INTEGER, `movies_rating_user` INTEGER, `movies_last_updated` INTEGER)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_movies_movies_tmdbid` ON `movies` (`movies_tmdbid`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `activity` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `activity_episode` TEXT NOT NULL, `activity_show` TEXT NOT NULL, `activity_time` INTEGER NOT NULL, `activity_type` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_activity_activity_episode_activity_type` ON `activity` (`activity_episode`, `activity_type`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `jobs` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `job_created_at` INTEGER, `job_type` INTEGER, `job_extras` BLOB)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_jobs_job_created_at` ON `jobs` (`job_created_at`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sg_watch_provider` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `provider_id` INTEGER NOT NULL, `provider_name` TEXT NOT NULL, `display_priority` INTEGER NOT NULL, `logo_path` TEXT NOT NULL, `type` INTEGER NOT NULL, `enabled` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_sg_watch_provider_provider_id_type` ON `sg_watch_provider` (`provider_id`, `type`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_watch_provider_provider_name` ON `sg_watch_provider` (`provider_name`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_watch_provider_display_priority` ON `sg_watch_provider` (`display_priority`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_watch_provider_enabled` ON `sg_watch_provider` (`enabled`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_sg_watch_provider_type` ON `sg_watch_provider` (`type`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2014283a74737b9a9eeb23e7db8355a8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `series`");
        _db.execSQL("DROP TABLE IF EXISTS `seasons`");
        _db.execSQL("DROP TABLE IF EXISTS `episodes`");
        _db.execSQL("DROP TABLE IF EXISTS `sg_show`");
        _db.execSQL("DROP TABLE IF EXISTS `sg_season`");
        _db.execSQL("DROP TABLE IF EXISTS `sg_episode`");
        _db.execSQL("DROP TABLE IF EXISTS `lists`");
        _db.execSQL("DROP TABLE IF EXISTS `listitems`");
        _db.execSQL("DROP TABLE IF EXISTS `movies`");
        _db.execSQL("DROP TABLE IF EXISTS `activity`");
        _db.execSQL("DROP TABLE IF EXISTS `jobs`");
        _db.execSQL("DROP TABLE IF EXISTS `sg_watch_provider`");
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
        _db.execSQL("PRAGMA foreign_keys = ON");
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
        final HashMap<String, TableInfo.Column> _columnsSeries = new HashMap<String, TableInfo.Column>(35);
        _columnsSeries.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_slug", new TableInfo.Column("series_slug", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("seriestitle", new TableInfo.Column("seriestitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_title_noarticle", new TableInfo.Column("series_title_noarticle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("airstime", new TableInfo.Column("airstime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("airsdayofweek", new TableInfo.Column("airsdayofweek", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_airtime", new TableInfo.Column("series_airtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_timezone", new TableInfo.Column("series_timezone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("firstaired", new TableInfo.Column("firstaired", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("network", new TableInfo.Column("network", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("rating", new TableInfo.Column("rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_rating_votes", new TableInfo.Column("series_rating_votes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_rating_user", new TableInfo.Column("series_rating_user", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("contentrating", new TableInfo.Column("contentrating", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("next", new TableInfo.Column("next", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("poster", new TableInfo.Column("poster", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_poster_small", new TableInfo.Column("series_poster_small", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_nextairdate", new TableInfo.Column("series_nextairdate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("nexttext", new TableInfo.Column("nexttext", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("imdbid", new TableInfo.Column("imdbid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_trakt_id", new TableInfo.Column("series_trakt_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_favorite", new TableInfo.Column("series_favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_syncenabled", new TableInfo.Column("series_syncenabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_hidden", new TableInfo.Column("series_hidden", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_lastupdate", new TableInfo.Column("series_lastupdate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_lastedit", new TableInfo.Column("series_lastedit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_lastwatchedid", new TableInfo.Column("series_lastwatchedid", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_lastwatched_ms", new TableInfo.Column("series_lastwatched_ms", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_language", new TableInfo.Column("series_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_unwatched_count", new TableInfo.Column("series_unwatched_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_notify", new TableInfo.Column("series_notify", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSeries = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSeries = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSeries = new TableInfo("series", _columnsSeries, _foreignKeysSeries, _indicesSeries);
        final TableInfo _existingSeries = TableInfo.read(_db, "series");
        if (! _infoSeries.equals(_existingSeries)) {
          return new RoomOpenHelper.ValidationResult(false, "series(com.battlelancer.seriesguide.shows.database.SgShow).\n"
                  + " Expected:\n" + _infoSeries + "\n"
                  + " Found:\n" + _existingSeries);
        }
        final HashMap<String, TableInfo.Column> _columnsSeasons = new HashMap<String, TableInfo.Column>(8);
        _columnsSeasons.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeasons.put("combinednr", new TableInfo.Column("combinednr", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeasons.put("series_id", new TableInfo.Column("series_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeasons.put("watchcount", new TableInfo.Column("watchcount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeasons.put("willaircount", new TableInfo.Column("willaircount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeasons.put("noairdatecount", new TableInfo.Column("noairdatecount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeasons.put("seasonposter", new TableInfo.Column("seasonposter", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeasons.put("season_totalcount", new TableInfo.Column("season_totalcount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSeasons = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysSeasons.add(new TableInfo.ForeignKey("series", "NO ACTION", "NO ACTION",Arrays.asList("series_id"), Arrays.asList("_id")));
        final HashSet<TableInfo.Index> _indicesSeasons = new HashSet<TableInfo.Index>(1);
        _indicesSeasons.add(new TableInfo.Index("index_seasons_series_id", false, Arrays.asList("series_id"), Arrays.asList("ASC")));
        final TableInfo _infoSeasons = new TableInfo("seasons", _columnsSeasons, _foreignKeysSeasons, _indicesSeasons);
        final TableInfo _existingSeasons = TableInfo.read(_db, "seasons");
        if (! _infoSeasons.equals(_existingSeasons)) {
          return new RoomOpenHelper.ValidationResult(false, "seasons(com.battlelancer.seriesguide.shows.database.SgSeason).\n"
                  + " Expected:\n" + _infoSeasons + "\n"
                  + " Found:\n" + _existingSeasons);
        }
        final HashMap<String, TableInfo.Column> _columnsEpisodes = new HashMap<String, TableInfo.Column>(23);
        _columnsEpisodes.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episodetitle", new TableInfo.Column("episodetitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episodedescription", new TableInfo.Column("episodedescription", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episodenumber", new TableInfo.Column("episodenumber", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("season", new TableInfo.Column("season", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("dvdnumber", new TableInfo.Column("dvdnumber", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("season_id", new TableInfo.Column("season_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("series_id", new TableInfo.Column("series_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("watched", new TableInfo.Column("watched", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("plays", new TableInfo.Column("plays", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("directors", new TableInfo.Column("directors", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("gueststars", new TableInfo.Column("gueststars", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("writers", new TableInfo.Column("writers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episodeimage", new TableInfo.Column("episodeimage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episode_firstairedms", new TableInfo.Column("episode_firstairedms", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episode_collected", new TableInfo.Column("episode_collected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("rating", new TableInfo.Column("rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episode_rating_votes", new TableInfo.Column("episode_rating_votes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episode_rating_user", new TableInfo.Column("episode_rating_user", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episode_imdbid", new TableInfo.Column("episode_imdbid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episode_lastedit", new TableInfo.Column("episode_lastedit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("absolute_number", new TableInfo.Column("absolute_number", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisodes.put("episode_lastupdate", new TableInfo.Column("episode_lastupdate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEpisodes = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysEpisodes.add(new TableInfo.ForeignKey("seasons", "NO ACTION", "NO ACTION",Arrays.asList("season_id"), Arrays.asList("_id")));
        _foreignKeysEpisodes.add(new TableInfo.ForeignKey("series", "NO ACTION", "NO ACTION",Arrays.asList("series_id"), Arrays.asList("_id")));
        final HashSet<TableInfo.Index> _indicesEpisodes = new HashSet<TableInfo.Index>(2);
        _indicesEpisodes.add(new TableInfo.Index("index_episodes_season_id", false, Arrays.asList("season_id"), Arrays.asList("ASC")));
        _indicesEpisodes.add(new TableInfo.Index("index_episodes_series_id", false, Arrays.asList("series_id"), Arrays.asList("ASC")));
        final TableInfo _infoEpisodes = new TableInfo("episodes", _columnsEpisodes, _foreignKeysEpisodes, _indicesEpisodes);
        final TableInfo _existingEpisodes = TableInfo.read(_db, "episodes");
        if (! _infoEpisodes.equals(_existingEpisodes)) {
          return new RoomOpenHelper.ValidationResult(false, "episodes(com.battlelancer.seriesguide.shows.database.SgEpisode).\n"
                  + " Expected:\n" + _infoEpisodes + "\n"
                  + " Found:\n" + _existingEpisodes);
        }
        final HashMap<String, TableInfo.Column> _columnsSgShow = new HashMap<String, TableInfo.Column>(37);
        _columnsSgShow.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_tmdb_id", new TableInfo.Column("series_tmdb_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_tvdb_id", new TableInfo.Column("series_tvdb_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_slug", new TableInfo.Column("series_slug", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_trakt_id", new TableInfo.Column("series_trakt_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_title", new TableInfo.Column("series_title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_title_noarticle", new TableInfo.Column("series_title_noarticle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_overview", new TableInfo.Column("series_overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_airstime", new TableInfo.Column("series_airstime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_airsdayofweek", new TableInfo.Column("series_airsdayofweek", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_country", new TableInfo.Column("series_country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_timezone", new TableInfo.Column("series_timezone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_firstaired", new TableInfo.Column("series_firstaired", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_genres", new TableInfo.Column("series_genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_network", new TableInfo.Column("series_network", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_imdbid", new TableInfo.Column("series_imdbid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_rating", new TableInfo.Column("series_rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_rating_votes", new TableInfo.Column("series_rating_votes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_rating_user", new TableInfo.Column("series_rating_user", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_runtime", new TableInfo.Column("series_runtime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_status", new TableInfo.Column("series_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_contentrating", new TableInfo.Column("series_contentrating", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_next", new TableInfo.Column("series_next", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_poster", new TableInfo.Column("series_poster", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_poster_small", new TableInfo.Column("series_poster_small", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_nextairdate", new TableInfo.Column("series_nextairdate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_nexttext", new TableInfo.Column("series_nexttext", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_lastupdate", new TableInfo.Column("series_lastupdate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_lastedit", new TableInfo.Column("series_lastedit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_lastwatchedid", new TableInfo.Column("series_lastwatchedid", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_lastwatched_ms", new TableInfo.Column("series_lastwatched_ms", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_language", new TableInfo.Column("series_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_unwatched_count", new TableInfo.Column("series_unwatched_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_favorite", new TableInfo.Column("series_favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_hidden", new TableInfo.Column("series_hidden", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_notify", new TableInfo.Column("series_notify", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgShow.put("series_syncenabled", new TableInfo.Column("series_syncenabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSgShow = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSgShow = new HashSet<TableInfo.Index>(2);
        _indicesSgShow.add(new TableInfo.Index("index_sg_show_series_tmdb_id", false, Arrays.asList("series_tmdb_id"), Arrays.asList("ASC")));
        _indicesSgShow.add(new TableInfo.Index("index_sg_show_series_tvdb_id", false, Arrays.asList("series_tvdb_id"), Arrays.asList("ASC")));
        final TableInfo _infoSgShow = new TableInfo("sg_show", _columnsSgShow, _foreignKeysSgShow, _indicesSgShow);
        final TableInfo _existingSgShow = TableInfo.read(_db, "sg_show");
        if (! _infoSgShow.equals(_existingSgShow)) {
          return new RoomOpenHelper.ValidationResult(false, "sg_show(com.battlelancer.seriesguide.shows.database.SgShow2).\n"
                  + " Expected:\n" + _infoSgShow + "\n"
                  + " Found:\n" + _existingSgShow);
        }
        final HashMap<String, TableInfo.Column> _columnsSgSeason = new HashMap<String, TableInfo.Column>(12);
        _columnsSgSeason.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("series_id", new TableInfo.Column("series_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_tmdb_id", new TableInfo.Column("season_tmdb_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_tvdb_id", new TableInfo.Column("season_tvdb_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_number", new TableInfo.Column("season_number", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_name", new TableInfo.Column("season_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_order", new TableInfo.Column("season_order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_watchcount", new TableInfo.Column("season_watchcount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_willaircount", new TableInfo.Column("season_willaircount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_noairdatecount", new TableInfo.Column("season_noairdatecount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_totalcount", new TableInfo.Column("season_totalcount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgSeason.put("season_tags", new TableInfo.Column("season_tags", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSgSeason = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysSgSeason.add(new TableInfo.ForeignKey("sg_show", "NO ACTION", "NO ACTION",Arrays.asList("series_id"), Arrays.asList("_id")));
        final HashSet<TableInfo.Index> _indicesSgSeason = new HashSet<TableInfo.Index>(1);
        _indicesSgSeason.add(new TableInfo.Index("index_sg_season_series_id", false, Arrays.asList("series_id"), Arrays.asList("ASC")));
        final TableInfo _infoSgSeason = new TableInfo("sg_season", _columnsSgSeason, _foreignKeysSgSeason, _indicesSgSeason);
        final TableInfo _existingSgSeason = TableInfo.read(_db, "sg_season");
        if (! _infoSgSeason.equals(_existingSgSeason)) {
          return new RoomOpenHelper.ValidationResult(false, "sg_season(com.battlelancer.seriesguide.shows.database.SgSeason2).\n"
                  + " Expected:\n" + _infoSgSeason + "\n"
                  + " Found:\n" + _existingSgSeason);
        }
        final HashMap<String, TableInfo.Column> _columnsSgEpisode = new HashMap<String, TableInfo.Column>(26);
        _columnsSgEpisode.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("season_id", new TableInfo.Column("season_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("series_id", new TableInfo.Column("series_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_tmdb_id", new TableInfo.Column("episode_tmdb_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_tvdb_id", new TableInfo.Column("episode_tvdb_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_title", new TableInfo.Column("episode_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_description", new TableInfo.Column("episode_description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_number", new TableInfo.Column("episode_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_absolute_number", new TableInfo.Column("episode_absolute_number", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_season_number", new TableInfo.Column("episode_season_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_order", new TableInfo.Column("episode_order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_dvd_number", new TableInfo.Column("episode_dvd_number", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_watched", new TableInfo.Column("episode_watched", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_plays", new TableInfo.Column("episode_plays", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_collected", new TableInfo.Column("episode_collected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_directors", new TableInfo.Column("episode_directors", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_gueststars", new TableInfo.Column("episode_gueststars", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_writers", new TableInfo.Column("episode_writers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_image", new TableInfo.Column("episode_image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_firstairedms", new TableInfo.Column("episode_firstairedms", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_rating", new TableInfo.Column("episode_rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_rating_votes", new TableInfo.Column("episode_rating_votes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_rating_user", new TableInfo.Column("episode_rating_user", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_imdbid", new TableInfo.Column("episode_imdbid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_lastedit", new TableInfo.Column("episode_lastedit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgEpisode.put("episode_lastupdate", new TableInfo.Column("episode_lastupdate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSgEpisode = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysSgEpisode.add(new TableInfo.ForeignKey("sg_show", "NO ACTION", "NO ACTION",Arrays.asList("series_id"), Arrays.asList("_id")));
        final HashSet<TableInfo.Index> _indicesSgEpisode = new HashSet<TableInfo.Index>(2);
        _indicesSgEpisode.add(new TableInfo.Index("index_sg_episode_season_id", false, Arrays.asList("season_id"), Arrays.asList("ASC")));
        _indicesSgEpisode.add(new TableInfo.Index("index_sg_episode_series_id", false, Arrays.asList("series_id"), Arrays.asList("ASC")));
        final TableInfo _infoSgEpisode = new TableInfo("sg_episode", _columnsSgEpisode, _foreignKeysSgEpisode, _indicesSgEpisode);
        final TableInfo _existingSgEpisode = TableInfo.read(_db, "sg_episode");
        if (! _infoSgEpisode.equals(_existingSgEpisode)) {
          return new RoomOpenHelper.ValidationResult(false, "sg_episode(com.battlelancer.seriesguide.shows.database.SgEpisode2).\n"
                  + " Expected:\n" + _infoSgEpisode + "\n"
                  + " Found:\n" + _existingSgEpisode);
        }
        final HashMap<String, TableInfo.Column> _columnsLists = new HashMap<String, TableInfo.Column>(4);
        _columnsLists.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLists.put("list_id", new TableInfo.Column("list_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLists.put("list_name", new TableInfo.Column("list_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLists.put("list_order", new TableInfo.Column("list_order", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLists = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLists = new HashSet<TableInfo.Index>(1);
        _indicesLists.add(new TableInfo.Index("index_lists_list_id", true, Arrays.asList("list_id"), Arrays.asList("ASC")));
        final TableInfo _infoLists = new TableInfo("lists", _columnsLists, _foreignKeysLists, _indicesLists);
        final TableInfo _existingLists = TableInfo.read(_db, "lists");
        if (! _infoLists.equals(_existingLists)) {
          return new RoomOpenHelper.ValidationResult(false, "lists(com.battlelancer.seriesguide.lists.database.SgList).\n"
                  + " Expected:\n" + _infoLists + "\n"
                  + " Found:\n" + _existingLists);
        }
        final HashMap<String, TableInfo.Column> _columnsListitems = new HashMap<String, TableInfo.Column>(5);
        _columnsListitems.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsListitems.put("list_item_id", new TableInfo.Column("list_item_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsListitems.put("item_ref_id", new TableInfo.Column("item_ref_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsListitems.put("item_type", new TableInfo.Column("item_type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsListitems.put("list_id", new TableInfo.Column("list_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysListitems = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysListitems.add(new TableInfo.ForeignKey("lists", "NO ACTION", "NO ACTION",Arrays.asList("list_id"), Arrays.asList("list_id")));
        final HashSet<TableInfo.Index> _indicesListitems = new HashSet<TableInfo.Index>(2);
        _indicesListitems.add(new TableInfo.Index("index_listitems_list_item_id", true, Arrays.asList("list_item_id"), Arrays.asList("ASC")));
        _indicesListitems.add(new TableInfo.Index("index_listitems_list_id", false, Arrays.asList("list_id"), Arrays.asList("ASC")));
        final TableInfo _infoListitems = new TableInfo("listitems", _columnsListitems, _foreignKeysListitems, _indicesListitems);
        final TableInfo _existingListitems = TableInfo.read(_db, "listitems");
        if (! _infoListitems.equals(_existingListitems)) {
          return new RoomOpenHelper.ValidationResult(false, "listitems(com.battlelancer.seriesguide.lists.database.SgListItem).\n"
                  + " Expected:\n" + _infoListitems + "\n"
                  + " Found:\n" + _existingListitems);
        }
        final HashMap<String, TableInfo.Column> _columnsMovies = new HashMap<String, TableInfo.Column>(22);
        _columnsMovies.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_tmdbid", new TableInfo.Column("movies_tmdbid", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_imdbid", new TableInfo.Column("movies_imdbid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_title", new TableInfo.Column("movies_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_title_noarticle", new TableInfo.Column("movies_title_noarticle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_poster", new TableInfo.Column("movies_poster", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_genres", new TableInfo.Column("movies_genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_overview", new TableInfo.Column("movies_overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_released", new TableInfo.Column("movies_released", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_runtime", new TableInfo.Column("movies_runtime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_trailer", new TableInfo.Column("movies_trailer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_certification", new TableInfo.Column("movies_certification", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_incollection", new TableInfo.Column("movies_incollection", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_inwatchlist", new TableInfo.Column("movies_inwatchlist", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_plays", new TableInfo.Column("movies_plays", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_watched", new TableInfo.Column("movies_watched", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_rating_tmdb", new TableInfo.Column("movies_rating_tmdb", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_rating_votes_tmdb", new TableInfo.Column("movies_rating_votes_tmdb", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_rating_trakt", new TableInfo.Column("movies_rating_trakt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_rating_votes_trakt", new TableInfo.Column("movies_rating_votes_trakt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_rating_user", new TableInfo.Column("movies_rating_user", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("movies_last_updated", new TableInfo.Column("movies_last_updated", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovies = new HashSet<TableInfo.Index>(1);
        _indicesMovies.add(new TableInfo.Index("index_movies_movies_tmdbid", true, Arrays.asList("movies_tmdbid"), Arrays.asList("ASC")));
        final TableInfo _infoMovies = new TableInfo("movies", _columnsMovies, _foreignKeysMovies, _indicesMovies);
        final TableInfo _existingMovies = TableInfo.read(_db, "movies");
        if (! _infoMovies.equals(_existingMovies)) {
          return new RoomOpenHelper.ValidationResult(false, "movies(com.battlelancer.seriesguide.movies.database.SgMovie).\n"
                  + " Expected:\n" + _infoMovies + "\n"
                  + " Found:\n" + _existingMovies);
        }
        final HashMap<String, TableInfo.Column> _columnsActivity = new HashMap<String, TableInfo.Column>(5);
        _columnsActivity.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("activity_episode", new TableInfo.Column("activity_episode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("activity_show", new TableInfo.Column("activity_show", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("activity_time", new TableInfo.Column("activity_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("activity_type", new TableInfo.Column("activity_type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActivity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActivity = new HashSet<TableInfo.Index>(1);
        _indicesActivity.add(new TableInfo.Index("index_activity_activity_episode_activity_type", true, Arrays.asList("activity_episode","activity_type"), Arrays.asList("ASC","ASC")));
        final TableInfo _infoActivity = new TableInfo("activity", _columnsActivity, _foreignKeysActivity, _indicesActivity);
        final TableInfo _existingActivity = TableInfo.read(_db, "activity");
        if (! _infoActivity.equals(_existingActivity)) {
          return new RoomOpenHelper.ValidationResult(false, "activity(com.battlelancer.seriesguide.shows.history.SgActivity).\n"
                  + " Expected:\n" + _infoActivity + "\n"
                  + " Found:\n" + _existingActivity);
        }
        final HashMap<String, TableInfo.Column> _columnsJobs = new HashMap<String, TableInfo.Column>(4);
        _columnsJobs.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJobs.put("job_created_at", new TableInfo.Column("job_created_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJobs.put("job_type", new TableInfo.Column("job_type", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJobs.put("job_extras", new TableInfo.Column("job_extras", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysJobs = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesJobs = new HashSet<TableInfo.Index>(1);
        _indicesJobs.add(new TableInfo.Index("index_jobs_job_created_at", true, Arrays.asList("job_created_at"), Arrays.asList("ASC")));
        final TableInfo _infoJobs = new TableInfo("jobs", _columnsJobs, _foreignKeysJobs, _indicesJobs);
        final TableInfo _existingJobs = TableInfo.read(_db, "jobs");
        if (! _infoJobs.equals(_existingJobs)) {
          return new RoomOpenHelper.ValidationResult(false, "jobs(com.battlelancer.seriesguide.jobs.SgJob).\n"
                  + " Expected:\n" + _infoJobs + "\n"
                  + " Found:\n" + _existingJobs);
        }
        final HashMap<String, TableInfo.Column> _columnsSgWatchProvider = new HashMap<String, TableInfo.Column>(7);
        _columnsSgWatchProvider.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgWatchProvider.put("provider_id", new TableInfo.Column("provider_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgWatchProvider.put("provider_name", new TableInfo.Column("provider_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgWatchProvider.put("display_priority", new TableInfo.Column("display_priority", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgWatchProvider.put("logo_path", new TableInfo.Column("logo_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgWatchProvider.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSgWatchProvider.put("enabled", new TableInfo.Column("enabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSgWatchProvider = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSgWatchProvider = new HashSet<TableInfo.Index>(5);
        _indicesSgWatchProvider.add(new TableInfo.Index("index_sg_watch_provider_provider_id_type", true, Arrays.asList("provider_id","type"), Arrays.asList("ASC","ASC")));
        _indicesSgWatchProvider.add(new TableInfo.Index("index_sg_watch_provider_provider_name", false, Arrays.asList("provider_name"), Arrays.asList("ASC")));
        _indicesSgWatchProvider.add(new TableInfo.Index("index_sg_watch_provider_display_priority", false, Arrays.asList("display_priority"), Arrays.asList("ASC")));
        _indicesSgWatchProvider.add(new TableInfo.Index("index_sg_watch_provider_enabled", false, Arrays.asList("enabled"), Arrays.asList("ASC")));
        _indicesSgWatchProvider.add(new TableInfo.Index("index_sg_watch_provider_type", false, Arrays.asList("type"), Arrays.asList("ASC")));
        final TableInfo _infoSgWatchProvider = new TableInfo("sg_watch_provider", _columnsSgWatchProvider, _foreignKeysSgWatchProvider, _indicesSgWatchProvider);
        final TableInfo _existingSgWatchProvider = TableInfo.read(_db, "sg_watch_provider");
        if (! _infoSgWatchProvider.equals(_existingSgWatchProvider)) {
          return new RoomOpenHelper.ValidationResult(false, "sg_watch_provider(com.battlelancer.seriesguide.streaming.SgWatchProvider).\n"
                  + " Expected:\n" + _infoSgWatchProvider + "\n"
                  + " Found:\n" + _existingSgWatchProvider);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2014283a74737b9a9eeb23e7db8355a8", "19378924838e5eebcbba99746e42c5b1");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "series","seasons","episodes","sg_show","sg_season","sg_episode","lists","listitems","movies","activity","jobs","sg_watch_provider");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `episodes`");
      _db.execSQL("DELETE FROM `seasons`");
      _db.execSQL("DELETE FROM `series`");
      _db.execSQL("DELETE FROM `sg_season`");
      _db.execSQL("DELETE FROM `sg_episode`");
      _db.execSQL("DELETE FROM `sg_show`");
      _db.execSQL("DELETE FROM `listitems`");
      _db.execSQL("DELETE FROM `lists`");
      _db.execSQL("DELETE FROM `movies`");
      _db.execSQL("DELETE FROM `activity`");
      _db.execSQL("DELETE FROM `jobs`");
      _db.execSQL("DELETE FROM `sg_watch_provider`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SgShow2Helper.class, SgShow2Helper_Impl.getRequiredConverters());
    _typeConvertersMap.put(SgSeason2Helper.class, SgSeason2Helper_Impl.getRequiredConverters());
    _typeConvertersMap.put(SgEpisode2Helper.class, SgEpisode2Helper_Impl.getRequiredConverters());
    _typeConvertersMap.put(SgActivityHelper.class, SgActivityHelper_Impl.getRequiredConverters());
    _typeConvertersMap.put(SgListHelper.class, SgListHelper_Impl.getRequiredConverters());
    _typeConvertersMap.put(MovieHelper.class, MovieHelper_Impl.getRequiredConverters());
    _typeConvertersMap.put(SgWatchProviderHelper.class, SgWatchProviderHelper_Impl.getRequiredConverters());
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
  public SgShow2Helper sgShow2Helper() {
    if (_sgShow2Helper != null) {
      return _sgShow2Helper;
    } else {
      synchronized(this) {
        if(_sgShow2Helper == null) {
          _sgShow2Helper = new SgShow2Helper_Impl(this);
        }
        return _sgShow2Helper;
      }
    }
  }

  @Override
  public SgSeason2Helper sgSeason2Helper() {
    if (_sgSeason2Helper != null) {
      return _sgSeason2Helper;
    } else {
      synchronized(this) {
        if(_sgSeason2Helper == null) {
          _sgSeason2Helper = new SgSeason2Helper_Impl(this);
        }
        return _sgSeason2Helper;
      }
    }
  }

  @Override
  public SgEpisode2Helper sgEpisode2Helper() {
    if (_sgEpisode2Helper != null) {
      return _sgEpisode2Helper;
    } else {
      synchronized(this) {
        if(_sgEpisode2Helper == null) {
          _sgEpisode2Helper = new SgEpisode2Helper_Impl(this);
        }
        return _sgEpisode2Helper;
      }
    }
  }

  @Override
  public SgActivityHelper sgActivityHelper() {
    if (_sgActivityHelper != null) {
      return _sgActivityHelper;
    } else {
      synchronized(this) {
        if(_sgActivityHelper == null) {
          _sgActivityHelper = new SgActivityHelper_Impl(this);
        }
        return _sgActivityHelper;
      }
    }
  }

  @Override
  public SgListHelper sgListHelper() {
    if (_sgListHelper != null) {
      return _sgListHelper;
    } else {
      synchronized(this) {
        if(_sgListHelper == null) {
          _sgListHelper = new SgListHelper_Impl(this);
        }
        return _sgListHelper;
      }
    }
  }

  @Override
  public MovieHelper movieHelper() {
    if (_movieHelper != null) {
      return _movieHelper;
    } else {
      synchronized(this) {
        if(_movieHelper == null) {
          _movieHelper = new MovieHelper_Impl(this);
        }
        return _movieHelper;
      }
    }
  }

  @Override
  public SgWatchProviderHelper sgWatchProviderHelper() {
    if (_sgWatchProviderHelper != null) {
      return _sgWatchProviderHelper;
    } else {
      synchronized(this) {
        if(_sgWatchProviderHelper == null) {
          _sgWatchProviderHelper = new SgWatchProviderHelper_Impl(this);
        }
        return _sgWatchProviderHelper;
      }
    }
  }
}
