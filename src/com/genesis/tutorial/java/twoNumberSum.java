package com.genesis.tutorial.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class twoNumberSum {
    public static int[] twoNumberSumMethod(int[] array, int targetSum) {
        // Write your code here.// Write your code here.
        Set<Integer> nums = new HashSet<>();
        for(int num : array){
            int PotentialMatch = targetSum -num;
            if(nums.contains(PotentialMatch)){
                return new int[]{PotentialMatch, num};
            }else{
                nums.add(num);
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] result = twoNumberSumMethod(array,targetSum);

        System.out.println(Arrays.toString(result));
    }
}
