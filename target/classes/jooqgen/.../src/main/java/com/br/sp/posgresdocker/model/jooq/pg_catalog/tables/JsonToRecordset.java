/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.JsonToRecordsetRecord;

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
public class JsonToRecordset extends TableImpl<JsonToRecordsetRecord> {

    private static final long serialVersionUID = 911491419;

    /**
     * The reference instance of <code>pg_catalog.json_to_recordset</code>
     */
    public static final JsonToRecordset JSON_TO_RECORDSET = new JsonToRecordset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonToRecordsetRecord> getRecordType() {
        return JsonToRecordsetRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_to_recordset.json_to_recordset</code>.
     */
    public final TableField<JsonToRecordsetRecord, Record> JSON_TO_RECORDSET_ = createField("json_to_recordset", org.jooq.impl.SQLDataType.RECORD, this, "");

    /**
     * Create a <code>pg_catalog.json_to_recordset</code> table reference
     */
    public JsonToRecordset() {
        this(DSL.name("json_to_recordset"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.json_to_recordset</code> table reference
     */
    public JsonToRecordset(String alias) {
        this(DSL.name(alias), JSON_TO_RECORDSET);
    }

    /**
     * Create an aliased <code>pg_catalog.json_to_recordset</code> table reference
     */
    public JsonToRecordset(Name alias) {
        this(alias, JSON_TO_RECORDSET);
    }

    private JsonToRecordset(Name alias, Table<JsonToRecordsetRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonToRecordset(Name alias, Table<JsonToRecordsetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonToRecordset(Table<O> child, ForeignKey<O, JsonToRecordsetRecord> key) {
        super(child, key, JSON_TO_RECORDSET);
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
    public JsonToRecordset as(String alias) {
        return new JsonToRecordset(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonToRecordset as(Name alias) {
        return new JsonToRecordset(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonToRecordset rename(String name) {
        return new JsonToRecordset(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonToRecordset rename(Name name) {
        return new JsonToRecordset(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonToRecordset call(Object __1) {
        return new JsonToRecordset(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.OTHER)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonToRecordset call(Field<Object> __1) {
        return new JsonToRecordset(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}
