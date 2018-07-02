/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables;


import com.br.sp.posgresdocker.model.jooq.information_schema.InformationSchema;
import com.br.sp.posgresdocker.model.jooq.information_schema.tables.records.CheckConstraintsRecord;

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
public class CheckConstraints extends TableImpl<CheckConstraintsRecord> {

    private static final long serialVersionUID = 8565215;

    /**
     * The reference instance of <code>information_schema.check_constraints</code>
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = new CheckConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CheckConstraintsRecord> getRecordType() {
        return CheckConstraintsRecord.class;
    }

    /**
     * The column <code>information_schema.check_constraints.constraint_catalog</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraints.constraint_schema</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraints.constraint_name</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraints.check_clause</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CHECK_CLAUSE = createField("check_clause", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.check_constraints</code> table reference
     */
    public CheckConstraints() {
        this(DSL.name("check_constraints"), null);
    }

    /**
     * Create an aliased <code>information_schema.check_constraints</code> table reference
     */
    public CheckConstraints(String alias) {
        this(DSL.name(alias), CHECK_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.check_constraints</code> table reference
     */
    public CheckConstraints(Name alias) {
        this(alias, CHECK_CONSTRAINTS);
    }

    private CheckConstraints(Name alias, Table<CheckConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraints(Name alias, Table<CheckConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CheckConstraints(Table<O> child, ForeignKey<O, CheckConstraintsRecord> key) {
        super(child, key, CHECK_CONSTRAINTS);
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
    public CheckConstraints as(String alias) {
        return new CheckConstraints(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraints as(Name alias) {
        return new CheckConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraints rename(String name) {
        return new CheckConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraints rename(Name name) {
        return new CheckConstraints(name, null);
    }
}
