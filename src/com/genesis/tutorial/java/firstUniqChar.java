package com.genesis.tutorial.java;

import java.util.HashMap;

public class firstUniqChar {

    public static char firstUniqCharMethod(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc)
            dic.put(c, !dic.containsKey(c));
        for (char c : sc)
            if (dic.get(c)) return c;
        return ' ';
    }


    public static void main(String[] args) {
        String str = "abaccdeff";


        char result = firstUniqCharMethod(str);
        System.out.println(result);
    }
}
