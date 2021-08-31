package com.gejian.geektime;

import com.gejian.geektime.strategy.after.AesEncryptionStrategy;
import com.gejian.geektime.strategy.after.BlowfishEncryptionStrategy;
import com.gejian.geektime.strategy.after.EncryptionStrategy;
import com.gejian.geektime.strategy.after.Encryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeektimeApplicationTests {

    @Test
    void contextLoads() {
        EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
        Encryptor aesEncryptor=new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();


        EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor=new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
    }

}