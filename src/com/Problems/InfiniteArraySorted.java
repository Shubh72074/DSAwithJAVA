package com.Problems;

public class InfiniteArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38};
        int target = 14;

        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int ns = end + 1;
            end = end + (end - start + 1) * 2;
            start = ns;
        }

        System.out.println(findTarget(arr,target,start,end));
    }

    static int findTarget(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
