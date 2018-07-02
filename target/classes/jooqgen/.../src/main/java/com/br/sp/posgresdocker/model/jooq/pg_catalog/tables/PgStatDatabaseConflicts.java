/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatDatabaseConflictsRecord;

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
public class PgStatDatabaseConflicts extends TableImpl<PgStatDatabaseConflictsRecord> {

    private static final long serialVersionUID = -213998061;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_database_conflicts</code>
     */
    public static final PgStatDatabaseConflicts PG_STAT_DATABASE_CONFLICTS = new PgStatDatabaseConflicts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatDatabaseConflictsRecord> getRecordType() {
        return PgStatDatabaseConflictsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> DATID = createField("datid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, String> DATNAME = createField("datname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_TABLESPACE = createField("confl_tablespace", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_LOCK = createField("confl_lock", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_SNAPSHOT = createField("confl_snapshot", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_BUFFERPIN = createField("confl_bufferpin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_DEADLOCK = createField("confl_deadlock", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_database_conflicts</code> table reference
     */
    public PgStatDatabaseConflicts() {
        this(DSL.name("pg_stat_database_conflicts"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database_conflicts</code> table reference
     */
    public PgStatDatabaseConflicts(String alias) {
        this(DSL.name(alias), PG_STAT_DATABASE_CONFLICTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database_conflicts</code> table reference
     */
    public PgStatDatabaseConflicts(Name alias) {
        this(alias, PG_STAT_DATABASE_CONFLICTS);
    }

    private PgStatDatabaseConflicts(Name alias, Table<PgStatDatabaseConflictsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatDatabaseConflicts(Name alias, Table<PgStatDatabaseConflictsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatDatabaseConflicts(Table<O> child, ForeignKey<O, PgStatDatabaseConflictsRecord> key) {
        super(child, key, PG_STAT_DATABASE_CONFLICTS);
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
    public PgStatDatabaseConflicts as(String alias) {
        return new PgStatDatabaseConflicts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatDatabaseConflicts as(Name alias) {
        return new PgStatDatabaseConflicts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatDatabaseConflicts rename(String name) {
        return new PgStatDatabaseConflicts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatDatabaseConflicts rename(Name name) {
        return new PgStatDatabaseConflicts(name, null);
    }
}
