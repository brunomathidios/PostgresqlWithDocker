/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables.records;


import com.br.sp.posgresdocker.model.jooq.information_schema.tables.DomainUdtUsage;

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
public class DomainUdtUsageRecord extends TableRecordImpl<DomainUdtUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 65484229;

    /**
     * Setter for <code>information_schema.domain_udt_usage.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.domain_catalog</code>.
     */
    public void setDomainCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.domain_schema</code>.
     */
    public void setDomainSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.domain_schema</code>.
     */
    public String getDomainSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.domain_name</code>.
     */
    public void setDomainName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.domain_name</code>.
     */
    public String getDomainName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.UDT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.UDT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.UDT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.DOMAIN_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.DOMAIN_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.DOMAIN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUdtCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUdtSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUdtName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDomainCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDomainSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDomainName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUdtCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUdtSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUdtName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDomainCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDomainSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDomainName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainUdtUsageRecord value1(String value) {
        setUdtCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainUdtUsageRecord value2(String value) {
        setUdtSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainUdtUsageRecord value3(String value) {
        setUdtName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainUdtUsageRecord value4(String value) {
        setDomainCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainUdtUsageRecord value5(String value) {
        setDomainSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainUdtUsageRecord value6(String value) {
        setDomainName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainUdtUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached DomainUdtUsageRecord
     */
    public DomainUdtUsageRecord() {
        super(DomainUdtUsage.DOMAIN_UDT_USAGE);
    }

    /**
     * Create a detached, initialised DomainUdtUsageRecord
     */
    public DomainUdtUsageRecord(String udtCatalog, String udtSchema, String udtName, String domainCatalog, String domainSchema, String domainName) {
        super(DomainUdtUsage.DOMAIN_UDT_USAGE);

        set(0, udtCatalog);
        set(1, udtSchema);
        set(2, udtName);
        set(3, domainCatalog);
        set(4, domainSchema);
        set(5, domainName);
    }
}
