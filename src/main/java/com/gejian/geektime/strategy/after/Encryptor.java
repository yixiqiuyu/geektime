package com.gejian.geektime.strategy.after;

/**
 * @author yixiqiuyu
 * @Description
 * @Date 2021/8/27 0:18
 */
public class Encryptor {
    private EncryptionStrategy strategy;
    private String plainText;
    public Encryptor(EncryptionStrategy strategy){
        this.strategy=strategy;
    }
    public void encrypt(){
        strategy.encryptData(plainText);
    }
    public String getPlainText() {
        return plainText;
    }
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
}
