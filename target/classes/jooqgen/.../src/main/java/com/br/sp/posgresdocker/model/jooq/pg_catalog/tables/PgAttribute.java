/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgAttributeRecord;

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
public class PgAttribute extends TableImpl<PgAttributeRecord> {

    private static final long serialVersionUID = 1836028574;

    /**
     * The reference instance of <code>pg_catalog.pg_attribute</code>
     */
    public static final PgAttribute PG_ATTRIBUTE = new PgAttribute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAttributeRecord> getRecordType() {
        return PgAttributeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTRELID = createField("attrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attname</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTNAME = createField("attname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTTYPID = createField("atttypid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTSTATTARGET = createField("attstattarget", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTLEN = createField("attlen", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTNUM = createField("attnum", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTNDIMS = createField("attndims", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTCACHEOFF = createField("attcacheoff", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTTYPMOD = createField("atttypmod", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTBYVAL = createField("attbyval", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTSTORAGE = createField("attstorage", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTALIGN = createField("attalign", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTNOTNULL = createField("attnotnull", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTHASDEF = createField("atthasdef", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTIDENTITY = createField("attidentity", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTISDROPPED = createField("attisdropped", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTISLOCAL = createField("attislocal", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTINHCOUNT = createField("attinhcount", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTCOLLATION = createField("attcollation", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTACL = createField("attacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTOPTIONS = createField("attoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTFDWOPTIONS = createField("attfdwoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute() {
        this(DSL.name("pg_attribute"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute(String alias) {
        this(DSL.name(alias), PG_ATTRIBUTE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute(Name alias) {
        this(alias, PG_ATTRIBUTE);
    }

    private PgAttribute(Name alias, Table<PgAttributeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAttribute(Name alias, Table<PgAttributeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgAttribute(Table<O> child, ForeignKey<O, PgAttributeRecord> key) {
        super(child, key, PG_ATTRIBUTE);
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
        return Arrays.<Index>asList(Indexes.PG_ATTRIBUTE_RELID_ATTNAM_INDEX, Indexes.PG_ATTRIBUTE_RELID_ATTNUM_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttribute as(String alias) {
        return new PgAttribute(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttribute as(Name alias) {
        return new PgAttribute(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttribute rename(String name) {
        return new PgAttribute(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttribute rename(Name name) {
        return new PgAttribute(name, null);
    }
}
