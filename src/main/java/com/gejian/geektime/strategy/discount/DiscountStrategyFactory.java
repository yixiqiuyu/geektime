package com.gejian.geektime.strategy.discount;

import com.gejian.geektime.strategy.discount.strategy.GrouponDiscountStrategy;
import com.gejian.geektime.strategy.discount.strategy.NormalDiscountStrategy;
import com.gejian.geektime.strategy.discount.strategy.PromotionDiscountStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yixiqiuyu
 * @Description 策略的创建
 * @Date 2021/9/1 23:16
 */
public class DiscountStrategyFactory {

    // 业务场景：不需要每次创建不同的对象，则把策略类缓存起来，直接使用
    /**
     * 策略集合
     */
   /* private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.PROMOTION,new PromotionDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
    }*/

    /**
     * 根据订单类型获取折扣策略
     * @param orderType
     * @return
     */
   /* public static DiscountStrategy getDiscountStrategy(OrderType orderType) {
        return strategies.get(orderType);
    }*/

    // 业务场景：需要每次都创建新的对象

    /**
     * 根据订单类型获取折扣策略类
     * @param orderType
     * @return
     * @throws IllegalAccessException
     */
    public static DiscountStrategy getDiscountStrategy(OrderType orderType) throws IllegalAccessException {
        if (orderType == null) {
            throw new IllegalAccessException("order type can not be null");
        }
        if (orderType.equals(OrderType.NORMAL)) {
            return new NormalDiscountStrategy();
        } else if (orderType.equals(OrderType.GROUPON)) {
            return new GrouponDiscountStrategy();
        } else if (orderType.equals(OrderType.PROMOTION)) {
            return new PromotionDiscountStrategy();
        }
        return null;
    }
}
