/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgInheritsRecord;

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
public class PgInherits extends TableImpl<PgInheritsRecord> {

    private static final long serialVersionUID = 2124657216;

    /**
     * The reference instance of <code>pg_catalog.pg_inherits</code>
     */
    public static final PgInherits PG_INHERITS = new PgInherits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgInheritsRecord> getRecordType() {
        return PgInheritsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_inherits.inhrelid</code>.
     */
    public final TableField<PgInheritsRecord, Long> INHRELID = createField("inhrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_inherits.inhparent</code>.
     */
    public final TableField<PgInheritsRecord, Long> INHPARENT = createField("inhparent", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_inherits.inhseqno</code>.
     */
    public final TableField<PgInheritsRecord, Integer> INHSEQNO = createField("inhseqno", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_inherits</code> table reference
     */
    public PgInherits() {
        this(DSL.name("pg_inherits"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_inherits</code> table reference
     */
    public PgInherits(String alias) {
        this(DSL.name(alias), PG_INHERITS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_inherits</code> table reference
     */
    public PgInherits(Name alias) {
        this(alias, PG_INHERITS);
    }

    private PgInherits(Name alias, Table<PgInheritsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgInherits(Name alias, Table<PgInheritsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgInherits(Table<O> child, ForeignKey<O, PgInheritsRecord> key) {
        super(child, key, PG_INHERITS);
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
        return Arrays.<Index>asList(Indexes.PG_INHERITS_PARENT_INDEX, Indexes.PG_INHERITS_RELID_SEQNO_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgInherits as(String alias) {
        return new PgInherits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgInherits as(Name alias) {
        return new PgInherits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgInherits rename(String name) {
        return new PgInherits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgInherits rename(Name name) {
        return new PgInherits(name, null);
    }
}
