/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables.records;


import com.br.sp.posgresdocker.model.jooq.information_schema.tables.SqlSizing;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class SqlSizingRecord extends TableRecordImpl<SqlSizingRecord> implements Record4<Integer, String, Integer, String> {

    private static final long serialVersionUID = 2056329538;

    /**
     * Setter for <code>information_schema.sql_sizing.sizing_id</code>.
     */
    public void setSizingId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing.sizing_id</code>.
     */
    public Integer getSizingId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>information_schema.sql_sizing.sizing_name</code>.
     */
    public void setSizingName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing.sizing_name</code>.
     */
    public String getSizingName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sql_sizing.supported_value</code>.
     */
    public void setSupportedValue(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing.supported_value</code>.
     */
    public Integer getSupportedValue() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>information_schema.sql_sizing.comments</code>.
     */
    public void setComments(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing.comments</code>.
     */
    public String getComments() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SqlSizing.SQL_SIZING.SIZING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SqlSizing.SQL_SIZING.SIZING_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SqlSizing.SQL_SIZING.SUPPORTED_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SqlSizing.SQL_SIZING.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSizingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSizingName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSupportedValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSizingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSizingName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSupportedValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingRecord value1(Integer value) {
        setSizingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingRecord value2(String value) {
        setSizingName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingRecord value3(Integer value) {
        setSupportedValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingRecord value4(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingRecord values(Integer value1, String value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqlSizingRecord
     */
    public SqlSizingRecord() {
        super(SqlSizing.SQL_SIZING);
    }

    /**
     * Create a detached, initialised SqlSizingRecord
     */
    public SqlSizingRecord(Integer sizingId, String sizingName, Integer supportedValue, String comments) {
        super(SqlSizing.SQL_SIZING);

        set(0, sizingId);
        set(1, sizingName);
        set(2, supportedValue);
        set(3, comments);
    }
}