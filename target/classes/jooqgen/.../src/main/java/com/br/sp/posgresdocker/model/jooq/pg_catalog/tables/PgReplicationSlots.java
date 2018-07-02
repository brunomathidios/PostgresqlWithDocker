/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgReplicationSlotsRecord;

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
public class PgReplicationSlots extends TableImpl<PgReplicationSlotsRecord> {

    private static final long serialVersionUID = -274037632;

    /**
     * The reference instance of <code>pg_catalog.pg_replication_slots</code>
     */
    public static final PgReplicationSlots PG_REPLICATION_SLOTS = new PgReplicationSlots();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgReplicationSlotsRecord> getRecordType() {
        return PgReplicationSlotsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_replication_slots.slot_name</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> SLOT_NAME = createField("slot_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.plugin</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> PLUGIN = createField("plugin", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.slot_type</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> SLOT_TYPE = createField("slot_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.datoid</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Long> DATOID = createField("datoid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.database</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> DATABASE = createField("database", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.temporary</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Boolean> TEMPORARY = createField("temporary", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.active</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.active_pid</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Integer> ACTIVE_PID = createField("active_pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.xmin</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Long> XMIN = createField("xmin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.catalog_xmin</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Long> CATALOG_XMIN = createField("catalog_xmin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgReplicationSlotsRecord, Object> RESTART_LSN = createField("restart_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgReplicationSlotsRecord, Object> CONFIRMED_FLUSH_LSN = createField("confirmed_flush_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * Create a <code>pg_catalog.pg_replication_slots</code> table reference
     */
    public PgReplicationSlots() {
        this(DSL.name("pg_replication_slots"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_slots</code> table reference
     */
    public PgReplicationSlots(String alias) {
        this(DSL.name(alias), PG_REPLICATION_SLOTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_slots</code> table reference
     */
    public PgReplicationSlots(Name alias) {
        this(alias, PG_REPLICATION_SLOTS);
    }

    private PgReplicationSlots(Name alias, Table<PgReplicationSlotsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgReplicationSlots(Name alias, Table<PgReplicationSlotsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgReplicationSlots(Table<O> child, ForeignKey<O, PgReplicationSlotsRecord> key) {
        super(child, key, PG_REPLICATION_SLOTS);
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
    public PgReplicationSlots as(String alias) {
        return new PgReplicationSlots(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlots as(Name alias) {
        return new PgReplicationSlots(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationSlots rename(String name) {
        return new PgReplicationSlots(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationSlots rename(Name name) {
        return new PgReplicationSlots(name, null);
    }
}
