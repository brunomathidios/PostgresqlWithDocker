/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgPublication;

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
public class PgPublicationRecord extends TableRecordImpl<PgPublicationRecord> implements Record6<String, Long, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = -869057169;

    /**
     * Setter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    public void setPubname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    public String getPubname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    public void setPubowner(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    public Long getPubowner() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    public void setPuballtables(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    public Boolean getPuballtables() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    public void setPubinsert(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    public Boolean getPubinsert() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    public void setPubupdate(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    public Boolean getPubupdate() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    public void setPubdelete(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    public Boolean getPubdelete() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgPublication.PG_PUBLICATION.PUBNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgPublication.PG_PUBLICATION.PUBOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return PgPublication.PG_PUBLICATION.PUBALLTABLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgPublication.PG_PUBLICATION.PUBINSERT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgPublication.PG_PUBLICATION.PUBUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgPublication.PG_PUBLICATION.PUBDELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPubname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getPubowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getPuballtables();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getPubinsert();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getPubupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getPubdelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPubname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getPubowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getPuballtables();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getPubinsert();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getPubupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getPubdelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value1(String value) {
        setPubname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value2(Long value) {
        setPubowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value3(Boolean value) {
        setPuballtables(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value4(Boolean value) {
        setPubinsert(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value5(Boolean value) {
        setPubupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value6(Boolean value) {
        setPubdelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord values(String value1, Long value2, Boolean value3, Boolean value4, Boolean value5, Boolean value6) {
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
     * Create a detached PgPublicationRecord
     */
    public PgPublicationRecord() {
        super(PgPublication.PG_PUBLICATION);
    }

    /**
     * Create a detached, initialised PgPublicationRecord
     */
    public PgPublicationRecord(String pubname, Long pubowner, Boolean puballtables, Boolean pubinsert, Boolean pubupdate, Boolean pubdelete) {
        super(PgPublication.PG_PUBLICATION);

        set(0, pubname);
        set(1, pubowner);
        set(2, puballtables);
        set(3, pubinsert);
        set(4, pubupdate);
        set(5, pubdelete);
    }
}
