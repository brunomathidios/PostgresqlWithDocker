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
public class PgStartBackup extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 270616521;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_start_backup.label</code>.
     */
    public static final Parameter<String> LABEL = createParameter("label", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_start_backup.fast</code>.
     */
    public static final Parameter<Boolean> FAST = createParameter("fast", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>pg_catalog.pg_start_backup.exclusive</code>.
     */
    public static final Parameter<Boolean> EXCLUSIVE = createParameter("exclusive", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public PgStartBackup() {
        super("pg_start_backup", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(LABEL);
        addInParameter(FAST);
        addInParameter(EXCLUSIVE);
    }

    /**
     * Set the <code>label</code> parameter IN value to the routine
     */
    public void setLabel(String value) {
        setValue(LABEL, value);
    }

    /**
     * Set the <code>label</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setLabel(Field<String> field) {
        setField(LABEL, field);
    }

    /**
     * Set the <code>fast</code> parameter IN value to the routine
     */
    public void setFast(Boolean value) {
        setValue(FAST, value);
    }

    /**
     * Set the <code>fast</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFast(Field<Boolean> field) {
        setField(FAST, field);
    }

    /**
     * Set the <code>exclusive</code> parameter IN value to the routine
     */
    public void setExclusive(Boolean value) {
        setValue(EXCLUSIVE, value);
    }

    /**
     * Set the <code>exclusive</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setExclusive(Field<Boolean> field) {
        setField(EXCLUSIVE, field);
    }
}
