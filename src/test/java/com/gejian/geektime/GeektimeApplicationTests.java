package com.gejian.geektime;

import com.gejian.geektime.observer.Bidder;
import com.gejian.geektime.observer.Observer;
import com.gejian.geektime.observer.Product;
import com.gejian.geektime.observer.Subject;
import com.gejian.geektime.strategy.after.AesEncryptionStrategy;
import com.gejian.geektime.strategy.after.BlowfishEncryptionStrategy;
import com.gejian.geektime.strategy.after.EncryptionStrategy;
import com.gejian.geektime.strategy.after.Encryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

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



    @Test
    public void testHashMap() {
        Map<String, Object> map = new HashMap<>(4);
        System.out.println(map);
    }

    @Test
    public void testObserver() throws Exception {
        Subject product=new Product("36 inch LED TV",new BigDecimal(350));
        Observer bidder1=new Bidder("Alex Parker");
        Observer bidder2=new Bidder("Henry Smith");
        Observer bidder3=new Bidder("Mary Peterson");
        product.registerObserver(bidder1);
        product.registerObserver(bidder2);
        product.registerObserver(bidder3);
        product.setBidAmount(bidder1, new BigDecimal(375));
        product.removeObserver(bidder2);
        product.setBidAmount(bidder3, new BigDecimal(400));
    }

}
