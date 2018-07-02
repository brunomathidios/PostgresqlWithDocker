/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.TsStat;

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
public class TsStatRecord extends TableRecordImpl<TsStatRecord> implements Record6<String, String, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1911461065;

    /**
     * Setter for <code>pg_catalog.ts_stat.word</code>.
     */
    public void setWord(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.word</code>.
     */
    public String getWord() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.word</code>.
     */
    public void setWord(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.word</code>.
     */
    public String getWord() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.ndoc</code>.
     */
    public void setNdoc(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.ndoc</code>.
     */
    public Integer getNdoc() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.ndoc</code>.
     */
    public void setNdoc(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.ndoc</code>.
     */
    public Integer getNdoc() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.nentry</code>.
     */
    public void setNentry(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.nentry</code>.
     */
    public Integer getNentry() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.nentry</code>.
     */
    public void setNentry(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.nentry</code>.
     */
    public Integer getNentry() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TsStat.TS_STAT.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TsStat.TS_STAT.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TsStat.TS_STAT.NDOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TsStat.TS_STAT.NDOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TsStat.TS_STAT.NENTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TsStat.TS_STAT.NENTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getNdoc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getNdoc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getNentry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getNentry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getNdoc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getNdoc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNentry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getNentry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsStatRecord value1(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsStatRecord value2(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsStatRecord value3(Integer value) {
        setNdoc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsStatRecord value4(Integer value) {
        setNdoc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsStatRecord value5(Integer value) {
        setNentry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsStatRecord value6(Integer value) {
        setNentry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsStatRecord values(String value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6) {
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
     * Create a detached TsStatRecord
     */
    public TsStatRecord() {
        super(TsStat.TS_STAT);
    }

    /**
     * Create a detached, initialised TsStatRecord
     */
    public TsStatRecord(String word, String word, Integer ndoc, Integer ndoc, Integer nentry, Integer nentry) {
        super(TsStat.TS_STAT);

        set(0, word);
        set(1, word);
        set(2, ndoc);
        set(3, ndoc);
        set(4, nentry);
        set(5, nentry);
    }
}
