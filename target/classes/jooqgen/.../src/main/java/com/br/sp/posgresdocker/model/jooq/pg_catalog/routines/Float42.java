/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.routines;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Float42 extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 1731483484;

    /**
     * The parameter <code>pg_catalog.float4.RETURN_VALUE</code>.
     */
    public static final Parameter<Float> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.REAL, false, false);

    /**
     * The parameter <code>pg_catalog.float4._1</code>.
     */
    public static final Parameter<Short> _1 = createParameter("_1", org.jooq.impl.SQLDataType.SMALLINT, false, true);

    /**
     * Create a new routine call instance
     */
    public Float42() {
        super("float4", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Short value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Short> field) {
        setField(_1, field);
    }
}
