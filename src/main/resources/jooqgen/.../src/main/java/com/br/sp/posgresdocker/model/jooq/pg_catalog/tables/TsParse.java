/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.TsParseRecord;

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
public class TsParse extends TableImpl<TsParseRecord> {

    private static final long serialVersionUID = -542083652;

    /**
     * The reference instance of <code>pg_catalog.ts_parse</code>
     */
    public static final TsParse TS_PARSE = new TsParse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TsParseRecord> getRecordType() {
        return TsParseRecord.class;
    }

    /**
     * The column <code>pg_catalog.ts_parse.tokid</code>.
     */
    public final TableField<TsParseRecord, Integer> TOKID = createField("tokid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.ts_parse.tokid</code>.
     */
    public final TableField<TsParseRecord, Integer> TOKID = createField("tokid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.ts_parse.token</code>.
     */
    public final TableField<TsParseRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_parse.token</code>.
     */
    public final TableField<TsParseRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.ts_parse</code> table reference
     */
    public TsParse() {
        this(DSL.name("ts_parse"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    public TsParse(String alias) {
        this(DSL.name(alias), TS_PARSE);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    public TsParse(Name alias) {
        this(alias, TS_PARSE);
    }

    private TsParse(Name alias, Table<TsParseRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private TsParse(Name alias, Table<TsParseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TsParse(Table<O> child, ForeignKey<O, TsParseRecord> key) {
        super(child, key, TS_PARSE);
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
    public TsParse as(String alias) {
        return new TsParse(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsParse as(Name alias) {
        return new TsParse(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsParse rename(String name) {
        return new TsParse(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsParse rename(Name name) {
        return new TsParse(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public TsParse call(Long parserOid, String txt) {
        return new TsParse(DSL.name(getName()), null, new Field[] { 
              DSL.val(parserOid, org.jooq.impl.SQLDataType.BIGINT)
            , DSL.val(txt, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public TsParse call(Field<Long> parserOid, Field<String> txt) {
        return new TsParse(DSL.name(getName()), null, new Field[] { 
              parserOid
            , txt
        });
    }
}
