/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgTriggerRecord;

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
public class PgTrigger extends TableImpl<PgTriggerRecord> {

    private static final long serialVersionUID = 1345318842;

    /**
     * The reference instance of <code>pg_catalog.pg_trigger</code>
     */
    public static final PgTrigger PG_TRIGGER = new PgTrigger();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTriggerRecord> getRecordType() {
        return PgTriggerRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_trigger.tgrelid</code>.
     */
    public final TableField<PgTriggerRecord, Long> TGRELID = createField("tgrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgname</code>.
     */
    public final TableField<PgTriggerRecord, String> TGNAME = createField("tgname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgfoid</code>.
     */
    public final TableField<PgTriggerRecord, Long> TGFOID = createField("tgfoid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgtype</code>.
     */
    public final TableField<PgTriggerRecord, Short> TGTYPE = createField("tgtype", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgenabled</code>.
     */
    public final TableField<PgTriggerRecord, String> TGENABLED = createField("tgenabled", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgisinternal</code>.
     */
    public final TableField<PgTriggerRecord, Boolean> TGISINTERNAL = createField("tgisinternal", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgconstrrelid</code>.
     */
    public final TableField<PgTriggerRecord, Long> TGCONSTRRELID = createField("tgconstrrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgconstrindid</code>.
     */
    public final TableField<PgTriggerRecord, Long> TGCONSTRINDID = createField("tgconstrindid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgconstraint</code>.
     */
    public final TableField<PgTriggerRecord, Long> TGCONSTRAINT = createField("tgconstraint", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgdeferrable</code>.
     */
    public final TableField<PgTriggerRecord, Boolean> TGDEFERRABLE = createField("tgdeferrable", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tginitdeferred</code>.
     */
    public final TableField<PgTriggerRecord, Boolean> TGINITDEFERRED = createField("tginitdeferred", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgnargs</code>.
     */
    public final TableField<PgTriggerRecord, Short> TGNARGS = createField("tgnargs", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgattr</code>.
     */
    public final TableField<PgTriggerRecord, Object[]> TGATTR = createField("tgattr", .getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgargs</code>.
     */
    public final TableField<PgTriggerRecord, byte[]> TGARGS = createField("tgargs", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgTriggerRecord, Object> TGQUAL = createField("tgqual", , this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgoldtable</code>.
     */
    public final TableField<PgTriggerRecord, String> TGOLDTABLE = createField("tgoldtable", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_trigger.tgnewtable</code>.
     */
    public final TableField<PgTriggerRecord, String> TGNEWTABLE = createField("tgnewtable", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>pg_catalog.pg_trigger</code> table reference
     */
    public PgTrigger() {
        this(DSL.name("pg_trigger"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_trigger</code> table reference
     */
    public PgTrigger(String alias) {
        this(DSL.name(alias), PG_TRIGGER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_trigger</code> table reference
     */
    public PgTrigger(Name alias) {
        this(alias, PG_TRIGGER);
    }

    private PgTrigger(Name alias, Table<PgTriggerRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTrigger(Name alias, Table<PgTriggerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgTrigger(Table<O> child, ForeignKey<O, PgTriggerRecord> key) {
        super(child, key, PG_TRIGGER);
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
        return Arrays.<Index>asList(Indexes.PG_TRIGGER_TGCONSTRAINT_INDEX, Indexes.PG_TRIGGER_TGRELID_TGNAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTrigger as(String alias) {
        return new PgTrigger(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTrigger as(Name alias) {
        return new PgTrigger(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTrigger rename(String name) {
        return new PgTrigger(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTrigger rename(Name name) {
        return new PgTrigger(name, null);
    }
}
