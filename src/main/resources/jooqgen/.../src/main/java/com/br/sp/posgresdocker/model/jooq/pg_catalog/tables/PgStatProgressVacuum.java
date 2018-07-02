/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatProgressVacuumRecord;

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
public class PgStatProgressVacuum extends TableImpl<PgStatProgressVacuumRecord> {

    private static final long serialVersionUID = -1750433472;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_progress_vacuum</code>
     */
    public static final PgStatProgressVacuum PG_STAT_PROGRESS_VACUUM = new PgStatProgressVacuum();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatProgressVacuumRecord> getRecordType() {
        return PgStatProgressVacuumRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.pid</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.datid</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> DATID = createField("datid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.datname</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, String> DATNAME = createField("datname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.relid</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.phase</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, String> PHASE = createField("phase", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_total</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> HEAP_BLKS_TOTAL = createField("heap_blks_total", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_scanned</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> HEAP_BLKS_SCANNED = createField("heap_blks_scanned", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_vacuumed</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> HEAP_BLKS_VACUUMED = createField("heap_blks_vacuumed", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.index_vacuum_count</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> INDEX_VACUUM_COUNT = createField("index_vacuum_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.max_dead_tuples</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> MAX_DEAD_TUPLES = createField("max_dead_tuples", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_vacuum.num_dead_tuples</code>.
     */
    public final TableField<PgStatProgressVacuumRecord, Long> NUM_DEAD_TUPLES = createField("num_dead_tuples", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_progress_vacuum</code> table reference
     */
    public PgStatProgressVacuum() {
        this(DSL.name("pg_stat_progress_vacuum"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_vacuum</code> table reference
     */
    public PgStatProgressVacuum(String alias) {
        this(DSL.name(alias), PG_STAT_PROGRESS_VACUUM);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_vacuum</code> table reference
     */
    public PgStatProgressVacuum(Name alias) {
        this(alias, PG_STAT_PROGRESS_VACUUM);
    }

    private PgStatProgressVacuum(Name alias, Table<PgStatProgressVacuumRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatProgressVacuum(Name alias, Table<PgStatProgressVacuumRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatProgressVacuum(Table<O> child, ForeignKey<O, PgStatProgressVacuumRecord> key) {
        super(child, key, PG_STAT_PROGRESS_VACUUM);
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
    public PgStatProgressVacuum as(String alias) {
        return new PgStatProgressVacuum(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuum as(Name alias) {
        return new PgStatProgressVacuum(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressVacuum rename(String name) {
        return new PgStatProgressVacuum(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressVacuum rename(Name name) {
        return new PgStatProgressVacuum(name, null);
    }
}
