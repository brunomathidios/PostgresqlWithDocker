/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgLsDir;

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
public class PgLsDirRecord extends TableRecordImpl<PgLsDirRecord> implements Record1<String> {

    private static final long serialVersionUID = -2036267860;

    /**
     * Setter for <code>pg_catalog.pg_ls_dir.pg_ls_dir</code>.
     */
    public void setPgLsDir(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_dir.pg_ls_dir</code>.
     */
    public String getPgLsDir() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgLsDir.PG_LS_DIR.PG_LS_DIR_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPgLsDir();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPgLsDir();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLsDirRecord value1(String value) {
        setPgLsDir(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLsDirRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLsDirRecord
     */
    public PgLsDirRecord() {
        super(PgLsDir.PG_LS_DIR);
    }

    /**
     * Create a detached, initialised PgLsDirRecord
     */
    public PgLsDirRecord(String pgLsDir) {
        super(PgLsDir.PG_LS_DIR);

        set(0, pgLsDir);
    }
}
