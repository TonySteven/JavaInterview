package com.genesis.tutorial.java;

public class reverseLeftWords {
    public static String reverseLeftWordsMethod1(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public static String reverseLeftWordsMethod2(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();
    }


    public static void main(String[] args) {
        String str = "abcdefg";
        int n = 2;
        String result = reverseLeftWordsMethod1(str, n);

        System.out.println(result);
    }
}
