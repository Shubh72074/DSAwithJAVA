package com.Problems;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitInto(arr,m));
    }
    static int splitInto(int[] nums, int k) {
        int start=0,end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int sum = 0,pieces = 1;
            int mid = start + (end-start) / 2;
            for (int num:nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
}
