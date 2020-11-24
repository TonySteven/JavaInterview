package com.genesis.tutorial.java;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class isStraight {

    public static boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums); // 数组排序
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) joker++; // 统计大小王数量
            else if (nums[i] == nums[i + 1]) return false; // 若有重复，提前返回 false
        }
        return nums[4] - nums[joker] < 5; // 最大牌 - 最小牌 < 5 则可构成顺子

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        boolean result = isStraight(nums);

        System.out.println(result);
    }
}
