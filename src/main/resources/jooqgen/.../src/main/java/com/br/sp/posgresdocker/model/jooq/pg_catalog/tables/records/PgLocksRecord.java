/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgLocks;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class PgLocksRecord extends TableRecordImpl<PgLocksRecord> implements Record15<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean> {

    private static final long serialVersionUID = 1548696545;

    /**
     * Setter for <code>pg_catalog.pg_locks.locktype</code>.
     */
    public void setLocktype(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.locktype</code>.
     */
    public String getLocktype() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.database</code>.
     */
    public void setDatabase(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.database</code>.
     */
    public Long getDatabase() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.relation</code>.
     */
    public void setRelation(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.relation</code>.
     */
    public Long getRelation() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.page</code>.
     */
    public void setPage(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.page</code>.
     */
    public Integer getPage() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.tuple</code>.
     */
    public void setTuple(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.tuple</code>.
     */
    public Short getTuple() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.virtualxid</code>.
     */
    public void setVirtualxid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.virtualxid</code>.
     */
    public String getVirtualxid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.transactionid</code>.
     */
    public void setTransactionid(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.transactionid</code>.
     */
    public Long getTransactionid() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.classid</code>.
     */
    public void setClassid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.objid</code>.
     */
    public void setObjid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.objsubid</code>.
     */
    public void setObjsubid(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.objsubid</code>.
     */
    public Short getObjsubid() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.virtualtransaction</code>.
     */
    public void setVirtualtransaction(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.virtualtransaction</code>.
     */
    public String getVirtualtransaction() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.pid</code>.
     */
    public void setPid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.mode</code>.
     */
    public void setMode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.mode</code>.
     */
    public String getMode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.granted</code>.
     */
    public void setGranted(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.granted</code>.
     */
    public Boolean getGranted() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_locks.fastpath</code>.
     */
    public void setFastpath(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_locks.fastpath</code>.
     */
    public Boolean getFastpath() {
        return (Boolean) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgLocks.PG_LOCKS.LOCKTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgLocks.PG_LOCKS.DATABASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgLocks.PG_LOCKS.RELATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PgLocks.PG_LOCKS.PAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return PgLocks.PG_LOCKS.TUPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgLocks.PG_LOCKS.VIRTUALXID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return PgLocks.PG_LOCKS.TRANSACTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return PgLocks.PG_LOCKS.CLASSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return PgLocks.PG_LOCKS.OBJID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return PgLocks.PG_LOCKS.OBJSUBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return PgLocks.PG_LOCKS.VIRTUALTRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return PgLocks.PG_LOCKS.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return PgLocks.PG_LOCKS.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return PgLocks.PG_LOCKS.GRANTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return PgLocks.PG_LOCKS.FASTPATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getLocktype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDatabase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getRelation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getTuple();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getVirtualxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getTransactionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getClassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getObjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getObjsubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getVirtualtransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getGranted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component15() {
        return getFastpath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLocktype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDatabase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getRelation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getTuple();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getVirtualxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getTransactionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getClassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getObjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getObjsubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getVirtualtransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getGranted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getFastpath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value1(String value) {
        setLocktype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value2(Long value) {
        setDatabase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value3(Long value) {
        setRelation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value4(Integer value) {
        setPage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value5(Short value) {
        setTuple(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value6(String value) {
        setVirtualxid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value7(Long value) {
        setTransactionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value8(Long value) {
        setClassid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value9(Long value) {
        setObjid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value10(Short value) {
        setObjsubid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value11(String value) {
        setVirtualtransaction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value12(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value13(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value14(Boolean value) {
        setGranted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord value15(Boolean value) {
        setFastpath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocksRecord values(String value1, Long value2, Long value3, Integer value4, Short value5, String value6, Long value7, Long value8, Long value9, Short value10, String value11, Integer value12, String value13, Boolean value14, Boolean value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLocksRecord
     */
    public PgLocksRecord() {
        super(PgLocks.PG_LOCKS);
    }

    /**
     * Create a detached, initialised PgLocksRecord
     */
    public PgLocksRecord(String locktype, Long database, Long relation, Integer page, Short tuple, String virtualxid, Long transactionid, Long classid, Long objid, Short objsubid, String virtualtransaction, Integer pid, String mode, Boolean granted, Boolean fastpath) {
        super(PgLocks.PG_LOCKS);

        set(0, locktype);
        set(1, database);
        set(2, relation);
        set(3, page);
        set(4, tuple);
        set(5, virtualxid);
        set(6, transactionid);
        set(7, classid);
        set(8, objid);
        set(9, objsubid);
        set(10, virtualtransaction);
        set(11, pid);
        set(12, mode);
        set(13, granted);
        set(14, fastpath);
    }
}
