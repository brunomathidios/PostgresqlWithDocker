/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables;


import com.br.sp.posgresdocker.model.jooq.information_schema.InformationSchema;
import com.br.sp.posgresdocker.model.jooq.information_schema.tables.records._PgForeignServersRecord;

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
public class _PgForeignServers extends TableImpl<_PgForeignServersRecord> {

    private static final long serialVersionUID = -33299445;

    /**
     * The reference instance of <code>information_schema._pg_foreign_servers</code>
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = new _PgForeignServers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignServersRecord> getRecordType() {
        return _PgForeignServersRecord.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_servers.oid</code>.
     */
    public final TableField<_PgForeignServersRecord, Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.srvoptions</code>.
     */
    public final TableField<_PgForeignServersRecord, String[]> SRVOPTIONS = createField("srvoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField("foreign_data_wrapper_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField("foreign_data_wrapper_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_type</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_TYPE = createField("foreign_server_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.foreign_server_version</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_VERSION = createField("foreign_server_version", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_servers.authorization_identifier</code>.
     */
    public final TableField<_PgForeignServersRecord, String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema._pg_foreign_servers</code> table reference
     */
    public _PgForeignServers() {
        this(DSL.name("_pg_foreign_servers"), null);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code> table reference
     */
    public _PgForeignServers(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_SERVERS);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code> table reference
     */
    public _PgForeignServers(Name alias) {
        this(alias, _PG_FOREIGN_SERVERS);
    }

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> _PgForeignServers(Table<O> child, ForeignKey<O, _PgForeignServersRecord> key) {
        super(child, key, _PG_FOREIGN_SERVERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServers as(String alias) {
        return new _PgForeignServers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServers as(Name alias) {
        return new _PgForeignServers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(String name) {
        return new _PgForeignServers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(Name name) {
        return new _PgForeignServers(name, null);
    }
}
