/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.routines;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

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
public class MakeTimestamptz1 extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 1842035347;

    /**
     * The parameter <code>pg_catalog.make_timestamptz.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamptz.year</code>.
     */
    public static final Parameter<Integer> YEAR = createParameter("year", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamptz.month</code>.
     */
    public static final Parameter<Integer> MONTH = createParameter("month", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamptz.mday</code>.
     */
    public static final Parameter<Integer> MDAY = createParameter("mday", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamptz.hour</code>.
     */
    public static final Parameter<Integer> HOUR = createParameter("hour", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamptz.min</code>.
     */
    public static final Parameter<Integer> MIN = createParameter("min", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamptz.sec</code>.
     */
    public static final Parameter<Double> SEC = createParameter("sec", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public MakeTimestamptz1() {
        super("make_timestamptz", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(YEAR);
        addInParameter(MONTH);
        addInParameter(MDAY);
        addInParameter(HOUR);
        addInParameter(MIN);
        addInParameter(SEC);
        setOverloaded(true);
    }

    /**
     * Set the <code>year</code> parameter IN value to the routine
     */
    public void setYear(Integer value) {
        setValue(YEAR, value);
    }

    /**
     * Set the <code>year</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setYear(Field<Integer> field) {
        setField(YEAR, field);
    }

    /**
     * Set the <code>month</code> parameter IN value to the routine
     */
    public void setMonth(Integer value) {
        setValue(MONTH, value);
    }

    /**
     * Set the <code>month</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMonth(Field<Integer> field) {
        setField(MONTH, field);
    }

    /**
     * Set the <code>mday</code> parameter IN value to the routine
     */
    public void setMday(Integer value) {
        setValue(MDAY, value);
    }

    /**
     * Set the <code>mday</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMday(Field<Integer> field) {
        setField(MDAY, field);
    }

    /**
     * Set the <code>hour</code> parameter IN value to the routine
     */
    public void setHour(Integer value) {
        setValue(HOUR, value);
    }

    /**
     * Set the <code>hour</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setHour(Field<Integer> field) {
        setField(HOUR, field);
    }

    /**
     * Set the <code>min</code> parameter IN value to the routine
     */
    public void setMin(Integer value) {
        setValue(MIN, value);
    }

    /**
     * Set the <code>min</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMin(Field<Integer> field) {
        setField(MIN, field);
    }

    /**
     * Set the <code>sec</code> parameter IN value to the routine
     */
    public void setSec(Double value) {
        setValue(SEC, value);
    }

    /**
     * Set the <code>sec</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSec(Field<Double> field) {
        setField(SEC, field);
    }
}
