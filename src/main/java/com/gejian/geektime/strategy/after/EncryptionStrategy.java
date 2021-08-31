package com.gejian.geektime.strategy.after;

/**
 * @author yixiqiuyu
 * @Description 加密策略接口
 * @Date 2021/8/27 0:14
 */
public interface EncryptionStrategy {
    /**
     * 加密方法
     * @param plaintext
     */
    void encryptData(String plaintext);
}
