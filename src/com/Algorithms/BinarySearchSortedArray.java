package com.Algorithms;

import java.util.Arrays;

public class BinarySearchSortedArray {
    public static void main(String[] args) {
        int[] arr = {45,43,36,26,14,8,3,1};
        int target = 14;

//        if (binarySearch(arr,target)){
//            System.out.println("FOUND");
//        }
//        else {
//            System.out.println("NOT FOUND");
//        }

        System.out.println(binarySearchIndex(arr,target));
    }

//    static boolean binarySearch(int[] sortedArray, int target) {
//        if (sortedArray.length == 0) return false;
//
//        int mid = sortedArray.length / 2;
//        if (sortedArray[mid] == target) {
//            return true;
//        }
//        else if (sortedArray[mid] < target){
//            return binarySearch(Arrays.copyOfRange(sortedArray,mid,sortedArray.length),target);
//        }
//        else {
//            return binarySearch(Arrays.copyOfRange(sortedArray,0,mid),target);
//        }
//    }

    static int binarySearchIndex(int[] sortedArray, int target) {
        int start = 0;
        int end = sortedArray.length - 1;

        //ascending order sortedArray

        if (orderOfArray(sortedArray).equals("ascending")){
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (sortedArray[mid] > target) {
                    end = mid - 1;
                } else if (sortedArray[mid] < target) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        else {

            // descending order

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (sortedArray[mid] > target) {
                    start = mid + 1;
                } else if (sortedArray[mid] < target) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
        }
        return  -1;
    }

    static String orderOfArray(int[] arr) {
        if (arr[0] <= arr[arr.length - 1]) {
            return "ascending";
        }
        return "descending";
    }
}
