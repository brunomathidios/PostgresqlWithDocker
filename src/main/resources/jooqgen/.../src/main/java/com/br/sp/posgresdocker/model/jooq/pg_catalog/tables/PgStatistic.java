/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatisticRecord;

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
public class PgStatistic extends TableImpl<PgStatisticRecord> {

    private static final long serialVersionUID = -1372793132;

    /**
     * The reference instance of <code>pg_catalog.pg_statistic</code>
     */
    public static final PgStatistic PG_STATISTIC = new PgStatistic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatisticRecord> getRecordType() {
        return PgStatisticRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statistic.starelid</code>.
     */
    public final TableField<PgStatisticRecord, Long> STARELID = createField("starelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staattnum</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAATTNUM = createField("staattnum", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stainherit</code>.
     */
    public final TableField<PgStatisticRecord, Boolean> STAINHERIT = createField("stainherit", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanullfrac</code>.
     */
    public final TableField<PgStatisticRecord, Float> STANULLFRAC = createField("stanullfrac", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stawidth</code>.
     */
    public final TableField<PgStatisticRecord, Integer> STAWIDTH = createField("stawidth", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stadistinct</code>.
     */
    public final TableField<PgStatisticRecord, Float> STADISTINCT = createField("stadistinct", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind1</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND1 = createField("stakind1", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind2</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND2 = createField("stakind2", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind3</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND3 = createField("stakind3", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind4</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND4 = createField("stakind4", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind5</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND5 = createField("stakind5", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop1</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP1 = createField("staop1", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop2</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP2 = createField("staop2", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop3</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP3 = createField("staop3", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop4</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP4 = createField("staop4", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop5</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP5 = createField("staop5", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers1</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS1 = createField("stanumbers1", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers2</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS2 = createField("stanumbers2", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers3</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS3 = createField("stanumbers3", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers4</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS4 = createField("stanumbers4", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers5</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS5 = createField("stanumbers5", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatisticRecord, Object> STAVALUES1 = createField("stavalues1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatisticRecord, Object> STAVALUES2 = createField("stavalues2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatisticRecord, Object> STAVALUES3 = createField("stavalues3", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatisticRecord, Object> STAVALUES4 = createField("stavalues4", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatisticRecord, Object> STAVALUES5 = createField("stavalues5", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""), this, "");

    /**
     * Create a <code>pg_catalog.pg_statistic</code> table reference
     */
    public PgStatistic() {
        this(DSL.name("pg_statistic"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic</code> table reference
     */
    public PgStatistic(String alias) {
        this(DSL.name(alias), PG_STATISTIC);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic</code> table reference
     */
    public PgStatistic(Name alias) {
        this(alias, PG_STATISTIC);
    }

    private PgStatistic(Name alias, Table<PgStatisticRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatistic(Name alias, Table<PgStatisticRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatistic(Table<O> child, ForeignKey<O, PgStatisticRecord> key) {
        super(child, key, PG_STATISTIC);
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
        return Arrays.<Index>asList(Indexes.PG_STATISTIC_RELID_ATT_INH_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatistic as(String alias) {
        return new PgStatistic(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatistic as(Name alias) {
        return new PgStatistic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatistic rename(String name) {
        return new PgStatistic(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatistic rename(Name name) {
        return new PgStatistic(name, null);
    }
}