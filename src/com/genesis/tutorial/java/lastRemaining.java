package com.genesis.tutorial.java;

public class lastRemaining {
    public static int lastRemainingMethod(int n, int m) {
        int f = 0;
        for (int i = 2; i != n + 1; ++i) {
            f = (m + f) % i;
        }
        return f;
    }


    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int result = lastRemainingMethod(n, m);

        System.out.println(result);
    }
}
