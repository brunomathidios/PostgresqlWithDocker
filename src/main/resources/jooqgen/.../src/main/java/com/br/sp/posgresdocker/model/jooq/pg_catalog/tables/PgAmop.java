/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgAmopRecord;

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
public class PgAmop extends TableImpl<PgAmopRecord> {

    private static final long serialVersionUID = 1578490832;

    /**
     * The reference instance of <code>pg_catalog.pg_amop</code>
     */
    public static final PgAmop PG_AMOP = new PgAmop();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAmopRecord> getRecordType() {
        return PgAmopRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_amop.amopfamily</code>.
     */
    public final TableField<PgAmopRecord, Long> AMOPFAMILY = createField("amopfamily", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amop.amoplefttype</code>.
     */
    public final TableField<PgAmopRecord, Long> AMOPLEFTTYPE = createField("amoplefttype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amop.amoprighttype</code>.
     */
    public final TableField<PgAmopRecord, Long> AMOPRIGHTTYPE = createField("amoprighttype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amop.amopstrategy</code>.
     */
    public final TableField<PgAmopRecord, Short> AMOPSTRATEGY = createField("amopstrategy", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amop.amoppurpose</code>.
     */
    public final TableField<PgAmopRecord, String> AMOPPURPOSE = createField("amoppurpose", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amop.amopopr</code>.
     */
    public final TableField<PgAmopRecord, Long> AMOPOPR = createField("amopopr", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amop.amopmethod</code>.
     */
    public final TableField<PgAmopRecord, Long> AMOPMETHOD = createField("amopmethod", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amop.amopsortfamily</code>.
     */
    public final TableField<PgAmopRecord, Long> AMOPSORTFAMILY = createField("amopsortfamily", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_amop</code> table reference
     */
    public PgAmop() {
        this(DSL.name("pg_amop"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_amop</code> table reference
     */
    public PgAmop(String alias) {
        this(DSL.name(alias), PG_AMOP);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_amop</code> table reference
     */
    public PgAmop(Name alias) {
        this(alias, PG_AMOP);
    }

    private PgAmop(Name alias, Table<PgAmopRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAmop(Name alias, Table<PgAmopRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgAmop(Table<O> child, ForeignKey<O, PgAmopRecord> key) {
        super(child, key, PG_AMOP);
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
        return Arrays.<Index>asList(Indexes.PG_AMOP_FAM_STRAT_INDEX, Indexes.PG_AMOP_OPR_FAM_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmop as(String alias) {
        return new PgAmop(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmop as(Name alias) {
        return new PgAmop(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAmop rename(String name) {
        return new PgAmop(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAmop rename(Name name) {
        return new PgAmop(name, null);
    }
}
