package com.Algorithms;

public class CeilingOfaTargetNumber {
    public static void main(String[] args) {
        int[] arr = {-4,-1,2,4,5,7,9,12,15,18,23};
        int target = -4;

        System.out.println(ceilOf(arr,target));
    }

    static int ceilOf(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (start == end) return arr[start];

            int mid = start + (end-start) / 2;
            if (arr[mid] > target && arr[mid - 1] < target) {
                return arr[mid];
            }
            else if (arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return -1;
    }
}
