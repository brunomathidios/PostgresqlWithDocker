/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;
import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records.PgStatGetProgressInfoRecord;

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
public class PgStatGetProgressInfo extends TableImpl<PgStatGetProgressInfoRecord> {

    private static final long serialVersionUID = 1041080145;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_get_progress_info</code>
     */
    public static final PgStatGetProgressInfo PG_STAT_GET_PROGRESS_INFO = new PgStatGetProgressInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatGetProgressInfoRecord> getRecordType() {
        return PgStatGetProgressInfoRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.pid</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.datid</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> DATID = createField("datid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.relid</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param1</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM1 = createField("param1", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param2</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM2 = createField("param2", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param3</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM3 = createField("param3", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param4</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM4 = createField("param4", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param5</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM5 = createField("param5", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param6</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM6 = createField("param6", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param7</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM7 = createField("param7", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param8</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM8 = createField("param8", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param9</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM9 = createField("param9", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param10</code>.
     */
    public final TableField<PgStatGetProgressInfoRecord, Long> PARAM10 = createField("param10", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_get_progress_info</code> table reference
     */
    public PgStatGetProgressInfo() {
        this(DSL.name("pg_stat_get_progress_info"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_progress_info</code> table reference
     */
    public PgStatGetProgressInfo(String alias) {
        this(DSL.name(alias), PG_STAT_GET_PROGRESS_INFO);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_progress_info</code> table reference
     */
    public PgStatGetProgressInfo(Name alias) {
        this(alias, PG_STAT_GET_PROGRESS_INFO);
    }

    private PgStatGetProgressInfo(Name alias, Table<PgStatGetProgressInfoRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private PgStatGetProgressInfo(Name alias, Table<PgStatGetProgressInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatGetProgressInfo(Table<O> child, ForeignKey<O, PgStatGetProgressInfoRecord> key) {
        super(child, key, PG_STAT_GET_PROGRESS_INFO);
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
    public PgStatGetProgressInfo as(String alias) {
        return new PgStatGetProgressInfo(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatGetProgressInfo as(Name alias) {
        return new PgStatGetProgressInfo(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetProgressInfo rename(String name) {
        return new PgStatGetProgressInfo(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetProgressInfo rename(Name name) {
        return new PgStatGetProgressInfo(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetProgressInfo call(String cmdtype) {
        return new PgStatGetProgressInfo(DSL.name(getName()), null, new Field[] { 
              DSL.val(cmdtype, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetProgressInfo call(Field<String> cmdtype) {
        return new PgStatGetProgressInfo(DSL.name(getName()), null, new Field[] { 
              cmdtype
        });
    }
}
