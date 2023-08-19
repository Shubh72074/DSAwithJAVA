package com.Problems;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,6,6,6,6,7,8,9};
        int target = 6;
        int[] ans = {-1,-1};

        int first = search(arr,target,true);
        int last = search(arr,target,false);

        ans[0] = first;
        ans[1] = last;

        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] arr, int target, boolean findStartIdx) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
         while (start <= end) {
             int mid = start + (end - start) /2 ;
             if (arr[mid] > target) {
                 end = mid - 1;
             }
             else if (arr[mid] < target) {
                 start = mid + 1;
             }
             else {
                 ans = mid;
                 if (findStartIdx) {
                     end = mid - 1;
                 }
                 else {
                     start = mid + 1;
                 }
             }
         }
         return ans;
    }
}
