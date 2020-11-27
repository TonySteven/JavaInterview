package com.genesis.tutorial.java;

public class StringBufferVsBuilder {
    public static void main(String[] args) {

        //Synchronized(thread-safe)
        StringBuffer stringBuffer = new StringBuffer();

        long StartTime = System.currentTimeMillis();

        //code
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("hello");
        }

        long EndTime = System.currentTimeMillis();
        System.out.println(EndTime - StartTime);

        //Non-Synchronized(not-thread-safe)
        StringBuilder stringBuilder = new StringBuilder();
        long StartTime1 = System.currentTimeMillis();

        //code
        for (int j = 0; j < 100000; j++) {
            stringBuffer.append("hello");
        }

        long EndTime1 = System.currentTimeMillis();
        System.out.println(EndTime1 - StartTime1);

    }
}
