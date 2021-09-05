package com.gejian.geektime.strategy.discount.strategy;

import com.gejian.geektime.strategy.discount.DiscountStrategy;
import com.gejian.geektime.strategy.discount.Order;

import java.math.BigDecimal;

/**
 * @author yixiqiuyu
 * @Description 团购打折
 * @Date 2021/9/5 13:17
 */
public class GrouponDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal calDiscount(Order order) {
        return order.getPrice().multiply(new BigDecimal("0.7"));
    }
}
