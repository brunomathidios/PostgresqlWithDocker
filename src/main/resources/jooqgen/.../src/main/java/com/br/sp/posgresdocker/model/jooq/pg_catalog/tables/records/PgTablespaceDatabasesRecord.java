/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgTablespaceDatabases;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class PgTablespaceDatabasesRecord extends TableRecordImpl<PgTablespaceDatabasesRecord> implements Record1<Long> {

    private static final long serialVersionUID = 514418502;

    /**
     * Setter for <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    public void setPgTablespaceDatabases(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    public Long getPgTablespaceDatabases() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgTablespaceDatabases.PG_TABLESPACE_DATABASES.PG_TABLESPACE_DATABASES_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getPgTablespaceDatabases();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPgTablespaceDatabases();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablespaceDatabasesRecord value1(Long value) {
        setPgTablespaceDatabases(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablespaceDatabasesRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTablespaceDatabasesRecord
     */
    public PgTablespaceDatabasesRecord() {
        super(PgTablespaceDatabases.PG_TABLESPACE_DATABASES);
    }

    /**
     * Create a detached, initialised PgTablespaceDatabasesRecord
     */
    public PgTablespaceDatabasesRecord(Long pgTablespaceDatabases) {
        super(PgTablespaceDatabases.PG_TABLESPACE_DATABASES);

        set(0, pgTablespaceDatabases);
    }
}
