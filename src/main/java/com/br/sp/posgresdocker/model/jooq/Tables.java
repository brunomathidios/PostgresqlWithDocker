/*
 * This file is generated by jOOQ.
 */
package com.br.sp.posgresdocker.model.jooq;


import com.br.sp.posgresdocker.model.jooq.tables.DeliveryOrder;
import com.br.sp.posgresdocker.model.jooq.tables.DeliveryOrderProduct;
import com.br.sp.posgresdocker.model.jooq.tables.DeliveryProduct;
import com.br.sp.posgresdocker.model.jooq.tables.DeliveryRestaurant;
import com.br.sp.posgresdocker.model.jooq.tables.DeliveryUser;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.delivery_order</code>.
     */
    public static final DeliveryOrder DELIVERY_ORDER = com.br.sp.posgresdocker.model.jooq.tables.DeliveryOrder.DELIVERY_ORDER;

    /**
     * The table <code>public.delivery_order_product</code>.
     */
    public static final DeliveryOrderProduct DELIVERY_ORDER_PRODUCT = com.br.sp.posgresdocker.model.jooq.tables.DeliveryOrderProduct.DELIVERY_ORDER_PRODUCT;

    /**
     * The table <code>public.delivery_product</code>.
     */
    public static final DeliveryProduct DELIVERY_PRODUCT = com.br.sp.posgresdocker.model.jooq.tables.DeliveryProduct.DELIVERY_PRODUCT;

    /**
     * The table <code>public.delivery_restaurant</code>.
     */
    public static final DeliveryRestaurant DELIVERY_RESTAURANT = com.br.sp.posgresdocker.model.jooq.tables.DeliveryRestaurant.DELIVERY_RESTAURANT;

    /**
     * The table <code>public.delivery_user</code>.
     */
    public static final DeliveryUser DELIVERY_USER = com.br.sp.posgresdocker.model.jooq.tables.DeliveryUser.DELIVERY_USER;
}