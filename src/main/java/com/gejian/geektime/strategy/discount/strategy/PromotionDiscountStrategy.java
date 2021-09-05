package com.gejian.geektime.strategy.discount.strategy;

import com.gejian.geektime.strategy.discount.DiscountStrategy;
import com.gejian.geektime.strategy.discount.Order;
import com.sun.org.apache.xpath.internal.operations.String;

import java.math.BigDecimal;

/**
 * @author yixiqiuyu
 * @Description 促销折扣
 * @Date 2021/9/5 13:14
 */
public class PromotionDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal calDiscount(Order order) {
        return order.getPrice().multiply(new BigDecimal(Double.toString(0.8)));
    }
}
