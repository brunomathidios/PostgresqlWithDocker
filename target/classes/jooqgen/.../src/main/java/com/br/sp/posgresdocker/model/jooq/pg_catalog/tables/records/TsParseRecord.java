/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.TsParse;

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
public class TsParseRecord extends TableRecordImpl<TsParseRecord> implements Record4<Integer, Integer, String, String> {

    private static final long serialVersionUID = -2145272465;

    /**
     * Setter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    public void setTokid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    public Integer getTokid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    public void setTokid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    public Integer getTokid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.ts_parse.token</code>.
     */
    public void setToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.token</code>.
     */
    public String getToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.ts_parse.token</code>.
     */
    public void setToken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.token</code>.
     */
    public String getToken() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TsParse.TS_PARSE.TOKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TsParse.TS_PARSE.TOKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TsParse.TS_PARSE.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TsParse.TS_PARSE.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTokid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getTokid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTokid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTokid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsParseRecord value1(Integer value) {
        setTokid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsParseRecord value2(Integer value) {
        setTokid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsParseRecord value3(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsParseRecord value4(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsParseRecord values(Integer value1, Integer value2, String value3, String value4) {
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
     * Create a detached TsParseRecord
     */
    public TsParseRecord() {
        super(TsParse.TS_PARSE);
    }

    /**
     * Create a detached, initialised TsParseRecord
     */
    public TsParseRecord(Integer tokid, Integer tokid, String token, String token) {
        super(TsParse.TS_PARSE);

        set(0, tokid);
        set(1, tokid);
        set(2, token);
        set(3, token);
    }
}
