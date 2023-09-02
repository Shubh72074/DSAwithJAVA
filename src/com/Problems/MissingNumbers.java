package com.Problems;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        int n = 5;

        System.out.println(findMissingNumber(arr,n));
    }

    static int findMissingNumber(int[] arr, int n) {
        int i=0;
        while(i<arr.length) {
            if (arr[i] == n) {
                i++;
            }
            else if (arr[i] != i) {
                swap(arr,i,arr[i]);
            }
            else {
                i++;
            }
        }
        for (int j=0; j<arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return n;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
