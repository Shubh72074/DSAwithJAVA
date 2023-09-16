package com.Problems;

public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,12,17,23,28,32,35,39,56};
        int target = 36;
        System.out.println(ceilOf(arr,target));
    }

    static int ceilOf(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end ){
            int mid = start + (end - start ) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
