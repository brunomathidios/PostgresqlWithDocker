/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgUserRecord;

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
public class PgUser extends TableImpl<PgUserRecord> {

    private static final long serialVersionUID = -1335296235;

    /**
     * The reference instance of <code>pg_catalog.pg_user</code>
     */
    public static final PgUser PG_USER = new PgUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgUserRecord> getRecordType() {
        return PgUserRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_user.usename</code>.
     */
    public final TableField<PgUserRecord, String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usesysid</code>.
     */
    public final TableField<PgUserRecord, Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public final TableField<PgUserRecord, Boolean> USECREATEDB = createField("usecreatedb", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usesuper</code>.
     */
    public final TableField<PgUserRecord, Boolean> USESUPER = createField("usesuper", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.userepl</code>.
     */
    public final TableField<PgUserRecord, Boolean> USEREPL = createField("userepl", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public final TableField<PgUserRecord, Boolean> USEBYPASSRLS = createField("usebypassrls", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.passwd</code>.
     */
    public final TableField<PgUserRecord, String> PASSWD = createField("passwd", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgUserRecord, Object> VALUNTIL = createField("valuntil", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"abstime\""), this, "");

    /**
     * The column <code>pg_catalog.pg_user.useconfig</code>.
     */
    public final TableField<PgUserRecord, String[]> USECONFIG = createField("useconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser() {
        this(DSL.name("pg_user"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser(String alias) {
        this(DSL.name(alias), PG_USER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser(Name alias) {
        this(alias, PG_USER);
    }

    private PgUser(Name alias, Table<PgUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUser(Name alias, Table<PgUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgUser(Table<O> child, ForeignKey<O, PgUserRecord> key) {
        super(child, key, PG_USER);
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
    public PgUser as(String alias) {
        return new PgUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUser as(Name alias) {
        return new PgUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUser rename(String name) {
        return new PgUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUser rename(Name name) {
        return new PgUser(name, null);
    }
}
