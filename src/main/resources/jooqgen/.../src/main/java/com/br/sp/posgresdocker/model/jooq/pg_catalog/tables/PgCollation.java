/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgCollationRecord;

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
public class PgCollation extends TableImpl<PgCollationRecord> {

    private static final long serialVersionUID = 1768978324;

    /**
     * The reference instance of <code>pg_catalog.pg_collation</code>
     */
    public static final PgCollation PG_COLLATION = new PgCollation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgCollationRecord> getRecordType() {
        return PgCollationRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_collation.collname</code>.
     */
    public final TableField<PgCollationRecord, String> COLLNAME = createField("collname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collnamespace</code>.
     */
    public final TableField<PgCollationRecord, Long> COLLNAMESPACE = createField("collnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collowner</code>.
     */
    public final TableField<PgCollationRecord, Long> COLLOWNER = createField("collowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collprovider</code>.
     */
    public final TableField<PgCollationRecord, String> COLLPROVIDER = createField("collprovider", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collencoding</code>.
     */
    public final TableField<PgCollationRecord, Integer> COLLENCODING = createField("collencoding", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collcollate</code>.
     */
    public final TableField<PgCollationRecord, String> COLLCOLLATE = createField("collcollate", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collctype</code>.
     */
    public final TableField<PgCollationRecord, String> COLLCTYPE = createField("collctype", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collversion</code>.
     */
    public final TableField<PgCollationRecord, String> COLLVERSION = createField("collversion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_collation</code> table reference
     */
    public PgCollation() {
        this(DSL.name("pg_collation"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_collation</code> table reference
     */
    public PgCollation(String alias) {
        this(DSL.name(alias), PG_COLLATION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_collation</code> table reference
     */
    public PgCollation(Name alias) {
        this(alias, PG_COLLATION);
    }

    private PgCollation(Name alias, Table<PgCollationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgCollation(Name alias, Table<PgCollationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgCollation(Table<O> child, ForeignKey<O, PgCollationRecord> key) {
        super(child, key, PG_COLLATION);
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
        return Arrays.<Index>asList(Indexes.PG_COLLATION_NAME_ENC_NSP_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollation as(String alias) {
        return new PgCollation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollation as(Name alias) {
        return new PgCollation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCollation rename(String name) {
        return new PgCollation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCollation rename(Name name) {
        return new PgCollation(name, null);
    }
}
