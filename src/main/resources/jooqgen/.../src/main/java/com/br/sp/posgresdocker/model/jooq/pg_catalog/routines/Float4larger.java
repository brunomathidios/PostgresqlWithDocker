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
public class Float4larger extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 1008166195;

    /**
     * The parameter <code>pg_catalog.float4larger.RETURN_VALUE</code>.
     */
    public static final Parameter<Float> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.REAL, false, false);

    /**
     * The parameter <code>pg_catalog.float4larger._1</code>.
     */
    public static final Parameter<Float> _1 = createParameter("_1", org.jooq.impl.SQLDataType.REAL, false, true);

    /**
     * The parameter <code>pg_catalog.float4larger._2</code>.
     */
    public static final Parameter<Float> _2 = createParameter("_2", org.jooq.impl.SQLDataType.REAL, false, true);

    /**
     * Create a new routine call instance
     */
    public Float4larger() {
        super("float4larger", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Float value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Float> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Float value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Float> field) {
        setField(_2, field);
    }
}
