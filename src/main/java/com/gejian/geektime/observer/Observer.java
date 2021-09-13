package com.gejian.geektime.observer;

import java.math.BigDecimal;

/**
 * @author yixiqiuyu
 * @Description
 * @Date 2021/9/13 23:32
 */
public interface Observer {
    void update(Observer observer, String productName, BigDecimal bidAmount);
}
