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
public class Int2shl extends AbstractRoutine<Short> {

    private static final long serialVersionUID = 780551867;

    /**
     * The parameter <code>pg_catalog.int2shl.RETURN_VALUE</code>.
     */
    public static final Parameter<Short> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>pg_catalog.int2shl._1</code>.
     */
    public static final Parameter<Short> _1 = createParameter("_1", org.jooq.impl.SQLDataType.SMALLINT, false, true);

    /**
     * The parameter <code>pg_catalog.int2shl._2</code>.
     */
    public static final Parameter<Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Int2shl() {
        super("int2shl", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.SMALLINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
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

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Integer value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Integer> field) {
        setField(_2, field);
    }
}
