package com.genesis.tutorial.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isValidSubsequence {
    public static boolean isValidSubsequenceMethod(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.size() && seqIdx < sequence.size()){
            if(array.get(arrIdx).equals(sequence.get(seqIdx))){
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(10);

        boolean result = isValidSubsequenceMethod(array,sequence);

        System.out.println(result);
    }
}
