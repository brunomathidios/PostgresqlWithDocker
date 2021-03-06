/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.routines;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;

import java.time.LocalDateTime;

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
public class TimestampSmaller extends AbstractRoutine<LocalDateTime> {

    private static final long serialVersionUID = 603223580;

    /**
     * The parameter <code>pg_catalog.timestamp_smaller.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDateTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.LOCALDATETIME, false, false);

    /**
     * The parameter <code>pg_catalog.timestamp_smaller._1</code>.
     */
    public static final Parameter<LocalDateTime> _1 = createParameter("_1", org.jooq.impl.SQLDataType.LOCALDATETIME, false, true);

    /**
     * The parameter <code>pg_catalog.timestamp_smaller._2</code>.
     */
    public static final Parameter<LocalDateTime> _2 = createParameter("_2", org.jooq.impl.SQLDataType.LOCALDATETIME, false, true);

    /**
     * Create a new routine call instance
     */
    public TimestampSmaller() {
        super("timestamp_smaller", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.LOCALDATETIME);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDateTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDateTime> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalDateTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalDateTime> field) {
        setField(_2, field);
    }
}
