/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.records;


import com.br.sp.posgresdocker.model.jooq.pg_catalog.tables.PgClass;

import javax.annotation.Generated;

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
public class PgClassRecord extends TableRecordImpl<PgClassRecord> {

    private static final long serialVersionUID = 1244246099;

    /**
     * Setter for <code>pg_catalog.pg_class.relname</code>.
     */
    public void setRelname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relname</code>.
     */
    public String getRelname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relnamespace</code>.
     */
    public void setRelnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relnamespace</code>.
     */
    public Long getRelnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.reltype</code>.
     */
    public void setReltype(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.reltype</code>.
     */
    public Long getReltype() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.reloftype</code>.
     */
    public void setReloftype(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.reloftype</code>.
     */
    public Long getReloftype() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relowner</code>.
     */
    public void setRelowner(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relowner</code>.
     */
    public Long getRelowner() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relam</code>.
     */
    public void setRelam(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relam</code>.
     */
    public Long getRelam() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relfilenode</code>.
     */
    public void setRelfilenode(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relfilenode</code>.
     */
    public Long getRelfilenode() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.reltablespace</code>.
     */
    public void setReltablespace(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.reltablespace</code>.
     */
    public Long getReltablespace() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relpages</code>.
     */
    public void setRelpages(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relpages</code>.
     */
    public Integer getRelpages() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.reltuples</code>.
     */
    public void setReltuples(Float value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.reltuples</code>.
     */
    public Float getReltuples() {
        return (Float) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relallvisible</code>.
     */
    public void setRelallvisible(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relallvisible</code>.
     */
    public Integer getRelallvisible() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.reltoastrelid</code>.
     */
    public void setReltoastrelid(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.reltoastrelid</code>.
     */
    public Long getReltoastrelid() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relhasindex</code>.
     */
    public void setRelhasindex(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relhasindex</code>.
     */
    public Boolean getRelhasindex() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relisshared</code>.
     */
    public void setRelisshared(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relisshared</code>.
     */
    public Boolean getRelisshared() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relpersistence</code>.
     */
    public void setRelpersistence(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relpersistence</code>.
     */
    public String getRelpersistence() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relkind</code>.
     */
    public void setRelkind(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relkind</code>.
     */
    public String getRelkind() {
        return (String) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relnatts</code>.
     */
    public void setRelnatts(Short value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relnatts</code>.
     */
    public Short getRelnatts() {
        return (Short) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relchecks</code>.
     */
    public void setRelchecks(Short value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relchecks</code>.
     */
    public Short getRelchecks() {
        return (Short) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relhasoids</code>.
     */
    public void setRelhasoids(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relhasoids</code>.
     */
    public Boolean getRelhasoids() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relhaspkey</code>.
     */
    public void setRelhaspkey(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relhaspkey</code>.
     */
    public Boolean getRelhaspkey() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relhasrules</code>.
     */
    public void setRelhasrules(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relhasrules</code>.
     */
    public Boolean getRelhasrules() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relhastriggers</code>.
     */
    public void setRelhastriggers(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relhastriggers</code>.
     */
    public Boolean getRelhastriggers() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relhassubclass</code>.
     */
    public void setRelhassubclass(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relhassubclass</code>.
     */
    public Boolean getRelhassubclass() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relrowsecurity</code>.
     */
    public void setRelrowsecurity(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relrowsecurity</code>.
     */
    public Boolean getRelrowsecurity() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relforcerowsecurity</code>.
     */
    public void setRelforcerowsecurity(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relforcerowsecurity</code>.
     */
    public Boolean getRelforcerowsecurity() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relispopulated</code>.
     */
    public void setRelispopulated(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relispopulated</code>.
     */
    public Boolean getRelispopulated() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relreplident</code>.
     */
    public void setRelreplident(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relreplident</code>.
     */
    public String getRelreplident() {
        return (String) get(26);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relispartition</code>.
     */
    public void setRelispartition(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relispartition</code>.
     */
    public Boolean getRelispartition() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relfrozenxid</code>.
     */
    public void setRelfrozenxid(Long value) {
        set(28, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relfrozenxid</code>.
     */
    public Long getRelfrozenxid() {
        return (Long) get(28);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relminmxid</code>.
     */
    public void setRelminmxid(Long value) {
        set(29, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relminmxid</code>.
     */
    public Long getRelminmxid() {
        return (Long) get(29);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.relacl</code>.
     */
    public void setRelacl(String... value) {
        set(30, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.relacl</code>.
     */
    public String[] getRelacl() {
        return (String[]) get(30);
    }

    /**
     * Setter for <code>pg_catalog.pg_class.reloptions</code>.
     */
    public void setReloptions(String... value) {
        set(31, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_class.reloptions</code>.
     */
    public String[] getReloptions() {
        return (String[]) get(31);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setRelpartbound(Object value) {
        set(32, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getRelpartbound() {
        return get(32);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgClassRecord
     */
    public PgClassRecord() {
        super(PgClass.PG_CLASS);
    }

    /**
     * Create a detached, initialised PgClassRecord
     */
    public PgClassRecord(String relname, Long relnamespace, Long reltype, Long reloftype, Long relowner, Long relam, Long relfilenode, Long reltablespace, Integer relpages, Float reltuples, Integer relallvisible, Long reltoastrelid, Boolean relhasindex, Boolean relisshared, String relpersistence, String relkind, Short relnatts, Short relchecks, Boolean relhasoids, Boolean relhaspkey, Boolean relhasrules, Boolean relhastriggers, Boolean relhassubclass, Boolean relrowsecurity, Boolean relforcerowsecurity, Boolean relispopulated, String relreplident, Boolean relispartition, Long relfrozenxid, Long relminmxid, String[] relacl, String[] reloptions, Object relpartbound) {
        super(PgClass.PG_CLASS);

        set(0, relname);
        set(1, relnamespace);
        set(2, reltype);
        set(3, reloftype);
        set(4, relowner);
        set(5, relam);
        set(6, relfilenode);
        set(7, reltablespace);
        set(8, relpages);
        set(9, reltuples);
        set(10, relallvisible);
        set(11, reltoastrelid);
        set(12, relhasindex);
        set(13, relisshared);
        set(14, relpersistence);
        set(15, relkind);
        set(16, relnatts);
        set(17, relchecks);
        set(18, relhasoids);
        set(19, relhaspkey);
        set(20, relhasrules);
        set(21, relhastriggers);
        set(22, relhassubclass);
        set(23, relrowsecurity);
        set(24, relforcerowsecurity);
        set(25, relispopulated);
        set(26, relreplident);
        set(27, relispartition);
        set(28, relfrozenxid);
        set(29, relminmxid);
        set(30, relacl);
        set(31, reloptions);
        set(32, relpartbound);
    }
}
