/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatActivityRecord;

import java.time.OffsetDateTime;

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
public class PgStatActivity extends TableImpl<PgStatActivityRecord> {

    private static final long serialVersionUID = 678357489;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_activity</code>
     */
    public static final PgStatActivity PG_STAT_ACTIVITY = new PgStatActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatActivityRecord> getRecordType() {
        return PgStatActivityRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_activity.datid</code>.
     */
    public final TableField<PgStatActivityRecord, Long> DATID = createField("datid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.datname</code>.
     */
    public final TableField<PgStatActivityRecord, String> DATNAME = createField("datname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.pid</code>.
     */
    public final TableField<PgStatActivityRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.usesysid</code>.
     */
    public final TableField<PgStatActivityRecord, Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.usename</code>.
     */
    public final TableField<PgStatActivityRecord, String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.application_name</code>.
     */
    public final TableField<PgStatActivityRecord, String> APPLICATION_NAME = createField("application_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatActivityRecord, Object> CLIENT_ADDR = createField("client_addr", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"inet\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.client_hostname</code>.
     */
    public final TableField<PgStatActivityRecord, String> CLIENT_HOSTNAME = createField("client_hostname", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.client_port</code>.
     */
    public final TableField<PgStatActivityRecord, Integer> CLIENT_PORT = createField("client_port", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_start</code>.
     */
    public final TableField<PgStatActivityRecord, OffsetDateTime> BACKEND_START = createField("backend_start", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.xact_start</code>.
     */
    public final TableField<PgStatActivityRecord, OffsetDateTime> XACT_START = createField("xact_start", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.query_start</code>.
     */
    public final TableField<PgStatActivityRecord, OffsetDateTime> QUERY_START = createField("query_start", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.state_change</code>.
     */
    public final TableField<PgStatActivityRecord, OffsetDateTime> STATE_CHANGE = createField("state_change", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.wait_event_type</code>.
     */
    public final TableField<PgStatActivityRecord, String> WAIT_EVENT_TYPE = createField("wait_event_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.wait_event</code>.
     */
    public final TableField<PgStatActivityRecord, String> WAIT_EVENT = createField("wait_event", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.state</code>.
     */
    public final TableField<PgStatActivityRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_xid</code>.
     */
    public final TableField<PgStatActivityRecord, Long> BACKEND_XID = createField("backend_xid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_xmin</code>.
     */
    public final TableField<PgStatActivityRecord, Long> BACKEND_XMIN = createField("backend_xmin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.query</code>.
     */
    public final TableField<PgStatActivityRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_activity.backend_type</code>.
     */
    public final TableField<PgStatActivityRecord, String> BACKEND_TYPE = createField("backend_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_activity</code> table reference
     */
    public PgStatActivity() {
        this(DSL.name("pg_stat_activity"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_activity</code> table reference
     */
    public PgStatActivity(String alias) {
        this(DSL.name(alias), PG_STAT_ACTIVITY);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_activity</code> table reference
     */
    public PgStatActivity(Name alias) {
        this(alias, PG_STAT_ACTIVITY);
    }

    private PgStatActivity(Name alias, Table<PgStatActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatActivity(Name alias, Table<PgStatActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatActivity(Table<O> child, ForeignKey<O, PgStatActivityRecord> key) {
        super(child, key, PG_STAT_ACTIVITY);
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
    public PgStatActivity as(String alias) {
        return new PgStatActivity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivity as(Name alias) {
        return new PgStatActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatActivity rename(String name) {
        return new PgStatActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatActivity rename(Name name) {
        return new PgStatActivity(name, null);
    }
}
