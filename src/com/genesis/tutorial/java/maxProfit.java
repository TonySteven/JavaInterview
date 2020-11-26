package com.genesis.tutorial.java;

public class maxProfit {
    public static int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(nums);

        System.out.println(result);
    }
}
