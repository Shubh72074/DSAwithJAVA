package com.Algorithms;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {3,24,23,5,23,2,1,8,7,4};

//        System.out.println(Arrays.toString(AscendingSort(arr)));
        DescendingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] AscendingSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int last = (arr.length - 1) - i;
            int MaxIndex = getMaxIndex(arr,0,last);
            swap(arr,MaxIndex,last);
        }
        return arr;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i=start; i<end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static int getMinIndex(int[] arr, int start, int end) {
        int minidx = start;
        for (int i=start; i<end; i++) {
            if (arr[i] < arr[minidx]) {
                minidx = i;
            }
        }
        return minidx;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void DescendingSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int end = (arr.length - i) - 1;
            int minIndex = getMinIndex(arr,0,end);
            swap(arr,minIndex,end);
        }
    }
}
