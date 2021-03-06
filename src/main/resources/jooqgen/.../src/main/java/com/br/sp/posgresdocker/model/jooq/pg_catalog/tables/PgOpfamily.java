/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgOpfamilyRecord;

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
public class PgOpfamily extends TableImpl<PgOpfamilyRecord> {

    private static final long serialVersionUID = 1833311276;

    /**
     * The reference instance of <code>pg_catalog.pg_opfamily</code>
     */
    public static final PgOpfamily PG_OPFAMILY = new PgOpfamily();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgOpfamilyRecord> getRecordType() {
        return PgOpfamilyRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFMETHOD = createField("opfmethod", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public final TableField<PgOpfamilyRecord, String> OPFNAME = createField("opfname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFNAMESPACE = createField("opfnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFOWNER = createField("opfowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily() {
        this(DSL.name("pg_opfamily"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily(String alias) {
        this(DSL.name(alias), PG_OPFAMILY);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily(Name alias) {
        this(alias, PG_OPFAMILY);
    }

    private PgOpfamily(Name alias, Table<PgOpfamilyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgOpfamily(Name alias, Table<PgOpfamilyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgOpfamily(Table<O> child, ForeignKey<O, PgOpfamilyRecord> key) {
        super(child, key, PG_OPFAMILY);
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
        return Arrays.<Index>asList(Indexes.PG_OPFAMILY_AM_NAME_NSP_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpfamily as(String alias) {
        return new PgOpfamily(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpfamily as(Name alias) {
        return new PgOpfamily(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpfamily rename(String name) {
        return new PgOpfamily(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpfamily rename(Name name) {
        return new PgOpfamily(name, null);
    }
}
