package com.gejian.geektime.observer;

import java.math.BigDecimal;

/**
 * @author yixiqiuyu
 * @Description
 * @Date 2021/9/13 23:32
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setBidAmount(Observer observer, BigDecimal newBidAmount);
}
