package com.genesis.tutorial.java;

import java.util.Arrays;

public class houserobberii {
    public static int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int[] nums1 = Arrays.copyOfRange(nums, 1, nums.length);
        int[] nums2 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        return Math.max(subrob(nums1), subrob(nums2));
    }

    private static int subrob(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        if (len == 1)
            return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[len - 1];
    }

    public static void main(String args[]) {

        int[] intArr = new int[] { 1, 2, 3, 4, 5, 9 };

        int result = rob(intArr);
        System.out.print("最多偷 " + result);

    }
}
