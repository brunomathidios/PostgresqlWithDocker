/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgGetPublicationTables;

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
public class PgGetPublicationTablesRecord extends TableRecordImpl<PgGetPublicationTablesRecord> implements Record1<Long> {

    private static final long serialVersionUID = 942587977;

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public Long getRelid() {
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
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgGetPublicationTablesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgGetPublicationTablesRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetPublicationTablesRecord
     */
    public PgGetPublicationTablesRecord() {
        super(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create a detached, initialised PgGetPublicationTablesRecord
     */
    public PgGetPublicationTablesRecord(Long relid) {
        super(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES);

        set(0, relid);
    }
}