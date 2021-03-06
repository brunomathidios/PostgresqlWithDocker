/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.JsonbEachRecord;

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
public class JsonbEach extends TableImpl<JsonbEachRecord> {

    private static final long serialVersionUID = 1302529466;

    /**
     * The reference instance of <code>pg_catalog.jsonb_each</code>
     */
    public static final JsonbEach JSONB_EACH = new JsonbEach();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbEachRecord> getRecordType() {
        return JsonbEachRecord.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_each.key</code>.
     */
    public final TableField<JsonbEachRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JsonbEachRecord, Object> VALUE = createField("value", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), this, "");

    /**
     * Create a <code>pg_catalog.jsonb_each</code> table reference
     */
    public JsonbEach() {
        this(DSL.name("jsonb_each"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_each</code> table reference
     */
    public JsonbEach(String alias) {
        this(DSL.name(alias), JSONB_EACH);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_each</code> table reference
     */
    public JsonbEach(Name alias) {
        this(alias, JSONB_EACH);
    }

    private JsonbEach(Name alias, Table<JsonbEachRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonbEach(Name alias, Table<JsonbEachRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonbEach(Table<O> child, ForeignKey<O, JsonbEachRecord> key) {
        super(child, key, JSONB_EACH);
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
    public JsonbEach as(String alias) {
        return new JsonbEach(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonbEach as(Name alias) {
        return new JsonbEach(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbEach rename(String name) {
        return new JsonbEach(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbEach rename(Name name) {
        return new JsonbEach(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonbEach call(Object fromJson) {
        return new JsonbEach(DSL.name(getName()), null, new Field[] { 
              DSL.val(fromJson, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""))
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonbEach call(Field<Object> fromJson) {
        return new JsonbEach(DSL.name(getName()), null, new Field[] { 
              fromJson
        });
    }
}
