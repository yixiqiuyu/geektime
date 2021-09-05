package com.gejian.geektime.strategy.discount;

import java.math.BigDecimal;

/**
 * @author yixiqiuyu
 * @Description 折扣策略的接口定义
 * @Date 2021/9/1 22:55
 */
public interface DiscountStrategy {
    /**
     * 计算折扣的方法
     * @param order
     * @return
     */
    BigDecimal calDiscount(Order order);
}
