/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgAmop;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgAmopRecord extends TableRecordImpl<PgAmopRecord> implements Record8<Long, Long, Long, Short, String, Long, Long, Long> {

    private static final long serialVersionUID = 422557061;

    /**
     * Setter for <code>pg_catalog.pg_amop.amopfamily</code>.
     */
    public void setAmopfamily(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amopfamily</code>.
     */
    public Long getAmopfamily() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_amop.amoplefttype</code>.
     */
    public void setAmoplefttype(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amoplefttype</code>.
     */
    public Long getAmoplefttype() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_amop.amoprighttype</code>.
     */
    public void setAmoprighttype(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amoprighttype</code>.
     */
    public Long getAmoprighttype() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_amop.amopstrategy</code>.
     */
    public void setAmopstrategy(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amopstrategy</code>.
     */
    public Short getAmopstrategy() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_amop.amoppurpose</code>.
     */
    public void setAmoppurpose(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amoppurpose</code>.
     */
    public String getAmoppurpose() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_amop.amopopr</code>.
     */
    public void setAmopopr(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amopopr</code>.
     */
    public Long getAmopopr() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_amop.amopmethod</code>.
     */
    public void setAmopmethod(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amopmethod</code>.
     */
    public Long getAmopmethod() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_amop.amopsortfamily</code>.
     */
    public void setAmopsortfamily(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amop.amopsortfamily</code>.
     */
    public Long getAmopsortfamily() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, Short, String, Long, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, Short, String, Long, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgAmop.PG_AMOP.AMOPFAMILY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgAmop.PG_AMOP.AMOPLEFTTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgAmop.PG_AMOP.AMOPRIGHTTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return PgAmop.PG_AMOP.AMOPSTRATEGY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgAmop.PG_AMOP.AMOPPURPOSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgAmop.PG_AMOP.AMOPOPR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return PgAmop.PG_AMOP.AMOPMETHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return PgAmop.PG_AMOP.AMOPSORTFAMILY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getAmopfamily();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getAmoplefttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAmoprighttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getAmopstrategy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAmoppurpose();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getAmopopr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getAmopmethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getAmopsortfamily();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getAmopfamily();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAmoplefttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAmoprighttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getAmopstrategy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAmoppurpose();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getAmopopr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getAmopmethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getAmopsortfamily();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value1(Long value) {
        setAmopfamily(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value2(Long value) {
        setAmoplefttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value3(Long value) {
        setAmoprighttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value4(Short value) {
        setAmopstrategy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value5(String value) {
        setAmoppurpose(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value6(Long value) {
        setAmopopr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value7(Long value) {
        setAmopmethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord value8(Long value) {
        setAmopsortfamily(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmopRecord values(Long value1, Long value2, Long value3, Short value4, String value5, Long value6, Long value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAmopRecord
     */
    public PgAmopRecord() {
        super(PgAmop.PG_AMOP);
    }

    /**
     * Create a detached, initialised PgAmopRecord
     */
    public PgAmopRecord(Long amopfamily, Long amoplefttype, Long amoprighttype, Short amopstrategy, String amoppurpose, Long amopopr, Long amopmethod, Long amopsortfamily) {
        super(PgAmop.PG_AMOP);

        set(0, amopfamily);
        set(1, amoplefttype);
        set(2, amoprighttype);
        set(3, amopstrategy);
        set(4, amoppurpose);
        set(5, amopopr);
        set(6, amopmethod);
        set(7, amopsortfamily);
    }
}
