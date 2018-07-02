/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.routines;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;

import java.time.LocalDate;

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
public class DateSmaller extends AbstractRoutine<LocalDate> {

    private static final long serialVersionUID = -1368138841;

    /**
     * The parameter <code>pg_catalog.date_smaller.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDate> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.LOCALDATE, false, false);

    /**
     * The parameter <code>pg_catalog.date_smaller._1</code>.
     */
    public static final Parameter<LocalDate> _1 = createParameter("_1", org.jooq.impl.SQLDataType.LOCALDATE, false, true);

    /**
     * The parameter <code>pg_catalog.date_smaller._2</code>.
     */
    public static final Parameter<LocalDate> _2 = createParameter("_2", org.jooq.impl.SQLDataType.LOCALDATE, false, true);

    /**
     * Create a new routine call instance
     */
    public DateSmaller() {
        super("date_smaller", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.LOCALDATE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDate value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDate> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalDate value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalDate> field) {
        setField(_2, field);
    }
}
