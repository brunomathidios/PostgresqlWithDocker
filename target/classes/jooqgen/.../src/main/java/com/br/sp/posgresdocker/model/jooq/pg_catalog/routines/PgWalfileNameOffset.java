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
public class PgWalfileNameOffset extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -476121959;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> LSN = createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_walfile_name_offset.file_name</code>.
     */
    public static final Parameter<String> FILE_NAME = createParameter("file_name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_walfile_name_offset.file_offset</code>.
     */
    public static final Parameter<Integer> FILE_OFFSET = createParameter("file_offset", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public PgWalfileNameOffset() {
        super("pg_walfile_name_offset", PgCatalog.PG_CATALOG);

        addInParameter(LSN);
        addOutParameter(FILE_NAME);
        addOutParameter(FILE_OFFSET);
    }

    /**
     * Set the <code>lsn</code> parameter IN value to the routine
     */
    public void setLsn(Object value) {
        setValue(LSN, value);
    }

    /**
     * Get the <code>file_name</code> parameter OUT value from the routine
     */
    public String getFileName() {
        return get(FILE_NAME);
    }

    /**
     * Get the <code>file_offset</code> parameter OUT value from the routine
     */
    public Integer getFileOffset() {
        return get(FILE_OFFSET);
    }
}
