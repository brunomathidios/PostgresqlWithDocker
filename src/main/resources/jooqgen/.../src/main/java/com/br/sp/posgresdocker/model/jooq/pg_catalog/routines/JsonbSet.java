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
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbSet extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1929782848;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> JSONB_IN = createParameter("jsonb_in", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_set.path</code>.
     */
    public static final Parameter<String[]> PATH = createParameter("path", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> REPLACEMENT = createParameter("replacement", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_set.create_if_missing</code>.
     */
    public static final Parameter<Boolean> CREATE_IF_MISSING = createParameter("create_if_missing", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public JsonbSet() {
        super("jsonb_set", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(JSONB_IN);
        addInParameter(PATH);
        addInParameter(REPLACEMENT);
        addInParameter(CREATE_IF_MISSING);
    }

    /**
     * Set the <code>jsonb_in</code> parameter IN value to the routine
     */
    public void setJsonbIn(Object value) {
        setValue(JSONB_IN, value);
    }

    /**
     * Set the <code>jsonb_in</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setJsonbIn(Field<Object> field) {
        setField(JSONB_IN, field);
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    public void setPath(String... value) {
        setValue(PATH, value);
    }

    /**
     * Set the <code>path</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPath(Field<String[]> field) {
        setField(PATH, field);
    }

    /**
     * Set the <code>replacement</code> parameter IN value to the routine
     */
    public void setReplacement(Object value) {
        setValue(REPLACEMENT, value);
    }

    /**
     * Set the <code>replacement</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setReplacement(Field<Object> field) {
        setField(REPLACEMENT, field);
    }

    /**
     * Set the <code>create_if_missing</code> parameter IN value to the routine
     */
    public void setCreateIfMissing(Boolean value) {
        setValue(CREATE_IF_MISSING, value);
    }

    /**
     * Set the <code>create_if_missing</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCreateIfMissing(Field<Boolean> field) {
        setField(CREATE_IF_MISSING, field);
    }
}
