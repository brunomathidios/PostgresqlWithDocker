/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatSysIndexesRecord;

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
public class PgStatSysIndexes extends TableImpl<PgStatSysIndexesRecord> {

    private static final long serialVersionUID = 1086595632;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_sys_indexes</code>
     */
    public static final PgStatSysIndexes PG_STAT_SYS_INDEXES = new PgStatSysIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSysIndexesRecord> getRecordType() {
        return PgStatSysIndexesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.relid</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.indexrelid</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> INDEXRELID = createField("indexrelid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.schemaname</code>.
     */
    public final TableField<PgStatSysIndexesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.relname</code>.
     */
    public final TableField<PgStatSysIndexesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.indexrelname</code>.
     */
    public final TableField<PgStatSysIndexesRecord, String> INDEXRELNAME = createField("indexrelname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.idx_scan</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.idx_tup_read</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> IDX_TUP_READ = createField("idx_tup_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.idx_tup_fetch</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_sys_indexes</code> table reference
     */
    public PgStatSysIndexes() {
        this(DSL.name("pg_stat_sys_indexes"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_indexes</code> table reference
     */
    public PgStatSysIndexes(String alias) {
        this(DSL.name(alias), PG_STAT_SYS_INDEXES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_indexes</code> table reference
     */
    public PgStatSysIndexes(Name alias) {
        this(alias, PG_STAT_SYS_INDEXES);
    }

    private PgStatSysIndexes(Name alias, Table<PgStatSysIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSysIndexes(Name alias, Table<PgStatSysIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatSysIndexes(Table<O> child, ForeignKey<O, PgStatSysIndexesRecord> key) {
        super(child, key, PG_STAT_SYS_INDEXES);
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
    public PgStatSysIndexes as(String alias) {
        return new PgStatSysIndexes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatSysIndexes as(Name alias) {
        return new PgStatSysIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysIndexes rename(String name) {
        return new PgStatSysIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysIndexes rename(Name name) {
        return new PgStatSysIndexes(name, null);
    }
}
