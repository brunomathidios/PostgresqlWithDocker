/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgDatabase;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class PgDatabaseRecord extends TableRecordImpl<PgDatabaseRecord> implements Record13<String, Long, Integer, String, String, Boolean, Boolean, Integer, Long, Long, Long, Long, String[]> {

    private static final long serialVersionUID = -384911526;

    /**
     * Setter for <code>pg_catalog.pg_database.datname</code>.
     */
    public void setDatname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datname</code>.
     */
    public String getDatname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datdba</code>.
     */
    public void setDatdba(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datdba</code>.
     */
    public Long getDatdba() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.encoding</code>.
     */
    public void setEncoding(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.encoding</code>.
     */
    public Integer getEncoding() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    public void setDatcollate(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    public String getDatcollate() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datctype</code>.
     */
    public void setDatctype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datctype</code>.
     */
    public String getDatctype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public void setDatistemplate(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public Boolean getDatistemplate() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public void setDatallowconn(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public Boolean getDatallowconn() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public void setDatconnlimit(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public Integer getDatconnlimit() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datlastsysoid</code>.
     */
    public void setDatlastsysoid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datlastsysoid</code>.
     */
    public Long getDatlastsysoid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public void setDatfrozenxid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public Long getDatfrozenxid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public void setDatminmxid(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public Long getDatminmxid() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public void setDattablespace(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public Long getDattablespace() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datacl</code>.
     */
    public void setDatacl(String... value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datacl</code>.
     */
    public String[] getDatacl() {
        return (String[]) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, Long, Integer, String, String, Boolean, Boolean, Integer, Long, Long, Long, Long, String[]> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, Long, Integer, String, String, Boolean, Boolean, Integer, Long, Long, Long, Long, String[]> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgDatabase.PG_DATABASE.DATNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgDatabase.PG_DATABASE.DATDBA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PgDatabase.PG_DATABASE.ENCODING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgDatabase.PG_DATABASE.DATCOLLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgDatabase.PG_DATABASE.DATCTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgDatabase.PG_DATABASE.DATISTEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgDatabase.PG_DATABASE.DATALLOWCONN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return PgDatabase.PG_DATABASE.DATCONNLIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return PgDatabase.PG_DATABASE.DATLASTSYSOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PgDatabase.PG_DATABASE.DATFROZENXID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return PgDatabase.PG_DATABASE.DATMINMXID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return PgDatabase.PG_DATABASE.DATTABLESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field13() {
        return PgDatabase.PG_DATABASE.DATACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getDatname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDatdba();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDatcollate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDatctype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getDatistemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getDatallowconn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getDatconnlimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getDatlastsysoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getDatfrozenxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getDatminmxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getDattablespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component13() {
        return getDatacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDatname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDatdba();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDatcollate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDatctype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getDatistemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getDatallowconn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getDatconnlimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getDatlastsysoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getDatfrozenxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getDatminmxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getDattablespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value13() {
        return getDatacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value1(String value) {
        setDatname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value2(Long value) {
        setDatdba(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value3(Integer value) {
        setEncoding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value4(String value) {
        setDatcollate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value5(String value) {
        setDatctype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value6(Boolean value) {
        setDatistemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value7(Boolean value) {
        setDatallowconn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value8(Integer value) {
        setDatconnlimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value9(Long value) {
        setDatlastsysoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value10(Long value) {
        setDatfrozenxid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value11(Long value) {
        setDatminmxid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value12(Long value) {
        setDattablespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value13(String... value) {
        setDatacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord values(String value1, Long value2, Integer value3, String value4, String value5, Boolean value6, Boolean value7, Integer value8, Long value9, Long value10, Long value11, Long value12, String[] value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgDatabaseRecord
     */
    public PgDatabaseRecord() {
        super(PgDatabase.PG_DATABASE);
    }

    /**
     * Create a detached, initialised PgDatabaseRecord
     */
    public PgDatabaseRecord(String datname, Long datdba, Integer encoding, String datcollate, String datctype, Boolean datistemplate, Boolean datallowconn, Integer datconnlimit, Long datlastsysoid, Long datfrozenxid, Long datminmxid, Long dattablespace, String[] datacl) {
        super(PgDatabase.PG_DATABASE);

        set(0, datname);
        set(1, datdba);
        set(2, encoding);
        set(3, datcollate);
        set(4, datctype);
        set(5, datistemplate);
        set(6, datallowconn);
        set(7, datconnlimit);
        set(8, datlastsysoid);
        set(9, datfrozenxid);
        set(10, datminmxid);
        set(11, dattablespace);
        set(12, datacl);
    }
}
