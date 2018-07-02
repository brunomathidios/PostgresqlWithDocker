/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgTablespaceDatabasesRecord;

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
public class PgTablespaceDatabases extends TableImpl<PgTablespaceDatabasesRecord> {

    private static final long serialVersionUID = 343476937;

    /**
     * The reference instance of <code>pg_catalog.pg_tablespace_databases</code>
     */
    public static final PgTablespaceDatabases PG_TABLESPACE_DATABASES = new PgTablespaceDatabases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTablespaceDatabasesRecord> getRecordType() {
        return PgTablespaceDatabasesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    public final TableField<PgTablespaceDatabasesRecord, Long> PG_TABLESPACE_DATABASES_ = createField("pg_tablespace_databases", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_tablespace_databases</code> table reference
     */
    public PgTablespaceDatabases() {
        this(DSL.name("pg_tablespace_databases"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace_databases</code> table reference
     */
    public PgTablespaceDatabases(String alias) {
        this(DSL.name(alias), PG_TABLESPACE_DATABASES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace_databases</code> table reference
     */
    public PgTablespaceDatabases(Name alias) {
        this(alias, PG_TABLESPACE_DATABASES);
    }

    private PgTablespaceDatabases(Name alias, Table<PgTablespaceDatabasesRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private PgTablespaceDatabases(Name alias, Table<PgTablespaceDatabasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgTablespaceDatabases(Table<O> child, ForeignKey<O, PgTablespaceDatabasesRecord> key) {
        super(child, key, PG_TABLESPACE_DATABASES);
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
    public PgTablespaceDatabases as(String alias) {
        return new PgTablespaceDatabases(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablespaceDatabases as(Name alias) {
        return new PgTablespaceDatabases(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespaceDatabases rename(String name) {
        return new PgTablespaceDatabases(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespaceDatabases rename(Name name) {
        return new PgTablespaceDatabases(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgTablespaceDatabases call(Long __1) {
        return new PgTablespaceDatabases(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.BIGINT)
        });
    }

    /**
     * Call this table-valued function
     */
    public PgTablespaceDatabases call(Field<Long> __1) {
        return new PgTablespaceDatabases(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}
