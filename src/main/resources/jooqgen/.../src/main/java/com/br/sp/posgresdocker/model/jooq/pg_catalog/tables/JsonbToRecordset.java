/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.JsonbToRecordsetRecord;

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
public class JsonbToRecordset extends TableImpl<JsonbToRecordsetRecord> {

    private static final long serialVersionUID = 245561865;

    /**
     * The reference instance of <code>pg_catalog.jsonb_to_recordset</code>
     */
    public static final JsonbToRecordset JSONB_TO_RECORDSET = new JsonbToRecordset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbToRecordsetRecord> getRecordType() {
        return JsonbToRecordsetRecord.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public final TableField<JsonbToRecordsetRecord, Record> JSONB_TO_RECORDSET_ = createField("jsonb_to_recordset", org.jooq.impl.SQLDataType.RECORD, this, "");

    /**
     * Create a <code>pg_catalog.jsonb_to_recordset</code> table reference
     */
    public JsonbToRecordset() {
        this(DSL.name("jsonb_to_recordset"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_to_recordset</code> table reference
     */
    public JsonbToRecordset(String alias) {
        this(DSL.name(alias), JSONB_TO_RECORDSET);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_to_recordset</code> table reference
     */
    public JsonbToRecordset(Name alias) {
        this(alias, JSONB_TO_RECORDSET);
    }

    private JsonbToRecordset(Name alias, Table<JsonbToRecordsetRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonbToRecordset(Name alias, Table<JsonbToRecordsetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonbToRecordset(Table<O> child, ForeignKey<O, JsonbToRecordsetRecord> key) {
        super(child, key, JSONB_TO_RECORDSET);
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
    public JsonbToRecordset as(String alias) {
        return new JsonbToRecordset(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonbToRecordset as(Name alias) {
        return new JsonbToRecordset(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbToRecordset rename(String name) {
        return new JsonbToRecordset(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbToRecordset rename(Name name) {
        return new JsonbToRecordset(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonbToRecordset call(Object __1) {
        return new JsonbToRecordset(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""))
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonbToRecordset call(Field<Object> __1) {
        return new JsonbToRecordset(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}
