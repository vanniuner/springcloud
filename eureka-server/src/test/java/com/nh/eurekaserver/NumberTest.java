package com.nh.eurekaserver;

import org.junit.Test;

public class NumberTest {

    @Test
    public void test(){
        double d = 20014998d;
        long ld = Double.doubleToLongBits(d);
        System.out.println(Long.toBinaryString(ld));

        float f = 20014998f;
        long l = Float.floatToIntBits(f);
        System.out.println(Long.toBinaryString(l));
    }
}
