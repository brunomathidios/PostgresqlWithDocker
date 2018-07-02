/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.routines;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;

import java.time.LocalDate;
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
public class DateLeTimestamp extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -1954832212;

    /**
     * The parameter <code>pg_catalog.date_le_timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.date_le_timestamp._1</code>.
     */
    public static final Parameter<LocalDate> _1 = createParameter("_1", org.jooq.impl.SQLDataType.LOCALDATE, false, true);

    /**
     * The parameter <code>pg_catalog.date_le_timestamp._2</code>.
     */
    public static final Parameter<LocalDateTime> _2 = createParameter("_2", org.jooq.impl.SQLDataType.LOCALDATETIME, false, true);

    /**
     * Create a new routine call instance
     */
    public DateLeTimestamp() {
        super("date_le_timestamp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

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
