/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatArchiverRecord;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class PgStatArchiver extends TableImpl<PgStatArchiverRecord> {

    private static final long serialVersionUID = -987375817;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_archiver</code>
     */
    public static final PgStatArchiver PG_STAT_ARCHIVER = new PgStatArchiver();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatArchiverRecord> getRecordType() {
        return PgStatArchiverRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_archiver.archived_count</code>.
     */
    public final TableField<PgStatArchiverRecord, Long> ARCHIVED_COUNT = createField("archived_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_archived_wal</code>.
     */
    public final TableField<PgStatArchiverRecord, String> LAST_ARCHIVED_WAL = createField("last_archived_wal", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_archived_time</code>.
     */
    public final TableField<PgStatArchiverRecord, OffsetDateTime> LAST_ARCHIVED_TIME = createField("last_archived_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.failed_count</code>.
     */
    public final TableField<PgStatArchiverRecord, Long> FAILED_COUNT = createField("failed_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_failed_wal</code>.
     */
    public final TableField<PgStatArchiverRecord, String> LAST_FAILED_WAL = createField("last_failed_wal", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.last_failed_time</code>.
     */
    public final TableField<PgStatArchiverRecord, OffsetDateTime> LAST_FAILED_TIME = createField("last_failed_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_archiver.stats_reset</code>.
     */
    public final TableField<PgStatArchiverRecord, OffsetDateTime> STATS_RESET = createField("stats_reset", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_archiver</code> table reference
     */
    public PgStatArchiver() {
        this(DSL.name("pg_stat_archiver"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_archiver</code> table reference
     */
    public PgStatArchiver(String alias) {
        this(DSL.name(alias), PG_STAT_ARCHIVER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_archiver</code> table reference
     */
    public PgStatArchiver(Name alias) {
        this(alias, PG_STAT_ARCHIVER);
    }

    private PgStatArchiver(Name alias, Table<PgStatArchiverRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatArchiver(Name alias, Table<PgStatArchiverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatArchiver(Table<O> child, ForeignKey<O, PgStatArchiverRecord> key) {
        super(child, key, PG_STAT_ARCHIVER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatArchiver as(String alias) {
        return new PgStatArchiver(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatArchiver as(Name alias) {
        return new PgStatArchiver(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatArchiver rename(String name) {
        return new PgStatArchiver(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatArchiver rename(Name name) {
        return new PgStatArchiver(name, null);
    }
}
