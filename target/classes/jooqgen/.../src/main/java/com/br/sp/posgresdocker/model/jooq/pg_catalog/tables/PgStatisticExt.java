/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatisticExtRecord;

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
public class PgStatisticExt extends TableImpl<PgStatisticExtRecord> {

    private static final long serialVersionUID = 564227644;

    /**
     * The reference instance of <code>pg_catalog.pg_statistic_ext</code>
     */
    public static final PgStatisticExt PG_STATISTIC_EXT = new PgStatisticExt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatisticExtRecord> getRecordType() {
        return PgStatisticExtRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxrelid</code>.
     */
    public final TableField<PgStatisticExtRecord, Long> STXRELID = createField("stxrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxname</code>.
     */
    public final TableField<PgStatisticExtRecord, String> STXNAME = createField("stxname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxnamespace</code>.
     */
    public final TableField<PgStatisticExtRecord, Long> STXNAMESPACE = createField("stxnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxowner</code>.
     */
    public final TableField<PgStatisticExtRecord, Long> STXOWNER = createField("stxowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkeys</code>.
     */
    public final TableField<PgStatisticExtRecord, Object[]> STXKEYS = createField("stxkeys", .getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkind</code>.
     */
    public final TableField<PgStatisticExtRecord, String[]> STXKIND = createField("stxkind", org.jooq.impl.SQLDataType.CHAR.getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatisticExtRecord, Object> STXNDISTINCT = createField("stxndistinct", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_ndistinct\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatisticExtRecord, Object> STXDEPENDENCIES = createField("stxdependencies", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_dependencies\""), this, "");

    /**
     * Create a <code>pg_catalog.pg_statistic_ext</code> table reference
     */
    public PgStatisticExt() {
        this(DSL.name("pg_statistic_ext"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table reference
     */
    public PgStatisticExt(String alias) {
        this(DSL.name(alias), PG_STATISTIC_EXT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table reference
     */
    public PgStatisticExt(Name alias) {
        this(alias, PG_STATISTIC_EXT);
    }

    private PgStatisticExt(Name alias, Table<PgStatisticExtRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatisticExt(Name alias, Table<PgStatisticExtRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatisticExt(Table<O> child, ForeignKey<O, PgStatisticExtRecord> key) {
        super(child, key, PG_STATISTIC_EXT);
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
        return Arrays.<Index>asList(Indexes.PG_STATISTIC_EXT_NAME_INDEX, Indexes.PG_STATISTIC_EXT_RELID_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatisticExt as(String alias) {
        return new PgStatisticExt(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatisticExt as(Name alias) {
        return new PgStatisticExt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExt rename(String name) {
        return new PgStatisticExt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExt rename(Name name) {
        return new PgStatisticExt(name, null);
    }
}