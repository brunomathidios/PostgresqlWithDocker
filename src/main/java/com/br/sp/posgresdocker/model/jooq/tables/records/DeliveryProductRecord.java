/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq.tables.records;


import com.br.sp.posgresdocker.model.jooq.tables.DeliveryProduct;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class DeliveryProductRecord extends UpdatableRecordImpl<DeliveryProductRecord> implements Record4<Integer, String, Integer, Double> {

    private static final long serialVersionUID = -2141663262;

    /**
     * Setter for <code>public.delivery_product.id_product</code>.
     */
    public void setIdProduct(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.delivery_product.id_product</code>.
     */
    public Integer getIdProduct() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.delivery_product.nm_product</code>.
     */
    public void setNmProduct(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.delivery_product.nm_product</code>.
     */
    public String getNmProduct() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.delivery_product.id_restaurant</code>.
     */
    public void setIdRestaurant(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.delivery_product.id_restaurant</code>.
     */
    public Integer getIdRestaurant() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.delivery_product.price_product</code>.
     */
    public void setPriceProduct(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.delivery_product.price_product</code>.
     */
    public Double getPriceProduct() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DeliveryProduct.DELIVERY_PRODUCT.ID_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DeliveryProduct.DELIVERY_PRODUCT.NM_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return DeliveryProduct.DELIVERY_PRODUCT.ID_RESTAURANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return DeliveryProduct.DELIVERY_PRODUCT.PRICE_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIdProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNmProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getIdRestaurant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getPriceProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNmProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIdRestaurant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getPriceProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryProductRecord value1(Integer value) {
        setIdProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryProductRecord value2(String value) {
        setNmProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryProductRecord value3(Integer value) {
        setIdRestaurant(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryProductRecord value4(Double value) {
        setPriceProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryProductRecord values(Integer value1, String value2, Integer value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DeliveryProductRecord
     */
    public DeliveryProductRecord() {
        super(DeliveryProduct.DELIVERY_PRODUCT);
    }

    /**
     * Create a detached, initialised DeliveryProductRecord
     */
    public DeliveryProductRecord(Integer idProduct, String nmProduct, Integer idRestaurant, Double priceProduct) {
        super(DeliveryProduct.DELIVERY_PRODUCT);

        set(0, idProduct);
        set(1, nmProduct);
        set(2, idRestaurant);
        set(3, priceProduct);
    }
}
