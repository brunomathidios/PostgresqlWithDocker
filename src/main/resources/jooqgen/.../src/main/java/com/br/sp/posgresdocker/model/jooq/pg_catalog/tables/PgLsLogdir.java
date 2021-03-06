/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgLsLogdirRecord;

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
public class PgLsLogdir extends TableImpl<PgLsLogdirRecord> {

    private static final long serialVersionUID = -70917932;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_logdir</code>
     */
    public static final PgLsLogdir PG_LS_LOGDIR = new PgLsLogdir();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLsLogdirRecord> getRecordType() {
        return PgLsLogdirRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_logdir.name</code>.
     */
    public final TableField<PgLsLogdirRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_logdir.size</code>.
     */
    public final TableField<PgLsLogdirRecord, Long> SIZE = createField("size", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_logdir.modification</code>.
     */
    public final TableField<PgLsLogdirRecord, OffsetDateTime> MODIFICATION = createField("modification", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    public PgLsLogdir() {
        this(DSL.name("pg_ls_logdir"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    public PgLsLogdir(String alias) {
        this(DSL.name(alias), PG_LS_LOGDIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    public PgLsLogdir(Name alias) {
        this(alias, PG_LS_LOGDIR);
    }

    private PgLsLogdir(Name alias, Table<PgLsLogdirRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgLsLogdir(Name alias, Table<PgLsLogdirRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgLsLogdir(Table<O> child, ForeignKey<O, PgLsLogdirRecord> key) {
        super(child, key, PG_LS_LOGDIR);
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
    public PgLsLogdir as(String alias) {
        return new PgLsLogdir(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLsLogdir as(Name alias) {
        return new PgLsLogdir(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsLogdir rename(String name) {
        return new PgLsLogdir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsLogdir rename(Name name) {
        return new PgLsLogdir(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgLsLogdir call() {
        return new PgLsLogdir(DSL.name(getName()), null, new Field[] { 
        });
    }
}
