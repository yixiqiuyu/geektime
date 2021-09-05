package com.gejian.geektime.strategy.discount.strategy;

import com.gejian.geektime.strategy.discount.DiscountStrategy;
import com.gejian.geektime.strategy.discount.Order;

import java.math.BigDecimal;

/**
 * @author yixiqiuyu
 * @Description
 * @Date 2021/9/1 23:18
 */
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal calDiscount(Order order) {
        return order.getPrice();
    }
}
