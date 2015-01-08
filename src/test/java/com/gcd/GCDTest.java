package com.gcd;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
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

    @Test
    public void Btest() {
        int a = 0;
        int b = 0;
        assertEquals(0, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest1() {
        int a = 1;
        int b = 0;
        assertEquals(1, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest2() {
        int a = 2;
        int b = 0;
        assertEquals(2, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest3() {
        int a = 1;
        int b = 1;
        assertEquals(1, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest4() {
        int a = 0;
        int b = 10;
        assertEquals(10, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest5() {
        int a = 17;
        int b = 25;
        assertEquals(1, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest6() {
        int a = 11;
        int b = 13;
        assertEquals(1, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest7() {
        int a = 5;
        int b = 5;
        assertEquals(5, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest8() {
        int a = 15;
        int b = 5;
        assertEquals(5, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest9() {
        int a = 25;
        int b = 15;
        assertEquals(5, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest10() {
        int a = 30;
        int b = 20;
        assertEquals(10, GCD.computeGcd2(a, b));
    }

    @Test
    public void Btest11() {
        int runs = 5000000;
        Random random = new Random();
        List<Long> values = new ArrayList<>(2 * runs);
        for (int i = 0; i < 2 * runs; i++) {
            values.add(Math.abs((long) random.nextInt()));
        }

        List<Long> gcds = new ArrayList<>(runs);
        List<Long> counts = new ArrayList<>(runs);
        List<Long> gcds2 = new ArrayList<>(runs);
        List<Long> counts2 = new ArrayList<>(runs);

        long start = System.currentTimeMillis();
        for (int i = 0; i < runs; i++) {
            long a = values.get(i);
            long b = values.get(2 * i);
            long gcd = GCD.computeGcd(a, b);
            gcds.add(gcd);
            counts.add((long) GCD.count);
        }
        System.out.println("GCD Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < runs; i++) {
            long a = values.get(i);
            long b = values.get(2 * i);
            long gcd = GCD.computeGcd2(a, b);
            gcds2.add(gcd);
            counts2.add((long) GCD.count2);
        }
        System.out.println("GCD2 Time: " + (System.currentTimeMillis() - start));

        for (int i = 0; i < runs; i++) {
            long a = values.get(i);
            long b = values.get(2 * i);
            assertEquals(gcds.get(i), gcds2.get(i));
            assertEquals(counts.get(i), counts2.get(i));

            if (Math.log(a + b) / Math.log(2) < counts.get(i)) {
                System.out.println("GCD(" + String.valueOf(a) + "," + String.valueOf(b) + ") = "
                        + String.valueOf(gcds.get(i)) + ", count: " + String.valueOf(counts.get(i))
                        + ", log_2(a+b): " + String.valueOf(Math.log(a + b) / Math.log(2)));
            }
        }

    }
}
