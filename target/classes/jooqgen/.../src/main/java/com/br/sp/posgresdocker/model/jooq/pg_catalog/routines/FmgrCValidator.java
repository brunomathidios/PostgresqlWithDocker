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
public class FmgrCValidator extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -13801008;

    /**
     * The parameter <code>pg_catalog.fmgr_c_validator._1</code>.
     */
    public static final Parameter<Long> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public FmgrCValidator() {
        super("fmgr_c_validator", PgCatalog.PG_CATALOG);

        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }
}
