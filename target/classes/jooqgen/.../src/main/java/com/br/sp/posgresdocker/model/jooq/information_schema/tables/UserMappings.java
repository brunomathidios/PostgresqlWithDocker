/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables;


import com.br.sp.posgresdocker.model.jooq.information_schema.InformationSchema;
import com.br.sp.posgresdocker.model.jooq.information_schema.tables.records.UserMappingsRecord;

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
public class UserMappings extends TableImpl<UserMappingsRecord> {

    private static final long serialVersionUID = 1451721552;

    /**
     * The reference instance of <code>information_schema.user_mappings</code>
     */
    public static final UserMappings USER_MAPPINGS = new UserMappings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserMappingsRecord> getRecordType() {
        return UserMappingsRecord.class;
    }

    /**
     * The column <code>information_schema.user_mappings.authorization_identifier</code>.
     */
    public final TableField<UserMappingsRecord, String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.user_mappings.foreign_server_catalog</code>.
     */
    public final TableField<UserMappingsRecord, String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.user_mappings.foreign_server_name</code>.
     */
    public final TableField<UserMappingsRecord, String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.user_mappings</code> table reference
     */
    public UserMappings() {
        this(DSL.name("user_mappings"), null);
    }

    /**
     * Create an aliased <code>information_schema.user_mappings</code> table reference
     */
    public UserMappings(String alias) {
        this(DSL.name(alias), USER_MAPPINGS);
    }

    /**
     * Create an aliased <code>information_schema.user_mappings</code> table reference
     */
    public UserMappings(Name alias) {
        this(alias, USER_MAPPINGS);
    }

    private UserMappings(Name alias, Table<UserMappingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserMappings(Name alias, Table<UserMappingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserMappings(Table<O> child, ForeignKey<O, UserMappingsRecord> key) {
        super(child, key, USER_MAPPINGS);
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
    public UserMappings as(String alias) {
        return new UserMappings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMappings as(Name alias) {
        return new UserMappings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMappings rename(String name) {
        return new UserMappings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMappings rename(Name name) {
        return new UserMappings(name, null);
    }
}
