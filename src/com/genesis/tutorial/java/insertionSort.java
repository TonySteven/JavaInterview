package com.genesis.tutorial.java;

import java.util.Arrays;

public class insertionSort {
    //插入排序
    // Average: O(n^2) time | O(1) space
    // Worst: O(n) time | O(n) space
    public static int[] insertionSortMethod(int[] array) {
        // 1.从第二个元素（第一个要被排序的新元素）开始，从后向前扫描之前的元素序列
        for (int i = 1; i < array.length; i++) {
            // 定义当前数组值
            int cur = array[i];
            // 定义插入指针
            int insertionIndex = i - 1;

            //直到数组从后往前完成并且插入值都小于等于当前数值
            while (insertionIndex >= 0 && array[insertionIndex] > cur) {
                // 将新元素插入到该位置
                array[insertionIndex + 1] = array[insertionIndex];
                insertionIndex--;
            }

            array[insertionIndex + 1] = cur;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] result = insertionSortMethod(array);

        System.out.println(Arrays.toString(result));
    }
}
