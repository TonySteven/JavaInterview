package com.genesis.tutorial.java;

import java.util.Arrays;

public class quickSort {
    //插入排序
    // Average: O(n^2) time | O(1) space
    // Worst: O(n) time | O(n) space
    public static int[] quickSortMethod(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) return;
        int partitionIndex = partition(array, left, right);
        quickSort(array, left, partitionIndex - 1);
        quickSort(array, partitionIndex + 1, right);
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            while (leftIndex < right & array[leftIndex] <= pivot) {
                leftIndex++;
            }
            while (rightIndex >= left && array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex > rightIndex) break;
            swap(array, leftIndex, rightIndex);
        }
        swap(array, leftIndex, right); // swap pivot to the right position
        return leftIndex;
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] rusult = quickSortMethod(array);

        System.out.println(Arrays.toString(rusult));
    }
}
