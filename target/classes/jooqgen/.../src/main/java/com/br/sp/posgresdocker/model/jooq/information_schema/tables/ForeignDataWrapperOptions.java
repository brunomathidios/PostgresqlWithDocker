/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables;


import com.br.sp.posgresdocker.model.jooq.information_schema.InformationSchema;
import com.br.sp.posgresdocker.model.jooq.information_schema.tables.records.ForeignDataWrapperOptionsRecord;

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
public class ForeignDataWrapperOptions extends TableImpl<ForeignDataWrapperOptionsRecord> {

    private static final long serialVersionUID = -963659055;

    /**
     * The reference instance of <code>information_schema.foreign_data_wrapper_options</code>
     */
    public static final ForeignDataWrapperOptions FOREIGN_DATA_WRAPPER_OPTIONS = new ForeignDataWrapperOptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignDataWrapperOptionsRecord> getRecordType() {
        return ForeignDataWrapperOptionsRecord.class;
    }

    /**
     * The column <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<ForeignDataWrapperOptionsRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField("foreign_data_wrapper_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_name</code>.
     */
    public final TableField<ForeignDataWrapperOptionsRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField("foreign_data_wrapper_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_data_wrapper_options.option_name</code>.
     */
    public final TableField<ForeignDataWrapperOptionsRecord, String> OPTION_NAME = createField("option_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_data_wrapper_options.option_value</code>.
     */
    public final TableField<ForeignDataWrapperOptionsRecord, String> OPTION_VALUE = createField("option_value", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.foreign_data_wrapper_options</code> table reference
     */
    public ForeignDataWrapperOptions() {
        this(DSL.name("foreign_data_wrapper_options"), null);
    }

    /**
     * Create an aliased <code>information_schema.foreign_data_wrapper_options</code> table reference
     */
    public ForeignDataWrapperOptions(String alias) {
        this(DSL.name(alias), FOREIGN_DATA_WRAPPER_OPTIONS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_data_wrapper_options</code> table reference
     */
    public ForeignDataWrapperOptions(Name alias) {
        this(alias, FOREIGN_DATA_WRAPPER_OPTIONS);
    }

    private ForeignDataWrapperOptions(Name alias, Table<ForeignDataWrapperOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignDataWrapperOptions(Name alias, Table<ForeignDataWrapperOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForeignDataWrapperOptions(Table<O> child, ForeignKey<O, ForeignDataWrapperOptionsRecord> key) {
        super(child, key, FOREIGN_DATA_WRAPPER_OPTIONS);
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
    public ForeignDataWrapperOptions as(String alias) {
        return new ForeignDataWrapperOptions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrapperOptions as(Name alias) {
        return new ForeignDataWrapperOptions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignDataWrapperOptions rename(String name) {
        return new ForeignDataWrapperOptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignDataWrapperOptions rename(Name name) {
        return new ForeignDataWrapperOptions(name, null);
    }
}
