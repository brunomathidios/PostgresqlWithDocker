/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgCastRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgCast extends TableImpl<PgCastRecord> {

    private static final long serialVersionUID = -990505059;

    /**
     * The reference instance of <code>pg_catalog.pg_cast</code>
     */
    public static final PgCast PG_CAST = new PgCast();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgCastRecord> getRecordType() {
        return PgCastRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_cast.castsource</code>.
     */
    public final TableField<PgCastRecord, Long> CASTSOURCE = createField("castsource", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public final TableField<PgCastRecord, Long> CASTTARGET = createField("casttarget", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public final TableField<PgCastRecord, Long> CASTFUNC = createField("castfunc", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public final TableField<PgCastRecord, String> CASTCONTEXT = createField("castcontext", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public final TableField<PgCastRecord, String> CASTMETHOD = createField("castmethod", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast() {
        this(DSL.name("pg_cast"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast(String alias) {
        this(DSL.name(alias), PG_CAST);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast(Name alias) {
        this(alias, PG_CAST);
    }

    private PgCast(Name alias, Table<PgCastRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgCast(Name alias, Table<PgCastRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgCast(Table<O> child, ForeignKey<O, PgCastRecord> key) {
        super(child, key, PG_CAST);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_CAST_SOURCE_TARGET_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCast as(String alias) {
        return new PgCast(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCast as(Name alias) {
        return new PgCast(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCast rename(String name) {
        return new PgCast(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCast rename(Name name) {
        return new PgCast(name, null);
    }
}
