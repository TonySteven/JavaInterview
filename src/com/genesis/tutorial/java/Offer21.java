package com.genesis.tutorial.java;

import java.util.Arrays;

public class Offer21 {

    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
    public static void main(String args[]) {

        int[] intArr = new int[] { 1, 2, 3, 4, 5, 9 };

        int[] result = exchange(intArr);
        //那是因为System.out.println这个方法，默认调用的是对象的toString()方法的内容，[表示数组，I表示int类型，b9e45a是对象名。
        //这就是int[] arr对象的toString内容。
        //如果要打印数组，用Arrays这个工具类：
        //System.out.print("排序后为：" + result);

        System.out.print("排序后为：" + Arrays.toString(result));

    }
}
