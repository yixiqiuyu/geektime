package com.gejian.geektime.strategy.discount;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yixiqiuyu
 * @Description 订单实体
 * @Date 2021/9/1 22:56
 */
@Data
public class Order {

    /**
     * id
     */
    private String id;
    /**
     * 订单号
     */
    private String orderId;

    /**
     * 订单类型
     */
    private OrderType type;
    /**
     * 订单价格
     */
    private BigDecimal price;

}
