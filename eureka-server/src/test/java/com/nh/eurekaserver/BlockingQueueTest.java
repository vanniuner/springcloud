package com.nh.eurekaserver;

import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {

    @Test
    public void test(){
        BlockingQueue<String> bq = new SynchronousQueue<>();
        new Thread(()->{
            try {
                System.out.println("PUT 1");
                bq.put("1");
                System.out.println("PUT 2");
                bq.put("2");
                System.out.println("PUT 3");
                bq.put("3");
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try{
                TimeUnit.SECONDS.sleep(5);
                System.out.println(bq.take());
                TimeUnit.SECONDS.sleep(5);
                System.out.println(bq.take());
                TimeUnit.SECONDS.sleep(5);
                System.out.println(bq.take());
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1000);
        }catch (Exception e){

        }
    }
}
