package com.Algorithms;

import java.util.Arrays;

import static com.Algorithms.BubbleSortAlgo.swap;

public class CycleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr,i,arr[i]-1);
            }
            else {
                i++;
            }
        }
    }
}
