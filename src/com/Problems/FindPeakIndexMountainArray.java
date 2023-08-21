package com.Problems;

public class FindPeakIndexMountainArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int peak = returnPeak(nums);
        int search = findIndex(nums, target, 0, peak);

        if ( search == -1) {
            search = findIndex(nums, target, peak + 1, nums.length - 1);
        }

        System.out.println(search);
    }
    static int returnPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return end;
    }
    static int findIndex(int[] arr, int target, int start, int end) {
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                }
                else if (arr[mid] > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                }
                else if (arr[mid] > target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

