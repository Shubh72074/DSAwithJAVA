package com.Random;

public class BSRecursive {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,9,11,21};
        System.out.println(findTargetBS(arr,0,arr.length-1,2));
    }
    static int findTargetBS(int[] arr,int start,int end,int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        else if (target > arr[mid]) {
            return findTargetBS(arr,mid + 1,end,target);
        }
        else {
            return findTargetBS(arr,0,mid-1,target);
        }
    }
}
