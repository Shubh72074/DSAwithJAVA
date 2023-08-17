package com.Problems;

public class IndexOfNum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int target = 4;

        System.out.println(searchInsert(arr,target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] > target) return 0;
        if (nums[end] < target) return end + 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
