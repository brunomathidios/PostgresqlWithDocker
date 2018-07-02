/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables.records;


import com.br.sp.posgresdocker.model.jooq.information_schema.tables.SqlLanguages;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class SqlLanguagesRecord extends TableRecordImpl<SqlLanguagesRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 209007508;

    /**
     * Setter for <code>information_schema.sql_languages.sql_language_source</code>.
     */
    public void setSqlLanguageSource(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sql_languages.sql_language_source</code>.
     */
    public String getSqlLanguageSource() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.sql_languages.sql_language_year</code>.
     */
    public void setSqlLanguageYear(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sql_languages.sql_language_year</code>.
     */
    public String getSqlLanguageYear() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sql_languages.sql_language_conformance</code>.
     */
    public void setSqlLanguageConformance(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sql_languages.sql_language_conformance</code>.
     */
    public String getSqlLanguageConformance() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sql_languages.sql_language_integrity</code>.
     */
    public void setSqlLanguageIntegrity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sql_languages.sql_language_integrity</code>.
     */
    public String getSqlLanguageIntegrity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.sql_languages.sql_language_implementation</code>.
     */
    public void setSqlLanguageImplementation(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sql_languages.sql_language_implementation</code>.
     */
    public String getSqlLanguageImplementation() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.sql_languages.sql_language_binding_style</code>.
     */
    public void setSqlLanguageBindingStyle(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.sql_languages.sql_language_binding_style</code>.
     */
    public String getSqlLanguageBindingStyle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.sql_languages.sql_language_programming_language</code>.
     */
    public void setSqlLanguageProgrammingLanguage(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.sql_languages.sql_language_programming_language</code>.
     */
    public String getSqlLanguageProgrammingLanguage() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SqlLanguages.SQL_LANGUAGES.SQL_LANGUAGE_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SqlLanguages.SQL_LANGUAGES.SQL_LANGUAGE_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SqlLanguages.SQL_LANGUAGES.SQL_LANGUAGE_CONFORMANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SqlLanguages.SQL_LANGUAGES.SQL_LANGUAGE_INTEGRITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SqlLanguages.SQL_LANGUAGES.SQL_LANGUAGE_IMPLEMENTATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SqlLanguages.SQL_LANGUAGES.SQL_LANGUAGE_BINDING_STYLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SqlLanguages.SQL_LANGUAGES.SQL_LANGUAGE_PROGRAMMING_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSqlLanguageSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSqlLanguageYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSqlLanguageConformance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSqlLanguageIntegrity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSqlLanguageImplementation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSqlLanguageBindingStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSqlLanguageProgrammingLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSqlLanguageSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSqlLanguageYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSqlLanguageConformance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSqlLanguageIntegrity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSqlLanguageImplementation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSqlLanguageBindingStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSqlLanguageProgrammingLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord value1(String value) {
        setSqlLanguageSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord value2(String value) {
        setSqlLanguageYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord value3(String value) {
        setSqlLanguageConformance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord value4(String value) {
        setSqlLanguageIntegrity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord value5(String value) {
        setSqlLanguageImplementation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord value6(String value) {
        setSqlLanguageBindingStyle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord value7(String value) {
        setSqlLanguageProgrammingLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguagesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqlLanguagesRecord
     */
    public SqlLanguagesRecord() {
        super(SqlLanguages.SQL_LANGUAGES);
    }

    /**
     * Create a detached, initialised SqlLanguagesRecord
     */
    public SqlLanguagesRecord(String sqlLanguageSource, String sqlLanguageYear, String sqlLanguageConformance, String sqlLanguageIntegrity, String sqlLanguageImplementation, String sqlLanguageBindingStyle, String sqlLanguageProgrammingLanguage) {
        super(SqlLanguages.SQL_LANGUAGES);

        set(0, sqlLanguageSource);
        set(1, sqlLanguageYear);
        set(2, sqlLanguageConformance);
        set(3, sqlLanguageIntegrity);
        set(4, sqlLanguageImplementation);
        set(5, sqlLanguageBindingStyle);
        set(6, sqlLanguageProgrammingLanguage);
    }
}
