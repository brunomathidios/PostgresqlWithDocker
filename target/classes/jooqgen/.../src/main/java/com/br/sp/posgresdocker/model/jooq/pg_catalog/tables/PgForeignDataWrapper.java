/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.Indexes;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgForeignDataWrapperRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgForeignDataWrapper extends TableImpl<PgForeignDataWrapperRecord> {

    private static final long serialVersionUID = -180304638;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_data_wrapper</code>
     */
    public static final PgForeignDataWrapper PG_FOREIGN_DATA_WRAPPER = new PgForeignDataWrapper();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgForeignDataWrapperRecord> getRecordType() {
        return PgForeignDataWrapperRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, String> FDWNAME = createField("fdwname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, Long> FDWOWNER = createField("fdwowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, Long> FDWHANDLER = createField("fdwhandler", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, Long> FDWVALIDATOR = createField("fdwvalidator", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, String[]> FDWACL = createField("fdwacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, String[]> FDWOPTIONS = createField("fdwoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_foreign_data_wrapper</code> table reference
     */
    public PgForeignDataWrapper() {
        this(DSL.name("pg_foreign_data_wrapper"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_data_wrapper</code> table reference
     */
    public PgForeignDataWrapper(String alias) {
        this(DSL.name(alias), PG_FOREIGN_DATA_WRAPPER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_data_wrapper</code> table reference
     */
    public PgForeignDataWrapper(Name alias) {
        this(alias, PG_FOREIGN_DATA_WRAPPER);
    }

    private PgForeignDataWrapper(Name alias, Table<PgForeignDataWrapperRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignDataWrapper(Name alias, Table<PgForeignDataWrapperRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgForeignDataWrapper(Table<O> child, ForeignKey<O, PgForeignDataWrapperRecord> key) {
        super(child, key, PG_FOREIGN_DATA_WRAPPER);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_FOREIGN_DATA_WRAPPER_NAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapper as(String alias) {
        return new PgForeignDataWrapper(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignDataWrapper as(Name alias) {
        return new PgForeignDataWrapper(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignDataWrapper rename(String name) {
        return new PgForeignDataWrapper(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignDataWrapper rename(Name name) {
        return new PgForeignDataWrapper(name, null);
    }
}
