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
public class JsonExtractPath extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -76409252;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> FROM_JSON = createParameter("from_json", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * The parameter <code>pg_catalog.json_extract_path.path_elems</code>.
     */
    public static final Parameter<String[]> PATH_ELEMS = createParameter("path_elems", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public JsonExtractPath() {
        super("json_extract_path", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.OTHER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(PATH_ELEMS);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(Object value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<Object> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>path_elems</code> parameter IN value to the routine
     */
    public void setPathElems(String... value) {
        setValue(PATH_ELEMS, value);
    }

    /**
     * Set the <code>path_elems</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPathElems(Field<String[]> field) {
        setField(PATH_ELEMS, field);
    }
}
