/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgLogicalSlotGetChanges;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PgLogicalSlotGetChangesRecord extends TableRecordImpl<PgLogicalSlotGetChangesRecord> implements Record3<Object, Long, String> {

    private static final long serialVersionUID = 632957891;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setLsn(Object value) {
        set(0, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getLsn() {
        return get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_logical_slot_get_changes.xid</code>.
     */
    public void setXid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_logical_slot_get_changes.xid</code>.
     */
    public Long getXid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_logical_slot_get_changes.data</code>.
     */
    public void setData(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_logical_slot_get_changes.data</code>.
     */
    public String getData() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field1() {
        return PgLogicalSlotGetChanges.PG_LOGICAL_SLOT_GET_CHANGES.LSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgLogicalSlotGetChanges.PG_LOGICAL_SLOT_GET_CHANGES.XID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgLogicalSlotGetChanges.PG_LOGICAL_SLOT_GET_CHANGES.DATA;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component1() {
        return getLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getXid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getData();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value1() {
        return getLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getXid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getData();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgLogicalSlotGetChangesRecord value1(Object value) {
        setLsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLogicalSlotGetChangesRecord value2(Long value) {
        setXid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLogicalSlotGetChangesRecord value3(String value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLogicalSlotGetChangesRecord values(Object value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLogicalSlotGetChangesRecord
     */
    public PgLogicalSlotGetChangesRecord() {
        super(PgLogicalSlotGetChanges.PG_LOGICAL_SLOT_GET_CHANGES);
    }

    /**
     * Create a detached, initialised PgLogicalSlotGetChangesRecord
     */
    public PgLogicalSlotGetChangesRecord(Object lsn, Long xid, String data) {
        super(PgLogicalSlotGetChanges.PG_LOGICAL_SLOT_GET_CHANGES);

        set(0, lsn);
        set(1, xid);
        set(2, data);
    }
}
