/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatReplicationRecord;

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
public class PgStatReplication extends TableImpl<PgStatReplicationRecord> {

    private static final long serialVersionUID = 27552858;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_replication</code>
     */
    public static final PgStatReplication PG_STAT_REPLICATION = new PgStatReplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatReplicationRecord> getRecordType() {
        return PgStatReplicationRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public final TableField<PgStatReplicationRecord, Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public final TableField<PgStatReplicationRecord, String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public final TableField<PgStatReplicationRecord, String> APPLICATION_NAME = createField("application_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> CLIENT_ADDR = createField("client_addr", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"inet\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public final TableField<PgStatReplicationRecord, String> CLIENT_HOSTNAME = createField("client_hostname", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> CLIENT_PORT = createField("client_port", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public final TableField<PgStatReplicationRecord, OffsetDateTime> BACKEND_START = createField("backend_start", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public final TableField<PgStatReplicationRecord, Long> BACKEND_XMIN = createField("backend_xmin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public final TableField<PgStatReplicationRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> SENT_LSN = createField("sent_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> WRITE_LSN = createField("write_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> FLUSH_LSN = createField("flush_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> REPLAY_LSN = createField("replay_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> WRITE_LAG = createField("write_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"interval\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> FLUSH_LAG = createField("flush_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"interval\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> REPLAY_LAG = createField("replay_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"interval\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> SYNC_PRIORITY = createField("sync_priority", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public final TableField<PgStatReplicationRecord, String> SYNC_STATE = createField("sync_state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication() {
        this(DSL.name("pg_stat_replication"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication(String alias) {
        this(DSL.name(alias), PG_STAT_REPLICATION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication(Name alias) {
        this(alias, PG_STAT_REPLICATION);
    }

    private PgStatReplication(Name alias, Table<PgStatReplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatReplication(Name alias, Table<PgStatReplicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatReplication(Table<O> child, ForeignKey<O, PgStatReplicationRecord> key) {
        super(child, key, PG_STAT_REPLICATION);
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
    public PgStatReplication as(String alias) {
        return new PgStatReplication(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatReplication as(Name alias) {
        return new PgStatReplication(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatReplication rename(String name) {
        return new PgStatReplication(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatReplication rename(Name name) {
        return new PgStatReplication(name, null);
    }
}
