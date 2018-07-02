/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.routines;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGetArchiver extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -84391830;

    /**
     * The parameter <code>pg_catalog.pg_stat_get_archiver.archived_count</code>.
     */
    public static final Parameter<Long> ARCHIVED_COUNT = createParameter("archived_count", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_get_archiver.last_archived_wal</code>.
     */
    public static final Parameter<String> LAST_ARCHIVED_WAL = createParameter("last_archived_wal", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_get_archiver.last_archived_time</code>.
     */
    public static final Parameter<OffsetDateTime> LAST_ARCHIVED_TIME = createParameter("last_archived_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_get_archiver.failed_count</code>.
     */
    public static final Parameter<Long> FAILED_COUNT = createParameter("failed_count", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_get_archiver.last_failed_wal</code>.
     */
    public static final Parameter<String> LAST_FAILED_WAL = createParameter("last_failed_wal", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_get_archiver.last_failed_time</code>.
     */
    public static final Parameter<OffsetDateTime> LAST_FAILED_TIME = createParameter("last_failed_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_get_archiver.stats_reset</code>.
     */
    public static final Parameter<OffsetDateTime> STATS_RESET = createParameter("stats_reset", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * Create a new routine call instance
     */
    public PgStatGetArchiver() {
        super("pg_stat_get_archiver", PgCatalog.PG_CATALOG);

        addOutParameter(ARCHIVED_COUNT);
        addOutParameter(LAST_ARCHIVED_WAL);
        addOutParameter(LAST_ARCHIVED_TIME);
        addOutParameter(FAILED_COUNT);
        addOutParameter(LAST_FAILED_WAL);
        addOutParameter(LAST_FAILED_TIME);
        addOutParameter(STATS_RESET);
    }

    /**
     * Get the <code>archived_count</code> parameter OUT value from the routine
     */
    public Long getArchivedCount() {
        return get(ARCHIVED_COUNT);
    }

    /**
     * Get the <code>last_archived_wal</code> parameter OUT value from the routine
     */
    public String getLastArchivedWal() {
        return get(LAST_ARCHIVED_WAL);
    }

    /**
     * Get the <code>last_archived_time</code> parameter OUT value from the routine
     */
    public OffsetDateTime getLastArchivedTime() {
        return get(LAST_ARCHIVED_TIME);
    }

    /**
     * Get the <code>failed_count</code> parameter OUT value from the routine
     */
    public Long getFailedCount() {
        return get(FAILED_COUNT);
    }

    /**
     * Get the <code>last_failed_wal</code> parameter OUT value from the routine
     */
    public String getLastFailedWal() {
        return get(LAST_FAILED_WAL);
    }

    /**
     * Get the <code>last_failed_time</code> parameter OUT value from the routine
     */
    public OffsetDateTime getLastFailedTime() {
        return get(LAST_FAILED_TIME);
    }

    /**
     * Get the <code>stats_reset</code> parameter OUT value from the routine
     */
    public OffsetDateTime getStatsReset() {
        return get(STATS_RESET);
    }
}