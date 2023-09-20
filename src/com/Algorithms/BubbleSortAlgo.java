package com.Algorithms;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {-9,-8,0,8,6,3,-67};
        System.out.println(Arrays.toString(sortedArray(arr)));
    }
    static int[] sortedArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            boolean swapped = false;
            for (int j=1; j<arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    swapped = swap(arr,j,j-1);
                }
            }
            if (!swapped) {
                return arr;
            }
        }
        return arr;
    }
    static boolean swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return true;
    }
}
