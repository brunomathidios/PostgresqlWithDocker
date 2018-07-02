/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.RegexpMatchesRecord;

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
public class RegexpMatches extends TableImpl<RegexpMatchesRecord> {

    private static final long serialVersionUID = -1873779782;

    /**
     * The reference instance of <code>pg_catalog.regexp_matches</code>
     */
    public static final RegexpMatches REGEXP_MATCHES = new RegexpMatches();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegexpMatchesRecord> getRecordType() {
        return RegexpMatchesRecord.class;
    }

    /**
     * The column <code>pg_catalog.regexp_matches.regexp_matches</code>.
     */
    public final TableField<RegexpMatchesRecord, String[]> REGEXP_MATCHES_ = createField("regexp_matches", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.regexp_matches</code> table reference
     */
    public RegexpMatches() {
        this(DSL.name("regexp_matches"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_matches</code> table reference
     */
    public RegexpMatches(String alias) {
        this(DSL.name(alias), REGEXP_MATCHES);
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_matches</code> table reference
     */
    public RegexpMatches(Name alias) {
        this(alias, REGEXP_MATCHES);
    }

    private RegexpMatches(Name alias, Table<RegexpMatchesRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private RegexpMatches(Name alias, Table<RegexpMatchesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RegexpMatches(Table<O> child, ForeignKey<O, RegexpMatchesRecord> key) {
        super(child, key, REGEXP_MATCHES);
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
    public RegexpMatches as(String alias) {
        return new RegexpMatches(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegexpMatches as(Name alias) {
        return new RegexpMatches(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpMatches rename(String name) {
        return new RegexpMatches(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpMatches rename(Name name) {
        return new RegexpMatches(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public RegexpMatches call(String __1, String __2) {
        return new RegexpMatches(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.CLOB)
            , DSL.val(__2, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public RegexpMatches call(Field<String> __1, Field<String> __2) {
        return new RegexpMatches(DSL.name(getName()), null, new Field[] { 
              __1
            , __2
        });
    }
}
