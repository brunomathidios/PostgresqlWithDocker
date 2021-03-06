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
public class PgIdentifyObject extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1283977628;

    /**
     * The parameter <code>pg_catalog.pg_identify_object.classid</code>.
     */
    public static final Parameter<Long> CLASSID = createParameter("classid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object.objid</code>.
     */
    public static final Parameter<Long> OBJID = createParameter("objid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object.objsubid</code>.
     */
    public static final Parameter<Integer> OBJSUBID = createParameter("objsubid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object.type</code>.
     */
    public static final Parameter<String> TYPE = createParameter("type", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object.schema</code>.
     */
    public static final Parameter<String> SCHEMA = createParameter("schema", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object.name</code>.
     */
    public static final Parameter<String> NAME = createParameter("name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object.identity</code>.
     */
    public static final Parameter<String> IDENTITY = createParameter("identity", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PgIdentifyObject() {
        super("pg_identify_object", PgCatalog.PG_CATALOG);

        addInParameter(CLASSID);
        addInParameter(OBJID);
        addInParameter(OBJSUBID);
        addOutParameter(TYPE);
        addOutParameter(SCHEMA);
        addOutParameter(NAME);
        addOutParameter(IDENTITY);
    }

    /**
     * Set the <code>classid</code> parameter IN value to the routine
     */
    public void setClassid(Long value) {
        setValue(CLASSID, value);
    }

    /**
     * Set the <code>objid</code> parameter IN value to the routine
     */
    public void setObjid(Long value) {
        setValue(OBJID, value);
    }

    /**
     * Set the <code>objsubid</code> parameter IN value to the routine
     */
    public void setObjsubid(Integer value) {
        setValue(OBJSUBID, value);
    }

    /**
     * Get the <code>type</code> parameter OUT value from the routine
     */
    public String getType() {
        return get(TYPE);
    }

    /**
     * Get the <code>schema</code> parameter OUT value from the routine
     */
    public String getSchema_() {
        return get(SCHEMA);
    }

    /**
     * Get the <code>name</code> parameter OUT value from the routine
     */
    public String getName_() {
        return get(NAME);
    }

    /**
     * Get the <code>identity</code> parameter OUT value from the routine
     */
    public String getIdentity() {
        return get(IDENTITY);
    }
}
