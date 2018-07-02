/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables.records;


import com.br.sp.posgresdocker.model.jooq.information_schema.tables._PgForeignServers;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


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
public class _PgForeignServersRecord extends TableRecordImpl<_PgForeignServersRecord> implements Record9<Long, String[], String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -100078653;

    /**
     * Setter for <code>information_schema._pg_foreign_servers.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.srvoptions</code>.
     */
    public void setSrvoptions(String... value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.srvoptions</code>.
     */
    public String[] getSrvoptions() {
        return (String[]) get(1);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.foreign_server_name</code>.
     */
    public void setForeignServerName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public String getForeignDataWrapperCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>.
     */
    public String getForeignDataWrapperName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.foreign_server_type</code>.
     */
    public void setForeignServerType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.foreign_server_type</code>.
     */
    public String getForeignServerType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.foreign_server_version</code>.
     */
    public void setForeignServerVersion(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.foreign_server_version</code>.
     */
    public String getForeignServerVersion() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema._pg_foreign_servers.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_servers.authorization_identifier</code>.
     */
    public String getAuthorizationIdentifier() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String[], String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String[], String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field2() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.SRVOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return _PgForeignServers._PG_FOREIGN_SERVERS.AUTHORIZATION_IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component2() {
        return getSrvoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getForeignServerCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getForeignServerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getForeignDataWrapperCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getForeignDataWrapperName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getForeignServerType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getForeignServerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getAuthorizationIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value2() {
        return getSrvoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getForeignServerCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getForeignServerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getForeignDataWrapperCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getForeignDataWrapperName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getForeignServerType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getForeignServerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAuthorizationIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value1(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value2(String... value) {
        setSrvoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value3(String value) {
        setForeignServerCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value4(String value) {
        setForeignServerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value5(String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value6(String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value7(String value) {
        setForeignServerType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value8(String value) {
        setForeignServerVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord value9(String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignServersRecord values(Long value1, String[] value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _PgForeignServersRecord
     */
    public _PgForeignServersRecord() {
        super(_PgForeignServers._PG_FOREIGN_SERVERS);
    }

    /**
     * Create a detached, initialised _PgForeignServersRecord
     */
    public _PgForeignServersRecord(Long oid, String[] srvoptions, String foreignServerCatalog, String foreignServerName, String foreignDataWrapperCatalog, String foreignDataWrapperName, String foreignServerType, String foreignServerVersion, String authorizationIdentifier) {
        super(_PgForeignServers._PG_FOREIGN_SERVERS);

        set(0, oid);
        set(1, srvoptions);
        set(2, foreignServerCatalog);
        set(3, foreignServerName);
        set(4, foreignDataWrapperCatalog);
        set(5, foreignDataWrapperName);
        set(6, foreignServerType);
        set(7, foreignServerVersion);
        set(8, authorizationIdentifier);
    }
}