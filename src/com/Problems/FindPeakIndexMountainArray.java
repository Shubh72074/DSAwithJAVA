package com.Problems;

public class FindPeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,3,2,1,0};
        System.out.println(returnPeak(arr));
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
}

