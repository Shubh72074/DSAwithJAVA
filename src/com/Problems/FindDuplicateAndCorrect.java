package com.Problems;


import java.util.Arrays;

public class FindDuplicateAndCorrect {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4};

        System.out.println(Arrays.toString(findMissingAndDuplicate(arr)));
    }

    static int[] findMissingAndDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,nums[i]-1,i);
            }
            else {
                i++;
            }
        }
        for(int j=0; j<nums.length; j++) {
            if (nums[j] != j+1) {
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
