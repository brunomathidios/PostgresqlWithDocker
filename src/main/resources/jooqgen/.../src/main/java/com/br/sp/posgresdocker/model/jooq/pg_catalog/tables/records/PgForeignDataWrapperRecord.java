/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgForeignDataWrapper;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PgForeignDataWrapperRecord extends TableRecordImpl<PgForeignDataWrapperRecord> implements Record6<String, Long, Long, Long, String[], String[]> {

    private static final long serialVersionUID = -2107711549;

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    public void setFdwname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    public String getFdwname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    public void setFdwowner(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    public Long getFdwowner() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    public void setFdwhandler(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    public Long getFdwhandler() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    public void setFdwvalidator(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    public Long getFdwvalidator() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    public void setFdwacl(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    public String[] getFdwacl() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    public void setFdwoptions(String... value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    public String[] getFdwoptions() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, String[], String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, String[], String[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWHANDLER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWVALIDATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getFdwname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getFdwowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getFdwhandler();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getFdwvalidator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component5() {
        return getFdwacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getFdwoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFdwname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getFdwowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getFdwhandler();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getFdwvalidator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getFdwacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getFdwoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapperRecord value1(String value) {
        setFdwname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapperRecord value2(Long value) {
        setFdwowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapperRecord value3(Long value) {
        setFdwhandler(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapperRecord value4(Long value) {
        setFdwvalidator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapperRecord value5(String... value) {
        setFdwacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapperRecord value6(String... value) {
        setFdwoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapperRecord values(String value1, Long value2, Long value3, Long value4, String[] value5, String[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgForeignDataWrapperRecord
     */
    public PgForeignDataWrapperRecord() {
        super(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER);
    }

    /**
     * Create a detached, initialised PgForeignDataWrapperRecord
     */
    public PgForeignDataWrapperRecord(String fdwname, Long fdwowner, Long fdwhandler, Long fdwvalidator, String[] fdwacl, String[] fdwoptions) {
        super(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER);

        set(0, fdwname);
        set(1, fdwowner);
        set(2, fdwhandler);
        set(3, fdwvalidator);
        set(4, fdwacl);
        set(5, fdwoptions);
    }
}
