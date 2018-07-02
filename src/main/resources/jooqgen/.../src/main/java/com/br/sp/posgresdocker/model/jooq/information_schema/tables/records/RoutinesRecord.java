/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.information_schema.tables.records;


import com.br.sp.posgresdocker.model.jooq.information_schema.tables.Routines;

import java.time.OffsetDateTime;

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
public class RoutinesRecord extends TableRecordImpl<RoutinesRecord> {

    private static final long serialVersionUID = 711115285;

    /**
     * Setter for <code>information_schema.routines.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.routines.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.routines.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.routines.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.routines.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.routines.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.routines.routine_catalog</code>.
     */
    public void setRoutineCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.routines.routine_catalog</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.routines.routine_schema</code>.
     */
    public void setRoutineSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.routines.routine_schema</code>.
     */
    public String getRoutineSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.routines.routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.routines.routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.routines.routine_type</code>.
     */
    public void setRoutineType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.routines.routine_type</code>.
     */
    public String getRoutineType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.routines.module_catalog</code>.
     */
    public void setModuleCatalog(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.routines.module_catalog</code>.
     */
    public String getModuleCatalog() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.routines.module_schema</code>.
     */
    public void setModuleSchema(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.routines.module_schema</code>.
     */
    public String getModuleSchema() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.routines.module_name</code>.
     */
    public void setModuleName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.routines.module_name</code>.
     */
    public String getModuleName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.routines.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.routines.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.routines.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.routines.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.routines.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.routines.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.routines.data_type</code>.
     */
    public void setDataType(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.routines.data_type</code>.
     */
    public String getDataType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.routines.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.routines.character_maximum_length</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>information_schema.routines.character_octet_length</code>.
     */
    public void setCharacterOctetLength(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.routines.character_octet_length</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>information_schema.routines.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.routines.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.routines.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.routines.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.routines.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.routines.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.routines.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.routines.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.routines.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.routines.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.routines.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.routines.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.routines.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.routines.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>information_schema.routines.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.routines.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>information_schema.routines.numeric_scale</code>.
     */
    public void setNumericScale(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.routines.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>information_schema.routines.datetime_precision</code>.
     */
    public void setDatetimePrecision(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.routines.datetime_precision</code>.
     */
    public Integer getDatetimePrecision() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>information_schema.routines.interval_type</code>.
     */
    public void setIntervalType(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.routines.interval_type</code>.
     */
    public String getIntervalType() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.routines.interval_precision</code>.
     */
    public void setIntervalPrecision(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.routines.interval_precision</code>.
     */
    public Integer getIntervalPrecision() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>information_schema.routines.type_udt_catalog</code>.
     */
    public void setTypeUdtCatalog(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.routines.type_udt_catalog</code>.
     */
    public String getTypeUdtCatalog() {
        return (String) get(28);
    }

    /**
     * Setter for <code>information_schema.routines.type_udt_schema</code>.
     */
    public void setTypeUdtSchema(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.routines.type_udt_schema</code>.
     */
    public String getTypeUdtSchema() {
        return (String) get(29);
    }

    /**
     * Setter for <code>information_schema.routines.type_udt_name</code>.
     */
    public void setTypeUdtName(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.routines.type_udt_name</code>.
     */
    public String getTypeUdtName() {
        return (String) get(30);
    }

    /**
     * Setter for <code>information_schema.routines.scope_catalog</code>.
     */
    public void setScopeCatalog(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>information_schema.routines.scope_catalog</code>.
     */
    public String getScopeCatalog() {
        return (String) get(31);
    }

    /**
     * Setter for <code>information_schema.routines.scope_schema</code>.
     */
    public void setScopeSchema(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>information_schema.routines.scope_schema</code>.
     */
    public String getScopeSchema() {
        return (String) get(32);
    }

    /**
     * Setter for <code>information_schema.routines.scope_name</code>.
     */
    public void setScopeName(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>information_schema.routines.scope_name</code>.
     */
    public String getScopeName() {
        return (String) get(33);
    }

    /**
     * Setter for <code>information_schema.routines.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>information_schema.routines.maximum_cardinality</code>.
     */
    public Integer getMaximumCardinality() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>information_schema.routines.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>information_schema.routines.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(35);
    }

    /**
     * Setter for <code>information_schema.routines.routine_body</code>.
     */
    public void setRoutineBody(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>information_schema.routines.routine_body</code>.
     */
    public String getRoutineBody() {
        return (String) get(36);
    }

    /**
     * Setter for <code>information_schema.routines.routine_definition</code>.
     */
    public void setRoutineDefinition(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>information_schema.routines.routine_definition</code>.
     */
    public String getRoutineDefinition() {
        return (String) get(37);
    }

    /**
     * Setter for <code>information_schema.routines.external_name</code>.
     */
    public void setExternalName(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>information_schema.routines.external_name</code>.
     */
    public String getExternalName() {
        return (String) get(38);
    }

    /**
     * Setter for <code>information_schema.routines.external_language</code>.
     */
    public void setExternalLanguage(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>information_schema.routines.external_language</code>.
     */
    public String getExternalLanguage() {
        return (String) get(39);
    }

    /**
     * Setter for <code>information_schema.routines.parameter_style</code>.
     */
    public void setParameterStyle(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>information_schema.routines.parameter_style</code>.
     */
    public String getParameterStyle() {
        return (String) get(40);
    }

    /**
     * Setter for <code>information_schema.routines.is_deterministic</code>.
     */
    public void setIsDeterministic(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>information_schema.routines.is_deterministic</code>.
     */
    public String getIsDeterministic() {
        return (String) get(41);
    }

    /**
     * Setter for <code>information_schema.routines.sql_data_access</code>.
     */
    public void setSqlDataAccess(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>information_schema.routines.sql_data_access</code>.
     */
    public String getSqlDataAccess() {
        return (String) get(42);
    }

    /**
     * Setter for <code>information_schema.routines.is_null_call</code>.
     */
    public void setIsNullCall(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>information_schema.routines.is_null_call</code>.
     */
    public String getIsNullCall() {
        return (String) get(43);
    }

    /**
     * Setter for <code>information_schema.routines.sql_path</code>.
     */
    public void setSqlPath(String value) {
        set(44, value);
    }

    /**
     * Getter for <code>information_schema.routines.sql_path</code>.
     */
    public String getSqlPath() {
        return (String) get(44);
    }

    /**
     * Setter for <code>information_schema.routines.schema_level_routine</code>.
     */
    public void setSchemaLevelRoutine(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>information_schema.routines.schema_level_routine</code>.
     */
    public String getSchemaLevelRoutine() {
        return (String) get(45);
    }

    /**
     * Setter for <code>information_schema.routines.max_dynamic_result_sets</code>.
     */
    public void setMaxDynamicResultSets(Integer value) {
        set(46, value);
    }

    /**
     * Getter for <code>information_schema.routines.max_dynamic_result_sets</code>.
     */
    public Integer getMaxDynamicResultSets() {
        return (Integer) get(46);
    }

    /**
     * Setter for <code>information_schema.routines.is_user_defined_cast</code>.
     */
    public void setIsUserDefinedCast(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>information_schema.routines.is_user_defined_cast</code>.
     */
    public String getIsUserDefinedCast() {
        return (String) get(47);
    }

    /**
     * Setter for <code>information_schema.routines.is_implicitly_invocable</code>.
     */
    public void setIsImplicitlyInvocable(String value) {
        set(48, value);
    }

    /**
     * Getter for <code>information_schema.routines.is_implicitly_invocable</code>.
     */
    public String getIsImplicitlyInvocable() {
        return (String) get(48);
    }

    /**
     * Setter for <code>information_schema.routines.security_type</code>.
     */
    public void setSecurityType(String value) {
        set(49, value);
    }

    /**
     * Getter for <code>information_schema.routines.security_type</code>.
     */
    public String getSecurityType() {
        return (String) get(49);
    }

    /**
     * Setter for <code>information_schema.routines.to_sql_specific_catalog</code>.
     */
    public void setToSqlSpecificCatalog(String value) {
        set(50, value);
    }

    /**
     * Getter for <code>information_schema.routines.to_sql_specific_catalog</code>.
     */
    public String getToSqlSpecificCatalog() {
        return (String) get(50);
    }

    /**
     * Setter for <code>information_schema.routines.to_sql_specific_schema</code>.
     */
    public void setToSqlSpecificSchema(String value) {
        set(51, value);
    }

    /**
     * Getter for <code>information_schema.routines.to_sql_specific_schema</code>.
     */
    public String getToSqlSpecificSchema() {
        return (String) get(51);
    }

    /**
     * Setter for <code>information_schema.routines.to_sql_specific_name</code>.
     */
    public void setToSqlSpecificName(String value) {
        set(52, value);
    }

    /**
     * Getter for <code>information_schema.routines.to_sql_specific_name</code>.
     */
    public String getToSqlSpecificName() {
        return (String) get(52);
    }

    /**
     * Setter for <code>information_schema.routines.as_locator</code>.
     */
    public void setAsLocator(String value) {
        set(53, value);
    }

    /**
     * Getter for <code>information_schema.routines.as_locator</code>.
     */
    public String getAsLocator() {
        return (String) get(53);
    }

    /**
     * Setter for <code>information_schema.routines.created</code>.
     */
    public void setCreated(OffsetDateTime value) {
        set(54, value);
    }

    /**
     * Getter for <code>information_schema.routines.created</code>.
     */
    public OffsetDateTime getCreated() {
        return (OffsetDateTime) get(54);
    }

    /**
     * Setter for <code>information_schema.routines.last_altered</code>.
     */
    public void setLastAltered(OffsetDateTime value) {
        set(55, value);
    }

    /**
     * Getter for <code>information_schema.routines.last_altered</code>.
     */
    public OffsetDateTime getLastAltered() {
        return (OffsetDateTime) get(55);
    }

    /**
     * Setter for <code>information_schema.routines.new_savepoint_level</code>.
     */
    public void setNewSavepointLevel(String value) {
        set(56, value);
    }

    /**
     * Getter for <code>information_schema.routines.new_savepoint_level</code>.
     */
    public String getNewSavepointLevel() {
        return (String) get(56);
    }

    /**
     * Setter for <code>information_schema.routines.is_udt_dependent</code>.
     */
    public void setIsUdtDependent(String value) {
        set(57, value);
    }

    /**
     * Getter for <code>information_schema.routines.is_udt_dependent</code>.
     */
    public String getIsUdtDependent() {
        return (String) get(57);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_from_data_type</code>.
     */
    public void setResultCastFromDataType(String value) {
        set(58, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_from_data_type</code>.
     */
    public String getResultCastFromDataType() {
        return (String) get(58);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_as_locator</code>.
     */
    public void setResultCastAsLocator(String value) {
        set(59, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_as_locator</code>.
     */
    public String getResultCastAsLocator() {
        return (String) get(59);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_char_max_length</code>.
     */
    public void setResultCastCharMaxLength(Integer value) {
        set(60, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_char_max_length</code>.
     */
    public Integer getResultCastCharMaxLength() {
        return (Integer) get(60);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_char_octet_length</code>.
     */
    public void setResultCastCharOctetLength(Integer value) {
        set(61, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_char_octet_length</code>.
     */
    public Integer getResultCastCharOctetLength() {
        return (Integer) get(61);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_char_set_catalog</code>.
     */
    public void setResultCastCharSetCatalog(String value) {
        set(62, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_char_set_catalog</code>.
     */
    public String getResultCastCharSetCatalog() {
        return (String) get(62);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_char_set_schema</code>.
     */
    public void setResultCastCharSetSchema(String value) {
        set(63, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_char_set_schema</code>.
     */
    public String getResultCastCharSetSchema() {
        return (String) get(63);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_char_set_name</code>.
     */
    public void setResultCastCharSetName(String value) {
        set(64, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_char_set_name</code>.
     */
    public String getResultCastCharSetName() {
        return (String) get(64);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_collation_catalog</code>.
     */
    public void setResultCastCollationCatalog(String value) {
        set(65, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_collation_catalog</code>.
     */
    public String getResultCastCollationCatalog() {
        return (String) get(65);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_collation_schema</code>.
     */
    public void setResultCastCollationSchema(String value) {
        set(66, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_collation_schema</code>.
     */
    public String getResultCastCollationSchema() {
        return (String) get(66);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_collation_name</code>.
     */
    public void setResultCastCollationName(String value) {
        set(67, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_collation_name</code>.
     */
    public String getResultCastCollationName() {
        return (String) get(67);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_numeric_precision</code>.
     */
    public void setResultCastNumericPrecision(Integer value) {
        set(68, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_numeric_precision</code>.
     */
    public Integer getResultCastNumericPrecision() {
        return (Integer) get(68);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_numeric_precision_radix</code>.
     */
    public void setResultCastNumericPrecisionRadix(Integer value) {
        set(69, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_numeric_precision_radix</code>.
     */
    public Integer getResultCastNumericPrecisionRadix() {
        return (Integer) get(69);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_numeric_scale</code>.
     */
    public void setResultCastNumericScale(Integer value) {
        set(70, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_numeric_scale</code>.
     */
    public Integer getResultCastNumericScale() {
        return (Integer) get(70);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_datetime_precision</code>.
     */
    public void setResultCastDatetimePrecision(Integer value) {
        set(71, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_datetime_precision</code>.
     */
    public Integer getResultCastDatetimePrecision() {
        return (Integer) get(71);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_interval_type</code>.
     */
    public void setResultCastIntervalType(String value) {
        set(72, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_interval_type</code>.
     */
    public String getResultCastIntervalType() {
        return (String) get(72);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_interval_precision</code>.
     */
    public void setResultCastIntervalPrecision(Integer value) {
        set(73, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_interval_precision</code>.
     */
    public Integer getResultCastIntervalPrecision() {
        return (Integer) get(73);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_type_udt_catalog</code>.
     */
    public void setResultCastTypeUdtCatalog(String value) {
        set(74, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_type_udt_catalog</code>.
     */
    public String getResultCastTypeUdtCatalog() {
        return (String) get(74);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_type_udt_schema</code>.
     */
    public void setResultCastTypeUdtSchema(String value) {
        set(75, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_type_udt_schema</code>.
     */
    public String getResultCastTypeUdtSchema() {
        return (String) get(75);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_type_udt_name</code>.
     */
    public void setResultCastTypeUdtName(String value) {
        set(76, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_type_udt_name</code>.
     */
    public String getResultCastTypeUdtName() {
        return (String) get(76);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_scope_catalog</code>.
     */
    public void setResultCastScopeCatalog(String value) {
        set(77, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_scope_catalog</code>.
     */
    public String getResultCastScopeCatalog() {
        return (String) get(77);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_scope_schema</code>.
     */
    public void setResultCastScopeSchema(String value) {
        set(78, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_scope_schema</code>.
     */
    public String getResultCastScopeSchema() {
        return (String) get(78);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_scope_name</code>.
     */
    public void setResultCastScopeName(String value) {
        set(79, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_scope_name</code>.
     */
    public String getResultCastScopeName() {
        return (String) get(79);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_maximum_cardinality</code>.
     */
    public void setResultCastMaximumCardinality(Integer value) {
        set(80, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_maximum_cardinality</code>.
     */
    public Integer getResultCastMaximumCardinality() {
        return (Integer) get(80);
    }

    /**
     * Setter for <code>information_schema.routines.result_cast_dtd_identifier</code>.
     */
    public void setResultCastDtdIdentifier(String value) {
        set(81, value);
    }

    /**
     * Getter for <code>information_schema.routines.result_cast_dtd_identifier</code>.
     */
    public String getResultCastDtdIdentifier() {
        return (String) get(81);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutinesRecord
     */
    public RoutinesRecord() {
        super(Routines.ROUTINES);
    }

    /**
     * Create a detached, initialised RoutinesRecord
     */
    public RoutinesRecord(String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName, String routineType, String moduleCatalog, String moduleSchema, String moduleName, String udtCatalog, String udtSchema, String udtName, String dataType, Integer characterMaximumLength, Integer characterOctetLength, String characterSetCatalog, String characterSetSchema, String characterSetName, String collationCatalog, String collationSchema, String collationName, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, Integer datetimePrecision, String intervalType, Integer intervalPrecision, String typeUdtCatalog, String typeUdtSchema, String typeUdtName, String scopeCatalog, String scopeSchema, String scopeName, Integer maximumCardinality, String dtdIdentifier, String routineBody, String routineDefinition, String externalName, String externalLanguage, String parameterStyle, String isDeterministic, String sqlDataAccess, String isNullCall, String sqlPath, String schemaLevelRoutine, Integer maxDynamicResultSets, String isUserDefinedCast, String isImplicitlyInvocable, String securityType, String toSqlSpecificCatalog, String toSqlSpecificSchema, String toSqlSpecificName, String asLocator, OffsetDateTime created, OffsetDateTime lastAltered, String newSavepointLevel, String isUdtDependent, String resultCastFromDataType, String resultCastAsLocator, Integer resultCastCharMaxLength, Integer resultCastCharOctetLength, String resultCastCharSetCatalog, String resultCastCharSetSchema, String resultCastCharSetName, String resultCastCollationCatalog, String resultCastCollationSchema, String resultCastCollationName, Integer resultCastNumericPrecision, Integer resultCastNumericPrecisionRadix, Integer resultCastNumericScale, Integer resultCastDatetimePrecision, String resultCastIntervalType, Integer resultCastIntervalPrecision, String resultCastTypeUdtCatalog, String resultCastTypeUdtSchema, String resultCastTypeUdtName, String resultCastScopeCatalog, String resultCastScopeSchema, String resultCastScopeName, Integer resultCastMaximumCardinality, String resultCastDtdIdentifier) {
        super(Routines.ROUTINES);

        set(0, specificCatalog);
        set(1, specificSchema);
        set(2, specificName);
        set(3, routineCatalog);
        set(4, routineSchema);
        set(5, routineName);
        set(6, routineType);
        set(7, moduleCatalog);
        set(8, moduleSchema);
        set(9, moduleName);
        set(10, udtCatalog);
        set(11, udtSchema);
        set(12, udtName);
        set(13, dataType);
        set(14, characterMaximumLength);
        set(15, characterOctetLength);
        set(16, characterSetCatalog);
        set(17, characterSetSchema);
        set(18, characterSetName);
        set(19, collationCatalog);
        set(20, collationSchema);
        set(21, collationName);
        set(22, numericPrecision);
        set(23, numericPrecisionRadix);
        set(24, numericScale);
        set(25, datetimePrecision);
        set(26, intervalType);
        set(27, intervalPrecision);
        set(28, typeUdtCatalog);
        set(29, typeUdtSchema);
        set(30, typeUdtName);
        set(31, scopeCatalog);
        set(32, scopeSchema);
        set(33, scopeName);
        set(34, maximumCardinality);
        set(35, dtdIdentifier);
        set(36, routineBody);
        set(37, routineDefinition);
        set(38, externalName);
        set(39, externalLanguage);
        set(40, parameterStyle);
        set(41, isDeterministic);
        set(42, sqlDataAccess);
        set(43, isNullCall);
        set(44, sqlPath);
        set(45, schemaLevelRoutine);
        set(46, maxDynamicResultSets);
        set(47, isUserDefinedCast);
        set(48, isImplicitlyInvocable);
        set(49, securityType);
        set(50, toSqlSpecificCatalog);
        set(51, toSqlSpecificSchema);
        set(52, toSqlSpecificName);
        set(53, asLocator);
        set(54, created);
        set(55, lastAltered);
        set(56, newSavepointLevel);
        set(57, isUdtDependent);
        set(58, resultCastFromDataType);
        set(59, resultCastAsLocator);
        set(60, resultCastCharMaxLength);
        set(61, resultCastCharOctetLength);
        set(62, resultCastCharSetCatalog);
        set(63, resultCastCharSetSchema);
        set(64, resultCastCharSetName);
        set(65, resultCastCollationCatalog);
        set(66, resultCastCollationSchema);
        set(67, resultCastCollationName);
        set(68, resultCastNumericPrecision);
        set(69, resultCastNumericPrecisionRadix);
        set(70, resultCastNumericScale);
        set(71, resultCastDatetimePrecision);
        set(72, resultCastIntervalType);
        set(73, resultCastIntervalPrecision);
        set(74, resultCastTypeUdtCatalog);
        set(75, resultCastTypeUdtSchema);
        set(76, resultCastTypeUdtName);
        set(77, resultCastScopeCatalog);
        set(78, resultCastScopeSchema);
        set(79, resultCastScopeName);
        set(80, resultCastMaximumCardinality);
        set(81, resultCastDtdIdentifier);
    }
}
