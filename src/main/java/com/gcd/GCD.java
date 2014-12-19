package com.gcd;

public class GCD {
    public static int count;

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
