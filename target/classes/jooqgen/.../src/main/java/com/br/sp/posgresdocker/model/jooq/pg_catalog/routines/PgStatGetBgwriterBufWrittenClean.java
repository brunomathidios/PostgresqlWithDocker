/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.routines;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class PgStatGetBgwriterBufWrittenClean extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -139563888;

    /**
     * The parameter <code>pg_catalog.pg_stat_get_bgwriter_buf_written_clean.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgStatGetBgwriterBufWrittenClean() {
        super("pg_stat_get_bgwriter_buf_written_clean", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
    }
}
