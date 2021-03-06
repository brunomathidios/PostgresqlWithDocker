/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables;


import com.br.sp.posgresdocker.model.jooq.information_schema.InformationSchema;
import com.br.sp.posgresdocker.model.jooq.information_schema.tables.records.SqlPackagesRecord;

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
public class SqlPackages extends TableImpl<SqlPackagesRecord> {

    private static final long serialVersionUID = 1879191512;

    /**
     * The reference instance of <code>information_schema.sql_packages</code>
     */
    public static final SqlPackages SQL_PACKAGES = new SqlPackages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlPackagesRecord> getRecordType() {
        return SqlPackagesRecord.class;
    }

    /**
     * The column <code>information_schema.sql_packages.feature_id</code>.
     */
    public final TableField<SqlPackagesRecord, String> FEATURE_ID = createField("feature_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_packages.feature_name</code>.
     */
    public final TableField<SqlPackagesRecord, String> FEATURE_NAME = createField("feature_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_packages.is_supported</code>.
     */
    public final TableField<SqlPackagesRecord, String> IS_SUPPORTED = createField("is_supported", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.sql_packages.is_verified_by</code>.
     */
    public final TableField<SqlPackagesRecord, String> IS_VERIFIED_BY = createField("is_verified_by", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_packages.comments</code>.
     */
    public final TableField<SqlPackagesRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.sql_packages</code> table reference
     */
    public SqlPackages() {
        this(DSL.name("sql_packages"), null);
    }

    /**
     * Create an aliased <code>information_schema.sql_packages</code> table reference
     */
    public SqlPackages(String alias) {
        this(DSL.name(alias), SQL_PACKAGES);
    }

    /**
     * Create an aliased <code>information_schema.sql_packages</code> table reference
     */
    public SqlPackages(Name alias) {
        this(alias, SQL_PACKAGES);
    }

    private SqlPackages(Name alias, Table<SqlPackagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlPackages(Name alias, Table<SqlPackagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SqlPackages(Table<O> child, ForeignKey<O, SqlPackagesRecord> key) {
        super(child, key, SQL_PACKAGES);
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
    public SqlPackages as(String alias) {
        return new SqlPackages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPackages as(Name alias) {
        return new SqlPackages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlPackages rename(String name) {
        return new SqlPackages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlPackages rename(Name name) {
        return new SqlPackages(name, null);
    }
}
