/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.JsonArrayElementsTextRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class JsonArrayElementsText extends TableImpl<JsonArrayElementsTextRecord> {

    private static final long serialVersionUID = -1530304169;

    /**
     * The reference instance of <code>pg_catalog.json_array_elements_text</code>
     */
    public static final JsonArrayElementsText JSON_ARRAY_ELEMENTS_TEXT = new JsonArrayElementsText();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonArrayElementsTextRecord> getRecordType() {
        return JsonArrayElementsTextRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_array_elements_text.value</code>.
     */
    public final TableField<JsonArrayElementsTextRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.json_array_elements_text</code> table reference
     */
    public JsonArrayElementsText() {
        this(DSL.name("json_array_elements_text"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements_text</code> table reference
     */
    public JsonArrayElementsText(String alias) {
        this(DSL.name(alias), JSON_ARRAY_ELEMENTS_TEXT);
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements_text</code> table reference
     */
    public JsonArrayElementsText(Name alias) {
        this(alias, JSON_ARRAY_ELEMENTS_TEXT);
    }

    private JsonArrayElementsText(Name alias, Table<JsonArrayElementsTextRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonArrayElementsText(Name alias, Table<JsonArrayElementsTextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonArrayElementsText(Table<O> child, ForeignKey<O, JsonArrayElementsTextRecord> key) {
        super(child, key, JSON_ARRAY_ELEMENTS_TEXT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArrayElementsText as(String alias) {
        return new JsonArrayElementsText(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArrayElementsText as(Name alias) {
        return new JsonArrayElementsText(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonArrayElementsText rename(String name) {
        return new JsonArrayElementsText(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonArrayElementsText rename(Name name) {
        return new JsonArrayElementsText(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElementsText call(Object fromJson) {
        return new JsonArrayElementsText(DSL.name(getName()), null, new Field[] { 
              DSL.val(fromJson, org.jooq.impl.SQLDataType.OTHER)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElementsText call(Field<Object> fromJson) {
        return new JsonArrayElementsText(DSL.name(getName()), null, new Field[] { 
              fromJson
        });
    }
}
