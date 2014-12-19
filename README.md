gcdtest
=======
see the function itself:
https://github.com/mkl-eea-sk/gcdtest

and junit test cases
https://github.com/mkl-eea-sk/gcdtest/blob/master/src/test/java/com/gcd/GCDTest.java
where, from the last, it can be seen that i consider number of "mod" operations needed to obtain result to be asymptotically
equivalent to log_2(a+b), which is O(N) where N is number of bits of program input (N = log_2(a) + log_2(b), bits to
represent the input numbers).
