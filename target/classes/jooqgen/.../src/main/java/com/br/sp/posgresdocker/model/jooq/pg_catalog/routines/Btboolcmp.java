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
public class Btboolcmp extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1877813151;

    /**
     * The parameter <code>pg_catalog.btboolcmp.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.btboolcmp._1</code>.
     */
    public static final Parameter<Boolean> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BOOLEAN, false, true);

    /**
     * The parameter <code>pg_catalog.btboolcmp._2</code>.
     */
    public static final Parameter<Boolean> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BOOLEAN, false, true);

    /**
     * Create a new routine call instance
     */
    public Btboolcmp() {
        super("btboolcmp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Boolean value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Boolean> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Boolean value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Boolean> field) {
        setField(_2, field);
    }
}
