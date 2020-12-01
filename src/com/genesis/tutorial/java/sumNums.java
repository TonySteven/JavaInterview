package com.genesis.tutorial.java;


public class sumNums {
    public static int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }


    public static void main(String[] args) {
        int n = 3;
        int result = sumNums(n);

        System.out.println(result);
    }
}
