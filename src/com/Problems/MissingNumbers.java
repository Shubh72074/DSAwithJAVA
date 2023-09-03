package com.Problems;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,5};

        System.out.println(findMissingNumber(arr));
    }

    static int findMissingNumber(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr,i,arr[i]-1);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j=0; j<arr.length; j++) {
            if (arr[j] != j+1) {
                return j+1;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
