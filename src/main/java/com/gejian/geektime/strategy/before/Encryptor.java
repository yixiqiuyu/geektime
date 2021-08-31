package com.gejian.geektime.strategy.before;

/**
 * @author yixiqiuyu
 * @Description 加密类
 * @Date 2021/8/27 0:11
 */
public class Encryptor {
    /**
     * 加密方式名称
     */
    private String algorithmName;
    /**
     * 原始内容
     */
    private String plainText;
    public Encryptor(String algorithmName){
        this.algorithmName=algorithmName;
    }
    public void encrypt(){
        if (algorithmName.equals("Aes")){
            System.out.println("Encrypting data using AES algorithm");
            /*Code to encrypt data using AES algorithm*/
        }
        else if (algorithmName.equals("Blowfish")){
            System.out.println("Encrypting data using Blowfish algorithm");
            /*Code to encrypt data using Blowfish algorithm */
        }
        /*More else if statements for other encryption algorithms*/
    }
    /*Getter and setter methods for plainText*/
}
