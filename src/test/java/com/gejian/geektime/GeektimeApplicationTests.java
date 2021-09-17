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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    void testList() {
        List<String>  list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list.size());
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("1".equals(next)) {
                iterator.remove();
            }
        }


        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("2".equals(next)) {
                iterator.remove();
            }
        }

        System.out.println(list.size());
    }


    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list.size());
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("1".equals(next)) {
                iterator.remove();
            }
        }


        // iterator经过一次遍历后，到达结尾，第二次再用的时候再使用 iterator.hasNext()，判断为false
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("2".equals(next)) {
                iterator.remove();
            }
        }

        System.out.println(list.size());
    }


    @Test
    public void testHashMap() {
        Map<String, Object> map = new HashMap<>(4);
        System.out.println(map);
    }

    @Test
    public void testObserver() {
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
