/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables.records;


import com.br.sp.posgresdocker.model.jooq.information_schema.tables.EnabledRoles;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


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
public class EnabledRolesRecord extends TableRecordImpl<EnabledRolesRecord> implements Record1<String> {

    private static final long serialVersionUID = -86600488;

    /**
     * Setter for <code>information_schema.enabled_roles.role_name</code>.
     */
    public void setRoleName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.enabled_roles.role_name</code>.
     */
    public String getRoleName() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EnabledRoles.ENABLED_ROLES.ROLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnabledRolesRecord value1(String value) {
        setRoleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnabledRolesRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnabledRolesRecord
     */
    public EnabledRolesRecord() {
        super(EnabledRoles.ENABLED_ROLES);
    }

    /**
     * Create a detached, initialised EnabledRolesRecord
     */
    public EnabledRolesRecord(String roleName) {
        super(EnabledRoles.ENABLED_ROLES);

        set(0, roleName);
    }
}
