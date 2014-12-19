package com.gcd;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class GCDTest {

    @Test
    public void test() {
        int a = 0;
        int b = 0;
        assertEquals(0, GCD.computeGcd(a, b));
    }

    @Test
    public void test1() {
        int a = 1;
        int b = 0;
        assertEquals(1, GCD.computeGcd(a, b));
    }

    @Test
    public void test2() {
        int a = 2;
        int b = 0;
        assertEquals(2, GCD.computeGcd(a, b));
    }

    @Test
    public void test3() {
        int a = 1;
        int b = 1;
        assertEquals(1, GCD.computeGcd(a, b));
    }

    @Test
    public void test4() {
        int a = 0;
        int b = 10;
        assertEquals(10, GCD.computeGcd(a, b));
    }

    @Test
    public void test5() {
        int a = 17;
        int b = 25;
        assertEquals(1, GCD.computeGcd(a, b));
    }

    @Test
    public void test6() {
        int a = 11;
        int b = 13;
        assertEquals(1, GCD.computeGcd(a, b));
    }

    @Test
    public void test7() {
        int a = 5;
        int b = 5;
        assertEquals(5, GCD.computeGcd(a, b));
    }

    @Test
    public void test8() {
        int a = 15;
        int b = 5;
        assertEquals(5, GCD.computeGcd(a, b));
    }

    @Test
    public void test9() {
        int a = 25;
        int b = 15;
        assertEquals(5, GCD.computeGcd(a, b));
    }

    @Test
    public void test10() {
        int a = 30;
        int b = 20;
        assertEquals(10, GCD.computeGcd(a, b));
    }

    @Test
    public void test11() {
        long a, b;
        Random random = new Random();
        for (int i = 1; i < 1000000; i++) {
            a = Math.abs(random.nextInt());
            b = Math.abs(random.nextInt());
            long gcd = GCD.computeGcd(a, b);
            if (Math.log(a + b) / Math.log(2) < GCD.count) {

                System.out.println("GCD(" + String.valueOf(a) + "," + String.valueOf(b) + ") = "
                        + String.valueOf(gcd) + ", count: " + String.valueOf(GCD.count)
                        + ", log_2(a+b): " + String.valueOf(Math.log(a + b) / Math.log(2)));

            }
        }
    }
}
