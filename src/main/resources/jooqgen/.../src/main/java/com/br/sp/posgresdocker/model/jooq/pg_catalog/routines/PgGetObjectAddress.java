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
public class PgGetObjectAddress extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 2082643630;

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.type</code>.
     */
    public static final Parameter<String> TYPE = createParameter("type", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.name</code>.
     */
    public static final Parameter<String[]> NAME = createParameter("name", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.args</code>.
     */
    public static final Parameter<String[]> ARGS = createParameter("args", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.classid</code>.
     */
    public static final Parameter<Long> CLASSID = createParameter("classid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.objid</code>.
     */
    public static final Parameter<Long> OBJID = createParameter("objid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.objsubid</code>.
     */
    public static final Parameter<Integer> OBJSUBID = createParameter("objsubid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public PgGetObjectAddress() {
        super("pg_get_object_address", PgCatalog.PG_CATALOG);

        addInParameter(TYPE);
        addInParameter(NAME);
        addInParameter(ARGS);
        addOutParameter(CLASSID);
        addOutParameter(OBJID);
        addOutParameter(OBJSUBID);
    }

    /**
     * Set the <code>type</code> parameter IN value to the routine
     */
    public void setType(String value) {
        setValue(TYPE, value);
    }

    /**
     * Set the <code>name</code> parameter IN value to the routine
     */
    public void setName_(String... value) {
        setValue(NAME, value);
    }

    /**
     * Set the <code>args</code> parameter IN value to the routine
     */
    public void setArgs(String... value) {
        setValue(ARGS, value);
    }

    /**
     * Get the <code>classid</code> parameter OUT value from the routine
     */
    public Long getClassid() {
        return get(CLASSID);
    }

    /**
     * Get the <code>objid</code> parameter OUT value from the routine
     */
    public Long getObjid() {
        return get(OBJID);
    }

    /**
     * Get the <code>objsubid</code> parameter OUT value from the routine
     */
    public Integer getObjsubid() {
        return get(OBJSUBID);
    }
}
