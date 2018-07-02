/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgStatWalReceiver;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class PgStatWalReceiverRecord extends TableRecordImpl<PgStatWalReceiverRecord> implements Record12<Integer, String, Object, Integer, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String> {

    private static final long serialVersionUID = -136255810;

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.status</code>.
     */
    public void setStatus(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.status</code>.
     */
    public String getStatus() {
        return (String) get(1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setReceiveStartLsn(Object value) {
        set(2, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getReceiveStartLsn() {
        return get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.receive_start_tli</code>.
     */
    public void setReceiveStartTli(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.receive_start_tli</code>.
     */
    public Integer getReceiveStartTli() {
        return (Integer) get(3);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setReceivedLsn(Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getReceivedLsn() {
        return get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.received_tli</code>.
     */
    public void setReceivedTli(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.received_tli</code>.
     */
    public Integer getReceivedTli() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.last_msg_send_time</code>.
     */
    public void setLastMsgSendTime(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.last_msg_send_time</code>.
     */
    public OffsetDateTime getLastMsgSendTime() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.last_msg_receipt_time</code>.
     */
    public void setLastMsgReceiptTime(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.last_msg_receipt_time</code>.
     */
    public OffsetDateTime getLastMsgReceiptTime() {
        return (OffsetDateTime) get(7);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setLatestEndLsn(Object value) {
        set(8, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getLatestEndLsn() {
        return get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.latest_end_time</code>.
     */
    public void setLatestEndTime(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.latest_end_time</code>.
     */
    public OffsetDateTime getLatestEndTime() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.slot_name</code>.
     */
    public void setSlotName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.slot_name</code>.
     */
    public String getSlotName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.conninfo</code>.
     */
    public void setConninfo(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.conninfo</code>.
     */
    public String getConninfo() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, Object, Integer, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, Object, Integer, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.STATUS;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field3() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.RECEIVE_START_LSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.RECEIVE_START_TLI;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field5() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.RECEIVED_LSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.RECEIVED_TLI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field7() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LAST_MSG_SEND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field8() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LAST_MSG_RECEIPT_TIME;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field9() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LATEST_END_LSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field10() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LATEST_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.SLOT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.CONNINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getStatus();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component3() {
        return getReceiveStartLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getReceiveStartTli();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component5() {
        return getReceivedLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getReceivedTli();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component7() {
        return getLastMsgSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component8() {
        return getLastMsgReceiptTime();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component9() {
        return getLatestEndLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component10() {
        return getLatestEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSlotName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getConninfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStatus();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value3() {
        return getReceiveStartLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getReceiveStartTli();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value5() {
        return getReceivedLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getReceivedTli();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value7() {
        return getLastMsgSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value8() {
        return getLastMsgReceiptTime();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value9() {
        return getLatestEndLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value10() {
        return getLatestEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSlotName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getConninfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value2(String value) {
        setStatus(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgStatWalReceiverRecord value3(Object value) {
        setReceiveStartLsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value4(Integer value) {
        setReceiveStartTli(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgStatWalReceiverRecord value5(Object value) {
        setReceivedLsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value6(Integer value) {
        setReceivedTli(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value7(OffsetDateTime value) {
        setLastMsgSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value8(OffsetDateTime value) {
        setLastMsgReceiptTime(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgStatWalReceiverRecord value9(Object value) {
        setLatestEndLsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value10(OffsetDateTime value) {
        setLatestEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value11(String value) {
        setSlotName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord value12(String value) {
        setConninfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatWalReceiverRecord values(Integer value1, String value2, Object value3, Integer value4, Object value5, Integer value6, OffsetDateTime value7, OffsetDateTime value8, Object value9, OffsetDateTime value10, String value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatWalReceiverRecord
     */
    public PgStatWalReceiverRecord() {
        super(PgStatWalReceiver.PG_STAT_WAL_RECEIVER);
    }

    /**
     * Create a detached, initialised PgStatWalReceiverRecord
     */
    public PgStatWalReceiverRecord(Integer pid, String status, Object receiveStartLsn, Integer receiveStartTli, Object receivedLsn, Integer receivedTli, OffsetDateTime lastMsgSendTime, OffsetDateTime lastMsgReceiptTime, Object latestEndLsn, OffsetDateTime latestEndTime, String slotName, String conninfo) {
        super(PgStatWalReceiver.PG_STAT_WAL_RECEIVER);

        set(0, pid);
        set(1, status);
        set(2, receiveStartLsn);
        set(3, receiveStartTli);
        set(4, receivedLsn);
        set(5, receivedTli);
        set(6, lastMsgSendTime);
        set(7, lastMsgReceiptTime);
        set(8, latestEndLsn);
        set(9, latestEndTime);
        set(10, slotName);
        set(11, conninfo);
    }
}
