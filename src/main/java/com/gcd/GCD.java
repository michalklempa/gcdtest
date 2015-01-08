package com.gcd;

public class GCD {
    public static int count;

    public static int count2;

    public static long computeGcd2(long a, long b) {
        count2 = 0;
        if (a < b) {
            long t = a;
            a = b;
            b = t;
        }
        if (b == 0) {
            return a;
        }
        while (a > 0) {
            a = a % b;
            count2++;
            if (a == 0) {
                break;
            }
            long t = a;
            a = b;
            b = t;
        }
        return b;
    }

    public static long computeGcd(long a, long b) {
        count = 0;
        if (b > a) {
            return computeGcdInternal(b, a);
        }
        return computeGcdInternal(a, b);
    }

    private static long computeGcdInternal(long a, long b) {
        // we assume a >= b
        if (b == 0) {
            return a;
        }
        count++;
        return computeGcdInternal(b, a % b);
    }
}
