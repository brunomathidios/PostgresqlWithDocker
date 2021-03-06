/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables;


import com.br.sp.posgresdocker.model.jooq.information_schema.InformationSchema;
import com.br.sp.posgresdocker.model.jooq.information_schema.tables.records.ForeignTablesRecord;

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
public class ForeignTables extends TableImpl<ForeignTablesRecord> {

    private static final long serialVersionUID = -1445922653;

    /**
     * The reference instance of <code>information_schema.foreign_tables</code>
     */
    public static final ForeignTables FOREIGN_TABLES = new ForeignTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignTablesRecord> getRecordType() {
        return ForeignTablesRecord.class;
    }

    /**
     * The column <code>information_schema.foreign_tables.foreign_table_catalog</code>.
     */
    public final TableField<ForeignTablesRecord, String> FOREIGN_TABLE_CATALOG = createField("foreign_table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_tables.foreign_table_schema</code>.
     */
    public final TableField<ForeignTablesRecord, String> FOREIGN_TABLE_SCHEMA = createField("foreign_table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_tables.foreign_table_name</code>.
     */
    public final TableField<ForeignTablesRecord, String> FOREIGN_TABLE_NAME = createField("foreign_table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_tables.foreign_server_catalog</code>.
     */
    public final TableField<ForeignTablesRecord, String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_tables.foreign_server_name</code>.
     */
    public final TableField<ForeignTablesRecord, String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.foreign_tables</code> table reference
     */
    public ForeignTables() {
        this(DSL.name("foreign_tables"), null);
    }

    /**
     * Create an aliased <code>information_schema.foreign_tables</code> table reference
     */
    public ForeignTables(String alias) {
        this(DSL.name(alias), FOREIGN_TABLES);
    }

    /**
     * Create an aliased <code>information_schema.foreign_tables</code> table reference
     */
    public ForeignTables(Name alias) {
        this(alias, FOREIGN_TABLES);
    }

    private ForeignTables(Name alias, Table<ForeignTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignTables(Name alias, Table<ForeignTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForeignTables(Table<O> child, ForeignKey<O, ForeignTablesRecord> key) {
        super(child, key, FOREIGN_TABLES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignTables as(String alias) {
        return new ForeignTables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignTables as(Name alias) {
        return new ForeignTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignTables rename(String name) {
        return new ForeignTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignTables rename(Name name) {
        return new ForeignTables(name, null);
    }
}
